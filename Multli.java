package guvi;
import java.util.Scanner;
public class Multli {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int i,temp=0;
		System.out.println("enter the value of n");
		int n=s.nextInt();
		for(i=0;i<=n;i++)
		{
			temp=i*num;
			System.out.println(""+i+"*"+num+"="+temp);
			
		}

	}

}
