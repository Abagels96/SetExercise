package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FileService {
	static Set<String> newPokerHands= new HashSet<String>() ;
	public static Set<String> extractDataFromCSV(String fileName) throws IOException {
		

		String[]pokerHand=new String[4];
		String[]justPokerHands= new String[44];
		
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
		
	
			
			newPokerHands.add(pokerHand[1]);
			 
		
		}
System.out.println(newPokerHands);
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	// extract the data from the CSV done 
	
	

		return newPokerHands;
	}

}
