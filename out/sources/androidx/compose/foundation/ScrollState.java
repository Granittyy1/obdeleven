package androidx.compose.foundation;

import androidx.compose.foundation.gestures.DefaultScrollableState;
import androidx.compose.runtime.C1081d0;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.saveable.SaverKt;
import com.braze.support.BrazeLogger;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Scroll.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ScrollState implements androidx.compose.foundation.gestures.u {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final W.f f9823i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1081d0 f9824a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f9828e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1081d0 f9825b = new C1081d0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.compose.foundation.interaction.l f9826c = new androidx.compose.foundation.interaction.l();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1081d0 f9827d = new C1081d0(BrazeLogger.SUPPRESS);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DefaultScrollableState f9829f = new DefaultScrollableState(new Ia.l<Float, Float>() { // from class: androidx.compose.foundation.ScrollState$scrollableState$1
        {
            super(1);
        }

        @Override // Ia.l
        public final Float invoke(Float f10) {
            float fFloatValue = f10.floatValue();
            float fO = this.this$0.f9824a.o() + fFloatValue;
            ScrollState scrollState = this.this$0;
            float f11 = fO + scrollState.f9828e;
            float fC = Na.l.C(f11, 0.0f, scrollState.f9827d.o());
            boolean z10 = f11 == fC;
            float fO2 = fC - this.this$0.f9824a.o();
            int iRound = Math.round(fO2);
            ScrollState scrollState2 = this.this$0;
            scrollState2.f9824a.m(scrollState2.f9824a.o() + iRound);
            this.this$0.f9828e = fO2 - iRound;
            if (!z10) {
                fFloatValue = fO2;
            }
            return Float.valueOf(fFloatValue);
        }
    });

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DerivedSnapshotState f9830g = J0.d(new Ia.a<Boolean>() { // from class: androidx.compose.foundation.ScrollState$canScrollForward$2
        {
            super(0);
        }

        @Override // Ia.a
        public final Boolean invoke() {
            return Boolean.valueOf(this.this$0.f9824a.o() < this.this$0.f9827d.o());
        }
    });

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DerivedSnapshotState f9831h = J0.d(new Ia.a<Boolean>() { // from class: androidx.compose.foundation.ScrollState$canScrollBackward$2
        {
            super(0);
        }

        @Override // Ia.a
        public final Boolean invoke() {
            return Boolean.valueOf(this.this$0.f9824a.o() > 0);
        }
    });

    static {
        W.f fVar = SaverKt.f13134a;
        f9823i = new W.f(new Ia.p<androidx.compose.runtime.saveable.j, ScrollState, Integer>() { // from class: androidx.compose.foundation.ScrollState$Companion$Saver$1
            @Override // Ia.p
            public final Integer invoke(androidx.compose.runtime.saveable.j jVar, ScrollState scrollState) {
                return Integer.valueOf(scrollState.f9824a.o());
            }
        }, new Ia.l<Integer, ScrollState>() { // from class: androidx.compose.foundation.ScrollState$Companion$Saver$2
            @Override // Ia.l
            public final ScrollState invoke(Integer num) {
                return new ScrollState(num.intValue());
            }
        });
    }

    public ScrollState(int i10) {
        this.f9824a = new C1081d0(i10);
    }

    @Override // androidx.compose.foundation.gestures.u
    public final boolean a() {
        return this.f9829f.a();
    }

    @Override // androidx.compose.foundation.gestures.u
    public final Object b(MutatePriority mutatePriority, Ia.p<? super androidx.compose.foundation.gestures.s, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> pVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        Object objB = this.f9829f.b(mutatePriority, pVar, cVar);
        return objB == CoroutineSingletons.f43038b ? objB : p293xa.r.f47939a;
    }

    @Override // androidx.compose.foundation.gestures.u
    public final boolean c() {
        return ((Boolean) this.f9831h.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.u
    public final boolean d() {
        return ((Boolean) this.f9830g.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.u
    public final float e(float f10) {
        return this.f9829f.e(f10);
    }

    public final Object f(int i10, SuspendLambda suspendLambda) {
        return androidx.compose.foundation.gestures.r.b(this, i10 - this.f9824a.o(), suspendLambda);
    }
}
