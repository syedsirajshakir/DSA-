package com.example.linkedelist;

public class SinglyLinkedList {
	
	public Node head;
	public Node tail;
	public int size;
	
	//Creation Singly Linked List
	public Node createSinglyLinkedList(int nodeValue) {
		head=new Node();
		Node node=new Node();
		node.next=null;
		node.value=nodeValue;
		head=node;
		tail=node;
		size=1;
		return head;
	}
	
	//Insertion Method in Singly Linked List
	public void inserLinkedList(int nodeValue,int location) {
		Node node =new Node();
		node.value=nodeValue;
		if(head==null) {
			createSinglyLinkedList(nodeValue);
			return;
		}
		else if(location==0) {
			node.next=head;
			head=node;
		}
		else if(location>=size) {
			node.next=null;
			tail.next=node;
			tail=node;
		}
		else {
			Node tempNode=head;
			int index=0;
			while(index<location-1) {
				tempNode=tempNode.next;
				index++;
			}
			Node nextNode=tempNode.next;
			tempNode.next=node;
			node.next=nextNode;
		}
		size++;
	}
	
	// Treavesal Linked List
	public void traverseSinglyLinkedList() {
		if(head==null) {
			System.out.println("SLL does not exit");
		}
		else {
			Node tempNode = head;
			for(int i=0;i<size;i++) {
				System.out.print(tempNode.value);
				if(i !=size-1) {
					System.out.print(" -> ");
				}
				tempNode=tempNode.next;
			}
		}
		System.out.println("\n");
	}
	
	//Searching in the Linked List
	boolean searchNode(int nodeValue) {
		if(head!=null) {
		Node tempNode=head;
		for(int i=0;i<size;i++) {
			if(tempNode.value==nodeValue) {
				System.out.println("Found @ the location "+i);
				return true;
			}
			tempNode=tempNode.next;
		}
		}
		System.out.println("Node not found");
		return false;
	}
	
	public void deleteNode(int location) {
		if(head==null) {
			System.out.println("SLL Does Not Contain");
		}
		else if(location==0) {
			head=head.next;
			size--;
			if(size==0) {
				tail=null;
			}
		}
		else if(location>=size) {
			Node tempNode=head;
			for(int i=0;i<size-1;i++) {
				tempNode=tempNode.next;
			}
			if(tempNode==head) {
				tail=head=null;
				size--;
				return;
			}
			tempNode.next=null;
			tail=tempNode;
			size--;
		}
		else {
			Node tempNode=head;
			for(int i=0;i<location-1;i++) {
				tempNode=tempNode.next;
			}
			tempNode.next=tempNode.next.next;
			size--;
		}
	}
	  // push to Linked List
	  public void push(int nodeValue){
	        if(head==null){
	        	createSinglyLinkedList(nodeValue);
	            return;
	        }
	        else{
	        Node node =new Node();
	        node.value=nodeValue;
	        node.next=null;
	        tail.next=node;
	        tail=node;
	        size++;
	        }
	    }
	
	
	
	public static void main(String arg[]) {
		SinglyLinkedList sll=new SinglyLinkedList();
		sll.createSinglyLinkedList(5);
		System.out.println(sll.head.value);
		sll.inserLinkedList(6,0);
		sll.inserLinkedList(8, 3);
		sll.inserLinkedList(7, 1);
		sll.inserLinkedList(3, 4);
		sll.inserLinkedList(9, 2);
		sll.inserLinkedList(10, 5);
		sll.inserLinkedList(11, 3);
		sll.traverseSinglyLinkedList();
		sll.searchNode(3);
		sll.deleteNode(1);
		sll.traverseSinglyLinkedList();
	}

}
