
# Java-MultiThreading

This repo is a hand book for Java MultiThreading concept.
I will add topics from very basic to advance along with projects, code, output snipets, basic definition and explanation of every concept.

I am not best in writing and this is my first time doing something like this. If you feel, its worth STAR it or want to contribute let me know.

----

# Basics

### CPU(Central Processing Unit)
It is also known as **brain** of computer, and is responsible for executing instructions from programs. It performs basic arithmetic, logic, control, and input/output operations specified by the instructions

----

### Program

A program is a set of instructions written in a programming language(C, C++, Java) that tells the computer how to perform a specific task.

Example: Text Editor is a program that allows user to create, edit documents

----

### Core

A core is an **individual processing unit** within a CPU. Modern CPUs can have multiple cores, allowing them to perform multiple tasks simultaneously.

A quad-core processor has four cores, allowing it to perform four tasks simultaneously. For instance, one core could handle your web browser, another your music player, another a download manager, and another a background system update.

----

### Process

A process is an instance of a program that is being executed. When a program runs, the operating system creates a process to manage its execution.

When we open Microsoft Word, it becomes a process in the operating system.

----

### Thread

A thread is the **smallest unit of execution** within a process. A process can have multiple threads, which share the same resources but can run independently.

For Example: A web browser may use multiple threads for different tabs with each tab runnning on separate thread.

----

# Multitasking vs Multithreading

## Multitasking

**Definition**: 

Multitasking refers to the ability of an operating system to execute multiple tasks or processes at the same time. It allows the CPU to run multiple processes, each of which can consist of a single or multiple threads.

### Types of Multitasking:
1. **Process-based multitasking**:  
   - The operating system executes multiple processes (independent programs) concurrently.  
   - Each process has its own memory space and operates independently.  

2. **Thread-based multitasking**:  
   - Each process can have multiple threads.  
   - Threads share the same memory space but execute different parts of the code concurrently, which makes communication between them more efficient.

### Example:
- Running a web browser, a text editor, and a music player simultaneously. Each of these applications is an independent process (each has its own memory space), but they can run concurrently, providing the user with a smooth experience.

---

## Multithreading

**Definition**:  

Multithreading is a form of multitasking that involves the concurrent execution of multiple threads within a single process. A thread is the smallest unit of a CPU's execution. Multithreading allows a single program to perform multiple operations simultaneously by running multiple threads within the same process.

### Key Characteristics:
- **Threads** are lightweight processes that share the same memory space with other threads in the same process.
- Multiple threads within the same process can run concurrently and share data, which makes communication between them more efficient.
- Threads can be independently managed and executed, leading to a more responsive and efficient program, especially for I/O-bound or CPU-bound tasks.

### Example:
- A word processor could have several threads running simultaneously: 
  - One thread handling user input,  
  - Another thread updating the UI,  
  - And another one performing background tasks, like saving the document or checking for updates.

---

### Summary:
- **Multitasking** is the general term for managing multiple processes (either independently or with shared resources like threads).
- **Multithreading** is a type of multitasking specifically referring to the concurrent execution of multiple threads within a single process, allowing for more efficient execution and resource management.

---
# Concurrency vs Parallelism

## Concurrency

### **Definition**:  
Concurrency refers to the ability of a system to handle multiple tasks simultaneously by managing their execution in an overlapping manner. However, tasks might not run at the exact same time; instead, they are in progress during overlapping periods.

### **Key Points**:
- Concurrency is more about managing multiple tasks in a way that they **appear** to run simultaneously.
- On a single-core processor, tasks are handled by **time-slicing** (rapid switching between tasks), making them seem as if they are running concurrently.
- Concurrency **does not necessarily require parallel execution**.
  
### **Example**:
Imagine you have two tasks:
- **Task A**: Download a file.
- **Task B**: Process user input.

These tasks may be interleaved by the operating system, meaning Task A will perform some steps while Task B does its work, and then they will switch back and forth. The tasks might not be executing at the exact same time, but the system manages them so that they appear to run concurrently.

### **Use Case**:  
- Concurrency is useful for tasks that involve waiting, such as I/O operations, where one task waits for input or output, allowing another task to progress during that wait. For instance, handling user input while downloading data in the background.

---

## Parallelism

### **Definition**:  
Parallelism is a **subset** of concurrency where tasks are **actually executed simultaneously** on multiple processors or cores. Tasks that can be run concurrently may also be executed in parallel, which results in faster processing.

### **Key Points**:
- Parallelism is about performing multiple tasks **simultaneously**.
- Requires **multiple processors** or **multi-core systems** to execute tasks at the same time.
- Helps speed up computationally intensive tasks by dividing work and processing it at the same time.

### **Example**:
- **Task A**: Download a file.
- **Task B**: Process data.

If you have multiple cores, both Task A and Task B can be run simultaneously on different cores, allowing both tasks to complete faster. In this case, both tasks are **truly running at the same time**.

### **Use Case**:  
- Parallelism is beneficial when dealing with computationally heavy tasks, such as **data processing**, **image rendering**, or **scientific simulations**, where the workload can be split and processed simultaneously across multiple cores.

---

## Difference between Concurrency and Parallelism

| Aspect               | Concurrency                                  | Parallelism                                       |
|----------------------|----------------------------------------------|---------------------------------------------------|
| **Definition**        | Managing multiple tasks by switching between them (overlapping). | Performing multiple tasks simultaneously on different processors or cores. |
| **Execution**         | Tasks might not run simultaneously, but are interleaved. | Tasks are actually running simultaneously on different processors or cores. |
| **Hardware**          | Can work on single-core machines using time-sharing. | Requires multiple processors or multi-core systems to execute tasks at the same time. |
| **Goal**              | To efficiently manage multiple tasks without necessarily completing them at the same time. | To improve the performance of computationally intensive tasks by running them in parallel. |

---

## Conclusion

- **Concurrency** is about managing tasks in such a way that they overlap in execution, without needing them to run at the same time. It can be done on single-core systems and is ideal for I/O-bound operations.
- **Parallelism**, on the other hand, involves actually executing tasks at the same time on multiple processors or cores, which is useful for CPU-bound operations.

Understanding both concepts helps optimize the use of resources and performance in multithreaded applications, particularly when you need to decide whether to use concurrency or parallelism based on the task and hardware available.

