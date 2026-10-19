package androidx.compose.foundation.gestures;

import D2.V;
import androidx.compose.ui.input.pointer.util.VelocityTracker1D;
import com.braze.Constants;
import com.braze.support.BrazeLogger;
import com.google.android.gms.internal.measurement.C1787c0;
import com.google.android.gms.internal.measurement.Y;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.A0;
import kotlinx.coroutines.G0;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.z0;

/* JADX INFO: compiled from: MouseWheelScrollable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScrollingLogic f10020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.compose.foundation.gestures.a f10021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ia.p<p013b0.p, kotlin.coroutines.c<? super p293xa.r>, Object> f10022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p013b0.c f10023d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f10025f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public z0 f10026g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BufferedChannel f10024e = kotlinx.coroutines.channels.g.a(BrazeLogger.SUPPRESS, 6, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n f10027h = new n();

    /* JADX INFO: compiled from: MouseWheelScrollable.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f10028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f10029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f10030c;

        public a(long j, long j10, boolean z10) {
            this.f10028a = j;
            this.f10029b = j10;
            this.f10030c = z10;
        }

        public final a a(a aVar) {
            return new a(I.d.g(this.f10028a, aVar.f10028a), Math.max(this.f10029b, aVar.f10029b), this.f10030c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return I.d.b(this.f10028a, aVar.f10028a) && this.f10029b == aVar.f10029b && this.f10030c == aVar.f10030c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f10030c) + C4.b.c(this.f10029b, Long.hashCode(this.f10028a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MouseWheelScrollDelta(value=");
            sb2.append((Object) I.d.i(this.f10028a));
            sb2.append(", timeMillis=");
            sb2.append(this.f10029b);
            sb2.append(", shouldApplyImmediately=");
            return Z3.o.d(sb2, this.f10030c, ')');
        }
    }

    public m(ScrollingLogic scrollingLogic, androidx.compose.foundation.gestures.a aVar, Ia.p pVar, p013b0.c cVar) {
        this.f10020a = scrollingLogic;
        this.f10021b = aVar;
        this.f10022c = pVar;
        this.f10023d = cVar;
    }

    public static final float a(m mVar, o oVar, float f10) {
        ScrollingLogic scrollingLogic = mVar.f10020a;
        return scrollingLogic.g(scrollingLogic.e(oVar.a(scrollingLogic.h(scrollingLogic.d(f10)))));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, androidx.compose.animation.core.h] */
    /* JADX WARN: Type inference failed for: r0v13, types: [T, androidx.compose.foundation.gestures.m$a] */
    public static final Object b(m mVar, ScrollingLogic scrollingLogic, a aVar, float f10, float f11, ContinuationImpl continuationImpl) {
        MouseWheelScrollingLogic$dispatchMouseWheelScroll$1 mouseWheelScrollingLogic$dispatchMouseWheelScroll$1;
        float f12;
        m mVar2;
        Ref$FloatRef ref$FloatRef;
        ScrollingLogic scrollingLogic2 = scrollingLogic;
        mVar.getClass();
        if (continuationImpl instanceof MouseWheelScrollingLogic$dispatchMouseWheelScroll$1) {
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$1 = (MouseWheelScrollingLogic$dispatchMouseWheelScroll$1) continuationImpl;
            int i10 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$1.label = i10 - Integer.MIN_VALUE;
            } else {
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$1 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$1(mVar, continuationImpl);
            }
        } else {
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$1 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$1(mVar, continuationImpl);
        }
        MouseWheelScrollingLogic$dispatchMouseWheelScroll$1 mouseWheelScrollingLogic$dispatchMouseWheelScroll$2 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$1;
        Object obj = mouseWheelScrollingLogic$dispatchMouseWheelScroll$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$2.label;
        if (i11 != 0) {
            if (i11 == 1) {
                f12 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$2.F$0;
                ref$FloatRef = (Ref$FloatRef) mouseWheelScrollingLogic$dispatchMouseWheelScroll$2.L$2;
                ScrollingLogic scrollingLogic3 = (ScrollingLogic) mouseWheelScrollingLogic$dispatchMouseWheelScroll$2.L$1;
                mVar2 = (m) mouseWheelScrollingLogic$dispatchMouseWheelScroll$2.L$0;
                kotlin.b.b(obj);
                scrollingLogic2 = scrollingLogic3;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return p293xa.r.f47939a;
        }
        kotlin.b.b(obj);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = aVar;
        mVar.e(aVar);
        a aVarD = d(mVar.f10024e);
        if (aVarD != null) {
            mVar.e(aVarD);
            ref$ObjectRef.element = ((a) ref$ObjectRef.element).a(aVarD);
        }
        Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
        float fG = scrollingLogic2.g(scrollingLogic2.e(((a) ref$ObjectRef.element).f10028a));
        ref$FloatRef2.element = fG;
        if (l.a(fG)) {
            return p293xa.r.f47939a;
        }
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        ref$ObjectRef2.element = V.d(0.0f, 0.0f, 30);
        MouseWheelScrollingLogic$dispatchMouseWheelScroll$3 mouseWheelScrollingLogic$dispatchMouseWheelScroll$3 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$3(ref$FloatRef2, ref$ObjectRef2, ref$ObjectRef, f10, mVar, f11, scrollingLogic, null);
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$2.L$0 = mVar;
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$2.L$1 = scrollingLogic2;
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$2.L$2 = ref$FloatRef2;
        f12 = f11;
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$2.F$0 = f12;
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$2.label = 1;
        if (mVar.f(scrollingLogic2, mouseWheelScrollingLogic$dispatchMouseWheelScroll$3, mouseWheelScrollingLogic$dispatchMouseWheelScroll$2) == coroutineSingletons) {
            return coroutineSingletons;
        }
        mVar2 = mVar;
        ref$FloatRef = ref$FloatRef2;
        n nVar = mVar2.f10027h;
        long jA = I2.e.a(((VelocityTracker1D) nVar.f10031a).b(Float.MAX_VALUE), ((VelocityTracker1D) nVar.f10032b).b(Float.MAX_VALUE));
        if (jA == 0) {
            float fD = scrollingLogic2.d(Math.signum(ref$FloatRef.element)) * Math.min(Math.abs(ref$FloatRef.element) / 100, f12) * Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS;
            if (fD == 0.0f) {
                jA = 0;
            } else {
                jA = scrollingLogic2.f9988d == Orientation.f9958c ? I2.e.a(fD, 0.0f) : I2.e.a(0.0f, fD);
            }
        }
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$2.L$0 = null;
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$2.L$1 = null;
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$2.L$2 = null;
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$2.label = 2;
        if (((ScrollableNode$ensureMouseWheelScrollNodeInitialized$1) mVar2.f10022c).a(jA) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return p293xa.r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, androidx.compose.animation.core.h] */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, androidx.compose.foundation.gestures.m$a] */
    public static final Object c(m mVar, Ref$ObjectRef ref$ObjectRef, Ref$FloatRef ref$FloatRef, ScrollingLogic scrollingLogic, Ref$ObjectRef ref$ObjectRef2, long j, ContinuationImpl continuationImpl) {
        MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1 mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1;
        Ref$FloatRef ref$FloatRef2;
        ScrollingLogic scrollingLogic2;
        Ref$ObjectRef ref$ObjectRef3;
        Ref$ObjectRef ref$ObjectRef4;
        boolean z10;
        m mVar2 = mVar;
        if (continuationImpl instanceof MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1) {
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1 = (MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1) continuationImpl;
            int i10 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.label = i10 - Integer.MIN_VALUE;
            } else {
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1(continuationImpl);
            }
        } else {
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1(continuationImpl);
        }
        Object objB = mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.label;
        if (i11 == 0) {
            kotlin.b.b(objB);
            if (j < 0) {
                return Boolean.FALSE;
            }
            MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2 mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2(mVar, null);
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$0 = mVar2;
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$1 = ref$ObjectRef;
            ref$FloatRef2 = ref$FloatRef;
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$2 = ref$FloatRef2;
            scrollingLogic2 = scrollingLogic;
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$3 = scrollingLogic2;
            ref$ObjectRef3 = ref$ObjectRef2;
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$4 = ref$ObjectRef3;
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.label = 1;
            objB = G0.b(j, mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2, mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            ref$ObjectRef4 = ref$ObjectRef;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ref$ObjectRef ref$ObjectRef5 = (Ref$ObjectRef) mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$4;
            ScrollingLogic scrollingLogic3 = (ScrollingLogic) mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$3;
            Ref$FloatRef ref$FloatRef3 = (Ref$FloatRef) mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$2;
            ref$ObjectRef4 = (Ref$ObjectRef) mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$1;
            m mVar3 = (m) mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$0;
            kotlin.b.b(objB);
            ref$ObjectRef3 = ref$ObjectRef5;
            scrollingLogic2 = scrollingLogic3;
            ref$FloatRef2 = ref$FloatRef3;
            mVar2 = mVar3;
        }
        a aVar = (a) objB;
        if (aVar != null) {
            boolean z11 = ((a) ref$ObjectRef4.element).f10030c;
            long j10 = aVar.f10028a;
            ref$ObjectRef4.element = new a(j10, aVar.f10029b, z11);
            ref$FloatRef2.element = scrollingLogic2.g(scrollingLogic2.e(j10));
            ref$ObjectRef3.element = V.d(0.0f, 0.0f, 30);
            mVar2.e(aVar);
            z10 = !l.a(ref$FloatRef2.element);
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public static a d(final BufferedChannel bufferedChannel) {
        a aVar = null;
        kotlin.sequences.h hVarN = C1787c0.n(new MouseWheelScrollingLogic$untilNull$1(new Ia.a<a>() { // from class: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$sumOrNull$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final m.a invoke() {
                return (m.a) kotlinx.coroutines.channels.h.b(bufferedChannel.g());
            }
        }, null));
        while (hVarN.hasNext()) {
            a aVarA = (a) hVarN.next();
            if (aVar != null) {
                aVarA = aVar.a(aVarA);
            }
            aVar = aVarA;
        }
        return aVar;
    }

    public final void e(a aVar) {
        long j = aVar.f10029b;
        n nVar = this.f10027h;
        nVar.getClass();
        long j10 = aVar.f10028a;
        ((VelocityTracker1D) nVar.f10031a).a(Float.intBitsToFloat((int) (j10 >> 32)), j);
        ((VelocityTracker1D) nVar.f10032b).a(Float.intBitsToFloat((int) (j10 & 4294967295L)), j);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(ScrollingLogic scrollingLogic, Ia.p pVar, ContinuationImpl continuationImpl) {
        MouseWheelScrollingLogic$userScroll$1 mouseWheelScrollingLogic$userScroll$1;
        m mVar;
        if (continuationImpl instanceof MouseWheelScrollingLogic$userScroll$1) {
            mouseWheelScrollingLogic$userScroll$1 = (MouseWheelScrollingLogic$userScroll$1) continuationImpl;
            int i10 = mouseWheelScrollingLogic$userScroll$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                mouseWheelScrollingLogic$userScroll$1.label = i10 - Integer.MIN_VALUE;
            } else {
                mouseWheelScrollingLogic$userScroll$1 = new MouseWheelScrollingLogic$userScroll$1(this, continuationImpl);
            }
        } else {
            mouseWheelScrollingLogic$userScroll$1 = new MouseWheelScrollingLogic$userScroll$1(this, continuationImpl);
        }
        Object obj = mouseWheelScrollingLogic$userScroll$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = mouseWheelScrollingLogic$userScroll$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            this.f10025f = true;
            MouseWheelScrollingLogic$userScroll$2 mouseWheelScrollingLogic$userScroll$2 = new MouseWheelScrollingLogic$userScroll$2(pVar, scrollingLogic, null);
            mouseWheelScrollingLogic$userScroll$1.L$0 = this;
            mouseWheelScrollingLogic$userScroll$1.label = 1;
            A0 a10 = new A0(mouseWheelScrollingLogic$userScroll$1, mouseWheelScrollingLogic$userScroll$1.getContext());
            if (Y.l(a10, a10, mouseWheelScrollingLogic$userScroll$2) == coroutineSingletons) {
                return coroutineSingletons;
            }
            mVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mVar = (m) mouseWheelScrollingLogic$userScroll$1.L$0;
            kotlin.b.b(obj);
        }
        mVar.f10025f = false;
        return p293xa.r.f47939a;
    }
}
