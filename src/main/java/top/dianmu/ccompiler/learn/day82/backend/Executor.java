package top.dianmu.ccompiler.learn.day82.backend;
import top.dianmu.ccompiler.learn.day82.frontend.*;

public interface Executor {
    public Object Execute(ICodeNode root);
}
