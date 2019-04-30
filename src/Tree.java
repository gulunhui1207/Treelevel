import java.util.LinkedList;
import java.util.List;
/**
 * 创建一个树，输出这棵树的某一层的全部节点
 * 
 * <p>Copyright: Copyright (c) 2019</p>
 * <p>succez</p>
 * @author 刘永卓
 * @createdate 2019年4月30日
 */
public class Tree {
	private static char[] treelist={'A','B','D','G','H','C','F'};
	private static List<TNode> nodelist=null;
	
	private static class TNode{
		char value;
		TNode left,right;
		TNode(char newnode){
			left=null;
			right=null;
			value=newnode;
		}
	}
	/**
	 * 获取这棵树的头结点
	 */
	public static TNode getTree(){
		return nodelist.get(0);
	}
	/**
	 *创建一颗二叉树。将节点放入nodelist更容易将每一层的节点加入到树中
	 *因为字符存在字符数组之中，需要将字符数组转变成节点list，这样就进行连接
	 *在数组中， 这个节点的左节点的位置是index*2+1,右节点的位置是index*2+2
	 *
	 *
	 */
	public static void CreatTree(){
		nodelist= new LinkedList<TNode>();
		for (int nodeIndex = 0; nodeIndex < treelist.length; nodeIndex++) {  
            nodelist.add(new TNode(treelist[nodeIndex]));  
        }
		for (int parentIndex = 0; parentIndex < treelist.length / 2 - 1; parentIndex++) {  
	            // 左孩子  
			nodelist.get(parentIndex).left = nodelist.get(parentIndex * 2 + 1);  
	            // 右孩子  
			nodelist.get(parentIndex).right = nodelist.get(parentIndex * 2 + 2);  
	    }  
		int lastParentIndex = treelist.length / 2 - 1;  
        // 左孩子 
        nodelist.get(lastParentIndex).left = nodelist.get(lastParentIndex * 2 + 1);  
        // 右孩子,如果数组的长度为奇数才建立右孩子  
        if (treelist.length % 2 == 1) {  
            nodelist.get(lastParentIndex).right = nodelist.get(lastParentIndex * 2 + 2);  
        }  
	}
	/**
	 * 利用递归，调用子节点，并且判断这一层是不是目标层数，如果是就输出该节点的值
	 * 如果不是则继续调用子节点，并且让层数减一
	 * 
	 * @param tree
	 * @param level
	 * @return 
	 */
	public static void TreeLevel(TNode tree,int level){
		if(level==1){
			System.out.println(tree.value);
		}
		else if(tree.left==null&&tree.right==null){
			System.out.println("输入的层数大于该树的层数");
		}
		else{
			TreeLevel(tree.left,level-1);
			TreeLevel(tree.right,level-1);
		}
	}
	public static void main (String arg[]){
		CreatTree();
		TreeLevel(getTree(),3);
	}
}
