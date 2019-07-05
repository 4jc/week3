package week3;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] ages = new int[9];
ages[0] = 3;
ages[1] = 9;
ages[2] = 23;
ages[3] = 64;
ages[4] = 2;
ages[5] = 8;
ages[6] = 28;
ages[7] = 93;

ages[8] = 15;	//#1b

int subtract = (ages[ages.length - 1]) - (ages[ages.length - ages.length]);
System.out.println(subtract);	//#1a

double sum = 0.0;	//#1c

for (int age: ages) {
	sum += age;
	}
System.out.println(sum/ages.length);

String[] names = new String[6];
names[0] = "Sam";
names[1] = "Tommy";
names[2] = "Tim";
names[3] = "Sally";
names[4] = "Buck";
names[5] = "Bob";

double Sum = 0.0;	//#2a

for (int i = 0; i < 6; i++) {  
	Sum += names[i].length();
}
System.out.println(Sum/names.length);

for (int i = 0; i < 6; i++) {	//#2b
	System.out.print(names[i] + " ");
	}

int numberOfCharacters = 0;	//#5
int[] nameLengths = new int[6];
for (int i = 0; i < nameLengths.length; i++) {	
	nameLengths[i] = names[i].length();
}

for (int i = 0; i < nameLengths.length; i++) {	//#6
	numberOfCharacters += names[i].length();
}
System.out.println();
System.out.println(numberOfCharacters);

System.out.println(multiplyString("Java",3));	//#7

System.out.println(fullName("Jose", "Corral"));	//#8

System.out.println(soMuch());	//#9

System.out.println(nextAverage());	//#10

System.out.println(compareAverages());	//#11

System.out.println(willBuyDrink(11.50, true));	//#12

System.out.println(robotSays(9,true));	//#13
	}
	public static String multiplyString(String name, int num) {
		String result = "";
		for(int i = 0; i < num; i++) {
			result += name;
		}
		return result;
	}
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
		
	}
	public static boolean soMuch() {	//9
		int[] array = new int[] {10, 20, 30, 40, 50};
		int newSum = 0;
		for(int number: array) {
			newSum += number;
		}
		if (newSum > 100) {
			return true;
		}else {
			return false;
		}
	}
	public static double nextAverage() {	//10
		double[] average = new double[] {20.2, 99.9, 10.0};
		int number = 0;
		for(double decimal: average) {
			number += decimal;
		}
		return number/average.length;
	}
	public static boolean compareAverages() {	//11
		double[] average1 = new double[] {1.1, 2.2, 3.3};
		double[] average2 = new double[] {0.1, 2.3, 4.5};
		int number = 0;
		for(double decimal: average1) {
			number += decimal;	
		}
		double total = number/average1.length;
		
		int number2 = 0;
		for(double decimal: average2) {
			number2 += decimal;
		}
		double total2 = number2/average2.length;
		
		if (total > total2) {
			return true;
		}else {
			return false;
		}
	}
	public static boolean willBuyDrink(double moneyInPocket, boolean isHotOutside) {	//#12
		if(isHotOutside && moneyInPocket > 10.50) {
			return true;
		}else {
			return false;
		}
	}
	public static String robotSays(int groundGrade, boolean nothingBlocks) {	//#13
		if(groundGrade < 5 && nothingBlocks) {	//A robot will say whether the ground is safe 
			return "Go!";						//for traveling.
		}else {									//It will decide based on how steep a hill is
			return "Stop!";						//and if anything blocks the path.
		}
	}
	
}	