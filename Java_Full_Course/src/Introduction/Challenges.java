package Introduction;

import java.util.SortedMap;

public class Challenges {
	private static final double piValie = Math.PI;

	public static void main(String[] args) {
		printConversion(75.114);
		printMegaBytesAndKiloBytes(2500);
		System.out.println(shouldWakeUp(true, -1));
		System.out.println(isLeapYear(2600));
		System.out.println(hasEqualSum(1,-1,0));
		System.out.println(isTeen(15));
		System.out.println(hasTeen(1,2,87));
		System.out.println(areEqualByThreeDecimalPlaces(3.124, 3.124));

		String name = "(Ka[n\"/^&,*y@a";
		System.out.println(name.replaceAll("[\\(\\[\"/\\^&,@\\*]", ""));
		String jashuName = "(J@a#s$%\\^&*h)?/:'//u";
		System.out.println(jashuName.replaceAll("[\\(@#\\$%\\\\^&\\*\\)\\?/:'//]", ""));
		System.out.println("area: " + area(5));
		System.out.println("area: " + area(5, 5));

		printYearsAndDays(561600);
		printEqual(1,2,31);
		System.out.println(isCatPlaying(false, 36));


	}
	//challenge 1
	public static long toMilesPerHour(double kilometersPerHour) {
		if(! (kilometersPerHour < 0)) {
			return Math.round(kilometersPerHour/1.609);
		}
		return -1;
	}
	public static void printConversion(double kilometersPerHour) {
		if(kilometersPerHour < 0) {
			System.out.println("Invalid Value");
		}
		else {
			System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
		}
	}
	//challenge 2
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		if (kiloBytes < 0) {
			System.out.println("Invalid Value");
		}
		else {
			System.out.println(kiloBytes + " KB = " + (kiloBytes/1024) + " MB and " + (kiloBytes%1024) + " KB");
			//if we divide with "/" we will get quotient and if we divide with "%" we will get remainder.
			//2500 divided by 1024 = 2 and remainder 452. 2500 is called dividend, 1024 is called divisor, 2 is called quotient and 452 is called remainder.
		}
	}

	//challenge 3
	public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
		if (barking && (hourOfDay >= 0 && hourOfDay <=23)) {
			if(hourOfDay < 8 || hourOfDay > 22) {
				return true;
			}
		}
		return false;
	}
	/*
	1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
	2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
	3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
	4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.
	5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false.
	 */
	//challenge 4: Leap year checking
	public static boolean isLeapYear(int year) {
	 	if(year >=1 && year <= 9999) {
			 if((year%4) == 0) {
				 if((year%100 == 0)) {
					 if((year%400 == 0)) {
						 return true;
					 }
					 else {
						 return false;
					 }
				 }
				 else {
					 return true;
				 }
			 }
		}
		return false;
	}

	//challenge5: compare two double values up to 3 decimals. Most important
	public static boolean areEqualByThreeDecimalPlaces(double d1, double d2) {
		int num1 = (int) (d1 * 1000);
		int num2 = (int) (d2 * 1000);
		if(num1 == num2) {
			return true;
		}
		return false;
	}
	//challenge6
	public static boolean hasEqualSum(int i1, int i2, int i3) {
		if(i3 == (i1 + i2)) {
			return true;
		}
		return false;
	}
	//challenge7: In the group of people we have to find teenager there or not.
	public static boolean isTeen(int age) {
		if(age >=13 && age <=19) {
			return true;
		}
		return false;
	}
	public static boolean hasTeen(int i1, int i2, int i3) {
		if((i1 >= 13 && i1 <= 19) || (i2 >= 13 && i2 <= 19) || (i3 >= 13 && i3 <= 19)) {
			return true;
		}
		return false;
	}

	//challenge8: Area calculator
	public static double area(double radius) {
		if (radius < 0) {
			return -1;
		}
		else {
			return radius * radius * piValie;
		}
	}
	public static double area(double side1, double side2) {
		if(side1 < 0 || side2 < 0) {
			return -1;
		}
		else {
			return side1 * side2;
		}
	}

	//challenge9: Minutes to years and days calculator
	public static void printYearsAndDays(long minutes) {
		if(minutes < 0) {
			System.out.println("Invalid Value");
		}
		else {
			long hours = minutes / 60;
			long remainingMinutes = minutes % 60;
			long days = hours / 24;
			long remainingHours = hours % 24;
			long years = days / 365;
			long remainingDays = days % 365;
			System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
		}
	}

	//challenge10: Equality printer
	public static void printEqual(int num1, int num2, int num3) {
		if (num1 < 0 || num2 < 0 || num3 < 0) {
			System.out.println("Invalid Value");
		} else {
			if((num1 == num2) && (num2 == num3) && (num3 == num1)) {
				System.out.println("All numbers are equal");
			} else if ((num1 != num2) && (num2 != num3) && (num3 != num1)) {
				System.out.println("All numbers are different");
			} else {
				System.out.println("Neither all are equal or different");
			}
		}
	}

	//challenge11: Playing cat
	public static boolean isCatPlaying(boolean summer, int temperature) {
		if(summer && (temperature >=25 && temperature <=45)) {
			return true;
		}
		else if ((!summer) && (temperature >=25 && temperature <=35)){
			return true;
		}
		return false;
	}





}
