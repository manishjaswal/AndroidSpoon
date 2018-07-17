package com.example.processor;

import spoon.processing.AbstractProcessor;
import spoon.reflect.code.CtCodeSnippetStatement;
import spoon.reflect.declaration.CtExecutable;


public class SampleProcessor extends AbstractProcessor<CtExecutable> {

    @Override
    public void process(CtExecutable element) {
        CtCodeSnippetStatement snippet = getFactory().Core().createCodeSnippetStatement();

        // Snippet which contains the log.
        final String value = String.format("System.out.println(\"Enter in the method  from the class \");");
        snippet.setValue(value);

        // Inserts the snippet at the beginning of the method body.
        if (element.getBody() != null) {
            element.getBody().insertBegin(snippet);
        }
    }

}