package techjava.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;
import java.util.WeakHashMap;

public class TestMapPerformance {
	private static int MAX_COUNT = 1000000;
	public static void doPerformance(){
		HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
		TreeMap<Integer,Integer> treemap = new TreeMap<>();
		Hashtable<Integer,Integer> hashTable = new Hashtable<>();
		WeakHashMap<Integer,Integer> weakHash = new WeakHashMap<>();
	}
}
