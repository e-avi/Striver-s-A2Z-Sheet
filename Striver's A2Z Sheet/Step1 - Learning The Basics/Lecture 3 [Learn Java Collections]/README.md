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

