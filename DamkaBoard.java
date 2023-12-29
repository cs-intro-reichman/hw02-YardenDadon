public class DamkaBoard {
	public static void main(String[] args) {
		int input = Integer.parseInt(args[0]);
		int verticalCounter = 1;
		int horizontalCounter = 0;
	 	int evenChecker = 1;
 		while (horizontalCounter < input){
			while (verticalCounter <= input){
				System.out.print("* ");
				verticalCounter++;
			}
			horizontalCounter++;
			if (evenChecker % 2 == 0){
			System.out.println("");
			evenChecker++;
			}else {
				System.out.println("");
				System.out.print(" ");
			evenChecker++;}
			verticalCounter = 1;
		}
	}
}

	

