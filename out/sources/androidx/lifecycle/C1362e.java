package androidx.lifecycle;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.z0;

/* JADX INFO: renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CoroutineLiveData.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1362e<T> extends B<T> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C1359b<T> f17817m;

    @Override // androidx.lifecycle.B, androidx.lifecycle.AbstractC1382z
    public final void g() {
        super.g();
        C1359b<T> c1359b = this.f17817m;
        if (c1359b != null) {
            z0 z0Var = c1359b.f17807g;
            if (z0Var != null) {
                z0Var.i(null);
            }
            c1359b.f17807g = null;
            if (c1359b.f17806f != null) {
                return;
            }
            c1359b.f17806f = C2680e.c(c1359b.f17804d, null, null, new BlockRunner$maybeRun$1(c1359b, null), 3);
        }
    }

    @Override // androidx.lifecycle.B, androidx.lifecycle.AbstractC1382z
    public final void h() {
        super.h();
        C1359b<T> c1359b = this.f17817m;
        if (c1359b != null) {
            if (c1359b.f17807g != null) {
                throw new IllegalStateException("Cancel call cannot happen without a maybeRun");
            }
            Sa.b bVar = kotlinx.coroutines.N.f43198a;
            c1359b.f17807g = C2680e.c(c1359b.f17804d, kotlinx.coroutines.internal.q.f43500a.d1(), null, new BlockRunner$cancel$1(c1359b, null), 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final p293xa.r m(ContinuationImpl continuationImpl) {
        CoroutineLiveData$clearSource$1 coroutineLiveData$clearSource$1;
        if (continuationImpl instanceof CoroutineLiveData$clearSource$1) {
            coroutineLiveData$clearSource$1 = (CoroutineLiveData$clearSource$1) continuationImpl;
            int i10 = coroutineLiveData$clearSource$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                coroutineLiveData$clearSource$1.label = i10 - Integer.MIN_VALUE;
            } else {
                coroutineLiveData$clearSource$1 = new CoroutineLiveData$clearSource$1(this, continuationImpl);
            }
        } else {
            coroutineLiveData$clearSource$1 = new CoroutineLiveData$clearSource$1(this, continuationImpl);
        }
        Object obj = coroutineLiveData$clearSource$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = coroutineLiveData$clearSource$1.label;
        if (i11 != 0 && i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        return p293xa.r.f47939a;
    }
}
