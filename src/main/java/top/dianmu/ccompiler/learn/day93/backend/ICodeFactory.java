package top.dianmu.ccompiler.learn.day93.backend;

import top.dianmu.ccompiler.learn.day93.frontend.*;

public class ICodeFactory {
    
    public static ICodeNode createICodeNode(CTokenType type) {
    	return new ICodeNodeImpl(type);
    }
}
