package bean;

public class C extends B{
	static{
		System.out.println("CS1");
	}

	{
		System.out.println("CL1");
	}
	
	public C() {
		super();
		System.out.println("C ()");
	}
	
	public C(String c) {
		super();
		System.out.println("C" + "(String c)"); 
	}
	
	public C(Object obj) {
		this("a");
	}
}
