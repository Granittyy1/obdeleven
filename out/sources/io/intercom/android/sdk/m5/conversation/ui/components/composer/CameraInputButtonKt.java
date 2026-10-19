package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.content.FileProvider;
import io.intercom.android.sdk.IntercomFileProviderKt;
import io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt;
import io.intercom.android.sdk.utilities.Phrase;
import java.io.File;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: CameraInputButton.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class CameraInputButtonKt {

    /* JADX INFO: compiled from: CameraInputButton.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CameraInputType.values().length];
            try {
                iArr[CameraInputType.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CameraInputType.PHOTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01bb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:103:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:109:0x0250  */
    /* JADX WARN: Code duplicated, block: B:110:0x0254  */
    /* JADX WARN: Code duplicated, block: B:113:0x0267  */
    /* JADX WARN: Code duplicated, block: B:115:0x0275  */
    /* JADX WARN: Code duplicated, block: B:119:0x0290  */
    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x008f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0094  */
    /* JADX WARN: Code duplicated, block: B:50:0x0098  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00be  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:83:0x0111  */
    /* JADX WARN: Code duplicated, block: B:86:0x012c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x012e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0131  */
    /* JADX WARN: Code duplicated, block: B:90:0x0137  */
    /* JADX WARN: Code duplicated, block: B:93:0x0155  */
    /* JADX WARN: Code duplicated, block: B:96:0x0170  */
    /* JADX WARN: Code duplicated, block: B:98:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b4  */
    public static final void CameraInputButton(androidx.compose.ui.h hVar, final CameraInputType cameraInputType, Ia.l<? super Uri, p293xa.r> onResult, Ia.a<p293xa.r> aVar, Ia.a<p293xa.r> aVar2, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> content, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        androidx.compose.ui.h hVar2;
        int i12;
        Ia.a<p293xa.r> aVar3;
        int i13;
        Ia.a<p293xa.r> aVar4;
        int i14;
        int i15;
        int i16;
        androidx.compose.ui.h hVar3;
        Ia.a<p293xa.r> c2333d;
        final Ia.a<p293xa.r> aVar5;
        final Context context;
        Object objF;
        InterfaceC1084f.a.C0153a c0153a;
        int i17;
        String str;
        Object objF2;
        final androidx.compose.runtime.X x10;
        int i18;
        boolean z10;
        C1086g c1086g;
        int i19;
        Ia.a<ComposeUiNode> aVar6;
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar;
        androidx.compose.ui.h hVar4;
        Ia.a<p293xa.r> aVar7;
        Ia.a<p293xa.r> aVar8;
        boolean z11;
        Object objF3;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(cameraInputType, "cameraInputType");
        kotlin.jvm.internal.i.e(onResult, "onResult");
        kotlin.jvm.internal.i.e(content, "content");
        C1086g c1086gP = interfaceC1084f.p(-2022676727);
        int i20 = i11 & 1;
        if (i20 != 0) {
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
            i12 |= c1086gP.K(cameraInputType) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= c1086gP.k(onResult) ? 256 : 128;
        }
        int i21 = i11 & 8;
        if (i21 == 0) {
            if ((i10 & 7168) == 0) {
                aVar3 = aVar;
                i12 |= c1086gP.k(aVar3) ? 2048 : 1024;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((i10 & 57344) == 0) {
                    aVar4 = aVar2;
                    if (c1086gP.k(aVar4)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i12 |= i14;
                }
                if ((i11 & 32) != 0) {
                    if ((458752 & i10) == 0) {
                        if (c1086gP.k(content)) {
                            i15 = 131072;
                        } else {
                            i15 = 65536;
                        }
                    }
                    i16 = i12;
                    if ((i16 & 374491) == 74898 || !c1086gP.s()) {
                        if (i20 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i21 != 0) {
                            c2333d = new C2333d(0);
                        } else {
                            c2333d = aVar3;
                        }
                        if (i13 != 0) {
                            aVar5 = new p027c1.a(1);
                        } else {
                            aVar5 = aVar4;
                        }
                        context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                        c1086gP.L(-845514337);
                        objF = c1086gP.f();
                        c0153a = InterfaceC1084f.a.f12980a;
                        if (objF == c0153a) {
                            objF = J0.f("");
                            c1086gP.E(objF);
                        }
                        final androidx.compose.runtime.X x11 = (androidx.compose.runtime.X) objF;
                        c1086gP.T(false);
                        i17 = WhenMappings.$EnumSwitchMapping$0[cameraInputType.ordinal()];
                        if (i17 == 1) {
                            str = "videos";
                        } else {
                            if (i17 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str = "images";
                        }
                        final androidx.activity.compose.e eVarA = ActivityResultRegistryKt.a(new p076g.d(), new C2334e(onResult, context, str, x11), c1086gP, 8);
                        c1086gP.L(-845473406);
                        objF2 = c1086gP.f();
                        if (objF2 == c0153a) {
                            objF2 = J0.f(Boolean.FALSE);
                            c1086gP.E(objF2);
                        }
                        x10 = (androidx.compose.runtime.X) objF2;
                        c1086gP.T(false);
                        c1086gP.L(-845471236);
                        if (CameraInputButton$lambda$7(x10)) {
                            String string = Phrase.from(context, io.intercom.android.sdk.R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                            String strP = S4.o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_settings);
                            String strP2 = S4.o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_not_now);
                            Integer numValueOf = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_ic_camera);
                            c1086gP.L(-845454121);
                            if ((i16 & 57344) == 16384) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objF3 = c1086gP.f();
                            if (z11 || objF3 == c0153a) {
                                objF3 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.f
                                    @Override // Ia.a
                                    public final Object invoke() {
                                        return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(aVar5, x10);
                                    }
                                };
                                c1086gP.E(objF3);
                            }
                            c1086gP.T(false);
                            i18 = 8;
                            z10 = true;
                            PermissionDeniedDialogKt.PermissionDeniedDialog(null, string, strP, strP2, numValueOf, (Ia.a) objF3, new coil.decode.t(context, 1, x10), c1086gP, 0, 1);
                        } else {
                            i18 = 8;
                            z10 = true;
                        }
                        c1086gP.T(false);
                        final String str2 = str;
                        androidx.compose.ui.h hVar5 = hVar3;
                        Ia.a<p293xa.r> aVar9 = aVar5;
                        final androidx.activity.compose.e eVarA2 = ActivityResultRegistryKt.a(new p076g.c(), new Ia.l() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.g
                            @Override // Ia.l
                            public final Object invoke(Object obj) {
                                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                return CameraInputButtonKt.CameraInputButton$lambda$12(cameraInputType, context, str2, eVarA, x11, x10, zBooleanValue);
                            }
                        }, c1086gP, i18);
                        final Ia.a<p293xa.r> aVar10 = c2333d;
                        c1086g = c1086gP;
                        androidx.compose.ui.h hVarC = ClickableKt.c(hVar5, false, null, new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.h
                            @Override // Ia.a
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$13(aVar10, context, eVarA2, cameraInputType, str2, eVarA, x11);
                            }
                        }, 7);
                        androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i19 = c1086g.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P = c1086g.P();
                        androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086g, hVarC);
                        ComposeUiNode.f14331c0.getClass();
                        aVar6 = ComposeUiNode.Companion.f14333b;
                        c1086g.r();
                        if (c1086g.f12995O) {
                            c1086g.v(aVar6);
                        } else {
                            c1086g.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086g, eD);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086g, interfaceC1089h0P);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086g.f12995O || !kotlin.jvm.internal.i.a(c1086g.f(), Integer.valueOf(i19))) {
                            J4.i.d(i19, c1086g, i19, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086g, hVarC2);
                        C7.g.b((i16 >> 15) & 14, content, c1086g, true);
                        hVar4 = hVar5;
                        aVar7 = aVar9;
                        aVar8 = c2333d;
                    } else {
                        c1086gP.w();
                        hVar4 = hVar2;
                        aVar8 = aVar3;
                        c1086g = c1086gP;
                        aVar7 = aVar4;
                    }
                    c1105p0V = c1086g.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new C2338i(hVar4, cameraInputType, onResult, aVar8, aVar7, content, i10, i11);
                    }
                }
                i15 = 196608;
                i12 |= i15;
                i16 = i12;
                if ((i16 & 374491) == 74898) {
                    if (i20 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i21 != 0) {
                        c2333d = new C2333d(0);
                    } else {
                        c2333d = aVar3;
                    }
                    if (i13 != 0) {
                        aVar5 = new p027c1.a(1);
                    } else {
                        aVar5 = aVar4;
                    }
                    context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                    c1086gP.L(-845514337);
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        objF = J0.f("");
                        c1086gP.E(objF);
                    }
                    final androidx.compose.runtime.X x12 = (androidx.compose.runtime.X) objF;
                    c1086gP.T(false);
                    i17 = WhenMappings.$EnumSwitchMapping$0[cameraInputType.ordinal()];
                    if (i17 == 1) {
                        str = "videos";
                    } else {
                        if (i17 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "images";
                    }
                    final androidx.activity.compose.e eVarA3 = ActivityResultRegistryKt.a(new p076g.d(), new C2334e(onResult, context, str, x12), c1086gP, 8);
                    c1086gP.L(-845473406);
                    objF2 = c1086gP.f();
                    if (objF2 == c0153a) {
                        objF2 = J0.f(Boolean.FALSE);
                        c1086gP.E(objF2);
                    }
                    x10 = (androidx.compose.runtime.X) objF2;
                    c1086gP.T(false);
                    c1086gP.L(-845471236);
                    if (CameraInputButton$lambda$7(x10)) {
                        String string2 = Phrase.from(context, io.intercom.android.sdk.R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                        String strP3 = S4.o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_settings);
                        String strP4 = S4.o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_not_now);
                        Integer numValueOf2 = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_ic_camera);
                        c1086gP.L(-845454121);
                        if ((i16 & 57344) == 16384) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF3 = c1086gP.f();
                        if (z11) {
                            objF3 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.f
                                @Override // Ia.a
                                public final Object invoke() {
                                    return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(aVar5, x10);
                                }
                            };
                            c1086gP.E(objF3);
                        } else {
                            objF3 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.f
                                @Override // Ia.a
                                public final Object invoke() {
                                    return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(aVar5, x10);
                                }
                            };
                            c1086gP.E(objF3);
                        }
                        c1086gP.T(false);
                        i18 = 8;
                        z10 = true;
                        PermissionDeniedDialogKt.PermissionDeniedDialog(null, string2, strP3, strP4, numValueOf2, (Ia.a) objF3, new coil.decode.t(context, 1, x10), c1086gP, 0, 1);
                    } else {
                        i18 = 8;
                        z10 = true;
                    }
                    c1086gP.T(false);
                    final String str3 = str;
                    androidx.compose.ui.h hVar6 = hVar3;
                    Ia.a<p293xa.r> aVar11 = aVar5;
                    final androidx.activity.compose.e eVarA4 = ActivityResultRegistryKt.a(new p076g.c(), new Ia.l() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.g
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            return CameraInputButtonKt.CameraInputButton$lambda$12(cameraInputType, context, str3, eVarA3, x12, x10, zBooleanValue);
                        }
                    }, c1086gP, i18);
                    final Ia.a aVar12 = c2333d;
                    c1086g = c1086gP;
                    androidx.compose.ui.h hVarC3 = ClickableKt.c(hVar6, false, null, new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.h
                        @Override // Ia.a
                        public final Object invoke() {
                            return CameraInputButtonKt.CameraInputButton$lambda$13(aVar12, context, eVarA4, cameraInputType, str3, eVarA3, x12);
                        }
                    }, 7);
                    androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i19 = c1086g.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P2 = c1086g.P();
                    androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(c1086g, hVarC3);
                    ComposeUiNode.f14331c0.getClass();
                    aVar6 = ComposeUiNode.Companion.f14333b;
                    c1086g.r();
                    if (c1086g.f12995O) {
                        c1086g.v(aVar6);
                    } else {
                        c1086g.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086g, eD2);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086g, interfaceC1089h0P2);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086g.f12995O) {
                        J4.i.d(i19, c1086g, i19, pVar);
                    } else {
                        J4.i.d(i19, c1086g, i19, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086g, hVarC4);
                    C7.g.b((i16 >> 15) & 14, content, c1086g, true);
                    hVar4 = hVar6;
                    aVar7 = aVar11;
                    aVar8 = c2333d;
                } else {
                    if (i20 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i21 != 0) {
                        c2333d = new C2333d(0);
                    } else {
                        c2333d = aVar3;
                    }
                    if (i13 != 0) {
                        aVar5 = new p027c1.a(1);
                    } else {
                        aVar5 = aVar4;
                    }
                    context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                    c1086gP.L(-845514337);
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        objF = J0.f("");
                        c1086gP.E(objF);
                    }
                    final androidx.compose.runtime.X x13 = (androidx.compose.runtime.X) objF;
                    c1086gP.T(false);
                    i17 = WhenMappings.$EnumSwitchMapping$0[cameraInputType.ordinal()];
                    if (i17 == 1) {
                        str = "videos";
                    } else {
                        if (i17 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "images";
                    }
                    final androidx.activity.compose.e eVarA5 = ActivityResultRegistryKt.a(new p076g.d(), new C2334e(onResult, context, str, x13), c1086gP, 8);
                    c1086gP.L(-845473406);
                    objF2 = c1086gP.f();
                    if (objF2 == c0153a) {
                        objF2 = J0.f(Boolean.FALSE);
                        c1086gP.E(objF2);
                    }
                    x10 = (androidx.compose.runtime.X) objF2;
                    c1086gP.T(false);
                    c1086gP.L(-845471236);
                    if (CameraInputButton$lambda$7(x10)) {
                        String string3 = Phrase.from(context, io.intercom.android.sdk.R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                        String strP5 = S4.o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_settings);
                        String strP6 = S4.o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_not_now);
                        Integer numValueOf3 = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_ic_camera);
                        c1086gP.L(-845454121);
                        if ((i16 & 57344) == 16384) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF3 = c1086gP.f();
                        if (z11) {
                            objF3 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.f
                                @Override // Ia.a
                                public final Object invoke() {
                                    return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(aVar5, x10);
                                }
                            };
                            c1086gP.E(objF3);
                        } else {
                            objF3 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.f
                                @Override // Ia.a
                                public final Object invoke() {
                                    return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(aVar5, x10);
                                }
                            };
                            c1086gP.E(objF3);
                        }
                        c1086gP.T(false);
                        i18 = 8;
                        z10 = true;
                        PermissionDeniedDialogKt.PermissionDeniedDialog(null, string3, strP5, strP6, numValueOf3, (Ia.a) objF3, new coil.decode.t(context, 1, x10), c1086gP, 0, 1);
                    } else {
                        i18 = 8;
                        z10 = true;
                    }
                    c1086gP.T(false);
                    final String str4 = str;
                    androidx.compose.ui.h hVar7 = hVar3;
                    Ia.a<p293xa.r> aVar13 = aVar5;
                    final androidx.activity.compose.e eVarA6 = ActivityResultRegistryKt.a(new p076g.c(), new Ia.l() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.g
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            return CameraInputButtonKt.CameraInputButton$lambda$12(cameraInputType, context, str4, eVarA5, x13, x10, zBooleanValue);
                        }
                    }, c1086gP, i18);
                    final Ia.a aVar14 = c2333d;
                    c1086g = c1086gP;
                    androidx.compose.ui.h hVarC5 = ClickableKt.c(hVar7, false, null, new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.h
                        @Override // Ia.a
                        public final Object invoke() {
                            return CameraInputButtonKt.CameraInputButton$lambda$13(aVar14, context, eVarA6, cameraInputType, str4, eVarA5, x13);
                        }
                    }, 7);
                    androidx.compose.ui.layout.E eD3 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i19 = c1086g.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P3 = c1086g.P();
                    androidx.compose.ui.h hVarC6 = ComposedModifierKt.c(c1086g, hVarC5);
                    ComposeUiNode.f14331c0.getClass();
                    aVar6 = ComposeUiNode.Companion.f14333b;
                    c1086g.r();
                    if (c1086g.f12995O) {
                        c1086g.v(aVar6);
                    } else {
                        c1086g.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086g, eD3);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086g, interfaceC1089h0P3);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086g.f12995O) {
                        J4.i.d(i19, c1086g, i19, pVar);
                    } else {
                        J4.i.d(i19, c1086g, i19, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086g, hVarC6);
                    C7.g.b((i16 >> 15) & 14, content, c1086g, true);
                    hVar4 = hVar7;
                    aVar7 = aVar13;
                    aVar8 = c2333d;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new C2338i(hVar4, cameraInputType, onResult, aVar8, aVar7, content, i10, i11);
                }
            }
            i12 |= 24576;
            aVar4 = aVar2;
            if ((i11 & 32) != 0) {
                if ((458752 & i10) == 0) {
                    if (c1086gP.k(content)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                }
                i16 = i12;
                if ((i16 & 374491) == 74898) {
                    if (i20 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i21 != 0) {
                        c2333d = new C2333d(0);
                    } else {
                        c2333d = aVar3;
                    }
                    if (i13 != 0) {
                        aVar5 = new p027c1.a(1);
                    } else {
                        aVar5 = aVar4;
                    }
                    context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                    c1086gP.L(-845514337);
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        objF = J0.f("");
                        c1086gP.E(objF);
                    }
                    final androidx.compose.runtime.X x14 = (androidx.compose.runtime.X) objF;
                    c1086gP.T(false);
                    i17 = WhenMappings.$EnumSwitchMapping$0[cameraInputType.ordinal()];
                    if (i17 == 1) {
                        str = "videos";
                    } else {
                        if (i17 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "images";
                    }
                    final androidx.activity.compose.e eVarA7 = ActivityResultRegistryKt.a(new p076g.d(), new C2334e(onResult, context, str, x14), c1086gP, 8);
                    c1086gP.L(-845473406);
                    objF2 = c1086gP.f();
                    if (objF2 == c0153a) {
                        objF2 = J0.f(Boolean.FALSE);
                        c1086gP.E(objF2);
                    }
                    x10 = (androidx.compose.runtime.X) objF2;
                    c1086gP.T(false);
                    c1086gP.L(-845471236);
                    if (CameraInputButton$lambda$7(x10)) {
                        String string4 = Phrase.from(context, io.intercom.android.sdk.R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                        String strP7 = S4.o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_settings);
                        String strP8 = S4.o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_not_now);
                        Integer numValueOf4 = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_ic_camera);
                        c1086gP.L(-845454121);
                        if ((i16 & 57344) == 16384) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF3 = c1086gP.f();
                        if (z11) {
                            objF3 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.f
                                @Override // Ia.a
                                public final Object invoke() {
                                    return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(aVar5, x10);
                                }
                            };
                            c1086gP.E(objF3);
                        } else {
                            objF3 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.f
                                @Override // Ia.a
                                public final Object invoke() {
                                    return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(aVar5, x10);
                                }
                            };
                            c1086gP.E(objF3);
                        }
                        c1086gP.T(false);
                        i18 = 8;
                        z10 = true;
                        PermissionDeniedDialogKt.PermissionDeniedDialog(null, string4, strP7, strP8, numValueOf4, (Ia.a) objF3, new coil.decode.t(context, 1, x10), c1086gP, 0, 1);
                    } else {
                        i18 = 8;
                        z10 = true;
                    }
                    c1086gP.T(false);
                    final String str5 = str;
                    androidx.compose.ui.h hVar8 = hVar3;
                    Ia.a<p293xa.r> aVar15 = aVar5;
                    final androidx.activity.compose.e eVarA8 = ActivityResultRegistryKt.a(new p076g.c(), new Ia.l() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.g
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            return CameraInputButtonKt.CameraInputButton$lambda$12(cameraInputType, context, str5, eVarA7, x14, x10, zBooleanValue);
                        }
                    }, c1086gP, i18);
                    final Ia.a aVar16 = c2333d;
                    c1086g = c1086gP;
                    androidx.compose.ui.h hVarC7 = ClickableKt.c(hVar8, false, null, new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.h
                        @Override // Ia.a
                        public final Object invoke() {
                            return CameraInputButtonKt.CameraInputButton$lambda$13(aVar16, context, eVarA8, cameraInputType, str5, eVarA7, x14);
                        }
                    }, 7);
                    androidx.compose.ui.layout.E eD4 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i19 = c1086g.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P4 = c1086g.P();
                    androidx.compose.ui.h hVarC8 = ComposedModifierKt.c(c1086g, hVarC7);
                    ComposeUiNode.f14331c0.getClass();
                    aVar6 = ComposeUiNode.Companion.f14333b;
                    c1086g.r();
                    if (c1086g.f12995O) {
                        c1086g.v(aVar6);
                    } else {
                        c1086g.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086g, eD4);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086g, interfaceC1089h0P4);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086g.f12995O) {
                        J4.i.d(i19, c1086g, i19, pVar);
                    } else {
                        J4.i.d(i19, c1086g, i19, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086g, hVarC8);
                    C7.g.b((i16 >> 15) & 14, content, c1086g, true);
                    hVar4 = hVar8;
                    aVar7 = aVar15;
                    aVar8 = c2333d;
                } else {
                    if (i20 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i21 != 0) {
                        c2333d = new C2333d(0);
                    } else {
                        c2333d = aVar3;
                    }
                    if (i13 != 0) {
                        aVar5 = new p027c1.a(1);
                    } else {
                        aVar5 = aVar4;
                    }
                    context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                    c1086gP.L(-845514337);
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        objF = J0.f("");
                        c1086gP.E(objF);
                    }
                    final androidx.compose.runtime.X x15 = (androidx.compose.runtime.X) objF;
                    c1086gP.T(false);
                    i17 = WhenMappings.$EnumSwitchMapping$0[cameraInputType.ordinal()];
                    if (i17 == 1) {
                        str = "videos";
                    } else {
                        if (i17 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "images";
                    }
                    final androidx.activity.compose.e eVarA9 = ActivityResultRegistryKt.a(new p076g.d(), new C2334e(onResult, context, str, x15), c1086gP, 8);
                    c1086gP.L(-845473406);
                    objF2 = c1086gP.f();
                    if (objF2 == c0153a) {
                        objF2 = J0.f(Boolean.FALSE);
                        c1086gP.E(objF2);
                    }
                    x10 = (androidx.compose.runtime.X) objF2;
                    c1086gP.T(false);
                    c1086gP.L(-845471236);
                    if (CameraInputButton$lambda$7(x10)) {
                        String string5 = Phrase.from(context, io.intercom.android.sdk.R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                        String strP9 = S4.o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_settings);
                        String strP10 = S4.o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_not_now);
                        Integer numValueOf5 = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_ic_camera);
                        c1086gP.L(-845454121);
                        if ((i16 & 57344) == 16384) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF3 = c1086gP.f();
                        if (z11) {
                            objF3 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.f
                                @Override // Ia.a
                                public final Object invoke() {
                                    return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(aVar5, x10);
                                }
                            };
                            c1086gP.E(objF3);
                        } else {
                            objF3 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.f
                                @Override // Ia.a
                                public final Object invoke() {
                                    return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(aVar5, x10);
                                }
                            };
                            c1086gP.E(objF3);
                        }
                        c1086gP.T(false);
                        i18 = 8;
                        z10 = true;
                        PermissionDeniedDialogKt.PermissionDeniedDialog(null, string5, strP9, strP10, numValueOf5, (Ia.a) objF3, new coil.decode.t(context, 1, x10), c1086gP, 0, 1);
                    } else {
                        i18 = 8;
                        z10 = true;
                    }
                    c1086gP.T(false);
                    final String str6 = str;
                    androidx.compose.ui.h hVar9 = hVar3;
                    Ia.a<p293xa.r> aVar17 = aVar5;
                    final androidx.activity.compose.e eVarA10 = ActivityResultRegistryKt.a(new p076g.c(), new Ia.l() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.g
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            return CameraInputButtonKt.CameraInputButton$lambda$12(cameraInputType, context, str6, eVarA9, x15, x10, zBooleanValue);
                        }
                    }, c1086gP, i18);
                    final Ia.a aVar18 = c2333d;
                    c1086g = c1086gP;
                    androidx.compose.ui.h hVarC9 = ClickableKt.c(hVar9, false, null, new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.h
                        @Override // Ia.a
                        public final Object invoke() {
                            return CameraInputButtonKt.CameraInputButton$lambda$13(aVar18, context, eVarA10, cameraInputType, str6, eVarA9, x15);
                        }
                    }, 7);
                    androidx.compose.ui.layout.E eD5 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i19 = c1086g.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P5 = c1086g.P();
                    androidx.compose.ui.h hVarC10 = ComposedModifierKt.c(c1086g, hVarC9);
                    ComposeUiNode.f14331c0.getClass();
                    aVar6 = ComposeUiNode.Companion.f14333b;
                    c1086g.r();
                    if (c1086g.f12995O) {
                        c1086g.v(aVar6);
                    } else {
                        c1086g.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086g, eD5);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086g, interfaceC1089h0P5);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086g.f12995O) {
                        J4.i.d(i19, c1086g, i19, pVar);
                    } else {
                        J4.i.d(i19, c1086g, i19, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086g, hVarC10);
                    C7.g.b((i16 >> 15) & 14, content, c1086g, true);
                    hVar4 = hVar9;
                    aVar7 = aVar17;
                    aVar8 = c2333d;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new C2338i(hVar4, cameraInputType, onResult, aVar8, aVar7, content, i10, i11);
                }
            }
            i15 = 196608;
            i12 |= i15;
            i16 = i12;
            if ((i16 & 374491) == 74898) {
                if (i20 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i21 != 0) {
                    c2333d = new C2333d(0);
                } else {
                    c2333d = aVar3;
                }
                if (i13 != 0) {
                    aVar5 = new p027c1.a(1);
                } else {
                    aVar5 = aVar4;
                }
                context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                c1086gP.L(-845514337);
                objF = c1086gP.f();
                c0153a = InterfaceC1084f.a.f12980a;
                if (objF == c0153a) {
                    objF = J0.f("");
                    c1086gP.E(objF);
                }
                final androidx.compose.runtime.X x16 = (androidx.compose.runtime.X) objF;
                c1086gP.T(false);
                i17 = WhenMappings.$EnumSwitchMapping$0[cameraInputType.ordinal()];
                if (i17 == 1) {
                    str = "videos";
                } else {
                    if (i17 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "images";
                }
                final androidx.activity.compose.e eVarA11 = ActivityResultRegistryKt.a(new p076g.d(), new C2334e(onResult, context, str, x16), c1086gP, 8);
                c1086gP.L(-845473406);
                objF2 = c1086gP.f();
                if (objF2 == c0153a) {
                    objF2 = J0.f(Boolean.FALSE);
                    c1086gP.E(objF2);
                }
                x10 = (androidx.compose.runtime.X) objF2;
                c1086gP.T(false);
                c1086gP.L(-845471236);
                if (CameraInputButton$lambda$7(x10)) {
                    String string6 = Phrase.from(context, io.intercom.android.sdk.R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                    String strP11 = S4.o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_settings);
                    String strP12 = S4.o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_not_now);
                    Integer numValueOf6 = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_ic_camera);
                    c1086gP.L(-845454121);
                    if ((i16 & 57344) == 16384) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF3 = c1086gP.f();
                    if (z11) {
                        objF3 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.f
                            @Override // Ia.a
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(aVar5, x10);
                            }
                        };
                        c1086gP.E(objF3);
                    } else {
                        objF3 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.f
                            @Override // Ia.a
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(aVar5, x10);
                            }
                        };
                        c1086gP.E(objF3);
                    }
                    c1086gP.T(false);
                    i18 = 8;
                    z10 = true;
                    PermissionDeniedDialogKt.PermissionDeniedDialog(null, string6, strP11, strP12, numValueOf6, (Ia.a) objF3, new coil.decode.t(context, 1, x10), c1086gP, 0, 1);
                } else {
                    i18 = 8;
                    z10 = true;
                }
                c1086gP.T(false);
                final String str7 = str;
                androidx.compose.ui.h hVar10 = hVar3;
                Ia.a<p293xa.r> aVar19 = aVar5;
                final androidx.activity.compose.e eVarA12 = ActivityResultRegistryKt.a(new p076g.c(), new Ia.l() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.g
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        return CameraInputButtonKt.CameraInputButton$lambda$12(cameraInputType, context, str7, eVarA11, x16, x10, zBooleanValue);
                    }
                }, c1086gP, i18);
                final Ia.a aVar110 = c2333d;
                c1086g = c1086gP;
                androidx.compose.ui.h hVarC11 = ClickableKt.c(hVar10, false, null, new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.h
                    @Override // Ia.a
                    public final Object invoke() {
                        return CameraInputButtonKt.CameraInputButton$lambda$13(aVar110, context, eVarA12, cameraInputType, str7, eVarA11, x16);
                    }
                }, 7);
                androidx.compose.ui.layout.E eD6 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i19 = c1086g.f12996P;
                InterfaceC1089h0 interfaceC1089h0P6 = c1086g.P();
                androidx.compose.ui.h hVarC12 = ComposedModifierKt.c(c1086g, hVarC11);
                ComposeUiNode.f14331c0.getClass();
                aVar6 = ComposeUiNode.Companion.f14333b;
                c1086g.r();
                if (c1086g.f12995O) {
                    c1086g.v(aVar6);
                } else {
                    c1086g.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086g, eD6);
                R0.a(ComposeUiNode.Companion.f14336e, c1086g, interfaceC1089h0P6);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086g.f12995O) {
                    J4.i.d(i19, c1086g, i19, pVar);
                } else {
                    J4.i.d(i19, c1086g, i19, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086g, hVarC12);
                C7.g.b((i16 >> 15) & 14, content, c1086g, true);
                hVar4 = hVar10;
                aVar7 = aVar19;
                aVar8 = c2333d;
            } else {
                if (i20 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i21 != 0) {
                    c2333d = new C2333d(0);
                } else {
                    c2333d = aVar3;
                }
                if (i13 != 0) {
                    aVar5 = new p027c1.a(1);
                } else {
                    aVar5 = aVar4;
                }
                context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                c1086gP.L(-845514337);
                objF = c1086gP.f();
                c0153a = InterfaceC1084f.a.f12980a;
                if (objF == c0153a) {
                    objF = J0.f("");
                    c1086gP.E(objF);
                }
                final androidx.compose.runtime.X x17 = (androidx.compose.runtime.X) objF;
                c1086gP.T(false);
                i17 = WhenMappings.$EnumSwitchMapping$0[cameraInputType.ordinal()];
                if (i17 == 1) {
                    str = "videos";
                } else {
                    if (i17 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "images";
                }
                final androidx.activity.compose.e eVarA13 = ActivityResultRegistryKt.a(new p076g.d(), new C2334e(onResult, context, str, x17), c1086gP, 8);
                c1086gP.L(-845473406);
                objF2 = c1086gP.f();
                if (objF2 == c0153a) {
                    objF2 = J0.f(Boolean.FALSE);
                    c1086gP.E(objF2);
                }
                x10 = (androidx.compose.runtime.X) objF2;
                c1086gP.T(false);
                c1086gP.L(-845471236);
                if (CameraInputButton$lambda$7(x10)) {
                    String string7 = Phrase.from(context, io.intercom.android.sdk.R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                    String strP13 = S4.o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_settings);
                    String strP14 = S4.o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_not_now);
                    Integer numValueOf7 = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_ic_camera);
                    c1086gP.L(-845454121);
                    if ((i16 & 57344) == 16384) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF3 = c1086gP.f();
                    if (z11) {
                        objF3 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.f
                            @Override // Ia.a
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(aVar5, x10);
                            }
                        };
                        c1086gP.E(objF3);
                    } else {
                        objF3 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.f
                            @Override // Ia.a
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(aVar5, x10);
                            }
                        };
                        c1086gP.E(objF3);
                    }
                    c1086gP.T(false);
                    i18 = 8;
                    z10 = true;
                    PermissionDeniedDialogKt.PermissionDeniedDialog(null, string7, strP13, strP14, numValueOf7, (Ia.a) objF3, new coil.decode.t(context, 1, x10), c1086gP, 0, 1);
                } else {
                    i18 = 8;
                    z10 = true;
                }
                c1086gP.T(false);
                final String str8 = str;
                androidx.compose.ui.h hVar11 = hVar3;
                Ia.a<p293xa.r> aVar111 = aVar5;
                final androidx.activity.compose.e eVarA14 = ActivityResultRegistryKt.a(new p076g.c(), new Ia.l() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.g
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        return CameraInputButtonKt.CameraInputButton$lambda$12(cameraInputType, context, str8, eVarA13, x17, x10, zBooleanValue);
                    }
                }, c1086gP, i18);
                final Ia.a aVar112 = c2333d;
                c1086g = c1086gP;
                androidx.compose.ui.h hVarC13 = ClickableKt.c(hVar11, false, null, new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.h
                    @Override // Ia.a
                    public final Object invoke() {
                        return CameraInputButtonKt.CameraInputButton$lambda$13(aVar112, context, eVarA14, cameraInputType, str8, eVarA13, x17);
                    }
                }, 7);
                androidx.compose.ui.layout.E eD7 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i19 = c1086g.f12996P;
                InterfaceC1089h0 interfaceC1089h0P7 = c1086g.P();
                androidx.compose.ui.h hVarC14 = ComposedModifierKt.c(c1086g, hVarC13);
                ComposeUiNode.f14331c0.getClass();
                aVar6 = ComposeUiNode.Companion.f14333b;
                c1086g.r();
                if (c1086g.f12995O) {
                    c1086g.v(aVar6);
                } else {
                    c1086g.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086g, eD7);
                R0.a(ComposeUiNode.Companion.f14336e, c1086g, interfaceC1089h0P7);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086g.f12995O) {
                    J4.i.d(i19, c1086g, i19, pVar);
                } else {
                    J4.i.d(i19, c1086g, i19, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086g, hVarC14);
                C7.g.b((i16 >> 15) & 14, content, c1086g, true);
                hVar4 = hVar11;
                aVar7 = aVar111;
                aVar8 = c2333d;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new C2338i(hVar4, cameraInputType, onResult, aVar8, aVar7, content, i10, i11);
            }
        }
        i12 |= 3072;
        aVar3 = aVar;
        i13 = i11 & 16;
        if (i13 != 0) {
            if ((i10 & 57344) == 0) {
                aVar4 = aVar2;
                if (c1086gP.k(aVar4)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            if ((i11 & 32) != 0) {
                if ((458752 & i10) == 0) {
                    if (c1086gP.k(content)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                }
                i16 = i12;
                if ((i16 & 374491) == 74898) {
                    if (i20 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i21 != 0) {
                        c2333d = new C2333d(0);
                    } else {
                        c2333d = aVar3;
                    }
                    if (i13 != 0) {
                        aVar5 = new p027c1.a(1);
                    } else {
                        aVar5 = aVar4;
                    }
                    context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                    c1086gP.L(-845514337);
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        objF = J0.f("");
                        c1086gP.E(objF);
                    }
                    final androidx.compose.runtime.X x18 = (androidx.compose.runtime.X) objF;
                    c1086gP.T(false);
                    i17 = WhenMappings.$EnumSwitchMapping$0[cameraInputType.ordinal()];
                    if (i17 == 1) {
                        str = "videos";
                    } else {
                        if (i17 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "images";
                    }
                    final androidx.activity.compose.e eVarA15 = ActivityResultRegistryKt.a(new p076g.d(), new C2334e(onResult, context, str, x18), c1086gP, 8);
                    c1086gP.L(-845473406);
                    objF2 = c1086gP.f();
                    if (objF2 == c0153a) {
                        objF2 = J0.f(Boolean.FALSE);
                        c1086gP.E(objF2);
                    }
                    x10 = (androidx.compose.runtime.X) objF2;
                    c1086gP.T(false);
                    c1086gP.L(-845471236);
                    if (CameraInputButton$lambda$7(x10)) {
                        String string8 = Phrase.from(context, io.intercom.android.sdk.R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                        String strP15 = S4.o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_settings);
                        String strP16 = S4.o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_not_now);
                        Integer numValueOf8 = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_ic_camera);
                        c1086gP.L(-845454121);
                        if ((i16 & 57344) == 16384) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF3 = c1086gP.f();
                        if (z11) {
                            objF3 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.f
                                @Override // Ia.a
                                public final Object invoke() {
                                    return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(aVar5, x10);
                                }
                            };
                            c1086gP.E(objF3);
                        } else {
                            objF3 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.f
                                @Override // Ia.a
                                public final Object invoke() {
                                    return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(aVar5, x10);
                                }
                            };
                            c1086gP.E(objF3);
                        }
                        c1086gP.T(false);
                        i18 = 8;
                        z10 = true;
                        PermissionDeniedDialogKt.PermissionDeniedDialog(null, string8, strP15, strP16, numValueOf8, (Ia.a) objF3, new coil.decode.t(context, 1, x10), c1086gP, 0, 1);
                    } else {
                        i18 = 8;
                        z10 = true;
                    }
                    c1086gP.T(false);
                    final String str9 = str;
                    androidx.compose.ui.h hVar12 = hVar3;
                    Ia.a<p293xa.r> aVar113 = aVar5;
                    final androidx.activity.compose.e eVarA16 = ActivityResultRegistryKt.a(new p076g.c(), new Ia.l() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.g
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            return CameraInputButtonKt.CameraInputButton$lambda$12(cameraInputType, context, str9, eVarA15, x18, x10, zBooleanValue);
                        }
                    }, c1086gP, i18);
                    final Ia.a aVar114 = c2333d;
                    c1086g = c1086gP;
                    androidx.compose.ui.h hVarC15 = ClickableKt.c(hVar12, false, null, new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.h
                        @Override // Ia.a
                        public final Object invoke() {
                            return CameraInputButtonKt.CameraInputButton$lambda$13(aVar114, context, eVarA16, cameraInputType, str9, eVarA15, x18);
                        }
                    }, 7);
                    androidx.compose.ui.layout.E eD8 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i19 = c1086g.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P8 = c1086g.P();
                    androidx.compose.ui.h hVarC16 = ComposedModifierKt.c(c1086g, hVarC15);
                    ComposeUiNode.f14331c0.getClass();
                    aVar6 = ComposeUiNode.Companion.f14333b;
                    c1086g.r();
                    if (c1086g.f12995O) {
                        c1086g.v(aVar6);
                    } else {
                        c1086g.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086g, eD8);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086g, interfaceC1089h0P8);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086g.f12995O) {
                        J4.i.d(i19, c1086g, i19, pVar);
                    } else {
                        J4.i.d(i19, c1086g, i19, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086g, hVarC16);
                    C7.g.b((i16 >> 15) & 14, content, c1086g, true);
                    hVar4 = hVar12;
                    aVar7 = aVar113;
                    aVar8 = c2333d;
                } else {
                    if (i20 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i21 != 0) {
                        c2333d = new C2333d(0);
                    } else {
                        c2333d = aVar3;
                    }
                    if (i13 != 0) {
                        aVar5 = new p027c1.a(1);
                    } else {
                        aVar5 = aVar4;
                    }
                    context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                    c1086gP.L(-845514337);
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        objF = J0.f("");
                        c1086gP.E(objF);
                    }
                    final androidx.compose.runtime.X x19 = (androidx.compose.runtime.X) objF;
                    c1086gP.T(false);
                    i17 = WhenMappings.$EnumSwitchMapping$0[cameraInputType.ordinal()];
                    if (i17 == 1) {
                        str = "videos";
                    } else {
                        if (i17 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "images";
                    }
                    final androidx.activity.compose.e eVarA17 = ActivityResultRegistryKt.a(new p076g.d(), new C2334e(onResult, context, str, x19), c1086gP, 8);
                    c1086gP.L(-845473406);
                    objF2 = c1086gP.f();
                    if (objF2 == c0153a) {
                        objF2 = J0.f(Boolean.FALSE);
                        c1086gP.E(objF2);
                    }
                    x10 = (androidx.compose.runtime.X) objF2;
                    c1086gP.T(false);
                    c1086gP.L(-845471236);
                    if (CameraInputButton$lambda$7(x10)) {
                        String string9 = Phrase.from(context, io.intercom.android.sdk.R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                        String strP17 = S4.o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_settings);
                        String strP18 = S4.o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_not_now);
                        Integer numValueOf9 = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_ic_camera);
                        c1086gP.L(-845454121);
                        if ((i16 & 57344) == 16384) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF3 = c1086gP.f();
                        if (z11) {
                            objF3 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.f
                                @Override // Ia.a
                                public final Object invoke() {
                                    return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(aVar5, x10);
                                }
                            };
                            c1086gP.E(objF3);
                        } else {
                            objF3 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.f
                                @Override // Ia.a
                                public final Object invoke() {
                                    return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(aVar5, x10);
                                }
                            };
                            c1086gP.E(objF3);
                        }
                        c1086gP.T(false);
                        i18 = 8;
                        z10 = true;
                        PermissionDeniedDialogKt.PermissionDeniedDialog(null, string9, strP17, strP18, numValueOf9, (Ia.a) objF3, new coil.decode.t(context, 1, x10), c1086gP, 0, 1);
                    } else {
                        i18 = 8;
                        z10 = true;
                    }
                    c1086gP.T(false);
                    final String str10 = str;
                    androidx.compose.ui.h hVar13 = hVar3;
                    Ia.a<p293xa.r> aVar115 = aVar5;
                    final androidx.activity.compose.e eVarA18 = ActivityResultRegistryKt.a(new p076g.c(), new Ia.l() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.g
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            return CameraInputButtonKt.CameraInputButton$lambda$12(cameraInputType, context, str10, eVarA17, x19, x10, zBooleanValue);
                        }
                    }, c1086gP, i18);
                    final Ia.a aVar116 = c2333d;
                    c1086g = c1086gP;
                    androidx.compose.ui.h hVarC17 = ClickableKt.c(hVar13, false, null, new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.h
                        @Override // Ia.a
                        public final Object invoke() {
                            return CameraInputButtonKt.CameraInputButton$lambda$13(aVar116, context, eVarA18, cameraInputType, str10, eVarA17, x19);
                        }
                    }, 7);
                    androidx.compose.ui.layout.E eD9 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i19 = c1086g.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P9 = c1086g.P();
                    androidx.compose.ui.h hVarC18 = ComposedModifierKt.c(c1086g, hVarC17);
                    ComposeUiNode.f14331c0.getClass();
                    aVar6 = ComposeUiNode.Companion.f14333b;
                    c1086g.r();
                    if (c1086g.f12995O) {
                        c1086g.v(aVar6);
                    } else {
                        c1086g.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086g, eD9);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086g, interfaceC1089h0P9);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086g.f12995O) {
                        J4.i.d(i19, c1086g, i19, pVar);
                    } else {
                        J4.i.d(i19, c1086g, i19, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086g, hVarC18);
                    C7.g.b((i16 >> 15) & 14, content, c1086g, true);
                    hVar4 = hVar13;
                    aVar7 = aVar115;
                    aVar8 = c2333d;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new C2338i(hVar4, cameraInputType, onResult, aVar8, aVar7, content, i10, i11);
                }
            }
            i15 = 196608;
            i12 |= i15;
            i16 = i12;
            if ((i16 & 374491) == 74898) {
                if (i20 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i21 != 0) {
                    c2333d = new C2333d(0);
                } else {
                    c2333d = aVar3;
                }
                if (i13 != 0) {
                    aVar5 = new p027c1.a(1);
                } else {
                    aVar5 = aVar4;
                }
                context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                c1086gP.L(-845514337);
                objF = c1086gP.f();
                c0153a = InterfaceC1084f.a.f12980a;
                if (objF == c0153a) {
                    objF = J0.f("");
                    c1086gP.E(objF);
                }
                final androidx.compose.runtime.X x110 = (androidx.compose.runtime.X) objF;
                c1086gP.T(false);
                i17 = WhenMappings.$EnumSwitchMapping$0[cameraInputType.ordinal()];
                if (i17 == 1) {
                    str = "videos";
                } else {
                    if (i17 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "images";
                }
                final androidx.activity.compose.e eVarA19 = ActivityResultRegistryKt.a(new p076g.d(), new C2334e(onResult, context, str, x110), c1086gP, 8);
                c1086gP.L(-845473406);
                objF2 = c1086gP.f();
                if (objF2 == c0153a) {
                    objF2 = J0.f(Boolean.FALSE);
                    c1086gP.E(objF2);
                }
                x10 = (androidx.compose.runtime.X) objF2;
                c1086gP.T(false);
                c1086gP.L(-845471236);
                if (CameraInputButton$lambda$7(x10)) {
                    String string10 = Phrase.from(context, io.intercom.android.sdk.R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                    String strP19 = S4.o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_settings);
                    String strP110 = S4.o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_not_now);
                    Integer numValueOf10 = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_ic_camera);
                    c1086gP.L(-845454121);
                    if ((i16 & 57344) == 16384) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF3 = c1086gP.f();
                    if (z11) {
                        objF3 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.f
                            @Override // Ia.a
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(aVar5, x10);
                            }
                        };
                        c1086gP.E(objF3);
                    } else {
                        objF3 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.f
                            @Override // Ia.a
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(aVar5, x10);
                            }
                        };
                        c1086gP.E(objF3);
                    }
                    c1086gP.T(false);
                    i18 = 8;
                    z10 = true;
                    PermissionDeniedDialogKt.PermissionDeniedDialog(null, string10, strP19, strP110, numValueOf10, (Ia.a) objF3, new coil.decode.t(context, 1, x10), c1086gP, 0, 1);
                } else {
                    i18 = 8;
                    z10 = true;
                }
                c1086gP.T(false);
                final String str11 = str;
                androidx.compose.ui.h hVar14 = hVar3;
                Ia.a<p293xa.r> aVar117 = aVar5;
                final androidx.activity.compose.e eVarA110 = ActivityResultRegistryKt.a(new p076g.c(), new Ia.l() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.g
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        return CameraInputButtonKt.CameraInputButton$lambda$12(cameraInputType, context, str11, eVarA19, x110, x10, zBooleanValue);
                    }
                }, c1086gP, i18);
                final Ia.a aVar118 = c2333d;
                c1086g = c1086gP;
                androidx.compose.ui.h hVarC19 = ClickableKt.c(hVar14, false, null, new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.h
                    @Override // Ia.a
                    public final Object invoke() {
                        return CameraInputButtonKt.CameraInputButton$lambda$13(aVar118, context, eVarA110, cameraInputType, str11, eVarA19, x110);
                    }
                }, 7);
                androidx.compose.ui.layout.E eD10 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i19 = c1086g.f12996P;
                InterfaceC1089h0 interfaceC1089h0P10 = c1086g.P();
                androidx.compose.ui.h hVarC110 = ComposedModifierKt.c(c1086g, hVarC19);
                ComposeUiNode.f14331c0.getClass();
                aVar6 = ComposeUiNode.Companion.f14333b;
                c1086g.r();
                if (c1086g.f12995O) {
                    c1086g.v(aVar6);
                } else {
                    c1086g.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086g, eD10);
                R0.a(ComposeUiNode.Companion.f14336e, c1086g, interfaceC1089h0P10);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086g.f12995O) {
                    J4.i.d(i19, c1086g, i19, pVar);
                } else {
                    J4.i.d(i19, c1086g, i19, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086g, hVarC110);
                C7.g.b((i16 >> 15) & 14, content, c1086g, true);
                hVar4 = hVar14;
                aVar7 = aVar117;
                aVar8 = c2333d;
            } else {
                if (i20 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i21 != 0) {
                    c2333d = new C2333d(0);
                } else {
                    c2333d = aVar3;
                }
                if (i13 != 0) {
                    aVar5 = new p027c1.a(1);
                } else {
                    aVar5 = aVar4;
                }
                context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                c1086gP.L(-845514337);
                objF = c1086gP.f();
                c0153a = InterfaceC1084f.a.f12980a;
                if (objF == c0153a) {
                    objF = J0.f("");
                    c1086gP.E(objF);
                }
                final androidx.compose.runtime.X x111 = (androidx.compose.runtime.X) objF;
                c1086gP.T(false);
                i17 = WhenMappings.$EnumSwitchMapping$0[cameraInputType.ordinal()];
                if (i17 == 1) {
                    str = "videos";
                } else {
                    if (i17 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "images";
                }
                final androidx.activity.compose.e eVarA111 = ActivityResultRegistryKt.a(new p076g.d(), new C2334e(onResult, context, str, x111), c1086gP, 8);
                c1086gP.L(-845473406);
                objF2 = c1086gP.f();
                if (objF2 == c0153a) {
                    objF2 = J0.f(Boolean.FALSE);
                    c1086gP.E(objF2);
                }
                x10 = (androidx.compose.runtime.X) objF2;
                c1086gP.T(false);
                c1086gP.L(-845471236);
                if (CameraInputButton$lambda$7(x10)) {
                    String string11 = Phrase.from(context, io.intercom.android.sdk.R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                    String strP111 = S4.o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_settings);
                    String strP112 = S4.o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_not_now);
                    Integer numValueOf11 = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_ic_camera);
                    c1086gP.L(-845454121);
                    if ((i16 & 57344) == 16384) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF3 = c1086gP.f();
                    if (z11) {
                        objF3 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.f
                            @Override // Ia.a
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(aVar5, x10);
                            }
                        };
                        c1086gP.E(objF3);
                    } else {
                        objF3 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.f
                            @Override // Ia.a
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(aVar5, x10);
                            }
                        };
                        c1086gP.E(objF3);
                    }
                    c1086gP.T(false);
                    i18 = 8;
                    z10 = true;
                    PermissionDeniedDialogKt.PermissionDeniedDialog(null, string11, strP111, strP112, numValueOf11, (Ia.a) objF3, new coil.decode.t(context, 1, x10), c1086gP, 0, 1);
                } else {
                    i18 = 8;
                    z10 = true;
                }
                c1086gP.T(false);
                final String str12 = str;
                androidx.compose.ui.h hVar15 = hVar3;
                Ia.a<p293xa.r> aVar119 = aVar5;
                final androidx.activity.compose.e eVarA112 = ActivityResultRegistryKt.a(new p076g.c(), new Ia.l() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.g
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        return CameraInputButtonKt.CameraInputButton$lambda$12(cameraInputType, context, str12, eVarA111, x111, x10, zBooleanValue);
                    }
                }, c1086gP, i18);
                final Ia.a aVar1110 = c2333d;
                c1086g = c1086gP;
                androidx.compose.ui.h hVarC111 = ClickableKt.c(hVar15, false, null, new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.h
                    @Override // Ia.a
                    public final Object invoke() {
                        return CameraInputButtonKt.CameraInputButton$lambda$13(aVar1110, context, eVarA112, cameraInputType, str12, eVarA111, x111);
                    }
                }, 7);
                androidx.compose.ui.layout.E eD11 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i19 = c1086g.f12996P;
                InterfaceC1089h0 interfaceC1089h0P11 = c1086g.P();
                androidx.compose.ui.h hVarC112 = ComposedModifierKt.c(c1086g, hVarC111);
                ComposeUiNode.f14331c0.getClass();
                aVar6 = ComposeUiNode.Companion.f14333b;
                c1086g.r();
                if (c1086g.f12995O) {
                    c1086g.v(aVar6);
                } else {
                    c1086g.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086g, eD11);
                R0.a(ComposeUiNode.Companion.f14336e, c1086g, interfaceC1089h0P11);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086g.f12995O) {
                    J4.i.d(i19, c1086g, i19, pVar);
                } else {
                    J4.i.d(i19, c1086g, i19, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086g, hVarC112);
                C7.g.b((i16 >> 15) & 14, content, c1086g, true);
                hVar4 = hVar15;
                aVar7 = aVar119;
                aVar8 = c2333d;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new C2338i(hVar4, cameraInputType, onResult, aVar8, aVar7, content, i10, i11);
            }
        }
        i12 |= 24576;
        aVar4 = aVar2;
        if ((i11 & 32) != 0) {
            if ((458752 & i10) == 0) {
                if (c1086gP.k(content)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
            }
            i16 = i12;
            if ((i16 & 374491) == 74898) {
                if (i20 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i21 != 0) {
                    c2333d = new C2333d(0);
                } else {
                    c2333d = aVar3;
                }
                if (i13 != 0) {
                    aVar5 = new p027c1.a(1);
                } else {
                    aVar5 = aVar4;
                }
                context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                c1086gP.L(-845514337);
                objF = c1086gP.f();
                c0153a = InterfaceC1084f.a.f12980a;
                if (objF == c0153a) {
                    objF = J0.f("");
                    c1086gP.E(objF);
                }
                final androidx.compose.runtime.X x112 = (androidx.compose.runtime.X) objF;
                c1086gP.T(false);
                i17 = WhenMappings.$EnumSwitchMapping$0[cameraInputType.ordinal()];
                if (i17 == 1) {
                    str = "videos";
                } else {
                    if (i17 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "images";
                }
                final androidx.activity.compose.e eVarA113 = ActivityResultRegistryKt.a(new p076g.d(), new C2334e(onResult, context, str, x112), c1086gP, 8);
                c1086gP.L(-845473406);
                objF2 = c1086gP.f();
                if (objF2 == c0153a) {
                    objF2 = J0.f(Boolean.FALSE);
                    c1086gP.E(objF2);
                }
                x10 = (androidx.compose.runtime.X) objF2;
                c1086gP.T(false);
                c1086gP.L(-845471236);
                if (CameraInputButton$lambda$7(x10)) {
                    String string12 = Phrase.from(context, io.intercom.android.sdk.R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                    String strP113 = S4.o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_settings);
                    String strP114 = S4.o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_not_now);
                    Integer numValueOf12 = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_ic_camera);
                    c1086gP.L(-845454121);
                    if ((i16 & 57344) == 16384) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF3 = c1086gP.f();
                    if (z11) {
                        objF3 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.f
                            @Override // Ia.a
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(aVar5, x10);
                            }
                        };
                        c1086gP.E(objF3);
                    } else {
                        objF3 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.f
                            @Override // Ia.a
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(aVar5, x10);
                            }
                        };
                        c1086gP.E(objF3);
                    }
                    c1086gP.T(false);
                    i18 = 8;
                    z10 = true;
                    PermissionDeniedDialogKt.PermissionDeniedDialog(null, string12, strP113, strP114, numValueOf12, (Ia.a) objF3, new coil.decode.t(context, 1, x10), c1086gP, 0, 1);
                } else {
                    i18 = 8;
                    z10 = true;
                }
                c1086gP.T(false);
                final String str13 = str;
                androidx.compose.ui.h hVar16 = hVar3;
                Ia.a<p293xa.r> aVar1111 = aVar5;
                final androidx.activity.compose.e eVarA114 = ActivityResultRegistryKt.a(new p076g.c(), new Ia.l() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.g
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        return CameraInputButtonKt.CameraInputButton$lambda$12(cameraInputType, context, str13, eVarA113, x112, x10, zBooleanValue);
                    }
                }, c1086gP, i18);
                final Ia.a aVar1112 = c2333d;
                c1086g = c1086gP;
                androidx.compose.ui.h hVarC113 = ClickableKt.c(hVar16, false, null, new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.h
                    @Override // Ia.a
                    public final Object invoke() {
                        return CameraInputButtonKt.CameraInputButton$lambda$13(aVar1112, context, eVarA114, cameraInputType, str13, eVarA113, x112);
                    }
                }, 7);
                androidx.compose.ui.layout.E eD12 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i19 = c1086g.f12996P;
                InterfaceC1089h0 interfaceC1089h0P12 = c1086g.P();
                androidx.compose.ui.h hVarC114 = ComposedModifierKt.c(c1086g, hVarC113);
                ComposeUiNode.f14331c0.getClass();
                aVar6 = ComposeUiNode.Companion.f14333b;
                c1086g.r();
                if (c1086g.f12995O) {
                    c1086g.v(aVar6);
                } else {
                    c1086g.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086g, eD12);
                R0.a(ComposeUiNode.Companion.f14336e, c1086g, interfaceC1089h0P12);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086g.f12995O) {
                    J4.i.d(i19, c1086g, i19, pVar);
                } else {
                    J4.i.d(i19, c1086g, i19, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086g, hVarC114);
                C7.g.b((i16 >> 15) & 14, content, c1086g, true);
                hVar4 = hVar16;
                aVar7 = aVar1111;
                aVar8 = c2333d;
            } else {
                if (i20 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i21 != 0) {
                    c2333d = new C2333d(0);
                } else {
                    c2333d = aVar3;
                }
                if (i13 != 0) {
                    aVar5 = new p027c1.a(1);
                } else {
                    aVar5 = aVar4;
                }
                context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                c1086gP.L(-845514337);
                objF = c1086gP.f();
                c0153a = InterfaceC1084f.a.f12980a;
                if (objF == c0153a) {
                    objF = J0.f("");
                    c1086gP.E(objF);
                }
                final androidx.compose.runtime.X x113 = (androidx.compose.runtime.X) objF;
                c1086gP.T(false);
                i17 = WhenMappings.$EnumSwitchMapping$0[cameraInputType.ordinal()];
                if (i17 == 1) {
                    str = "videos";
                } else {
                    if (i17 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "images";
                }
                final androidx.activity.compose.e eVarA115 = ActivityResultRegistryKt.a(new p076g.d(), new C2334e(onResult, context, str, x113), c1086gP, 8);
                c1086gP.L(-845473406);
                objF2 = c1086gP.f();
                if (objF2 == c0153a) {
                    objF2 = J0.f(Boolean.FALSE);
                    c1086gP.E(objF2);
                }
                x10 = (androidx.compose.runtime.X) objF2;
                c1086gP.T(false);
                c1086gP.L(-845471236);
                if (CameraInputButton$lambda$7(x10)) {
                    String string13 = Phrase.from(context, io.intercom.android.sdk.R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                    String strP115 = S4.o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_settings);
                    String strP116 = S4.o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_not_now);
                    Integer numValueOf13 = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_ic_camera);
                    c1086gP.L(-845454121);
                    if ((i16 & 57344) == 16384) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF3 = c1086gP.f();
                    if (z11) {
                        objF3 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.f
                            @Override // Ia.a
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(aVar5, x10);
                            }
                        };
                        c1086gP.E(objF3);
                    } else {
                        objF3 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.f
                            @Override // Ia.a
                            public final Object invoke() {
                                return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(aVar5, x10);
                            }
                        };
                        c1086gP.E(objF3);
                    }
                    c1086gP.T(false);
                    i18 = 8;
                    z10 = true;
                    PermissionDeniedDialogKt.PermissionDeniedDialog(null, string13, strP115, strP116, numValueOf13, (Ia.a) objF3, new coil.decode.t(context, 1, x10), c1086gP, 0, 1);
                } else {
                    i18 = 8;
                    z10 = true;
                }
                c1086gP.T(false);
                final String str14 = str;
                androidx.compose.ui.h hVar17 = hVar3;
                Ia.a<p293xa.r> aVar1113 = aVar5;
                final androidx.activity.compose.e eVarA116 = ActivityResultRegistryKt.a(new p076g.c(), new Ia.l() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.g
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        return CameraInputButtonKt.CameraInputButton$lambda$12(cameraInputType, context, str14, eVarA115, x113, x10, zBooleanValue);
                    }
                }, c1086gP, i18);
                final Ia.a aVar1114 = c2333d;
                c1086g = c1086gP;
                androidx.compose.ui.h hVarC115 = ClickableKt.c(hVar17, false, null, new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.h
                    @Override // Ia.a
                    public final Object invoke() {
                        return CameraInputButtonKt.CameraInputButton$lambda$13(aVar1114, context, eVarA116, cameraInputType, str14, eVarA115, x113);
                    }
                }, 7);
                androidx.compose.ui.layout.E eD13 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i19 = c1086g.f12996P;
                InterfaceC1089h0 interfaceC1089h0P13 = c1086g.P();
                androidx.compose.ui.h hVarC116 = ComposedModifierKt.c(c1086g, hVarC115);
                ComposeUiNode.f14331c0.getClass();
                aVar6 = ComposeUiNode.Companion.f14333b;
                c1086g.r();
                if (c1086g.f12995O) {
                    c1086g.v(aVar6);
                } else {
                    c1086g.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086g, eD13);
                R0.a(ComposeUiNode.Companion.f14336e, c1086g, interfaceC1089h0P13);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086g.f12995O) {
                    J4.i.d(i19, c1086g, i19, pVar);
                } else {
                    J4.i.d(i19, c1086g, i19, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086g, hVarC116);
                C7.g.b((i16 >> 15) & 14, content, c1086g, true);
                hVar4 = hVar17;
                aVar7 = aVar1113;
                aVar8 = c2333d;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new C2338i(hVar4, cameraInputType, onResult, aVar8, aVar7, content, i10, i11);
            }
        }
        i15 = 196608;
        i12 |= i15;
        i16 = i12;
        if ((i16 & 374491) == 74898) {
            if (i20 != 0) {
                hVar3 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar3 = hVar2;
            }
            if (i21 != 0) {
                c2333d = new C2333d(0);
            } else {
                c2333d = aVar3;
            }
            if (i13 != 0) {
                aVar5 = new p027c1.a(1);
            } else {
                aVar5 = aVar4;
            }
            context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
            c1086gP.L(-845514337);
            objF = c1086gP.f();
            c0153a = InterfaceC1084f.a.f12980a;
            if (objF == c0153a) {
                objF = J0.f("");
                c1086gP.E(objF);
            }
            final androidx.compose.runtime.X x114 = (androidx.compose.runtime.X) objF;
            c1086gP.T(false);
            i17 = WhenMappings.$EnumSwitchMapping$0[cameraInputType.ordinal()];
            if (i17 == 1) {
                str = "videos";
            } else {
                if (i17 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "images";
            }
            final androidx.activity.compose.e eVarA117 = ActivityResultRegistryKt.a(new p076g.d(), new C2334e(onResult, context, str, x114), c1086gP, 8);
            c1086gP.L(-845473406);
            objF2 = c1086gP.f();
            if (objF2 == c0153a) {
                objF2 = J0.f(Boolean.FALSE);
                c1086gP.E(objF2);
            }
            x10 = (androidx.compose.runtime.X) objF2;
            c1086gP.T(false);
            c1086gP.L(-845471236);
            if (CameraInputButton$lambda$7(x10)) {
                String string14 = Phrase.from(context, io.intercom.android.sdk.R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                String strP117 = S4.o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_settings);
                String strP118 = S4.o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_not_now);
                Integer numValueOf14 = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_ic_camera);
                c1086gP.L(-845454121);
                if ((i16 & 57344) == 16384) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objF3 = c1086gP.f();
                if (z11) {
                    objF3 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.f
                        @Override // Ia.a
                        public final Object invoke() {
                            return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(aVar5, x10);
                        }
                    };
                    c1086gP.E(objF3);
                } else {
                    objF3 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.f
                        @Override // Ia.a
                        public final Object invoke() {
                            return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(aVar5, x10);
                        }
                    };
                    c1086gP.E(objF3);
                }
                c1086gP.T(false);
                i18 = 8;
                z10 = true;
                PermissionDeniedDialogKt.PermissionDeniedDialog(null, string14, strP117, strP118, numValueOf14, (Ia.a) objF3, new coil.decode.t(context, 1, x10), c1086gP, 0, 1);
            } else {
                i18 = 8;
                z10 = true;
            }
            c1086gP.T(false);
            final String str15 = str;
            androidx.compose.ui.h hVar18 = hVar3;
            Ia.a<p293xa.r> aVar1115 = aVar5;
            final androidx.activity.compose.e eVarA118 = ActivityResultRegistryKt.a(new p076g.c(), new Ia.l() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.g
                @Override // Ia.l
                public final Object invoke(Object obj) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    return CameraInputButtonKt.CameraInputButton$lambda$12(cameraInputType, context, str15, eVarA117, x114, x10, zBooleanValue);
                }
            }, c1086gP, i18);
            final Ia.a aVar1116 = c2333d;
            c1086g = c1086gP;
            androidx.compose.ui.h hVarC117 = ClickableKt.c(hVar18, false, null, new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.h
                @Override // Ia.a
                public final Object invoke() {
                    return CameraInputButtonKt.CameraInputButton$lambda$13(aVar1116, context, eVarA118, cameraInputType, str15, eVarA117, x114);
                }
            }, 7);
            androidx.compose.ui.layout.E eD14 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
            i19 = c1086g.f12996P;
            InterfaceC1089h0 interfaceC1089h0P14 = c1086g.P();
            androidx.compose.ui.h hVarC118 = ComposedModifierKt.c(c1086g, hVarC117);
            ComposeUiNode.f14331c0.getClass();
            aVar6 = ComposeUiNode.Companion.f14333b;
            c1086g.r();
            if (c1086g.f12995O) {
                c1086g.v(aVar6);
            } else {
                c1086g.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086g, eD14);
            R0.a(ComposeUiNode.Companion.f14336e, c1086g, interfaceC1089h0P14);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086g.f12995O) {
                J4.i.d(i19, c1086g, i19, pVar);
            } else {
                J4.i.d(i19, c1086g, i19, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086g, hVarC118);
            C7.g.b((i16 >> 15) & 14, content, c1086g, true);
            hVar4 = hVar18;
            aVar7 = aVar1115;
            aVar8 = c2333d;
        } else {
            if (i20 != 0) {
                hVar3 = androidx.compose.ui.h.a.f13984b;
            } else {
                hVar3 = hVar2;
            }
            if (i21 != 0) {
                c2333d = new C2333d(0);
            } else {
                c2333d = aVar3;
            }
            if (i13 != 0) {
                aVar5 = new p027c1.a(1);
            } else {
                aVar5 = aVar4;
            }
            context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
            c1086gP.L(-845514337);
            objF = c1086gP.f();
            c0153a = InterfaceC1084f.a.f12980a;
            if (objF == c0153a) {
                objF = J0.f("");
                c1086gP.E(objF);
            }
            final androidx.compose.runtime.X x115 = (androidx.compose.runtime.X) objF;
            c1086gP.T(false);
            i17 = WhenMappings.$EnumSwitchMapping$0[cameraInputType.ordinal()];
            if (i17 == 1) {
                str = "videos";
            } else {
                if (i17 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "images";
            }
            final androidx.activity.compose.e eVarA119 = ActivityResultRegistryKt.a(new p076g.d(), new C2334e(onResult, context, str, x115), c1086gP, 8);
            c1086gP.L(-845473406);
            objF2 = c1086gP.f();
            if (objF2 == c0153a) {
                objF2 = J0.f(Boolean.FALSE);
                c1086gP.E(objF2);
            }
            x10 = (androidx.compose.runtime.X) objF2;
            c1086gP.T(false);
            c1086gP.L(-845471236);
            if (CameraInputButton$lambda$7(x10)) {
                String string15 = Phrase.from(context, io.intercom.android.sdk.R.string.intercom_need_camera_access).put("app_name", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString()).format().toString();
                String strP119 = S4.o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_settings);
                String strP1110 = S4.o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_not_now);
                Integer numValueOf15 = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_ic_camera);
                c1086gP.L(-845454121);
                if ((i16 & 57344) == 16384) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objF3 = c1086gP.f();
                if (z11) {
                    objF3 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.f
                        @Override // Ia.a
                        public final Object invoke() {
                            return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(aVar5, x10);
                        }
                    };
                    c1086gP.E(objF3);
                } else {
                    objF3 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.f
                        @Override // Ia.a
                        public final Object invoke() {
                            return CameraInputButtonKt.CameraInputButton$lambda$10$lambda$9(aVar5, x10);
                        }
                    };
                    c1086gP.E(objF3);
                }
                c1086gP.T(false);
                i18 = 8;
                z10 = true;
                PermissionDeniedDialogKt.PermissionDeniedDialog(null, string15, strP119, strP1110, numValueOf15, (Ia.a) objF3, new coil.decode.t(context, 1, x10), c1086gP, 0, 1);
            } else {
                i18 = 8;
                z10 = true;
            }
            c1086gP.T(false);
            final String str16 = str;
            androidx.compose.ui.h hVar19 = hVar3;
            Ia.a<p293xa.r> aVar1117 = aVar5;
            final androidx.activity.compose.e eVarA1110 = ActivityResultRegistryKt.a(new p076g.c(), new Ia.l() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.g
                @Override // Ia.l
                public final Object invoke(Object obj) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    return CameraInputButtonKt.CameraInputButton$lambda$12(cameraInputType, context, str16, eVarA119, x115, x10, zBooleanValue);
                }
            }, c1086gP, i18);
            final Ia.a aVar1118 = c2333d;
            c1086g = c1086gP;
            androidx.compose.ui.h hVarC119 = ClickableKt.c(hVar19, false, null, new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.h
                @Override // Ia.a
                public final Object invoke() {
                    return CameraInputButtonKt.CameraInputButton$lambda$13(aVar1118, context, eVarA1110, cameraInputType, str16, eVarA119, x115);
                }
            }, 7);
            androidx.compose.ui.layout.E eD15 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
            i19 = c1086g.f12996P;
            InterfaceC1089h0 interfaceC1089h0P15 = c1086g.P();
            androidx.compose.ui.h hVarC1110 = ComposedModifierKt.c(c1086g, hVarC119);
            ComposeUiNode.f14331c0.getClass();
            aVar6 = ComposeUiNode.Companion.f14333b;
            c1086g.r();
            if (c1086g.f12995O) {
                c1086g.v(aVar6);
            } else {
                c1086g.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086g, eD15);
            R0.a(ComposeUiNode.Companion.f14336e, c1086g, interfaceC1089h0P15);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086g.f12995O) {
                J4.i.d(i19, c1086g, i19, pVar);
            } else {
                J4.i.d(i19, c1086g, i19, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086g, hVarC1110);
            C7.g.b((i16 >> 15) & 14, content, c1086g, true);
            hVar4 = hVar19;
            aVar7 = aVar1117;
            aVar8 = c2333d;
        }
        c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2338i(hVar4, cameraInputType, onResult, aVar8, aVar7, content, i10, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r CameraInputButton$lambda$10$lambda$9(Ia.a aVar, androidx.compose.runtime.X showDialog$delegate) {
        kotlin.jvm.internal.i.e(showDialog$delegate, "$showDialog$delegate");
        CameraInputButton$lambda$8(showDialog$delegate, false);
        aVar.invoke();
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r CameraInputButton$lambda$11(Context context, androidx.compose.runtime.X showDialog$delegate) {
        kotlin.jvm.internal.i.e(context, "$context");
        kotlin.jvm.internal.i.e(showDialog$delegate, "$showDialog$delegate");
        CameraInputButton$lambda$8(showDialog$delegate, false);
        context.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", context.getPackageName(), null)));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r CameraInputButton$lambda$12(CameraInputType cameraInputType, Context context, String folderName, androidx.activity.compose.e cameraLauncher, androidx.compose.runtime.X latestFileName$delegate, androidx.compose.runtime.X showDialog$delegate, boolean z10) {
        kotlin.jvm.internal.i.e(cameraInputType, "$cameraInputType");
        kotlin.jvm.internal.i.e(context, "$context");
        kotlin.jvm.internal.i.e(folderName, "$folderName");
        kotlin.jvm.internal.i.e(cameraLauncher, "$cameraLauncher");
        kotlin.jvm.internal.i.e(latestFileName$delegate, "$latestFileName$delegate");
        kotlin.jvm.internal.i.e(showDialog$delegate, "$showDialog$delegate");
        if (z10) {
            CameraInputButton$launchCameraIntent(cameraInputType, context, folderName, cameraLauncher, latestFileName$delegate);
        } else {
            CameraInputButton$lambda$8(showDialog$delegate, true);
        }
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r CameraInputButton$lambda$13(Ia.a aVar, Context context, androidx.activity.compose.e permissionLauncher, CameraInputType cameraInputType, String folderName, androidx.activity.compose.e cameraLauncher, androidx.compose.runtime.X latestFileName$delegate) {
        kotlin.jvm.internal.i.e(context, "$context");
        kotlin.jvm.internal.i.e(permissionLauncher, "$permissionLauncher");
        kotlin.jvm.internal.i.e(cameraInputType, "$cameraInputType");
        kotlin.jvm.internal.i.e(folderName, "$folderName");
        kotlin.jvm.internal.i.e(cameraLauncher, "$cameraLauncher");
        kotlin.jvm.internal.i.e(latestFileName$delegate, "$latestFileName$delegate");
        aVar.invoke();
        if (!hasCameraPermissionInManifest(context) || p186p0.a.a(context, "android.permission.CAMERA") == 0) {
            CameraInputButton$launchCameraIntent(cameraInputType, context, folderName, cameraLauncher, latestFileName$delegate);
        } else {
            permissionLauncher.a("android.permission.CAMERA");
        }
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r CameraInputButton$lambda$15(androidx.compose.ui.h hVar, CameraInputType cameraInputType, Ia.l onResult, Ia.a aVar, Ia.a aVar2, Ia.p content, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(cameraInputType, "$cameraInputType");
        kotlin.jvm.internal.i.e(onResult, "$onResult");
        kotlin.jvm.internal.i.e(content, "$content");
        CameraInputButton(hVar, cameraInputType, onResult, aVar, aVar2, content, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    private static final String CameraInputButton$lambda$3(androidx.compose.runtime.X<String> x10) {
        return x10.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r CameraInputButton$lambda$5(Ia.l onResult, Context context, String folderName, androidx.compose.runtime.X latestFileName$delegate, p063f.a result) {
        kotlin.jvm.internal.i.e(onResult, "$onResult");
        kotlin.jvm.internal.i.e(context, "$context");
        kotlin.jvm.internal.i.e(folderName, "$folderName");
        kotlin.jvm.internal.i.e(latestFileName$delegate, "$latestFileName$delegate");
        kotlin.jvm.internal.i.e(result, "result");
        if (result.f34886b == -1 && CameraInputButton$lambda$3(latestFileName$delegate).length() > 0) {
            onResult.invoke(getUriByFileName(context, CameraInputButton$lambda$3(latestFileName$delegate), folderName));
        }
        latestFileName$delegate.setValue("");
        return p293xa.r.f47939a;
    }

    private static final boolean CameraInputButton$lambda$7(androidx.compose.runtime.X<Boolean> x10) {
        return x10.getValue().booleanValue();
    }

    private static final void CameraInputButton$lambda$8(androidx.compose.runtime.X<Boolean> x10, boolean z10) {
        x10.setValue(Boolean.valueOf(z10));
    }

    private static final void CameraInputButton$launchCameraIntent(CameraInputType cameraInputType, Context context, String str, androidx.activity.compose.e<Intent, p063f.a> eVar, androidx.compose.runtime.X<String> x10) {
        String str2;
        Intent intent;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i10 = iArr[cameraInputType.ordinal()];
        if (i10 == 1) {
            str2 = ".mp4";
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = ".jpg";
        }
        String str3 = UUID.randomUUID() + str2;
        Uri uriByFileName = getUriByFileName(context, str3, str);
        x10.setValue(str3);
        int i11 = iArr[cameraInputType.ordinal()];
        if (i11 == 1) {
            intent = new Intent("android.media.action.VIDEO_CAPTURE");
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            intent = new Intent("android.media.action.IMAGE_CAPTURE");
        }
        Intent intentPutExtra = intent.putExtra("output", uriByFileName);
        kotlin.jvm.internal.i.d(intentPutExtra, "putExtra(...)");
        eVar.a(intentPutExtra);
    }

    private static final Uri getUriByFileName(Context context, String str, String str2) {
        File file = new File(context.getExternalCacheDir(), str2);
        file.mkdir();
        Uri uriForFile = FileProvider.getUriForFile(context, IntercomFileProviderKt.fileProviderAuthority(context), new File(file, str));
        kotlin.jvm.internal.i.d(uriForFile, "getUriForFile(...)");
        return uriForFile;
    }

    private static final boolean hasCameraPermissionInManifest(Context context) {
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null) {
                return kotlin.collections.k.M("android.permission.CAMERA", strArr);
            }
            return false;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return false;
        }
    }
}
