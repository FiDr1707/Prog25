class Pr005 {

//составные операторы присваивания

	public static void main (String args[]) {
		//Для арифметических операций: 
		//+=	-=	*=	/=
		int x = 0;
		x = x + 5;
		x += 5;
		x = x - 10;
		x -= 10;
		//Для логических операций:
		//&=	|=	^=
		
//Преобразование типов при присваивании
		int i;
		float f;

		i = 10;
		f = i;
		System.out.println("i = " +  i + " f = " + f);
		//Автоматическое преобразование типов выполняется если:
		//целевой тип совместим с типом значения, которое ему присваивается
		//целевой тип поддерживает более широкий диапазон допустимых значений

		long L;
		double D;

		L = 123456789123456789L;
		D = L;
		System.out.println("L = " + L + "D = " + D);

		//Пример недопустимого автоматического преобразования типов:
		
		//"Ручное" приведение одного типа к другому
		D = 123456789123456789.0;
		L = (long)D;
		System.out.println("L = " + L + "D = " + D);

		System.out.println("");
		byte byte1 = 125;
		char ch;
		ch = (char) byte1;
		System.out.println("ch: " + ch);

		int integer1 = 1095;
		ch = (char) integer1;
		System.out.println("ch: " + ch);

		ch = 'Ю';
		integer1 = (int) ch;
		System.out.println("integer1: " + integer1);
		
		D = (double) ch;	

			
	}
}
