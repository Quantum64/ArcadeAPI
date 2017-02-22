package co.q64.arcade.api.lang;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * Queue with elements that cycle
 * @author Dylan
 *
 * @param <E>
 */
public final class LinkedQueue<E> implements Collection<E> {

	private int size = 0;
	private QueueNode<E> node;
	private QueueNode<E> loc;

	/**
	 * Creates a LinkedQueue object with the provided values
	 *
	 * @param inits
	 *            Values to add
	 */
	public LinkedQueue(E... inits) {
		this.addAll(Arrays.asList(inits));
	}

	/**
	 * Creates an empty LinkedQueue object
	 */
	public LinkedQueue() {
		this.node = new QueueNode<>(null, null, null);
	}

	/**
	 * Add an object to the end of the queue.
	 *
	 * @param newElement
	 *            The object to be added to the queue.
	 */
	@Override
	public boolean add(E newElement) {
		if (size == 0) {
			node = new QueueNode<>(null, newElement, null);
			this.size++;
			return true;
		} else {
			QueueNode<E> temp = this.node;
			while (temp.getNextNode() != null) {
				if (temp.getNextNode() != null) {
					temp = temp.getNextNode();
				}
			}
			temp.setNextNode(new QueueNode<>(this.node, newElement, null));
			this.size++;
			return true;
		}
	}

	/**
	 * Return the item at the front of the queue without deleting it.
	 *
	 * @return the item at the front of the queue
	 *
	 * @exception IllegalStateException
	 *                thrown if the queue is empty. Message associated with the
	 *                exception is: "LinkedQueue getFront problem"
	 */
	public E getFront() {
		if (this.size == 0) {
			throw new IllegalStateException("LinkedQueue is empty!");
		} else {
			return this.node.getValue();
		}
	}

	/**
	 * Remove and return the first element in the queue
	 *
	 * @return the first element in the queue
	 *
	 * @exception IllegalStateException
	 *                thrown if the queue is empty. Message associated with the
	 *                exception is: "LinkedQueue dequeue problem"
	 */
	public E dequeue() {
		if (this.size == 0) {
			throw new IllegalStateException("LinkedQueue is empty!");
		} else {
			E val = this.node.getValue();
			this.remove(val);
			this.size--;
			return val;
		}
	}

	/**
	 * Removes the given item from the queue. The item can appear anywhere in
	 * the list.
	 *
	 * @param itemToRemove
	 *            The item to be removed from the queue.
	 *
	 * @return true if the item was removed
	 */
	@Override
	public boolean remove(Object itemToRemove) {
		QueueNode<E> temp = this.node;
		while (temp.getNextNode() != null) {
			if (temp.getValue() == itemToRemove) {
				if (temp.getPreviousNode() == null) {
					temp.getNextNode().setPreviousNode(null);
					this.node = temp.getNextNode();
				} else if (temp.getNextNode() == null) {
					temp.getPreviousNode().setNextNode(null);
				} else {
					temp.getPreviousNode().setNextNode(temp.getNextNode());
					temp.getNextNode().setPreviousNode(temp.getPreviousNode());
				}
				this.size--;
				return true;
			} else {
				temp = temp.getNextNode();
			}
		}
		return false;
	}

	/**
	 * Inserts an items BEFORE the given item (cut in line)
	 *
	 * @param itemToInsert
	 *            The item to be inserted
	 * @param insertBefore
	 *            Which item in the queue the inserted items gets inserted
	 *            before
	 * @return true if we were able to insert the element, false otherwise
	 */
	public boolean insertBefore(E itemToInsert, E insertBefore) {
		QueueNode<E> temp = this.node;
		while (temp.getNextNode() != null) {
			if (temp.getValue() == insertBefore) {
				QueueNode<E> insert = new QueueNode<>(temp.getPreviousNode(), itemToInsert, temp);
				if (temp.getPreviousNode() != null) {
					temp.getPreviousNode().setNextNode(insert);
				}
				temp.setPreviousNode(insert);
				this.size++;
				return true;
			} else {
				temp = temp.getNextNode();
			}
		}
		return false;
	}

	/**
	 * Return the number of elements currently in this queue.
	 *
	 * @return the number of elements in this queue.
	 */
	public int getSize() {
		return this.size;
	}

	/**
	 * Return the state of the queue; return true if the queue is empty,
	 * otherwise return false.
	 *
	 * @return true if the queue is empty, otherwise return false.
	 */
	public boolean isEmpty() {
		return this.size == 0;
	}

	/**
	 * Returns the next value in the LinkedQueue. If the queue contains one
	 * value, this will return the same value every time.
	 *
	 * @return The next value in the queue.
	 */
	public E getNext() {
		if (this.loc == null) {
			this.loc = this.node;
		} else {
			this.loc = this.loc.getNextNode();
		}
		if (this.loc == null) {
			this.loc = this.node;
		}
		return this.loc.getValue();
	}

	/**
	 * Returns the size of the queue
	 *
	 * @return The queue's size
	 */
	@Override
	public int size() {
		return this.size;
	}

	/**
	 * Returns whether or not there is the relevant object in the queue
	 *
	 * @param o
	 *            The object to check for
	 * @return True if it is within the Queue, false otherwise
	 */
	@Override
	public boolean contains(Object o) {
		QueueNode<E> next = this.node;
		while (next != null) {
			if (next.getValue() == o) {
				return true;
			}
			next = next.getNextNode();
		}
		return false;
	}

	/**
	 * Returns an iterator of this class
	 *
	 * @return The iterator of this class
	 */
	@Override
	public Iterator iterator() {
		return new Itr(this.node);
	}

	/**
	 * Returns an array of this class
	 *
	 * @return This class as an array
	 */
	@Override
	public Object[] toArray() {
		Object[] back = new Object[this.size];
		return back;
	}

	/**
	 * Returns an array in the given object type of array, or null if it is
	 * unsupported
	 *
	 * @param a
	 *            The array type to use
	 * @return The new array, or null if impossible
	 */
	@Override
	public <T> T[] toArray(T[] a) {
		QueueNode<E> next = this.node;
		try {
			return (T[]) this.toArray();
		} catch (ClassCastException e) {
			return null;
		}
	}

	/**
	 * Returns whether or not this queue contains all objects in the collection
	 *
	 * @param c
	 *            The collection to check against
	 * @return True if all items are in the queue, false otherwise
	 */
	@Override
	public boolean containsAll(Collection<?> c) {
		boolean all = true;
		for (Object o : c) {
			if (!this.contains(o)) {
				all = false;
			}
		}
		return all;
	}

	/**
	 * Adds all items in the collection to this queue
	 *
	 * @param c
	 *            The collection to add from
	 * @return True if all items were added, false otherwise
	 */
	@Override
	public boolean addAll(Collection<? extends E> c) {
		boolean all = true;
		for (E o : c) {
			this.add(o);
		}
		return all;
	}

	/**
	 * Removes all items from the queue provided by the relevant collection
	 *
	 * @param c
	 *            The collection to remove against
	 * @return True if all items are removed, false otherwise
	 */
	@Override
	public boolean removeAll(Collection<?> c) {
		boolean all = true;
		for (Object o : c) {
			try {
				this.remove((E) o);
			} catch (ClassCastException e) {
				all = false;
			}
		}
		return all;
	}

	/**
	 * Retains all objects in this queue that are within the provided collection
	 *
	 * @param c
	 *            The collection to check against
	 * @return True if all are retained, false otherwise
	 */
	@Override
	public boolean retainAll(Collection<?> c) {
		boolean all = true;
		LinkedQueue<E> nodes = new LinkedQueue();
		for (Object o : this) {
			if (!c.contains(o)) {
				try {
					nodes.add((E) o);
				} catch (ClassCastException e) {
					all = false;
				}
			}
		}
		this.removeAll(nodes);
		return all;
	}

	/**
	 * Clears the current queue
	 */
	@Override
	public void clear() {
		this.node = new QueueNode<>(null, null, null);
		this.size = 0;
	}
}

/**
 * Private node for the LinkedQueue class
 *
 * @author Spencer Alderman
 */
class QueueNode<E> {

	private E value;
	private QueueNode<E> previous;
	private QueueNode<E> next;

	/**
	 * Creates a QueueNode<E> object
	 *
	 * @param previous
	 *            The previous QueueNode<E> in the sequence
	 * @param value
	 *            The value of this node
	 * @param next
	 *            The next QueueNode<E> in the sequence
	 */
	public QueueNode(QueueNode<E> previous, E value, QueueNode<E> next) {
		this.previous = previous;
		this.next = next;
		this.value = value;
	}

	/**
	 * Gets the previous QueueNode<E> in the sequence relative to the current.
	 *
	 * @return The previous QueueNode<E>
	 */
	public QueueNode<E> getPreviousNode() {
		return this.previous;
	}

	/**
	 * Gets the next QueueNode<E> in the sequence relative to the current.
	 *
	 * @return The next QueueNode<E>
	 */
	public QueueNode<E> getNextNode() {
		return this.next;
	}

	/**
	 * Gets the value associated with this QueueNode<E>
	 *
	 * @return The value of the current QueueNode<E>
	 */
	public E getValue() {
		return this.value;
	}

	/**
	 * Sets the node that occurs after the current node
	 *
	 * @param next
	 *            The node to set
	 */
	public void setNextNode(QueueNode<E> next) {
		this.next = next;
	}

	/**
	 * Sets the node that occurs before the current node
	 *
	 * @param previous
	 *            The node to set
	 */
	public void setPreviousNode(QueueNode<E> previous) {
		this.previous = previous;
	}

	/**
	 * Sets the value associated with the current node
	 *
	 * @param value
	 *            The value to set
	 */
	public void setValue(E value) {
		this.value = value;
	}
}

class Itr<E> implements Iterator {

	private QueueNode<E> itr;
	private boolean first = true;

	public Itr(QueueNode<E> first) {
		this.itr = first;
	}

	/**
	 * Returns whether or not it is the end of the collection
	 *
	 * @return True if not the end, false otherwise
	 */
	@Override
	public boolean hasNext() {
		return this.itr.getNextNode() != null;
	}

	/**
	 * Gets the next value in the queue iterator
	 *
	 * @return The next iterator value
	 */
	@Override
	public E next() {
		if (this.first) {
			this.first = false;
		} else if (this.hasNext()) {
			this.itr = this.itr.getNextNode();
		}
		return this.itr.getValue();
	}

	/**
	 * Removes an object from the iterator, unsupported
	 */
	@Override
	public void remove() {
		throw new UnsupportedOperationException("Cannot remove content from iterator");
	}
}