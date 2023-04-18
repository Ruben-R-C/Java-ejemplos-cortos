
#Consumir InputStream varias veces

Por defecto, cuando se consume un InputStream no se puede volver a consumir.

Tutorial oficial
https://docs.oracle.com/javase/tutorial/essential/io/


## Tipos de clase
- FileReader - Leer archivos de texto (abre recurso, no carga el archivo en memoria)
- BufferedReader - Tiene buffer (array de bytes) para optimizar la consultas al SO (readLine() puede leer lineas enteras ) (se puede hacer mark(0) y reset() para leer varias veces)
- FileInputStream (writeInt() writeUTF() metodos para guardar tipos de binarios diferentes que se deben rescatar en el mismo orden)
- InputStream clase abstracta 
- FileInputStream  streams de 8-bit bytes, de bajo-nivel, solo para mas  I/O primitivos imagenes sonidos
- FileOutputStream