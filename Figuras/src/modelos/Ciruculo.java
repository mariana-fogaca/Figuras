package modelos;

public class Ciruculo extends Figura {
	private double raio;
	
	public Ciruculo() {
		
	};
	
	public Ciruculo(double raiz) {
		this.raio = raiz;
	};
	
	public double getRaiz() {
		return raio;
	}

	public void setRaiz(double raiz) {
		this.raio = raiz;
	}

	@Override
	public double area() {
		return 3.14*Math.pow(getRaiz(), 2);
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 2*(3.14*getRaiz());
	}
	
}
