# Java Interface

## List Interface

In Java, the List interface is an ordered collection that allows us to store and access elements sequentially.

**Declaration:**
```
// ArrayList implementation of List
List<String> list1 = new ArrayList<>();

// LinkedList implementation of List
List<String> list2 = new LinkedList<>();

// Stack implementation of List
List<String> list3 = new Stack<>();
```

**Methods:**
|Methods|Description|
|:----:|:----:|
|add()|adds an element to a list|
|addAll()|adds all elements of one list to another|
|get()|helps to randomly access elements from lists|
|iterator()|returns iterator object that can be used to sequentially access elements of lists|
|set()|changes elements of lists|
|remove()|removes an element from the list|
|removeAll()|removes all the elements from the list|
|clear()|removes all the elements from the list (more efficient than removeAll())|
|size()|returns the length of lists|
|toArray()|converts a list into an array|
|contains()|returns true if a list contains specific element|

### ArrayList

In Java, we use the ArrayList class to implement the functionality of resizable-arrays. In Java, we need to declare the size of an array before we can use it. Once the size of an array is declared, it's hard to change it. To handle this issue, we can use the ArrayList class. It allows us to create resizable arrays. Unlike arrays, arraylists can automatically adjust their capacity when we add or remove elements from them. Hence, arraylists are also known as dynamic arrays.

**Declaration:**
```
ArrayList<Type> arrayList= new ArrayList<>();
```

**Methods:**
|Method|Description|
|:----:|:----:|
|size()|Returns the length of the arraylist.|
|sort()|Sort the arraylist elements.|
|clone()|Creates a new arraylist with the same element, size, and capacity.|
|contains()|Searches the arraylist for the specified element and returns a boolean result.|
|ensureCapacity()|Specifies the total element the arraylist can contain.|
|isEmpty()|Checks if the arraylist is empty.|
|indexOf()|Searches a specified element in an arraylist and returns the index of the element.|

### Stack

The Java collections framework has a class named Stack that provides the functionality of the stack data structure. In stack, elements are stored and accessed in Last In First Out manner. That is, elements are added to the top of the stack and removed from the top of the stack.

**Declaration:**
```
Stack<Type> stacks = new Stack<>();
```

**Methods:**
|Method|Description|
|:----:|:----:|
|push()|To add an element to the top of the stack|
|pop()|To remove an element from the top of the stack|
|peek()|The peek() method returns an object from the top of the stack.|
|search()|To search an element in the stack, we use the search() method. It returns the position of the element from the top of the stack.|
|empty()|To check whether a stack is empty or not, we use the empty() method.|

### LinkedList

The LinkedList class of the Java collections framework provides the functionality of the linked list data structure. Each element in a linked list is known as a node. It consists of 3 fields:
Prev - stores an address of the previous element in the list. It is null for the first element
Next - stores an address of the next element in the list. It is null for the last element
Data - stores the actual data

**Declaration:**
```
LinkedList<Type> linkedList = new LinkedList<>();
```

**Methods:**
|Method|Description|
|:----:|:----:|
|add()|To add an element (node) at the end of the LinkedList.|
|get()|To access an element from the LinkedList.|
|set()|To change elements of the LinkedList.|
|remove()|To remove an element from the LinkedList.|
|contains()|checks if the LinkedList contains the element|
|indexOf()|returns the index of the first occurrence of the element|
|lastIndexOf()|returns the index of the last occurrence of the element|
|clear()|removes all the elements of the LinkedList|
|iterator()|returns an iterator to iterate over LinkedList|

## Queue Interface

The Queue interface of the Java collections framework provides the functionality of the queue data structure. It extends the Collection interface. In queues, elements are stored and accessed in First In, First Out manner. That is, elements are added from the behind and removed from the front.

**Declaration:**
```
// LinkedList implementation of Queue
Queue<String> animal1 = new LinkedList<>();

// Array implementation of Queue
Queue<String> animal2 = new ArrayDeque<>();

// Priority Queue implementation of Queue
Queue<String> animal3 = new PriorityQueue<>();
```

**Methods:**
|Method|Description|
|:----:|:----:|
|add() |Inserts the specified element into the queue. If the task is successful add() returns true, if not it throws an exception.|
|offer()| Inserts the specified element into the queue. If the task is successful offer() returns true, if not it returns false.|
|element() | Returns the head of the queue. Throws an exception if the queue is empty.|
|peek() | Returns the head of the queue. Returns null if the queue is empty.|
|remove() | Returns and removes the head of the queue. Throws an exception if the queue is empty.|
|poll() | Returns and removes the head of the queue. Returns null if the queue is empty.|

### LinkedList

Since the LinkedList class also implements the Queue and the Deque interface, it can implement methods of these interfaces as well.

**Methods:**
|Methods|Descriptions|
|:----:|:----:|
|addFirst()|adds the specified element at the beginning of the linked list|
|addLast()|adds the specified element at the end of the linked list|
|getFirst()|returns the first element|
|getLast()|returns the last element|
|removeFirst()|removes the first element|
|removeLast()|removes the last element|
|peek()|returns the first element (head) of the linked list|
|poll()|returns and removes the first element from the linked list|
|offer()|adds the specified element at the end of the linked list|

### PriorityQueue

The PriorityQueue class provides the functionality of the heap data structure. Unlike normal queues, priority queue elements are retrieved in sorted order. Suppose, we want to retrieve elements in the ascending order. In this case, the head of the priority queue will be the smallest element. Once this element is retrieved, the next smallest element will be the head of the queue. It is important to note that the elements of a priority queue may not be sorted. However, elements are always retrieved in sorted order.

**Declaration:**
```
PriorityQueue<Integer> numbers = new PriorityQueue<>();
```

**Methods:**
|Method|Description|
|:----:|:----:|
|add() | Inserts the specified element to the queue. If the queue is full, it throws an exception.|
|offer() | Inserts the specified element to the queue. If the queue is full, it returns false.|
|peek()|To access elements from a priority queue|
|remove() | removes the specified element from the queue|
|poll() | returns and removes the head of the queue|
|contains(element)|Searches the priority queue for the specified element. If the element is found, it returns true, if not it returns false.|
|size()|Returns the length of the priority queue.|
|toArray()|Converts a priority queue to an array and returns it.|

### ArrayDeque

In Java, we can use the ArrayDeque class to implement queue and deque data structures using arrays.

**Declaration:**
```
ArrayDeque<Type> animal = new ArrayDeque<>();
```

**Methods:**
|Method|Description|
|:----:|:----:|
|add() | inserts the specified element at the end of the array deque|
|addFirst() | inserts the specified element at the beginning of the array deque|
|addLast() | inserts the specified at the end of the array deque (equivalent to add())|
|offer() | inserts the specified element at the end of the array deque|
|offerFirst() | inserts the specified element at the beginning of the array deque|
|offerLast() | inserts the specified element at the end of the array deque|
|getFirst() | returns the first element of the array deque|
|getLast() | returns the last element of the array deque|
|peek() | returns the first element of the array deque|
|peekFirst() | returns the first element of the array deque (equivalent to peek())|
|peekLast() | returns the last element of the array deque|
|remove() | returns and removes an element from the first element of the array deque|
|remove(element) | returns and removes the specified element from the head of the array deque|
|removeFirst() | returns and removes the first element from the array deque (equivalent to remove())|
|removeLast() | returns and removes the last element from the array deque|
|poll() | returns and removes the first element of the array deque|
|pollFirst() | returns and removes the first element of the array deque (equivalent to poll())|
|pollLast() | returns and removes the last element of the array deque|
| clear()|To remove all the elements from the array deque|
|iterator() | returns an iterator that can be used to iterate over the array deque|
|descendingIterator() | returns an iterator that can be used to iterate over the array deque in reverse order|
|element()|Returns an element from the head of the array deque.|
|contains(element)|Searches the array deque for the specified element. If the element is found, it returns true, if not it returns false.|
|size()|Returns the length of the array deque.|
|toArray()|Converts array deque to array and returns it.|
|clone() |Creates a copy of the array deque and returns it.|
|push() | adds an element to the top of the stack|
|peek() | returns an element from the top of the stack|
|pop() | returns and removes an element from the top of the stack|

