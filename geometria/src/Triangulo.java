
public class Triangulo extends FiguraGeometrica {
	private double a;
	private double b;
	private double c;
	
	public Triangulo(String tipoFigura, double lado1, double lado2, double lado3) {
		super(tipoFigura);
		a = lado1;
		b = lado2;
		c = lado3;
	}

	@Override
	public double perimetro() {
		return a + b + c;
	}

	@Override
	public double area() { //Utiliza la formula de Her—n
		double sp;
		sp = this.semiPerimetro();
		return Math.sqrt(sp * (sp-a) * (sp-b) * (sp-c));
	}
	
	public double semiPerimetro() {
		return this.perimetro() / 2;
	}
}
