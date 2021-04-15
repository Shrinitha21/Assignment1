package testcase;
import java.util.Random;

public class Ass2P2 {
	public static void main(String args[])
	{
		Random rd = new Random();
		int a[] = new int[100];
		for(int i=0;i<a.length;i++) {
			a[i]= rd.nextInt();
			System.out.println(a[i]);
		}
	}

}
