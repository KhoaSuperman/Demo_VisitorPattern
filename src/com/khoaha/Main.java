package com.khoaha;

import com.khoaha.visitor.CssClassVisitor;
import com.khoaha.visitor.StyleVisitor;
import com.khoaha.visitor.Visitor;

public class Main {

    public static void main(String[] args) {

        HtmlTag htmlHtml = new HtmlParentElement("<html>");
        htmlHtml.setStartTag("<html>");
        htmlHtml.setEndTag("</html>");

        HtmlTag htmlP = new HtmlElement("<p>");
        htmlP.setStartTag("<p>");
        htmlP.setStartTag("</p>");
        htmlP.setTagBody("Hello world");

        htmlHtml.addChildTag(htmlP);

        Visitor cssVisitor = new CssClassVisitor();
        htmlHtml.accept(cssVisitor);
        Visitor styleVisitor = new StyleVisitor();
        htmlP.accept(styleVisitor);

        htmlHtml.generateHtml();
    }
}
