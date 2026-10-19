package io.ktor.util;

import java.util.Locale;

/* JADX INFO: compiled from: Text.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40536b;

    public e(String content) {
        kotlin.jvm.internal.i.e(content, "content");
        this.f40535a = content;
        String lowerCase = content.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.i.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        this.f40536b = lowerCase.hashCode();
    }

    public final boolean equals(Object obj) {
        String str;
        e eVar = obj instanceof e ? (e) obj : null;
        return (eVar == null || (str = eVar.f40535a) == null || !str.equalsIgnoreCase(this.f40535a)) ? false : true;
    }

    public final int hashCode() {
        return this.f40536b;
    }

    public final String toString() {
        return this.f40535a;
    }
}
