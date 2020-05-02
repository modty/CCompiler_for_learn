package top.dianmu.ccompiler.learn.day85.backend;
import top.dianmu.ccompiler.learn.day85.frontend.*;

public class TestExecutor extends BaseExecutor {

	@Override
	public Object Execute(ICodeNode root) {
		executeChildren(root);
		copyChild(root, root.getChildren().get(0));
		
		return root;
	}

}
