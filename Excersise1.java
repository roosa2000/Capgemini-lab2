package lab2;
import java.util.*;
public class Excersise1 {
	
	public void getSecondSmallest(int arr[]) 
	{
		Arrays.sort(arr);
		System.out.println("The Second Smallest number in the array is : "+arr[1]);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array: ");
		int n=sc.nextInt();
		int arr1[]=new int[n];
		System.out.println("Enter the items for the array");
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		Excersise1 obj=new Excersise1();
		obj.getSecondSmallest(arr1);

	}

}
