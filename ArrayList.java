// the Arraylist class
public class ArrayList<T> implements List<T>
{
	T[] arr;
	int size;
	int count;
	
	//the constuctor of ArrayList, set the size to be 10, initate the arr and make the count to be 0 (count is the number of T that has been put inside the array)
	ArrayList()
	{
		size = 10;
		arr = (T[]) new Object[size];
		count  = 0;
	}

	// add an item to the end
	public void add(T item)
	{
		if (count == size)
		{
			grow_array();
		}
		arr[count] = item;
		count++;
	}

	// add an item to the position in the array
	public void add(int pos, T item)
	{
		Assert.notfalse(pos <= count && pos >= 0);
		if (count == size)
		{
			grow_array();
		}
		for (int i = count-1; i >= pos; i--)
		{
			arr[i+1] = arr[i];
		}
		arr[pos] = item;
		count++;
	}

	// get the data in the postion of the array
	public T get(int pos)
	{
		Assert.notfalse( pos>=0 && pos < count);
		return arr[pos];
	}

	// remove the item in the position of the array 
	public T remove(int pos)
	{
		Assert.notfalse(pos >= 0 && pos < count);
		if(count == size)
		{
			grow_array();
		}
		T data = arr[pos];
		for(int i = pos; i < count; i++ )
		{
			arr[i] = arr[i+1];
		}
		count--;
		return data;
	}

	// return the number of T that has been put inside the array
	public int size()
	{
		return count;
	}

	// to doublt the size of the array
	public void grow_array()
	{
		T[] newArr = (T[]) new Object[size*2];
		for(int i = 0; i < size; i++)
		{
			newArr[i] = arr[i];
		}
		arr = newArr;
		size = size*2;
	}
}