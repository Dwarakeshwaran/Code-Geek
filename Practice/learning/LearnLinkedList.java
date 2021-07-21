package learning;

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

	/*
	 * public void add(int number) {
	 * 
	 * //This will cause "The left-hand side of an assignment must be a variable"
	 * error when we try this inside a node class. while (this.nextNode != null)
	 * this = this.nextNode; this.nextNode = new ListNode(number); }
	 */

	public void add(int number) {

		ListNode duplicateNode = this;

		if (this == null)
			duplicateNode = new ListNode(number);

		while (duplicateNode.nextNode != null)
			duplicateNode = duplicateNode.nextNode;
		duplicateNode.nextNode = new ListNode(number);
	}

}

class MyLinkedList {

	ListNode headNode;

	public MyLinkedList() {
		super();
	}

	public MyLinkedList(ListNode node) {
		this.headNode = node;
	}

	public void add(int number) {

		ListNode duplicateNode = headNode;

		if (headNode == null) {
			headNode = new ListNode(number);
		}
		else
		{
			while (duplicateNode.nextNode != null)
				duplicateNode = duplicateNode.nextNode;
			duplicateNode.nextNode = new ListNode(number);
		}
		
	}

	public void print() {

		ListNode duplicateNode = headNode;
		
		while (duplicateNode.nextNode != null) {
			System.out.println(duplicateNode.data);
			duplicateNode = duplicateNode.nextNode;
		}
		System.out.println(duplicateNode.data);
	}

	public void delete(int number) {

		ListNode duplicateNode = headNode;

		while (duplicateNode.nextNode != null) {

			if (duplicateNode.nextNode.data == number) {
				duplicateNode.nextNode = duplicateNode.nextNode.nextNode;
				break;
			}
			duplicateNode = duplicateNode.nextNode;
		}
	}

	public void update(int position, int number) {

		ListNode duplicateNode = headNode;
		int count = 1;

		while (duplicateNode.nextNode != null) {

			if (count == position) {
				duplicateNode.data = number;
			}
			count++;
			duplicateNode = duplicateNode.nextNode;
		}

	}

	public void add(int position, int number) {

		ListNode duplicateNode = headNode;
		int count = 0;

		while (duplicateNode.nextNode != null) {

			if (++count == position - 1) {
				ListNode node = new ListNode(number);
				node.nextNode = duplicateNode.nextNode;
				duplicateNode.nextNode = node;
				break;
			}
			duplicateNode = duplicateNode.nextNode;
		}
	}

	public void size() {

		ListNode duplicateNode = headNode;
		int count = 0;

		while (duplicateNode.nextNode != null) {
			count++;
			duplicateNode = duplicateNode.nextNode;
		}
		System.out.println("Size: " + (count + 1));
	}
}

public class LearnLinkedList {

	public static void main(String[] args) throws Exception {

		ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3, null)));
		ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));

		new MyLinkedList(l2).print();

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

		ListNode l5 = new ListNode();

		System.out.println("-------------------");
		l5.add(15);
		l5.add(16);
		l5.add(17);

		MyLinkedList list = new MyLinkedList(l5);
		list.print();

		System.out.println("-------------------");
		MyLinkedList list2 = new MyLinkedList();

		list2.add(25);
		list2.add(35);
		list2.add(45);
		list2.print();
	}

}
