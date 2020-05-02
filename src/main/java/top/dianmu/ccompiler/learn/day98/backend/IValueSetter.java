package top.dianmu.ccompiler.learn.day98.backend;


import top.dianmu.ccompiler.learn.day98.frontend.Symbol;

public interface IValueSetter {
   public void setValue(Object obj) throws Exception;
   public Symbol getSymbol();
}
