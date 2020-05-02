package top.dianmu.ccompiler.learn.day98.backend;


import top.dianmu.ccompiler.learn.day98.frontend.CTokenType;

public class ICodeFactory {
    
    public static ICodeNode createICodeNode(CTokenType type) {
    	return new ICodeNodeImpl(type);
    }
}
