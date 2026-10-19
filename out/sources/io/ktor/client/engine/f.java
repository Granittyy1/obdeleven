package io.ktor.client.engine;

import Ia.p;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f implements kotlin.coroutines.e.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f40288c = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlin.coroutines.e f40289b;

    /* JADX INFO: compiled from: Utils.kt */
    public static final class a implements kotlin.coroutines.e.b<f> {
    }

    public f(kotlin.coroutines.e callContext) {
        i.e(callContext, "callContext");
        this.f40289b = callContext;
    }

    @Override // kotlin.coroutines.e
    public final <R> R fold(R r10, p<? super R, ? super kotlin.coroutines.e.a, ? extends R> pVar) {
        return (R) kotlin.coroutines.e.a.C0479a.a(this, r10, pVar);
    }

    @Override // kotlin.coroutines.e
    public final <E extends kotlin.coroutines.e.a> E get(kotlin.coroutines.e.b<E> bVar) {
        return (E) kotlin.coroutines.e.a.C0479a.b(this, bVar);
    }

    @Override // kotlin.coroutines.e.a
    public final kotlin.coroutines.e.b<?> getKey() {
        return f40288c;
    }

    @Override // kotlin.coroutines.e
    public final kotlin.coroutines.e minusKey(kotlin.coroutines.e.b<?> bVar) {
        return kotlin.coroutines.e.a.C0479a.c(this, bVar);
    }

    @Override // kotlin.coroutines.e
    public final kotlin.coroutines.e plus(kotlin.coroutines.e eVar) {
        return kotlin.coroutines.e.a.C0479a.d(this, eVar);
    }
}
