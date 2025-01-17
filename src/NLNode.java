// Importing required java classes
import java.util.Comparator;
import java.util.Iterator;

// NLNode class
public class NLNode<T> {

	// Creating private instance variables
	private NLNode<T> parent;
	private ListNodes<NLNode<T>> children;
	private T data;

	// Creating the constructor
	public NLNode() {
		// Setting the values for our instances variables
		parent = null;
		data = null;
		children = new ListNodes<NLNode<T>>();
	}

	// Overloading the constructor if parameters are entered
	public NLNode(T d, NLNode<T> p) {
		children = new ListNodes<NLNode<T>>();
		data = d;
		parent = p;
	}

	// Setter method to set the parent of children
	public void setParent(NLNode<T> p) {
		this.parent = p;
	}

	// Getter method to return parent
	public NLNode<T> getParent() {
		return this.parent;
	}

	// Method to add a new child to the parent
	public void addChild(NLNode<T> newChild) {
		children.add(newChild);
		// Setting the parent of the newly added child
		newChild.setParent(this);
	}

	// Getter method to obtain the children of a parent, returns an iterator
	public Iterator<NLNode<T>> getChildren() {
		Iterator<NLNode<T>> list = children.getList();
		return list;
	}

	// Getter method to return a sorted (specified by parameter) iterator of the
	// children
	public Iterator<NLNode<T>> getChildren(Comparator<NLNode<T>> sorter) {
		Iterator<NLNode<T>> sorted = children.sortedList(sorter);
		return sorted;
	}

	// Getter to return the data stored in node
	public T getData() {
		return this.data;
	}

	// Setter to set the value of data
	public void setData(T d) {
		this.data = d;
	}

}
