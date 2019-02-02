package com.rotten.compiler.core;

import com.rotten.compiler.gen.RottenLanguageParser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;

import java.util.ArrayList;
import java.util.List;

public class RottenLanguageParserV1 extends RottenLanguageParser {


    public RottenLanguageParserV1(TokenStream input) {
        super(input);
    }

    public List<Token> getTokens(Token start, Token end) {
        List<Token> list = new ArrayList<>();
        for (int i = start.getTokenIndex(); i <= end.getTokenIndex(); i++) {
            list.add(getTokenStream().get(i));
        }
        return list;
    }

}
