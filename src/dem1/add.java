package dem1;

public class add {
	public int add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
		return c;
	}
	public static void main(String[] args) {
		add l=new add();
		int k=l.add(12, 34);	
	}

}
