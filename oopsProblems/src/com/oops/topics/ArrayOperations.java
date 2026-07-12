package com.oops.topics;

public class ArrayOperations {
	int [] arr;
	int size, capacity;
	
	public ArrayOperations(int capacity) {
		this.capacity = capacity; 	 //This.capacity referring to variable declared outside constructor
		arr = new int[capacity];
		size =0;
	}
	
	void insertAtTheEnd(int ele) {
		arr[size++] = ele;		//insert at arr[size] and increment size by 1
	}
	
	void insertAtIndex(int ele, int index) {
		if(size==capacity) // if there is only one line inside the loop or conditional statement, 
			return;
		for(int i=size-1;i>=index;i--) {
			arr[i+1] = arr[i]; 			// shifting all the elements one step right starting from last element
			}
		arr[index] = ele; 				// inserting value at the given index
		size++;							 // incrementing the size by 1.

		}
	
	int deleteAtTheEnd() {
		int ele =arr[size-1];
		arr[size-1]= 0;			// last value of index made 0 and reduce the size by 1
		size--;
		return ele;
	}
	
	int deleteAtIndex(int index) {
		if(index>=size)
			return-1;
		int deletedElement = arr[index];
		for(int i = index;i<size;i++)
			arr[i] = arr[i+1];		//replacing value at index with its adjacent value
		size--;
		return deletedElement; // returning the deleted value.can print it or store it in other variable
		}
	void traversal() {
		System.out.println("\nArray: ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+ " ");
			}
		System.out.println("\n"); 
		}
	
	public static void main(String[] args) {
		ArrayOperations ob = new ArrayOperations(10);
		ob.insertAtTheEnd(20);
		ob.insertAtTheEnd(1);
		ob.insertAtTheEnd(3);
		ob.insertAtTheEnd(14);
		ob.insertAtTheEnd(32);
		ob.insertAtTheEnd(67);
		ob.insertAtIndex(15, 1);
		ob.traversal();
		
		System.out.println("deleted value is: "+ob.deleteAtIndex(2));
		ob.traversal();
		}
	}
