package top.dianmu.ccompiler.learn.day84.backend;
import top.dianmu.ccompiler.learn.day84.frontend.*;

public interface Executor {
    public Object Execute(ICodeNode root);
}
