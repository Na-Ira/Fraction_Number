package intFractionalNumber;

import nedis.study.interfaces.t2.core.FractionNumber;
import nedis.study.interfaces.t2.core.FractionNumberOperation;

public class Fraction_Operatoin implements FractionNumberOperation {

	private int dividend;
	private int divisor;

	public FractionNumber add(FractionNumber a, FractionNumber b)
			throws NullPointerException {
		try {
			dividend = a.getDividend() * b.getDivisor() + a.getDivisor()
					* b.getDividend();
		} catch (NullPointerException e) {
			throw e;
		}
		try {
			divisor = a.getDivisor() * b.getDivisor();
		} catch (NullPointerException e) {
			throw e;
		}
		return new Fraction_Number(dividend, divisor);

	}

	public FractionNumber sub(FractionNumber a, FractionNumber b)
			throws NullPointerException {
		try {
			dividend = a.getDividend() * b.getDivisor() - a.getDivisor()
					* b.getDividend();
		} catch (NullPointerException e) {
			throw e;
		}
		try {
			divisor = a.getDivisor() * b.getDivisor();
		} catch (NullPointerException e) {
			throw e;
		}
		return new Fraction_Number(dividend, divisor);

	}

	public FractionNumber mul(FractionNumber a, FractionNumber b)
			throws NullPointerException {
		try {
			dividend = a.getDividend() * b.getDividend();
		} catch (NullPointerException e) {
			throw e;
		}
		try {
			divisor = a.getDivisor() * b.getDivisor();
		} catch (NullPointerException e) {
			throw e;
		}
		return new Fraction_Number(dividend, divisor);
	}

	public FractionNumber div(FractionNumber a, FractionNumber b)
			throws NullPointerException {
		try {
			dividend = a.getDividend() * b.getDivisor();
		} catch (NullPointerException e) {
			throw e;
		}
		try {
			divisor = a.getDivisor() * b.getDividend();
		} catch (NullPointerException e) {
			throw e;
		}
		return new Fraction_Number(dividend, divisor);
	}

}
