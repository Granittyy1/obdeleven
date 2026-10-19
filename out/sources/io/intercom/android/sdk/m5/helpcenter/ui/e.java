package io.intercom.android.sdk.m5.helpcenter.ui;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.helpcenter.ui.components.BrowseAllHelpTopicsComponentKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.h f39163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f39164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f39165e;

    public /* synthetic */ e(androidx.compose.ui.h hVar, int i10, int i11, int i12) {
        this.f39162b = i12;
        this.f39163c = hVar;
        this.f39164d = i10;
        this.f39165e = i11;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f39162b;
        InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return HelpCenterEmptyScreenKt.HelpCenterEmptyScreen$lambda$1(this.f39163c, this.f39164d, this.f39165e, interfaceC1084f, iIntValue);
            default:
                return BrowseAllHelpTopicsComponentKt.BrowseAllHelpTopicsComponent$lambda$1(this.f39163c, this.f39164d, this.f39165e, interfaceC1084f, iIntValue);
        }
    }
}
