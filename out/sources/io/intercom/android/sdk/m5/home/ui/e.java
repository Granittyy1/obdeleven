package io.intercom.android.sdk.m5.home.ui;

import Ia.p;
import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.inbox.ui.InboxErrorScreenKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ErrorState f39264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.h f39265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f39266e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f39267f;

    public /* synthetic */ e(ErrorState errorState, androidx.compose.ui.h hVar, int i10, int i11, int i12) {
        this.f39263b = i12;
        this.f39264c = errorState;
        this.f39265d = hVar;
        this.f39266e = i10;
        this.f39267f = i11;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f39263b) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return HomeErrorContentKt.HomeErrorContent$lambda$0(this.f39264c, this.f39265d, this.f39266e, this.f39267f, (InterfaceC1084f) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return InboxErrorScreenKt.InboxErrorScreen$lambda$0(this.f39264c, this.f39265d, this.f39266e, this.f39267f, (InterfaceC1084f) obj, iIntValue2);
        }
    }
}
