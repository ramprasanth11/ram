package guvi;
import java.util.Scanner;
public class Alphabet {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char ch=s.next().charAt(0);
		if((ch>=65&&ch<=90)||(ch>=97&&ch<=122))
		{
			System.out.println("it is an alphabet");
		}
		else
		{
			System.out.println("it is not an alphabet");
		}

	}

}
