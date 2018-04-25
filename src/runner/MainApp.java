package runner;

import bean.B;
import bean.C;

public class MainApp {

	static {
		System.out.println("MainApp Static");
	}

	public static void main(String[] args) {

		new C(new B());
		new C();
		new C();

	}
}
