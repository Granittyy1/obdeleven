package io.ktor.http;

import java.util.Locale;

/* JADX INFO: compiled from: HttpHeaderValueParser.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40477b;

    public e(String name, String value) {
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(value, "value");
        this.f40476a = name;
        this.f40477b = value;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (kotlin.text.m.D(eVar.f40476a, this.f40476a, true) && kotlin.text.m.D(eVar.f40477b, this.f40477b, true)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        String lowerCase = this.f40476a.toLowerCase(locale);
        kotlin.jvm.internal.i.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        int iHashCode = lowerCase.hashCode();
        String lowerCase2 = this.f40477b.toLowerCase(locale);
        kotlin.jvm.internal.i.d(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase2.hashCode() + (iHashCode * 31) + iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HeaderValueParam(name=");
        sb2.append(this.f40476a);
        sb2.append(", value=");
        return Q8.d.a(sb2, this.f40477b, ", escapeValue=false)");
    }
}
