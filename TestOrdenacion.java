package Ordenacion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestOrdenacion {

	@Test
	void caso1() {
		Ordenacion o = new Ordenacion();
		int n1 = 3;
		int n2 = 4;
		int n3 = 5;
		String resultado = o.ordenarNumeros(n1, n2, n3);
		String esperado =  "El orden es " + n1 + "<" + n2 + "<" + n3;
		assertEquals(esperado, resultado);
	}
	
	@Test
	void caso2() {
		Ordenacion o = new Ordenacion();
		int n1 = 2;
		int n2 = 9;
		int n3 = 7;
		String resultado = o.ordenarNumeros(n1, n2, n3);
		String esperado = "El orden es " + n1 + "<" + n3 + "<"+ n2;	
		assertEquals(esperado, resultado);
	}

	@Test
	void caso3() {
		Ordenacion o = new Ordenacion();
		int n1 = 5;
		int n2 = 7;
		int n3 = 2;
		String resultado = o.ordenarNumeros(n1, n2, n3);
		String esperado = "El orden es " + n3 +"<"+ n1 +"<"+ n2;
		assertEquals(esperado, resultado);

}
	@Test
	void caso4() {
		Ordenacion o = new Ordenacion();
		int n1 = 6;
		int n2 = 4;
		int n3 = 5;
		String resultado = o.ordenarNumeros(n1, n2, n3);
		String esperado = "El orden es " + n2 + "<"+ n3 + "<" + n1;
		assertEquals(esperado, resultado);

}
	@Test
	void caso5() {
		Ordenacion o = new Ordenacion();
		int n1 = 3;
		int n2 = 2;
		int n3 = 4;
		String resultado = o.ordenarNumeros(n1, n2, n3);
		String esperado = "El orden es " + n2 + "<"+ n1 + "<"+ n3 ;
		assertEquals(esperado, resultado);

}
	@Test
	void caso6() {
		Ordenacion o = new Ordenacion();
		int n1 = 8;
		int n2 = 7;
		int n3 = 5;
		String resultado = o.ordenarNumeros(n1, n2, n3);
		String esperado = "El orden es " + n3 + "<"+ n2 + "<"+ n1;
		assertEquals(esperado, resultado);

}
}