package pe.com.hiveit.sf.ejb.calculoareas;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class CalculoAreas
 */
@Stateless
@LocalBean
public class CalculoAreas implements CalculoAreasRemote, CalculoAreasLocal {

	@Override
	public double circulo(double radio) {
		return Math.PI * Math.pow(radio, 2.0);
	}

	@Override
	public double triangulo(double altura, double base) {
		return (base * altura) / 2.0;
	}
}
