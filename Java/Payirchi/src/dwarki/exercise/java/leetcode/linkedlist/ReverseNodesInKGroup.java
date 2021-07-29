package dwarki.exercise.java.leetcode.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//Started @15:46 28-07-2021
//Ended @17:29 28-07-2021
public class ReverseNodesInKGroup {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int[] intArray = Arrays.stream(reader.readLine().split(",")).mapToInt(Integer::parseInt).toArray();

		int limitPosition = Integer.parseInt(reader.readLine());

		MyLinkedList list = new MyLinkedList();

		for (int i : intArray)
			list.add(i);

		reverseGroup(list.getNode(), limitPosition);

	}

	public static ListNode reverseGroup(ListNode head, int k) {

		MyLinkedList list = new MyLinkedList(head);

		int jumpPoint = 0;

		while (size(head) >= k) {

			if (k == 1)
				return head;

			jumpPoint = jumpPoint + k;

			reverseNodesWithRespectToK(head, k);

			head = list.getJumpedHead(jumpPoint);

			// System.out.println(size(head));
		}

		list.show();

		return list.getNode();
	}

	public static void reverseNodesWithRespectToK(ListNode headNode, int position) {

		if (position == 0)
			return;

		ListNode tempNode = headNode;

		int count = 1;

		int temp;

		while (count < position) {

			if (tempNode.next == null)
				break;

			temp = tempNode.val;
			tempNode.val = tempNode.next.val;
			tempNode.next.val = temp;

			tempNode = tempNode.next;

			count++;
		}

		reverseNodesWithRespectToK(headNode, position - 1);

	}

	public static int size(ListNode headNode) {

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
