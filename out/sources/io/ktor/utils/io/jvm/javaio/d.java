package io.ktor.utils.io.jvm.javaio;

/* JADX INFO: compiled from: Pollers.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<c<Thread>> f40649a = new ThreadLocal<>();

    public static final c<Thread> a() {
        c<Thread> cVar = f40649a.get();
        return cVar == null ? a.f40643a : cVar;
    }
}
