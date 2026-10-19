package io.ktor.http;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptySet;

/* JADX INFO: renamed from: io.ktor.http.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Headers.kt */
/* JADX INFO: loaded from: classes.dex */
@p293xa.d
public final class C2477b implements g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2477b f40472c = new C2477b();

    @Override // io.ktor.util.k
    public final Set<Map.Entry<String, List<String>>> a() {
        return EmptySet.f42985b;
    }

    @Override // io.ktor.util.k
    public final boolean b() {
        return true;
    }

    @Override // io.ktor.util.k
    public final void c(Ia.p<? super String, ? super List<String>, p293xa.r> pVar) {
        io.ktor.util.k.a.a(this, pVar);
    }

    @Override // io.ktor.util.k
    public final String get(String name) {
        kotlin.jvm.internal.i.e(name, "name");
        return null;
    }

    public final String toString() {
        return "Headers " + EmptySet.f42985b;
    }
}
