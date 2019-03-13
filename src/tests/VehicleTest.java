package tests;
import main.Vehicle;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.*;


public class VehicleTest{

		Vehicle vehicle;
		Vehicle vehicle1;
		Vehicle vehicle2;

	@Before
	public void setUp(){
		vehicle = new Vehicle(60,55.60,"Mrunal");
		vehicle1 = new Vehicle(90,70.0,"Aayush");
		vehicle2 = new Vehicle(120,60.30,"Prangshu");

	}
	
	@Test
	public void testChangeInSpeed(){
		assertEquals(90,vehicle.changeSpeed(30));
	}
	
	@Test
	public void testChangeInSpeed1(){
		assertEquals(110,vehicle1.changeSpeed(20));
	}

	@Test
	public void testChangeInSpeed2(){
		assertEquals(130,vehicle2.changeSpeed(10));
	}

	@Test
	public void testForSpeedInZero(){
		assertEquals(0,vehicle.stopSpeed());
	}

	@Test
	public void testForSpeedInZero1(){
		assertEquals(0,vehicle1.stopSpeed());
	}

	@Test
	public void testForSpeedInZero2(){
		assertEquals(0,vehicle2.stopSpeed());
	}

	@Test
	public void testForVehicleRotationsInLeft(){
		assertEquals(50.0,vehicle.vehicleTurn(5.6,"left"),0.2);
	}

	@Test
	public void testForVehicleRotationsInRight(){
		assertEquals(78.6,vehicle1.vehicleTurn(8.6,"right"),0.2);
	}
	
	@Test
	public void testHighestVehicleId(){
		assertEquals(10012,vehicle2.getHighestVehicleId());
	}

	@Test
	public void testForToString(){
		assertEquals("60 55.6 Mrunal",vehicle.toString());
	}
}