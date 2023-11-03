package com.techm.cfw;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test5 {
	
	public static void main(String[] args) {
		
		HashMap hs = new HashMap();
		
		hs.put(100,"rama");
		hs.put("rama", 100);
		hs.put(7.8, true);
		hs.put(null, null);
		hs.put(100, "rk");
		hs.put(101, "rk");
		
		
		Set<Map.Entry<Object,Object>> s = hs.entrySet();
		
		
		for(Map.Entry m:s)
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		
	}

}
