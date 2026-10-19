package io.intercom.android.sdk.helpcenter.search;

import Ia.p;
import android.app.Activity;
import android.os.Build;
import android.view.Window;
import androidx.activity.compose.LocalActivityKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1;
import androidx.compose.foundation.text.InterfaceC1000i;
import androidx.compose.material3.C1049d;
import androidx.compose.material3.C1061m;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldDefaults;
import androidx.compose.material3.TextFieldKt;
import androidx.compose.material3.n0;
import androidx.compose.material3.o0;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.E;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.X;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.n;
import androidx.compose.ui.focus.u;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.text.F;
import androidx.core.view.D;
import androidx.core.view.v0;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.flow.B;
import kotlinx.coroutines.flow.q;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: HelpCenterSearchTopBar.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HelpCenterSearchTopBarKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$2, reason: invalid class name */
    /* JADX INFO: compiled from: HelpCenterSearchTopBar.kt */
    @Aa.c(c = "io.intercom.android.sdk.helpcenter.search.HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$2", f = "HelpCenterSearchTopBar.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ Ia.l<q<String>, r> $onTextChanged;
        final /* synthetic */ q<String> $textFlow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Ia.l<? super q<String>, r> lVar, q<String> qVar, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$onTextChanged = lVar;
            this.$textFlow = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass2(this.$onTextChanged, this.$textFlow, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            this.$onTextChanged.invoke(this.$textFlow);
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass2) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$4, reason: invalid class name */
    /* JADX INFO: compiled from: HelpCenterSearchTopBar.kt */
    public static final class AnonymousClass4 implements p<InterfaceC1084f, Integer, r> {
        final /* synthetic */ n $focusManager;
        final /* synthetic */ FocusRequester $focusRequester;
        final /* synthetic */ Ia.l<String, r> $onSearchAction;
        final /* synthetic */ X<String> $searchText$delegate;
        final /* synthetic */ q<String> $textFlow;

        /* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.search.HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$4$3, reason: invalid class name */
        /* JADX INFO: compiled from: HelpCenterSearchTopBar.kt */
        public static final class AnonymousClass3 implements p<InterfaceC1084f, Integer, r> {
            final /* synthetic */ X<String> $searchText$delegate;
            final /* synthetic */ q<String> $textFlow;

            public AnonymousClass3(X<String> x10, q<String> qVar) {
                this.$searchText$delegate = x10;
                this.$textFlow = qVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final r invoke$lambda$0(q textFlow, X searchText$delegate) {
                kotlin.jvm.internal.i.e(textFlow, "$textFlow");
                kotlin.jvm.internal.i.e(searchText$delegate, "$searchText$delegate");
                HelpCenterSearchTopBarKt.HelpCenterSearchTopBar$lambda$3(searchText$delegate, "");
                textFlow.setValue("");
                return r.f47939a;
            }

            @Override // Ia.p
            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
                invoke(interfaceC1084f, num.intValue());
                return r.f47939a;
            }

            public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
                if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                    interfaceC1084f.w();
                } else if (HelpCenterSearchTopBarKt.HelpCenterSearchTopBar$lambda$2(this.$searchText$delegate).length() > 0) {
                    final q<String> qVar = this.$textFlow;
                    final X<String> x10 = this.$searchText$delegate;
                    IconButtonKt.b(new Ia.a() { // from class: io.intercom.android.sdk.helpcenter.search.e
                        @Override // Ia.a
                        public final Object invoke() {
                            return HelpCenterSearchTopBarKt.AnonymousClass4.AnonymousClass3.invoke$lambda$0(qVar, x10);
                        }
                    }, null, false, null, null, ComposableSingletons$HelpCenterSearchTopBarKt.INSTANCE.m56getLambda2$intercom_sdk_base_release(), interfaceC1084f, 196608, 30);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(FocusRequester focusRequester, X<String> x10, Ia.l<? super String, r> lVar, n nVar, q<String> qVar) {
            this.$focusRequester = focusRequester;
            this.$searchText$delegate = x10;
            this.$onSearchAction = lVar;
            this.$focusManager = nVar;
            this.$textFlow = qVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r invoke$lambda$0(Ia.l onSearchAction, n focusManager, X searchText$delegate, InterfaceC1000i KeyboardActions) {
            kotlin.jvm.internal.i.e(onSearchAction, "$onSearchAction");
            kotlin.jvm.internal.i.e(focusManager, "$focusManager");
            kotlin.jvm.internal.i.e(searchText$delegate, "$searchText$delegate");
            kotlin.jvm.internal.i.e(KeyboardActions, "$this$KeyboardActions");
            if (HelpCenterSearchTopBarKt.HelpCenterSearchTopBar$lambda$2(searchText$delegate).length() > 0) {
                onSearchAction.invoke(HelpCenterSearchTopBarKt.HelpCenterSearchTopBar$lambda$2(searchText$delegate));
                focusManager.u(false);
            }
            return r.f47939a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r invoke$lambda$1(q textFlow, X searchText$delegate, String newText) {
            kotlin.jvm.internal.i.e(textFlow, "$textFlow");
            kotlin.jvm.internal.i.e(searchText$delegate, "$searchText$delegate");
            kotlin.jvm.internal.i.e(newText, "newText");
            HelpCenterSearchTopBarKt.HelpCenterSearchTopBar$lambda$3(searchText$delegate, newText);
            textFlow.setValue(newText);
            return r.f47939a;
        }

        @Override // Ia.p
        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
                return;
            }
            String strHelpCenterSearchTopBar$lambda$2 = HelpCenterSearchTopBarKt.HelpCenterSearchTopBar$lambda$2(this.$searchText$delegate);
            androidx.compose.ui.h hVarA = u.a(W.e(W.d(androidx.compose.ui.h.a.f13984b, 1.0f), 56), this.$focusRequester);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i11 = IntercomTheme.$stable;
            F type04 = intercomTheme.getTypography(interfaceC1084f, i11).getType04();
            androidx.compose.foundation.text.k kVar = new androidx.compose.foundation.text.k(null, 1, 3, R.styleable.AppCompatTheme_tooltipFrameBackground);
            final Ia.l<String, r> lVar = this.$onSearchAction;
            final n nVar = this.$focusManager;
            final X<String> x10 = this.$searchText$delegate;
            androidx.compose.foundation.text.j jVar = new androidx.compose.foundation.text.j(null, null, new Ia.l() { // from class: io.intercom.android.sdk.helpcenter.search.c
                @Override // Ia.l
                public final Object invoke(Object obj) {
                    return HelpCenterSearchTopBarKt.AnonymousClass4.invoke$lambda$0(lVar, nVar, x10, (InterfaceC1000i) obj);
                }
            }, 47);
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f12369a;
            long jM645getPrimaryText0d7_KjU = intercomTheme.getColors(interfaceC1084f, i11).m645getPrimaryText0d7_KjU();
            long jM645getPrimaryText0d7_KjU2 = intercomTheme.getColors(interfaceC1084f, i11).m645getPrimaryText0d7_KjU();
            long jM645getPrimaryText0d7_KjU3 = intercomTheme.getColors(interfaceC1084f, i11).m645getPrimaryText0d7_KjU();
            long j = H.f13503k;
            TextFieldColors textFieldColorsD = TextFieldDefaults.d(jM645getPrimaryText0d7_KjU, jM645getPrimaryText0d7_KjU2, jM645getPrimaryText0d7_KjU3, j, j, j, intercomTheme.getColors(interfaceC1084f, i11).m645getPrimaryText0d7_KjU(), j, j, j, interfaceC1084f, 2147468936);
            final q<String> qVar = this.$textFlow;
            final X<String> x11 = this.$searchText$delegate;
            TextFieldKt.a(strHelpCenterSearchTopBar$lambda$2, new Ia.l() { // from class: io.intercom.android.sdk.helpcenter.search.d
                @Override // Ia.l
                public final Object invoke(Object obj) {
                    return HelpCenterSearchTopBarKt.AnonymousClass4.invoke$lambda$1(qVar, x11, (String) obj);
                }
            }, hVarA, false, false, type04, null, ComposableSingletons$HelpCenterSearchTopBarKt.INSTANCE.m55getLambda1$intercom_sdk_base_release(), null, androidx.compose.runtime.internal.a.b(1908343233, new AnonymousClass3(this.$searchText$delegate, this.$textFlow), interfaceC1084f), null, null, null, false, null, kVar, jVar, true, 0, 0, null, null, textFieldColorsD, interfaceC1084f, 817889280, 12779520, 0, 3964248);
        }
    }

    public static final void HelpCenterSearchTopBar(final Ia.a<r> onBackClick, final Ia.l<? super q<String>, r> onTextChanged, final Ia.l<? super String, r> onSearchAction, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086g;
        kotlin.jvm.internal.i.e(onBackClick, "onBackClick");
        kotlin.jvm.internal.i.e(onTextChanged, "onTextChanged");
        kotlin.jvm.internal.i.e(onSearchAction, "onSearchAction");
        C1086g c1086gP = interfaceC1084f.p(1649601348);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.k(onBackClick) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= c1086gP.k(onTextChanged) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c1086gP.k(onSearchAction) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && c1086gP.s()) {
            c1086gP.w();
            c1086g = c1086gP;
        } else {
            c1086gP.L(149286427);
            Object objF = c1086gP.f();
            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
            if (objF == c0153a) {
                objF = new FocusRequester();
                c1086gP.E(objF);
            }
            FocusRequester focusRequester = (FocusRequester) objF;
            c1086gP.T(false);
            n nVar = (n) c1086gP.x(CompositionLocalsKt.f14848i);
            c1086gP.L(149289661);
            Object objF2 = c1086gP.f();
            if (objF2 == c0153a) {
                objF2 = J0.f("");
                c1086gP.E(objF2);
            }
            X x10 = (X) objF2;
            c1086gP.T(false);
            c1086gP.L(149291295);
            Object objF3 = c1086gP.f();
            if (objF3 == c0153a) {
                objF3 = B.a("");
                c1086gP.E(objF3);
            }
            q qVar = (q) objF3;
            c1086gP.T(false);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i12 = IntercomTheme.$stable;
            final boolean z10 = !ColorExtensionsKt.m664isDarkColor8_81llA(intercomTheme.getColors(c1086gP, i12).m635getHeader0d7_KjU());
            Activity activity = (Activity) c1086gP.x(LocalActivityKt.f8205a);
            final Window window = activity != null ? activity.getWindow() : null;
            c1086gP.L(149297953);
            if (window != null) {
                Ia.a<r> aVar = new Ia.a() { // from class: io.intercom.android.sdk.helpcenter.search.a
                    @Override // Ia.a
                    public final Object invoke() {
                        return HelpCenterSearchTopBarKt.HelpCenterSearchTopBar$lambda$6$lambda$5(window, z10);
                    }
                };
                androidx.compose.runtime.B b10 = E.f12831a;
                c1086gP.l(aVar);
                r rVar = r.f47939a;
            }
            c1086gP.T(false);
            r rVar2 = r.f47939a;
            E.d(new AnonymousClass2(onTextChanged, qVar, null), c1086gP, rVar2);
            c1086gP.L(149309643);
            Object objF4 = c1086gP.f();
            if (objF4 == c0153a) {
                objF4 = new HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$3$1(focusRequester, null);
                c1086gP.E(objF4);
            }
            c1086gP.T(false);
            E.d((p) objF4, c1086gP, rVar2);
            androidx.compose.ui.h hVarA = ComposedModifierKt.a(androidx.compose.ui.h.a.f13984b, InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1());
            float f10 = o0.f12663a;
            long jM635getHeader0d7_KjU = intercomTheme.getColors(c1086gP, i12).m635getHeader0d7_KjU();
            long jM642getOnHeader0d7_KjU = intercomTheme.getColors(c1086gP, i12).m642getOnHeader0d7_KjU();
            long jM642getOnHeader0d7_KjU2 = intercomTheme.getColors(c1086gP, i12).m642getOnHeader0d7_KjU();
            long jM642getOnHeader0d7_KjU3 = intercomTheme.getColors(c1086gP, i12).m642getOnHeader0d7_KjU();
            long j = H.f13504l;
            n0 n0VarA = o0.a((C1061m) c1086gP.x(ColorSchemeKt.f12087a));
            if (jM635getHeader0d7_KjU == 16) {
                jM635getHeader0d7_KjU = n0VarA.f12651a;
            }
            long j10 = jM635getHeader0d7_KjU;
            long j11 = j != 16 ? j : n0VarA.f12652b;
            long j12 = jM642getOnHeader0d7_KjU2 != 16 ? jM642getOnHeader0d7_KjU2 : n0VarA.f12653c;
            if (jM642getOnHeader0d7_KjU == 16) {
                jM642getOnHeader0d7_KjU = n0VarA.f12654d;
            }
            long j13 = jM642getOnHeader0d7_KjU;
            if (jM642getOnHeader0d7_KjU3 == 16) {
                jM642getOnHeader0d7_KjU3 = n0VarA.f12655e;
            }
            c1086g = c1086gP;
            C1049d.b(androidx.compose.runtime.internal.a.b(-227105272, new AnonymousClass4(focusRequester, x10, onSearchAction, nVar, qVar), c1086gP), hVarA, androidx.compose.runtime.internal.a.b(-1996576886, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.helpcenter.search.HelpCenterSearchTopBarKt.HelpCenterSearchTopBar.5
                @Override // Ia.p
                public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC1084f2, num.intValue());
                    return r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i13) {
                    if ((i13 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                    } else {
                        IconButtonKt.b(onBackClick, null, false, null, null, ComposableSingletons$HelpCenterSearchTopBarKt.INSTANCE.m57getLambda3$intercom_sdk_base_release(), interfaceC1084f2, 196608, 30);
                    }
                }
            }, c1086gP), null, 0.0f, null, new n0(j10, j11, j12, j13, jM642getOnHeader0d7_KjU3), c1086g, 390, 184);
        }
        C1105p0 c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.helpcenter.search.b
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HelpCenterSearchTopBarKt.HelpCenterSearchTopBar$lambda$8(onBackClick, onTextChanged, onSearchAction, i10, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String HelpCenterSearchTopBar$lambda$2(X<String> x10) {
        return x10.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HelpCenterSearchTopBar$lambda$3(X<String> x10, String str) {
        x10.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r HelpCenterSearchTopBar$lambda$6$lambda$5(Window it, boolean z10) {
        v0.e cVar;
        kotlin.jvm.internal.i.e(it, "$it");
        D d10 = new D(it.getDecorView());
        if (Build.VERSION.SDK_INT >= 30) {
            v0.d dVar = new v0.d(it.getInsetsController(), d10);
            dVar.f16996b = it;
            cVar = dVar;
        } else {
            cVar = new v0.c(it, d10);
        }
        cVar.c(z10);
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r HelpCenterSearchTopBar$lambda$8(Ia.a onBackClick, Ia.l onTextChanged, Ia.l onSearchAction, int i10, InterfaceC1084f interfaceC1084f, int i11) {
        kotlin.jvm.internal.i.e(onBackClick, "$onBackClick");
        kotlin.jvm.internal.i.e(onTextChanged, "$onTextChanged");
        kotlin.jvm.internal.i.e(onSearchAction, "$onSearchAction");
        HelpCenterSearchTopBar(onBackClick, onTextChanged, onSearchAction, interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }
}
