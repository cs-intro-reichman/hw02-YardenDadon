public class OneOfEachStats1 {
	public static void main (String[] args) {
		int input = Integer.parseInt(args[0]);
		
		double birth = Math.random();
		boolean girlBorn = false;
		boolean boyBorn = false;
		int childCounter = 0;
		int girlCounter = 0;
		int boyCounter = 0;
		double twoKids = 0;
		double threeKids = 0;
		double manyKids = 0;
		for (int inputCounter = 0; inputCounter < input; inputCounter++){
			while (boyBorn == false || girlBorn == false){
				if (birth < 0.5){
					girlBorn = true; 
					birth = Math.random();
					childCounter++;
					girlCounter++;
				} else {
					boyBorn = true; 
					birth = Math.random();
					childCounter++;
					boyCounter++;
				} 
			}
			if (boyCounter + girlCounter == 2) {twoKids++;}
			if (boyCounter + girlCounter == 3) {threeKids++;}
			if (boyCounter + girlCounter > 3) {manyKids++;}
			boyCounter = 0;
			girlCounter = 0;
			boyBorn = false;
			girlBorn = false;
		}
		double average = (twoKids + threeKids + manyKids) / 3;
		System.out.println("Average: " + average + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + (int)twoKids);
		System.out.println("Number of families with 3 children: " + (int)threeKids);
		System.out.println("Number of families with 4 or more children: " + (int)manyKids);
		double mode;
		if (twoKids > threeKids && twoKids > manyKids){mode = (int)twoKids;}
		else if (threeKids > twoKids && threeKids > manyKids){mode = (int)threeKids;}
		else {mode = (int)manyKids;};

		System.out.println("The most common number of children is " + (int)mode);
	}
}
