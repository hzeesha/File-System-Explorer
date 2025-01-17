
// Importing the required java classes
import java.util.ArrayList;
import java.util.Iterator;

// Creating a file structure class
public class FileStructure {

	// Creating a private instance variable for root
	private NLNode<FileObject> root;

	// Constructor, throws exception when applicable
	public FileStructure(String fileObjectName) throws FileObjectException {
		// Using a try-catch to catch any problems
		try {
			// Creating file which stores the given file name
			FileObject file = new FileObject(fileObjectName);
			// Initializing the root instance variable
			root = new NLNode<>(file, null);
			// If the file is a folder/directory we will run the recursive method
			if (file.isDirectory()) {
				explore(root);
			}
			// Catching the error and printing the message to the screen
		} catch (FileObjectException e) {
			System.out.println(e.getMessage());
		}
	}

	// Recursive method that is used for the constructor
	private void explore(NLNode<FileObject> r) {
		// If the node represents a file, nothing happens
		if (r.getData().isFile()) {
			return;
			// If the node represents a folder/directory...
		} else {
			// The variable f represents the nodes data
			FileObject f = r.getData();
			// Creating an iterator containing all objects of type FileObject
			Iterator<FileObject> iterator = f.directoryFiles();
			// Going through the iterator
			while (iterator.hasNext()) {
				FileObject object = iterator.next();
				// Variable n is used to store each FileObject
				NLNode<FileObject> n = new NLNode<FileObject>(object, r);
				// Adding n as a child
				r.addChild(n);
				// Using recursion
				explore(n);
			}
		}
	}

	// Getter method to return the root
	public NLNode<FileObject> getRoot() {
		return root;
	}

	// Method that returns an iterator with file names of specified type
	public Iterator<String> filesOfType(String type) {
		// Creating a container using ArrayList, with type string
		ArrayList<String> container = new ArrayList<String>();
		// Returning the result of the recursive method below
		return stringIter(root, type, container);
	}

	// Recursive method to help with filesOfType
	private Iterator<String> stringIter(NLNode<FileObject> r, String type, ArrayList<String> container) {
		// If the node is a file...
		if (r.getData().isFile()) {
			// Variable f represents the file object
			FileObject f = r.getData();
			// The path string represents the path of the file object
			String path = f.getLongName();
			// If the path ends with the type we're looking for we add the path to our
			// container
			if (path.endsWith(type)) {
				container.add(path);
			}
			// If the node is a folder/directory
		} else {
			// Creating an iterator with the children
			Iterator<NLNode<FileObject>> iterator = r.getChildren();
			// Running through the iterator
			while (iterator.hasNext()) {
				// Storing the child into a variable
				NLNode<FileObject> n = iterator.next();
				// Using recursion
				stringIter(n, type, container);
			}
		}
		// Returning the container converted into an iterator
		return container.iterator();
	}

	// Method to look for file given a specified name
	public String findFile(String name) {
		// Returning the recursive algorithm
		return find(root, name);
	}

	// Creating a recursive algorithm to find the file
	private String find(NLNode<FileObject> r, String name) {
		// The file object is equal to the nodes data
		FileObject f = r.getData();
		// If the file object is a file...
		if (f.isFile()) {
			// Getting the path name
			String path = f.getLongName();
			// If the path contains the name we're looking for it is returned
			if (path.contains(name)) {
				return path;
			}
			// If the file object is a folder/directory
		} else {
			// Creating an iterator with the children of the folder/directory
			Iterator<NLNode<FileObject>> iterator = r.getChildren();
			// Running through the iterator
			while (iterator.hasNext()) {
				// The variable n represents the children
				NLNode<FileObject> n = iterator.next();
				// Creating a string that is obtained through the recursion call
				String finale = find(n, name);
				// If the string isn't empty we return the path
				if (finale.isEmpty() == false) {
					return finale;
				}
			}
		}
		// Returning an empty string if the file isn't found
		return "";
	}
}