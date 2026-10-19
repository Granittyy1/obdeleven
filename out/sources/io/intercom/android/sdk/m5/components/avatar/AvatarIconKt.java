package io.intercom.android.sdk.m5.components.avatar;

import Ia.p;
import android.content.Context;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.C0935g;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.X;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.Z;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.t;
import androidx.compose.ui.semantics.w;
import coil.compose.AsyncImagePainter;
import coil.compose.u;
import coil.compose.v;
import io.intercom.android.sdk.helpcenter.articles.x;
import io.intercom.android.sdk.m5.components.A0;
import io.intercom.android.sdk.m5.components.Y;
import io.intercom.android.sdk.m5.components.z0;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.n;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: AvatarIcon.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AvatarIconKt {

    /* JADX INFO: compiled from: AvatarIcon.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AvatarShape.values().length];
            try {
                iArr[AvatarShape.CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AvatarShape.SQUIRCLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AvatarActiveIndicator(androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        int i12;
        C1086g c1086gP = interfaceC1084f.p(-1051352444);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.K(hVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 11) == 2 && c1086gP.s()) {
            c1086gP.w();
        } else {
            if (i13 != 0) {
                hVar = androidx.compose.ui.h.a.f13984b;
            }
            final long jM617getActive0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m617getActive0d7_KjU();
            androidx.compose.ui.h hVarM = W.m(hVar, 8);
            c1086gP.L(821186808);
            boolean zI = c1086gP.i(jM617getActive0d7_KjU);
            Object objF = c1086gP.f();
            if (zI || objF == InterfaceC1084f.a.f12980a) {
                objF = new Ia.l() { // from class: io.intercom.android.sdk.m5.components.avatar.d
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return AvatarIconKt.AvatarActiveIndicator$lambda$16$lambda$15(jM617getActive0d7_KjU, (J.e) obj);
                    }
                };
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            CanvasKt.a(hVarM, (Ia.l) objF, c1086gP, 0);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new e(hVar, i10, i11, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r AvatarActiveIndicator$lambda$16$lambda$15(long j, J.e Canvas) {
        kotlin.jvm.internal.i.e(Canvas, "$this$Canvas");
        Canvas.S(j, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 2) != 0 ? I.h.c(Canvas.j()) / 2.0f : 0.0f, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 4) != 0 ? Canvas.j1() : 0L, 1.0f, J.h.f3954a, null, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 64) != 0 ? 3 : 0);
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r AvatarActiveIndicator$lambda$17(androidx.compose.ui.h hVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        AvatarActiveIndicator(hVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return r.f47939a;
    }

    /* JADX INFO: renamed from: AvatarIcon-Rd90Nhg, reason: not valid java name */
    public static final void m131AvatarIconRd90Nhg(androidx.compose.ui.h hVar, final AvatarWrapper avatarWrapper, l0 l0Var, boolean z10, long j, H h8, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        l0 composeShape;
        int i12;
        long j10;
        kotlin.jvm.internal.i.e(avatarWrapper, "avatarWrapper");
        C1086g c1086gP = interfaceC1084f.p(462320907);
        androidx.compose.ui.h hVar2 = (i11 & 1) != 0 ? androidx.compose.ui.h.a.f13984b : hVar;
        if ((i11 & 4) != 0) {
            AvatarShape shape = avatarWrapper.getAvatar().getShape();
            kotlin.jvm.internal.i.d(shape, "getShape(...)");
            i12 = i10 & (-897);
            composeShape = getComposeShape(shape);
        } else {
            composeShape = l0Var;
            i12 = i10;
        }
        boolean z11 = (i11 & 8) != 0 ? false : z10;
        if ((i11 & 16) != 0) {
            i12 &= -57345;
            j10 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04Point5().f15318a.f15691b;
        } else {
            j10 = j;
        }
        H h10 = (i11 & 32) != 0 ? null : h8;
        if (kotlin.jvm.internal.i.a(composeShape, getComposeShape(AvatarShape.SQUIRCLE))) {
            c1086gP.L(1816789334);
            FinAvatar(hVar2, avatarWrapper, composeShape, c1086gP, (i12 & 14) | 64 | (i12 & 896), 0);
            c1086gP.T(false);
        } else {
            c1086gP.L(1816937855);
            m133DefaultAvatarRd90Nhg(avatarWrapper, hVar2, composeShape, z11, j10, h10, c1086gP, ((i12 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8 | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
            c1086gP.T(false);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final long j11 = j10;
            final androidx.compose.ui.h hVar3 = hVar2;
            final H h11 = h10;
            final l0 l0Var2 = composeShape;
            final boolean z12 = z11;
            c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.m5.components.avatar.i
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AvatarIconKt.AvatarIcon_Rd90Nhg$lambda$0(hVar3, avatarWrapper, l0Var2, z12, j11, h11, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    @IntercomPreviews
    private static final void AvatarIconActivePreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-382759013);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AvatarIconKt.INSTANCE.m135getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new A0(i10, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r AvatarIconActivePreview$lambda$23(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        AvatarIconActivePreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    @IntercomPreviews
    private static final void AvatarIconCutPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1591864993);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AvatarIconKt.INSTANCE.m137getLambda4$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new x(i10, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r AvatarIconCutPreview$lambda$25(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        AvatarIconCutPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    @IntercomPreviews
    private static final void AvatarIconPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1461886463);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AvatarIconKt.INSTANCE.m134getLambda1$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new a(i10, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r AvatarIconPreview$lambda$22(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        AvatarIconPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    @IntercomPreviews
    private static final void AvatarIconSquirclePreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1626854011);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AvatarIconKt.INSTANCE.m136getLambda3$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Y(i10, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r AvatarIconSquirclePreview$lambda$24(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        AvatarIconSquirclePreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r AvatarIcon_Rd90Nhg$lambda$0(androidx.compose.ui.h hVar, AvatarWrapper avatarWrapper, l0 l0Var, boolean z10, long j, H h8, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(avatarWrapper, "$avatarWrapper");
        m131AvatarIconRd90Nhg(hVar, avatarWrapper, l0Var, z10, j, h8, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:74:0x0103  */
    /* JADX WARN: Code duplicated, block: B:76:0x0117  */
    /* JADX WARN: Code duplicated, block: B:77:0x0119  */
    /* JADX WARN: Code duplicated, block: B:80:0x0120  */
    /* JADX WARN: Code duplicated, block: B:82:0x0124  */
    /* JADX WARN: Code duplicated, block: B:84:0x017e  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: AvatarPlaceholder-jxWH9Kg, reason: not valid java name */
    private static final void m132AvatarPlaceholderjxWH9Kg(androidx.compose.ui.h hVar, final String str, final long j, final long j10, final String str2, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        final androidx.compose.ui.h hVar2;
        int i12;
        int i13;
        int i14;
        androidx.compose.ui.h.a aVar;
        int i15;
        Ia.a<ComposeUiNode> aVar2;
        p<ComposeUiNode, Integer, r> pVar;
        C1086g c1086g;
        boolean z10;
        Object objF;
        C1105p0 c1105p0V;
        C1086g c1086gP = interfaceC1084f.p(-99590848);
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
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= c1086gP.K(str) ? 32 : 16;
        }
        if ((i11 & 4) == 0) {
            if ((i10 & 896) == 0) {
                i12 |= c1086gP.i(j) ? 256 : 128;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (c1086gP.i(j10)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i12 |= i13;
            }
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((i10 & 57344) == 0) {
                if (c1086gP.K(str2)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            if ((46811 & i12) == 9362 || !c1086gP.s()) {
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i16 != 0) {
                    hVar2 = aVar;
                }
                E eD = BoxKt.d(androidx.compose.ui.d.a.f13339e, false);
                i15 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVar2);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i15))) {
                    J4.i.d(i15, c1086gP, i15, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
                if (n.S(str)) {
                    c1086gP.L(-2026212151);
                    c1086g = c1086gP;
                    IconKt.a(U.c.a(io.intercom.android.sdk.R.drawable.intercom_ic_avatar_person, c1086gP, 0), str2, PaddingKt.f(hVar2, 8), j, c1086gP, 8 | ((i12 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i12 << 3) & 7168), 0);
                    c1086g.T(false);
                } else {
                    c1086gP.L(-2026561893);
                    c1086gP.L(-758107778);
                    if ((57344 & i12) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objF = c1086gP.f();
                    if (z10 || objF == InterfaceC1084f.a.f12980a) {
                        objF = new com.voltasit.obdeleven.presentation.controlUnit.basicsettings.c(1, str2);
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    TextKt.b(str, androidx.compose.ui.semantics.p.b(aVar, false, (Ia.l) objF), j, j10, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04Point5(), c1086gP, ((i12 >> 3) & 14) | (i12 & 896) | (i12 & 7168), 0, 65520);
                    c1086gP.T(false);
                    c1086g = c1086gP;
                }
                c1086g.T(true);
                hVar2 = hVar2;
            } else {
                c1086gP.w();
                c1086g = c1086gP;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.m5.components.avatar.b
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AvatarIconKt.AvatarPlaceholder_jxWH9Kg$lambda$21(hVar2, str, j, j10, str2, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 384;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (c1086gP.i(j10)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((i10 & 57344) == 0) {
            if (c1086gP.K(str2)) {
                i14 = 16384;
            } else {
                i14 = 8192;
            }
            i12 |= i14;
        }
        if ((46811 & i12) == 9362) {
            aVar = androidx.compose.ui.h.a.f13984b;
            if (i16 != 0) {
                hVar2 = aVar;
            }
            E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13339e, false);
            i15 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVar2);
            ComposeUiNode.f14331c0.getClass();
            aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD2);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P2);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i15, c1086gP, i15, pVar);
            } else {
                J4.i.d(i15, c1086gP, i15, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
            if (n.S(str)) {
                c1086gP.L(-2026561893);
                c1086gP.L(-758107778);
                if ((57344 & i12) == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objF = c1086gP.f();
                if (z10) {
                    objF = new com.voltasit.obdeleven.presentation.controlUnit.basicsettings.c(1, str2);
                    c1086gP.E(objF);
                } else {
                    objF = new com.voltasit.obdeleven.presentation.controlUnit.basicsettings.c(1, str2);
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                TextKt.b(str, androidx.compose.ui.semantics.p.b(aVar, false, (Ia.l) objF), j, j10, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04Point5(), c1086gP, ((i12 >> 3) & 14) | (i12 & 896) | (i12 & 7168), 0, 65520);
                c1086gP.T(false);
                c1086g = c1086gP;
            } else {
                c1086gP.L(-2026212151);
                c1086g = c1086gP;
                IconKt.a(U.c.a(io.intercom.android.sdk.R.drawable.intercom_ic_avatar_person, c1086gP, 0), str2, PaddingKt.f(hVar2, 8), j, c1086gP, 8 | ((i12 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i12 << 3) & 7168), 0);
                c1086g.T(false);
            }
            c1086g.T(true);
            hVar2 = hVar2;
        } else {
            aVar = androidx.compose.ui.h.a.f13984b;
            if (i16 != 0) {
                hVar2 = aVar;
            }
            E eD3 = BoxKt.d(androidx.compose.ui.d.a.f13339e, false);
            i15 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVar2);
            ComposeUiNode.f14331c0.getClass();
            aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD3);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P3);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i15, c1086gP, i15, pVar);
            } else {
                J4.i.d(i15, c1086gP, i15, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC3);
            if (n.S(str)) {
                c1086gP.L(-2026561893);
                c1086gP.L(-758107778);
                if ((57344 & i12) == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objF = c1086gP.f();
                if (z10) {
                    objF = new com.voltasit.obdeleven.presentation.controlUnit.basicsettings.c(1, str2);
                    c1086gP.E(objF);
                } else {
                    objF = new com.voltasit.obdeleven.presentation.controlUnit.basicsettings.c(1, str2);
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                TextKt.b(str, androidx.compose.ui.semantics.p.b(aVar, false, (Ia.l) objF), j, j10, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04Point5(), c1086gP, ((i12 >> 3) & 14) | (i12 & 896) | (i12 & 7168), 0, 65520);
                c1086gP.T(false);
                c1086g = c1086gP;
            } else {
                c1086gP.L(-2026212151);
                c1086g = c1086gP;
                IconKt.a(U.c.a(io.intercom.android.sdk.R.drawable.intercom_ic_avatar_person, c1086gP, 0), str2, PaddingKt.f(hVar2, 8), j, c1086gP, 8 | ((i12 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i12 << 3) & 7168), 0);
                c1086g.T(false);
            }
            c1086g.T(true);
            hVar2 = hVar2;
        }
        c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.m5.components.avatar.b
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AvatarIconKt.AvatarPlaceholder_jxWH9Kg$lambda$21(hVar2, str, j, j10, str2, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r AvatarPlaceholder_jxWH9Kg$lambda$20$lambda$19$lambda$18(String contentDescription, w semantics) {
        kotlin.jvm.internal.i.e(contentDescription, "$contentDescription");
        kotlin.jvm.internal.i.e(semantics, "$this$semantics");
        t.g(contentDescription, semantics);
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r AvatarPlaceholder_jxWH9Kg$lambda$21(androidx.compose.ui.h hVar, String avatarInitials, long j, long j10, String contentDescription, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(avatarInitials, "$avatarInitials");
        kotlin.jvm.internal.i.e(contentDescription, "$contentDescription");
        m132AvatarPlaceholderjxWH9Kg(hVar, avatarInitials, j, j10, contentDescription, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return r.f47939a;
    }

    private static final void BotAvatarPlaceholder(final AvatarWrapper avatarWrapper, androidx.compose.ui.h hVar, float f10, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        C1086g c1086gP = interfaceC1084f.p(1859249921);
        androidx.compose.ui.h hVar2 = (i11 & 2) != 0 ? androidx.compose.ui.h.a.f13984b : hVar;
        float f11 = (i11 & 4) != 0 ? 1.0f : f10;
        ImageKt.a(U.c.a(io.intercom.android.sdk.R.drawable.intercom_default_avatar_icon, c1086gP, 0), avatarWrapper.getAvatar().getLabel(), hVar2, null, null, f11, null, c1086gP, ((i10 << 3) & 896) | 8 | ((i10 << 9) & 458752), 88);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final androidx.compose.ui.h hVar3 = hVar2;
            final float f12 = f11;
            c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.m5.components.avatar.h
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AvatarIconKt.BotAvatarPlaceholder$lambda$14(avatarWrapper, hVar3, f12, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r BotAvatarPlaceholder$lambda$14(AvatarWrapper avatarWrapper, androidx.compose.ui.h hVar, float f10, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(avatarWrapper, "$avatarWrapper");
        BotAvatarPlaceholder(avatarWrapper, hVar, f10, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return r.f47939a;
    }

    @IntercomPreviews
    private static final void BotAvatarPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1158049743);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AvatarIconKt.INSTANCE.m138getLambda5$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new z0(i10, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r BotAvatarPreview$lambda$26(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        BotAvatarPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    /* JADX INFO: renamed from: DefaultAvatar-Rd90Nhg, reason: not valid java name */
    private static final void m133DefaultAvatarRd90Nhg(final AvatarWrapper avatarWrapper, androidx.compose.ui.h hVar, l0 l0Var, boolean z10, long j, H h8, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        l0 composeShape;
        int i12;
        long j10;
        C1086g c1086gP = interfaceC1084f.p(386725315);
        final androidx.compose.ui.h hVar2 = (i11 & 2) != 0 ? androidx.compose.ui.h.a.f13984b : hVar;
        if ((i11 & 4) != 0) {
            i12 = i10 & (-897);
            composeShape = getComposeShape(AvatarShape.CIRCLE);
        } else {
            composeShape = l0Var;
            i12 = i10;
        }
        boolean z11 = (i11 & 8) != 0 ? false : z10;
        if ((i11 & 16) != 0) {
            i12 &= -57345;
            j10 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04Point5().f15318a.f15691b;
        } else {
            j10 = j;
        }
        H h10 = (i11 & 32) != 0 ? null : h8;
        long jM615getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m615getAction0d7_KjU();
        c1086gP.L(870365600);
        Object objF = c1086gP.f();
        InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
        if (objF == c0153a) {
            objF = J0.f(new H(h10 != null ? h10.f13506a : ColorExtensionsKt.m657darken8_81llA(jM615getAction0d7_KjU)));
            c1086gP.E(objF);
        }
        X x10 = (X) objF;
        c1086gP.T(false);
        long jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(DefaultAvatar_Rd90Nhg$lambda$2(x10));
        boolean zM664isDarkColor8_81llA = ColorExtensionsKt.m664isDarkColor8_81llA(DefaultAvatar_Rd90Nhg$lambda$2(x10));
        c1086gP.L(870372748);
        Object objF2 = c1086gP.f();
        if (objF2 == c0153a) {
            objF2 = J0.f(new p013b0.f(8));
            c1086gP.E(objF2);
        }
        X x11 = (X) objF2;
        c1086gP.T(false);
        c1086gP.L(870374477);
        Object objF3 = c1086gP.f();
        if (objF3 == c0153a) {
            objF3 = J0.f(composeShape);
            c1086gP.E(objF3);
        }
        c1086gP.T(false);
        BoxWithConstraintsKt.a(hVar2, null, false, androidx.compose.runtime.internal.a.b(-1891463123, new AvatarIconKt$DefaultAvatar$1(z11, composeShape, zM664isDarkColor8_81llA, x11, (X) objF3, x10, avatarWrapper, jM615getAction0d7_KjU, h10, jM658generateTextColor8_81llA, j10), c1086gP), c1086gP, ((i12 >> 3) & 14) | 3072, 6);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final H h11 = h10;
            final long j11 = j10;
            final l0 l0Var2 = composeShape;
            final boolean z12 = z11;
            c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.m5.components.avatar.f
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$10(avatarWrapper, hVar2, l0Var2, z12, j11, h11, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DefaultAvatar_Rd90Nhg$Placeholder(AvatarWrapper avatarWrapper, long j, long j10, androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        interfaceC1084f.L(1593692287);
        androidx.compose.ui.h hVar2 = (i11 & 1) != 0 ? androidx.compose.ui.h.a.f13984b : hVar;
        if (avatarWrapper.isBot()) {
            interfaceC1084f.L(-730785003);
            BotAvatarPlaceholder(avatarWrapper, PaddingKt.f(hVar2, 8), 0.0f, interfaceC1084f, 8, 4);
            interfaceC1084f.D();
        } else {
            interfaceC1084f.L(-730619029);
            m132AvatarPlaceholderjxWH9Kg(hVar2, avatarWrapper.getInitials(), j, j10, avatarWrapper.getLabel(), interfaceC1084f, i10 & 14, 0);
            interfaceC1084f.D();
        }
        interfaceC1084f.D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r DefaultAvatar_Rd90Nhg$lambda$10(AvatarWrapper avatarWrapper, androidx.compose.ui.h hVar, l0 l0Var, boolean z10, long j, H h8, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(avatarWrapper, "$avatarWrapper");
        m133DefaultAvatarRd90Nhg(avatarWrapper, hVar, l0Var, z10, j, h8, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long DefaultAvatar_Rd90Nhg$lambda$2(X<H> x10) {
        return x10.getValue().f13506a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DefaultAvatar_Rd90Nhg$lambda$3(X<H> x10, long j) {
        x10.setValue(new H(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float DefaultAvatar_Rd90Nhg$lambda$5(X<p013b0.f> x10) {
        return x10.getValue().f20481b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DefaultAvatar_Rd90Nhg$lambda$6(X<p013b0.f> x10, float f10) {
        x10.setValue(new p013b0.f(f10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l0 DefaultAvatar_Rd90Nhg$lambda$8(X<l0> x10) {
        return x10.getValue();
    }

    private static final void FinAvatar(androidx.compose.ui.h hVar, final AvatarWrapper avatarWrapper, l0 l0Var, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        C1086g c1086g;
        C1086g c1086gP = interfaceC1084f.p(-1375245291);
        int i12 = i11 & 1;
        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
        androidx.compose.ui.h hVar2 = i12 != 0 ? aVar : hVar;
        l0 composeShape = (i11 & 4) != 0 ? getComposeShape(AvatarShape.SQUIRCLE) : l0Var;
        final androidx.compose.ui.h hVarI = hVar2.i(A8.p.r(aVar, composeShape));
        String imageUrl = avatarWrapper.getImageUrl(c1086gP, 8);
        if (n.S(imageUrl)) {
            c1086gP.L(-445746825);
            c1086g = c1086gP;
            FinAvatarPlaceholder(avatarWrapper, hVarI, 0.0f, c1086gP, 8, 4);
            c1086g.T(false);
        } else {
            c1086gP.L(-446445875);
            u.a(imageUrl, avatarWrapper.getAvatar().getLabel(), IntercomImageLoaderKt.getImageLoader((Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b)), hVarI, androidx.compose.runtime.internal.a.b(-1294140715, new Ia.r<v, AsyncImagePainter.a.c, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.m5.components.avatar.AvatarIconKt.FinAvatar.1
                @Override // Ia.r
                public /* bridge */ /* synthetic */ r invoke(v vVar, AsyncImagePainter.a.c cVar, InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(vVar, cVar, interfaceC1084f2, num.intValue());
                    return r.f47939a;
                }

                public final void invoke(v SubcomposeAsyncImage, AsyncImagePainter.a.c it, InterfaceC1084f interfaceC1084f2, int i13) {
                    kotlin.jvm.internal.i.e(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                    kotlin.jvm.internal.i.e(it, "it");
                    if ((i13 & 641) == 128 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                    } else {
                        AvatarIconKt.FinAvatarPlaceholder(avatarWrapper, hVarI, 0.0f, interfaceC1084f2, 8, 4);
                    }
                }
            }, c1086gP), androidx.compose.runtime.internal.a.b(-818047861, new Ia.r<v, AsyncImagePainter.a.b, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.m5.components.avatar.AvatarIconKt.FinAvatar.2
                @Override // Ia.r
                public /* bridge */ /* synthetic */ r invoke(v vVar, AsyncImagePainter.a.b bVar, InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(vVar, bVar, interfaceC1084f2, num.intValue());
                    return r.f47939a;
                }

                public final void invoke(v SubcomposeAsyncImage, AsyncImagePainter.a.b it, InterfaceC1084f interfaceC1084f2, int i13) {
                    kotlin.jvm.internal.i.e(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                    kotlin.jvm.internal.i.e(it, "it");
                    if ((i13 & 641) == 128 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                    } else {
                        AvatarIconKt.FinAvatarPlaceholder(avatarWrapper, hVarI, 0.0f, interfaceC1084f2, 8, 4);
                    }
                }
            }, c1086gP), null, null, null, null, c1086gP, 12780032, 0, 261968);
            c1086gP.T(false);
            c1086g = c1086gP;
        }
        C1105p0 c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            final androidx.compose.ui.h hVar3 = hVar2;
            final l0 l0Var2 = composeShape;
            c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.m5.components.avatar.c
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    androidx.compose.ui.h hVar4 = hVar3;
                    int i13 = i10;
                    int i14 = i11;
                    return AvatarIconKt.FinAvatar$lambda$11(hVar4, avatarWrapper, l0Var2, i13, i14, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r FinAvatar$lambda$11(androidx.compose.ui.h hVar, AvatarWrapper avatarWrapper, l0 l0Var, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(avatarWrapper, "$avatarWrapper");
        FinAvatar(hVar, avatarWrapper, l0Var, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FinAvatarPlaceholder(final AvatarWrapper avatarWrapper, androidx.compose.ui.h hVar, float f10, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        C1086g c1086gP = interfaceC1084f.p(-427803587);
        int i12 = i11 & 2;
        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
        if (i12 != 0) {
            hVar = aVar;
        }
        if ((i11 & 4) != 0) {
            f10 = 1.0f;
        }
        androidx.compose.ui.h hVarB = C0932d.b(hVar, ColorExtensionsKt.m657darken8_81llA(IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m615getAction0d7_KjU()), h0.f13629a);
        E eD = BoxKt.d(androidx.compose.ui.d.a.f13339e, false);
        int i13 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarB);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD);
        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
        p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i13))) {
            J4.i.d(i13, c1086gP, i13, pVar);
        }
        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
        BotAvatarPlaceholder(avatarWrapper, PaddingKt.f(aVar, 4), f10, c1086gP, (i10 & 896) | 56, 0);
        c1086gP.T(true);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final androidx.compose.ui.h hVar2 = hVar;
            final float f11 = f10;
            c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.m5.components.avatar.g
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AvatarIconKt.FinAvatarPlaceholder$lambda$13(avatarWrapper, hVar2, f11, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r FinAvatarPlaceholder$lambda$13(AvatarWrapper avatarWrapper, androidx.compose.ui.h hVar, float f10, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(avatarWrapper, "$avatarWrapper");
        FinAvatarPlaceholder(avatarWrapper, hVar, f10, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return r.f47939a;
    }

    public static final androidx.compose.ui.h avatarBorder(androidx.compose.ui.h hVar, boolean z10, l0 shape) {
        kotlin.jvm.internal.i.e(hVar, "<this>");
        kotlin.jvm.internal.i.e(shape, "shape");
        if (!z10) {
            return hVar;
        }
        return C0935g.b(hVar, (float) 0.5d, new Z(kotlin.collections.l.s(new H(Q3.d.d(872415231)), new H(Q3.d.d(872415231))), null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) << 32), 0), shape);
    }

    public static final p270w.f getComposeShape(AvatarShape avatarShape) {
        kotlin.jvm.internal.i.e(avatarShape, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[avatarShape.ordinal()];
        if (i10 == 1) {
            return p270w.g.a(50);
        }
        if (i10 == 2) {
            return p270w.g.a(16);
        }
        throw new NoWhenBranchMatchedException();
    }
}
