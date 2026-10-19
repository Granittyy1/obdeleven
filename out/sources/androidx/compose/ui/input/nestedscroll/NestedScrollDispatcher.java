package androidx.compose.ui.input.nestedscroll;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.A;
import p013b0.p;

/* JADX INFO: compiled from: NestedScrollModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class NestedScrollDispatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NestedScrollNode f14001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public NestedScrollNode f14002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Lambda f14003c = new Ia.a<A>() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$calculateNestedScrollScope$1
        {
            super(0);
        }

        @Override // Ia.a
        public final A invoke() {
            return this.this$0.f14004d;
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public A f14004d;

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(long j, long j10, ContinuationImpl continuationImpl) {
        NestedScrollDispatcher$dispatchPostFling$1 nestedScrollDispatcher$dispatchPostFling$1;
        long j11;
        if (continuationImpl instanceof NestedScrollDispatcher$dispatchPostFling$1) {
            nestedScrollDispatcher$dispatchPostFling$1 = (NestedScrollDispatcher$dispatchPostFling$1) continuationImpl;
            int i10 = nestedScrollDispatcher$dispatchPostFling$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                nestedScrollDispatcher$dispatchPostFling$1.label = i10 - Integer.MIN_VALUE;
            } else {
                nestedScrollDispatcher$dispatchPostFling$1 = new NestedScrollDispatcher$dispatchPostFling$1(this, continuationImpl);
            }
        } else {
            nestedScrollDispatcher$dispatchPostFling$1 = new NestedScrollDispatcher$dispatchPostFling$1(this, continuationImpl);
        }
        NestedScrollDispatcher$dispatchPostFling$1 nestedScrollDispatcher$dispatchPostFling$2 = nestedScrollDispatcher$dispatchPostFling$1;
        Object objU = nestedScrollDispatcher$dispatchPostFling$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = nestedScrollDispatcher$dispatchPostFling$2.label;
        if (i11 == 0) {
            kotlin.b.b(objU);
            NestedScrollNode nestedScrollNode = this.f14001a;
            NestedScrollNode nestedScrollNode2 = null;
            j11 = 0;
            if (((nestedScrollNode == null || !nestedScrollNode.f13997o) ? null : (NestedScrollNode) Cb.a.f(nestedScrollNode)) == null) {
                NestedScrollNode nestedScrollNode3 = this.f14002b;
                if (nestedScrollNode3 != null) {
                    nestedScrollDispatcher$dispatchPostFling$2.label = 1;
                    objU = nestedScrollNode3.U(j, j10, nestedScrollDispatcher$dispatchPostFling$2);
                    if (objU == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    j11 = ((p) objU).f20496a;
                }
            } else {
                NestedScrollNode nestedScrollNode4 = this.f14001a;
                if (nestedScrollNode4 != null && nestedScrollNode4.f13997o) {
                    nestedScrollNode2 = (NestedScrollNode) Cb.a.f(nestedScrollNode4);
                }
                if (nestedScrollNode2 != null) {
                    nestedScrollDispatcher$dispatchPostFling$2.label = 2;
                    objU = nestedScrollNode2.U(j, j10, nestedScrollDispatcher$dispatchPostFling$2);
                    if (objU == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    j11 = ((p) objU).f20496a;
                }
            }
        } else if (i11 == 1) {
            kotlin.b.b(objU);
            j11 = ((p) objU).f20496a;
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(objU);
            j11 = ((p) objU).f20496a;
        }
        return new p(j11);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j, ContinuationImpl continuationImpl) {
        NestedScrollDispatcher$dispatchPreFling$1 nestedScrollDispatcher$dispatchPreFling$1;
        long j10;
        if (continuationImpl instanceof NestedScrollDispatcher$dispatchPreFling$1) {
            nestedScrollDispatcher$dispatchPreFling$1 = (NestedScrollDispatcher$dispatchPreFling$1) continuationImpl;
            int i10 = nestedScrollDispatcher$dispatchPreFling$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                nestedScrollDispatcher$dispatchPreFling$1.label = i10 - Integer.MIN_VALUE;
            } else {
                nestedScrollDispatcher$dispatchPreFling$1 = new NestedScrollDispatcher$dispatchPreFling$1(this, continuationImpl);
            }
        } else {
            nestedScrollDispatcher$dispatchPreFling$1 = new NestedScrollDispatcher$dispatchPreFling$1(this, continuationImpl);
        }
        Object objX0 = nestedScrollDispatcher$dispatchPreFling$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = nestedScrollDispatcher$dispatchPreFling$1.label;
        if (i11 == 0) {
            kotlin.b.b(objX0);
            NestedScrollNode nestedScrollNode = this.f14001a;
            NestedScrollNode nestedScrollNode2 = null;
            if (nestedScrollNode != null && nestedScrollNode.f13997o) {
                nestedScrollNode2 = (NestedScrollNode) Cb.a.f(nestedScrollNode);
            }
            if (nestedScrollNode2 != null) {
                nestedScrollDispatcher$dispatchPreFling$1.label = 1;
                objX0 = nestedScrollNode2.X0(j, nestedScrollDispatcher$dispatchPreFling$1);
                if (objX0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                j10 = 0;
            }
            return new p(j10);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(objX0);
        j10 = ((p) objX0).f20496a;
        return new p(j10);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Ia.a, kotlin.jvm.internal.Lambda] */
    public final A c() {
        A a10 = (A) this.f14003c.invoke();
        if (a10 != null) {
            return a10;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
