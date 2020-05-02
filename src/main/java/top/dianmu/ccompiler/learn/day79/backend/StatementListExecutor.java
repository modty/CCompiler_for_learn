package top.dianmu.ccompiler.learn.day79.backend;
import top.dianmu.ccompiler.learn.day79.frontend.*;

public class StatementListExecutor extends BaseExecutor{
	 @Override 
	 public Object Execute(ICodeNode root) {
	    	executeChildren(root);
	    
	    	return root;
	    }
}
