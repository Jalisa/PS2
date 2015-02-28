package MainPackage;

//Jalisa Hewitt

public class MyInteger {
	private int value;

	// MyInteger object has a specified value
	public MyInteger(int a) {
		this.value = a;
	}

	// Get method will return the value
	public int GetValue() {
		return value;
	}

	// Even method returns false if not divisible by 2
	public boolean isEven() {
		return (GetValue() % 2 == 0);
	}

	// Odd method returns false if divisible by 2
	public boolean isOdd() {
		return (GetValue() % 2 == 1);
	}

	public boolean isPrime() {
		for (int P = 2; P <= this.GetValue(); P++) {
			if ((GetValue() % P) == 0) {
				return false;
			}
		}
		return true;
	}

	// Same even method as previous code but with parameter d
	public static boolean isEven(int d) {
		return (d % 2 != 0);
	}
	// Same odd method as previous code but with parameter d
	public static boolean isOdd(int d) {
		return (d % 2 == 0);
	}

	// Same prime method as previous code but with parameter d
	public static boolean isPrime(int d) {
		for (int P = 2; P < d; P++) {
			if (d % P == 0) {
				return false;
			}
		}
		return true;
	}

	// Even method now takes in a value from MyInteger object
	public static boolean isEven(MyInteger b) {
		return (b.GetValue() % 2 == 0);
	}

	// Odd Method now takes a value from MyInteger object
	public static boolean isOdd(MyInteger b) {
		return (b.GetValue() % 2 == 1);
	}

	// Prime method now takes in a value from MyInteger object
	public static boolean isPrime(MyInteger b) {
		for (int P = 2; P < b.GetValue(); P++) {
			if (b.GetValue() % P == 0) {
				return false;
			}
		}
		return true;
	}

	// Equals method compares parameter c to value from get method
	public boolean equals(int c) {
		return (c == this.GetValue());
	}

	// Equals method compares value from MyInteger object to value from get
	// method
	public boolean equals(MyInteger b) {
		return (b.GetValue() == this.GetValue());
	}

	public static int parseInt(char[] array) {
		int C = Integer.parseInt(new String(array));
		return C;
	}

	public static int parseInt(String s) {
		// Returns value of string
		return Integer.parseInt(s);
	}
}
