public class Perfect {
	public static void main (String[] args) {
		int input = Integer.parseInt(args[0]);
		int checker = 0;
		int start = 1;
		int notLastDivisor = 0;
		while (start < input){
			int divisor = input % start;
			if (divisor == 0) {
				notLastDivisor = start;
				checker = checker + start; 
				start++;}
			else {start++;}
			} 
		if (checker == input){
			System.out.print(input + " is a perfect number since " + input + " = 1 + ");
			start = 2;
			while (start < input){
				if (start < input && input%start == 0 && start != notLastDivisor){
					System.out.print(start + " + ");
					start++;
				}else if (start == notLastDivisor) {System.out.print(start); start++;}
				else{start++;}
			}
		} else {System.out.print(input + " is not a perfect number");}
	}
}
