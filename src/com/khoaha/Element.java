package com.khoaha;

import com.khoaha.visitor.Visitor;

/**
 * Created by HoangAnhKhoa on 1/11/16.
 */
public interface Element {
    void accept(Visitor visitor);
}
