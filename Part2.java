import java.util.Scanner;

public class Part2 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("What grade did the student get on the test?");
 
		String grade = input.next();
		
		switch (grade) {
		case "A":
			System.out.println("Student test score range 90 - 100");
			break;
		case "B":
			System.out.println("Student test score range 80 - 89");
			break;
		case "C":
			System.out.println("Student test score range 70 - 79");
			break;
		case "D":
			System.out.println("Student test score range 60 - 69");
			break;
		case "F":
			System.out.println("Student test score range 0 - 59");
			break;
		}
	}
}

		
		
		
		
		
		
		
		
		
		
		
		

