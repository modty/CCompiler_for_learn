package top.dianmu.ccompiler.learn.day94.backend;


import top.dianmu.ccompiler.learn.day94.frontend.CTokenType;

public class ICodeFactory {
    
    public static ICodeNode createICodeNode(CTokenType type) {
    	return new ICodeNodeImpl(type);
    }
}
