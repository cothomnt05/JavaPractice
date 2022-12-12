package javap;

public class Ex06_Merge_Two_Sorted_List {
	public static class Node {
		int data;
		Node next;
	}

	public static Node newNode(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;

		return newNode;
	}

	public static Node newNode(int[] arr) {
		Node head = newNode(arr[0]);

		Node current = head;

		for (int i = 1; i < arr.length; i++) {
			current.next = newNode(arr[i]);
			current = current.next;
		}

		return head;
	}

	public static Node merge(Node n1, Node n2) {
		if (n1 == null) {
			return n2;
		}
		if (n2 == null) {
			return n1;
		}
		if (n1.data < n2.data) {
			n1.next = merge(n1.next, n2);
			return n1;
		} else {
			n2.next = merge(n1, n2.next);
			return n2;
		}
	}

	public static void display(Node node) {
		while (node != null) {
			System.out.print(node.data + "->");
			node = node.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int[] s = { 1, 2, 4 };
		int[] t = { 1, 2, 5 };
		Node head1 = newNode(s);
		Node head2 = newNode(t);
		display(head1);
		display(head2);
		Node mergeNode = merge(head1, head2);
		display(mergeNode);
	}

}
