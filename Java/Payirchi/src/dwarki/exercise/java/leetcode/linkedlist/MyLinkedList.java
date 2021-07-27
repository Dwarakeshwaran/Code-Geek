package dwarki.exercise.java.leetcode.linkedlist;

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
		else {
			while (tempNode.next != null) {
				System.out.print(tempNode.val + " ");
				tempNode = tempNode.next;
		}
			System.out.print(tempNode.val);
			System.out.println(" ");
		
		}
		
	}

	public void deleteLastNode() {

		ListNode tempNode = headNode;

		if (headNode.next == null) {
			headNode = null;
			return;
		}

		while (true) {

			if (tempNode.next.next == null) {
				tempNode.next = null;
				return;
			}

			tempNode = tempNode.next;
		}

	}

	public ListNode getNode() {
		return headNode;
	}

	public int goToEnd() {

		ListNode tempNode = headNode;

		if (headNode == null)
			return -1;

		while (tempNode.next != null) {
			tempNode = tempNode.next;
		}

		return tempNode.val;
	}

	public int size() {

		ListNode tempNode = headNode;

		int count = 0;

		while (tempNode != null) {
			count++;
			tempNode = tempNode.next;
		}

		return count;
	}

	public void removeAtPosition(int position) {

		ListNode tempNode = headNode;

		int count = 1;

		if (count == position) {// This is for deleting the first Element
			headNode = headNode.next;
			return;
		}

		while (tempNode.next != null) {
			if ((count + 1) == position) {
				tempNode.next = tempNode.next.next;
			}
			if (count == position - 1)// This is for deleting the last element
				return;// so that we can avoid the NullPointerException
			else
				tempNode = tempNode.next;
			count++;
		}

	}

	public void addNode(ListNode newNode) {

		ListNode tempNode = headNode;

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

		ListNode tempNode = headNode;

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
		ListNode tempNode = headNode;

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

}
