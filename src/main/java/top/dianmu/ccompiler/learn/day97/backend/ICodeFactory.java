package top.dianmu.ccompiler.learn.day97.backend;

import top.dianmu.ccompiler.learn.day97.frontend.*;


public class ICodeFactory {
    
    public static ICodeNode createICodeNode(CTokenType type) {
    	return new ICodeNodeImpl(type);
    }
}
