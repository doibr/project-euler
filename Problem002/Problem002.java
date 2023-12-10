import java.util.ArrayList;

class Problem002 {
	public static void main(String[] args) {
		ArrayList<Integer> fib = new ArrayList<>();
		fib.add(1);
		fib.add(2);

		while (fib.get(fib.size() - 1) + fib.get(fib.size() - 2) < 4000000) {
			fib.add(fib.get(fib.size() - 1) + fib.get(fib.size() -2));			
		}

		int sum = 0;
		for (int i = 0; i < fib.size(); i++) {
			if (fib.get(i) % 2 == 0) {
				sum += fib.get(i);
			}
		}

		System.out.println(sum);
	} 
}
