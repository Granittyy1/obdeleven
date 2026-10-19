package com.obdeleven.service.odx.model;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Root;

/* JADX INFO: loaded from: classes3.dex */
@Order(elements = {"V"})
@Root(name = "COMPU-DENOMINATOR")
public class COMPUDENOMINATOR {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @ElementList(inline = true, name = "V", required = true)
    protected List<V> f29514v;

    public List<V> getV() {
        if (this.f29514v == null) {
            this.f29514v = new ArrayList();
        }
        return this.f29514v;
    }
}
