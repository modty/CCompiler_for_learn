package top.dianmu.ccompiler.learn.day71;

public class SymbolEntry {
    private Symbol symbol;
    private top.dianmu.ccompiler.learn.day65.SymbolEntry prev, next;
    
    public SymbolEntry(Symbol sym) {
    	this.symbol = sym;
    }
    
    public void setPrev(top.dianmu.ccompiler.learn.day65.SymbolEntry prev) {
    	this.prev = prev;
    }
    
    public void setNext(top.dianmu.ccompiler.learn.day65.SymbolEntry next) {
    	this.next = next;
    }
    
    public top.dianmu.ccompiler.learn.day65.SymbolEntry getPrev() {
    	return prev;
    }
    
    public top.dianmu.ccompiler.learn.day65.SymbolEntry getNext() {
    	return next;
    }
    
}
