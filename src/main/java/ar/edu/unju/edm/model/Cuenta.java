package ar.edu.unju.edm.model;

public class Cuenta {
	//atributos --> propiedades
	private Integer numCuenta;
	private int dni;
	private double saldo;
	private String nombre;
	
	//constructor sin parametros
	public Cuenta() {
		// TODO Auto-generated constructor stub
	}
	
	//constructor con parametros
	public Cuenta(int numCuenta, int dni, double saldo) {
		super();
		this.numCuenta = numCuenta;
		this.dni = dni;
		this.saldo = saldo;
	}

	//metodos propios o metodos del modelo de negocio
	public void extrar(double monto) {
		saldo = saldo - monto;
	}
	
	public void depositar (double monto) {
		saldo = saldo + monto;
	}
	
	
	//metodos accesores Get y Set

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public Integer getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(Integer numCuenta) {
		this.numCuenta = numCuenta;
	}

	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}
