package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1842k implements InterfaceC1884q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1884q f25778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25779c;

    public C1842k() {
        this.f25778b = InterfaceC1884q.f25814f0;
        this.f25779c = "return";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final String A() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final Iterator<InterfaceC1884q> B() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final InterfaceC1884q C(String str, Y1 y10, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final Boolean b() {
        throw new IllegalStateException("Control is not a boolean");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1842k)) {
            return false;
        }
        C1842k c1842k = (C1842k) obj;
        return this.f25779c.equals(c1842k.f25779c) && this.f25778b.equals(c1842k.f25778b);
    }

    public final int hashCode() {
        return this.f25778b.hashCode() + (this.f25779c.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final InterfaceC1884q y() {
        return new C1842k(this.f25779c, this.f25778b.y());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final Double z() {
        throw new IllegalStateException("Control is not a double");
    }

    public C1842k(String str) {
        this.f25778b = InterfaceC1884q.f25814f0;
        this.f25779c = str;
    }

    public C1842k(String str, InterfaceC1884q interfaceC1884q) {
        this.f25778b = interfaceC1884q;
        this.f25779c = str;
    }
}
