package dwarki.exercise.java.leetcode.string;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DecodeWays {

	public static void main(String[] args) {

		numDecodings("12");

	}

	public static int numDecodings(String s) {

		List<String> subStrings = new ArrayList<String>();

		generateSubstrings(s, subStrings);
		
		//subStrings = subStrings.stream().distinct().collect(Collectors.toList());
		
		List<String> subSequences = new ArrayList<String>();

		String sequence = getSequence(subStrings.size());

		generateSubSequences(sequence, subSequences, "");

		int count = getDecodingCount(s, subStrings, subSequences);

		System.out.println(count);

		return count;

	}


	private static int getDecodingCount(String s, List<String> subStrings, List<String> subSequences) {

		int count = 0;

		for (int i = 0; i < subSequences.size() - 1; i++) {

			String decodedString = getDecodedString(subStrings, subSequences.get(i));

			if (s.equals(decodedString))
				count++;

		}

		return count;
	}

	private static String getDecodedString(List<String> subStrings, String location) {

		StringBuffer string = new StringBuffer();

		for (int i = 0; i < location.length(); i++) {

			int digit = Character.getNumericValue(location.charAt(i));

			string.append(subStrings.get(digit - 1));

		}

		//System.out.println(location + "---" + string);

		return string.toString();
	}

	private static void generateSubSequences(String sequence, List<String> subSequences, String string) {

		if (sequence.length() == 0) {
			subSequences.add(string);
			return;
		}

		generateSubSequences(sequence.substring(1), subSequences, string + sequence.charAt(0));

		generateSubSequences(sequence.substring(1), subSequences, string);

	}

	private static String getSequence(int size) {

		StringBuffer str = new StringBuffer();

		for (Integer i = 1; i <= size; i++) {
			str.append(i.toString());
		}
		return str.toString();
	}

	private static void generateSubstrings(String s, List<String> subStrings) {

		for (int start = 0; start < s.length(); start++) {

			for (int end = start + 1; end <= s.length(); end++) {

				String subString = s.substring(start, end);

				if (subString.length() <= 2) {

					if (subString.charAt(0) != '0')
						subStrings.add(subString);
				}
			}
		}
	}

}
