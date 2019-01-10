package entity;

public class data_with_key {
	private  char data =' ';
	private  int key = 0;
	public data_with_key( char data, int key)
	{
		this.data=data;
		this.key=key;
	}
	
	public void setkey(int value)
	{
		this.key = value;
	}
	public void setdata(char value)
	{
		
		this.data=value; 
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
