package com.khoaha.visitor;

import com.khoaha.HtmlElement;
import com.khoaha.HtmlParentElement;

/**
 * Created by HoangAnhKhoa on 1/11/16.
 */
public class StyleVisitor implements Visitor {
    @Override
    public void visit(HtmlElement htmlElement) {
        htmlElement.setStartTag(htmlElement.getStartTag().replace(">", " style='width:46px;'>"));
    }

    @Override
    public void visit(HtmlParentElement htmlParentElement) {
        htmlParentElement.setStartTag(htmlParentElement.getStartTag().replace(">", " style='width:58px;'>"));
    }
}
