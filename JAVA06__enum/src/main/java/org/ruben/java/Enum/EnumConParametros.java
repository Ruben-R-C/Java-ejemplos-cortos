package org.ruben.java.Enum;

import org.ruben.java.Enum.dominio.BasicStringOperation;
import org.ruben.java.Enum.dominio.StringOperation;

public class EnumConParametros {

	public static void main(String[] args) {
		//Simular Herencia
		EnumConParametros main = new EnumConParametros();
		StringOperation operacion = BasicStringOperation.TO_UPPER;
		String des = operacion.getDescription();
		System.out.println(des);
		
	}


}
