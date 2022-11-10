package designpattern3;

import designpattern3.interfaces.Shape;
import designpattern3.shapes.Circle;
import designpattern3.shapes.Rectangle;
import designpattern3.shapes.Square;

public class ShapeFactory {
	private static ShapeFactory INSTANCE;

	public static ShapeFactory instance() {
		if (INSTANCE == null) {
			INSTANCE = new ShapeFactory();
		}
		return INSTANCE;
	}

	private ShapeFactory() {
	}

	public Shape createShape(ShapeType type) {
		Shape shape = null;
		switch (type) {
		case CIRCLE:
			shape = new Circle();
			break;
		case SQUARE:
			shape = new Square();
			break;
		case RECTANGLE:
			shape = new Rectangle();
			break;
		}
		return shape;
	}
}
