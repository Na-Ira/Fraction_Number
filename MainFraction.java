package intFractionalNumber;

import nedis.study.interfaces.t2.core.FractionNumber;

public class MainFraction {

	public static void main(String[] args) {

		Fraction_Number ob1 = new Fraction_Number(5, 3);
		Fraction_Number ob2 = new Fraction_Number(2, 2);

		Fraction_Operatoin fraction = new Fraction_Operatoin();

		System.out.println("FractionNumber add = " + " "
				+ fraction.add(ob1, ob2));
		System.out.println("FractionNumber sub = " + " "
				+ fraction.sub(ob1, ob2));
		System.out.println("FractionNumber mul = " + " "
				+ fraction.mul(ob1, ob2));
		System.out.println("FractionNumber div = " + " "
				+ fraction.div(ob1, ob2));

	}

}
