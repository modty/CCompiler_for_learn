package top.dianmu.ccompiler.learn.day68;


public class BottomUpParser {
    public static void main(String[] args) {
    	/*
    	 * 把ProductionManager , top.dianmu.ccompiler.day52.top.dianmu.ccompiler.day53.top.dianmu.ccompiler.day54.top.dianmu.ccompiler.day55.top.dianmu.ccompiler.day61.top.dianmu.ccompiler.day65.top.dianmu.ccompiler.day66.top.dianmu.ccompiler.day67.top.dianmu.ccompiler.day68.top.dianmu.ccompiler.day70.BottomUpParser.top.dianmu.ccompiler.day53.top.dianmu.ccompiler.day55.top.dianmu.ccompiler.day61.top.dianmu.ccompiler.day65.top.dianmu.ccompiler.day66.top.dianmu.ccompiler.day67.top.dianmu.ccompiler.day68.top.dianmu.ccompiler.day70.FirstSetBuilder 两个类的初始化移到CGrammarInitializer
    	 * 将SymbolDefine 修改成CTokenType, 确定表达式的first set集合运算正确
    	 */
    	ProductionManager productionManager = ProductionManager.getProductionManager();
    	productionManager.initProductions();
    	productionManager.printAllProductions();
    	productionManager.runFirstSetAlgorithm();
    	

    	
    	GrammarStateManager stateManager = GrammarStateManager.getGrammarManager();
    	stateManager.buildTransitionStateMachine();
    	
    	System.out.println("Input string for parsing:");
    	LRStateTableParser parser = new LRStateTableParser(new Lexer());
    	parser.parse();
    	
    	
    }
}
