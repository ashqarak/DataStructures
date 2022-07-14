package com.practice;

public class StackScratchImpl {
	
	static class Node{
		String data;
		Node next;
		Node(String data){
			this.data = data;
			next = null;
		}
		
	}
	static class StackImpl{
		public static Node head;
		
		public static boolean isEmpty() {
			return head==null;
		}
		public static void push(String data) {
			Node newNode = new Node(data);
			if(isEmpty()) {
				head = newNode;
				return;
			}
			newNode.next = head;
			head = newNode;
		}
		public static String pop() {
			String top = head.data;
			if(isEmpty()) {
				System.out.println("Stack is empty");
				return "";
			}
			head = head.next;
			return top;
		}
		public static String peek() {
			if(isEmpty()) {
				System.out.println("Stack is empty");
				return "";
			}
			return head.data;
		}
		
	}

	public static void main(String[] args) {
		StackImpl s = new StackImpl();
		s.push("Hi");
		s.push("My");
		s.push("Name");
		s.push("is");
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
	}

}
