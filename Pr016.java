//Знакомство с объектами
class Auto {
	int pass; //Количество пассажиров, сключая водителя
	int V; //Объем бака в литрах
	double trata; //Расход топлива в л/100км
	Auto(){
		pass = 0;
		V = 0;
		trata = 0.0;
	}

	Auto(int p, int v, double r) {
		pass = p;
		V = v;
		trata = r;
	}

	double range() {
		return((double)(V*100))/trata;
	}

	double trataTopl(int km) {
		return (double)km*trata/100;
	}
	int getPass() {
		return pass;
	}
	void setPass(int p) {
		pass = p;
	}

	int getV() {
		return V;
	}

	void setV(int v) {
		V = v;
	}

	double getTrata() {
		return trata;
	}

	void setTrata (double r) {
		trata = r;
	}
}

class Truck extends Auto{
	//Грузоподъемность
	private int cargocap;

	//Конструктор
	Truck(int p, int v, double r, int c) {
		super(p, v, r);
		cargocap = c;
	}
	int getCargo() {
		return cargocap;
	}

	void putCargo(int c) {
		cargocap = c;
	}
}

class Pr016{
	public static void main(String args[]) {
		double range;
		Auto bmw = new Auto();
			
/*		bmw.pass = 5;
		bmw.V = 80;
		bmw.trata = 12.5; */

		System.out.println("\nИнформация о BMW X5");
		System.out.println("Кол-во пасажиров у BMW X5: "+ bmw.getPass());
		System.out.println("Объем бака у BMW X5: "+ bmw.getV());

		range = bmw.range();
		//Вызов метода вычисления хода расстояния внутри метода вывода информации
		System.out.println("Расход топлива у BMW X5: " + bmw.getTrata() + " литров на 100 км пути" + "\nХод на полном баке: "+ bmw.range() + " км");

		//Создание грузовиков
		
		Truck zil = new Truck(2, 170, 25.0, 7);
		Truck kamaz = new Truck (3, 800, 35.0, 8);

		System.out.println("\nИнформация о ЗИЛ 130");
		System.out.println("Кол-во пасажиров у ЗИЛ 130: "+ zil.getPass());
		System.out.println("Объем бака у ЗИЛ 130: "+ zil.getV());
		//Вызов метода вычисления хода расстояния внутри метода вывода информации
		System.out.println("Расход топлива у ЗИЛ 130: " + zil.getTrata() + " литров на 100 км пути" + "\nХод на полном баке: "+ zil.range() + " км");

		System.out.println("Ход на полном баке: " + range + " км");
		System.out.println("ЗИЛ 130 потратит на 100 км: " + zil.trataTopl(100) + " литров топлива");
		System.out.println("Масса груза для ЗИЛ 130" + zil.getCargo() + " тонн");
		
		System.out.println("\n");

		System.out.println("\nИнформация о КАМАЗ 130");
		System.out.println("Кол-во пасажиров у ЗИЛ 130: "+ kamaz.getPass());
		System.out.println("Объем бака у ЗИЛ 130: "+ kamaz.getV());
		//Вызов метода вычисления хода расстояния внутри метода вывода информации
		System.out.println("Расход топлива у ЗИЛ 130: " + kamaz.getTrata() + " литров на 100 км пути" + "\nХод на полном баке: "+ kamaz.range() + " км");

		System.out.println("Ход на полном баке: " + range + " км");
		System.out.println("ЗИЛ 130 потратит на 100 км: " + kamaz.trataTopl(100) + " литров топлива");
		System.out.println("Масса груза для ЗИЛ 130" + kamaz.getCargo() + " тонн");
		
//		int distance = 3350;

/*		//Хранение значений в простых типах переменных
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
                if(x.isFactor(5, 20)) System.out.println ("5 - делитель"); */
	}
}
