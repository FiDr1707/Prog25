//Суперкласс (родительский для всех подклассов двумерных фигур)
class TwoDShape {
	private double width;
	private double height;
	private String color;
	private double line;

	TwoDShape(double w, double h, String c, double l) {
		if (w < 22)
			width = w;
		else
			System.out.println("Ширина не должна превышать 21 см");
		height = h;
		color = c;
		line = l;
	}
//Методы доступа к закрытым переменным экземпляра
	double getWidth() {
		return width;
	}
	double getHeight() {
		return height;
	}
	void setWidth(double w) {
		if (w < 21)
			width = w;
		else 
			System.out.println("Ширина фигуры должна быть меньше 21 см");
	}

	void setHeight(double h) {
		if (h < 29)
			height = h;
		else 
			System.out.println("Высота фигуры должна быть меньше 29 см");
	}

	void showDim() {
		System.out.println("Ширина двумерной фигуры: " + width + "\nВысота двумерной фигуры: " + height);
	}

	String getColor() {
		System.out.println("Цвет двумерной фигуры: " + color + "\nТолщина обводки: " + line);
		return color;
	}

	void setColor(String c) {
		color = c;
	}

/*	void getLine() {
		return line;
	}			*/
	void setLine(double l) {
		if (l < 20)
			line = l;
		else
			System.out.println("Слишком жирная линия");
	}
}
//Подкласс TwoDShape (дочерний класс) для описания треугольников
class Triangle extends TwoDShape {
	String style;

	Triangle(String s, double w, double h, String c, double l) {
		super(w, h, c, l);
		style = s;
	}

	double area() {
		return getWidth() * getHeight() / 2;
	}
	void showStyle() {
		System.out.println("Стиль треугольника: " + style);
	}
}
//Подкласс суперкласса TwoShape для описания прямоугольников
class Rectangle extends TwoDShape {
	Rectangle(double w, double h, String c, double l){
		super(w, h, c, l);
	}
	//Метод, проверяющий, является ли прямоугольник квадратом
	boolean isSquare() {
		if (getWidth() == getHeight()) return true;
		return false;
	}
	double area() {
		return getWidth() * getHeight();
	}
	//Подкласс не имеет доступа к закрытым переменным суперкласса
	/*
	String getColor() {
		System.out.println("Цвет двумерной фигуры: " + color);
		return color;
	}*/

}
class Pr015 {
	public static void main (String[] args) {
		//Демонстрация создания треугольников и двумерных фигур
		Triangle t1 = new Triangle("Пунктирный", 5.1, 4.3, "Зеленый", 2.0);
		Triangle t2 = new Triangle("Сплошной", 7.1, 3.3, "Красный", 1.5);

		
/*		t2.setWidth(7.1);
		t2.setHeight(3.3);
		t2.style = "Сплошной";
*/

		TwoDShape s1 = new TwoDShape(10.0, 6.2, "Желтый", 2);
/*		s1.setWidth(10.0);
		s1.setHeight(6.2);
*/
		System.out.println("Информация об объекте t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("Площадь: " + t1.area());
		System.out.println();
		

		System.out.println("Информация об объекте t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("Площадь: " + t2.area());
		System.out.println();
		String str = t2.getColor();
		
		//Родительский ласс не имеет доступа к переменным, определенным в подклассе
		//s1.style = "Абстрактная фигура"; Родительский класс не может инициализировать переменную подкласса
		System.out.println("Информация об объекте s1: ");
		//Родительский класс не имеет доступа к методам своего подкласса
		//s1.showStyle(); метод подкласса неприменим к s1
		s1.showDim();
		//System.out.println("Площадь: " + s1.area()); Вызов метода подкласса неприменим к s1
		System.out.println();

		Rectangle r1 = new Rectangle(35.1, 4.3, "Синий", 1.5);
/*		r1.setWidth(5.1);
		r1.setHeight(4.3);
*/		
		System.out.println("Информация об объекте t1: ");
		t1.showDim();
		System.out.println("Площадь: " + t1.area());
		System.out.println("r1 является квадратом: " + r1.isSquare());
		System.out.println();
//		System.out.println("Толщина линии обводки: " + t1.line());
	}
}
