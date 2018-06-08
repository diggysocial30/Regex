package demo;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTestHarness {

    public static void main(String[] args) throws IOException{
    	Pattern pattern = 
	            Pattern.compile("[0-9]{2}");
    	//Used to split based on the above pattern
    	String[] splits = pattern.split("888999");
    	Matcher matcher = 
	            pattern.matcher("888999");
    	// Used to replace
    	String replace = matcher.replaceAll("888999");
    	//Used to find matches
		while(matcher.find()){
			System.out.println("Matcher found"+matcher.group());
		}
    }
}
