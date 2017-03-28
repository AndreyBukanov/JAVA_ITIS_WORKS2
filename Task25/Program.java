class Program {

	private static final int PARKING_SIZE = 5;

	public static void main(String args[]) {

	//make new parking place
	ParkingPlace parking = new ParkingPlace(PARKING_SIZE);

	Car carA = new Car("a111aa", 10);
	Car carB = new Car("b222bb", 0);

	carA.come(parking);
	carB.come(parking);

	parking.nextStep();
	parking.nextStep();

	parking.print();

	carA.leave(parking);
	carB.leave(parking);

	parking.nextStep();

	parking.print();

	}//end of main()	

}//end of Programm