package dwarki.exercise.java.leetcode.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RemoveDuplicatesFromSortedList {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int[] intArray = Arrays.stream(reader.readLine().split(",")).mapToInt(Integer::parseInt).toArray();

		TempLinkedList list = new TempLinkedList();

		for (int i : intArray)
			list.add(i);

		new TempLinkedList(deleteDuplicates(list.getNode())).show();

	}

	public static ListNode deleteDuplicates(ListNode head) {

		return head;
	}
}

