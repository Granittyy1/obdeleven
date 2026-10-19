package io.intercom.android.sdk.m5.helpcenter.ui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.platform.AbstractComposeView;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: HelpCenterLoadingScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HelpCenterLoadingScreen extends AbstractComposeView {
    public static final int $stable = 0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HelpCenterLoadingScreen(Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.i.e(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r Content$lambda$0(HelpCenterLoadingScreen tmp0_rcvr, int i10, InterfaceC1084f interfaceC1084f, int i11) {
        kotlin.jvm.internal.i.e(tmp0_rcvr, "$tmp0_rcvr");
        tmp0_rcvr.Content(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void Content(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1926895347);
        if ((i10 & 1) == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HelpCenterLoadingScreenKt.INSTANCE.m270getLambda1$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new g(i10, 0, this);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HelpCenterLoadingScreen(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.i.e(context, "context");
    }

    public /* synthetic */ HelpCenterLoadingScreen(Context context, AttributeSet attributeSet, int i10, int i11, kotlin.jvm.internal.e eVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HelpCenterLoadingScreen(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.i.e(context, "context");
    }
}
