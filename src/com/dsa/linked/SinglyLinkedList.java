package com.dsa.linked;

import java.util.Scanner;

public class SinglyLinkedList {

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

		int data, n, m, pos;
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

				System.out.println(
						"Enter 1 to insert in the beginning , 2 to insert at the end " + ", 3 to insert in the middle");
				m = sc.nextInt();
				switch (m) {

				case 1:
					new_node.next = head;
					head = new_node;
					break;
				case 2:
					Node temp = head;
					while (temp.next != null) {
						temp = temp.next;
					}
					temp.next = new_node;
					break;
				case 3:
					System.out.println("Enter position of node to be inserted");
					pos = sc.nextInt();
					Node temp1 = head;
					for (int i = 0; i < (pos - 1); i++) {
						temp1 = temp1.next;
					}
					new_node.next = temp1.next;
					temp1.next = new_node;
					break;
				}

			}
			System.out.println("Do u want to add more. Press 1");
			n = sc.nextInt();
		} while (n == 1);

	}

	public void delete() {
		int data, n, m, pos;
		Scanner sc = new Scanner(System.in);
		do {
			if (head == null) {
				System.out.println("LinkedList is Emppty");
			} else {
				System.out.println("Enter 1 to delete from begining ,"
						+ "2 for to delete from end, 3 for to delete from position");
				m = sc.nextInt();
				switch (m) {
				case 1:
					Node temp = head;
					temp = temp.next;
					head = temp;

				case 2:
					Node temp = head;
					
					break;
				case 3:
					System.out.println("Enter Position of node to be deleted");
					pos = sc.nextInt();
					break;

				}

			}

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

		SinglyLinkedList creationObject = new SinglyLinkedList();
		creationObject.creation();
		creationObject.traverse();
	}
}
