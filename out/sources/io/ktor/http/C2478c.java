package io.ktor.http;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptySet;

/* JADX INFO: renamed from: io.ktor.http.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Parameters.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C2478c implements r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2478c f40473c = new C2478c();

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

    public final boolean equals(Object obj) {
        return (obj instanceof r) && ((r) obj).isEmpty();
    }

    @Override // io.ktor.util.k
    public final boolean isEmpty() {
        return true;
    }

    public final String toString() {
        return "Parameters " + EmptySet.f42985b;
    }
}
