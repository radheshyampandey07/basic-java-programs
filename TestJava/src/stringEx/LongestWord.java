package stringEx;

import java.util.HashMap;
import java.util.Map;

public class LongestWord {

	public static void main(String[] args) {
		String str = "Hardships often prepare ordinary people for an extraordinary destiny";
		String[] sr = str.split(" ");
//		Map<String, Integer> data = new HashMap<>();
		int leng = 0, shor=0;
		String s1 = sr[0], s2 = sr[0];
		for (int j = 1; j < sr.length; j++) {
			if (sr[j].length() > s1.length()) {
				leng = sr[j].length();
				s1 = sr[j];
			}

			if (sr[j].length() < s2.length()) {
				shor = sr[j].length();
				s2 = sr[j];
			}
		}
		System.out.println(shor + " " + s2);
		System.out.println(leng + " " + s1);

//		for (int i = 0; i < sr.length; i++) {
//			data.put(sr[i], sr[i].length());
//		}
//		for (Map.Entry<String, Integer> entry : data.entrySet()) {
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}
	}

}
