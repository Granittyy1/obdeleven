package io.intercom.android.sdk.m5.home.ui.components;

import androidx.compose.foundation.layout.InterfaceC0954n;
import androidx.compose.foundation.layout.W;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.articles.x;
import io.intercom.android.sdk.m5.components.A0;
import io.intercom.android.sdk.m5.components.BotAndHumansFacePileKt;
import io.intercom.android.sdk.m5.components.C2271b0;
import io.intercom.android.sdk.m5.components.HomeItemKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.IconType;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.AvatarDetails;
import io.intercom.android.sdk.models.AvatarType;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: NewConversationCard.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class NewConversationCardKt {

    /* JADX INFO: compiled from: NewConversationCard.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[IconType.values().length];
            try {
                iArr[IconType.TEAMMATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IconType.BOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IconType.FIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OpenMessengerResponse.IconType.values().length];
            try {
                iArr2[OpenMessengerResponse.IconType.PAPER_PLANE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final void NewConversationCard(final HomeCards.HomeNewConversationData newConversation, final List<AvatarWrapper> adminAvatars, final AvatarWrapper avatarWrapper, final Ia.a<p293xa.r> onNewConversationClicked, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        kotlin.jvm.internal.i.e(newConversation, "newConversation");
        kotlin.jvm.internal.i.e(adminAvatars, "adminAvatars");
        kotlin.jvm.internal.i.e(onNewConversationClicked, "onNewConversationClicked");
        C1086g c1086gP = interfaceC1084f.p(-773584515);
        if ((i11 & 4) != 0) {
            avatarWrapper = null;
        }
        IntercomCardKt.IntercomCard(null, null, androidx.compose.runtime.internal.a.b(-1464624655, new Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.home.ui.components.NewConversationCardKt.NewConversationCard.1
            @Override // Ia.q
            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0954n interfaceC0954n, InterfaceC1084f interfaceC1084f2, Integer num) {
                invoke(interfaceC0954n, interfaceC1084f2, num.intValue());
                return p293xa.r.f47939a;
            }

            public final void invoke(InterfaceC0954n IntercomCard, InterfaceC1084f interfaceC1084f2, int i12) {
                kotlin.jvm.internal.i.e(IntercomCard, "$this$IntercomCard");
                if ((i12 & 81) == 16 && interfaceC1084f2.s()) {
                    interfaceC1084f2.w();
                    return;
                }
                if (newConversation.getHomeCard() != null) {
                    interfaceC1084f2.L(995075445);
                    NewConversationCardKt.NewConversationCardV2(newConversation.getHomeCard(), onNewConversationClicked, interfaceC1084f2, 8);
                    interfaceC1084f2.D();
                } else {
                    interfaceC1084f2.L(995264607);
                    NewConversationCardKt.NewConversationCardV1(newConversation, adminAvatars, avatarWrapper, onNewConversationClicked, interfaceC1084f2, 584, 0);
                    interfaceC1084f2.D();
                }
            }
        }, c1086gP), c1086gP, 384, 3);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final AvatarWrapper avatarWrapper2 = avatarWrapper;
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.home.ui.components.k
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return NewConversationCardKt.NewConversationCard$lambda$0(newConversation, adminAvatars, avatarWrapper2, onNewConversationClicked, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r NewConversationCard$lambda$0(HomeCards.HomeNewConversationData newConversation, List adminAvatars, AvatarWrapper avatarWrapper, Ia.a onNewConversationClicked, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(newConversation, "$newConversation");
        kotlin.jvm.internal.i.e(adminAvatars, "$adminAvatars");
        kotlin.jvm.internal.i.e(onNewConversationClicked, "$onNewConversationClicked");
        NewConversationCard(newConversation, adminAvatars, avatarWrapper, onNewConversationClicked, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void NewConversationCardBotPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-322151692);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$NewConversationCardKt.INSTANCE.m306getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new x(i10, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r NewConversationCardBotPreview$lambda$4(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        NewConversationCardBotPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void NewConversationCardFinWithHumanAccessPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1635839473);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$NewConversationCardKt.INSTANCE.m307getLambda3$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new A0(i10, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r NewConversationCardFinWithHumanAccessPreview$lambda$5(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        NewConversationCardFinWithHumanAccessPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void NewConversationCardFinWithoutHumanAccessPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1289284327);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$NewConversationCardKt.INSTANCE.m308getLambda4$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.m5.components.avatar.a(i10, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r NewConversationCardFinWithoutHumanAccessPreview$lambda$6(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        NewConversationCardFinWithoutHumanAccessPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void NewConversationCardTeammatePreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(605107279);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$NewConversationCardKt.INSTANCE.m305getLambda1$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2271b0(i10, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r NewConversationCardTeammatePreview$lambda$3(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        NewConversationCardTeammatePreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @p293xa.d
    public static final void NewConversationCardV1(final HomeCards.HomeNewConversationData homeNewConversationData, final List<AvatarWrapper> list, AvatarWrapper avatarWrapper, final Ia.a<p293xa.r> aVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        C1086g c1086gP = interfaceC1084f.p(-1141879848);
        Integer numValueOf = null;
        final AvatarWrapper avatarWrapper2 = (i11 & 4) != 0 ? null : avatarWrapper;
        androidx.compose.ui.h hVarM = androidx.compose.ui.h.a.f13984b;
        androidx.compose.ui.h hVarB = W.b(hVarM, 0.0f, 64, 1);
        IconType icon = homeNewConversationData.getAction().getIcon();
        int i12 = icon == null ? -1 : WhenMappings.$EnumSwitchMapping$0[icon.ordinal()];
        if (i12 == 1) {
            numValueOf = Integer.valueOf(R.drawable.intercom_send_message_icon);
        } else if (i12 == 2) {
            numValueOf = Integer.valueOf(R.drawable.intercom_conversation_card_question);
        } else if (i12 == 3) {
            numValueOf = Integer.valueOf(R.drawable.intercom_chevron);
        }
        IconType icon2 = homeNewConversationData.getAction().getIcon();
        if ((icon2 != null ? WhenMappings.$EnumSwitchMapping$0[icon2.ordinal()] : -1) == 1) {
            hVarM = W.m(hVarM, 16);
        }
        HomeItemKt.HomeItem(hVarB, numValueOf, androidx.compose.runtime.internal.a.b(1023934521, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.home.ui.components.NewConversationCardKt.NewConversationCardV1.1

            /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.ui.components.NewConversationCardKt$NewConversationCardV1$1$WhenMappings */
            /* JADX INFO: compiled from: NewConversationCard.kt */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[IconType.values().length];
                    try {
                        iArr[IconType.FIN.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[IconType.FACE_PILE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // Ia.p
            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                invoke(interfaceC1084f2, num.intValue());
                return p293xa.r.f47939a;
            }

            public final void invoke(InterfaceC1084f interfaceC1084f2, int i13) {
                if ((i13 & 11) == 2 && interfaceC1084f2.s()) {
                    interfaceC1084f2.w();
                    return;
                }
                IconType icon3 = homeNewConversationData.getAction().getIcon();
                int i14 = icon3 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[icon3.ordinal()];
                if (i14 == 1) {
                    interfaceC1084f2.L(1718791131);
                    if (avatarWrapper2 != null) {
                        AvatarIconKt.m131AvatarIconRd90Nhg(W.m(androidx.compose.ui.h.a.f13984b, 32), avatarWrapper2, null, false, 0L, null, interfaceC1084f2, 70, 60);
                    }
                    interfaceC1084f2.D();
                    return;
                }
                if (i14 != 2) {
                    interfaceC1084f2.L(-83081034);
                    interfaceC1084f2.D();
                    return;
                }
                interfaceC1084f2.L(1719018020);
                if (avatarWrapper2 != null) {
                    List<AvatarWrapper> list2 = list;
                    ArrayList arrayList = new ArrayList(kotlin.collections.m.y(list2, 10));
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((AvatarWrapper) it.next()).getAvatar());
                    }
                    BotAndHumansFacePileKt.m61BotAndHumansFacePilehGBTI10(null, avatarWrapper2.getAvatar(), BotAndHumansFacePileKt.humanAvatarPairForHome(arrayList), 36, null, interfaceC1084f2, 3648, 17);
                }
                interfaceC1084f2.D();
            }
        }, c1086gP), hVarM, null, homeNewConversationData.getAction().getLabel(), homeNewConversationData.getAction().getSubtitle(), null, aVar, c1086gP, ((i10 << 15) & 234881024) | 390, 144);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final AvatarWrapper avatarWrapper3 = avatarWrapper2;
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.home.ui.components.j
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return NewConversationCardKt.NewConversationCardV1$lambda$1(homeNewConversationData, list, avatarWrapper3, aVar, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r NewConversationCardV1$lambda$1(HomeCards.HomeNewConversationData newConversationData, List adminAvatars, AvatarWrapper avatarWrapper, Ia.a onNewConversationClicked, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(newConversationData, "$newConversationData");
        kotlin.jvm.internal.i.e(adminAvatars, "$adminAvatars");
        kotlin.jvm.internal.i.e(onNewConversationClicked, "$onNewConversationClicked");
        NewConversationCardV1(newConversationData, adminAvatars, avatarWrapper, onNewConversationClicked, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NewConversationCardV2(final OpenMessengerResponse.NewConversationData.HomeCard homeCard, Ia.a<p293xa.r> aVar, InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(341363796);
        androidx.compose.ui.h hVarM = androidx.compose.ui.h.a.f13984b;
        androidx.compose.ui.h hVarB = W.b(hVarM, 0.0f, 64, 1);
        OpenMessengerResponse.IconType icon = homeCard.getIcon();
        Integer icon2 = icon != null ? icon.getIcon() : null;
        OpenMessengerResponse.IconType icon3 = homeCard.getIcon();
        if ((icon3 == null ? -1 : WhenMappings.$EnumSwitchMapping$1[icon3.ordinal()]) == 1) {
            hVarM = W.m(hVarM, 16);
        }
        HomeItemKt.HomeItem(hVarB, icon2, androidx.compose.runtime.internal.a.b(94824693, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.home.ui.components.NewConversationCardKt.NewConversationCardV2.1
            @Override // Ia.p
            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                invoke(interfaceC1084f2, num.intValue());
                return p293xa.r.f47939a;
            }

            public final void invoke(InterfaceC1084f interfaceC1084f2, int i11) {
                if ((i11 & 11) == 2 && interfaceC1084f2.s()) {
                    interfaceC1084f2.w();
                    return;
                }
                AvatarDetails avatarDetails = homeCard.getAvatarDetails();
                if ((avatarDetails != null ? avatarDetails.getAvatarType() : null) == AvatarType.FACEPILE) {
                    Avatar avatarBuild = homeCard.getAvatarDetails().getAvatars().get(0).build();
                    kotlin.jvm.internal.i.d(avatarBuild, "build(...)");
                    List listK = kotlin.collections.q.K(homeCard.getAvatarDetails().getAvatars(), 1);
                    ArrayList arrayList = new ArrayList(kotlin.collections.m.y(listK, 10));
                    Iterator it = listK.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((Avatar.Builder) it.next()).build());
                    }
                    BotAndHumansFacePileKt.m61BotAndHumansFacePilehGBTI10(null, avatarBuild, BotAndHumansFacePileKt.humanAvatarPairForHome(arrayList), 36, null, interfaceC1084f2, 3648, 17);
                }
            }
        }, c1086gP), hVarM, null, homeCard.getText(), homeCard.getSubtitle(), null, aVar, c1086gP, ((i10 << 21) & 234881024) | 390, 144);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new l(homeCard, aVar, i10, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r NewConversationCardV2$lambda$2(OpenMessengerResponse.NewConversationData.HomeCard homeCard, Ia.a onNewConversationClicked, int i10, InterfaceC1084f interfaceC1084f, int i11) {
        kotlin.jvm.internal.i.e(homeCard, "$homeCard");
        kotlin.jvm.internal.i.e(onNewConversationClicked, "$onNewConversationClicked");
        NewConversationCardV2(homeCard, onNewConversationClicked, interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
