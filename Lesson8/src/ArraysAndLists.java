import java.util.*;

public class ArraysAndLists {
	public static void main(String args[]) {
		//START OF ITEMS 1 AND 2 FOR HOMEWORK		
		int[] tenNumbers = new int [] {4,7,-2,-19,0,1,394,23,-239,100};
		int positiveNumbers = 0, negativeNumbers = 0, zeroNumbers = 0, fiveTimesFour = 5;
		ArrayList<String> characters = new ArrayList<String>();
		for (int i=0; i <= 9; i++){
			if (tenNumbers[i] > 0)
				positiveNumbers++;
			if (tenNumbers[i] < 0)
				negativeNumbers++;
			if (tenNumbers[i] == 0)
				zeroNumbers++;
		}
		//System.out.println("p" + positiveNumbers);
		//System.out.println("n" + negativeNumbers);
		//System.out.println("z" + zeroNumbers);
		while (fiveTimesFour < 80){
			fiveTimesFour = fiveTimesFour + 5;
		}
		//System.out.println(fiveTimesFour);
		//END OF ITEMS 1 AND 2 FOR HOMEWORK
		
		//START OF ITEM 3 FOR HOMEWORK
		char[] twentyChars = new char [] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't'};
		List vowels = new ArrayList();
		List consonants = new ArrayList();
		for (int i=0; i <= 19; i++){
			if (twentyChars[i] == 'a' || twentyChars[i] == 'e' || twentyChars[i] == 'o' || twentyChars[i] == 'u')
				vowels.add(twentyChars[i]);
			else
				consonants.add(twentyChars[i]);
		}
		//System.out.println("V" + ' ' + vowels);
		//System.out.println("C" + ' ' + consonants);
		//END OF ITEM 3 FOR HOMEWORK
		
		//9 Stars, 11 percents
		//START OF ITEM 4 FOR HOMEWORK
		//List stars = new ArrayList();
		for (int i=1; i < 10; i++){
			for(int j= 1; j <= i; j++){
				//stars.add("*");
				//System.out.println(stars);
				System.out.println("*");
			}
			System.out.println("");
		}
	}
}