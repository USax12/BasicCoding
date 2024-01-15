package com.test.company.output;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * public class Test {
 * 
 * Integer id;
 * 
 * public String toString() { return this.id.toString();
 * 
 * }
 * 
 * Test(int id) {
 * 
 * this.id = id;
 * 
 * }
 * 
 * public static void main(String[] args) {
 * 
 * 
 * public int hashCode() { int result = 1;
 * 
 * result = 31 + ((id == null) ? 0 : id.hashCode()); return result;
 * 
 * Set s = new HashSet(); Test t1 = new Test(1);
 * 
 * Test t2 = new Test(1);
 * 
 * Test t3 = new Test(2);
 * 
 * s.add(t1);
 * 
 * s.add(t2);
 * 
 * s.add(t3);
 * 
 * System.out.println(s.size()); Iterator iter = s.iterator();
 * 
 * while (iter.hasNext())
 * 
 * System.out.print(iter.next() + " ");
 * 
 * } }
 */

public class Test implements Comparable {

	Integer id;

	Test(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return this.id.toString();
	}

	/*
	 * @Override public int hashCode() { System.out.println("In Hashcode" + id); int
	 * result = 1; result = 31 + ((id == null) ? id :hashCode()); return result; }
	 * 
	 * public Boolean equals(Test obj) { System.out.println("In equals" + id);
	 * return this.id.equals(((Test) obj).id); }
	 */
	public static void main(String[] args) {

		Set s = new TreeSet();
		Test t1 = new Test(1);
		Test t3 = new Test(2);

		s.add(t1);
		System.out.println("t1" + t1.toString());

		s.add(t3);
		System.out.println("t2" + t3.toString());
		System.out.println(s.size());

		Iterator iter = s.iterator();

		while (iter.hasNext())

			System.out.println(iter.next());
	}

	@Override
	public int compareTo(Object o) {

		return 0;
	}
}