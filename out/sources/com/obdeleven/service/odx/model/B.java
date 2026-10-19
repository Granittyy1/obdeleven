package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementListUnion;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "b")
public class B {

    @ElementListUnion({@ElementList(name = "u", required = false, type = U.class), @ElementList(name = "i", required = false, type = I.class), @ElementList(name = "br", required = false, type = Br.class), @ElementList(name = "b", required = false, type = B.class), @ElementList(name = "sup", required = false, type = Sup.class), @ElementList(name = "sub", required = false, type = Sub.class)})
    protected List<Object> content;

    public List<Object> getContent() {
        if (this.content == null) {
            this.content = new ArrayList();
        }
        return this.content;
    }
}
