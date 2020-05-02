package top.dianmu.ccompiler.learn.day89.backend;


import top.dianmu.ccompiler.learn.day89.frontend.*;

public class ICodeFactory {
    
    public static ICodeNode createICodeNode(CTokenType type) {
    	return new ICodeNodeImpl(type);
    }
}
