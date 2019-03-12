package tests;
import main.Country;
import static org.junit.Assert.*;
import org.junit.*;

public class CountryTest{
	Country countries[];

	@Before
	public void setUp(){
		countries = new Country[4];
		countries[0]=new Country("India",65399300,7858030);
		countries[1]=new Country("USA",920151548,58580640);
		countries[2]=new Country("UK",25420200,542834);
		countries[3]=new Country("Australia",850235412,60212030);
 
	}

	@Test
	public void testForCountryWithLargestArea(){
		Country expectedCountry = new Country("Australia",850235412,60212030);
		Country actualCountry = new Country().largestArea(countries);
		assertEquals(expectedCountry.getCountryName(),actualCountry.getCountryName());
	}

	@Test
	public void testForCountryWithLargestPopulation(){
		Country expectedCountry = new Country("USA",920151548,58580640);
		Country actualCountry = new Country().largestPopulation(countries);
		assertEquals(expectedCountry.getPopulation(),actualCountry.getPopulation());
	}
	
	@Test
	public void testForCountryWithLargestPopulationDensity(){
		Country expectedCountry = new Country("UK",25420200,542834);
		Country actualCountry = new Country().largestPopulationDensity(countries);
		assertEquals(expectedCountry.getPopulation(),actualCountry.getPopulation());
	}
	
}
