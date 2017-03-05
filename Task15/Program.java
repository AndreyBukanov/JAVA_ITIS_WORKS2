class Program {

	public static double[] quadEq(double a, double b, double c) {

		double answer[] = new double[2];
		
		answer[0] = 0;
		answer[1] = 0;
		
		double dis = Math.pow(b, 2) - 4 * a * c;

		answer[0] = (-1 * b + Math.sqrt(dis)) / 2 * a;
		answer[1] = (-1 * b - Math.sqrt(dis)) / 2 * a;

		return answer;
	}

	public static void main(String[] args) {

		double a = 1.0;
		double b = 2.0;
		double c = 10;

		double answer[] = quadEq(a, b, c);

		System.out.printf("%f %f\n", answer[0], answer[1]);

	}
}