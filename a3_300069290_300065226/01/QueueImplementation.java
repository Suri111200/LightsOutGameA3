public class QueueImplementation<E> implements Queue<E> {

 // YOUR CODE HERE

	private Queue[] queue;

	public QueueImplementation(){

		queue = new Queue[];
	}

	//enqueue: creates new temp array, loads all data onto it
	//changes size of original array, loads all data back onto it, includes new data

	public void enqueue(Queue value) {

		Queue[] temp = new Queue[queue.length+1];

		for(int i=0; i< queue.length; i++){
			temp[i] = queue[i];
		}

		queue = new Queue [temp.length];

		for(int i=0; i< temp.length-1; i++){
			queue[i]= temp[i];
		}

		queue[queue.length-1] = value;

	}
	//edequeue: creates new temp array, loads all data onto it except last index
	//saves last index seperately
	//changes size of original array, loads temp data onto it
	//returns last index form original array
	public Queue dequeue (){

		Queue[] temp = new Queue[queue.length-1];
		
		for(int i=0; i< queue.length-1; i++){
			temp[i] = queue[i];
		}

		Queue toReturn = queue[queue.length-1];
		
		queue = new Queue [temp.length];

		for(int i=0; i< temp.length; i++){
			queue[i]= temp[i];
		}		

		return toReturn;

	}


}
