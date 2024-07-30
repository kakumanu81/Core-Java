package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Hash_set {

	public static void main(String[] args) {
		
		// add(object obj) method
		
		HashSet hashSet1 = new HashSet();
		hashSet1.add("AAA");
		hashSet1.add("BBB");
		hashSet1.add("CCC");
		System.out.println(hashSet1.add("AAA"));
		System.out.println(hashSet1);
		System.out.println("add method");
		System.out.println();
		
		// addAll(collection c) method
		
		Collection collection = new HashSet();
		System.out.println(collection);
		System.out.println(collection.addAll(hashSet1));
		System.out.println(collection);
		System.out.println(collection.addAll(hashSet1));
		System.out.println(collection);
		System.out.println("addAll method");
		System.out.println();
		
		// remove(object obj) method
		
		Collection collection1 = new ArrayList();
		collection1.add("aaa");
		collection1.add("bbb");
		collection1.add("ccc");
		collection1.add("ddd");
		System.out.println(collection1);
		System.out.println(collection1.remove("bbb"));
		System.out.println(collection1);
		System.out.println(collection1.remove("bbb"));
		System.out.println(collection1);
		System.out.println("remove");
		System.out.println();
		
		// removeall() method
		Collection collection2 = new ArrayList();
		collection2.add("aaa");
		collection2.add("bbb");
		collection2.add("ccc");
		collection2.add("ddd");
		collection2.add("eee");
		collection2.add("fff");
		System.out.println(collection2);

        Collection collection3 = new ArrayList();
        collection3.add("bbb");
		collection3.add("ccc");
		collection3.add("ddd");
		System.out.println(collection1);
		System.out.println(collection1.removeAll(collection3));
		System.out.println(collection1);
		System.out.println(collection1.removeAll(collection3));
		System.out.println(collection1);
		System.out.println("remove all");
		System.out.println();
		
		Collection collection4 = new ArrayList();
		collection4.add("aaa");
		collection4.add("bbb");
		collection4.add("ccc");
		collection4.add("ddd");
		System.out.println(collection4);
		System.out.println(collection4.contains("bbb"));
		System.out.println(collection4);
		System.out.println(collection4.contains("lll"));
		System.out.println(collection4);
		System.out.println("conatins");
		System.out.println();
		
		Collection collection5 = new ArrayList();
		collection5.add("aaa");
		collection5.add("bbb");
		collection5.add("ccc");
		collection5.add("ddd");
		System.out.println(collection5);
		System.out.println(collection4.containsAll(collection5));
		System.out.println();
	
		
		
		

	}

}
