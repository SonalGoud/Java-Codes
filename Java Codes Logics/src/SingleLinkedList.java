
class SingleList{
	static Node head;
	static Node last;
	public class Node{
	 	public int data;
	 	public Node next;
	 	public Node(int d) {
			this.data = d;
		}
	}
	public void insert(int data, SingleList list){
		if(head == null) {
			list.head = new Node(data);
			last = head;
		}else {
			last.next = new Node(data);
			last = last.next;
		}
	}
	
	public static void display(SingleList list) {
		Node n = head;
		while(n!=null) {
			System.out.print(n.data+" ");
			n = n.next;
		}
	}
}

public class SingleLinkedList {
	public static void main(String args[]) {
		SingleList list = new SingleList();
		list.insert(10, list);
		list.insert(20, list);
		list.insert(30, list);
		list.insert(40, list);
		list.insert(50, list);
		list.insert(60, list);
		SingleList.display(list);
		}
}