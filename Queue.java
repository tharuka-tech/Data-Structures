package graphTest;

public class Queue {
	private int[] queue;
    private int front, rear, size, capacity;

    // Constructor to initialize the queue
    public Queue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Method to add an element to the queue
    public void enqueue(int item) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
    }

    // Method to remove and return an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int item = queue[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Method to get the size of the queue
    public int size() {
        return size;
    }

    // Method to display the elements of the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            System.out.print(queue[index] + " ");
        }
        System.out.println();
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue queue = new Queue(5);

        // Enqueue elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
       

        // Display the queue
        queue.display();

        // Dequeue elements
        System.out.println("Dequeued element: " + queue.dequeue());

        // Display the queue after dequeue
        queue.display();

        // Enqueue more elements
        queue.enqueue(60);
        queue.enqueue(70);

        // Display the queue after enqueue
        queue.display();
	}

}
