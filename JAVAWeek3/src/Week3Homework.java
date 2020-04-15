import java.io.ObjectInputStream.GetField;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Week3Homework {

	public static void main(String[] args) {
		//1A & B
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 21};
		
		int averageOfAges = ages.length;
		int firstNumber = ages [ages.length - ages.length];
		int lastNumber = ages [ages.length - 1];
		
		System.out.println("21 - 3 = " + (lastNumber - firstNumber));
		
		//1C.
			int total = 0;
			
			for (int i = 0; i < ages.length; i++) {
				total += ages[i];
			}
			int average = total / ages.length;
			System.out.println("The average is: " + average);
			
		//2. 
			String[] names = {"Sam", "Tommy", "Tim", "Sally", "Jr", "Billy"};
			
		//2A. 
			int total2 = 0;
			
			for (int i = 0; i < names.length; i++) {
				total2 += names[i].length();
			}
			double averageNumOfLetters = total2 / names.length;
			System.out.println("The average number of letters are: " + averageNumOfLetters );
			
		//2B. 
			int total3 = 0;
			
			String allNames = "";
			
			for (int i = 0; i < names.length; i++) {
				allNames += names[i] + " ";
			}
			System.out.println("Here are the all names: " + allNames);
		
		//3. How do you access the last element of any array: ages[ages.length - 1];
		
		//4. How do you access the first element of any array: ages[0];
			
		//5. 
			int[] nameLengths = new int[names.length];
			for (int i = 0; i < names.length; i++) {
				nameLengths[i] = names[i].length();
			}
		//6.
			int sum = 0;
			for (int i = 0; i < nameLengths.length; i++) {
				sum += nameLengths[i];
			}
			System.out.println(sum);
			
		//7.
			System.out.println(multiplyString("Dez " , 3));
			
		//8.
			String firstName = "Jay";
			String lastName = "Young";
			String fullName = createFullName(firstName, lastName);
			
			System.out.println(fullName);
		
		//9.
			int[] numbers = new int[4];
			int averagetempratureOutside = numbers.length;
			
			numbers[0] = 10;
			numbers[1] = 20;
			numbers[2] = 70;
			numbers[3] = 100;
			
			System.out.println(greaterThan100(numbers));
			
		//10 & 11. 
			double[] tempeatureOfWeather = new double[4];
			tempeatureOfWeather[0] = 84.94;
			tempeatureOfWeather[1] = 93.83;
			tempeatureOfWeather[2] = 84.93;
			tempeatureOfWeather[3] = 20.94;
			
			double[] gasPrices = new double[4];
			gasPrices[0] = 3.39;
			gasPrices[1] = 1.84;
			gasPrices[2] = 2.93;
			gasPrices[3] = 1.86;
			
			System.out.println(findAverage(tempeatureOfWeather));
			
			System.out.println(isFirstArrayAverageGreaterThanSecondArrayAverage(tempeatureOfWeather, gasPrices));
			
		//12.
			boolean willBuyDrink = false;
			boolean isHotOutside = false;
			double moneyInPocket = 15.83;
			
			System.out.println("Will I buy a drink today?: " + willBuyDrink(isHotOutside, moneyInPocket));
			
		//13. 
			boolean isItRaining = false;
			double gallonsOfGas = 16; 
			
			System.out.println("Will I drive today?: " + willIDriveToday(isItRaining, gallonsOfGas));
			
		}
		
		//7. Method
			public static String multiplyString(String str, int num) {
			String result = "";
			for (int i = 0; i < num; i++) {
				result += str;
			}
			return result;
		}	
		
		//8. Method
			public static String createFullName(String firstName, String lastName) {
				return firstName + " " + lastName;
		}
			
		//9. Method
			public static boolean greaterThan100(int[] numbers) {
				int sum = 0;
				for (int i = 0; i < numbers.length; i++) {
					sum += numbers[i];
				}
				
				if (sum > 100) {
					return true;
				} else {
					return false;
				}
				
			}
			
		//10. Method
			public static double findAverage(double[] numbers) {
				double sum = 0;
				for (double number : numbers) {
					sum += number;
				}
				return sum / numbers.length;
			}
			
		//11. Method
			public static boolean isFirstArrayAverageGreaterThanSecondArrayAverage(double[] firstArray, double[] secondArray) {
				if (findAverage(firstArray) > findAverage(secondArray) ) {
					return true; 
				} else {
					return false;
				}
			}	
		//12. Method
			public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
				return !isHotOutside && moneyInPocket > 10.50;
			}
			
		//13. Method
			
			// Created a simple boolean method and described I will drive today if it is not raining and 
			// if I have enough gas in my tank. 
			
			public static boolean willIDriveToday(boolean isItRaining, double gallonsOfGas) {
				return !isItRaining && gallonsOfGas > 8;
			}
			
				
			
}
