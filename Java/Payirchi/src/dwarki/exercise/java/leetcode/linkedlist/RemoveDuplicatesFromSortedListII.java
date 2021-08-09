package dwarki.exercise.java.leetcode.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Started @17:50 03-08-2021
//Ended @19:14 03-08-2021
public class RemoveDuplicatesFromSortedListII {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int[] intArray = Arrays.stream(reader.readLine().split(",")).mapToInt(Integer::parseInt).toArray();

		TempLinkedList list = new TempLinkedList();

		for (int i : intArray)
			list.add(i);

		new TempLinkedList(deleteDuplicates(list.getNode())).show();
	}

	public static ListNode deleteDuplicates(ListNode head) {
		
		List<Integer> repeatedValuesList = new ArrayList<Integer>();
		
		getRepeatedValuesList(head, repeatedValuesList);
		
		for(int i = 0; i<repeatedValuesList.size(); i++) {
			removeNode(head, repeatedValuesList.get(i));
		}
		
		TempLinkedList uniqueList = new TempLinkedList();
		
		ListNode tempNode = head;
		
		if(head == null)
			return null;
		
		if(head.next == null)
			return head;
		
		while(tempNode.next!=null) {
			
			if(tempNode.val != 0)
				uniqueList.add(tempNode.val);
			tempNode = tempNode.next;
		}
		
		if(tempNode.val != 0)
			uniqueList.add(tempNode.val);
		
		return uniqueList.getNode();
	}

	public static void getRepeatedValuesList(ListNode headNode, List<Integer> list) {

		ListNode tempNode = headNode;

		if (headNode == null)
			return;

		if (headNode.next == null)
			return;

		int checkValue = headNode.val;
		int count = 0;

		while (tempNode.next != null) {

			if (tempNode.val == checkValue)
				count++;

			checkValue = tempNode.val;

			if (count > 1) {
				list.add(checkValue);
				count = 1;
			}

			tempNode = tempNode.next;

		}
		if(tempNode.val == checkValue)
			list.add(checkValue);

	}
	
	public static void removeNode(ListNode headNode, int number) {
		
		ListNode tempNode = headNode;
		
		if(headNode == null || headNode.next == null)
			return;
		
		while(tempNode.next!= null) {
			
			if(tempNode.val == number) 
				tempNode.val = 0;
			
			tempNode = tempNode.next;
		}
		if(tempNode.val == number) 
			tempNode.val = 0;
			

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

}
