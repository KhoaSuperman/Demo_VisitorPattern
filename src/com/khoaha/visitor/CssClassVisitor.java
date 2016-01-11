package com.khoaha.visitor;

import com.khoaha.HtmlElement;
import com.khoaha.HtmlParentElement;

/**
 * Created by HoangAnhKhoa on 1/11/16.
 */
public class CssClassVisitor implements Visitor {
    @Override
    public void visit(HtmlElement htmlElement) {
        htmlElement.setStartTag(htmlElement.getStartTag().replace(">", " class='visitor'>"));
    }

    @Override
    public void visit(HtmlParentElement htmlParentElement) {
        htmlParentElement.setStartTag(htmlParentElement.getStartTag().replace(">", " class='visitor'>"));
    }
}
