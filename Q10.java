/*
Q10) Faça um programa que possua o método "mediaDeNotas()" que imprima a média das notas do vetor (II).
	double notas[] = {7.9, 6.4, 3.8, 9.7, 5.6, 10.0, 7.2, 6.5, 6.8, 8.7, 4.3, 7.3, 8.0, 7.0};
*/

class Q10 {

	static double schoolGrade[] = {7.9, 6.4, 3.8, 9.7, 5.6, 10.0, 7.2, 6.5, 6.8, 8.7, 4.3, 7.3, 8.0, 7.0};
	
	public static void main(String[] args) {
		System.out.printf("%.2f", sumOfGrades());
	}
	
	public static double sumOfGrades() {
		double sum = 0.0;
		double gradeAverage = 0.0;
		for(int reportCards = 0; reportCards < schoolGrade.length; reportCards++)
			sum += schoolGrade[reportCards];
			gradeAverage = sum/13;
		return gradeAverage;	
	}
}