package io.intercom.android.sdk.m5.home;

import Ia.a;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p293xa.r;

/* JADX INFO: compiled from: HomeViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class HomeViewModel$uiState$1$1 extends FunctionReferenceImpl implements a<r> {
    public HomeViewModel$uiState$1$1(Object obj) {
        super(0, obj, HomeViewModel.class, "onRetryClicked", "onRetryClicked()V", 0);
    }

    @Override // Ia.a
    public /* bridge */ /* synthetic */ r invoke() {
        invoke2();
        return r.f47939a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((HomeViewModel) this.receiver).onRetryClicked();
    }
}
