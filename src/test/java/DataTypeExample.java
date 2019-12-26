public class DataTypeExample {

	/**
	* THIS IS AN EXAMPLE CLASS
	 * */

	public static void main(String args[]) {

		//this is a comment used for a single line
		/*this is a block comment used for long comments or class comments*/
	Car carOne = new Car(4, 2, 4, "B", false, "Toyota", "AD462HH");
	Car carTwo = new Car(4, 2, 4, "B", false, "Toyota", "AD462HH");

	carTwo.setDoors(2);
	carTwo.setFullDomain("ADDD34567HH");

	carOne.getDoors();
	carTwo.getDoors();
	}
}
