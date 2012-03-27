import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class PrimeNumberGeneratorTest {

	@Test
	public void testJUnit(){
		assertTrue("Testing JUnit",true);
	}
	
	@Test
	public void testOne(){
		assertEquals(list(), PrimeNumberGenerator.generatePrimesList(1));
	}
	
	@Test
	public void testTwo(){
		assertEquals(list(), PrimeNumberGenerator.generatePrimesList(2));
	}
	
	@Test
	public void testThree(){
		assertEquals(list(2), PrimeNumberGenerator.generatePrimesList(3));
	}
	
	@Test
	public void testFour(){
		assertEquals(list(2,3), PrimeNumberGenerator.generatePrimesList(4));
	}
	
	@Test
	public void testFive(){
		assertEquals(list(2,3), PrimeNumberGenerator.generatePrimesList(5));
	}
	
	@Test
	public void testSix(){
		assertEquals(list (2,3,5), PrimeNumberGenerator.generatePrimesList(6));
	}
	
	@Test
	public void testBigNumber(){
		assertEquals(list (2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103,107,109,113), PrimeNumberGenerator.generatePrimesList(123));
	}

	private ArrayList<Integer> list(int... ints){
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int i:ints){
			ret.add(i);
		}
		return ret;
	}
}
