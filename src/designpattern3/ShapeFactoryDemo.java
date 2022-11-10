package designpattern3;

import designpattern3.interfaces.Shape;

public class ShapeFactoryDemo {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = ShapeFactory.instance();
		
		Shape circle = shapeFactory.createShape(ShapeType.CIRCLE);
		circle.draw();
		
		Shape square = shapeFactory.createShape(ShapeType.SQUARE);
		square.draw();
		
		Shape rectangle = shapeFactory.createShape(ShapeType.RECTANGLE);
		rectangle.draw();
		
	}

}
