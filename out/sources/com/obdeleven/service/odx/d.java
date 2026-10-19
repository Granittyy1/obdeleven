package com.obdeleven.service.odx;

import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: OdxNameAndVersion.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29487b;

    public d(String str, String str2) {
        this.f29486a = str;
        this.f29487b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return i.a(this.f29486a, dVar.f29486a) && i.a(this.f29487b, dVar.f29487b);
    }

    public final int hashCode() {
        return this.f29487b.hashCode() + (this.f29486a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OdxNameAndVersion(name=");
        sb2.append(this.f29486a);
        sb2.append(", version=");
        return Q8.d.a(sb2, this.f29487b, ")");
    }
}
