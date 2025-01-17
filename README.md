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
   git clone <repository-url>
   cd File-System-Explorer
2. 
