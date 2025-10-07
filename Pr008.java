//Знакомство с объектами
class Auto {
	int pass; //Количество пассажиров, сключая водителя
	int V; //Объем бака в литрах
	double trata; //Расход топлива в л/100км
		      //Метод вычисления расстояния хода на полном баке
	double range() {
		return ((double)(V*100))/trata;	
	}
}
class CheckNum {
	boolean isEven(int x) {
		if((x%2) == 0) return true;
		else return false;
	}
}
class IsFact {
	boolean isFactor(int a, int b) {
		if((b%a) == 0) return true;
		else return false;
	}
}
class Pr008{
	public static void main(String args[]) {
		double range;
		Auto bmw = new Auto();
		bmw.pass = 5;
		bmw.V = 80;
		bmw.trata = 12.5;

		System.out.println("\nИнформация о BMW X5");
		System.out.println("Кол-во пасажиров у BMW X5: "+ bmw.pass);
		System.out.println("Объем бака у BMW X5: "+ bmw.V);
		//Вызов метода вычисления хода расстояния внутри метода вывода информации
		System.out.println("Расход топлива у BMW X5: " + bmw.trata + " литров на 100 км пути" + "\nХод на полном баке: "+ bmw.range() + " км");

/*		range = ((double)100*bmw.V)/bmw.trata;
		range = bmw.range();
		System.out.println("Ход на полном баке: " + range + " км"); */

		System.out.println();

		Auto merc = new Auto();
		merc.pass = 2;
		merc.V = 60;
		merc.trata = 7.8;
		System.out.println("\nИнформация о Mercedes SLC 43");
		System.out.println("Кол-во пасажиров у Mercedes SLC: "+ merc.pass);
		System.out.println("Объем бака у Mercedes SLC: "+ merc.V);
		System.out.println("Расход топлива у Mercedes SLC: " + merc.trata + " литров на 100 км пути" + "\nХод на полном баке: " + merc.range() + " км");

/*		range = ((double)100*merc.V)/merc.trata;
		range = merc.range();
		System.out.println("Ход на полном баке: " + range + " км"); */

		//Хранение значений в простых типах переменных
		//Операции присваивания для объектных переменных означают копирование ссылки на объект, 
		//а не всех значений объекта
		int p1 = 50, p2 = 75;
		p1 = p2;
		p2 = 100;
		System.out.println("Значения p1 и p2: " + p1 + " " + p2);

		//Хранение значений в объектных типах
		Auto bmw1, bmw2;
		bmw1 = bmw;
		bmw2 = merc;
		bmw1.trata = 14.5;
		System.out.println("Расход для bmw и bmw1: " + bmw.trata + " " + bmw1.trata);
		bmw2.trata = 9.99;
		System.out.println("Расход для bmw2 и merc: " + bmw2.trata + " " + merc.trata);

		//Использование параметров для нескольких классов

		CheckNum e = new CheckNum();
		if(e.isEven(10)) System.out.println("10 - четное");
		if(e.isEven(5)) System.out.println("5 - четное");
		if(e.isEven(4)) System.out.println("4 - четное");

		//Вызов метода с двумя параметрами
		
		IsFact x = new IsFact();
		if(x.isFactor(2, 20)) System.out.println ("2 - делитель"); 
		if(x.isFactor(3, 20)) System.out.println ("3 - делитель");
		if(x.isFactor(6, 20)) System.out.println ("6 - делитель");
                if(x.isFactor(5, 20)) System.out.println ("5 - делитель");
	}
}
