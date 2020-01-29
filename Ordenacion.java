package Ordenacion;

import java.util.Scanner;

public class Ordenacion {

	public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);
	System.out.println("Introduzca número 1: ");
	int n1 = entrada.nextInt();
	System.out.println("Introduzca número 2: ");
	int n2 = entrada.nextInt();
	System.out.println("Introduzca número 3: ");
	int n3 = entrada.nextInt();
	ordenarNumeros(n1, n2, n3);
	
	}
	
	public static String  ordenarNumeros(int n1, int n2, int n3){
		 if(n1 < n2) {
			if(n1 < n3) {
				if(n2 < n3) {
					return "El orden es " + n1 + "<" + n2 + "<" + n3 ;
				}else {
					return "El orden es " + n1 + "<" + n3 + "<"+ n2;	
				}
			}else {
					return"El orden es " + n3 +"<"+ n1 +"<"+ n2;
			}
		 }else if(n2 < n3) {
			 if(n3 <  n1) {
				 	return "El orden es " + n2 + "<"+ n3 + "<" + n1;
			 }else {
				 	return "El orden es " + n2 + "<"+ n1 + "<"+ n3 ;
			 }
		 }else {
			 		return "El orden es " + n3 + "<"+ n2 + "<"+ n1;
		 }
	}
}
	

