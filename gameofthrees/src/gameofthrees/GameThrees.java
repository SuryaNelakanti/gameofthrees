package gameofthrees;
import java.util.*;

public class GameThrees {
	public static void main(String args[]){
		int inum=0;
		Scanner imp = new Scanner(System.in);
		System.out.println("Enter the number:\t");
		inum=imp.nextInt();
		System.out.println("The number you input is: \t" + inum);
		imp.close();
		while(inum!=1) {
			if(inum%3==0) {
					inum=inum/3;
					System.out.println("Dividing by 3:\t\t" + inum);
			}
			else if((inum+1)%3==0) {
				inum = inum+1;
				System.out.println("Adding 1 to the input:\t"+inum);
				inum = inum/3;
				System.out.println("Dividing by 3:\t\t" + inum);
			}
			else {
				inum = inum -1;
				System.out.println("Subtracting 1 from the input:\t"+inum);
				inum = inum/3;
				System.out.println("Dividing by 3:\t\t" + inum);
			}
		}
		System.out.println(inum);
		
	}
}
