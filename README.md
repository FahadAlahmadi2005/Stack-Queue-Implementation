# Stack & Queue Implementations in Java

This repository contains robust implementations of **Stack** and **Queue** data structures. Following modular software engineering patterns, these structures are built using **Linked Lists** to ensure dynamic scaling and efficient memory usage.

---

## 🚀 Standardized Features

Both structures follow the series' **Standardized Terminology**:

### **The Queue (FIFO - First In, First Out)**
* **`enqueue(E data)`**: Adds an element to the end of the queue.
* **`dequeue()`**: Removes and returns the element from the front.
* **`isEmpty()`**: Checks if the queue is empty.
* **`display()`**: Outputs all elements currently in the queue.

### **The Stack (LIFO - Last In, First Out)**
* **`push(E data)`**: Adds an element to the top.
* **`pop()`**: Removes the most recently added element.
* **`peek()`**: Returns the top element without removing it.

---

## 🛠 Real-World Applications

These implementations are not just theoretical; they include logic used in complex algorithms found in other parts of this series:
* **Tree Traversals**: Used in `BST.java` for **Level-Order** traversal.
* **Graph Algorithms**: Essential for **Breadth-First Search (BFS)** implementation.
* **Data Reversal**: Includes a `reverseQueue()` method using temporary storage logic.

---

## 📊 Complexity Analysis

| Structure | Operation | Time Complexity | Space Complexity |
| :--- | :--- | :--- | :--- |
| **Queue** | Enqueue/Dequeue | $O(1)$ | $O(1)$ |
| **Stack** | Push/Pop | $O(1)$ | $O(1)$ |

---

## 📂 File Structure

To ensure the project runs out-of-the-box, the following files are included:
* `Queue.java`: Linked-list based queue.
* `QueueAsSimpleArray.java`: Array-based queue implementation.
* `SLL_Tail.java` / `SingleNode.java`: The underlying data structures supporting the queue.

## 📄 License
This project is open-source and available under the [MIT License](LICENSE).
