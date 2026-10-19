package com.google.android.gms.internal.measurement;

import androidx.collection.C0873a;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1873o2 implements W1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0873a f25807b = new C0873a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Map<String, ?> f25808a;

    public static synchronized void a() {
        Iterator it = ((C0873a.e) f25807b.values()).iterator();
        if (it.hasNext()) {
            ((C1873o2) it.next()).getClass();
            throw null;
        }
        f25807b.clear();
    }

    @Override // com.google.android.gms.internal.measurement.W1
    public final Object e(String str) {
        Map<String, ?> map = this.f25808a;
        map.getClass();
        return map.get(str);
    }
}
