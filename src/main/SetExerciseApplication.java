package main;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class SetExerciseApplication {
	
	// instatiate new hashset


	public static void main(String[] args) throws IOException {
			Set<String> newPokerHands= new HashSet<String>() ;
	
		
			extractDataFromCSV("PokerHands.csv");
		// Update PAIR to DEUCES
		printToConsole(newPokerHands);
		
		removeHands(newPokerHands);
		
		printToConsole(newPokerHands);
			// remove ACE HIGH and QUEEN HIGH
		
	}

	private static void removeHands(Set<String> newPokerHands) {
		for(String hand:newPokerHands) {
			String firstHand="ACE HIGH";
			String secondHand="QUEEN HIGH";
			if(hand.equalsIgnoreCase(firstHand)) {
				newPokerHands.remove(firstHand);
			}
			if(hand.equalsIgnoreCase(secondHand)) {
				newPokerHands.remove(secondHand);
			}
		}
	}
	
	
	
	public static Set<String> extractDataFromCSV(String fileName) throws IOException {
		Set<String> newPokerHands= new HashSet<String>() ;

		String[]pokerHand=new String[4];
		String[]justPokerHands= new String[44];
		CardSharks cardSharks= new CardSharks();
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
		br.readLine();
		while((lines=br.readLine())!=null) {
			System.out.println(lines);
			
			pokerHand =lines.split(",");
			
			System.out.println(pokerHand[0]);
		
	
			
			 cardSharks.setCardHand(pokerHand[1]);
			 
			  System.out.println(cardSharks.getCardHand());
			 
		justPokerHands[i]=cardSharks.getCardHand();
		i++;
		System.out.println(Arrays.toString(justPokerHands));
		
		
			
			
		}
	for(String hand:justPokerHands) {
			newPokerHands.add(hand);
			
		}
System.out.println(newPokerHands);
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	// extract the data from the CSV done 
	
	

		return newPokerHands;
	}

public static void printToConsole(Set<String>newPokerHands) throws IOException {

for(String hand:newPokerHands) {
	System.out.println(hand);
}

		
	}
}
