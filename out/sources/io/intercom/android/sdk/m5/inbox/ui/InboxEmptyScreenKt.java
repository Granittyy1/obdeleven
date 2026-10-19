package io.intercom.android.sdk.m5.inbox.ui;

import Ia.p;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.components.C2289k0;
import io.intercom.android.sdk.m5.components.C2293m0;
import io.intercom.android.sdk.m5.components.C2297o0;
import io.intercom.android.sdk.m5.components.EmptyStateKt;
import io.intercom.android.sdk.m5.components.IntercomPrimaryButtonKt;
import io.intercom.android.sdk.m5.conversation.ui.components.Y;
import io.intercom.android.sdk.m5.home.data.IconType;
import io.intercom.android.sdk.models.ActionType;
import io.intercom.android.sdk.models.EmptyState;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.NoWhenBranchMatchedException;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: InboxEmptyScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class InboxEmptyScreenKt {
    @IntercomPreviews
    private static final void EmptyScreenBotPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(862447475);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$InboxEmptyScreenKt.INSTANCE.m331getLambda8$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2293m0(i10, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r EmptyScreenBotPreview$lambda$4(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        EmptyScreenBotPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    @IntercomPreviews
    private static final void EmptyScreenHelpPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1522245405);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$InboxEmptyScreenKt.INSTANCE.m327getLambda4$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2297o0(i10, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r EmptyScreenHelpPreview$lambda$2(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        EmptyScreenHelpPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    @IntercomPreviews
    private static final void EmptyScreenMessagePreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1317218099);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$InboxEmptyScreenKt.INSTANCE.m325getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2289k0(i10, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r EmptyScreenMessagePreview$lambda$1(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        EmptyScreenMessagePreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    @IntercomPreviews
    private static final void EmptyScreenWithoutActionPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-132232118);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$InboxEmptyScreenKt.INSTANCE.m329getLambda6$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Y(i10, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r EmptyScreenWithoutActionPreview$lambda$3(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        EmptyScreenWithoutActionPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    public static final void InboxEmptyScreen(final EmptyState emptyState, final boolean z10, final Ia.a<r> onActionButtonClick, androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.h hVar2;
        androidx.compose.ui.h hVar3;
        final androidx.compose.ui.h hVar4;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(emptyState, "emptyState");
        kotlin.jvm.internal.i.e(onActionButtonClick, "onActionButtonClick");
        C1086g c1086gP = interfaceC1084f.p(-727293785);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.K(emptyState) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= c1086gP.c(z10) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= c1086gP.k(onActionButtonClick) ? 256 : 128;
        }
        int i13 = i11 & 8;
        if (i13 == 0) {
            if ((i10 & 7168) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 2048 : 1024;
            }
            if ((i12 & 5851) == 1170 || !c1086gP.s()) {
                if (i13 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                EmptyStateKt.EmptyState(emptyState.getTitle(), hVar3, emptyState.getText(), Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_messages_icon), androidx.compose.runtime.internal.a.b(2045450098, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxEmptyScreenKt.InboxEmptyScreen.1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.inbox.ui.InboxEmptyScreenKt$InboxEmptyScreen$1$WhenMappings */
                    /* JADX INFO: compiled from: InboxEmptyScreen.kt */
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
                            try {
                                iArr[IconType.FACE_PILE.ordinal()] = 4;
                            } catch (NoSuchFieldError unused4) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                            int[] iArr2 = new int[ActionType.values().length];
                            try {
                                iArr2[ActionType.MESSAGE.ordinal()] = 1;
                            } catch (NoSuchFieldError unused5) {
                            }
                            try {
                                iArr2[ActionType.HELP.ordinal()] = 2;
                            } catch (NoSuchFieldError unused6) {
                            }
                            $EnumSwitchMapping$1 = iArr2;
                        }
                    }

                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i14) {
                        Integer numValueOf;
                        if ((i14 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        if (z10) {
                            int i15 = WhenMappings.$EnumSwitchMapping$1[emptyState.getAction().getType().ordinal()];
                            if (i15 != 1) {
                                if (i15 != 2) {
                                    interfaceC1084f2.L(1738020481);
                                    interfaceC1084f2.D();
                                    throw new NoWhenBranchMatchedException();
                                }
                                interfaceC1084f2.L(1738038509);
                                IntercomPrimaryButtonKt.IntercomPrimaryButton(emptyState.getAction().getLabel(), null, Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_article_book_icon), onActionButtonClick, interfaceC1084f2, 0, 2);
                                interfaceC1084f2.D();
                                return;
                            }
                            interfaceC1084f2.L(1738022382);
                            String label = emptyState.getAction().getLabel();
                            IconType icon = emptyState.getAction().getIcon();
                            int i16 = icon == null ? -1 : WhenMappings.$EnumSwitchMapping$0[icon.ordinal()];
                            if (i16 != 1) {
                                numValueOf = (i16 == 2 || i16 == 3 || i16 == 4) ? Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_conversation_card_question) : null;
                            } else {
                                numValueOf = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_send_message_icon);
                            }
                            IntercomPrimaryButtonKt.IntercomPrimaryButton(label, null, numValueOf, onActionButtonClick, interfaceC1084f2, 0, 2);
                            interfaceC1084f2.D();
                        }
                    }
                }, c1086gP), c1086gP, ((i12 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 24576, 0);
                hVar4 = hVar3;
            } else {
                c1086gP.w();
                hVar4 = hVar2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.m5.inbox.ui.i
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return InboxEmptyScreenKt.InboxEmptyScreen$lambda$0(emptyState, z10, onActionButtonClick, hVar4, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 3072;
        hVar2 = hVar;
        if ((i12 & 5851) == 1170) {
            if (i13 != 0) {
                hVar3 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar3 = hVar2;
            }
            EmptyStateKt.EmptyState(emptyState.getTitle(), hVar3, emptyState.getText(), Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_messages_icon), androidx.compose.runtime.internal.a.b(2045450098, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxEmptyScreenKt.InboxEmptyScreen.1

                /* JADX INFO: renamed from: io.intercom.android.sdk.m5.inbox.ui.InboxEmptyScreenKt$InboxEmptyScreen$1$WhenMappings */
                /* JADX INFO: compiled from: InboxEmptyScreen.kt */
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
                        try {
                            iArr[IconType.FACE_PILE.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                        int[] iArr2 = new int[ActionType.values().length];
                        try {
                            iArr2[ActionType.MESSAGE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused5) {
                        }
                        try {
                            iArr2[ActionType.HELP.ordinal()] = 2;
                        } catch (NoSuchFieldError unused6) {
                        }
                        $EnumSwitchMapping$1 = iArr2;
                    }
                }

                @Override // Ia.p
                public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC1084f2, num.intValue());
                    return r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i14) {
                    Integer numValueOf;
                    if ((i14 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    if (z10) {
                        int i15 = WhenMappings.$EnumSwitchMapping$1[emptyState.getAction().getType().ordinal()];
                        if (i15 != 1) {
                            if (i15 != 2) {
                                interfaceC1084f2.L(1738020481);
                                interfaceC1084f2.D();
                                throw new NoWhenBranchMatchedException();
                            }
                            interfaceC1084f2.L(1738038509);
                            IntercomPrimaryButtonKt.IntercomPrimaryButton(emptyState.getAction().getLabel(), null, Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_article_book_icon), onActionButtonClick, interfaceC1084f2, 0, 2);
                            interfaceC1084f2.D();
                            return;
                        }
                        interfaceC1084f2.L(1738022382);
                        String label = emptyState.getAction().getLabel();
                        IconType icon = emptyState.getAction().getIcon();
                        int i16 = icon == null ? -1 : WhenMappings.$EnumSwitchMapping$0[icon.ordinal()];
                        if (i16 != 1) {
                            numValueOf = (i16 == 2 || i16 == 3 || i16 == 4) ? Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_conversation_card_question) : null;
                        } else {
                            numValueOf = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_send_message_icon);
                        }
                        IntercomPrimaryButtonKt.IntercomPrimaryButton(label, null, numValueOf, onActionButtonClick, interfaceC1084f2, 0, 2);
                        interfaceC1084f2.D();
                    }
                }
            }, c1086gP), c1086gP, ((i12 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 24576, 0);
            hVar4 = hVar3;
        } else {
            if (i13 != 0) {
                hVar3 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar3 = hVar2;
            }
            EmptyStateKt.EmptyState(emptyState.getTitle(), hVar3, emptyState.getText(), Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_messages_icon), androidx.compose.runtime.internal.a.b(2045450098, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxEmptyScreenKt.InboxEmptyScreen.1

                /* JADX INFO: renamed from: io.intercom.android.sdk.m5.inbox.ui.InboxEmptyScreenKt$InboxEmptyScreen$1$WhenMappings */
                /* JADX INFO: compiled from: InboxEmptyScreen.kt */
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
                        try {
                            iArr[IconType.FACE_PILE.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                        int[] iArr2 = new int[ActionType.values().length];
                        try {
                            iArr2[ActionType.MESSAGE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused5) {
                        }
                        try {
                            iArr2[ActionType.HELP.ordinal()] = 2;
                        } catch (NoSuchFieldError unused6) {
                        }
                        $EnumSwitchMapping$1 = iArr2;
                    }
                }

                @Override // Ia.p
                public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC1084f2, num.intValue());
                    return r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i14) {
                    Integer numValueOf;
                    if ((i14 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    if (z10) {
                        int i15 = WhenMappings.$EnumSwitchMapping$1[emptyState.getAction().getType().ordinal()];
                        if (i15 != 1) {
                            if (i15 != 2) {
                                interfaceC1084f2.L(1738020481);
                                interfaceC1084f2.D();
                                throw new NoWhenBranchMatchedException();
                            }
                            interfaceC1084f2.L(1738038509);
                            IntercomPrimaryButtonKt.IntercomPrimaryButton(emptyState.getAction().getLabel(), null, Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_article_book_icon), onActionButtonClick, interfaceC1084f2, 0, 2);
                            interfaceC1084f2.D();
                            return;
                        }
                        interfaceC1084f2.L(1738022382);
                        String label = emptyState.getAction().getLabel();
                        IconType icon = emptyState.getAction().getIcon();
                        int i16 = icon == null ? -1 : WhenMappings.$EnumSwitchMapping$0[icon.ordinal()];
                        if (i16 != 1) {
                            numValueOf = (i16 == 2 || i16 == 3 || i16 == 4) ? Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_conversation_card_question) : null;
                        } else {
                            numValueOf = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_send_message_icon);
                        }
                        IntercomPrimaryButtonKt.IntercomPrimaryButton(label, null, numValueOf, onActionButtonClick, interfaceC1084f2, 0, 2);
                        interfaceC1084f2.D();
                    }
                }
            }, c1086gP), c1086gP, ((i12 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 24576, 0);
            hVar4 = hVar3;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.m5.inbox.ui.i
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return InboxEmptyScreenKt.InboxEmptyScreen$lambda$0(emptyState, z10, onActionButtonClick, hVar4, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r InboxEmptyScreen$lambda$0(EmptyState emptyState, boolean z10, Ia.a onActionButtonClick, androidx.compose.ui.h hVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(emptyState, "$emptyState");
        kotlin.jvm.internal.i.e(onActionButtonClick, "$onActionButtonClick");
        InboxEmptyScreen(emptyState, z10, onActionButtonClick, hVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return r.f47939a;
    }
}
