package top.dianmu.ccompiler.learn.day87.backend;
import top.dianmu.ccompiler.learn.day87.frontend.*;

public class CompoundStmtExecutor extends BaseExecutor {

	@Override
	public Object Execute(ICodeNode root) {
		
		return executeChild(root, 0);
	}

}
