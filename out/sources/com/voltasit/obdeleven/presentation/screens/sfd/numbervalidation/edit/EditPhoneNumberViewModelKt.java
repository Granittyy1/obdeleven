package com.voltasit.obdeleven.presentation.screens.sfd.numbervalidation.edit;

import G8.C0705g;
import G8.G;
import Ia.p;
import J4.n;
import S4.o;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.W;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.X;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.d;
import androidx.compose.ui.h;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.lifecycle.Y;
import androidx.lifecycle.c0;
import com.voltasit.obdeleven.presentation.components.c;
import com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import me.zhanghai.android.materialprogressbar.R;
import org.koin.compose.KoinApplicationKt;
import p014b1.a;
import p027c1.b;
import p293xa.r;

/* JADX INFO: compiled from: EditPhoneNumberScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class EditPhoneNumberViewModelKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(InterfaceC1084f interfaceC1084f, final int i10) {
        C1086g c1086gP = interfaceC1084f.p(-29441091);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            c1086gP.e(667488325);
            c0 c0VarA = b.a(c1086gP);
            if (c0VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            a aVarA = Fb.a.a(c0VarA, c1086gP);
            org.koin.core.scope.a aVarA2 = KoinApplicationKt.a(c1086gP);
            c1086gP.e(-1614864554);
            Y yA = Gb.a.a(l.a(EditPhoneNumberViewModel.class), c0VarA.getViewModelStore(), null, aVarA, null, aVarA2, null);
            c1086gP.T(false);
            c1086gP.T(false);
            EditPhoneNumberViewModel editPhoneNumberViewModel = (EditPhoneNumberViewModel) yA;
            G g10 = (G) editPhoneNumberViewModel.f33076d.getValue();
            b(g10.f3420d, g10.f3421e, new EditPhoneNumberViewModelKt$EditPhoneNumberScreen$1(1, editPhoneNumberViewModel, EditPhoneNumberViewModel.class, "onPhoneNumberChange", "onPhoneNumberChange(Ljava/lang/String;)V", 0), (Integer) editPhoneNumberViewModel.f33077e.getValue(), new EditPhoneNumberViewModelKt$EditPhoneNumberScreen$2(1, editPhoneNumberViewModel, EditPhoneNumberViewModel.class, "onPhoneCodeSelected", "onPhoneCodeSelected(Lcom/voltasit/obdeleven/domain/models/Country;)V", 0), new EditPhoneNumberViewModelKt$EditPhoneNumberScreen$3(0, editPhoneNumberViewModel, EditPhoneNumberViewModel.class, "onNextClick", "onNextClick()Lkotlinx/coroutines/Job;", 8), c1086gP, 0);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.numbervalidation.edit.EditPhoneNumberViewModelKt$EditPhoneNumberScreen$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    EditPhoneNumberViewModelKt.a(interfaceC1084f2, L4.b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final String str, final String str2, final Ia.l<? super String, r> lVar, final Integer num, final Ia.l<? super C0705g, r> lVar2, final Ia.a<r> aVar, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(-2039363422);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.K(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= c1086gP.K(str2) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c1086gP.k(lVar) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= c1086gP.K(num) ? 2048 : 1024;
        }
        if ((i10 & 57344) == 0) {
            i11 |= c1086gP.k(lVar2) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= c1086gP.k(aVar) ? 131072 : 65536;
        }
        if ((374491 & i11) == 74898 && c1086gP.s()) {
            c1086gP.w();
        } else {
            h.a aVar2 = h.a.f13984b;
            C0953m c0953mA = C0952l.a(C0945e.f10286c, d.a.f13346m, c1086gP, 0);
            int i12 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            h hVarC = ComposedModifierKt.c(c1086gP, aVar2);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar3);
            } else {
                c1086gP.A();
            }
            p<ComposeUiNode, E, r> pVar = ComposeUiNode.Companion.f14337f;
            R0.a(pVar, c1086gP, c0953mA);
            p<ComposeUiNode, androidx.compose.runtime.r, r> pVar2 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar2, c1086gP, interfaceC1089h0P);
            p<ComposeUiNode, Integer, r> pVar3 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i12))) {
                J4.i.d(i12, c1086gP, i12, pVar3);
            }
            p<ComposeUiNode, h, r> pVar4 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar4, c1086gP, hVarC);
            c1086gP.L(-673971425);
            Object objF = c1086gP.f();
            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
            if (objF == c0153a) {
                objF = J0.f(Boolean.FALSE);
                c1086gP.E(objF);
            }
            final X x10 = (X) objF;
            c1086gP.T(false);
            c1086gP.L(-673971385);
            if (((Boolean) x10.getValue()).booleanValue()) {
                c1086gP.L(-673971278);
                Object objF2 = c1086gP.f();
                if (objF2 == c0153a) {
                    objF2 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.numbervalidation.edit.EditPhoneNumberViewModelKt$EditPhoneNumberScreen$5$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            x10.setValue(Boolean.FALSE);
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF2);
                }
                Ia.a aVar4 = (Ia.a) objF2;
                c1086gP.T(false);
                c1086gP.L(-673971205);
                boolean z10 = (i11 & 57344) == 16384;
                Object objF3 = c1086gP.f();
                if (z10 || objF3 == c0153a) {
                    objF3 = new Ia.l<C0705g, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.numbervalidation.edit.EditPhoneNumberViewModelKt$EditPhoneNumberScreen$5$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(C0705g c0705g) {
                            C0705g it = c0705g;
                            i.e(it, "it");
                            x10.setValue(Boolean.FALSE);
                            lVar2.invoke(it);
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF3);
                }
                c1086gP.T(false);
                SfdPersonalInfoFormScreenKt.e(aVar4, (Ia.l) objF3, c1086gP, 6);
            }
            c1086gP.T(false);
            Lb.a.a(c1086gP, W.e(aVar2, 32));
            float f10 = 16;
            h hVarH = PaddingKt.h(aVar2, f10, 0.0f, 2);
            T tA = S.a(C0945e.f10284a, d.a.j, c1086gP, 0);
            int i13 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
            h hVarC2 = ComposedModifierKt.c(c1086gP, hVarH);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar3);
            } else {
                c1086gP.A();
            }
            R0.a(pVar, c1086gP, tA);
            R0.a(pVar2, c1086gP, interfaceC1089h0P2);
            if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i13))) {
                J4.i.d(i13, c1086gP, i13, pVar3);
            }
            R0.a(pVar4, c1086gP, hVarC2);
            c1086gP.L(1878616554);
            Object objF4 = c1086gP.f();
            if (objF4 == c0153a) {
                objF4 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.numbervalidation.edit.EditPhoneNumberViewModelKt$EditPhoneNumberScreen$5$3$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        x10.setValue(Boolean.TRUE);
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF4);
            }
            c1086gP.T(false);
            SfdPersonalInfoFormScreenKt.f(str, (Ia.a) objF4, c1086gP, (i11 & 14) | 48);
            c1086gP.L(1878616716);
            boolean z11 = (i11 & 896) == 256;
            Object objF5 = c1086gP.f();
            if (z11 || objF5 == c0153a) {
                objF5 = new Ia.l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.numbervalidation.edit.EditPhoneNumberViewModelKt$EditPhoneNumberScreen$5$3$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(String str3) {
                        String it = str3;
                        i.e(it, "it");
                        lVar.invoke(it);
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF5);
            }
            c1086gP.T(false);
            int i14 = i11 >> 3;
            int i15 = (i14 & 14) | 3072 | (i14 & 896);
            int i16 = i14 & 57344;
            SfdPersonalInfoFormScreenKt.g(str2, (Ia.l) objF5, num, aVar2, aVar, c1086gP, i15 | i16);
            c1086gP.T(true);
            c.a(PaddingKt.h(aVar2, f10, 0.0f, 2), n.c(aVar2, 24, c1086gP, com.voltasit.obdeleven.R.string.view_number_edit_info, c1086gP), c1086gP, 48, 0);
            if (1.0f <= 0.0d) {
                p258v.a.a("invalid weight; must be greater than zero");
            }
            Lb.a.a(c1086gP, new LayoutWeightElement(true, Na.l.z(1.0f, Float.MAX_VALUE)));
            com.voltasit.obdeleven.presentation.components.b.a(i16, 44, 0L, aVar, c1086gP, W.d(PaddingKt.h(new HorizontalAlignElement(d.a.f13347n), f10, 0.0f, 2), 1.0f), o.p(c1086gP, com.voltasit.obdeleven.R.string.common_next), false, false);
            Lb.a.a(c1086gP, W.e(aVar2, f10));
            c1086gP.T(true);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.numbervalidation.edit.EditPhoneNumberViewModelKt$EditPhoneNumberScreen$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num2) {
                    num2.intValue();
                    EditPhoneNumberViewModelKt.b(str, str2, lVar, num, lVar2, aVar, interfaceC1084f2, L4.b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }
}
