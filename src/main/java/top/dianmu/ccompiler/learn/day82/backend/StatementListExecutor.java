package top.dianmu.ccompiler.learn.day82.backend;
import top.dianmu.ccompiler.learn.day82.frontend.*;

public class StatementListExecutor extends BaseExecutor{
	 @Override 
	 public Object Execute(ICodeNode root) {
	    	executeChildren(root);
	    
	    	return root;
	    }
}
