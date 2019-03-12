package tests;
import main.Triangle;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.*;

public class TriangleTest{
	
	@Test
	public void testIsRightAngledTriangle(){
		Triangle obj = new Triangle(3,4,5);
		assertTrue(obj.isRight());		
	}

	@Test
	public void testIsNotRightAngledTriangle(){
		Triangle obj = new Triangle(3,4,7);
		assertFalse(obj.isRight());
	}

	@Test
	public void testforTriangleIsScalene(){
		Triangle obj = new Triangle(3,4,7);
		assertTrue(obj.isScalene());
	}

	@Test
	public void testforTriangleIsIsosceles(){
		Triangle obj = new Triangle(3,4,3);
		assertTrue(obj.isIsosceles());
	}

	@Test
	public void testforTriangleIsEquilateral(){
		Triangle obj = new Triangle(4,4,4);
		assertTrue(obj.isEquilateral());
	}
}
