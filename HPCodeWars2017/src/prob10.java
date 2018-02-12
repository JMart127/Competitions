import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prob10 {
	public static void main(String[] args) throws IOException{
		File file = new File("prob10-1-in.txt");
		Scanner sc = new Scanner(file);
		
		int times = sc.nextInt();
		//System.out.println(length);
		sc.nextLine();
		for(int j=0; j <times; j++) {
			int winner = 0;
			String winnerString = "NO PALINDROME";
			String input = sc.nextLine();
			for(int i = input.length(); i > 2; i--){
				for(int k = 0; k <= input.length() - i;k++){
					String search = input.substring(k,k+i);
					String pal = removeStuff(search);
					if(isPalin(pal)){
						//System.out.println(pal);
						if(i>winner){
							if(Character.isLetter(search.charAt(search.length()-1))){
								winnerString = search.substring(1);

							}
							else if(Character.isLetter(search.charAt(0))){
								winnerString = search.substring(0,search.length()-1);
							}else{
								winnerString = search;
							}
							winner = i;
						}
					}
				}
			}
			
			System.out.println(winnerString);
		}
	}
	public static boolean isPalin(String s){
		//System.out.println("");
		for(int i = 0; i < s.length()/2; i++){
			if(s.charAt(i) != 
					s.charAt(s.length()-i-1)){
				
				//System.out.println(s + ": " + false);
return false;

			}
		}
		//System.out.println(s + ": " + true);
		return true;
	}
	public static String removeStuff(String s){
		String mine = s.toLowerCase();
		String answer = "";
		for(int i = 0; i < mine.length();i++){
			if(Character.isLetter((mine.charAt(i)))){
				answer+=mine.substring(i,i+1);
		
			}
		}
		//System.out.println(answer);

		return answer;
	}
}
