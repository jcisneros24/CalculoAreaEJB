package pe.com.hiveit.sf.ejb.calculoareas;

import javax.ejb.Remote;

@Remote
public interface CalculoAreasRemote {

    double circulo(double radio);

    double triangulo(double altura, double base);
}
