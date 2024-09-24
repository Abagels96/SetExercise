package main;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class SetExerciseApplication {
	
	// instatiate new hashset









	public static void main(String[] args) throws IOException {
			Set<String> newPokerHands= new HashSet<String>() ;
	
		FileService fileService= new FileService();
		FileService.extractDataFromCSV("PokerHands.csv");
		Set<String> copyOfNewPokerHands= new HashSet<>();
		copyOfNewPokerHands=fileService.newPokerHands;
		// Update PAIR to DEUCES
		printToConsole(copyOfNewPokerHands);
		
	removeHands(copyOfNewPokerHands);
		System.out.println("-------");
		printToConsole(copyOfNewPokerHands);
			// remove ACE HIGH and QUEEN HIGH
		
	}

	private static void removeHands(Set<String> copyOfNewPokerHands) {
		String firstHand="ACE HIGH";
		String secondHand="QUEEN HIGH";
		
		
			if(copyOfNewPokerHands.contains(firstHand)) {
				copyOfNewPokerHands.remove(firstHand);
			}
			if(copyOfNewPokerHands.contains(secondHand)) {
				copyOfNewPokerHands.remove(secondHand);
			}
		}
	
	
	
	
	
public static void printToConsole(Set<String>copyOfNewPokerHands) throws IOException {

for(String hand:copyOfNewPokerHands) {
	System.out.println(hand);
}

		
	}

public void updateElement(Set<String>copyOfNewPokerHands) {
	
}
}
