package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1793d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1800e f25671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1800e f25672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f25673c;

    public final Object clone() throws CloneNotSupportedException {
        C1800e c1800e = (C1800e) this.f25671a.clone();
        C1793d c1793d = new C1793d();
        c1793d.f25671a = c1800e;
        c1793d.f25672b = (C1800e) c1800e.clone();
        c1793d.f25673c = new ArrayList();
        Iterator it = this.f25673c.iterator();
        while (it.hasNext()) {
            c1793d.f25673c.add((C1800e) ((C1800e) it.next()).clone());
        }
        return c1793d;
    }
}
