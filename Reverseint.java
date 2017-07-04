package guvi;
import java.util.Scanner;
public class Reverseint {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int temp,rev=0;
		while(num>0)
		{
			temp=num%10;
			num=num/10;
			rev=rev*10+temp;
		}
		System.out.println(""+rev);

	}

}
