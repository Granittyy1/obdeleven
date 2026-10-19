package io.intercom.android.sdk.m5.home.ui.header;

import Ia.p;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.recyclerview.widget.t;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.utilities.ColorUtils;
import p293xa.r;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.ui.header.ComposableSingletons$HomeHeaderBackdropKt$lambda-7$1, reason: invalid class name */
/* JADX INFO: compiled from: HomeHeaderBackdrop.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$HomeHeaderBackdropKt$lambda7$1 implements p<InterfaceC1084f, Integer, r> {
    public static final ComposableSingletons$HomeHeaderBackdropKt$lambda7$1 INSTANCE = new ComposableSingletons$HomeHeaderBackdropKt$lambda7$1();

    @Override // Ia.p
    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(interfaceC1084f, num.intValue());
        return r.f47939a;
    }

    public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
        if ((i10 & 11) == 2 && interfaceC1084f.s()) {
            interfaceC1084f.w();
            return;
        }
        boolean z10 = true;
        kotlin.jvm.internal.e eVar = null;
        HomeHeaderBackdropKt.m323HomeHeaderBackdropAjpBEmI(t.d.DEFAULT_DRAG_ANIMATION_DURATION, new HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid(Q3.d.d(ColorUtils.parseColor("#FF6B35")), z10, eVar), new HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid(Q3.d.d(ColorUtils.parseColor("#8B0000")), z10, eVar), new g(), interfaceC1084f, 3078, 0);
    }
}
