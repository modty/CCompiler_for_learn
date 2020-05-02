package top.dianmu.ccompiler.learn.day81.backend;
import top.dianmu.ccompiler.learn.day81.frontend.*;

public class TestExecutor extends BaseExecutor {

	@Override
	public Object Execute(ICodeNode root) {
		executeChildren(root);
		copyChild(root, root.getChildren().get(0));
		
		return root;
	}

}
