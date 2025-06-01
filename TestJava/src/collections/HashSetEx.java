package collections;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetEx {

	public static void main(String[] args) {

		/*------------------------------ Hash Set ------------------------------ */

		Set<Integer> hashSet = new HashSet<>();
		hashSet.add(23);
		hashSet.add(2);
		hashSet.add(3);
		hashSet.add(213);

		// Set does not add duplicate values
		hashSet.add(23);
		hashSet.add(213);

//		Hashtable<K, V>

		// set does not maintain insertion order
		System.out.println("Hash Set  -> " + hashSet);

		// print the size of Set
		System.out.println(hashSet.size());

		// remove an element from Set
		hashSet.remove(2);
		System.out.println(hashSet);

		// to remove all elements from Set
		hashSet.clear();
		System.out.println(hashSet);

		/*-------------------------- LinkedHash Set -------------------------- */
		Set<Integer> linkedSet = new LinkedHashSet<>();
		linkedSet.add(23);
		linkedSet.add(2);
		linkedSet.add(3);
		linkedSet.add(213);

		// Linked set maintain insertion order
		System.out.println("Linked Set -> " + linkedSet);

		/*------------------------------ Tree Set ------------------------------ */
		Set<Integer> treeSet = new TreeSet<>();
		treeSet.add(23);
		treeSet.add(2);
		treeSet.add(3);
		treeSet.add(213);

		// Linked set maintain insertion order
		System.out.println("tree Set -> " + treeSet);
	}

}
