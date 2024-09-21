package main;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class SetExerciseApplication {
	
	// instatiate new hashset


	public static void main(String[] args) throws IOException {
			Set<String> newPokerHands= new HashSet<String>() ;
			String[]pokerHand=new String[44];
		int i=0;
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("PokerHands.csv"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			String lines="";
			while((lines=br.readLine())!=null) {
				System.out.println(lines);
				
				pokerHand =lines.split(", ");
				
				
				System.out.println(Arrays.toString(pokerHand));
				
				for(String hand:pokerHand) {
					Arrays.copyOf(hand);
					System.out.print(hand);
				newPokerHands.add(hand);
				System.out.println(newPokerHands);
				}
				
				
			}
		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// extract the data from the CSV done 
		BufferedWriter writer= new BufferedWriter(new FileWriter("pokerHands2.csv"));
		for (String hand:newPokerHands) {
			writer.write(hand);
			writer.newLine();
		}
		
		writer.close();
		// remove ACE HIGH and QUEEN HIGH
		
		
		// Update PAIR to DEUCES
		printToConsole(newPokerHands);
		
	}
	
	public static void printToConsole(Set<String>newPokerHands) {

		for(String hand:newPokerHands) {
			System.out.println(hand);
		}
		
	}
	
	public static Set<String> extractDataFromCSV(String fileName) {

		return null;
	}

}
