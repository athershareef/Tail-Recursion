package fa;

public class Recursion {

	private static double sin(double x, int i, double acc) {
		// TODO Auto-generated method stub
		if (i >= 21) {
			return acc;
		}
		if ((i + 1) % 4 == 0) {
			acc = acc - pow(x, i, 1) / fact(i);
		} else {
			acc = acc + pow(x, i, 1) / fact(i);
		}
		return sin(x, i + 2, acc);
	}

	private static double pow(double x, int i, double acc) {
		// TODO Auto-generated method stub
		if (i == 0) {
			return acc;
		}
		acc = acc * x;
		return pow(x, --i, acc);
	}

	private static int fact(int n) {
		if (n == 1) {
			return 1;
		}
		return n * fact(n - 1);
	}

	private static int peanotimes(int i, int j) {
		if (j - 1 == 0) {
			return i;
		}
		return peanoplus(i, peanotimes(i, --j));
	}

	private static int peanoplus(int i, int j) {
		if (j == 0) {
			return i;
		}
		return peanoplus(++i, --j);
	}
}
