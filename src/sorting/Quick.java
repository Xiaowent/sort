package sorting;

import java.util.Scanner;

import edu.princeton.cs.algs4.MaxPQ;

public class Quick {
	public static void sort(int []a)
	{
		sort(a,0,a.length-1);
	}
	private static void sort (int []a, int lo, int hi) 
	{
		if(hi <= lo) return;
		int j= partition(a, lo, hi);
		sort(a, lo,j-1);
		sort(a,j+1,hi);
	}
	private static int partition(int []a, int lo, int hi)
	{
		int i = lo, j = hi + 1;
		int v=a[lo];
		while(true)
		{
			while(less(a[++i],v)) 
			{
				if (i == hi)
					break;
				System.out.println("first"+i+" "+v);
			}
			while(less(v,a[--j]))
			{
				if(j == lo)
					break;
				System.out.println("second"+j+" "+v);
			}
			if(i >= j) 
			{
				show(a);
				System.out.println("out"+i+" "+j);
				break;
			}
			System.out.println("exch"+i+" "+j);
			exch(a,i,j);
			show(a);
		}
		exch(a,lo,j);
		return j;
		
	}
	private static void exch(int []a, int i,int j)
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
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int[] s = new int [] {4,2,6,5,9,7,8,10,3,1};
		show (s);
		sort (s);
		show (s);
		
	}

}
