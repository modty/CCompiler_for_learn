package top.dianmu.ccompiler.learn.day52.BottomUpParser;


public class BottomUpParser {
    public static void main(String[] args) {
    	ProductionManager productionManager = ProductionManager.getProductionManager();
    	productionManager.initProductions();
    	
    	GrammarStateManager stateManager = GrammarStateManager.getGrammarManager();
    	stateManager.buildTransitionStateMachine();
    }
}
