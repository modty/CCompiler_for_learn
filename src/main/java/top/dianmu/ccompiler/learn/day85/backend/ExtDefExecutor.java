package top.dianmu.ccompiler.learn.day85.backend;
import top.dianmu.ccompiler.learn.day85.frontend.*;

public class ExtDefExecutor extends BaseExecutor {

	@Override
	public Object Execute(ICodeNode root) {
		int production = (Integer)root.getAttribute(ICodeKey.PRODUCTION);
		switch (production) {
		case CGrammarInitializer.OptSpecifiers_FunctDecl_CompoundStmt_TO_ExtDef:
			executeChild(root, 0);
			ICodeNode child = root.getChildren().get(0); 
			String funcName = (String)child.getAttribute(ICodeKey.TEXT);
			root.setAttribute(ICodeKey.TEXT, funcName);
			
			executeChild(root, 1);
			child = root.getChildren().get(1);
			Object returnVal = child.getAttribute(ICodeKey.VALUE);
			if (returnVal != null) {
				root.setAttribute(ICodeKey.VALUE, returnVal);
			}
			
			
			break;
		}
		return root;
	}

}
