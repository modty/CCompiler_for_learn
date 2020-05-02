package top.dianmu.ccompiler.learn.day92.backend;


import top.dianmu.ccompiler.learn.day92.frontend.CTokenType;

public class ICodeFactory {
    
    public static ICodeNode createICodeNode(CTokenType type) {
    	return new ICodeNodeImpl(type);
    }
}
