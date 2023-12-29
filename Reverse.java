/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String word = args[0];
		int letter = word.length() - 1;
		while (word.charAt(letter)>0){
			if (word.charAt(letter)>0){
				System.out.print(word.charAt(letter));
				letter--;
			}else {letter--;};
			if (letter < 0) {
				System.out.println(""); 
				break;}
		}
		letter = word.length() - 1;
		System.out.println("The middle character is " + word.charAt(letter/2));
	}
}
