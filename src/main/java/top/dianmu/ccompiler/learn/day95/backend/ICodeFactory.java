package top.dianmu.ccompiler.learn.day95.backend;

import top.dianmu.ccompiler.learn.day95.frontend.*;

public class ICodeFactory {
    
    public static ICodeNode createICodeNode(CTokenType type) {
    	return new ICodeNodeImpl(type);
    }
}
