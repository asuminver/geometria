
public class Triangulo_APV extends FiguraGeometrica_APV {
	private double lado1;
	private double lado2;
	private double lado3;
	
	public Triangulo_APV(String tipoFigura, double lado1, double lado2, double lado3) {
		super(tipoFigura);
		this.lado1 = lado1;
		this.lado2= lado2;
		this.lado3 = lado3;
	}

	@Override
	public double perimetro() {
		return lado1 + lado2 + lado3;
	}

	@Override
	public double area() { //Utiliza la formula de Her—n
		double sp;
		sp = this.semiPerimetro();
		return Math.sqrt(sp * (sp-lado1) * (sp-lado2) * (sp-lado3));
	}
	
	public double semiPerimetro() {
		return this.perimetro() / 2;
	}
}
