package SapleProject.Sample;

import java.util.*;
import java.util.Optional;

public class ExampleTest {
	public static void main(String[] args) {
		ExampleTest ex=new ExampleTest();
		 ex.solution(15);
	}
		public  int solution(int N) {
			return Optional.ofNullable(N)
					.map(Integer::toBinaryString)
					.filter(n -> n.length() > 1)
					.map(t -> {
						List<Integer> counts = new ArrayList<>();
						int count = 0;
						for(int i = 0; i < t.length(); i++)
						{
							if(t.charAt(i) == '0') {
								count += 1;
								System.out.println("for loop"+i);
							} else if(count > 0) {
								counts.add(count);
								System.out.println(count);
								count = 0;
							}
						}
						if(counts.size() > 0) {
							Collections.sort(counts);
							return counts.get(counts.size() - 1);
						}
						return 0;
					}).orElse(0);
	}
	
}