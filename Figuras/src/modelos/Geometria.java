package modelos;
import java.util.ArrayList;
public class Geometria {
	public static void main(String agrs[]) {
		ArrayList<Figura> lista = new ArrayList<Figura>();
	
		lista.add(new Quadrado(4,4));
		lista.add(new Retangulo(20,30));
		lista.add(new Ciruculo(4));
		lista.add(new Losango(10,6));
		lista.add(new Triangulo(7,3));
		
		/*lista.forEach(f ->{
			System.out.println("Area = "+f.area()+" Perimetro = "+ f.perimetro());		
		});*/
		
		System.out.println("QUADRADO");
		System.out.println("Area = "+ lista.get(0).area() + " Perimetro = "+ lista.get(0).perimetro());
		System.out.println("RETANGULO");
		System.out.println("Area = "+ lista.get(1).area() + " Perimetro = "+ lista.get(1).perimetro());
		System.out.println("CIRCULO");
		System.out.println("Area = "+ lista.get(2).area() + " Perimetro = "+ lista.get(2).perimetro());
		System.out.println("LOSANGO");
		System.out.println("Area = "+ lista.get(3).area() + " Perimetro = "+ lista.get(3).perimetro());
		System.out.println("TRIANGULO");
		System.out.println("Area = "+ lista.get(4).area() + " Perimetro = "+ lista.get(4).perimetro());
	}

}
