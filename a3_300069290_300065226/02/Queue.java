public interface Queue<E> {
 
 // YOUR CODE HERE

	boolean isEmpty();

	void enqueue (E e);

	E dequeue();

	E peek();

	int size();
}
