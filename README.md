# Priority Queue using Java

A PriorityQueue is used when the objects are supposed to be processed based on the priority. It is known that a Queue follows the First-In-First-Out algorithm, but sometimes the elements of the queue are needed to be processed according to the priority, that’s when the PriorityQueue comes into play. 

The PriorityQueue is based on the priority heap. The elements of the priority queue are ordered according to the natural ordering, or by a Comparator provided at queue construction time, depending on which constructor is used.  

![image](https://user-images.githubusercontent.com/22562694/119924909-1138d600-bf92-11eb-9e73-67ee05a8b42a.png)

Few points on Priority Queue are as follows: 

PriorityQueue doesn’t permit null.
We can’t create PriorityQueue of Objects that are non-comparable
PriorityQueue are unbound queues.
The head of this queue is the least element with respect to the specified ordering. If multiple elements are tied for least value, the head is one of those elements — ties are broken arbitrarily.
Since PriorityQueue is not thread-safe, so java provides PriorityBlockingQueue class that implements the BlockingQueue interface to use in java multithreading environment.
The queue retrieval operations poll,  remove,  peek, and element access the element at the head of the queue.
It provides O(log(n)) time for add and poll methods.
It inherits methods from AbstractQueue, AbstractCollection, Collection and Object class.

Operations on PriorityQueue
Let’s see how to perform a few frequently used operations on the Priority Queue class.

1. Adding Elements: In order to add an element in a priority queue, we can use the add() method. The insertion order is not retained in the PriorityQueue. The elements are stored based on the priority order which is ascending by default.

2. Removing Elements: In order to remove an element from a priority queue, we can use the remove() method. If there are multiple such objects, then the first occurrence of the object is removed. Apart from that, the poll() method is also used to remove the head and return it.

3. Accessing the elements: Since Queue follows the First In First Out principle, we can access only the head of the queue. To access elements from a priority queue, we can use the peek() method.

4. Iterating the PriorityQueue: There are multiple ways to iterate through the PriorityQueue. The most famous way is converting the queue to the array and traversing using the for loop. However, the queue also has an inbuilt iterator which can be used to iterate through the queue.

