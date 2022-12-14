package microservices.book.multiplication.domain;

public class Multiplication_bkp {
	private int factorA;
	private int factorB;

	private int result;

	public Multiplication_bkp(int factorA, int factorB) {
		this.factorA = factorA;
		this.factorB = factorB;
		this.result = factorA * factorB;
	}

	public int getFactorA() {
		return factorA;
	}

	public int getFactorB() {
		return factorB;
	}

	public int getResult() {
		return result;
	}

	@Override
	public String toString() {
		return "Multiplication{" + "factorA=" + factorA + ", factorB=" + factorB + ", result(A * B)=" + result + "}";
	}
}
