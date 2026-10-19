package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.models.PoweredBy;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$PoweredByBadgeKt$lambda-3$1, reason: invalid class name */
/* JADX INFO: compiled from: PoweredByBadge.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$PoweredByBadgeKt$lambda3$1 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
    public static final ComposableSingletons$PoweredByBadgeKt$lambda3$1 INSTANCE = new ComposableSingletons$PoweredByBadgeKt$lambda3$1();

    @Override // Ia.p
    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(interfaceC1084f, num.intValue());
        return p293xa.r.f47939a;
    }

    public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
        if ((i10 & 11) == 2 && interfaceC1084f.s()) {
            interfaceC1084f.w();
            return;
        }
        int i11 = androidx.compose.ui.graphics.H.f13505m;
        PoweredByBadgeKt.m128PoweredByBadgewBJOh4Y("Powered by Fin Ai Agent", PoweredBy.PoweredByIconType.FIN, new C(), null, androidx.compose.ui.graphics.H.f13503k, 0L, interfaceC1084f, 25014, 40);
    }
}
