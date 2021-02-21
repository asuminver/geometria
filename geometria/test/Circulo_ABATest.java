package geometria;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Befoer;
import org.junit.Test;

public class Circulo_ABATest {
	
	private Circulo_ABA circulo1, circulo2, circulo3;
	
	@Before
	public void inicioPrueba() {
		circulo1 = new Circulo_ABA(7, "circulo");
		circulo2 = new Circulo_ABA(0, "circulo");
		circulo3 = new Circulo_ABA(-3, "circulo");
	}
	
	@After
	public void finPrueba() {
		circulo1=null;
		circulo2=null;
		circulo3=null;
	}
	
	@Test
	public void testAreaCirculo1() {
		double area1=circulo1.area();
		assertEquals(153.94, area1, 0.01);
	}
	
	@Test
	public void testAreaCirculo2() {
		double area2=circulo2.area();
		assertEquals(0.00, area2, 0.01);
	}
	
	@Test
	public void testAreaCirculo3() {
		double area3=circulo3.area();
		assertEquals(28.27, area3, 0.01);
	}
	
	@Test
	public void testPerimetro1() {
		double p1=circulo1.perimetro();
		assertEquals(43.98, p1, 0.01);
	}
	
	@Test
	public void testPerimetro2() {
		double p2=circulo2.perimetro();
		assertEquals(0.00, p2, 0.01);
	}
	
	@Test
	public void testPerimetro3() {
		double p3=circulo3.perimetro();
		assertEquals(18.85, p3, 0.01);
	}
	
	
}
