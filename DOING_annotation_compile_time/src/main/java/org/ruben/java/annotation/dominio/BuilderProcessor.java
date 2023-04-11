package org.ruben.java.annotation.dominio;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.xml.transform.Source;
import javax.lang.model.type.ExecutableType;

import com.google.auto.service.AutoService;

@SupportedAnnotationTypes("org.ruben.java.annotation.dominio.BuilderProperty") //podemos usar varias anotaciones "org.ruben.java.annotation.*"
@SupportedSourceVersion(SourceVersion.RELEASE_8)
@AutoService(Processor.class)
public class BuilderProcessor extends AbstractProcessor {

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) { //ejecutamos process cuando compilamos las clases que contengan la anotacion BuilderProperty

        //@BuilderProperty solo esta para un elemento (para los metodos, idependientemente de que se repita) pero iteramos por si tuviera varios elementos
        for (TypeElement annotation : annotations) {
            Set<? extends Element> annotatedElements = roundEnv.getElementsAnnotatedWith(annotation);//me devuelve todos los sitios donde se usa (setName setAge)
           
            
      

            Map<Boolean, List<Element>> annotatedMethods = annotatedElements.stream().collect(Collectors.partitioningBy(element ->
                ((ExecutableType) element.asType()).getParameterTypes().size() == 1 && element.getSimpleName().toString().startsWith("set")));
            List<Element> setters = annotatedMethods.get(true);
            List<Element> otherMethods = annotatedMethods.get(false);
            
            // …
        }
        return false; //devuelve true cuando ha termiando de procesar todas las anotaciones y false para continuar
    }


}
