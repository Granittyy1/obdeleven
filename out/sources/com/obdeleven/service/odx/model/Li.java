package com.obdeleven.service.odx.model;

import com.braze.Constants;
import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementListUnion;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "li")
public class Li {

    @ElementListUnion({@ElementList(name = "u", required = false, type = U.class), @ElementList(name = "i", required = false, type = I.class), @ElementList(name = "li", required = false, type = Li.class), @ElementList(name = "br", required = false, type = Br.class), @ElementList(name = "b", required = false, type = B.class), @ElementList(name = Constants.BRAZE_PUSH_PRIORITY_KEY, required = false, type = P.class), @ElementList(name = "ol", required = false, type = Ol.class), @ElementList(name = "sup", required = false, type = Sup.class), @ElementList(name = "ul", required = false, type = Ul.class), @ElementList(name = "sub", required = false, type = Sub.class)})
    protected List<Object> content;

    public List<Object> getContent() {
        if (this.content == null) {
            this.content = new ArrayList();
        }
        return this.content;
    }
}
