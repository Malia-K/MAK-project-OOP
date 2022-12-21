package Model;

import java.util.StringTokenizer;
import java.util.regex.Pattern;


/**
	 * 
	 * A class that describes the output standard for some data
	 * 
	 */

public class Format {
	 public static String formatRow(String str){
	        return str.replace('|', '\u2502');
	 }
	 
	 public static String formatDiv(String str){
		 return str.replace('a', '\u250c')
	                .replace('b', '\u252c')
	                .replace('c', '\u2510')
	                .replace('d', '\u251c')
	                .replace('e', '\u253c')
	                .replace('f', '\u2524')
	                .replace('g', '\u2514')
	                .replace('h', '\u2534')
	                .replace('i', '\u2518')
	                .replace('-', '\u2500');
	 }

	public static StringTokenizer getFormattedString(String s, String delimiter, int size) {
		StringTokenizer st = new StringTokenizer(s, delimiter);
		String formatted = new String();
		String temp = new String();
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			if(temp.length() + token.length() < size) {
				temp += token + " "; 
			}
			else {
				formatted += temp + "\n";
				temp = token + " ";
			}
			if(!st.hasMoreTokens()) {
				formatted += temp;
			}			}
		return new StringTokenizer(formatted, "\n");
	}
	
	public static boolean checkDateFormat(String date) {
		Pattern p = Pattern.compile("^[0-9]{4}-(1[0-2]|0[1-9])-(3[01]|[12][0-9]|0[1-9])$");
		return p.matcher(date).matches();
	}

}
