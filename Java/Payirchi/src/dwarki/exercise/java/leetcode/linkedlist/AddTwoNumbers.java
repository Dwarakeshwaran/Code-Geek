package dwarki.exercise.java.leetcode.linkedlist;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//Started @14:06 21-07-2021
//Ended @16:10 21-07-2021
class ListNode {

	int val;
	ListNode next;

	public ListNode() {
		super();
	}

	public ListNode(int data) {
		super();
		this.val = data;
	}

	public ListNode(int data, ListNode node) {
		super();
		this.val = data;
		this.next = node;
	}

}

class LinkedList {

	ListNode headNode;

	public LinkedList() {
		super();
	}

	public LinkedList(ListNode headNode) {
		super();
		this.headNode = headNode;
	}

	public void add(int number) {

		ListNode duplicateNode = headNode;

		if (headNode == null)
			headNode = new ListNode(number);
		else {
			while (duplicateNode.next != null)
				duplicateNode = duplicateNode.next;
			duplicateNode.next = new ListNode(number);
		}

	}

	public void print() {

		ListNode duplicateNode = headNode;

		if (headNode == null)
			return;

		while (duplicateNode.next != null) {
			System.out.print(duplicateNode.val + " ");
			duplicateNode = duplicateNode.next;
		}
		System.out.print(duplicateNode.val);
		System.out.println(" ");
	}

	public void delete(int number) {

		ListNode duplicateNode = headNode;

		if (headNode.val == number) {
			headNode = headNode.next;
			return;
		}

		while (duplicateNode.next != null) {
			if (duplicateNode.next.val == number) {
				duplicateNode.next = duplicateNode.next.next;
				break;// If we don't use this break, then the head=head.nextNode will assign null to
						// head
			} // and that will throw NullPointerException
			duplicateNode = duplicateNode.next;
		}

	}

	public ListNode getNode() {
		return headNode;
	}

	public int goToEnd() {

		ListNode duplicateNode = headNode;

		if (headNode == null)
			return 0;

		while (duplicateNode.next != null) {
			duplicateNode = duplicateNode.next;
		}

		return duplicateNode.val;
	}

}

public class AddTwoNumbers {

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		if((l1.val == 0) && (l2.val == 0))
			return new ListNode(0);
		
		if((l1.val == 0) || (l2.val == 0)){
			if(l1.val == 0)
				return l2;
			else if(l2.val == 0)
				return l1;
		}

		String reversedNode1 = nodeReversal(new LinkedList(l1));
		String reversedNode2 = nodeReversal(new LinkedList(l2));

		Integer sum = Integer.parseInt(reversedNode1) + Integer.parseInt(reversedNode2);

		LinkedList solutionNodeList = new LinkedList();

		for (int i = sum.toString().length() - 1; i >= 0; i--) {

			char c = sum.toString().charAt(i);
			solutionNodeList.add(Integer.parseInt(String.valueOf(c)));
		}
		
		solutionNodeList.print();

		return solutionNodeList.getNode();

	}

	public static String nodeReversal(LinkedList list) {

		LinkedList checkNodeList = new LinkedList(list.getNode());

		int endNodeData;

		StringBuffer reversedString = new StringBuffer();

		while (checkNodeList != null) {
			endNodeData = checkNodeList.goToEnd();

			if (endNodeData != 0)
				reversedString.append(endNodeData);

			if (endNodeData == 0)
				break;
			else
				checkNodeList.delete(endNodeData);

		}
		return reversedString.toString();
	}

	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int[] listArray1 = Arrays.stream(reader.readLine().split(",")).mapToInt(Integer::parseInt).toArray();
		int[] listArray2 = Arrays.stream(reader.readLine().split(",")).mapToInt(Integer::parseInt).toArray();

		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();

		for (int i = 0; i < listArray1.length; i++)
			list1.add(listArray1[i]);

		for (int i = 0; i < listArray2.length; i++)
			list2.add(listArray2[i]);
			

		addTwoNumbers(list1.getNode(), list2.getNode());

	}

}
