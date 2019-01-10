package entity;

public class Binarytree {
	private Binarytree rightchild, leftchild;
	private char data;
	private int key;
    public Binarytree( char data,int key, Binarytree leftChild, Binarytree rightChild) {
        this.data = data;
        this.key = key;
        this.leftchild = leftChild;
        this.rightchild = rightChild;
    }
    public void setleft (Binarytree node)
    {
    	this.leftchild = node;
    }
    public void setright (Binarytree node)
    {
    	this.rightchild = node;
    }
	public Binarytree getleft()
	{
		return this.leftchild;
	}
	public Binarytree getright()
	{
		return this.rightchild;
	}
	public int getkey()
	{
		return this.key;
	}
	public char getdata()
	{
		return this.data;
	}

}
