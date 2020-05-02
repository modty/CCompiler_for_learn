package top.dianmu.ccompiler.learn.day86.backend;
import top.dianmu.ccompiler.learn.day86.frontend.*;

import java.util.ArrayList;

public class FunctionArgumentList {
    private static FunctionArgumentList argumentList = null;
    private ArrayList<Object> funcArgList = new ArrayList<Object>();
    
    public static FunctionArgumentList getFunctionArgumentList() {
    	if (argumentList == null) {
    		argumentList = new FunctionArgumentList();
    	}
    	
    	return argumentList;
    }
    
    public void setFuncArgList(ArrayList<Object> list) {
    	funcArgList = list;
    }
    
    public ArrayList<Object> getFuncArgList() {
    	return funcArgList;
    }
    
	private FunctionArgumentList() {}
}
