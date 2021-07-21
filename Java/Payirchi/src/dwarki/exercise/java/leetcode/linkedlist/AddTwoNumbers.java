package dwarki.exercise.java.leetcode.linkedlist;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//Started @14:06 21-07-2021
//Ended @16:10 21-07-2021
class ListNode {

	int data;
	ListNode nextNode;

	public ListNode() {
		super();
	}

	public ListNode(int data) {
		super();
		this.data = data;
	}

	public ListNode(int data, ListNode node) {
		super();
		this.data = data;
		this.nextNode = node;
	}

	public void add(int number) {

		ListNode head = this;

		while (head.nextNode != null)
			head = head.nextNode;
		head.nextNode = new ListNode(number);
	}

	public void print() {

		ListNode head = this;
			
		while (head.nextNode != null) {
			System.out.print(head.data + " ");
			head = head.nextNode;
		}
		System.out.print(head.data);
		System.out.println(" ");
	}

	public void delete(int number) {

		ListNode head = this;

		while (head.nextNode != null) {
			if (head.nextNode.data == number) {
				head.nextNode = head.nextNode.nextNode;
				break;// If we don't use this break, then the head=head.nextNode will assign null to
						// head
			} // and that will throw NullPointerException
			head = head.nextNode;
		}

	}

	public int size() {
		ListNode head = this;

		int count = 0;

		while (head.nextNode != null) {
			head = head.nextNode;
			count++;
		}

		return (count + 1);
	}

}

public class AddTwoNumbers {

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		String reversedNode1 = nodeReversal(l1);
		String reversedNode2 = nodeReversal(l2);

		Integer sum = Integer.parseInt(reversedNode1) + Integer.parseInt(reversedNode2);

		char lastDigit = sum.toString().charAt(sum.toString().length() - 1);

		ListNode solutionNode = new ListNode(Integer.parseInt(String.valueOf(lastDigit)));

		// sum.toString().length() - 2 -> this is to ignore the lastDigit as we already
		// added it to ListNode.
		for (int i = sum.toString().length() - 2; i >= 0; i--) {
			char c = sum.toString().charAt(i);

			solutionNode.add(Integer.parseInt(String.valueOf(c)));
		}

		return solutionNode;

	}

	public static String nodeReversal(ListNode node) {

		ListNode duplicateNode = node;

		ListNode checkNode = node;

		ListNode endNode;

		StringBuffer reversedString = new StringBuffer();

		while (checkNode.size() > 1) {
			while (checkNode.nextNode != null) {
				checkNode = checkNode.nextNode;
			}
			/* Getting the last Node by traversing the copied Node(checkNode) to the last */
			endNode = checkNode;
			/*
			 * Since we want reverse value, we get the value from the endNote and appending
			 * it in an immutable string variable.
			 */
			reversedString.append(endNode.data);
			/*
			 * Deleting the the last Node from the Duplicate Node and saving it to checkNode
			 */
			duplicateNode.delete(endNode.data);
			/*
			 * Now this will perform the check again and will get the value of last before
			 * node. (which is now deleted)
			 */
			checkNode = duplicateNode;
		}

		reversedString.append(checkNode.data);

		// System.out.println(reversedString);

		// checkNode.print();

		return reversedString.toString();
	}

	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int[] listArray1 = Arrays.stream(reader.readLine().split(",")).mapToInt(Integer::parseInt).toArray();
		int[] listArray2 = Arrays.stream(reader.readLine().split(",")).mapToInt(Integer::parseInt).toArray();

		ListNode l1 = new ListNode(listArray1[0]);
		ListNode l2 = new ListNode(listArray2[0]);

		for (int i = 1; i < listArray1.length; i++)
			l1.add(listArray1[i]);

		for (int i = 1; i < listArray2.length; i++)
			l2.add(listArray2[i]);

		/*
		 * l1.print(); l2.print();
		 */

		addTwoNumbers(l1, l2).print();

	}

}
