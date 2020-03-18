package modelos;

public class Losango extends Poligono {
	
	public Losango() {
		super();
	}

	public Losango(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double perimetro() {
		return getBase()*4;
	}
	
}
