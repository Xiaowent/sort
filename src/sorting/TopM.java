package sorting;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import entity.Binarytree;
import entity.data_with_key;

public class TopM {
	private Binarytree parent;
	private int size;
	public void show()
	{
		show(this.parent);
	}
	private void show(Binarytree current_parent)
	{
		if(current_parent.getleft()==null)
		{
			//System.out.println(current_parent.getdata() +"    "+ current_parent.getkey());
		}
		else
		{
			show(current_parent.getleft());
		}
		System.out.println(current_parent.getdata() +"    "+ current_parent.getkey());
		if(current_parent.getright()!=null)
		{
			show(current_parent.getright());
		}
		return ;
	}
	public void insert(Binarytree node)
	{
		if(parent == null)
		{
			Binarytree node_temp =new Binarytree(node.getdata(),node.getkey(),null,null);
			parent = node_temp;
			size=1;
		}
		else 
		{
			Binarytree current_parent = parent;
			while(true)
			{
				if(node.getkey()<=current_parent.getkey())
				{
					if(current_parent.getleft()==null)
					{
						current_parent.setleft(node);
						break;
					}
					else
					{
						current_parent=current_parent.getleft();
					}
				}
				if(node.getkey()> current_parent.getkey())
				{
					if(current_parent.getright()==null)
					{
						current_parent.setright(node);
						break;
					}
					else
					{
						current_parent=current_parent.getright();
					}
				}
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		//List<data_with_key> list = new ArrayList <data_with_key>();
		TopM test = new TopM();
		for(int i=0;i<10;i++)
		{
			char[] a = in.next().toCharArray(); 
			data_with_key s = new data_with_key(a[0],in.nextInt());
			Binarytree node = new Binarytree(s.getdata(),s.getkey(),null,null);
			test.insert(node);
		}
		test.show();
		in.close();
	}

}
