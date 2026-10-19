package androidx.compose.material3.internal;

import androidx.compose.animation.core.c0;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.material3.SheetValue;
import androidx.compose.runtime.C1079c0;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.Q0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: AnchoredDraggable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ia.l<Float, Float> f12529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ia.a<Float> f12530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f12531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ia.l<T, Boolean> f12532d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1085f0 f12535g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C1079c0 f12538k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C1085f0 f12539l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C1085f0 f12540m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g f12541n;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u f12533e = new u();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f12534f = new h(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DerivedSnapshotState f12536h = J0.d(new Ia.a<Object>(this) { // from class: androidx.compose.material3.internal.AnchoredDraggableState$targetValue$2
        final /* synthetic */ i<Object> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.this$0 = this;
        }

        @Override // Ia.a
        public final Object invoke() {
            T value = this.this$0.f12539l.getValue();
            if (value != 0) {
                return value;
            }
            i<Object> iVar = this.this$0;
            float fJ = iVar.j.j();
            boolean zIsNaN = Float.isNaN(fJ);
            C1085f0 c1085f0 = iVar.f12535g;
            return !zIsNaN ? iVar.c(fJ, 0.0f, c1085f0.getValue()) : c1085f0.getValue();
        }
    });

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final DerivedSnapshotState f12537i = J0.d(new Ia.a<Object>(this) { // from class: androidx.compose.material3.internal.AnchoredDraggableState$closestValue$2
        final /* synthetic */ i<Object> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.this$0 = this;
        }

        @Override // Ia.a
        public final Object invoke() {
            Object objA;
            T value = this.this$0.f12539l.getValue();
            if (value != 0) {
                return value;
            }
            i<Object> iVar = this.this$0;
            float fJ = iVar.j.j();
            boolean zIsNaN = Float.isNaN(fJ);
            C1085f0 c1085f0 = iVar.f12535g;
            if (zIsNaN) {
                return c1085f0.getValue();
            }
            Object value2 = c1085f0.getValue();
            q<Object> qVarE = iVar.e();
            float fD = qVarE.d(value2);
            if (fD != fJ && !Float.isNaN(fD) && (fD >= fJ ? (objA = qVarE.a(false, fJ)) != null : (objA = qVarE.a(true, fJ)) != null)) {
                value2 = objA;
            }
            return value2;
        }
    });
    public final C1079c0 j = new C1079c0(Float.NaN);

    public i(SheetValue sheetValue, Ia.l lVar, Ia.a aVar, c0 c0Var, Ia.l lVar2) {
        this.f12529a = lVar;
        this.f12530b = aVar;
        this.f12531c = c0Var;
        this.f12532d = lVar2;
        this.f12535g = J0.f(sheetValue);
        J0.e(new Ia.a<Float>(this) { // from class: androidx.compose.material3.internal.AnchoredDraggableState$progress$2
            final /* synthetic */ i<Object> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // Ia.a
            public final Float invoke() {
                float fD = this.this$0.e().d(this.this$0.f12535g.getValue());
                float fD2 = this.this$0.e().d(this.this$0.f12537i.getValue()) - fD;
                float fAbs = Math.abs(fD2);
                float f10 = 1.0f;
                if (!Float.isNaN(fAbs) && fAbs > 1.0E-6f) {
                    float fG = (this.this$0.g() - fD) / fD2;
                    if (fG < 1.0E-6f) {
                        f10 = 0.0f;
                    } else if (fG <= 0.999999f) {
                        f10 = fG;
                    }
                }
                return Float.valueOf(f10);
            }
        }, Q0.f12888a);
        this.f12538k = new C1079c0(0.0f);
        this.f12539l = J0.f(null);
        this.f12540m = J0.f(new w(kotlin.collections.y.p()));
        this.f12541n = new g(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(MutatePriority mutatePriority, Ia.q qVar, ContinuationImpl continuationImpl) throws Throwable {
        AnchoredDraggableState$anchoredDrag$1 anchoredDraggableState$anchoredDrag$1;
        i<T> iVar;
        T tC;
        T tC2;
        if (continuationImpl instanceof AnchoredDraggableState$anchoredDrag$1) {
            anchoredDraggableState$anchoredDrag$1 = (AnchoredDraggableState$anchoredDrag$1) continuationImpl;
            int i10 = anchoredDraggableState$anchoredDrag$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anchoredDraggableState$anchoredDrag$1.label = i10 - Integer.MIN_VALUE;
            } else {
                anchoredDraggableState$anchoredDrag$1 = new AnchoredDraggableState$anchoredDrag$1(this, continuationImpl);
            }
        } else {
            anchoredDraggableState$anchoredDrag$1 = new AnchoredDraggableState$anchoredDrag$1(this, continuationImpl);
        }
        Object obj = anchoredDraggableState$anchoredDrag$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = anchoredDraggableState$anchoredDrag$1.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iVar = (i) anchoredDraggableState$anchoredDrag$1.L$0;
            try {
                kotlin.b.b(obj);
                q<T> qVarE = iVar.e();
                C1079c0 c1079c0 = iVar.j;
                tC2 = qVarE.c(c1079c0.j());
                if (tC2 != null && Math.abs(c1079c0.j() - iVar.e().d(tC2)) <= 0.5f && iVar.f12532d.invoke(tC2).booleanValue()) {
                    iVar.h(tC2);
                }
                return p293xa.r.f47939a;
            } catch (Throwable th) {
                th = th;
                q<T> qVarE2 = iVar.e();
                C1079c0 c1079c1 = iVar.j;
                tC = qVarE2.c(c1079c1.j());
                if (tC != null) {
                    iVar.h(tC);
                }
                throw th;
            }
        }
        kotlin.b.b(obj);
        try {
            u uVar = this.f12533e;
            AnchoredDraggableState$anchoredDrag$2 anchoredDraggableState$anchoredDrag$2 = new AnchoredDraggableState$anchoredDrag$2(qVar, this, null);
            anchoredDraggableState$anchoredDrag$1.L$0 = this;
            anchoredDraggableState$anchoredDrag$1.label = 1;
            try {
                uVar.getClass();
                if (kotlinx.coroutines.B.d(new InternalMutatorMutex$mutate$2(mutatePriority, uVar, anchoredDraggableState$anchoredDrag$2, null), anchoredDraggableState$anchoredDrag$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                iVar = this;
                q<T> qVarE3 = iVar.e();
                C1079c0 c1079c2 = iVar.j;
                tC2 = qVarE3.c(c1079c2.j());
                if (tC2 != null) {
                    iVar.h(tC2);
                }
                return p293xa.r.f47939a;
            } catch (Throwable th2) {
                th = th2;
                iVar = this;
                q<T> qVarE4 = iVar.e();
                C1079c0 c1079c3 = iVar.j;
                tC = qVarE4.c(c1079c3.j());
                if (tC != null && Math.abs(c1079c3.j() - iVar.e().d(tC)) <= 0.5f && iVar.f12532d.invoke(tC).booleanValue()) {
                    iVar.h(tC);
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(Object obj, MutatePriority mutatePriority, Ia.r rVar, ContinuationImpl continuationImpl) throws Throwable {
        AnchoredDraggableState$anchoredDrag$3 anchoredDraggableState$anchoredDrag$3;
        i<T> iVar;
        T tC;
        T tC2;
        if (continuationImpl instanceof AnchoredDraggableState$anchoredDrag$3) {
            anchoredDraggableState$anchoredDrag$3 = (AnchoredDraggableState$anchoredDrag$3) continuationImpl;
            int i10 = anchoredDraggableState$anchoredDrag$3.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anchoredDraggableState$anchoredDrag$3.label = i10 - Integer.MIN_VALUE;
            } else {
                anchoredDraggableState$anchoredDrag$3 = new AnchoredDraggableState$anchoredDrag$3(this, continuationImpl);
            }
        } else {
            anchoredDraggableState$anchoredDrag$3 = new AnchoredDraggableState$anchoredDrag$3(this, continuationImpl);
        }
        Object obj2 = anchoredDraggableState$anchoredDrag$3.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = anchoredDraggableState$anchoredDrag$3.label;
        if (i11 == 0) {
            kotlin.b.b(obj2);
            if (e().e(obj)) {
                try {
                    u uVar = this.f12533e;
                    AnchoredDraggableState$anchoredDrag$4 anchoredDraggableState$anchoredDrag$4 = new AnchoredDraggableState$anchoredDrag$4(this, obj, rVar, null);
                    anchoredDraggableState$anchoredDrag$3.L$0 = this;
                    anchoredDraggableState$anchoredDrag$3.label = 1;
                    try {
                        uVar.getClass();
                        if (kotlinx.coroutines.B.d(new InternalMutatorMutex$mutate$2(mutatePriority, uVar, anchoredDraggableState$anchoredDrag$4, null), anchoredDraggableState$anchoredDrag$3) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        iVar = this;
                        iVar.i(null);
                        q<T> qVarE = iVar.e();
                        C1079c0 c1079c0 = iVar.j;
                        tC2 = qVarE.c(c1079c0.j());
                        if (tC2 != null) {
                            iVar.h(tC2);
                        }
                    } catch (Throwable th) {
                        th = th;
                        iVar = this;
                        iVar.i(null);
                        q<T> qVarE2 = iVar.e();
                        C1079c0 c1079c1 = iVar.j;
                        tC = qVarE2.c(c1079c1.j());
                        if (tC != null && Math.abs(c1079c1.j() - iVar.e().d(tC)) <= 0.5f && iVar.f12532d.invoke(tC).booleanValue()) {
                            iVar.h(tC);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                h(obj);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iVar = (i) anchoredDraggableState$anchoredDrag$3.L$0;
            try {
                kotlin.b.b(obj2);
                iVar.i(null);
                q<T> qVarE3 = iVar.e();
                C1079c0 c1079c2 = iVar.j;
                tC2 = qVarE3.c(c1079c2.j());
                if (tC2 != null && Math.abs(c1079c2.j() - iVar.e().d(tC2)) <= 0.5f && iVar.f12532d.invoke(tC2).booleanValue()) {
                    iVar.h(tC2);
                }
            } catch (Throwable th3) {
                th = th3;
                iVar.i(null);
                q<T> qVarE4 = iVar.e();
                C1079c0 c1079c3 = iVar.j;
                tC = qVarE4.c(c1079c3.j());
                if (tC != null) {
                    iVar.h(tC);
                }
                throw th;
            }
        }
        return p293xa.r.f47939a;
    }

    public final Object c(float f10, float f11, Object obj) {
        Object objA;
        q<T> qVarE = e();
        float fD = qVarE.d(obj);
        float fFloatValue = this.f12530b.invoke().floatValue();
        if (fD == f10 || Float.isNaN(fD)) {
            return obj;
        }
        Ia.l<Float, Float> lVar = this.f12529a;
        if (fD < f10) {
            if (f11 >= fFloatValue) {
                Object objA2 = qVarE.a(true, f10);
                kotlin.jvm.internal.i.b(objA2);
                return objA2;
            }
            objA = qVarE.a(true, f10);
            kotlin.jvm.internal.i.b(objA);
            if (f10 < Math.abs(Math.abs(lVar.invoke(Float.valueOf(Math.abs(qVarE.d(objA) - fD))).floatValue()) + fD)) {
                return obj;
            }
        } else {
            if (f11 <= (-fFloatValue)) {
                Object objA3 = qVarE.a(false, f10);
                kotlin.jvm.internal.i.b(objA3);
                return objA3;
            }
            objA = qVarE.a(false, f10);
            kotlin.jvm.internal.i.b(objA);
            float fAbs = Math.abs(fD - Math.abs(lVar.invoke(Float.valueOf(Math.abs(fD - qVarE.d(objA)))).floatValue()));
            if (f10 < 0.0f) {
                if (Math.abs(f10) < fAbs) {
                    return obj;
                }
            } else if (f10 > fAbs) {
                return obj;
            }
        }
        return objA;
    }

    public final float d(float f10) {
        float f11 = f(f10);
        C1079c0 c1079c0 = this.j;
        float fJ = Float.isNaN(c1079c0.j()) ? 0.0f : c1079c0.j();
        c1079c0.f(f11);
        return f11 - fJ;
    }

    public final q<T> e() {
        return (q) this.f12540m.getValue();
    }

    public final float f(float f10) {
        C1079c0 c1079c0 = this.j;
        return Na.l.C((Float.isNaN(c1079c0.j()) ? 0.0f : c1079c0.j()) + f10, e().b(), e().f());
    }

    public final float g() {
        C1079c0 c1079c0 = this.j;
        if (Float.isNaN(c1079c0.j())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return c1079c0.j();
    }

    public final void h(T t8) {
        this.f12535g.setValue(t8);
    }

    public final void i(T t8) {
        this.f12539l.setValue(t8);
    }
}
