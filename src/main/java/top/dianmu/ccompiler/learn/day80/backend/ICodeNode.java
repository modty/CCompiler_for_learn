package top.dianmu.ccompiler.learn.day80.backend;
import top.dianmu.ccompiler.learn.day80.frontend.*;
import java.util.ArrayList;

public interface ICodeNode {
   
    public ICodeNode  getParent();
    
    public ICodeNode addChild(ICodeNode node);
    
    public ArrayList<ICodeNode> getChildren();
    
    public void setAttribute(ICodeKey key, Object value);
    
    public Object  getAttribute(ICodeKey key);
    
    public ICodeNode copy();
}

