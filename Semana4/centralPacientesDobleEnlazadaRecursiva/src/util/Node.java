package util;

public interface Node {

	Object getContent();

	void setContent(Object p);

	String toString();
	
	public NodeSingle getNext();
	
	public void setNext(Node siguiente);

}