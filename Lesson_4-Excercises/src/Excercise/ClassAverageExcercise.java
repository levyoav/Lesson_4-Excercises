package Excercise;

public class ClassAverageExcercise {

	public static void main(String[] args) {

		int[][] matrix = new int[20][10];

		double classAvg = 0;

		for (int i = 0; i < matrix.length; i++) {

			double stdAvg = 0;

			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 41) + 60;
				stdAvg += matrix[i][j];
				System.out.print(matrix[i][j] + "\t");
			}

			stdAvg = stdAvg / matrix[i].length;
			System.out.println("\tavg of student " + (i + 1) + " is " + stdAvg);
			classAvg += stdAvg;
		}

		classAvg = classAvg / matrix.length;
		System.out.println("class average: " + classAvg);

	}
}
