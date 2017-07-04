package guvi;
import java.util.Scanner;
public class Day {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String day=s.nextLine();
		if(day=="monday"||day=="tuesday"||day=="wednesday"||day=="thursday"||day=="friday")
		{
			System.out.println("working day");
		}
		else 
		{
			System.out.println("holiday");
		}

	}

}
