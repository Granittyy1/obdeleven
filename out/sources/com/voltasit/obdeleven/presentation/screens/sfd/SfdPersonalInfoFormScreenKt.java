package com.voltasit.obdeleven.presentation.screens.sfd;

import G8.C0705g;
import G8.G;
import Ia.l;
import Ia.p;
import Ia.q;
import L4.b;
import S4.o;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0949i;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.C0955o;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.U;
import androidx.compose.foundation.layout.W;
import androidx.compose.foundation.text.InterfaceC1000i;
import androidx.compose.foundation.text.j;
import androidx.compose.foundation.text.k;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.C1034j;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.ContentAlphaKt;
import androidx.compose.material.ContentColorKt;
import androidx.compose.material.I;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextFieldDefaults;
import androidx.compose.material.TextFieldKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.O0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.X;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.d;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.n;
import androidx.compose.ui.focus.u;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.m0;
import androidx.compose.ui.graphics.vector.c;
import androidx.compose.ui.h;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.M0;
import androidx.lifecycle.D;
import androidx.lifecycle.InterfaceC1376t;
import androidx.lifecycle.Y;
import androidx.lifecycle.Z;
import androidx.lifecycle.c0;
import com.voltasit.obdeleven.presentation.components.InformativeTextKt;
import com.voltasit.obdeleven.presentation.components.TextInputKt;
import com.voltasit.obdeleven.presentation.dialogs.LoaderDialogKt;
import com.voltasit.obdeleven.presentation.dialogs.checkNetwork.CheckNetworkDialogKt;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import com.voltasit.obdeleven.presentation.screens.profile.personalInfo.EditPersonalInfoViewModel;
import com.voltasit.obdeleven.presentation.screens.sfd.countrySelectionDialog.CountrySelectionDialogKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C2680e;
import me.zhanghai.android.materialprogressbar.R;
import org.koin.compose.KoinApplicationKt;
import p293xa.e;
import p293xa.r;
import p306z.g;

/* JADX INFO: compiled from: SfdPersonalInfoFormScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SfdPersonalInfoFormScreenKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f33013a = 4;

    /* JADX INFO: compiled from: SfdPersonalInfoFormScreen.kt */
    public static final class a implements D, f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f33017b;

        public a(l lVar) {
            this.f33017b = lVar;
        }

        @Override // kotlin.jvm.internal.f
        public final e<?> b() {
            return this.f33017b;
        }

        @Override // androidx.lifecycle.D
        public final /* synthetic */ void d(Object obj) {
            this.f33017b.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof D) || !(obj instanceof f)) {
                return false;
            }
            return this.f33017b.equals(((f) obj).b());
        }

        public final int hashCode() {
            return this.f33017b.hashCode();
        }
    }

    public static final void a(final String str, final Ia.a<r> aVar, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086g;
        C1086g c1086gP = interfaceC1084f.p(600172857);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.K(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= c1086gP.k(aVar) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && c1086gP.s()) {
            c1086gP.w();
            c1086g = c1086gP;
        } else {
            h.a aVar2 = h.a.f13984b;
            c1086gP.L(-1569327914);
            boolean z10 = (i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32;
            Object objF = c1086gP.f();
            if (z10 || objF == InterfaceC1084f.a.f12980a) {
                objF = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$CountryInput$1$1
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
            h hVarC = ClickableKt.c(aVar2, false, null, (Ia.a) objF, 7);
            E eD = BoxKt.d(d.a.f13335a, false);
            int i12 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            h hVarC2 = ComposedModifierKt.c(c1086gP, hVarC);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar3);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
            p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i12))) {
                J4.i.d(i12, c1086gP, i12, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
            C0949i c0949i = C0949i.f10304a;
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11834a;
            long j = H.f13503k;
            long jC = ((C1034j) c1086gP.x(ColorsKt.f11693a)).c();
            long j10 = com.voltasit.obdeleven.presentation.e.a.f32283f;
            TextFieldKt.a(str, new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$CountryInput$2$1
                @Override // Ia.l
                public final r invoke(String str2) {
                    String it = str2;
                    i.e(it, "it");
                    return r.f47939a;
                }
            }, W.d(aVar2, 1.0f), false, false, null, ComposableSingletons$SfdPersonalInfoFormScreenKt.f32991a, null, null, null, false, null, null, null, false, 0, 0, null, null, TextFieldDefaults.b(0L, jC, j, 0L, j10, 0L, j10, c1086gP, 1965945), c1086gP, (i11 & 14) | 1576368, 0, 524208);
            c1086g = c1086gP;
            TextKt.b(o.p(c1086g, com.voltasit.obdeleven.R.string.common_select), PaddingKt.j(c0949i.f(aVar2, d.a.f13340f), 0.0f, 0.0f, 16, 0.0f, 11), com.voltasit.obdeleven.presentation.e.a.f32284g, G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086g, 3456, 0, 131056);
            c1086g.T(true);
        }
        C1105p0 c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$CountryInput$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    SfdPersonalInfoFormScreenKt.a(str, aVar, interfaceC1084f2, b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }

    public static final void b(final Ia.a<r> aVar, final l<? super C0705g, r> lVar, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(-165098605);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.k(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= c1086gP.k(lVar) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && c1086gP.s()) {
            c1086gP.w();
        } else {
            c1086gP.L(-1290459457);
            boolean z10 = (i11 & 14) == 4;
            Object objF = c1086gP.f();
            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
            if (z10 || objF == c0153a) {
                objF = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$CountrySelectionDialog$1$1
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
            Ia.a aVar2 = (Ia.a) objF;
            c1086gP.T(false);
            c1086gP.L(-1290459388);
            boolean z11 = (i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32;
            Object objF2 = c1086gP.f();
            if (z11 || objF2 == c0153a) {
                objF2 = new l<C0705g, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$CountrySelectionDialog$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(C0705g c0705g) {
                        C0705g it = c0705g;
                        i.e(it, "it");
                        lVar.invoke(it);
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF2);
            }
            c1086gP.T(false);
            CountrySelectionDialogKt.a(null, false, aVar2, (l) objF2, c1086gP, 48, 1);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$CountrySelectionDialog$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    SfdPersonalInfoFormScreenKt.b(aVar, lVar, interfaceC1084f2, b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }

    public static final void c(final Ia.a<r> aVar, final l<? super C0705g, r> lVar, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(-1280193463);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.k(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= c1086gP.k(lVar) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && c1086gP.s()) {
            c1086gP.w();
        } else {
            c1086gP.L(-1411370639);
            boolean z10 = (i11 & 14) == 4;
            Object objF = c1086gP.f();
            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
            if (z10 || objF == c0153a) {
                objF = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$CountrySelectionWithFocusDialog$1$1
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
            Ia.a aVar2 = (Ia.a) objF;
            c1086gP.T(false);
            c1086gP.L(-1411370570);
            boolean z11 = (i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32;
            Object objF2 = c1086gP.f();
            if (z11 || objF2 == c0153a) {
                objF2 = new l<C0705g, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$CountrySelectionWithFocusDialog$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(C0705g c0705g) {
                        C0705g it = c0705g;
                        i.e(it, "it");
                        lVar.invoke(it);
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF2);
            }
            c1086gP.T(false);
            CountrySelectionDialogKt.a(null, true, aVar2, (l) objF2, c1086gP, 48, 1);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$CountrySelectionWithFocusDialog$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    SfdPersonalInfoFormScreenKt.c(aVar, lVar, interfaceC1084f2, b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(final Ia.a<r> onCheckNetworkCancelClick, final l<? super Integer, r> onNegativeAlert, final boolean z10, final Ia.a<r> onComplete, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        CreatePersonalInfoViewModel createPersonalInfoViewModel;
        i.e(onCheckNetworkCancelClick, "onCheckNetworkCancelClick");
        i.e(onNegativeAlert, "onNegativeAlert");
        i.e(onComplete, "onComplete");
        C1086g c1086gP = interfaceC1084f.p(-595760896);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.k(onCheckNetworkCancelClick) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= c1086gP.k(onNegativeAlert) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c1086gP.c(z10) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= c1086gP.k(onComplete) ? 2048 : 1024;
        }
        if ((i11 & 5851) == 1170 && c1086gP.s()) {
            c1086gP.w();
        } else {
            if (z10) {
                c1086gP.L(1113526001);
                c1086gP.e(667488325);
                c0 c0VarA = p027c1.b.a(c1086gP);
                if (c0VarA == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                p014b1.a aVarA = Fb.a.a(c0VarA, c1086gP);
                org.koin.core.scope.a aVarA2 = KoinApplicationKt.a(c1086gP);
                c1086gP.e(-1614864554);
                Y yA = Gb.a.a(kotlin.jvm.internal.l.a(CreatePersonalInfoViewModel.class), c0VarA.getViewModelStore(), null, aVarA, null, aVarA2, null);
                c1086gP.T(false);
                c1086gP.T(false);
                createPersonalInfoViewModel = (CreatePersonalInfoViewModel) yA;
            } else {
                c1086gP.L(1113526050);
                c1086gP.e(667488325);
                c0 c0VarA2 = p027c1.b.a(c1086gP);
                if (c0VarA2 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                p014b1.a aVarA3 = Fb.a.a(c0VarA2, c1086gP);
                org.koin.core.scope.a aVarA4 = KoinApplicationKt.a(c1086gP);
                c1086gP.e(-1614864554);
                Y yA2 = Gb.a.a(kotlin.jvm.internal.l.a(EditPersonalInfoViewModel.class), c0VarA2.getViewModelStore(), null, aVarA3, null, aVarA4, null);
                c1086gP.T(false);
                c1086gP.T(false);
                createPersonalInfoViewModel = (EditPersonalInfoViewModel) yA2;
            }
            c1086gP.T(false);
            androidx.compose.runtime.E.d(new SfdPersonalInfoFormScreenKt$EditSfdPersonalInfoFormScreen$1(createPersonalInfoViewModel, (InterfaceC1376t) c1086gP.x(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner()), onNegativeAlert, null), c1086gP, Boolean.TRUE);
            androidx.compose.runtime.E.d(new SfdPersonalInfoFormScreenKt$EditSfdPersonalInfoFormScreen$2(createPersonalInfoViewModel, onComplete, null), c1086gP, "personalInfoSaved");
            createPersonalInfoViewModel.f32998B.setValue(com.voltasit.obdeleven.presentation.screens.sfd.a.a((com.voltasit.obdeleven.presentation.screens.sfd.a) createPersonalInfoViewModel.f32999C.getValue(), null, null, false, false, null, null, null, false, false, false, false, false, false, false, true, 32767));
            h(createPersonalInfoViewModel, onCheckNetworkCancelClick, c1086gP, ((i11 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$EditSfdPersonalInfoFormScreen$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    SfdPersonalInfoFormScreenKt.d(onCheckNetworkCancelClick, onNegativeAlert, z10, onComplete, interfaceC1084f2, b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }

    public static final void e(final Ia.a<r> onPhoneCodeDismissRequest, final l<? super C0705g, r> onPhoneCodeSelected, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        i.e(onPhoneCodeDismissRequest, "onPhoneCodeDismissRequest");
        i.e(onPhoneCodeSelected, "onPhoneCodeSelected");
        C1086g c1086gP = interfaceC1084f.p(-1346054856);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.k(onPhoneCodeDismissRequest) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= c1086gP.k(onPhoneCodeSelected) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && c1086gP.s()) {
            c1086gP.w();
        } else {
            c1086gP.L(-406428024);
            boolean z10 = (i11 & 14) == 4;
            Object objF = c1086gP.f();
            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
            if (z10 || objF == c0153a) {
                objF = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$PhoneCodeSelectionDialog$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        onPhoneCodeDismissRequest.invoke();
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF);
            }
            Ia.a aVar = (Ia.a) objF;
            c1086gP.T(false);
            c1086gP.L(-406427953);
            boolean z11 = (i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32;
            Object objF2 = c1086gP.f();
            if (z11 || objF2 == c0153a) {
                objF2 = new l<C0705g, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$PhoneCodeSelectionDialog$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(C0705g c0705g) {
                        C0705g it = c0705g;
                        i.e(it, "it");
                        onPhoneCodeSelected.invoke(it);
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF2);
            }
            c1086gP.T(false);
            CountrySelectionDialogKt.a(null, true, aVar, (l) objF2, c1086gP, 48, 1);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$PhoneCodeSelectionDialog$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    SfdPersonalInfoFormScreenKt.e(onPhoneCodeDismissRequest, onPhoneCodeSelected, interfaceC1084f2, b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }

    public static final void f(final String value, final Ia.a<r> onClick, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086g;
        i.e(value, "value");
        i.e(onClick, "onClick");
        C1086g c1086gP = interfaceC1084f.p(-1517925186);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.K(value) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= c1086gP.k(onClick) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && c1086gP.s()) {
            c1086gP.w();
            c1086g = c1086gP;
        } else {
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11834a;
            androidx.compose.material.r rVarB = TextFieldDefaults.b(0L, ((C1034j) c1086gP.x(ColorsKt.f11693a)).c(), H.f13503k, 0L, com.voltasit.obdeleven.presentation.e.a.f32283f, 0L, 0L, c1086gP, 2097017);
            h hVarJ = PaddingKt.j(W.q(h.a.f13984b, 98), 0.0f, 0.0f, 16, 0.0f, 11);
            c1086gP.L(613119383);
            boolean z10 = (i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32;
            Object objF = c1086gP.f();
            if (z10 || objF == InterfaceC1084f.a.f12980a) {
                objF = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$PhoneCountryCodeInput$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        onClick.invoke();
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            c1086g = c1086gP;
            TextFieldKt.a(value, new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$PhoneCountryCodeInput$2
                @Override // Ia.l
                public final r invoke(String str) {
                    String it = str;
                    i.e(it, "it");
                    return r.f47939a;
                }
            }, ClickableKt.c(hVarJ, false, null, (Ia.a) objF, 7), false, true, null, null, null, null, null, false, null, null, null, false, 0, 0, null, null, rVarB, c1086g, (i11 & 14) | 27696, 0, 524256);
        }
        C1105p0 c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$PhoneCountryCodeInput$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    SfdPersonalInfoFormScreenKt.f(value, onClick, interfaceC1084f2, b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }

    public static final void g(final String value, final l<? super String, r> onValueChange, final Integer num, final h modifier, final Ia.a<r> onAction, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086g;
        i.e(value, "value");
        i.e(onValueChange, "onValueChange");
        i.e(modifier, "modifier");
        i.e(onAction, "onAction");
        C1086g c1086gP = interfaceC1084f.p(-1606682315);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.K(value) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= c1086gP.k(onValueChange) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c1086gP.K(num) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= c1086gP.K(modifier) ? 2048 : 1024;
        }
        if ((i10 & 57344) == 0) {
            i11 |= c1086gP.k(onAction) ? 16384 : 8192;
        }
        if ((46811 & i11) == 9362 && c1086gP.s()) {
            c1086gP.w();
            c1086g = c1086gP;
        } else {
            c1086gP.L(-548229684);
            long jB = num != null ? ((C1034j) c1086gP.x(ColorsKt.f11693a)).b() : com.voltasit.obdeleven.presentation.e.a.f32283f;
            c1086gP.T(false);
            h.a aVar = h.a.f13984b;
            C0953m c0953mA = C0952l.a(C0945e.f10286c, d.a.f13346m, c1086gP, 0);
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
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
            p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i12))) {
                J4.i.d(i12, c1086gP, i12, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
            k kVarA = k.a(0, 3, 7, R.styleable.AppCompatTheme_tooltipFrameBackground);
            c1086gP.L(-628423712);
            int i13 = 57344 & i11;
            boolean z10 = i13 == 16384;
            Object objF = c1086gP.f();
            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
            if (z10 || objF == c0153a) {
                objF = new l<InterfaceC1000i, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$PhoneNumberInput$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(InterfaceC1000i interfaceC1000i) {
                        InterfaceC1000i $receiver = interfaceC1000i;
                        i.e($receiver, "$this$$receiver");
                        onAction.invoke();
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF);
            }
            l lVar = (l) objF;
            c1086gP.T(false);
            c1086gP.L(-628423671);
            boolean z11 = i13 == 16384;
            Object objF2 = c1086gP.f();
            if (z11 || objF2 == c0153a) {
                objF2 = new l<InterfaceC1000i, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$PhoneNumberInput$1$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(InterfaceC1000i interfaceC1000i) {
                        InterfaceC1000i $receiver = interfaceC1000i;
                        i.e($receiver, "$this$$receiver");
                        onAction.invoke();
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF2);
            }
            c1086gP.T(false);
            j jVar = new j(lVar, (l) objF2, null, 58);
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11834a;
            long j = H.f13503k;
            O0 o10 = ColorsKt.f11693a;
            androidx.compose.material.r rVarB = TextFieldDefaults.b(((C1034j) c1086gP.x(o10)).c(), 0L, j, jB, 0L, 0L, 0L, c1086gP, 2097082);
            h hVarD = W.d(modifier, 1.0f);
            c1086gP.L(-628424005);
            boolean z12 = (i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32;
            Object objF3 = c1086gP.f();
            if (z12 || objF3 == c0153a) {
                objF3 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$PhoneNumberInput$1$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(String str) {
                        String it = str;
                        i.e(it, "it");
                        onValueChange.invoke(it);
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF3);
            }
            c1086gP.T(false);
            TextFieldKt.a(value, (l) objF3, hVarD, false, false, null, ComposableSingletons$SfdPersonalInfoFormScreenKt.f32992b, null, null, null, false, null, kVarA, jVar, true, 0, 0, null, null, rVarB, c1086gP, (i11 & 14) | 1572864, 24576, 495544);
            c1086g = c1086gP;
            c1086g.L(-628423165);
            String strP = num == null ? null : o.p(c1086g, num.intValue());
            c1086g.T(false);
            TextKt.b(strP == null ? "" : strP, PaddingKt.j(aVar, 16, 0.0f, 0.0f, 0.0f, 14), ((C1034j) c1086g.x(o10)).b(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086g, 3120, 0, 131056);
            c1086g.T(true);
        }
        C1105p0 c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$PhoneNumberInput$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num2) {
                    num2.intValue();
                    SfdPersonalInfoFormScreenKt.g(value, onValueChange, num, modifier, onAction, interfaceC1084f2, b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(final CreatePersonalInfoViewModel createPersonalInfoViewModel, final Ia.a<r> aVar, InterfaceC1084f interfaceC1084f, final int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1616750403);
        c1086gP.L(676050110);
        Object objF = c1086gP.f();
        Object obj = objF;
        if (objF == InterfaceC1084f.a.f12980a) {
            ArrayList arrayList = new ArrayList(3);
            for (int i11 = 0; i11 < 3; i11++) {
                arrayList.add(new FocusRequester());
            }
            c1086gP.E(arrayList);
            obj = arrayList;
        }
        List list = (List) obj;
        c1086gP.T(false);
        androidx.compose.runtime.E.d(new SfdPersonalInfoFormScreenKt$SfdPersonalInfoFormScreen$1(createPersonalInfoViewModel, list, null), c1086gP, "next_focus_after_country_and_phone_code_select");
        C1085f0 c1085f0 = createPersonalInfoViewModel.f32999C;
        X xA = androidx.compose.runtime.livedata.b.a(createPersonalInfoViewModel.f32114c, PreloaderState.d.f32643a, c1086gP);
        c1086gP.L(676050571);
        if (((Boolean) createPersonalInfoViewModel.f33009w.getValue()).booleanValue()) {
            CheckNetworkDialogKt.a(new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoFormScreen$2
                {
                    super(0);
                }

                @Override // Ia.a
                public final r invoke() {
                    CreatePersonalInfoViewModel createPersonalInfoViewModel2 = createPersonalInfoViewModel;
                    createPersonalInfoViewModel2.getClass();
                    C2680e.c(Z.a(createPersonalInfoViewModel2), createPersonalInfoViewModel2.f32112a, null, new CreatePersonalInfoViewModel$onTryAgainDialogTryAgain$1(createPersonalInfoViewModel2, null), 2);
                    return r.f47939a;
                }
            }, aVar, c1086gP, i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
        }
        c1086gP.T(false);
        LoaderDialogKt.a((PreloaderState) xA.getValue(), c1086gP, 0);
        i((com.voltasit.obdeleven.presentation.screens.sfd.a) c1085f0.getValue(), new l<C0705g, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoFormScreen$3
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ia.l
            public final r invoke(C0705g c0705g) {
                C0705g it = c0705g;
                i.e(it, "it");
                CreatePersonalInfoViewModel createPersonalInfoViewModel2 = createPersonalInfoViewModel;
                createPersonalInfoViewModel2.getClass();
                com.voltasit.obdeleven.domain.usecases.i iVar = createPersonalInfoViewModel2.f33007u;
                iVar.getClass();
                String countryCode = it.f3497c;
                i.e(countryCode, "countryCode");
                String strA = iVar.f30852a.a(countryCode);
                C1085f0 c1085f1 = createPersonalInfoViewModel2.f32998B;
                c1085f1.setValue(a.a((a) c1085f1.getValue(), null, strA, false, false, null, null, null, false, false, false, false, false, false, false, false, 65021));
                createPersonalInfoViewModel2.e(G.a(((a) c1085f1.getValue()).f33037a, null, null, null, null, null, it.f3497c, null, null, 2015));
                return r.f47939a;
            }
        }, new l<C0705g, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoFormScreen$4
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ia.l
            public final r invoke(C0705g c0705g) {
                C0705g it = c0705g;
                i.e(it, "it");
                CreatePersonalInfoViewModel createPersonalInfoViewModel2 = createPersonalInfoViewModel;
                createPersonalInfoViewModel2.getClass();
                com.voltasit.obdeleven.domain.usecases.i iVar = createPersonalInfoViewModel2.f33007u;
                iVar.getClass();
                String countryCode = it.f3497c;
                i.e(countryCode, "countryCode");
                String strA = iVar.f30852a.a(countryCode);
                C1085f0 c1085f1 = createPersonalInfoViewModel2.f32998B;
                c1085f1.setValue(a.a((a) c1085f1.getValue(), null, strA, false, false, null, null, null, false, false, false, false, false, false, false, false, 63485));
                createPersonalInfoViewModel2.e(G.a(((a) c1085f1.getValue()).f33037a, null, null, null, null, null, it.f3497c, null, null, 2015));
                C2680e.c(Z.a(createPersonalInfoViewModel2), createPersonalInfoViewModel2.f32112a, null, new CreatePersonalInfoViewModel$onCountrySelectedWithFocus$1(createPersonalInfoViewModel2, null), 2);
                return r.f47939a;
            }
        }, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoFormScreen$5
            {
                super(0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ia.a
            public final r invoke() {
                C1085f0 c1085f1 = createPersonalInfoViewModel.f32998B;
                c1085f1.setValue(a.a((a) c1085f1.getValue(), null, null, false, false, null, null, null, false, false, false, false, false, false, false, false, 62975));
                return r.f47939a;
            }
        }, new l<C0705g, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoFormScreen$6
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ia.l
            public final r invoke(C0705g c0705g) {
                C0705g it = c0705g;
                i.e(it, "it");
                CreatePersonalInfoViewModel createPersonalInfoViewModel2 = createPersonalInfoViewModel;
                createPersonalInfoViewModel2.getClass();
                C1085f0 c1085f1 = createPersonalInfoViewModel2.f32998B;
                createPersonalInfoViewModel2.e(G.a(((a) c1085f1.getValue()).f33037a, null, null, null, it.f3496b, null, null, null, null, 2039));
                c1085f1.setValue(a.a((a) c1085f1.getValue(), null, null, false, false, null, null, null, false, false, false, false, false, false, false, false, 64511));
                return r.f47939a;
            }
        }, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoFormScreen$7
            {
                super(0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ia.a
            public final r invoke() {
                C1085f0 c1085f1 = createPersonalInfoViewModel.f32998B;
                c1085f1.setValue(a.a((a) c1085f1.getValue(), null, null, false, false, null, null, null, false, false, false, false, false, false, false, false, 64511));
                return r.f47939a;
            }
        }, new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoFormScreen$8
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ia.l
            public final r invoke(String str) {
                String it = str;
                i.e(it, "it");
                CreatePersonalInfoViewModel createPersonalInfoViewModel2 = createPersonalInfoViewModel;
                createPersonalInfoViewModel2.getClass();
                createPersonalInfoViewModel2.e(G.a(((a) createPersonalInfoViewModel2.f32998B.getValue()).f33037a, it, null, null, null, null, null, null, null, 2046));
                return r.f47939a;
            }
        }, new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoFormScreen$9
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ia.l
            public final r invoke(String str) {
                String it = str;
                i.e(it, "it");
                CreatePersonalInfoViewModel createPersonalInfoViewModel2 = createPersonalInfoViewModel;
                createPersonalInfoViewModel2.getClass();
                createPersonalInfoViewModel2.e(G.a(((a) createPersonalInfoViewModel2.f32998B.getValue()).f33037a, null, it, null, null, null, null, null, null, 2045));
                return r.f47939a;
            }
        }, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoFormScreen$10
            {
                super(0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ia.a
            public final r invoke() {
                C1085f0 c1085f1 = createPersonalInfoViewModel.f32998B;
                c1085f1.setValue(a.a((a) c1085f1.getValue(), null, null, false, false, null, null, null, false, true, false, false, false, false, false, false, 65023));
                return r.f47939a;
            }
        }, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoFormScreen$11
            {
                super(0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ia.a
            public final r invoke() {
                C1085f0 c1085f1 = createPersonalInfoViewModel.f32998B;
                c1085f1.setValue(a.a((a) c1085f1.getValue(), null, null, false, false, null, null, null, false, false, false, true, false, false, false, false, 63487));
                return r.f47939a;
            }
        }, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoFormScreen$12
            {
                super(0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ia.a
            public final r invoke() {
                C1085f0 c1085f1 = createPersonalInfoViewModel.f32998B;
                c1085f1.setValue(a.a((a) c1085f1.getValue(), null, null, false, false, null, null, null, false, false, true, false, false, false, false, false, 64511));
                return r.f47939a;
            }
        }, new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoFormScreen$13
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ia.l
            public final r invoke(String str) {
                String it = str;
                i.e(it, "it");
                CreatePersonalInfoViewModel createPersonalInfoViewModel2 = createPersonalInfoViewModel;
                createPersonalInfoViewModel2.getClass();
                createPersonalInfoViewModel2.e(G.a(((a) createPersonalInfoViewModel2.f32998B.getValue()).f33037a, null, null, null, null, it, null, null, null, 2031));
                return r.f47939a;
            }
        }, new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoFormScreen$14
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ia.l
            public final r invoke(String str) {
                String it = str;
                i.e(it, "it");
                CreatePersonalInfoViewModel createPersonalInfoViewModel2 = createPersonalInfoViewModel;
                createPersonalInfoViewModel2.getClass();
                createPersonalInfoViewModel2.e(G.a(((a) createPersonalInfoViewModel2.f32998B.getValue()).f33037a, null, null, null, null, null, null, it, null, 1983));
                return r.f47939a;
            }
        }, new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoFormScreen$15
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ia.l
            public final r invoke(String str) {
                String it = str;
                i.e(it, "it");
                CreatePersonalInfoViewModel createPersonalInfoViewModel2 = createPersonalInfoViewModel;
                createPersonalInfoViewModel2.getClass();
                createPersonalInfoViewModel2.e(G.a(((a) createPersonalInfoViewModel2.f32998B.getValue()).f33037a, null, null, null, null, null, null, null, it, 1919));
                return r.f47939a;
            }
        }, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoFormScreen$16
            {
                super(0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ia.a
            public final r invoke() {
                C1085f0 c1085f1 = createPersonalInfoViewModel.f32998B;
                c1085f1.setValue(a.a((a) c1085f1.getValue(), null, null, false, !((a) c1085f1.getValue()).f33040d, null, null, null, false, false, false, false, !((a) c1085f1.getValue()).f33048m, false, false, false, 61431));
                return r.f47939a;
            }
        }, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoFormScreen$17
            {
                super(0);
            }

            @Override // Ia.a
            public final r invoke() {
                CreatePersonalInfoViewModel createPersonalInfoViewModel2 = createPersonalInfoViewModel;
                createPersonalInfoViewModel2.getClass();
                C2680e.c(Z.a(createPersonalInfoViewModel2), createPersonalInfoViewModel2.f32112a, null, new CreatePersonalInfoViewModel$onNextClick$1(createPersonalInfoViewModel2, null), 2);
                return r.f47939a;
            }
        }, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoFormScreen$18
            {
                super(0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ia.a
            public final r invoke() {
                C1085f0 c1085f1 = createPersonalInfoViewModel.f32998B;
                c1085f1.setValue(a.a((a) c1085f1.getValue(), null, null, !((a) c1085f1.getValue()).f33039c, false, null, null, null, false, false, false, false, false, false, false, false, 65531));
                return r.f47939a;
            }
        }, list, c1086gP, 8, 16777216, 0);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoFormScreen$19
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    SfdPersonalInfoFormScreenKt.h(createPersonalInfoViewModel, aVar, interfaceC1084f2, b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:103:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:106:0x0403  */
    /* JADX WARN: Code duplicated, block: B:108:0x0411  */
    /* JADX WARN: Code duplicated, block: B:113:0x0430  */
    /* JADX WARN: Code duplicated, block: B:115:0x0436  */
    /* JADX WARN: Code duplicated, block: B:121:0x0443 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:122:0x0445  */
    /* JADX WARN: Code duplicated, block: B:125:0x0466  */
    /* JADX WARN: Code duplicated, block: B:128:0x0471  */
    /* JADX WARN: Code duplicated, block: B:131:0x0479 A[PHI: r2
      0x0479: PHI (r2v62 Ia.l<? super java.lang.String, xa.r>) = (r2v18 Ia.l<? super java.lang.String, xa.r>), (r2v63 Ia.l<? super java.lang.String, xa.r>) binds: [B:130:0x0477, B:126:0x046e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:132:0x047b  */
    /* JADX WARN: Code duplicated, block: B:135:0x0482 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:136:0x0484  */
    /* JADX WARN: Code duplicated, block: B:139:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:141:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:147:0x04ea A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:148:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:151:0x0524  */
    /* JADX WARN: Code duplicated, block: B:153:0x0532  */
    /* JADX WARN: Code duplicated, block: B:156:0x053c  */
    /* JADX WARN: Code duplicated, block: B:159:0x0543 A[PHI: r8 r13
      0x0543: PHI (r8v15 androidx.compose.ui.h$a) = (r8v13 androidx.compose.ui.h$a), (r8v16 androidx.compose.ui.h$a) binds: [B:158:0x0541, B:154:0x0539] A[DONT_GENERATE, DONT_INLINE]
      0x0543: PHI (r13v9 Ia.l<? super java.lang.String, xa.r>) = (r13v5 Ia.l<? super java.lang.String, xa.r>), (r13v10 Ia.l<? super java.lang.String, xa.r>) binds: [B:158:0x0541, B:154:0x0539] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:160:0x0545  */
    /* JADX WARN: Code duplicated, block: B:163:0x054c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:164:0x054e  */
    /* JADX WARN: Code duplicated, block: B:167:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:169:0x05be  */
    /* JADX WARN: Code duplicated, block: B:175:0x05cb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:176:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:179:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:182:0x0615  */
    /* JADX WARN: Code duplicated, block: B:184:0x062e  */
    /* JADX WARN: Code duplicated, block: B:186:0x0634  */
    /* JADX WARN: Code duplicated, block: B:192:0x0641 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:193:0x0643  */
    /* JADX WARN: Code duplicated, block: B:196:0x066d  */
    /* JADX WARN: Code duplicated, block: B:199:0x069c  */
    /* JADX WARN: Code duplicated, block: B:201:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:207:0x06af A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:208:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:211:0x06e1  */
    /* JADX WARN: Code duplicated, block: B:214:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x035e A[PHI: r3
      0x035e: PHI (r3v50 Ia.a<xa.r>) = (r3v14 Ia.a<xa.r>), (r3v51 Ia.a<xa.r>) binds: [B:78:0x035c, B:74:0x0355] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x0369  */
    /* JADX WARN: Code duplicated, block: B:87:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:90:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:93:0x03b1 A[PHI: r9
      0x03b1: PHI (r9v33 Ia.a<xa.r>) = (r9v29 Ia.a<xa.r>), (r9v34 Ia.a<xa.r>) binds: [B:92:0x03af, B:88:0x03a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:94:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:97:0x03ba A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:98:0x03bc  */
    public static final void i(final com.voltasit.obdeleven.presentation.screens.sfd.a state, final l<? super C0705g, r> onCountrySelected, final l<? super C0705g, r> onCountrySelectedWithFocus, final Ia.a<r> onCountryDismissRequest, final l<? super C0705g, r> onPhoneCodeSelected, final Ia.a<r> onPhoneCodeDismissRequest, final l<? super String, r> onFirstNameChange, final l<? super String, r> onLastNameChange, final Ia.a<r> onCountryClick, final Ia.a<r> onCountryClickWithFocus, final Ia.a<r> onPhoneCodeClick, final l<? super String, r> onPhoneNumberChange, final l<? super String, r> onWorkshopCodeChange, final l<? super String, r> onWorkshopAddressChange, final Ia.a<r> onPolicyCheckChange, final Ia.a<r> onNextClick, final Ia.a<r> onToggleWorkshopInformationClicked, List<FocusRequester> list, InterfaceC1084f interfaceC1084f, final int i10, final int i11, final int i12) {
        androidx.compose.ui.f.b bVar;
        boolean z10;
        final Ia.a<r> aVar;
        boolean z11;
        Object objF;
        final Ia.a<r> aVar2;
        boolean z12;
        Object objF2;
        int i13;
        boolean z13;
        Object objF3;
        final l<? super String, r> lVar;
        boolean z14;
        Object objF4;
        boolean z15;
        Object objF5;
        h.a aVar3;
        float f10;
        boolean z16;
        Object objF6;
        C1105p0 c1105p0V;
        boolean z17;
        Object objF7;
        final l<? super String, r> lVar2;
        boolean z18;
        Object objF8;
        boolean z19;
        Object objF9;
        i.e(state, "state");
        i.e(onCountrySelected, "onCountrySelected");
        i.e(onCountrySelectedWithFocus, "onCountrySelectedWithFocus");
        i.e(onCountryDismissRequest, "onCountryDismissRequest");
        i.e(onPhoneCodeSelected, "onPhoneCodeSelected");
        i.e(onPhoneCodeDismissRequest, "onPhoneCodeDismissRequest");
        i.e(onFirstNameChange, "onFirstNameChange");
        i.e(onLastNameChange, "onLastNameChange");
        i.e(onCountryClick, "onCountryClick");
        i.e(onCountryClickWithFocus, "onCountryClickWithFocus");
        i.e(onPhoneCodeClick, "onPhoneCodeClick");
        i.e(onPhoneNumberChange, "onPhoneNumberChange");
        i.e(onWorkshopCodeChange, "onWorkshopCodeChange");
        i.e(onWorkshopAddressChange, "onWorkshopAddressChange");
        i.e(onPolicyCheckChange, "onPolicyCheckChange");
        i.e(onNextClick, "onNextClick");
        i.e(onToggleWorkshopInformationClicked, "onToggleWorkshopInformationClicked");
        C1086g c1086gP = interfaceC1084f.p(-1301952946);
        List<FocusRequester> list2 = (i12 & 131072) != 0 ? EmptyList.f42983b : list;
        c1086gP.L(-1148664353);
        androidx.compose.ui.f.b bVar2 = d.a.j;
        boolean z20 = state.f33049n;
        h.a aVar4 = h.a.f13984b;
        if (z20) {
            h hVarD = W.d(aVar4, 1.0f);
            T tA = S.a(C0945e.f10288e, bVar2, c1086gP, 54);
            int i14 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            h hVarC = ComposedModifierKt.c(c1086gP, hVarD);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar5 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar5);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
            p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i14))) {
                J4.i.d(i14, c1086gP, i14, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
            bVar = bVar2;
            I.a(PaddingKt.f(aVar4, 22), ((C1034j) c1086gP.x(ColorsKt.f11693a)).d(), 0.0f, 0L, 0, 6, c1086gP, 28);
            c1086gP.T(true);
        } else {
            bVar = bVar2;
        }
        c1086gP.T(false);
        if (!state.f33050o) {
            C1105p0 c1105p0V2 = c1086gP.V();
            if (c1105p0V2 != null) {
                final List<FocusRequester> list3 = list2;
                c1105p0V2.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        SfdPersonalInfoFormScreenKt.i(state, onCountrySelected, onCountrySelectedWithFocus, onCountryDismissRequest, onPhoneCodeSelected, onPhoneCodeDismissRequest, onFirstNameChange, onLastNameChange, onCountryClick, onCountryClickWithFocus, onPhoneCodeClick, onPhoneNumberChange, onWorkshopCodeChange, onWorkshopAddressChange, onPolicyCheckChange, onNextClick, onToggleWorkshopInformationClicked, list3, interfaceC1084f2, b.l(i10 | 1), b.l(i11), i12);
                        return r.f47939a;
                    }
                };
                return;
            }
            return;
        }
        c1086gP.L(-1148663917);
        if (state.j) {
            b(onCountryDismissRequest, onCountrySelected, c1086gP, ((i10 >> 9) & 14) | (i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
        }
        c1086gP.T(false);
        c1086gP.L(-1148663801);
        if (state.f33046k) {
            e(onPhoneCodeDismissRequest, onPhoneCodeSelected, c1086gP, ((i10 >> 15) & 14) | ((i10 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
        }
        c1086gP.T(false);
        c1086gP.L(-1148663677);
        if (state.f33047l) {
            c(onCountryDismissRequest, onCountrySelectedWithFocus, c1086gP, ((i10 >> 9) & 14) | ((i10 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
        }
        c1086gP.T(false);
        float f11 = 16;
        h hVarB = ScrollKt.b(W.c(PaddingKt.h(aVar4, f11, 0.0f, 2), 1.0f), ScrollKt.a(0, c1086gP, 0, 1), false, 14);
        C0953m c0953mA = C0952l.a(C0945e.f10286c, d.a.f13346m, c1086gP, 0);
        int i15 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
        h hVarC2 = ComposedModifierKt.c(c1086gP, hVarB);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar6 = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar6);
        } else {
            c1086gP.A();
        }
        p<ComposeUiNode, E, r> pVar2 = ComposeUiNode.Companion.f14337f;
        R0.a(pVar2, c1086gP, c0953mA);
        p<ComposeUiNode, androidx.compose.runtime.r, r> pVar3 = ComposeUiNode.Companion.f14336e;
        R0.a(pVar3, c1086gP, interfaceC1089h0P2);
        p<ComposeUiNode, Integer, r> pVar4 = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i15))) {
            J4.i.d(i15, c1086gP, i15, pVar4);
        }
        p<ComposeUiNode, h, r> pVar5 = ComposeUiNode.Companion.f14335d;
        R0.a(pVar5, c1086gP, hVarC2);
        C0955o c0955o = C0955o.f10310a;
        final M0 m7 = (M0) c1086gP.x(CompositionLocalsKt.f14854p);
        final n nVar = (n) c1086gP.x(CompositionLocalsKt.f14848i);
        c1086gP.L(1176045406);
        if (state.f33051p) {
            Lb.a.a(c1086gP, W.e(aVar4, 19));
            z10 = false;
            InformativeTextKt.a(PaddingKt.h(aVar4, f11, 0.0f, 2), o.p(c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_regular_updates), c1086gP, 6, 0);
        } else {
            z10 = false;
        }
        c1086gP.T(z10);
        Lb.a.a(c1086gP, W.e(aVar4, f11));
        G g10 = state.f33037a;
        c1086gP.L(1176045845);
        boolean z21 = (((i10 & 3670016) ^ 1572864) > 1048576 && c1086gP.K(onFirstNameChange)) || (i10 & 1572864) == 1048576;
        Object objF10 = c1086gP.f();
        InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
        if (z21 || objF10 == c0153a) {
            objF10 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // Ia.l
                public final r invoke(String str) {
                    String it = str;
                    i.e(it, "it");
                    onFirstNameChange.invoke(it);
                    return r.f47939a;
                }
            };
            c1086gP.E(objF10);
        }
        c1086gP.T(false);
        final List<FocusRequester> list4 = list2;
        TextInputKt.a(null, g10.f3417a, (l) objF10, o.p(c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_first_name), k.a(3, 0, 6, R.styleable.AppCompatTheme_windowActionBarOverlay), state.f33041e, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final r invoke() {
                list4.get(0).b(7);
                return r.f47939a;
            }
        }, c1086gP, 0, 1);
        float f12 = f33013a;
        Lb.a.a(c1086gP, W.e(aVar4, f12));
        h hVarA = u.a(aVar4, list4.get(0));
        c1086gP.L(1176046572);
        boolean z22 = (((i10 & 29360128) ^ 12582912) > 8388608 && c1086gP.K(onLastNameChange)) || (i10 & 12582912) == 8388608;
        Object objF11 = c1086gP.f();
        if (z22 || objF11 == c0153a) {
            objF11 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // Ia.l
                public final r invoke(String str) {
                    String it = str;
                    i.e(it, "it");
                    onLastNameChange.invoke(it);
                    return r.f47939a;
                }
            };
            c1086gP.E(objF11);
        }
        l lVar3 = (l) objF11;
        c1086gP.T(false);
        String strP = o.p(c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_last_name);
        k kVarA = k.a(3, 0, 6, R.styleable.AppCompatTheme_windowActionBarOverlay);
        c1086gP.L(1176046958);
        if (((i10 & 1879048192) ^ 805306368) > 536870912) {
            aVar = onCountryClickWithFocus;
            if (c1086gP.K(aVar)) {
                z11 = true;
            }
            objF = c1086gP.f();
            if (z11 || objF == c0153a) {
                objF = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$4$1
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
            TextInputKt.a(hVarA, g10.f3418b, lVar3, strP, kVarA, state.f33043g, (Ia.a) objF, c1086gP, 0, 0);
            Lb.a.a(c1086gP, W.e(aVar4, f12));
            c1086gP.L(1176047178);
            if (((i10 & 234881024) ^ 100663296) > 67108864) {
                aVar2 = onCountryClick;
                if (!c1086gP.K(aVar2)) {
                    z12 = true;
                }
                objF2 = c1086gP.f();
                if (z12 || objF2 == c0153a) {
                    objF2 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            aVar2.invoke();
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF2);
                }
                c1086gP.T(false);
                a(state.f33038b, (Ia.a) objF2, c1086gP, 0);
                Lb.a.a(c1086gP, W.e(aVar4, f11));
                T tA2 = S.a(C0945e.f10284a, bVar, c1086gP, 0);
                i13 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
                h hVarC3 = ComposedModifierKt.c(c1086gP, aVar4);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar6);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar2, c1086gP, tA2);
                R0.a(pVar3, c1086gP, interfaceC1089h0P3);
                if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i13))) {
                    J4.i.d(i13, c1086gP, i13, pVar4);
                }
                R0.a(pVar5, c1086gP, hVarC3);
                c1086gP.L(1880728288);
                z13 = (((i11 & 14) ^ 6) <= 4 && c1086gP.K(onPhoneCodeClick)) || (i11 & 6) == 4;
                objF3 = c1086gP.f();
                if (z13 || objF3 == c0153a) {
                    objF3 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$6$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            onPhoneCodeClick.invoke();
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF3);
                }
                c1086gP.T(false);
                f(g10.f3420d, (Ia.a) objF3, c1086gP, 0);
                c1086gP.L(1880728479);
                if (((i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) > 32) {
                    lVar = onPhoneNumberChange;
                    if (!c1086gP.K(lVar)) {
                        z14 = true;
                    }
                    objF4 = c1086gP.f();
                    if (z14 || objF4 == c0153a) {
                        objF4 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$6$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(String str) {
                                String it = str;
                                i.e(it, "it");
                                lVar.invoke(it);
                                return r.f47939a;
                            }
                        };
                        c1086gP.E(objF4);
                    }
                    c1086gP.T(false);
                    g(g10.f3421e, (l) objF4, state.f33044h, u.a(aVar4, list4.get(1)), new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$6$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            M0 m10 = m7;
                            if (m10 != null) {
                                m10.b();
                            }
                            nVar.u(false);
                            return r.f47939a;
                        }
                    }, c1086gP, 0);
                    c1086gP.T(true);
                    Lb.a.a(c1086gP, W.e(aVar4, 14));
                    c1086gP.L(1176048077);
                    z15 = (((3670016 & i11) ^ 1572864) <= 1048576 && c1086gP.K(onToggleWorkshopInformationClicked)) || (i11 & 1572864) == 1048576;
                    objF5 = c1086gP.f();
                    if (z15 || objF5 == c0153a) {
                        objF5 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$7$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final r invoke() {
                                onToggleWorkshopInformationClicked.invoke();
                                return r.f47939a;
                            }
                        };
                        c1086gP.E(objF5);
                    }
                    c1086gP.T(false);
                    androidx.compose.ui.f.a aVar7 = d.a.f13347n;
                    ButtonKt.b((Ia.a) objF5, c0955o.b(aVar4, aVar7), null, androidx.compose.runtime.internal.a.b(748609985, new q<U, InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$8
                        {
                            super(3);
                        }

                        @Override // Ia.q
                        public final r invoke(U u10, InterfaceC1084f interfaceC1084f2, Integer num) {
                            c cVarB;
                            U TextButton = u10;
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            int iIntValue = num.intValue();
                            i.e(TextButton, "$this$TextButton");
                            if ((iIntValue & 81) == 16 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                if (state.f33039c) {
                                    cVarB = g.f48678a;
                                    if (cVarB == null) {
                                        c.a aVar8 = new c.a("Filled.ExpandLess", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                        EmptyList emptyList = androidx.compose.ui.graphics.vector.i.f13970a;
                                        m0 m0Var = new m0(H.f13495b);
                                        ArrayList arrayList = new ArrayList(32);
                                        arrayList.add(new androidx.compose.ui.graphics.vector.e.f(12.0f, 8.0f));
                                        arrayList.add(new androidx.compose.ui.graphics.vector.e.m(-6.0f, 6.0f));
                                        arrayList.add(new androidx.compose.ui.graphics.vector.e.m(1.41f, 1.41f));
                                        arrayList.add(new androidx.compose.ui.graphics.vector.e.C0157e(12.0f, 10.83f));
                                        arrayList.add(new androidx.compose.ui.graphics.vector.e.m(4.59f, 4.58f));
                                        arrayList.add(new androidx.compose.ui.graphics.vector.e.C0157e(18.0f, 14.0f));
                                        arrayList.add(androidx.compose.ui.graphics.vector.e.b.f13907c);
                                        c.a.a(aVar8, arrayList, m0Var);
                                        cVarB = aVar8.b();
                                        g.f48678a = cVarB;
                                    }
                                } else {
                                    cVarB = p306z.h.f48679a;
                                    if (cVarB == null) {
                                        c.a aVar9 = new c.a("Filled.ExpandMore", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                        EmptyList emptyList2 = androidx.compose.ui.graphics.vector.i.f13970a;
                                        m0 m0Var2 = new m0(H.f13495b);
                                        ArrayList arrayList2 = new ArrayList(32);
                                        arrayList2.add(new androidx.compose.ui.graphics.vector.e.f(16.59f, 8.59f));
                                        arrayList2.add(new androidx.compose.ui.graphics.vector.e.C0157e(12.0f, 13.17f));
                                        arrayList2.add(new androidx.compose.ui.graphics.vector.e.C0157e(7.41f, 8.59f));
                                        arrayList2.add(new androidx.compose.ui.graphics.vector.e.C0157e(6.0f, 10.0f));
                                        arrayList2.add(new androidx.compose.ui.graphics.vector.e.m(6.0f, 6.0f));
                                        arrayList2.add(new androidx.compose.ui.graphics.vector.e.m(6.0f, -6.0f));
                                        arrayList2.add(androidx.compose.ui.graphics.vector.e.b.f13907c);
                                        c.a.a(aVar9, arrayList2, m0Var2);
                                        cVarB = aVar9.b();
                                        p306z.h.f48679a = cVarB;
                                    }
                                }
                                h hVar = IconKt.f11757a;
                                IconKt.a(androidx.compose.ui.graphics.vector.k.b(cVarB, interfaceC1084f3), "", h.a.f13984b, H.b(((Number) interfaceC1084f3.x(ContentAlphaKt.f11713a)).floatValue(), ((H) interfaceC1084f3.x(ContentColorKt.f11715a)).f13506a), interfaceC1084f3, 56, 0);
                                TextKt.b(o.p(interfaceC1084f3, com.voltasit.obdeleven.R.string.view_sfd_personal_info_workshop_info), null, com.voltasit.obdeleven.presentation.e.a.f32284g, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 384, 0, 131066);
                            }
                            return r.f47939a;
                        }
                    }, c1086gP), c1086gP, 805306368, 508);
                    c1086gP.L(1176048636);
                    if (state.f33039c) {
                        c1086gP.L(1176048783);
                        if (((i11 & 896) ^ 384) > 256) {
                            aVar3 = aVar4;
                            lVar2 = onWorkshopCodeChange;
                            if (!c1086gP.K(lVar2)) {
                                z18 = true;
                            }
                            objF8 = c1086gP.f();
                            if (z18 || objF8 == c0153a) {
                                objF8 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$9$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final r invoke(String str) {
                                        String it = str;
                                        i.e(it, "it");
                                        lVar2.invoke(it);
                                        return r.f47939a;
                                    }
                                };
                                c1086gP.E(objF8);
                            }
                            c1086gP.T(false);
                            TextInputKt.a(null, g10.f3423g, (l) objF8, o.p(c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_workshop_number), new k(null, 3, 6, R.styleable.AppCompatTheme_tooltipFrameBackground), null, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$10
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final r invoke() {
                                    list4.get(2).b(7);
                                    return r.f47939a;
                                }
                            }, c1086gP, 221184, 1);
                            String strC = J4.n.c(aVar3, f12, c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_workshop_address, c1086gP);
                            k kVar = new k(null, 0, 7, R.styleable.AppCompatTheme_windowActionModeOverlay);
                            h hVarA2 = u.a(aVar3, list4.get(2));
                            c1086gP.L(1176049467);
                            z19 = (((i11 & 7168) ^ 3072) <= 2048 && c1086gP.K(onWorkshopAddressChange)) || (i11 & 3072) == 2048;
                            objF9 = c1086gP.f();
                            if (z19 || objF9 == c0153a) {
                                objF9 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$11$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final r invoke(String str) {
                                        String it = str;
                                        i.e(it, "it");
                                        onWorkshopAddressChange.invoke(it);
                                        return r.f47939a;
                                    }
                                };
                                c1086gP.E(objF9);
                            }
                            c1086gP.T(false);
                            TextInputKt.a(hVarA2, g10.f3424h, (l) objF9, strC, kVar, null, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$12
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final r invoke() {
                                    M0 m10 = m7;
                                    if (m10 != null) {
                                        m10.b();
                                    }
                                    nVar.u(false);
                                    return r.f47939a;
                                }
                            }, c1086gP, 221184, 0);
                        } else {
                            aVar3 = aVar4;
                            lVar2 = onWorkshopCodeChange;
                        }
                        if ((i11 & 384) == 256) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        objF8 = c1086gP.f();
                        if (z18) {
                            objF8 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$9$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final r invoke(String str) {
                                    String it = str;
                                    i.e(it, "it");
                                    lVar2.invoke(it);
                                    return r.f47939a;
                                }
                            };
                            c1086gP.E(objF8);
                        } else {
                            objF8 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$9$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final r invoke(String str) {
                                    String it = str;
                                    i.e(it, "it");
                                    lVar2.invoke(it);
                                    return r.f47939a;
                                }
                            };
                            c1086gP.E(objF8);
                        }
                        c1086gP.T(false);
                        TextInputKt.a(null, g10.f3423g, (l) objF8, o.p(c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_workshop_number), new k(null, 3, 6, R.styleable.AppCompatTheme_tooltipFrameBackground), null, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$10
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final r invoke() {
                                list4.get(2).b(7);
                                return r.f47939a;
                            }
                        }, c1086gP, 221184, 1);
                        String strC2 = J4.n.c(aVar3, f12, c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_workshop_address, c1086gP);
                        k kVar2 = new k(null, 0, 7, R.styleable.AppCompatTheme_windowActionModeOverlay);
                        h hVarA3 = u.a(aVar3, list4.get(2));
                        c1086gP.L(1176049467);
                        if (((i11 & 7168) ^ 3072) <= 2048) {
                        }
                        objF9 = c1086gP.f();
                        if (z19) {
                            objF9 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$11$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final r invoke(String str) {
                                    String it = str;
                                    i.e(it, "it");
                                    onWorkshopAddressChange.invoke(it);
                                    return r.f47939a;
                                }
                            };
                            c1086gP.E(objF9);
                        } else {
                            objF9 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$11$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final r invoke(String str) {
                                    String it = str;
                                    i.e(it, "it");
                                    onWorkshopAddressChange.invoke(it);
                                    return r.f47939a;
                                }
                            };
                            c1086gP.E(objF9);
                        }
                        c1086gP.T(false);
                        TextInputKt.a(hVarA3, g10.f3424h, (l) objF9, strC2, kVar2, null, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$12
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final r invoke() {
                                M0 m10 = m7;
                                if (m10 != null) {
                                    m10.b();
                                }
                                nVar.u(false);
                                return r.f47939a;
                            }
                        }, c1086gP, 221184, 0);
                    } else {
                        aVar3 = aVar4;
                    }
                    c1086gP.T(false);
                    Lb.a.a(c1086gP, c0955o.a(true));
                    c1086gP.L(1176050094);
                    if (state.f33045i) {
                        String strP2 = o.p(c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_agree_policy);
                        c1086gP.L(1176050323);
                        z17 = (((57344 & i11) ^ 24576) <= 16384 && c1086gP.K(onPolicyCheckChange)) || (i11 & 24576) == 16384;
                        objF7 = c1086gP.f();
                        if (z17 || objF7 == c0153a) {
                            objF7 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$13$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final r invoke() {
                                    onPolicyCheckChange.invoke();
                                    return r.f47939a;
                                }
                            };
                            c1086gP.E(objF7);
                        }
                        c1086gP.T(false);
                        com.voltasit.obdeleven.presentation.components.d.a(strP2, (Ia.a) objF7, state.f33048m, null, c1086gP, 0, 2);
                        f10 = f11;
                        Lb.a.a(c1086gP, W.e(aVar3, f10));
                    } else {
                        f10 = f11;
                    }
                    c1086gP.T(false);
                    String strP3 = o.p(c1086gP, com.voltasit.obdeleven.R.string.common_save);
                    h hVarD2 = W.d(c0955o.b(aVar3, aVar7), 1.0f);
                    long j = com.voltasit.obdeleven.presentation.e.a.f32287k;
                    c1086gP.L(1176050684);
                    z16 = (((458752 & i11) ^ 196608) <= 131072 && c1086gP.K(onNextClick)) || (i11 & 196608) == 131072;
                    objF6 = c1086gP.f();
                    if (z16 || objF6 == c0153a) {
                        objF6 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$14$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final r invoke() {
                                onNextClick.invoke();
                                return r.f47939a;
                            }
                        };
                        c1086gP.E(objF6);
                    }
                    c1086gP.T(false);
                    com.voltasit.obdeleven.presentation.components.b.a(384, 32, j, (Ia.a) objF6, c1086gP, hVarD2, strP3, state.f33040d, false);
                    Lb.a.a(c1086gP, W.e(aVar3, f10));
                    c1086gP.T(true);
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                SfdPersonalInfoFormScreenKt.i(state, onCountrySelected, onCountrySelectedWithFocus, onCountryDismissRequest, onPhoneCodeSelected, onPhoneCodeDismissRequest, onFirstNameChange, onLastNameChange, onCountryClick, onCountryClickWithFocus, onPhoneCodeClick, onPhoneNumberChange, onWorkshopCodeChange, onWorkshopAddressChange, onPolicyCheckChange, onNextClick, onToggleWorkshopInformationClicked, list4, interfaceC1084f2, b.l(i10 | 1), b.l(i11), i12);
                                return r.f47939a;
                            }
                        };
                    }
                }
                lVar = onPhoneNumberChange;
                if ((i11 & 48) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objF4 = c1086gP.f();
                if (z14) {
                    objF4 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$6$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(String str) {
                            String it = str;
                            i.e(it, "it");
                            lVar.invoke(it);
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF4);
                } else {
                    objF4 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$6$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(String str) {
                            String it = str;
                            i.e(it, "it");
                            lVar.invoke(it);
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF4);
                }
                c1086gP.T(false);
                g(g10.f3421e, (l) objF4, state.f33044h, u.a(aVar4, list4.get(1)), new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$6$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        M0 m10 = m7;
                        if (m10 != null) {
                            m10.b();
                        }
                        nVar.u(false);
                        return r.f47939a;
                    }
                }, c1086gP, 0);
                c1086gP.T(true);
                Lb.a.a(c1086gP, W.e(aVar4, 14));
                c1086gP.L(1176048077);
                if (((3670016 & i11) ^ 1572864) <= 1048576) {
                }
                objF5 = c1086gP.f();
                if (z15) {
                    objF5 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$7$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            onToggleWorkshopInformationClicked.invoke();
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF5);
                } else {
                    objF5 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$7$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            onToggleWorkshopInformationClicked.invoke();
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF5);
                }
                c1086gP.T(false);
                androidx.compose.ui.f.a aVar8 = d.a.f13347n;
                ButtonKt.b((Ia.a) objF5, c0955o.b(aVar4, aVar8), null, androidx.compose.runtime.internal.a.b(748609985, new q<U, InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$8
                    {
                        super(3);
                    }

                    @Override // Ia.q
                    public final r invoke(U u10, InterfaceC1084f interfaceC1084f2, Integer num) {
                        c cVarB;
                        U TextButton = u10;
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        int iIntValue = num.intValue();
                        i.e(TextButton, "$this$TextButton");
                        if ((iIntValue & 81) == 16 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            if (state.f33039c) {
                                cVarB = g.f48678a;
                                if (cVarB == null) {
                                    c.a aVar9 = new c.a("Filled.ExpandLess", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                    EmptyList emptyList = androidx.compose.ui.graphics.vector.i.f13970a;
                                    m0 m0Var = new m0(H.f13495b);
                                    ArrayList arrayList = new ArrayList(32);
                                    arrayList.add(new androidx.compose.ui.graphics.vector.e.f(12.0f, 8.0f));
                                    arrayList.add(new androidx.compose.ui.graphics.vector.e.m(-6.0f, 6.0f));
                                    arrayList.add(new androidx.compose.ui.graphics.vector.e.m(1.41f, 1.41f));
                                    arrayList.add(new androidx.compose.ui.graphics.vector.e.C0157e(12.0f, 10.83f));
                                    arrayList.add(new androidx.compose.ui.graphics.vector.e.m(4.59f, 4.58f));
                                    arrayList.add(new androidx.compose.ui.graphics.vector.e.C0157e(18.0f, 14.0f));
                                    arrayList.add(androidx.compose.ui.graphics.vector.e.b.f13907c);
                                    c.a.a(aVar9, arrayList, m0Var);
                                    cVarB = aVar9.b();
                                    g.f48678a = cVarB;
                                }
                            } else {
                                cVarB = p306z.h.f48679a;
                                if (cVarB == null) {
                                    c.a aVar10 = new c.a("Filled.ExpandMore", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                    EmptyList emptyList2 = androidx.compose.ui.graphics.vector.i.f13970a;
                                    m0 m0Var2 = new m0(H.f13495b);
                                    ArrayList arrayList2 = new ArrayList(32);
                                    arrayList2.add(new androidx.compose.ui.graphics.vector.e.f(16.59f, 8.59f));
                                    arrayList2.add(new androidx.compose.ui.graphics.vector.e.C0157e(12.0f, 13.17f));
                                    arrayList2.add(new androidx.compose.ui.graphics.vector.e.C0157e(7.41f, 8.59f));
                                    arrayList2.add(new androidx.compose.ui.graphics.vector.e.C0157e(6.0f, 10.0f));
                                    arrayList2.add(new androidx.compose.ui.graphics.vector.e.m(6.0f, 6.0f));
                                    arrayList2.add(new androidx.compose.ui.graphics.vector.e.m(6.0f, -6.0f));
                                    arrayList2.add(androidx.compose.ui.graphics.vector.e.b.f13907c);
                                    c.a.a(aVar10, arrayList2, m0Var2);
                                    cVarB = aVar10.b();
                                    p306z.h.f48679a = cVarB;
                                }
                            }
                            h hVar = IconKt.f11757a;
                            IconKt.a(androidx.compose.ui.graphics.vector.k.b(cVarB, interfaceC1084f3), "", h.a.f13984b, H.b(((Number) interfaceC1084f3.x(ContentAlphaKt.f11713a)).floatValue(), ((H) interfaceC1084f3.x(ContentColorKt.f11715a)).f13506a), interfaceC1084f3, 56, 0);
                            TextKt.b(o.p(interfaceC1084f3, com.voltasit.obdeleven.R.string.view_sfd_personal_info_workshop_info), null, com.voltasit.obdeleven.presentation.e.a.f32284g, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 384, 0, 131066);
                        }
                        return r.f47939a;
                    }
                }, c1086gP), c1086gP, 805306368, 508);
                c1086gP.L(1176048636);
                if (state.f33039c) {
                    c1086gP.L(1176048783);
                    if (((i11 & 896) ^ 384) > 256) {
                        aVar3 = aVar4;
                        lVar2 = onWorkshopCodeChange;
                        if (!c1086gP.K(lVar2)) {
                            z18 = true;
                        }
                        objF8 = c1086gP.f();
                        if (z18) {
                            objF8 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$9$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final r invoke(String str) {
                                    String it = str;
                                    i.e(it, "it");
                                    lVar2.invoke(it);
                                    return r.f47939a;
                                }
                            };
                            c1086gP.E(objF8);
                        } else {
                            objF8 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$9$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final r invoke(String str) {
                                    String it = str;
                                    i.e(it, "it");
                                    lVar2.invoke(it);
                                    return r.f47939a;
                                }
                            };
                            c1086gP.E(objF8);
                        }
                        c1086gP.T(false);
                        TextInputKt.a(null, g10.f3423g, (l) objF8, o.p(c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_workshop_number), new k(null, 3, 6, R.styleable.AppCompatTheme_tooltipFrameBackground), null, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$10
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final r invoke() {
                                list4.get(2).b(7);
                                return r.f47939a;
                            }
                        }, c1086gP, 221184, 1);
                        String strC3 = J4.n.c(aVar3, f12, c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_workshop_address, c1086gP);
                        k kVar3 = new k(null, 0, 7, R.styleable.AppCompatTheme_windowActionModeOverlay);
                        h hVarA4 = u.a(aVar3, list4.get(2));
                        c1086gP.L(1176049467);
                        if (((i11 & 7168) ^ 3072) <= 2048) {
                        }
                        objF9 = c1086gP.f();
                        if (z19) {
                            objF9 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$11$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final r invoke(String str) {
                                    String it = str;
                                    i.e(it, "it");
                                    onWorkshopAddressChange.invoke(it);
                                    return r.f47939a;
                                }
                            };
                            c1086gP.E(objF9);
                        } else {
                            objF9 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$11$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final r invoke(String str) {
                                    String it = str;
                                    i.e(it, "it");
                                    onWorkshopAddressChange.invoke(it);
                                    return r.f47939a;
                                }
                            };
                            c1086gP.E(objF9);
                        }
                        c1086gP.T(false);
                        TextInputKt.a(hVarA4, g10.f3424h, (l) objF9, strC3, kVar3, null, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$12
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final r invoke() {
                                M0 m10 = m7;
                                if (m10 != null) {
                                    m10.b();
                                }
                                nVar.u(false);
                                return r.f47939a;
                            }
                        }, c1086gP, 221184, 0);
                    } else {
                        aVar3 = aVar4;
                        lVar2 = onWorkshopCodeChange;
                    }
                    if ((i11 & 384) == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objF8 = c1086gP.f();
                    if (z18) {
                        objF8 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$9$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(String str) {
                                String it = str;
                                i.e(it, "it");
                                lVar2.invoke(it);
                                return r.f47939a;
                            }
                        };
                        c1086gP.E(objF8);
                    } else {
                        objF8 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$9$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(String str) {
                                String it = str;
                                i.e(it, "it");
                                lVar2.invoke(it);
                                return r.f47939a;
                            }
                        };
                        c1086gP.E(objF8);
                    }
                    c1086gP.T(false);
                    TextInputKt.a(null, g10.f3423g, (l) objF8, o.p(c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_workshop_number), new k(null, 3, 6, R.styleable.AppCompatTheme_tooltipFrameBackground), null, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$10
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            list4.get(2).b(7);
                            return r.f47939a;
                        }
                    }, c1086gP, 221184, 1);
                    String strC4 = J4.n.c(aVar3, f12, c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_workshop_address, c1086gP);
                    k kVar4 = new k(null, 0, 7, R.styleable.AppCompatTheme_windowActionModeOverlay);
                    h hVarA5 = u.a(aVar3, list4.get(2));
                    c1086gP.L(1176049467);
                    if (((i11 & 7168) ^ 3072) <= 2048) {
                    }
                    objF9 = c1086gP.f();
                    if (z19) {
                        objF9 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$11$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(String str) {
                                String it = str;
                                i.e(it, "it");
                                onWorkshopAddressChange.invoke(it);
                                return r.f47939a;
                            }
                        };
                        c1086gP.E(objF9);
                    } else {
                        objF9 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$11$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(String str) {
                                String it = str;
                                i.e(it, "it");
                                onWorkshopAddressChange.invoke(it);
                                return r.f47939a;
                            }
                        };
                        c1086gP.E(objF9);
                    }
                    c1086gP.T(false);
                    TextInputKt.a(hVarA5, g10.f3424h, (l) objF9, strC4, kVar4, null, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$12
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            M0 m10 = m7;
                            if (m10 != null) {
                                m10.b();
                            }
                            nVar.u(false);
                            return r.f47939a;
                        }
                    }, c1086gP, 221184, 0);
                } else {
                    aVar3 = aVar4;
                }
                c1086gP.T(false);
                Lb.a.a(c1086gP, c0955o.a(true));
                c1086gP.L(1176050094);
                if (state.f33045i) {
                    String strP4 = o.p(c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_agree_policy);
                    c1086gP.L(1176050323);
                    if (((57344 & i11) ^ 24576) <= 16384) {
                    }
                    objF7 = c1086gP.f();
                    if (z17) {
                        objF7 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$13$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final r invoke() {
                                onPolicyCheckChange.invoke();
                                return r.f47939a;
                            }
                        };
                        c1086gP.E(objF7);
                    } else {
                        objF7 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$13$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final r invoke() {
                                onPolicyCheckChange.invoke();
                                return r.f47939a;
                            }
                        };
                        c1086gP.E(objF7);
                    }
                    c1086gP.T(false);
                    com.voltasit.obdeleven.presentation.components.d.a(strP4, (Ia.a) objF7, state.f33048m, null, c1086gP, 0, 2);
                    f10 = f11;
                    Lb.a.a(c1086gP, W.e(aVar3, f10));
                } else {
                    f10 = f11;
                }
                c1086gP.T(false);
                String strP5 = o.p(c1086gP, com.voltasit.obdeleven.R.string.common_save);
                h hVarD3 = W.d(c0955o.b(aVar3, aVar8), 1.0f);
                long j10 = com.voltasit.obdeleven.presentation.e.a.f32287k;
                c1086gP.L(1176050684);
                if (((458752 & i11) ^ 196608) <= 131072) {
                }
                objF6 = c1086gP.f();
                if (z16) {
                    objF6 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$14$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            onNextClick.invoke();
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF6);
                } else {
                    objF6 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$14$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            onNextClick.invoke();
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF6);
                }
                c1086gP.T(false);
                com.voltasit.obdeleven.presentation.components.b.a(384, 32, j10, (Ia.a) objF6, c1086gP, hVarD3, strP5, state.f33040d, false);
                Lb.a.a(c1086gP, W.e(aVar3, f10));
                c1086gP.T(true);
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            SfdPersonalInfoFormScreenKt.i(state, onCountrySelected, onCountrySelectedWithFocus, onCountryDismissRequest, onPhoneCodeSelected, onPhoneCodeDismissRequest, onFirstNameChange, onLastNameChange, onCountryClick, onCountryClickWithFocus, onPhoneCodeClick, onPhoneNumberChange, onWorkshopCodeChange, onWorkshopAddressChange, onPolicyCheckChange, onNextClick, onToggleWorkshopInformationClicked, list4, interfaceC1084f2, b.l(i10 | 1), b.l(i11), i12);
                            return r.f47939a;
                        }
                    };
                }
            }
            aVar2 = onCountryClick;
            if ((i10 & 100663296) == 67108864) {
                z12 = true;
            } else {
                z12 = false;
            }
            objF2 = c1086gP.f();
            if (z12) {
                objF2 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$5$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        aVar2.invoke();
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF2);
            } else {
                objF2 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$5$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        aVar2.invoke();
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF2);
            }
            c1086gP.T(false);
            a(state.f33038b, (Ia.a) objF2, c1086gP, 0);
            Lb.a.a(c1086gP, W.e(aVar4, f11));
            T tA3 = S.a(C0945e.f10284a, bVar, c1086gP, 0);
            i13 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P4 = c1086gP.P();
            h hVarC4 = ComposedModifierKt.c(c1086gP, aVar4);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar6);
            } else {
                c1086gP.A();
            }
            R0.a(pVar2, c1086gP, tA3);
            R0.a(pVar3, c1086gP, interfaceC1089h0P4);
            if (c1086gP.f12995O) {
                J4.i.d(i13, c1086gP, i13, pVar4);
            } else {
                J4.i.d(i13, c1086gP, i13, pVar4);
            }
            R0.a(pVar5, c1086gP, hVarC4);
            c1086gP.L(1880728288);
            if (((i11 & 14) ^ 6) <= 4) {
            }
            objF3 = c1086gP.f();
            if (z13) {
                objF3 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$6$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        onPhoneCodeClick.invoke();
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF3);
            } else {
                objF3 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$6$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        onPhoneCodeClick.invoke();
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF3);
            }
            c1086gP.T(false);
            f(g10.f3420d, (Ia.a) objF3, c1086gP, 0);
            c1086gP.L(1880728479);
            if (((i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) > 32) {
                lVar = onPhoneNumberChange;
                if (!c1086gP.K(lVar)) {
                    z14 = true;
                }
                objF4 = c1086gP.f();
                if (z14) {
                    objF4 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$6$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(String str) {
                            String it = str;
                            i.e(it, "it");
                            lVar.invoke(it);
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF4);
                } else {
                    objF4 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$6$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(String str) {
                            String it = str;
                            i.e(it, "it");
                            lVar.invoke(it);
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF4);
                }
                c1086gP.T(false);
                g(g10.f3421e, (l) objF4, state.f33044h, u.a(aVar4, list4.get(1)), new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$6$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        M0 m10 = m7;
                        if (m10 != null) {
                            m10.b();
                        }
                        nVar.u(false);
                        return r.f47939a;
                    }
                }, c1086gP, 0);
                c1086gP.T(true);
                Lb.a.a(c1086gP, W.e(aVar4, 14));
                c1086gP.L(1176048077);
                if (((3670016 & i11) ^ 1572864) <= 1048576) {
                }
                objF5 = c1086gP.f();
                if (z15) {
                    objF5 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$7$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            onToggleWorkshopInformationClicked.invoke();
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF5);
                } else {
                    objF5 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$7$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            onToggleWorkshopInformationClicked.invoke();
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF5);
                }
                c1086gP.T(false);
                androidx.compose.ui.f.a aVar9 = d.a.f13347n;
                ButtonKt.b((Ia.a) objF5, c0955o.b(aVar4, aVar9), null, androidx.compose.runtime.internal.a.b(748609985, new q<U, InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$8
                    {
                        super(3);
                    }

                    @Override // Ia.q
                    public final r invoke(U u10, InterfaceC1084f interfaceC1084f2, Integer num) {
                        c cVarB;
                        U TextButton = u10;
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        int iIntValue = num.intValue();
                        i.e(TextButton, "$this$TextButton");
                        if ((iIntValue & 81) == 16 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            if (state.f33039c) {
                                cVarB = g.f48678a;
                                if (cVarB == null) {
                                    c.a aVar10 = new c.a("Filled.ExpandLess", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                    EmptyList emptyList = androidx.compose.ui.graphics.vector.i.f13970a;
                                    m0 m0Var = new m0(H.f13495b);
                                    ArrayList arrayList = new ArrayList(32);
                                    arrayList.add(new androidx.compose.ui.graphics.vector.e.f(12.0f, 8.0f));
                                    arrayList.add(new androidx.compose.ui.graphics.vector.e.m(-6.0f, 6.0f));
                                    arrayList.add(new androidx.compose.ui.graphics.vector.e.m(1.41f, 1.41f));
                                    arrayList.add(new androidx.compose.ui.graphics.vector.e.C0157e(12.0f, 10.83f));
                                    arrayList.add(new androidx.compose.ui.graphics.vector.e.m(4.59f, 4.58f));
                                    arrayList.add(new androidx.compose.ui.graphics.vector.e.C0157e(18.0f, 14.0f));
                                    arrayList.add(androidx.compose.ui.graphics.vector.e.b.f13907c);
                                    c.a.a(aVar10, arrayList, m0Var);
                                    cVarB = aVar10.b();
                                    g.f48678a = cVarB;
                                }
                            } else {
                                cVarB = p306z.h.f48679a;
                                if (cVarB == null) {
                                    c.a aVar11 = new c.a("Filled.ExpandMore", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                    EmptyList emptyList2 = androidx.compose.ui.graphics.vector.i.f13970a;
                                    m0 m0Var2 = new m0(H.f13495b);
                                    ArrayList arrayList2 = new ArrayList(32);
                                    arrayList2.add(new androidx.compose.ui.graphics.vector.e.f(16.59f, 8.59f));
                                    arrayList2.add(new androidx.compose.ui.graphics.vector.e.C0157e(12.0f, 13.17f));
                                    arrayList2.add(new androidx.compose.ui.graphics.vector.e.C0157e(7.41f, 8.59f));
                                    arrayList2.add(new androidx.compose.ui.graphics.vector.e.C0157e(6.0f, 10.0f));
                                    arrayList2.add(new androidx.compose.ui.graphics.vector.e.m(6.0f, 6.0f));
                                    arrayList2.add(new androidx.compose.ui.graphics.vector.e.m(6.0f, -6.0f));
                                    arrayList2.add(androidx.compose.ui.graphics.vector.e.b.f13907c);
                                    c.a.a(aVar11, arrayList2, m0Var2);
                                    cVarB = aVar11.b();
                                    p306z.h.f48679a = cVarB;
                                }
                            }
                            h hVar = IconKt.f11757a;
                            IconKt.a(androidx.compose.ui.graphics.vector.k.b(cVarB, interfaceC1084f3), "", h.a.f13984b, H.b(((Number) interfaceC1084f3.x(ContentAlphaKt.f11713a)).floatValue(), ((H) interfaceC1084f3.x(ContentColorKt.f11715a)).f13506a), interfaceC1084f3, 56, 0);
                            TextKt.b(o.p(interfaceC1084f3, com.voltasit.obdeleven.R.string.view_sfd_personal_info_workshop_info), null, com.voltasit.obdeleven.presentation.e.a.f32284g, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 384, 0, 131066);
                        }
                        return r.f47939a;
                    }
                }, c1086gP), c1086gP, 805306368, 508);
                c1086gP.L(1176048636);
                if (state.f33039c) {
                    c1086gP.L(1176048783);
                    if (((i11 & 896) ^ 384) > 256) {
                        aVar3 = aVar4;
                        lVar2 = onWorkshopCodeChange;
                        if (!c1086gP.K(lVar2)) {
                            z18 = true;
                        }
                        objF8 = c1086gP.f();
                        if (z18) {
                            objF8 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$9$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final r invoke(String str) {
                                    String it = str;
                                    i.e(it, "it");
                                    lVar2.invoke(it);
                                    return r.f47939a;
                                }
                            };
                            c1086gP.E(objF8);
                        } else {
                            objF8 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$9$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final r invoke(String str) {
                                    String it = str;
                                    i.e(it, "it");
                                    lVar2.invoke(it);
                                    return r.f47939a;
                                }
                            };
                            c1086gP.E(objF8);
                        }
                        c1086gP.T(false);
                        TextInputKt.a(null, g10.f3423g, (l) objF8, o.p(c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_workshop_number), new k(null, 3, 6, R.styleable.AppCompatTheme_tooltipFrameBackground), null, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$10
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final r invoke() {
                                list4.get(2).b(7);
                                return r.f47939a;
                            }
                        }, c1086gP, 221184, 1);
                        String strC5 = J4.n.c(aVar3, f12, c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_workshop_address, c1086gP);
                        k kVar5 = new k(null, 0, 7, R.styleable.AppCompatTheme_windowActionModeOverlay);
                        h hVarA6 = u.a(aVar3, list4.get(2));
                        c1086gP.L(1176049467);
                        if (((i11 & 7168) ^ 3072) <= 2048) {
                        }
                        objF9 = c1086gP.f();
                        if (z19) {
                            objF9 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$11$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final r invoke(String str) {
                                    String it = str;
                                    i.e(it, "it");
                                    onWorkshopAddressChange.invoke(it);
                                    return r.f47939a;
                                }
                            };
                            c1086gP.E(objF9);
                        } else {
                            objF9 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$11$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final r invoke(String str) {
                                    String it = str;
                                    i.e(it, "it");
                                    onWorkshopAddressChange.invoke(it);
                                    return r.f47939a;
                                }
                            };
                            c1086gP.E(objF9);
                        }
                        c1086gP.T(false);
                        TextInputKt.a(hVarA6, g10.f3424h, (l) objF9, strC5, kVar5, null, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$12
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final r invoke() {
                                M0 m10 = m7;
                                if (m10 != null) {
                                    m10.b();
                                }
                                nVar.u(false);
                                return r.f47939a;
                            }
                        }, c1086gP, 221184, 0);
                    } else {
                        aVar3 = aVar4;
                        lVar2 = onWorkshopCodeChange;
                    }
                    if ((i11 & 384) == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objF8 = c1086gP.f();
                    if (z18) {
                        objF8 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$9$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(String str) {
                                String it = str;
                                i.e(it, "it");
                                lVar2.invoke(it);
                                return r.f47939a;
                            }
                        };
                        c1086gP.E(objF8);
                    } else {
                        objF8 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$9$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(String str) {
                                String it = str;
                                i.e(it, "it");
                                lVar2.invoke(it);
                                return r.f47939a;
                            }
                        };
                        c1086gP.E(objF8);
                    }
                    c1086gP.T(false);
                    TextInputKt.a(null, g10.f3423g, (l) objF8, o.p(c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_workshop_number), new k(null, 3, 6, R.styleable.AppCompatTheme_tooltipFrameBackground), null, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$10
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            list4.get(2).b(7);
                            return r.f47939a;
                        }
                    }, c1086gP, 221184, 1);
                    String strC6 = J4.n.c(aVar3, f12, c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_workshop_address, c1086gP);
                    k kVar6 = new k(null, 0, 7, R.styleable.AppCompatTheme_windowActionModeOverlay);
                    h hVarA7 = u.a(aVar3, list4.get(2));
                    c1086gP.L(1176049467);
                    if (((i11 & 7168) ^ 3072) <= 2048) {
                    }
                    objF9 = c1086gP.f();
                    if (z19) {
                        objF9 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$11$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(String str) {
                                String it = str;
                                i.e(it, "it");
                                onWorkshopAddressChange.invoke(it);
                                return r.f47939a;
                            }
                        };
                        c1086gP.E(objF9);
                    } else {
                        objF9 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$11$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(String str) {
                                String it = str;
                                i.e(it, "it");
                                onWorkshopAddressChange.invoke(it);
                                return r.f47939a;
                            }
                        };
                        c1086gP.E(objF9);
                    }
                    c1086gP.T(false);
                    TextInputKt.a(hVarA7, g10.f3424h, (l) objF9, strC6, kVar6, null, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$12
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            M0 m10 = m7;
                            if (m10 != null) {
                                m10.b();
                            }
                            nVar.u(false);
                            return r.f47939a;
                        }
                    }, c1086gP, 221184, 0);
                } else {
                    aVar3 = aVar4;
                }
                c1086gP.T(false);
                Lb.a.a(c1086gP, c0955o.a(true));
                c1086gP.L(1176050094);
                if (state.f33045i) {
                    String strP6 = o.p(c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_agree_policy);
                    c1086gP.L(1176050323);
                    if (((57344 & i11) ^ 24576) <= 16384) {
                    }
                    objF7 = c1086gP.f();
                    if (z17) {
                        objF7 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$13$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final r invoke() {
                                onPolicyCheckChange.invoke();
                                return r.f47939a;
                            }
                        };
                        c1086gP.E(objF7);
                    } else {
                        objF7 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$13$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final r invoke() {
                                onPolicyCheckChange.invoke();
                                return r.f47939a;
                            }
                        };
                        c1086gP.E(objF7);
                    }
                    c1086gP.T(false);
                    com.voltasit.obdeleven.presentation.components.d.a(strP6, (Ia.a) objF7, state.f33048m, null, c1086gP, 0, 2);
                    f10 = f11;
                    Lb.a.a(c1086gP, W.e(aVar3, f10));
                } else {
                    f10 = f11;
                }
                c1086gP.T(false);
                String strP7 = o.p(c1086gP, com.voltasit.obdeleven.R.string.common_save);
                h hVarD4 = W.d(c0955o.b(aVar3, aVar9), 1.0f);
                long j11 = com.voltasit.obdeleven.presentation.e.a.f32287k;
                c1086gP.L(1176050684);
                if (((458752 & i11) ^ 196608) <= 131072) {
                }
                objF6 = c1086gP.f();
                if (z16) {
                    objF6 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$14$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            onNextClick.invoke();
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF6);
                } else {
                    objF6 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$14$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            onNextClick.invoke();
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF6);
                }
                c1086gP.T(false);
                com.voltasit.obdeleven.presentation.components.b.a(384, 32, j11, (Ia.a) objF6, c1086gP, hVarD4, strP7, state.f33040d, false);
                Lb.a.a(c1086gP, W.e(aVar3, f10));
                c1086gP.T(true);
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            SfdPersonalInfoFormScreenKt.i(state, onCountrySelected, onCountrySelectedWithFocus, onCountryDismissRequest, onPhoneCodeSelected, onPhoneCodeDismissRequest, onFirstNameChange, onLastNameChange, onCountryClick, onCountryClickWithFocus, onPhoneCodeClick, onPhoneNumberChange, onWorkshopCodeChange, onWorkshopAddressChange, onPolicyCheckChange, onNextClick, onToggleWorkshopInformationClicked, list4, interfaceC1084f2, b.l(i10 | 1), b.l(i11), i12);
                            return r.f47939a;
                        }
                    };
                }
            }
            lVar = onPhoneNumberChange;
            if ((i11 & 48) == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            objF4 = c1086gP.f();
            if (z14) {
                objF4 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$6$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(String str) {
                        String it = str;
                        i.e(it, "it");
                        lVar.invoke(it);
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF4);
            } else {
                objF4 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$6$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(String str) {
                        String it = str;
                        i.e(it, "it");
                        lVar.invoke(it);
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF4);
            }
            c1086gP.T(false);
            g(g10.f3421e, (l) objF4, state.f33044h, u.a(aVar4, list4.get(1)), new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$6$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final r invoke() {
                    M0 m10 = m7;
                    if (m10 != null) {
                        m10.b();
                    }
                    nVar.u(false);
                    return r.f47939a;
                }
            }, c1086gP, 0);
            c1086gP.T(true);
            Lb.a.a(c1086gP, W.e(aVar4, 14));
            c1086gP.L(1176048077);
            if (((3670016 & i11) ^ 1572864) <= 1048576) {
            }
            objF5 = c1086gP.f();
            if (z15) {
                objF5 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$7$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        onToggleWorkshopInformationClicked.invoke();
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF5);
            } else {
                objF5 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$7$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        onToggleWorkshopInformationClicked.invoke();
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF5);
            }
            c1086gP.T(false);
            androidx.compose.ui.f.a aVar10 = d.a.f13347n;
            ButtonKt.b((Ia.a) objF5, c0955o.b(aVar4, aVar10), null, androidx.compose.runtime.internal.a.b(748609985, new q<U, InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$8
                {
                    super(3);
                }

                @Override // Ia.q
                public final r invoke(U u10, InterfaceC1084f interfaceC1084f2, Integer num) {
                    c cVarB;
                    U TextButton = u10;
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    int iIntValue = num.intValue();
                    i.e(TextButton, "$this$TextButton");
                    if ((iIntValue & 81) == 16 && interfaceC1084f3.s()) {
                        interfaceC1084f3.w();
                    } else {
                        if (state.f33039c) {
                            cVarB = g.f48678a;
                            if (cVarB == null) {
                                c.a aVar11 = new c.a("Filled.ExpandLess", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                EmptyList emptyList = androidx.compose.ui.graphics.vector.i.f13970a;
                                m0 m0Var = new m0(H.f13495b);
                                ArrayList arrayList = new ArrayList(32);
                                arrayList.add(new androidx.compose.ui.graphics.vector.e.f(12.0f, 8.0f));
                                arrayList.add(new androidx.compose.ui.graphics.vector.e.m(-6.0f, 6.0f));
                                arrayList.add(new androidx.compose.ui.graphics.vector.e.m(1.41f, 1.41f));
                                arrayList.add(new androidx.compose.ui.graphics.vector.e.C0157e(12.0f, 10.83f));
                                arrayList.add(new androidx.compose.ui.graphics.vector.e.m(4.59f, 4.58f));
                                arrayList.add(new androidx.compose.ui.graphics.vector.e.C0157e(18.0f, 14.0f));
                                arrayList.add(androidx.compose.ui.graphics.vector.e.b.f13907c);
                                c.a.a(aVar11, arrayList, m0Var);
                                cVarB = aVar11.b();
                                g.f48678a = cVarB;
                            }
                        } else {
                            cVarB = p306z.h.f48679a;
                            if (cVarB == null) {
                                c.a aVar12 = new c.a("Filled.ExpandMore", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                EmptyList emptyList2 = androidx.compose.ui.graphics.vector.i.f13970a;
                                m0 m0Var2 = new m0(H.f13495b);
                                ArrayList arrayList2 = new ArrayList(32);
                                arrayList2.add(new androidx.compose.ui.graphics.vector.e.f(16.59f, 8.59f));
                                arrayList2.add(new androidx.compose.ui.graphics.vector.e.C0157e(12.0f, 13.17f));
                                arrayList2.add(new androidx.compose.ui.graphics.vector.e.C0157e(7.41f, 8.59f));
                                arrayList2.add(new androidx.compose.ui.graphics.vector.e.C0157e(6.0f, 10.0f));
                                arrayList2.add(new androidx.compose.ui.graphics.vector.e.m(6.0f, 6.0f));
                                arrayList2.add(new androidx.compose.ui.graphics.vector.e.m(6.0f, -6.0f));
                                arrayList2.add(androidx.compose.ui.graphics.vector.e.b.f13907c);
                                c.a.a(aVar12, arrayList2, m0Var2);
                                cVarB = aVar12.b();
                                p306z.h.f48679a = cVarB;
                            }
                        }
                        h hVar = IconKt.f11757a;
                        IconKt.a(androidx.compose.ui.graphics.vector.k.b(cVarB, interfaceC1084f3), "", h.a.f13984b, H.b(((Number) interfaceC1084f3.x(ContentAlphaKt.f11713a)).floatValue(), ((H) interfaceC1084f3.x(ContentColorKt.f11715a)).f13506a), interfaceC1084f3, 56, 0);
                        TextKt.b(o.p(interfaceC1084f3, com.voltasit.obdeleven.R.string.view_sfd_personal_info_workshop_info), null, com.voltasit.obdeleven.presentation.e.a.f32284g, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 384, 0, 131066);
                    }
                    return r.f47939a;
                }
            }, c1086gP), c1086gP, 805306368, 508);
            c1086gP.L(1176048636);
            if (state.f33039c) {
                c1086gP.L(1176048783);
                if (((i11 & 896) ^ 384) > 256) {
                    aVar3 = aVar4;
                    lVar2 = onWorkshopCodeChange;
                    if (!c1086gP.K(lVar2)) {
                        z18 = true;
                    }
                    objF8 = c1086gP.f();
                    if (z18) {
                        objF8 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$9$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(String str) {
                                String it = str;
                                i.e(it, "it");
                                lVar2.invoke(it);
                                return r.f47939a;
                            }
                        };
                        c1086gP.E(objF8);
                    } else {
                        objF8 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$9$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(String str) {
                                String it = str;
                                i.e(it, "it");
                                lVar2.invoke(it);
                                return r.f47939a;
                            }
                        };
                        c1086gP.E(objF8);
                    }
                    c1086gP.T(false);
                    TextInputKt.a(null, g10.f3423g, (l) objF8, o.p(c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_workshop_number), new k(null, 3, 6, R.styleable.AppCompatTheme_tooltipFrameBackground), null, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$10
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            list4.get(2).b(7);
                            return r.f47939a;
                        }
                    }, c1086gP, 221184, 1);
                    String strC7 = J4.n.c(aVar3, f12, c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_workshop_address, c1086gP);
                    k kVar7 = new k(null, 0, 7, R.styleable.AppCompatTheme_windowActionModeOverlay);
                    h hVarA8 = u.a(aVar3, list4.get(2));
                    c1086gP.L(1176049467);
                    if (((i11 & 7168) ^ 3072) <= 2048) {
                    }
                    objF9 = c1086gP.f();
                    if (z19) {
                        objF9 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$11$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(String str) {
                                String it = str;
                                i.e(it, "it");
                                onWorkshopAddressChange.invoke(it);
                                return r.f47939a;
                            }
                        };
                        c1086gP.E(objF9);
                    } else {
                        objF9 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$11$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(String str) {
                                String it = str;
                                i.e(it, "it");
                                onWorkshopAddressChange.invoke(it);
                                return r.f47939a;
                            }
                        };
                        c1086gP.E(objF9);
                    }
                    c1086gP.T(false);
                    TextInputKt.a(hVarA8, g10.f3424h, (l) objF9, strC7, kVar7, null, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$12
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            M0 m10 = m7;
                            if (m10 != null) {
                                m10.b();
                            }
                            nVar.u(false);
                            return r.f47939a;
                        }
                    }, c1086gP, 221184, 0);
                } else {
                    aVar3 = aVar4;
                    lVar2 = onWorkshopCodeChange;
                }
                if ((i11 & 384) == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objF8 = c1086gP.f();
                if (z18) {
                    objF8 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$9$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(String str) {
                            String it = str;
                            i.e(it, "it");
                            lVar2.invoke(it);
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF8);
                } else {
                    objF8 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$9$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(String str) {
                            String it = str;
                            i.e(it, "it");
                            lVar2.invoke(it);
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF8);
                }
                c1086gP.T(false);
                TextInputKt.a(null, g10.f3423g, (l) objF8, o.p(c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_workshop_number), new k(null, 3, 6, R.styleable.AppCompatTheme_tooltipFrameBackground), null, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$10
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        list4.get(2).b(7);
                        return r.f47939a;
                    }
                }, c1086gP, 221184, 1);
                String strC8 = J4.n.c(aVar3, f12, c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_workshop_address, c1086gP);
                k kVar8 = new k(null, 0, 7, R.styleable.AppCompatTheme_windowActionModeOverlay);
                h hVarA9 = u.a(aVar3, list4.get(2));
                c1086gP.L(1176049467);
                if (((i11 & 7168) ^ 3072) <= 2048) {
                }
                objF9 = c1086gP.f();
                if (z19) {
                    objF9 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$11$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(String str) {
                            String it = str;
                            i.e(it, "it");
                            onWorkshopAddressChange.invoke(it);
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF9);
                } else {
                    objF9 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$11$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(String str) {
                            String it = str;
                            i.e(it, "it");
                            onWorkshopAddressChange.invoke(it);
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF9);
                }
                c1086gP.T(false);
                TextInputKt.a(hVarA9, g10.f3424h, (l) objF9, strC8, kVar8, null, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$12
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        M0 m10 = m7;
                        if (m10 != null) {
                            m10.b();
                        }
                        nVar.u(false);
                        return r.f47939a;
                    }
                }, c1086gP, 221184, 0);
            } else {
                aVar3 = aVar4;
            }
            c1086gP.T(false);
            Lb.a.a(c1086gP, c0955o.a(true));
            c1086gP.L(1176050094);
            if (state.f33045i) {
                String strP8 = o.p(c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_agree_policy);
                c1086gP.L(1176050323);
                if (((57344 & i11) ^ 24576) <= 16384) {
                }
                objF7 = c1086gP.f();
                if (z17) {
                    objF7 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$13$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            onPolicyCheckChange.invoke();
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF7);
                } else {
                    objF7 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$13$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            onPolicyCheckChange.invoke();
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF7);
                }
                c1086gP.T(false);
                com.voltasit.obdeleven.presentation.components.d.a(strP8, (Ia.a) objF7, state.f33048m, null, c1086gP, 0, 2);
                f10 = f11;
                Lb.a.a(c1086gP, W.e(aVar3, f10));
            } else {
                f10 = f11;
            }
            c1086gP.T(false);
            String strP9 = o.p(c1086gP, com.voltasit.obdeleven.R.string.common_save);
            h hVarD5 = W.d(c0955o.b(aVar3, aVar10), 1.0f);
            long j12 = com.voltasit.obdeleven.presentation.e.a.f32287k;
            c1086gP.L(1176050684);
            if (((458752 & i11) ^ 196608) <= 131072) {
            }
            objF6 = c1086gP.f();
            if (z16) {
                objF6 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$14$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        onNextClick.invoke();
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF6);
            } else {
                objF6 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$14$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        onNextClick.invoke();
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF6);
            }
            c1086gP.T(false);
            com.voltasit.obdeleven.presentation.components.b.a(384, 32, j12, (Ia.a) objF6, c1086gP, hVarD5, strP9, state.f33040d, false);
            Lb.a.a(c1086gP, W.e(aVar3, f10));
            c1086gP.T(true);
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        SfdPersonalInfoFormScreenKt.i(state, onCountrySelected, onCountrySelectedWithFocus, onCountryDismissRequest, onPhoneCodeSelected, onPhoneCodeDismissRequest, onFirstNameChange, onLastNameChange, onCountryClick, onCountryClickWithFocus, onPhoneCodeClick, onPhoneNumberChange, onWorkshopCodeChange, onWorkshopAddressChange, onPolicyCheckChange, onNextClick, onToggleWorkshopInformationClicked, list4, interfaceC1084f2, b.l(i10 | 1), b.l(i11), i12);
                        return r.f47939a;
                    }
                };
            }
        }
        aVar = onCountryClickWithFocus;
        if ((i10 & 805306368) == 536870912) {
            z11 = true;
        } else {
            z11 = false;
        }
        objF = c1086gP.f();
        if (z11) {
            objF = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$4$1
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
            objF = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$4$1
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
        TextInputKt.a(hVarA, g10.f3418b, lVar3, strP, kVarA, state.f33043g, (Ia.a) objF, c1086gP, 0, 0);
        Lb.a.a(c1086gP, W.e(aVar4, f12));
        c1086gP.L(1176047178);
        if (((i10 & 234881024) ^ 100663296) > 67108864) {
            aVar2 = onCountryClick;
            if (!c1086gP.K(aVar2)) {
                z12 = true;
            }
            objF2 = c1086gP.f();
            if (z12) {
                objF2 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$5$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        aVar2.invoke();
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF2);
            } else {
                objF2 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$5$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        aVar2.invoke();
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF2);
            }
            c1086gP.T(false);
            a(state.f33038b, (Ia.a) objF2, c1086gP, 0);
            Lb.a.a(c1086gP, W.e(aVar4, f11));
            T tA4 = S.a(C0945e.f10284a, bVar, c1086gP, 0);
            i13 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P5 = c1086gP.P();
            h hVarC5 = ComposedModifierKt.c(c1086gP, aVar4);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar6);
            } else {
                c1086gP.A();
            }
            R0.a(pVar2, c1086gP, tA4);
            R0.a(pVar3, c1086gP, interfaceC1089h0P5);
            if (c1086gP.f12995O) {
                J4.i.d(i13, c1086gP, i13, pVar4);
            } else {
                J4.i.d(i13, c1086gP, i13, pVar4);
            }
            R0.a(pVar5, c1086gP, hVarC5);
            c1086gP.L(1880728288);
            if (((i11 & 14) ^ 6) <= 4) {
            }
            objF3 = c1086gP.f();
            if (z13) {
                objF3 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$6$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        onPhoneCodeClick.invoke();
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF3);
            } else {
                objF3 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$6$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        onPhoneCodeClick.invoke();
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF3);
            }
            c1086gP.T(false);
            f(g10.f3420d, (Ia.a) objF3, c1086gP, 0);
            c1086gP.L(1880728479);
            if (((i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) > 32) {
                lVar = onPhoneNumberChange;
                if (!c1086gP.K(lVar)) {
                    z14 = true;
                }
                objF4 = c1086gP.f();
                if (z14) {
                    objF4 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$6$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(String str) {
                            String it = str;
                            i.e(it, "it");
                            lVar.invoke(it);
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF4);
                } else {
                    objF4 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$6$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(String str) {
                            String it = str;
                            i.e(it, "it");
                            lVar.invoke(it);
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF4);
                }
                c1086gP.T(false);
                g(g10.f3421e, (l) objF4, state.f33044h, u.a(aVar4, list4.get(1)), new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$6$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        M0 m10 = m7;
                        if (m10 != null) {
                            m10.b();
                        }
                        nVar.u(false);
                        return r.f47939a;
                    }
                }, c1086gP, 0);
                c1086gP.T(true);
                Lb.a.a(c1086gP, W.e(aVar4, 14));
                c1086gP.L(1176048077);
                if (((3670016 & i11) ^ 1572864) <= 1048576) {
                }
                objF5 = c1086gP.f();
                if (z15) {
                    objF5 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$7$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            onToggleWorkshopInformationClicked.invoke();
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF5);
                } else {
                    objF5 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$7$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            onToggleWorkshopInformationClicked.invoke();
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF5);
                }
                c1086gP.T(false);
                androidx.compose.ui.f.a aVar11 = d.a.f13347n;
                ButtonKt.b((Ia.a) objF5, c0955o.b(aVar4, aVar11), null, androidx.compose.runtime.internal.a.b(748609985, new q<U, InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$8
                    {
                        super(3);
                    }

                    @Override // Ia.q
                    public final r invoke(U u10, InterfaceC1084f interfaceC1084f2, Integer num) {
                        c cVarB;
                        U TextButton = u10;
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        int iIntValue = num.intValue();
                        i.e(TextButton, "$this$TextButton");
                        if ((iIntValue & 81) == 16 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            if (state.f33039c) {
                                cVarB = g.f48678a;
                                if (cVarB == null) {
                                    c.a aVar12 = new c.a("Filled.ExpandLess", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                    EmptyList emptyList = androidx.compose.ui.graphics.vector.i.f13970a;
                                    m0 m0Var = new m0(H.f13495b);
                                    ArrayList arrayList = new ArrayList(32);
                                    arrayList.add(new androidx.compose.ui.graphics.vector.e.f(12.0f, 8.0f));
                                    arrayList.add(new androidx.compose.ui.graphics.vector.e.m(-6.0f, 6.0f));
                                    arrayList.add(new androidx.compose.ui.graphics.vector.e.m(1.41f, 1.41f));
                                    arrayList.add(new androidx.compose.ui.graphics.vector.e.C0157e(12.0f, 10.83f));
                                    arrayList.add(new androidx.compose.ui.graphics.vector.e.m(4.59f, 4.58f));
                                    arrayList.add(new androidx.compose.ui.graphics.vector.e.C0157e(18.0f, 14.0f));
                                    arrayList.add(androidx.compose.ui.graphics.vector.e.b.f13907c);
                                    c.a.a(aVar12, arrayList, m0Var);
                                    cVarB = aVar12.b();
                                    g.f48678a = cVarB;
                                }
                            } else {
                                cVarB = p306z.h.f48679a;
                                if (cVarB == null) {
                                    c.a aVar13 = new c.a("Filled.ExpandMore", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                    EmptyList emptyList2 = androidx.compose.ui.graphics.vector.i.f13970a;
                                    m0 m0Var2 = new m0(H.f13495b);
                                    ArrayList arrayList2 = new ArrayList(32);
                                    arrayList2.add(new androidx.compose.ui.graphics.vector.e.f(16.59f, 8.59f));
                                    arrayList2.add(new androidx.compose.ui.graphics.vector.e.C0157e(12.0f, 13.17f));
                                    arrayList2.add(new androidx.compose.ui.graphics.vector.e.C0157e(7.41f, 8.59f));
                                    arrayList2.add(new androidx.compose.ui.graphics.vector.e.C0157e(6.0f, 10.0f));
                                    arrayList2.add(new androidx.compose.ui.graphics.vector.e.m(6.0f, 6.0f));
                                    arrayList2.add(new androidx.compose.ui.graphics.vector.e.m(6.0f, -6.0f));
                                    arrayList2.add(androidx.compose.ui.graphics.vector.e.b.f13907c);
                                    c.a.a(aVar13, arrayList2, m0Var2);
                                    cVarB = aVar13.b();
                                    p306z.h.f48679a = cVarB;
                                }
                            }
                            h hVar = IconKt.f11757a;
                            IconKt.a(androidx.compose.ui.graphics.vector.k.b(cVarB, interfaceC1084f3), "", h.a.f13984b, H.b(((Number) interfaceC1084f3.x(ContentAlphaKt.f11713a)).floatValue(), ((H) interfaceC1084f3.x(ContentColorKt.f11715a)).f13506a), interfaceC1084f3, 56, 0);
                            TextKt.b(o.p(interfaceC1084f3, com.voltasit.obdeleven.R.string.view_sfd_personal_info_workshop_info), null, com.voltasit.obdeleven.presentation.e.a.f32284g, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 384, 0, 131066);
                        }
                        return r.f47939a;
                    }
                }, c1086gP), c1086gP, 805306368, 508);
                c1086gP.L(1176048636);
                if (state.f33039c) {
                    c1086gP.L(1176048783);
                    if (((i11 & 896) ^ 384) > 256) {
                        aVar3 = aVar4;
                        lVar2 = onWorkshopCodeChange;
                        if (!c1086gP.K(lVar2)) {
                            z18 = true;
                        }
                        objF8 = c1086gP.f();
                        if (z18) {
                            objF8 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$9$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final r invoke(String str) {
                                    String it = str;
                                    i.e(it, "it");
                                    lVar2.invoke(it);
                                    return r.f47939a;
                                }
                            };
                            c1086gP.E(objF8);
                        } else {
                            objF8 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$9$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final r invoke(String str) {
                                    String it = str;
                                    i.e(it, "it");
                                    lVar2.invoke(it);
                                    return r.f47939a;
                                }
                            };
                            c1086gP.E(objF8);
                        }
                        c1086gP.T(false);
                        TextInputKt.a(null, g10.f3423g, (l) objF8, o.p(c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_workshop_number), new k(null, 3, 6, R.styleable.AppCompatTheme_tooltipFrameBackground), null, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$10
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final r invoke() {
                                list4.get(2).b(7);
                                return r.f47939a;
                            }
                        }, c1086gP, 221184, 1);
                        String strC9 = J4.n.c(aVar3, f12, c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_workshop_address, c1086gP);
                        k kVar9 = new k(null, 0, 7, R.styleable.AppCompatTheme_windowActionModeOverlay);
                        h hVarA10 = u.a(aVar3, list4.get(2));
                        c1086gP.L(1176049467);
                        if (((i11 & 7168) ^ 3072) <= 2048) {
                        }
                        objF9 = c1086gP.f();
                        if (z19) {
                            objF9 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$11$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final r invoke(String str) {
                                    String it = str;
                                    i.e(it, "it");
                                    onWorkshopAddressChange.invoke(it);
                                    return r.f47939a;
                                }
                            };
                            c1086gP.E(objF9);
                        } else {
                            objF9 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$11$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final r invoke(String str) {
                                    String it = str;
                                    i.e(it, "it");
                                    onWorkshopAddressChange.invoke(it);
                                    return r.f47939a;
                                }
                            };
                            c1086gP.E(objF9);
                        }
                        c1086gP.T(false);
                        TextInputKt.a(hVarA10, g10.f3424h, (l) objF9, strC9, kVar9, null, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$12
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final r invoke() {
                                M0 m10 = m7;
                                if (m10 != null) {
                                    m10.b();
                                }
                                nVar.u(false);
                                return r.f47939a;
                            }
                        }, c1086gP, 221184, 0);
                    } else {
                        aVar3 = aVar4;
                        lVar2 = onWorkshopCodeChange;
                    }
                    if ((i11 & 384) == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    objF8 = c1086gP.f();
                    if (z18) {
                        objF8 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$9$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(String str) {
                                String it = str;
                                i.e(it, "it");
                                lVar2.invoke(it);
                                return r.f47939a;
                            }
                        };
                        c1086gP.E(objF8);
                    } else {
                        objF8 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$9$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(String str) {
                                String it = str;
                                i.e(it, "it");
                                lVar2.invoke(it);
                                return r.f47939a;
                            }
                        };
                        c1086gP.E(objF8);
                    }
                    c1086gP.T(false);
                    TextInputKt.a(null, g10.f3423g, (l) objF8, o.p(c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_workshop_number), new k(null, 3, 6, R.styleable.AppCompatTheme_tooltipFrameBackground), null, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$10
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            list4.get(2).b(7);
                            return r.f47939a;
                        }
                    }, c1086gP, 221184, 1);
                    String strC10 = J4.n.c(aVar3, f12, c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_workshop_address, c1086gP);
                    k kVar10 = new k(null, 0, 7, R.styleable.AppCompatTheme_windowActionModeOverlay);
                    h hVarA11 = u.a(aVar3, list4.get(2));
                    c1086gP.L(1176049467);
                    if (((i11 & 7168) ^ 3072) <= 2048) {
                    }
                    objF9 = c1086gP.f();
                    if (z19) {
                        objF9 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$11$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(String str) {
                                String it = str;
                                i.e(it, "it");
                                onWorkshopAddressChange.invoke(it);
                                return r.f47939a;
                            }
                        };
                        c1086gP.E(objF9);
                    } else {
                        objF9 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$11$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(String str) {
                                String it = str;
                                i.e(it, "it");
                                onWorkshopAddressChange.invoke(it);
                                return r.f47939a;
                            }
                        };
                        c1086gP.E(objF9);
                    }
                    c1086gP.T(false);
                    TextInputKt.a(hVarA11, g10.f3424h, (l) objF9, strC10, kVar10, null, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$12
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            M0 m10 = m7;
                            if (m10 != null) {
                                m10.b();
                            }
                            nVar.u(false);
                            return r.f47939a;
                        }
                    }, c1086gP, 221184, 0);
                } else {
                    aVar3 = aVar4;
                }
                c1086gP.T(false);
                Lb.a.a(c1086gP, c0955o.a(true));
                c1086gP.L(1176050094);
                if (state.f33045i) {
                    String strP10 = o.p(c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_agree_policy);
                    c1086gP.L(1176050323);
                    if (((57344 & i11) ^ 24576) <= 16384) {
                    }
                    objF7 = c1086gP.f();
                    if (z17) {
                        objF7 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$13$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final r invoke() {
                                onPolicyCheckChange.invoke();
                                return r.f47939a;
                            }
                        };
                        c1086gP.E(objF7);
                    } else {
                        objF7 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$13$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final r invoke() {
                                onPolicyCheckChange.invoke();
                                return r.f47939a;
                            }
                        };
                        c1086gP.E(objF7);
                    }
                    c1086gP.T(false);
                    com.voltasit.obdeleven.presentation.components.d.a(strP10, (Ia.a) objF7, state.f33048m, null, c1086gP, 0, 2);
                    f10 = f11;
                    Lb.a.a(c1086gP, W.e(aVar3, f10));
                } else {
                    f10 = f11;
                }
                c1086gP.T(false);
                String strP11 = o.p(c1086gP, com.voltasit.obdeleven.R.string.common_save);
                h hVarD6 = W.d(c0955o.b(aVar3, aVar11), 1.0f);
                long j13 = com.voltasit.obdeleven.presentation.e.a.f32287k;
                c1086gP.L(1176050684);
                if (((458752 & i11) ^ 196608) <= 131072) {
                }
                objF6 = c1086gP.f();
                if (z16) {
                    objF6 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$14$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            onNextClick.invoke();
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF6);
                } else {
                    objF6 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$14$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            onNextClick.invoke();
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF6);
                }
                c1086gP.T(false);
                com.voltasit.obdeleven.presentation.components.b.a(384, 32, j13, (Ia.a) objF6, c1086gP, hVarD6, strP11, state.f33040d, false);
                Lb.a.a(c1086gP, W.e(aVar3, f10));
                c1086gP.T(true);
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            SfdPersonalInfoFormScreenKt.i(state, onCountrySelected, onCountrySelectedWithFocus, onCountryDismissRequest, onPhoneCodeSelected, onPhoneCodeDismissRequest, onFirstNameChange, onLastNameChange, onCountryClick, onCountryClickWithFocus, onPhoneCodeClick, onPhoneNumberChange, onWorkshopCodeChange, onWorkshopAddressChange, onPolicyCheckChange, onNextClick, onToggleWorkshopInformationClicked, list4, interfaceC1084f2, b.l(i10 | 1), b.l(i11), i12);
                            return r.f47939a;
                        }
                    };
                }
            }
            lVar = onPhoneNumberChange;
            if ((i11 & 48) == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            objF4 = c1086gP.f();
            if (z14) {
                objF4 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$6$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(String str) {
                        String it = str;
                        i.e(it, "it");
                        lVar.invoke(it);
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF4);
            } else {
                objF4 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$6$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(String str) {
                        String it = str;
                        i.e(it, "it");
                        lVar.invoke(it);
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF4);
            }
            c1086gP.T(false);
            g(g10.f3421e, (l) objF4, state.f33044h, u.a(aVar4, list4.get(1)), new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$6$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final r invoke() {
                    M0 m10 = m7;
                    if (m10 != null) {
                        m10.b();
                    }
                    nVar.u(false);
                    return r.f47939a;
                }
            }, c1086gP, 0);
            c1086gP.T(true);
            Lb.a.a(c1086gP, W.e(aVar4, 14));
            c1086gP.L(1176048077);
            if (((3670016 & i11) ^ 1572864) <= 1048576) {
            }
            objF5 = c1086gP.f();
            if (z15) {
                objF5 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$7$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        onToggleWorkshopInformationClicked.invoke();
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF5);
            } else {
                objF5 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$7$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        onToggleWorkshopInformationClicked.invoke();
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF5);
            }
            c1086gP.T(false);
            androidx.compose.ui.f.a aVar12 = d.a.f13347n;
            ButtonKt.b((Ia.a) objF5, c0955o.b(aVar4, aVar12), null, androidx.compose.runtime.internal.a.b(748609985, new q<U, InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$8
                {
                    super(3);
                }

                @Override // Ia.q
                public final r invoke(U u10, InterfaceC1084f interfaceC1084f2, Integer num) {
                    c cVarB;
                    U TextButton = u10;
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    int iIntValue = num.intValue();
                    i.e(TextButton, "$this$TextButton");
                    if ((iIntValue & 81) == 16 && interfaceC1084f3.s()) {
                        interfaceC1084f3.w();
                    } else {
                        if (state.f33039c) {
                            cVarB = g.f48678a;
                            if (cVarB == null) {
                                c.a aVar13 = new c.a("Filled.ExpandLess", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                EmptyList emptyList = androidx.compose.ui.graphics.vector.i.f13970a;
                                m0 m0Var = new m0(H.f13495b);
                                ArrayList arrayList = new ArrayList(32);
                                arrayList.add(new androidx.compose.ui.graphics.vector.e.f(12.0f, 8.0f));
                                arrayList.add(new androidx.compose.ui.graphics.vector.e.m(-6.0f, 6.0f));
                                arrayList.add(new androidx.compose.ui.graphics.vector.e.m(1.41f, 1.41f));
                                arrayList.add(new androidx.compose.ui.graphics.vector.e.C0157e(12.0f, 10.83f));
                                arrayList.add(new androidx.compose.ui.graphics.vector.e.m(4.59f, 4.58f));
                                arrayList.add(new androidx.compose.ui.graphics.vector.e.C0157e(18.0f, 14.0f));
                                arrayList.add(androidx.compose.ui.graphics.vector.e.b.f13907c);
                                c.a.a(aVar13, arrayList, m0Var);
                                cVarB = aVar13.b();
                                g.f48678a = cVarB;
                            }
                        } else {
                            cVarB = p306z.h.f48679a;
                            if (cVarB == null) {
                                c.a aVar14 = new c.a("Filled.ExpandMore", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                EmptyList emptyList2 = androidx.compose.ui.graphics.vector.i.f13970a;
                                m0 m0Var2 = new m0(H.f13495b);
                                ArrayList arrayList2 = new ArrayList(32);
                                arrayList2.add(new androidx.compose.ui.graphics.vector.e.f(16.59f, 8.59f));
                                arrayList2.add(new androidx.compose.ui.graphics.vector.e.C0157e(12.0f, 13.17f));
                                arrayList2.add(new androidx.compose.ui.graphics.vector.e.C0157e(7.41f, 8.59f));
                                arrayList2.add(new androidx.compose.ui.graphics.vector.e.C0157e(6.0f, 10.0f));
                                arrayList2.add(new androidx.compose.ui.graphics.vector.e.m(6.0f, 6.0f));
                                arrayList2.add(new androidx.compose.ui.graphics.vector.e.m(6.0f, -6.0f));
                                arrayList2.add(androidx.compose.ui.graphics.vector.e.b.f13907c);
                                c.a.a(aVar14, arrayList2, m0Var2);
                                cVarB = aVar14.b();
                                p306z.h.f48679a = cVarB;
                            }
                        }
                        h hVar = IconKt.f11757a;
                        IconKt.a(androidx.compose.ui.graphics.vector.k.b(cVarB, interfaceC1084f3), "", h.a.f13984b, H.b(((Number) interfaceC1084f3.x(ContentAlphaKt.f11713a)).floatValue(), ((H) interfaceC1084f3.x(ContentColorKt.f11715a)).f13506a), interfaceC1084f3, 56, 0);
                        TextKt.b(o.p(interfaceC1084f3, com.voltasit.obdeleven.R.string.view_sfd_personal_info_workshop_info), null, com.voltasit.obdeleven.presentation.e.a.f32284g, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 384, 0, 131066);
                    }
                    return r.f47939a;
                }
            }, c1086gP), c1086gP, 805306368, 508);
            c1086gP.L(1176048636);
            if (state.f33039c) {
                c1086gP.L(1176048783);
                if (((i11 & 896) ^ 384) > 256) {
                    aVar3 = aVar4;
                    lVar2 = onWorkshopCodeChange;
                    if (!c1086gP.K(lVar2)) {
                        z18 = true;
                    }
                    objF8 = c1086gP.f();
                    if (z18) {
                        objF8 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$9$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(String str) {
                                String it = str;
                                i.e(it, "it");
                                lVar2.invoke(it);
                                return r.f47939a;
                            }
                        };
                        c1086gP.E(objF8);
                    } else {
                        objF8 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$9$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(String str) {
                                String it = str;
                                i.e(it, "it");
                                lVar2.invoke(it);
                                return r.f47939a;
                            }
                        };
                        c1086gP.E(objF8);
                    }
                    c1086gP.T(false);
                    TextInputKt.a(null, g10.f3423g, (l) objF8, o.p(c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_workshop_number), new k(null, 3, 6, R.styleable.AppCompatTheme_tooltipFrameBackground), null, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$10
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            list4.get(2).b(7);
                            return r.f47939a;
                        }
                    }, c1086gP, 221184, 1);
                    String strC11 = J4.n.c(aVar3, f12, c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_workshop_address, c1086gP);
                    k kVar11 = new k(null, 0, 7, R.styleable.AppCompatTheme_windowActionModeOverlay);
                    h hVarA12 = u.a(aVar3, list4.get(2));
                    c1086gP.L(1176049467);
                    if (((i11 & 7168) ^ 3072) <= 2048) {
                    }
                    objF9 = c1086gP.f();
                    if (z19) {
                        objF9 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$11$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(String str) {
                                String it = str;
                                i.e(it, "it");
                                onWorkshopAddressChange.invoke(it);
                                return r.f47939a;
                            }
                        };
                        c1086gP.E(objF9);
                    } else {
                        objF9 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$11$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(String str) {
                                String it = str;
                                i.e(it, "it");
                                onWorkshopAddressChange.invoke(it);
                                return r.f47939a;
                            }
                        };
                        c1086gP.E(objF9);
                    }
                    c1086gP.T(false);
                    TextInputKt.a(hVarA12, g10.f3424h, (l) objF9, strC11, kVar11, null, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$12
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            M0 m10 = m7;
                            if (m10 != null) {
                                m10.b();
                            }
                            nVar.u(false);
                            return r.f47939a;
                        }
                    }, c1086gP, 221184, 0);
                } else {
                    aVar3 = aVar4;
                    lVar2 = onWorkshopCodeChange;
                }
                if ((i11 & 384) == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objF8 = c1086gP.f();
                if (z18) {
                    objF8 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$9$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(String str) {
                            String it = str;
                            i.e(it, "it");
                            lVar2.invoke(it);
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF8);
                } else {
                    objF8 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$9$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(String str) {
                            String it = str;
                            i.e(it, "it");
                            lVar2.invoke(it);
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF8);
                }
                c1086gP.T(false);
                TextInputKt.a(null, g10.f3423g, (l) objF8, o.p(c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_workshop_number), new k(null, 3, 6, R.styleable.AppCompatTheme_tooltipFrameBackground), null, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$10
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        list4.get(2).b(7);
                        return r.f47939a;
                    }
                }, c1086gP, 221184, 1);
                String strC12 = J4.n.c(aVar3, f12, c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_workshop_address, c1086gP);
                k kVar12 = new k(null, 0, 7, R.styleable.AppCompatTheme_windowActionModeOverlay);
                h hVarA13 = u.a(aVar3, list4.get(2));
                c1086gP.L(1176049467);
                if (((i11 & 7168) ^ 3072) <= 2048) {
                }
                objF9 = c1086gP.f();
                if (z19) {
                    objF9 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$11$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(String str) {
                            String it = str;
                            i.e(it, "it");
                            onWorkshopAddressChange.invoke(it);
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF9);
                } else {
                    objF9 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$11$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(String str) {
                            String it = str;
                            i.e(it, "it");
                            onWorkshopAddressChange.invoke(it);
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF9);
                }
                c1086gP.T(false);
                TextInputKt.a(hVarA13, g10.f3424h, (l) objF9, strC12, kVar12, null, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$12
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        M0 m10 = m7;
                        if (m10 != null) {
                            m10.b();
                        }
                        nVar.u(false);
                        return r.f47939a;
                    }
                }, c1086gP, 221184, 0);
            } else {
                aVar3 = aVar4;
            }
            c1086gP.T(false);
            Lb.a.a(c1086gP, c0955o.a(true));
            c1086gP.L(1176050094);
            if (state.f33045i) {
                String strP12 = o.p(c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_agree_policy);
                c1086gP.L(1176050323);
                if (((57344 & i11) ^ 24576) <= 16384) {
                }
                objF7 = c1086gP.f();
                if (z17) {
                    objF7 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$13$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            onPolicyCheckChange.invoke();
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF7);
                } else {
                    objF7 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$13$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            onPolicyCheckChange.invoke();
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF7);
                }
                c1086gP.T(false);
                com.voltasit.obdeleven.presentation.components.d.a(strP12, (Ia.a) objF7, state.f33048m, null, c1086gP, 0, 2);
                f10 = f11;
                Lb.a.a(c1086gP, W.e(aVar3, f10));
            } else {
                f10 = f11;
            }
            c1086gP.T(false);
            String strP13 = o.p(c1086gP, com.voltasit.obdeleven.R.string.common_save);
            h hVarD7 = W.d(c0955o.b(aVar3, aVar12), 1.0f);
            long j14 = com.voltasit.obdeleven.presentation.e.a.f32287k;
            c1086gP.L(1176050684);
            if (((458752 & i11) ^ 196608) <= 131072) {
            }
            objF6 = c1086gP.f();
            if (z16) {
                objF6 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$14$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        onNextClick.invoke();
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF6);
            } else {
                objF6 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$14$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        onNextClick.invoke();
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF6);
            }
            c1086gP.T(false);
            com.voltasit.obdeleven.presentation.components.b.a(384, 32, j14, (Ia.a) objF6, c1086gP, hVarD7, strP13, state.f33040d, false);
            Lb.a.a(c1086gP, W.e(aVar3, f10));
            c1086gP.T(true);
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        SfdPersonalInfoFormScreenKt.i(state, onCountrySelected, onCountrySelectedWithFocus, onCountryDismissRequest, onPhoneCodeSelected, onPhoneCodeDismissRequest, onFirstNameChange, onLastNameChange, onCountryClick, onCountryClickWithFocus, onPhoneCodeClick, onPhoneNumberChange, onWorkshopCodeChange, onWorkshopAddressChange, onPolicyCheckChange, onNextClick, onToggleWorkshopInformationClicked, list4, interfaceC1084f2, b.l(i10 | 1), b.l(i11), i12);
                        return r.f47939a;
                    }
                };
            }
        }
        aVar2 = onCountryClick;
        if ((i10 & 100663296) == 67108864) {
            z12 = true;
        } else {
            z12 = false;
        }
        objF2 = c1086gP.f();
        if (z12) {
            objF2 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$5$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final r invoke() {
                    aVar2.invoke();
                    return r.f47939a;
                }
            };
            c1086gP.E(objF2);
        } else {
            objF2 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$5$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final r invoke() {
                    aVar2.invoke();
                    return r.f47939a;
                }
            };
            c1086gP.E(objF2);
        }
        c1086gP.T(false);
        a(state.f33038b, (Ia.a) objF2, c1086gP, 0);
        Lb.a.a(c1086gP, W.e(aVar4, f11));
        T tA5 = S.a(C0945e.f10284a, bVar, c1086gP, 0);
        i13 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P6 = c1086gP.P();
        h hVarC6 = ComposedModifierKt.c(c1086gP, aVar4);
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar6);
        } else {
            c1086gP.A();
        }
        R0.a(pVar2, c1086gP, tA5);
        R0.a(pVar3, c1086gP, interfaceC1089h0P6);
        if (c1086gP.f12995O) {
            J4.i.d(i13, c1086gP, i13, pVar4);
        } else {
            J4.i.d(i13, c1086gP, i13, pVar4);
        }
        R0.a(pVar5, c1086gP, hVarC6);
        c1086gP.L(1880728288);
        if (((i11 & 14) ^ 6) <= 4) {
        }
        objF3 = c1086gP.f();
        if (z13) {
            objF3 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$6$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final r invoke() {
                    onPhoneCodeClick.invoke();
                    return r.f47939a;
                }
            };
            c1086gP.E(objF3);
        } else {
            objF3 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$6$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final r invoke() {
                    onPhoneCodeClick.invoke();
                    return r.f47939a;
                }
            };
            c1086gP.E(objF3);
        }
        c1086gP.T(false);
        f(g10.f3420d, (Ia.a) objF3, c1086gP, 0);
        c1086gP.L(1880728479);
        if (((i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) > 32) {
            lVar = onPhoneNumberChange;
            if (!c1086gP.K(lVar)) {
                z14 = true;
            }
            objF4 = c1086gP.f();
            if (z14) {
                objF4 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$6$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(String str) {
                        String it = str;
                        i.e(it, "it");
                        lVar.invoke(it);
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF4);
            } else {
                objF4 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$6$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(String str) {
                        String it = str;
                        i.e(it, "it");
                        lVar.invoke(it);
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF4);
            }
            c1086gP.T(false);
            g(g10.f3421e, (l) objF4, state.f33044h, u.a(aVar4, list4.get(1)), new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$6$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final r invoke() {
                    M0 m10 = m7;
                    if (m10 != null) {
                        m10.b();
                    }
                    nVar.u(false);
                    return r.f47939a;
                }
            }, c1086gP, 0);
            c1086gP.T(true);
            Lb.a.a(c1086gP, W.e(aVar4, 14));
            c1086gP.L(1176048077);
            if (((3670016 & i11) ^ 1572864) <= 1048576) {
            }
            objF5 = c1086gP.f();
            if (z15) {
                objF5 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$7$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        onToggleWorkshopInformationClicked.invoke();
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF5);
            } else {
                objF5 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$7$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        onToggleWorkshopInformationClicked.invoke();
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF5);
            }
            c1086gP.T(false);
            androidx.compose.ui.f.a aVar13 = d.a.f13347n;
            ButtonKt.b((Ia.a) objF5, c0955o.b(aVar4, aVar13), null, androidx.compose.runtime.internal.a.b(748609985, new q<U, InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$8
                {
                    super(3);
                }

                @Override // Ia.q
                public final r invoke(U u10, InterfaceC1084f interfaceC1084f2, Integer num) {
                    c cVarB;
                    U TextButton = u10;
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    int iIntValue = num.intValue();
                    i.e(TextButton, "$this$TextButton");
                    if ((iIntValue & 81) == 16 && interfaceC1084f3.s()) {
                        interfaceC1084f3.w();
                    } else {
                        if (state.f33039c) {
                            cVarB = g.f48678a;
                            if (cVarB == null) {
                                c.a aVar14 = new c.a("Filled.ExpandLess", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                EmptyList emptyList = androidx.compose.ui.graphics.vector.i.f13970a;
                                m0 m0Var = new m0(H.f13495b);
                                ArrayList arrayList = new ArrayList(32);
                                arrayList.add(new androidx.compose.ui.graphics.vector.e.f(12.0f, 8.0f));
                                arrayList.add(new androidx.compose.ui.graphics.vector.e.m(-6.0f, 6.0f));
                                arrayList.add(new androidx.compose.ui.graphics.vector.e.m(1.41f, 1.41f));
                                arrayList.add(new androidx.compose.ui.graphics.vector.e.C0157e(12.0f, 10.83f));
                                arrayList.add(new androidx.compose.ui.graphics.vector.e.m(4.59f, 4.58f));
                                arrayList.add(new androidx.compose.ui.graphics.vector.e.C0157e(18.0f, 14.0f));
                                arrayList.add(androidx.compose.ui.graphics.vector.e.b.f13907c);
                                c.a.a(aVar14, arrayList, m0Var);
                                cVarB = aVar14.b();
                                g.f48678a = cVarB;
                            }
                        } else {
                            cVarB = p306z.h.f48679a;
                            if (cVarB == null) {
                                c.a aVar15 = new c.a("Filled.ExpandMore", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                EmptyList emptyList2 = androidx.compose.ui.graphics.vector.i.f13970a;
                                m0 m0Var2 = new m0(H.f13495b);
                                ArrayList arrayList2 = new ArrayList(32);
                                arrayList2.add(new androidx.compose.ui.graphics.vector.e.f(16.59f, 8.59f));
                                arrayList2.add(new androidx.compose.ui.graphics.vector.e.C0157e(12.0f, 13.17f));
                                arrayList2.add(new androidx.compose.ui.graphics.vector.e.C0157e(7.41f, 8.59f));
                                arrayList2.add(new androidx.compose.ui.graphics.vector.e.C0157e(6.0f, 10.0f));
                                arrayList2.add(new androidx.compose.ui.graphics.vector.e.m(6.0f, 6.0f));
                                arrayList2.add(new androidx.compose.ui.graphics.vector.e.m(6.0f, -6.0f));
                                arrayList2.add(androidx.compose.ui.graphics.vector.e.b.f13907c);
                                c.a.a(aVar15, arrayList2, m0Var2);
                                cVarB = aVar15.b();
                                p306z.h.f48679a = cVarB;
                            }
                        }
                        h hVar = IconKt.f11757a;
                        IconKt.a(androidx.compose.ui.graphics.vector.k.b(cVarB, interfaceC1084f3), "", h.a.f13984b, H.b(((Number) interfaceC1084f3.x(ContentAlphaKt.f11713a)).floatValue(), ((H) interfaceC1084f3.x(ContentColorKt.f11715a)).f13506a), interfaceC1084f3, 56, 0);
                        TextKt.b(o.p(interfaceC1084f3, com.voltasit.obdeleven.R.string.view_sfd_personal_info_workshop_info), null, com.voltasit.obdeleven.presentation.e.a.f32284g, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 384, 0, 131066);
                    }
                    return r.f47939a;
                }
            }, c1086gP), c1086gP, 805306368, 508);
            c1086gP.L(1176048636);
            if (state.f33039c) {
                c1086gP.L(1176048783);
                if (((i11 & 896) ^ 384) > 256) {
                    aVar3 = aVar4;
                    lVar2 = onWorkshopCodeChange;
                    if (!c1086gP.K(lVar2)) {
                        z18 = true;
                    }
                    objF8 = c1086gP.f();
                    if (z18) {
                        objF8 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$9$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(String str) {
                                String it = str;
                                i.e(it, "it");
                                lVar2.invoke(it);
                                return r.f47939a;
                            }
                        };
                        c1086gP.E(objF8);
                    } else {
                        objF8 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$9$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(String str) {
                                String it = str;
                                i.e(it, "it");
                                lVar2.invoke(it);
                                return r.f47939a;
                            }
                        };
                        c1086gP.E(objF8);
                    }
                    c1086gP.T(false);
                    TextInputKt.a(null, g10.f3423g, (l) objF8, o.p(c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_workshop_number), new k(null, 3, 6, R.styleable.AppCompatTheme_tooltipFrameBackground), null, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$10
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            list4.get(2).b(7);
                            return r.f47939a;
                        }
                    }, c1086gP, 221184, 1);
                    String strC13 = J4.n.c(aVar3, f12, c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_workshop_address, c1086gP);
                    k kVar13 = new k(null, 0, 7, R.styleable.AppCompatTheme_windowActionModeOverlay);
                    h hVarA14 = u.a(aVar3, list4.get(2));
                    c1086gP.L(1176049467);
                    if (((i11 & 7168) ^ 3072) <= 2048) {
                    }
                    objF9 = c1086gP.f();
                    if (z19) {
                        objF9 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$11$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(String str) {
                                String it = str;
                                i.e(it, "it");
                                onWorkshopAddressChange.invoke(it);
                                return r.f47939a;
                            }
                        };
                        c1086gP.E(objF9);
                    } else {
                        objF9 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$11$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final r invoke(String str) {
                                String it = str;
                                i.e(it, "it");
                                onWorkshopAddressChange.invoke(it);
                                return r.f47939a;
                            }
                        };
                        c1086gP.E(objF9);
                    }
                    c1086gP.T(false);
                    TextInputKt.a(hVarA14, g10.f3424h, (l) objF9, strC13, kVar13, null, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$12
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            M0 m10 = m7;
                            if (m10 != null) {
                                m10.b();
                            }
                            nVar.u(false);
                            return r.f47939a;
                        }
                    }, c1086gP, 221184, 0);
                } else {
                    aVar3 = aVar4;
                    lVar2 = onWorkshopCodeChange;
                }
                if ((i11 & 384) == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objF8 = c1086gP.f();
                if (z18) {
                    objF8 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$9$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(String str) {
                            String it = str;
                            i.e(it, "it");
                            lVar2.invoke(it);
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF8);
                } else {
                    objF8 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$9$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(String str) {
                            String it = str;
                            i.e(it, "it");
                            lVar2.invoke(it);
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF8);
                }
                c1086gP.T(false);
                TextInputKt.a(null, g10.f3423g, (l) objF8, o.p(c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_workshop_number), new k(null, 3, 6, R.styleable.AppCompatTheme_tooltipFrameBackground), null, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$10
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        list4.get(2).b(7);
                        return r.f47939a;
                    }
                }, c1086gP, 221184, 1);
                String strC14 = J4.n.c(aVar3, f12, c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_workshop_address, c1086gP);
                k kVar14 = new k(null, 0, 7, R.styleable.AppCompatTheme_windowActionModeOverlay);
                h hVarA15 = u.a(aVar3, list4.get(2));
                c1086gP.L(1176049467);
                if (((i11 & 7168) ^ 3072) <= 2048) {
                }
                objF9 = c1086gP.f();
                if (z19) {
                    objF9 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$11$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(String str) {
                            String it = str;
                            i.e(it, "it");
                            onWorkshopAddressChange.invoke(it);
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF9);
                } else {
                    objF9 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$11$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(String str) {
                            String it = str;
                            i.e(it, "it");
                            onWorkshopAddressChange.invoke(it);
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF9);
                }
                c1086gP.T(false);
                TextInputKt.a(hVarA15, g10.f3424h, (l) objF9, strC14, kVar14, null, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$12
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        M0 m10 = m7;
                        if (m10 != null) {
                            m10.b();
                        }
                        nVar.u(false);
                        return r.f47939a;
                    }
                }, c1086gP, 221184, 0);
            } else {
                aVar3 = aVar4;
            }
            c1086gP.T(false);
            Lb.a.a(c1086gP, c0955o.a(true));
            c1086gP.L(1176050094);
            if (state.f33045i) {
                String strP14 = o.p(c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_agree_policy);
                c1086gP.L(1176050323);
                if (((57344 & i11) ^ 24576) <= 16384) {
                }
                objF7 = c1086gP.f();
                if (z17) {
                    objF7 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$13$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            onPolicyCheckChange.invoke();
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF7);
                } else {
                    objF7 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$13$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final r invoke() {
                            onPolicyCheckChange.invoke();
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF7);
                }
                c1086gP.T(false);
                com.voltasit.obdeleven.presentation.components.d.a(strP14, (Ia.a) objF7, state.f33048m, null, c1086gP, 0, 2);
                f10 = f11;
                Lb.a.a(c1086gP, W.e(aVar3, f10));
            } else {
                f10 = f11;
            }
            c1086gP.T(false);
            String strP15 = o.p(c1086gP, com.voltasit.obdeleven.R.string.common_save);
            h hVarD8 = W.d(c0955o.b(aVar3, aVar13), 1.0f);
            long j15 = com.voltasit.obdeleven.presentation.e.a.f32287k;
            c1086gP.L(1176050684);
            if (((458752 & i11) ^ 196608) <= 131072) {
            }
            objF6 = c1086gP.f();
            if (z16) {
                objF6 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$14$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        onNextClick.invoke();
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF6);
            } else {
                objF6 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$14$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        onNextClick.invoke();
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF6);
            }
            c1086gP.T(false);
            com.voltasit.obdeleven.presentation.components.b.a(384, 32, j15, (Ia.a) objF6, c1086gP, hVarD8, strP15, state.f33040d, false);
            Lb.a.a(c1086gP, W.e(aVar3, f10));
            c1086gP.T(true);
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        SfdPersonalInfoFormScreenKt.i(state, onCountrySelected, onCountrySelectedWithFocus, onCountryDismissRequest, onPhoneCodeSelected, onPhoneCodeDismissRequest, onFirstNameChange, onLastNameChange, onCountryClick, onCountryClickWithFocus, onPhoneCodeClick, onPhoneNumberChange, onWorkshopCodeChange, onWorkshopAddressChange, onPolicyCheckChange, onNextClick, onToggleWorkshopInformationClicked, list4, interfaceC1084f2, b.l(i10 | 1), b.l(i11), i12);
                        return r.f47939a;
                    }
                };
            }
        }
        lVar = onPhoneNumberChange;
        if ((i11 & 48) == 32) {
            z14 = true;
        } else {
            z14 = false;
        }
        objF4 = c1086gP.f();
        if (z14) {
            objF4 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$6$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // Ia.l
                public final r invoke(String str) {
                    String it = str;
                    i.e(it, "it");
                    lVar.invoke(it);
                    return r.f47939a;
                }
            };
            c1086gP.E(objF4);
        } else {
            objF4 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$6$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // Ia.l
                public final r invoke(String str) {
                    String it = str;
                    i.e(it, "it");
                    lVar.invoke(it);
                    return r.f47939a;
                }
            };
            c1086gP.E(objF4);
        }
        c1086gP.T(false);
        g(g10.f3421e, (l) objF4, state.f33044h, u.a(aVar4, list4.get(1)), new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$6$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final r invoke() {
                M0 m10 = m7;
                if (m10 != null) {
                    m10.b();
                }
                nVar.u(false);
                return r.f47939a;
            }
        }, c1086gP, 0);
        c1086gP.T(true);
        Lb.a.a(c1086gP, W.e(aVar4, 14));
        c1086gP.L(1176048077);
        if (((3670016 & i11) ^ 1572864) <= 1048576) {
        }
        objF5 = c1086gP.f();
        if (z15) {
            objF5 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$7$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final r invoke() {
                    onToggleWorkshopInformationClicked.invoke();
                    return r.f47939a;
                }
            };
            c1086gP.E(objF5);
        } else {
            objF5 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$7$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final r invoke() {
                    onToggleWorkshopInformationClicked.invoke();
                    return r.f47939a;
                }
            };
            c1086gP.E(objF5);
        }
        c1086gP.T(false);
        androidx.compose.ui.f.a aVar14 = d.a.f13347n;
        ButtonKt.b((Ia.a) objF5, c0955o.b(aVar4, aVar14), null, androidx.compose.runtime.internal.a.b(748609985, new q<U, InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$8
            {
                super(3);
            }

            @Override // Ia.q
            public final r invoke(U u10, InterfaceC1084f interfaceC1084f2, Integer num) {
                c cVarB;
                U TextButton = u10;
                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                int iIntValue = num.intValue();
                i.e(TextButton, "$this$TextButton");
                if ((iIntValue & 81) == 16 && interfaceC1084f3.s()) {
                    interfaceC1084f3.w();
                } else {
                    if (state.f33039c) {
                        cVarB = g.f48678a;
                        if (cVarB == null) {
                            c.a aVar15 = new c.a("Filled.ExpandLess", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            EmptyList emptyList = androidx.compose.ui.graphics.vector.i.f13970a;
                            m0 m0Var = new m0(H.f13495b);
                            ArrayList arrayList = new ArrayList(32);
                            arrayList.add(new androidx.compose.ui.graphics.vector.e.f(12.0f, 8.0f));
                            arrayList.add(new androidx.compose.ui.graphics.vector.e.m(-6.0f, 6.0f));
                            arrayList.add(new androidx.compose.ui.graphics.vector.e.m(1.41f, 1.41f));
                            arrayList.add(new androidx.compose.ui.graphics.vector.e.C0157e(12.0f, 10.83f));
                            arrayList.add(new androidx.compose.ui.graphics.vector.e.m(4.59f, 4.58f));
                            arrayList.add(new androidx.compose.ui.graphics.vector.e.C0157e(18.0f, 14.0f));
                            arrayList.add(androidx.compose.ui.graphics.vector.e.b.f13907c);
                            c.a.a(aVar15, arrayList, m0Var);
                            cVarB = aVar15.b();
                            g.f48678a = cVarB;
                        }
                    } else {
                        cVarB = p306z.h.f48679a;
                        if (cVarB == null) {
                            c.a aVar16 = new c.a("Filled.ExpandMore", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            EmptyList emptyList2 = androidx.compose.ui.graphics.vector.i.f13970a;
                            m0 m0Var2 = new m0(H.f13495b);
                            ArrayList arrayList2 = new ArrayList(32);
                            arrayList2.add(new androidx.compose.ui.graphics.vector.e.f(16.59f, 8.59f));
                            arrayList2.add(new androidx.compose.ui.graphics.vector.e.C0157e(12.0f, 13.17f));
                            arrayList2.add(new androidx.compose.ui.graphics.vector.e.C0157e(7.41f, 8.59f));
                            arrayList2.add(new androidx.compose.ui.graphics.vector.e.C0157e(6.0f, 10.0f));
                            arrayList2.add(new androidx.compose.ui.graphics.vector.e.m(6.0f, 6.0f));
                            arrayList2.add(new androidx.compose.ui.graphics.vector.e.m(6.0f, -6.0f));
                            arrayList2.add(androidx.compose.ui.graphics.vector.e.b.f13907c);
                            c.a.a(aVar16, arrayList2, m0Var2);
                            cVarB = aVar16.b();
                            p306z.h.f48679a = cVarB;
                        }
                    }
                    h hVar = IconKt.f11757a;
                    IconKt.a(androidx.compose.ui.graphics.vector.k.b(cVarB, interfaceC1084f3), "", h.a.f13984b, H.b(((Number) interfaceC1084f3.x(ContentAlphaKt.f11713a)).floatValue(), ((H) interfaceC1084f3.x(ContentColorKt.f11715a)).f13506a), interfaceC1084f3, 56, 0);
                    TextKt.b(o.p(interfaceC1084f3, com.voltasit.obdeleven.R.string.view_sfd_personal_info_workshop_info), null, com.voltasit.obdeleven.presentation.e.a.f32284g, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 384, 0, 131066);
                }
                return r.f47939a;
            }
        }, c1086gP), c1086gP, 805306368, 508);
        c1086gP.L(1176048636);
        if (state.f33039c) {
            c1086gP.L(1176048783);
            if (((i11 & 896) ^ 384) > 256) {
                aVar3 = aVar4;
                lVar2 = onWorkshopCodeChange;
                if (!c1086gP.K(lVar2)) {
                    z18 = true;
                }
                objF8 = c1086gP.f();
                if (z18) {
                    objF8 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$9$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(String str) {
                            String it = str;
                            i.e(it, "it");
                            lVar2.invoke(it);
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF8);
                } else {
                    objF8 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$9$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(String str) {
                            String it = str;
                            i.e(it, "it");
                            lVar2.invoke(it);
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF8);
                }
                c1086gP.T(false);
                TextInputKt.a(null, g10.f3423g, (l) objF8, o.p(c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_workshop_number), new k(null, 3, 6, R.styleable.AppCompatTheme_tooltipFrameBackground), null, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$10
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        list4.get(2).b(7);
                        return r.f47939a;
                    }
                }, c1086gP, 221184, 1);
                String strC15 = J4.n.c(aVar3, f12, c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_workshop_address, c1086gP);
                k kVar15 = new k(null, 0, 7, R.styleable.AppCompatTheme_windowActionModeOverlay);
                h hVarA16 = u.a(aVar3, list4.get(2));
                c1086gP.L(1176049467);
                if (((i11 & 7168) ^ 3072) <= 2048) {
                }
                objF9 = c1086gP.f();
                if (z19) {
                    objF9 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$11$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(String str) {
                            String it = str;
                            i.e(it, "it");
                            onWorkshopAddressChange.invoke(it);
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF9);
                } else {
                    objF9 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$11$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final r invoke(String str) {
                            String it = str;
                            i.e(it, "it");
                            onWorkshopAddressChange.invoke(it);
                            return r.f47939a;
                        }
                    };
                    c1086gP.E(objF9);
                }
                c1086gP.T(false);
                TextInputKt.a(hVarA16, g10.f3424h, (l) objF9, strC15, kVar15, null, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$12
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        M0 m10 = m7;
                        if (m10 != null) {
                            m10.b();
                        }
                        nVar.u(false);
                        return r.f47939a;
                    }
                }, c1086gP, 221184, 0);
            } else {
                aVar3 = aVar4;
                lVar2 = onWorkshopCodeChange;
            }
            if ((i11 & 384) == 256) {
                z18 = true;
            } else {
                z18 = false;
            }
            objF8 = c1086gP.f();
            if (z18) {
                objF8 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$9$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(String str) {
                        String it = str;
                        i.e(it, "it");
                        lVar2.invoke(it);
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF8);
            } else {
                objF8 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$9$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(String str) {
                        String it = str;
                        i.e(it, "it");
                        lVar2.invoke(it);
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF8);
            }
            c1086gP.T(false);
            TextInputKt.a(null, g10.f3423g, (l) objF8, o.p(c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_workshop_number), new k(null, 3, 6, R.styleable.AppCompatTheme_tooltipFrameBackground), null, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$10
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final r invoke() {
                    list4.get(2).b(7);
                    return r.f47939a;
                }
            }, c1086gP, 221184, 1);
            String strC16 = J4.n.c(aVar3, f12, c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_workshop_address, c1086gP);
            k kVar16 = new k(null, 0, 7, R.styleable.AppCompatTheme_windowActionModeOverlay);
            h hVarA17 = u.a(aVar3, list4.get(2));
            c1086gP.L(1176049467);
            if (((i11 & 7168) ^ 3072) <= 2048) {
            }
            objF9 = c1086gP.f();
            if (z19) {
                objF9 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$11$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(String str) {
                        String it = str;
                        i.e(it, "it");
                        onWorkshopAddressChange.invoke(it);
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF9);
            } else {
                objF9 = new l<String, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$11$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final r invoke(String str) {
                        String it = str;
                        i.e(it, "it");
                        onWorkshopAddressChange.invoke(it);
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF9);
            }
            c1086gP.T(false);
            TextInputKt.a(hVarA17, g10.f3424h, (l) objF9, strC16, kVar16, null, new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$12
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final r invoke() {
                    M0 m10 = m7;
                    if (m10 != null) {
                        m10.b();
                    }
                    nVar.u(false);
                    return r.f47939a;
                }
            }, c1086gP, 221184, 0);
        } else {
            aVar3 = aVar4;
        }
        c1086gP.T(false);
        Lb.a.a(c1086gP, c0955o.a(true));
        c1086gP.L(1176050094);
        if (state.f33045i) {
            String strP16 = o.p(c1086gP, com.voltasit.obdeleven.R.string.view_sfd_personal_info_agree_policy);
            c1086gP.L(1176050323);
            if (((57344 & i11) ^ 24576) <= 16384) {
            }
            objF7 = c1086gP.f();
            if (z17) {
                objF7 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$13$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        onPolicyCheckChange.invoke();
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF7);
            } else {
                objF7 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$13$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        onPolicyCheckChange.invoke();
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF7);
            }
            c1086gP.T(false);
            com.voltasit.obdeleven.presentation.components.d.a(strP16, (Ia.a) objF7, state.f33048m, null, c1086gP, 0, 2);
            f10 = f11;
            Lb.a.a(c1086gP, W.e(aVar3, f10));
        } else {
            f10 = f11;
        }
        c1086gP.T(false);
        String strP17 = o.p(c1086gP, com.voltasit.obdeleven.R.string.common_save);
        h hVarD9 = W.d(c0955o.b(aVar3, aVar14), 1.0f);
        long j16 = com.voltasit.obdeleven.presentation.e.a.f32287k;
        c1086gP.L(1176050684);
        if (((458752 & i11) ^ 196608) <= 131072) {
        }
        objF6 = c1086gP.f();
        if (z16) {
            objF6 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$14$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final r invoke() {
                    onNextClick.invoke();
                    return r.f47939a;
                }
            };
            c1086gP.E(objF6);
        } else {
            objF6 = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$3$14$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final r invoke() {
                    onNextClick.invoke();
                    return r.f47939a;
                }
            };
            c1086gP.E(objF6);
        }
        c1086gP.T(false);
        com.voltasit.obdeleven.presentation.components.b.a(384, 32, j16, (Ia.a) objF6, c1086gP, hVarD9, strP17, state.f33040d, false);
        Lb.a.a(c1086gP, W.e(aVar3, f10));
        c1086gP.T(true);
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoScreen$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    SfdPersonalInfoFormScreenKt.i(state, onCountrySelected, onCountrySelectedWithFocus, onCountryDismissRequest, onPhoneCodeSelected, onPhoneCodeDismissRequest, onFirstNameChange, onLastNameChange, onCountryClick, onCountryClickWithFocus, onPhoneCodeClick, onPhoneNumberChange, onWorkshopCodeChange, onWorkshopAddressChange, onPolicyCheckChange, onNextClick, onToggleWorkshopInformationClicked, list4, interfaceC1084f2, b.l(i10 | 1), b.l(i11), i12);
                    return r.f47939a;
                }
            };
        }
    }
}
