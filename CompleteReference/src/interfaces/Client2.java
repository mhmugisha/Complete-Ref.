package interfaces;

public class Client2 implements CallBack {
	
	public void callback(int p) {
		System.out.println("Another version of callback");
		System.out.println(p + " squared is:" + (p*p));
	}

}
