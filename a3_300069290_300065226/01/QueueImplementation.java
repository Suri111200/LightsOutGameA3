import java.util.ArrayList;

public class QueueImplementation<E> implements Queue<E> {

 // YOUR CODE HERE

	private ArrayList<E> queue;

	public QueueImplementation(){
		queue = new ArrayList<E>();
	}

	public void enqueue(E e) {
		queue.add(e);
	}

	public E dequeue () {
		return queue.remove(0);
	}

	public boolean isEmpty(){
		return queue.size() == 0;
	}

	public int size(){
		return queue.size();
	}

	public E peek(){
		return queue.get(0);
	}

}
