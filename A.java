package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A {
	
	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		List<String> asList = Arrays.asList("a","b","c","d","c");
		rep(asList);
	}

	static void rep(List<String> str) {
		Map<String, Integer> map = new HashMap<>();
		
		for(String val : str) {
			Integer orDefault = map.getOrDefault(val, 1);
			
			if(map.containsKey(val)) {
				map.put(val, orDefault+1);
			}else {
				map.put(val, 1);
			}
			
			
			map.entrySet().stream().filter(x -> x.getValue()>1).forEach((y->{
				System.out.println(y.getKey()+" "+y.getValue());
			}));
		}
	}
}
