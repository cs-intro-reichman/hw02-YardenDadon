public class InOrder {
	public static void main (String[] args) {
		int random1 = (int)(Math.random() * 10);
		int random2 = (int)(Math.random() * 10);
		System.out.print(random1 + " ");
		while (random2 > random1){
			System.out.print(random2 + " ");
			random1 = random2;
			random2 = (int)(Math.random() * 10);
		}
	}
}
