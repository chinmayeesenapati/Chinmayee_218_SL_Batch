package com;



	//public static void main(String[] args) {
		//package com.simplilearn.collectionframework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Map {
//public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "chinu");
		map.put(2, "jerry");
		map.put(3, "doraemon");
		map.put(3, "sinchan");
		map.put(null, "bheem");
		map.put(null, "tom");

		System.out.println(map.get(1));
		System.out.println(map.get(3));

		Set<Integer> keys = map.keySet();
		for(Integer d: keys) {
			System.out.println(d);
		}

		Collection<String> values = map.values();
		for(String d: values) {
			System.out.println(d);
		}

	}
}