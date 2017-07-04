package guvi;
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 int num=s.nextInt();
	 System.out.println("enter the value of n");
	 int n=s.nextInt();
	 double temp=0;
	 temp=Math.pow(num,n);
	 System.out.println(""+temp);

	}

}
