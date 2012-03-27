import java.util.ArrayList;

public class PrimeNumberGenerator {
	
	public static ArrayList<Integer> generatePrimesList(int n){
		ArrayList<Integer> ret = new ArrayList<Integer>();
		
		for (int candidate = 2; n > candidate; candidate++){
			if(PrimeNumbers.generatePrimes(candidate).size() == 1)
				ret.add(candidate);
		}
		
		return ret;
	}

}
