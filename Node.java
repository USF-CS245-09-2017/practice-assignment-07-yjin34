
// this is the Node class for Linkedlist
public class Node<T>
{
	T data;
	Node next;

	//constuctor of a Node
	Node(T data)
	{
		this.data = data;
	}

	// return the next Node of the current Node
	public Node toNext()
	{
		return this.next;
	}

	// return the data of the Node
	public T getData()
	{
		return data;
	}

	// the same as the toNext(), return the next Node of the current Node
	public Node getNext()
	{
		return next;
	}

	//set the next Node
	public void setNext(Node next)
	{
		this.next = next;
	}


}