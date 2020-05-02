package top.dianmu.ccompiler.learn.day78.backend;
import top.dianmu.ccompiler.learn.day78.frontend.*;

public class ICodeFactory {
    
    public static ICodeNode createICodeNode(CTokenType type) {
    	return new ICodeNodeImpl(type);
    }
}
