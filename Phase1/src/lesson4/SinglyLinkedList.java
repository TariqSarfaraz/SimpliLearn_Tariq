package lesson4;

public class SinglyLinkedList 
{

	public static void main(String[] args) 
	{

		SinglyLinkedList list = new SinglyLinkedList();

		list.push(1);
		list.push(2);
		list.push(3);
		list.push(5);
		list.push(6);
		list.push(7);
		list.push(8);
		list.push(9);

		int key = 2; // key to delete

		System.out.println("Created Single Linked list is:");
		list.printList();

		list.deleteKey(key);

		System.out.println("\nSingle Linked List after Deletion is:");
		list.printList();
	}

	static Node head;

	class Node 
	{
		int data;
		Node next;

		Node(int d) 
		{
			data = d;
			next = null;
		}
	}

	/*
	 * Given a key, deletes all occurrence of the given key in linked list
	 */
	void deleteKey(int key) 
	{
		Node temp = head, prev = null;

		// If head node itself holds the key
		// or multiple occurrences of key
		while (temp != null && temp.data == key)
		{
			head = temp.next; // Changed head
			temp = head; // Change Temp
		}

		// Delete occurrences other than head
		while (temp != null) 
		{
			// Search for the key to be deleted,
			// keep track of the previous node
			// as we need to change 'prev->next'
			while (temp != null && temp.data != key) 
			{
				prev = temp;
				temp = temp.next;
			}

			// If key was not present in linked list
			if (temp == null)
				return;

			// Unlink the node from linked list
			prev.next = temp.next;

			// Update Temp for next iteration of outer loop
			temp = prev.next;
		}
	}

	/* Inserts a new Node at front of the list. */
	public void push(int new_data) 
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	/*
	 * This function prints contents of linked list starting from the given node
	 */
	public void printList() 
	{
		Node tnode = head;
		while (tnode != null) 
		{
			System.out.print(tnode.data + " ");
			tnode = tnode.next;
		}
	}

}
