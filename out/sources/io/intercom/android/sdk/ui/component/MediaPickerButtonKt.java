package io.intercom.android.sdk.ui.component;

import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.E;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.m5.components.C2289k0;
import io.intercom.android.sdk.m5.conversation.ui.C2405u;
import io.intercom.android.sdk.ui.preview.ui.PreviewMediaContract;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import java.util.Set;
import kotlin.collections.B;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: MediaPickerButton.kt */
/* JADX INFO: loaded from: classes.dex */
public final class MediaPickerButtonKt {
    private static final Set<String> defaultTrustedAudioExtensions;
    private static final Set<String> defaultTrustedDocumentExtensions;
    private static final Set<String> defaultTrustedFileExtensions;
    private static final Set<String> defaultTrustedImageExtensions;
    private static final Set<String> defaultTrustedVideoExtensions;

    static {
        Set<String> setC = B.C("gif", "jpeg", "jpg", "png", "heic", "dng");
        defaultTrustedImageExtensions = setC;
        Set<String> setC2 = B.C("mp4", "mov");
        defaultTrustedVideoExtensions = setC2;
        Set<String> setC3 = B.C("pdf", "txt");
        defaultTrustedDocumentExtensions = setC3;
        Set<String> setC4 = B.C("oga", "ogg");
        defaultTrustedAudioExtensions = setC4;
        defaultTrustedFileExtensions = B.A(B.A(B.A(setC, setC2), setC3), setC4);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0122  */
    /* JADX WARN: Code duplicated, block: B:103:0x012e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0133  */
    /* JADX WARN: Code duplicated, block: B:106:0x0138  */
    /* JADX WARN: Code duplicated, block: B:108:0x013c  */
    /* JADX WARN: Code duplicated, block: B:111:0x014e  */
    /* JADX WARN: Code duplicated, block: B:114:0x016c  */
    /* JADX WARN: Code duplicated, block: B:115:0x016e  */
    /* JADX WARN: Code duplicated, block: B:118:0x0175 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x0177  */
    /* JADX WARN: Code duplicated, block: B:122:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:125:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:126:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:129:0x0202  */
    /* JADX WARN: Code duplicated, block: B:131:0x0210  */
    /* JADX WARN: Code duplicated, block: B:135:0x0228  */
    /* JADX WARN: Code duplicated, block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:40:0x007e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0081  */
    /* JADX WARN: Code duplicated, block: B:43:0x0085  */
    /* JADX WARN: Code duplicated, block: B:45:0x008b  */
    /* JADX WARN: Code duplicated, block: B:46:0x008e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0095  */
    /* JADX WARN: Code duplicated, block: B:52:0x0099  */
    /* JADX WARN: Code duplicated, block: B:54:0x009e  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00db  */
    /* JADX WARN: Code duplicated, block: B:78:0x00de  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:88:0x0100  */
    /* JADX WARN: Code duplicated, block: B:90:0x0107  */
    /* JADX WARN: Code duplicated, block: B:99:0x011e  */
    public static final void MediaPickerButton(final int i10, androidx.compose.foundation.v vVar, MediaType mediaType, Set<String> set, final Ia.l<? super List<? extends Uri>, p293xa.r> onResult, final MediaPickerButtonCTAStyle mediaPickerButtonCTAStyle, Ia.a<p293xa.r> aVar, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> content, InterfaceC1084f interfaceC1084f, final int i11, final int i12) {
        int i13;
        androidx.compose.foundation.v vVar2;
        MediaType mediaType2;
        int i14;
        int i15;
        int i16;
        int i17;
        Ia.a<p293xa.r> aVar2;
        int i18;
        int i19;
        final Set<String> set2;
        Object objF;
        InterfaceC1084f.a.C0153a c0153a;
        boolean z10;
        Object objF2;
        Object objF3;
        int i20;
        Ia.a<ComposeUiNode> aVar3;
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar;
        final androidx.compose.foundation.v vVar3;
        final MediaType mediaType3;
        final Ia.a<p293xa.r> aVar4;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(onResult, "onResult");
        kotlin.jvm.internal.i.e(mediaPickerButtonCTAStyle, "mediaPickerButtonCTAStyle");
        kotlin.jvm.internal.i.e(content, "content");
        C1086g c1086gP = interfaceC1084f.p(-1770734349);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (c1086gP.h(i10) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            if ((i12 & 2) == 0) {
                vVar2 = vVar;
                int i21 = c1086gP.K(vVar2) ? 32 : 16;
                i13 |= i21;
            } else {
                vVar2 = vVar;
            }
            i13 |= i21;
        } else {
            vVar2 = vVar;
        }
        int i22 = i12 & 4;
        if (i22 == 0) {
            if ((i11 & 896) == 0) {
                mediaType2 = mediaType;
                i13 |= c1086gP.K(mediaType2) ? 256 : 128;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                i13 |= 1024;
            }
            if ((i12 & 16) != 0) {
                i13 |= 24576;
            } else if ((i11 & 57344) == 0) {
                if (c1086gP.k(onResult)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i13 |= i15;
            }
            if ((i12 & 32) != 0) {
                if ((458752 & i11) == 0) {
                    if (c1086gP.K(mediaPickerButtonCTAStyle)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                }
                i17 = i12 & 64;
                if (i17 != 0) {
                    if ((3670016 & i11) == 0) {
                        aVar2 = aVar;
                        if (c1086gP.k(aVar2)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i13 |= i18;
                    }
                    if ((i12 & 128) != 0) {
                        if ((29360128 & i11) == 0) {
                            if (c1086gP.k(content)) {
                                i19 = 8388608;
                            } else {
                                i19 = 4194304;
                            }
                        }
                        if (i14 != 8 && (i13 & 23967451) == 4793490 && c1086gP.s()) {
                            c1086gP.w();
                            set2 = set;
                        } else {
                            c1086gP.r0();
                            if ((i11 & 1) != 0 || c1086gP.a0()) {
                                if ((i12 & 2) != 0) {
                                    vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                                    i13 &= -113;
                                }
                                if (i22 != 0) {
                                    mediaType2 = MediaType.All;
                                }
                                if (i14 != 0) {
                                    set2 = defaultTrustedFileExtensions;
                                    i13 &= -7169;
                                } else {
                                    set2 = set;
                                }
                                if (i17 != 0) {
                                    aVar2 = new M9.a(2);
                                }
                            } else {
                                c1086gP.w();
                                if ((i12 & 2) != 0) {
                                    i13 &= -113;
                                }
                                if (i14 != 0) {
                                    i13 &= -7169;
                                }
                                set2 = set;
                            }
                            c1086gP.U();
                            objF = c1086gP.f();
                            c0153a = InterfaceC1084f.a.f12980a;
                            if (objF == c0153a) {
                                objF = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                                c1086gP.E(objF);
                            }
                            final A a10 = (A) objF;
                            PreviewMediaContract previewMediaContract = new PreviewMediaContract();
                            c1086gP.L(-2009946895);
                            if ((57344 & i13) == 16384) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            objF2 = c1086gP.f();
                            if (z10 || objF2 == c0153a) {
                                objF2 = new C2405u(1, onResult);
                                c1086gP.E(objF2);
                            }
                            c1086gP.T(false);
                            final androidx.activity.compose.e eVarA = ActivityResultRegistryKt.a(previewMediaContract, (Ia.l) objF2, c1086gP, 0);
                            androidx.activity.compose.e eVarA2 = ActivityResultRegistryKt.a(new IntercomMediaPicker(mediaType2, set2, i10), new Ia.l() { // from class: io.intercom.android.sdk.ui.component.s
                                @Override // Ia.l
                                public final Object invoke(Object obj) {
                                    return MediaPickerButtonKt.MediaPickerButton$lambda$3(a10, onResult, eVarA, mediaPickerButtonCTAStyle, (List) obj);
                                }
                            }, c1086gP, 8);
                            androidx.compose.ui.h.a aVar5 = androidx.compose.ui.h.a.f13984b;
                            c1086gP.L(-2009910284);
                            objF3 = c1086gP.f();
                            if (objF3 == c0153a) {
                                objF3 = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF3);
                            }
                            c1086gP.T(false);
                            androidx.compose.ui.h hVarB = ClickableKt.b(aVar5, (androidx.compose.foundation.interaction.k) objF3, vVar2, false, null, new io.intercom.android.sdk.survey.ui.questiontype.numericscale.a(aVar2, eVarA2, 1), 28);
                            androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                            i20 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarB);
                            ComposeUiNode.f14331c0.getClass();
                            aVar3 = ComposeUiNode.Companion.f14333b;
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar3);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD);
                            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
                            pVar = ComposeUiNode.Companion.f14338g;
                            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i20))) {
                                J4.i.d(i20, c1086gP, i20, pVar);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
                            C7.g.b((i13 >> 21) & 14, content, c1086gP, true);
                        }
                        vVar3 = vVar2;
                        mediaType3 = mediaType2;
                        aVar4 = aVar2;
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.t
                                @Override // Ia.p
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return MediaPickerButtonKt.MediaPickerButton$lambda$7(i10, vVar3, mediaType3, set2, onResult, mediaPickerButtonCTAStyle, aVar4, content, i11, i12, (InterfaceC1084f) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i19 = 12582912;
                    i13 |= i19;
                    if (i14 != 8) {
                        c1086gP.r0();
                        if ((i11 & 1) != 0) {
                            if ((i12 & 2) != 0) {
                                vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                                i13 &= -113;
                            }
                            if (i22 != 0) {
                                mediaType2 = MediaType.All;
                            }
                            if (i14 != 0) {
                                set2 = defaultTrustedFileExtensions;
                                i13 &= -7169;
                            } else {
                                set2 = set;
                            }
                            if (i17 != 0) {
                                aVar2 = new M9.a(2);
                            }
                        } else {
                            if ((i12 & 2) != 0) {
                                vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                                i13 &= -113;
                            }
                            if (i22 != 0) {
                                mediaType2 = MediaType.All;
                            }
                            if (i14 != 0) {
                                set2 = defaultTrustedFileExtensions;
                                i13 &= -7169;
                            } else {
                                set2 = set;
                            }
                            if (i17 != 0) {
                                aVar2 = new M9.a(2);
                            }
                        }
                        c1086gP.U();
                        objF = c1086gP.f();
                        c0153a = InterfaceC1084f.a.f12980a;
                        if (objF == c0153a) {
                            objF = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                            c1086gP.E(objF);
                        }
                        final A a11 = (A) objF;
                        PreviewMediaContract previewMediaContract2 = new PreviewMediaContract();
                        c1086gP.L(-2009946895);
                        if ((57344 & i13) == 16384) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objF2 = c1086gP.f();
                        if (z10) {
                            objF2 = new C2405u(1, onResult);
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new C2405u(1, onResult);
                            c1086gP.E(objF2);
                        }
                        c1086gP.T(false);
                        final androidx.activity.compose.e eVarA3 = ActivityResultRegistryKt.a(previewMediaContract2, (Ia.l) objF2, c1086gP, 0);
                        androidx.activity.compose.e eVarA4 = ActivityResultRegistryKt.a(new IntercomMediaPicker(mediaType2, set2, i10), new Ia.l() { // from class: io.intercom.android.sdk.ui.component.s
                            @Override // Ia.l
                            public final Object invoke(Object obj) {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$3(a11, onResult, eVarA3, mediaPickerButtonCTAStyle, (List) obj);
                            }
                        }, c1086gP, 8);
                        androidx.compose.ui.h.a aVar6 = androidx.compose.ui.h.a.f13984b;
                        c1086gP.L(-2009910284);
                        objF3 = c1086gP.f();
                        if (objF3 == c0153a) {
                            objF3 = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF3);
                        }
                        c1086gP.T(false);
                        androidx.compose.ui.h hVarB2 = ClickableKt.b(aVar6, (androidx.compose.foundation.interaction.k) objF3, vVar2, false, null, new io.intercom.android.sdk.survey.ui.questiontype.numericscale.a(aVar2, eVarA4, 1), 28);
                        androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i20 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
                        androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarB2);
                        ComposeUiNode.f14331c0.getClass();
                        aVar3 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar3);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD2);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P2);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i20, c1086gP, i20, pVar);
                        } else {
                            J4.i.d(i20, c1086gP, i20, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
                        C7.g.b((i13 >> 21) & 14, content, c1086gP, true);
                    } else {
                        c1086gP.r0();
                        if ((i11 & 1) != 0) {
                            if ((i12 & 2) != 0) {
                                vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                                i13 &= -113;
                            }
                            if (i22 != 0) {
                                mediaType2 = MediaType.All;
                            }
                            if (i14 != 0) {
                                set2 = defaultTrustedFileExtensions;
                                i13 &= -7169;
                            } else {
                                set2 = set;
                            }
                            if (i17 != 0) {
                                aVar2 = new M9.a(2);
                            }
                        } else {
                            if ((i12 & 2) != 0) {
                                vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                                i13 &= -113;
                            }
                            if (i22 != 0) {
                                mediaType2 = MediaType.All;
                            }
                            if (i14 != 0) {
                                set2 = defaultTrustedFileExtensions;
                                i13 &= -7169;
                            } else {
                                set2 = set;
                            }
                            if (i17 != 0) {
                                aVar2 = new M9.a(2);
                            }
                        }
                        c1086gP.U();
                        objF = c1086gP.f();
                        c0153a = InterfaceC1084f.a.f12980a;
                        if (objF == c0153a) {
                            objF = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                            c1086gP.E(objF);
                        }
                        final A a12 = (A) objF;
                        PreviewMediaContract previewMediaContract3 = new PreviewMediaContract();
                        c1086gP.L(-2009946895);
                        if ((57344 & i13) == 16384) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objF2 = c1086gP.f();
                        if (z10) {
                            objF2 = new C2405u(1, onResult);
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new C2405u(1, onResult);
                            c1086gP.E(objF2);
                        }
                        c1086gP.T(false);
                        final androidx.activity.compose.e eVarA5 = ActivityResultRegistryKt.a(previewMediaContract3, (Ia.l) objF2, c1086gP, 0);
                        androidx.activity.compose.e eVarA6 = ActivityResultRegistryKt.a(new IntercomMediaPicker(mediaType2, set2, i10), new Ia.l() { // from class: io.intercom.android.sdk.ui.component.s
                            @Override // Ia.l
                            public final Object invoke(Object obj) {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$3(a12, onResult, eVarA5, mediaPickerButtonCTAStyle, (List) obj);
                            }
                        }, c1086gP, 8);
                        androidx.compose.ui.h.a aVar7 = androidx.compose.ui.h.a.f13984b;
                        c1086gP.L(-2009910284);
                        objF3 = c1086gP.f();
                        if (objF3 == c0153a) {
                            objF3 = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF3);
                        }
                        c1086gP.T(false);
                        androidx.compose.ui.h hVarB3 = ClickableKt.b(aVar7, (androidx.compose.foundation.interaction.k) objF3, vVar2, false, null, new io.intercom.android.sdk.survey.ui.questiontype.numericscale.a(aVar2, eVarA6, 1), 28);
                        androidx.compose.ui.layout.E eD3 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i20 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
                        androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVarB3);
                        ComposeUiNode.f14331c0.getClass();
                        aVar3 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar3);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD3);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P3);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i20, c1086gP, i20, pVar);
                        } else {
                            J4.i.d(i20, c1086gP, i20, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC3);
                        C7.g.b((i13 >> 21) & 14, content, c1086gP, true);
                    }
                    vVar3 = vVar2;
                    mediaType3 = mediaType2;
                    aVar4 = aVar2;
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.t
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return MediaPickerButtonKt.MediaPickerButton$lambda$7(i10, vVar3, mediaType3, set2, onResult, mediaPickerButtonCTAStyle, aVar4, content, i11, i12, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                    }
                }
                i13 |= 1572864;
                aVar2 = aVar;
                if ((i12 & 128) != 0) {
                    if ((29360128 & i11) == 0) {
                        if (c1086gP.k(content)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                    }
                    if (i14 != 8) {
                        c1086gP.r0();
                        if ((i11 & 1) != 0) {
                            if ((i12 & 2) != 0) {
                                vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                                i13 &= -113;
                            }
                            if (i22 != 0) {
                                mediaType2 = MediaType.All;
                            }
                            if (i14 != 0) {
                                set2 = defaultTrustedFileExtensions;
                                i13 &= -7169;
                            } else {
                                set2 = set;
                            }
                            if (i17 != 0) {
                                aVar2 = new M9.a(2);
                            }
                        } else {
                            if ((i12 & 2) != 0) {
                                vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                                i13 &= -113;
                            }
                            if (i22 != 0) {
                                mediaType2 = MediaType.All;
                            }
                            if (i14 != 0) {
                                set2 = defaultTrustedFileExtensions;
                                i13 &= -7169;
                            } else {
                                set2 = set;
                            }
                            if (i17 != 0) {
                                aVar2 = new M9.a(2);
                            }
                        }
                        c1086gP.U();
                        objF = c1086gP.f();
                        c0153a = InterfaceC1084f.a.f12980a;
                        if (objF == c0153a) {
                            objF = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                            c1086gP.E(objF);
                        }
                        final A a13 = (A) objF;
                        PreviewMediaContract previewMediaContract4 = new PreviewMediaContract();
                        c1086gP.L(-2009946895);
                        if ((57344 & i13) == 16384) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objF2 = c1086gP.f();
                        if (z10) {
                            objF2 = new C2405u(1, onResult);
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new C2405u(1, onResult);
                            c1086gP.E(objF2);
                        }
                        c1086gP.T(false);
                        final androidx.activity.compose.e eVarA7 = ActivityResultRegistryKt.a(previewMediaContract4, (Ia.l) objF2, c1086gP, 0);
                        androidx.activity.compose.e eVarA8 = ActivityResultRegistryKt.a(new IntercomMediaPicker(mediaType2, set2, i10), new Ia.l() { // from class: io.intercom.android.sdk.ui.component.s
                            @Override // Ia.l
                            public final Object invoke(Object obj) {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$3(a13, onResult, eVarA7, mediaPickerButtonCTAStyle, (List) obj);
                            }
                        }, c1086gP, 8);
                        androidx.compose.ui.h.a aVar8 = androidx.compose.ui.h.a.f13984b;
                        c1086gP.L(-2009910284);
                        objF3 = c1086gP.f();
                        if (objF3 == c0153a) {
                            objF3 = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF3);
                        }
                        c1086gP.T(false);
                        androidx.compose.ui.h hVarB4 = ClickableKt.b(aVar8, (androidx.compose.foundation.interaction.k) objF3, vVar2, false, null, new io.intercom.android.sdk.survey.ui.questiontype.numericscale.a(aVar2, eVarA8, 1), 28);
                        androidx.compose.ui.layout.E eD4 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i20 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P4 = c1086gP.P();
                        androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(c1086gP, hVarB4);
                        ComposeUiNode.f14331c0.getClass();
                        aVar3 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar3);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD4);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P4);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i20, c1086gP, i20, pVar);
                        } else {
                            J4.i.d(i20, c1086gP, i20, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC4);
                        C7.g.b((i13 >> 21) & 14, content, c1086gP, true);
                    } else {
                        c1086gP.r0();
                        if ((i11 & 1) != 0) {
                            if ((i12 & 2) != 0) {
                                vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                                i13 &= -113;
                            }
                            if (i22 != 0) {
                                mediaType2 = MediaType.All;
                            }
                            if (i14 != 0) {
                                set2 = defaultTrustedFileExtensions;
                                i13 &= -7169;
                            } else {
                                set2 = set;
                            }
                            if (i17 != 0) {
                                aVar2 = new M9.a(2);
                            }
                        } else {
                            if ((i12 & 2) != 0) {
                                vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                                i13 &= -113;
                            }
                            if (i22 != 0) {
                                mediaType2 = MediaType.All;
                            }
                            if (i14 != 0) {
                                set2 = defaultTrustedFileExtensions;
                                i13 &= -7169;
                            } else {
                                set2 = set;
                            }
                            if (i17 != 0) {
                                aVar2 = new M9.a(2);
                            }
                        }
                        c1086gP.U();
                        objF = c1086gP.f();
                        c0153a = InterfaceC1084f.a.f12980a;
                        if (objF == c0153a) {
                            objF = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                            c1086gP.E(objF);
                        }
                        final A a14 = (A) objF;
                        PreviewMediaContract previewMediaContract5 = new PreviewMediaContract();
                        c1086gP.L(-2009946895);
                        if ((57344 & i13) == 16384) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objF2 = c1086gP.f();
                        if (z10) {
                            objF2 = new C2405u(1, onResult);
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new C2405u(1, onResult);
                            c1086gP.E(objF2);
                        }
                        c1086gP.T(false);
                        final androidx.activity.compose.e eVarA9 = ActivityResultRegistryKt.a(previewMediaContract5, (Ia.l) objF2, c1086gP, 0);
                        androidx.activity.compose.e eVarA10 = ActivityResultRegistryKt.a(new IntercomMediaPicker(mediaType2, set2, i10), new Ia.l() { // from class: io.intercom.android.sdk.ui.component.s
                            @Override // Ia.l
                            public final Object invoke(Object obj) {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$3(a14, onResult, eVarA9, mediaPickerButtonCTAStyle, (List) obj);
                            }
                        }, c1086gP, 8);
                        androidx.compose.ui.h.a aVar9 = androidx.compose.ui.h.a.f13984b;
                        c1086gP.L(-2009910284);
                        objF3 = c1086gP.f();
                        if (objF3 == c0153a) {
                            objF3 = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF3);
                        }
                        c1086gP.T(false);
                        androidx.compose.ui.h hVarB5 = ClickableKt.b(aVar9, (androidx.compose.foundation.interaction.k) objF3, vVar2, false, null, new io.intercom.android.sdk.survey.ui.questiontype.numericscale.a(aVar2, eVarA10, 1), 28);
                        androidx.compose.ui.layout.E eD5 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i20 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P5 = c1086gP.P();
                        androidx.compose.ui.h hVarC5 = ComposedModifierKt.c(c1086gP, hVarB5);
                        ComposeUiNode.f14331c0.getClass();
                        aVar3 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar3);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD5);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P5);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i20, c1086gP, i20, pVar);
                        } else {
                            J4.i.d(i20, c1086gP, i20, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC5);
                        C7.g.b((i13 >> 21) & 14, content, c1086gP, true);
                    }
                    vVar3 = vVar2;
                    mediaType3 = mediaType2;
                    aVar4 = aVar2;
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.t
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return MediaPickerButtonKt.MediaPickerButton$lambda$7(i10, vVar3, mediaType3, set2, onResult, mediaPickerButtonCTAStyle, aVar4, content, i11, i12, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                    }
                }
                i19 = 12582912;
                i13 |= i19;
                if (i14 != 8) {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if ((i12 & 2) != 0) {
                            vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                            i13 &= -113;
                        }
                        if (i22 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            aVar2 = new M9.a(2);
                        }
                    } else {
                        if ((i12 & 2) != 0) {
                            vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                            i13 &= -113;
                        }
                        if (i22 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            aVar2 = new M9.a(2);
                        }
                    }
                    c1086gP.U();
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        objF = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                        c1086gP.E(objF);
                    }
                    final A a15 = (A) objF;
                    PreviewMediaContract previewMediaContract6 = new PreviewMediaContract();
                    c1086gP.L(-2009946895);
                    if ((57344 & i13) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objF2 = c1086gP.f();
                    if (z10) {
                        objF2 = new C2405u(1, onResult);
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new C2405u(1, onResult);
                        c1086gP.E(objF2);
                    }
                    c1086gP.T(false);
                    final androidx.activity.compose.e eVarA11 = ActivityResultRegistryKt.a(previewMediaContract6, (Ia.l) objF2, c1086gP, 0);
                    androidx.activity.compose.e eVarA12 = ActivityResultRegistryKt.a(new IntercomMediaPicker(mediaType2, set2, i10), new Ia.l() { // from class: io.intercom.android.sdk.ui.component.s
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$3(a15, onResult, eVarA11, mediaPickerButtonCTAStyle, (List) obj);
                        }
                    }, c1086gP, 8);
                    androidx.compose.ui.h.a aVar10 = androidx.compose.ui.h.a.f13984b;
                    c1086gP.L(-2009910284);
                    objF3 = c1086gP.f();
                    if (objF3 == c0153a) {
                        objF3 = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF3);
                    }
                    c1086gP.T(false);
                    androidx.compose.ui.h hVarB6 = ClickableKt.b(aVar10, (androidx.compose.foundation.interaction.k) objF3, vVar2, false, null, new io.intercom.android.sdk.survey.ui.questiontype.numericscale.a(aVar2, eVarA12, 1), 28);
                    androidx.compose.ui.layout.E eD6 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i20 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P6 = c1086gP.P();
                    androidx.compose.ui.h hVarC6 = ComposedModifierKt.c(c1086gP, hVarB6);
                    ComposeUiNode.f14331c0.getClass();
                    aVar3 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD6);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P6);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i20, c1086gP, i20, pVar);
                    } else {
                        J4.i.d(i20, c1086gP, i20, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC6);
                    C7.g.b((i13 >> 21) & 14, content, c1086gP, true);
                } else {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if ((i12 & 2) != 0) {
                            vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                            i13 &= -113;
                        }
                        if (i22 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            aVar2 = new M9.a(2);
                        }
                    } else {
                        if ((i12 & 2) != 0) {
                            vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                            i13 &= -113;
                        }
                        if (i22 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            aVar2 = new M9.a(2);
                        }
                    }
                    c1086gP.U();
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        objF = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                        c1086gP.E(objF);
                    }
                    final A a16 = (A) objF;
                    PreviewMediaContract previewMediaContract7 = new PreviewMediaContract();
                    c1086gP.L(-2009946895);
                    if ((57344 & i13) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objF2 = c1086gP.f();
                    if (z10) {
                        objF2 = new C2405u(1, onResult);
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new C2405u(1, onResult);
                        c1086gP.E(objF2);
                    }
                    c1086gP.T(false);
                    final androidx.activity.compose.e eVarA13 = ActivityResultRegistryKt.a(previewMediaContract7, (Ia.l) objF2, c1086gP, 0);
                    androidx.activity.compose.e eVarA14 = ActivityResultRegistryKt.a(new IntercomMediaPicker(mediaType2, set2, i10), new Ia.l() { // from class: io.intercom.android.sdk.ui.component.s
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$3(a16, onResult, eVarA13, mediaPickerButtonCTAStyle, (List) obj);
                        }
                    }, c1086gP, 8);
                    androidx.compose.ui.h.a aVar11 = androidx.compose.ui.h.a.f13984b;
                    c1086gP.L(-2009910284);
                    objF3 = c1086gP.f();
                    if (objF3 == c0153a) {
                        objF3 = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF3);
                    }
                    c1086gP.T(false);
                    androidx.compose.ui.h hVarB7 = ClickableKt.b(aVar11, (androidx.compose.foundation.interaction.k) objF3, vVar2, false, null, new io.intercom.android.sdk.survey.ui.questiontype.numericscale.a(aVar2, eVarA14, 1), 28);
                    androidx.compose.ui.layout.E eD7 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i20 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P7 = c1086gP.P();
                    androidx.compose.ui.h hVarC7 = ComposedModifierKt.c(c1086gP, hVarB7);
                    ComposeUiNode.f14331c0.getClass();
                    aVar3 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD7);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P7);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i20, c1086gP, i20, pVar);
                    } else {
                        J4.i.d(i20, c1086gP, i20, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC7);
                    C7.g.b((i13 >> 21) & 14, content, c1086gP, true);
                }
                vVar3 = vVar2;
                mediaType3 = mediaType2;
                aVar4 = aVar2;
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.t
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return MediaPickerButtonKt.MediaPickerButton$lambda$7(i10, vVar3, mediaType3, set2, onResult, mediaPickerButtonCTAStyle, aVar4, content, i11, i12, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i16 = 196608;
            i13 |= i16;
            i17 = i12 & 64;
            if (i17 != 0) {
                if ((3670016 & i11) == 0) {
                    aVar2 = aVar;
                    if (c1086gP.k(aVar2)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i13 |= i18;
                }
                if ((i12 & 128) != 0) {
                    if ((29360128 & i11) == 0) {
                        if (c1086gP.k(content)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                    }
                    if (i14 != 8) {
                        c1086gP.r0();
                        if ((i11 & 1) != 0) {
                            if ((i12 & 2) != 0) {
                                vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                                i13 &= -113;
                            }
                            if (i22 != 0) {
                                mediaType2 = MediaType.All;
                            }
                            if (i14 != 0) {
                                set2 = defaultTrustedFileExtensions;
                                i13 &= -7169;
                            } else {
                                set2 = set;
                            }
                            if (i17 != 0) {
                                aVar2 = new M9.a(2);
                            }
                        } else {
                            if ((i12 & 2) != 0) {
                                vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                                i13 &= -113;
                            }
                            if (i22 != 0) {
                                mediaType2 = MediaType.All;
                            }
                            if (i14 != 0) {
                                set2 = defaultTrustedFileExtensions;
                                i13 &= -7169;
                            } else {
                                set2 = set;
                            }
                            if (i17 != 0) {
                                aVar2 = new M9.a(2);
                            }
                        }
                        c1086gP.U();
                        objF = c1086gP.f();
                        c0153a = InterfaceC1084f.a.f12980a;
                        if (objF == c0153a) {
                            objF = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                            c1086gP.E(objF);
                        }
                        final A a17 = (A) objF;
                        PreviewMediaContract previewMediaContract8 = new PreviewMediaContract();
                        c1086gP.L(-2009946895);
                        if ((57344 & i13) == 16384) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objF2 = c1086gP.f();
                        if (z10) {
                            objF2 = new C2405u(1, onResult);
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new C2405u(1, onResult);
                            c1086gP.E(objF2);
                        }
                        c1086gP.T(false);
                        final androidx.activity.compose.e eVarA15 = ActivityResultRegistryKt.a(previewMediaContract8, (Ia.l) objF2, c1086gP, 0);
                        androidx.activity.compose.e eVarA16 = ActivityResultRegistryKt.a(new IntercomMediaPicker(mediaType2, set2, i10), new Ia.l() { // from class: io.intercom.android.sdk.ui.component.s
                            @Override // Ia.l
                            public final Object invoke(Object obj) {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$3(a17, onResult, eVarA15, mediaPickerButtonCTAStyle, (List) obj);
                            }
                        }, c1086gP, 8);
                        androidx.compose.ui.h.a aVar12 = androidx.compose.ui.h.a.f13984b;
                        c1086gP.L(-2009910284);
                        objF3 = c1086gP.f();
                        if (objF3 == c0153a) {
                            objF3 = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF3);
                        }
                        c1086gP.T(false);
                        androidx.compose.ui.h hVarB8 = ClickableKt.b(aVar12, (androidx.compose.foundation.interaction.k) objF3, vVar2, false, null, new io.intercom.android.sdk.survey.ui.questiontype.numericscale.a(aVar2, eVarA16, 1), 28);
                        androidx.compose.ui.layout.E eD8 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i20 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P8 = c1086gP.P();
                        androidx.compose.ui.h hVarC8 = ComposedModifierKt.c(c1086gP, hVarB8);
                        ComposeUiNode.f14331c0.getClass();
                        aVar3 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar3);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD8);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P8);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i20, c1086gP, i20, pVar);
                        } else {
                            J4.i.d(i20, c1086gP, i20, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC8);
                        C7.g.b((i13 >> 21) & 14, content, c1086gP, true);
                    } else {
                        c1086gP.r0();
                        if ((i11 & 1) != 0) {
                            if ((i12 & 2) != 0) {
                                vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                                i13 &= -113;
                            }
                            if (i22 != 0) {
                                mediaType2 = MediaType.All;
                            }
                            if (i14 != 0) {
                                set2 = defaultTrustedFileExtensions;
                                i13 &= -7169;
                            } else {
                                set2 = set;
                            }
                            if (i17 != 0) {
                                aVar2 = new M9.a(2);
                            }
                        } else {
                            if ((i12 & 2) != 0) {
                                vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                                i13 &= -113;
                            }
                            if (i22 != 0) {
                                mediaType2 = MediaType.All;
                            }
                            if (i14 != 0) {
                                set2 = defaultTrustedFileExtensions;
                                i13 &= -7169;
                            } else {
                                set2 = set;
                            }
                            if (i17 != 0) {
                                aVar2 = new M9.a(2);
                            }
                        }
                        c1086gP.U();
                        objF = c1086gP.f();
                        c0153a = InterfaceC1084f.a.f12980a;
                        if (objF == c0153a) {
                            objF = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                            c1086gP.E(objF);
                        }
                        final A a18 = (A) objF;
                        PreviewMediaContract previewMediaContract9 = new PreviewMediaContract();
                        c1086gP.L(-2009946895);
                        if ((57344 & i13) == 16384) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objF2 = c1086gP.f();
                        if (z10) {
                            objF2 = new C2405u(1, onResult);
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new C2405u(1, onResult);
                            c1086gP.E(objF2);
                        }
                        c1086gP.T(false);
                        final androidx.activity.compose.e eVarA17 = ActivityResultRegistryKt.a(previewMediaContract9, (Ia.l) objF2, c1086gP, 0);
                        androidx.activity.compose.e eVarA18 = ActivityResultRegistryKt.a(new IntercomMediaPicker(mediaType2, set2, i10), new Ia.l() { // from class: io.intercom.android.sdk.ui.component.s
                            @Override // Ia.l
                            public final Object invoke(Object obj) {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$3(a18, onResult, eVarA17, mediaPickerButtonCTAStyle, (List) obj);
                            }
                        }, c1086gP, 8);
                        androidx.compose.ui.h.a aVar13 = androidx.compose.ui.h.a.f13984b;
                        c1086gP.L(-2009910284);
                        objF3 = c1086gP.f();
                        if (objF3 == c0153a) {
                            objF3 = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF3);
                        }
                        c1086gP.T(false);
                        androidx.compose.ui.h hVarB9 = ClickableKt.b(aVar13, (androidx.compose.foundation.interaction.k) objF3, vVar2, false, null, new io.intercom.android.sdk.survey.ui.questiontype.numericscale.a(aVar2, eVarA18, 1), 28);
                        androidx.compose.ui.layout.E eD9 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i20 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P9 = c1086gP.P();
                        androidx.compose.ui.h hVarC9 = ComposedModifierKt.c(c1086gP, hVarB9);
                        ComposeUiNode.f14331c0.getClass();
                        aVar3 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar3);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD9);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P9);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i20, c1086gP, i20, pVar);
                        } else {
                            J4.i.d(i20, c1086gP, i20, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC9);
                        C7.g.b((i13 >> 21) & 14, content, c1086gP, true);
                    }
                    vVar3 = vVar2;
                    mediaType3 = mediaType2;
                    aVar4 = aVar2;
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.t
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return MediaPickerButtonKt.MediaPickerButton$lambda$7(i10, vVar3, mediaType3, set2, onResult, mediaPickerButtonCTAStyle, aVar4, content, i11, i12, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                    }
                }
                i19 = 12582912;
                i13 |= i19;
                if (i14 != 8) {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if ((i12 & 2) != 0) {
                            vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                            i13 &= -113;
                        }
                        if (i22 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            aVar2 = new M9.a(2);
                        }
                    } else {
                        if ((i12 & 2) != 0) {
                            vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                            i13 &= -113;
                        }
                        if (i22 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            aVar2 = new M9.a(2);
                        }
                    }
                    c1086gP.U();
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        objF = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                        c1086gP.E(objF);
                    }
                    final A a19 = (A) objF;
                    PreviewMediaContract previewMediaContract10 = new PreviewMediaContract();
                    c1086gP.L(-2009946895);
                    if ((57344 & i13) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objF2 = c1086gP.f();
                    if (z10) {
                        objF2 = new C2405u(1, onResult);
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new C2405u(1, onResult);
                        c1086gP.E(objF2);
                    }
                    c1086gP.T(false);
                    final androidx.activity.compose.e eVarA19 = ActivityResultRegistryKt.a(previewMediaContract10, (Ia.l) objF2, c1086gP, 0);
                    androidx.activity.compose.e eVarA110 = ActivityResultRegistryKt.a(new IntercomMediaPicker(mediaType2, set2, i10), new Ia.l() { // from class: io.intercom.android.sdk.ui.component.s
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$3(a19, onResult, eVarA19, mediaPickerButtonCTAStyle, (List) obj);
                        }
                    }, c1086gP, 8);
                    androidx.compose.ui.h.a aVar14 = androidx.compose.ui.h.a.f13984b;
                    c1086gP.L(-2009910284);
                    objF3 = c1086gP.f();
                    if (objF3 == c0153a) {
                        objF3 = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF3);
                    }
                    c1086gP.T(false);
                    androidx.compose.ui.h hVarB10 = ClickableKt.b(aVar14, (androidx.compose.foundation.interaction.k) objF3, vVar2, false, null, new io.intercom.android.sdk.survey.ui.questiontype.numericscale.a(aVar2, eVarA110, 1), 28);
                    androidx.compose.ui.layout.E eD10 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i20 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P10 = c1086gP.P();
                    androidx.compose.ui.h hVarC10 = ComposedModifierKt.c(c1086gP, hVarB10);
                    ComposeUiNode.f14331c0.getClass();
                    aVar3 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD10);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P10);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i20, c1086gP, i20, pVar);
                    } else {
                        J4.i.d(i20, c1086gP, i20, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC10);
                    C7.g.b((i13 >> 21) & 14, content, c1086gP, true);
                } else {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if ((i12 & 2) != 0) {
                            vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                            i13 &= -113;
                        }
                        if (i22 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            aVar2 = new M9.a(2);
                        }
                    } else {
                        if ((i12 & 2) != 0) {
                            vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                            i13 &= -113;
                        }
                        if (i22 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            aVar2 = new M9.a(2);
                        }
                    }
                    c1086gP.U();
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        objF = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                        c1086gP.E(objF);
                    }
                    final A a110 = (A) objF;
                    PreviewMediaContract previewMediaContract11 = new PreviewMediaContract();
                    c1086gP.L(-2009946895);
                    if ((57344 & i13) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objF2 = c1086gP.f();
                    if (z10) {
                        objF2 = new C2405u(1, onResult);
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new C2405u(1, onResult);
                        c1086gP.E(objF2);
                    }
                    c1086gP.T(false);
                    final androidx.activity.compose.e eVarA111 = ActivityResultRegistryKt.a(previewMediaContract11, (Ia.l) objF2, c1086gP, 0);
                    androidx.activity.compose.e eVarA112 = ActivityResultRegistryKt.a(new IntercomMediaPicker(mediaType2, set2, i10), new Ia.l() { // from class: io.intercom.android.sdk.ui.component.s
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$3(a110, onResult, eVarA111, mediaPickerButtonCTAStyle, (List) obj);
                        }
                    }, c1086gP, 8);
                    androidx.compose.ui.h.a aVar15 = androidx.compose.ui.h.a.f13984b;
                    c1086gP.L(-2009910284);
                    objF3 = c1086gP.f();
                    if (objF3 == c0153a) {
                        objF3 = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF3);
                    }
                    c1086gP.T(false);
                    androidx.compose.ui.h hVarB11 = ClickableKt.b(aVar15, (androidx.compose.foundation.interaction.k) objF3, vVar2, false, null, new io.intercom.android.sdk.survey.ui.questiontype.numericscale.a(aVar2, eVarA112, 1), 28);
                    androidx.compose.ui.layout.E eD11 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i20 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P11 = c1086gP.P();
                    androidx.compose.ui.h hVarC11 = ComposedModifierKt.c(c1086gP, hVarB11);
                    ComposeUiNode.f14331c0.getClass();
                    aVar3 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD11);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P11);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i20, c1086gP, i20, pVar);
                    } else {
                        J4.i.d(i20, c1086gP, i20, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC11);
                    C7.g.b((i13 >> 21) & 14, content, c1086gP, true);
                }
                vVar3 = vVar2;
                mediaType3 = mediaType2;
                aVar4 = aVar2;
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.t
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return MediaPickerButtonKt.MediaPickerButton$lambda$7(i10, vVar3, mediaType3, set2, onResult, mediaPickerButtonCTAStyle, aVar4, content, i11, i12, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i13 |= 1572864;
            aVar2 = aVar;
            if ((i12 & 128) != 0) {
                if ((29360128 & i11) == 0) {
                    if (c1086gP.k(content)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                }
                if (i14 != 8) {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if ((i12 & 2) != 0) {
                            vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                            i13 &= -113;
                        }
                        if (i22 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            aVar2 = new M9.a(2);
                        }
                    } else {
                        if ((i12 & 2) != 0) {
                            vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                            i13 &= -113;
                        }
                        if (i22 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            aVar2 = new M9.a(2);
                        }
                    }
                    c1086gP.U();
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        objF = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                        c1086gP.E(objF);
                    }
                    final A a111 = (A) objF;
                    PreviewMediaContract previewMediaContract12 = new PreviewMediaContract();
                    c1086gP.L(-2009946895);
                    if ((57344 & i13) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objF2 = c1086gP.f();
                    if (z10) {
                        objF2 = new C2405u(1, onResult);
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new C2405u(1, onResult);
                        c1086gP.E(objF2);
                    }
                    c1086gP.T(false);
                    final androidx.activity.compose.e eVarA113 = ActivityResultRegistryKt.a(previewMediaContract12, (Ia.l) objF2, c1086gP, 0);
                    androidx.activity.compose.e eVarA114 = ActivityResultRegistryKt.a(new IntercomMediaPicker(mediaType2, set2, i10), new Ia.l() { // from class: io.intercom.android.sdk.ui.component.s
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$3(a111, onResult, eVarA113, mediaPickerButtonCTAStyle, (List) obj);
                        }
                    }, c1086gP, 8);
                    androidx.compose.ui.h.a aVar16 = androidx.compose.ui.h.a.f13984b;
                    c1086gP.L(-2009910284);
                    objF3 = c1086gP.f();
                    if (objF3 == c0153a) {
                        objF3 = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF3);
                    }
                    c1086gP.T(false);
                    androidx.compose.ui.h hVarB12 = ClickableKt.b(aVar16, (androidx.compose.foundation.interaction.k) objF3, vVar2, false, null, new io.intercom.android.sdk.survey.ui.questiontype.numericscale.a(aVar2, eVarA114, 1), 28);
                    androidx.compose.ui.layout.E eD12 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i20 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P12 = c1086gP.P();
                    androidx.compose.ui.h hVarC12 = ComposedModifierKt.c(c1086gP, hVarB12);
                    ComposeUiNode.f14331c0.getClass();
                    aVar3 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD12);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P12);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i20, c1086gP, i20, pVar);
                    } else {
                        J4.i.d(i20, c1086gP, i20, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC12);
                    C7.g.b((i13 >> 21) & 14, content, c1086gP, true);
                } else {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if ((i12 & 2) != 0) {
                            vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                            i13 &= -113;
                        }
                        if (i22 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            aVar2 = new M9.a(2);
                        }
                    } else {
                        if ((i12 & 2) != 0) {
                            vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                            i13 &= -113;
                        }
                        if (i22 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            aVar2 = new M9.a(2);
                        }
                    }
                    c1086gP.U();
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        objF = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                        c1086gP.E(objF);
                    }
                    final A a112 = (A) objF;
                    PreviewMediaContract previewMediaContract13 = new PreviewMediaContract();
                    c1086gP.L(-2009946895);
                    if ((57344 & i13) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objF2 = c1086gP.f();
                    if (z10) {
                        objF2 = new C2405u(1, onResult);
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new C2405u(1, onResult);
                        c1086gP.E(objF2);
                    }
                    c1086gP.T(false);
                    final androidx.activity.compose.e eVarA115 = ActivityResultRegistryKt.a(previewMediaContract13, (Ia.l) objF2, c1086gP, 0);
                    androidx.activity.compose.e eVarA116 = ActivityResultRegistryKt.a(new IntercomMediaPicker(mediaType2, set2, i10), new Ia.l() { // from class: io.intercom.android.sdk.ui.component.s
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$3(a112, onResult, eVarA115, mediaPickerButtonCTAStyle, (List) obj);
                        }
                    }, c1086gP, 8);
                    androidx.compose.ui.h.a aVar17 = androidx.compose.ui.h.a.f13984b;
                    c1086gP.L(-2009910284);
                    objF3 = c1086gP.f();
                    if (objF3 == c0153a) {
                        objF3 = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF3);
                    }
                    c1086gP.T(false);
                    androidx.compose.ui.h hVarB13 = ClickableKt.b(aVar17, (androidx.compose.foundation.interaction.k) objF3, vVar2, false, null, new io.intercom.android.sdk.survey.ui.questiontype.numericscale.a(aVar2, eVarA116, 1), 28);
                    androidx.compose.ui.layout.E eD13 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i20 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P13 = c1086gP.P();
                    androidx.compose.ui.h hVarC13 = ComposedModifierKt.c(c1086gP, hVarB13);
                    ComposeUiNode.f14331c0.getClass();
                    aVar3 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD13);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P13);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i20, c1086gP, i20, pVar);
                    } else {
                        J4.i.d(i20, c1086gP, i20, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC13);
                    C7.g.b((i13 >> 21) & 14, content, c1086gP, true);
                }
                vVar3 = vVar2;
                mediaType3 = mediaType2;
                aVar4 = aVar2;
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.t
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return MediaPickerButtonKt.MediaPickerButton$lambda$7(i10, vVar3, mediaType3, set2, onResult, mediaPickerButtonCTAStyle, aVar4, content, i11, i12, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i19 = 12582912;
            i13 |= i19;
            if (i14 != 8) {
                c1086gP.r0();
                if ((i11 & 1) != 0) {
                    if ((i12 & 2) != 0) {
                        vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                        i13 &= -113;
                    }
                    if (i22 != 0) {
                        mediaType2 = MediaType.All;
                    }
                    if (i14 != 0) {
                        set2 = defaultTrustedFileExtensions;
                        i13 &= -7169;
                    } else {
                        set2 = set;
                    }
                    if (i17 != 0) {
                        aVar2 = new M9.a(2);
                    }
                } else {
                    if ((i12 & 2) != 0) {
                        vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                        i13 &= -113;
                    }
                    if (i22 != 0) {
                        mediaType2 = MediaType.All;
                    }
                    if (i14 != 0) {
                        set2 = defaultTrustedFileExtensions;
                        i13 &= -7169;
                    } else {
                        set2 = set;
                    }
                    if (i17 != 0) {
                        aVar2 = new M9.a(2);
                    }
                }
                c1086gP.U();
                objF = c1086gP.f();
                c0153a = InterfaceC1084f.a.f12980a;
                if (objF == c0153a) {
                    objF = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                    c1086gP.E(objF);
                }
                final A a113 = (A) objF;
                PreviewMediaContract previewMediaContract14 = new PreviewMediaContract();
                c1086gP.L(-2009946895);
                if ((57344 & i13) == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objF2 = c1086gP.f();
                if (z10) {
                    objF2 = new C2405u(1, onResult);
                    c1086gP.E(objF2);
                } else {
                    objF2 = new C2405u(1, onResult);
                    c1086gP.E(objF2);
                }
                c1086gP.T(false);
                final androidx.activity.compose.e eVarA117 = ActivityResultRegistryKt.a(previewMediaContract14, (Ia.l) objF2, c1086gP, 0);
                androidx.activity.compose.e eVarA118 = ActivityResultRegistryKt.a(new IntercomMediaPicker(mediaType2, set2, i10), new Ia.l() { // from class: io.intercom.android.sdk.ui.component.s
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return MediaPickerButtonKt.MediaPickerButton$lambda$3(a113, onResult, eVarA117, mediaPickerButtonCTAStyle, (List) obj);
                    }
                }, c1086gP, 8);
                androidx.compose.ui.h.a aVar18 = androidx.compose.ui.h.a.f13984b;
                c1086gP.L(-2009910284);
                objF3 = c1086gP.f();
                if (objF3 == c0153a) {
                    objF3 = new androidx.compose.foundation.interaction.l();
                    c1086gP.E(objF3);
                }
                c1086gP.T(false);
                androidx.compose.ui.h hVarB14 = ClickableKt.b(aVar18, (androidx.compose.foundation.interaction.k) objF3, vVar2, false, null, new io.intercom.android.sdk.survey.ui.questiontype.numericscale.a(aVar2, eVarA118, 1), 28);
                androidx.compose.ui.layout.E eD14 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i20 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P14 = c1086gP.P();
                androidx.compose.ui.h hVarC14 = ComposedModifierKt.c(c1086gP, hVarB14);
                ComposeUiNode.f14331c0.getClass();
                aVar3 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar3);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD14);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P14);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i20, c1086gP, i20, pVar);
                } else {
                    J4.i.d(i20, c1086gP, i20, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC14);
                C7.g.b((i13 >> 21) & 14, content, c1086gP, true);
            } else {
                c1086gP.r0();
                if ((i11 & 1) != 0) {
                    if ((i12 & 2) != 0) {
                        vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                        i13 &= -113;
                    }
                    if (i22 != 0) {
                        mediaType2 = MediaType.All;
                    }
                    if (i14 != 0) {
                        set2 = defaultTrustedFileExtensions;
                        i13 &= -7169;
                    } else {
                        set2 = set;
                    }
                    if (i17 != 0) {
                        aVar2 = new M9.a(2);
                    }
                } else {
                    if ((i12 & 2) != 0) {
                        vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                        i13 &= -113;
                    }
                    if (i22 != 0) {
                        mediaType2 = MediaType.All;
                    }
                    if (i14 != 0) {
                        set2 = defaultTrustedFileExtensions;
                        i13 &= -7169;
                    } else {
                        set2 = set;
                    }
                    if (i17 != 0) {
                        aVar2 = new M9.a(2);
                    }
                }
                c1086gP.U();
                objF = c1086gP.f();
                c0153a = InterfaceC1084f.a.f12980a;
                if (objF == c0153a) {
                    objF = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                    c1086gP.E(objF);
                }
                final A a114 = (A) objF;
                PreviewMediaContract previewMediaContract15 = new PreviewMediaContract();
                c1086gP.L(-2009946895);
                if ((57344 & i13) == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objF2 = c1086gP.f();
                if (z10) {
                    objF2 = new C2405u(1, onResult);
                    c1086gP.E(objF2);
                } else {
                    objF2 = new C2405u(1, onResult);
                    c1086gP.E(objF2);
                }
                c1086gP.T(false);
                final androidx.activity.compose.e eVarA119 = ActivityResultRegistryKt.a(previewMediaContract15, (Ia.l) objF2, c1086gP, 0);
                androidx.activity.compose.e eVarA1110 = ActivityResultRegistryKt.a(new IntercomMediaPicker(mediaType2, set2, i10), new Ia.l() { // from class: io.intercom.android.sdk.ui.component.s
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return MediaPickerButtonKt.MediaPickerButton$lambda$3(a114, onResult, eVarA119, mediaPickerButtonCTAStyle, (List) obj);
                    }
                }, c1086gP, 8);
                androidx.compose.ui.h.a aVar19 = androidx.compose.ui.h.a.f13984b;
                c1086gP.L(-2009910284);
                objF3 = c1086gP.f();
                if (objF3 == c0153a) {
                    objF3 = new androidx.compose.foundation.interaction.l();
                    c1086gP.E(objF3);
                }
                c1086gP.T(false);
                androidx.compose.ui.h hVarB15 = ClickableKt.b(aVar19, (androidx.compose.foundation.interaction.k) objF3, vVar2, false, null, new io.intercom.android.sdk.survey.ui.questiontype.numericscale.a(aVar2, eVarA1110, 1), 28);
                androidx.compose.ui.layout.E eD15 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i20 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P15 = c1086gP.P();
                androidx.compose.ui.h hVarC15 = ComposedModifierKt.c(c1086gP, hVarB15);
                ComposeUiNode.f14331c0.getClass();
                aVar3 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar3);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD15);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P15);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i20, c1086gP, i20, pVar);
                } else {
                    J4.i.d(i20, c1086gP, i20, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC15);
                C7.g.b((i13 >> 21) & 14, content, c1086gP, true);
            }
            vVar3 = vVar2;
            mediaType3 = mediaType2;
            aVar4 = aVar2;
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.t
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return MediaPickerButtonKt.MediaPickerButton$lambda$7(i10, vVar3, mediaType3, set2, onResult, mediaPickerButtonCTAStyle, aVar4, content, i11, i12, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i13 |= 384;
        mediaType2 = mediaType;
        i14 = i12 & 8;
        if (i14 != 0) {
            i13 |= 1024;
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((i11 & 57344) == 0) {
            if (c1086gP.k(onResult)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i13 |= i15;
        }
        if ((i12 & 32) != 0) {
            if ((458752 & i11) == 0) {
                if (c1086gP.K(mediaPickerButtonCTAStyle)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
            }
            i17 = i12 & 64;
            if (i17 != 0) {
                if ((3670016 & i11) == 0) {
                    aVar2 = aVar;
                    if (c1086gP.k(aVar2)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i13 |= i18;
                }
                if ((i12 & 128) != 0) {
                    if ((29360128 & i11) == 0) {
                        if (c1086gP.k(content)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                    }
                    if (i14 != 8) {
                        c1086gP.r0();
                        if ((i11 & 1) != 0) {
                            if ((i12 & 2) != 0) {
                                vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                                i13 &= -113;
                            }
                            if (i22 != 0) {
                                mediaType2 = MediaType.All;
                            }
                            if (i14 != 0) {
                                set2 = defaultTrustedFileExtensions;
                                i13 &= -7169;
                            } else {
                                set2 = set;
                            }
                            if (i17 != 0) {
                                aVar2 = new M9.a(2);
                            }
                        } else {
                            if ((i12 & 2) != 0) {
                                vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                                i13 &= -113;
                            }
                            if (i22 != 0) {
                                mediaType2 = MediaType.All;
                            }
                            if (i14 != 0) {
                                set2 = defaultTrustedFileExtensions;
                                i13 &= -7169;
                            } else {
                                set2 = set;
                            }
                            if (i17 != 0) {
                                aVar2 = new M9.a(2);
                            }
                        }
                        c1086gP.U();
                        objF = c1086gP.f();
                        c0153a = InterfaceC1084f.a.f12980a;
                        if (objF == c0153a) {
                            objF = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                            c1086gP.E(objF);
                        }
                        final A a115 = (A) objF;
                        PreviewMediaContract previewMediaContract16 = new PreviewMediaContract();
                        c1086gP.L(-2009946895);
                        if ((57344 & i13) == 16384) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objF2 = c1086gP.f();
                        if (z10) {
                            objF2 = new C2405u(1, onResult);
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new C2405u(1, onResult);
                            c1086gP.E(objF2);
                        }
                        c1086gP.T(false);
                        final androidx.activity.compose.e eVarA1111 = ActivityResultRegistryKt.a(previewMediaContract16, (Ia.l) objF2, c1086gP, 0);
                        androidx.activity.compose.e eVarA1112 = ActivityResultRegistryKt.a(new IntercomMediaPicker(mediaType2, set2, i10), new Ia.l() { // from class: io.intercom.android.sdk.ui.component.s
                            @Override // Ia.l
                            public final Object invoke(Object obj) {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$3(a115, onResult, eVarA1111, mediaPickerButtonCTAStyle, (List) obj);
                            }
                        }, c1086gP, 8);
                        androidx.compose.ui.h.a aVar110 = androidx.compose.ui.h.a.f13984b;
                        c1086gP.L(-2009910284);
                        objF3 = c1086gP.f();
                        if (objF3 == c0153a) {
                            objF3 = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF3);
                        }
                        c1086gP.T(false);
                        androidx.compose.ui.h hVarB16 = ClickableKt.b(aVar110, (androidx.compose.foundation.interaction.k) objF3, vVar2, false, null, new io.intercom.android.sdk.survey.ui.questiontype.numericscale.a(aVar2, eVarA1112, 1), 28);
                        androidx.compose.ui.layout.E eD16 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i20 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P16 = c1086gP.P();
                        androidx.compose.ui.h hVarC16 = ComposedModifierKt.c(c1086gP, hVarB16);
                        ComposeUiNode.f14331c0.getClass();
                        aVar3 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar3);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD16);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P16);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i20, c1086gP, i20, pVar);
                        } else {
                            J4.i.d(i20, c1086gP, i20, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC16);
                        C7.g.b((i13 >> 21) & 14, content, c1086gP, true);
                    } else {
                        c1086gP.r0();
                        if ((i11 & 1) != 0) {
                            if ((i12 & 2) != 0) {
                                vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                                i13 &= -113;
                            }
                            if (i22 != 0) {
                                mediaType2 = MediaType.All;
                            }
                            if (i14 != 0) {
                                set2 = defaultTrustedFileExtensions;
                                i13 &= -7169;
                            } else {
                                set2 = set;
                            }
                            if (i17 != 0) {
                                aVar2 = new M9.a(2);
                            }
                        } else {
                            if ((i12 & 2) != 0) {
                                vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                                i13 &= -113;
                            }
                            if (i22 != 0) {
                                mediaType2 = MediaType.All;
                            }
                            if (i14 != 0) {
                                set2 = defaultTrustedFileExtensions;
                                i13 &= -7169;
                            } else {
                                set2 = set;
                            }
                            if (i17 != 0) {
                                aVar2 = new M9.a(2);
                            }
                        }
                        c1086gP.U();
                        objF = c1086gP.f();
                        c0153a = InterfaceC1084f.a.f12980a;
                        if (objF == c0153a) {
                            objF = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                            c1086gP.E(objF);
                        }
                        final A a116 = (A) objF;
                        PreviewMediaContract previewMediaContract17 = new PreviewMediaContract();
                        c1086gP.L(-2009946895);
                        if ((57344 & i13) == 16384) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objF2 = c1086gP.f();
                        if (z10) {
                            objF2 = new C2405u(1, onResult);
                            c1086gP.E(objF2);
                        } else {
                            objF2 = new C2405u(1, onResult);
                            c1086gP.E(objF2);
                        }
                        c1086gP.T(false);
                        final androidx.activity.compose.e eVarA1113 = ActivityResultRegistryKt.a(previewMediaContract17, (Ia.l) objF2, c1086gP, 0);
                        androidx.activity.compose.e eVarA1114 = ActivityResultRegistryKt.a(new IntercomMediaPicker(mediaType2, set2, i10), new Ia.l() { // from class: io.intercom.android.sdk.ui.component.s
                            @Override // Ia.l
                            public final Object invoke(Object obj) {
                                return MediaPickerButtonKt.MediaPickerButton$lambda$3(a116, onResult, eVarA1113, mediaPickerButtonCTAStyle, (List) obj);
                            }
                        }, c1086gP, 8);
                        androidx.compose.ui.h.a aVar111 = androidx.compose.ui.h.a.f13984b;
                        c1086gP.L(-2009910284);
                        objF3 = c1086gP.f();
                        if (objF3 == c0153a) {
                            objF3 = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF3);
                        }
                        c1086gP.T(false);
                        androidx.compose.ui.h hVarB17 = ClickableKt.b(aVar111, (androidx.compose.foundation.interaction.k) objF3, vVar2, false, null, new io.intercom.android.sdk.survey.ui.questiontype.numericscale.a(aVar2, eVarA1114, 1), 28);
                        androidx.compose.ui.layout.E eD17 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i20 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P17 = c1086gP.P();
                        androidx.compose.ui.h hVarC17 = ComposedModifierKt.c(c1086gP, hVarB17);
                        ComposeUiNode.f14331c0.getClass();
                        aVar3 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar3);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD17);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P17);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i20, c1086gP, i20, pVar);
                        } else {
                            J4.i.d(i20, c1086gP, i20, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC17);
                        C7.g.b((i13 >> 21) & 14, content, c1086gP, true);
                    }
                    vVar3 = vVar2;
                    mediaType3 = mediaType2;
                    aVar4 = aVar2;
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.t
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return MediaPickerButtonKt.MediaPickerButton$lambda$7(i10, vVar3, mediaType3, set2, onResult, mediaPickerButtonCTAStyle, aVar4, content, i11, i12, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                    }
                }
                i19 = 12582912;
                i13 |= i19;
                if (i14 != 8) {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if ((i12 & 2) != 0) {
                            vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                            i13 &= -113;
                        }
                        if (i22 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            aVar2 = new M9.a(2);
                        }
                    } else {
                        if ((i12 & 2) != 0) {
                            vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                            i13 &= -113;
                        }
                        if (i22 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            aVar2 = new M9.a(2);
                        }
                    }
                    c1086gP.U();
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        objF = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                        c1086gP.E(objF);
                    }
                    final A a117 = (A) objF;
                    PreviewMediaContract previewMediaContract18 = new PreviewMediaContract();
                    c1086gP.L(-2009946895);
                    if ((57344 & i13) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objF2 = c1086gP.f();
                    if (z10) {
                        objF2 = new C2405u(1, onResult);
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new C2405u(1, onResult);
                        c1086gP.E(objF2);
                    }
                    c1086gP.T(false);
                    final androidx.activity.compose.e eVarA1115 = ActivityResultRegistryKt.a(previewMediaContract18, (Ia.l) objF2, c1086gP, 0);
                    androidx.activity.compose.e eVarA1116 = ActivityResultRegistryKt.a(new IntercomMediaPicker(mediaType2, set2, i10), new Ia.l() { // from class: io.intercom.android.sdk.ui.component.s
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$3(a117, onResult, eVarA1115, mediaPickerButtonCTAStyle, (List) obj);
                        }
                    }, c1086gP, 8);
                    androidx.compose.ui.h.a aVar112 = androidx.compose.ui.h.a.f13984b;
                    c1086gP.L(-2009910284);
                    objF3 = c1086gP.f();
                    if (objF3 == c0153a) {
                        objF3 = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF3);
                    }
                    c1086gP.T(false);
                    androidx.compose.ui.h hVarB18 = ClickableKt.b(aVar112, (androidx.compose.foundation.interaction.k) objF3, vVar2, false, null, new io.intercom.android.sdk.survey.ui.questiontype.numericscale.a(aVar2, eVarA1116, 1), 28);
                    androidx.compose.ui.layout.E eD18 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i20 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P18 = c1086gP.P();
                    androidx.compose.ui.h hVarC18 = ComposedModifierKt.c(c1086gP, hVarB18);
                    ComposeUiNode.f14331c0.getClass();
                    aVar3 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD18);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P18);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i20, c1086gP, i20, pVar);
                    } else {
                        J4.i.d(i20, c1086gP, i20, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC18);
                    C7.g.b((i13 >> 21) & 14, content, c1086gP, true);
                } else {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if ((i12 & 2) != 0) {
                            vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                            i13 &= -113;
                        }
                        if (i22 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            aVar2 = new M9.a(2);
                        }
                    } else {
                        if ((i12 & 2) != 0) {
                            vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                            i13 &= -113;
                        }
                        if (i22 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            aVar2 = new M9.a(2);
                        }
                    }
                    c1086gP.U();
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        objF = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                        c1086gP.E(objF);
                    }
                    final A a118 = (A) objF;
                    PreviewMediaContract previewMediaContract19 = new PreviewMediaContract();
                    c1086gP.L(-2009946895);
                    if ((57344 & i13) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objF2 = c1086gP.f();
                    if (z10) {
                        objF2 = new C2405u(1, onResult);
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new C2405u(1, onResult);
                        c1086gP.E(objF2);
                    }
                    c1086gP.T(false);
                    final androidx.activity.compose.e eVarA1117 = ActivityResultRegistryKt.a(previewMediaContract19, (Ia.l) objF2, c1086gP, 0);
                    androidx.activity.compose.e eVarA1118 = ActivityResultRegistryKt.a(new IntercomMediaPicker(mediaType2, set2, i10), new Ia.l() { // from class: io.intercom.android.sdk.ui.component.s
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$3(a118, onResult, eVarA1117, mediaPickerButtonCTAStyle, (List) obj);
                        }
                    }, c1086gP, 8);
                    androidx.compose.ui.h.a aVar113 = androidx.compose.ui.h.a.f13984b;
                    c1086gP.L(-2009910284);
                    objF3 = c1086gP.f();
                    if (objF3 == c0153a) {
                        objF3 = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF3);
                    }
                    c1086gP.T(false);
                    androidx.compose.ui.h hVarB19 = ClickableKt.b(aVar113, (androidx.compose.foundation.interaction.k) objF3, vVar2, false, null, new io.intercom.android.sdk.survey.ui.questiontype.numericscale.a(aVar2, eVarA1118, 1), 28);
                    androidx.compose.ui.layout.E eD19 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i20 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P19 = c1086gP.P();
                    androidx.compose.ui.h hVarC19 = ComposedModifierKt.c(c1086gP, hVarB19);
                    ComposeUiNode.f14331c0.getClass();
                    aVar3 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD19);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P19);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i20, c1086gP, i20, pVar);
                    } else {
                        J4.i.d(i20, c1086gP, i20, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC19);
                    C7.g.b((i13 >> 21) & 14, content, c1086gP, true);
                }
                vVar3 = vVar2;
                mediaType3 = mediaType2;
                aVar4 = aVar2;
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.t
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return MediaPickerButtonKt.MediaPickerButton$lambda$7(i10, vVar3, mediaType3, set2, onResult, mediaPickerButtonCTAStyle, aVar4, content, i11, i12, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i13 |= 1572864;
            aVar2 = aVar;
            if ((i12 & 128) != 0) {
                if ((29360128 & i11) == 0) {
                    if (c1086gP.k(content)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                }
                if (i14 != 8) {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if ((i12 & 2) != 0) {
                            vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                            i13 &= -113;
                        }
                        if (i22 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            aVar2 = new M9.a(2);
                        }
                    } else {
                        if ((i12 & 2) != 0) {
                            vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                            i13 &= -113;
                        }
                        if (i22 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            aVar2 = new M9.a(2);
                        }
                    }
                    c1086gP.U();
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        objF = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                        c1086gP.E(objF);
                    }
                    final A a119 = (A) objF;
                    PreviewMediaContract previewMediaContract110 = new PreviewMediaContract();
                    c1086gP.L(-2009946895);
                    if ((57344 & i13) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objF2 = c1086gP.f();
                    if (z10) {
                        objF2 = new C2405u(1, onResult);
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new C2405u(1, onResult);
                        c1086gP.E(objF2);
                    }
                    c1086gP.T(false);
                    final androidx.activity.compose.e eVarA1119 = ActivityResultRegistryKt.a(previewMediaContract110, (Ia.l) objF2, c1086gP, 0);
                    androidx.activity.compose.e eVarA11110 = ActivityResultRegistryKt.a(new IntercomMediaPicker(mediaType2, set2, i10), new Ia.l() { // from class: io.intercom.android.sdk.ui.component.s
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$3(a119, onResult, eVarA1119, mediaPickerButtonCTAStyle, (List) obj);
                        }
                    }, c1086gP, 8);
                    androidx.compose.ui.h.a aVar114 = androidx.compose.ui.h.a.f13984b;
                    c1086gP.L(-2009910284);
                    objF3 = c1086gP.f();
                    if (objF3 == c0153a) {
                        objF3 = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF3);
                    }
                    c1086gP.T(false);
                    androidx.compose.ui.h hVarB110 = ClickableKt.b(aVar114, (androidx.compose.foundation.interaction.k) objF3, vVar2, false, null, new io.intercom.android.sdk.survey.ui.questiontype.numericscale.a(aVar2, eVarA11110, 1), 28);
                    androidx.compose.ui.layout.E eD110 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i20 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P110 = c1086gP.P();
                    androidx.compose.ui.h hVarC110 = ComposedModifierKt.c(c1086gP, hVarB110);
                    ComposeUiNode.f14331c0.getClass();
                    aVar3 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD110);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P110);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i20, c1086gP, i20, pVar);
                    } else {
                        J4.i.d(i20, c1086gP, i20, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC110);
                    C7.g.b((i13 >> 21) & 14, content, c1086gP, true);
                } else {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if ((i12 & 2) != 0) {
                            vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                            i13 &= -113;
                        }
                        if (i22 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            aVar2 = new M9.a(2);
                        }
                    } else {
                        if ((i12 & 2) != 0) {
                            vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                            i13 &= -113;
                        }
                        if (i22 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            aVar2 = new M9.a(2);
                        }
                    }
                    c1086gP.U();
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        objF = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                        c1086gP.E(objF);
                    }
                    final A a1110 = (A) objF;
                    PreviewMediaContract previewMediaContract111 = new PreviewMediaContract();
                    c1086gP.L(-2009946895);
                    if ((57344 & i13) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objF2 = c1086gP.f();
                    if (z10) {
                        objF2 = new C2405u(1, onResult);
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new C2405u(1, onResult);
                        c1086gP.E(objF2);
                    }
                    c1086gP.T(false);
                    final androidx.activity.compose.e eVarA11111 = ActivityResultRegistryKt.a(previewMediaContract111, (Ia.l) objF2, c1086gP, 0);
                    androidx.activity.compose.e eVarA11112 = ActivityResultRegistryKt.a(new IntercomMediaPicker(mediaType2, set2, i10), new Ia.l() { // from class: io.intercom.android.sdk.ui.component.s
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$3(a1110, onResult, eVarA11111, mediaPickerButtonCTAStyle, (List) obj);
                        }
                    }, c1086gP, 8);
                    androidx.compose.ui.h.a aVar115 = androidx.compose.ui.h.a.f13984b;
                    c1086gP.L(-2009910284);
                    objF3 = c1086gP.f();
                    if (objF3 == c0153a) {
                        objF3 = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF3);
                    }
                    c1086gP.T(false);
                    androidx.compose.ui.h hVarB111 = ClickableKt.b(aVar115, (androidx.compose.foundation.interaction.k) objF3, vVar2, false, null, new io.intercom.android.sdk.survey.ui.questiontype.numericscale.a(aVar2, eVarA11112, 1), 28);
                    androidx.compose.ui.layout.E eD111 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i20 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P111 = c1086gP.P();
                    androidx.compose.ui.h hVarC111 = ComposedModifierKt.c(c1086gP, hVarB111);
                    ComposeUiNode.f14331c0.getClass();
                    aVar3 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD111);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P111);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i20, c1086gP, i20, pVar);
                    } else {
                        J4.i.d(i20, c1086gP, i20, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC111);
                    C7.g.b((i13 >> 21) & 14, content, c1086gP, true);
                }
                vVar3 = vVar2;
                mediaType3 = mediaType2;
                aVar4 = aVar2;
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.t
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return MediaPickerButtonKt.MediaPickerButton$lambda$7(i10, vVar3, mediaType3, set2, onResult, mediaPickerButtonCTAStyle, aVar4, content, i11, i12, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i19 = 12582912;
            i13 |= i19;
            if (i14 != 8) {
                c1086gP.r0();
                if ((i11 & 1) != 0) {
                    if ((i12 & 2) != 0) {
                        vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                        i13 &= -113;
                    }
                    if (i22 != 0) {
                        mediaType2 = MediaType.All;
                    }
                    if (i14 != 0) {
                        set2 = defaultTrustedFileExtensions;
                        i13 &= -7169;
                    } else {
                        set2 = set;
                    }
                    if (i17 != 0) {
                        aVar2 = new M9.a(2);
                    }
                } else {
                    if ((i12 & 2) != 0) {
                        vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                        i13 &= -113;
                    }
                    if (i22 != 0) {
                        mediaType2 = MediaType.All;
                    }
                    if (i14 != 0) {
                        set2 = defaultTrustedFileExtensions;
                        i13 &= -7169;
                    } else {
                        set2 = set;
                    }
                    if (i17 != 0) {
                        aVar2 = new M9.a(2);
                    }
                }
                c1086gP.U();
                objF = c1086gP.f();
                c0153a = InterfaceC1084f.a.f12980a;
                if (objF == c0153a) {
                    objF = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                    c1086gP.E(objF);
                }
                final A a1111 = (A) objF;
                PreviewMediaContract previewMediaContract112 = new PreviewMediaContract();
                c1086gP.L(-2009946895);
                if ((57344 & i13) == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objF2 = c1086gP.f();
                if (z10) {
                    objF2 = new C2405u(1, onResult);
                    c1086gP.E(objF2);
                } else {
                    objF2 = new C2405u(1, onResult);
                    c1086gP.E(objF2);
                }
                c1086gP.T(false);
                final androidx.activity.compose.e eVarA11113 = ActivityResultRegistryKt.a(previewMediaContract112, (Ia.l) objF2, c1086gP, 0);
                androidx.activity.compose.e eVarA11114 = ActivityResultRegistryKt.a(new IntercomMediaPicker(mediaType2, set2, i10), new Ia.l() { // from class: io.intercom.android.sdk.ui.component.s
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return MediaPickerButtonKt.MediaPickerButton$lambda$3(a1111, onResult, eVarA11113, mediaPickerButtonCTAStyle, (List) obj);
                    }
                }, c1086gP, 8);
                androidx.compose.ui.h.a aVar116 = androidx.compose.ui.h.a.f13984b;
                c1086gP.L(-2009910284);
                objF3 = c1086gP.f();
                if (objF3 == c0153a) {
                    objF3 = new androidx.compose.foundation.interaction.l();
                    c1086gP.E(objF3);
                }
                c1086gP.T(false);
                androidx.compose.ui.h hVarB112 = ClickableKt.b(aVar116, (androidx.compose.foundation.interaction.k) objF3, vVar2, false, null, new io.intercom.android.sdk.survey.ui.questiontype.numericscale.a(aVar2, eVarA11114, 1), 28);
                androidx.compose.ui.layout.E eD112 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i20 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P112 = c1086gP.P();
                androidx.compose.ui.h hVarC112 = ComposedModifierKt.c(c1086gP, hVarB112);
                ComposeUiNode.f14331c0.getClass();
                aVar3 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar3);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD112);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P112);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i20, c1086gP, i20, pVar);
                } else {
                    J4.i.d(i20, c1086gP, i20, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC112);
                C7.g.b((i13 >> 21) & 14, content, c1086gP, true);
            } else {
                c1086gP.r0();
                if ((i11 & 1) != 0) {
                    if ((i12 & 2) != 0) {
                        vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                        i13 &= -113;
                    }
                    if (i22 != 0) {
                        mediaType2 = MediaType.All;
                    }
                    if (i14 != 0) {
                        set2 = defaultTrustedFileExtensions;
                        i13 &= -7169;
                    } else {
                        set2 = set;
                    }
                    if (i17 != 0) {
                        aVar2 = new M9.a(2);
                    }
                } else {
                    if ((i12 & 2) != 0) {
                        vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                        i13 &= -113;
                    }
                    if (i22 != 0) {
                        mediaType2 = MediaType.All;
                    }
                    if (i14 != 0) {
                        set2 = defaultTrustedFileExtensions;
                        i13 &= -7169;
                    } else {
                        set2 = set;
                    }
                    if (i17 != 0) {
                        aVar2 = new M9.a(2);
                    }
                }
                c1086gP.U();
                objF = c1086gP.f();
                c0153a = InterfaceC1084f.a.f12980a;
                if (objF == c0153a) {
                    objF = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                    c1086gP.E(objF);
                }
                final A a1112 = (A) objF;
                PreviewMediaContract previewMediaContract113 = new PreviewMediaContract();
                c1086gP.L(-2009946895);
                if ((57344 & i13) == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objF2 = c1086gP.f();
                if (z10) {
                    objF2 = new C2405u(1, onResult);
                    c1086gP.E(objF2);
                } else {
                    objF2 = new C2405u(1, onResult);
                    c1086gP.E(objF2);
                }
                c1086gP.T(false);
                final androidx.activity.compose.e eVarA11115 = ActivityResultRegistryKt.a(previewMediaContract113, (Ia.l) objF2, c1086gP, 0);
                androidx.activity.compose.e eVarA11116 = ActivityResultRegistryKt.a(new IntercomMediaPicker(mediaType2, set2, i10), new Ia.l() { // from class: io.intercom.android.sdk.ui.component.s
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return MediaPickerButtonKt.MediaPickerButton$lambda$3(a1112, onResult, eVarA11115, mediaPickerButtonCTAStyle, (List) obj);
                    }
                }, c1086gP, 8);
                androidx.compose.ui.h.a aVar117 = androidx.compose.ui.h.a.f13984b;
                c1086gP.L(-2009910284);
                objF3 = c1086gP.f();
                if (objF3 == c0153a) {
                    objF3 = new androidx.compose.foundation.interaction.l();
                    c1086gP.E(objF3);
                }
                c1086gP.T(false);
                androidx.compose.ui.h hVarB113 = ClickableKt.b(aVar117, (androidx.compose.foundation.interaction.k) objF3, vVar2, false, null, new io.intercom.android.sdk.survey.ui.questiontype.numericscale.a(aVar2, eVarA11116, 1), 28);
                androidx.compose.ui.layout.E eD113 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i20 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P113 = c1086gP.P();
                androidx.compose.ui.h hVarC113 = ComposedModifierKt.c(c1086gP, hVarB113);
                ComposeUiNode.f14331c0.getClass();
                aVar3 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar3);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD113);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P113);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i20, c1086gP, i20, pVar);
                } else {
                    J4.i.d(i20, c1086gP, i20, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC113);
                C7.g.b((i13 >> 21) & 14, content, c1086gP, true);
            }
            vVar3 = vVar2;
            mediaType3 = mediaType2;
            aVar4 = aVar2;
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.t
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return MediaPickerButtonKt.MediaPickerButton$lambda$7(i10, vVar3, mediaType3, set2, onResult, mediaPickerButtonCTAStyle, aVar4, content, i11, i12, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i16 = 196608;
        i13 |= i16;
        i17 = i12 & 64;
        if (i17 != 0) {
            if ((3670016 & i11) == 0) {
                aVar2 = aVar;
                if (c1086gP.k(aVar2)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i13 |= i18;
            }
            if ((i12 & 128) != 0) {
                if ((29360128 & i11) == 0) {
                    if (c1086gP.k(content)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                }
                if (i14 != 8) {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if ((i12 & 2) != 0) {
                            vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                            i13 &= -113;
                        }
                        if (i22 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            aVar2 = new M9.a(2);
                        }
                    } else {
                        if ((i12 & 2) != 0) {
                            vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                            i13 &= -113;
                        }
                        if (i22 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            aVar2 = new M9.a(2);
                        }
                    }
                    c1086gP.U();
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        objF = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                        c1086gP.E(objF);
                    }
                    final A a1113 = (A) objF;
                    PreviewMediaContract previewMediaContract114 = new PreviewMediaContract();
                    c1086gP.L(-2009946895);
                    if ((57344 & i13) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objF2 = c1086gP.f();
                    if (z10) {
                        objF2 = new C2405u(1, onResult);
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new C2405u(1, onResult);
                        c1086gP.E(objF2);
                    }
                    c1086gP.T(false);
                    final androidx.activity.compose.e eVarA11117 = ActivityResultRegistryKt.a(previewMediaContract114, (Ia.l) objF2, c1086gP, 0);
                    androidx.activity.compose.e eVarA11118 = ActivityResultRegistryKt.a(new IntercomMediaPicker(mediaType2, set2, i10), new Ia.l() { // from class: io.intercom.android.sdk.ui.component.s
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$3(a1113, onResult, eVarA11117, mediaPickerButtonCTAStyle, (List) obj);
                        }
                    }, c1086gP, 8);
                    androidx.compose.ui.h.a aVar118 = androidx.compose.ui.h.a.f13984b;
                    c1086gP.L(-2009910284);
                    objF3 = c1086gP.f();
                    if (objF3 == c0153a) {
                        objF3 = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF3);
                    }
                    c1086gP.T(false);
                    androidx.compose.ui.h hVarB114 = ClickableKt.b(aVar118, (androidx.compose.foundation.interaction.k) objF3, vVar2, false, null, new io.intercom.android.sdk.survey.ui.questiontype.numericscale.a(aVar2, eVarA11118, 1), 28);
                    androidx.compose.ui.layout.E eD114 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i20 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P114 = c1086gP.P();
                    androidx.compose.ui.h hVarC114 = ComposedModifierKt.c(c1086gP, hVarB114);
                    ComposeUiNode.f14331c0.getClass();
                    aVar3 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD114);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P114);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i20, c1086gP, i20, pVar);
                    } else {
                        J4.i.d(i20, c1086gP, i20, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC114);
                    C7.g.b((i13 >> 21) & 14, content, c1086gP, true);
                } else {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if ((i12 & 2) != 0) {
                            vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                            i13 &= -113;
                        }
                        if (i22 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            aVar2 = new M9.a(2);
                        }
                    } else {
                        if ((i12 & 2) != 0) {
                            vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                            i13 &= -113;
                        }
                        if (i22 != 0) {
                            mediaType2 = MediaType.All;
                        }
                        if (i14 != 0) {
                            set2 = defaultTrustedFileExtensions;
                            i13 &= -7169;
                        } else {
                            set2 = set;
                        }
                        if (i17 != 0) {
                            aVar2 = new M9.a(2);
                        }
                    }
                    c1086gP.U();
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        objF = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                        c1086gP.E(objF);
                    }
                    final A a1114 = (A) objF;
                    PreviewMediaContract previewMediaContract115 = new PreviewMediaContract();
                    c1086gP.L(-2009946895);
                    if ((57344 & i13) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objF2 = c1086gP.f();
                    if (z10) {
                        objF2 = new C2405u(1, onResult);
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new C2405u(1, onResult);
                        c1086gP.E(objF2);
                    }
                    c1086gP.T(false);
                    final androidx.activity.compose.e eVarA11119 = ActivityResultRegistryKt.a(previewMediaContract115, (Ia.l) objF2, c1086gP, 0);
                    androidx.activity.compose.e eVarA111110 = ActivityResultRegistryKt.a(new IntercomMediaPicker(mediaType2, set2, i10), new Ia.l() { // from class: io.intercom.android.sdk.ui.component.s
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$3(a1114, onResult, eVarA11119, mediaPickerButtonCTAStyle, (List) obj);
                        }
                    }, c1086gP, 8);
                    androidx.compose.ui.h.a aVar119 = androidx.compose.ui.h.a.f13984b;
                    c1086gP.L(-2009910284);
                    objF3 = c1086gP.f();
                    if (objF3 == c0153a) {
                        objF3 = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF3);
                    }
                    c1086gP.T(false);
                    androidx.compose.ui.h hVarB115 = ClickableKt.b(aVar119, (androidx.compose.foundation.interaction.k) objF3, vVar2, false, null, new io.intercom.android.sdk.survey.ui.questiontype.numericscale.a(aVar2, eVarA111110, 1), 28);
                    androidx.compose.ui.layout.E eD115 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i20 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P115 = c1086gP.P();
                    androidx.compose.ui.h hVarC115 = ComposedModifierKt.c(c1086gP, hVarB115);
                    ComposeUiNode.f14331c0.getClass();
                    aVar3 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD115);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P115);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i20, c1086gP, i20, pVar);
                    } else {
                        J4.i.d(i20, c1086gP, i20, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC115);
                    C7.g.b((i13 >> 21) & 14, content, c1086gP, true);
                }
                vVar3 = vVar2;
                mediaType3 = mediaType2;
                aVar4 = aVar2;
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.t
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return MediaPickerButtonKt.MediaPickerButton$lambda$7(i10, vVar3, mediaType3, set2, onResult, mediaPickerButtonCTAStyle, aVar4, content, i11, i12, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i19 = 12582912;
            i13 |= i19;
            if (i14 != 8) {
                c1086gP.r0();
                if ((i11 & 1) != 0) {
                    if ((i12 & 2) != 0) {
                        vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                        i13 &= -113;
                    }
                    if (i22 != 0) {
                        mediaType2 = MediaType.All;
                    }
                    if (i14 != 0) {
                        set2 = defaultTrustedFileExtensions;
                        i13 &= -7169;
                    } else {
                        set2 = set;
                    }
                    if (i17 != 0) {
                        aVar2 = new M9.a(2);
                    }
                } else {
                    if ((i12 & 2) != 0) {
                        vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                        i13 &= -113;
                    }
                    if (i22 != 0) {
                        mediaType2 = MediaType.All;
                    }
                    if (i14 != 0) {
                        set2 = defaultTrustedFileExtensions;
                        i13 &= -7169;
                    } else {
                        set2 = set;
                    }
                    if (i17 != 0) {
                        aVar2 = new M9.a(2);
                    }
                }
                c1086gP.U();
                objF = c1086gP.f();
                c0153a = InterfaceC1084f.a.f12980a;
                if (objF == c0153a) {
                    objF = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                    c1086gP.E(objF);
                }
                final A a1115 = (A) objF;
                PreviewMediaContract previewMediaContract116 = new PreviewMediaContract();
                c1086gP.L(-2009946895);
                if ((57344 & i13) == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objF2 = c1086gP.f();
                if (z10) {
                    objF2 = new C2405u(1, onResult);
                    c1086gP.E(objF2);
                } else {
                    objF2 = new C2405u(1, onResult);
                    c1086gP.E(objF2);
                }
                c1086gP.T(false);
                final androidx.activity.compose.e eVarA111111 = ActivityResultRegistryKt.a(previewMediaContract116, (Ia.l) objF2, c1086gP, 0);
                androidx.activity.compose.e eVarA111112 = ActivityResultRegistryKt.a(new IntercomMediaPicker(mediaType2, set2, i10), new Ia.l() { // from class: io.intercom.android.sdk.ui.component.s
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return MediaPickerButtonKt.MediaPickerButton$lambda$3(a1115, onResult, eVarA111111, mediaPickerButtonCTAStyle, (List) obj);
                    }
                }, c1086gP, 8);
                androidx.compose.ui.h.a aVar1110 = androidx.compose.ui.h.a.f13984b;
                c1086gP.L(-2009910284);
                objF3 = c1086gP.f();
                if (objF3 == c0153a) {
                    objF3 = new androidx.compose.foundation.interaction.l();
                    c1086gP.E(objF3);
                }
                c1086gP.T(false);
                androidx.compose.ui.h hVarB116 = ClickableKt.b(aVar1110, (androidx.compose.foundation.interaction.k) objF3, vVar2, false, null, new io.intercom.android.sdk.survey.ui.questiontype.numericscale.a(aVar2, eVarA111112, 1), 28);
                androidx.compose.ui.layout.E eD116 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i20 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P116 = c1086gP.P();
                androidx.compose.ui.h hVarC116 = ComposedModifierKt.c(c1086gP, hVarB116);
                ComposeUiNode.f14331c0.getClass();
                aVar3 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar3);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD116);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P116);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i20, c1086gP, i20, pVar);
                } else {
                    J4.i.d(i20, c1086gP, i20, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC116);
                C7.g.b((i13 >> 21) & 14, content, c1086gP, true);
            } else {
                c1086gP.r0();
                if ((i11 & 1) != 0) {
                    if ((i12 & 2) != 0) {
                        vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                        i13 &= -113;
                    }
                    if (i22 != 0) {
                        mediaType2 = MediaType.All;
                    }
                    if (i14 != 0) {
                        set2 = defaultTrustedFileExtensions;
                        i13 &= -7169;
                    } else {
                        set2 = set;
                    }
                    if (i17 != 0) {
                        aVar2 = new M9.a(2);
                    }
                } else {
                    if ((i12 & 2) != 0) {
                        vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                        i13 &= -113;
                    }
                    if (i22 != 0) {
                        mediaType2 = MediaType.All;
                    }
                    if (i14 != 0) {
                        set2 = defaultTrustedFileExtensions;
                        i13 &= -7169;
                    } else {
                        set2 = set;
                    }
                    if (i17 != 0) {
                        aVar2 = new M9.a(2);
                    }
                }
                c1086gP.U();
                objF = c1086gP.f();
                c0153a = InterfaceC1084f.a.f12980a;
                if (objF == c0153a) {
                    objF = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                    c1086gP.E(objF);
                }
                final A a1116 = (A) objF;
                PreviewMediaContract previewMediaContract117 = new PreviewMediaContract();
                c1086gP.L(-2009946895);
                if ((57344 & i13) == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objF2 = c1086gP.f();
                if (z10) {
                    objF2 = new C2405u(1, onResult);
                    c1086gP.E(objF2);
                } else {
                    objF2 = new C2405u(1, onResult);
                    c1086gP.E(objF2);
                }
                c1086gP.T(false);
                final androidx.activity.compose.e eVarA111113 = ActivityResultRegistryKt.a(previewMediaContract117, (Ia.l) objF2, c1086gP, 0);
                androidx.activity.compose.e eVarA111114 = ActivityResultRegistryKt.a(new IntercomMediaPicker(mediaType2, set2, i10), new Ia.l() { // from class: io.intercom.android.sdk.ui.component.s
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return MediaPickerButtonKt.MediaPickerButton$lambda$3(a1116, onResult, eVarA111113, mediaPickerButtonCTAStyle, (List) obj);
                    }
                }, c1086gP, 8);
                androidx.compose.ui.h.a aVar1111 = androidx.compose.ui.h.a.f13984b;
                c1086gP.L(-2009910284);
                objF3 = c1086gP.f();
                if (objF3 == c0153a) {
                    objF3 = new androidx.compose.foundation.interaction.l();
                    c1086gP.E(objF3);
                }
                c1086gP.T(false);
                androidx.compose.ui.h hVarB117 = ClickableKt.b(aVar1111, (androidx.compose.foundation.interaction.k) objF3, vVar2, false, null, new io.intercom.android.sdk.survey.ui.questiontype.numericscale.a(aVar2, eVarA111114, 1), 28);
                androidx.compose.ui.layout.E eD117 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i20 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P117 = c1086gP.P();
                androidx.compose.ui.h hVarC117 = ComposedModifierKt.c(c1086gP, hVarB117);
                ComposeUiNode.f14331c0.getClass();
                aVar3 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar3);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD117);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P117);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i20, c1086gP, i20, pVar);
                } else {
                    J4.i.d(i20, c1086gP, i20, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC117);
                C7.g.b((i13 >> 21) & 14, content, c1086gP, true);
            }
            vVar3 = vVar2;
            mediaType3 = mediaType2;
            aVar4 = aVar2;
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.t
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return MediaPickerButtonKt.MediaPickerButton$lambda$7(i10, vVar3, mediaType3, set2, onResult, mediaPickerButtonCTAStyle, aVar4, content, i11, i12, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i13 |= 1572864;
        aVar2 = aVar;
        if ((i12 & 128) != 0) {
            if ((29360128 & i11) == 0) {
                if (c1086gP.k(content)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
            }
            if (i14 != 8) {
                c1086gP.r0();
                if ((i11 & 1) != 0) {
                    if ((i12 & 2) != 0) {
                        vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                        i13 &= -113;
                    }
                    if (i22 != 0) {
                        mediaType2 = MediaType.All;
                    }
                    if (i14 != 0) {
                        set2 = defaultTrustedFileExtensions;
                        i13 &= -7169;
                    } else {
                        set2 = set;
                    }
                    if (i17 != 0) {
                        aVar2 = new M9.a(2);
                    }
                } else {
                    if ((i12 & 2) != 0) {
                        vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                        i13 &= -113;
                    }
                    if (i22 != 0) {
                        mediaType2 = MediaType.All;
                    }
                    if (i14 != 0) {
                        set2 = defaultTrustedFileExtensions;
                        i13 &= -7169;
                    } else {
                        set2 = set;
                    }
                    if (i17 != 0) {
                        aVar2 = new M9.a(2);
                    }
                }
                c1086gP.U();
                objF = c1086gP.f();
                c0153a = InterfaceC1084f.a.f12980a;
                if (objF == c0153a) {
                    objF = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                    c1086gP.E(objF);
                }
                final A a1117 = (A) objF;
                PreviewMediaContract previewMediaContract118 = new PreviewMediaContract();
                c1086gP.L(-2009946895);
                if ((57344 & i13) == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objF2 = c1086gP.f();
                if (z10) {
                    objF2 = new C2405u(1, onResult);
                    c1086gP.E(objF2);
                } else {
                    objF2 = new C2405u(1, onResult);
                    c1086gP.E(objF2);
                }
                c1086gP.T(false);
                final androidx.activity.compose.e eVarA111115 = ActivityResultRegistryKt.a(previewMediaContract118, (Ia.l) objF2, c1086gP, 0);
                androidx.activity.compose.e eVarA111116 = ActivityResultRegistryKt.a(new IntercomMediaPicker(mediaType2, set2, i10), new Ia.l() { // from class: io.intercom.android.sdk.ui.component.s
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return MediaPickerButtonKt.MediaPickerButton$lambda$3(a1117, onResult, eVarA111115, mediaPickerButtonCTAStyle, (List) obj);
                    }
                }, c1086gP, 8);
                androidx.compose.ui.h.a aVar1112 = androidx.compose.ui.h.a.f13984b;
                c1086gP.L(-2009910284);
                objF3 = c1086gP.f();
                if (objF3 == c0153a) {
                    objF3 = new androidx.compose.foundation.interaction.l();
                    c1086gP.E(objF3);
                }
                c1086gP.T(false);
                androidx.compose.ui.h hVarB118 = ClickableKt.b(aVar1112, (androidx.compose.foundation.interaction.k) objF3, vVar2, false, null, new io.intercom.android.sdk.survey.ui.questiontype.numericscale.a(aVar2, eVarA111116, 1), 28);
                androidx.compose.ui.layout.E eD118 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i20 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P118 = c1086gP.P();
                androidx.compose.ui.h hVarC118 = ComposedModifierKt.c(c1086gP, hVarB118);
                ComposeUiNode.f14331c0.getClass();
                aVar3 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar3);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD118);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P118);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i20, c1086gP, i20, pVar);
                } else {
                    J4.i.d(i20, c1086gP, i20, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC118);
                C7.g.b((i13 >> 21) & 14, content, c1086gP, true);
            } else {
                c1086gP.r0();
                if ((i11 & 1) != 0) {
                    if ((i12 & 2) != 0) {
                        vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                        i13 &= -113;
                    }
                    if (i22 != 0) {
                        mediaType2 = MediaType.All;
                    }
                    if (i14 != 0) {
                        set2 = defaultTrustedFileExtensions;
                        i13 &= -7169;
                    } else {
                        set2 = set;
                    }
                    if (i17 != 0) {
                        aVar2 = new M9.a(2);
                    }
                } else {
                    if ((i12 & 2) != 0) {
                        vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                        i13 &= -113;
                    }
                    if (i22 != 0) {
                        mediaType2 = MediaType.All;
                    }
                    if (i14 != 0) {
                        set2 = defaultTrustedFileExtensions;
                        i13 &= -7169;
                    } else {
                        set2 = set;
                    }
                    if (i17 != 0) {
                        aVar2 = new M9.a(2);
                    }
                }
                c1086gP.U();
                objF = c1086gP.f();
                c0153a = InterfaceC1084f.a.f12980a;
                if (objF == c0153a) {
                    objF = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                    c1086gP.E(objF);
                }
                final A a1118 = (A) objF;
                PreviewMediaContract previewMediaContract119 = new PreviewMediaContract();
                c1086gP.L(-2009946895);
                if ((57344 & i13) == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objF2 = c1086gP.f();
                if (z10) {
                    objF2 = new C2405u(1, onResult);
                    c1086gP.E(objF2);
                } else {
                    objF2 = new C2405u(1, onResult);
                    c1086gP.E(objF2);
                }
                c1086gP.T(false);
                final androidx.activity.compose.e eVarA111117 = ActivityResultRegistryKt.a(previewMediaContract119, (Ia.l) objF2, c1086gP, 0);
                androidx.activity.compose.e eVarA111118 = ActivityResultRegistryKt.a(new IntercomMediaPicker(mediaType2, set2, i10), new Ia.l() { // from class: io.intercom.android.sdk.ui.component.s
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return MediaPickerButtonKt.MediaPickerButton$lambda$3(a1118, onResult, eVarA111117, mediaPickerButtonCTAStyle, (List) obj);
                    }
                }, c1086gP, 8);
                androidx.compose.ui.h.a aVar1113 = androidx.compose.ui.h.a.f13984b;
                c1086gP.L(-2009910284);
                objF3 = c1086gP.f();
                if (objF3 == c0153a) {
                    objF3 = new androidx.compose.foundation.interaction.l();
                    c1086gP.E(objF3);
                }
                c1086gP.T(false);
                androidx.compose.ui.h hVarB119 = ClickableKt.b(aVar1113, (androidx.compose.foundation.interaction.k) objF3, vVar2, false, null, new io.intercom.android.sdk.survey.ui.questiontype.numericscale.a(aVar2, eVarA111118, 1), 28);
                androidx.compose.ui.layout.E eD119 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i20 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P119 = c1086gP.P();
                androidx.compose.ui.h hVarC119 = ComposedModifierKt.c(c1086gP, hVarB119);
                ComposeUiNode.f14331c0.getClass();
                aVar3 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar3);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD119);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P119);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i20, c1086gP, i20, pVar);
                } else {
                    J4.i.d(i20, c1086gP, i20, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC119);
                C7.g.b((i13 >> 21) & 14, content, c1086gP, true);
            }
            vVar3 = vVar2;
            mediaType3 = mediaType2;
            aVar4 = aVar2;
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.t
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return MediaPickerButtonKt.MediaPickerButton$lambda$7(i10, vVar3, mediaType3, set2, onResult, mediaPickerButtonCTAStyle, aVar4, content, i11, i12, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i19 = 12582912;
        i13 |= i19;
        if (i14 != 8) {
            c1086gP.r0();
            if ((i11 & 1) != 0) {
                if ((i12 & 2) != 0) {
                    vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                    i13 &= -113;
                }
                if (i22 != 0) {
                    mediaType2 = MediaType.All;
                }
                if (i14 != 0) {
                    set2 = defaultTrustedFileExtensions;
                    i13 &= -7169;
                } else {
                    set2 = set;
                }
                if (i17 != 0) {
                    aVar2 = new M9.a(2);
                }
            } else {
                if ((i12 & 2) != 0) {
                    vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                    i13 &= -113;
                }
                if (i22 != 0) {
                    mediaType2 = MediaType.All;
                }
                if (i14 != 0) {
                    set2 = defaultTrustedFileExtensions;
                    i13 &= -7169;
                } else {
                    set2 = set;
                }
                if (i17 != 0) {
                    aVar2 = new M9.a(2);
                }
            }
            c1086gP.U();
            objF = c1086gP.f();
            c0153a = InterfaceC1084f.a.f12980a;
            if (objF == c0153a) {
                objF = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                c1086gP.E(objF);
            }
            final A a1119 = (A) objF;
            PreviewMediaContract previewMediaContract1110 = new PreviewMediaContract();
            c1086gP.L(-2009946895);
            if ((57344 & i13) == 16384) {
                z10 = true;
            } else {
                z10 = false;
            }
            objF2 = c1086gP.f();
            if (z10) {
                objF2 = new C2405u(1, onResult);
                c1086gP.E(objF2);
            } else {
                objF2 = new C2405u(1, onResult);
                c1086gP.E(objF2);
            }
            c1086gP.T(false);
            final androidx.activity.compose.e eVarA111119 = ActivityResultRegistryKt.a(previewMediaContract1110, (Ia.l) objF2, c1086gP, 0);
            androidx.activity.compose.e eVarA1111110 = ActivityResultRegistryKt.a(new IntercomMediaPicker(mediaType2, set2, i10), new Ia.l() { // from class: io.intercom.android.sdk.ui.component.s
                @Override // Ia.l
                public final Object invoke(Object obj) {
                    return MediaPickerButtonKt.MediaPickerButton$lambda$3(a1119, onResult, eVarA111119, mediaPickerButtonCTAStyle, (List) obj);
                }
            }, c1086gP, 8);
            androidx.compose.ui.h.a aVar1114 = androidx.compose.ui.h.a.f13984b;
            c1086gP.L(-2009910284);
            objF3 = c1086gP.f();
            if (objF3 == c0153a) {
                objF3 = new androidx.compose.foundation.interaction.l();
                c1086gP.E(objF3);
            }
            c1086gP.T(false);
            androidx.compose.ui.h hVarB1110 = ClickableKt.b(aVar1114, (androidx.compose.foundation.interaction.k) objF3, vVar2, false, null, new io.intercom.android.sdk.survey.ui.questiontype.numericscale.a(aVar2, eVarA1111110, 1), 28);
            androidx.compose.ui.layout.E eD1110 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
            i20 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P1110 = c1086gP.P();
            androidx.compose.ui.h hVarC1110 = ComposedModifierKt.c(c1086gP, hVarB1110);
            ComposeUiNode.f14331c0.getClass();
            aVar3 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar3);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD1110);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P1110);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i20, c1086gP, i20, pVar);
            } else {
                J4.i.d(i20, c1086gP, i20, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC1110);
            C7.g.b((i13 >> 21) & 14, content, c1086gP, true);
        } else {
            c1086gP.r0();
            if ((i11 & 1) != 0) {
                if ((i12 & 2) != 0) {
                    vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                    i13 &= -113;
                }
                if (i22 != 0) {
                    mediaType2 = MediaType.All;
                }
                if (i14 != 0) {
                    set2 = defaultTrustedFileExtensions;
                    i13 &= -7169;
                } else {
                    set2 = set;
                }
                if (i17 != 0) {
                    aVar2 = new M9.a(2);
                }
            } else {
                if ((i12 & 2) != 0) {
                    vVar2 = (androidx.compose.foundation.v) c1086gP.x(IndicationKt.f9774a);
                    i13 &= -113;
                }
                if (i22 != 0) {
                    mediaType2 = MediaType.All;
                }
                if (i14 != 0) {
                    set2 = defaultTrustedFileExtensions;
                    i13 &= -7169;
                } else {
                    set2 = set;
                }
                if (i17 != 0) {
                    aVar2 = new M9.a(2);
                }
            }
            c1086gP.U();
            objF = c1086gP.f();
            c0153a = InterfaceC1084f.a.f12980a;
            if (objF == c0153a) {
                objF = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                c1086gP.E(objF);
            }
            final A a11110 = (A) objF;
            PreviewMediaContract previewMediaContract1111 = new PreviewMediaContract();
            c1086gP.L(-2009946895);
            if ((57344 & i13) == 16384) {
                z10 = true;
            } else {
                z10 = false;
            }
            objF2 = c1086gP.f();
            if (z10) {
                objF2 = new C2405u(1, onResult);
                c1086gP.E(objF2);
            } else {
                objF2 = new C2405u(1, onResult);
                c1086gP.E(objF2);
            }
            c1086gP.T(false);
            final androidx.activity.compose.e eVarA1111111 = ActivityResultRegistryKt.a(previewMediaContract1111, (Ia.l) objF2, c1086gP, 0);
            androidx.activity.compose.e eVarA1111112 = ActivityResultRegistryKt.a(new IntercomMediaPicker(mediaType2, set2, i10), new Ia.l() { // from class: io.intercom.android.sdk.ui.component.s
                @Override // Ia.l
                public final Object invoke(Object obj) {
                    return MediaPickerButtonKt.MediaPickerButton$lambda$3(a11110, onResult, eVarA1111111, mediaPickerButtonCTAStyle, (List) obj);
                }
            }, c1086gP, 8);
            androidx.compose.ui.h.a aVar1115 = androidx.compose.ui.h.a.f13984b;
            c1086gP.L(-2009910284);
            objF3 = c1086gP.f();
            if (objF3 == c0153a) {
                objF3 = new androidx.compose.foundation.interaction.l();
                c1086gP.E(objF3);
            }
            c1086gP.T(false);
            androidx.compose.ui.h hVarB1111 = ClickableKt.b(aVar1115, (androidx.compose.foundation.interaction.k) objF3, vVar2, false, null, new io.intercom.android.sdk.survey.ui.questiontype.numericscale.a(aVar2, eVarA1111112, 1), 28);
            androidx.compose.ui.layout.E eD1111 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
            i20 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P1111 = c1086gP.P();
            androidx.compose.ui.h hVarC1111 = ComposedModifierKt.c(c1086gP, hVarB1111);
            ComposeUiNode.f14331c0.getClass();
            aVar3 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar3);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD1111);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P1111);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i20, c1086gP, i20, pVar);
            } else {
                J4.i.d(i20, c1086gP, i20, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC1111);
            C7.g.b((i13 >> 21) & 14, content, c1086gP, true);
        }
        vVar3 = vVar2;
        mediaType3 = mediaType2;
        aVar4 = aVar2;
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.ui.component.t
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return MediaPickerButtonKt.MediaPickerButton$lambda$7(i10, vVar3, mediaType3, set2, onResult, mediaPickerButtonCTAStyle, aVar4, content, i11, i12, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MediaPickerButton$lambda$2$lambda$1(Ia.l onResult, List it) {
        kotlin.jvm.internal.i.e(onResult, "$onResult");
        kotlin.jvm.internal.i.e(it, "it");
        onResult.invoke(it);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MediaPickerButton$lambda$3(A scope, Ia.l onResult, androidx.activity.compose.e previewLauncher, MediaPickerButtonCTAStyle mediaPickerButtonCTAStyle, List it) {
        kotlin.jvm.internal.i.e(scope, "$scope");
        kotlin.jvm.internal.i.e(onResult, "$onResult");
        kotlin.jvm.internal.i.e(previewLauncher, "$previewLauncher");
        kotlin.jvm.internal.i.e(mediaPickerButtonCTAStyle, "$mediaPickerButtonCTAStyle");
        kotlin.jvm.internal.i.e(it, "it");
        if (it.isEmpty()) {
            onResult.invoke(it);
        } else {
            C2680e.c(scope, null, null, new MediaPickerButtonKt$MediaPickerButton$pickerLauncher$1$1(previewLauncher, it, mediaPickerButtonCTAStyle, null), 3);
        }
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MediaPickerButton$lambda$5(Ia.a aVar, androidx.activity.compose.e pickerLauncher) {
        kotlin.jvm.internal.i.e(pickerLauncher, "$pickerLauncher");
        aVar.invoke();
        pickerLauncher.a("*/*");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MediaPickerButton$lambda$7(int i10, androidx.compose.foundation.v vVar, MediaType mediaType, Set set, Ia.l onResult, MediaPickerButtonCTAStyle mediaPickerButtonCTAStyle, Ia.a aVar, Ia.p content, int i11, int i12, InterfaceC1084f interfaceC1084f, int i13) {
        kotlin.jvm.internal.i.e(onResult, "$onResult");
        kotlin.jvm.internal.i.e(mediaPickerButtonCTAStyle, "$mediaPickerButtonCTAStyle");
        kotlin.jvm.internal.i.e(content, "$content");
        MediaPickerButton(i10, vVar, mediaType, set, onResult, mediaPickerButtonCTAStyle, aVar, content, interfaceC1084f, L4.b.l(i11 | 1), i12);
        return p293xa.r.f47939a;
    }

    private static final void MediaPickerButtonPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-158042907);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$MediaPickerButtonKt.INSTANCE.m518getLambda3$intercom_sdk_ui_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2289k0(i10, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r MediaPickerButtonPreview$lambda$8(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        MediaPickerButtonPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    public static final Set<String> getDefaultTrustedFileExtensions() {
        return defaultTrustedFileExtensions;
    }

    public static final boolean isPhotoPickerAvailable() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            return true;
        }
        return i10 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
    }
}
