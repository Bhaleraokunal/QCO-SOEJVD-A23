package selectClass;

class B {
	void display() {
		System.out.println("Good Morning");
	}
}
class C extends B {

	void display() {
		System.out.println("Hello");
	}
	
}

public class A{
	public static  void main(String[] args) {
		
		B b1 = new C();
		
		b1.display();
	}
}


