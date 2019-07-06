package dem1;

public class add {
	public int add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
		return c;
	}
	public String name(String name) {
		System.out.println(name);
		return name;
	}
	public static void main(String[] args) {
		add l=new add();
		int k=l.add(12, 34);	
		System.out.println("the value is "+k);
		String g=l.name("raghu");
	}

}
