package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.InterfaceC0954n;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.C1059k;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.InteractiveComponentSizeKt;
import androidx.compose.material3.MinimumInteractiveModifier;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import io.intercom.android.sdk.models.PoweredBy;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import kotlin.NoWhenBranchMatchedException;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: PoweredByBadge.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class PoweredByBadgeKt {
    private static final float HorizontalPadding;
    private static final float IconSize;
    private static final float VerticalPadding = 6;

    /* JADX INFO: compiled from: PoweredByBadge.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PoweredBy.PoweredByIconType.values().length];
            try {
                iArr[PoweredBy.PoweredByIconType.INTERCOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PoweredBy.PoweredByIconType.FIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        float f10 = 16;
        HorizontalPadding = f10;
        IconSize = f10;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0152  */
    /* JADX WARN: Code duplicated, block: B:101:0x0155  */
    /* JADX WARN: Code duplicated, block: B:103:0x015b  */
    /* JADX WARN: Code duplicated, block: B:107:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x008b  */
    /* JADX WARN: Code duplicated, block: B:48:0x008f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0097  */
    /* JADX WARN: Code duplicated, block: B:51:0x009a  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00da  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fe A[PHI: r7 r9 r10
      0x00fe: PHI (r7v29 int) = (r7v18 int), (r7v30 int), (r7v31 int) binds: [B:90:0x0121, B:81:0x00fb, B:82:0x00fd] A[DONT_GENERATE, DONT_INLINE]
      0x00fe: PHI (r9v16 androidx.compose.ui.h) = (r9v9 androidx.compose.ui.h), (r9v8 androidx.compose.ui.h), (r9v8 androidx.compose.ui.h) binds: [B:90:0x0121, B:81:0x00fb, B:82:0x00fd] A[DONT_GENERATE, DONT_INLINE]
      0x00fe: PHI (r10v11 long) = (r10v8 long), (r10v7 long), (r10v7 long) binds: [B:90:0x0121, B:81:0x00fb, B:82:0x00fd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x0105 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x0107  */
    /* JADX WARN: Code duplicated, block: B:88:0x010e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0123  */
    /* JADX WARN: Code duplicated, block: B:93:0x012b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0138  */
    /* JADX WARN: Code duplicated, block: B:98:0x014f  */
    /* JADX INFO: renamed from: PoweredByBadge-wBJOh4Y, reason: not valid java name */
    public static final void m128PoweredByBadgewBJOh4Y(final String text, final PoweredBy.PoweredByIconType icon, final Ia.a<p293xa.r> onClick, androidx.compose.ui.h hVar, long j, long j10, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.h hVar2;
        long jM643getPoweredByBackgroundColor0d7_KjU;
        long j11;
        final long jM658generateTextColor8_81llA;
        int i13;
        androidx.compose.ui.h hVar3;
        long j12;
        int i14;
        final int i15;
        final long j13;
        final androidx.compose.ui.h hVar4;
        final long j14;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(text, "text");
        kotlin.jvm.internal.i.e(icon, "icon");
        kotlin.jvm.internal.i.e(onClick, "onClick");
        C1086g c1086gP = interfaceC1084f.p(546776392);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.K(text) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= c1086gP.K(icon) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= c1086gP.k(onClick) ? 256 : 128;
        }
        int i16 = i11 & 8;
        if (i16 == 0) {
            if ((i10 & 7168) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 2048 : 1024;
            }
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    jM643getPoweredByBackgroundColor0d7_KjU = j;
                    int i17 = c1086gP.i(jM643getPoweredByBackgroundColor0d7_KjU) ? 16384 : 8192;
                    i12 |= i17;
                } else {
                    jM643getPoweredByBackgroundColor0d7_KjU = j;
                }
                i12 |= i17;
            } else {
                jM643getPoweredByBackgroundColor0d7_KjU = j;
            }
            if ((458752 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    j11 = j10;
                    int i18 = c1086gP.i(j11) ? 131072 : 65536;
                    i12 |= i18;
                } else {
                    j11 = j10;
                }
                i12 |= i18;
            } else {
                j11 = j10;
            }
            if ((i12 & 374491) == 74898 || !c1086gP.s()) {
                c1086gP.r0();
                if ((i10 & 1) != 0 || c1086gP.a0()) {
                    if (i16 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        jM643getPoweredByBackgroundColor0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m643getPoweredByBackgroundColor0d7_KjU();
                    }
                    if ((i11 & 32) != 0) {
                        if (androidx.compose.ui.graphics.H.c(jM643getPoweredByBackgroundColor0d7_KjU, androidx.compose.ui.graphics.H.f13503k)) {
                            jM658generateTextColor8_81llA = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU();
                        } else {
                            jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(jM643getPoweredByBackgroundColor0d7_KjU);
                        }
                        i13 = i12 & (-458753);
                        hVar3 = hVar2;
                        j12 = jM643getPoweredByBackgroundColor0d7_KjU;
                    }
                    c1086gP.U();
                    i14 = WhenMappings.$EnumSwitchMapping$0[icon.ordinal()];
                    if (i14 != 1) {
                        i15 = io.intercom.android.sdk.R.drawable.intercom_logo;
                    } else {
                        if (i14 == 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i15 = io.intercom.android.sdk.R.drawable.intercom_fin_ai_agent;
                    }
                    androidx.compose.runtime.O0 o10 = InteractiveComponentSizeKt.f12188a;
                    androidx.compose.ui.h hVar5 = hVar3;
                    CardKt.a(onClick, hVar3.i(MinimumInteractiveModifier.f12219b), false, IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b, C1059k.a(j12, 0L, c1086gP, (i13 >> 12) & 14, 14), null, null, null, androidx.compose.runtime.internal.a.b(803643315, new Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.components.PoweredByBadgeKt$PoweredByBadge$1
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0954n interfaceC0954n, InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC0954n, interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC0954n Card, InterfaceC1084f interfaceC1084f2, int i19) {
                            kotlin.jvm.internal.i.e(Card, "$this$Card");
                            if ((i19 & 81) == 16 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                            androidx.compose.ui.h hVarG = PaddingKt.g(PoweredByBadgeKt.HorizontalPadding, PoweredByBadgeKt.VerticalPadding, aVar);
                            C0945e.c cVar = C0945e.f10288e;
                            androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                            int i20 = i15;
                            long j15 = jM658generateTextColor8_81llA;
                            String str = text;
                            androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(cVar, bVar, interfaceC1084f2, 54);
                            int iF = interfaceC1084f2.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f2.z();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f2, hVarG);
                            ComposeUiNode.f14331c0.getClass();
                            Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                            if (interfaceC1084f2.u() == null) {
                                I.b.k();
                                throw null;
                            }
                            interfaceC1084f2.r();
                            if (interfaceC1084f2.m()) {
                                interfaceC1084f2.v(aVar2);
                            } else {
                                interfaceC1084f2.A();
                            }
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f2, tA);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f2, interfaceC1089h0Z);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f2, iF, pVar);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f2, hVarC);
                            IconKt.a(U.c.a(i20, interfaceC1084f2, 0), null, androidx.compose.foundation.layout.W.m(aVar, PoweredByBadgeKt.IconSize), j15, interfaceC1084f2, 440, 0);
                            Lb.a.a(interfaceC1084f2, androidx.compose.foundation.layout.W.q(aVar, 8));
                            TextKt.b(str, null, j15, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, PoweredByBadgeKt.getTextStyle(interfaceC1084f2, 0), interfaceC1084f2, 0, 0, 65530);
                            interfaceC1084f2.J();
                        }
                    }, c1086gP), c1086gP, ((i13 >> 6) & 14) | 100663296, 228);
                    j13 = j12;
                    hVar4 = hVar5;
                    j14 = jM658generateTextColor8_81llA;
                } else {
                    c1086gP.w();
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                    }
                }
                i13 = i12;
                hVar3 = hVar2;
                j12 = jM643getPoweredByBackgroundColor0d7_KjU;
                jM658generateTextColor8_81llA = j11;
                c1086gP.U();
                i14 = WhenMappings.$EnumSwitchMapping$0[icon.ordinal()];
                if (i14 != 1) {
                    i15 = io.intercom.android.sdk.R.drawable.intercom_logo;
                } else {
                    if (i14 == 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i15 = io.intercom.android.sdk.R.drawable.intercom_fin_ai_agent;
                }
                androidx.compose.runtime.O0 o11 = InteractiveComponentSizeKt.f12188a;
                androidx.compose.ui.h hVar6 = hVar3;
                CardKt.a(onClick, hVar3.i(MinimumInteractiveModifier.f12219b), false, IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b, C1059k.a(j12, 0L, c1086gP, (i13 >> 12) & 14, 14), null, null, null, androidx.compose.runtime.internal.a.b(803643315, new Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.components.PoweredByBadgeKt$PoweredByBadge$1
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0954n interfaceC0954n, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC0954n, interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC0954n Card, InterfaceC1084f interfaceC1084f2, int i19) {
                        kotlin.jvm.internal.i.e(Card, "$this$Card");
                        if ((i19 & 81) == 16 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                        androidx.compose.ui.h hVarG = PaddingKt.g(PoweredByBadgeKt.HorizontalPadding, PoweredByBadgeKt.VerticalPadding, aVar);
                        C0945e.c cVar = C0945e.f10288e;
                        androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                        int i20 = i15;
                        long j15 = jM658generateTextColor8_81llA;
                        String str = text;
                        androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(cVar, bVar, interfaceC1084f2, 54);
                        int iF = interfaceC1084f2.F();
                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f2.z();
                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f2, hVarG);
                        ComposeUiNode.f14331c0.getClass();
                        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                        if (interfaceC1084f2.u() == null) {
                            I.b.k();
                            throw null;
                        }
                        interfaceC1084f2.r();
                        if (interfaceC1084f2.m()) {
                            interfaceC1084f2.v(aVar2);
                        } else {
                            interfaceC1084f2.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f2, tA);
                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f2, interfaceC1089h0Z);
                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                        if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF))) {
                            androidx.compose.animation.k.b(iF, interfaceC1084f2, iF, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f2, hVarC);
                        IconKt.a(U.c.a(i20, interfaceC1084f2, 0), null, androidx.compose.foundation.layout.W.m(aVar, PoweredByBadgeKt.IconSize), j15, interfaceC1084f2, 440, 0);
                        Lb.a.a(interfaceC1084f2, androidx.compose.foundation.layout.W.q(aVar, 8));
                        TextKt.b(str, null, j15, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, PoweredByBadgeKt.getTextStyle(interfaceC1084f2, 0), interfaceC1084f2, 0, 0, 65530);
                        interfaceC1084f2.J();
                    }
                }, c1086gP), c1086gP, ((i13 >> 6) & 14) | 100663296, 228);
                j13 = j12;
                hVar4 = hVar6;
                j14 = jM658generateTextColor8_81llA;
            } else {
                c1086gP.w();
                hVar4 = hVar2;
                j13 = jM643getPoweredByBackgroundColor0d7_KjU;
                j14 = j11;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.D0
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return PoweredByBadgeKt.PoweredByBadge_wBJOh4Y$lambda$0(text, icon, onClick, hVar4, j13, j14, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 3072;
        hVar2 = hVar;
        if ((57344 & i10) == 0) {
            if ((i11 & 16) == 0) {
                jM643getPoweredByBackgroundColor0d7_KjU = j;
                if (c1086gP.i(jM643getPoweredByBackgroundColor0d7_KjU)) {
                }
                i12 |= i17;
            } else {
                jM643getPoweredByBackgroundColor0d7_KjU = j;
            }
            i12 |= i17;
        } else {
            jM643getPoweredByBackgroundColor0d7_KjU = j;
        }
        if ((458752 & i10) == 0) {
            if ((i11 & 32) == 0) {
                j11 = j10;
                if (c1086gP.i(j11)) {
                }
                i12 |= i18;
            } else {
                j11 = j10;
            }
            i12 |= i18;
        } else {
            j11 = j10;
        }
        if ((i12 & 374491) == 74898) {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i16 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    jM643getPoweredByBackgroundColor0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m643getPoweredByBackgroundColor0d7_KjU();
                }
                if ((i11 & 32) != 0) {
                    if (androidx.compose.ui.graphics.H.c(jM643getPoweredByBackgroundColor0d7_KjU, androidx.compose.ui.graphics.H.f13503k)) {
                        jM658generateTextColor8_81llA = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU();
                    } else {
                        jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(jM643getPoweredByBackgroundColor0d7_KjU);
                    }
                    i13 = i12 & (-458753);
                    hVar3 = hVar2;
                    j12 = jM643getPoweredByBackgroundColor0d7_KjU;
                } else {
                    i13 = i12;
                    hVar3 = hVar2;
                    j12 = jM643getPoweredByBackgroundColor0d7_KjU;
                    jM658generateTextColor8_81llA = j11;
                }
            } else {
                if (i16 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    jM643getPoweredByBackgroundColor0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m643getPoweredByBackgroundColor0d7_KjU();
                }
                if ((i11 & 32) != 0) {
                    if (androidx.compose.ui.graphics.H.c(jM643getPoweredByBackgroundColor0d7_KjU, androidx.compose.ui.graphics.H.f13503k)) {
                        jM658generateTextColor8_81llA = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU();
                    } else {
                        jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(jM643getPoweredByBackgroundColor0d7_KjU);
                    }
                    i13 = i12 & (-458753);
                    hVar3 = hVar2;
                    j12 = jM643getPoweredByBackgroundColor0d7_KjU;
                } else {
                    i13 = i12;
                    hVar3 = hVar2;
                    j12 = jM643getPoweredByBackgroundColor0d7_KjU;
                    jM658generateTextColor8_81llA = j11;
                }
            }
            c1086gP.U();
            i14 = WhenMappings.$EnumSwitchMapping$0[icon.ordinal()];
            if (i14 != 1) {
                i15 = io.intercom.android.sdk.R.drawable.intercom_logo;
            } else {
                if (i14 == 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i15 = io.intercom.android.sdk.R.drawable.intercom_fin_ai_agent;
            }
            androidx.compose.runtime.O0 o12 = InteractiveComponentSizeKt.f12188a;
            androidx.compose.ui.h hVar7 = hVar3;
            CardKt.a(onClick, hVar3.i(MinimumInteractiveModifier.f12219b), false, IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b, C1059k.a(j12, 0L, c1086gP, (i13 >> 12) & 14, 14), null, null, null, androidx.compose.runtime.internal.a.b(803643315, new Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.components.PoweredByBadgeKt$PoweredByBadge$1
                @Override // Ia.q
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0954n interfaceC0954n, InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC0954n, interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC0954n Card, InterfaceC1084f interfaceC1084f2, int i19) {
                    kotlin.jvm.internal.i.e(Card, "$this$Card");
                    if ((i19 & 81) == 16 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                    androidx.compose.ui.h hVarG = PaddingKt.g(PoweredByBadgeKt.HorizontalPadding, PoweredByBadgeKt.VerticalPadding, aVar);
                    C0945e.c cVar = C0945e.f10288e;
                    androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                    int i20 = i15;
                    long j15 = jM658generateTextColor8_81llA;
                    String str = text;
                    androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(cVar, bVar, interfaceC1084f2, 54);
                    int iF = interfaceC1084f2.F();
                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f2.z();
                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f2, hVarG);
                    ComposeUiNode.f14331c0.getClass();
                    Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                    if (interfaceC1084f2.u() == null) {
                        I.b.k();
                        throw null;
                    }
                    interfaceC1084f2.r();
                    if (interfaceC1084f2.m()) {
                        interfaceC1084f2.v(aVar2);
                    } else {
                        interfaceC1084f2.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f2, tA);
                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f2, interfaceC1089h0Z);
                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                    if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF))) {
                        androidx.compose.animation.k.b(iF, interfaceC1084f2, iF, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f2, hVarC);
                    IconKt.a(U.c.a(i20, interfaceC1084f2, 0), null, androidx.compose.foundation.layout.W.m(aVar, PoweredByBadgeKt.IconSize), j15, interfaceC1084f2, 440, 0);
                    Lb.a.a(interfaceC1084f2, androidx.compose.foundation.layout.W.q(aVar, 8));
                    TextKt.b(str, null, j15, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, PoweredByBadgeKt.getTextStyle(interfaceC1084f2, 0), interfaceC1084f2, 0, 0, 65530);
                    interfaceC1084f2.J();
                }
            }, c1086gP), c1086gP, ((i13 >> 6) & 14) | 100663296, 228);
            j13 = j12;
            hVar4 = hVar7;
            j14 = jM658generateTextColor8_81llA;
        } else {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i16 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    jM643getPoweredByBackgroundColor0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m643getPoweredByBackgroundColor0d7_KjU();
                }
                if ((i11 & 32) != 0) {
                    if (androidx.compose.ui.graphics.H.c(jM643getPoweredByBackgroundColor0d7_KjU, androidx.compose.ui.graphics.H.f13503k)) {
                        jM658generateTextColor8_81llA = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU();
                    } else {
                        jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(jM643getPoweredByBackgroundColor0d7_KjU);
                    }
                    i13 = i12 & (-458753);
                    hVar3 = hVar2;
                    j12 = jM643getPoweredByBackgroundColor0d7_KjU;
                } else {
                    i13 = i12;
                    hVar3 = hVar2;
                    j12 = jM643getPoweredByBackgroundColor0d7_KjU;
                    jM658generateTextColor8_81llA = j11;
                }
            } else {
                if (i16 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    jM643getPoweredByBackgroundColor0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m643getPoweredByBackgroundColor0d7_KjU();
                }
                if ((i11 & 32) != 0) {
                    if (androidx.compose.ui.graphics.H.c(jM643getPoweredByBackgroundColor0d7_KjU, androidx.compose.ui.graphics.H.f13503k)) {
                        jM658generateTextColor8_81llA = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU();
                    } else {
                        jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(jM643getPoweredByBackgroundColor0d7_KjU);
                    }
                    i13 = i12 & (-458753);
                    hVar3 = hVar2;
                    j12 = jM643getPoweredByBackgroundColor0d7_KjU;
                } else {
                    i13 = i12;
                    hVar3 = hVar2;
                    j12 = jM643getPoweredByBackgroundColor0d7_KjU;
                    jM658generateTextColor8_81llA = j11;
                }
            }
            c1086gP.U();
            i14 = WhenMappings.$EnumSwitchMapping$0[icon.ordinal()];
            if (i14 != 1) {
                i15 = io.intercom.android.sdk.R.drawable.intercom_logo;
            } else {
                if (i14 == 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i15 = io.intercom.android.sdk.R.drawable.intercom_fin_ai_agent;
            }
            androidx.compose.runtime.O0 o13 = InteractiveComponentSizeKt.f12188a;
            androidx.compose.ui.h hVar8 = hVar3;
            CardKt.a(onClick, hVar3.i(MinimumInteractiveModifier.f12219b), false, IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b, C1059k.a(j12, 0L, c1086gP, (i13 >> 12) & 14, 14), null, null, null, androidx.compose.runtime.internal.a.b(803643315, new Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.components.PoweredByBadgeKt$PoweredByBadge$1
                @Override // Ia.q
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0954n interfaceC0954n, InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC0954n, interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC0954n Card, InterfaceC1084f interfaceC1084f2, int i19) {
                    kotlin.jvm.internal.i.e(Card, "$this$Card");
                    if ((i19 & 81) == 16 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                    androidx.compose.ui.h hVarG = PaddingKt.g(PoweredByBadgeKt.HorizontalPadding, PoweredByBadgeKt.VerticalPadding, aVar);
                    C0945e.c cVar = C0945e.f10288e;
                    androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                    int i20 = i15;
                    long j15 = jM658generateTextColor8_81llA;
                    String str = text;
                    androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(cVar, bVar, interfaceC1084f2, 54);
                    int iF = interfaceC1084f2.F();
                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f2.z();
                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f2, hVarG);
                    ComposeUiNode.f14331c0.getClass();
                    Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                    if (interfaceC1084f2.u() == null) {
                        I.b.k();
                        throw null;
                    }
                    interfaceC1084f2.r();
                    if (interfaceC1084f2.m()) {
                        interfaceC1084f2.v(aVar2);
                    } else {
                        interfaceC1084f2.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f2, tA);
                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f2, interfaceC1089h0Z);
                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                    if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF))) {
                        androidx.compose.animation.k.b(iF, interfaceC1084f2, iF, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f2, hVarC);
                    IconKt.a(U.c.a(i20, interfaceC1084f2, 0), null, androidx.compose.foundation.layout.W.m(aVar, PoweredByBadgeKt.IconSize), j15, interfaceC1084f2, 440, 0);
                    Lb.a.a(interfaceC1084f2, androidx.compose.foundation.layout.W.q(aVar, 8));
                    TextKt.b(str, null, j15, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, PoweredByBadgeKt.getTextStyle(interfaceC1084f2, 0), interfaceC1084f2, 0, 0, 65530);
                    interfaceC1084f2.J();
                }
            }, c1086gP), c1086gP, ((i13 >> 6) & 14) | 100663296, 228);
            j13 = j12;
            hVar4 = hVar8;
            j14 = jM658generateTextColor8_81llA;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.D0
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return PoweredByBadgeKt.PoweredByBadge_wBJOh4Y$lambda$0(text, icon, onClick, hVar4, j13, j14, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    @IntercomPreviews
    public static final void PoweredByBadgePreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(233774014);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$PoweredByBadgeKt.INSTANCE.m107getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2269a0(i10, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r PoweredByBadgePreview$lambda$2(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        PoweredByBadgePreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r PoweredByBadge_wBJOh4Y$lambda$0(String text, PoweredBy.PoweredByIconType icon, Ia.a onClick, androidx.compose.ui.h hVar, long j, long j10, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(text, "$text");
        kotlin.jvm.internal.i.e(icon, "$icon");
        kotlin.jvm.internal.i.e(onClick, "$onClick");
        m128PoweredByBadgewBJOh4Y(text, icon, onClick, hVar, j, j10, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void TransparentPoweredByBadgePreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1988629996);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$PoweredByBadgeKt.INSTANCE.m109getLambda4$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Y(i10, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TransparentPoweredByBadgePreview$lambda$3(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        TransparentPoweredByBadgePreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    public static final float getPoweredByBadgeHeight(InterfaceC1084f interfaceC1084f, int i10) {
        interfaceC1084f.L(-1418088879);
        float fE0 = ((p013b0.c) interfaceC1084f.x(CompositionLocalsKt.f14847h)).e0(getTextStyle(interfaceC1084f, 0).f15318a.f15691b);
        float f10 = VerticalPadding;
        float fMax = Math.max(fE0, IconSize) + f10 + f10;
        interfaceC1084f.D();
        return fMax;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.F getTextStyle(InterfaceC1084f interfaceC1084f, int i10) {
        interfaceC1084f.L(634566382);
        androidx.compose.ui.text.F type05 = IntercomTheme.INSTANCE.getTypography(interfaceC1084f, IntercomTheme.$stable).getType05();
        interfaceC1084f.D();
        return type05;
    }
}
