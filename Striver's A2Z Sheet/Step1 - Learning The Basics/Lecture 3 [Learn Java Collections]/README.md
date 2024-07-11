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

## Set Interface

The Set interface of the Java Collections framework provides the features of the mathematical set in Java. It extends the Collection interface. Unlike the List interface, sets cannot contain duplicate elements.

**Declaration:**
```
// Set implementation using HashSet
Set<String> animals1 = new HashSet<>();

// Set implementation using LinkedHashSet
Set<String> animals2 = new LinkedHashSet<>();

// Set implementation using TreeSet
Set<String> animals3 = new TreeSet<>();
```

**Methods:**
|Method|Description|
|:----:|:----:|
|add() | adds the specified element to the set|
|addAll() | adds all the elements of the specified collection to the set|
|iterator() | returns an iterator that can be used to access elements of the set sequentially|
|remove() | removes the specified element from the set|
|removeAll() | removes all the elements from the set that is present in another specified set|
|retainAll() | retains all the elements in the set that are also present in another specified set|
|clear() | removes all the elements from the set|
|size() | returns the length (number of elements) of the set|
|toArray() | returns an array containing all the elements of the set|
|contains() | returns true if the set contains the specified element|
|containsAll() | returns true if the set contains all the elements of the specified collection|
|hashCode() | returns a hash code value (address of the element in the set)|


**Operations:**
Union - to get the union of two sets x and y, we can use x.addAll(y)
Intersection - to get the intersection of two sets x and y, we can use x.retainAll(y)
Subset - to check if x is a subset of y, we can use y.containsAll(x)

### HashSet

Implements Set Interface. The underlying data structure for HashSet is Hashtable. As it implements the Set Interface, duplicate values are not allowed. Objects that you insert in HashSet are not guaranteed to be inserted in the same order. Objects are inserted based on their hash code. NULL elements are allowed in HashSet. HashSet also implements Serializable and Cloneable interfaces.

**Declaration:**
```
HashSet<ArrayList> set = new HashSet<>();
```

**Methods:**
|Method|Description|
|:----:|:----:|
|add(E e)|Used to add the specified element if it is not present, if it is present then return false.|
|clear()|Used to remove all the elements from the set.|
|contains(Object o)|Used to return true if an element is present in a set.|
|remove(Object o)|Used to remove the element if it is present in set.|
|iterator()| Used to return an iterator over the element in the set.|
|isEmpty()|Used to check whether the set is empty or not. Returns true for empty and false for a non-empty condition for set.|
|size()|Used to return the size of the set.|
|clone()  |Used to create a shallow copy of the set.|

### LinkedHashSet

The LinkedHashSet class of the Java collections framework provides functionalities of both the hashtable and the linked list data structure. It implements the Set interface. Elements of LinkedHashSet are stored in hash tables similar to HashSet. However, linked hash sets maintain a doubly-linked list internally for all of its elements. The linked list defines the order in which elements are inserted in hash tables.

**Declaration:**
```
LinkedHashSet<Integer> numbers = new LinkedHashSet<>(8, 0.75);
```

**Methods:**
Similar to HashSet

### TreeSet

TreeSet is one of the most important implementations of the SortedSet interface in Java that uses a Tree for storage. The ordering of the elements is maintained by a set using their natural ordering whether or not an explicit comparator is provided. This must be consistent with equals if it is to correctly implement the Set interface. 

**Declaration:**
```
TreeSet<String> treeSet = new TreeSet<>();
```

**Methods:**
|Method|Description|
|:----:|:----:|
|add(Object o)|This method will add the specified element according to the same sorting order mentioned during the creation of the TreeSet. Duplicate entries will not get added.|
|addAll(Collection c)|This method will add all elements of the specified Collection to the set. Elements in the Collection should be homogeneous otherwise ClassCastException will be thrown. Duplicate Entries of Collection will not be added to TreeSet.|
|ceiling?(E e)|This method returns the least element in this set greater than or equal to the given element, or null if there is no such element.|
|clear()|This method will remove all the elements.|
|clone()|The method is used to return a shallow copy of the set, which is just a simple copied set.|
|Comparator comparator()|This method will return the Comparator used to sort elements in TreeSet or it will return null if the default natural sorting order is used.|
|contains(Object o)|This method will return true if a given element is present in TreeSet else it will return false.|
|descendingIterator?()|This method returns an iterator over the elements in this set in descending order.|
|descendingSet?()|This method returns a reverse order view of the elements contained in this set.|
|first()|This method will return the first element in TreeSet if TreeSet is not null else it will throw NoSuchElementException.|
|floor?(E e)|This method returns the greatest element in this set less than or equal to the given element, or null if there is no such element.|
|headSet(Object toElement)|This method will return elements of TreeSet which are less than the specified element.|
|higher?(E e)|This method returns the least element in this set strictly greater than the given element, or null if there is no such element.|
|isEmpty()|This method is used to return true if this set contains no elements or is empty and false for the opposite case.|
|Iterator iterator()|Returns an iterator for iterating over the elements of the set.|
|last()|This method will return the last element in TreeSet if TreeSet is not null else it will throw NoSuchElementException.|
|lower?(E e)|This method returns the greatest element in this set strictly less than the given element, or null if there is no such element.|
|pollFirst?()|This method retrieves and removes the first (lowest) element, or returns null if this set is empty.|
|pollLast?()|This method retrieves and removes the last (highest) element, or returns null if this set is empty.|
|remove(Object o)|This method is used to return a specific element from the set.|
|size()|This method is used to return the size of the set or the number of elements present in the set.|
|spliterator()|This method creates a late-binding and fail-fast Spliterator over the elements in this set.|
|subSet(Object fromElement, Object toElement)|This method will return elements ranging from fromElement to toElement. fromElement is inclusive and toElement is exclusive.|
|tailSet(Object fromElement)|This method will return elements of TreeSet which are greater than or equal to the specified element.|

## Map Interface

**Declaration:**
```
// Map implementation using HashMap
Map<Key, Value> numbers1 = new HashMap<>();

// Map implementation using LinkedHashMap
Map<Key, Value> numbers2 = new LinkedHashMap<>();

// Map implementation using TreeMap
Map<Key, Value> numbers3 = new TreeMap<>();
```

**Methods:**
|Method|Description|
|:----:|:----:|
|put(K/V) - Inserts the association of a key K and a value V into the map. If the key is already present, the new value replaces the old value.|
|putAll() | Inserts all the entries from the specified map to this map.|
|putIfAbsent(K/ V) | Inserts the association if the key K is not already associated with the value V.|
|get(K) | Returns the value associated with the specified key K. If the key is not found, it returns null.|
|getOrDefault(K/ defaultValue) | Returns the value associated with the specified key K. If the key is not found, it returns the defaultValue.|
|containsKey(K) | Checks if the specified key K is present in the map or not.|
|containsValue(V) | Checks if the specified value V is present in the map or not.|
|replace(K/ V) | Replace the value of the key K with the new specified value V.|
|replace(K/ oldValue/ newValue) - Replaces the value of the key K with the new value newValue only if the key K is associated with the value oldValue.|
|remove(K) | Removes the entry from the map represented by the key K.|
|remove(K/ V) | Removes the entry from the map that has key K associated with value V.|
|keySet() | Returns a set of all the keys present in a map.|
|values() | Returns a set of all the values present in a map.|
|entrySet() | Returns a set of all the key/value mapping present in a map.|

### HashMap

It stores elements in key/value pairs. Here, keys are unique identifiers used to associate each value on a map.

**Declaration:**
```
HashMap<String, Integer> numbers = new HashMap<>();
```
**Methods:**
|Method|Description|
|:----:|:----:|
|clear()|removes all mappings from the HashMap|
|compute()|computes a new value for the specified key|
|computeIfAbsent()|computes value if a mapping for the key is not present|
|computeIfPresent()|computes a value for mapping if the key is present|
|merge()|merges the specified mapping to the HashMap|
|clone()|makes the copy of the HashMap|
|containsKey()|checks if the specified key is present in Hashmap|
|containsValue()|checks if Hashmap contains the specified value|
|size()|returns the number of items in HashMap|
|isEmpty()|checks if the Hashmap is empty|

### TreeMap

**Declaration:**
```
TreeMap<Key, Value> numbers = new TreeMap<>();
```

**Methods:**
|Method|Description|
|:----:|:----:|
|put() | inserts the specified key/value mapping (entry) to the map|
|putAll() | inserts all the entries from specified map to this map|
|putIfAbsent() | inserts the specified key/value mapping to the map if the specified key is not present in the map|
|entrySet() | returns a set of all the key/values mapping (entry) of a treemap|
|keySet() | returns a set of all the keys of a tree map|
|values() | returns a set of all the maps of a tree map|
|get() | Returns the value associated with the specified key. Returns null if the key is not found.|
|getOrDefault()| Returns the value associated with the specified key. Returns the specified default value if the key is not found.|
|remove(key) | returns and removes the entry associated with the specified key from a TreeMap|
|remove(key, value) | removes the entry from the map only if the specified key is associated with the specified value and returns a boolean value|
|replace(key, value) | replaces the value mapped by the specified key with the new value|
|replace(key, old, new) | replaces the old value with the new value only if the old value is already associated with the specified key|
|replaceAll(function) | replaces each value of the map with the result of the specified function|
|firstKey() | returns the first key of the map|
|firstEntry() | returns the key/value mapping of the first key of the map|
|lastKey() | returns the last key of the map|
|lastEntry() | returns the key/value mapping of the last key of the map|
|higherKey() | Returns the lowest key among those keys that are greater than the specified key.|
|higherEntry() | Returns an entry associated with a key that is lowest among all those keys greater than the specified key.|
|lowerKey() | Returns the greatest key among all those keys that are less than the specified key.|
|lowerEntry() | Returns an entry associated with a key that is greatest among all those keys that are less than the specified key.|
|ceilingKey() | Returns the lowest key among those keys that are greater than the specified key. If the key passed as an argument is present in the map, it returns that key.|
|ceilingEntry() | Returns an entry associated with a key that is lowest among those keys that are greater than the specified key. It an entry associated with the key passed an argument is present in the map, it returns the entry associated with that key.|
|floorKey() | Returns the greatest key among those keys that are less than the specified key. If the key passed as an argument is present, it returns that key.|
|floorEntry() | Returns an entry associated with a key that is greatest among those keys that are less than the specified key. If the key passed as argument is present, it returns that key.|
|pollFirstEntry() | returns and removes the entry associated with the first key of the map|
|pollLastEntry() | returns and removes the entry associated with the last key of the map|
|The headMap() |method returns all the key/value pairs of a treemap before the specified key|
|The tailMap()|method returns all the key/value pairs of a treemap starting from the specified key (which is passed as an argument).|
|The subMap()|method returns all the entries associated with keys between k1 and k2 including the entry of k1.|
|clone()|Creates a copy of the TreeMap|
|containsKey()|Searches the TreeMap for the specified key and returns a boolean result|
|containsValue()|Searches the TreeMap for the specified value and returns a boolean result|
|size()|Returns the size of the TreeMap|
|clear()|Removes all the entries from the TreeMap|
