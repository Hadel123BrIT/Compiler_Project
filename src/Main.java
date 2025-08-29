import AST.Program;
import antlr.AngularLexer;
import antlr.AngularParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import visitor.BaseVisitor;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;


public class Main {
    public static void main(String[] args) throws IOException {
        String source = "test/code angular.txt";
        CharStream charStream = fromFileName(source);
        AngularLexer lexer = new AngularLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AngularParser parser = new AngularParser(tokens);
        ParseTree ast = parser.program();
        BaseVisitor baseVisitor = new BaseVisitor();
        Program program = (Program) baseVisitor.visit(ast);
//        System.out.println(program);
    }
}
