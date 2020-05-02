package top.dianmu.ccompiler.learn.day79.backend;
import top.dianmu.ccompiler.learn.day79.frontend.*;

public class ICodeFactory {
    
    public static ICodeNode createICodeNode(CTokenType type) {
    	return new ICodeNodeImpl(type);
    }
}
