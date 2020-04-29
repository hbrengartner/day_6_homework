import java.util.Scanner;

public class Part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner grade = new Scanner(System.in);
		
		System.out.println("What grade did the student get on the test?");
		
		double letterGrade = grade.nextDouble();
		
		if(letterGrade >= 90) {
			System.out.println("A");
		}
		else if(letterGrade >= 80 && letterGrade <= 89.99) {
			System.out.println("B");
		}
		else if(letterGrade >= 70 && letterGrade <= 79.99) {
			System.out.println("C");
		}
		else if(letterGrade >= 60 && letterGrade <= 69.99) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}

	}

}
