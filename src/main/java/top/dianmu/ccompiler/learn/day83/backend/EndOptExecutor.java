package top.dianmu.ccompiler.learn.day83.backend;
import top.dianmu.ccompiler.learn.day83.frontend.*;

public class EndOptExecutor extends BaseExecutor {

	@Override
	public Object Execute(ICodeNode root) {
		
		return executeChild(root, 0);
	}

}
