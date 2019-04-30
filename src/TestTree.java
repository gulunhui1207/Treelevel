import static org.junit.Assert.*;
import org.junit.Test;
/**
 * 测试单元，测试能不能正常创建树以及输出，某一层的节点
 * 
 * <p>Copyright: Copyright (c) 2019</p>
 * <p>succez</p>
 * @author 刘永卓
 * @createdate 2019年4月30日
 */
public class TestTree {
	private Tree tree=new Tree();

	@Test
	public void test() {
		tree.CreatTree();
		tree.TreeLevel(tree.getTree(),3);
		
	}
	@Test
	public void test2() {
		tree.CreatTree();
		tree.TreeLevel(tree.getTree(),4);
	}

}
