import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prob21 {
	public static void main(String[] args) throws IOException{
		File file = new File("prob21-1-in.txt");
		Scanner sc = new Scanner(file);
		int length = sc.nextInt();
		System.out.println(length);
		sc.nextLine();
		for(int i=0; i<length; i++ ) {
			String line = sc.nextLine();
			String[] array = line.split("-");
			String word = array[0].replaceAll(" ", "");
			String def = array[1];
			boolean check = check(word, def);
			if (check) {
				System.out.println("Perfect");
			} else {
				System.out.println("Imperfect!");
			}
		}
	}
	public static boolean check(String word, String def) {
		boolean check = false;
		boolean good = false;
		while (!good) {
			for(int i = word.length(); i >1; i--) {
				String checkS = word.substring(0,i);
				if(def.contains(checkS)) {
					word = word.substring(i, word.length());
					//System.out.println(word);
					//check = good;
					
					break;
				} else if(i==2) {
					good = true;
					break;
				}
				
			}
			if(word.length()==0) {
				good = true;
				check = true;
			} else if (word.length()==1) {
				good = true;
			}
		}
		return check;
	}
}
