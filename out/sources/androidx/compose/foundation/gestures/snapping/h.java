package androidx.compose.foundation.gestures.snapping;

import D2.V;
import Ia.l;
import androidx.compose.animation.core.C0909i;
import androidx.compose.animation.core.InterfaceC0906f;
import androidx.compose.animation.core.InterfaceC0918s;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.e0;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2;
import androidx.compose.foundation.gestures.s;
import androidx.compose.foundation.gestures.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C2680e;

/* JADX INFO: compiled from: SnapFlingBehavior.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f10045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0918s<Float> f10046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0906f<Float> f10047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScrollableKt.a f10048d = ScrollableKt.f9969c;

    public h(j jVar, InterfaceC0918s<Float> interfaceC0918s, InterfaceC0906f<Float> interfaceC0906f) {
        this.f10045a = jVar;
        this.f10046b = interfaceC0918s;
        this.f10047c = interfaceC0906f;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public static final Object c(h hVar, s sVar, float f10, float f11, l lVar, ContinuationImpl continuationImpl) {
        SnapFlingBehavior$tryApproach$1 snapFlingBehavior$tryApproach$1;
        Object objD;
        hVar.getClass();
        if (continuationImpl instanceof SnapFlingBehavior$tryApproach$1) {
            snapFlingBehavior$tryApproach$1 = (SnapFlingBehavior$tryApproach$1) continuationImpl;
            int i10 = snapFlingBehavior$tryApproach$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                snapFlingBehavior$tryApproach$1.label = i10 - Integer.MIN_VALUE;
            } else {
                snapFlingBehavior$tryApproach$1 = new SnapFlingBehavior$tryApproach$1(hVar, continuationImpl);
            }
        } else {
            snapFlingBehavior$tryApproach$1 = new SnapFlingBehavior$tryApproach$1(hVar, continuationImpl);
        }
        SnapFlingBehavior$tryApproach$1 snapFlingBehavior$tryApproach$2 = snapFlingBehavior$tryApproach$1;
        Object objE = snapFlingBehavior$tryApproach$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = snapFlingBehavior$tryApproach$2.label;
        if (i11 == 0) {
            kotlin.b.b(objE);
            if (Math.abs(f10) == 0.0f || Math.abs(f11) == 0.0f) {
                objD = V.d(f10, f11, 28);
            } else {
                snapFlingBehavior$tryApproach$2.label = 1;
                e0 e0Var = VectorConvertersKt.f9477a;
                InterfaceC0918s<Float> interfaceC0918s = hVar.f10046b;
                b cVar = Math.abs(((C0909i) interfaceC0918s.b().b(new C0909i(0.0f), new C0909i(f11))).f9552a) >= Math.abs(f10) ? new c(interfaceC0918s) : new N6.d(hVar.f10047c);
                float f12 = i.f10049a;
                objE = cVar.e(sVar, new Float(f10), new Float(f11), lVar, snapFlingBehavior$tryApproach$2);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return objD;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(objE);
        objD = ((a) objE).f10038b;
        return objD;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.x
    public final Object b(ScrollingLogic$doFlingAnimation$2.a aVar, float f10, l lVar, ContinuationImpl continuationImpl) throws Throwable {
        SnapFlingBehavior$performFling$1 snapFlingBehavior$performFling$1;
        if (continuationImpl instanceof SnapFlingBehavior$performFling$1) {
            snapFlingBehavior$performFling$1 = (SnapFlingBehavior$performFling$1) continuationImpl;
            int i10 = snapFlingBehavior$performFling$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                snapFlingBehavior$performFling$1.label = i10 - Integer.MIN_VALUE;
            } else {
                snapFlingBehavior$performFling$1 = new SnapFlingBehavior$performFling$1(this, continuationImpl);
            }
        } else {
            snapFlingBehavior$performFling$1 = new SnapFlingBehavior$performFling$1(this, continuationImpl);
        }
        Object objD = snapFlingBehavior$performFling$1.result;
        Object obj = CoroutineSingletons.f43038b;
        int i11 = snapFlingBehavior$performFling$1.label;
        if (i11 == 0) {
            kotlin.b.b(objD);
            snapFlingBehavior$performFling$1.label = 1;
            objD = d(aVar, f10, lVar, snapFlingBehavior$performFling$1);
            if (objD == obj) {
                return obj;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(objD);
        }
        a aVar2 = (a) objD;
        return new Float(aVar2.f10037a.floatValue() != 0.0f ? ((Number) aVar2.f10038b.e()).floatValue() : 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(ScrollingLogic$doFlingAnimation$2.a aVar, float f10, l lVar, ContinuationImpl continuationImpl) throws Throwable {
        SnapFlingBehavior$fling$1 snapFlingBehavior$fling$1;
        if (continuationImpl instanceof SnapFlingBehavior$fling$1) {
            snapFlingBehavior$fling$1 = (SnapFlingBehavior$fling$1) continuationImpl;
            int i10 = snapFlingBehavior$fling$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                snapFlingBehavior$fling$1.label = i10 - Integer.MIN_VALUE;
            } else {
                snapFlingBehavior$fling$1 = new SnapFlingBehavior$fling$1(this, continuationImpl);
            }
        } else {
            snapFlingBehavior$fling$1 = new SnapFlingBehavior$fling$1(this, continuationImpl);
        }
        Object objF = snapFlingBehavior$fling$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = snapFlingBehavior$fling$1.label;
        if (i11 == 0) {
            kotlin.b.b(objF);
            ScrollableKt.a aVar2 = this.f10048d;
            SnapFlingBehavior$fling$result$1 snapFlingBehavior$fling$result$1 = new SnapFlingBehavior$fling$result$1(this, f10, lVar, aVar, null);
            snapFlingBehavior$fling$1.L$0 = lVar;
            snapFlingBehavior$fling$1.label = 1;
            objF = C2680e.f(aVar2, snapFlingBehavior$fling$result$1, snapFlingBehavior$fling$1);
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lVar = (l) snapFlingBehavior$fling$1.L$0;
            kotlin.b.b(objF);
        }
        a aVar3 = (a) objF;
        lVar.invoke(new Float(0.0f));
        return aVar3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.i.a(hVar.f10047c, this.f10047c) && kotlin.jvm.internal.i.a(hVar.f10046b, this.f10046b) && kotlin.jvm.internal.i.a(hVar.f10045a, this.f10045a);
    }

    public final int hashCode() {
        return this.f10045a.hashCode() + ((this.f10046b.hashCode() + (this.f10047c.hashCode() * 31)) * 31);
    }
}
