package Oct30;

class Queue<T>{
	private static T front, rear, capacity;
	private static T queue[];

	Queue(T c) {
		front = rear = 0;
		capacity = c;
		queue = new int[capacity];
	}

	// function to insert an element
	// at the rear of the queue
	void enqueue(int data) {
		// check queue is full or not
		if (capacity == rear) {
			System.out.printf("\nQueue is full\n");
			return;
		}

		// insert element at the rear
		else {
			queue[rear] = data;
			rear++;
		}
		return;
	}

	boolean isEmpty() {
		return (front == rear);
	}

	int size() {
		return rear;
	}

	// function to delete an element
	// from the front of the queue
	void dequeue() {
		// if queue is empty
		if (front == rear) {
			System.out.printf("\nQueue is empty\n");
			return;
		}

		else {
			for (int i = 0; i < rear - 1; i++) {
				queue[i] = queue[i + 1];
			}

			// store 0 at rear indicating there's no element
			if (rear < capacity)
				queue[rear] = 0;

			// decrement rear
			rear--;
		}
		return;
	}

	public void display() {
		int i;

		for (i = front; i < rear; i++) {
			System.out.print(queue[i] + " ");
		}
		System.out.println();
	}
	
	

}
public class Josephus {
public static void main(String[] args) {
if (args.length >= 2) {
int n = Integer.parseInt(args[0]);
int m = Integer.parseInt(args[1]);

Queue<Integer>queue = new Queue<Integer>();
for (int i = 1; i <= n; i++)
queue.enqueue(i);
}
// As long as q is not empty: increment i;
// dequeue an element pos; if M divides i,
// write pos, otherwise enqueue pos.
while (!queue.isEmpty()) {
for (int i = 1; i < m - 1; i++)
queue.enqueue(queue.dequeue());
StdOut.print(queue.dequeue()+1);
}
StdOut.println();
}
}