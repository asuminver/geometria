/**
 * 
 * @author Andrés Plaza Vicente
 * @version 1.2
 *
 */


/**
 * Es la clase Rectángulo
 * 
 *
 */
public class Rectangulo_APV extends FiguraGeometrica_APV {
	private double l1;
	private double l2;
	
	
	/**
	 * 
	 * @param tipoFigura
	 * @param lG
	 * @param lP
	 * Llama a la superclase figura geometrica y le asigna cada lado a una nueva variable
	 * 
	 */
	public Rectangulo_APV(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	/**
	 * @return un numero decimal causado por la multiplicación de los lados
	 * 
	 */
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * @return calcula el perímetro multiplicando por dos cada lado del 
	 * metodo anterior y sumandolos para así dar con la suma total de lados
	 */
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
