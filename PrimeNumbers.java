import java.util.ArrayList;

public class PrimeNumbers {

	public static ArrayList<Integer> generatePrimes(int n) {
		ArrayList<Integer> ret = new ArrayList<Integer>();

		for (int candidate = 2; n > 1; candidate++) {
			for (; n % candidate == 0; n /= candidate) {
				ret.add(candidate);
			}
		}
		
		return ret;
	}

}
