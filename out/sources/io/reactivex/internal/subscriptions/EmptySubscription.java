package io.reactivex.internal.subscriptions;

import ra.g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class EmptySubscription implements g<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EmptySubscription f40966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EmptySubscription[] f40967c;

    static {
        EmptySubscription emptySubscription = new EmptySubscription("INSTANCE", 0);
        f40966b = emptySubscription;
        f40967c = new EmptySubscription[]{emptySubscription};
    }

    public EmptySubscription() {
        throw null;
    }

    public static void a(p123ja.g gVar) {
        gVar.e(f40966b);
        gVar.a();
    }

    public static void b(Throwable th, p123ja.g gVar) {
        gVar.e(f40966b);
        gVar.onError(th);
    }

    public static EmptySubscription valueOf(String str) {
        return (EmptySubscription) Enum.valueOf(EmptySubscription.class, str);
    }

    public static EmptySubscription[] values() {
        return (EmptySubscription[]) f40967c.clone();
    }

    @Override // bc.c
    public final void g(long j) {
        SubscriptionHelper.c(j);
    }

    @Override // ra.f
    public final int h(int i10) {
        return 2;
    }

    @Override // ra.j
    public final boolean isEmpty() {
        return true;
    }

    @Override // ra.j
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // ra.j
    public final Object poll() {
        return null;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "EmptySubscription";
    }

    @Override // bc.c
    public final void cancel() {
    }

    @Override // ra.j
    public final void clear() {
    }
}
