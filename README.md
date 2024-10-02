# SortedLinkedList Program

This program allows users to manage a linked list of integers through command line input. Users can continue to add integers, and the program will keep them sorted.

## Prerequisites

- Java Development Kit (JDK) installed on your system.
- A command line interface (Terminal, Command Prompt, etc.) to run commands.

## File Structure
SortedLinkedListProject/
└── sortedlinkedlist/
    ├── InputHandler.java
    ├── LinkedListManager.java
    └── Main.java

## Compilation

To compile the program, follow these steps:

1. Open your command line interface.
2. Navigate to the `sortedlinkedlist` directory where the Java files are located, in this case within `SortedLinkedListProject`.
3. Run the following command to compile all files:
`javac *.java`


This will generate the .class files for each Java file.

After this step is completed, run the program with the following command:
`java Main.java`

Follow the on screen instructions to add integers to the linked list. Type 'exit' to end the program.


# Generating Java Docs

- To generate JavaDocs for this program, do the following:
1. Ensure you are in the `sortedlinkedlist` directory.
2. Run the following command:
`javadoc *.java -d doc`

This command will create a doc directory containing the generated JavaDocs.
