package lab2;

import java.util.*;

public class Excersise3 {
	public void getSorted(int arr[], int n)
	{
		int arr1[]=new int[n];
		int j=n;
		for(int i=0;i<n;i++)
		{
			arr1[j-1]=arr[i];
			j=j-1;
		}
		System.out.println("Reversed Array");
		for(int k:arr1)
		{
			System.out.println(k+" ");
		}
		
		Arrays.sort(arr1);
		System.out.println("Sorted Array");
		for(int x:arr1)
		{
			System.out.println(x+" ");
		}
		
			
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array ");
		int num=sc.nextInt();
		int ar[]=new int[num];
		System.out.println("Enter the Elements");
		for(int y=0;y<num;y++)
		{
			ar[y]=sc.nextInt();
		}
		
		Excersise3 obj=new Excersise3();
		obj.getSorted(ar, num);
				
		
	}

}
