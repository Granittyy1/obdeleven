package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.ExpandedTeamPresenceState;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.AvatarType;
import io.intercom.android.sdk.models.Header;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: TeammateSheetContent.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$TeammateSheetContentKt {
    public static final ComposableSingletons$TeammateSheetContentKt INSTANCE = new ComposableSingletons$TeammateSheetContentKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f106lambda1 = new ComposableLambdaImpl(false, -1445246988, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$TeammateSheetContentKt$lambda-1$1
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
            List listK = M1.k(new Header.Expanded.Body(Header.Expanded.Style.H1, "Body 1", null));
            AvatarType avatarType = AvatarType.FACEPILE;
            Avatar avatarBuild = new Avatar.Builder().withInitials("A").build();
            kotlin.jvm.internal.i.d(avatarBuild, "build(...)");
            AvatarWrapper avatarWrapper = new AvatarWrapper(avatarBuild, false);
            Avatar avatarBuild2 = new Avatar.Builder().withInitials("B").build();
            kotlin.jvm.internal.i.d(avatarBuild2, "build(...)");
            AvatarWrapper avatarWrapper2 = new AvatarWrapper(avatarBuild2, false);
            Avatar avatarBuild3 = new Avatar.Builder().withInitials("C").build();
            kotlin.jvm.internal.i.d(avatarBuild3, "build(...)");
            List listS = kotlin.collections.l.s(avatarWrapper, avatarWrapper2, new AvatarWrapper(avatarBuild3, false));
            EmptyList emptyList = EmptyList.f42983b;
            TeammateSheetContentKt.TeammateSheetContent(null, null, new ExpandedTeamPresenceState("Title", listK, avatarType, listS, emptyList, emptyList, false), interfaceC1084f, 512, 3);
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f107lambda2 = new ComposableLambdaImpl(false, 914081689, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$TeammateSheetContentKt$lambda-2$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                SurfaceKt.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$TeammateSheetContentKt.INSTANCE.m177getLambda1$intercom_sdk_base_release(), interfaceC1084f, 12582912, 127);
            }
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m177getLambda1$intercom_sdk_base_release() {
        return f106lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m178getLambda2$intercom_sdk_base_release() {
        return f107lambda2;
    }
}
