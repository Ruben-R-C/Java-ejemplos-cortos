package org.ruben.java.string;

public class App {

	public static void main(String[] args) {
		//los strings son immutable
		//Cuando usamos un string literal, el string is interned pool en vez del heap.
		//en el interned pool solo se crea una unica instancia de los string que son iguales logicamnete.

		//Es preferible usan literals
		//1 es mas facil de leer 
		//2 el compilador puede reusar los mismos objetos en vez de ocupar nuevos espacios.

		String a = "abc"; 
		String b = "abc";
		System.out.println(a == b);  // true

		String c = new String("abc");
		String d = new String("abc");
		System.out.println(c == d);  // false

		

		//las dos clase String son la misma instancia de String
		System.out.println("abc" == "abc");  //true
		//las dos son instancias son diferentes 
		//aunque sean iguales logicamente
		//se crea un instancia nueva en el heap
		System.out.println("abc" == new String("abc"));  //false
		//si invocamos intern, anadimos la instancia al intern pool en vez del heap.
		//por lo que es son la misma instancia
		String abc1 = new String("abc").intern();
		String abc2 = new String("abc").intern();
		System.out.println(abc1 == abc2);  //true
		System.out.println(abc1 == "abc"); //true
		System.out.println(abc2 == "abc"); //true

	}

}