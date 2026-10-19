package com.airbnb.lottie.compose;

import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.N0;
import kotlinx.coroutines.C2706p;

/* JADX INFO: compiled from: LottieCompositionResult.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LottieCompositionResultImpl implements N0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2706p f23358b = I.e.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1085f0 f23359c = J0.f(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1085f0 f23360d = J0.f(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DerivedSnapshotState f23361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DerivedSnapshotState f23362f;

    public LottieCompositionResultImpl() {
        J0.d(new Ia.a<Boolean>() { // from class: com.airbnb.lottie.compose.LottieCompositionResultImpl$isLoading$2
            {
                super(0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ia.a
            public final Boolean invoke() {
                return Boolean.valueOf(((p079g3.b) this.this$0.f23359c.getValue()) == null && ((Throwable) this.this$0.f23360d.getValue()) == null);
            }
        });
        this.f23361e = J0.d(new Ia.a<Boolean>() { // from class: com.airbnb.lottie.compose.LottieCompositionResultImpl$isComplete$2
            {
                super(0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ia.a
            public final Boolean invoke() {
                return Boolean.valueOf((((p079g3.b) this.this$0.f23359c.getValue()) == null && ((Throwable) this.this$0.f23360d.getValue()) == null) ? false : true);
            }
        });
        J0.d(new Ia.a<Boolean>() { // from class: com.airbnb.lottie.compose.LottieCompositionResultImpl$isFailure$2
            {
                super(0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ia.a
            public final Boolean invoke() {
                return Boolean.valueOf(((Throwable) this.this$0.f23360d.getValue()) != null);
            }
        });
        this.f23362f = J0.d(new Ia.a<Boolean>() { // from class: com.airbnb.lottie.compose.LottieCompositionResultImpl$isSuccess$2
            {
                super(0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ia.a
            public final Boolean invoke() {
                return Boolean.valueOf(((p079g3.b) this.this$0.f23359c.getValue()) != null);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.N0
    public final Object getValue() {
        return (p079g3.b) this.f23359c.getValue();
    }
}
