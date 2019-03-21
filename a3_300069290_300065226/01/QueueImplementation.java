import java.util.ArrayList;

public class QueueImplementation<E> implements Queue<E> {

 // YOUR CODE HERE

	private ArrayList<E> queue;

	public QueueImplementation(){

		queue = new ArrayList<E>();
	}

	//enqueue: creates new temp array, loads all data onto it
	//changes size of original array, loads all data back onto it, includes new data

	public void enqueue(E e) {
		queue.add(e);
	}
	//dequeue: creates new temp array, loads all data onto it except last index
	//saves last index seperately
	//changes size of original array, loads temp data onto it
	//returns last index form original array
	public E dequeue () {
		return queue.remove(0);
	}

	public boolean isEmpty()
	{
		return queue.size() == 0;
	}

	public int size()
	{
		return queue.size();
	}

	public E peek()
	{
		return queue.get(0);
	}

}
