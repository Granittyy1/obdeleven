package androidx.compose.foundation.lazy.layout;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C2693i;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AwaitFirstLayoutModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0968c implements androidx.compose.ui.layout.N {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C2693i f10712c;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        AwaitFirstLayoutModifier$waitForFirstLayout$1 awaitFirstLayoutModifier$waitForFirstLayout$1;
        kotlin.coroutines.c cVar;
        if (continuationImpl instanceof AwaitFirstLayoutModifier$waitForFirstLayout$1) {
            awaitFirstLayoutModifier$waitForFirstLayout$1 = (AwaitFirstLayoutModifier$waitForFirstLayout$1) continuationImpl;
            int i10 = awaitFirstLayoutModifier$waitForFirstLayout$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                awaitFirstLayoutModifier$waitForFirstLayout$1.label = i10 - Integer.MIN_VALUE;
            } else {
                awaitFirstLayoutModifier$waitForFirstLayout$1 = new AwaitFirstLayoutModifier$waitForFirstLayout$1(this, continuationImpl);
            }
        } else {
            awaitFirstLayoutModifier$waitForFirstLayout$1 = new AwaitFirstLayoutModifier$waitForFirstLayout$1(this, continuationImpl);
        }
        Object obj = awaitFirstLayoutModifier$waitForFirstLayout$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = awaitFirstLayoutModifier$waitForFirstLayout$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            if (!this.f10711b) {
                C2693i c2693i = this.f10712c;
                awaitFirstLayoutModifier$waitForFirstLayout$1.L$0 = this;
                awaitFirstLayoutModifier$waitForFirstLayout$1.L$1 = c2693i;
                awaitFirstLayoutModifier$waitForFirstLayout$1.label = 1;
                C2693i c2693i2 = new C2693i(1, A8.p.y(awaitFirstLayoutModifier$waitForFirstLayout$1));
                c2693i2.s();
                this.f10712c = c2693i2;
                if (c2693i2.p() == coroutineSingletons) {
                    return coroutineSingletons;
                }
                cVar = c2693i;
            }
            return p293xa.r.f47939a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        cVar = (kotlin.coroutines.c) awaitFirstLayoutModifier$waitForFirstLayout$1.L$1;
        kotlin.b.b(obj);
        if (cVar != null) {
            cVar.resumeWith(p293xa.r.f47939a);
        }
        return p293xa.r.f47939a;
    }

    @Override // androidx.compose.ui.layout.N
    public final void y() {
        if (this.f10711b) {
            return;
        }
        this.f10711b = true;
        C2693i c2693i = this.f10712c;
        if (c2693i != null) {
            c2693i.resumeWith(p293xa.r.f47939a);
        }
        this.f10712c = null;
    }
}
