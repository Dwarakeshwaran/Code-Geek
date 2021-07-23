package dwarki.exercise.java.leetcode.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//Started @14:11 23-07-2021
//Ended @15:15 23-07-2021
public class MergeTwoSortedLists {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int[] intArray1 = Arrays.stream(reader.readLine().split(",")).mapToInt(Integer::parseInt).toArray();
		int[] intArray2 = Arrays.stream(reader.readLine().split(",")).mapToInt(Integer::parseInt).toArray();

		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();

		for (int i : intArray1)
			list1.add(i);

		for (int i : intArray2)
			list2.add(i);

		mergeTwoLists(list1.getNode(), list2.getNode());

	}

	public static Node mergeTwoLists(Node l1, Node l2) {

		LinkedList mergedList = new LinkedList();

		mergedList.addNode(l1);
		mergedList.addNode(l2);

		LinkedList sortedList = new LinkedList();

		sortedList = sortList(mergedList);

		return sortedList.getNode();

	}

	public static LinkedList sortList(LinkedList list) {

		int minimumNumber;
		int count = list.size();

		LinkedList resultantList = new LinkedList();

		while (count != resultantList.size()) {

			minimumNumber = list.getMinimum();
			list.remove(minimumNumber);
			resultantList.add(minimumNumber);
		}

		resultantList.show();

		return resultantList;
	}

}

class Node {
	int val;
	Node next;

	public Node() {
		super();
	}

	public Node(int val) {
		super();
		this.val = val;
	}
	
	public Node(int val, Node next) {
		super();
		this.val = val;
		this.next = next;
	}

}

class LinkedList {

	Node headNode;

	public LinkedList() {
		super();
	}

	public LinkedList(Node head) {
		super();
		this.headNode = head;
	}

	public void add(int data) {

		Node tempNode = headNode;

		if (headNode == null) {
			headNode = new Node(data);
			return;
		}

		while (tempNode.next != null) {
			tempNode = tempNode.next;
		}
		tempNode.next = new Node(data);

	}

	public void show() {

		Node tempNode = headNode;

		if (headNode == null)
			return;
		else {
			while (tempNode.next != null) {
				System.out.print(tempNode.val + " ");
				tempNode = tempNode.next;
			}
			System.out.println(tempNode.val);
		}

	}

	public Node getNode() {
		return headNode;
	}

	public void addNode(Node newNode) {

		Node tempNode = headNode;

		if (headNode == null) {
			headNode = newNode;
			return;
		}

		while (tempNode.next != null) {
			tempNode = tempNode.next;
		}
		tempNode.next = newNode;

	}

	public int getMinimum() {

		Node tempNode = headNode;

		if (headNode == null)
			return 0;

		int minimum = headNode.val;

		while (tempNode.next != null) {
			if (tempNode.val <= minimum)
				minimum = tempNode.val;
			tempNode = tempNode.next;
		}

		if (tempNode.val <= minimum)
			minimum = tempNode.val;

		return minimum;
	}

	public void remove(int number) {
		Node tempNode = headNode;

		if (headNode.val == number) {
			headNode = headNode.next;
			return;
		}

		while (tempNode.next != null) {

			/*
			 * This is to delete the last node; we can't able to perform tempNode.next =
			 * tempNode.next.next because we can able to fetch tempNode.next.next and it
			 * will NullPointerException
			 */
			if (tempNode.next.val == number && tempNode.next.next == null) {
				tempNode.next = null;
				return;
			}

			if (tempNode.next.val == number) {
				tempNode.next = tempNode.next.next;
				return;
			}

			tempNode = tempNode.next;

		}
	}

	public int size() {

		Node tempNode = headNode;

		int count = 0;

		while (tempNode != null) {
			count++;
			tempNode = tempNode.next;
		}

		return count;
	}

}