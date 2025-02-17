/*
 * Roman Polishchuk
 * 3135838
 */

package griffith;

import java.util.Arrays;

public class Grades {
	
	//Calculate max grades
	int gradesMax(int[] grades) throws Exception {
		if (grades == null) {
			throw new Exception();
		}
		if (grades.length == 0) {
			throw new Exception();
		}
		int max = grades[0];
		
        for(int i = 0; i < grades.length;i++)
        {
            if(grades[i] > max)
            {
                max = grades[i];
            }
        };
        return max;
	}
	
	//Calculate grades total
	int gradesTotal (int[] grades) throws Exception {
		if (grades == null) {
			throw new Exception();
		}
		if (grades.length == 0) {
			throw new Exception();
		}
		
		int total = 0;
		
        for(int i = 0; i < grades.length; i++)
        {
            total += grades[i];
        };
        return total;
	}
	
	//Calculate grades average
	double gradesAverage(int[] grades) throws Exception {
		if (grades == null) {
			throw new Exception();
		}
		if (grades.length == 0) {
			throw new Exception();
		}
		
		int total = 0;
		
        for(int i = 0; i < grades.length; i++)
        {
            total += grades[i];
        };
        
        double average = total / (double)grades.length; 
        return average;
	}
	
	//Calculate number of failed grades
	int countFails(int[] grades, int minGrade) throws Exception {
		if (grades == null) {
			throw new Exception();
		}
		if (grades.length == 0) {
			throw new Exception();
		}
		
		int failed = 0;
		
        for(int i = 0; i < grades.length; i++)
        {
            if (grades[i] < minGrade) {
            	failed++;
            }
        };
        
        return failed;
	}
}
