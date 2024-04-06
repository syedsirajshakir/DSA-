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
	
	
	
	public static void main(String arg[]) {
		SinglyLinkedList sll=new SinglyLinkedList();
		sll.createSinglyLinkedList(5);
		System.out.println(sll.head.value);
		sll.inserLinkedList(6, 2);
		sll.inserLinkedList(8, 3);
		sll.inserLinkedList(7, 1);
		sll.inserLinkedList(3, 4);
		sll.inserLinkedList(9, 5);
		sll.traverseSinglyLinkedList();
	}

}
