package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.ExpandedTeamPresenceState;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.AvatarDetails;
import io.intercom.android.sdk.models.AvatarType;
import io.intercom.android.sdk.models.Header;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: ExpandedTeamPresenceLayout.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$ExpandedTeamPresenceLayoutKt {
    public static final ComposableSingletons$ExpandedTeamPresenceLayoutKt INSTANCE = new ComposableSingletons$ExpandedTeamPresenceLayoutKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f135lambda1 = new ComposableLambdaImpl(false, 1003438967, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$ExpandedTeamPresenceLayoutKt$lambda-1$1
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
            Header.Expanded.Style style = Header.Expanded.Style.PARAGRAPH;
            List listS = kotlin.collections.l.s(new Header.Expanded.Body(style, "Hi there! I'm a member of the Intercom team. How can I help you today?", "#000000"), new Header.Expanded.Body(style, "I'm here to answer any questions you have about Intercom.", "#000000"));
            AvatarType avatarType = AvatarType.FACEPILE;
            Avatar avatarCreate = Avatar.create("https://images.intercom-mail-1.com/avatars/144859/square_128/IMG_20210331_110724.jpg?1617196064", "F");
            kotlin.jvm.internal.i.d(avatarCreate, "create(...)");
            AvatarWrapper avatarWrapper = new AvatarWrapper(avatarCreate, false, 2, null);
            Avatar avatarCreate2 = Avatar.create("https://images.intercom-mail-1.com/avatars/144859/square_128/IMG_20210331_110724.jpg?1617196064", "SK");
            kotlin.jvm.internal.i.d(avatarCreate2, "create(...)");
            AvatarWrapper avatarWrapper2 = new AvatarWrapper(avatarCreate2, false, 2, null);
            Avatar avatarCreate3 = Avatar.create("https://images.intercom-mail-1.com/avatars/144859/square_128/IMG_20210331_110724.jpg?1617196064", "RH");
            kotlin.jvm.internal.i.d(avatarCreate3, "create(...)");
            ExpandedTeamPresenceLayoutKt.ExpandedTeamPresenceLayout(new ExpandedTeamPresenceState("SDKTestApp", listS, avatarType, kotlin.collections.l.s(avatarWrapper, avatarWrapper2, new AvatarWrapper(avatarCreate3, false, 2, null)), EmptyList.f42983b, M1.k(new Header.Expanded.SocialAccount("twitter", "https://twitter.com/intercom", "https://images.intercom-mail-1.com/avatars/144859/square_128/IMG_20210331_110724.jpg?1617196064", "intercom")), false), null, interfaceC1084f, 8, 2);
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f136lambda2 = new ComposableLambdaImpl(false, -1374619086, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$ExpandedTeamPresenceLayoutKt$lambda-2$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                SurfaceKt.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$ExpandedTeamPresenceLayoutKt.INSTANCE.m221getLambda1$intercom_sdk_base_release(), interfaceC1084f, 12582912, 127);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f137lambda3 = new ComposableLambdaImpl(false, 1317404560, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$ExpandedTeamPresenceLayoutKt$lambda-3$1
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
            Header.Expanded.Style style = Header.Expanded.Style.PARAGRAPH;
            List listS = kotlin.collections.l.s(new Header.Expanded.Body(style, "Hi there! I'm a member of the Intercom team. How can I help you today?", "#000000"), new Header.Expanded.Body(style, "I'm here to answer any questions you have about Intercom.", "#000000"));
            AvatarType avatarType = AvatarType.LAYERED_BUBBLES;
            Avatar avatarCreate = Avatar.create("https://images.intercom-mail-1.com/avatars/144859/square_128/IMG_20210331_110724.jpg?1617196064", "F");
            kotlin.jvm.internal.i.d(avatarCreate, "create(...)");
            ExpandedTeamPresenceLayoutKt.ExpandedTeamPresenceLayout(new ExpandedTeamPresenceState("SDKTestApp", listS, avatarType, M1.k(new AvatarWrapper(avatarCreate, false, 2, null)), M1.k(new Header.Expanded.Footer(style, "Powered by Intercom", null, new AvatarDetails(avatarType, kotlin.collections.l.s(new Avatar.Builder().withImageUrl("https://images.intercom-mail-1.com/avatars/144859/square_128/IMG_20210331_110724.jpg?1617196064").withInitials("SK"), new Avatar.Builder().withImageUrl("https://images.intercom-mail-1.com/avatars/144859/square_128/IMG_20210331_110724.jpg?1617196064").withInitials("RH"))))), M1.k(new Header.Expanded.SocialAccount("twitter", "https://twitter.com/intercom", "https://images.intercom-mail-1.com/avatars/144859/square_128/IMG_20210331_110724.jpg?1617196064", "intercom")), false), null, interfaceC1084f, 8, 2);
        }
    });

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f138lambda4 = new ComposableLambdaImpl(false, 2104929077, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$ExpandedTeamPresenceLayoutKt$lambda-4$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                SurfaceKt.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$ExpandedTeamPresenceLayoutKt.INSTANCE.m223getLambda3$intercom_sdk_base_release(), interfaceC1084f, 12582912, 127);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-5, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f139lambda5 = new ComposableLambdaImpl(false, 1099388065, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$ExpandedTeamPresenceLayoutKt$lambda-5$1
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
            Header.Expanded.Style style = Header.Expanded.Style.PARAGRAPH;
            List listS = kotlin.collections.l.s(new Header.Expanded.Body(style, "Hi there! I'm a member of the Intercom team. How can I help you today?", "#000000"), new Header.Expanded.Body(style, "I'm here to answer any questions you have about Intercom.", "#000000"));
            AvatarType avatarType = AvatarType.LAYERED_BUBBLES;
            Avatar avatarCreate = Avatar.create("https://images.intercom-mail-1.com/avatars/144859/square_128/IMG_20210331_110724.jpg?1617196064", "SK");
            kotlin.jvm.internal.i.d(avatarCreate, "create(...)");
            List listK = M1.k(new AvatarWrapper(avatarCreate, false, 2, null));
            EmptyList emptyList = EmptyList.f42983b;
            ExpandedTeamPresenceLayoutKt.ExpandedTeamPresenceLayout(new ExpandedTeamPresenceState("SDKTestApp", listS, avatarType, listK, emptyList, emptyList, true), null, interfaceC1084f, 8, 2);
        }
    });

    /* JADX INFO: renamed from: lambda-6, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f140lambda6 = new ComposableLambdaImpl(false, -257155684, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$ExpandedTeamPresenceLayoutKt$lambda-6$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                SurfaceKt.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$ExpandedTeamPresenceLayoutKt.INSTANCE.m225getLambda5$intercom_sdk_base_release(), interfaceC1084f, 12582912, 127);
            }
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m221getLambda1$intercom_sdk_base_release() {
        return f135lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m222getLambda2$intercom_sdk_base_release() {
        return f136lambda2;
    }

    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m223getLambda3$intercom_sdk_base_release() {
        return f137lambda3;
    }

    /* JADX INFO: renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m224getLambda4$intercom_sdk_base_release() {
        return f138lambda4;
    }

    /* JADX INFO: renamed from: getLambda-5$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m225getLambda5$intercom_sdk_base_release() {
        return f139lambda5;
    }

    /* JADX INFO: renamed from: getLambda-6$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m226getLambda6$intercom_sdk_base_release() {
        return f140lambda6;
    }
}
