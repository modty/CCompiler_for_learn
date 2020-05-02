package top.dianmu.ccompiler.learn.day46;


import top.dianmu.ccompiler.learn.day40.Lexer;

public class BottomUpParser {
    public static void main(String[] args) {
    	Lexer lexer = new Lexer();
    	LRParser parser = new LRParser(lexer);
    	parser.parse();
    }
}
