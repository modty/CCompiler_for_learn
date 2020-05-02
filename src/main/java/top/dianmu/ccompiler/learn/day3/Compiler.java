package top.dianmu.ccompiler.learn.day3;

public class Compiler {

	public static void main(String[] args) {
		Lexer lexer = new Lexer();
		//top.dianmu.ccompiler.day27.top.dianmu.ccompiler.day30.top.dianmu.ccompiler.day32.top.dianmu.ccompiler.day34.top.dianmu.ccompiler.day36.top.dianmu.ccompiler.day38.top.dianmu.ccompiler.day40.top.dianmu.ccompiler.day52.Compiler.Compiler.top.dianmu.ccompiler.day40.top.dianmu.ccompiler.day52.Compiler.Compiler.top.dianmu.ccompiler.day30.top.dianmu.ccompiler.day32.top.dianmu.ccompiler.day34.top.dianmu.ccompiler.day36.top.dianmu.ccompiler.day38.top.dianmu.ccompiler.day40.top.dianmu.ccompiler.day52.Compiler.Compiler.top.dianmu.ccompiler.day40.top.dianmu.ccompiler.day52.Compiler.ImprovedParser improvedParser = new top.dianmu.ccompiler.day27.top.dianmu.ccompiler.day30.top.dianmu.ccompiler.day32.top.dianmu.ccompiler.day34.top.dianmu.ccompiler.day36.top.dianmu.ccompiler.day38.top.dianmu.ccompiler.day40.top.dianmu.ccompiler.day52.Compiler.Compiler.top.dianmu.ccompiler.day40.top.dianmu.ccompiler.day52.Compiler.Compiler.top.dianmu.ccompiler.day30.top.dianmu.ccompiler.day32.top.dianmu.ccompiler.day34.top.dianmu.ccompiler.day36.top.dianmu.ccompiler.day38.top.dianmu.ccompiler.day40.top.dianmu.ccompiler.day52.Compiler.Compiler.top.dianmu.ccompiler.day40.top.dianmu.ccompiler.day52.Compiler.ImprovedParser(lexer);
		//improvedParser.statements();
		
		Parser parser = new Parser(lexer);
		parser.statements();
	}
}
