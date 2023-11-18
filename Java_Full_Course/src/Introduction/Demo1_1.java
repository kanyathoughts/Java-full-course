package Introduction;

public class Demo1_1 {

	public static void main(String[] args) {
		/**
		 * main method (Which is mandatory for java code)
		 * 1. public: Access modifier (by default it will be public)
		 * 2. static: It is a keyword (This keyword is for global utilize purpose)
		 * 3. void: return type and it is not returning anything
		 * 4. Inside parenthesis: we can give parameters that is optional
		 * 
		 */
		System.out.println("Hello World");
		/**
		 * This is Declaration statement containing Datatype and name of the variable
		 * and value of the variable and initialization is optional here;
		 */
		int myFirstNumber = 7;
		System.out.println(myFirstNumber);
		/**operators: /*+- */
		int operations = (3 * 10) + 10 - 5 / 5; 
		System.out.println(operations);
		
		int mySecondNumber = 12;
		int myThirdNumber = mySecondNumber * 2;
		int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
		System.out.println(myTotal);
		//package is a way to organize our projects.
	}
}
