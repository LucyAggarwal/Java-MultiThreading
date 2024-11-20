
# Java-MultiThreading

This repo is a hand book for Java MultiThreading concept.
I will add topics from very basic to advance along with projects, code, output snipets, basic definition and explanation of every concept.

I am not best in writing and this is my first time doing something like this. If you feel, its worth STAR it or want to contribute let me know.

----

# Basics

### CPU(Central Processing Unit)
It is also known as brain of computer, and is responsible for executing instructions from programs. It performs basic arithmetic, logic, control, and input/output operations specified by the instructions

----

### Program

A program is a set of instructions written in a programming language(C, C++, Java) that tells the computer how to perform a specific task.

Example: Text Editor is a program that allows user to create, edit documents

----

### Core

A core is an individual processing unit within a CPU. Modern CPUs can have multiple cores, allowing them to perform multiple tasks simultaneously.

A quad-core processor has four cores, allowing it to perform four tasks simultaneously. For instance, one core could handle your web browser, another your music player, another a download manager, and another a background system update.

----

### Process

A process is an instance of a program that is being executed. When a program runs, the operating system creates a process to manage its execution.

When we open Microsoft Word, it becomes a process in the operating system.

----

### Thread

A thread is the smallest unit of execution within a process. A process can have multiple threads, which share the same resources but can run independently.

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

