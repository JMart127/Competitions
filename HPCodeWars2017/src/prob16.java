import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prob16 {
	public static void main(String[] args) throws IOException{
		File file = new File("prob16.txt");
		Scanner sc = new Scanner(file);
		int letters = sc.nextInt();
		//System.out.println(letters);
		String[] data = new String[letters];
		sc.nextLine();
		for(int i = 0; i <letters; i++) {
			String lets = sc.nextLine();
			lets = lets.replaceAll(" ", "");
			data[i] = lets;
			//ystem.out.println(lets);
		}
		//String[] temp = data;
		int wlength = sc.nextInt();
		sc.nextLine();
		//System.out.println(wlength);
		String[] words = new String[wlength];
		for(int i = 0; i <wlength; i++) {
			String[] temp = data.clone();
			words[i] = sc.nextLine();
			//System.out.println(words[i] + i);
			boolean can = check(temp, words[i]);
			if(can) {
				System.out.println(words[i] + " can be formed");
			} else{ 
				System.out.println(words[i] + " CANNOT be formed");
			}
			
		}
	}
	public static boolean check(String[] data, String word) {
		boolean good = true;
		for(int i = 0; i < word.length(); i++) {
			char check = word.charAt(i);
			boolean has = false;
			for (int j = 0; j < data.length; j++) {
				if((data[j].indexOf(check)>=0)) {
					//String[] temp = data;
					has = true;
					//System.out.println(data[j] + " has " + check);
					data[j] = " ";
					break;
				} 
			}
			if(!has) {
				good = false;
				break;
			}
		}
		return good;
	}
}
