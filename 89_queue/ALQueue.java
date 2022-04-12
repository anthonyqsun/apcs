/*
Watermelon: Justin, Anthony, Jomin
apcs pd7
hw89: queue with arraylist and linkedlist
2022-04-11
time spent: 0.2 hr + class time
*/

/*
DISCO:
- If we want ALQueue to have constant time functions, it will eventually take up a lot of memory.
QCC:
- is there any advantage of using ALQueue over LLQueue?
*/


import java.util.ArrayList;

public class ALQueue<T> implements Queue<T> {
    ArrayList<T> list;
    int headIndex;
    public ALQueue() {
        list = new ArrayList<T>();
        headIndex = 0;
    }

    public void enqueue(T x) { //passthru fx
        list.add(x);
    }

    public T dequeue() {
        if (isEmpty()) return null;
        headIndex++;
        return list.get(headIndex-1);
    }

    public boolean isEmpty() {
        return (list.size()-headIndex == 0);
    }

    public T peekFront() {
        return list.get(headIndex);
    }
}
