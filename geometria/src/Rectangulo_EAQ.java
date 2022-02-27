/**
 * 
 * @author Stfa
 * @nombre Estefania
 * @apellidos Alfaro Quiles
 * @version 1.2
 * 
 */
public class Rectangulo_EAQ extends FiguraGeometrica_EAQ {
	private double l1;
	private double l2;

	/**
	 * 
	 * @param tipoFigura recoge el tipo de la figura geometrica
	 * @param lG         medida de lado 1
	 * @param lP         medida de lado 2
	 */
	public Rectangulo_EAQ(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	@Override
	/**
	 * 
	 * @return el area de la figura
	 */
	public double area() {
		return l1 * l2;
	}

	@Override
	/**
	 * 
	 * @return el perimetro de la figura
	 */
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
