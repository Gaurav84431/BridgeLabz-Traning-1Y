class CircularBuffer {
    int[] arr;
    int size, front, count;

    CircularBuffer(int size) {
        this.size = size;
        arr = new int[size];
    }

    void add(int x) {
        arr[(front + count) % size] = x;
        if (count == size) {
            front = (front + 1) % size;
        } else {
            count++;
        }
    }

    void display() {
        for (int i = 0; i < count; i++) {
            System.out.print(arr[(front + i) % size] + " ");
        }
    }
}