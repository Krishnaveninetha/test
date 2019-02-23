import java.util.Scanner;

public class Exam1 {
	

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the positions: ");
		int c1=s.nextInt();
		int c2=s.nextInt();
		int m=s.nextInt();
		int d1=c1-m;
		int d2=c2-m;
		if(Math.abs(d1)>Math.abs(d2))
		{
			System.out.println("cat 1 reaches mouse first");
				}
		
	}

}
