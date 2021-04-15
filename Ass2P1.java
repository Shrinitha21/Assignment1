package testcase;
import java.util.Scanner;

public class Ass2P1 {
	
	public static void main(String[] args) {
		int n;
		int[] a = new int[10];
		int search;

		System.out.println("Enter the number of elements in the array");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++)
		{
			a[i]= sc.nextInt();
		}
		System.out.println("Enter the element to be searched");
		search = sc.nextInt();
	    boolean found =false;
	
		for(int i=0;i<n;i++)
		{
			if(a[i]==search) {
				found = true;
				break;
			}
			
		}
		
		if(found){
			System.out.println("Searching element is  present in the arra");}
		else {
			System.out.println("Searching element is not  present in the array");}
	}
	}


