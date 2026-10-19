package com.voltasit.obdeleven.presentation.screens.emailVerification;

import Ia.p;
import J4.n;
import S4.o;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.C0955o;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.material.C1034j;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.E;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.O0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.d;
import androidx.compose.ui.f;
import androidx.compose.ui.h;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.s;
import androidx.compose.ui.text.style.g;
import androidx.lifecycle.Y;
import androidx.lifecycle.Z;
import androidx.lifecycle.c0;
import com.voltasit.obdeleven.presentation.dialogs.LoaderDialogKt;
import com.voltasit.obdeleven.presentation.dialogs.checkNetwork.CheckNetworkDialogKt;
import com.voltasit.obdeleven.presentation.e;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import kotlinx.coroutines.C2680e;
import me.zhanghai.android.materialprogressbar.R;
import org.koin.compose.KoinApplicationKt;
import p027c1.b;
import p293xa.r;

/* JADX INFO: compiled from: EmailVerificationConfirmationScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class EmailVerificationConfirmationScreenKt {
    /* JADX WARN: Code duplicated, block: B:60:0x0119  */
    /* JADX WARN: Code duplicated, block: B:61:0x011c  */
    /* JADX WARN: Code duplicated, block: B:64:0x012d  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final String email, EmailVerificationViewModel emailVerificationViewModel, final Ia.a<r> onQuit, final Ia.a<r> onComplete, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        int i13;
        final EmailVerificationViewModel emailVerificationViewModel2;
        final C1085f0 c1085f0;
        PreloaderState preloaderState;
        final EmailVerificationViewModel emailVerificationViewModel3;
        i.e(email, "email");
        i.e(onQuit, "onQuit");
        i.e(onComplete, "onComplete");
        C1086g c1086gP = interfaceC1084f.p(-1333636937);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.K(email) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 != 0) {
            i12 |= 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= c1086gP.k(onQuit) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i12 |= c1086gP.k(onComplete) ? 2048 : 1024;
        }
        if (i14 == 2 && (i12 & 5851) == 1170 && c1086gP.s()) {
            c1086gP.w();
            emailVerificationViewModel3 = emailVerificationViewModel;
        } else {
            c1086gP.r0();
            if ((i10 & 1) == 0 || c1086gP.a0()) {
                if (i14 != 0) {
                    c1086gP.e(667488325);
                    c0 c0VarA = b.a(c1086gP);
                    if (c0VarA == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    p014b1.a aVarA = Fb.a.a(c0VarA, c1086gP);
                    org.koin.core.scope.a aVarA2 = KoinApplicationKt.a(c1086gP);
                    c1086gP.e(-1614864554);
                    Y yA = Gb.a.a(l.a(EmailVerificationViewModel.class), c0VarA.getViewModelStore(), null, aVarA, null, aVarA2, null);
                    c1086gP.T(false);
                    c1086gP.T(false);
                    i13 = i12 & (-113);
                    emailVerificationViewModel2 = (EmailVerificationViewModel) yA;
                }
                c1086gP.U();
                E.d(new EmailVerificationConfirmationScreenKt$EmailVerificationConfirmationScreen$1(emailVerificationViewModel2, onComplete, null), c1086gP, "completeCallback");
                c1085f0 = emailVerificationViewModel2.f32941t;
                b(email, ((a) c1085f0.getValue()).f32949b, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.emailVerification.EmailVerificationConfirmationScreenKt$EmailVerificationConfirmationScreen$2
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        K8.i.a.a(emailVerificationViewModel2.f32939r, null, 3);
                        return r.f47939a;
                    }
                }, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.emailVerification.EmailVerificationConfirmationScreenKt$EmailVerificationConfirmationScreen$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        emailVerificationViewModel2.d(email);
                        return r.f47939a;
                    }
                }, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.emailVerification.EmailVerificationConfirmationScreenKt$EmailVerificationConfirmationScreen$4
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        EmailVerificationViewModel emailVerificationViewModel4 = emailVerificationViewModel2;
                        emailVerificationViewModel4.getClass();
                        C2680e.c(Z.a(emailVerificationViewModel4), emailVerificationViewModel4.f32112a, null, new EmailVerificationViewModel$onConfirmationNextClick$1(emailVerificationViewModel4, null), 2);
                        return r.f47939a;
                    }
                }, c1086gP, i13 & 14);
                if (((a) c1085f0.getValue()).f32951d) {
                    preloaderState = PreloaderState.c.f32642a;
                } else {
                    preloaderState = PreloaderState.d.f32643a;
                }
                LoaderDialogKt.a(preloaderState, c1086gP, 0);
                if (((a) c1085f0.getValue()).f32952e != TryAgainAction.f32944b) {
                    CheckNetworkDialogKt.a(new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.emailVerification.EmailVerificationConfirmationScreenKt$EmailVerificationConfirmationScreen$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            emailVerificationViewModel2.e(c1085f0.getValue().f32952e);
                            return r.f47939a;
                        }
                    }, onQuit, c1086gP, (i13 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                }
                emailVerificationViewModel3 = emailVerificationViewModel2;
            } else {
                c1086gP.w();
                if (i14 != 0) {
                    i12 &= -113;
                }
            }
            emailVerificationViewModel2 = emailVerificationViewModel;
            i13 = i12;
            c1086gP.U();
            E.d(new EmailVerificationConfirmationScreenKt$EmailVerificationConfirmationScreen$1(emailVerificationViewModel2, onComplete, null), c1086gP, "completeCallback");
            c1085f0 = emailVerificationViewModel2.f32941t;
            b(email, ((a) c1085f0.getValue()).f32949b, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.emailVerification.EmailVerificationConfirmationScreenKt$EmailVerificationConfirmationScreen$2
                {
                    super(0);
                }

                @Override // Ia.a
                public final r invoke() {
                    K8.i.a.a(emailVerificationViewModel2.f32939r, null, 3);
                    return r.f47939a;
                }
            }, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.emailVerification.EmailVerificationConfirmationScreenKt$EmailVerificationConfirmationScreen$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final r invoke() {
                    emailVerificationViewModel2.d(email);
                    return r.f47939a;
                }
            }, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.emailVerification.EmailVerificationConfirmationScreenKt$EmailVerificationConfirmationScreen$4
                {
                    super(0);
                }

                @Override // Ia.a
                public final r invoke() {
                    EmailVerificationViewModel emailVerificationViewModel4 = emailVerificationViewModel2;
                    emailVerificationViewModel4.getClass();
                    C2680e.c(Z.a(emailVerificationViewModel4), emailVerificationViewModel4.f32112a, null, new EmailVerificationViewModel$onConfirmationNextClick$1(emailVerificationViewModel4, null), 2);
                    return r.f47939a;
                }
            }, c1086gP, i13 & 14);
            if (((a) c1085f0.getValue()).f32951d) {
                preloaderState = PreloaderState.c.f32642a;
            } else {
                preloaderState = PreloaderState.d.f32643a;
            }
            LoaderDialogKt.a(preloaderState, c1086gP, 0);
            if (((a) c1085f0.getValue()).f32952e != TryAgainAction.f32944b) {
                CheckNetworkDialogKt.a(new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.emailVerification.EmailVerificationConfirmationScreenKt$EmailVerificationConfirmationScreen$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        emailVerificationViewModel2.e(c1085f0.getValue().f32952e);
                        return r.f47939a;
                    }
                }, onQuit, c1086gP, (i13 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            }
            emailVerificationViewModel3 = emailVerificationViewModel2;
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.emailVerification.EmailVerificationConfirmationScreenKt$EmailVerificationConfirmationScreen$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    EmailVerificationConfirmationScreenKt.a(email, emailVerificationViewModel3, onQuit, onComplete, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return r.f47939a;
                }
            };
        }
    }

    public static final void b(final String str, final Integer num, final Ia.a<r> aVar, final Ia.a<r> aVar2, final Ia.a<r> aVar3, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(853216835);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.K(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= c1086gP.K(num) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c1086gP.k(aVar) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= c1086gP.k(aVar2) ? 2048 : 1024;
        }
        if ((i10 & 57344) == 0) {
            i11 |= c1086gP.k(aVar3) ? 16384 : 8192;
        }
        if ((46811 & i11) == 9362 && c1086gP.s()) {
            c1086gP.w();
        } else {
            f.a aVar4 = d.a.f13347n;
            h.a aVar5 = h.a.f13984b;
            float f10 = 16;
            h hVarB = ScrollKt.b(PaddingKt.h(aVar5, f10, 0.0f, 2).i(W.f10226c), ScrollKt.a(0, c1086gP, 0, 1), false, 14);
            C0953m c0953mA = C0952l.a(C0945e.f10286c, aVar4, c1086gP, 48);
            int i12 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            h hVarC = ComposedModifierKt.c(c1086gP, hVarB);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar6 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar6);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
            p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i12))) {
                J4.i.d(i12, c1086gP, i12, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
            C0955o c0955o = C0955o.f10310a;
            Lb.a.a(c1086gP, W.e(aVar5, 14));
            com.voltasit.obdeleven.presentation.components.a.a(c0955o.b(aVar5, aVar4), com.voltasit.obdeleven.R.drawable.ic_mail, 48, c1086gP, 0);
            float f11 = 28;
            String strC = n.c(aVar5, f11, c1086gP, com.voltasit.obdeleven.R.string.view_email_verification_confirmation_message, c1086gP);
            long jG = G0.a.g(20);
            androidx.compose.ui.text.font.l lVar = androidx.compose.ui.text.font.l.f15442g;
            O0 o10 = ColorsKt.f11693a;
            TextKt.b(strC, null, ((C1034j) c1086gP.x(o10)).d(), jG, null, lVar, null, 0L, null, new g(3), 0L, 0, false, 0, 0, null, null, c1086gP, 199680, 0, 130514);
            TextKt.b(s.b(n.c(aVar5, f11, c1086gP, com.voltasit.obdeleven.R.string.view_email_verification_confirmation_email_sent, c1086gP), ":"), null, ((C1034j) c1086gP.x(o10)).d(), G0.a.g(16), null, androidx.compose.ui.text.font.l.f15443h, null, 0L, null, new g(3), 0L, 0, false, 0, 0, null, null, c1086gP, 199680, 0, 130514);
            TextKt.b(str, null, e.a.f32291o, G0.a.g(16), null, null, null, 0L, null, new g(3), 0L, 0, false, 0, 0, null, null, c1086gP, (i11 & 14) | 3456, 0, 130546);
            TextKt.b(n.c(aVar5, f10, c1086gP, com.voltasit.obdeleven.R.string.common_edit_email, c1086gP), ClickableKt.c(c0955o.b(aVar5, aVar4), false, null, aVar, 7), e.a.f32284g, G0.a.g(14), null, lVar, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 200064, 0, 131024);
            Lb.a.a(c1086gP, c0955o.a(true));
            c1086gP.L(-1116388025);
            if (num != null) {
                TextKt.b(o.p(c1086gP, num.intValue()), PaddingKt.j(aVar5, f10, 0.0f, 0.0f, 0.0f, 14), ((C1034j) c1086gP.x(o10)).b(), G0.a.g(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3120, 0, 131056);
            }
            c1086gP.T(false);
            Lb.a.a(c1086gP, W.e(aVar5, f10));
            com.voltasit.obdeleven.presentation.components.b.a(((i11 << 3) & 57344) | 384, 40, e.a.f32287k, aVar2, c1086gP, W.d(c0955o.b(aVar5, aVar4), 1.0f), o.p(c1086gP, com.voltasit.obdeleven.R.string.view_email_verification_resend), false, false);
            com.voltasit.obdeleven.presentation.components.b.a((i11 & 57344) | 384, 40, e.a.j, aVar3, c1086gP, W.d(c0955o.b(aVar5, aVar4), 1.0f), n.c(aVar5, f10, c1086gP, com.voltasit.obdeleven.R.string.common_next, c1086gP), false, false);
            Lb.a.a(c1086gP, W.e(aVar5, f10));
            c1086gP.T(true);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.emailVerification.EmailVerificationConfirmationScreenKt$EmailVerificationConfirmationScreen$8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num2) {
                    num2.intValue();
                    EmailVerificationConfirmationScreenKt.b(str, num, aVar, aVar2, aVar3, interfaceC1084f2, L4.b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }
}
