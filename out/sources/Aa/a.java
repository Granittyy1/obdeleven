package Aa;

import kotlin.coroutines.e;

/* JADX INFO: compiled from: ContinuationImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements kotlin.coroutines.c<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1038b = new a();

    @Override // kotlin.coroutines.c
    public final e getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // kotlin.coroutines.c
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
