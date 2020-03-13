package core.practical.cases;

import core.util.InputHandler;

public class FibonacciGenerator {
	static void fiboGenarator(long limit) {
		int n1 = 0, n2 = 1, n3, i;
		System.out.print(n1 + " " + n2);
		
		for (i = 2; i < limit; ++i)
		{
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}

	public static void main(String[] args) {
		long input = InputHandler.getInput();
		fiboGenarator(input);
	}

}
