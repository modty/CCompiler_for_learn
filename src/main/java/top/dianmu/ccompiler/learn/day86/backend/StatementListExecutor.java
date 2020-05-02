package top.dianmu.ccompiler.learn.day86.backend;
import top.dianmu.ccompiler.learn.day86.frontend.*;

public class StatementListExecutor extends BaseExecutor{
	 @Override 
	 public Object Execute(ICodeNode root) {
	    	executeChildren(root);
	    	Object child = root.getChildren().get(0);
	        copyChild(root, root.getChildren().get(0));
	    	return root;
	    }
}
