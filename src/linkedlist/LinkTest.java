package linkedlist;

public class LinkTest 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to LinkedList program:");
		MyNode myFirstNode = new MyNode(56);
		MyNode mySecondNode = new MyNode(30);
		MyNode myThirdNode = new MyNode(70);
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		System.out.println(myFirstNode.getData() + "->" + mySecondNode.getData() + "->" + myThirdNode.getData());
	}
}
