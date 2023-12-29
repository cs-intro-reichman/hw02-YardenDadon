public class Divisors {
	public static void main(String[] args) {
        int input = Integer.parseInt(args[0]);
		int start = 1;
		while (start <= input){
			if (input%start == 0){
				System.out.println(start);
				start++;
			}else {
				start++;
			}
		}
	}
}
