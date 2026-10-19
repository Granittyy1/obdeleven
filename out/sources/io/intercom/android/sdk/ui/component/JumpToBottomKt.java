package io.intercom.android.sdk.ui.component;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.InterfaceC0928f;
import androidx.compose.animation.core.K;
import androidx.compose.foundation.C0935g;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.InterfaceC0948h;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.U;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.BadgeKt;
import androidx.compose.material3.FloatingActionButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.F;
import io.intercom.android.sdk.m5.components.E0;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.common.TransitionsKt;
import io.intercom.android.sdk.ui.theme.IntercomColorsKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.ThemeMode;
import kotlin.NoWhenBranchMatchedException;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: JumpToBottom.kt */
/* JADX INFO: loaded from: classes.dex */
public final class JumpToBottomKt {
    private static final float JumpBottomPadding = 12;

    /* JADX INFO: compiled from: JumpToBottom.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ThemeMode.values().length];
            try {
                iArr[ThemeMode.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ThemeMode.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ThemeMode.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x0121  */
    /* JADX WARN: Code duplicated, block: B:105:0x0129  */
    /* JADX WARN: Code duplicated, block: B:106:0x0136  */
    /* JADX WARN: Code duplicated, block: B:109:0x013c  */
    /* JADX WARN: Code duplicated, block: B:111:0x0145  */
    /* JADX WARN: Code duplicated, block: B:114:0x014b  */
    /* JADX WARN: Code duplicated, block: B:117:0x015c  */
    /* JADX WARN: Code duplicated, block: B:121:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fb  */
    /* JADX INFO: renamed from: JumpToBottom-kNRdK3w, reason: not valid java name */
    public static final void m543JumpToBottomkNRdK3w(androidx.compose.ui.h hVar, long j, long j10, String str, long j11, long j12, final Ia.a<p293xa.r> onClick, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        androidx.compose.ui.h hVar2;
        int i12;
        long chevronColor;
        String str2;
        long jM615getAction0d7_KjU;
        long jM639getOnAction0d7_KjU;
        int i13;
        long jM621getBackground0d7_KjU;
        final androidx.compose.ui.h hVar3;
        final long j13;
        final long j14;
        final String str3;
        final long j15;
        final long j16;
        C1105p0 c1105p0V;
        int i14;
        int i15;
        kotlin.jvm.internal.i.e(onClick, "onClick");
        C1086g c1086gP = interfaceC1084f.p(1700007899);
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 = i10 | 6;
            hVar2 = hVar;
        } else if ((i10 & 14) == 0) {
            hVar2 = hVar;
            i12 = (c1086gP.K(hVar2) ? 4 : 2) | i10;
        } else {
            hVar2 = hVar;
            i12 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= ((i11 & 2) == 0 && c1086gP.i(j)) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                chevronColor = j10;
                int i17 = c1086gP.i(chevronColor) ? 256 : 128;
                i12 |= i17;
            } else {
                chevronColor = j10;
            }
            i12 |= i17;
        } else {
            chevronColor = j10;
        }
        int i18 = i11 & 8;
        if (i18 == 0) {
            if ((i10 & 7168) == 0) {
                str2 = str;
                i12 |= c1086gP.K(str2) ? 2048 : 1024;
            }
            if ((57344 & i10) == 0) {
                jM615getAction0d7_KjU = j11;
                if ((i11 & 16) == 0 || !c1086gP.i(jM615getAction0d7_KjU)) {
                    i15 = 8192;
                } else {
                    i15 = 16384;
                }
                i12 |= i15;
            } else {
                jM615getAction0d7_KjU = j11;
            }
            if ((458752 & i10) == 0) {
                jM639getOnAction0d7_KjU = j12;
                if ((i11 & 32) == 0 || !c1086gP.i(jM639getOnAction0d7_KjU)) {
                    i14 = 65536;
                } else {
                    i14 = 131072;
                }
                i12 |= i14;
            } else {
                jM639getOnAction0d7_KjU = j12;
            }
            if ((i11 & 64) != 0) {
                if ((3670016 & i10) == 0) {
                    if (c1086gP.k(onClick)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                }
                if ((2995931 & i12) == 599186 || !c1086gP.s()) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0 || c1086gP.a0()) {
                        if (i16 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if ((i11 & 2) != 0) {
                            jM621getBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m621getBackground0d7_KjU();
                            i12 &= -113;
                        } else {
                            jM621getBackground0d7_KjU = j;
                        }
                        if ((i11 & 4) != 0) {
                            chevronColor = getChevronColor(c1086gP, 0);
                            i12 &= -897;
                        }
                        if (i18 != 0) {
                            str2 = null;
                        }
                        if ((i11 & 16) != 0) {
                            jM615getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m615getAction0d7_KjU();
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            jM639getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m639getOnAction0d7_KjU();
                            i12 &= -458753;
                        }
                    } else {
                        c1086gP.w();
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                        }
                        jM621getBackground0d7_KjU = j;
                    }
                    c1086gP.U();
                    final String str4 = str2;
                    final long j17 = jM615getAction0d7_KjU;
                    final long j18 = jM639getOnAction0d7_KjU;
                    ComposableLambdaImpl composableLambdaImplB = androidx.compose.runtime.internal.a.b(-1557616541, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$1
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i19) {
                            kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                            if ((i19 & 81) == 16 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            String str5 = str4;
                            if (str5 == null) {
                                return;
                            }
                            JumpToBottomKt.m544UnreadBadgeeaDK9VM(OffsetKt.b((-5) - JumpToBottomKt.getJumpBottomPadding(), JumpToBottomKt.getJumpBottomPadding(), androidx.compose.ui.h.a.f13984b), str5, j17, j18, interfaceC1084f2, 6, 0);
                        }
                    }, c1086gP);
                    final long j19 = jM621getBackground0d7_KjU;
                    final long j20 = chevronColor;
                    BadgeKt.b(composableLambdaImplB, hVar2, androidx.compose.runtime.internal.a.b(1814183329, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i19) {
                            kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                            if ((i19 & 81) == 16 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            interfaceC1084f2.L(-1483768023);
                            Object objF = interfaceC1084f2.f();
                            Object obj = objF;
                            if (objF == InterfaceC1084f.a.f12980a) {
                                K k10 = new K(Boolean.FALSE);
                                k10.f(Boolean.TRUE);
                                interfaceC1084f2.E(k10);
                                obj = k10;
                            }
                            interfaceC1084f2.D();
                            androidx.compose.animation.m mVarFloatingButtonEnterTransition = TransitionsKt.floatingButtonEnterTransition((int) ((p013b0.c) interfaceC1084f2.x(CompositionLocalsKt.f14847h)).T0(JumpToBottomKt.getJumpBottomPadding()));
                            final Ia.a<p293xa.r> aVar = onClick;
                            final long j21 = j19;
                            final long j22 = j20;
                            AnimatedVisibilityKt.b((K) obj, null, mVarFloatingButtonEnterTransition, null, null, androidx.compose.runtime.internal.a.b(600504953, new Ia.q<InterfaceC0928f, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2.1
                                @Override // Ia.q
                                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0928f interfaceC0928f, InterfaceC1084f interfaceC1084f3, Integer num) {
                                    invoke(interfaceC0928f, interfaceC1084f3, num.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(InterfaceC0928f AnimatedVisibility, InterfaceC1084f interfaceC1084f3, int i20) {
                                    kotlin.jvm.internal.i.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                    androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                                    float f10 = 48;
                                    androidx.compose.ui.h hVarA = C0935g.a(W.m(PaddingKt.f(aVar2, JumpToBottomKt.getJumpBottomPadding()), f10), 1, IntercomTheme.INSTANCE.getColors(interfaceC1084f3, 6).m632getDivider0d7_KjU(), p270w.g.a(50));
                                    Ia.a<p293xa.r> aVar3 = aVar;
                                    long j23 = j21;
                                    final long j24 = j22;
                                    E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                    int iF = interfaceC1084f3.F();
                                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarA);
                                    ComposeUiNode.f14331c0.getClass();
                                    Ia.a<ComposeUiNode> aVar4 = ComposeUiNode.Companion.f14333b;
                                    if (interfaceC1084f3.u() == null) {
                                        I.b.k();
                                        throw null;
                                    }
                                    interfaceC1084f3.r();
                                    if (interfaceC1084f3.m()) {
                                        interfaceC1084f3.v(aVar4);
                                    } else {
                                        interfaceC1084f3.A();
                                    }
                                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                                    if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                        androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar);
                                    }
                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                    FloatingActionButtonKt.a(aVar3, W.m(aVar2, f10), p270w.g.a(50), j23, 0L, null, null, androidx.compose.runtime.internal.a.b(2122957953, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2$1$1$1
                                        @Override // Ia.p
                                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num) {
                                            invoke(interfaceC1084f4, num.intValue());
                                            return p293xa.r.f47939a;
                                        }

                                        public final void invoke(InterfaceC1084f interfaceC1084f4, int i21) {
                                            if ((i21 & 11) == 2 && interfaceC1084f4.s()) {
                                                interfaceC1084f4.w();
                                            } else {
                                                IconKt.a(U.c.a(io.intercom.android.sdk.ui.R.drawable.intercom_ic_chevron_down, interfaceC1084f4, 0), "Jump to bottom", W.m(androidx.compose.ui.h.a.f13984b, 24), j24, interfaceC1084f4, 440, 0);
                                            }
                                        }
                                    }, interfaceC1084f3), interfaceC1084f3, 12582960, R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                                    interfaceC1084f3.J();
                                }
                            }, interfaceC1084f2), interfaceC1084f2, 196608, 26);
                        }
                    }, c1086gP), c1086gP, ((i12 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 390, 0);
                    hVar3 = hVar2;
                    j13 = jM621getBackground0d7_KjU;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    j13 = j;
                }
                j14 = chevronColor;
                str3 = str2;
                j15 = jM639getOnAction0d7_KjU;
                j16 = jM615getAction0d7_KjU;
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.q
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return JumpToBottomKt.JumpToBottom_kNRdK3w$lambda$0(hVar3, j13, j14, str3, j16, j15, onClick, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i13 = 1572864;
            i12 |= i13;
            if ((2995931 & i12) == 599186) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if ((i11 & 2) != 0) {
                        jM621getBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m621getBackground0d7_KjU();
                        i12 &= -113;
                    } else {
                        jM621getBackground0d7_KjU = j;
                    }
                    if ((i11 & 4) != 0) {
                        chevronColor = getChevronColor(c1086gP, 0);
                        i12 &= -897;
                    }
                    if (i18 != 0) {
                        str2 = null;
                    }
                    if ((i11 & 16) != 0) {
                        jM615getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m615getAction0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM639getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m639getOnAction0d7_KjU();
                        i12 &= -458753;
                    }
                } else {
                    if (i16 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if ((i11 & 2) != 0) {
                        jM621getBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m621getBackground0d7_KjU();
                        i12 &= -113;
                    } else {
                        jM621getBackground0d7_KjU = j;
                    }
                    if ((i11 & 4) != 0) {
                        chevronColor = getChevronColor(c1086gP, 0);
                        i12 &= -897;
                    }
                    if (i18 != 0) {
                        str2 = null;
                    }
                    if ((i11 & 16) != 0) {
                        jM615getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m615getAction0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM639getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m639getOnAction0d7_KjU();
                        i12 &= -458753;
                    }
                }
                c1086gP.U();
                final String str5 = str2;
                final long j110 = jM615getAction0d7_KjU;
                final long j111 = jM639getOnAction0d7_KjU;
                ComposableLambdaImpl composableLambdaImplB2 = androidx.compose.runtime.internal.a.b(-1557616541, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$1
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i19) {
                        kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                        if ((i19 & 81) == 16 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        String str6 = str5;
                        if (str6 == null) {
                            return;
                        }
                        JumpToBottomKt.m544UnreadBadgeeaDK9VM(OffsetKt.b((-5) - JumpToBottomKt.getJumpBottomPadding(), JumpToBottomKt.getJumpBottomPadding(), androidx.compose.ui.h.a.f13984b), str6, j110, j111, interfaceC1084f2, 6, 0);
                    }
                }, c1086gP);
                final long j112 = jM621getBackground0d7_KjU;
                final long j21 = chevronColor;
                BadgeKt.b(composableLambdaImplB2, hVar2, androidx.compose.runtime.internal.a.b(1814183329, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i19) {
                        kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                        if ((i19 & 81) == 16 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        interfaceC1084f2.L(-1483768023);
                        Object objF = interfaceC1084f2.f();
                        Object obj = objF;
                        if (objF == InterfaceC1084f.a.f12980a) {
                            K k10 = new K(Boolean.FALSE);
                            k10.f(Boolean.TRUE);
                            interfaceC1084f2.E(k10);
                            obj = k10;
                        }
                        interfaceC1084f2.D();
                        androidx.compose.animation.m mVarFloatingButtonEnterTransition = TransitionsKt.floatingButtonEnterTransition((int) ((p013b0.c) interfaceC1084f2.x(CompositionLocalsKt.f14847h)).T0(JumpToBottomKt.getJumpBottomPadding()));
                        final Ia.a<p293xa.r> aVar = onClick;
                        final long j22 = j112;
                        final long j23 = j21;
                        AnimatedVisibilityKt.b((K) obj, null, mVarFloatingButtonEnterTransition, null, null, androidx.compose.runtime.internal.a.b(600504953, new Ia.q<InterfaceC0928f, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2.1
                            @Override // Ia.q
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0928f interfaceC0928f, InterfaceC1084f interfaceC1084f3, Integer num) {
                                invoke(interfaceC0928f, interfaceC1084f3, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC0928f AnimatedVisibility, InterfaceC1084f interfaceC1084f3, int i20) {
                                kotlin.jvm.internal.i.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                                float f10 = 48;
                                androidx.compose.ui.h hVarA = C0935g.a(W.m(PaddingKt.f(aVar2, JumpToBottomKt.getJumpBottomPadding()), f10), 1, IntercomTheme.INSTANCE.getColors(interfaceC1084f3, 6).m632getDivider0d7_KjU(), p270w.g.a(50));
                                Ia.a<p293xa.r> aVar3 = aVar;
                                long j24 = j22;
                                final long j25 = j23;
                                E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarA);
                                ComposeUiNode.f14331c0.getClass();
                                Ia.a<ComposeUiNode> aVar4 = ComposeUiNode.Companion.f14333b;
                                if (interfaceC1084f3.u() == null) {
                                    I.b.k();
                                    throw null;
                                }
                                interfaceC1084f3.r();
                                if (interfaceC1084f3.m()) {
                                    interfaceC1084f3.v(aVar4);
                                } else {
                                    interfaceC1084f3.A();
                                }
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                FloatingActionButtonKt.a(aVar3, W.m(aVar2, f10), p270w.g.a(50), j24, 0L, null, null, androidx.compose.runtime.internal.a.b(2122957953, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2$1$1$1
                                    @Override // Ia.p
                                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num) {
                                        invoke(interfaceC1084f4, num.intValue());
                                        return p293xa.r.f47939a;
                                    }

                                    public final void invoke(InterfaceC1084f interfaceC1084f4, int i21) {
                                        if ((i21 & 11) == 2 && interfaceC1084f4.s()) {
                                            interfaceC1084f4.w();
                                        } else {
                                            IconKt.a(U.c.a(io.intercom.android.sdk.ui.R.drawable.intercom_ic_chevron_down, interfaceC1084f4, 0), "Jump to bottom", W.m(androidx.compose.ui.h.a.f13984b, 24), j25, interfaceC1084f4, 440, 0);
                                        }
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 12582960, R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                                interfaceC1084f3.J();
                            }
                        }, interfaceC1084f2), interfaceC1084f2, 196608, 26);
                    }
                }, c1086gP), c1086gP, ((i12 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 390, 0);
                hVar3 = hVar2;
                j13 = jM621getBackground0d7_KjU;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if ((i11 & 2) != 0) {
                        jM621getBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m621getBackground0d7_KjU();
                        i12 &= -113;
                    } else {
                        jM621getBackground0d7_KjU = j;
                    }
                    if ((i11 & 4) != 0) {
                        chevronColor = getChevronColor(c1086gP, 0);
                        i12 &= -897;
                    }
                    if (i18 != 0) {
                        str2 = null;
                    }
                    if ((i11 & 16) != 0) {
                        jM615getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m615getAction0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM639getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m639getOnAction0d7_KjU();
                        i12 &= -458753;
                    }
                } else {
                    if (i16 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if ((i11 & 2) != 0) {
                        jM621getBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m621getBackground0d7_KjU();
                        i12 &= -113;
                    } else {
                        jM621getBackground0d7_KjU = j;
                    }
                    if ((i11 & 4) != 0) {
                        chevronColor = getChevronColor(c1086gP, 0);
                        i12 &= -897;
                    }
                    if (i18 != 0) {
                        str2 = null;
                    }
                    if ((i11 & 16) != 0) {
                        jM615getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m615getAction0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM639getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m639getOnAction0d7_KjU();
                        i12 &= -458753;
                    }
                }
                c1086gP.U();
                final String str6 = str2;
                final long j113 = jM615getAction0d7_KjU;
                final long j114 = jM639getOnAction0d7_KjU;
                ComposableLambdaImpl composableLambdaImplB3 = androidx.compose.runtime.internal.a.b(-1557616541, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$1
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i19) {
                        kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                        if ((i19 & 81) == 16 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        String str7 = str6;
                        if (str7 == null) {
                            return;
                        }
                        JumpToBottomKt.m544UnreadBadgeeaDK9VM(OffsetKt.b((-5) - JumpToBottomKt.getJumpBottomPadding(), JumpToBottomKt.getJumpBottomPadding(), androidx.compose.ui.h.a.f13984b), str7, j113, j114, interfaceC1084f2, 6, 0);
                    }
                }, c1086gP);
                final long j115 = jM621getBackground0d7_KjU;
                final long j22 = chevronColor;
                BadgeKt.b(composableLambdaImplB3, hVar2, androidx.compose.runtime.internal.a.b(1814183329, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i19) {
                        kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                        if ((i19 & 81) == 16 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        interfaceC1084f2.L(-1483768023);
                        Object objF = interfaceC1084f2.f();
                        Object obj = objF;
                        if (objF == InterfaceC1084f.a.f12980a) {
                            K k10 = new K(Boolean.FALSE);
                            k10.f(Boolean.TRUE);
                            interfaceC1084f2.E(k10);
                            obj = k10;
                        }
                        interfaceC1084f2.D();
                        androidx.compose.animation.m mVarFloatingButtonEnterTransition = TransitionsKt.floatingButtonEnterTransition((int) ((p013b0.c) interfaceC1084f2.x(CompositionLocalsKt.f14847h)).T0(JumpToBottomKt.getJumpBottomPadding()));
                        final Ia.a<p293xa.r> aVar = onClick;
                        final long j23 = j115;
                        final long j24 = j22;
                        AnimatedVisibilityKt.b((K) obj, null, mVarFloatingButtonEnterTransition, null, null, androidx.compose.runtime.internal.a.b(600504953, new Ia.q<InterfaceC0928f, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2.1
                            @Override // Ia.q
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0928f interfaceC0928f, InterfaceC1084f interfaceC1084f3, Integer num) {
                                invoke(interfaceC0928f, interfaceC1084f3, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC0928f AnimatedVisibility, InterfaceC1084f interfaceC1084f3, int i20) {
                                kotlin.jvm.internal.i.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                                float f10 = 48;
                                androidx.compose.ui.h hVarA = C0935g.a(W.m(PaddingKt.f(aVar2, JumpToBottomKt.getJumpBottomPadding()), f10), 1, IntercomTheme.INSTANCE.getColors(interfaceC1084f3, 6).m632getDivider0d7_KjU(), p270w.g.a(50));
                                Ia.a<p293xa.r> aVar3 = aVar;
                                long j25 = j23;
                                final long j26 = j24;
                                E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarA);
                                ComposeUiNode.f14331c0.getClass();
                                Ia.a<ComposeUiNode> aVar4 = ComposeUiNode.Companion.f14333b;
                                if (interfaceC1084f3.u() == null) {
                                    I.b.k();
                                    throw null;
                                }
                                interfaceC1084f3.r();
                                if (interfaceC1084f3.m()) {
                                    interfaceC1084f3.v(aVar4);
                                } else {
                                    interfaceC1084f3.A();
                                }
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                FloatingActionButtonKt.a(aVar3, W.m(aVar2, f10), p270w.g.a(50), j25, 0L, null, null, androidx.compose.runtime.internal.a.b(2122957953, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2$1$1$1
                                    @Override // Ia.p
                                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num) {
                                        invoke(interfaceC1084f4, num.intValue());
                                        return p293xa.r.f47939a;
                                    }

                                    public final void invoke(InterfaceC1084f interfaceC1084f4, int i21) {
                                        if ((i21 & 11) == 2 && interfaceC1084f4.s()) {
                                            interfaceC1084f4.w();
                                        } else {
                                            IconKt.a(U.c.a(io.intercom.android.sdk.ui.R.drawable.intercom_ic_chevron_down, interfaceC1084f4, 0), "Jump to bottom", W.m(androidx.compose.ui.h.a.f13984b, 24), j26, interfaceC1084f4, 440, 0);
                                        }
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 12582960, R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                                interfaceC1084f3.J();
                            }
                        }, interfaceC1084f2), interfaceC1084f2, 196608, 26);
                    }
                }, c1086gP), c1086gP, ((i12 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 390, 0);
                hVar3 = hVar2;
                j13 = jM621getBackground0d7_KjU;
            }
            j14 = chevronColor;
            str3 = str2;
            j15 = jM639getOnAction0d7_KjU;
            j16 = jM615getAction0d7_KjU;
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.q
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return JumpToBottomKt.JumpToBottom_kNRdK3w$lambda$0(hVar3, j13, j14, str3, j16, j15, onClick, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 3072;
        str2 = str;
        if ((57344 & i10) == 0) {
            jM615getAction0d7_KjU = j11;
            if ((i11 & 16) == 0) {
                i15 = 8192;
            } else {
                i15 = 8192;
            }
            i12 |= i15;
        } else {
            jM615getAction0d7_KjU = j11;
        }
        if ((458752 & i10) == 0) {
            jM639getOnAction0d7_KjU = j12;
            if ((i11 & 32) == 0) {
                i14 = 65536;
            } else {
                i14 = 65536;
            }
            i12 |= i14;
        } else {
            jM639getOnAction0d7_KjU = j12;
        }
        if ((i11 & 64) != 0) {
            if ((3670016 & i10) == 0) {
                if (c1086gP.k(onClick)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
            }
            if ((2995931 & i12) == 599186) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if ((i11 & 2) != 0) {
                        jM621getBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m621getBackground0d7_KjU();
                        i12 &= -113;
                    } else {
                        jM621getBackground0d7_KjU = j;
                    }
                    if ((i11 & 4) != 0) {
                        chevronColor = getChevronColor(c1086gP, 0);
                        i12 &= -897;
                    }
                    if (i18 != 0) {
                        str2 = null;
                    }
                    if ((i11 & 16) != 0) {
                        jM615getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m615getAction0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM639getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m639getOnAction0d7_KjU();
                        i12 &= -458753;
                    }
                } else {
                    if (i16 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if ((i11 & 2) != 0) {
                        jM621getBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m621getBackground0d7_KjU();
                        i12 &= -113;
                    } else {
                        jM621getBackground0d7_KjU = j;
                    }
                    if ((i11 & 4) != 0) {
                        chevronColor = getChevronColor(c1086gP, 0);
                        i12 &= -897;
                    }
                    if (i18 != 0) {
                        str2 = null;
                    }
                    if ((i11 & 16) != 0) {
                        jM615getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m615getAction0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM639getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m639getOnAction0d7_KjU();
                        i12 &= -458753;
                    }
                }
                c1086gP.U();
                final String str7 = str2;
                final long j116 = jM615getAction0d7_KjU;
                final long j117 = jM639getOnAction0d7_KjU;
                ComposableLambdaImpl composableLambdaImplB4 = androidx.compose.runtime.internal.a.b(-1557616541, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$1
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i19) {
                        kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                        if ((i19 & 81) == 16 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        String str8 = str7;
                        if (str8 == null) {
                            return;
                        }
                        JumpToBottomKt.m544UnreadBadgeeaDK9VM(OffsetKt.b((-5) - JumpToBottomKt.getJumpBottomPadding(), JumpToBottomKt.getJumpBottomPadding(), androidx.compose.ui.h.a.f13984b), str8, j116, j117, interfaceC1084f2, 6, 0);
                    }
                }, c1086gP);
                final long j118 = jM621getBackground0d7_KjU;
                final long j23 = chevronColor;
                BadgeKt.b(composableLambdaImplB4, hVar2, androidx.compose.runtime.internal.a.b(1814183329, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i19) {
                        kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                        if ((i19 & 81) == 16 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        interfaceC1084f2.L(-1483768023);
                        Object objF = interfaceC1084f2.f();
                        Object obj = objF;
                        if (objF == InterfaceC1084f.a.f12980a) {
                            K k10 = new K(Boolean.FALSE);
                            k10.f(Boolean.TRUE);
                            interfaceC1084f2.E(k10);
                            obj = k10;
                        }
                        interfaceC1084f2.D();
                        androidx.compose.animation.m mVarFloatingButtonEnterTransition = TransitionsKt.floatingButtonEnterTransition((int) ((p013b0.c) interfaceC1084f2.x(CompositionLocalsKt.f14847h)).T0(JumpToBottomKt.getJumpBottomPadding()));
                        final Ia.a<p293xa.r> aVar = onClick;
                        final long j24 = j118;
                        final long j25 = j23;
                        AnimatedVisibilityKt.b((K) obj, null, mVarFloatingButtonEnterTransition, null, null, androidx.compose.runtime.internal.a.b(600504953, new Ia.q<InterfaceC0928f, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2.1
                            @Override // Ia.q
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0928f interfaceC0928f, InterfaceC1084f interfaceC1084f3, Integer num) {
                                invoke(interfaceC0928f, interfaceC1084f3, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC0928f AnimatedVisibility, InterfaceC1084f interfaceC1084f3, int i20) {
                                kotlin.jvm.internal.i.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                                float f10 = 48;
                                androidx.compose.ui.h hVarA = C0935g.a(W.m(PaddingKt.f(aVar2, JumpToBottomKt.getJumpBottomPadding()), f10), 1, IntercomTheme.INSTANCE.getColors(interfaceC1084f3, 6).m632getDivider0d7_KjU(), p270w.g.a(50));
                                Ia.a<p293xa.r> aVar3 = aVar;
                                long j26 = j24;
                                final long j27 = j25;
                                E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarA);
                                ComposeUiNode.f14331c0.getClass();
                                Ia.a<ComposeUiNode> aVar4 = ComposeUiNode.Companion.f14333b;
                                if (interfaceC1084f3.u() == null) {
                                    I.b.k();
                                    throw null;
                                }
                                interfaceC1084f3.r();
                                if (interfaceC1084f3.m()) {
                                    interfaceC1084f3.v(aVar4);
                                } else {
                                    interfaceC1084f3.A();
                                }
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                FloatingActionButtonKt.a(aVar3, W.m(aVar2, f10), p270w.g.a(50), j26, 0L, null, null, androidx.compose.runtime.internal.a.b(2122957953, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2$1$1$1
                                    @Override // Ia.p
                                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num) {
                                        invoke(interfaceC1084f4, num.intValue());
                                        return p293xa.r.f47939a;
                                    }

                                    public final void invoke(InterfaceC1084f interfaceC1084f4, int i21) {
                                        if ((i21 & 11) == 2 && interfaceC1084f4.s()) {
                                            interfaceC1084f4.w();
                                        } else {
                                            IconKt.a(U.c.a(io.intercom.android.sdk.ui.R.drawable.intercom_ic_chevron_down, interfaceC1084f4, 0), "Jump to bottom", W.m(androidx.compose.ui.h.a.f13984b, 24), j27, interfaceC1084f4, 440, 0);
                                        }
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 12582960, R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                                interfaceC1084f3.J();
                            }
                        }, interfaceC1084f2), interfaceC1084f2, 196608, 26);
                    }
                }, c1086gP), c1086gP, ((i12 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 390, 0);
                hVar3 = hVar2;
                j13 = jM621getBackground0d7_KjU;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if ((i11 & 2) != 0) {
                        jM621getBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m621getBackground0d7_KjU();
                        i12 &= -113;
                    } else {
                        jM621getBackground0d7_KjU = j;
                    }
                    if ((i11 & 4) != 0) {
                        chevronColor = getChevronColor(c1086gP, 0);
                        i12 &= -897;
                    }
                    if (i18 != 0) {
                        str2 = null;
                    }
                    if ((i11 & 16) != 0) {
                        jM615getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m615getAction0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM639getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m639getOnAction0d7_KjU();
                        i12 &= -458753;
                    }
                } else {
                    if (i16 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if ((i11 & 2) != 0) {
                        jM621getBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m621getBackground0d7_KjU();
                        i12 &= -113;
                    } else {
                        jM621getBackground0d7_KjU = j;
                    }
                    if ((i11 & 4) != 0) {
                        chevronColor = getChevronColor(c1086gP, 0);
                        i12 &= -897;
                    }
                    if (i18 != 0) {
                        str2 = null;
                    }
                    if ((i11 & 16) != 0) {
                        jM615getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m615getAction0d7_KjU();
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        jM639getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m639getOnAction0d7_KjU();
                        i12 &= -458753;
                    }
                }
                c1086gP.U();
                final String str8 = str2;
                final long j119 = jM615getAction0d7_KjU;
                final long j1110 = jM639getOnAction0d7_KjU;
                ComposableLambdaImpl composableLambdaImplB5 = androidx.compose.runtime.internal.a.b(-1557616541, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$1
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i19) {
                        kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                        if ((i19 & 81) == 16 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        String str9 = str8;
                        if (str9 == null) {
                            return;
                        }
                        JumpToBottomKt.m544UnreadBadgeeaDK9VM(OffsetKt.b((-5) - JumpToBottomKt.getJumpBottomPadding(), JumpToBottomKt.getJumpBottomPadding(), androidx.compose.ui.h.a.f13984b), str9, j119, j1110, interfaceC1084f2, 6, 0);
                    }
                }, c1086gP);
                final long j1111 = jM621getBackground0d7_KjU;
                final long j24 = chevronColor;
                BadgeKt.b(composableLambdaImplB5, hVar2, androidx.compose.runtime.internal.a.b(1814183329, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i19) {
                        kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                        if ((i19 & 81) == 16 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        interfaceC1084f2.L(-1483768023);
                        Object objF = interfaceC1084f2.f();
                        Object obj = objF;
                        if (objF == InterfaceC1084f.a.f12980a) {
                            K k10 = new K(Boolean.FALSE);
                            k10.f(Boolean.TRUE);
                            interfaceC1084f2.E(k10);
                            obj = k10;
                        }
                        interfaceC1084f2.D();
                        androidx.compose.animation.m mVarFloatingButtonEnterTransition = TransitionsKt.floatingButtonEnterTransition((int) ((p013b0.c) interfaceC1084f2.x(CompositionLocalsKt.f14847h)).T0(JumpToBottomKt.getJumpBottomPadding()));
                        final Ia.a<p293xa.r> aVar = onClick;
                        final long j25 = j1111;
                        final long j26 = j24;
                        AnimatedVisibilityKt.b((K) obj, null, mVarFloatingButtonEnterTransition, null, null, androidx.compose.runtime.internal.a.b(600504953, new Ia.q<InterfaceC0928f, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2.1
                            @Override // Ia.q
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0928f interfaceC0928f, InterfaceC1084f interfaceC1084f3, Integer num) {
                                invoke(interfaceC0928f, interfaceC1084f3, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC0928f AnimatedVisibility, InterfaceC1084f interfaceC1084f3, int i20) {
                                kotlin.jvm.internal.i.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                                float f10 = 48;
                                androidx.compose.ui.h hVarA = C0935g.a(W.m(PaddingKt.f(aVar2, JumpToBottomKt.getJumpBottomPadding()), f10), 1, IntercomTheme.INSTANCE.getColors(interfaceC1084f3, 6).m632getDivider0d7_KjU(), p270w.g.a(50));
                                Ia.a<p293xa.r> aVar3 = aVar;
                                long j27 = j25;
                                final long j28 = j26;
                                E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarA);
                                ComposeUiNode.f14331c0.getClass();
                                Ia.a<ComposeUiNode> aVar4 = ComposeUiNode.Companion.f14333b;
                                if (interfaceC1084f3.u() == null) {
                                    I.b.k();
                                    throw null;
                                }
                                interfaceC1084f3.r();
                                if (interfaceC1084f3.m()) {
                                    interfaceC1084f3.v(aVar4);
                                } else {
                                    interfaceC1084f3.A();
                                }
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                FloatingActionButtonKt.a(aVar3, W.m(aVar2, f10), p270w.g.a(50), j27, 0L, null, null, androidx.compose.runtime.internal.a.b(2122957953, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2$1$1$1
                                    @Override // Ia.p
                                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num) {
                                        invoke(interfaceC1084f4, num.intValue());
                                        return p293xa.r.f47939a;
                                    }

                                    public final void invoke(InterfaceC1084f interfaceC1084f4, int i21) {
                                        if ((i21 & 11) == 2 && interfaceC1084f4.s()) {
                                            interfaceC1084f4.w();
                                        } else {
                                            IconKt.a(U.c.a(io.intercom.android.sdk.ui.R.drawable.intercom_ic_chevron_down, interfaceC1084f4, 0), "Jump to bottom", W.m(androidx.compose.ui.h.a.f13984b, 24), j28, interfaceC1084f4, 440, 0);
                                        }
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 12582960, R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                                interfaceC1084f3.J();
                            }
                        }, interfaceC1084f2), interfaceC1084f2, 196608, 26);
                    }
                }, c1086gP), c1086gP, ((i12 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 390, 0);
                hVar3 = hVar2;
                j13 = jM621getBackground0d7_KjU;
            }
            j14 = chevronColor;
            str3 = str2;
            j15 = jM639getOnAction0d7_KjU;
            j16 = jM615getAction0d7_KjU;
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.q
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return JumpToBottomKt.JumpToBottom_kNRdK3w$lambda$0(hVar3, j13, j14, str3, j16, j15, onClick, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i13 = 1572864;
        i12 |= i13;
        if ((2995931 & i12) == 599186) {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i16 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if ((i11 & 2) != 0) {
                    jM621getBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m621getBackground0d7_KjU();
                    i12 &= -113;
                } else {
                    jM621getBackground0d7_KjU = j;
                }
                if ((i11 & 4) != 0) {
                    chevronColor = getChevronColor(c1086gP, 0);
                    i12 &= -897;
                }
                if (i18 != 0) {
                    str2 = null;
                }
                if ((i11 & 16) != 0) {
                    jM615getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m615getAction0d7_KjU();
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    jM639getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m639getOnAction0d7_KjU();
                    i12 &= -458753;
                }
            } else {
                if (i16 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if ((i11 & 2) != 0) {
                    jM621getBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m621getBackground0d7_KjU();
                    i12 &= -113;
                } else {
                    jM621getBackground0d7_KjU = j;
                }
                if ((i11 & 4) != 0) {
                    chevronColor = getChevronColor(c1086gP, 0);
                    i12 &= -897;
                }
                if (i18 != 0) {
                    str2 = null;
                }
                if ((i11 & 16) != 0) {
                    jM615getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m615getAction0d7_KjU();
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    jM639getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m639getOnAction0d7_KjU();
                    i12 &= -458753;
                }
            }
            c1086gP.U();
            final String str9 = str2;
            final long j1112 = jM615getAction0d7_KjU;
            final long j1113 = jM639getOnAction0d7_KjU;
            ComposableLambdaImpl composableLambdaImplB6 = androidx.compose.runtime.internal.a.b(-1557616541, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$1
                @Override // Ia.q
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i19) {
                    kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                    if ((i19 & 81) == 16 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    String str10 = str9;
                    if (str10 == null) {
                        return;
                    }
                    JumpToBottomKt.m544UnreadBadgeeaDK9VM(OffsetKt.b((-5) - JumpToBottomKt.getJumpBottomPadding(), JumpToBottomKt.getJumpBottomPadding(), androidx.compose.ui.h.a.f13984b), str10, j1112, j1113, interfaceC1084f2, 6, 0);
                }
            }, c1086gP);
            final long j1114 = jM621getBackground0d7_KjU;
            final long j25 = chevronColor;
            BadgeKt.b(composableLambdaImplB6, hVar2, androidx.compose.runtime.internal.a.b(1814183329, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2
                @Override // Ia.q
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i19) {
                    kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                    if ((i19 & 81) == 16 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    interfaceC1084f2.L(-1483768023);
                    Object objF = interfaceC1084f2.f();
                    Object obj = objF;
                    if (objF == InterfaceC1084f.a.f12980a) {
                        K k10 = new K(Boolean.FALSE);
                        k10.f(Boolean.TRUE);
                        interfaceC1084f2.E(k10);
                        obj = k10;
                    }
                    interfaceC1084f2.D();
                    androidx.compose.animation.m mVarFloatingButtonEnterTransition = TransitionsKt.floatingButtonEnterTransition((int) ((p013b0.c) interfaceC1084f2.x(CompositionLocalsKt.f14847h)).T0(JumpToBottomKt.getJumpBottomPadding()));
                    final Ia.a<p293xa.r> aVar = onClick;
                    final long j26 = j1114;
                    final long j27 = j25;
                    AnimatedVisibilityKt.b((K) obj, null, mVarFloatingButtonEnterTransition, null, null, androidx.compose.runtime.internal.a.b(600504953, new Ia.q<InterfaceC0928f, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2.1
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0928f interfaceC0928f, InterfaceC1084f interfaceC1084f3, Integer num) {
                            invoke(interfaceC0928f, interfaceC1084f3, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC0928f AnimatedVisibility, InterfaceC1084f interfaceC1084f3, int i20) {
                            kotlin.jvm.internal.i.e(AnimatedVisibility, "$this$AnimatedVisibility");
                            androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                            float f10 = 48;
                            androidx.compose.ui.h hVarA = C0935g.a(W.m(PaddingKt.f(aVar2, JumpToBottomKt.getJumpBottomPadding()), f10), 1, IntercomTheme.INSTANCE.getColors(interfaceC1084f3, 6).m632getDivider0d7_KjU(), p270w.g.a(50));
                            Ia.a<p293xa.r> aVar3 = aVar;
                            long j28 = j26;
                            final long j29 = j27;
                            E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarA);
                            ComposeUiNode.f14331c0.getClass();
                            Ia.a<ComposeUiNode> aVar4 = ComposeUiNode.Companion.f14333b;
                            if (interfaceC1084f3.u() == null) {
                                I.b.k();
                                throw null;
                            }
                            interfaceC1084f3.r();
                            if (interfaceC1084f3.m()) {
                                interfaceC1084f3.v(aVar4);
                            } else {
                                interfaceC1084f3.A();
                            }
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                            FloatingActionButtonKt.a(aVar3, W.m(aVar2, f10), p270w.g.a(50), j28, 0L, null, null, androidx.compose.runtime.internal.a.b(2122957953, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2$1$1$1
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num) {
                                    invoke(interfaceC1084f4, num.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f4, int i21) {
                                    if ((i21 & 11) == 2 && interfaceC1084f4.s()) {
                                        interfaceC1084f4.w();
                                    } else {
                                        IconKt.a(U.c.a(io.intercom.android.sdk.ui.R.drawable.intercom_ic_chevron_down, interfaceC1084f4, 0), "Jump to bottom", W.m(androidx.compose.ui.h.a.f13984b, 24), j29, interfaceC1084f4, 440, 0);
                                    }
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 12582960, R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                            interfaceC1084f3.J();
                        }
                    }, interfaceC1084f2), interfaceC1084f2, 196608, 26);
                }
            }, c1086gP), c1086gP, ((i12 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 390, 0);
            hVar3 = hVar2;
            j13 = jM621getBackground0d7_KjU;
        } else {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i16 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if ((i11 & 2) != 0) {
                    jM621getBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m621getBackground0d7_KjU();
                    i12 &= -113;
                } else {
                    jM621getBackground0d7_KjU = j;
                }
                if ((i11 & 4) != 0) {
                    chevronColor = getChevronColor(c1086gP, 0);
                    i12 &= -897;
                }
                if (i18 != 0) {
                    str2 = null;
                }
                if ((i11 & 16) != 0) {
                    jM615getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m615getAction0d7_KjU();
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    jM639getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m639getOnAction0d7_KjU();
                    i12 &= -458753;
                }
            } else {
                if (i16 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if ((i11 & 2) != 0) {
                    jM621getBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m621getBackground0d7_KjU();
                    i12 &= -113;
                } else {
                    jM621getBackground0d7_KjU = j;
                }
                if ((i11 & 4) != 0) {
                    chevronColor = getChevronColor(c1086gP, 0);
                    i12 &= -897;
                }
                if (i18 != 0) {
                    str2 = null;
                }
                if ((i11 & 16) != 0) {
                    jM615getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m615getAction0d7_KjU();
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    jM639getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m639getOnAction0d7_KjU();
                    i12 &= -458753;
                }
            }
            c1086gP.U();
            final String str10 = str2;
            final long j1115 = jM615getAction0d7_KjU;
            final long j1116 = jM639getOnAction0d7_KjU;
            ComposableLambdaImpl composableLambdaImplB7 = androidx.compose.runtime.internal.a.b(-1557616541, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$1
                @Override // Ia.q
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i19) {
                    kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                    if ((i19 & 81) == 16 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    String str11 = str10;
                    if (str11 == null) {
                        return;
                    }
                    JumpToBottomKt.m544UnreadBadgeeaDK9VM(OffsetKt.b((-5) - JumpToBottomKt.getJumpBottomPadding(), JumpToBottomKt.getJumpBottomPadding(), androidx.compose.ui.h.a.f13984b), str11, j1115, j1116, interfaceC1084f2, 6, 0);
                }
            }, c1086gP);
            final long j1117 = jM621getBackground0d7_KjU;
            final long j26 = chevronColor;
            BadgeKt.b(composableLambdaImplB7, hVar2, androidx.compose.runtime.internal.a.b(1814183329, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2
                @Override // Ia.q
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC0948h, interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC0948h BadgedBox, InterfaceC1084f interfaceC1084f2, int i19) {
                    kotlin.jvm.internal.i.e(BadgedBox, "$this$BadgedBox");
                    if ((i19 & 81) == 16 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    interfaceC1084f2.L(-1483768023);
                    Object objF = interfaceC1084f2.f();
                    Object obj = objF;
                    if (objF == InterfaceC1084f.a.f12980a) {
                        K k10 = new K(Boolean.FALSE);
                        k10.f(Boolean.TRUE);
                        interfaceC1084f2.E(k10);
                        obj = k10;
                    }
                    interfaceC1084f2.D();
                    androidx.compose.animation.m mVarFloatingButtonEnterTransition = TransitionsKt.floatingButtonEnterTransition((int) ((p013b0.c) interfaceC1084f2.x(CompositionLocalsKt.f14847h)).T0(JumpToBottomKt.getJumpBottomPadding()));
                    final Ia.a<p293xa.r> aVar = onClick;
                    final long j27 = j1117;
                    final long j28 = j26;
                    AnimatedVisibilityKt.b((K) obj, null, mVarFloatingButtonEnterTransition, null, null, androidx.compose.runtime.internal.a.b(600504953, new Ia.q<InterfaceC0928f, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2.1
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0928f interfaceC0928f, InterfaceC1084f interfaceC1084f3, Integer num) {
                            invoke(interfaceC0928f, interfaceC1084f3, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC0928f AnimatedVisibility, InterfaceC1084f interfaceC1084f3, int i20) {
                            kotlin.jvm.internal.i.e(AnimatedVisibility, "$this$AnimatedVisibility");
                            androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                            float f10 = 48;
                            androidx.compose.ui.h hVarA = C0935g.a(W.m(PaddingKt.f(aVar2, JumpToBottomKt.getJumpBottomPadding()), f10), 1, IntercomTheme.INSTANCE.getColors(interfaceC1084f3, 6).m632getDivider0d7_KjU(), p270w.g.a(50));
                            Ia.a<p293xa.r> aVar3 = aVar;
                            long j29 = j27;
                            final long j210 = j28;
                            E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarA);
                            ComposeUiNode.f14331c0.getClass();
                            Ia.a<ComposeUiNode> aVar4 = ComposeUiNode.Companion.f14333b;
                            if (interfaceC1084f3.u() == null) {
                                I.b.k();
                                throw null;
                            }
                            interfaceC1084f3.r();
                            if (interfaceC1084f3.m()) {
                                interfaceC1084f3.v(aVar4);
                            } else {
                                interfaceC1084f3.A();
                            }
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                            FloatingActionButtonKt.a(aVar3, W.m(aVar2, f10), p270w.g.a(50), j29, 0L, null, null, androidx.compose.runtime.internal.a.b(2122957953, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$JumpToBottom$2$1$1$1
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num) {
                                    invoke(interfaceC1084f4, num.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f4, int i21) {
                                    if ((i21 & 11) == 2 && interfaceC1084f4.s()) {
                                        interfaceC1084f4.w();
                                    } else {
                                        IconKt.a(U.c.a(io.intercom.android.sdk.ui.R.drawable.intercom_ic_chevron_down, interfaceC1084f4, 0), "Jump to bottom", W.m(androidx.compose.ui.h.a.f13984b, 24), j210, interfaceC1084f4, 440, 0);
                                    }
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 12582960, R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                            interfaceC1084f3.J();
                        }
                    }, interfaceC1084f2), interfaceC1084f2, 196608, 26);
                }
            }, c1086gP), c1086gP, ((i12 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 390, 0);
            hVar3 = hVar2;
            j13 = jM621getBackground0d7_KjU;
        }
        j14 = chevronColor;
        str3 = str2;
        j15 = jM639getOnAction0d7_KjU;
        j16 = jM615getAction0d7_KjU;
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.q
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return JumpToBottomKt.JumpToBottom_kNRdK3w$lambda$0(hVar3, j13, j14, str3, j16, j15, onClick, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    @IntercomPreviews
    private static final void JumpToBottomPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1260816059);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$JumpToBottomKt.INSTANCE.m515getLambda1$intercom_sdk_ui_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new E0(i10, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r JumpToBottomPreview$lambda$1(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        JumpToBottomPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r JumpToBottom_kNRdK3w$lambda$0(androidx.compose.ui.h hVar, long j, long j10, String str, long j11, long j12, Ia.a onClick, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(onClick, "$onClick");
        m543JumpToBottomkNRdK3w(hVar, j, j10, str, j11, j12, onClick, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: UnreadBadge-eaDK9VM, reason: not valid java name */
    public static final void m544UnreadBadgeeaDK9VM(androidx.compose.ui.h hVar, final String str, long j, long j10, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        androidx.compose.ui.h hVar2;
        int i12;
        long jM615getAction0d7_KjU;
        long jM639getOnAction0d7_KjU;
        final androidx.compose.ui.h hVar3;
        final long j11;
        final long j12;
        C1086g c1086gP = interfaceC1084f.p(885989429);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            hVar2 = hVar;
        } else if ((i10 & 14) == 0) {
            hVar2 = hVar;
            i12 = (c1086gP.K(hVar2) ? 4 : 2) | i10;
        } else {
            hVar2 = hVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= c1086gP.K(str) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                jM615getAction0d7_KjU = j;
                int i14 = c1086gP.i(jM615getAction0d7_KjU) ? 256 : 128;
                i12 |= i14;
            } else {
                jM615getAction0d7_KjU = j;
            }
            i12 |= i14;
        } else {
            jM615getAction0d7_KjU = j;
        }
        if ((i10 & 7168) == 0) {
            if ((i11 & 8) == 0) {
                jM639getOnAction0d7_KjU = j10;
                int i15 = c1086gP.i(jM639getOnAction0d7_KjU) ? 2048 : 1024;
                i12 |= i15;
            } else {
                jM639getOnAction0d7_KjU = j10;
            }
            i12 |= i15;
        } else {
            jM639getOnAction0d7_KjU = j10;
        }
        if ((i12 & 5851) == 1170 && c1086gP.s()) {
            c1086gP.w();
            hVar3 = hVar2;
            j11 = jM615getAction0d7_KjU;
            j12 = jM639getOnAction0d7_KjU;
        } else {
            c1086gP.r0();
            if ((i10 & 1) == 0 || c1086gP.a0()) {
                hVar3 = i13 != 0 ? androidx.compose.ui.h.a.f13984b : hVar2;
                if ((i11 & 4) != 0) {
                    jM615getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m615getAction0d7_KjU();
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    jM639getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, 6).m639getOnAction0d7_KjU();
                    i12 &= -7169;
                }
            } else {
                c1086gP.w();
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                }
                hVar3 = hVar2;
            }
            final long j13 = jM639getOnAction0d7_KjU;
            int i16 = i12;
            c1086gP.U();
            BadgeKt.a(hVar3, jM615getAction0d7_KjU, 0L, androidx.compose.runtime.internal.a.b(-480925784, new Ia.q<U, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.JumpToBottomKt$UnreadBadge$1
                @Override // Ia.q
                public /* bridge */ /* synthetic */ p293xa.r invoke(U u10, InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(u10, interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(U Badge, InterfaceC1084f interfaceC1084f2, int i17) {
                    kotlin.jvm.internal.i.e(Badge, "$this$Badge");
                    if ((i17 & 81) == 16 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    TextKt.b(str, androidx.compose.ui.h.a.f13984b, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, 6).getType05(), j13, G0.a.g(12), androidx.compose.ui.text.font.l.j, null, 0L, null, 3, 0L, null, null, 16744440), interfaceC1084f2, 48, 0, 65532);
                }
            }, c1086gP), c1086gP, (i16 & 14) | 3072 | ((i16 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 4);
            j11 = jM615getAction0d7_KjU;
            j12 = j13;
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.r
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return JumpToBottomKt.UnreadBadge_eaDK9VM$lambda$2(hVar3, str, j11, j12, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r UnreadBadge_eaDK9VM$lambda$2(androidx.compose.ui.h hVar, String badgeText, long j, long j10, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(badgeText, "$badgeText");
        m544UnreadBadgeeaDK9VM(hVar, badgeText, j, j10, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    private static final long getChevronColor(InterfaceC1084f interfaceC1084f, int i10) {
        long jM616getActionContrastWhite0d7_KjU;
        interfaceC1084f.L(179733836);
        int i11 = WhenMappings.$EnumSwitchMapping$0[IntercomColorsKt.getCurrentThemeMode().getValue().ordinal()];
        if (i11 == 1) {
            interfaceC1084f.L(-131337428);
            interfaceC1084f.D();
            jM616getActionContrastWhite0d7_KjU = H.f13499f;
        } else if (i11 == 2) {
            interfaceC1084f.L(-131335814);
            jM616getActionContrastWhite0d7_KjU = IntercomTheme.INSTANCE.getColors(interfaceC1084f, 6).m616getActionContrastWhite0d7_KjU();
            interfaceC1084f.D();
        } else {
            if (i11 != 3) {
                interfaceC1084f.L(-131339113);
                interfaceC1084f.D();
                throw new NoWhenBranchMatchedException();
            }
            interfaceC1084f.L(223602727);
            jM616getActionContrastWhite0d7_KjU = O.e.w(interfaceC1084f) ? H.f13499f : IntercomTheme.INSTANCE.getColors(interfaceC1084f, 6).m616getActionContrastWhite0d7_KjU();
            interfaceC1084f.D();
        }
        interfaceC1084f.D();
        return jM616getActionContrastWhite0d7_KjU;
    }

    public static final float getJumpBottomPadding() {
        return JumpBottomPadding;
    }
}
