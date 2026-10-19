package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: SmallSortedMap.java */
/* JADX INFO: loaded from: classes3.dex */
public final class Z extends a0<Object, Object> {
    @Override // com.google.protobuf.a0
    public final void h() {
        if (!this.f29120e) {
            for (int i10 = 0; i10 < this.f29118c.size(); i10++) {
                ((C2075q.a) c(i10).getKey()).getClass();
            }
            Iterator<Map.Entry<Object, Object>> it = e().iterator();
            while (it.hasNext()) {
                ((C2075q.a) it.next().getKey()).getClass();
            }
        }
        super.h();
    }
}
