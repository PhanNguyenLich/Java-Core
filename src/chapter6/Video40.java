package chapter6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Video40 {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}");
		Matcher matcher = pattern.matcher("Tryurcode4u@gahfas.com");
		System.out.println("Input String matches regex - " + matcher.matches());
	}
}
