import java.util.*;
public class QueueEx
{
    public static  void  main(String args[])
    {
//1.Linked list
        java.util.Queue<Integer> q = new java.util.LinkedList<>();
/*
        q.add(10);
        q.add(20);
        q.add(30);
//add() sometimes through exception so use offer() instead of add()*/
        System.out.println("LinkedList");
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println(q);

//element() sometimes through exception so use peek() instead of element()
        //System.out.println(q.element());

        System.out.println(q.peek());
//remove() sometimes through exception so use poll() instead of remove()
        //System.out.println(q.remove());

        System.out.println(q.poll());
//2.ArrayDequeue
        System.out.println("ArrayDequeue");
        Deque<Integer> q1=new ArrayDeque<>();
        q1.offer(10);
        System.out.println(q1);
        q1.offerFirst(20);
        System.out.println(q1);
        q1.offerLast(30);
        System.out.println(q1);

        q1.peek();
        System.out.println(q1);
        q1.peekFirst();
        System.out.println(q1);
        q1.peekLast();
        System.out.println(q1);

        q1.poll();
        System.out.println(q1);
        q1.pollFirst();
        System.out.println(q1);
        q1.pollLast();
        System.out.println(q1);


        Deque<Integer> stack=new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("stack push"+stack);

        stack.pop();
        System.out.println("stack pop"+stack);

        stack.peek();
        System.out.println("stack peek"+stack);

//3.Priority Queue
Queue<Integer> pq=new PriorityQueue<>();
        System.out.println("priority queue");
        System.out.println("MinHeap(default)");
//default behavior->Integer->less value->high priority ->minHeap
//pq->String->comparator
        pq.offer(40);
        pq.offer(10);
        pq.offer(30);
        pq.offer(20);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq);


        //convert minHeap to max heap
        //integer->high value->high priority
        System.out.println("MaxHeap(converted)");
        Queue<Integer> pq1=new PriorityQueue<>((a,b)->b-a);
        pq1.offer(40);
        pq1.offer(10);
        pq1.offer(30);
        pq1.offer(20);

        System.out.println(pq1);
        System.out.println(pq1.poll());
        System.out.println(pq1);
        System.out.println(pq1.peek());
        System.out.println(pq1);

    }

}
