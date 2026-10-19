package coil.compose;

import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;

/* JADX INFO: compiled from: SubcomposeAsyncImage.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ComposableLambdaImpl f22771a = new ComposableLambdaImpl(false, -1783408023, a.f22772b);

    /* JADX INFO: compiled from: SubcomposeAsyncImage.kt */
    public static final class a implements Ia.q<v, InterfaceC1084f, Integer, p293xa.r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f22772b = new a();

        @Override // Ia.q
        public final p293xa.r invoke(v vVar, InterfaceC1084f interfaceC1084f, Integer num) {
            v vVar2 = vVar;
            InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                iIntValue |= interfaceC1084f2.K(vVar2) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && interfaceC1084f2.s()) {
                interfaceC1084f2.w();
            } else {
                u.c(vVar2, null, null, null, null, null, 0.0f, null, false, interfaceC1084f2, iIntValue & 14);
            }
            return p293xa.r.f47939a;
        }
    }
}
