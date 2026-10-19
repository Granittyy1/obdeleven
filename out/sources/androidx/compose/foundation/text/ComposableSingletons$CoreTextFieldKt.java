package androidx.compose.foundation.text;

import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;

/* JADX INFO: compiled from: CoreTextField.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ComposableSingletons$CoreTextFieldKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ComposableLambdaImpl f11076a = new ComposableLambdaImpl(false, -813639903, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt$lambda-1$1
        @Override // Ia.q
        public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar, InterfaceC1084f interfaceC1084f, Integer num) {
            Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar2 = pVar;
            InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= interfaceC1084f2.k(pVar2) ? 4 : 2;
            }
            if (interfaceC1084f2.C(iIntValue & 1, (iIntValue & 19) != 18)) {
                pVar2.invoke(interfaceC1084f2, Integer.valueOf(iIntValue & 14));
            } else {
                interfaceC1084f2.w();
            }
            return p293xa.r.f47939a;
        }
    });
}
