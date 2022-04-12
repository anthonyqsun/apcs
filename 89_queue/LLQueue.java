/*
Watermelon: Justin, Anthony, Jomin
apcs pd7
hw89: queue with arraylist and linkedlist
2022-04-11
time spent: 0.2 hr + class time
*/

/* 
DISCO:
- If we want ALQueue to have constant time functions, it will eventually take up
 a lot of memory.
QCC:
- is there any advantage of using ALQueue over LLQueue?
*/


import java.util.LinkedList;

public class LLQueue<T> implements Queue<T> {
    LinkedList<T> list;
    public LLQueue() {
        list = new LinkedList<T>();
    }

    public void enqueue(T x) { //passthru fx
        list.add(x);
    }

    public T dequeue() {
        if (isEmpty()) return null;
        return list.removeFirst();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public T peekFront() {
        return list.getFirst();
    }
}
