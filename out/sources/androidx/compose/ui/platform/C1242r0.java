package androidx.compose.ui.platform;

import androidx.compose.runtime.C1079c0;

/* JADX INFO: renamed from: androidx.compose.ui.platform.r0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: WindowRecomposer.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1242r0 implements androidx.compose.ui.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1079c0 f15090b = new C1079c0(1.0f);

    @Override // androidx.compose.ui.j
    public final float U() {
        return this.f15090b.j();
    }

    @Override // kotlin.coroutines.e
    public final <R> R fold(R r10, Ia.p<? super R, ? super kotlin.coroutines.e.a, ? extends R> pVar) {
        return (R) kotlin.coroutines.e.a.C0479a.a(this, r10, pVar);
    }

    @Override // kotlin.coroutines.e
    public final <E extends kotlin.coroutines.e.a> E get(kotlin.coroutines.e.b<E> bVar) {
        return (E) kotlin.coroutines.e.a.C0479a.b(this, bVar);
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
