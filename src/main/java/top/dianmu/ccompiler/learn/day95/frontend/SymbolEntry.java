package top.dianmu.ccompiler.learn.day95.frontend;

public class SymbolEntry {
    private Symbol symbol;
    private top.dianmu.ccompiler.learn.day88.frontend.SymbolEntry prev, next;
    
    public SymbolEntry(Symbol sym) {
    	this.symbol = sym;
    }
    
    public void setPrev(top.dianmu.ccompiler.learn.day88.frontend.SymbolEntry prev) {
    	this.prev = prev;
    }
    
    public void setNext(top.dianmu.ccompiler.learn.day88.frontend.SymbolEntry next) {
    	this.next = next;
    }
    
    public top.dianmu.ccompiler.learn.day88.frontend.SymbolEntry getPrev() {
    	return prev;
    }
    
    public top.dianmu.ccompiler.learn.day88.frontend.SymbolEntry getNext() {
    	return next;
    }
    
}
