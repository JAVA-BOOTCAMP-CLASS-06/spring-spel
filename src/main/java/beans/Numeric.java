package beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Numeric {

	@Value("#{T(java.lang.Math).round(T(java.lang.Math).random() * 100.0)}")
	private double value1;

	@Value("#{T(java.lang.Math).round(T(java.lang.Math).random() * 100.0)}")
	private double value2;
	
	@Value("#{numeric.value1 + numeric.value2}")
	private double suma;
	
	public double getValue1() {
		return value1;
	}
	
	public double getValue2() {
		return value2;
	}

	public double getSuma() {
		return suma;
	}
	
	

}