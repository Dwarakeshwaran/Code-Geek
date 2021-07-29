package dwarki.exercise.java.leetcode.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//Started @18:43 28-07-2021
//Ended @19:20 28-07-2021
public class RotateList {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int[] intArray = Arrays.stream(reader.readLine().split(",")).mapToInt(Integer::parseInt).toArray();

		int shift = Integer.parseInt(reader.readLine());

		MyTempLinkedList list = new MyTempLinkedList();

		for (int i : intArray)
			list.add(i);

		rotateRight(list.getNode(), shift);

	}

	public static ListNode rotateRight(ListNode head, int k) {

		MyTempLinkedList list = new MyTempLinkedList(head);

		ListNode lastNode;
		
		if(head == null)
			return null;

		if (head.next == null)
			return head;
		
		k = k%list.size(head);

		for (int i = 0; i < k; i++) {

			lastNode = list.getLastHead();

			list.removeLastNode();

			list.prepend(lastNode);

		}

		list.show();

		return list.getNode();

	}

}

class MyTempLinkedList {

	ListNode headNode;

	public MyTempLinkedList() {
		super();
	}

	public MyTempLinkedList(ListNode headNode) {
		super();
		this.headNode = headNode;
	}

	public void add(int number) {

		ListNode tempNode = headNode;

		if (headNode == null) {
			headNode = new ListNode(number);
			return;
		}

		while (tempNode.next != null)
			tempNode = tempNode.next;
		tempNode.next = new ListNode(number);

	}

	public void show() {

		ListNode tempNode = headNode;

		if (headNode == null)
			return;

		while (tempNode.next != null) {
			System.out.print(tempNode.val + " ");
			tempNode = tempNode.next;
		}

		System.out.println(tempNode.val);
	}

	public ListNode getNode() {
		return headNode;
	}

	public ListNode getLastHead() {

		ListNode tempNode = headNode;

		if (headNode == null)
			return null;

		if (headNode.next == null)
			return headNode;

		while (tempNode.next != null)
			tempNode = tempNode.next;

		return tempNode;
	}

	public void removeLastNode() {

		ListNode tempNode = headNode;

		if (headNode.next == null) {
			headNode = null;
			return;
		}

		while (tempNode.next != null) {

			if (tempNode.next.next == null) {
				tempNode.next = null;
				return;
			}

			tempNode = tempNode.next;

		}
	}

	public void prepend(ListNode node) {

		ListNode tempNode = headNode;

		headNode = node;

		headNode.next = tempNode;

	}
	
	public int size(ListNode headNode) {

		ListNode tempNode = headNode;

		int count = 0;

		if (headNode == null)
			return 0;

		if (headNode.next == null)
			return 1;

		while (tempNode.next != null) {
			count++;
			tempNode = tempNode.next;
		}

		return (count + 1);
	}
}