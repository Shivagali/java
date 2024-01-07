package P4;

public class ClassG extends ClassB {
	void display()
	{
		System.out.println("HI");
		super.meth4();
	}
	static int show(int a)
	{
		System.out.println(a+a);//50+50=100 a=50,a=100
		return a+a++;
	}
	ClassG()
	{
		this(show(50));//this(100);
		for(int i=1;true;i++)
		{
			super.meth4();
			break;
			
		}
		System.out.println("HELLO");
		System.out.println(show(50));
	}
	ClassG(int a)
	{
		System.out.println("==>"+(a+++show(50)));//100+100=200
	}
	public static void main(String[] args) {
		new ClassG().display();
	}
		
		
	}


