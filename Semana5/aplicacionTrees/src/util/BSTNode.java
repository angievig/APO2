package util;

public  class BSTNode implements Tree{
	
	private BSTNode left; 
	private BSTNode right;
	
	private NodeType type;
	
	private Comparable content;
	
	
	
	public BSTNode(BSTNode left, BSTNode right, Comparable content, NodeType type) {
		this.left = left;
		this.right = right;
		this.content = content;
		this.type = type;
	}
	
	public BSTNode(Object content) {
		this.left = null;
		this.right = null;
		type = NodeType.LEAF;
		this.content = (Comparable)content;
	}
	

	@Override
	//FIXME soluciOn parcial, los nodos no deberían ser vacIos 
	public boolean isEmpty() {
		return (left ==null) && (right ==null) && (content ==null);
	}
	
	public BSTNode getLeft() {
		return left;
	}
	public void setLeft(BSTNode left) {
		this.left = left;
	}
	public BSTNode getRight() {
		return right;
	}
	public void setRight(BSTNode right) {
		this.right = right;
	}
	public Comparable getContent() {
		return content;
	}
	public void setContent(Comparable content) {
		this.content = content;
	}

	@Override
	public void add(Object n) {
		
		switch (type) {
		case LEAF:
			BSTNode nNode= new BSTNode(n);
			int comp= content.compareTo(n);
			if (comp>=0) { // Si  n es menor o igual que content 
				left= nNode;
			}else {
				right = nNode;
			}
			type= NodeType.BRANCH;
			break;
		case BRANCH:
			addBranch(n);
			break;
		} 
	}

	private void addBranch(Object n) {
		int comp= content.compareTo(n);
		if (comp>=0) { // Si  n es menor o igual que content
			
			if (left != null) //Si el subárbol izquierdo no es vacío
				left.add(n); //entonces se hace un llamado recursivo
			else
				left=new BSTNode(n); //Si es vacío, conectamos el nodo
		}else { //Si es mayor
			if (right != null) //Si el subárbol derecho no es vacío
				right.add(n); // entonces se hace un llamado recursivo
			else
				right=new BSTNode(n); //Si es vacío, conectamos el nodo
		}

	}

	@Override
	public Object search(Object clave) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String print() {
	
		return "El arbol inorder es: " + printInorder();
	}
	
	public String printInorder() {
		
		String out= "";
		
		switch (type) {
		case LEAF:
			out= content.toString() + "(l) ";
			break;
		case BRANCH:
			out += left!=null? left.printInorder(): "";
			out += content.toString() + "(b) ";
			out += right!= null? right.printInorder():"";
			break;
		} 
		return out;
	}
	
	
	
	
}
