package cis232.lab;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Randomizer {

	public static void main(String[] args) throws IOException{
		
		File originalFile = new File("original_list.txt");
		Scanner input = new Scanner(originalFile);
		ArrayList<String> lines = new ArrayList<>();
		
		while(input.hasNextLine())
		{
			lines.add(input.nextLine());
		}
		
		PrintWriter outputFile = new PrintWriter("randomized_list.txt");
		int number;
		Random randomNumber = new Random();
		
		while(!lines.isEmpty()){
			outputFile.println(lines.remove(randomNumber.nextInt(lines.size())));
		}
		
		outputFile.close();
		input.close();
		
		

		//For testing purposes, output all the lines
//		for(String line : lines)
//		{
//			System.out.println(line);
//		}
//		
		
	}

}
