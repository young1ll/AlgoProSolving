//package baekjoon;
//String
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BAEKJOON_1152 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cnt = 0;
		
		while(st.hasMoreTokens()) {
			st.nextToken();
			cnt++;
		}
		System.out.println(cnt);
	}

}
