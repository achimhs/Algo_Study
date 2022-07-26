package programmers;

import java.util.HashMap;

public class Solution_Lv1_완주하지못한선수 {
	/*
	 * getOrDefault(p,0)+1:p값이 존재하면 0을 아니면 1을 
	 */
	public String solution(String[] participant, String[] completion) {
		String answer = "";

		HashMap<String, Integer> map = new HashMap<>();

		for (String p : participant) {
			map.put(p, map.getOrDefault(p, 0) + 1);
		}
		for (String c : completion) {
			map.put(c, map.get(c) - 1);
		}
		for (String key : map.keySet()) {
			if (map.get(key) > 0) {
				answer = key;
				break;
			}
		}
		return answer;
	}
}

//		HashSet<String> hs = new HashSet<>();
//		for (int i = 0; i < participant.length; i++) {
//			hs.add(participant[i]);
//		}
//
//		for (int i = 0; i < completion.length; i++) {
//			if (hs.contains(completion[i])) {
//				hs.remove(completion[i]);
//			}
//		}
//		return answer;
//	}
//}