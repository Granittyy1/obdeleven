package io.intercom.android.sdk.survey.ui.questiontype.files;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.ErrorMessageLayoutKt;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.NoWhenBranchMatchedException;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: FileUploadErrorComponent.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class FileUploadErrorComponentKt {
    /* JADX WARN: Code duplicated, block: B:101:0x0133  */
    /* JADX WARN: Code duplicated, block: B:104:0x0170  */
    /* JADX WARN: Code duplicated, block: B:105:0x0174  */
    /* JADX WARN: Code duplicated, block: B:108:0x0187  */
    /* JADX WARN: Code duplicated, block: B:110:0x0195  */
    /* JADX WARN: Code duplicated, block: B:114:0x0206  */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:92:0x0103  */
    /* JADX WARN: Code duplicated, block: B:95:0x0126  */
    /* JADX WARN: Code duplicated, block: B:96:0x0128  */
    /* JADX WARN: Code duplicated, block: B:99:0x012f  */
    /* JADX INFO: renamed from: ActionRow-FHprtrg, reason: not valid java name */
    public static final void m441ActionRowFHprtrg(androidx.compose.ui.h hVar, final int i10, final int i11, int i12, long j, final Ia.a<p293xa.r> onClick, InterfaceC1084f interfaceC1084f, final int i13, final int i14) {
        androidx.compose.ui.h hVar2;
        int i15;
        int i16;
        long jM645getPrimaryText0d7_KjU;
        int i17;
        final androidx.compose.ui.h hVar3;
        int i18;
        boolean z10;
        Object objF;
        int i19;
        Ia.a<ComposeUiNode> aVar;
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar;
        final int i20;
        final long j10;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(onClick, "onClick");
        C1086g c1086gP = interfaceC1084f.p(-1845655864);
        int i21 = i14 & 1;
        if (i21 != 0) {
            i15 = i13 | 6;
            hVar2 = hVar;
        } else if ((i13 & 14) == 0) {
            hVar2 = hVar;
            i15 = (c1086gP.K(hVar2) ? 4 : 2) | i13;
        } else {
            hVar2 = hVar;
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i15 |= c1086gP.h(i10) ? 32 : 16;
        }
        if ((i14 & 4) != 0) {
            i15 |= 384;
        } else if ((i13 & 896) == 0) {
            i15 |= c1086gP.h(i11) ? 256 : 128;
        }
        if ((i13 & 7168) == 0) {
            if ((i14 & 8) == 0) {
                i16 = i12;
                int i22 = c1086gP.h(i16) ? 2048 : 1024;
                i15 |= i22;
            } else {
                i16 = i12;
            }
            i15 |= i22;
        } else {
            i16 = i12;
        }
        if ((57344 & i13) == 0) {
            if ((i14 & 16) == 0) {
                jM645getPrimaryText0d7_KjU = j;
                int i23 = c1086gP.i(jM645getPrimaryText0d7_KjU) ? 16384 : 8192;
                i15 |= i23;
            } else {
                jM645getPrimaryText0d7_KjU = j;
            }
            i15 |= i23;
        } else {
            jM645getPrimaryText0d7_KjU = j;
        }
        if ((i14 & 32) == 0) {
            if ((i13 & 458752) == 0) {
                i17 = c1086gP.k(onClick) ? 131072 : 65536;
            }
            if ((374491 & i15) == 74898 || !c1086gP.s()) {
                c1086gP.r0();
                if ((i13 & 1) != 0 || c1086gP.a0()) {
                    if (i21 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                        i16 = i11;
                    }
                    if ((i14 & 16) != 0) {
                        jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                        i15 &= -57345;
                    }
                } else {
                    c1086gP.w();
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                    }
                    if ((i14 & 16) != 0) {
                        i15 &= -57345;
                    }
                    hVar3 = hVar2;
                }
                i18 = i15;
                long j11 = jM645getPrimaryText0d7_KjU;
                c1086gP.U();
                androidx.compose.ui.h hVarD = W.d(hVar3, 1.0f);
                c1086gP.L(1130566626);
                if ((i18 & 458752) == 131072) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objF = c1086gP.f();
                if (z10 || objF == InterfaceC1084f.a.f12980a) {
                    objF = new t(0, onClick);
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                float f10 = 16;
                androidx.compose.ui.h hVarG = PaddingKt.g(f10, f10, ClickableKt.c(hVarD, false, null, (Ia.a) objF, 7));
                T tA = S.a(C0945e.g(f10), androidx.compose.ui.d.a.f13344k, c1086gP, 54);
                i19 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarG);
                ComposeUiNode.f14331c0.getClass();
                aVar = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i19))) {
                    J4.i.d(i19, c1086gP, i19, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
                int i24 = i18 >> 3;
                IconKt.a(U.c.a(i10, c1086gP, i24 & 14), S4.o.p(c1086gP, i16), null, j11, c1086gP, (i24 & 7168) | 8, 4);
                TextKt.b(S4.o.p(c1086gP, i11), null, j11, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04(), c1086gP, (i18 >> 6) & 896, 0, 65530);
                c1086gP.T(true);
                i20 = i16;
                j10 = j11;
            } else {
                c1086gP.w();
                hVar3 = hVar2;
                i20 = i16;
                j10 = jM645getPrimaryText0d7_KjU;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.u
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return FileUploadErrorComponentKt.ActionRow_FHprtrg$lambda$5(hVar3, i10, i11, i20, j10, onClick, i13, i14, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i17 = 196608;
        i15 |= i17;
        if ((374491 & i15) == 74898) {
            c1086gP.r0();
            if ((i13 & 1) != 0) {
                if (i21 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                    i16 = i11;
                }
                if ((i14 & 16) != 0) {
                    jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                    i15 &= -57345;
                }
            } else {
                if (i21 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                    i16 = i11;
                }
                if ((i14 & 16) != 0) {
                    jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                    i15 &= -57345;
                }
            }
            i18 = i15;
            long j12 = jM645getPrimaryText0d7_KjU;
            c1086gP.U();
            androidx.compose.ui.h hVarD2 = W.d(hVar3, 1.0f);
            c1086gP.L(1130566626);
            if ((i18 & 458752) == 131072) {
                z10 = true;
            } else {
                z10 = false;
            }
            objF = c1086gP.f();
            if (z10) {
                objF = new t(0, onClick);
                c1086gP.E(objF);
            } else {
                objF = new t(0, onClick);
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            float f11 = 16;
            androidx.compose.ui.h hVarG2 = PaddingKt.g(f11, f11, ClickableKt.c(hVarD2, false, null, (Ia.a) objF, 7));
            T tA2 = S.a(C0945e.g(f11), androidx.compose.ui.d.a.f13344k, c1086gP, 54);
            i19 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarG2);
            ComposeUiNode.f14331c0.getClass();
            aVar = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA2);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P2);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i19, c1086gP, i19, pVar);
            } else {
                J4.i.d(i19, c1086gP, i19, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
            int i25 = i18 >> 3;
            IconKt.a(U.c.a(i10, c1086gP, i25 & 14), S4.o.p(c1086gP, i16), null, j12, c1086gP, (i25 & 7168) | 8, 4);
            TextKt.b(S4.o.p(c1086gP, i11), null, j12, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04(), c1086gP, (i18 >> 6) & 896, 0, 65530);
            c1086gP.T(true);
            i20 = i16;
            j10 = j12;
        } else {
            c1086gP.r0();
            if ((i13 & 1) != 0) {
                if (i21 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                    i16 = i11;
                }
                if ((i14 & 16) != 0) {
                    jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                    i15 &= -57345;
                }
            } else {
                if (i21 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                    i16 = i11;
                }
                if ((i14 & 16) != 0) {
                    jM645getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU();
                    i15 &= -57345;
                }
            }
            i18 = i15;
            long j13 = jM645getPrimaryText0d7_KjU;
            c1086gP.U();
            androidx.compose.ui.h hVarD3 = W.d(hVar3, 1.0f);
            c1086gP.L(1130566626);
            if ((i18 & 458752) == 131072) {
                z10 = true;
            } else {
                z10 = false;
            }
            objF = c1086gP.f();
            if (z10) {
                objF = new t(0, onClick);
                c1086gP.E(objF);
            } else {
                objF = new t(0, onClick);
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            float f12 = 16;
            androidx.compose.ui.h hVarG3 = PaddingKt.g(f12, f12, ClickableKt.c(hVarD3, false, null, (Ia.a) objF, 7));
            T tA3 = S.a(C0945e.g(f12), androidx.compose.ui.d.a.f13344k, c1086gP, 54);
            i19 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVarG3);
            ComposeUiNode.f14331c0.getClass();
            aVar = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA3);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P3);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i19, c1086gP, i19, pVar);
            } else {
                J4.i.d(i19, c1086gP, i19, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC3);
            int i26 = i18 >> 3;
            IconKt.a(U.c.a(i10, c1086gP, i26 & 14), S4.o.p(c1086gP, i16), null, j13, c1086gP, (i26 & 7168) | 8, 4);
            TextKt.b(S4.o.p(c1086gP, i11), null, j13, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04(), c1086gP, (i18 >> 6) & 896, 0, 65530);
            c1086gP.T(true);
            i20 = i16;
            j10 = j13;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.u
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return FileUploadErrorComponentKt.ActionRow_FHprtrg$lambda$5(hVar3, i10, i11, i20, j10, onClick, i13, i14, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ActionRow_FHprtrg$lambda$3$lambda$2(Ia.a onClick) {
        kotlin.jvm.internal.i.e(onClick, "$onClick");
        onClick.invoke();
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ActionRow_FHprtrg$lambda$5(androidx.compose.ui.h hVar, int i10, int i11, int i12, long j, Ia.a onClick, int i13, int i14, InterfaceC1084f interfaceC1084f, int i15) {
        kotlin.jvm.internal.i.e(onClick, "$onClick");
        m441ActionRowFHprtrg(hVar, i10, i11, i12, j, onClick, interfaceC1084f, L4.b.l(i13 | 1), i14);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void ErrorActionSheetContentPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(2121321299);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$FileUploadErrorComponentKt.INSTANCE.m434getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.m5.components.avatar.a(i10, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ErrorActionSheetContentPreview$lambda$6(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        ErrorActionSheetContentPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    public static final void FileUploadErrorComponent(final String title, final Answer.MediaAnswer.FileUploadError error, final Ia.a<p293xa.r> onRetryClick, final Ia.a<p293xa.r> onDeleteClick, InterfaceC1084f interfaceC1084f, final int i10) {
        boolean z10;
        kotlin.jvm.internal.i.e(title, "title");
        kotlin.jvm.internal.i.e(error, "error");
        kotlin.jvm.internal.i.e(onRetryClick, "onRetryClick");
        kotlin.jvm.internal.i.e(onDeleteClick, "onDeleteClick");
        C1086g c1086gP = interfaceC1084f.p(725182893);
        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
        androidx.compose.ui.h hVarD = W.d(aVar, 1.0f);
        C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
        int i11 = c1086gP.f12996P;
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
        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA);
        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i11))) {
            J4.i.d(i11, c1086gP, i11, pVar);
        }
        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
        float f10 = 16;
        TextKt.b(title, PaddingKt.j(W.d(aVar, 1.0f), f10, f10, f10, 0.0f, 8), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04(), c1086gP, i10 & 14, 0, 65532);
        ErrorMessageLayoutKt.ErrorMessageLayout(PaddingKt.g(f10, 8, W.d(aVar, 1.0f)), error.getErrorMessages(), c1086gP, 70, 0);
        float f11 = 4;
        IntercomDividerKt.IntercomDivider(PaddingKt.h(W.d(aVar, 1.0f), 0.0f, f11, 1), c1086gP, 6, 0);
        if ((error instanceof Answer.MediaAnswer.FileUploadError.FileLimitExceeded) || (error instanceof Answer.MediaAnswer.FileUploadError.UnsupportedFileType) || (error instanceof Answer.MediaAnswer.FileUploadError.FileTooLarge)) {
            z10 = true;
            c1086gP.L(157589913);
            m441ActionRowFHprtrg(null, io.intercom.android.sdk.ui.R.drawable.intercom_ic_delete, io.intercom.android.sdk.R.string.intercom_delete_attachment, 0, 0L, onDeleteClick, c1086gP, (i10 << 6) & 458752, 25);
            c1086gP.T(false);
        } else {
            if (!(error instanceof Answer.MediaAnswer.FileUploadError.UploadFailed)) {
                c1086gP.L(-549109013);
                c1086gP.T(false);
                throw new NoWhenBranchMatchedException();
            }
            c1086gP.L(157902703);
            z10 = true;
            m441ActionRowFHprtrg(null, io.intercom.android.sdk.R.drawable.intercom_ic_reload, io.intercom.android.sdk.R.string.intercom_try_again, 0, 0L, onRetryClick, c1086gP, (i10 << 9) & 458752, 25);
            IntercomDividerKt.IntercomDivider(PaddingKt.h(W.d(aVar, 1.0f), 0.0f, f11, 1), c1086gP, 6, 0);
            m441ActionRowFHprtrg(null, io.intercom.android.sdk.ui.R.drawable.intercom_ic_delete, io.intercom.android.sdk.R.string.intercom_delete_attachment, 0, 0L, onDeleteClick, c1086gP, (i10 << 6) & 458752, 25);
            c1086gP.T(false);
        }
        c1086gP.T(z10);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.s
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return FileUploadErrorComponentKt.FileUploadErrorComponent$lambda$1(title, error, onRetryClick, onDeleteClick, i10, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r FileUploadErrorComponent$lambda$1(String title, Answer.MediaAnswer.FileUploadError error, Ia.a onRetryClick, Ia.a onDeleteClick, int i10, InterfaceC1084f interfaceC1084f, int i11) {
        kotlin.jvm.internal.i.e(title, "$title");
        kotlin.jvm.internal.i.e(error, "$error");
        kotlin.jvm.internal.i.e(onRetryClick, "$onRetryClick");
        kotlin.jvm.internal.i.e(onDeleteClick, "$onDeleteClick");
        FileUploadErrorComponent(title, error, onRetryClick, onDeleteClick, interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void UploadFailedErrorActionSheetPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(2130831888);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$FileUploadErrorComponentKt.INSTANCE.m436getLambda4$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.helpcenter.articles.x(i10, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r UploadFailedErrorActionSheetPreview$lambda$7(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        UploadFailedErrorActionSheetPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
