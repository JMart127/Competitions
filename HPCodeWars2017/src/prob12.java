import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prob12 {
	public static void main(String[] args) throws IOException{
		File file = new File("prob12-1-in.txt");
		Scanner sc = new Scanner(file);
		int length = sc.nextInt();
		//System.out.println(length);
		for(int i=0; i <length; i ++) {
			int tutorl = sc.nextInt();
			int[] tutors = new int[tutorl];
			for(int j=0; j<tutorl; j++) {
				tutors[j] = sc.nextInt();
				//System.out.print(tutors[j]);
			}
			
			int dumbl = sc.nextInt();
			int[] dumbs = new int[dumbl];
			for(int j=0; j<dumbl; j++) {
				dumbs[j] = sc.nextInt();
			}
			long sum = 0;
			for(int j=0; j <tutors.length; j ++) {
				int tskill = tutors[j];
				for(int k=0; k <dumbs.length; k ++) {
					int dskill = dumbs[k];
					if(tskill>dskill) {
						//System.out.println(tskill + " is greater than " + dskill);
						sum++;
					} else {
						//System.out.println(tskill + " is less than " + dskill);
					}
				}
			}
			System.out.println(sum);
		}
 	}
	
}
