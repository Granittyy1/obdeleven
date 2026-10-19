package io.reactivex.internal.disposables;

import ra.e;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class EmptyDisposable implements e<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EmptyDisposable f40664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EmptyDisposable[] f40665c;

    static {
        EmptyDisposable emptyDisposable = new EmptyDisposable("INSTANCE", 0);
        f40664b = emptyDisposable;
        f40665c = new EmptyDisposable[]{emptyDisposable, new EmptyDisposable("NEVER", 1)};
    }

    public EmptyDisposable() {
        throw null;
    }

    public static EmptyDisposable valueOf(String str) {
        return (EmptyDisposable) Enum.valueOf(EmptyDisposable.class, str);
    }

    public static EmptyDisposable[] values() {
        return (EmptyDisposable[]) f40665c.clone();
    }

    @Override // p148la.b
    public final boolean d() {
        return this == f40664b;
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
    public final Object poll() throws Exception {
        return null;
    }

    @Override // ra.j
    public final void clear() {
    }

    @Override // p148la.b
    public final void dispose() {
    }
}
