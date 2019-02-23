import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the expected string: ");
		String str=new String(s.next());
		
		System.out.println("enter the receceived string");
		String str1=new String(s.next());
		
		char[] ch=new char[str.length()];
		char[] ch1=new char[str1.length()];
		int count=0;
		if((ch.length%3==0)&&(ch1.length%3==0))
		{
		for(int i=0;i<str.length();i++)
		{

			if((((byte)ch[i])-(byte)ch1[i])!=0)
			{
				count++;
				
			}
			System.out.println(count);
		}	
	}
	else
	{
		System.out.println("size of strings must be equal");
		
	}	
		
	}

}
