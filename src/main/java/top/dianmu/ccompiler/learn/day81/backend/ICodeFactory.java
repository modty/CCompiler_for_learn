package top.dianmu.ccompiler.learn.day81.backend;
import top.dianmu.ccompiler.learn.day81.frontend.*;

public class ICodeFactory {
    
    public static ICodeNode createICodeNode(CTokenType type) {
    	return new ICodeNodeImpl(type);
    }
}
