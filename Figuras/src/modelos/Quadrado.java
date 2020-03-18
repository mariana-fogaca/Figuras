package modelos;

public class Quadrado extends Poligono implements Diagonal  {

	public Quadrado() {
		super();
	}

	public Quadrado(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double perimetro() {
				return getAltura()*4;
	}
	
	public double calcular() {
		return Math.sqrt(getAltura());
	}

}
