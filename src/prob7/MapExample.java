package prob7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put( "blue", 85 );
		map.put( "red", 96 );
		map.put( "black", 92 );
		
		String name = null;   // 최고 점수를 받은 아이디 저장
		int maxScore = 0;     // 최고 점수
		int totalScore = 0;   // 점수 합계
		
		/* 코드를 작성하세요 */
		Set<String> set = map.keySet();
		for( String s : set ) {
			int score = map.get( s );
			if( score > maxScore ) {
				maxScore = score;
				name = s;
			}
			
			totalScore += score;
		}
		
		System.out.println( "평균점수:" + ( totalScore/set.size() ) );
		System.out.println( "최고점수:" + maxScore );
		System.out.println( "최고 점수를 받은 아이디:" + name );
	}

}
