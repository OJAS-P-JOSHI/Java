# List Operations in Java

# List Operations in Java

This repository demonstrates various operations that can be performed on a `List` in Java using the `ArrayList` implementation. Below is a comprehensive list of operations, along with the corresponding code and explanations.

## Table of Contents

- [Introduction](#introduction)
- [List of Operations](#list-of-operations)
- [Java Code](#java-code)
- [List Implementations in Java: Differences and Usage](#list-implementations-in-java-differences-and-usage)

## Introduction

This repository showcases how to perform various operations on a `List` in Java, primarily using the `ArrayList` implementation. You'll find code examples and explanations for creating, modifying, and manipulating lists, as well as a comparison of different `List` implementations available in Java.

## List of Operations

1. [Creating a List](#creating-a-list)
2. [Adding Elements](#adding-elements)
3. [Accessing Elements](#accessing-elements)
4. [Modifying Elements](#modifying-elements)
5. [Removing Elements](#removing-elements)
6. [Checking if the List Contains an Element](#checking-if-the-list-contains-an-element)
7. [Getting the Size of the List](#getting-the-size-of-the-list)
8. [Iterating Over the List](#iterating-over-the-list)
9. [Clearing the List](#clearing-the-list)
10. [Checking if the List is Empty](#checking-if-the-list-is-empty)
11. [Adding All Elements from Another List](#adding-all-elements-from-another-list)
12. [Removing All Elements from Another List](#removing-all-elements-from-another-list)
13. [Retaining Only the Elements that are also Contained in Another List](#retaining-only-the-elements-that-are-also-contained-in-another-list)
14. [Converting the List to an Arra](#converting-the-list-to-an-array)

This repository demonstrates various operations that can be performed on a `List` in Java using the `ArrayList` implementation. Below is a comprehensive list of operations, along with the corresponding code and explanations.

## List of Operations

1. Creating a List
2. Adding Elements
3. Accessing Elements
4. Modifying Elements
5. Removing Elements
6. Checking if the List Contains an Element
7. Getting the Size of the List
8. Iterating Over the List
9. Clearing the List
10. Checking if the List is Empty
11. Adding All Elements from Another List
12. Removing All Elements from Another List
13. Retaining Only the Elements that are also Contained in Another List
14. Converting the List to an Array

## Java Code

```java
package CollectionFramework.ListInterface;

import java.util.ArrayList;
import java.util.List;

public class ListOperations {
    public static void main(String[] args) {
        // 1. Creating a List
        List<String> list = new ArrayList<>();

        // 2. Adding Elements
        list.add("Element1");          // Add an element at the end
        list.add("Element2");
        list.add("Element3");
        list.add(1, "Element4");       // Add an element at a specific index

        // 3. Accessing Elements
        System.out.println("Element at index 1: " + list.get(1)); // Get an element

        // 4. Modifying Elements
        list.set(2, "ModifiedElement3"); // Set an element at a specific index
        System.out.println("Modified list: " + list);

        // 5. Removing Elements
        list.remove(1);                // Remove an element at a specific index
        System.out.println("After removing element at index 1: " + list);

        list.remove("Element1");       // Remove a specific element
        System.out.println("After removing 'Element1': " + list);

        // 6. Checking if the list contains an element
        boolean contains = list.contains("Element3");
        System.out.println("List contains 'Element3': " + contains);

        // 7. Getting the size of the list
        int size = list.size();
        System.out.println("Size of the list: " + size);

        // 8. Iterating over the list
        System.out.println("Iterating over the list:");
        for (String element : list) {
            System.out.println(element);
        }

        // 9. Clearing the list
        list.clear();
        System.out.println("List after clearing: " + list);

        // 10. Checking if the list is empty
        boolean isEmpty = list.isEmpty();
        System.out.println("List is empty: " + isEmpty);

        // 11. Adding all elements from another list
        List<String> anotherList = new ArrayList<>();
        anotherList.add("NewElement1");
        anotherList.add("NewElement2");
        list.addAll(anotherList);
        System.out.println("List after adding all elements from another list: " + list);

        // 12. Removing all elements from another list
        list.removeAll(anotherList);
        System.out.println("List after removing all elements from another list: " + list);

        // 13. Retaining only the elements that are also contained in another list
        list.add("Element1");
        list.add("Element2");
        list.addAll(anotherList);
        list.retainAll(anotherList);
        System.out.println("List after retaining only elements from another list: " + list);

        // 14. Converting the list to an array
        String[] array = list.toArray(new String[0]);
        System.out.println("Array from list:");
        for (String element : array) {
            System.out.println(element);
        }
    }
}
```


# List Implementations in Java: Differences and Usage

In Java, the `List` interface is part of the Java Collections Framework and provides several implementations, each with unique characteristics suited for different use cases. Here's a comparison of the main `List` implementations:

## ArrayList

- **Implementation**:

  - Uses a dynamically resizable array to store elements.
- **Performance**:

  - Fast iteration and random access (`O(1)` time complexity for `get` and `set` operations).
  - Slower performance for inserting and deleting elements in the middle of the list (`O(n)` time complexity).
- **Usage**:

  - Suitable for scenarios where random access and iteration are frequent, and the list size changes dynamically.

## LinkedList

- **Implementation**:

  - Uses a doubly-linked list structure where each element is stored in a separate node.
- **Performance**:

  - Fast insertion and deletion at both ends of the list (`O(1)` time complexity).
  - Slower performance for random access (`O(n)` time complexity).
- **Usage**:

  - Ideal for scenarios where frequent insertion and deletion operations are required, especially near the beginning or middle of the list.

## Vector

- **Implementation**:

  - Similar to ArrayList but is synchronized (thread-safe).
- **Performance**:

  - Slower compared to ArrayList due to synchronization overhead.
- **Usage**:

  - Used in multi-threaded applications where thread safety is necessary, although `Collections.synchronizedList` is often preferred for better performance.

## Stack

- **Implementation**:

  - Extends Vector and represents a last-in, first-out (LIFO) stack of elements.
- **Performance**:

  - Similar to Vector but optimized for stack operations (`push`, `pop`).
- **Usage**:

  - Commonly used in algorithms that require LIFO behavior, such as expression evaluation and backtracking.

## CopyOnWriteArrayList

- **Implementation**:

  - Implements a variant of ArrayList where all mutative operations (add, set, remove, etc.) are implemented by making a fresh copy of the underlying array.
- **Performance**:

  - Iteration is very fast and thread-safe.
  - Mutative operations are expensive (`O(n)` time complexity) due to copying the array.
- **Usage**:

  - Suitable for scenarios where traversal operations (iteration) vastly outnumber mutations, and thread safety is required.
