package basics;

public class B {
public static void main(String[] args) {
	A a1=new A(10);
//	System.out.println(a1.getI());
	A a2=new A(30);
	a1.setI(20);
	System.out.println(a2.getI());
	a2.setI(10);
}
}
