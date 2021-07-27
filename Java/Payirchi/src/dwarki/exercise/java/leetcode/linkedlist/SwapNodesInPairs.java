package dwarki.exercise.java.leetcode.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//Started @16:01 26-07-2021
//Ended @16:48 26-07-2021
public class SwapNodesInPairs {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int[] intArray = Arrays.stream(reader.readLine().split(",")).mapToInt(Integer::parseInt).toArray();

		TempLinkedList list = new TempLinkedList();

		for (int i : intArray)
			list.add(i);

		swapPairs(list.getNode());

	}

	public static ListNode swapPairs(ListNode head) {

		TempLinkedList list = new TempLinkedList(head);

		list.swapAdjacentNodesInPairs();

		head = list.getNode();

		new TempLinkedList(head).show();

		return head;

	}

}

class TempLinkedList {

	ListNode headNode;

	public TempLinkedList() {
		super();
	}

	public TempLinkedList(ListNode headNode) {
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

		while (tempNode.next != null) {
			System.out.print(tempNode.val + " ");
			tempNode = tempNode.next;
		}
		System.out.print(tempNode.val + " ");
		System.out.println();
	}

	public ListNode getNode() {
		return headNode;
	}

	public ListNode swapAdjacentNodesInPairs() {

		ListNode tempNode = headNode;

		if (headNode == null)
			return null;
		else if (headNode.next == null)
			return headNode;
		else if (tempNode.next != null) {

			while (tempNode.next != null) {

				int temp = tempNode.val;
				tempNode.val = tempNode.next.val;
				tempNode.next.val = temp;

				tempNode = tempNode.next;

				if (tempNode.next == null)
					return tempNode;
				else
					tempNode = tempNode.next;
			}

			return tempNode;
		} else
			return null;
	}

}
