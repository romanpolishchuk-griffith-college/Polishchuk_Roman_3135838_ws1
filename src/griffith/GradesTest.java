package griffith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GradesTest {

	@Test
    void testGradesMax() throws Exception{
		//Create grades class instance
		Grades grades = new Grades();
		
		//Test max is the first element
		assertEquals(10, grades.gradesMax(new int[]{10, 6, 3, 1, 2}));
		//Test max is the last element
		assertEquals(5, grades.gradesMax(new int[]{0, 4, 3, 1, 5}));
		//Test max is in the middle
		assertEquals(30, grades.gradesMax(new int[]{3, 30, 3, 29, 2}));
		//Test max is the negative number
		assertEquals(-2, grades.gradesMax(new int[]{-6, -26, -3, -2, -20}));
		
		//For null and empty array method throw exception
		
		//Test null
		assertThrows(Exception.class, () -> grades.gradesMax(null));
		//Test empty array
		assertThrows(Exception.class, () -> grades.gradesMax(new int[]{}));
	};
	
    @Test
    void testGradesTotal() throws Exception{
		//Create grades class instance
		Grades grades = new Grades();
		
		//Test total
		assertEquals(13, grades.gradesTotal(new int[]{2, 3, 5, 1, 2}));
		assertEquals(15, grades.gradesTotal(new int[]{5, 9, 3, 7, -9}));
		assertEquals(-35, grades.gradesTotal(new int[]{6, 8, 15, -34}));
		
		//For null and empty array method throw exception
		
		//Test null
		assertThrows(Exception.class, () -> grades.gradesTotal(null));
		//Test empty array
		assertThrows(Exception.class, () -> grades.gradesTotal(new int[]{}));
    };
    
    @Test
    void testGradesAverage() throws Exception{
		//Create grades class instance
		Grades grades = new Grades();
		
		//Test average
		assertEquals(2.6, grades.gradesAverage(new int[]{2, 3, 5, 1, 2}));
		assertEquals(3, grades.gradesAverage(new int[]{5, 9, 3, 7, -9}));
		assertEquals(-1, grades.gradesAverage(new int[]{6, 8, 15, -34}));
		
		//For null and empty array method throw exception
		
		//Test null
		assertThrows(Exception.class, () -> grades.gradesAverage(null));
		//Test empty array
		assertThrows(Exception.class, () -> grades.gradesAverage(new int[]{}));
    };
    
    @Test
    void testCountFails() throws Exception{
		//Create grades class instance
		Grades grades = new Grades();
		
		//Test average
		assertEquals(0, grades.countFails(new int[]{21, 30, 50, 100, 20}, 20));
		assertEquals(2, grades.countFails(new int[]{5, 90, 30, 70, 9}, 10));
		assertEquals(1, grades.countFails(new int[]{6, 8, 15, -34}, 2));
		
		//For null and empty array method throw exception
		
		//Test null
		assertThrows(Exception.class, () -> grades.countFails(null, 10));
		//Test empty array
		assertThrows(Exception.class, () -> grades.countFails(new int[]{}, 10));
    };
}
