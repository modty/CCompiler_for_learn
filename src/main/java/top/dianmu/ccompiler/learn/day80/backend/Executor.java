package top.dianmu.ccompiler.learn.day80.backend;
import top.dianmu.ccompiler.learn.day80.frontend.*;

public interface Executor {
    public Object Execute(ICodeNode root);
}
