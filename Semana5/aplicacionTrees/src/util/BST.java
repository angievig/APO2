package util;

public class BST implements Tree {
	
	
	private BSTNode root; 
	private int size;

	public BST () {
		root = null;
		size =0;
	}
	
	
	@Override
	public boolean isEmpty() {
		return (root ==null);
	}


	@Override
	public void add(Object n) {
		if (root == null)
			root = new BSTNode((Comparable)n); //FIXME cst para trabajar con enteros en la clase
		else
			root.add(n);
		size++;
	}


	@Override
	public Object search(Object clave) {
		Object found= null;
		if (root != null)
			found = root.search(clave);
		
		return found;
	}
	
	public String print() {
		String out= "";
		
		if(root ==null)
			out= "empty tree";
		else
			out= root.print();
		return out;
	}
	
	
}
