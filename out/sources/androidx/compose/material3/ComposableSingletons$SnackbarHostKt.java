package androidx.compose.material3;

import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;

/* JADX INFO: compiled from: SnackbarHost.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ComposableSingletons$SnackbarHostKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ComposableLambdaImpl f12117a = new ComposableLambdaImpl(false, 818736383, new Ia.q<f0, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ComposableSingletons$SnackbarHostKt$lambda-1$1
        @Override // Ia.q
        public final p293xa.r invoke(f0 f0Var, InterfaceC1084f interfaceC1084f, Integer num) {
            f0 f0Var2 = f0Var;
            InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= interfaceC1084f2.K(f0Var2) ? 4 : 2;
            }
            if ((iIntValue & 19) == 18 && interfaceC1084f2.s()) {
                interfaceC1084f2.w();
            } else {
                SnackbarKt.b(f0Var2, null, false, null, 0L, 0L, 0L, 0L, 0L, interfaceC1084f2, iIntValue & 14, 510);
            }
            return p293xa.r.f47939a;
        }
    });
}
