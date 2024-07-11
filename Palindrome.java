
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
  public static void main(String[] args) {

    System.out.print("Your word: ");
    Scanner input = new Scanner(System.in);
    String word = input.nextLine();

    
    Stack<Character> stack = new Stack<>();
   
    int spaces = 0;
    

    for(int i = 0; i < word.length(); i++) {
      if(word.charAt(i) == ' ') {
        spaces++;
      }
    }

    char[] characters = new char[word.length() - spaces];
    int increment = 0;

    for(int i = 0; i < word.length(); i++) {
      if(word.charAt(i) != ' ') {
        characters[increment] = Character.toLowerCase(word.charAt(i));
        increment++;
      }
    }

    String word2 = new String(characters); 

   
		for (int i = 0; i < word2.length(); i++) {
			stack.push(word2.charAt(i));
		}

		String reverseWord2 = "";


		while (!stack.isEmpty()) {
			reverseWord2 = reverseWord2 + stack.pop();
		}


		if (word2.equals(reverseWord2)) {
			System.out.printf("%s is a palindrome.", word);
		} else {
			System.out.printf("%s is not a palindrome.", word);
		}


}
}
