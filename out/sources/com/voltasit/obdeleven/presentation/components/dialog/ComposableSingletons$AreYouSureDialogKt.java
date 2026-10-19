package com.voltasit.obdeleven.presentation.components.dialog;

import Ia.p;
import S4.o;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.voltasit.obdeleven.R;
import p293xa.r;

/* JADX INFO: compiled from: AreYouSureDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$AreYouSureDialogKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ComposableLambdaImpl f31384a = new ComposableLambdaImpl(false, -1485776818, new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.components.dialog.ComposableSingletons$AreYouSureDialogKt$lambda-1$1
        @Override // Ia.p
        public final r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
            if ((num.intValue() & 11) == 2 && interfaceC1084f2.s()) {
                interfaceC1084f2.w();
            } else {
                DialogTitleKt.a(o.p(interfaceC1084f2, R.string.common_are_you_sure), interfaceC1084f2, 0);
            }
            return r.f47939a;
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ComposableLambdaImpl f31385b = new ComposableLambdaImpl(false, -1313362737, new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.components.dialog.ComposableSingletons$AreYouSureDialogKt$lambda-2$1
        @Override // Ia.p
        public final r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
            if ((num.intValue() & 11) == 2 && interfaceC1084f2.s()) {
                interfaceC1084f2.w();
            } else {
                DialogMessageKt.a(o.p(interfaceC1084f2, R.string.dialog_terms_and_conditions_disagree_message), interfaceC1084f2, 0);
            }
            return r.f47939a;
        }
    });
}
