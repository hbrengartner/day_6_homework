public class Part3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println("Welcome to the amusement park! What is your age and weight?");

	
	int weight = 100;
	int age = 14;
	
	if(weight >= 100) {
		if(age >=18) {
		System.out.println("You can ride the ride");
		}
		else if(age <18 && age >=16) {
		System.out.println("Let me call my supervisor");
		}
		else {
			System.out.print("Where are your parents?");
		}
	}
	else {
		System.out.println("I think you are lost");
	}
}
	}
