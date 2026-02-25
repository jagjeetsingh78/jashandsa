package heaps;

public class arraysimplementation {

    static class Heap {
        int[] arr;
        int size;

        // Constructor
        public Heap(int capacity) {
            arr = new int[capacity + 1]; // 1-based indexing
            size = 0;
        }

        // Peek minimum element
        public int peek() {
            if (size == 0) {
                System.out.println("Heap is empty");
                return -1;
            }
            return arr[1];
        }

        // Insert element
        public void add(int element) {
            if (size == arr.length - 1) {
                System.out.println("Heap is full");
                return;
            }

            size++;
            arr[size] = element;

            // Up-heapify
            int curr = size;
            while (curr > 1 && arr[curr] < arr[curr / 2]) {
                swap(curr, curr / 2);
                curr /= 2;
            }
        }

        // Remove min element
        public int remove() {
            if (size == 0) {
                System.out.println("Heap is empty");
                return -1;
            }

            int removed = arr[1];
            arr[1] = arr[size];
            size--;

            // Down-heapify
            int curr = 1;

            while (2 * curr <= size) {
                int left = 2 * curr;
                int right = 2 * curr + 1;
                int smaller = left;

                if (right <= size && arr[right] < arr[left]) {
                    smaller = right;
                }

                if (arr[curr] > arr[smaller]) {
                    swap(curr, smaller);
                    curr = smaller;
                } else {
                    break;
                }
            }

            return removed;
        }

        // Display heap elements
        public void display() {
            if (size == 0) {
                System.out.println("Heap is empty");
                return;
            }

            System.out.print("Heap elements: ");
            for (int i = 1; i <= size; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        // Swap helper
        private void swap(int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    // Main method to test heap
    public static void main(String[] args) {

        Heap heap = new Heap(10);

        heap.add(20);
        heap.add(5);
        heap.add(15);
        heap.add(23);

        heap.display();   // 👈 display heap

        System.out.println("Min element: " + heap.peek());

        System.out.println("Removed: " + heap.remove());
        heap.display();

        System.out.println("Removed: " + heap.remove());
        heap.display();
    }
}