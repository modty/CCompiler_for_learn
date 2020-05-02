package top.dianmu.ccompiler.learn.day82.backend;
import top.dianmu.ccompiler.learn.day82.frontend.*;
public class Intepretor implements Executor{

	private static Intepretor intepretor = null;
	public static Intepretor getIntepretor() {
		if (intepretor == null) {
			intepretor = new Intepretor();
		}
		
		return intepretor;
	}
	
	private Intepretor() {
		
	}
	
	@Override
	public Object Execute(ICodeNode root) {
		ExecutorFactory factory = ExecutorFactory.getExecutorFactory();
		Executor executor = factory.getExecutor(root);
		executor.Execute(root);
		
		return root;
	}
}
