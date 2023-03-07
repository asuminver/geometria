
public class Circulo_JAZ extends FiguraGeometrica_JAZ {
	private double radio;
	//Constante pi
	static final double PI = 3.1416;
	
	public Circulo_JAZ(double r, String tipoFigura) {
		super(tipoFigura);
		radio = r;
	}

	@Override
	public double area() {
		return radio * radio * PI;

	}
	
	@Override
	public double perimetro() {
		return radio * 2 * PI;
	}

}
