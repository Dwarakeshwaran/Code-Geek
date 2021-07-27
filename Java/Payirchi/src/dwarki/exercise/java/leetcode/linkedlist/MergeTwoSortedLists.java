package dwarki.exercise.java.leetcode.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//Started @14:11 23-07-2021
//Ended @15:15 23-07-2021
public class MergeTwoSortedLists {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int[] intArray1 = Arrays.stream(reader.readLine().split(",")).mapToInt(Integer::parseInt).toArray();
		int[] intArray2 = Arrays.stream(reader.readLine().split(",")).mapToInt(Integer::parseInt).toArray();

		MyLinkedList list1 = new MyLinkedList();
		MyLinkedList list2 = new MyLinkedList();

		for (int i : intArray1)
			list1.add(i);

		for (int i : intArray2)
			list2.add(i);

		mergeTwoLists(list1.getNode(), list2.getNode());

	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		MyLinkedList mergedList = new MyLinkedList();

		mergedList.addNode(l1);
		mergedList.addNode(l2);

		MyLinkedList sortedList = new MyLinkedList();

		sortedList = sortList(mergedList);

		return sortedList.getNode();

	}

	public static MyLinkedList sortList(MyLinkedList list) {

		int minimumNumber;
		int count = list.size();

		MyLinkedList resultantList = new MyLinkedList();

		while (count != resultantList.size()) {

			minimumNumber = list.getMinimum();
			list.remove(minimumNumber);
			resultantList.add(minimumNumber);
		}

		resultantList.show();

		return resultantList;
	}

}


