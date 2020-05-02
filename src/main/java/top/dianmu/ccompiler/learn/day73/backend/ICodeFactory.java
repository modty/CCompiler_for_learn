package top.dianmu.ccompiler.learn.day73.backend;

import top.dianmu.ccompiler.learn.day73.frontend.*;

public class ICodeFactory {
    
    public static ICodeNode createICodeNode(CTokenType type) {
    	return new ICodeNodeImpl(type);
    }
}
