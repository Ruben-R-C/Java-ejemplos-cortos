package org.ruben.java.Enum;

public class EnumBasico {

	enum Color {
		RED, GREEN, BLUE;
	}

	public static void main(String[] args) {
		Color c1 = Color.RED;
		System.out.println(c1);
		
		String c2 = Color.GREEN.name();
		System.out.println(c2);
		
		for (Color col : Color.values()) { 
                      System.out.println(col); 
                }
		
	}

}
