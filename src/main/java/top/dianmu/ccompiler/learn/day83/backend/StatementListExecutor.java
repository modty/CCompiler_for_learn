package top.dianmu.ccompiler.learn.day83.backend;
import top.dianmu.ccompiler.learn.day83.frontend.*;

public class StatementListExecutor extends BaseExecutor{
	 @Override 
	 public Object Execute(ICodeNode root) {
	    	executeChildren(root);
	    
	    	return root;
	    }
}
