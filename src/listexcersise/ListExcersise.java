package listexcersise;
public class ListExcersise {
	Node head;

	public void add(String data) {
		if (this.head == null) {
			Node newNode = new Node(data);
			this.head = newNode;
		} else {
			Node newNode = new Node(data);
			// set this new node as next in the previous node
			// set this new node as the first so the head is now next
			newNode.next = this.head;
			this.head = newNode;
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		ListExcersise myTest = new ListExcersise();
		myTest.add("kurt");
		System.out.println(myTest.head.getData());
		myTest.add("Verner");
		System.out.println(myTest.head.getData());
		myTest.add("Odense");
		System.out.println(myTest.head.getData());
	}

	

}

class Node {
	String data;
	Node next;

	Node(String d) { 
		this.data = d;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	public Node getNext() {
		return this.next;
	}
	public String getData() {
		return this.data;
	}
	
}