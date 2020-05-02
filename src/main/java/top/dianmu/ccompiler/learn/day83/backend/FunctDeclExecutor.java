package top.dianmu.ccompiler.learn.day83.backend;
import top.dianmu.ccompiler.learn.day83.frontend.*;

public class FunctDeclExecutor extends BaseExecutor {

	@Override
	public Object Execute(ICodeNode root) {
		int production = (Integer)root.getAttribute(ICodeKey.PRODUCTION);
		switch (production) {
		case CGrammarInitializer.NewName_LP_RP_TO_FunctDecl:
			root.reverseChildren();
			copyChild(root, root.getChildren().get(0));
			break;
		}
		return root;
	}

}
