package com.voltasit.sharednetwork.integrity;

import Q8.d;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: IntegrityHeaders.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f34471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f34472c;

    public a(String str, String type, String str2) {
        i.e(type, "type");
        this.f34470a = str;
        this.f34471b = type;
        this.f34472c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return i.a(this.f34470a, aVar.f34470a) && i.a(this.f34471b, aVar.f34471b) && i.a(this.f34472c, aVar.f34472c);
    }

    public final int hashCode() {
        int iB = B1.a.b(this.f34471b, this.f34470a.hashCode() * 31, 31);
        String str = this.f34472c;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntegrityHeaderToken(token=");
        sb2.append(this.f34470a);
        sb2.append(", type=");
        sb2.append(this.f34471b);
        sb2.append(", keyId=");
        return d.a(sb2, this.f34472c, ")");
    }
}
