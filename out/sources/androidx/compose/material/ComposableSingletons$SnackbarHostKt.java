package androidx.compose.material;

import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;

/* JADX INFO: compiled from: SnackbarHost.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ComposableSingletons$SnackbarHostKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ComposableLambdaImpl f11711a = new ComposableLambdaImpl(false, 996639038, new Ia.q<O, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ComposableSingletons$SnackbarHostKt$lambda-1$1
        @Override // Ia.q
        public final p293xa.r invoke(O o10, InterfaceC1084f interfaceC1084f, Integer num) {
            O o11 = o10;
            InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= (iIntValue & 8) == 0 ? interfaceC1084f2.K(o11) : interfaceC1084f2.k(o11) ? 4 : 2;
            }
            if (interfaceC1084f2.C(iIntValue & 1, (iIntValue & 19) != 18)) {
                SnackbarKt.b(o11, null, false, null, 0L, 0L, 0L, 0.0f, interfaceC1084f2, iIntValue & 14, 254);
            } else {
                interfaceC1084f2.w();
            }
            return p293xa.r.f47939a;
        }
    });
}
