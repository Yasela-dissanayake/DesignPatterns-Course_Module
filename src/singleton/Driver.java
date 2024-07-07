package singleton;

public class Driver {

	public static void main(String[] args) {
		SingletonObject object = SingletonObject.getInstance();
		object.showMessage();

	}

}
