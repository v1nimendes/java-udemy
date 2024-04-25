package util;

public class CurrencyConverter {
	
	public final static double IOF = 0.06;
	
	public static double converterDolarParaReal(double vDolar, double cDolar) {
		double valorReal = vDolar * cDolar;
		return valorReal + valorReal * IOF;
	}

}
