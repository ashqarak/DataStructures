package com.practice;

public class LinkedList {
	Node head;
	private int size;
	
	LinkedList(){
		size = 0;
	}
	class Node{
		Node next;
		String data;
		
		Node(String data){
			this.data = data;	
			this.next = null;
		}
	}
	
	public void addFirst(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			size++;
			return;
		}
		size++;
		newNode.next = head;
		head = newNode;
	}
	public void addLast(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			size++;
			return;
		}
		size++;
		Node currNode = head;
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;
	}
	
	public void printList() {
		if(head == null) {
			System.out.println("List is empty");
		}
		Node currNode = head;
		while(currNode != null) {
			System.out.print(currNode.data+"->");
			currNode = currNode.next;
		}
		System.out.println("Null");
	}
	public int getSize() {
		return size;
	}
	
	public void deleteLast() {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		size--;
		if(head.next == null) {
			head = null;
			return;
		}
		
		Node lastNode = head.next;
		Node secLast = head;
		while(lastNode.next != null) {
			lastNode = lastNode.next;
			secLast = secLast.next;
		}
		secLast.next = null;
	}
	
	public void deleteFirst() {
		if(head==null) {
			System.out.println("List is e	mpty");
			return;
		}
		
		head = head.next;
		size--;
	}
	
	public static void main(String [] args) {
		
		LinkedList list = new LinkedList();
		list.addFirst("Name");
		list.printList();
		list.addFirst("My");
		list.printList();
		list.addLast("is");
		list.printList();
		System.out.println(list.getSize());
		list.deleteLast();
		list.printList();
	}
}
