package modelos;

public class Retangulo extends Poligono implements Diagonal {

	public Retangulo() {
		super();
	}

	public Retangulo(double base, double altura) {
		super(base, altura);
	}
	
	@Override
	public double perimetro() {
		return 2*(getAltura()+getBase());
	}

	@Override
	public double calcular() {
		return Math.sqrt(Math.pow(getAltura(),2)+Math.pow(getBase(),2));
	}

}
