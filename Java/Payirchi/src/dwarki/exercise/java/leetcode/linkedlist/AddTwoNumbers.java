package dwarki.exercise.java.leetcode.linkedlist;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
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

	public void deleteLastNode() {

		ListNode duplicateNode = headNode;
		
		if(headNode.next == null)
		{
			headNode = null;
			return;
		}
			
			
		while (true) {

			if (duplicateNode.next.next == null) {
				duplicateNode.next = null;
				return;
			}
			
			duplicateNode = duplicateNode.next;
		}

	}

	public ListNode getNode() {
		return headNode;
	}

	public int goToEnd() {

		ListNode duplicateNode = headNode;

		if (headNode == null)
			return -1;

		while (duplicateNode.next != null) {
			duplicateNode = duplicateNode.next;
		}

		return duplicateNode.val;
	}

	public int size() {

		ListNode duplicateNode = headNode;

		int count = 0;

		while (duplicateNode.next != null) {
			count++;
			duplicateNode = duplicateNode.next;
		}

		return (count + 1);
	}

}

public class AddTwoNumbers {

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		String reversedNode1 = nodeReversal(new LinkedList(l1));

		String reversedNode2 = nodeReversal(new LinkedList(l2));
		
		BigInteger sum = new BigInteger(reversedNode1).add(new BigInteger(reversedNode2));

		LinkedList solutionNodeList = new LinkedList();

		for (int i = sum.toString().length() - 1; i >= 0; i--) {

			char c = sum.toString().charAt(i);
			solutionNodeList.add(Integer.parseInt(String.valueOf(c)));
		}

		//solutionNodeList.print();

		return solutionNodeList.getNode();

	}

	public static String nodeReversal(LinkedList list) {

		LinkedList checkNodeList = new LinkedList(list.getNode());

		int endNodeData;
		int count = list.size();

		StringBuffer reversedString = new StringBuffer();

		while (count != 0) {
			endNodeData = checkNodeList.goToEnd();
			reversedString.append(endNodeData);
			checkNodeList.deleteLastNode();

			count--;
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
