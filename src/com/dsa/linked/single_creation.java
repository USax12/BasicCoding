package com.dsa.linked;

import java.util.Scanner;

public class single_creation {

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	Node head = null;

	public void creation() {

		int data, n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter Data");
			data = sc.nextInt();
			Node new_node = new Node(data);
			// check if list exists or not
			if (head == null) // empty list
			{
				head = new_node;

			} else {
				new_node.next = head;
				head = new_node;

			}
			System.out.println("Do u want to add more. Press 1");
			n = sc.nextInt();
		} while (n == 1);

	}

	public void traverse() {

		Node temp = head;
		if (head == null) {
			System.out.println("LL does not exist");
		} else {
			while (temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
	}

	public static void main(String[] args) {

		single_creation creationObject = new single_creation();
		creationObject.creation();
		creationObject.traverse();
	}
}
