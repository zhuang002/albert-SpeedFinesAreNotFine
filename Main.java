import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		int actual = sc.nextInt();
		int overspeed = actual-limit;
		
		if (overspeed<=0) {
			System.out.println("Congratulations, you are within the speed limit!");
		} else if (overspeed<=20) {
			System.out.println("You are speeding and your fine is $" + 100+ ".");
		} else if (overspeed<=30) {
			System.out.println("You are speeding and your fine is $" + 270+ ".");
		} else {
			System.out.println("You are speeding and your fine is $" + 500+ ".");
		}
	}

}
