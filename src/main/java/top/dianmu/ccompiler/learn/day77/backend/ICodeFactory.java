package top.dianmu.ccompiler.learn.day77.backend;
import top.dianmu.ccompiler.learn.day77.frontend.*;

public class ICodeFactory {
    
    public static ICodeNode createICodeNode(CTokenType type) {
    	return new ICodeNodeImpl(type);
    }
}
