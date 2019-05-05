/**
 * 
 */

/**
 * <p>Copyright: Copyright (c) 2019</p>
 * <p>succez</p>
 * @author 刘永卓
 * @createdate 2019年5月5日
 */
public class TNode {
	char value;
	private TNode left,right;
	TNode(char newnode){
		left=null;
		right=null;
		value=newnode;
	}
	public void setLeft(TNode left){
		this.left=left;
	}
	public void setRight(TNode right){
		this.right=right;
	}
	public void setValue(char value){
		this.value=value;
	}
	public TNode getLeft(){
		return this.left;
	}
	public TNode getRight(){
		return this.right;
	}
	public char getValue(){
		return this.value;
	}
}
