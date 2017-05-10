package co.q64.arcade.base.api.net;

public interface CompiledFrameRegistry {
	public Frame frameFromName(String name);
	
	public String frameToName(Frame frame);
	
	public String frameToName(Class<? extends Frame> frame);
}
