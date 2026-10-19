package androidx.compose.ui.tooling;

import Ia.p;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import p293xa.r;

/* JADX INFO: compiled from: PreviewActivity.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ComposableSingletons$PreviewActivity_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ComposableLambdaImpl f15715a = new ComposableLambdaImpl(false, -426398407, new p<InterfaceC1084f, Integer, r>() { // from class: androidx.compose.ui.tooling.ComposableSingletons$PreviewActivity_androidKt$lambda-1$1
        @Override // Ia.p
        public final r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
            int iIntValue = num.intValue();
            if (interfaceC1084f2.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                TextKt.c("Next", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, interfaceC1084f2, 6, 0, 65534);
            } else {
                interfaceC1084f2.w();
            }
            return r.f47939a;
        }
    });
}
