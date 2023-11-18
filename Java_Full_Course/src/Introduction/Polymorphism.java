package Introduction;

public class Polymorphism {
	public static final String INVALID_MESSAGE = "Invalid Value"; //Constant value
	public static void main(String[] args) {

		//method over loading means we can have same method names but with different number of parameters and different type of parameters.
//		calculateScore("Kanya", 970);
//		calculateScore(100);
//		System.out.println(calculateCm(6, 0));
		System.out.println(totalTime(700));


	}
	public static void calculateScore(String playerName, int score) {
		System.out.println(playerName + " scored " + score);
	}

	public static void calculateScore(int score) {
		System.out.println("un known player score " + score);
	}

	//feet and inches to centimeters
	public static double calculateCm(double feet, double inches) {
		if (feet >= 0 && (inches >=0 && inches <=12)) {
			double totalInches = (feet * 12) + inches;
			System.out.println(totalInches);
			return totalInches * 2.54;
		}
		return -1;
	}
	//Overloading concept
	//min and seconds to total time
	public static String totalTime(int min, int sec) {
		if (min >=0 && ((sec >= 0 && sec <=60))) {
			int hours = min / 60;
			int remainingMin = min % 60;
			String hoursString = hours + "h";
			if (hours < 10) {
				hoursString = "0" + hoursString;
			}
			String minutesString = remainingMin + "m";
			if (remainingMin < 10) {
				minutesString = "0" + minutesString;
			}
			String secondsString = sec + "s";
			if (sec < 10) {
				secondsString = "0" + secondsString;
			}
			return hoursString + " " + minutesString + " " + secondsString;
		}
		return INVALID_MESSAGE;
	}
	public static String totalTime(int sec) {
		if (sec >=0) {
			int min = sec / 60;
			int remainingSec = sec % 60;
			return totalTime(min, remainingSec);
		}
		return INVALID_MESSAGE;
	}



}
