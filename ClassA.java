package P4;

public class ClassA {
void meth1()
{
	System.out.println("have");
}
private void meth1(int x)
{
	System.out.println("a");
}
int  meth1(String s)
{
	System.out.println("great");
	return 10;
}
protected void meth1(int x,String s)
{
	System.out.println("day");
	}
 final void meth1(String s,int x)
{
	System.out.println("my");
}
void meth1(byte b)
{
	System.out.println("lucky");
}
void meth1(String s,byte b)
{
	System.out.println("charm");
}
   static StringBuffer meth1(StringBuffer sb)
{
	System.out.println("hello");
	return sb;
}
ClassA()
{
	this(200);
	System.out.println("morning");
}
ClassA(int x)
{
	System.out.println("good");
}
	public final static void main(int x)
	{
		System.out.println("1st main");
	}
	public static void main()
	{
		System.out.println("2nd main");
	}
	public static void main(String[] args) {
		ClassA aobj=new ClassA();
		aobj.meth1();
		aobj.meth1(10);
		aobj.meth1("shiva");
		aobj.meth1(10,"shiva");
		aobj.meth1("shiva",10);
		aobj.meth1((byte)10);
		aobj.meth1("shiva",(byte)10);
		meth1(new StringBuffer("shiva"));//staic method we can call identifier name,class name,class object
		main();
		main(10);
	}
}


