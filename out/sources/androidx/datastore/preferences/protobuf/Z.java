package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: SmallSortedMap.java */
/* JADX INFO: loaded from: classes.dex */
public final class Z extends a0<Object, Object> {
    @Override // androidx.datastore.preferences.protobuf.a0
    public final void h() {
        if (!this.f17201e) {
            for (int i10 = 0; i10 < this.f17199c.size(); i10++) {
                ((C1327q.a) c(i10).getKey()).getClass();
            }
            Iterator<Map.Entry<Object, Object>> it = e().iterator();
            while (it.hasNext()) {
                ((C1327q.a) it.next().getKey()).getClass();
            }
        }
        super.h();
    }

    @Override // androidx.datastore.preferences.protobuf.a0, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((C1327q.a) obj, obj2);
    }
}
