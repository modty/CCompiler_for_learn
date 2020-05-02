package top.dianmu.ccompiler.learn.day83.backend;
import top.dianmu.ccompiler.learn.day83.frontend.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ICodeNodeImpl extends HashMap<ICodeKey, Object> implements ICodeNode{
    private  CTokenType type;
    private  ICodeNode parent;
    private  ArrayList<ICodeNode> children;
    String   name;
    private  boolean isChildrenReverse = false;
    
    public ICodeNodeImpl(CTokenType type) {
    	this.type = type;
    	this.parent = null;
    	this.children = new ArrayList<ICodeNode>();
    	setAttribute(ICodeKey.TokenType, type);
    }
    
    
    public ICodeNode addChild(ICodeNode node) {
    	if (node != null) {
    		children.add(node);
    		((ICodeNodeImpl)node).parent = this;
    	}
    	
    	return node;
    }
    
   @Override
   public boolean isChildrenReverse() {
	   return isChildrenReverse;
   }
   
   @Override
   public  void reverseChildren() {
	   if (isChildrenReverse == true) {
		   return;
	   }
	   
	   Collections.reverse(children);
	   isChildrenReverse = true;
   }

	@Override
	public ICodeNode getParent() {
		// TODO Auto-generated method stub
		return parent;
	}

	@Override
	public ArrayList<ICodeNode> getChildren() {
		//注意，有可能会改变原有逻辑
		reverseChildren();
		
		// TODO Auto-generated method stub
		return children;
	}

	@Override
	public void setAttribute(ICodeKey key, Object value) {
		if (key == ICodeKey.TEXT) {
			name = (String)value;
		}
		put(key, value);
	}

	@Override
	public Object getAttribute(ICodeKey key) {
		
		return get(key);
	}

	@Override
	public ICodeNode copy() {
		ICodeNodeImpl copy = (ICodeNodeImpl)ICodeFactory.createICodeNode(type);
		Set<Map.Entry<ICodeKey, Object>> attributes = entrySet();
		Iterator <Map.Entry<ICodeKey, Object>> it = attributes.iterator();
		
		while (it.hasNext()) {
			Map.Entry<ICodeKey, Object> attribute = it.next();
			copy.put(attribute.getKey(), attribute.getValue());
		}
		
		return copy;
	}
    
	@Override
	public String toString() {
		String info = "";
		if (get(ICodeKey.VALUE) != null) {
			info += "Node Value is " + get(ICodeKey.VALUE).toString();
		}
		
		if (get(ICodeKey.TEXT) != null) {
			info += "\nNode Text is " + get(ICodeKey.TEXT).toString();
		}
		
		if (get(ICodeKey.SYMBOL) != null) {
			info += "\nNode top.dianmu.ccompiler.day65.top.dianmu.ccompiler.day66.top.dianmu.ccompiler.day67.top.dianmu.ccompiler.day68.top.dianmu.ccompiler.day70.Symbol is " + get(ICodeKey.SYMBOL).toString();
		}
		
		return info  + "\n Node Type is " + type.toString();
	}
   
}
