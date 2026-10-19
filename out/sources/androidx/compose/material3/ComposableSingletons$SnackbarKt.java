package androidx.compose.material3;

import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: Snackbar.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ComposableSingletons$SnackbarKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ComposableLambdaImpl f12119a = new ComposableLambdaImpl(false, -505750804, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ComposableSingletons$SnackbarKt$lambda-1$1
        @Override // Ia.p
        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
            if ((num.intValue() & 3) == 2 && interfaceC1084f2.s()) {
                interfaceC1084f2.w();
            } else {
                IconKt.b(p306z.d.a(), com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f2, R.string.m3c_snackbar_dismiss), null, 0L, interfaceC1084f2, 0, 12);
            }
            return p293xa.r.f47939a;
        }
    });
}
