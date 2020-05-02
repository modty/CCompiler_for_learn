package top.dianmu.ccompiler.learn.day90.backend;
import top.dianmu.ccompiler.learn.day90.frontend.*;

public class ICodeFactory {
    
    public static ICodeNode createICodeNode(CTokenType type) {
    	return new ICodeNodeImpl(type);
    }
}
