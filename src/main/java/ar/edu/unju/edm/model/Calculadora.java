package ar.edu.unju.edm.model;

public class Calculadora {
	private int a;
	private int b;
	
	public Calculadora() {
		// TODO Auto-generated constructor stub
	}

	public int sumar() {
		int suma;
		suma = a + b;
		return suma;
	}
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	

}
