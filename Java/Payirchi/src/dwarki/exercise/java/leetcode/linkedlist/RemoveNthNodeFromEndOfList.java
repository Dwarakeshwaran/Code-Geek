package dwarki.exercise.java.leetcode.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//Started @16:43 21-07-2021
//Ended @19:34 21-07-2021
class Node {
	int data;
	Node nextNode;

	public Node() {
		super();
	}

	public Node(int data) {
		super();
		this.data = data;
	}

	public Node(int data, Node nextNode) {
		super();
		this.data = data;
		this.nextNode = nextNode;
	}

}

class MyLinkedList {

	Node headNode;

	public MyLinkedList() {
		super();
	}

	public MyLinkedList(Node headNode) {
		super();
		this.headNode = headNode;
	}

	public void add(int number) {

		Node duplicateNode = headNode;

		if (headNode == null)
			headNode = new Node(number);
		else {
			while (duplicateNode.nextNode != null)
				duplicateNode = duplicateNode.nextNode;
			duplicateNode.nextNode = new Node(number);
		}

	}

	public void print() {

		Node duplicateNode = headNode;

		while (duplicateNode != null) {
			System.out.print(duplicateNode.data + " ");
			duplicateNode = duplicateNode.nextNode;
		}
	}

	public void removeAtPosition(int position) {

		Node duplicateNode = headNode;

		int count = 1;

		if (count == position) {//This is for deleting the first Element
			headNode = headNode.nextNode;
			return;
		}

		while (duplicateNode.nextNode != null) {
			if ((count + 1) == position) {
				duplicateNode.nextNode = duplicateNode.nextNode.nextNode;
			}
			if (count == position - 1)// This is for deleting the last element
				return;// so that we can avoid the NullPointerException
			else
				duplicateNode = duplicateNode.nextNode;
			count++;
		}

	}

	public int size() {

		Node duplicateNode = headNode;
		int counter = 0;

		while (duplicateNode != null) {
			duplicateNode = duplicateNode.nextNode;
			counter++;
		}
		return counter;
	}
}

public class RemoveNthNodeFromEndOfList {

	public static void removeNthFromEnd(MyLinkedList head, int n) {

		int position = (head.size() - n) + 1;

		head.removeAtPosition(position);

		head.print();
	}

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int[] nodeArray = Arrays.stream(reader.readLine().split(",")).mapToInt(Integer::parseInt).toArray();

		int position = Integer.parseInt(reader.readLine());

		MyLinkedList list = new MyLinkedList();

		for (int i : nodeArray)
			list.add(i);

		removeNthFromEnd(list, position);

	}
	

}

/* LEETCODE SOLUTION
 
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/*
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        MyLinkedList list = new MyLinkedList(head);
        
        int position = (list.size() - n) + 1;

		list.removeAtPosition(position);

		return list.getNode();
        
    }
}

class MyLinkedList {

	ListNode headNode;

	public MyLinkedList() {
		super();
	}

	public MyLinkedList(ListNode headNode) {
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

		while (duplicateNode != null) {
			System.out.print(duplicateNode.val + " ");
			duplicateNode = duplicateNode.next;
		}
	}

	public void removeAtPosition(int position) {

		ListNode duplicateNode = headNode;

		int count = 1;

		if (count == position) {//This is for deleting the first Element
			headNode = headNode.next;
			return;
		}

		while (duplicateNode.next != null) {
			if ((count + 1) == position) {
				duplicateNode.next = duplicateNode.next.next;
			}
			if (count == position - 1)// This is for deleting the last element
				return;// so that we can avoid the NullPointerException
			else
				duplicateNode = duplicateNode.next;
			count++;
		}

	}

	public int size() {

		ListNode duplicateNode = headNode;
		int counter = 0;

		while (duplicateNode != null) {
			duplicateNode = duplicateNode.next;
			counter++;
		}
		return counter;
	}
    
    public ListNode getNode(){
        return headNode;
    }
}


*/
