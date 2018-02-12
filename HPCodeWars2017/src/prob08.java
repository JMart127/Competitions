import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prob08 {
	public static void main(String[] args) throws IOException{
		File file = new File("prob08-1-in.txt");
		Scanner sc = new Scanner(file);
		while(true){
			long start = sc.nextLong();
			long end = sc.nextLong();
			//System.out.print("start: " + start + " end: " + end + "   ");
			if(start == 0 && end == 0){
				break;
			}
			long pairCount = 0;
			if(start % 2 == 1){
				if(isEvenPair(start))pairCount++;
				start++;
			}
			if(end % 2 == 0){
				if(isEvenPair(end))pairCount++;
				end--;
			}
			pairCount += ((end-start)+1)/2;
			System.out.println(pairCount);
			
		}
		
	}
	public static boolean isEvenPair(long n){
		String binary = Long.toBinaryString(n);
		int count = 0;
		for(char c : binary.toCharArray()){
			if(c == '1')count++;			
		}
		return (count % 2 == 0);
	}
}
