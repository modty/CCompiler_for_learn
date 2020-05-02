package top.dianmu.ccompiler.learn.day27;

public class Compiler {

	public static void main(String[] args) {
		Lexer lexer = new Lexer();
		//lexer.runLexer();
		//top.dianmu.ccompiler.day27.top.dianmu.ccompiler.day30.top.dianmu.ccompiler.day32.top.dianmu.ccompiler.day34.top.dianmu.ccompiler.day36.top.dianmu.ccompiler.day38.top.dianmu.ccompiler.day40.top.dianmu.ccompiler.day52.Compiler.Compiler.top.dianmu.ccompiler.day40.top.dianmu.ccompiler.day52.Compiler.Compiler.top.dianmu.ccompiler.day30.top.dianmu.ccompiler.day32.top.dianmu.ccompiler.day34.top.dianmu.ccompiler.day36.top.dianmu.ccompiler.day38.top.dianmu.ccompiler.day40.top.dianmu.ccompiler.day52.Compiler.Compiler.top.dianmu.ccompiler.day40.top.dianmu.ccompiler.day52.Compiler.ImprovedParser improvedParser = new top.dianmu.ccompiler.day27.top.dianmu.ccompiler.day30.top.dianmu.ccompiler.day32.top.dianmu.ccompiler.day34.top.dianmu.ccompiler.day36.top.dianmu.ccompiler.day38.top.dianmu.ccompiler.day40.top.dianmu.ccompiler.day52.Compiler.Compiler.top.dianmu.ccompiler.day40.top.dianmu.ccompiler.day52.Compiler.Compiler.top.dianmu.ccompiler.day30.top.dianmu.ccompiler.day32.top.dianmu.ccompiler.day34.top.dianmu.ccompiler.day36.top.dianmu.ccompiler.day38.top.dianmu.ccompiler.day40.top.dianmu.ccompiler.day52.Compiler.Compiler.top.dianmu.ccompiler.day40.top.dianmu.ccompiler.day52.Compiler.ImprovedParser(lexer);
		//improvedParser.statements();
		
		/*top.dianmu.ccompiler.day27.top.dianmu.ccompiler.day30.top.dianmu.ccompiler.day32.top.dianmu.ccompiler.day34.top.dianmu.ccompiler.day36.top.dianmu.ccompiler.day38.top.dianmu.ccompiler.day40.top.dianmu.ccompiler.day52.Compiler.Compiler.top.dianmu.ccompiler.day40.top.dianmu.ccompiler.day52.Compiler.Compiler.top.dianmu.ccompiler.day30.top.dianmu.ccompiler.day32.top.dianmu.ccompiler.day34.top.dianmu.ccompiler.day36.top.dianmu.ccompiler.day38.top.dianmu.ccompiler.day40.top.dianmu.ccompiler.day52.Compiler.Compiler.top.dianmu.ccompiler.day40.top.dianmu.ccompiler.day52.Compiler.Parser parser = new top.dianmu.ccompiler.day27.top.dianmu.ccompiler.day30.top.dianmu.ccompiler.day32.top.dianmu.ccompiler.day34.top.dianmu.ccompiler.day36.top.dianmu.ccompiler.day38.top.dianmu.ccompiler.day40.top.dianmu.ccompiler.day52.Compiler.Compiler.top.dianmu.ccompiler.day40.top.dianmu.ccompiler.day52.Compiler.Compiler.top.dianmu.ccompiler.day30.top.dianmu.ccompiler.day32.top.dianmu.ccompiler.day34.top.dianmu.ccompiler.day36.top.dianmu.ccompiler.day38.top.dianmu.ccompiler.day40.top.dianmu.ccompiler.day52.Compiler.Compiler.top.dianmu.ccompiler.day40.top.dianmu.ccompiler.day52.Compiler.Parser(lexer);
		parser.statements();
		*/
		
		PdaParser pdaParser = new PdaParser(lexer);
		pdaParser.parse();
		System.out.println("top.dianmu.ccompiler.day27.top.dianmu.ccompiler.day30.top.dianmu.ccompiler.day32.top.dianmu.ccompiler.day34.top.dianmu.ccompiler.day36.top.dianmu.ccompiler.day38.top.dianmu.ccompiler.day40.top.dianmu.ccompiler.day52.Compiler.Compiler.top.dianmu.ccompiler.day40.top.dianmu.ccompiler.day52.Compiler.Compiler.top.dianmu.ccompiler.day30.top.dianmu.ccompiler.day32.top.dianmu.ccompiler.day34.top.dianmu.ccompiler.day36.top.dianmu.ccompiler.day38.top.dianmu.ccompiler.day40.top.dianmu.ccompiler.day52.Compiler.Compiler.top.dianmu.ccompiler.day40.top.dianmu.ccompiler.day52.Compiler.PdaParser accept input string");
	}
}
