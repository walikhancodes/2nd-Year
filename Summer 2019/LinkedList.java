

public class LinkedList{
	private Node first;

	public LinkedList(){}

	public void addToFirst(int data){

		Node temp = new Node();
		temp.item = data;
		temp.next = first; 
		first = temp; 

	}
	public boolean isEmpty(){
		return first == null; 
	}

	public int removeFromFirst(){
		int data = first.item;
		first = first.next;
		return data; 
	}

	public void addToLast(int data){
		if(first == null){
			 Node y = new Node();
			 y.item = data;
			 y.next = null;
			 first = y;
			 return;
		}
		Node x;
		for(x = first; x.next != null; x = x.next);
		Node y = new Node();
		y.item = data;
		y.next = null;
		x.next = y;
	}

	public int removeFromFirst(){
		//if list is empty
		if(first == null{
			System.out.println("THe list is empty, nothing to delete");

		}
		// if there is only one Node on the list
		if(first.next == null){
			item temp = first.item;
			first = null;
			return temp;
		}

		Node x;
		for(x = first; x.next.next != null; x = x.next);
		int temp = x.next.item;
		x.next = null;
		return temp; 
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.addToLast(1);
		list.addToLast(2);
		list.addToLast(3);
		list.addToLast(4);

		System.out.println(list.first.item);
		System.out.println(list.first.next.item);
		System.out.println(list.first.next.next.item);
		System.out.println(list.first.next.next.next.item);
	}

	// public static void main(String[] args) {
	// 	LinkedList list = new LinkedList();

	// 	// list.first = new Node();
	// 	// list.first.item = 1; 

	// 	// Node second = new Node();
	// 	// list.first.next = second;
	// 	// second.item = 2; 

	// 	// Node third = new Node();
	// 	// second.next = third;
	// 	// third.item = 3; 
	// 	list.addToFirst(1);
	// 	list.addToFirst(2);
	// 	list.addToFirst(3);

	// 	System.out.println(list.first.item);
	// 	System.out.println(list.first.next.item);
	// 	System.out.println(list.first.next.next.item);

	// 	int value = list.removeFromFirst();
	// 	System.out.println("The returned value is: " + value);
	// 	System.out.println(list.first.item);
	// 	System.out.println(list.first.next.item);
	// 	//ERROR : System.out.println(list.first.next.next.item);


	// }
}

class Node {
	int item;
	Node next;


}