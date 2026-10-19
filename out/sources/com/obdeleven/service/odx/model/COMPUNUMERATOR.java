package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Root(name = "COMPU-NUMERATOR")
public class COMPUNUMERATOR {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @ElementList(inline = true, name = "V", required = true)
    protected List<V> f29516v;

    public List<V> getV() {
        if (this.f29516v == null) {
            this.f29516v = new ArrayList();
        }
        return this.f29516v;
    }
}
