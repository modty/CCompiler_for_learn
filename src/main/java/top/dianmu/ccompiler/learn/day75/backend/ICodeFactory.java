package top.dianmu.ccompiler.learn.day75.backend;


import top.dianmu.ccompiler.learn.day75.frontend.*;

public class ICodeFactory {
    
    public static ICodeNode createICodeNode(CTokenType type) {
    	return new ICodeNodeImpl(type);
    }
}
