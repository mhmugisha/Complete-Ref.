package interfaces;

public class TestInterface {

	public static void main(String[] args) {
		CallBack c = new Client();

		// call method callback on object c.
		c.callback(42);

		Client2 obj = new Client2();
		c = obj;
		//Call method callback on object c again. 
		c.callback(42);
	}

}
