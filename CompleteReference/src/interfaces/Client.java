package interfaces;

public class Client implements CallBack {
	
	@Override
	public void callback(int p) {
		System.out.println("Method callback called with," + p);
	}
	
	//Method in class Client not in interface.
	void nonInterfaceMethod() {
		System.out.println("I am in class Client but not in interface!");
	}

}
