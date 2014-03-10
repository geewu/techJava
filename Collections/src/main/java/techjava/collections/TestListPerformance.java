package techjava.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class TestListPerformance {
	
	private static int MAX_COUNT = 1000000;
	
	public static void doPerformance(){
		
		
		 LinkedList<Integer> linkedList = new LinkedList<Integer>();
		 LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
		 ArrayList<Integer> arrayList = new ArrayList<Integer>();
		 Vector<Integer> vector = new Vector<Integer>();
		 Stack<Integer> stack = new Stack<Integer>();
		 Stack<Integer> stack2 = new Stack<Integer>();
		 Vector<Integer> vector2 = new Vector<Integer>();
		 
		
		 
		 System.out.println("----------²âÊÔlistµÄ²åÈë----------");
		 insertTest(linkedList);
		 insertTest(linkedList2);
		 insertTest(arrayList);
		 insertTest(stack);
		 insertTest(stack2);
		 insertTest(vector);
		 insertTest(vector2);
		
		 
		 System.out.println("----------²âÊÔlistËæ»ú²éÕÒ-----------");
		 radonAccesTest(linkedList);
		 radonAccesTest(arrayList);
		 radonAccesTest(vector);
		 radonAccesTest(stack);
		 
		 
		 System.out.println("----------²âÊÔlistÉ¾³ı-----------");
		 deleteTest(linkedList);
		 deleteLinkFirstTest(linkedList2);
		 deleteTest(arrayList);
		 deleteTest(vector);
		 deleteTest(stack);
		 
	}
	
	
	private static void insertTest(List<Integer> list){
		long startTime = System.currentTimeMillis();
		
		for(int i = 0 ;i < MAX_COUNT ; i++){
			list.add(i);
		}
		
		long endTime = System.currentTimeMillis();
		
		long time = endTime-startTime;
		
		System.out.println(getListName(list) + " : insert "+MAX_COUNT+" elements into the 1st position use time£º" + time+" ms");

	}
	
	private static void radonAccesTest(List<Integer> list){
		long startTime = System.currentTimeMillis();
		
		for(int i = 0 ;i < MAX_COUNT ; i++){
			list.get(i);
		}
		
		long endTime = System.currentTimeMillis();
		
		long time = endTime-startTime;
		
		System.out.println(getListName(list) + " : Radon "+MAX_COUNT+" elements from 0 to "+MAX_COUNT+" use time£º" + time+" ms");

	}
	
	
	private static void deleteTest(List<Integer> list){
		long startTime = System.currentTimeMillis();
		
		for(int i = 0 ;i < MAX_COUNT ; i++){
			list.get(i);
		}
		
		long endTime = System.currentTimeMillis();
		
		long time = endTime-startTime;
		
		System.out.println(getListName(list) + " : delete "+MAX_COUNT+" elements from the 1st position use time£º" + time+" ms");

	}
	
	private static void deleteLinkFirstTest(LinkedList<Integer> list){
		long startTime = System.currentTimeMillis();
		
		for(int i = 0 ;i < MAX_COUNT ; i++){
			list.removeFirst();
		}
		
		long endTime = System.currentTimeMillis();
		
		long time = endTime-startTime;
		
		System.out.println(getListName(list) + " : delete LinkedList "+MAX_COUNT+" elements from the 1st position use time£º" + time+" ms");

	}
	
	private static String getListName(List<Integer> list) {
		if (list instanceof LinkedList) {
			return "LinkedList";
		} else if (list instanceof ArrayList) {
			return "ArrayList";
		} else if (list instanceof Stack) {
			return "Stack";
		} else if (list instanceof Vector) {
			return "Vector";
		} else {
			return "List";
		}
	}

	
	
}
