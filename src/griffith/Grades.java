package griffith;

import java.util.Arrays;

public class Grades {
	int gradesMax(int[] grades) throws Exception {
		if (grades == null) {
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
	
	int gradesTotal (int[] grades) {
		return 0;
	}
	
	double gradesAverage(int[] grades) {
		return 0;
	}
	
	int countFails(int[] grades, int minGrade) {
		return 0;
	}
}
