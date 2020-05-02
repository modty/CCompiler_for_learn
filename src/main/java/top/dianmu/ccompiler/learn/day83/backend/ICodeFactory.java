package top.dianmu.ccompiler.learn.day83.backend;
import top.dianmu.ccompiler.learn.day83.frontend.*;

public class ICodeFactory {
    
    public static ICodeNode createICodeNode(CTokenType type) {
    	return new ICodeNodeImpl(type);
    }
}
