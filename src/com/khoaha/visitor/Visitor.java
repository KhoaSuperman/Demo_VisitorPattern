package com.khoaha.visitor;

import com.khoaha.HtmlElement;
import com.khoaha.HtmlParentElement;

/**
 * Created by HoangAnhKhoa on 1/11/16.
 */
public interface Visitor {
    public void visit(HtmlElement htmlElement);
    public void visit(HtmlParentElement htmlParentElement);
}
