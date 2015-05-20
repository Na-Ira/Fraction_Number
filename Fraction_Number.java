package intFractionalNumber;

import nedis.study.interfaces.t2.core.FractionNumber;

public class Fraction_Number implements FractionNumber {

	private int dividend = 1;
	private int divisor = 0;

	public Fraction_Number(int dividend, int divisor) {
		if (divisor == 0) {
			throw new ArithmeticException(
					"Знаменатель не может равняться нулю!");
		}

		this.dividend = dividend;
		this.divisor = divisor;

	}

	public int getGreatComDiv(int a, int b) {

		while (b != 0) {
			int temp = a % b;
			a = b;
			b = temp;
		}
		return a + b;

	}

	public Fraction_Number Reduction(int i, int d) {
		return new Fraction_Number(i / (getGreatComDiv(i, d)), d
				/ (getGreatComDiv(i, d)));
	}

	public void setDividend(int dividend) {
		this.dividend = dividend;
	}

	public int getDividend() {
		return this.dividend;
	}

	@Override
	public void setDivisor(int arg) throws IllegalArgumentException {
		try {
			if (divisor == 0) {
				throw new IllegalArgumentException();
			}
		} catch (Exception e) {
			System.out.println("На ноль делить нельзя!");
		}

		this.divisor = arg;
	}

	public int getDivisor() {
		return this.divisor;
	}

	public double value() {
		return (dividend / divisor);
	}

	@Override
	public String toString() {
		return this.getDividend() + " / " + this.getDivisor();
	}

}
