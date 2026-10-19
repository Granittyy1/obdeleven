package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.InterfaceC1084f;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$TopActionBarKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: compiled from: TopActionBar.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$TopActionBarKt$lambda2$1 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
    public static final ComposableSingletons$TopActionBarKt$lambda2$1 INSTANCE = new ComposableSingletons$TopActionBarKt$lambda2$1();

    @Override // Ia.p
    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(interfaceC1084f, num.intValue());
        return p293xa.r.f47939a;
    }

    public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
        int i11 = 2;
        if ((i10 & 11) == 2 && interfaceC1084f.s()) {
            interfaceC1084f.w();
            return;
        }
        Avatar avatarCreate = Avatar.create("", "HC");
        kotlin.jvm.internal.i.d(avatarCreate, "create(...)");
        TopActionBarKt.m130TopActionBarNpQZenA(null, "Hannah", "+5 others", null, M1.k(new AvatarWrapper(avatarCreate, false, i11, null)), new E(), null, true, 0L, 0L, 0L, null, null, interfaceC1084f, 12812720, 0, 8009);
    }
}
