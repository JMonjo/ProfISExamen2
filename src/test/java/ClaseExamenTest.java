import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ClaseExamenTest{
    
	private ClaseExamen test;
	
	@Before
	public void before() {
		test = new ClaseExamen();
	}
	
	
	@Test
	public void test_n6() throws Exception{
    	int n = 6;
    	List<Integer> esperado = new ArrayList<Integer>();
		esperado.add(2);
		esperado.add(3);
    	assertEquals(esperado, test.primos(n));
    }
	
	@Test
	public void test_n13() throws Exception{
    	int n = 13;
    	List<Integer> esperado = new ArrayList<Integer>();
    	esperado.add(13);
    	assertEquals(esperado, test.primos(n));
    }
	
	@Test
	public void test_n25() throws Exception{
    	int n = 25;
    	List<Integer> esperado = new ArrayList<Integer>();
    	esperado.add(5);
    	esperado.add(5);
    	assertEquals(esperado, test.primos(n));
	}
	
	@Test (expected = Exception.class)
	public void test_ninvalida() throws Exception{
    	int n = 1;
    	test.primos(n);
    }

}