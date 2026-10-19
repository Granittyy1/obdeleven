package io.ktor.client.plugins;

import java.util.Set;
import kotlin.collections.B;

/* JADX INFO: compiled from: HttpRedirect.kt */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set<io.ktor.http.o> f40381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final cc.b f40382b;

    static {
        io.ktor.http.o oVar = io.ktor.http.o.f40482b;
        f40381a = B.C(io.ktor.http.o.f40482b, io.ktor.http.o.f40486f);
        f40382b = p144l6.b.a("io.ktor.client.plugins.HttpRedirect");
    }

    public static final boolean a(io.ktor.http.q qVar) {
        int i10 = qVar.f40511b;
        return i10 == io.ktor.http.q.f40497d.f40511b || i10 == io.ktor.http.q.f40498e.f40511b || i10 == io.ktor.http.q.f40500g.f40511b || i10 == io.ktor.http.q.f40501h.f40511b || i10 == io.ktor.http.q.f40499f.f40511b;
    }
}
