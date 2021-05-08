package taskWorkFinder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class TaskWordFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = args[0].toString();
		String inputWord = args[1].toString();
		
		// String pathToFile = Paths.get(fileName).toAbsolutePath().toString();
		
		try {
			ArrayList<String> lines = new ArrayList<>();
			try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			    String line;
			    while ((line = br.readLine()) != null) {
			       // process the line.
			    	lines.add(line);
			    }
			}
			WordFinder wf = new WordFinder(lines);
			String result = wf.longestWord(inputWord);
			System.out.println(result);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
