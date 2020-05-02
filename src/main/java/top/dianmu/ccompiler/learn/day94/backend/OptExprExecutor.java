package top.dianmu.ccompiler.learn.day94.backend;
import top.dianmu.ccompiler.learn.day94.frontend.*;

public class OptExprExecutor extends BaseExecutor {

	@Override
	public Object Execute(ICodeNode root) {
		int production = (int)root.getAttribute(ICodeKey.PRODUCTION);
		switch (production) {
		case CGrammarInitializer.Semi_TO_OptExpr:
			return root;
			
		case CGrammarInitializer.Expr_Semi_TO_OptExpr:
			return executeChild(root, 0);
			
		default:
				return root;
		}
	}

}
