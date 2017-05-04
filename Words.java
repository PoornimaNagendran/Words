package Guvi;
import java.util.Scanner;
public class Words {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Number of words in line");
System.out.println("Enter the line");
String a=s.nextLine();
String[] b=a.split(" ");
System.out.println("Count is "+b.length);
	}

}
