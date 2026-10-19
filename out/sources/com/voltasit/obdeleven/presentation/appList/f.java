package com.voltasit.obdeleven.presentation.appList;

import C4.v;
import com.voltasit.obdeleven.domain.models.oca.OcaCategory;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: OcaFilter.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OcaCategory f31319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f31320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f31321c;

    public f(OcaCategory ocaCategory, String str, boolean z10) {
        this.f31319a = ocaCategory;
        this.f31320b = str;
        this.f31321c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f31319a == fVar.f31319a && i.a(this.f31320b, fVar.f31320b) && this.f31321c == fVar.f31321c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f31321c) + B1.a.b(this.f31320b, this.f31319a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OcaFilter(category=");
        sb2.append(this.f31319a);
        sb2.append(", searchKeyword=");
        sb2.append(this.f31320b);
        sb2.append(", isPublic=");
        return v.f(sb2, this.f31321c, ")");
    }
}
