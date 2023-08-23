package util;

public class LinkedListRecursive implements List {
	
	private NodeDouble first;
	private NodeDouble last;
	private int numItems;
	
	

	public LinkedListRecursive() {
		
		numItems= 0;
	}

	@Override
	public boolean isEmpty() {
	
		return (first==null)&& (last ==null);
	}


	@Override
	public Object search(Object clave) {
		Object content =null;
		
		if (!isEmpty()) 
			content = searchInSequence(first, clave);
		
		return content;
	}
	
	private Object searchInSequence(Node sq, Object clave) {
		Object found = null;
		
		if(sq!=null) 
			if (sq.getContent().equals(clave)) 
				found = sq.getContent();
			else
				found= searchInSequence(sq.getNext(), clave);
		
		return found;
	}
	

	@Override
	public void delete(Object clave) {
		// TODO Auto-generated method stub
		
	}
	
	public String print(){
		String out="[";
		if (isEmpty()){
			out+= "]";
		}
		else{
			out+= printSequence(first) +"]";
		}

		return out ;
	}
	
	private String printSequence(Node node) {
		String out="";
		
		if (node==null) {
			out= "-";
		}else
			out = node.getContent() + printSequence(node.getNext());
		
		return out;
	}

	@Override
	public void addFirst(Object n) {
		NodeDouble newNode= new NodeDouble(n);
		
		if(first ==null) {// empty list
			first =newNode;
			last= newNode;
		} else {
			newNode.setNext(first);
			first.setPrev(newNode);
			first= newNode;
		}
		numItems++;

	}

	@Override
	public void addLast(Object n) {
		// TODO Auto-generated method stub
		
	}


}
