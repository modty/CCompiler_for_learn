package top.dianmu.ccompiler.learn.day80.backend;
import top.dianmu.ccompiler.learn.day80.frontend.*;

public class ICodeFactory {
    
    public static ICodeNode createICodeNode(CTokenType type) {
    	return new ICodeNodeImpl(type);
    }
}
