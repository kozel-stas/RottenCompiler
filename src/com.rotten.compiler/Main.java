package com.rotten.compiler;

import com.rotten.compiler.core.RottenLanguageParserV1;
import com.rotten.compiler.core.RottenLanguageVisitorImplV1;
import com.rotten.compiler.gen.RottenLanguageLexer;
import com.rotten.compiler.gen.RottenLanguageParser;
import com.rotten.compiler.gen.RottenLanguageVisitor;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class Main {

    public static void main(String args[]) {
        try {
            ANTLRInputStream input = new ANTLRInputStream(
                    new FileInputStream("C:\\Users\\a4tec\\Desktop\\RottenCompiler\\resources\\test.rotten"));
            RottenLanguageLexer lexer = new RottenLanguageLexer(input);
            RottenLanguageParserV1 parser = new RottenLanguageParserV1(new CommonTokenStream(lexer));

            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            PrintStream oldERR = System.err;
            System.setErr(new PrintStream(byteArrayOutputStream));
            ParseTree tree = parser.global_program();
            if (!byteArrayOutputStream.toString().equalsIgnoreCase("")) {
                System.setErr(oldERR);
                JOptionPane.showMessageDialog(null, "Lexer error: " + byteArrayOutputStream.toString());
                return;
            }
            System.setErr(oldERR);
            RottenLanguageVisitor<String> listVisitor = new RottenLanguageVisitorImplV1(parser);
            String output = (String) listVisitor.visit(tree);
            FileWriter fileWriter = new FileWriter("RunProgram.java");
//            fileWriter.write(output);
            System.out.println(output);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
