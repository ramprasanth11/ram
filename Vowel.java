package guvi;
import java.util.Scanner;
public class Vowel {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    char a=s.next().charAt(0);
	    if(a=='i'||a=='o'||a=='u'||a=='a'||a=='e'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U'){
	    	System.out.println("it is vowel");
	    }
	    else
	    {
	    	System.out.println("it is consonant");
	    }

	}

}
