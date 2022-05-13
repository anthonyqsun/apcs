import java.util.ArrayList;

public class ArrayPriorityQueue implements PriorityQueue {
    ArrayList<Integer> queue;

    public ArrayPriorityQueue() {
        queue = new ArrayList<Integer>();
    }

    public void add(int x) {
        queue.add(x);
    }

    public boolean isEmpty() {
        return queue.size() == 0;
    }

    public int peekMin() {
        return queue.get(getMinIndex());
    }

    public int removeMin() {
        return queue.remove(getMinIndex());
    }

    private int getMinIndex() {
        if (isEmpty()) return -1;
        int small = 0;
        for (int i = 0; i < queue.size(); i++) {
            if (queue.get(i) < queue.get(small)) small = i;
        }
        return small;
    }

    public String toString(){
        String ret = "";
        for (int i : queue) {
            ret += i + " ";
        }
        return ret;
    }


    public static void main(String[] args) {
        ArrayPriorityQueue poo = new ArrayPriorityQueue();
        poo.add(5);
        poo.add(3);
        poo.add(4);
        poo.add(7);
        poo.add(8);
        poo.add(1);
        System.out.println("poo: "+  poo);

        System.out.println();
        System.out.println("min: " + poo.peekMin());
        System.out.println("removeMin: " + poo.removeMin());
        System.out.println("min: " + poo.peekMin());
        System.out.println("removeMin: " + poo.removeMin());
        System.out.println("min: " + poo.peekMin());
        System.out.println("removeMin: " + poo.removeMin());

        System.out.println();
        System.out.println("poo: "+  poo);
    }

}