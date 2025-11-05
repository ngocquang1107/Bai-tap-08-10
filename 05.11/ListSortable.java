class ListSortable<E extends Comparable<E>> {
    private E[] list;
    private int size;

    public void add(E e) {
        if (size < list.length) {
            list[size++] = e;
        } else {
            System.out.println("Danh sách đã đầy!");
        }
    }

    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (list[j].compareTo(list[j + 1]) > 0) {
                    E temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(list[i]);
        }
    }
}
