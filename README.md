# File System Explorer

This project implements a file system explorer in Java using a tree-like data structure to represent files and directories. Each node corresponds to a file or folder and references its children, allowing recursive traversal and efficient organization of the file system.

---

## Features

### 1. Recursive File Structure Representation
- Constructs a tree-like structure starting from a root folder.
- Each node stores information about a file or folder, with references to its children.

### 2. File Search
- Locate a specific file by its name.
- Returns the absolute path of the file if found.

### 3. File Type Filtering
- Filter and list all files of a specific type (e.g., `.java`, `.txt`, `.jpg`).
- Outputs the absolute paths of matching files.

### 4. Custom Sorting
- Sort files and folders by name or size using Java Comparators.

### 5. Graphical User Interface (GUI)
- Provides an intuitive interface to:
  - Select a root directory.
  - Print the directory structure.
  - Search for files by name or type.

---

## Technologies Used

- **Java**: Core programming language.
- **Non-linear Data Structures**: Implements tree structures with recursive algorithms.
- **Java Generics**: For flexible and type-safe data management.
- **Iterators and Comparators**: For traversal and custom sorting.

---

## Getting Started

### Prerequisites
- **Java Development Kit (JDK)** version 8 or higher.

### Running the Project
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/hzeesha/File-System-Explorer.git
   cd File-System-Explorer
2. **Compile the Java Files**:
   ```bash
   javac src/*.java
   ```
3. **Run the Main Program**:
   ```bash
   java -cp src FileSystem
   ```
4. **Interact with the GUI**:
- Select a folder or file to explore.
- Use the options provided to print the structure, filter files, or search for specific files.

## Files Included
### Implemented Classes:
- NLNode.java: Represents a node in the file system tree.
- FileStructure.java: Builds and manipulates the tree structure.
- FileSystem.java: Main class for GUI integration.
- FileObject.java: Represents files and directories.
- ListNodes.java: Manages the list of children for each node.
- Other Utility Classes: NameComparator, SizeComparator, PrintFileStructure, etc.

## Contributing
Contributions are welcome! Feel free to fork this repository, submit pull requests, or open issues.
