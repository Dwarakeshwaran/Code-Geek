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

		MyLinkedList list = new MyLinkedList();

		for (int i : intArray)
			list.add(i);

		swapPairs(list.getNode());

	}

	public static ListNode swapPairs(ListNode head) {

		MyLinkedList list = new MyLinkedList(head);

		list.swapAdjacentNodesInPairs();

		head = list.getNode();

		//new MyLinkedList(head).show();

		return head;

	}

}

