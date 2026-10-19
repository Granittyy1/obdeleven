package com.voltasit.obdeleven.presentation.screens.sfd.numbervalidation;

import androidx.lifecycle.Z;
import com.voltasit.obdeleven.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.C2680e;
import p293xa.r;

/* JADX INFO: compiled from: NumberConfirmationScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class NumberConfirmationScreenKt$NumberConfirmationScreen$4 extends FunctionReferenceImpl implements Ia.a<r> {
    @Override // Ia.a
    public final /* bridge */ /* synthetic */ r invoke() {
        invoke2();
        return r.f47939a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        NumberConfirmationViewModel numberConfirmationViewModel = (NumberConfirmationViewModel) this.receiver;
        numberConfirmationViewModel.f33067e.f(numberConfirmationViewModel.f33063a.a(R.string.common_confirmation_code_sent, new Object[0]));
        C2680e.c(Z.a(numberConfirmationViewModel), null, null, new NumberConfirmationViewModel$onResendClick$1(numberConfirmationViewModel, null), 3);
    }
}
