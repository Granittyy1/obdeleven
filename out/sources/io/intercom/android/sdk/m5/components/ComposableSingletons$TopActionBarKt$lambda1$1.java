package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.InterfaceC1084f;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$TopActionBarKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: TopActionBar.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$TopActionBarKt$lambda1$1 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
    public static final ComposableSingletons$TopActionBarKt$lambda1$1 INSTANCE = new ComposableSingletons$TopActionBarKt$lambda1$1();

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
        TopActionBarKt.m130TopActionBarNpQZenA(null, "Hannah", null, null, M1.k(new AvatarWrapper(avatarCreate, false, i11, null)), new D(), null, true, 0L, 0L, 0L, null, null, interfaceC1084f, 12812336, 0, 8013);
    }
}
