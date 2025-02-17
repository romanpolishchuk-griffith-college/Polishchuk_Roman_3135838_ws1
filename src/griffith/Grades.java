package griffith;

import java.util.Arrays;

public class Grades {
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
