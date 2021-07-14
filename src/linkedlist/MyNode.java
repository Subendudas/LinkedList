package linkedlist;

public class MyNode {

private int data;
private MyNode next;

public MyNode() {
	this.data = 0;
	this.next = null;
}

public MyNode(int d) {
	this.data = d;
	this.next = null;
}

public void setData(int d) {
	data = d;
}

public void setNext(MyNode n) {
	next = n;
}

public int getData() {
	return (data);
}

public MyNode getNext() {
	return (next);
}
}