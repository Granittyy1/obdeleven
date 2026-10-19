package androidx.compose.material3;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: SheetDefaults.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SheetState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.compose.material3.internal.i<SheetValue> f12302c;

    public SheetState(boolean z10, final p013b0.c cVar, SheetValue sheetValue, Ia.l<? super SheetValue, Boolean> lVar, boolean z11) {
        this.f12300a = z10;
        this.f12301b = z11;
        if (z10 && sheetValue == SheetValue.f12306d) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
        }
        if (z11 && sheetValue == SheetValue.f12304b) {
            throw new IllegalArgumentException("The initial value must not be set to Hidden if skipHiddenState is set to true.");
        }
        this.f12302c = new androidx.compose.material3.internal.i<>(sheetValue, new Ia.l<Float, Float>() { // from class: androidx.compose.material3.SheetState$anchoredDraggableState$1
            {
                super(1);
            }

            @Override // Ia.l
            public final Float invoke(Float f10) {
                f10.floatValue();
                return Float.valueOf(cVar.T0(56));
            }
        }, new Ia.a<Float>() { // from class: androidx.compose.material3.SheetState$anchoredDraggableState$2
            {
                super(0);
            }

            @Override // Ia.a
            public final Float invoke() {
                return Float.valueOf(cVar.T0(R.styleable.AppCompatTheme_windowMinWidthMinor));
            }
        }, e0.f12443b, lVar);
    }

    public static Object a(SheetState sheetState, SheetValue sheetValue, SuspendLambda suspendLambda) throws Throwable {
        Object objB = androidx.compose.material3.internal.f.b(sheetState.f12302c, sheetValue, sheetState.f12302c.f12538k.j(), suspendLambda);
        return objB == CoroutineSingletons.f43038b ? objB : p293xa.r.f47939a;
    }

    public final Object b(SuspendLambda suspendLambda) throws Throwable {
        if (this.f12301b) {
            throw new IllegalStateException("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.");
        }
        Object objA = a(this, SheetValue.f12304b, suspendLambda);
        return objA == CoroutineSingletons.f43038b ? objA : p293xa.r.f47939a;
    }

    public final boolean c() {
        return this.f12302c.f12535g.getValue() != SheetValue.f12304b;
    }

    public final Object d(SuspendLambda suspendLambda) throws Throwable {
        if (this.f12300a) {
            throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
        }
        Object objA = a(this, SheetValue.f12306d, suspendLambda);
        return objA == CoroutineSingletons.f43038b ? objA : p293xa.r.f47939a;
    }
}
