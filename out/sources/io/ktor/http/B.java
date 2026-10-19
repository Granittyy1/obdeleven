package io.ktor.http;

import java.util.ArrayList;

/* JADX INFO: compiled from: Url.kt */
/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f40447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f40449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f40450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f40451e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f40452f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f40453g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f40454h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p293xa.g f40455i;
    public final p293xa.g j;

    public B(A protocol, String host, int i10, ArrayList arrayList, r parameters, String fragment, String str, String str2, String str3) {
        kotlin.jvm.internal.i.e(protocol, "protocol");
        kotlin.jvm.internal.i.e(host, "host");
        kotlin.jvm.internal.i.e(parameters, "parameters");
        kotlin.jvm.internal.i.e(fragment, "fragment");
        this.f40447a = protocol;
        this.f40448b = host;
        this.f40449c = i10;
        this.f40450d = arrayList;
        this.f40451e = parameters;
        this.f40452f = str;
        this.f40453g = str2;
        this.f40454h = str3;
        if ((i10 < 0 || i10 >= 65536) && i10 != 0) {
            throw new IllegalArgumentException("port must be between 0 and 65535, or 0 if not set");
        }
        kotlin.a.a(new Ia.a<String>() { // from class: io.ktor.http.Url$encodedPath$2
            {
                super(0);
            }

            @Override // Ia.a
            public final String invoke() {
                if (this.this$0.f40450d.isEmpty()) {
                    return "";
                }
                B b10 = this.this$0;
                int iP = kotlin.text.n.P(b10.f40454h, '/', b10.f40447a.f40445a.length() + 3, false, 4);
                if (iP == -1) {
                    return "";
                }
                int iR = kotlin.text.n.R(this.this$0.f40454h, new char[]{'?', '#'}, iP, false);
                if (iR == -1) {
                    String strSubstring = this.this$0.f40454h.substring(iP);
                    kotlin.jvm.internal.i.d(strSubstring, "this as java.lang.String).substring(startIndex)");
                    return strSubstring;
                }
                String strSubstring2 = this.this$0.f40454h.substring(iP, iR);
                kotlin.jvm.internal.i.d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                return strSubstring2;
            }
        });
        kotlin.a.a(new Ia.a<String>() { // from class: io.ktor.http.Url$encodedQuery$2
            {
                super(0);
            }

            @Override // Ia.a
            public final String invoke() {
                int iP = kotlin.text.n.P(this.this$0.f40454h, '?', 0, false, 6) + 1;
                if (iP == 0) {
                    return "";
                }
                int iP2 = kotlin.text.n.P(this.this$0.f40454h, '#', iP, false, 4);
                if (iP2 == -1) {
                    String strSubstring = this.this$0.f40454h.substring(iP);
                    kotlin.jvm.internal.i.d(strSubstring, "this as java.lang.String).substring(startIndex)");
                    return strSubstring;
                }
                String strSubstring2 = this.this$0.f40454h.substring(iP, iP2);
                kotlin.jvm.internal.i.d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                return strSubstring2;
            }
        });
        kotlin.a.a(new Ia.a<String>() { // from class: io.ktor.http.Url$encodedPathAndQuery$2
            {
                super(0);
            }

            @Override // Ia.a
            public final String invoke() {
                B b10 = this.this$0;
                int iP = kotlin.text.n.P(b10.f40454h, '/', b10.f40447a.f40445a.length() + 3, false, 4);
                if (iP == -1) {
                    return "";
                }
                int iP2 = kotlin.text.n.P(this.this$0.f40454h, '#', iP, false, 4);
                if (iP2 == -1) {
                    String strSubstring = this.this$0.f40454h.substring(iP);
                    kotlin.jvm.internal.i.d(strSubstring, "this as java.lang.String).substring(startIndex)");
                    return strSubstring;
                }
                String strSubstring2 = this.this$0.f40454h.substring(iP, iP2);
                kotlin.jvm.internal.i.d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                return strSubstring2;
            }
        });
        this.f40455i = kotlin.a.a(new Ia.a<String>() { // from class: io.ktor.http.Url$encodedUser$2
            {
                super(0);
            }

            @Override // Ia.a
            public final String invoke() {
                String str4 = this.this$0.f40452f;
                if (str4 == null) {
                    return null;
                }
                if (str4.length() == 0) {
                    return "";
                }
                int length = this.this$0.f40447a.f40445a.length() + 3;
                String strSubstring = this.this$0.f40454h.substring(length, kotlin.text.n.R(this.this$0.f40454h, new char[]{':', '@'}, length, false));
                kotlin.jvm.internal.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return strSubstring;
            }
        });
        this.j = kotlin.a.a(new Ia.a<String>() { // from class: io.ktor.http.Url$encodedPassword$2
            {
                super(0);
            }

            @Override // Ia.a
            public final String invoke() {
                String str4 = this.this$0.f40453g;
                if (str4 == null) {
                    return null;
                }
                if (str4.length() == 0) {
                    return "";
                }
                B b10 = this.this$0;
                String strSubstring = this.this$0.f40454h.substring(kotlin.text.n.P(b10.f40454h, ':', b10.f40447a.f40445a.length() + 3, false, 4) + 1, kotlin.text.n.P(this.this$0.f40454h, '@', 0, false, 6));
                kotlin.jvm.internal.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return strSubstring;
            }
        });
        kotlin.a.a(new Ia.a<String>() { // from class: io.ktor.http.Url$encodedFragment$2
            {
                super(0);
            }

            @Override // Ia.a
            public final String invoke() {
                int iP = kotlin.text.n.P(this.this$0.f40454h, '#', 0, false, 6) + 1;
                if (iP == 0) {
                    return "";
                }
                String strSubstring = this.this$0.f40454h.substring(iP);
                kotlin.jvm.internal.i.d(strSubstring, "this as java.lang.String).substring(startIndex)");
                return strSubstring;
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && B.class == obj.getClass() && kotlin.jvm.internal.i.a(this.f40454h, ((B) obj).f40454h);
    }

    public final int hashCode() {
        return this.f40454h.hashCode();
    }

    public final String toString() {
        return this.f40454h;
    }
}
