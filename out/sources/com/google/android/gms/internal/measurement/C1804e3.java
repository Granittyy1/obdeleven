package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1804e3 extends AbstractC1783b3 {
    @Override // com.google.android.gms.internal.measurement.AbstractC1783b3
    public final void a(long j, Object obj, Object obj2) {
        V2 v2C = (V2) V3.o(obj, j);
        V2 v10 = (V2) V3.o(obj2, j);
        int size = v2C.size();
        int size2 = v10.size();
        if (size > 0 && size2 > 0) {
            if (!v2C.y()) {
                v2C = v2C.c(size2 + size);
            }
            v2C.addAll(v10);
        }
        if (size > 0) {
            v10 = v2C;
        }
        V3.d(j, obj, v10);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1783b3
    public final void b(Object obj, long j) {
        ((V2) V3.o(obj, j)).x();
    }
}
