public class OneOfEach {
	public static void main (String[] args) {
		double birth = Math.random();
		boolean girlBorn = false;
		boolean boyBorn = false;
		int childCounter = 0;
			while (boyBorn == false || girlBorn == false){
				if (birth < 0.5){
					System.out.print("g "); 
					girlBorn = true; 
					birth = Math.random();
					childCounter++;
				}
				else {
					System.out.print("b "); 
					boyBorn = true; 
					birth = Math.random();
					childCounter++;
				}
			}
			System.out.println("");
			System.out.print("You made it... and you now have " + childCounter + " children.");
	}
}