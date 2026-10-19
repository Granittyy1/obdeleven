package com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo;

import G8.C0707i;
import G8.G;
import Ia.l;
import Ia.p;
import S4.o;
import android.content.Context;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.C0955o;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.W;
import androidx.compose.material.C1034j;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.I;
import androidx.compose.material.TextKt;
import androidx.compose.material.TypographyKt;
import androidx.compose.material.V;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.E;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.X;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.d;
import androidx.compose.ui.h;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.style.g;
import androidx.lifecycle.D;
import androidx.lifecycle.InterfaceC1376t;
import androidx.lifecycle.Y;
import androidx.lifecycle.Z;
import androidx.lifecycle.c0;
import com.voltasit.obdeleven.domain.models.Screen;
import com.voltasit.obdeleven.presentation.components.TitleTextKt;
import com.voltasit.obdeleven.presentation.dialogs.LoaderDialogKt;
import com.voltasit.obdeleven.presentation.dialogs.checkNetwork.CheckNetworkDialogKt;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import java.util.Arrays;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.i;
import kotlin.text.n;
import kotlinx.coroutines.C2680e;
import me.zhanghai.android.materialprogressbar.R;
import org.koin.compose.KoinApplicationKt;
import p293xa.e;
import p293xa.r;

/* JADX INFO: compiled from: PersonalInformationUpdate.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class PersonalInformationUpdateKt {

    /* JADX INFO: compiled from: PersonalInformationUpdate.kt */
    public static final class a implements D, f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f32966b;

        public a(l lVar) {
            this.f32966b = lVar;
        }

        @Override // kotlin.jvm.internal.f
        public final e<?> b() {
            return this.f32966b;
        }

        @Override // androidx.lifecycle.D
        public final /* synthetic */ void d(Object obj) {
            this.f32966b.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof D) || !(obj instanceof f)) {
                return false;
            }
            return this.f32966b.equals(((f) obj).b());
        }

        public final int hashCode() {
            return this.f32966b.hashCode();
        }
    }

    public static final void a(final String str, final String str2, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(297584341);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.K(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= c1086gP.K(str2) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && c1086gP.s()) {
            c1086gP.w();
        } else {
            String str3 = n.S(str2) ? "-" : str2;
            h.a aVar = h.a.f13984b;
            T tA = S.a(C0945e.f10284a, d.a.j, c1086gP, 0);
            int i12 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            h hVarC = ComposedModifierKt.c(c1086gP, aVar);
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
            p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i12))) {
                J4.i.d(i12, c1086gP, i12, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
            androidx.compose.ui.text.font.l lVar = androidx.compose.ui.text.font.l.f15443h;
            TextKt.b(str + ": ", null, com.voltasit.obdeleven.presentation.e.a.f32298v, 0L, null, lVar, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 196992, 0, 131034);
            TextKt.b(str3, null, ((C1034j) c1086gP.x(ColorsKt.f11693a)).d(), 0L, null, lVar, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 196608, 0, 131034);
            c1086gP.T(true);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateKt$InfoRow$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    PersonalInformationUpdateKt.a(str, str2, interfaceC1084f2, L4.b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }

    public static final void b(final b bVar, InterfaceC1084f interfaceC1084f, final int i10) {
        C1086g c1086gP = interfaceC1084f.p(397075411);
        a(o.p(c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_first_name), bVar.f32977a.f3417a, c1086gP, 0);
        String strP = o.p(c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_last_name);
        G g10 = bVar.f32977a;
        a(strP, g10.f3418b, c1086gP, 0);
        a(o.p(c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_country), bVar.f32978b, c1086gP, 0);
        a(o.p(c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_mobile_number), "(" + g10.f3420d + ") " + g10.f3421e, c1086gP, 0);
        a(o.p(c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_workshop_number), g10.f3423g, c1086gP, 0);
        a(o.p(c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_workshop_address), g10.f3424h, c1086gP, 0);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateKt$PersonalInfo$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    PersonalInformationUpdateKt.b(bVar, interfaceC1084f2, L4.b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x013c  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(InterfaceC1376t interfaceC1376t, c cVar, final Ia.a<r> onCheckNetworkCancelClick, final l<? super Integer, r> onNegativeAlert, final Ia.a<r> onPersonalInfoSave, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        final InterfaceC1376t interfaceC1376t2;
        int i12;
        final c cVar2;
        C1085f0 c1085f0;
        i.e(onCheckNetworkCancelClick, "onCheckNetworkCancelClick");
        i.e(onNegativeAlert, "onNegativeAlert");
        i.e(onPersonalInfoSave, "onPersonalInfoSave");
        C1086g c1086gP = interfaceC1084f.p(-544209451);
        int i13 = i11 & 1;
        int i14 = i13 != 0 ? i10 | 2 : i10;
        int i15 = i11 & 2;
        if (i15 != 0) {
            i14 |= 16;
        }
        if ((i11 & 4) != 0) {
            i14 |= 384;
        } else if ((i10 & 896) == 0) {
            i14 |= c1086gP.k(onCheckNetworkCancelClick) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i14 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i14 |= c1086gP.k(onNegativeAlert) ? 2048 : 1024;
        }
        if ((i11 & 16) != 0) {
            i14 |= 24576;
        } else if ((57344 & i10) == 0) {
            i14 |= c1086gP.k(onPersonalInfoSave) ? 16384 : 8192;
        }
        if ((i11 & 3) == 3 && (46811 & i14) == 9362 && c1086gP.s()) {
            c1086gP.w();
            interfaceC1376t2 = interfaceC1376t;
            cVar2 = cVar;
        } else {
            c1086gP.r0();
            if ((i10 & 1) == 0 || c1086gP.a0()) {
                if (i13 != 0) {
                    interfaceC1376t2 = (InterfaceC1376t) c1086gP.x(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    i14 &= -15;
                } else {
                    interfaceC1376t2 = interfaceC1376t;
                }
                if (i15 != 0) {
                    c1086gP.e(667488325);
                    c0 c0VarA = p027c1.b.a(c1086gP);
                    if (c0VarA == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    p014b1.a aVarA = Fb.a.a(c0VarA, c1086gP);
                    org.koin.core.scope.a aVarA2 = KoinApplicationKt.a(c1086gP);
                    c1086gP.e(-1614864554);
                    Y yA = Gb.a.a(kotlin.jvm.internal.l.a(c.class), c0VarA.getViewModelStore(), null, aVarA, null, aVarA2, null);
                    c1086gP.T(false);
                    c1086gP.T(false);
                    i12 = i14 & (-113);
                    cVar2 = (c) yA;
                }
                c1086gP.U();
                E.d(new PersonalInformationUpdateKt$PersonalInformationUpdateScreen$1(cVar2, interfaceC1376t2, onPersonalInfoSave, onNegativeAlert, null), c1086gP, Boolean.TRUE);
                X xA = androidx.compose.runtime.livedata.b.a(cVar2.f32114c, PreloaderState.d.f32643a, c1086gP);
                c1086gP.L(174420255);
                c1085f0 = cVar2.f32990w;
                if (((b) c1085f0.getValue()).f32981e) {
                    CheckNetworkDialogKt.a(new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateKt$PersonalInformationUpdateScreen$2
                        {
                            super(0);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // Ia.a
                        public final r invoke() {
                            c cVar3 = cVar2;
                            C1085f0 c1085f1 = cVar3.f32989v;
                            c1085f1.setValue(b.a((b) c1085f1.getValue(), null, null, false, null, false, 15));
                            C2680e.c(Z.a(cVar3), null, null, new PersonalInformationUpdateViewModel$loadData$1(cVar3, null), 3);
                            return r.f47939a;
                        }
                    }, onCheckNetworkCancelClick, c1086gP, (i12 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                }
                c1086gP.T(false);
                LoaderDialogKt.a((PreloaderState) xA.getValue(), c1086gP, 0);
                d((b) c1085f0.getValue(), new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateKt$PersonalInformationUpdateScreen$3
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        c cVar3 = cVar2;
                        cVar3.getClass();
                        C2680e.c(Z.a(cVar3), null, null, new PersonalInformationUpdateViewModel$onThatsCorrectClick$1(cVar3, null), 3);
                        return r.f47939a;
                    }
                }, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateKt$PersonalInformationUpdateScreen$4
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        c cVar3 = cVar2;
                        cVar3.getClass();
                        cVar3.f32983p.a(new C0707i(Screen.SfdPersonalInfoForm, null, false, null, 14));
                        return r.f47939a;
                    }
                }, c1086gP, 8);
            } else {
                c1086gP.w();
                if (i13 != 0) {
                    i14 &= -15;
                }
                if (i15 != 0) {
                    i14 &= -113;
                }
                interfaceC1376t2 = interfaceC1376t;
            }
            i12 = i14;
            cVar2 = cVar;
            c1086gP.U();
            E.d(new PersonalInformationUpdateKt$PersonalInformationUpdateScreen$1(cVar2, interfaceC1376t2, onPersonalInfoSave, onNegativeAlert, null), c1086gP, Boolean.TRUE);
            X xA2 = androidx.compose.runtime.livedata.b.a(cVar2.f32114c, PreloaderState.d.f32643a, c1086gP);
            c1086gP.L(174420255);
            c1085f0 = cVar2.f32990w;
            if (((b) c1085f0.getValue()).f32981e) {
                CheckNetworkDialogKt.a(new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateKt$PersonalInformationUpdateScreen$2
                    {
                        super(0);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // Ia.a
                    public final r invoke() {
                        c cVar3 = cVar2;
                        C1085f0 c1085f1 = cVar3.f32989v;
                        c1085f1.setValue(b.a((b) c1085f1.getValue(), null, null, false, null, false, 15));
                        C2680e.c(Z.a(cVar3), null, null, new PersonalInformationUpdateViewModel$loadData$1(cVar3, null), 3);
                        return r.f47939a;
                    }
                }, onCheckNetworkCancelClick, c1086gP, (i12 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            }
            c1086gP.T(false);
            LoaderDialogKt.a((PreloaderState) xA2.getValue(), c1086gP, 0);
            d((b) c1085f0.getValue(), new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateKt$PersonalInformationUpdateScreen$3
                {
                    super(0);
                }

                @Override // Ia.a
                public final r invoke() {
                    c cVar3 = cVar2;
                    cVar3.getClass();
                    C2680e.c(Z.a(cVar3), null, null, new PersonalInformationUpdateViewModel$onThatsCorrectClick$1(cVar3, null), 3);
                    return r.f47939a;
                }
            }, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateKt$PersonalInformationUpdateScreen$4
                {
                    super(0);
                }

                @Override // Ia.a
                public final r invoke() {
                    c cVar3 = cVar2;
                    cVar3.getClass();
                    cVar3.f32983p.a(new C0707i(Screen.SfdPersonalInfoForm, null, false, null, 14));
                    return r.f47939a;
                }
            }, c1086gP, 8);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateKt$PersonalInformationUpdateScreen$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    PersonalInformationUpdateKt.c(interfaceC1376t2, cVar2, onCheckNetworkCancelClick, onNegativeAlert, onPersonalInfoSave, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0270 A[PHI: r0
      0x0270: PHI (r0v11 Ia.a<xa.r>) = (r0v9 Ia.a<xa.r>), (r0v12 Ia.a<xa.r>) binds: [B:45:0x026e, B:41:0x0267] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x027d  */
    /* JADX WARN: Code duplicated, block: B:55:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    public static final void d(final b state, final Ia.a<r> onThatsCorrectClick, final Ia.a<r> onEditClicked, InterfaceC1084f interfaceC1084f, final int i10) {
        final Ia.a<r> aVar;
        boolean z10;
        Object objF;
        C1105p0 c1105p0V;
        i.e(state, "state");
        i.e(onThatsCorrectClick, "onThatsCorrectClick");
        i.e(onEditClicked, "onEditClicked");
        C1086g c1086gP = interfaceC1084f.p(-106185006);
        c1086gP.L(174420848);
        boolean z11 = state.f32979c;
        h.a aVar2 = h.a.f13984b;
        if (z11) {
            h hVarD = W.d(aVar2, 1.0f);
            T tA = S.a(C0945e.f10288e, d.a.j, c1086gP, 54);
            int i11 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            h hVarC = ComposedModifierKt.c(c1086gP, hVarD);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar3);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
            p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i11))) {
                J4.i.d(i11, c1086gP, i11, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
            I.a(PaddingKt.f(aVar2, 22), ((C1034j) c1086gP.x(ColorsKt.f11693a)).d(), 0.0f, 0L, 0, 6, c1086gP, 28);
            C1105p0 c1105p0A = C4.a.a(c1086gP, true, false);
            if (c1105p0A != null) {
                c1105p0A.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateKt$PersonalInformationUpdateScreen$7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        PersonalInformationUpdateKt.d(state, onThatsCorrectClick, onEditClicked, interfaceC1084f2, L4.b.l(i10 | 1));
                        return r.f47939a;
                    }
                };
                return;
            }
            return;
        }
        c1086gP.T(false);
        float f10 = 16;
        h hVarB = ScrollKt.b(W.c(PaddingKt.h(aVar2, f10, 0.0f, 2), 1.0f), ScrollKt.a(0, c1086gP, 0, 1), false, 14);
        androidx.compose.ui.f.a aVar4 = d.a.f13347n;
        C0953m c0953mA = C0952l.a(C0945e.f10286c, aVar4, c1086gP, 48);
        int i12 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
        h hVarC2 = ComposedModifierKt.c(c1086gP, hVarB);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar5 = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar5);
        } else {
            c1086gP.A();
        }
        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA);
        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P2);
        p<ComposeUiNode, Integer, r> pVar2 = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i12))) {
            J4.i.d(i12, c1086gP, i12, pVar2);
        }
        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
        C0955o c0955o = C0955o.f10310a;
        ImageKt.a(U.c.a(com.voltasit.obdeleven.R.drawable.ic_obdeleven, c1086gP, 6), "", null, null, null, 0.0f, null, c1086gP, 56, R.styleable.AppCompatTheme_windowMinWidthMajor);
        float f11 = 30;
        TitleTextKt.a(J4.n.c(aVar2, f11, c1086gP, com.voltasit.obdeleven.R.string.common_personal_information_update, c1086gP), c1086gP, 0);
        Lb.a.a(c1086gP, W.e(aVar2, f11));
        Object[] objArr = {state.f32980d};
        c1086gP.x(AndroidCompositionLocals_androidKt.f14792a);
        TextKt.b(((Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b)).getResources().getString(com.voltasit.obdeleven.R.string.view_regular_personal_info_update_description, Arrays.copyOf(objArr, 1)), null, com.voltasit.obdeleven.presentation.e.a.f32283f, 0L, null, null, null, 0L, null, new g(3), 0L, 0, false, 0, 0, null, ((V) c1086gP.x(TypographyKt.f11864b)).f11872g, c1086gP, 384, 0, 65018);
        Lb.a.a(c1086gP, W.e(aVar2, f11));
        b(state, c1086gP, 8);
        Lb.a.a(c1086gP, c0955o.a(true));
        String strP = o.p(c1086gP, com.voltasit.obdeleven.R.string.common_edit);
        h hVarD2 = W.d(c0955o.b(aVar2, aVar4), 1.0f);
        c1086gP.L(-265547447);
        boolean z12 = (((i10 & 896) ^ 384) > 256 && c1086gP.K(onEditClicked)) || (i10 & 384) == 256;
        Object objF2 = c1086gP.f();
        InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
        if (z12 || objF2 == c0153a) {
            objF2 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateKt$PersonalInformationUpdateScreen$8$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final r invoke() {
                    onEditClicked.invoke();
                    return r.f47939a;
                }
            };
            c1086gP.E(objF2);
        }
        c1086gP.T(false);
        com.voltasit.obdeleven.presentation.components.b.a(0, 44, 0L, (Ia.a) objF2, c1086gP, hVarD2, strP, false, false);
        String strC = J4.n.c(aVar2, 10, c1086gP, com.voltasit.obdeleven.R.string.common_thats_correct, c1086gP);
        h hVarD3 = W.d(c0955o.b(aVar2, aVar4), 1.0f);
        long j = com.voltasit.obdeleven.presentation.e.a.f32287k;
        c1086gP.L(-265547076);
        if (((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) > 32) {
            aVar = onThatsCorrectClick;
            if (c1086gP.K(aVar)) {
                z10 = true;
            }
            objF = c1086gP.f();
            if (z10 || objF == c0153a) {
                objF = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateKt$PersonalInformationUpdateScreen$8$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        aVar.invoke();
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            com.voltasit.obdeleven.presentation.components.b.a(384, 40, j, (Ia.a) objF, c1086gP, hVarD3, strC, false, false);
            Lb.a.a(c1086gP, W.e(aVar2, f10));
            c1086gP.T(true);
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateKt$PersonalInformationUpdateScreen$9
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        PersonalInformationUpdateKt.d(state, aVar, onEditClicked, interfaceC1084f2, L4.b.l(i10 | 1));
                        return r.f47939a;
                    }
                };
            }
        }
        aVar = onThatsCorrectClick;
        if ((i10 & 48) == 32) {
            z10 = true;
        } else {
            z10 = false;
        }
        objF = c1086gP.f();
        if (z10) {
            objF = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateKt$PersonalInformationUpdateScreen$8$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final r invoke() {
                    aVar.invoke();
                    return r.f47939a;
                }
            };
            c1086gP.E(objF);
        } else {
            objF = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateKt$PersonalInformationUpdateScreen$8$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final r invoke() {
                    aVar.invoke();
                    return r.f47939a;
                }
            };
            c1086gP.E(objF);
        }
        c1086gP.T(false);
        com.voltasit.obdeleven.presentation.components.b.a(384, 40, j, (Ia.a) objF, c1086gP, hVarD3, strC, false, false);
        Lb.a.a(c1086gP, W.e(aVar2, f10));
        c1086gP.T(true);
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateKt$PersonalInformationUpdateScreen$9
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    PersonalInformationUpdateKt.d(state, aVar, onEditClicked, interfaceC1084f2, L4.b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }
}
