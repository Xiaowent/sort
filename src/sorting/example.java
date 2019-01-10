package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class example {
	public static void sort (int [] a)
	{
		/*int N = a.length;  // insert sorting
		for(int i = 1; i < N ;i++)
		{
			for(int j= i ; j > 0 && less(a[j],a[j-1]); j--)
			{
				exch(a,j,j-1);
				show(a);
			}
		}*/
		
		int N = a.length;
		int h = 1;
		while (h < N/3)
			h = 3 * h + 1;
		while (h >= 1)
		{
			for(int i = h; i < N; i++)
			{
				for(int j = i; j >= h && less(a[j],a[j-h]); j=j-h)
				{
					exch(a,j,j-h);
					show(a);
					int []z= {h,h};
					show(z);
				}
			}
			h = h / 3;
		}
		
	}
	public static void merge(int []a, int lo, int mid, int hi)
	{
		int i = lo;
		int j = mid + 1;
		int []aux = new int [hi];
		for (int k = lo; k <= hi; k++)
		{
			aux[k] = a[k];
		}
		for(int k = lo; k <= hi;k++)
		{
			if(i > mid)
				a[k]=aux[j++];
			else if(j > hi)
				a[k]=aux[i++];
			else if(less(aux[j], aux[i]))
				a[k]=aux[j++];
			else
				a[k]=aux[i++];
		}
	}
	public static void exch(int []a, int i,int j)
	{
		int temp = a[i];
		a[i]=a[j];
		a[j]=temp;
		
	}
	private static boolean less (int v, int w)
	{
		if (v < w)
			return true;
		return false;
	}
	private static void show(int[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	private static boolean isSorted (int []a)
	{
		for(int i = 1; i < a.length ; i++)
		{
			if(less(a[i],a[i-1])) return false;
		}
		return true;
	}
	
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);
		int[] s = new int [10];
		for(int i=0;i<10;i++)
		{
			s[i]=in.nextInt();
		}
		show (s);
		sort (s);
		assert isSorted(s);
		show (s);
		
	}
}
