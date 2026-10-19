package io.intercom.android.sdk.m5.conversation.ui.components;

import android.net.Uri;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.RippleKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.m5.components.q0;
import io.intercom.android.sdk.m5.conversation.states.InputTypeState;
import io.intercom.android.sdk.m5.conversation.ui.C2406v;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputButtonKt;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.CameraInputType;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.ui.component.MediaPickerButtonCTAStyle;
import io.intercom.android.sdk.ui.component.MediaPickerButtonKt;
import io.intercom.android.sdk.ui.component.MediaType;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import me.zhanghai.android.materialprogressbar.R;
import p037cb.C1532j0;

/* JADX INFO: compiled from: MediaInputSheetContent.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class MediaInputSheetContentKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void MediaInputSheetContent(androidx.compose.ui.h hVar, final Ia.l<? super List<? extends Uri>, p293xa.r> onMediaSelected, final Ia.a<p293xa.r> dismissSheet, final Ia.l<? super String, p293xa.r> trackClickedInput, final InputTypeState inputTypeState, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        InterfaceC1084f.a.C0153a c0153a;
        int i12;
        boolean z10;
        boolean z11;
        int i13 = 2;
        boolean z12 = false;
        kotlin.jvm.internal.i.e(onMediaSelected, "onMediaSelected");
        kotlin.jvm.internal.i.e(dismissSheet, "dismissSheet");
        kotlin.jvm.internal.i.e(trackClickedInput, "trackClickedInput");
        kotlin.jvm.internal.i.e(inputTypeState, "inputTypeState");
        C1086g c1086gP = interfaceC1084f.p(-842940445);
        androidx.compose.ui.h hVar2 = (i11 & 1) != 0 ? androidx.compose.ui.h.a.f13984b : hVar;
        C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
        int i14 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVar2);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar);
        } else {
            c1086gP.A();
        }
        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA);
        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i14))) {
            J4.i.d(i14, c1086gP, i14, pVar);
        }
        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
        c1086gP.L(-1878694694);
        c1086gP.L(-1878695438);
        boolean cameraInputEnabled = inputTypeState.getCameraInputEnabled();
        InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
        if (cameraInputEnabled) {
            CameraInputType cameraInputType = CameraInputType.PHOTO;
            c1086gP.L(2017624231);
            int i15 = (i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48;
            Object[] objArr = (i15 > 32 && c1086gP.K(onMediaSelected)) || (i10 & 48) == 32;
            Object objF = c1086gP.f();
            if (objArr != false || objF == c0153a2) {
                objF = new Ya.i(i13, onMediaSelected);
                c1086gP.E(objF);
            }
            Ia.l lVar = (Ia.l) objF;
            c1086gP.T(false);
            c1086gP.L(2017628249);
            int i16 = (i10 & 7168) ^ 3072;
            boolean z13 = (i16 > 2048 && c1086gP.K(trackClickedInput)) || (i10 & 3072) == 2048;
            Object objF2 = c1086gP.f();
            if (z13 || objF2 == c0153a2) {
                objF2 = new C1532j0(i13, trackClickedInput);
                c1086gP.E(objF2);
            }
            Ia.a aVar2 = (Ia.a) objF2;
            c1086gP.T(false);
            c1086gP.L(2017632787);
            int i17 = (i10 & 896) ^ 384;
            boolean z14 = (i17 > 256 && c1086gP.K(dismissSheet)) || (i10 & 384) == 256;
            Object objF3 = c1086gP.f();
            if (z14 || objF3 == c0153a2) {
                objF3 = new Z(1, dismissSheet);
                c1086gP.E(objF3);
            }
            c1086gP.T(false);
            ComposableSingletons$MediaInputSheetContentKt composableSingletons$MediaInputSheetContentKt = ComposableSingletons$MediaInputSheetContentKt.INSTANCE;
            c0153a = c0153a2;
            CameraInputButtonKt.CameraInputButton(null, cameraInputType, lVar, aVar2, (Ia.a) objF3, composableSingletons$MediaInputSheetContentKt.m165getLambda1$intercom_sdk_base_release(), c1086gP, 196656, 1);
            CameraInputType cameraInputType2 = CameraInputType.VIDEO;
            c1086gP.L(2017647079);
            boolean z15 = (i15 > 32 && c1086gP.K(onMediaSelected)) || (i10 & 48) == 32;
            Object objF4 = c1086gP.f();
            if (z15 || objF4 == c0153a) {
                objF4 = new Ia.l() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.I
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return MediaInputSheetContentKt.MediaInputSheetContent$lambda$21$lambda$20$lambda$7$lambda$6(onMediaSelected, (Uri) obj);
                    }
                };
                c1086gP.E(objF4);
            }
            Ia.l lVar2 = (Ia.l) objF4;
            c1086gP.T(false);
            c1086gP.L(2017651097);
            boolean z16 = (i16 > 2048 && c1086gP.K(trackClickedInput)) || (i10 & 3072) == 2048;
            Object objF5 = c1086gP.f();
            if (z16 || objF5 == c0153a) {
                z11 = false;
                objF5 = new J(0 == true ? 1 : 0, trackClickedInput);
                c1086gP.E(objF5);
            } else {
                z11 = false;
            }
            Ia.a aVar3 = (Ia.a) objF5;
            c1086gP.T(z11);
            c1086gP.L(2017655635);
            boolean z17 = (i17 > 256 && c1086gP.K(dismissSheet)) || (i10 & 384) == 256;
            Object objF6 = c1086gP.f();
            if (z17 || objF6 == c0153a) {
                objF6 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.K
                    @Override // Ia.a
                    public final Object invoke() {
                        return MediaInputSheetContentKt.MediaInputSheetContent$lambda$21$lambda$20$lambda$11$lambda$10(dismissSheet);
                    }
                };
                c1086gP.E(objF6);
            }
            c1086gP.T(false);
            CameraInputButtonKt.CameraInputButton(null, cameraInputType2, lVar2, aVar3, (Ia.a) objF6, composableSingletons$MediaInputSheetContentKt.m166getLambda2$intercom_sdk_base_release(), c1086gP, 196656, 1);
            z12 = false;
        } else {
            c0153a = c0153a2;
        }
        c1086gP.T(z12);
        c1086gP.L(-1878648653);
        if (inputTypeState.getMediaInputEnabled()) {
            MediaType mediaType = MediaType.ImageAndVideo;
            Set<String> trustedFileExtensions = inputTypeState.getTrustedFileExtensions();
            MediaPickerButtonCTAStyle.TopBarButton topBarButton = MediaPickerButtonCTAStyle.TopBarButton.INSTANCE;
            androidx.compose.material3.X xB = RippleKt.b(0.0f, 6, true);
            c1086gP.L(2017674808);
            boolean z18 = (((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) > 32 && c1086gP.K(onMediaSelected)) || (i10 & 48) == 32;
            Object objF7 = c1086gP.f();
            if (z18 || objF7 == c0153a) {
                z10 = false;
                objF7 = new L(0 == true ? 1 : 0, onMediaSelected);
                c1086gP.E(objF7);
            } else {
                z10 = false;
            }
            Ia.l lVar3 = (Ia.l) objF7;
            c1086gP.T(z10);
            c1086gP.L(2017682648);
            boolean z19 = (((i10 & 7168) ^ 3072) > 2048 && c1086gP.K(trackClickedInput)) || (i10 & 3072) == 2048;
            Object objF8 = c1086gP.f();
            if (z19 || objF8 == c0153a) {
                objF8 = new q0(2, trackClickedInput);
                c1086gP.E(objF8);
            }
            c1086gP.T(false);
            i12 = 6;
            MediaPickerButtonKt.MediaPickerButton(1, xB, mediaType, trustedFileExtensions, lVar3, topBarButton, (Ia.a) objF8, ComposableSingletons$MediaInputSheetContentKt.INSTANCE.m167getLambda3$intercom_sdk_base_release(), c1086gP, (MediaPickerButtonCTAStyle.TopBarButton.$stable << 15) | 12587446, 0);
        } else {
            i12 = 6;
        }
        c1086gP.T(false);
        c1086gP.L(-1878620614);
        if (inputTypeState.getFileInputEnabled()) {
            MediaType mediaType2 = MediaType.DocumentOnly;
            Set<String> trustedFileExtensions2 = inputTypeState.getTrustedFileExtensions();
            MediaPickerButtonCTAStyle.TopBarButton topBarButton2 = MediaPickerButtonCTAStyle.TopBarButton.INSTANCE;
            androidx.compose.material3.X xB2 = RippleKt.b(0.0f, i12, true);
            c1086gP.L(2017704824);
            boolean z20 = (((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) > 32 && c1086gP.K(onMediaSelected)) || (i10 & 48) == 32;
            Object objF9 = c1086gP.f();
            if (z20 || objF9 == c0153a) {
                objF9 = new C2406v(1, onMediaSelected);
                c1086gP.E(objF9);
            }
            Ia.l lVar4 = (Ia.l) objF9;
            c1086gP.T(false);
            c1086gP.L(2017712663);
            boolean z21 = (((i10 & 7168) ^ 3072) > 2048 && c1086gP.K(trackClickedInput)) || (i10 & 3072) == 2048;
            Object objF10 = c1086gP.f();
            if (z21 || objF10 == c0153a) {
                objF10 = new io.intercom.android.sdk.e(1, trackClickedInput);
                c1086gP.E(objF10);
            }
            c1086gP.T(false);
            MediaPickerButtonKt.MediaPickerButton(1, xB2, mediaType2, trustedFileExtensions2, lVar4, topBarButton2, (Ia.a) objF10, ComposableSingletons$MediaInputSheetContentKt.INSTANCE.m168getLambda4$intercom_sdk_base_release(), c1086gP, (MediaPickerButtonCTAStyle.TopBarButton.$stable << 15) | 12587446, 0);
        }
        c1086gP.T(false);
        p293xa.r rVar = p293xa.r.f47939a;
        C1105p0 c1105p0A = C4.a.a(c1086gP, false, true);
        if (c1105p0A != null) {
            final androidx.compose.ui.h hVar3 = hVar2;
            c1105p0A.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.H
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    androidx.compose.ui.h hVar4 = hVar3;
                    int i18 = i10;
                    int i19 = i11;
                    return MediaInputSheetContentKt.MediaInputSheetContent$lambda$22(hVar4, onMediaSelected, dismissSheet, trackClickedInput, inputTypeState, i18, i19, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MediaInputSheetContent$lambda$21$lambda$20$lambda$1$lambda$0(Ia.l onMediaSelected, Uri uri) {
        kotlin.jvm.internal.i.e(onMediaSelected, "$onMediaSelected");
        onMediaSelected.invoke(uri != null ? M1.k(uri) : EmptyList.f42983b);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MediaInputSheetContent$lambda$21$lambda$20$lambda$11$lambda$10(Ia.a dismissSheet) {
        kotlin.jvm.internal.i.e(dismissSheet, "$dismissSheet");
        dismissSheet.invoke();
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MediaInputSheetContent$lambda$21$lambda$20$lambda$13$lambda$12(Ia.l onMediaSelected, List it) {
        kotlin.jvm.internal.i.e(onMediaSelected, "$onMediaSelected");
        kotlin.jvm.internal.i.e(it, "it");
        onMediaSelected.invoke(it);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MediaInputSheetContent$lambda$21$lambda$20$lambda$15$lambda$14(Ia.l trackClickedInput) {
        kotlin.jvm.internal.i.e(trackClickedInput, "$trackClickedInput");
        trackClickedInput.invoke(MetricTracker.Object.IMAGE_INPUT);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MediaInputSheetContent$lambda$21$lambda$20$lambda$17$lambda$16(Ia.l onMediaSelected, List it) {
        kotlin.jvm.internal.i.e(onMediaSelected, "$onMediaSelected");
        kotlin.jvm.internal.i.e(it, "it");
        onMediaSelected.invoke(it);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MediaInputSheetContent$lambda$21$lambda$20$lambda$19$lambda$18(Ia.l trackClickedInput) {
        kotlin.jvm.internal.i.e(trackClickedInput, "$trackClickedInput");
        trackClickedInput.invoke(MetricTracker.Object.FILE_INPUT);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MediaInputSheetContent$lambda$21$lambda$20$lambda$3$lambda$2(Ia.l trackClickedInput) {
        kotlin.jvm.internal.i.e(trackClickedInput, "$trackClickedInput");
        trackClickedInput.invoke(MetricTracker.Object.CAMERA_INPUT);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MediaInputSheetContent$lambda$21$lambda$20$lambda$5$lambda$4(Ia.a dismissSheet) {
        kotlin.jvm.internal.i.e(dismissSheet, "$dismissSheet");
        dismissSheet.invoke();
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MediaInputSheetContent$lambda$21$lambda$20$lambda$7$lambda$6(Ia.l onMediaSelected, Uri uri) {
        kotlin.jvm.internal.i.e(onMediaSelected, "$onMediaSelected");
        onMediaSelected.invoke(uri != null ? M1.k(uri) : EmptyList.f42983b);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MediaInputSheetContent$lambda$21$lambda$20$lambda$9$lambda$8(Ia.l trackClickedInput) {
        kotlin.jvm.internal.i.e(trackClickedInput, "$trackClickedInput");
        trackClickedInput.invoke(MetricTracker.Object.CAMERA_INPUT);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MediaInputSheetContent$lambda$22(androidx.compose.ui.h hVar, Ia.l onMediaSelected, Ia.a dismissSheet, Ia.l trackClickedInput, InputTypeState inputTypeState, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(onMediaSelected, "$onMediaSelected");
        kotlin.jvm.internal.i.e(dismissSheet, "$dismissSheet");
        kotlin.jvm.internal.i.e(trackClickedInput, "$trackClickedInput");
        kotlin.jvm.internal.i.e(inputTypeState, "$inputTypeState");
        MediaInputSheetContent(hVar, onMediaSelected, dismissSheet, trackClickedInput, inputTypeState, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaInputSheetContentItem(final String str, final int i10, InterfaceC1084f interfaceC1084f, final int i11) {
        int i12;
        C1086g c1086g;
        C1086g c1086gP = interfaceC1084f.p(-181831684);
        if ((i11 & 14) == 0) {
            i12 = (c1086gP.K(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= c1086gP.h(i10) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && c1086gP.s()) {
            c1086gP.w();
            c1086g = c1086gP;
        } else {
            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
            androidx.compose.ui.h hVarD = androidx.compose.foundation.layout.W.d(androidx.compose.foundation.layout.W.e(aVar, 56), 1.0f);
            androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
            int i13 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarD);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i13))) {
                J4.i.d(i13, c1086gP, i13, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
            IconKt.a(U.c.a(i10, c1086gP, (i12 >> 3) & 14), null, androidx.compose.foundation.layout.W.m(aVar, 24), 0L, c1086gP, 440, 8);
            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar, 8));
            TextKt.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, i12 & 14, 0, 131070);
            c1086g = c1086gP;
            c1086g.T(true);
        }
        C1105p0 c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.G
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return MediaInputSheetContentKt.MediaInputSheetContentItem$lambda$24(str, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MediaInputSheetContentItem$lambda$24(String text, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(text, "$text");
        MediaInputSheetContentItem(text, i10, interfaceC1084f, L4.b.l(i11 | 1));
        return p293xa.r.f47939a;
    }
}
