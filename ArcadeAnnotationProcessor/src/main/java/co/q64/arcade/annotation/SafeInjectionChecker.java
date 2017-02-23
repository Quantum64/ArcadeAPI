package co.q64.arcade.annotation;

import java.lang.annotation.ElementType;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.inject.Inject;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.Types;
import javax.tools.Diagnostic;

import co.q64.arcade.core.api.annotation.Injectable;
import co.q64.arcade.core.api.annotation.Noinject;

@SupportedAnnotationTypes("javax.inject.Inject")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class SafeInjectionChecker extends AbstractProcessor {

	@Override
	public boolean process(Set<? extends TypeElement> typeElements, RoundEnvironment roundEnvironment) {
		for (Element element : roundEnvironment.getElementsAnnotatedWith(Inject.class)) {
			Element classElement = element.getEnclosingElement();
			TypeMirror tm = element.asType();
			if (tm.getKind() != TypeKind.DECLARED) {
				continue;
			}
			//System.out.println(tm);
			if (tm.getAnnotation(Noinject.class) != null) {
				processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, classElement + "#" + element + " cannot be injected because it has @Noinject");
			}
			if (tm.getAnnotation(Injectable.class) == null) {
				processingEnv.getMessager().printMessage(Diagnostic.Kind.WARNING, classElement + "#" + element + " is being Injected even though it does not have @Injectable");
			}

		}
		return true;
	}
}