import java.util.ArrayList;


public class PrimeNumbers {

	public static ArrayList<Integer> generatePrimes(int i) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ret = new ArrayList<Integer>();
		
		while(i%2 == 0){
			ret.add(2);
			i = i/2;
		}
		
		if(i > 1){
			ret.add(i);
		}
		
		return ret;
	}

}
