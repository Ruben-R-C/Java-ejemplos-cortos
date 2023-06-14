# Ejecutar a mano con la JDK

1. Generamos compilamos Immutable SimpleAnnotationProcessor para que la podamos ejecutar
```
javac -d .  src/main/java/org/ruben/java/annotation/Immutable.java src/main/java/org/ruben/java/annotation/SimpleAnnotationProcessor.java    
```
2. Ejecutamos la clases compiladas para procesar la annotation Immutable que se emplea en la clase Mutable
```
javac -d compilado -processor org.ruben.java.annotation.SimpleAnnotationProcessor src/main/java/org/ruben/java/annotation/MutableClass.java  
```
3. La annotacion immutable obliga a tener los campos con el modificador final. Con la MutableClass tiene el campo name sin final lanza un error al intentar compilarlo.
```
error: Class 'MutableClass' is annotated as @Immutable, but field 'name' is not declared as final
1 error
```