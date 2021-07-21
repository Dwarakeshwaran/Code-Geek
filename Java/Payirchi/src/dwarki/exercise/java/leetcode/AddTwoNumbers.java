package dwarki.exercise.java.leetcode;

//Started @17:44 20-07-2021
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

}

class MyLinkedList {

	ListNode node = new ListNode();

	public MyLinkedList() {
		super();
	}

	public MyLinkedList(ListNode node) {
		this.node = node;
	}

	public void add(int number) {

		ListNode head = node;

		while (head.nextNode != null)
			head = head.nextNode;
		head.nextNode = new ListNode(number);
	}

	public void print() {

		ListNode head = node;

		while (head.nextNode != null) {
			System.out.println(head.data);
			head = head.nextNode;
		}
		System.out.println(head.data);
	}

	public void delete(int number) {

		ListNode head = node;

		while (head.nextNode != null) {

			if (head.nextNode.data == number) {
				head.nextNode = head.nextNode.nextNode;
				break;
			}
			head = head.nextNode;
		}
	}

	public void update(int position, int number) {

		ListNode head = node;
		int count = 1;

		while (head.nextNode != null) {

			if (count == position) {
				head.data = number;
			}
			count++;
			head = head.nextNode;
		}

	}
	
	public void add(int position, int number) {
		
		ListNode head = node;
		int count = 0;
		
		while(head.nextNode!=null) {
			
			if(++count == position-1) {
				ListNode node = new ListNode(number);
				node.nextNode = head.nextNode;
				head.nextNode = node;
				break;
			}
			head = head.nextNode;
		}
	}
	
	public void size() {
		
		ListNode head = node;
		int count = 0;
		
		while(head.nextNode!=null) {
			count++;
			head = head.nextNode;
		}
		System.out.println("Size: " + (count+1));
	}
}

public class AddTwoNumbers {

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		return null;

	}

	public static void main(String[] args) throws Exception {

		ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3, null)));
		ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));

		MyLinkedList l3 = new MyLinkedList(l1);

		l3.add(10);
		l3.add(11);
		l3.delete(11);
		l3.update(2, 5);
		
		MyLinkedList l4 = new MyLinkedList(new ListNode(1));
		
		l4.add(2);
		l4.add(4);
		l4.add(5);
		l4.add(3, 3);
		l3.size();
		l3.print();

		addTwoNumbers(l1, l2);
		

	}

}
