package garland;

import java.util.Scanner;

public class Garland {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in); 
		String input; 
		System.out.println("Please enter word"); 
		input = in.nextLine();
		int degree = garlandDegree(input);
		System.out.println(degree);
		in.close();
	}
	
	public static int garlandDegree(String input){
		for(int i = input.length() - 1; i >= 0; i--) {
            if(input.substring(0, i).equals(input.substring(input.length() - i))) {
                return i;
            }
        }
        return 0;
	}
}
