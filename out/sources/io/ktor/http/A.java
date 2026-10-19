package io.ktor.http;

import A1.C0575j;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: URLProtocol.kt */
/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final A f40443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f40444d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40446b;

    static {
        A a10 = new A("http", 80);
        f40443c = a10;
        List listS = kotlin.collections.l.s(a10, new A("https", 443), new A("ws", 80), new A("wss", 443), new A("socks", 1080));
        int iN = kotlin.collections.x.n(kotlin.collections.m.y(listS, 10));
        if (iN < 16) {
            iN = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iN);
        for (Object obj : listS) {
            linkedHashMap.put(((A) obj).f40445a, obj);
        }
        f40444d = linkedHashMap;
    }

    public A(String str, int i10) {
        this.f40445a = str;
        this.f40446b = i10;
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if (Character.toLowerCase(cCharAt) != cCharAt) {
                throw new IllegalArgumentException("All characters should be lower case");
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a10 = (A) obj;
        return this.f40445a.equals(a10.f40445a) && this.f40446b == a10.f40446b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f40446b) + (this.f40445a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("URLProtocol(name=");
        sb2.append(this.f40445a);
        sb2.append(", defaultPort=");
        return C0575j.b(sb2, this.f40446b, ')');
    }
}
