// the linklist class
public class LinkedList<T> implements List<T>
{
	Node head;
	int size;

	// the constuctor, set the head to null and size to 0
	public LinkedList()
	{
		head = null;
		size = 0;
	}

	// create a Node with its data to be item and connect it to the end 
	public void add(T item)
	{
		if (size == 0)
		{
			Node newNode = new Node(item);
			head = newNode;
			size++;
		}
		else
		{
			Node cur = head;
			while(cur.next != null)
			{
				cur = cur.toNext();
			}
			Node newNode = new Node(item);
			newNode.setNext(null);
			cur.setNext(newNode);
			size++;
		}

	}

	// create a node with its data to be item and connected it to the position
	public void add(int pos, T item)
	{
		Assert.notfalse(pos<=size && pos >= 0);
		if (pos == 0)
		{
			Node newNode = new Node(item);
			newNode.setNext(head);
			head = newNode;
			size++;
		}
		else
		{
			Node newNode = new Node(item);
			Node previous = head;
			for(int i = 0; i < pos-1; i++)
			{
				previous.toNext();
			}
			newNode.setNext(previous.getNext());
			previous.setNext(newNode);
			size++;
		}
	}

	//get the data of the Node in the position pos
	public T get(int pos)
	{
		Assert.notfalse(pos>=0 && pos < size);
		Node cur = head;
		for (int i = 0 ; i < pos; i++)
		{
			cur = cur.toNext();
		}
		return (T)cur.getData();
	}

	// remove the Node on the position pos and return its data
	public T remove(int pos)
	{
		Assert.notfalse(pos >= 0 && pos < size);
		if (pos == 0)
		{	
			Node cur = head;
			head = head.toNext();
			size--;
			return (T)cur.data;
		}
		else
		{
			Node previous = head;
			for (int i = 0; i < pos; i++)
			{
				previous.toNext();
			}
			Node cur = previous.getNext();
			previous.setNext(cur.getNext());
			size--;
			return (T)cur.getData();
		}
	}

	//return how many nodes that had been put inside the array
	public int size()
	{
		return size;
	}
}