package dwarki.exercise.java.leetcode.linkedlist;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

//Started @14:06 21-07-2021
//Ended @16:10 21-07-2021
public class AddTwoNumbers {

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		String reversedNode1 = nodeReversal(new MyLinkedList(l1));

		String reversedNode2 = nodeReversal(new MyLinkedList(l2));
		
		BigInteger sum = new BigInteger(reversedNode1).add(new BigInteger(reversedNode2));

		MyLinkedList solutionNodeList = new MyLinkedList();

		for (int i = sum.toString().length() - 1; i >= 0; i--) {

			char c = sum.toString().charAt(i);
			solutionNodeList.add(Integer.parseInt(String.valueOf(c)));
		}

		//solutionNodeList.show();

		return solutionNodeList.getNode();

	}

	public static String nodeReversal(MyLinkedList list) {

		MyLinkedList checkNodeList = new MyLinkedList(list.getNode());

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

		MyLinkedList list1 = new MyLinkedList();
		MyLinkedList list2 = new MyLinkedList();

		for (int i = 0; i < listArray1.length; i++)
			list1.add(listArray1[i]);

		for (int i = 0; i < listArray2.length; i++)
			list2.add(listArray2[i]);

		addTwoNumbers(list1.getNode(), list2.getNode());

	}

}
