
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
			String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
			
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
			
		}
	}









