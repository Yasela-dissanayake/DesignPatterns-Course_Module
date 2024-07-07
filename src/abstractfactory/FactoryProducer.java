package abstractfactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String factory) {
		if(factory.equalsIgnoreCase("Color")) {
			return new ColorFactory();
		}else if(factory.equalsIgnoreCase("Shape"))
			return new ShapeFactory();
		return null;
	}
}
