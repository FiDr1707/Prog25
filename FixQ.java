class FixQ implements ICharQ {
	private char[] q;
	private int putloc, getloc;

	public FixQ(int size) {
		q = new char[size];
		putloc = getloc = 0;
	}

	//Реализуем методы интерфейса ICharQ
	public void put (char ch) {
		if (putloc==q.length) {
			System.out.println(" - очередь переполнена");
			return;
		}

		q[putloc++] = ch;
	}

	//Извлечение
	
	public char get() {
		if(getloc==putloc) {
			System.out.println(" - очередь пуста");
			return(char) 0;
		}
		return q[getloc++];
	}
}
