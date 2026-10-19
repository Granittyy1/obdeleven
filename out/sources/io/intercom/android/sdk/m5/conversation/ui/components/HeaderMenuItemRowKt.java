package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.InterfaceC0948h;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.BadgeKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.m5.components.C2270b;
import io.intercom.android.sdk.m5.components.ConversationItemKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: HeaderMenuItemRow.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HeaderMenuItemRowKt {
    @IntercomPreviews
    private static final void CollapsedHeaderMenuItemDotPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(591640881);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HeaderMenuItemRowKt.INSTANCE.m159getLambda4$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2270b(i10, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r CollapsedHeaderMenuItemDotPreview$lambda$9(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        CollapsedHeaderMenuItemDotPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void CollapsedHeaderMenuItemPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1230888234);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HeaderMenuItemRowKt.INSTANCE.m157getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.m5.components.L(i10, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r CollapsedHeaderMenuItemPreview$lambda$8(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        CollapsedHeaderMenuItemPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00de  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:92:0x00ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0101  */
    /* JADX WARN: Code duplicated, block: B:94:0x0104  */
    /* JADX WARN: Code duplicated, block: B:98:0x013d  */
    /* JADX INFO: renamed from: CollapsedHeaderMenuItemRow-88mDfTA, reason: not valid java name */
    private static final void m182CollapsedHeaderMenuItemRow88mDfTA(androidx.compose.ui.h hVar, final String str, final int i10, final String str2, final boolean z10, final boolean z11, final Ia.a<p293xa.r> aVar, final long j, InterfaceC1084f interfaceC1084f, final int i11, final int i12) {
        androidx.compose.ui.h hVar2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        final androidx.compose.ui.h hVar3;
        C1105p0 c1105p0V;
        C1086g c1086gP = interfaceC1084f.p(955883181);
        int i20 = i12 & 1;
        if (i20 != 0) {
            i13 = i11 | 6;
            hVar2 = hVar;
        } else if ((i11 & 14) == 0) {
            hVar2 = hVar;
            i13 = (c1086gP.K(hVar2) ? 4 : 2) | i11;
        } else {
            hVar2 = hVar;
            i13 = i11;
        }
        if ((i12 & 2) == 0) {
            if ((i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                i13 |= c1086gP.K(str) ? 32 : 16;
            }
            if ((i12 & 4) != 0) {
                if ((i11 & 896) == 0) {
                    if (c1086gP.h(i10)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i13 |= i14;
                }
                if ((i12 & 8) != 0) {
                    i13 |= 3072;
                } else if ((i11 & 7168) == 0) {
                    if (c1086gP.K(str2)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                if ((i12 & 16) != 0) {
                    i13 |= 24576;
                } else if ((57344 & i11) == 0) {
                    if (c1086gP.c(z10)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i13 |= i16;
                }
                if ((i12 & 32) != 0) {
                    if ((458752 & i11) == 0) {
                        if (c1086gP.c(z11)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                    }
                    if ((i12 & 64) != 0) {
                        if ((3670016 & i11) == 0) {
                            if (c1086gP.k(aVar)) {
                                i18 = 1048576;
                            } else {
                                i18 = 524288;
                            }
                            i13 |= i18;
                        }
                        if ((i12 & 128) != 0) {
                            i13 |= 12582912;
                        } else if ((29360128 & i11) == 0) {
                            if (c1086gP.i(j)) {
                                i19 = 8388608;
                            } else {
                                i19 = 4194304;
                            }
                            i13 |= i19;
                        }
                        if ((23967451 & i13) == 4793490 || !c1086gP.s()) {
                            if (i20 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            BadgeKt.b(androidx.compose.runtime.internal.a.b(-415284443, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1
                                @Override // Ia.q
                                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                                    invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                                    kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                                    if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                                        interfaceC1084f2.w();
                                        return;
                                    }
                                    boolean z12 = z11;
                                    androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                                    if (z12) {
                                        interfaceC1084f2.L(-1594599123);
                                        float f10 = 10;
                                        BadgeKt.a(PaddingKt.j(aVar2, 0.0f, f10, f10, 0.0f, 9), Q3.d.e(4292544041L), 0L, null, interfaceC1084f2, 48, 12);
                                        interfaceC1084f2.D();
                                        return;
                                    }
                                    interfaceC1084f2.L(-1594405776);
                                    if (str2 == null || !z10) {
                                        interfaceC1084f2.D();
                                        return;
                                    }
                                    HeaderMenuItemRowKt.UnreadBadge(PaddingKt.j(aVar2, 0.0f, 4, 2, 0.0f, 9), str2, interfaceC1084f2, 0, 0);
                                    interfaceC1084f2.D();
                                }
                            }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(1598560935, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2
                                @Override // Ia.q
                                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                                    invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                                    kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                                    if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                                        interfaceC1084f2.w();
                                        return;
                                    }
                                    Ia.a<p293xa.r> aVar2 = aVar;
                                    final int i22 = i10;
                                    final String str3 = str;
                                    final long j10 = j;
                                    IconButtonKt.b(aVar2, null, false, null, null, androidx.compose.runtime.internal.a.b(-900464534, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2.1
                                        @Override // Ia.p
                                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                            invoke(interfaceC1084f3, num.intValue());
                                            return p293xa.r.f47939a;
                                        }

                                        public final void invoke(InterfaceC1084f interfaceC1084f3, int i23) {
                                            if ((i23 & 11) == 2 && interfaceC1084f3.s()) {
                                                interfaceC1084f3.w();
                                            } else {
                                                IconKt.a(U.c.a(i22, interfaceC1084f3, 0), str3, androidx.compose.foundation.layout.W.m(androidx.compose.ui.h.a.f13984b, 24), j10, interfaceC1084f3, 392, 0);
                                            }
                                        }
                                    }, interfaceC1084f2), interfaceC1084f2, 196608, 30);
                                }
                            }, c1086gP), c1086gP, ((i13 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 390, 0);
                        } else {
                            c1086gP.w();
                            hVar3 = hVar2;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.s
                                @Override // Ia.p
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return HeaderMenuItemRowKt.CollapsedHeaderMenuItemRow_88mDfTA$lambda$2(hVar3, str, i10, str2, z10, z11, aVar, j, i11, i12, (InterfaceC1084f) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i13 |= 1572864;
                    if ((i12 & 128) != 0) {
                        i13 |= 12582912;
                    } else if ((29360128 & i11) == 0) {
                        if (c1086gP.i(j)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i13 |= i19;
                    }
                    if ((23967451 & i13) == 4793490) {
                        if (i20 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        BadgeKt.b(androidx.compose.runtime.internal.a.b(-415284443, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1
                            @Override // Ia.q
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                                kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                                if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                    return;
                                }
                                boolean z12 = z11;
                                androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                                if (z12) {
                                    interfaceC1084f2.L(-1594599123);
                                    float f10 = 10;
                                    BadgeKt.a(PaddingKt.j(aVar2, 0.0f, f10, f10, 0.0f, 9), Q3.d.e(4292544041L), 0L, null, interfaceC1084f2, 48, 12);
                                    interfaceC1084f2.D();
                                    return;
                                }
                                interfaceC1084f2.L(-1594405776);
                                if (str2 == null || !z10) {
                                    interfaceC1084f2.D();
                                    return;
                                }
                                HeaderMenuItemRowKt.UnreadBadge(PaddingKt.j(aVar2, 0.0f, 4, 2, 0.0f, 9), str2, interfaceC1084f2, 0, 0);
                                interfaceC1084f2.D();
                            }
                        }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(1598560935, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2
                            @Override // Ia.q
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                                kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                                if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                    return;
                                }
                                Ia.a<p293xa.r> aVar2 = aVar;
                                final int i22 = i10;
                                final String str3 = str;
                                final long j10 = j;
                                IconButtonKt.b(aVar2, null, false, null, null, androidx.compose.runtime.internal.a.b(-900464534, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2.1
                                    @Override // Ia.p
                                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                        invoke(interfaceC1084f3, num.intValue());
                                        return p293xa.r.f47939a;
                                    }

                                    public final void invoke(InterfaceC1084f interfaceC1084f3, int i23) {
                                        if ((i23 & 11) == 2 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                        } else {
                                            IconKt.a(U.c.a(i22, interfaceC1084f3, 0), str3, androidx.compose.foundation.layout.W.m(androidx.compose.ui.h.a.f13984b, 24), j10, interfaceC1084f3, 392, 0);
                                        }
                                    }
                                }, interfaceC1084f2), interfaceC1084f2, 196608, 30);
                            }
                        }, c1086gP), c1086gP, ((i13 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 390, 0);
                    } else {
                        if (i20 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        BadgeKt.b(androidx.compose.runtime.internal.a.b(-415284443, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1
                            @Override // Ia.q
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                                kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                                if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                    return;
                                }
                                boolean z12 = z11;
                                androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                                if (z12) {
                                    interfaceC1084f2.L(-1594599123);
                                    float f10 = 10;
                                    BadgeKt.a(PaddingKt.j(aVar2, 0.0f, f10, f10, 0.0f, 9), Q3.d.e(4292544041L), 0L, null, interfaceC1084f2, 48, 12);
                                    interfaceC1084f2.D();
                                    return;
                                }
                                interfaceC1084f2.L(-1594405776);
                                if (str2 == null || !z10) {
                                    interfaceC1084f2.D();
                                    return;
                                }
                                HeaderMenuItemRowKt.UnreadBadge(PaddingKt.j(aVar2, 0.0f, 4, 2, 0.0f, 9), str2, interfaceC1084f2, 0, 0);
                                interfaceC1084f2.D();
                            }
                        }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(1598560935, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2
                            @Override // Ia.q
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                                kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                                if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                    return;
                                }
                                Ia.a<p293xa.r> aVar2 = aVar;
                                final int i22 = i10;
                                final String str3 = str;
                                final long j10 = j;
                                IconButtonKt.b(aVar2, null, false, null, null, androidx.compose.runtime.internal.a.b(-900464534, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2.1
                                    @Override // Ia.p
                                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                        invoke(interfaceC1084f3, num.intValue());
                                        return p293xa.r.f47939a;
                                    }

                                    public final void invoke(InterfaceC1084f interfaceC1084f3, int i23) {
                                        if ((i23 & 11) == 2 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                        } else {
                                            IconKt.a(U.c.a(i22, interfaceC1084f3, 0), str3, androidx.compose.foundation.layout.W.m(androidx.compose.ui.h.a.f13984b, 24), j10, interfaceC1084f3, 392, 0);
                                        }
                                    }
                                }, interfaceC1084f2), interfaceC1084f2, 196608, 30);
                            }
                        }, c1086gP), c1086gP, ((i13 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 390, 0);
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.s
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return HeaderMenuItemRowKt.CollapsedHeaderMenuItemRow_88mDfTA$lambda$2(hVar3, str, i10, str2, z10, z11, aVar, j, i11, i12, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                    }
                }
                i17 = 196608;
                i13 |= i17;
                if ((i12 & 64) != 0) {
                    if ((3670016 & i11) == 0) {
                        if (c1086gP.k(aVar)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i13 |= i18;
                    }
                    if ((i12 & 128) != 0) {
                        i13 |= 12582912;
                    } else if ((29360128 & i11) == 0) {
                        if (c1086gP.i(j)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i13 |= i19;
                    }
                    if ((23967451 & i13) == 4793490) {
                        if (i20 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        BadgeKt.b(androidx.compose.runtime.internal.a.b(-415284443, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1
                            @Override // Ia.q
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                                kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                                if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                    return;
                                }
                                boolean z12 = z11;
                                androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                                if (z12) {
                                    interfaceC1084f2.L(-1594599123);
                                    float f10 = 10;
                                    BadgeKt.a(PaddingKt.j(aVar2, 0.0f, f10, f10, 0.0f, 9), Q3.d.e(4292544041L), 0L, null, interfaceC1084f2, 48, 12);
                                    interfaceC1084f2.D();
                                    return;
                                }
                                interfaceC1084f2.L(-1594405776);
                                if (str2 == null || !z10) {
                                    interfaceC1084f2.D();
                                    return;
                                }
                                HeaderMenuItemRowKt.UnreadBadge(PaddingKt.j(aVar2, 0.0f, 4, 2, 0.0f, 9), str2, interfaceC1084f2, 0, 0);
                                interfaceC1084f2.D();
                            }
                        }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(1598560935, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2
                            @Override // Ia.q
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                                kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                                if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                    return;
                                }
                                Ia.a<p293xa.r> aVar2 = aVar;
                                final int i22 = i10;
                                final String str3 = str;
                                final long j10 = j;
                                IconButtonKt.b(aVar2, null, false, null, null, androidx.compose.runtime.internal.a.b(-900464534, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2.1
                                    @Override // Ia.p
                                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                        invoke(interfaceC1084f3, num.intValue());
                                        return p293xa.r.f47939a;
                                    }

                                    public final void invoke(InterfaceC1084f interfaceC1084f3, int i23) {
                                        if ((i23 & 11) == 2 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                        } else {
                                            IconKt.a(U.c.a(i22, interfaceC1084f3, 0), str3, androidx.compose.foundation.layout.W.m(androidx.compose.ui.h.a.f13984b, 24), j10, interfaceC1084f3, 392, 0);
                                        }
                                    }
                                }, interfaceC1084f2), interfaceC1084f2, 196608, 30);
                            }
                        }, c1086gP), c1086gP, ((i13 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 390, 0);
                    } else {
                        if (i20 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        BadgeKt.b(androidx.compose.runtime.internal.a.b(-415284443, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1
                            @Override // Ia.q
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                                kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                                if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                    return;
                                }
                                boolean z12 = z11;
                                androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                                if (z12) {
                                    interfaceC1084f2.L(-1594599123);
                                    float f10 = 10;
                                    BadgeKt.a(PaddingKt.j(aVar2, 0.0f, f10, f10, 0.0f, 9), Q3.d.e(4292544041L), 0L, null, interfaceC1084f2, 48, 12);
                                    interfaceC1084f2.D();
                                    return;
                                }
                                interfaceC1084f2.L(-1594405776);
                                if (str2 == null || !z10) {
                                    interfaceC1084f2.D();
                                    return;
                                }
                                HeaderMenuItemRowKt.UnreadBadge(PaddingKt.j(aVar2, 0.0f, 4, 2, 0.0f, 9), str2, interfaceC1084f2, 0, 0);
                                interfaceC1084f2.D();
                            }
                        }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(1598560935, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2
                            @Override // Ia.q
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                                kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                                if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                    return;
                                }
                                Ia.a<p293xa.r> aVar2 = aVar;
                                final int i22 = i10;
                                final String str3 = str;
                                final long j10 = j;
                                IconButtonKt.b(aVar2, null, false, null, null, androidx.compose.runtime.internal.a.b(-900464534, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2.1
                                    @Override // Ia.p
                                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                        invoke(interfaceC1084f3, num.intValue());
                                        return p293xa.r.f47939a;
                                    }

                                    public final void invoke(InterfaceC1084f interfaceC1084f3, int i23) {
                                        if ((i23 & 11) == 2 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                        } else {
                                            IconKt.a(U.c.a(i22, interfaceC1084f3, 0), str3, androidx.compose.foundation.layout.W.m(androidx.compose.ui.h.a.f13984b, 24), j10, interfaceC1084f3, 392, 0);
                                        }
                                    }
                                }, interfaceC1084f2), interfaceC1084f2, 196608, 30);
                            }
                        }, c1086gP), c1086gP, ((i13 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 390, 0);
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.s
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return HeaderMenuItemRowKt.CollapsedHeaderMenuItemRow_88mDfTA$lambda$2(hVar3, str, i10, str2, z10, z11, aVar, j, i11, i12, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                    }
                }
                i13 |= 1572864;
                if ((i12 & 128) != 0) {
                    i13 |= 12582912;
                } else if ((29360128 & i11) == 0) {
                    if (c1086gP.i(j)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i13 |= i19;
                }
                if ((23967451 & i13) == 4793490) {
                    if (i20 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    BadgeKt.b(androidx.compose.runtime.internal.a.b(-415284443, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                            kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                            if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            boolean z12 = z11;
                            androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                            if (z12) {
                                interfaceC1084f2.L(-1594599123);
                                float f10 = 10;
                                BadgeKt.a(PaddingKt.j(aVar2, 0.0f, f10, f10, 0.0f, 9), Q3.d.e(4292544041L), 0L, null, interfaceC1084f2, 48, 12);
                                interfaceC1084f2.D();
                                return;
                            }
                            interfaceC1084f2.L(-1594405776);
                            if (str2 == null || !z10) {
                                interfaceC1084f2.D();
                                return;
                            }
                            HeaderMenuItemRowKt.UnreadBadge(PaddingKt.j(aVar2, 0.0f, 4, 2, 0.0f, 9), str2, interfaceC1084f2, 0, 0);
                            interfaceC1084f2.D();
                        }
                    }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(1598560935, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                            kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                            if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            Ia.a<p293xa.r> aVar2 = aVar;
                            final int i22 = i10;
                            final String str3 = str;
                            final long j10 = j;
                            IconButtonKt.b(aVar2, null, false, null, null, androidx.compose.runtime.internal.a.b(-900464534, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2.1
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                    invoke(interfaceC1084f3, num.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f3, int i23) {
                                    if ((i23 & 11) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        IconKt.a(U.c.a(i22, interfaceC1084f3, 0), str3, androidx.compose.foundation.layout.W.m(androidx.compose.ui.h.a.f13984b, 24), j10, interfaceC1084f3, 392, 0);
                                    }
                                }
                            }, interfaceC1084f2), interfaceC1084f2, 196608, 30);
                        }
                    }, c1086gP), c1086gP, ((i13 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 390, 0);
                } else {
                    if (i20 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    BadgeKt.b(androidx.compose.runtime.internal.a.b(-415284443, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                            kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                            if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            boolean z12 = z11;
                            androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                            if (z12) {
                                interfaceC1084f2.L(-1594599123);
                                float f10 = 10;
                                BadgeKt.a(PaddingKt.j(aVar2, 0.0f, f10, f10, 0.0f, 9), Q3.d.e(4292544041L), 0L, null, interfaceC1084f2, 48, 12);
                                interfaceC1084f2.D();
                                return;
                            }
                            interfaceC1084f2.L(-1594405776);
                            if (str2 == null || !z10) {
                                interfaceC1084f2.D();
                                return;
                            }
                            HeaderMenuItemRowKt.UnreadBadge(PaddingKt.j(aVar2, 0.0f, 4, 2, 0.0f, 9), str2, interfaceC1084f2, 0, 0);
                            interfaceC1084f2.D();
                        }
                    }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(1598560935, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                            kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                            if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            Ia.a<p293xa.r> aVar2 = aVar;
                            final int i22 = i10;
                            final String str3 = str;
                            final long j10 = j;
                            IconButtonKt.b(aVar2, null, false, null, null, androidx.compose.runtime.internal.a.b(-900464534, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2.1
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                    invoke(interfaceC1084f3, num.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f3, int i23) {
                                    if ((i23 & 11) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        IconKt.a(U.c.a(i22, interfaceC1084f3, 0), str3, androidx.compose.foundation.layout.W.m(androidx.compose.ui.h.a.f13984b, 24), j10, interfaceC1084f3, 392, 0);
                                    }
                                }
                            }, interfaceC1084f2), interfaceC1084f2, 196608, 30);
                        }
                    }, c1086gP), c1086gP, ((i13 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 390, 0);
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.s
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return HeaderMenuItemRowKt.CollapsedHeaderMenuItemRow_88mDfTA$lambda$2(hVar3, str, i10, str2, z10, z11, aVar, j, i11, i12, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i13 |= 384;
            if ((i12 & 8) != 0) {
                i13 |= 3072;
            } else if ((i11 & 7168) == 0) {
                if (c1086gP.K(str2)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            if ((i12 & 16) != 0) {
                i13 |= 24576;
            } else if ((57344 & i11) == 0) {
                if (c1086gP.c(z10)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i13 |= i16;
            }
            if ((i12 & 32) != 0) {
                if ((458752 & i11) == 0) {
                    if (c1086gP.c(z11)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                }
                if ((i12 & 64) != 0) {
                    if ((3670016 & i11) == 0) {
                        if (c1086gP.k(aVar)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i13 |= i18;
                    }
                    if ((i12 & 128) != 0) {
                        i13 |= 12582912;
                    } else if ((29360128 & i11) == 0) {
                        if (c1086gP.i(j)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i13 |= i19;
                    }
                    if ((23967451 & i13) == 4793490) {
                        if (i20 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        BadgeKt.b(androidx.compose.runtime.internal.a.b(-415284443, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1
                            @Override // Ia.q
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                                kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                                if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                    return;
                                }
                                boolean z12 = z11;
                                androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                                if (z12) {
                                    interfaceC1084f2.L(-1594599123);
                                    float f10 = 10;
                                    BadgeKt.a(PaddingKt.j(aVar2, 0.0f, f10, f10, 0.0f, 9), Q3.d.e(4292544041L), 0L, null, interfaceC1084f2, 48, 12);
                                    interfaceC1084f2.D();
                                    return;
                                }
                                interfaceC1084f2.L(-1594405776);
                                if (str2 == null || !z10) {
                                    interfaceC1084f2.D();
                                    return;
                                }
                                HeaderMenuItemRowKt.UnreadBadge(PaddingKt.j(aVar2, 0.0f, 4, 2, 0.0f, 9), str2, interfaceC1084f2, 0, 0);
                                interfaceC1084f2.D();
                            }
                        }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(1598560935, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2
                            @Override // Ia.q
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                                kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                                if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                    return;
                                }
                                Ia.a<p293xa.r> aVar2 = aVar;
                                final int i22 = i10;
                                final String str3 = str;
                                final long j10 = j;
                                IconButtonKt.b(aVar2, null, false, null, null, androidx.compose.runtime.internal.a.b(-900464534, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2.1
                                    @Override // Ia.p
                                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                        invoke(interfaceC1084f3, num.intValue());
                                        return p293xa.r.f47939a;
                                    }

                                    public final void invoke(InterfaceC1084f interfaceC1084f3, int i23) {
                                        if ((i23 & 11) == 2 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                        } else {
                                            IconKt.a(U.c.a(i22, interfaceC1084f3, 0), str3, androidx.compose.foundation.layout.W.m(androidx.compose.ui.h.a.f13984b, 24), j10, interfaceC1084f3, 392, 0);
                                        }
                                    }
                                }, interfaceC1084f2), interfaceC1084f2, 196608, 30);
                            }
                        }, c1086gP), c1086gP, ((i13 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 390, 0);
                    } else {
                        if (i20 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        BadgeKt.b(androidx.compose.runtime.internal.a.b(-415284443, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1
                            @Override // Ia.q
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                                kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                                if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                    return;
                                }
                                boolean z12 = z11;
                                androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                                if (z12) {
                                    interfaceC1084f2.L(-1594599123);
                                    float f10 = 10;
                                    BadgeKt.a(PaddingKt.j(aVar2, 0.0f, f10, f10, 0.0f, 9), Q3.d.e(4292544041L), 0L, null, interfaceC1084f2, 48, 12);
                                    interfaceC1084f2.D();
                                    return;
                                }
                                interfaceC1084f2.L(-1594405776);
                                if (str2 == null || !z10) {
                                    interfaceC1084f2.D();
                                    return;
                                }
                                HeaderMenuItemRowKt.UnreadBadge(PaddingKt.j(aVar2, 0.0f, 4, 2, 0.0f, 9), str2, interfaceC1084f2, 0, 0);
                                interfaceC1084f2.D();
                            }
                        }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(1598560935, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2
                            @Override // Ia.q
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                                kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                                if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                    return;
                                }
                                Ia.a<p293xa.r> aVar2 = aVar;
                                final int i22 = i10;
                                final String str3 = str;
                                final long j10 = j;
                                IconButtonKt.b(aVar2, null, false, null, null, androidx.compose.runtime.internal.a.b(-900464534, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2.1
                                    @Override // Ia.p
                                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                        invoke(interfaceC1084f3, num.intValue());
                                        return p293xa.r.f47939a;
                                    }

                                    public final void invoke(InterfaceC1084f interfaceC1084f3, int i23) {
                                        if ((i23 & 11) == 2 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                        } else {
                                            IconKt.a(U.c.a(i22, interfaceC1084f3, 0), str3, androidx.compose.foundation.layout.W.m(androidx.compose.ui.h.a.f13984b, 24), j10, interfaceC1084f3, 392, 0);
                                        }
                                    }
                                }, interfaceC1084f2), interfaceC1084f2, 196608, 30);
                            }
                        }, c1086gP), c1086gP, ((i13 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 390, 0);
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.s
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return HeaderMenuItemRowKt.CollapsedHeaderMenuItemRow_88mDfTA$lambda$2(hVar3, str, i10, str2, z10, z11, aVar, j, i11, i12, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                    }
                }
                i13 |= 1572864;
                if ((i12 & 128) != 0) {
                    i13 |= 12582912;
                } else if ((29360128 & i11) == 0) {
                    if (c1086gP.i(j)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i13 |= i19;
                }
                if ((23967451 & i13) == 4793490) {
                    if (i20 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    BadgeKt.b(androidx.compose.runtime.internal.a.b(-415284443, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                            kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                            if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            boolean z12 = z11;
                            androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                            if (z12) {
                                interfaceC1084f2.L(-1594599123);
                                float f10 = 10;
                                BadgeKt.a(PaddingKt.j(aVar2, 0.0f, f10, f10, 0.0f, 9), Q3.d.e(4292544041L), 0L, null, interfaceC1084f2, 48, 12);
                                interfaceC1084f2.D();
                                return;
                            }
                            interfaceC1084f2.L(-1594405776);
                            if (str2 == null || !z10) {
                                interfaceC1084f2.D();
                                return;
                            }
                            HeaderMenuItemRowKt.UnreadBadge(PaddingKt.j(aVar2, 0.0f, 4, 2, 0.0f, 9), str2, interfaceC1084f2, 0, 0);
                            interfaceC1084f2.D();
                        }
                    }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(1598560935, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                            kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                            if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            Ia.a<p293xa.r> aVar2 = aVar;
                            final int i22 = i10;
                            final String str3 = str;
                            final long j10 = j;
                            IconButtonKt.b(aVar2, null, false, null, null, androidx.compose.runtime.internal.a.b(-900464534, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2.1
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                    invoke(interfaceC1084f3, num.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f3, int i23) {
                                    if ((i23 & 11) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        IconKt.a(U.c.a(i22, interfaceC1084f3, 0), str3, androidx.compose.foundation.layout.W.m(androidx.compose.ui.h.a.f13984b, 24), j10, interfaceC1084f3, 392, 0);
                                    }
                                }
                            }, interfaceC1084f2), interfaceC1084f2, 196608, 30);
                        }
                    }, c1086gP), c1086gP, ((i13 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 390, 0);
                } else {
                    if (i20 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    BadgeKt.b(androidx.compose.runtime.internal.a.b(-415284443, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                            kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                            if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            boolean z12 = z11;
                            androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                            if (z12) {
                                interfaceC1084f2.L(-1594599123);
                                float f10 = 10;
                                BadgeKt.a(PaddingKt.j(aVar2, 0.0f, f10, f10, 0.0f, 9), Q3.d.e(4292544041L), 0L, null, interfaceC1084f2, 48, 12);
                                interfaceC1084f2.D();
                                return;
                            }
                            interfaceC1084f2.L(-1594405776);
                            if (str2 == null || !z10) {
                                interfaceC1084f2.D();
                                return;
                            }
                            HeaderMenuItemRowKt.UnreadBadge(PaddingKt.j(aVar2, 0.0f, 4, 2, 0.0f, 9), str2, interfaceC1084f2, 0, 0);
                            interfaceC1084f2.D();
                        }
                    }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(1598560935, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                            kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                            if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            Ia.a<p293xa.r> aVar2 = aVar;
                            final int i22 = i10;
                            final String str3 = str;
                            final long j10 = j;
                            IconButtonKt.b(aVar2, null, false, null, null, androidx.compose.runtime.internal.a.b(-900464534, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2.1
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                    invoke(interfaceC1084f3, num.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f3, int i23) {
                                    if ((i23 & 11) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        IconKt.a(U.c.a(i22, interfaceC1084f3, 0), str3, androidx.compose.foundation.layout.W.m(androidx.compose.ui.h.a.f13984b, 24), j10, interfaceC1084f3, 392, 0);
                                    }
                                }
                            }, interfaceC1084f2), interfaceC1084f2, 196608, 30);
                        }
                    }, c1086gP), c1086gP, ((i13 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 390, 0);
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.s
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return HeaderMenuItemRowKt.CollapsedHeaderMenuItemRow_88mDfTA$lambda$2(hVar3, str, i10, str2, z10, z11, aVar, j, i11, i12, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i17 = 196608;
            i13 |= i17;
            if ((i12 & 64) != 0) {
                if ((3670016 & i11) == 0) {
                    if (c1086gP.k(aVar)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i13 |= i18;
                }
                if ((i12 & 128) != 0) {
                    i13 |= 12582912;
                } else if ((29360128 & i11) == 0) {
                    if (c1086gP.i(j)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i13 |= i19;
                }
                if ((23967451 & i13) == 4793490) {
                    if (i20 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    BadgeKt.b(androidx.compose.runtime.internal.a.b(-415284443, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                            kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                            if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            boolean z12 = z11;
                            androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                            if (z12) {
                                interfaceC1084f2.L(-1594599123);
                                float f10 = 10;
                                BadgeKt.a(PaddingKt.j(aVar2, 0.0f, f10, f10, 0.0f, 9), Q3.d.e(4292544041L), 0L, null, interfaceC1084f2, 48, 12);
                                interfaceC1084f2.D();
                                return;
                            }
                            interfaceC1084f2.L(-1594405776);
                            if (str2 == null || !z10) {
                                interfaceC1084f2.D();
                                return;
                            }
                            HeaderMenuItemRowKt.UnreadBadge(PaddingKt.j(aVar2, 0.0f, 4, 2, 0.0f, 9), str2, interfaceC1084f2, 0, 0);
                            interfaceC1084f2.D();
                        }
                    }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(1598560935, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                            kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                            if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            Ia.a<p293xa.r> aVar2 = aVar;
                            final int i22 = i10;
                            final String str3 = str;
                            final long j10 = j;
                            IconButtonKt.b(aVar2, null, false, null, null, androidx.compose.runtime.internal.a.b(-900464534, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2.1
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                    invoke(interfaceC1084f3, num.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f3, int i23) {
                                    if ((i23 & 11) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        IconKt.a(U.c.a(i22, interfaceC1084f3, 0), str3, androidx.compose.foundation.layout.W.m(androidx.compose.ui.h.a.f13984b, 24), j10, interfaceC1084f3, 392, 0);
                                    }
                                }
                            }, interfaceC1084f2), interfaceC1084f2, 196608, 30);
                        }
                    }, c1086gP), c1086gP, ((i13 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 390, 0);
                } else {
                    if (i20 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    BadgeKt.b(androidx.compose.runtime.internal.a.b(-415284443, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                            kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                            if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            boolean z12 = z11;
                            androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                            if (z12) {
                                interfaceC1084f2.L(-1594599123);
                                float f10 = 10;
                                BadgeKt.a(PaddingKt.j(aVar2, 0.0f, f10, f10, 0.0f, 9), Q3.d.e(4292544041L), 0L, null, interfaceC1084f2, 48, 12);
                                interfaceC1084f2.D();
                                return;
                            }
                            interfaceC1084f2.L(-1594405776);
                            if (str2 == null || !z10) {
                                interfaceC1084f2.D();
                                return;
                            }
                            HeaderMenuItemRowKt.UnreadBadge(PaddingKt.j(aVar2, 0.0f, 4, 2, 0.0f, 9), str2, interfaceC1084f2, 0, 0);
                            interfaceC1084f2.D();
                        }
                    }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(1598560935, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                            kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                            if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            Ia.a<p293xa.r> aVar2 = aVar;
                            final int i22 = i10;
                            final String str3 = str;
                            final long j10 = j;
                            IconButtonKt.b(aVar2, null, false, null, null, androidx.compose.runtime.internal.a.b(-900464534, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2.1
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                    invoke(interfaceC1084f3, num.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f3, int i23) {
                                    if ((i23 & 11) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        IconKt.a(U.c.a(i22, interfaceC1084f3, 0), str3, androidx.compose.foundation.layout.W.m(androidx.compose.ui.h.a.f13984b, 24), j10, interfaceC1084f3, 392, 0);
                                    }
                                }
                            }, interfaceC1084f2), interfaceC1084f2, 196608, 30);
                        }
                    }, c1086gP), c1086gP, ((i13 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 390, 0);
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.s
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return HeaderMenuItemRowKt.CollapsedHeaderMenuItemRow_88mDfTA$lambda$2(hVar3, str, i10, str2, z10, z11, aVar, j, i11, i12, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i13 |= 1572864;
            if ((i12 & 128) != 0) {
                i13 |= 12582912;
            } else if ((29360128 & i11) == 0) {
                if (c1086gP.i(j)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i13 |= i19;
            }
            if ((23967451 & i13) == 4793490) {
                if (i20 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                BadgeKt.b(androidx.compose.runtime.internal.a.b(-415284443, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                        kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                        if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        boolean z12 = z11;
                        androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                        if (z12) {
                            interfaceC1084f2.L(-1594599123);
                            float f10 = 10;
                            BadgeKt.a(PaddingKt.j(aVar2, 0.0f, f10, f10, 0.0f, 9), Q3.d.e(4292544041L), 0L, null, interfaceC1084f2, 48, 12);
                            interfaceC1084f2.D();
                            return;
                        }
                        interfaceC1084f2.L(-1594405776);
                        if (str2 == null || !z10) {
                            interfaceC1084f2.D();
                            return;
                        }
                        HeaderMenuItemRowKt.UnreadBadge(PaddingKt.j(aVar2, 0.0f, 4, 2, 0.0f, 9), str2, interfaceC1084f2, 0, 0);
                        interfaceC1084f2.D();
                    }
                }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(1598560935, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                        kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                        if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        Ia.a<p293xa.r> aVar2 = aVar;
                        final int i22 = i10;
                        final String str3 = str;
                        final long j10 = j;
                        IconButtonKt.b(aVar2, null, false, null, null, androidx.compose.runtime.internal.a.b(-900464534, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2.1
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                invoke(interfaceC1084f3, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f3, int i23) {
                                if ((i23 & 11) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    IconKt.a(U.c.a(i22, interfaceC1084f3, 0), str3, androidx.compose.foundation.layout.W.m(androidx.compose.ui.h.a.f13984b, 24), j10, interfaceC1084f3, 392, 0);
                                }
                            }
                        }, interfaceC1084f2), interfaceC1084f2, 196608, 30);
                    }
                }, c1086gP), c1086gP, ((i13 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 390, 0);
            } else {
                if (i20 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                BadgeKt.b(androidx.compose.runtime.internal.a.b(-415284443, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                        kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                        if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        boolean z12 = z11;
                        androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                        if (z12) {
                            interfaceC1084f2.L(-1594599123);
                            float f10 = 10;
                            BadgeKt.a(PaddingKt.j(aVar2, 0.0f, f10, f10, 0.0f, 9), Q3.d.e(4292544041L), 0L, null, interfaceC1084f2, 48, 12);
                            interfaceC1084f2.D();
                            return;
                        }
                        interfaceC1084f2.L(-1594405776);
                        if (str2 == null || !z10) {
                            interfaceC1084f2.D();
                            return;
                        }
                        HeaderMenuItemRowKt.UnreadBadge(PaddingKt.j(aVar2, 0.0f, 4, 2, 0.0f, 9), str2, interfaceC1084f2, 0, 0);
                        interfaceC1084f2.D();
                    }
                }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(1598560935, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                        kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                        if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        Ia.a<p293xa.r> aVar2 = aVar;
                        final int i22 = i10;
                        final String str3 = str;
                        final long j10 = j;
                        IconButtonKt.b(aVar2, null, false, null, null, androidx.compose.runtime.internal.a.b(-900464534, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2.1
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                invoke(interfaceC1084f3, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f3, int i23) {
                                if ((i23 & 11) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    IconKt.a(U.c.a(i22, interfaceC1084f3, 0), str3, androidx.compose.foundation.layout.W.m(androidx.compose.ui.h.a.f13984b, 24), j10, interfaceC1084f3, 392, 0);
                                }
                            }
                        }, interfaceC1084f2), interfaceC1084f2, 196608, 30);
                    }
                }, c1086gP), c1086gP, ((i13 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 390, 0);
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.s
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return HeaderMenuItemRowKt.CollapsedHeaderMenuItemRow_88mDfTA$lambda$2(hVar3, str, i10, str2, z10, z11, aVar, j, i11, i12, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i13 |= 48;
        if ((i12 & 4) != 0) {
            if ((i11 & 896) == 0) {
                if (c1086gP.h(i10)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i13 |= i14;
            }
            if ((i12 & 8) != 0) {
                i13 |= 3072;
            } else if ((i11 & 7168) == 0) {
                if (c1086gP.K(str2)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            if ((i12 & 16) != 0) {
                i13 |= 24576;
            } else if ((57344 & i11) == 0) {
                if (c1086gP.c(z10)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i13 |= i16;
            }
            if ((i12 & 32) != 0) {
                if ((458752 & i11) == 0) {
                    if (c1086gP.c(z11)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                }
                if ((i12 & 64) != 0) {
                    if ((3670016 & i11) == 0) {
                        if (c1086gP.k(aVar)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i13 |= i18;
                    }
                    if ((i12 & 128) != 0) {
                        i13 |= 12582912;
                    } else if ((29360128 & i11) == 0) {
                        if (c1086gP.i(j)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i13 |= i19;
                    }
                    if ((23967451 & i13) == 4793490) {
                        if (i20 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        BadgeKt.b(androidx.compose.runtime.internal.a.b(-415284443, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1
                            @Override // Ia.q
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                                kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                                if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                    return;
                                }
                                boolean z12 = z11;
                                androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                                if (z12) {
                                    interfaceC1084f2.L(-1594599123);
                                    float f10 = 10;
                                    BadgeKt.a(PaddingKt.j(aVar2, 0.0f, f10, f10, 0.0f, 9), Q3.d.e(4292544041L), 0L, null, interfaceC1084f2, 48, 12);
                                    interfaceC1084f2.D();
                                    return;
                                }
                                interfaceC1084f2.L(-1594405776);
                                if (str2 == null || !z10) {
                                    interfaceC1084f2.D();
                                    return;
                                }
                                HeaderMenuItemRowKt.UnreadBadge(PaddingKt.j(aVar2, 0.0f, 4, 2, 0.0f, 9), str2, interfaceC1084f2, 0, 0);
                                interfaceC1084f2.D();
                            }
                        }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(1598560935, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2
                            @Override // Ia.q
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                                kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                                if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                    return;
                                }
                                Ia.a<p293xa.r> aVar2 = aVar;
                                final int i22 = i10;
                                final String str3 = str;
                                final long j10 = j;
                                IconButtonKt.b(aVar2, null, false, null, null, androidx.compose.runtime.internal.a.b(-900464534, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2.1
                                    @Override // Ia.p
                                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                        invoke(interfaceC1084f3, num.intValue());
                                        return p293xa.r.f47939a;
                                    }

                                    public final void invoke(InterfaceC1084f interfaceC1084f3, int i23) {
                                        if ((i23 & 11) == 2 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                        } else {
                                            IconKt.a(U.c.a(i22, interfaceC1084f3, 0), str3, androidx.compose.foundation.layout.W.m(androidx.compose.ui.h.a.f13984b, 24), j10, interfaceC1084f3, 392, 0);
                                        }
                                    }
                                }, interfaceC1084f2), interfaceC1084f2, 196608, 30);
                            }
                        }, c1086gP), c1086gP, ((i13 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 390, 0);
                    } else {
                        if (i20 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        BadgeKt.b(androidx.compose.runtime.internal.a.b(-415284443, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1
                            @Override // Ia.q
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                                kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                                if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                    return;
                                }
                                boolean z12 = z11;
                                androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                                if (z12) {
                                    interfaceC1084f2.L(-1594599123);
                                    float f10 = 10;
                                    BadgeKt.a(PaddingKt.j(aVar2, 0.0f, f10, f10, 0.0f, 9), Q3.d.e(4292544041L), 0L, null, interfaceC1084f2, 48, 12);
                                    interfaceC1084f2.D();
                                    return;
                                }
                                interfaceC1084f2.L(-1594405776);
                                if (str2 == null || !z10) {
                                    interfaceC1084f2.D();
                                    return;
                                }
                                HeaderMenuItemRowKt.UnreadBadge(PaddingKt.j(aVar2, 0.0f, 4, 2, 0.0f, 9), str2, interfaceC1084f2, 0, 0);
                                interfaceC1084f2.D();
                            }
                        }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(1598560935, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2
                            @Override // Ia.q
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                                kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                                if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                    return;
                                }
                                Ia.a<p293xa.r> aVar2 = aVar;
                                final int i22 = i10;
                                final String str3 = str;
                                final long j10 = j;
                                IconButtonKt.b(aVar2, null, false, null, null, androidx.compose.runtime.internal.a.b(-900464534, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2.1
                                    @Override // Ia.p
                                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                        invoke(interfaceC1084f3, num.intValue());
                                        return p293xa.r.f47939a;
                                    }

                                    public final void invoke(InterfaceC1084f interfaceC1084f3, int i23) {
                                        if ((i23 & 11) == 2 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                        } else {
                                            IconKt.a(U.c.a(i22, interfaceC1084f3, 0), str3, androidx.compose.foundation.layout.W.m(androidx.compose.ui.h.a.f13984b, 24), j10, interfaceC1084f3, 392, 0);
                                        }
                                    }
                                }, interfaceC1084f2), interfaceC1084f2, 196608, 30);
                            }
                        }, c1086gP), c1086gP, ((i13 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 390, 0);
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.s
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return HeaderMenuItemRowKt.CollapsedHeaderMenuItemRow_88mDfTA$lambda$2(hVar3, str, i10, str2, z10, z11, aVar, j, i11, i12, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                    }
                }
                i13 |= 1572864;
                if ((i12 & 128) != 0) {
                    i13 |= 12582912;
                } else if ((29360128 & i11) == 0) {
                    if (c1086gP.i(j)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i13 |= i19;
                }
                if ((23967451 & i13) == 4793490) {
                    if (i20 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    BadgeKt.b(androidx.compose.runtime.internal.a.b(-415284443, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                            kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                            if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            boolean z12 = z11;
                            androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                            if (z12) {
                                interfaceC1084f2.L(-1594599123);
                                float f10 = 10;
                                BadgeKt.a(PaddingKt.j(aVar2, 0.0f, f10, f10, 0.0f, 9), Q3.d.e(4292544041L), 0L, null, interfaceC1084f2, 48, 12);
                                interfaceC1084f2.D();
                                return;
                            }
                            interfaceC1084f2.L(-1594405776);
                            if (str2 == null || !z10) {
                                interfaceC1084f2.D();
                                return;
                            }
                            HeaderMenuItemRowKt.UnreadBadge(PaddingKt.j(aVar2, 0.0f, 4, 2, 0.0f, 9), str2, interfaceC1084f2, 0, 0);
                            interfaceC1084f2.D();
                        }
                    }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(1598560935, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                            kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                            if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            Ia.a<p293xa.r> aVar2 = aVar;
                            final int i22 = i10;
                            final String str3 = str;
                            final long j10 = j;
                            IconButtonKt.b(aVar2, null, false, null, null, androidx.compose.runtime.internal.a.b(-900464534, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2.1
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                    invoke(interfaceC1084f3, num.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f3, int i23) {
                                    if ((i23 & 11) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        IconKt.a(U.c.a(i22, interfaceC1084f3, 0), str3, androidx.compose.foundation.layout.W.m(androidx.compose.ui.h.a.f13984b, 24), j10, interfaceC1084f3, 392, 0);
                                    }
                                }
                            }, interfaceC1084f2), interfaceC1084f2, 196608, 30);
                        }
                    }, c1086gP), c1086gP, ((i13 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 390, 0);
                } else {
                    if (i20 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    BadgeKt.b(androidx.compose.runtime.internal.a.b(-415284443, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                            kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                            if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            boolean z12 = z11;
                            androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                            if (z12) {
                                interfaceC1084f2.L(-1594599123);
                                float f10 = 10;
                                BadgeKt.a(PaddingKt.j(aVar2, 0.0f, f10, f10, 0.0f, 9), Q3.d.e(4292544041L), 0L, null, interfaceC1084f2, 48, 12);
                                interfaceC1084f2.D();
                                return;
                            }
                            interfaceC1084f2.L(-1594405776);
                            if (str2 == null || !z10) {
                                interfaceC1084f2.D();
                                return;
                            }
                            HeaderMenuItemRowKt.UnreadBadge(PaddingKt.j(aVar2, 0.0f, 4, 2, 0.0f, 9), str2, interfaceC1084f2, 0, 0);
                            interfaceC1084f2.D();
                        }
                    }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(1598560935, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                            kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                            if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            Ia.a<p293xa.r> aVar2 = aVar;
                            final int i22 = i10;
                            final String str3 = str;
                            final long j10 = j;
                            IconButtonKt.b(aVar2, null, false, null, null, androidx.compose.runtime.internal.a.b(-900464534, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2.1
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                    invoke(interfaceC1084f3, num.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f3, int i23) {
                                    if ((i23 & 11) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        IconKt.a(U.c.a(i22, interfaceC1084f3, 0), str3, androidx.compose.foundation.layout.W.m(androidx.compose.ui.h.a.f13984b, 24), j10, interfaceC1084f3, 392, 0);
                                    }
                                }
                            }, interfaceC1084f2), interfaceC1084f2, 196608, 30);
                        }
                    }, c1086gP), c1086gP, ((i13 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 390, 0);
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.s
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return HeaderMenuItemRowKt.CollapsedHeaderMenuItemRow_88mDfTA$lambda$2(hVar3, str, i10, str2, z10, z11, aVar, j, i11, i12, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i17 = 196608;
            i13 |= i17;
            if ((i12 & 64) != 0) {
                if ((3670016 & i11) == 0) {
                    if (c1086gP.k(aVar)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i13 |= i18;
                }
                if ((i12 & 128) != 0) {
                    i13 |= 12582912;
                } else if ((29360128 & i11) == 0) {
                    if (c1086gP.i(j)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i13 |= i19;
                }
                if ((23967451 & i13) == 4793490) {
                    if (i20 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    BadgeKt.b(androidx.compose.runtime.internal.a.b(-415284443, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                            kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                            if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            boolean z12 = z11;
                            androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                            if (z12) {
                                interfaceC1084f2.L(-1594599123);
                                float f10 = 10;
                                BadgeKt.a(PaddingKt.j(aVar2, 0.0f, f10, f10, 0.0f, 9), Q3.d.e(4292544041L), 0L, null, interfaceC1084f2, 48, 12);
                                interfaceC1084f2.D();
                                return;
                            }
                            interfaceC1084f2.L(-1594405776);
                            if (str2 == null || !z10) {
                                interfaceC1084f2.D();
                                return;
                            }
                            HeaderMenuItemRowKt.UnreadBadge(PaddingKt.j(aVar2, 0.0f, 4, 2, 0.0f, 9), str2, interfaceC1084f2, 0, 0);
                            interfaceC1084f2.D();
                        }
                    }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(1598560935, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                            kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                            if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            Ia.a<p293xa.r> aVar2 = aVar;
                            final int i22 = i10;
                            final String str3 = str;
                            final long j10 = j;
                            IconButtonKt.b(aVar2, null, false, null, null, androidx.compose.runtime.internal.a.b(-900464534, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2.1
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                    invoke(interfaceC1084f3, num.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f3, int i23) {
                                    if ((i23 & 11) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        IconKt.a(U.c.a(i22, interfaceC1084f3, 0), str3, androidx.compose.foundation.layout.W.m(androidx.compose.ui.h.a.f13984b, 24), j10, interfaceC1084f3, 392, 0);
                                    }
                                }
                            }, interfaceC1084f2), interfaceC1084f2, 196608, 30);
                        }
                    }, c1086gP), c1086gP, ((i13 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 390, 0);
                } else {
                    if (i20 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    BadgeKt.b(androidx.compose.runtime.internal.a.b(-415284443, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                            kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                            if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            boolean z12 = z11;
                            androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                            if (z12) {
                                interfaceC1084f2.L(-1594599123);
                                float f10 = 10;
                                BadgeKt.a(PaddingKt.j(aVar2, 0.0f, f10, f10, 0.0f, 9), Q3.d.e(4292544041L), 0L, null, interfaceC1084f2, 48, 12);
                                interfaceC1084f2.D();
                                return;
                            }
                            interfaceC1084f2.L(-1594405776);
                            if (str2 == null || !z10) {
                                interfaceC1084f2.D();
                                return;
                            }
                            HeaderMenuItemRowKt.UnreadBadge(PaddingKt.j(aVar2, 0.0f, 4, 2, 0.0f, 9), str2, interfaceC1084f2, 0, 0);
                            interfaceC1084f2.D();
                        }
                    }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(1598560935, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                            kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                            if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            Ia.a<p293xa.r> aVar2 = aVar;
                            final int i22 = i10;
                            final String str3 = str;
                            final long j10 = j;
                            IconButtonKt.b(aVar2, null, false, null, null, androidx.compose.runtime.internal.a.b(-900464534, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2.1
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                    invoke(interfaceC1084f3, num.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f3, int i23) {
                                    if ((i23 & 11) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        IconKt.a(U.c.a(i22, interfaceC1084f3, 0), str3, androidx.compose.foundation.layout.W.m(androidx.compose.ui.h.a.f13984b, 24), j10, interfaceC1084f3, 392, 0);
                                    }
                                }
                            }, interfaceC1084f2), interfaceC1084f2, 196608, 30);
                        }
                    }, c1086gP), c1086gP, ((i13 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 390, 0);
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.s
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return HeaderMenuItemRowKt.CollapsedHeaderMenuItemRow_88mDfTA$lambda$2(hVar3, str, i10, str2, z10, z11, aVar, j, i11, i12, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i13 |= 1572864;
            if ((i12 & 128) != 0) {
                i13 |= 12582912;
            } else if ((29360128 & i11) == 0) {
                if (c1086gP.i(j)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i13 |= i19;
            }
            if ((23967451 & i13) == 4793490) {
                if (i20 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                BadgeKt.b(androidx.compose.runtime.internal.a.b(-415284443, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                        kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                        if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        boolean z12 = z11;
                        androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                        if (z12) {
                            interfaceC1084f2.L(-1594599123);
                            float f10 = 10;
                            BadgeKt.a(PaddingKt.j(aVar2, 0.0f, f10, f10, 0.0f, 9), Q3.d.e(4292544041L), 0L, null, interfaceC1084f2, 48, 12);
                            interfaceC1084f2.D();
                            return;
                        }
                        interfaceC1084f2.L(-1594405776);
                        if (str2 == null || !z10) {
                            interfaceC1084f2.D();
                            return;
                        }
                        HeaderMenuItemRowKt.UnreadBadge(PaddingKt.j(aVar2, 0.0f, 4, 2, 0.0f, 9), str2, interfaceC1084f2, 0, 0);
                        interfaceC1084f2.D();
                    }
                }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(1598560935, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                        kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                        if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        Ia.a<p293xa.r> aVar2 = aVar;
                        final int i22 = i10;
                        final String str3 = str;
                        final long j10 = j;
                        IconButtonKt.b(aVar2, null, false, null, null, androidx.compose.runtime.internal.a.b(-900464534, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2.1
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                invoke(interfaceC1084f3, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f3, int i23) {
                                if ((i23 & 11) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    IconKt.a(U.c.a(i22, interfaceC1084f3, 0), str3, androidx.compose.foundation.layout.W.m(androidx.compose.ui.h.a.f13984b, 24), j10, interfaceC1084f3, 392, 0);
                                }
                            }
                        }, interfaceC1084f2), interfaceC1084f2, 196608, 30);
                    }
                }, c1086gP), c1086gP, ((i13 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 390, 0);
            } else {
                if (i20 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                BadgeKt.b(androidx.compose.runtime.internal.a.b(-415284443, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                        kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                        if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        boolean z12 = z11;
                        androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                        if (z12) {
                            interfaceC1084f2.L(-1594599123);
                            float f10 = 10;
                            BadgeKt.a(PaddingKt.j(aVar2, 0.0f, f10, f10, 0.0f, 9), Q3.d.e(4292544041L), 0L, null, interfaceC1084f2, 48, 12);
                            interfaceC1084f2.D();
                            return;
                        }
                        interfaceC1084f2.L(-1594405776);
                        if (str2 == null || !z10) {
                            interfaceC1084f2.D();
                            return;
                        }
                        HeaderMenuItemRowKt.UnreadBadge(PaddingKt.j(aVar2, 0.0f, 4, 2, 0.0f, 9), str2, interfaceC1084f2, 0, 0);
                        interfaceC1084f2.D();
                    }
                }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(1598560935, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                        kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                        if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        Ia.a<p293xa.r> aVar2 = aVar;
                        final int i22 = i10;
                        final String str3 = str;
                        final long j10 = j;
                        IconButtonKt.b(aVar2, null, false, null, null, androidx.compose.runtime.internal.a.b(-900464534, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2.1
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                invoke(interfaceC1084f3, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f3, int i23) {
                                if ((i23 & 11) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    IconKt.a(U.c.a(i22, interfaceC1084f3, 0), str3, androidx.compose.foundation.layout.W.m(androidx.compose.ui.h.a.f13984b, 24), j10, interfaceC1084f3, 392, 0);
                                }
                            }
                        }, interfaceC1084f2), interfaceC1084f2, 196608, 30);
                    }
                }, c1086gP), c1086gP, ((i13 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 390, 0);
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.s
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return HeaderMenuItemRowKt.CollapsedHeaderMenuItemRow_88mDfTA$lambda$2(hVar3, str, i10, str2, z10, z11, aVar, j, i11, i12, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i13 |= 384;
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 7168) == 0) {
            if (c1086gP.K(str2)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i13 |= i15;
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((57344 & i11) == 0) {
            if (c1086gP.c(z10)) {
                i16 = 16384;
            } else {
                i16 = 8192;
            }
            i13 |= i16;
        }
        if ((i12 & 32) != 0) {
            if ((458752 & i11) == 0) {
                if (c1086gP.c(z11)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
            }
            if ((i12 & 64) != 0) {
                if ((3670016 & i11) == 0) {
                    if (c1086gP.k(aVar)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i13 |= i18;
                }
                if ((i12 & 128) != 0) {
                    i13 |= 12582912;
                } else if ((29360128 & i11) == 0) {
                    if (c1086gP.i(j)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i13 |= i19;
                }
                if ((23967451 & i13) == 4793490) {
                    if (i20 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    BadgeKt.b(androidx.compose.runtime.internal.a.b(-415284443, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                            kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                            if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            boolean z12 = z11;
                            androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                            if (z12) {
                                interfaceC1084f2.L(-1594599123);
                                float f10 = 10;
                                BadgeKt.a(PaddingKt.j(aVar2, 0.0f, f10, f10, 0.0f, 9), Q3.d.e(4292544041L), 0L, null, interfaceC1084f2, 48, 12);
                                interfaceC1084f2.D();
                                return;
                            }
                            interfaceC1084f2.L(-1594405776);
                            if (str2 == null || !z10) {
                                interfaceC1084f2.D();
                                return;
                            }
                            HeaderMenuItemRowKt.UnreadBadge(PaddingKt.j(aVar2, 0.0f, 4, 2, 0.0f, 9), str2, interfaceC1084f2, 0, 0);
                            interfaceC1084f2.D();
                        }
                    }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(1598560935, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                            kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                            if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            Ia.a<p293xa.r> aVar2 = aVar;
                            final int i22 = i10;
                            final String str3 = str;
                            final long j10 = j;
                            IconButtonKt.b(aVar2, null, false, null, null, androidx.compose.runtime.internal.a.b(-900464534, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2.1
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                    invoke(interfaceC1084f3, num.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f3, int i23) {
                                    if ((i23 & 11) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        IconKt.a(U.c.a(i22, interfaceC1084f3, 0), str3, androidx.compose.foundation.layout.W.m(androidx.compose.ui.h.a.f13984b, 24), j10, interfaceC1084f3, 392, 0);
                                    }
                                }
                            }, interfaceC1084f2), interfaceC1084f2, 196608, 30);
                        }
                    }, c1086gP), c1086gP, ((i13 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 390, 0);
                } else {
                    if (i20 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    BadgeKt.b(androidx.compose.runtime.internal.a.b(-415284443, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                            kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                            if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            boolean z12 = z11;
                            androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                            if (z12) {
                                interfaceC1084f2.L(-1594599123);
                                float f10 = 10;
                                BadgeKt.a(PaddingKt.j(aVar2, 0.0f, f10, f10, 0.0f, 9), Q3.d.e(4292544041L), 0L, null, interfaceC1084f2, 48, 12);
                                interfaceC1084f2.D();
                                return;
                            }
                            interfaceC1084f2.L(-1594405776);
                            if (str2 == null || !z10) {
                                interfaceC1084f2.D();
                                return;
                            }
                            HeaderMenuItemRowKt.UnreadBadge(PaddingKt.j(aVar2, 0.0f, 4, 2, 0.0f, 9), str2, interfaceC1084f2, 0, 0);
                            interfaceC1084f2.D();
                        }
                    }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(1598560935, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                            kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                            if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            Ia.a<p293xa.r> aVar2 = aVar;
                            final int i22 = i10;
                            final String str3 = str;
                            final long j10 = j;
                            IconButtonKt.b(aVar2, null, false, null, null, androidx.compose.runtime.internal.a.b(-900464534, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2.1
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                    invoke(interfaceC1084f3, num.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f3, int i23) {
                                    if ((i23 & 11) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        IconKt.a(U.c.a(i22, interfaceC1084f3, 0), str3, androidx.compose.foundation.layout.W.m(androidx.compose.ui.h.a.f13984b, 24), j10, interfaceC1084f3, 392, 0);
                                    }
                                }
                            }, interfaceC1084f2), interfaceC1084f2, 196608, 30);
                        }
                    }, c1086gP), c1086gP, ((i13 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 390, 0);
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.s
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return HeaderMenuItemRowKt.CollapsedHeaderMenuItemRow_88mDfTA$lambda$2(hVar3, str, i10, str2, z10, z11, aVar, j, i11, i12, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i13 |= 1572864;
            if ((i12 & 128) != 0) {
                i13 |= 12582912;
            } else if ((29360128 & i11) == 0) {
                if (c1086gP.i(j)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i13 |= i19;
            }
            if ((23967451 & i13) == 4793490) {
                if (i20 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                BadgeKt.b(androidx.compose.runtime.internal.a.b(-415284443, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                        kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                        if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        boolean z12 = z11;
                        androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                        if (z12) {
                            interfaceC1084f2.L(-1594599123);
                            float f10 = 10;
                            BadgeKt.a(PaddingKt.j(aVar2, 0.0f, f10, f10, 0.0f, 9), Q3.d.e(4292544041L), 0L, null, interfaceC1084f2, 48, 12);
                            interfaceC1084f2.D();
                            return;
                        }
                        interfaceC1084f2.L(-1594405776);
                        if (str2 == null || !z10) {
                            interfaceC1084f2.D();
                            return;
                        }
                        HeaderMenuItemRowKt.UnreadBadge(PaddingKt.j(aVar2, 0.0f, 4, 2, 0.0f, 9), str2, interfaceC1084f2, 0, 0);
                        interfaceC1084f2.D();
                    }
                }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(1598560935, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                        kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                        if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        Ia.a<p293xa.r> aVar2 = aVar;
                        final int i22 = i10;
                        final String str3 = str;
                        final long j10 = j;
                        IconButtonKt.b(aVar2, null, false, null, null, androidx.compose.runtime.internal.a.b(-900464534, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2.1
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                invoke(interfaceC1084f3, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f3, int i23) {
                                if ((i23 & 11) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    IconKt.a(U.c.a(i22, interfaceC1084f3, 0), str3, androidx.compose.foundation.layout.W.m(androidx.compose.ui.h.a.f13984b, 24), j10, interfaceC1084f3, 392, 0);
                                }
                            }
                        }, interfaceC1084f2), interfaceC1084f2, 196608, 30);
                    }
                }, c1086gP), c1086gP, ((i13 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 390, 0);
            } else {
                if (i20 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                BadgeKt.b(androidx.compose.runtime.internal.a.b(-415284443, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                        kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                        if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        boolean z12 = z11;
                        androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                        if (z12) {
                            interfaceC1084f2.L(-1594599123);
                            float f10 = 10;
                            BadgeKt.a(PaddingKt.j(aVar2, 0.0f, f10, f10, 0.0f, 9), Q3.d.e(4292544041L), 0L, null, interfaceC1084f2, 48, 12);
                            interfaceC1084f2.D();
                            return;
                        }
                        interfaceC1084f2.L(-1594405776);
                        if (str2 == null || !z10) {
                            interfaceC1084f2.D();
                            return;
                        }
                        HeaderMenuItemRowKt.UnreadBadge(PaddingKt.j(aVar2, 0.0f, 4, 2, 0.0f, 9), str2, interfaceC1084f2, 0, 0);
                        interfaceC1084f2.D();
                    }
                }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(1598560935, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                        kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                        if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        Ia.a<p293xa.r> aVar2 = aVar;
                        final int i22 = i10;
                        final String str3 = str;
                        final long j10 = j;
                        IconButtonKt.b(aVar2, null, false, null, null, androidx.compose.runtime.internal.a.b(-900464534, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2.1
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                invoke(interfaceC1084f3, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f3, int i23) {
                                if ((i23 & 11) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    IconKt.a(U.c.a(i22, interfaceC1084f3, 0), str3, androidx.compose.foundation.layout.W.m(androidx.compose.ui.h.a.f13984b, 24), j10, interfaceC1084f3, 392, 0);
                                }
                            }
                        }, interfaceC1084f2), interfaceC1084f2, 196608, 30);
                    }
                }, c1086gP), c1086gP, ((i13 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 390, 0);
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.s
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return HeaderMenuItemRowKt.CollapsedHeaderMenuItemRow_88mDfTA$lambda$2(hVar3, str, i10, str2, z10, z11, aVar, j, i11, i12, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i17 = 196608;
        i13 |= i17;
        if ((i12 & 64) != 0) {
            if ((3670016 & i11) == 0) {
                if (c1086gP.k(aVar)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i13 |= i18;
            }
            if ((i12 & 128) != 0) {
                i13 |= 12582912;
            } else if ((29360128 & i11) == 0) {
                if (c1086gP.i(j)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i13 |= i19;
            }
            if ((23967451 & i13) == 4793490) {
                if (i20 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                BadgeKt.b(androidx.compose.runtime.internal.a.b(-415284443, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                        kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                        if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        boolean z12 = z11;
                        androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                        if (z12) {
                            interfaceC1084f2.L(-1594599123);
                            float f10 = 10;
                            BadgeKt.a(PaddingKt.j(aVar2, 0.0f, f10, f10, 0.0f, 9), Q3.d.e(4292544041L), 0L, null, interfaceC1084f2, 48, 12);
                            interfaceC1084f2.D();
                            return;
                        }
                        interfaceC1084f2.L(-1594405776);
                        if (str2 == null || !z10) {
                            interfaceC1084f2.D();
                            return;
                        }
                        HeaderMenuItemRowKt.UnreadBadge(PaddingKt.j(aVar2, 0.0f, 4, 2, 0.0f, 9), str2, interfaceC1084f2, 0, 0);
                        interfaceC1084f2.D();
                    }
                }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(1598560935, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                        kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                        if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        Ia.a<p293xa.r> aVar2 = aVar;
                        final int i22 = i10;
                        final String str3 = str;
                        final long j10 = j;
                        IconButtonKt.b(aVar2, null, false, null, null, androidx.compose.runtime.internal.a.b(-900464534, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2.1
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                invoke(interfaceC1084f3, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f3, int i23) {
                                if ((i23 & 11) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    IconKt.a(U.c.a(i22, interfaceC1084f3, 0), str3, androidx.compose.foundation.layout.W.m(androidx.compose.ui.h.a.f13984b, 24), j10, interfaceC1084f3, 392, 0);
                                }
                            }
                        }, interfaceC1084f2), interfaceC1084f2, 196608, 30);
                    }
                }, c1086gP), c1086gP, ((i13 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 390, 0);
            } else {
                if (i20 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                BadgeKt.b(androidx.compose.runtime.internal.a.b(-415284443, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                        kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                        if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        boolean z12 = z11;
                        androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                        if (z12) {
                            interfaceC1084f2.L(-1594599123);
                            float f10 = 10;
                            BadgeKt.a(PaddingKt.j(aVar2, 0.0f, f10, f10, 0.0f, 9), Q3.d.e(4292544041L), 0L, null, interfaceC1084f2, 48, 12);
                            interfaceC1084f2.D();
                            return;
                        }
                        interfaceC1084f2.L(-1594405776);
                        if (str2 == null || !z10) {
                            interfaceC1084f2.D();
                            return;
                        }
                        HeaderMenuItemRowKt.UnreadBadge(PaddingKt.j(aVar2, 0.0f, 4, 2, 0.0f, 9), str2, interfaceC1084f2, 0, 0);
                        interfaceC1084f2.D();
                    }
                }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(1598560935, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                        kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                        if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        Ia.a<p293xa.r> aVar2 = aVar;
                        final int i22 = i10;
                        final String str3 = str;
                        final long j10 = j;
                        IconButtonKt.b(aVar2, null, false, null, null, androidx.compose.runtime.internal.a.b(-900464534, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2.1
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                invoke(interfaceC1084f3, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f3, int i23) {
                                if ((i23 & 11) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    IconKt.a(U.c.a(i22, interfaceC1084f3, 0), str3, androidx.compose.foundation.layout.W.m(androidx.compose.ui.h.a.f13984b, 24), j10, interfaceC1084f3, 392, 0);
                                }
                            }
                        }, interfaceC1084f2), interfaceC1084f2, 196608, 30);
                    }
                }, c1086gP), c1086gP, ((i13 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 390, 0);
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.s
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return HeaderMenuItemRowKt.CollapsedHeaderMenuItemRow_88mDfTA$lambda$2(hVar3, str, i10, str2, z10, z11, aVar, j, i11, i12, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i13 |= 1572864;
        if ((i12 & 128) != 0) {
            i13 |= 12582912;
        } else if ((29360128 & i11) == 0) {
            if (c1086gP.i(j)) {
                i19 = 8388608;
            } else {
                i19 = 4194304;
            }
            i13 |= i19;
        }
        if ((23967451 & i13) == 4793490) {
            if (i20 != 0) {
                hVar3 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar3 = hVar2;
            }
            BadgeKt.b(androidx.compose.runtime.internal.a.b(-415284443, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1
                @Override // Ia.q
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                    kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                    if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    boolean z12 = z11;
                    androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                    if (z12) {
                        interfaceC1084f2.L(-1594599123);
                        float f10 = 10;
                        BadgeKt.a(PaddingKt.j(aVar2, 0.0f, f10, f10, 0.0f, 9), Q3.d.e(4292544041L), 0L, null, interfaceC1084f2, 48, 12);
                        interfaceC1084f2.D();
                        return;
                    }
                    interfaceC1084f2.L(-1594405776);
                    if (str2 == null || !z10) {
                        interfaceC1084f2.D();
                        return;
                    }
                    HeaderMenuItemRowKt.UnreadBadge(PaddingKt.j(aVar2, 0.0f, 4, 2, 0.0f, 9), str2, interfaceC1084f2, 0, 0);
                    interfaceC1084f2.D();
                }
            }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(1598560935, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2
                @Override // Ia.q
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                    kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                    if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    Ia.a<p293xa.r> aVar2 = aVar;
                    final int i22 = i10;
                    final String str3 = str;
                    final long j10 = j;
                    IconButtonKt.b(aVar2, null, false, null, null, androidx.compose.runtime.internal.a.b(-900464534, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2.1
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                            invoke(interfaceC1084f3, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f3, int i23) {
                            if ((i23 & 11) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                IconKt.a(U.c.a(i22, interfaceC1084f3, 0), str3, androidx.compose.foundation.layout.W.m(androidx.compose.ui.h.a.f13984b, 24), j10, interfaceC1084f3, 392, 0);
                            }
                        }
                    }, interfaceC1084f2), interfaceC1084f2, 196608, 30);
                }
            }, c1086gP), c1086gP, ((i13 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 390, 0);
        } else {
            if (i20 != 0) {
                hVar3 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar3 = hVar2;
            }
            BadgeKt.b(androidx.compose.runtime.internal.a.b(-415284443, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$1
                @Override // Ia.q
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                    kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                    if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    boolean z12 = z11;
                    androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                    if (z12) {
                        interfaceC1084f2.L(-1594599123);
                        float f10 = 10;
                        BadgeKt.a(PaddingKt.j(aVar2, 0.0f, f10, f10, 0.0f, 9), Q3.d.e(4292544041L), 0L, null, interfaceC1084f2, 48, 12);
                        interfaceC1084f2.D();
                        return;
                    }
                    interfaceC1084f2.L(-1594405776);
                    if (str2 == null || !z10) {
                        interfaceC1084f2.D();
                        return;
                    }
                    HeaderMenuItemRowKt.UnreadBadge(PaddingKt.j(aVar2, 0.0f, 4, 2, 0.0f, 9), str2, interfaceC1084f2, 0, 0);
                    interfaceC1084f2.D();
                }
            }, c1086gP), hVar3, androidx.compose.runtime.internal.a.b(1598560935, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2
                @Override // Ia.q
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i21) {
                    kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                    if ((i21 & 81) == 16 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    Ia.a<p293xa.r> aVar2 = aVar;
                    final int i22 = i10;
                    final String str3 = str;
                    final long j10 = j;
                    IconButtonKt.b(aVar2, null, false, null, null, androidx.compose.runtime.internal.a.b(-900464534, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt$CollapsedHeaderMenuItemRow$2.1
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                            invoke(interfaceC1084f3, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f3, int i23) {
                            if ((i23 & 11) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                IconKt.a(U.c.a(i22, interfaceC1084f3, 0), str3, androidx.compose.foundation.layout.W.m(androidx.compose.ui.h.a.f13984b, 24), j10, interfaceC1084f3, 392, 0);
                            }
                        }
                    }, interfaceC1084f2), interfaceC1084f2, 196608, 30);
                }
            }, c1086gP), c1086gP, ((i13 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 390, 0);
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.s
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HeaderMenuItemRowKt.CollapsedHeaderMenuItemRow_88mDfTA$lambda$2(hVar3, str, i10, str2, z10, z11, aVar, j, i11, i12, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r CollapsedHeaderMenuItemRow_88mDfTA$lambda$2(androidx.compose.ui.h hVar, String label, int i10, String str, boolean z10, boolean z11, Ia.a onClick, long j, int i11, int i12, InterfaceC1084f interfaceC1084f, int i13) {
        kotlin.jvm.internal.i.e(label, "$label");
        kotlin.jvm.internal.i.e(onClick, "$onClick");
        m182CollapsedHeaderMenuItemRow88mDfTA(hVar, label, i10, str, z10, z11, onClick, j, interfaceC1084f, L4.b.l(i11 | 1), i12);
        return p293xa.r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0122  */
    /* JADX WARN: Code duplicated, block: B:103:0x0126  */
    /* JADX WARN: Code duplicated, block: B:106:0x0165  */
    /* JADX WARN: Code duplicated, block: B:107:0x0169  */
    /* JADX WARN: Code duplicated, block: B:110:0x017c  */
    /* JADX WARN: Code duplicated, block: B:112:0x018a  */
    /* JADX WARN: Code duplicated, block: B:115:0x019a  */
    /* JADX WARN: Code duplicated, block: B:117:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:120:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:122:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:124:0x01fe A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x0213  */
    /* JADX WARN: Code duplicated, block: B:131:0x0247  */
    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0063  */
    /* JADX WARN: Code duplicated, block: B:32:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0084  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:63:0x00af  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:68:0x00be  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:91:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:93:0x0103  */
    /* JADX WARN: Code duplicated, block: B:94:0x0105  */
    /* JADX WARN: Code duplicated, block: B:97:0x0119  */
    /* JADX WARN: Code duplicated, block: B:98:0x011b  */
    private static final void ExpandedHeaderMenuItemRow(androidx.compose.ui.h hVar, final String str, final int i10, final String str2, final boolean z10, final boolean z11, final Ia.a<p293xa.r> aVar, final boolean z12, InterfaceC1084f interfaceC1084f, final int i11, final int i12) {
        androidx.compose.ui.h hVar2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        androidx.compose.ui.h.a aVar2;
        androidx.compose.ui.h hVar3;
        boolean z13;
        Object objF;
        float f10;
        int i21;
        Ia.a<ComposeUiNode> aVar3;
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar;
        long jM645getPrimaryText0d7_KjU;
        final androidx.compose.ui.h hVar4;
        C1105p0 c1105p0V;
        C1086g c1086gP = interfaceC1084f.p(1007952458);
        int i22 = i12 & 1;
        if (i22 != 0) {
            i13 = i11 | 6;
            hVar2 = hVar;
        } else if ((i11 & 14) == 0) {
            hVar2 = hVar;
            i13 = (c1086gP.K(hVar2) ? 4 : 2) | i11;
        } else {
            hVar2 = hVar;
            i13 = i11;
        }
        if ((i12 & 2) == 0) {
            if ((i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                i13 |= c1086gP.K(str) ? 32 : 16;
            }
            if ((i12 & 4) != 0) {
                i13 |= 384;
            } else if ((i11 & 896) == 0) {
                if (c1086gP.h(i10)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i13 |= i14;
            }
            if ((i12 & 8) != 0) {
                i13 |= 3072;
            } else if ((i11 & 7168) == 0) {
                if (c1086gP.K(str2)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            if ((i12 & 16) != 0) {
                i13 |= 24576;
            } else if ((57344 & i11) == 0) {
                if (c1086gP.c(z10)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i13 |= i16;
            }
            if ((i12 & 32) != 0) {
                if ((458752 & i11) == 0) {
                    if (c1086gP.c(z11)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                }
                if ((i12 & 64) != 0) {
                    if ((i11 & 3670016) == 0) {
                        if (c1086gP.k(aVar)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                    }
                    if ((i12 & 128) != 0) {
                        if ((29360128 & i11) == 0) {
                            if (c1086gP.c(z12)) {
                                i19 = 8388608;
                            } else {
                                i19 = 4194304;
                            }
                        }
                        i20 = i13;
                        if ((i20 & 23967451) == 4793490 || !c1086gP.s()) {
                            aVar2 = androidx.compose.ui.h.a.f13984b;
                            if (i22 != 0) {
                                hVar3 = aVar2;
                            } else {
                                hVar3 = hVar2;
                            }
                            androidx.compose.ui.h hVarD = androidx.compose.foundation.layout.W.d(hVar3, 1.0f);
                            c1086gP.L(-1310322408);
                            if ((i20 & 3670016) == 1048576) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            objF = c1086gP.f();
                            if (z13 || objF == InterfaceC1084f.a.f12980a) {
                                objF = new coil.d(1, aVar);
                                c1086gP.E(objF);
                            }
                            c1086gP.T(false);
                            androidx.compose.ui.h hVarC = ClickableKt.c(hVarD, z12, null, (Ia.a) objF, 6);
                            f10 = 16;
                            androidx.compose.ui.h hVarF = PaddingKt.f(hVarC, f10);
                            androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(C0945e.f10290g, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
                            i21 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarF);
                            ComposeUiNode.f14331c0.getClass();
                            androidx.compose.ui.h hVar5 = hVar3;
                            aVar3 = ComposeUiNode.Companion.f14333b;
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar3);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA);
                            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
                            pVar = ComposeUiNode.Companion.f14338g;
                            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i21))) {
                                J4.i.d(i21, c1086gP, i21, pVar);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
                            c1086gP.L(1463394796);
                            if (z12) {
                                jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                            } else {
                                jM645getPrimaryText0d7_KjU = androidx.compose.ui.graphics.H.f13498e;
                            }
                            c1086gP.T(false);
                            TextKt.b(str, null, jM645getPrimaryText0d7_KjU, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i20 >> 3) & 14, 0, 131066);
                            if (z11) {
                                c1086gP.L(-1879265457);
                                ConversationItemKt.UnreadIndicator(PaddingKt.f(aVar2, 4), c1086gP, 6, 0);
                                c1086gP.T(false);
                            } else if (str2 == null && z10) {
                                c1086gP.L(-1878872966);
                                UnreadBadge(aVar2, str2, c1086gP, ((i20 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6, 0);
                                c1086gP.T(false);
                            } else {
                                c1086gP.L(-1879114425);
                                IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                                c1086gP.T(false);
                            }
                            c1086gP.T(true);
                            hVar4 = hVar5;
                        } else {
                            c1086gP.w();
                            hVar4 = hVar2;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.v
                                @Override // Ia.p
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return HeaderMenuItemRowKt.ExpandedHeaderMenuItemRow$lambda$6(hVar4, str, i10, str2, z10, z11, aVar, z12, i11, i12, (InterfaceC1084f) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i19 = 12582912;
                    i13 |= i19;
                    i20 = i13;
                    if ((i20 & 23967451) == 4793490) {
                        aVar2 = androidx.compose.ui.h.a.f13984b;
                        if (i22 != 0) {
                            hVar3 = aVar2;
                        } else {
                            hVar3 = hVar2;
                        }
                        androidx.compose.ui.h hVarD2 = androidx.compose.foundation.layout.W.d(hVar3, 1.0f);
                        c1086gP.L(-1310322408);
                        if ((i20 & 3670016) == 1048576) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objF = c1086gP.f();
                        if (z13) {
                            objF = new coil.d(1, aVar);
                            c1086gP.E(objF);
                        } else {
                            objF = new coil.d(1, aVar);
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        androidx.compose.ui.h hVarC3 = ClickableKt.c(hVarD2, z12, null, (Ia.a) objF, 6);
                        f10 = 16;
                        androidx.compose.ui.h hVarF2 = PaddingKt.f(hVarC3, f10);
                        androidx.compose.foundation.layout.T tA2 = androidx.compose.foundation.layout.S.a(C0945e.f10290g, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
                        i21 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
                        androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(c1086gP, hVarF2);
                        ComposeUiNode.f14331c0.getClass();
                        androidx.compose.ui.h hVar6 = hVar3;
                        aVar3 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar3);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA2);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P2);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i21, c1086gP, i21, pVar);
                        } else {
                            J4.i.d(i21, c1086gP, i21, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC4);
                        c1086gP.L(1463394796);
                        if (z12) {
                            jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                        } else {
                            jM645getPrimaryText0d7_KjU = androidx.compose.ui.graphics.H.f13498e;
                        }
                        c1086gP.T(false);
                        TextKt.b(str, null, jM645getPrimaryText0d7_KjU, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i20 >> 3) & 14, 0, 131066);
                        if (z11) {
                            c1086gP.L(-1879265457);
                            ConversationItemKt.UnreadIndicator(PaddingKt.f(aVar2, 4), c1086gP, 6, 0);
                            c1086gP.T(false);
                        } else if (str2 == null) {
                            c1086gP.L(-1879114425);
                            IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(-1879114425);
                            IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                            c1086gP.T(false);
                        }
                        c1086gP.T(true);
                        hVar4 = hVar6;
                    } else {
                        aVar2 = androidx.compose.ui.h.a.f13984b;
                        if (i22 != 0) {
                            hVar3 = aVar2;
                        } else {
                            hVar3 = hVar2;
                        }
                        androidx.compose.ui.h hVarD3 = androidx.compose.foundation.layout.W.d(hVar3, 1.0f);
                        c1086gP.L(-1310322408);
                        if ((i20 & 3670016) == 1048576) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objF = c1086gP.f();
                        if (z13) {
                            objF = new coil.d(1, aVar);
                            c1086gP.E(objF);
                        } else {
                            objF = new coil.d(1, aVar);
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        androidx.compose.ui.h hVarC5 = ClickableKt.c(hVarD3, z12, null, (Ia.a) objF, 6);
                        f10 = 16;
                        androidx.compose.ui.h hVarF3 = PaddingKt.f(hVarC5, f10);
                        androidx.compose.foundation.layout.T tA3 = androidx.compose.foundation.layout.S.a(C0945e.f10290g, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
                        i21 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
                        androidx.compose.ui.h hVarC6 = ComposedModifierKt.c(c1086gP, hVarF3);
                        ComposeUiNode.f14331c0.getClass();
                        androidx.compose.ui.h hVar7 = hVar3;
                        aVar3 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar3);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA3);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P3);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i21, c1086gP, i21, pVar);
                        } else {
                            J4.i.d(i21, c1086gP, i21, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC6);
                        c1086gP.L(1463394796);
                        if (z12) {
                            jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                        } else {
                            jM645getPrimaryText0d7_KjU = androidx.compose.ui.graphics.H.f13498e;
                        }
                        c1086gP.T(false);
                        TextKt.b(str, null, jM645getPrimaryText0d7_KjU, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i20 >> 3) & 14, 0, 131066);
                        if (z11) {
                            c1086gP.L(-1879265457);
                            ConversationItemKt.UnreadIndicator(PaddingKt.f(aVar2, 4), c1086gP, 6, 0);
                            c1086gP.T(false);
                        } else if (str2 == null) {
                            c1086gP.L(-1879114425);
                            IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(-1879114425);
                            IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                            c1086gP.T(false);
                        }
                        c1086gP.T(true);
                        hVar4 = hVar7;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.v
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return HeaderMenuItemRowKt.ExpandedHeaderMenuItemRow$lambda$6(hVar4, str, i10, str2, z10, z11, aVar, z12, i11, i12, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                    }
                }
                i18 = 1572864;
                i13 |= i18;
                if ((i12 & 128) != 0) {
                    if ((29360128 & i11) == 0) {
                        if (c1086gP.c(z12)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                    }
                    i20 = i13;
                    if ((i20 & 23967451) == 4793490) {
                        aVar2 = androidx.compose.ui.h.a.f13984b;
                        if (i22 != 0) {
                            hVar3 = aVar2;
                        } else {
                            hVar3 = hVar2;
                        }
                        androidx.compose.ui.h hVarD4 = androidx.compose.foundation.layout.W.d(hVar3, 1.0f);
                        c1086gP.L(-1310322408);
                        if ((i20 & 3670016) == 1048576) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objF = c1086gP.f();
                        if (z13) {
                            objF = new coil.d(1, aVar);
                            c1086gP.E(objF);
                        } else {
                            objF = new coil.d(1, aVar);
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        androidx.compose.ui.h hVarC7 = ClickableKt.c(hVarD4, z12, null, (Ia.a) objF, 6);
                        f10 = 16;
                        androidx.compose.ui.h hVarF4 = PaddingKt.f(hVarC7, f10);
                        androidx.compose.foundation.layout.T tA4 = androidx.compose.foundation.layout.S.a(C0945e.f10290g, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
                        i21 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P4 = c1086gP.P();
                        androidx.compose.ui.h hVarC8 = ComposedModifierKt.c(c1086gP, hVarF4);
                        ComposeUiNode.f14331c0.getClass();
                        androidx.compose.ui.h hVar8 = hVar3;
                        aVar3 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar3);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA4);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P4);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i21, c1086gP, i21, pVar);
                        } else {
                            J4.i.d(i21, c1086gP, i21, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC8);
                        c1086gP.L(1463394796);
                        if (z12) {
                            jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                        } else {
                            jM645getPrimaryText0d7_KjU = androidx.compose.ui.graphics.H.f13498e;
                        }
                        c1086gP.T(false);
                        TextKt.b(str, null, jM645getPrimaryText0d7_KjU, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i20 >> 3) & 14, 0, 131066);
                        if (z11) {
                            c1086gP.L(-1879265457);
                            ConversationItemKt.UnreadIndicator(PaddingKt.f(aVar2, 4), c1086gP, 6, 0);
                            c1086gP.T(false);
                        } else if (str2 == null) {
                            c1086gP.L(-1879114425);
                            IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(-1879114425);
                            IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                            c1086gP.T(false);
                        }
                        c1086gP.T(true);
                        hVar4 = hVar8;
                    } else {
                        aVar2 = androidx.compose.ui.h.a.f13984b;
                        if (i22 != 0) {
                            hVar3 = aVar2;
                        } else {
                            hVar3 = hVar2;
                        }
                        androidx.compose.ui.h hVarD5 = androidx.compose.foundation.layout.W.d(hVar3, 1.0f);
                        c1086gP.L(-1310322408);
                        if ((i20 & 3670016) == 1048576) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objF = c1086gP.f();
                        if (z13) {
                            objF = new coil.d(1, aVar);
                            c1086gP.E(objF);
                        } else {
                            objF = new coil.d(1, aVar);
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        androidx.compose.ui.h hVarC9 = ClickableKt.c(hVarD5, z12, null, (Ia.a) objF, 6);
                        f10 = 16;
                        androidx.compose.ui.h hVarF5 = PaddingKt.f(hVarC9, f10);
                        androidx.compose.foundation.layout.T tA5 = androidx.compose.foundation.layout.S.a(C0945e.f10290g, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
                        i21 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P5 = c1086gP.P();
                        androidx.compose.ui.h hVarC10 = ComposedModifierKt.c(c1086gP, hVarF5);
                        ComposeUiNode.f14331c0.getClass();
                        androidx.compose.ui.h hVar9 = hVar3;
                        aVar3 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar3);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA5);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P5);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i21, c1086gP, i21, pVar);
                        } else {
                            J4.i.d(i21, c1086gP, i21, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC10);
                        c1086gP.L(1463394796);
                        if (z12) {
                            jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                        } else {
                            jM645getPrimaryText0d7_KjU = androidx.compose.ui.graphics.H.f13498e;
                        }
                        c1086gP.T(false);
                        TextKt.b(str, null, jM645getPrimaryText0d7_KjU, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i20 >> 3) & 14, 0, 131066);
                        if (z11) {
                            c1086gP.L(-1879265457);
                            ConversationItemKt.UnreadIndicator(PaddingKt.f(aVar2, 4), c1086gP, 6, 0);
                            c1086gP.T(false);
                        } else if (str2 == null) {
                            c1086gP.L(-1879114425);
                            IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(-1879114425);
                            IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                            c1086gP.T(false);
                        }
                        c1086gP.T(true);
                        hVar4 = hVar9;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.v
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return HeaderMenuItemRowKt.ExpandedHeaderMenuItemRow$lambda$6(hVar4, str, i10, str2, z10, z11, aVar, z12, i11, i12, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                    }
                }
                i19 = 12582912;
                i13 |= i19;
                i20 = i13;
                if ((i20 & 23967451) == 4793490) {
                    aVar2 = androidx.compose.ui.h.a.f13984b;
                    if (i22 != 0) {
                        hVar3 = aVar2;
                    } else {
                        hVar3 = hVar2;
                    }
                    androidx.compose.ui.h hVarD6 = androidx.compose.foundation.layout.W.d(hVar3, 1.0f);
                    c1086gP.L(-1310322408);
                    if ((i20 & 3670016) == 1048576) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objF = c1086gP.f();
                    if (z13) {
                        objF = new coil.d(1, aVar);
                        c1086gP.E(objF);
                    } else {
                        objF = new coil.d(1, aVar);
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    androidx.compose.ui.h hVarC11 = ClickableKt.c(hVarD6, z12, null, (Ia.a) objF, 6);
                    f10 = 16;
                    androidx.compose.ui.h hVarF6 = PaddingKt.f(hVarC11, f10);
                    androidx.compose.foundation.layout.T tA6 = androidx.compose.foundation.layout.S.a(C0945e.f10290g, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
                    i21 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P6 = c1086gP.P();
                    androidx.compose.ui.h hVarC12 = ComposedModifierKt.c(c1086gP, hVarF6);
                    ComposeUiNode.f14331c0.getClass();
                    androidx.compose.ui.h hVar10 = hVar3;
                    aVar3 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA6);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P6);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i21, c1086gP, i21, pVar);
                    } else {
                        J4.i.d(i21, c1086gP, i21, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC12);
                    c1086gP.L(1463394796);
                    if (z12) {
                        jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                    } else {
                        jM645getPrimaryText0d7_KjU = androidx.compose.ui.graphics.H.f13498e;
                    }
                    c1086gP.T(false);
                    TextKt.b(str, null, jM645getPrimaryText0d7_KjU, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i20 >> 3) & 14, 0, 131066);
                    if (z11) {
                        c1086gP.L(-1879265457);
                        ConversationItemKt.UnreadIndicator(PaddingKt.f(aVar2, 4), c1086gP, 6, 0);
                        c1086gP.T(false);
                    } else if (str2 == null) {
                        c1086gP.L(-1879114425);
                        IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(-1879114425);
                        IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                        c1086gP.T(false);
                    }
                    c1086gP.T(true);
                    hVar4 = hVar10;
                } else {
                    aVar2 = androidx.compose.ui.h.a.f13984b;
                    if (i22 != 0) {
                        hVar3 = aVar2;
                    } else {
                        hVar3 = hVar2;
                    }
                    androidx.compose.ui.h hVarD7 = androidx.compose.foundation.layout.W.d(hVar3, 1.0f);
                    c1086gP.L(-1310322408);
                    if ((i20 & 3670016) == 1048576) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objF = c1086gP.f();
                    if (z13) {
                        objF = new coil.d(1, aVar);
                        c1086gP.E(objF);
                    } else {
                        objF = new coil.d(1, aVar);
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    androidx.compose.ui.h hVarC13 = ClickableKt.c(hVarD7, z12, null, (Ia.a) objF, 6);
                    f10 = 16;
                    androidx.compose.ui.h hVarF7 = PaddingKt.f(hVarC13, f10);
                    androidx.compose.foundation.layout.T tA7 = androidx.compose.foundation.layout.S.a(C0945e.f10290g, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
                    i21 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P7 = c1086gP.P();
                    androidx.compose.ui.h hVarC14 = ComposedModifierKt.c(c1086gP, hVarF7);
                    ComposeUiNode.f14331c0.getClass();
                    androidx.compose.ui.h hVar11 = hVar3;
                    aVar3 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA7);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P7);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i21, c1086gP, i21, pVar);
                    } else {
                        J4.i.d(i21, c1086gP, i21, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC14);
                    c1086gP.L(1463394796);
                    if (z12) {
                        jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                    } else {
                        jM645getPrimaryText0d7_KjU = androidx.compose.ui.graphics.H.f13498e;
                    }
                    c1086gP.T(false);
                    TextKt.b(str, null, jM645getPrimaryText0d7_KjU, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i20 >> 3) & 14, 0, 131066);
                    if (z11) {
                        c1086gP.L(-1879265457);
                        ConversationItemKt.UnreadIndicator(PaddingKt.f(aVar2, 4), c1086gP, 6, 0);
                        c1086gP.T(false);
                    } else if (str2 == null) {
                        c1086gP.L(-1879114425);
                        IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(-1879114425);
                        IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                        c1086gP.T(false);
                    }
                    c1086gP.T(true);
                    hVar4 = hVar11;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.v
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return HeaderMenuItemRowKt.ExpandedHeaderMenuItemRow$lambda$6(hVar4, str, i10, str2, z10, z11, aVar, z12, i11, i12, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i17 = 196608;
            i13 |= i17;
            if ((i12 & 64) != 0) {
                if ((i11 & 3670016) == 0) {
                    if (c1086gP.k(aVar)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                }
                if ((i12 & 128) != 0) {
                    if ((29360128 & i11) == 0) {
                        if (c1086gP.c(z12)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                    }
                    i20 = i13;
                    if ((i20 & 23967451) == 4793490) {
                        aVar2 = androidx.compose.ui.h.a.f13984b;
                        if (i22 != 0) {
                            hVar3 = aVar2;
                        } else {
                            hVar3 = hVar2;
                        }
                        androidx.compose.ui.h hVarD8 = androidx.compose.foundation.layout.W.d(hVar3, 1.0f);
                        c1086gP.L(-1310322408);
                        if ((i20 & 3670016) == 1048576) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objF = c1086gP.f();
                        if (z13) {
                            objF = new coil.d(1, aVar);
                            c1086gP.E(objF);
                        } else {
                            objF = new coil.d(1, aVar);
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        androidx.compose.ui.h hVarC15 = ClickableKt.c(hVarD8, z12, null, (Ia.a) objF, 6);
                        f10 = 16;
                        androidx.compose.ui.h hVarF8 = PaddingKt.f(hVarC15, f10);
                        androidx.compose.foundation.layout.T tA8 = androidx.compose.foundation.layout.S.a(C0945e.f10290g, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
                        i21 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P8 = c1086gP.P();
                        androidx.compose.ui.h hVarC16 = ComposedModifierKt.c(c1086gP, hVarF8);
                        ComposeUiNode.f14331c0.getClass();
                        androidx.compose.ui.h hVar12 = hVar3;
                        aVar3 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar3);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA8);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P8);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i21, c1086gP, i21, pVar);
                        } else {
                            J4.i.d(i21, c1086gP, i21, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC16);
                        c1086gP.L(1463394796);
                        if (z12) {
                            jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                        } else {
                            jM645getPrimaryText0d7_KjU = androidx.compose.ui.graphics.H.f13498e;
                        }
                        c1086gP.T(false);
                        TextKt.b(str, null, jM645getPrimaryText0d7_KjU, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i20 >> 3) & 14, 0, 131066);
                        if (z11) {
                            c1086gP.L(-1879265457);
                            ConversationItemKt.UnreadIndicator(PaddingKt.f(aVar2, 4), c1086gP, 6, 0);
                            c1086gP.T(false);
                        } else if (str2 == null) {
                            c1086gP.L(-1879114425);
                            IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(-1879114425);
                            IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                            c1086gP.T(false);
                        }
                        c1086gP.T(true);
                        hVar4 = hVar12;
                    } else {
                        aVar2 = androidx.compose.ui.h.a.f13984b;
                        if (i22 != 0) {
                            hVar3 = aVar2;
                        } else {
                            hVar3 = hVar2;
                        }
                        androidx.compose.ui.h hVarD9 = androidx.compose.foundation.layout.W.d(hVar3, 1.0f);
                        c1086gP.L(-1310322408);
                        if ((i20 & 3670016) == 1048576) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objF = c1086gP.f();
                        if (z13) {
                            objF = new coil.d(1, aVar);
                            c1086gP.E(objF);
                        } else {
                            objF = new coil.d(1, aVar);
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        androidx.compose.ui.h hVarC17 = ClickableKt.c(hVarD9, z12, null, (Ia.a) objF, 6);
                        f10 = 16;
                        androidx.compose.ui.h hVarF9 = PaddingKt.f(hVarC17, f10);
                        androidx.compose.foundation.layout.T tA9 = androidx.compose.foundation.layout.S.a(C0945e.f10290g, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
                        i21 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P9 = c1086gP.P();
                        androidx.compose.ui.h hVarC18 = ComposedModifierKt.c(c1086gP, hVarF9);
                        ComposeUiNode.f14331c0.getClass();
                        androidx.compose.ui.h hVar13 = hVar3;
                        aVar3 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar3);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA9);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P9);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i21, c1086gP, i21, pVar);
                        } else {
                            J4.i.d(i21, c1086gP, i21, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC18);
                        c1086gP.L(1463394796);
                        if (z12) {
                            jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                        } else {
                            jM645getPrimaryText0d7_KjU = androidx.compose.ui.graphics.H.f13498e;
                        }
                        c1086gP.T(false);
                        TextKt.b(str, null, jM645getPrimaryText0d7_KjU, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i20 >> 3) & 14, 0, 131066);
                        if (z11) {
                            c1086gP.L(-1879265457);
                            ConversationItemKt.UnreadIndicator(PaddingKt.f(aVar2, 4), c1086gP, 6, 0);
                            c1086gP.T(false);
                        } else if (str2 == null) {
                            c1086gP.L(-1879114425);
                            IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(-1879114425);
                            IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                            c1086gP.T(false);
                        }
                        c1086gP.T(true);
                        hVar4 = hVar13;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.v
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return HeaderMenuItemRowKt.ExpandedHeaderMenuItemRow$lambda$6(hVar4, str, i10, str2, z10, z11, aVar, z12, i11, i12, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                    }
                }
                i19 = 12582912;
                i13 |= i19;
                i20 = i13;
                if ((i20 & 23967451) == 4793490) {
                    aVar2 = androidx.compose.ui.h.a.f13984b;
                    if (i22 != 0) {
                        hVar3 = aVar2;
                    } else {
                        hVar3 = hVar2;
                    }
                    androidx.compose.ui.h hVarD10 = androidx.compose.foundation.layout.W.d(hVar3, 1.0f);
                    c1086gP.L(-1310322408);
                    if ((i20 & 3670016) == 1048576) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objF = c1086gP.f();
                    if (z13) {
                        objF = new coil.d(1, aVar);
                        c1086gP.E(objF);
                    } else {
                        objF = new coil.d(1, aVar);
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    androidx.compose.ui.h hVarC19 = ClickableKt.c(hVarD10, z12, null, (Ia.a) objF, 6);
                    f10 = 16;
                    androidx.compose.ui.h hVarF10 = PaddingKt.f(hVarC19, f10);
                    androidx.compose.foundation.layout.T tA10 = androidx.compose.foundation.layout.S.a(C0945e.f10290g, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
                    i21 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P10 = c1086gP.P();
                    androidx.compose.ui.h hVarC110 = ComposedModifierKt.c(c1086gP, hVarF10);
                    ComposeUiNode.f14331c0.getClass();
                    androidx.compose.ui.h hVar14 = hVar3;
                    aVar3 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA10);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P10);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i21, c1086gP, i21, pVar);
                    } else {
                        J4.i.d(i21, c1086gP, i21, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC110);
                    c1086gP.L(1463394796);
                    if (z12) {
                        jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                    } else {
                        jM645getPrimaryText0d7_KjU = androidx.compose.ui.graphics.H.f13498e;
                    }
                    c1086gP.T(false);
                    TextKt.b(str, null, jM645getPrimaryText0d7_KjU, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i20 >> 3) & 14, 0, 131066);
                    if (z11) {
                        c1086gP.L(-1879265457);
                        ConversationItemKt.UnreadIndicator(PaddingKt.f(aVar2, 4), c1086gP, 6, 0);
                        c1086gP.T(false);
                    } else if (str2 == null) {
                        c1086gP.L(-1879114425);
                        IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(-1879114425);
                        IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                        c1086gP.T(false);
                    }
                    c1086gP.T(true);
                    hVar4 = hVar14;
                } else {
                    aVar2 = androidx.compose.ui.h.a.f13984b;
                    if (i22 != 0) {
                        hVar3 = aVar2;
                    } else {
                        hVar3 = hVar2;
                    }
                    androidx.compose.ui.h hVarD11 = androidx.compose.foundation.layout.W.d(hVar3, 1.0f);
                    c1086gP.L(-1310322408);
                    if ((i20 & 3670016) == 1048576) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objF = c1086gP.f();
                    if (z13) {
                        objF = new coil.d(1, aVar);
                        c1086gP.E(objF);
                    } else {
                        objF = new coil.d(1, aVar);
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    androidx.compose.ui.h hVarC111 = ClickableKt.c(hVarD11, z12, null, (Ia.a) objF, 6);
                    f10 = 16;
                    androidx.compose.ui.h hVarF11 = PaddingKt.f(hVarC111, f10);
                    androidx.compose.foundation.layout.T tA11 = androidx.compose.foundation.layout.S.a(C0945e.f10290g, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
                    i21 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P11 = c1086gP.P();
                    androidx.compose.ui.h hVarC112 = ComposedModifierKt.c(c1086gP, hVarF11);
                    ComposeUiNode.f14331c0.getClass();
                    androidx.compose.ui.h hVar15 = hVar3;
                    aVar3 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA11);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P11);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i21, c1086gP, i21, pVar);
                    } else {
                        J4.i.d(i21, c1086gP, i21, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC112);
                    c1086gP.L(1463394796);
                    if (z12) {
                        jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                    } else {
                        jM645getPrimaryText0d7_KjU = androidx.compose.ui.graphics.H.f13498e;
                    }
                    c1086gP.T(false);
                    TextKt.b(str, null, jM645getPrimaryText0d7_KjU, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i20 >> 3) & 14, 0, 131066);
                    if (z11) {
                        c1086gP.L(-1879265457);
                        ConversationItemKt.UnreadIndicator(PaddingKt.f(aVar2, 4), c1086gP, 6, 0);
                        c1086gP.T(false);
                    } else if (str2 == null) {
                        c1086gP.L(-1879114425);
                        IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(-1879114425);
                        IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                        c1086gP.T(false);
                    }
                    c1086gP.T(true);
                    hVar4 = hVar15;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.v
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return HeaderMenuItemRowKt.ExpandedHeaderMenuItemRow$lambda$6(hVar4, str, i10, str2, z10, z11, aVar, z12, i11, i12, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i18 = 1572864;
            i13 |= i18;
            if ((i12 & 128) != 0) {
                if ((29360128 & i11) == 0) {
                    if (c1086gP.c(z12)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                }
                i20 = i13;
                if ((i20 & 23967451) == 4793490) {
                    aVar2 = androidx.compose.ui.h.a.f13984b;
                    if (i22 != 0) {
                        hVar3 = aVar2;
                    } else {
                        hVar3 = hVar2;
                    }
                    androidx.compose.ui.h hVarD12 = androidx.compose.foundation.layout.W.d(hVar3, 1.0f);
                    c1086gP.L(-1310322408);
                    if ((i20 & 3670016) == 1048576) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objF = c1086gP.f();
                    if (z13) {
                        objF = new coil.d(1, aVar);
                        c1086gP.E(objF);
                    } else {
                        objF = new coil.d(1, aVar);
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    androidx.compose.ui.h hVarC113 = ClickableKt.c(hVarD12, z12, null, (Ia.a) objF, 6);
                    f10 = 16;
                    androidx.compose.ui.h hVarF12 = PaddingKt.f(hVarC113, f10);
                    androidx.compose.foundation.layout.T tA12 = androidx.compose.foundation.layout.S.a(C0945e.f10290g, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
                    i21 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P12 = c1086gP.P();
                    androidx.compose.ui.h hVarC114 = ComposedModifierKt.c(c1086gP, hVarF12);
                    ComposeUiNode.f14331c0.getClass();
                    androidx.compose.ui.h hVar16 = hVar3;
                    aVar3 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA12);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P12);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i21, c1086gP, i21, pVar);
                    } else {
                        J4.i.d(i21, c1086gP, i21, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC114);
                    c1086gP.L(1463394796);
                    if (z12) {
                        jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                    } else {
                        jM645getPrimaryText0d7_KjU = androidx.compose.ui.graphics.H.f13498e;
                    }
                    c1086gP.T(false);
                    TextKt.b(str, null, jM645getPrimaryText0d7_KjU, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i20 >> 3) & 14, 0, 131066);
                    if (z11) {
                        c1086gP.L(-1879265457);
                        ConversationItemKt.UnreadIndicator(PaddingKt.f(aVar2, 4), c1086gP, 6, 0);
                        c1086gP.T(false);
                    } else if (str2 == null) {
                        c1086gP.L(-1879114425);
                        IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(-1879114425);
                        IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                        c1086gP.T(false);
                    }
                    c1086gP.T(true);
                    hVar4 = hVar16;
                } else {
                    aVar2 = androidx.compose.ui.h.a.f13984b;
                    if (i22 != 0) {
                        hVar3 = aVar2;
                    } else {
                        hVar3 = hVar2;
                    }
                    androidx.compose.ui.h hVarD13 = androidx.compose.foundation.layout.W.d(hVar3, 1.0f);
                    c1086gP.L(-1310322408);
                    if ((i20 & 3670016) == 1048576) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objF = c1086gP.f();
                    if (z13) {
                        objF = new coil.d(1, aVar);
                        c1086gP.E(objF);
                    } else {
                        objF = new coil.d(1, aVar);
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    androidx.compose.ui.h hVarC115 = ClickableKt.c(hVarD13, z12, null, (Ia.a) objF, 6);
                    f10 = 16;
                    androidx.compose.ui.h hVarF13 = PaddingKt.f(hVarC115, f10);
                    androidx.compose.foundation.layout.T tA13 = androidx.compose.foundation.layout.S.a(C0945e.f10290g, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
                    i21 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P13 = c1086gP.P();
                    androidx.compose.ui.h hVarC116 = ComposedModifierKt.c(c1086gP, hVarF13);
                    ComposeUiNode.f14331c0.getClass();
                    androidx.compose.ui.h hVar17 = hVar3;
                    aVar3 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA13);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P13);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i21, c1086gP, i21, pVar);
                    } else {
                        J4.i.d(i21, c1086gP, i21, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC116);
                    c1086gP.L(1463394796);
                    if (z12) {
                        jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                    } else {
                        jM645getPrimaryText0d7_KjU = androidx.compose.ui.graphics.H.f13498e;
                    }
                    c1086gP.T(false);
                    TextKt.b(str, null, jM645getPrimaryText0d7_KjU, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i20 >> 3) & 14, 0, 131066);
                    if (z11) {
                        c1086gP.L(-1879265457);
                        ConversationItemKt.UnreadIndicator(PaddingKt.f(aVar2, 4), c1086gP, 6, 0);
                        c1086gP.T(false);
                    } else if (str2 == null) {
                        c1086gP.L(-1879114425);
                        IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(-1879114425);
                        IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                        c1086gP.T(false);
                    }
                    c1086gP.T(true);
                    hVar4 = hVar17;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.v
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return HeaderMenuItemRowKt.ExpandedHeaderMenuItemRow$lambda$6(hVar4, str, i10, str2, z10, z11, aVar, z12, i11, i12, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i19 = 12582912;
            i13 |= i19;
            i20 = i13;
            if ((i20 & 23967451) == 4793490) {
                aVar2 = androidx.compose.ui.h.a.f13984b;
                if (i22 != 0) {
                    hVar3 = aVar2;
                } else {
                    hVar3 = hVar2;
                }
                androidx.compose.ui.h hVarD14 = androidx.compose.foundation.layout.W.d(hVar3, 1.0f);
                c1086gP.L(-1310322408);
                if ((i20 & 3670016) == 1048576) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objF = c1086gP.f();
                if (z13) {
                    objF = new coil.d(1, aVar);
                    c1086gP.E(objF);
                } else {
                    objF = new coil.d(1, aVar);
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                androidx.compose.ui.h hVarC117 = ClickableKt.c(hVarD14, z12, null, (Ia.a) objF, 6);
                f10 = 16;
                androidx.compose.ui.h hVarF14 = PaddingKt.f(hVarC117, f10);
                androidx.compose.foundation.layout.T tA14 = androidx.compose.foundation.layout.S.a(C0945e.f10290g, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
                i21 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P14 = c1086gP.P();
                androidx.compose.ui.h hVarC118 = ComposedModifierKt.c(c1086gP, hVarF14);
                ComposeUiNode.f14331c0.getClass();
                androidx.compose.ui.h hVar18 = hVar3;
                aVar3 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar3);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA14);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P14);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i21, c1086gP, i21, pVar);
                } else {
                    J4.i.d(i21, c1086gP, i21, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC118);
                c1086gP.L(1463394796);
                if (z12) {
                    jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                } else {
                    jM645getPrimaryText0d7_KjU = androidx.compose.ui.graphics.H.f13498e;
                }
                c1086gP.T(false);
                TextKt.b(str, null, jM645getPrimaryText0d7_KjU, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i20 >> 3) & 14, 0, 131066);
                if (z11) {
                    c1086gP.L(-1879265457);
                    ConversationItemKt.UnreadIndicator(PaddingKt.f(aVar2, 4), c1086gP, 6, 0);
                    c1086gP.T(false);
                } else if (str2 == null) {
                    c1086gP.L(-1879114425);
                    IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                    c1086gP.T(false);
                } else {
                    c1086gP.L(-1879114425);
                    IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                    c1086gP.T(false);
                }
                c1086gP.T(true);
                hVar4 = hVar18;
            } else {
                aVar2 = androidx.compose.ui.h.a.f13984b;
                if (i22 != 0) {
                    hVar3 = aVar2;
                } else {
                    hVar3 = hVar2;
                }
                androidx.compose.ui.h hVarD15 = androidx.compose.foundation.layout.W.d(hVar3, 1.0f);
                c1086gP.L(-1310322408);
                if ((i20 & 3670016) == 1048576) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objF = c1086gP.f();
                if (z13) {
                    objF = new coil.d(1, aVar);
                    c1086gP.E(objF);
                } else {
                    objF = new coil.d(1, aVar);
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                androidx.compose.ui.h hVarC119 = ClickableKt.c(hVarD15, z12, null, (Ia.a) objF, 6);
                f10 = 16;
                androidx.compose.ui.h hVarF15 = PaddingKt.f(hVarC119, f10);
                androidx.compose.foundation.layout.T tA15 = androidx.compose.foundation.layout.S.a(C0945e.f10290g, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
                i21 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P15 = c1086gP.P();
                androidx.compose.ui.h hVarC1110 = ComposedModifierKt.c(c1086gP, hVarF15);
                ComposeUiNode.f14331c0.getClass();
                androidx.compose.ui.h hVar19 = hVar3;
                aVar3 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar3);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA15);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P15);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i21, c1086gP, i21, pVar);
                } else {
                    J4.i.d(i21, c1086gP, i21, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC1110);
                c1086gP.L(1463394796);
                if (z12) {
                    jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                } else {
                    jM645getPrimaryText0d7_KjU = androidx.compose.ui.graphics.H.f13498e;
                }
                c1086gP.T(false);
                TextKt.b(str, null, jM645getPrimaryText0d7_KjU, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i20 >> 3) & 14, 0, 131066);
                if (z11) {
                    c1086gP.L(-1879265457);
                    ConversationItemKt.UnreadIndicator(PaddingKt.f(aVar2, 4), c1086gP, 6, 0);
                    c1086gP.T(false);
                } else if (str2 == null) {
                    c1086gP.L(-1879114425);
                    IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                    c1086gP.T(false);
                } else {
                    c1086gP.L(-1879114425);
                    IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                    c1086gP.T(false);
                }
                c1086gP.T(true);
                hVar4 = hVar19;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.v
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return HeaderMenuItemRowKt.ExpandedHeaderMenuItemRow$lambda$6(hVar4, str, i10, str2, z10, z11, aVar, z12, i11, i12, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i13 |= 48;
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 896) == 0) {
            if (c1086gP.h(i10)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i13 |= i14;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 7168) == 0) {
            if (c1086gP.K(str2)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i13 |= i15;
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((57344 & i11) == 0) {
            if (c1086gP.c(z10)) {
                i16 = 16384;
            } else {
                i16 = 8192;
            }
            i13 |= i16;
        }
        if ((i12 & 32) != 0) {
            if ((458752 & i11) == 0) {
                if (c1086gP.c(z11)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
            }
            if ((i12 & 64) != 0) {
                if ((i11 & 3670016) == 0) {
                    if (c1086gP.k(aVar)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                }
                if ((i12 & 128) != 0) {
                    if ((29360128 & i11) == 0) {
                        if (c1086gP.c(z12)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                    }
                    i20 = i13;
                    if ((i20 & 23967451) == 4793490) {
                        aVar2 = androidx.compose.ui.h.a.f13984b;
                        if (i22 != 0) {
                            hVar3 = aVar2;
                        } else {
                            hVar3 = hVar2;
                        }
                        androidx.compose.ui.h hVarD16 = androidx.compose.foundation.layout.W.d(hVar3, 1.0f);
                        c1086gP.L(-1310322408);
                        if ((i20 & 3670016) == 1048576) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objF = c1086gP.f();
                        if (z13) {
                            objF = new coil.d(1, aVar);
                            c1086gP.E(objF);
                        } else {
                            objF = new coil.d(1, aVar);
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        androidx.compose.ui.h hVarC1111 = ClickableKt.c(hVarD16, z12, null, (Ia.a) objF, 6);
                        f10 = 16;
                        androidx.compose.ui.h hVarF16 = PaddingKt.f(hVarC1111, f10);
                        androidx.compose.foundation.layout.T tA16 = androidx.compose.foundation.layout.S.a(C0945e.f10290g, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
                        i21 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P16 = c1086gP.P();
                        androidx.compose.ui.h hVarC1112 = ComposedModifierKt.c(c1086gP, hVarF16);
                        ComposeUiNode.f14331c0.getClass();
                        androidx.compose.ui.h hVar110 = hVar3;
                        aVar3 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar3);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA16);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P16);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i21, c1086gP, i21, pVar);
                        } else {
                            J4.i.d(i21, c1086gP, i21, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC1112);
                        c1086gP.L(1463394796);
                        if (z12) {
                            jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                        } else {
                            jM645getPrimaryText0d7_KjU = androidx.compose.ui.graphics.H.f13498e;
                        }
                        c1086gP.T(false);
                        TextKt.b(str, null, jM645getPrimaryText0d7_KjU, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i20 >> 3) & 14, 0, 131066);
                        if (z11) {
                            c1086gP.L(-1879265457);
                            ConversationItemKt.UnreadIndicator(PaddingKt.f(aVar2, 4), c1086gP, 6, 0);
                            c1086gP.T(false);
                        } else if (str2 == null) {
                            c1086gP.L(-1879114425);
                            IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(-1879114425);
                            IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                            c1086gP.T(false);
                        }
                        c1086gP.T(true);
                        hVar4 = hVar110;
                    } else {
                        aVar2 = androidx.compose.ui.h.a.f13984b;
                        if (i22 != 0) {
                            hVar3 = aVar2;
                        } else {
                            hVar3 = hVar2;
                        }
                        androidx.compose.ui.h hVarD17 = androidx.compose.foundation.layout.W.d(hVar3, 1.0f);
                        c1086gP.L(-1310322408);
                        if ((i20 & 3670016) == 1048576) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objF = c1086gP.f();
                        if (z13) {
                            objF = new coil.d(1, aVar);
                            c1086gP.E(objF);
                        } else {
                            objF = new coil.d(1, aVar);
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        androidx.compose.ui.h hVarC1113 = ClickableKt.c(hVarD17, z12, null, (Ia.a) objF, 6);
                        f10 = 16;
                        androidx.compose.ui.h hVarF17 = PaddingKt.f(hVarC1113, f10);
                        androidx.compose.foundation.layout.T tA17 = androidx.compose.foundation.layout.S.a(C0945e.f10290g, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
                        i21 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P17 = c1086gP.P();
                        androidx.compose.ui.h hVarC1114 = ComposedModifierKt.c(c1086gP, hVarF17);
                        ComposeUiNode.f14331c0.getClass();
                        androidx.compose.ui.h hVar111 = hVar3;
                        aVar3 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar3);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA17);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P17);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i21, c1086gP, i21, pVar);
                        } else {
                            J4.i.d(i21, c1086gP, i21, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC1114);
                        c1086gP.L(1463394796);
                        if (z12) {
                            jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                        } else {
                            jM645getPrimaryText0d7_KjU = androidx.compose.ui.graphics.H.f13498e;
                        }
                        c1086gP.T(false);
                        TextKt.b(str, null, jM645getPrimaryText0d7_KjU, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i20 >> 3) & 14, 0, 131066);
                        if (z11) {
                            c1086gP.L(-1879265457);
                            ConversationItemKt.UnreadIndicator(PaddingKt.f(aVar2, 4), c1086gP, 6, 0);
                            c1086gP.T(false);
                        } else if (str2 == null) {
                            c1086gP.L(-1879114425);
                            IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(-1879114425);
                            IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                            c1086gP.T(false);
                        }
                        c1086gP.T(true);
                        hVar4 = hVar111;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.v
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return HeaderMenuItemRowKt.ExpandedHeaderMenuItemRow$lambda$6(hVar4, str, i10, str2, z10, z11, aVar, z12, i11, i12, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                    }
                }
                i19 = 12582912;
                i13 |= i19;
                i20 = i13;
                if ((i20 & 23967451) == 4793490) {
                    aVar2 = androidx.compose.ui.h.a.f13984b;
                    if (i22 != 0) {
                        hVar3 = aVar2;
                    } else {
                        hVar3 = hVar2;
                    }
                    androidx.compose.ui.h hVarD18 = androidx.compose.foundation.layout.W.d(hVar3, 1.0f);
                    c1086gP.L(-1310322408);
                    if ((i20 & 3670016) == 1048576) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objF = c1086gP.f();
                    if (z13) {
                        objF = new coil.d(1, aVar);
                        c1086gP.E(objF);
                    } else {
                        objF = new coil.d(1, aVar);
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    androidx.compose.ui.h hVarC1115 = ClickableKt.c(hVarD18, z12, null, (Ia.a) objF, 6);
                    f10 = 16;
                    androidx.compose.ui.h hVarF18 = PaddingKt.f(hVarC1115, f10);
                    androidx.compose.foundation.layout.T tA18 = androidx.compose.foundation.layout.S.a(C0945e.f10290g, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
                    i21 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P18 = c1086gP.P();
                    androidx.compose.ui.h hVarC1116 = ComposedModifierKt.c(c1086gP, hVarF18);
                    ComposeUiNode.f14331c0.getClass();
                    androidx.compose.ui.h hVar112 = hVar3;
                    aVar3 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA18);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P18);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i21, c1086gP, i21, pVar);
                    } else {
                        J4.i.d(i21, c1086gP, i21, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC1116);
                    c1086gP.L(1463394796);
                    if (z12) {
                        jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                    } else {
                        jM645getPrimaryText0d7_KjU = androidx.compose.ui.graphics.H.f13498e;
                    }
                    c1086gP.T(false);
                    TextKt.b(str, null, jM645getPrimaryText0d7_KjU, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i20 >> 3) & 14, 0, 131066);
                    if (z11) {
                        c1086gP.L(-1879265457);
                        ConversationItemKt.UnreadIndicator(PaddingKt.f(aVar2, 4), c1086gP, 6, 0);
                        c1086gP.T(false);
                    } else if (str2 == null) {
                        c1086gP.L(-1879114425);
                        IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(-1879114425);
                        IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                        c1086gP.T(false);
                    }
                    c1086gP.T(true);
                    hVar4 = hVar112;
                } else {
                    aVar2 = androidx.compose.ui.h.a.f13984b;
                    if (i22 != 0) {
                        hVar3 = aVar2;
                    } else {
                        hVar3 = hVar2;
                    }
                    androidx.compose.ui.h hVarD19 = androidx.compose.foundation.layout.W.d(hVar3, 1.0f);
                    c1086gP.L(-1310322408);
                    if ((i20 & 3670016) == 1048576) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objF = c1086gP.f();
                    if (z13) {
                        objF = new coil.d(1, aVar);
                        c1086gP.E(objF);
                    } else {
                        objF = new coil.d(1, aVar);
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    androidx.compose.ui.h hVarC1117 = ClickableKt.c(hVarD19, z12, null, (Ia.a) objF, 6);
                    f10 = 16;
                    androidx.compose.ui.h hVarF19 = PaddingKt.f(hVarC1117, f10);
                    androidx.compose.foundation.layout.T tA19 = androidx.compose.foundation.layout.S.a(C0945e.f10290g, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
                    i21 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P19 = c1086gP.P();
                    androidx.compose.ui.h hVarC1118 = ComposedModifierKt.c(c1086gP, hVarF19);
                    ComposeUiNode.f14331c0.getClass();
                    androidx.compose.ui.h hVar113 = hVar3;
                    aVar3 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA19);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P19);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i21, c1086gP, i21, pVar);
                    } else {
                        J4.i.d(i21, c1086gP, i21, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC1118);
                    c1086gP.L(1463394796);
                    if (z12) {
                        jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                    } else {
                        jM645getPrimaryText0d7_KjU = androidx.compose.ui.graphics.H.f13498e;
                    }
                    c1086gP.T(false);
                    TextKt.b(str, null, jM645getPrimaryText0d7_KjU, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i20 >> 3) & 14, 0, 131066);
                    if (z11) {
                        c1086gP.L(-1879265457);
                        ConversationItemKt.UnreadIndicator(PaddingKt.f(aVar2, 4), c1086gP, 6, 0);
                        c1086gP.T(false);
                    } else if (str2 == null) {
                        c1086gP.L(-1879114425);
                        IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(-1879114425);
                        IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                        c1086gP.T(false);
                    }
                    c1086gP.T(true);
                    hVar4 = hVar113;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.v
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return HeaderMenuItemRowKt.ExpandedHeaderMenuItemRow$lambda$6(hVar4, str, i10, str2, z10, z11, aVar, z12, i11, i12, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i18 = 1572864;
            i13 |= i18;
            if ((i12 & 128) != 0) {
                if ((29360128 & i11) == 0) {
                    if (c1086gP.c(z12)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                }
                i20 = i13;
                if ((i20 & 23967451) == 4793490) {
                    aVar2 = androidx.compose.ui.h.a.f13984b;
                    if (i22 != 0) {
                        hVar3 = aVar2;
                    } else {
                        hVar3 = hVar2;
                    }
                    androidx.compose.ui.h hVarD110 = androidx.compose.foundation.layout.W.d(hVar3, 1.0f);
                    c1086gP.L(-1310322408);
                    if ((i20 & 3670016) == 1048576) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objF = c1086gP.f();
                    if (z13) {
                        objF = new coil.d(1, aVar);
                        c1086gP.E(objF);
                    } else {
                        objF = new coil.d(1, aVar);
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    androidx.compose.ui.h hVarC1119 = ClickableKt.c(hVarD110, z12, null, (Ia.a) objF, 6);
                    f10 = 16;
                    androidx.compose.ui.h hVarF110 = PaddingKt.f(hVarC1119, f10);
                    androidx.compose.foundation.layout.T tA110 = androidx.compose.foundation.layout.S.a(C0945e.f10290g, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
                    i21 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P110 = c1086gP.P();
                    androidx.compose.ui.h hVarC11110 = ComposedModifierKt.c(c1086gP, hVarF110);
                    ComposeUiNode.f14331c0.getClass();
                    androidx.compose.ui.h hVar114 = hVar3;
                    aVar3 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA110);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P110);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i21, c1086gP, i21, pVar);
                    } else {
                        J4.i.d(i21, c1086gP, i21, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC11110);
                    c1086gP.L(1463394796);
                    if (z12) {
                        jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                    } else {
                        jM645getPrimaryText0d7_KjU = androidx.compose.ui.graphics.H.f13498e;
                    }
                    c1086gP.T(false);
                    TextKt.b(str, null, jM645getPrimaryText0d7_KjU, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i20 >> 3) & 14, 0, 131066);
                    if (z11) {
                        c1086gP.L(-1879265457);
                        ConversationItemKt.UnreadIndicator(PaddingKt.f(aVar2, 4), c1086gP, 6, 0);
                        c1086gP.T(false);
                    } else if (str2 == null) {
                        c1086gP.L(-1879114425);
                        IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(-1879114425);
                        IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                        c1086gP.T(false);
                    }
                    c1086gP.T(true);
                    hVar4 = hVar114;
                } else {
                    aVar2 = androidx.compose.ui.h.a.f13984b;
                    if (i22 != 0) {
                        hVar3 = aVar2;
                    } else {
                        hVar3 = hVar2;
                    }
                    androidx.compose.ui.h hVarD111 = androidx.compose.foundation.layout.W.d(hVar3, 1.0f);
                    c1086gP.L(-1310322408);
                    if ((i20 & 3670016) == 1048576) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objF = c1086gP.f();
                    if (z13) {
                        objF = new coil.d(1, aVar);
                        c1086gP.E(objF);
                    } else {
                        objF = new coil.d(1, aVar);
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    androidx.compose.ui.h hVarC11111 = ClickableKt.c(hVarD111, z12, null, (Ia.a) objF, 6);
                    f10 = 16;
                    androidx.compose.ui.h hVarF111 = PaddingKt.f(hVarC11111, f10);
                    androidx.compose.foundation.layout.T tA111 = androidx.compose.foundation.layout.S.a(C0945e.f10290g, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
                    i21 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P111 = c1086gP.P();
                    androidx.compose.ui.h hVarC11112 = ComposedModifierKt.c(c1086gP, hVarF111);
                    ComposeUiNode.f14331c0.getClass();
                    androidx.compose.ui.h hVar115 = hVar3;
                    aVar3 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA111);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P111);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i21, c1086gP, i21, pVar);
                    } else {
                        J4.i.d(i21, c1086gP, i21, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC11112);
                    c1086gP.L(1463394796);
                    if (z12) {
                        jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                    } else {
                        jM645getPrimaryText0d7_KjU = androidx.compose.ui.graphics.H.f13498e;
                    }
                    c1086gP.T(false);
                    TextKt.b(str, null, jM645getPrimaryText0d7_KjU, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i20 >> 3) & 14, 0, 131066);
                    if (z11) {
                        c1086gP.L(-1879265457);
                        ConversationItemKt.UnreadIndicator(PaddingKt.f(aVar2, 4), c1086gP, 6, 0);
                        c1086gP.T(false);
                    } else if (str2 == null) {
                        c1086gP.L(-1879114425);
                        IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(-1879114425);
                        IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                        c1086gP.T(false);
                    }
                    c1086gP.T(true);
                    hVar4 = hVar115;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.v
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return HeaderMenuItemRowKt.ExpandedHeaderMenuItemRow$lambda$6(hVar4, str, i10, str2, z10, z11, aVar, z12, i11, i12, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i19 = 12582912;
            i13 |= i19;
            i20 = i13;
            if ((i20 & 23967451) == 4793490) {
                aVar2 = androidx.compose.ui.h.a.f13984b;
                if (i22 != 0) {
                    hVar3 = aVar2;
                } else {
                    hVar3 = hVar2;
                }
                androidx.compose.ui.h hVarD112 = androidx.compose.foundation.layout.W.d(hVar3, 1.0f);
                c1086gP.L(-1310322408);
                if ((i20 & 3670016) == 1048576) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objF = c1086gP.f();
                if (z13) {
                    objF = new coil.d(1, aVar);
                    c1086gP.E(objF);
                } else {
                    objF = new coil.d(1, aVar);
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                androidx.compose.ui.h hVarC11113 = ClickableKt.c(hVarD112, z12, null, (Ia.a) objF, 6);
                f10 = 16;
                androidx.compose.ui.h hVarF112 = PaddingKt.f(hVarC11113, f10);
                androidx.compose.foundation.layout.T tA112 = androidx.compose.foundation.layout.S.a(C0945e.f10290g, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
                i21 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P112 = c1086gP.P();
                androidx.compose.ui.h hVarC11114 = ComposedModifierKt.c(c1086gP, hVarF112);
                ComposeUiNode.f14331c0.getClass();
                androidx.compose.ui.h hVar116 = hVar3;
                aVar3 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar3);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA112);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P112);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i21, c1086gP, i21, pVar);
                } else {
                    J4.i.d(i21, c1086gP, i21, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC11114);
                c1086gP.L(1463394796);
                if (z12) {
                    jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                } else {
                    jM645getPrimaryText0d7_KjU = androidx.compose.ui.graphics.H.f13498e;
                }
                c1086gP.T(false);
                TextKt.b(str, null, jM645getPrimaryText0d7_KjU, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i20 >> 3) & 14, 0, 131066);
                if (z11) {
                    c1086gP.L(-1879265457);
                    ConversationItemKt.UnreadIndicator(PaddingKt.f(aVar2, 4), c1086gP, 6, 0);
                    c1086gP.T(false);
                } else if (str2 == null) {
                    c1086gP.L(-1879114425);
                    IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                    c1086gP.T(false);
                } else {
                    c1086gP.L(-1879114425);
                    IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                    c1086gP.T(false);
                }
                c1086gP.T(true);
                hVar4 = hVar116;
            } else {
                aVar2 = androidx.compose.ui.h.a.f13984b;
                if (i22 != 0) {
                    hVar3 = aVar2;
                } else {
                    hVar3 = hVar2;
                }
                androidx.compose.ui.h hVarD113 = androidx.compose.foundation.layout.W.d(hVar3, 1.0f);
                c1086gP.L(-1310322408);
                if ((i20 & 3670016) == 1048576) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objF = c1086gP.f();
                if (z13) {
                    objF = new coil.d(1, aVar);
                    c1086gP.E(objF);
                } else {
                    objF = new coil.d(1, aVar);
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                androidx.compose.ui.h hVarC11115 = ClickableKt.c(hVarD113, z12, null, (Ia.a) objF, 6);
                f10 = 16;
                androidx.compose.ui.h hVarF113 = PaddingKt.f(hVarC11115, f10);
                androidx.compose.foundation.layout.T tA113 = androidx.compose.foundation.layout.S.a(C0945e.f10290g, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
                i21 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P113 = c1086gP.P();
                androidx.compose.ui.h hVarC11116 = ComposedModifierKt.c(c1086gP, hVarF113);
                ComposeUiNode.f14331c0.getClass();
                androidx.compose.ui.h hVar117 = hVar3;
                aVar3 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar3);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA113);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P113);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i21, c1086gP, i21, pVar);
                } else {
                    J4.i.d(i21, c1086gP, i21, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC11116);
                c1086gP.L(1463394796);
                if (z12) {
                    jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                } else {
                    jM645getPrimaryText0d7_KjU = androidx.compose.ui.graphics.H.f13498e;
                }
                c1086gP.T(false);
                TextKt.b(str, null, jM645getPrimaryText0d7_KjU, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i20 >> 3) & 14, 0, 131066);
                if (z11) {
                    c1086gP.L(-1879265457);
                    ConversationItemKt.UnreadIndicator(PaddingKt.f(aVar2, 4), c1086gP, 6, 0);
                    c1086gP.T(false);
                } else if (str2 == null) {
                    c1086gP.L(-1879114425);
                    IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                    c1086gP.T(false);
                } else {
                    c1086gP.L(-1879114425);
                    IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                    c1086gP.T(false);
                }
                c1086gP.T(true);
                hVar4 = hVar117;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.v
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return HeaderMenuItemRowKt.ExpandedHeaderMenuItemRow$lambda$6(hVar4, str, i10, str2, z10, z11, aVar, z12, i11, i12, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i17 = 196608;
        i13 |= i17;
        if ((i12 & 64) != 0) {
            if ((i11 & 3670016) == 0) {
                if (c1086gP.k(aVar)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
            }
            if ((i12 & 128) != 0) {
                if ((29360128 & i11) == 0) {
                    if (c1086gP.c(z12)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                }
                i20 = i13;
                if ((i20 & 23967451) == 4793490) {
                    aVar2 = androidx.compose.ui.h.a.f13984b;
                    if (i22 != 0) {
                        hVar3 = aVar2;
                    } else {
                        hVar3 = hVar2;
                    }
                    androidx.compose.ui.h hVarD114 = androidx.compose.foundation.layout.W.d(hVar3, 1.0f);
                    c1086gP.L(-1310322408);
                    if ((i20 & 3670016) == 1048576) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objF = c1086gP.f();
                    if (z13) {
                        objF = new coil.d(1, aVar);
                        c1086gP.E(objF);
                    } else {
                        objF = new coil.d(1, aVar);
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    androidx.compose.ui.h hVarC11117 = ClickableKt.c(hVarD114, z12, null, (Ia.a) objF, 6);
                    f10 = 16;
                    androidx.compose.ui.h hVarF114 = PaddingKt.f(hVarC11117, f10);
                    androidx.compose.foundation.layout.T tA114 = androidx.compose.foundation.layout.S.a(C0945e.f10290g, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
                    i21 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P114 = c1086gP.P();
                    androidx.compose.ui.h hVarC11118 = ComposedModifierKt.c(c1086gP, hVarF114);
                    ComposeUiNode.f14331c0.getClass();
                    androidx.compose.ui.h hVar118 = hVar3;
                    aVar3 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA114);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P114);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i21, c1086gP, i21, pVar);
                    } else {
                        J4.i.d(i21, c1086gP, i21, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC11118);
                    c1086gP.L(1463394796);
                    if (z12) {
                        jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                    } else {
                        jM645getPrimaryText0d7_KjU = androidx.compose.ui.graphics.H.f13498e;
                    }
                    c1086gP.T(false);
                    TextKt.b(str, null, jM645getPrimaryText0d7_KjU, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i20 >> 3) & 14, 0, 131066);
                    if (z11) {
                        c1086gP.L(-1879265457);
                        ConversationItemKt.UnreadIndicator(PaddingKt.f(aVar2, 4), c1086gP, 6, 0);
                        c1086gP.T(false);
                    } else if (str2 == null) {
                        c1086gP.L(-1879114425);
                        IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(-1879114425);
                        IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                        c1086gP.T(false);
                    }
                    c1086gP.T(true);
                    hVar4 = hVar118;
                } else {
                    aVar2 = androidx.compose.ui.h.a.f13984b;
                    if (i22 != 0) {
                        hVar3 = aVar2;
                    } else {
                        hVar3 = hVar2;
                    }
                    androidx.compose.ui.h hVarD115 = androidx.compose.foundation.layout.W.d(hVar3, 1.0f);
                    c1086gP.L(-1310322408);
                    if ((i20 & 3670016) == 1048576) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objF = c1086gP.f();
                    if (z13) {
                        objF = new coil.d(1, aVar);
                        c1086gP.E(objF);
                    } else {
                        objF = new coil.d(1, aVar);
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    androidx.compose.ui.h hVarC11119 = ClickableKt.c(hVarD115, z12, null, (Ia.a) objF, 6);
                    f10 = 16;
                    androidx.compose.ui.h hVarF115 = PaddingKt.f(hVarC11119, f10);
                    androidx.compose.foundation.layout.T tA115 = androidx.compose.foundation.layout.S.a(C0945e.f10290g, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
                    i21 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P115 = c1086gP.P();
                    androidx.compose.ui.h hVarC111110 = ComposedModifierKt.c(c1086gP, hVarF115);
                    ComposeUiNode.f14331c0.getClass();
                    androidx.compose.ui.h hVar119 = hVar3;
                    aVar3 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA115);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P115);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i21, c1086gP, i21, pVar);
                    } else {
                        J4.i.d(i21, c1086gP, i21, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC111110);
                    c1086gP.L(1463394796);
                    if (z12) {
                        jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                    } else {
                        jM645getPrimaryText0d7_KjU = androidx.compose.ui.graphics.H.f13498e;
                    }
                    c1086gP.T(false);
                    TextKt.b(str, null, jM645getPrimaryText0d7_KjU, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i20 >> 3) & 14, 0, 131066);
                    if (z11) {
                        c1086gP.L(-1879265457);
                        ConversationItemKt.UnreadIndicator(PaddingKt.f(aVar2, 4), c1086gP, 6, 0);
                        c1086gP.T(false);
                    } else if (str2 == null) {
                        c1086gP.L(-1879114425);
                        IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(-1879114425);
                        IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                        c1086gP.T(false);
                    }
                    c1086gP.T(true);
                    hVar4 = hVar119;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.v
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return HeaderMenuItemRowKt.ExpandedHeaderMenuItemRow$lambda$6(hVar4, str, i10, str2, z10, z11, aVar, z12, i11, i12, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i19 = 12582912;
            i13 |= i19;
            i20 = i13;
            if ((i20 & 23967451) == 4793490) {
                aVar2 = androidx.compose.ui.h.a.f13984b;
                if (i22 != 0) {
                    hVar3 = aVar2;
                } else {
                    hVar3 = hVar2;
                }
                androidx.compose.ui.h hVarD116 = androidx.compose.foundation.layout.W.d(hVar3, 1.0f);
                c1086gP.L(-1310322408);
                if ((i20 & 3670016) == 1048576) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objF = c1086gP.f();
                if (z13) {
                    objF = new coil.d(1, aVar);
                    c1086gP.E(objF);
                } else {
                    objF = new coil.d(1, aVar);
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                androidx.compose.ui.h hVarC111111 = ClickableKt.c(hVarD116, z12, null, (Ia.a) objF, 6);
                f10 = 16;
                androidx.compose.ui.h hVarF116 = PaddingKt.f(hVarC111111, f10);
                androidx.compose.foundation.layout.T tA116 = androidx.compose.foundation.layout.S.a(C0945e.f10290g, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
                i21 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P116 = c1086gP.P();
                androidx.compose.ui.h hVarC111112 = ComposedModifierKt.c(c1086gP, hVarF116);
                ComposeUiNode.f14331c0.getClass();
                androidx.compose.ui.h hVar1110 = hVar3;
                aVar3 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar3);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA116);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P116);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i21, c1086gP, i21, pVar);
                } else {
                    J4.i.d(i21, c1086gP, i21, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC111112);
                c1086gP.L(1463394796);
                if (z12) {
                    jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                } else {
                    jM645getPrimaryText0d7_KjU = androidx.compose.ui.graphics.H.f13498e;
                }
                c1086gP.T(false);
                TextKt.b(str, null, jM645getPrimaryText0d7_KjU, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i20 >> 3) & 14, 0, 131066);
                if (z11) {
                    c1086gP.L(-1879265457);
                    ConversationItemKt.UnreadIndicator(PaddingKt.f(aVar2, 4), c1086gP, 6, 0);
                    c1086gP.T(false);
                } else if (str2 == null) {
                    c1086gP.L(-1879114425);
                    IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                    c1086gP.T(false);
                } else {
                    c1086gP.L(-1879114425);
                    IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                    c1086gP.T(false);
                }
                c1086gP.T(true);
                hVar4 = hVar1110;
            } else {
                aVar2 = androidx.compose.ui.h.a.f13984b;
                if (i22 != 0) {
                    hVar3 = aVar2;
                } else {
                    hVar3 = hVar2;
                }
                androidx.compose.ui.h hVarD117 = androidx.compose.foundation.layout.W.d(hVar3, 1.0f);
                c1086gP.L(-1310322408);
                if ((i20 & 3670016) == 1048576) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objF = c1086gP.f();
                if (z13) {
                    objF = new coil.d(1, aVar);
                    c1086gP.E(objF);
                } else {
                    objF = new coil.d(1, aVar);
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                androidx.compose.ui.h hVarC111113 = ClickableKt.c(hVarD117, z12, null, (Ia.a) objF, 6);
                f10 = 16;
                androidx.compose.ui.h hVarF117 = PaddingKt.f(hVarC111113, f10);
                androidx.compose.foundation.layout.T tA117 = androidx.compose.foundation.layout.S.a(C0945e.f10290g, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
                i21 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P117 = c1086gP.P();
                androidx.compose.ui.h hVarC111114 = ComposedModifierKt.c(c1086gP, hVarF117);
                ComposeUiNode.f14331c0.getClass();
                androidx.compose.ui.h hVar1111 = hVar3;
                aVar3 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar3);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA117);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P117);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i21, c1086gP, i21, pVar);
                } else {
                    J4.i.d(i21, c1086gP, i21, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC111114);
                c1086gP.L(1463394796);
                if (z12) {
                    jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                } else {
                    jM645getPrimaryText0d7_KjU = androidx.compose.ui.graphics.H.f13498e;
                }
                c1086gP.T(false);
                TextKt.b(str, null, jM645getPrimaryText0d7_KjU, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i20 >> 3) & 14, 0, 131066);
                if (z11) {
                    c1086gP.L(-1879265457);
                    ConversationItemKt.UnreadIndicator(PaddingKt.f(aVar2, 4), c1086gP, 6, 0);
                    c1086gP.T(false);
                } else if (str2 == null) {
                    c1086gP.L(-1879114425);
                    IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                    c1086gP.T(false);
                } else {
                    c1086gP.L(-1879114425);
                    IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                    c1086gP.T(false);
                }
                c1086gP.T(true);
                hVar4 = hVar1111;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.v
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return HeaderMenuItemRowKt.ExpandedHeaderMenuItemRow$lambda$6(hVar4, str, i10, str2, z10, z11, aVar, z12, i11, i12, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i18 = 1572864;
        i13 |= i18;
        if ((i12 & 128) != 0) {
            if ((29360128 & i11) == 0) {
                if (c1086gP.c(z12)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
            }
            i20 = i13;
            if ((i20 & 23967451) == 4793490) {
                aVar2 = androidx.compose.ui.h.a.f13984b;
                if (i22 != 0) {
                    hVar3 = aVar2;
                } else {
                    hVar3 = hVar2;
                }
                androidx.compose.ui.h hVarD118 = androidx.compose.foundation.layout.W.d(hVar3, 1.0f);
                c1086gP.L(-1310322408);
                if ((i20 & 3670016) == 1048576) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objF = c1086gP.f();
                if (z13) {
                    objF = new coil.d(1, aVar);
                    c1086gP.E(objF);
                } else {
                    objF = new coil.d(1, aVar);
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                androidx.compose.ui.h hVarC111115 = ClickableKt.c(hVarD118, z12, null, (Ia.a) objF, 6);
                f10 = 16;
                androidx.compose.ui.h hVarF118 = PaddingKt.f(hVarC111115, f10);
                androidx.compose.foundation.layout.T tA118 = androidx.compose.foundation.layout.S.a(C0945e.f10290g, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
                i21 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P118 = c1086gP.P();
                androidx.compose.ui.h hVarC111116 = ComposedModifierKt.c(c1086gP, hVarF118);
                ComposeUiNode.f14331c0.getClass();
                androidx.compose.ui.h hVar1112 = hVar3;
                aVar3 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar3);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA118);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P118);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i21, c1086gP, i21, pVar);
                } else {
                    J4.i.d(i21, c1086gP, i21, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC111116);
                c1086gP.L(1463394796);
                if (z12) {
                    jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                } else {
                    jM645getPrimaryText0d7_KjU = androidx.compose.ui.graphics.H.f13498e;
                }
                c1086gP.T(false);
                TextKt.b(str, null, jM645getPrimaryText0d7_KjU, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i20 >> 3) & 14, 0, 131066);
                if (z11) {
                    c1086gP.L(-1879265457);
                    ConversationItemKt.UnreadIndicator(PaddingKt.f(aVar2, 4), c1086gP, 6, 0);
                    c1086gP.T(false);
                } else if (str2 == null) {
                    c1086gP.L(-1879114425);
                    IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                    c1086gP.T(false);
                } else {
                    c1086gP.L(-1879114425);
                    IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                    c1086gP.T(false);
                }
                c1086gP.T(true);
                hVar4 = hVar1112;
            } else {
                aVar2 = androidx.compose.ui.h.a.f13984b;
                if (i22 != 0) {
                    hVar3 = aVar2;
                } else {
                    hVar3 = hVar2;
                }
                androidx.compose.ui.h hVarD119 = androidx.compose.foundation.layout.W.d(hVar3, 1.0f);
                c1086gP.L(-1310322408);
                if ((i20 & 3670016) == 1048576) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objF = c1086gP.f();
                if (z13) {
                    objF = new coil.d(1, aVar);
                    c1086gP.E(objF);
                } else {
                    objF = new coil.d(1, aVar);
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                androidx.compose.ui.h hVarC111117 = ClickableKt.c(hVarD119, z12, null, (Ia.a) objF, 6);
                f10 = 16;
                androidx.compose.ui.h hVarF119 = PaddingKt.f(hVarC111117, f10);
                androidx.compose.foundation.layout.T tA119 = androidx.compose.foundation.layout.S.a(C0945e.f10290g, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
                i21 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P119 = c1086gP.P();
                androidx.compose.ui.h hVarC111118 = ComposedModifierKt.c(c1086gP, hVarF119);
                ComposeUiNode.f14331c0.getClass();
                androidx.compose.ui.h hVar1113 = hVar3;
                aVar3 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar3);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA119);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P119);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i21, c1086gP, i21, pVar);
                } else {
                    J4.i.d(i21, c1086gP, i21, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC111118);
                c1086gP.L(1463394796);
                if (z12) {
                    jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                } else {
                    jM645getPrimaryText0d7_KjU = androidx.compose.ui.graphics.H.f13498e;
                }
                c1086gP.T(false);
                TextKt.b(str, null, jM645getPrimaryText0d7_KjU, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i20 >> 3) & 14, 0, 131066);
                if (z11) {
                    c1086gP.L(-1879265457);
                    ConversationItemKt.UnreadIndicator(PaddingKt.f(aVar2, 4), c1086gP, 6, 0);
                    c1086gP.T(false);
                } else if (str2 == null) {
                    c1086gP.L(-1879114425);
                    IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                    c1086gP.T(false);
                } else {
                    c1086gP.L(-1879114425);
                    IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                    c1086gP.T(false);
                }
                c1086gP.T(true);
                hVar4 = hVar1113;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.v
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return HeaderMenuItemRowKt.ExpandedHeaderMenuItemRow$lambda$6(hVar4, str, i10, str2, z10, z11, aVar, z12, i11, i12, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i19 = 12582912;
        i13 |= i19;
        i20 = i13;
        if ((i20 & 23967451) == 4793490) {
            aVar2 = androidx.compose.ui.h.a.f13984b;
            if (i22 != 0) {
                hVar3 = aVar2;
            } else {
                hVar3 = hVar2;
            }
            androidx.compose.ui.h hVarD1110 = androidx.compose.foundation.layout.W.d(hVar3, 1.0f);
            c1086gP.L(-1310322408);
            if ((i20 & 3670016) == 1048576) {
                z13 = true;
            } else {
                z13 = false;
            }
            objF = c1086gP.f();
            if (z13) {
                objF = new coil.d(1, aVar);
                c1086gP.E(objF);
            } else {
                objF = new coil.d(1, aVar);
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            androidx.compose.ui.h hVarC111119 = ClickableKt.c(hVarD1110, z12, null, (Ia.a) objF, 6);
            f10 = 16;
            androidx.compose.ui.h hVarF1110 = PaddingKt.f(hVarC111119, f10);
            androidx.compose.foundation.layout.T tA1110 = androidx.compose.foundation.layout.S.a(C0945e.f10290g, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
            i21 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P1110 = c1086gP.P();
            androidx.compose.ui.h hVarC1111110 = ComposedModifierKt.c(c1086gP, hVarF1110);
            ComposeUiNode.f14331c0.getClass();
            androidx.compose.ui.h hVar1114 = hVar3;
            aVar3 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar3);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA1110);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P1110);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i21, c1086gP, i21, pVar);
            } else {
                J4.i.d(i21, c1086gP, i21, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC1111110);
            c1086gP.L(1463394796);
            if (z12) {
                jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
            } else {
                jM645getPrimaryText0d7_KjU = androidx.compose.ui.graphics.H.f13498e;
            }
            c1086gP.T(false);
            TextKt.b(str, null, jM645getPrimaryText0d7_KjU, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i20 >> 3) & 14, 0, 131066);
            if (z11) {
                c1086gP.L(-1879265457);
                ConversationItemKt.UnreadIndicator(PaddingKt.f(aVar2, 4), c1086gP, 6, 0);
                c1086gP.T(false);
            } else if (str2 == null) {
                c1086gP.L(-1879114425);
                IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                c1086gP.T(false);
            } else {
                c1086gP.L(-1879114425);
                IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                c1086gP.T(false);
            }
            c1086gP.T(true);
            hVar4 = hVar1114;
        } else {
            aVar2 = androidx.compose.ui.h.a.f13984b;
            if (i22 != 0) {
                hVar3 = aVar2;
            } else {
                hVar3 = hVar2;
            }
            androidx.compose.ui.h hVarD1111 = androidx.compose.foundation.layout.W.d(hVar3, 1.0f);
            c1086gP.L(-1310322408);
            if ((i20 & 3670016) == 1048576) {
                z13 = true;
            } else {
                z13 = false;
            }
            objF = c1086gP.f();
            if (z13) {
                objF = new coil.d(1, aVar);
                c1086gP.E(objF);
            } else {
                objF = new coil.d(1, aVar);
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            androidx.compose.ui.h hVarC1111111 = ClickableKt.c(hVarD1111, z12, null, (Ia.a) objF, 6);
            f10 = 16;
            androidx.compose.ui.h hVarF1111 = PaddingKt.f(hVarC1111111, f10);
            androidx.compose.foundation.layout.T tA1111 = androidx.compose.foundation.layout.S.a(C0945e.f10290g, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
            i21 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P1111 = c1086gP.P();
            androidx.compose.ui.h hVarC1111112 = ComposedModifierKt.c(c1086gP, hVarF1111);
            ComposeUiNode.f14331c0.getClass();
            androidx.compose.ui.h hVar1115 = hVar3;
            aVar3 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar3);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA1111);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P1111);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i21, c1086gP, i21, pVar);
            } else {
                J4.i.d(i21, c1086gP, i21, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC1111112);
            c1086gP.L(1463394796);
            if (z12) {
                jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
            } else {
                jM645getPrimaryText0d7_KjU = androidx.compose.ui.graphics.H.f13498e;
            }
            c1086gP.T(false);
            TextKt.b(str, null, jM645getPrimaryText0d7_KjU, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i20 >> 3) & 14, 0, 131066);
            if (z11) {
                c1086gP.L(-1879265457);
                ConversationItemKt.UnreadIndicator(PaddingKt.f(aVar2, 4), c1086gP, 6, 0);
                c1086gP.T(false);
            } else if (str2 == null) {
                c1086gP.L(-1879114425);
                IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                c1086gP.T(false);
            } else {
                c1086gP.L(-1879114425);
                IconKt.a(U.c.a(i10, c1086gP, (i20 >> 6) & 14), str, androidx.compose.foundation.layout.W.m(aVar2, f10), jM645getPrimaryText0d7_KjU, c1086gP, (i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392, 0);
                c1086gP.T(false);
            }
            c1086gP.T(true);
            hVar4 = hVar1115;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.v
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HeaderMenuItemRowKt.ExpandedHeaderMenuItemRow$lambda$6(hVar4, str, i10, str2, z10, z11, aVar, z12, i11, i12, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ExpandedHeaderMenuItemRow$lambda$4$lambda$3(Ia.a onClick) {
        kotlin.jvm.internal.i.e(onClick, "$onClick");
        onClick.invoke();
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ExpandedHeaderMenuItemRow$lambda$6(androidx.compose.ui.h hVar, String label, int i10, String str, boolean z10, boolean z11, Ia.a onClick, boolean z12, int i11, int i12, InterfaceC1084f interfaceC1084f, int i13) {
        kotlin.jvm.internal.i.e(label, "$label");
        kotlin.jvm.internal.i.e(onClick, "$onClick");
        ExpandedHeaderMenuItemRow(hVar, label, i10, str, z10, z11, onClick, z12, interfaceC1084f, L4.b.l(i11 | 1), i12);
        return p293xa.r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0121  */
    /* JADX WARN: Code duplicated, block: B:102:0x0128  */
    /* JADX WARN: Code duplicated, block: B:104:0x012e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0131  */
    /* JADX WARN: Code duplicated, block: B:109:0x013d  */
    /* JADX WARN: Code duplicated, block: B:113:0x0153 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0155  */
    /* JADX WARN: Code duplicated, block: B:115:0x015a  */
    /* JADX WARN: Code duplicated, block: B:117:0x015e  */
    /* JADX WARN: Code duplicated, block: B:118:0x0162  */
    /* JADX WARN: Code duplicated, block: B:120:0x0166  */
    /* JADX WARN: Code duplicated, block: B:121:0x016a  */
    /* JADX WARN: Code duplicated, block: B:124:0x016f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0172  */
    /* JADX WARN: Code duplicated, block: B:127:0x0176  */
    /* JADX WARN: Code duplicated, block: B:128:0x0179  */
    /* JADX WARN: Code duplicated, block: B:130:0x017d  */
    /* JADX WARN: Code duplicated, block: B:131:0x0186  */
    /* JADX WARN: Code duplicated, block: B:134:0x018d  */
    /* JADX WARN: Code duplicated, block: B:135:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:139:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00df  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:90:0x0103  */
    /* JADX WARN: Code duplicated, block: B:92:0x0108  */
    /* JADX WARN: Code duplicated, block: B:94:0x0110  */
    /* JADX WARN: Code duplicated, block: B:95:0x0113  */
    /* JADX WARN: Code duplicated, block: B:99:0x011b  */
    /* JADX INFO: renamed from: HeaderMenuItemRow-6RhP_wg, reason: not valid java name */
    public static final void m183HeaderMenuItemRow6RhP_wg(androidx.compose.ui.h hVar, final String label, final int i10, String str, boolean z10, boolean z11, boolean z12, Ia.a<p293xa.r> aVar, final boolean z13, final long j, InterfaceC1084f interfaceC1084f, final int i11, final int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z14;
        int i17;
        int i18;
        boolean z15;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        androidx.compose.ui.h hVar2;
        String str2;
        boolean z16;
        boolean z17;
        boolean z18;
        Ia.a<p293xa.r> c2382t;
        final androidx.compose.ui.h hVar3;
        final String str3;
        final boolean z19;
        final boolean z20;
        final boolean z21;
        final Ia.a<p293xa.r> aVar2;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(label, "label");
        C1086g c1086gP = interfaceC1084f.p(442747888);
        int i24 = i12 & 1;
        if (i24 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (c1086gP.K(hVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i13 |= c1086gP.K(label) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 896) == 0) {
            i13 |= c1086gP.h(i10) ? 256 : 128;
        }
        int i25 = i12 & 8;
        if (i25 == 0) {
            if ((i11 & 7168) == 0) {
                i13 |= c1086gP.K(str) ? 2048 : 1024;
            }
            i14 = i12 & 16;
            if (i14 != 0) {
                if ((57344 & i11) == 0) {
                    if (c1086gP.c(z10)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 32;
                if (i16 != 0) {
                    if ((458752 & i11) == 0) {
                        z14 = z11;
                        if (c1086gP.c(z14)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i13 |= i17;
                    }
                    i18 = i12 & 64;
                    if (i18 != 0) {
                        i13 |= 1572864;
                        z15 = z12;
                    } else {
                        z15 = z12;
                        if ((i11 & 3670016) == 0) {
                            if (c1086gP.c(z15)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i13 |= i19;
                        }
                    }
                    i20 = i12 & 128;
                    if (i20 != 0) {
                        i13 |= 12582912;
                    } else if ((i11 & 29360128) == 0) {
                        if (c1086gP.k(aVar)) {
                            i21 = 8388608;
                        } else {
                            i21 = 4194304;
                        }
                        i13 |= i21;
                    }
                    if ((i12 & 256) != 0) {
                        if ((234881024 & i11) == 0) {
                            if (c1086gP.c(z13)) {
                                i22 = 67108864;
                            } else {
                                i22 = 33554432;
                            }
                            i13 |= i22;
                        }
                        if ((i12 & 512) != 0) {
                            i13 |= 805306368;
                        } else if ((1879048192 & i11) == 0) {
                            if (c1086gP.i(j)) {
                                i23 = 536870912;
                            } else {
                                i23 = 268435456;
                            }
                            i13 |= i23;
                        }
                        if ((1533916891 & i13) == 306783378 || !c1086gP.s()) {
                            if (i24 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i25 != 0) {
                                str2 = null;
                            } else {
                                str2 = str;
                            }
                            if (i14 != 0) {
                                z16 = true;
                            } else {
                                z16 = z10;
                            }
                            if (i16 != 0) {
                                z17 = false;
                            } else {
                                z17 = z14;
                            }
                            if (i18 != 0) {
                                z18 = false;
                            } else {
                                z18 = z15;
                            }
                            if (i20 != 0) {
                                c2382t = new C2382t(0);
                            } else {
                                c2382t = aVar;
                            }
                            if (z18) {
                                c1086gP.L(-1365549178);
                                int i26 = i13 >> 3;
                                ExpandedHeaderMenuItemRow(hVar2, label, i10, str2, z16, z17, c2382t, z13, c1086gP, (524286 & i13) | (3670016 & i26) | (i26 & 29360128), 0);
                                c1086gP.T(false);
                            } else {
                                c1086gP.L(-1365233877);
                                m182CollapsedHeaderMenuItemRow88mDfTA(hVar2, label, i10, str2, z16, z17, c2382t, j, c1086gP, (524286 & i13) | ((i13 >> 3) & 3670016) | ((i13 >> 6) & 29360128), 0);
                                c1086gP.T(false);
                            }
                            hVar3 = hVar2;
                            str3 = str2;
                            z19 = z16;
                            z20 = z17;
                            z21 = z18;
                            aVar2 = c2382t;
                        } else {
                            c1086gP.w();
                            hVar3 = hVar;
                            str3 = str;
                            z19 = z10;
                            z20 = z14;
                            z21 = z15;
                            aVar2 = aVar;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.u
                                @Override // Ia.p
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$1(hVar3, label, i10, str3, z19, z20, z21, aVar2, z13, j, i11, i12, (InterfaceC1084f) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i13 |= 100663296;
                    if ((i12 & 512) != 0) {
                        i13 |= 805306368;
                    } else if ((1879048192 & i11) == 0) {
                        if (c1086gP.i(j)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                        i13 |= i23;
                    }
                    if ((1533916891 & i13) == 306783378) {
                        if (i24 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i25 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        } else {
                            z16 = z10;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        } else {
                            z17 = z14;
                        }
                        if (i18 != 0) {
                            z18 = false;
                        } else {
                            z18 = z15;
                        }
                        if (i20 != 0) {
                            c2382t = new C2382t(0);
                        } else {
                            c2382t = aVar;
                        }
                        if (z18) {
                            c1086gP.L(-1365549178);
                            int i27 = i13 >> 3;
                            ExpandedHeaderMenuItemRow(hVar2, label, i10, str2, z16, z17, c2382t, z13, c1086gP, (524286 & i13) | (3670016 & i27) | (i27 & 29360128), 0);
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(-1365233877);
                            m182CollapsedHeaderMenuItemRow88mDfTA(hVar2, label, i10, str2, z16, z17, c2382t, j, c1086gP, (524286 & i13) | ((i13 >> 3) & 3670016) | ((i13 >> 6) & 29360128), 0);
                            c1086gP.T(false);
                        }
                        hVar3 = hVar2;
                        str3 = str2;
                        z19 = z16;
                        z20 = z17;
                        z21 = z18;
                        aVar2 = c2382t;
                    } else {
                        if (i24 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i25 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        } else {
                            z16 = z10;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        } else {
                            z17 = z14;
                        }
                        if (i18 != 0) {
                            z18 = false;
                        } else {
                            z18 = z15;
                        }
                        if (i20 != 0) {
                            c2382t = new C2382t(0);
                        } else {
                            c2382t = aVar;
                        }
                        if (z18) {
                            c1086gP.L(-1365549178);
                            int i28 = i13 >> 3;
                            ExpandedHeaderMenuItemRow(hVar2, label, i10, str2, z16, z17, c2382t, z13, c1086gP, (524286 & i13) | (3670016 & i28) | (i28 & 29360128), 0);
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(-1365233877);
                            m182CollapsedHeaderMenuItemRow88mDfTA(hVar2, label, i10, str2, z16, z17, c2382t, j, c1086gP, (524286 & i13) | ((i13 >> 3) & 3670016) | ((i13 >> 6) & 29360128), 0);
                            c1086gP.T(false);
                        }
                        hVar3 = hVar2;
                        str3 = str2;
                        z19 = z16;
                        z20 = z17;
                        z21 = z18;
                        aVar2 = c2382t;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.u
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$1(hVar3, label, i10, str3, z19, z20, z21, aVar2, z13, j, i11, i12, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                    }
                }
                i13 |= 196608;
                z14 = z11;
                i18 = i12 & 64;
                if (i18 != 0) {
                    i13 |= 1572864;
                    z15 = z12;
                } else {
                    z15 = z12;
                    if ((i11 & 3670016) == 0) {
                        if (c1086gP.c(z15)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i13 |= i19;
                    }
                }
                i20 = i12 & 128;
                if (i20 != 0) {
                    i13 |= 12582912;
                } else if ((i11 & 29360128) == 0) {
                    if (c1086gP.k(aVar)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                    i13 |= i21;
                }
                if ((i12 & 256) != 0) {
                    if ((234881024 & i11) == 0) {
                        if (c1086gP.c(z13)) {
                            i22 = 67108864;
                        } else {
                            i22 = 33554432;
                        }
                        i13 |= i22;
                    }
                    if ((i12 & 512) != 0) {
                        i13 |= 805306368;
                    } else if ((1879048192 & i11) == 0) {
                        if (c1086gP.i(j)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                        i13 |= i23;
                    }
                    if ((1533916891 & i13) == 306783378) {
                        if (i24 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i25 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        } else {
                            z16 = z10;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        } else {
                            z17 = z14;
                        }
                        if (i18 != 0) {
                            z18 = false;
                        } else {
                            z18 = z15;
                        }
                        if (i20 != 0) {
                            c2382t = new C2382t(0);
                        } else {
                            c2382t = aVar;
                        }
                        if (z18) {
                            c1086gP.L(-1365549178);
                            int i29 = i13 >> 3;
                            ExpandedHeaderMenuItemRow(hVar2, label, i10, str2, z16, z17, c2382t, z13, c1086gP, (524286 & i13) | (3670016 & i29) | (i29 & 29360128), 0);
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(-1365233877);
                            m182CollapsedHeaderMenuItemRow88mDfTA(hVar2, label, i10, str2, z16, z17, c2382t, j, c1086gP, (524286 & i13) | ((i13 >> 3) & 3670016) | ((i13 >> 6) & 29360128), 0);
                            c1086gP.T(false);
                        }
                        hVar3 = hVar2;
                        str3 = str2;
                        z19 = z16;
                        z20 = z17;
                        z21 = z18;
                        aVar2 = c2382t;
                    } else {
                        if (i24 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i25 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        } else {
                            z16 = z10;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        } else {
                            z17 = z14;
                        }
                        if (i18 != 0) {
                            z18 = false;
                        } else {
                            z18 = z15;
                        }
                        if (i20 != 0) {
                            c2382t = new C2382t(0);
                        } else {
                            c2382t = aVar;
                        }
                        if (z18) {
                            c1086gP.L(-1365549178);
                            int i210 = i13 >> 3;
                            ExpandedHeaderMenuItemRow(hVar2, label, i10, str2, z16, z17, c2382t, z13, c1086gP, (524286 & i13) | (3670016 & i210) | (i210 & 29360128), 0);
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(-1365233877);
                            m182CollapsedHeaderMenuItemRow88mDfTA(hVar2, label, i10, str2, z16, z17, c2382t, j, c1086gP, (524286 & i13) | ((i13 >> 3) & 3670016) | ((i13 >> 6) & 29360128), 0);
                            c1086gP.T(false);
                        }
                        hVar3 = hVar2;
                        str3 = str2;
                        z19 = z16;
                        z20 = z17;
                        z21 = z18;
                        aVar2 = c2382t;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.u
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$1(hVar3, label, i10, str3, z19, z20, z21, aVar2, z13, j, i11, i12, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                    }
                }
                i13 |= 100663296;
                if ((i12 & 512) != 0) {
                    i13 |= 805306368;
                } else if ((1879048192 & i11) == 0) {
                    if (c1086gP.i(j)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i13 |= i23;
                }
                if ((1533916891 & i13) == 306783378) {
                    if (i24 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i25 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i14 != 0) {
                        z16 = true;
                    } else {
                        z16 = z10;
                    }
                    if (i16 != 0) {
                        z17 = false;
                    } else {
                        z17 = z14;
                    }
                    if (i18 != 0) {
                        z18 = false;
                    } else {
                        z18 = z15;
                    }
                    if (i20 != 0) {
                        c2382t = new C2382t(0);
                    } else {
                        c2382t = aVar;
                    }
                    if (z18) {
                        c1086gP.L(-1365549178);
                        int i211 = i13 >> 3;
                        ExpandedHeaderMenuItemRow(hVar2, label, i10, str2, z16, z17, c2382t, z13, c1086gP, (524286 & i13) | (3670016 & i211) | (i211 & 29360128), 0);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(-1365233877);
                        m182CollapsedHeaderMenuItemRow88mDfTA(hVar2, label, i10, str2, z16, z17, c2382t, j, c1086gP, (524286 & i13) | ((i13 >> 3) & 3670016) | ((i13 >> 6) & 29360128), 0);
                        c1086gP.T(false);
                    }
                    hVar3 = hVar2;
                    str3 = str2;
                    z19 = z16;
                    z20 = z17;
                    z21 = z18;
                    aVar2 = c2382t;
                } else {
                    if (i24 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i25 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i14 != 0) {
                        z16 = true;
                    } else {
                        z16 = z10;
                    }
                    if (i16 != 0) {
                        z17 = false;
                    } else {
                        z17 = z14;
                    }
                    if (i18 != 0) {
                        z18 = false;
                    } else {
                        z18 = z15;
                    }
                    if (i20 != 0) {
                        c2382t = new C2382t(0);
                    } else {
                        c2382t = aVar;
                    }
                    if (z18) {
                        c1086gP.L(-1365549178);
                        int i212 = i13 >> 3;
                        ExpandedHeaderMenuItemRow(hVar2, label, i10, str2, z16, z17, c2382t, z13, c1086gP, (524286 & i13) | (3670016 & i212) | (i212 & 29360128), 0);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(-1365233877);
                        m182CollapsedHeaderMenuItemRow88mDfTA(hVar2, label, i10, str2, z16, z17, c2382t, j, c1086gP, (524286 & i13) | ((i13 >> 3) & 3670016) | ((i13 >> 6) & 29360128), 0);
                        c1086gP.T(false);
                    }
                    hVar3 = hVar2;
                    str3 = str2;
                    z19 = z16;
                    z20 = z17;
                    z21 = z18;
                    aVar2 = c2382t;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.u
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$1(hVar3, label, i10, str3, z19, z20, z21, aVar2, z13, j, i11, i12, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i13 |= 24576;
            i16 = i12 & 32;
            if (i16 != 0) {
                if ((458752 & i11) == 0) {
                    z14 = z11;
                    if (c1086gP.c(z14)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 64;
                if (i18 != 0) {
                    i13 |= 1572864;
                    z15 = z12;
                } else {
                    z15 = z12;
                    if ((i11 & 3670016) == 0) {
                        if (c1086gP.c(z15)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i13 |= i19;
                    }
                }
                i20 = i12 & 128;
                if (i20 != 0) {
                    i13 |= 12582912;
                } else if ((i11 & 29360128) == 0) {
                    if (c1086gP.k(aVar)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                    i13 |= i21;
                }
                if ((i12 & 256) != 0) {
                    if ((234881024 & i11) == 0) {
                        if (c1086gP.c(z13)) {
                            i22 = 67108864;
                        } else {
                            i22 = 33554432;
                        }
                        i13 |= i22;
                    }
                    if ((i12 & 512) != 0) {
                        i13 |= 805306368;
                    } else if ((1879048192 & i11) == 0) {
                        if (c1086gP.i(j)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                        i13 |= i23;
                    }
                    if ((1533916891 & i13) == 306783378) {
                        if (i24 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i25 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        } else {
                            z16 = z10;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        } else {
                            z17 = z14;
                        }
                        if (i18 != 0) {
                            z18 = false;
                        } else {
                            z18 = z15;
                        }
                        if (i20 != 0) {
                            c2382t = new C2382t(0);
                        } else {
                            c2382t = aVar;
                        }
                        if (z18) {
                            c1086gP.L(-1365549178);
                            int i213 = i13 >> 3;
                            ExpandedHeaderMenuItemRow(hVar2, label, i10, str2, z16, z17, c2382t, z13, c1086gP, (524286 & i13) | (3670016 & i213) | (i213 & 29360128), 0);
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(-1365233877);
                            m182CollapsedHeaderMenuItemRow88mDfTA(hVar2, label, i10, str2, z16, z17, c2382t, j, c1086gP, (524286 & i13) | ((i13 >> 3) & 3670016) | ((i13 >> 6) & 29360128), 0);
                            c1086gP.T(false);
                        }
                        hVar3 = hVar2;
                        str3 = str2;
                        z19 = z16;
                        z20 = z17;
                        z21 = z18;
                        aVar2 = c2382t;
                    } else {
                        if (i24 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i25 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        } else {
                            z16 = z10;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        } else {
                            z17 = z14;
                        }
                        if (i18 != 0) {
                            z18 = false;
                        } else {
                            z18 = z15;
                        }
                        if (i20 != 0) {
                            c2382t = new C2382t(0);
                        } else {
                            c2382t = aVar;
                        }
                        if (z18) {
                            c1086gP.L(-1365549178);
                            int i214 = i13 >> 3;
                            ExpandedHeaderMenuItemRow(hVar2, label, i10, str2, z16, z17, c2382t, z13, c1086gP, (524286 & i13) | (3670016 & i214) | (i214 & 29360128), 0);
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(-1365233877);
                            m182CollapsedHeaderMenuItemRow88mDfTA(hVar2, label, i10, str2, z16, z17, c2382t, j, c1086gP, (524286 & i13) | ((i13 >> 3) & 3670016) | ((i13 >> 6) & 29360128), 0);
                            c1086gP.T(false);
                        }
                        hVar3 = hVar2;
                        str3 = str2;
                        z19 = z16;
                        z20 = z17;
                        z21 = z18;
                        aVar2 = c2382t;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.u
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$1(hVar3, label, i10, str3, z19, z20, z21, aVar2, z13, j, i11, i12, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                    }
                }
                i13 |= 100663296;
                if ((i12 & 512) != 0) {
                    i13 |= 805306368;
                } else if ((1879048192 & i11) == 0) {
                    if (c1086gP.i(j)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i13 |= i23;
                }
                if ((1533916891 & i13) == 306783378) {
                    if (i24 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i25 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i14 != 0) {
                        z16 = true;
                    } else {
                        z16 = z10;
                    }
                    if (i16 != 0) {
                        z17 = false;
                    } else {
                        z17 = z14;
                    }
                    if (i18 != 0) {
                        z18 = false;
                    } else {
                        z18 = z15;
                    }
                    if (i20 != 0) {
                        c2382t = new C2382t(0);
                    } else {
                        c2382t = aVar;
                    }
                    if (z18) {
                        c1086gP.L(-1365549178);
                        int i215 = i13 >> 3;
                        ExpandedHeaderMenuItemRow(hVar2, label, i10, str2, z16, z17, c2382t, z13, c1086gP, (524286 & i13) | (3670016 & i215) | (i215 & 29360128), 0);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(-1365233877);
                        m182CollapsedHeaderMenuItemRow88mDfTA(hVar2, label, i10, str2, z16, z17, c2382t, j, c1086gP, (524286 & i13) | ((i13 >> 3) & 3670016) | ((i13 >> 6) & 29360128), 0);
                        c1086gP.T(false);
                    }
                    hVar3 = hVar2;
                    str3 = str2;
                    z19 = z16;
                    z20 = z17;
                    z21 = z18;
                    aVar2 = c2382t;
                } else {
                    if (i24 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i25 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i14 != 0) {
                        z16 = true;
                    } else {
                        z16 = z10;
                    }
                    if (i16 != 0) {
                        z17 = false;
                    } else {
                        z17 = z14;
                    }
                    if (i18 != 0) {
                        z18 = false;
                    } else {
                        z18 = z15;
                    }
                    if (i20 != 0) {
                        c2382t = new C2382t(0);
                    } else {
                        c2382t = aVar;
                    }
                    if (z18) {
                        c1086gP.L(-1365549178);
                        int i216 = i13 >> 3;
                        ExpandedHeaderMenuItemRow(hVar2, label, i10, str2, z16, z17, c2382t, z13, c1086gP, (524286 & i13) | (3670016 & i216) | (i216 & 29360128), 0);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(-1365233877);
                        m182CollapsedHeaderMenuItemRow88mDfTA(hVar2, label, i10, str2, z16, z17, c2382t, j, c1086gP, (524286 & i13) | ((i13 >> 3) & 3670016) | ((i13 >> 6) & 29360128), 0);
                        c1086gP.T(false);
                    }
                    hVar3 = hVar2;
                    str3 = str2;
                    z19 = z16;
                    z20 = z17;
                    z21 = z18;
                    aVar2 = c2382t;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.u
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$1(hVar3, label, i10, str3, z19, z20, z21, aVar2, z13, j, i11, i12, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i13 |= 196608;
            z14 = z11;
            i18 = i12 & 64;
            if (i18 != 0) {
                i13 |= 1572864;
                z15 = z12;
            } else {
                z15 = z12;
                if ((i11 & 3670016) == 0) {
                    if (c1086gP.c(z15)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i13 |= i19;
                }
            }
            i20 = i12 & 128;
            if (i20 != 0) {
                i13 |= 12582912;
            } else if ((i11 & 29360128) == 0) {
                if (c1086gP.k(aVar)) {
                    i21 = 8388608;
                } else {
                    i21 = 4194304;
                }
                i13 |= i21;
            }
            if ((i12 & 256) != 0) {
                if ((234881024 & i11) == 0) {
                    if (c1086gP.c(z13)) {
                        i22 = 67108864;
                    } else {
                        i22 = 33554432;
                    }
                    i13 |= i22;
                }
                if ((i12 & 512) != 0) {
                    i13 |= 805306368;
                } else if ((1879048192 & i11) == 0) {
                    if (c1086gP.i(j)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i13 |= i23;
                }
                if ((1533916891 & i13) == 306783378) {
                    if (i24 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i25 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i14 != 0) {
                        z16 = true;
                    } else {
                        z16 = z10;
                    }
                    if (i16 != 0) {
                        z17 = false;
                    } else {
                        z17 = z14;
                    }
                    if (i18 != 0) {
                        z18 = false;
                    } else {
                        z18 = z15;
                    }
                    if (i20 != 0) {
                        c2382t = new C2382t(0);
                    } else {
                        c2382t = aVar;
                    }
                    if (z18) {
                        c1086gP.L(-1365549178);
                        int i217 = i13 >> 3;
                        ExpandedHeaderMenuItemRow(hVar2, label, i10, str2, z16, z17, c2382t, z13, c1086gP, (524286 & i13) | (3670016 & i217) | (i217 & 29360128), 0);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(-1365233877);
                        m182CollapsedHeaderMenuItemRow88mDfTA(hVar2, label, i10, str2, z16, z17, c2382t, j, c1086gP, (524286 & i13) | ((i13 >> 3) & 3670016) | ((i13 >> 6) & 29360128), 0);
                        c1086gP.T(false);
                    }
                    hVar3 = hVar2;
                    str3 = str2;
                    z19 = z16;
                    z20 = z17;
                    z21 = z18;
                    aVar2 = c2382t;
                } else {
                    if (i24 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i25 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i14 != 0) {
                        z16 = true;
                    } else {
                        z16 = z10;
                    }
                    if (i16 != 0) {
                        z17 = false;
                    } else {
                        z17 = z14;
                    }
                    if (i18 != 0) {
                        z18 = false;
                    } else {
                        z18 = z15;
                    }
                    if (i20 != 0) {
                        c2382t = new C2382t(0);
                    } else {
                        c2382t = aVar;
                    }
                    if (z18) {
                        c1086gP.L(-1365549178);
                        int i218 = i13 >> 3;
                        ExpandedHeaderMenuItemRow(hVar2, label, i10, str2, z16, z17, c2382t, z13, c1086gP, (524286 & i13) | (3670016 & i218) | (i218 & 29360128), 0);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(-1365233877);
                        m182CollapsedHeaderMenuItemRow88mDfTA(hVar2, label, i10, str2, z16, z17, c2382t, j, c1086gP, (524286 & i13) | ((i13 >> 3) & 3670016) | ((i13 >> 6) & 29360128), 0);
                        c1086gP.T(false);
                    }
                    hVar3 = hVar2;
                    str3 = str2;
                    z19 = z16;
                    z20 = z17;
                    z21 = z18;
                    aVar2 = c2382t;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.u
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$1(hVar3, label, i10, str3, z19, z20, z21, aVar2, z13, j, i11, i12, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i13 |= 100663296;
            if ((i12 & 512) != 0) {
                i13 |= 805306368;
            } else if ((1879048192 & i11) == 0) {
                if (c1086gP.i(j)) {
                    i23 = 536870912;
                } else {
                    i23 = 268435456;
                }
                i13 |= i23;
            }
            if ((1533916891 & i13) == 306783378) {
                if (i24 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i25 != 0) {
                    str2 = null;
                } else {
                    str2 = str;
                }
                if (i14 != 0) {
                    z16 = true;
                } else {
                    z16 = z10;
                }
                if (i16 != 0) {
                    z17 = false;
                } else {
                    z17 = z14;
                }
                if (i18 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
                if (i20 != 0) {
                    c2382t = new C2382t(0);
                } else {
                    c2382t = aVar;
                }
                if (z18) {
                    c1086gP.L(-1365549178);
                    int i219 = i13 >> 3;
                    ExpandedHeaderMenuItemRow(hVar2, label, i10, str2, z16, z17, c2382t, z13, c1086gP, (524286 & i13) | (3670016 & i219) | (i219 & 29360128), 0);
                    c1086gP.T(false);
                } else {
                    c1086gP.L(-1365233877);
                    m182CollapsedHeaderMenuItemRow88mDfTA(hVar2, label, i10, str2, z16, z17, c2382t, j, c1086gP, (524286 & i13) | ((i13 >> 3) & 3670016) | ((i13 >> 6) & 29360128), 0);
                    c1086gP.T(false);
                }
                hVar3 = hVar2;
                str3 = str2;
                z19 = z16;
                z20 = z17;
                z21 = z18;
                aVar2 = c2382t;
            } else {
                if (i24 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i25 != 0) {
                    str2 = null;
                } else {
                    str2 = str;
                }
                if (i14 != 0) {
                    z16 = true;
                } else {
                    z16 = z10;
                }
                if (i16 != 0) {
                    z17 = false;
                } else {
                    z17 = z14;
                }
                if (i18 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
                if (i20 != 0) {
                    c2382t = new C2382t(0);
                } else {
                    c2382t = aVar;
                }
                if (z18) {
                    c1086gP.L(-1365549178);
                    int i2110 = i13 >> 3;
                    ExpandedHeaderMenuItemRow(hVar2, label, i10, str2, z16, z17, c2382t, z13, c1086gP, (524286 & i13) | (3670016 & i2110) | (i2110 & 29360128), 0);
                    c1086gP.T(false);
                } else {
                    c1086gP.L(-1365233877);
                    m182CollapsedHeaderMenuItemRow88mDfTA(hVar2, label, i10, str2, z16, z17, c2382t, j, c1086gP, (524286 & i13) | ((i13 >> 3) & 3670016) | ((i13 >> 6) & 29360128), 0);
                    c1086gP.T(false);
                }
                hVar3 = hVar2;
                str3 = str2;
                z19 = z16;
                z20 = z17;
                z21 = z18;
                aVar2 = c2382t;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.u
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$1(hVar3, label, i10, str3, z19, z20, z21, aVar2, z13, j, i11, i12, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i13 |= 3072;
        i14 = i12 & 16;
        if (i14 != 0) {
            if ((57344 & i11) == 0) {
                if (c1086gP.c(z10)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i13 |= i15;
            }
            i16 = i12 & 32;
            if (i16 != 0) {
                if ((458752 & i11) == 0) {
                    z14 = z11;
                    if (c1086gP.c(z14)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 64;
                if (i18 != 0) {
                    i13 |= 1572864;
                    z15 = z12;
                } else {
                    z15 = z12;
                    if ((i11 & 3670016) == 0) {
                        if (c1086gP.c(z15)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i13 |= i19;
                    }
                }
                i20 = i12 & 128;
                if (i20 != 0) {
                    i13 |= 12582912;
                } else if ((i11 & 29360128) == 0) {
                    if (c1086gP.k(aVar)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                    i13 |= i21;
                }
                if ((i12 & 256) != 0) {
                    if ((234881024 & i11) == 0) {
                        if (c1086gP.c(z13)) {
                            i22 = 67108864;
                        } else {
                            i22 = 33554432;
                        }
                        i13 |= i22;
                    }
                    if ((i12 & 512) != 0) {
                        i13 |= 805306368;
                    } else if ((1879048192 & i11) == 0) {
                        if (c1086gP.i(j)) {
                            i23 = 536870912;
                        } else {
                            i23 = 268435456;
                        }
                        i13 |= i23;
                    }
                    if ((1533916891 & i13) == 306783378) {
                        if (i24 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i25 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        } else {
                            z16 = z10;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        } else {
                            z17 = z14;
                        }
                        if (i18 != 0) {
                            z18 = false;
                        } else {
                            z18 = z15;
                        }
                        if (i20 != 0) {
                            c2382t = new C2382t(0);
                        } else {
                            c2382t = aVar;
                        }
                        if (z18) {
                            c1086gP.L(-1365549178);
                            int i2111 = i13 >> 3;
                            ExpandedHeaderMenuItemRow(hVar2, label, i10, str2, z16, z17, c2382t, z13, c1086gP, (524286 & i13) | (3670016 & i2111) | (i2111 & 29360128), 0);
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(-1365233877);
                            m182CollapsedHeaderMenuItemRow88mDfTA(hVar2, label, i10, str2, z16, z17, c2382t, j, c1086gP, (524286 & i13) | ((i13 >> 3) & 3670016) | ((i13 >> 6) & 29360128), 0);
                            c1086gP.T(false);
                        }
                        hVar3 = hVar2;
                        str3 = str2;
                        z19 = z16;
                        z20 = z17;
                        z21 = z18;
                        aVar2 = c2382t;
                    } else {
                        if (i24 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i25 != 0) {
                            str2 = null;
                        } else {
                            str2 = str;
                        }
                        if (i14 != 0) {
                            z16 = true;
                        } else {
                            z16 = z10;
                        }
                        if (i16 != 0) {
                            z17 = false;
                        } else {
                            z17 = z14;
                        }
                        if (i18 != 0) {
                            z18 = false;
                        } else {
                            z18 = z15;
                        }
                        if (i20 != 0) {
                            c2382t = new C2382t(0);
                        } else {
                            c2382t = aVar;
                        }
                        if (z18) {
                            c1086gP.L(-1365549178);
                            int i2112 = i13 >> 3;
                            ExpandedHeaderMenuItemRow(hVar2, label, i10, str2, z16, z17, c2382t, z13, c1086gP, (524286 & i13) | (3670016 & i2112) | (i2112 & 29360128), 0);
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(-1365233877);
                            m182CollapsedHeaderMenuItemRow88mDfTA(hVar2, label, i10, str2, z16, z17, c2382t, j, c1086gP, (524286 & i13) | ((i13 >> 3) & 3670016) | ((i13 >> 6) & 29360128), 0);
                            c1086gP.T(false);
                        }
                        hVar3 = hVar2;
                        str3 = str2;
                        z19 = z16;
                        z20 = z17;
                        z21 = z18;
                        aVar2 = c2382t;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.u
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$1(hVar3, label, i10, str3, z19, z20, z21, aVar2, z13, j, i11, i12, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                    }
                }
                i13 |= 100663296;
                if ((i12 & 512) != 0) {
                    i13 |= 805306368;
                } else if ((1879048192 & i11) == 0) {
                    if (c1086gP.i(j)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i13 |= i23;
                }
                if ((1533916891 & i13) == 306783378) {
                    if (i24 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i25 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i14 != 0) {
                        z16 = true;
                    } else {
                        z16 = z10;
                    }
                    if (i16 != 0) {
                        z17 = false;
                    } else {
                        z17 = z14;
                    }
                    if (i18 != 0) {
                        z18 = false;
                    } else {
                        z18 = z15;
                    }
                    if (i20 != 0) {
                        c2382t = new C2382t(0);
                    } else {
                        c2382t = aVar;
                    }
                    if (z18) {
                        c1086gP.L(-1365549178);
                        int i2113 = i13 >> 3;
                        ExpandedHeaderMenuItemRow(hVar2, label, i10, str2, z16, z17, c2382t, z13, c1086gP, (524286 & i13) | (3670016 & i2113) | (i2113 & 29360128), 0);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(-1365233877);
                        m182CollapsedHeaderMenuItemRow88mDfTA(hVar2, label, i10, str2, z16, z17, c2382t, j, c1086gP, (524286 & i13) | ((i13 >> 3) & 3670016) | ((i13 >> 6) & 29360128), 0);
                        c1086gP.T(false);
                    }
                    hVar3 = hVar2;
                    str3 = str2;
                    z19 = z16;
                    z20 = z17;
                    z21 = z18;
                    aVar2 = c2382t;
                } else {
                    if (i24 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i25 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i14 != 0) {
                        z16 = true;
                    } else {
                        z16 = z10;
                    }
                    if (i16 != 0) {
                        z17 = false;
                    } else {
                        z17 = z14;
                    }
                    if (i18 != 0) {
                        z18 = false;
                    } else {
                        z18 = z15;
                    }
                    if (i20 != 0) {
                        c2382t = new C2382t(0);
                    } else {
                        c2382t = aVar;
                    }
                    if (z18) {
                        c1086gP.L(-1365549178);
                        int i2114 = i13 >> 3;
                        ExpandedHeaderMenuItemRow(hVar2, label, i10, str2, z16, z17, c2382t, z13, c1086gP, (524286 & i13) | (3670016 & i2114) | (i2114 & 29360128), 0);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(-1365233877);
                        m182CollapsedHeaderMenuItemRow88mDfTA(hVar2, label, i10, str2, z16, z17, c2382t, j, c1086gP, (524286 & i13) | ((i13 >> 3) & 3670016) | ((i13 >> 6) & 29360128), 0);
                        c1086gP.T(false);
                    }
                    hVar3 = hVar2;
                    str3 = str2;
                    z19 = z16;
                    z20 = z17;
                    z21 = z18;
                    aVar2 = c2382t;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.u
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$1(hVar3, label, i10, str3, z19, z20, z21, aVar2, z13, j, i11, i12, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i13 |= 196608;
            z14 = z11;
            i18 = i12 & 64;
            if (i18 != 0) {
                i13 |= 1572864;
                z15 = z12;
            } else {
                z15 = z12;
                if ((i11 & 3670016) == 0) {
                    if (c1086gP.c(z15)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i13 |= i19;
                }
            }
            i20 = i12 & 128;
            if (i20 != 0) {
                i13 |= 12582912;
            } else if ((i11 & 29360128) == 0) {
                if (c1086gP.k(aVar)) {
                    i21 = 8388608;
                } else {
                    i21 = 4194304;
                }
                i13 |= i21;
            }
            if ((i12 & 256) != 0) {
                if ((234881024 & i11) == 0) {
                    if (c1086gP.c(z13)) {
                        i22 = 67108864;
                    } else {
                        i22 = 33554432;
                    }
                    i13 |= i22;
                }
                if ((i12 & 512) != 0) {
                    i13 |= 805306368;
                } else if ((1879048192 & i11) == 0) {
                    if (c1086gP.i(j)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i13 |= i23;
                }
                if ((1533916891 & i13) == 306783378) {
                    if (i24 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i25 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i14 != 0) {
                        z16 = true;
                    } else {
                        z16 = z10;
                    }
                    if (i16 != 0) {
                        z17 = false;
                    } else {
                        z17 = z14;
                    }
                    if (i18 != 0) {
                        z18 = false;
                    } else {
                        z18 = z15;
                    }
                    if (i20 != 0) {
                        c2382t = new C2382t(0);
                    } else {
                        c2382t = aVar;
                    }
                    if (z18) {
                        c1086gP.L(-1365549178);
                        int i2115 = i13 >> 3;
                        ExpandedHeaderMenuItemRow(hVar2, label, i10, str2, z16, z17, c2382t, z13, c1086gP, (524286 & i13) | (3670016 & i2115) | (i2115 & 29360128), 0);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(-1365233877);
                        m182CollapsedHeaderMenuItemRow88mDfTA(hVar2, label, i10, str2, z16, z17, c2382t, j, c1086gP, (524286 & i13) | ((i13 >> 3) & 3670016) | ((i13 >> 6) & 29360128), 0);
                        c1086gP.T(false);
                    }
                    hVar3 = hVar2;
                    str3 = str2;
                    z19 = z16;
                    z20 = z17;
                    z21 = z18;
                    aVar2 = c2382t;
                } else {
                    if (i24 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i25 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i14 != 0) {
                        z16 = true;
                    } else {
                        z16 = z10;
                    }
                    if (i16 != 0) {
                        z17 = false;
                    } else {
                        z17 = z14;
                    }
                    if (i18 != 0) {
                        z18 = false;
                    } else {
                        z18 = z15;
                    }
                    if (i20 != 0) {
                        c2382t = new C2382t(0);
                    } else {
                        c2382t = aVar;
                    }
                    if (z18) {
                        c1086gP.L(-1365549178);
                        int i2116 = i13 >> 3;
                        ExpandedHeaderMenuItemRow(hVar2, label, i10, str2, z16, z17, c2382t, z13, c1086gP, (524286 & i13) | (3670016 & i2116) | (i2116 & 29360128), 0);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(-1365233877);
                        m182CollapsedHeaderMenuItemRow88mDfTA(hVar2, label, i10, str2, z16, z17, c2382t, j, c1086gP, (524286 & i13) | ((i13 >> 3) & 3670016) | ((i13 >> 6) & 29360128), 0);
                        c1086gP.T(false);
                    }
                    hVar3 = hVar2;
                    str3 = str2;
                    z19 = z16;
                    z20 = z17;
                    z21 = z18;
                    aVar2 = c2382t;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.u
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$1(hVar3, label, i10, str3, z19, z20, z21, aVar2, z13, j, i11, i12, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i13 |= 100663296;
            if ((i12 & 512) != 0) {
                i13 |= 805306368;
            } else if ((1879048192 & i11) == 0) {
                if (c1086gP.i(j)) {
                    i23 = 536870912;
                } else {
                    i23 = 268435456;
                }
                i13 |= i23;
            }
            if ((1533916891 & i13) == 306783378) {
                if (i24 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i25 != 0) {
                    str2 = null;
                } else {
                    str2 = str;
                }
                if (i14 != 0) {
                    z16 = true;
                } else {
                    z16 = z10;
                }
                if (i16 != 0) {
                    z17 = false;
                } else {
                    z17 = z14;
                }
                if (i18 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
                if (i20 != 0) {
                    c2382t = new C2382t(0);
                } else {
                    c2382t = aVar;
                }
                if (z18) {
                    c1086gP.L(-1365549178);
                    int i2117 = i13 >> 3;
                    ExpandedHeaderMenuItemRow(hVar2, label, i10, str2, z16, z17, c2382t, z13, c1086gP, (524286 & i13) | (3670016 & i2117) | (i2117 & 29360128), 0);
                    c1086gP.T(false);
                } else {
                    c1086gP.L(-1365233877);
                    m182CollapsedHeaderMenuItemRow88mDfTA(hVar2, label, i10, str2, z16, z17, c2382t, j, c1086gP, (524286 & i13) | ((i13 >> 3) & 3670016) | ((i13 >> 6) & 29360128), 0);
                    c1086gP.T(false);
                }
                hVar3 = hVar2;
                str3 = str2;
                z19 = z16;
                z20 = z17;
                z21 = z18;
                aVar2 = c2382t;
            } else {
                if (i24 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i25 != 0) {
                    str2 = null;
                } else {
                    str2 = str;
                }
                if (i14 != 0) {
                    z16 = true;
                } else {
                    z16 = z10;
                }
                if (i16 != 0) {
                    z17 = false;
                } else {
                    z17 = z14;
                }
                if (i18 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
                if (i20 != 0) {
                    c2382t = new C2382t(0);
                } else {
                    c2382t = aVar;
                }
                if (z18) {
                    c1086gP.L(-1365549178);
                    int i2118 = i13 >> 3;
                    ExpandedHeaderMenuItemRow(hVar2, label, i10, str2, z16, z17, c2382t, z13, c1086gP, (524286 & i13) | (3670016 & i2118) | (i2118 & 29360128), 0);
                    c1086gP.T(false);
                } else {
                    c1086gP.L(-1365233877);
                    m182CollapsedHeaderMenuItemRow88mDfTA(hVar2, label, i10, str2, z16, z17, c2382t, j, c1086gP, (524286 & i13) | ((i13 >> 3) & 3670016) | ((i13 >> 6) & 29360128), 0);
                    c1086gP.T(false);
                }
                hVar3 = hVar2;
                str3 = str2;
                z19 = z16;
                z20 = z17;
                z21 = z18;
                aVar2 = c2382t;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.u
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$1(hVar3, label, i10, str3, z19, z20, z21, aVar2, z13, j, i11, i12, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i13 |= 24576;
        i16 = i12 & 32;
        if (i16 != 0) {
            if ((458752 & i11) == 0) {
                z14 = z11;
                if (c1086gP.c(z14)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i13 |= i17;
            }
            i18 = i12 & 64;
            if (i18 != 0) {
                i13 |= 1572864;
                z15 = z12;
            } else {
                z15 = z12;
                if ((i11 & 3670016) == 0) {
                    if (c1086gP.c(z15)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i13 |= i19;
                }
            }
            i20 = i12 & 128;
            if (i20 != 0) {
                i13 |= 12582912;
            } else if ((i11 & 29360128) == 0) {
                if (c1086gP.k(aVar)) {
                    i21 = 8388608;
                } else {
                    i21 = 4194304;
                }
                i13 |= i21;
            }
            if ((i12 & 256) != 0) {
                if ((234881024 & i11) == 0) {
                    if (c1086gP.c(z13)) {
                        i22 = 67108864;
                    } else {
                        i22 = 33554432;
                    }
                    i13 |= i22;
                }
                if ((i12 & 512) != 0) {
                    i13 |= 805306368;
                } else if ((1879048192 & i11) == 0) {
                    if (c1086gP.i(j)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i13 |= i23;
                }
                if ((1533916891 & i13) == 306783378) {
                    if (i24 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i25 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i14 != 0) {
                        z16 = true;
                    } else {
                        z16 = z10;
                    }
                    if (i16 != 0) {
                        z17 = false;
                    } else {
                        z17 = z14;
                    }
                    if (i18 != 0) {
                        z18 = false;
                    } else {
                        z18 = z15;
                    }
                    if (i20 != 0) {
                        c2382t = new C2382t(0);
                    } else {
                        c2382t = aVar;
                    }
                    if (z18) {
                        c1086gP.L(-1365549178);
                        int i2119 = i13 >> 3;
                        ExpandedHeaderMenuItemRow(hVar2, label, i10, str2, z16, z17, c2382t, z13, c1086gP, (524286 & i13) | (3670016 & i2119) | (i2119 & 29360128), 0);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(-1365233877);
                        m182CollapsedHeaderMenuItemRow88mDfTA(hVar2, label, i10, str2, z16, z17, c2382t, j, c1086gP, (524286 & i13) | ((i13 >> 3) & 3670016) | ((i13 >> 6) & 29360128), 0);
                        c1086gP.T(false);
                    }
                    hVar3 = hVar2;
                    str3 = str2;
                    z19 = z16;
                    z20 = z17;
                    z21 = z18;
                    aVar2 = c2382t;
                } else {
                    if (i24 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i25 != 0) {
                        str2 = null;
                    } else {
                        str2 = str;
                    }
                    if (i14 != 0) {
                        z16 = true;
                    } else {
                        z16 = z10;
                    }
                    if (i16 != 0) {
                        z17 = false;
                    } else {
                        z17 = z14;
                    }
                    if (i18 != 0) {
                        z18 = false;
                    } else {
                        z18 = z15;
                    }
                    if (i20 != 0) {
                        c2382t = new C2382t(0);
                    } else {
                        c2382t = aVar;
                    }
                    if (z18) {
                        c1086gP.L(-1365549178);
                        int i21110 = i13 >> 3;
                        ExpandedHeaderMenuItemRow(hVar2, label, i10, str2, z16, z17, c2382t, z13, c1086gP, (524286 & i13) | (3670016 & i21110) | (i21110 & 29360128), 0);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(-1365233877);
                        m182CollapsedHeaderMenuItemRow88mDfTA(hVar2, label, i10, str2, z16, z17, c2382t, j, c1086gP, (524286 & i13) | ((i13 >> 3) & 3670016) | ((i13 >> 6) & 29360128), 0);
                        c1086gP.T(false);
                    }
                    hVar3 = hVar2;
                    str3 = str2;
                    z19 = z16;
                    z20 = z17;
                    z21 = z18;
                    aVar2 = c2382t;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.u
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$1(hVar3, label, i10, str3, z19, z20, z21, aVar2, z13, j, i11, i12, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i13 |= 100663296;
            if ((i12 & 512) != 0) {
                i13 |= 805306368;
            } else if ((1879048192 & i11) == 0) {
                if (c1086gP.i(j)) {
                    i23 = 536870912;
                } else {
                    i23 = 268435456;
                }
                i13 |= i23;
            }
            if ((1533916891 & i13) == 306783378) {
                if (i24 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i25 != 0) {
                    str2 = null;
                } else {
                    str2 = str;
                }
                if (i14 != 0) {
                    z16 = true;
                } else {
                    z16 = z10;
                }
                if (i16 != 0) {
                    z17 = false;
                } else {
                    z17 = z14;
                }
                if (i18 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
                if (i20 != 0) {
                    c2382t = new C2382t(0);
                } else {
                    c2382t = aVar;
                }
                if (z18) {
                    c1086gP.L(-1365549178);
                    int i21111 = i13 >> 3;
                    ExpandedHeaderMenuItemRow(hVar2, label, i10, str2, z16, z17, c2382t, z13, c1086gP, (524286 & i13) | (3670016 & i21111) | (i21111 & 29360128), 0);
                    c1086gP.T(false);
                } else {
                    c1086gP.L(-1365233877);
                    m182CollapsedHeaderMenuItemRow88mDfTA(hVar2, label, i10, str2, z16, z17, c2382t, j, c1086gP, (524286 & i13) | ((i13 >> 3) & 3670016) | ((i13 >> 6) & 29360128), 0);
                    c1086gP.T(false);
                }
                hVar3 = hVar2;
                str3 = str2;
                z19 = z16;
                z20 = z17;
                z21 = z18;
                aVar2 = c2382t;
            } else {
                if (i24 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i25 != 0) {
                    str2 = null;
                } else {
                    str2 = str;
                }
                if (i14 != 0) {
                    z16 = true;
                } else {
                    z16 = z10;
                }
                if (i16 != 0) {
                    z17 = false;
                } else {
                    z17 = z14;
                }
                if (i18 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
                if (i20 != 0) {
                    c2382t = new C2382t(0);
                } else {
                    c2382t = aVar;
                }
                if (z18) {
                    c1086gP.L(-1365549178);
                    int i21112 = i13 >> 3;
                    ExpandedHeaderMenuItemRow(hVar2, label, i10, str2, z16, z17, c2382t, z13, c1086gP, (524286 & i13) | (3670016 & i21112) | (i21112 & 29360128), 0);
                    c1086gP.T(false);
                } else {
                    c1086gP.L(-1365233877);
                    m182CollapsedHeaderMenuItemRow88mDfTA(hVar2, label, i10, str2, z16, z17, c2382t, j, c1086gP, (524286 & i13) | ((i13 >> 3) & 3670016) | ((i13 >> 6) & 29360128), 0);
                    c1086gP.T(false);
                }
                hVar3 = hVar2;
                str3 = str2;
                z19 = z16;
                z20 = z17;
                z21 = z18;
                aVar2 = c2382t;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.u
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$1(hVar3, label, i10, str3, z19, z20, z21, aVar2, z13, j, i11, i12, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i13 |= 196608;
        z14 = z11;
        i18 = i12 & 64;
        if (i18 != 0) {
            i13 |= 1572864;
            z15 = z12;
        } else {
            z15 = z12;
            if ((i11 & 3670016) == 0) {
                if (c1086gP.c(z15)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i13 |= i19;
            }
        }
        i20 = i12 & 128;
        if (i20 != 0) {
            i13 |= 12582912;
        } else if ((i11 & 29360128) == 0) {
            if (c1086gP.k(aVar)) {
                i21 = 8388608;
            } else {
                i21 = 4194304;
            }
            i13 |= i21;
        }
        if ((i12 & 256) != 0) {
            if ((234881024 & i11) == 0) {
                if (c1086gP.c(z13)) {
                    i22 = 67108864;
                } else {
                    i22 = 33554432;
                }
                i13 |= i22;
            }
            if ((i12 & 512) != 0) {
                i13 |= 805306368;
            } else if ((1879048192 & i11) == 0) {
                if (c1086gP.i(j)) {
                    i23 = 536870912;
                } else {
                    i23 = 268435456;
                }
                i13 |= i23;
            }
            if ((1533916891 & i13) == 306783378) {
                if (i24 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i25 != 0) {
                    str2 = null;
                } else {
                    str2 = str;
                }
                if (i14 != 0) {
                    z16 = true;
                } else {
                    z16 = z10;
                }
                if (i16 != 0) {
                    z17 = false;
                } else {
                    z17 = z14;
                }
                if (i18 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
                if (i20 != 0) {
                    c2382t = new C2382t(0);
                } else {
                    c2382t = aVar;
                }
                if (z18) {
                    c1086gP.L(-1365549178);
                    int i21113 = i13 >> 3;
                    ExpandedHeaderMenuItemRow(hVar2, label, i10, str2, z16, z17, c2382t, z13, c1086gP, (524286 & i13) | (3670016 & i21113) | (i21113 & 29360128), 0);
                    c1086gP.T(false);
                } else {
                    c1086gP.L(-1365233877);
                    m182CollapsedHeaderMenuItemRow88mDfTA(hVar2, label, i10, str2, z16, z17, c2382t, j, c1086gP, (524286 & i13) | ((i13 >> 3) & 3670016) | ((i13 >> 6) & 29360128), 0);
                    c1086gP.T(false);
                }
                hVar3 = hVar2;
                str3 = str2;
                z19 = z16;
                z20 = z17;
                z21 = z18;
                aVar2 = c2382t;
            } else {
                if (i24 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i25 != 0) {
                    str2 = null;
                } else {
                    str2 = str;
                }
                if (i14 != 0) {
                    z16 = true;
                } else {
                    z16 = z10;
                }
                if (i16 != 0) {
                    z17 = false;
                } else {
                    z17 = z14;
                }
                if (i18 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
                if (i20 != 0) {
                    c2382t = new C2382t(0);
                } else {
                    c2382t = aVar;
                }
                if (z18) {
                    c1086gP.L(-1365549178);
                    int i21114 = i13 >> 3;
                    ExpandedHeaderMenuItemRow(hVar2, label, i10, str2, z16, z17, c2382t, z13, c1086gP, (524286 & i13) | (3670016 & i21114) | (i21114 & 29360128), 0);
                    c1086gP.T(false);
                } else {
                    c1086gP.L(-1365233877);
                    m182CollapsedHeaderMenuItemRow88mDfTA(hVar2, label, i10, str2, z16, z17, c2382t, j, c1086gP, (524286 & i13) | ((i13 >> 3) & 3670016) | ((i13 >> 6) & 29360128), 0);
                    c1086gP.T(false);
                }
                hVar3 = hVar2;
                str3 = str2;
                z19 = z16;
                z20 = z17;
                z21 = z18;
                aVar2 = c2382t;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.u
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$1(hVar3, label, i10, str3, z19, z20, z21, aVar2, z13, j, i11, i12, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i13 |= 100663296;
        if ((i12 & 512) != 0) {
            i13 |= 805306368;
        } else if ((1879048192 & i11) == 0) {
            if (c1086gP.i(j)) {
                i23 = 536870912;
            } else {
                i23 = 268435456;
            }
            i13 |= i23;
        }
        if ((1533916891 & i13) == 306783378) {
            if (i24 != 0) {
                hVar2 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar2 = hVar;
            }
            if (i25 != 0) {
                str2 = null;
            } else {
                str2 = str;
            }
            if (i14 != 0) {
                z16 = true;
            } else {
                z16 = z10;
            }
            if (i16 != 0) {
                z17 = false;
            } else {
                z17 = z14;
            }
            if (i18 != 0) {
                z18 = false;
            } else {
                z18 = z15;
            }
            if (i20 != 0) {
                c2382t = new C2382t(0);
            } else {
                c2382t = aVar;
            }
            if (z18) {
                c1086gP.L(-1365549178);
                int i21115 = i13 >> 3;
                ExpandedHeaderMenuItemRow(hVar2, label, i10, str2, z16, z17, c2382t, z13, c1086gP, (524286 & i13) | (3670016 & i21115) | (i21115 & 29360128), 0);
                c1086gP.T(false);
            } else {
                c1086gP.L(-1365233877);
                m182CollapsedHeaderMenuItemRow88mDfTA(hVar2, label, i10, str2, z16, z17, c2382t, j, c1086gP, (524286 & i13) | ((i13 >> 3) & 3670016) | ((i13 >> 6) & 29360128), 0);
                c1086gP.T(false);
            }
            hVar3 = hVar2;
            str3 = str2;
            z19 = z16;
            z20 = z17;
            z21 = z18;
            aVar2 = c2382t;
        } else {
            if (i24 != 0) {
                hVar2 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar2 = hVar;
            }
            if (i25 != 0) {
                str2 = null;
            } else {
                str2 = str;
            }
            if (i14 != 0) {
                z16 = true;
            } else {
                z16 = z10;
            }
            if (i16 != 0) {
                z17 = false;
            } else {
                z17 = z14;
            }
            if (i18 != 0) {
                z18 = false;
            } else {
                z18 = z15;
            }
            if (i20 != 0) {
                c2382t = new C2382t(0);
            } else {
                c2382t = aVar;
            }
            if (z18) {
                c1086gP.L(-1365549178);
                int i21116 = i13 >> 3;
                ExpandedHeaderMenuItemRow(hVar2, label, i10, str2, z16, z17, c2382t, z13, c1086gP, (524286 & i13) | (3670016 & i21116) | (i21116 & 29360128), 0);
                c1086gP.T(false);
            } else {
                c1086gP.L(-1365233877);
                m182CollapsedHeaderMenuItemRow88mDfTA(hVar2, label, i10, str2, z16, z17, c2382t, j, c1086gP, (524286 & i13) | ((i13 >> 3) & 3670016) | ((i13 >> 6) & 29360128), 0);
                c1086gP.T(false);
            }
            hVar3 = hVar2;
            str3 = str2;
            z19 = z16;
            z20 = z17;
            z21 = z18;
            aVar2 = c2382t;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.u
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HeaderMenuItemRowKt.HeaderMenuItemRow_6RhP_wg$lambda$1(hVar3, label, i10, str3, z19, z20, z21, aVar2, z13, j, i11, i12, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r HeaderMenuItemRow_6RhP_wg$lambda$1(androidx.compose.ui.h hVar, String label, int i10, String str, boolean z10, boolean z11, boolean z12, Ia.a aVar, boolean z13, long j, int i11, int i12, InterfaceC1084f interfaceC1084f, int i13) {
        kotlin.jvm.internal.i.e(label, "$label");
        m183HeaderMenuItemRow6RhP_wg(hVar, label, i10, str, z10, z11, z12, aVar, z13, j, interfaceC1084f, L4.b.l(i11 | 1), i12);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UnreadBadge(final androidx.compose.ui.h hVar, final String str, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        C1086g c1086gP = interfaceC1084f.p(1917800334);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.K(hVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= c1086gP.K(str) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && c1086gP.s()) {
            c1086gP.w();
        } else {
            if (i13 != 0) {
                hVar = androidx.compose.ui.h.a.f13984b;
            }
            long jM622getBadge0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m622getBadge0d7_KjU();
            final long j = ColorExtensionsKt.m665isLightColor8_81llA(jM622getBadge0d7_KjU) ? androidx.compose.ui.graphics.H.f13495b : androidx.compose.ui.graphics.H.f13499f;
            BadgeKt.a(hVar, jM622getBadge0d7_KjU, 0L, androidx.compose.runtime.internal.a.b(-1370135743, new Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt.UnreadBadge.1
                @Override // Ia.q
                public /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.foundation.layout.U u10, InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(u10, interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(androidx.compose.foundation.layout.U Badge, InterfaceC1084f interfaceC1084f2, int i14) {
                    kotlin.jvm.internal.i.e(Badge, "$this$Badge");
                    if ((i14 & 81) == 16 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    TextKt.b(str, androidx.compose.ui.h.a.f13984b, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, androidx.compose.ui.text.F.a(IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, IntercomTheme.$stable).getType05(), j, G0.a.g(10), androidx.compose.ui.text.font.l.f15438c, null, 0L, null, 3, 0L, null, null, 16744440), interfaceC1084f2, 48, 0, 65532);
                }
            }, c1086gP), c1086gP, (i12 & 14) | 3072, 4);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.r
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HeaderMenuItemRowKt.UnreadBadge$lambda$7(hVar, str, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r UnreadBadge$lambda$7(androidx.compose.ui.h hVar, String badgeText, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(badgeText, "$badgeText");
        UnreadBadge(hVar, badgeText, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }
}
