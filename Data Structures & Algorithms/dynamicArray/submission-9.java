class DynamicArray {
    private int[] arr;
    private int length;
    private int capacity;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.length = 0;
        this.arr = new int[capacity];
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
        if(i >= length) this.length++;
    }

    public void pushback(int n) {
        if(this.length >= this.capacity) this.resize();

        arr[length] = n;
        this.length++;
    }

    public int popback() {
        return arr[--length];
    }

    private void resize() {
        int[] newArr = new int[capacity*2];
        for(int i = 0; i < this.length; i++) {
            newArr[i] = arr[i];
        }
        this.arr = newArr;
        this.capacity = capacity * 2;
    }

    public int getSize() {
        return this.length;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
