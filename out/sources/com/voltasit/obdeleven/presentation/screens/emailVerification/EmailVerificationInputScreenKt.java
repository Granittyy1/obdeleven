package com.voltasit.obdeleven.presentation.screens.emailVerification;

import Ia.l;
import Ia.p;
import J4.n;
import S4.o;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.foundation.text.k;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.d;
import androidx.compose.ui.h;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.lifecycle.Y;
import androidx.lifecycle.c0;
import com.voltasit.obdeleven.presentation.components.TextInputKt;
import com.voltasit.obdeleven.presentation.components.b;
import com.voltasit.obdeleven.presentation.components.c;
import com.voltasit.obdeleven.presentation.dialogs.LoaderDialogKt;
import com.voltasit.obdeleven.presentation.dialogs.checkNetwork.CheckNetworkDialogKt;
import com.voltasit.obdeleven.presentation.e;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import kotlin.jvm.internal.i;
import me.zhanghai.android.materialprogressbar.R;
import org.koin.compose.KoinApplicationKt;
import p293xa.r;

/* JADX INFO: compiled from: EmailVerificationInputScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class EmailVerificationInputScreenKt {
    public static final void a(final a aVar, final l<? super String, r> lVar, final Ia.a<r> aVar2, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(229478668);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.K(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= c1086gP.k(lVar) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c1086gP.k(aVar2) ? 256 : 128;
        }
        int i12 = i11;
        if ((i12 & 731) == 146 && c1086gP.s()) {
            c1086gP.w();
        } else {
            h.a aVar3 = h.a.f13984b;
            float f10 = 16;
            h hVarB = ScrollKt.b(PaddingKt.h(aVar3, f10, 0.0f, 2).i(W.f10226c), ScrollKt.a(0, c1086gP, 0, 1), false, 14);
            C0953m c0953mA = C0952l.a(C0945e.f10286c, d.a.f13346m, c1086gP, 0);
            int i13 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            h hVarC = ComposedModifierKt.c(c1086gP, hVarB);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar4 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar4);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
            p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i13))) {
                J4.i.d(i13, c1086gP, i13, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
            Lb.a.a(c1086gP, W.e(aVar3, f10));
            TextInputKt.a(null, aVar.f32948a, lVar, o.p(c1086gP, com.voltasit.obdeleven.R.string.common_email), k.a(3, 0, 0, R.styleable.AppCompatTheme_windowNoTitle), aVar.f32949b, null, c1086gP, (i12 << 3) & 896, 65);
            c.a(PaddingKt.h(aVar3, 14, 0.0f, 2), n.c(aVar3, f10, c1086gP, com.voltasit.obdeleven.R.string.view_sfd_intro_confirm_email_address, c1086gP), c1086gP, 48, 0);
            if (1.0f <= 0.0d) {
                p258v.a.a("invalid weight; must be greater than zero");
            }
            Lb.a.a(c1086gP, new LayoutWeightElement(true, Na.l.z(1.0f, Float.MAX_VALUE)));
            b.a((57344 & (i12 << 6)) | 384, 32, e.a.j, aVar2, c1086gP, W.d(new HorizontalAlignElement(d.a.f13347n), 1.0f), o.p(c1086gP, com.voltasit.obdeleven.R.string.common_next), aVar.f32950c, false);
            Lb.a.a(c1086gP, W.e(aVar3, f10));
            c1086gP.T(true);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.emailVerification.EmailVerificationInputScreenKt$EmailVerificationInputScreen$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    EmailVerificationInputScreenKt.a(aVar, lVar, aVar2, interfaceC1084f2, L4.b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final EmailVerificationViewModel emailVerificationViewModel, final Ia.a<r> onQuit, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        i.e(onQuit, "onQuit");
        C1086g c1086gP = interfaceC1084f.p(1649424178);
        int i12 = i11 & 1;
        int i13 = i12 != 0 ? i10 | 2 : i10;
        if ((i11 & 2) != 0) {
            i13 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i13 |= c1086gP.k(onQuit) ? 32 : 16;
        }
        if (i12 == 1 && (i13 & 91) == 18 && c1086gP.s()) {
            c1086gP.w();
        } else {
            c1086gP.r0();
            if ((i10 & 1) != 0 && !c1086gP.a0()) {
                c1086gP.w();
                if (i12 != 0) {
                    i13 &= -15;
                }
            } else if (i12 != 0) {
                c1086gP.e(667488325);
                c0 c0VarA = p027c1.b.a(c1086gP);
                if (c0VarA == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                p014b1.a aVarA = Fb.a.a(c0VarA, c1086gP);
                org.koin.core.scope.a aVarA2 = KoinApplicationKt.a(c1086gP);
                c1086gP.e(-1614864554);
                Y yA = Gb.a.a(kotlin.jvm.internal.l.a(EmailVerificationViewModel.class), c0VarA.getViewModelStore(), null, aVarA, null, aVarA2, null);
                c1086gP.T(false);
                c1086gP.T(false);
                emailVerificationViewModel = (EmailVerificationViewModel) yA;
                i13 &= -15;
            }
            c1086gP.U();
            final C1085f0 c1085f0 = emailVerificationViewModel.f32941t;
            a((a) c1085f0.getValue(), new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.emailVerification.EmailVerificationInputScreenKt$EmailVerificationInputScreen$1
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ia.l
                public final r invoke(String str) {
                    String it = str;
                    i.e(it, "it");
                    EmailVerificationViewModel emailVerificationViewModel2 = emailVerificationViewModel;
                    emailVerificationViewModel2.getClass();
                    C1085f0 c1085f1 = emailVerificationViewModel2.f32940s;
                    c1085f1.setValue(a.a((a) c1085f1.getValue(), it, null, true, false, null, 24));
                    return r.f47939a;
                }
            }, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.emailVerification.EmailVerificationInputScreenKt$EmailVerificationInputScreen$2
                {
                    super(0);
                }

                @Override // Ia.a
                public final r invoke() {
                    emailVerificationViewModel.c();
                    return r.f47939a;
                }
            }, c1086gP, 0);
            LoaderDialogKt.a(((a) c1085f0.getValue()).f32951d ? PreloaderState.c.f32642a : PreloaderState.d.f32643a, c1086gP, 0);
            if (((a) c1085f0.getValue()).f32952e != TryAgainAction.f32944b) {
                CheckNetworkDialogKt.a(new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.emailVerification.EmailVerificationInputScreenKt$EmailVerificationInputScreen$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        emailVerificationViewModel.e(c1085f0.getValue().f32952e);
                        return r.f47939a;
                    }
                }, onQuit, c1086gP, i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            }
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.emailVerification.EmailVerificationInputScreenKt$EmailVerificationInputScreen$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    EmailVerificationInputScreenKt.b(emailVerificationViewModel, onQuit, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return r.f47939a;
                }
            };
        }
    }
}
