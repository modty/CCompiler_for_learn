package top.dianmu.ccompiler.learn.day78.backend;
import top.dianmu.ccompiler.learn.day78.frontend.*;

public class StatementExecutor extends BaseExecutor{
	 @Override 
	 public Object Execute(ICodeNode root) {
	    	executeChildren(root);
	    	
	    	return root;
	    }
}
