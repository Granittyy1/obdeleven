package androidx.compose.ui.input.nestedscroll;

import I.d;
import Ia.l;
import androidx.compose.ui.h;
import androidx.compose.ui.node.e0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.A;
import p013b0.p;

/* JADX INFO: compiled from: NestedScrollNode.kt */
/* JADX INFO: loaded from: classes.dex */
public final class NestedScrollNode extends h.c implements e0, a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a f14007p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public NestedScrollDispatcher f14008q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public NestedScrollNode f14009r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f14010s;

    public NestedScrollNode(a aVar, NestedScrollDispatcher nestedScrollDispatcher) {
        this.f14007p = aVar;
        this.f14008q = nestedScrollDispatcher == null ? new NestedScrollDispatcher() : nestedScrollDispatcher;
        this.f14010s = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public final long C0(int i10, long j) {
        boolean z10 = this.f13997o;
        NestedScrollNode nestedScrollNode = null;
        if (z10 && z10) {
            nestedScrollNode = (NestedScrollNode) Cb.a.f(this);
        }
        long jC0 = nestedScrollNode != null ? nestedScrollNode.C0(i10, j) : 0L;
        return d.g(jC0, this.f14007p.C0(i10, d.f(j, jC0)));
    }

    @Override // androidx.compose.ui.h.c
    public final void I1() {
        NestedScrollDispatcher nestedScrollDispatcher = this.f14008q;
        nestedScrollDispatcher.f14001a = this;
        nestedScrollDispatcher.f14002b = null;
        this.f14009r = null;
        nestedScrollDispatcher.f14003c = new NestedScrollNode$updateDispatcherFields$1(this);
        this.f14008q.f14004d = E1();
    }

    @Override // androidx.compose.ui.node.e0
    public final Object J() {
        return this.f14010s;
    }

    @Override // androidx.compose.ui.h.c
    public final void J1() {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Cb.a.n(this, new l<Object, Boolean>() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt$findNearestAttachedAncestor$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.compose.ui.node.e, androidx.compose.ui.node.e0] */
            @Override // Ia.l
            public final Boolean invoke(Object obj) {
                boolean z10;
                ?? r10 = (e0) obj;
                if (r10.getNode().f13997o) {
                    ref$ObjectRef.element = r10;
                    z10 = false;
                } else {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
        });
        NestedScrollNode nestedScrollNode = (NestedScrollNode) ((e0) ref$ObjectRef.element);
        this.f14009r = nestedScrollNode;
        NestedScrollDispatcher nestedScrollDispatcher = this.f14008q;
        nestedScrollDispatcher.f14002b = nestedScrollNode;
        if (nestedScrollDispatcher.f14001a == this) {
            nestedScrollDispatcher.f14001a = null;
        }
    }

    public final A Q1() {
        NestedScrollNode nestedScrollNode = this.f13997o ? (NestedScrollNode) Cb.a.f(this) : null;
        if (nestedScrollNode != null) {
            return nestedScrollNode.Q1();
        }
        A a10 = this.f14008q.f14004d;
        if (a10 != null) {
            return a10;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // androidx.compose.ui.input.nestedscroll.a
    public final Object U(long j, long j10, kotlin.coroutines.c<? super p> cVar) {
        NestedScrollNode$onPostFling$1 nestedScrollNode$onPostFling$1;
        long j11;
        long j12;
        NestedScrollNode nestedScrollNode;
        NestedScrollNode nestedScrollNode2;
        long j13;
        long j14;
        long j15;
        if (cVar instanceof NestedScrollNode$onPostFling$1) {
            nestedScrollNode$onPostFling$1 = (NestedScrollNode$onPostFling$1) cVar;
            int i10 = nestedScrollNode$onPostFling$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                nestedScrollNode$onPostFling$1.label = i10 - Integer.MIN_VALUE;
            } else {
                nestedScrollNode$onPostFling$1 = new NestedScrollNode$onPostFling$1(this, (ContinuationImpl) cVar);
            }
        } else {
            nestedScrollNode$onPostFling$1 = new NestedScrollNode$onPostFling$1(this, (ContinuationImpl) cVar);
        }
        Object objU = nestedScrollNode$onPostFling$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = nestedScrollNode$onPostFling$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                long j16 = nestedScrollNode$onPostFling$1.J$1;
                long j17 = nestedScrollNode$onPostFling$1.J$0;
                nestedScrollNode = (NestedScrollNode) nestedScrollNode$onPostFling$1.L$0;
                kotlin.b.b(objU);
                j12 = j16;
                j11 = j17;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j15 = nestedScrollNode$onPostFling$1.J$0;
                kotlin.b.b(objU);
            }
            j14 = ((p) objU).f20496a;
            j13 = j15;
            return new p(p.e(j13, j14));
        }
        kotlin.b.b(objU);
        a aVar = this.f14007p;
        nestedScrollNode$onPostFling$1.L$0 = this;
        j11 = j;
        nestedScrollNode$onPostFling$1.J$0 = j11;
        j12 = j10;
        nestedScrollNode$onPostFling$1.J$1 = j12;
        nestedScrollNode$onPostFling$1.label = 1;
        objU = aVar.U(j, j10, nestedScrollNode$onPostFling$1);
        if (objU == coroutineSingletons) {
            return coroutineSingletons;
        }
        nestedScrollNode = this;
        long j18 = ((p) objU).f20496a;
        boolean z10 = nestedScrollNode.f13997o;
        if (z10) {
            nestedScrollNode2 = (z10 && z10) ? (NestedScrollNode) Cb.a.f(nestedScrollNode) : null;
        } else {
            nestedScrollNode2 = nestedScrollNode.f14009r;
        }
        if (nestedScrollNode2 != null) {
            long jE = p.e(j11, j18);
            long jD = p.d(j12, j18);
            nestedScrollNode$onPostFling$1.L$0 = null;
            nestedScrollNode$onPostFling$1.J$0 = j18;
            nestedScrollNode$onPostFling$1.label = 2;
            objU = nestedScrollNode2.U(jE, jD, nestedScrollNode$onPostFling$1);
            if (objU == coroutineSingletons) {
                return coroutineSingletons;
            }
            j15 = j18;
            j14 = ((p) objU).f20496a;
            j13 = j15;
        } else {
            j13 = j18;
            j14 = 0;
        }
        return new p(p.e(j13, j14));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0080 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.a
    public final Object X0(long j, kotlin.coroutines.c<? super p> cVar) {
        NestedScrollNode$onPreFling$1 nestedScrollNode$onPreFling$1;
        long j10;
        NestedScrollNode nestedScrollNode;
        long j11;
        if (cVar instanceof NestedScrollNode$onPreFling$1) {
            nestedScrollNode$onPreFling$1 = (NestedScrollNode$onPreFling$1) cVar;
            int i10 = nestedScrollNode$onPreFling$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                nestedScrollNode$onPreFling$1.label = i10 - Integer.MIN_VALUE;
            } else {
                nestedScrollNode$onPreFling$1 = new NestedScrollNode$onPreFling$1(this, (ContinuationImpl) cVar);
            }
        } else {
            nestedScrollNode$onPreFling$1 = new NestedScrollNode$onPreFling$1(this, (ContinuationImpl) cVar);
        }
        Object objX0 = nestedScrollNode$onPreFling$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = nestedScrollNode$onPreFling$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                j = nestedScrollNode$onPreFling$1.J$0;
                nestedScrollNode = (NestedScrollNode) nestedScrollNode$onPreFling$1.L$0;
                kotlin.b.b(objX0);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j11 = nestedScrollNode$onPreFling$1.J$0;
                kotlin.b.b(objX0);
            }
            return new p(p.e(j11, ((p) objX0).f20496a));
        }
        kotlin.b.b(objX0);
        boolean z10 = this.f13997o;
        NestedScrollNode nestedScrollNode2 = (z10 && z10) ? (NestedScrollNode) Cb.a.f(this) : null;
        if (nestedScrollNode2 != null) {
            nestedScrollNode$onPreFling$1.L$0 = this;
            nestedScrollNode$onPreFling$1.J$0 = j;
            nestedScrollNode$onPreFling$1.label = 1;
            objX0 = nestedScrollNode2.X0(j, nestedScrollNode$onPreFling$1);
            if (objX0 == coroutineSingletons) {
                return coroutineSingletons;
            }
            nestedScrollNode = this;
        } else {
            j10 = 0;
            nestedScrollNode = this;
        }
        long j12 = j;
        j11 = j10;
        a aVar = nestedScrollNode.f14007p;
        long jD = p.d(j12, j11);
        nestedScrollNode$onPreFling$1.L$0 = null;
        nestedScrollNode$onPreFling$1.J$0 = j11;
        nestedScrollNode$onPreFling$1.label = 2;
        objX0 = aVar.X0(jD, nestedScrollNode$onPreFling$1);
        if (objX0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        return new p(p.e(j11, ((p) objX0).f20496a));
        j10 = ((p) objX0).f20496a;
        long j13 = j;
        j11 = j10;
        a aVar2 = nestedScrollNode.f14007p;
        long jD2 = p.d(j13, j11);
        nestedScrollNode$onPreFling$1.L$0 = null;
        nestedScrollNode$onPreFling$1.J$0 = j11;
        nestedScrollNode$onPreFling$1.label = 2;
        objX0 = aVar2.X0(jD2, nestedScrollNode$onPreFling$1);
        if (objX0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        return new p(p.e(j11, ((p) objX0).f20496a));
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public final long c1(int i10, long j, long j10) {
        long jC1 = this.f14007p.c1(i10, j, j10);
        boolean z10 = this.f13997o;
        NestedScrollNode nestedScrollNode = null;
        if (z10 && z10) {
            nestedScrollNode = (NestedScrollNode) Cb.a.f(this);
        }
        NestedScrollNode nestedScrollNode2 = nestedScrollNode;
        return d.g(jC1, nestedScrollNode2 != null ? nestedScrollNode2.c1(i10, d.g(j, jC1), d.f(j10, jC1)) : 0L);
    }
}
