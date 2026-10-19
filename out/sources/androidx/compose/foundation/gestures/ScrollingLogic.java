package androidx.compose.foundation.gestures;

import androidx.compose.foundation.E;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollNode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ScrollingLogic {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u f9985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public E f9986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j f9987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Orientation f9988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public NestedScrollDispatcher f9990f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Ia.a<Boolean> f9991g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9992h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9993i = 1;
    public s j = ScrollableKt.f9968b;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f9994k = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Ia.l<I.d, I.d> f9995l = new Ia.l<I.d, I.d>() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$performScrollForOverscroll$1
        {
            super(1);
        }

        @Override // Ia.l
        public final I.d invoke(I.d dVar) {
            long j = dVar.f3754a;
            ScrollingLogic scrollingLogic = this.this$0;
            return new I.d(ScrollingLogic.a(scrollingLogic, scrollingLogic.j, j, scrollingLogic.f9993i));
        }
    };

    /* JADX INFO: compiled from: Scrollable.kt */
    public static final class a implements o {
        public a() {
        }

        @Override // androidx.compose.foundation.gestures.o
        public final long a(long j) {
            ScrollingLogic scrollingLogic = ScrollingLogic.this;
            return ScrollingLogic.a(scrollingLogic, scrollingLogic.j, j, 1);
        }

        @Override // androidx.compose.foundation.gestures.o
        public final long b(int i10, long j) {
            ScrollingLogic scrollingLogic = ScrollingLogic.this;
            scrollingLogic.f9993i = i10;
            E e10 = scrollingLogic.f9986b;
            return (e10 == null || !(scrollingLogic.f9985a.d() || scrollingLogic.f9985a.c())) ? ScrollingLogic.a(scrollingLogic, scrollingLogic.j, j, i10) : e10.a(j, scrollingLogic.f9993i, scrollingLogic.f9995l);
        }
    }

    public ScrollingLogic(u uVar, E e10, j jVar, Orientation orientation, boolean z10, NestedScrollDispatcher nestedScrollDispatcher, Ia.a<Boolean> aVar) {
        this.f9985a = uVar;
        this.f9986b = e10;
        this.f9987c = jVar;
        this.f9988d = orientation;
        this.f9989e = z10;
        this.f9990f = nestedScrollDispatcher;
        this.f9991g = aVar;
    }

    public static final long a(ScrollingLogic scrollingLogic, s sVar, long j, int i10) {
        NestedScrollNode nestedScrollNode = scrollingLogic.f9990f.f14001a;
        NestedScrollNode nestedScrollNode2 = null;
        NestedScrollNode nestedScrollNode3 = (nestedScrollNode == null || !nestedScrollNode.f13997o) ? null : (NestedScrollNode) Cb.a.f(nestedScrollNode);
        long jC1 = 0;
        long jC0 = nestedScrollNode3 != null ? nestedScrollNode3.C0(i10, j) : 0L;
        long jF = I.d.f(j, jC0);
        long jE = scrollingLogic.e(scrollingLogic.h(sVar.f(scrollingLogic.g(scrollingLogic.e(I.d.a(0.0f, scrollingLogic.f9988d == Orientation.f9958c ? 1 : 2, jF))))));
        long jF2 = I.d.f(jF, jE);
        NestedScrollNode nestedScrollNode4 = scrollingLogic.f9990f.f14001a;
        if (nestedScrollNode4 != null && nestedScrollNode4.f13997o) {
            nestedScrollNode2 = (NestedScrollNode) Cb.a.f(nestedScrollNode4);
        }
        NestedScrollNode nestedScrollNode5 = nestedScrollNode2;
        if (nestedScrollNode5 != null) {
            jC1 = nestedScrollNode5.c1(i10, jE, jF2);
        }
        return I.d.g(I.d.g(jC0, jE), jC1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j, ContinuationImpl continuationImpl) {
        ScrollingLogic$doFlingAnimation$1 scrollingLogic$doFlingAnimation$1;
        ScrollingLogic scrollingLogic;
        Ref$LongRef ref$LongRef;
        if (continuationImpl instanceof ScrollingLogic$doFlingAnimation$1) {
            scrollingLogic$doFlingAnimation$1 = (ScrollingLogic$doFlingAnimation$1) continuationImpl;
            int i10 = scrollingLogic$doFlingAnimation$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                scrollingLogic$doFlingAnimation$1.label = i10 - Integer.MIN_VALUE;
            } else {
                scrollingLogic$doFlingAnimation$1 = new ScrollingLogic$doFlingAnimation$1(this, continuationImpl);
            }
        } else {
            scrollingLogic$doFlingAnimation$1 = new ScrollingLogic$doFlingAnimation$1(this, continuationImpl);
        }
        Object obj = scrollingLogic$doFlingAnimation$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = scrollingLogic$doFlingAnimation$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            Ref$LongRef ref$LongRef2 = new Ref$LongRef();
            ref$LongRef2.element = j;
            this.f9992h = true;
            MutatePriority mutatePriority = MutatePriority.f9810b;
            ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this, ref$LongRef2, j, null);
            scrollingLogic$doFlingAnimation$1.L$0 = this;
            scrollingLogic$doFlingAnimation$1.L$1 = ref$LongRef2;
            scrollingLogic$doFlingAnimation$1.label = 1;
            if (f(mutatePriority, scrollingLogic$doFlingAnimation$2, scrollingLogic$doFlingAnimation$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            scrollingLogic = this;
            ref$LongRef = ref$LongRef2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$LongRef = (Ref$LongRef) scrollingLogic$doFlingAnimation$1.L$1;
            scrollingLogic = (ScrollingLogic) scrollingLogic$doFlingAnimation$1.L$0;
            kotlin.b.b(obj);
        }
        scrollingLogic.f9992h = false;
        return new p013b0.p(ref$LongRef.element);
    }

    public final Object c(long j, boolean z10, SuspendLambda suspendLambda) {
        if (z10) {
            Ia.l<androidx.compose.ui.input.pointer.q, Boolean> lVar = ScrollableKt.f9967a;
            return p293xa.r.f47939a;
        }
        long jA = p013b0.p.a(0.0f, 0.0f, this.f9988d == Orientation.f9958c ? 1 : 2, j);
        ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$1 = new ScrollingLogic$onScrollStopped$performFling$1(this, null);
        E e10 = this.f9986b;
        if (e10 != null && (this.f9985a.d() || this.f9985a.c())) {
            Object objB = e10.b(jA, scrollingLogic$onScrollStopped$performFling$1, suspendLambda);
            return objB == CoroutineSingletons.f43038b ? objB : p293xa.r.f47939a;
        }
        ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$2 = new ScrollingLogic$onScrollStopped$performFling$1(scrollingLogic$onScrollStopped$performFling$1.this$0, suspendLambda);
        scrollingLogic$onScrollStopped$performFling$2.J$0 = jA;
        p293xa.r rVar = p293xa.r.f47939a;
        Object objInvokeSuspend = scrollingLogic$onScrollStopped$performFling$2.invokeSuspend(rVar);
        return objInvokeSuspend == CoroutineSingletons.f43038b ? objInvokeSuspend : rVar;
    }

    public final float d(float f10) {
        return this.f9989e ? f10 * (-1) : f10;
    }

    public final long e(long j) {
        return this.f9989e ? I.d.h(-1.0f, j) : j;
    }

    public final Object f(MutatePriority mutatePriority, Ia.p pVar, ContinuationImpl continuationImpl) {
        Object objB = this.f9985a.b(mutatePriority, new ScrollingLogic$scroll$2(pVar, this, null), continuationImpl);
        return objB == CoroutineSingletons.f43038b ? objB : p293xa.r.f47939a;
    }

    public final float g(long j) {
        return Float.intBitsToFloat((int) (this.f9988d == Orientation.f9958c ? j >> 32 : j & 4294967295L));
    }

    public final long h(float f10) {
        long jFloatToRawIntBits;
        long j;
        if (f10 == 0.0f) {
            return 0L;
        }
        if (this.f9988d == Orientation.f9958c) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(f10);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(f10);
            j = jFloatToRawIntBits3 << 32;
        }
        return j | (jFloatToRawIntBits & 4294967295L);
    }
}
