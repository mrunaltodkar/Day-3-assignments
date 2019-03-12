package tests;
import main.Date;
import org.junit.*;
import static org.junit.Assert.*;


public class DateTest{
	
	Date obj;
	Date obj1;
	
	@Before
	public void setUp(){
		obj = new Date(20,8,1997);
		obj1 = new Date(21,9,1998);
		}				
	
	@Test
	public void testValidInputsForStringOutput(){
		assertEquals("20/8/1997",obj.toString());
	}

	@Test
	public void testWhichIsSmallerDate(){
		assertTrue(obj1.isSmaller(obj));
	}

	@Test
	public void testDifferenceBetweenDates(){
		int [] myarr={1,1,1};
		assertArrayEquals(myarr,obj1.diff(obj));
	}		
}