package pe.com.hiveit.sf.ejb.calculoareas;

import javax.ejb.Local;

@Local
public interface CalculoAreasLocal {

    double circulo(double radio);

    double triangulo(double altura, double base);
}
