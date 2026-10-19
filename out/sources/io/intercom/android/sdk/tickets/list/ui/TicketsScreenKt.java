package io.intercom.android.sdk.tickets.list.ui;

import Ia.l;
import Ia.p;
import Ia.q;
import S4.o;
import android.view.View;
import androidx.compose.animation.k;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.L;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.U;
import androidx.compose.foundation.layout.W;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.c0;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.h;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.N0;
import androidx.navigation.compose.F;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.components.TopActionBarKt;
import io.intercom.android.sdk.m5.conversation.ui.T;
import io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: TicketsScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketsScreenKt {
    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    public static final void TicketsScreen(final TicketsScreenUiState uiState, final Ia.a<r> onBackButtonClick, l<? super String, r> lVar, final int i10, InterfaceC1084f interfaceC1084f, final int i11, final int i12) {
        int i13;
        final l<? super String, r> lVar2;
        int i14;
        final l<? super String, r> t8;
        C1105p0 c1105p0V;
        i.e(uiState, "uiState");
        i.e(onBackButtonClick, "onBackButtonClick");
        C1086g c1086gP = interfaceC1084f.p(-1552213693);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (c1086gP.K(uiState) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i13 |= c1086gP.k(onBackButtonClick) ? 32 : 16;
        }
        int i15 = i12 & 4;
        if (i15 == 0) {
            if ((i11 & 896) == 0) {
                lVar2 = lVar;
                i13 |= c1086gP.k(lVar2) ? 256 : 128;
            }
            if ((i12 & 8) != 0) {
                i13 |= 3072;
            } else if ((i11 & 7168) == 0) {
                if (c1086gP.h(i10)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i13 |= i14;
            }
            if ((i13 & 5851) == 1170 || !c1086gP.s()) {
                if (i15 != 0) {
                    t8 = new T(3);
                } else {
                    t8 = lVar2;
                }
                h hVarB = C0932d.b(h.a.f13984b, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m621getBackground0d7_KjU(), h0.f13629a);
                WeakHashMap<View, c0> weakHashMap = c0.f10254v;
                ScaffoldKt.a(N0.a(WindowInsetsPaddingKt.c(hVarB, c0.a.c(c1086gP).f10256b), "tickets_screen"), androidx.compose.runtime.internal.a.b(-1473942521, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt.TicketsScreen.2
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i16) {
                        if ((i16 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        String screenLabel = uiState.getScreenLabel();
                        Ia.a<r> aVar = onBackButtonClick;
                        Integer numValueOf = Integer.valueOf(i10);
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i17 = IntercomTheme.$stable;
                        TopActionBarKt.m130TopActionBarNpQZenA(null, screenLabel, null, null, null, aVar, numValueOf, false, intercomTheme.getColors(interfaceC1084f2, i17).m635getHeader0d7_KjU(), intercomTheme.getColors(interfaceC1084f2, i17).m642getOnHeader0d7_KjU(), 0L, null, null, interfaceC1084f2, 0, 0, 7325);
                    }
                }, c1086gP), null, null, null, 0, 0L, 0L, null, androidx.compose.runtime.internal.a.b(-1690440366, new q<L, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt.TicketsScreen.3
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ r invoke(L l10, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(l10, interfaceC1084f2, num.intValue());
                        return r.f47939a;
                    }

                    public final void invoke(L paddingValues, InterfaceC1084f interfaceC1084f2, int i16) {
                        i.e(paddingValues, "paddingValues");
                        if ((i16 & 14) == 0) {
                            i16 |= interfaceC1084f2.K(paddingValues) ? 4 : 2;
                        }
                        if ((i16 & 91) == 18 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        TicketsScreenUiState ticketsScreenUiState = uiState;
                        if (ticketsScreenUiState instanceof TicketsScreenUiState.Content) {
                            interfaceC1084f2.L(1161791623);
                            TicketsScreenKt.TicketsScreenContent((TicketsScreenUiState.Content) uiState, paddingValues, t8, interfaceC1084f2, 8 | ((i16 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
                            interfaceC1084f2.D();
                            return;
                        }
                        boolean z10 = ticketsScreenUiState instanceof TicketsScreenUiState.Empty;
                        h.a aVar = h.a.f13984b;
                        if (z10) {
                            interfaceC1084f2.L(1161993371);
                            TicketsEmptyScreenKt.TicketsEmptyScreen(((TicketsScreenUiState.Empty) uiState).getEmptyState(), PaddingKt.e(aVar, paddingValues), interfaceC1084f2, 0, 0);
                            interfaceC1084f2.D();
                        } else if (ticketsScreenUiState instanceof TicketsScreenUiState.Error) {
                            interfaceC1084f2.L(1162175744);
                            TicketsErrorScreenKt.TicketsErrorScreen(((TicketsScreenUiState.Error) uiState).getErrorState(), PaddingKt.e(aVar, paddingValues), interfaceC1084f2, 0, 0);
                            interfaceC1084f2.D();
                        } else {
                            if (!(ticketsScreenUiState instanceof TicketsScreenUiState.Initial) && !(ticketsScreenUiState instanceof TicketsScreenUiState.Loading)) {
                                interfaceC1084f2.L(2115686198);
                                interfaceC1084f2.D();
                                throw new NoWhenBranchMatchedException();
                            }
                            interfaceC1084f2.L(2115705652);
                            TicketsLoadingScreenKt.TicketsLoadingScreen(PaddingKt.e(aVar, paddingValues), interfaceC1084f2, 0, 0);
                            interfaceC1084f2.D();
                        }
                    }
                }, c1086gP), c1086gP, 805306416, 508);
                lVar2 = t8;
            } else {
                c1086gP.w();
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.tickets.list.ui.e
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TicketsScreenKt.TicketsScreen$lambda$1(uiState, onBackButtonClick, lVar2, i10, i11, i12, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i13 |= 384;
        lVar2 = lVar;
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 7168) == 0) {
            if (c1086gP.h(i10)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i13 |= i14;
        }
        if ((i13 & 5851) == 1170) {
            if (i15 != 0) {
                t8 = new T(3);
            } else {
                t8 = lVar2;
            }
            h hVarB2 = C0932d.b(h.a.f13984b, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m621getBackground0d7_KjU(), h0.f13629a);
            WeakHashMap<View, c0> weakHashMap2 = c0.f10254v;
            ScaffoldKt.a(N0.a(WindowInsetsPaddingKt.c(hVarB2, c0.a.c(c1086gP).f10256b), "tickets_screen"), androidx.compose.runtime.internal.a.b(-1473942521, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt.TicketsScreen.2
                @Override // Ia.p
                public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC1084f2, num.intValue());
                    return r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i16) {
                    if ((i16 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    String screenLabel = uiState.getScreenLabel();
                    Ia.a<r> aVar = onBackButtonClick;
                    Integer numValueOf = Integer.valueOf(i10);
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i17 = IntercomTheme.$stable;
                    TopActionBarKt.m130TopActionBarNpQZenA(null, screenLabel, null, null, null, aVar, numValueOf, false, intercomTheme.getColors(interfaceC1084f2, i17).m635getHeader0d7_KjU(), intercomTheme.getColors(interfaceC1084f2, i17).m642getOnHeader0d7_KjU(), 0L, null, null, interfaceC1084f2, 0, 0, 7325);
                }
            }, c1086gP), null, null, null, 0, 0L, 0L, null, androidx.compose.runtime.internal.a.b(-1690440366, new q<L, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt.TicketsScreen.3
                @Override // Ia.q
                public /* bridge */ /* synthetic */ r invoke(L l10, InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(l10, interfaceC1084f2, num.intValue());
                    return r.f47939a;
                }

                public final void invoke(L paddingValues, InterfaceC1084f interfaceC1084f2, int i16) {
                    i.e(paddingValues, "paddingValues");
                    if ((i16 & 14) == 0) {
                        i16 |= interfaceC1084f2.K(paddingValues) ? 4 : 2;
                    }
                    if ((i16 & 91) == 18 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    TicketsScreenUiState ticketsScreenUiState = uiState;
                    if (ticketsScreenUiState instanceof TicketsScreenUiState.Content) {
                        interfaceC1084f2.L(1161791623);
                        TicketsScreenKt.TicketsScreenContent((TicketsScreenUiState.Content) uiState, paddingValues, t8, interfaceC1084f2, 8 | ((i16 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
                        interfaceC1084f2.D();
                        return;
                    }
                    boolean z10 = ticketsScreenUiState instanceof TicketsScreenUiState.Empty;
                    h.a aVar = h.a.f13984b;
                    if (z10) {
                        interfaceC1084f2.L(1161993371);
                        TicketsEmptyScreenKt.TicketsEmptyScreen(((TicketsScreenUiState.Empty) uiState).getEmptyState(), PaddingKt.e(aVar, paddingValues), interfaceC1084f2, 0, 0);
                        interfaceC1084f2.D();
                    } else if (ticketsScreenUiState instanceof TicketsScreenUiState.Error) {
                        interfaceC1084f2.L(1162175744);
                        TicketsErrorScreenKt.TicketsErrorScreen(((TicketsScreenUiState.Error) uiState).getErrorState(), PaddingKt.e(aVar, paddingValues), interfaceC1084f2, 0, 0);
                        interfaceC1084f2.D();
                    } else {
                        if (!(ticketsScreenUiState instanceof TicketsScreenUiState.Initial) && !(ticketsScreenUiState instanceof TicketsScreenUiState.Loading)) {
                            interfaceC1084f2.L(2115686198);
                            interfaceC1084f2.D();
                            throw new NoWhenBranchMatchedException();
                        }
                        interfaceC1084f2.L(2115705652);
                        TicketsLoadingScreenKt.TicketsLoadingScreen(PaddingKt.e(aVar, paddingValues), interfaceC1084f2, 0, 0);
                        interfaceC1084f2.D();
                    }
                }
            }, c1086gP), c1086gP, 805306416, 508);
            lVar2 = t8;
        } else {
            if (i15 != 0) {
                t8 = new T(3);
            } else {
                t8 = lVar2;
            }
            h hVarB3 = C0932d.b(h.a.f13984b, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m621getBackground0d7_KjU(), h0.f13629a);
            WeakHashMap<View, c0> weakHashMap3 = c0.f10254v;
            ScaffoldKt.a(N0.a(WindowInsetsPaddingKt.c(hVarB3, c0.a.c(c1086gP).f10256b), "tickets_screen"), androidx.compose.runtime.internal.a.b(-1473942521, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt.TicketsScreen.2
                @Override // Ia.p
                public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC1084f2, num.intValue());
                    return r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i16) {
                    if ((i16 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    String screenLabel = uiState.getScreenLabel();
                    Ia.a<r> aVar = onBackButtonClick;
                    Integer numValueOf = Integer.valueOf(i10);
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i17 = IntercomTheme.$stable;
                    TopActionBarKt.m130TopActionBarNpQZenA(null, screenLabel, null, null, null, aVar, numValueOf, false, intercomTheme.getColors(interfaceC1084f2, i17).m635getHeader0d7_KjU(), intercomTheme.getColors(interfaceC1084f2, i17).m642getOnHeader0d7_KjU(), 0L, null, null, interfaceC1084f2, 0, 0, 7325);
                }
            }, c1086gP), null, null, null, 0, 0L, 0L, null, androidx.compose.runtime.internal.a.b(-1690440366, new q<L, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt.TicketsScreen.3
                @Override // Ia.q
                public /* bridge */ /* synthetic */ r invoke(L l10, InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(l10, interfaceC1084f2, num.intValue());
                    return r.f47939a;
                }

                public final void invoke(L paddingValues, InterfaceC1084f interfaceC1084f2, int i16) {
                    i.e(paddingValues, "paddingValues");
                    if ((i16 & 14) == 0) {
                        i16 |= interfaceC1084f2.K(paddingValues) ? 4 : 2;
                    }
                    if ((i16 & 91) == 18 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    TicketsScreenUiState ticketsScreenUiState = uiState;
                    if (ticketsScreenUiState instanceof TicketsScreenUiState.Content) {
                        interfaceC1084f2.L(1161791623);
                        TicketsScreenKt.TicketsScreenContent((TicketsScreenUiState.Content) uiState, paddingValues, t8, interfaceC1084f2, 8 | ((i16 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
                        interfaceC1084f2.D();
                        return;
                    }
                    boolean z10 = ticketsScreenUiState instanceof TicketsScreenUiState.Empty;
                    h.a aVar = h.a.f13984b;
                    if (z10) {
                        interfaceC1084f2.L(1161993371);
                        TicketsEmptyScreenKt.TicketsEmptyScreen(((TicketsScreenUiState.Empty) uiState).getEmptyState(), PaddingKt.e(aVar, paddingValues), interfaceC1084f2, 0, 0);
                        interfaceC1084f2.D();
                    } else if (ticketsScreenUiState instanceof TicketsScreenUiState.Error) {
                        interfaceC1084f2.L(1162175744);
                        TicketsErrorScreenKt.TicketsErrorScreen(((TicketsScreenUiState.Error) uiState).getErrorState(), PaddingKt.e(aVar, paddingValues), interfaceC1084f2, 0, 0);
                        interfaceC1084f2.D();
                    } else {
                        if (!(ticketsScreenUiState instanceof TicketsScreenUiState.Initial) && !(ticketsScreenUiState instanceof TicketsScreenUiState.Loading)) {
                            interfaceC1084f2.L(2115686198);
                            interfaceC1084f2.D();
                            throw new NoWhenBranchMatchedException();
                        }
                        interfaceC1084f2.L(2115705652);
                        TicketsLoadingScreenKt.TicketsLoadingScreen(PaddingKt.e(aVar, paddingValues), interfaceC1084f2, 0, 0);
                        interfaceC1084f2.D();
                    }
                }
            }, c1086gP), c1086gP, 805306416, 508);
            lVar2 = t8;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.tickets.list.ui.e
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TicketsScreenKt.TicketsScreen$lambda$1(uiState, onBackButtonClick, lVar2, i10, i11, i12, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r TicketsScreen$lambda$0(String it) {
        i.e(it, "it");
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r TicketsScreen$lambda$1(TicketsScreenUiState uiState, Ia.a onBackButtonClick, l lVar, int i10, int i11, int i12, InterfaceC1084f interfaceC1084f, int i13) {
        i.e(uiState, "$uiState");
        i.e(onBackButtonClick, "$onBackButtonClick");
        TicketsScreen(uiState, onBackButtonClick, lVar, i10, interfaceC1084f, L4.b.l(i11 | 1), i12);
        return r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:0x00af  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    public static final void TicketsScreenContent(final TicketsScreenUiState.Content uiState, L paddingValues, l<? super String, r> lVar, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        int i12;
        l<? super String, r> lVar2;
        final l<? super String, r> f10;
        l<? super String, r> lVar3;
        C1105p0 c1105p0V;
        i.e(uiState, "uiState");
        i.e(paddingValues, "paddingValues");
        C1086g c1086gP = interfaceC1084f.p(-1912868973);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.K(uiState) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= c1086gP.K(paddingValues) ? 32 : 16;
        }
        int i13 = i11 & 4;
        if (i13 == 0) {
            if ((i10 & 896) == 0) {
                lVar2 = lVar;
                i12 |= c1086gP.k(lVar2) ? 256 : 128;
            }
            if ((i12 & 731) == 146 || !c1086gP.s()) {
                if (i13 != 0) {
                    f10 = new F(4);
                } else {
                    f10 = lVar2;
                }
                LazyDslKt.a(W.f10226c, null, paddingValues, false, null, null, null, false, null, new l() { // from class: io.intercom.android.sdk.tickets.list.ui.d
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return TicketsScreenKt.TicketsScreenContent$lambda$3(uiState, f10, (androidx.compose.foundation.lazy.p) obj);
                    }
                }, c1086gP, ((i12 << 3) & 896) | 6, 506);
                lVar3 = f10;
            } else {
                c1086gP.w();
                lVar3 = lVar2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new io.intercom.android.sdk.m5.conversation.ui.components.W(uiState, paddingValues, lVar3, i10, i11, 2);
            }
        }
        i12 |= 384;
        lVar2 = lVar;
        if ((i12 & 731) == 146) {
            if (i13 != 0) {
                f10 = new F(4);
            } else {
                f10 = lVar2;
            }
            LazyDslKt.a(W.f10226c, null, paddingValues, false, null, null, null, false, null, new l() { // from class: io.intercom.android.sdk.tickets.list.ui.d
                @Override // Ia.l
                public final Object invoke(Object obj) {
                    return TicketsScreenKt.TicketsScreenContent$lambda$3(uiState, f10, (androidx.compose.foundation.lazy.p) obj);
                }
            }, c1086gP, ((i12 << 3) & 896) | 6, 506);
            lVar3 = f10;
        } else {
            if (i13 != 0) {
                f10 = new F(4);
            } else {
                f10 = lVar2;
            }
            LazyDslKt.a(W.f10226c, null, paddingValues, false, null, null, null, false, null, new l() { // from class: io.intercom.android.sdk.tickets.list.ui.d
                @Override // Ia.l
                public final Object invoke(Object obj) {
                    return TicketsScreenKt.TicketsScreenContent$lambda$3(uiState, f10, (androidx.compose.foundation.lazy.p) obj);
                }
            }, c1086gP, ((i12 << 3) & 896) | 6, 506);
            lVar3 = f10;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.m5.conversation.ui.components.W(uiState, paddingValues, lVar3, i10, i11, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r TicketsScreenContent$lambda$2(String it) {
        i.e(it, "it");
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final r TicketsScreenContent$lambda$3(TicketsScreenUiState.Content uiState, l lVar, androidx.compose.foundation.lazy.p LazyColumn) {
        i.e(uiState, "$uiState");
        i.e(LazyColumn, "$this$LazyColumn");
        LazyColumn.g(((androidx.paging.l) uiState.getLazyPagingTickets().f19335d.getValue()).e(), null, new l() { // from class: androidx.compose.foundation.lazy.LazyListScope$items$1
            @Override // Ia.l
            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                ((Number) obj).intValue();
                return null;
            }
        }, new ComposableLambdaImpl(true, 264752689, new TicketsScreenKt$TicketsScreenContent$2$1(uiState, lVar)));
        final ErrorState errorState = uiState.getErrorState();
        if (errorState != null) {
            androidx.compose.foundation.lazy.p.c(LazyColumn, null, new ComposableLambdaImpl(true, -1511938327, new q<androidx.compose.foundation.lazy.b, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt$TicketsScreenContent$2$2
                @Override // Ia.q
                public /* bridge */ /* synthetic */ r invoke(androidx.compose.foundation.lazy.b bVar, InterfaceC1084f interfaceC1084f, Integer num) {
                    invoke(bVar, interfaceC1084f, num.intValue());
                    return r.f47939a;
                }

                public final void invoke(androidx.compose.foundation.lazy.b item, InterfaceC1084f interfaceC1084f, int i10) {
                    i.e(item, "$this$item");
                    if ((i10 & 81) == 16 && interfaceC1084f.s()) {
                        interfaceC1084f.w();
                        return;
                    }
                    h.a aVar = h.a.f13984b;
                    h hVarD = W.d(PaddingKt.h(aVar, 0.0f, 16, 1), 1.0f);
                    androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13339e;
                    final ErrorState errorState2 = errorState;
                    E eD = BoxKt.d(fVar, false);
                    int iF = interfaceC1084f.F();
                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f.z();
                    h hVarC = ComposedModifierKt.c(interfaceC1084f, hVarD);
                    ComposeUiNode.f14331c0.getClass();
                    Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                    if (interfaceC1084f.u() == null) {
                        I.b.k();
                        throw null;
                    }
                    interfaceC1084f.r();
                    if (interfaceC1084f.m()) {
                        interfaceC1084f.v(aVar2);
                    } else {
                        interfaceC1084f.A();
                    }
                    p<ComposeUiNode, E, r> pVar = ComposeUiNode.Companion.f14337f;
                    R0.a(pVar, interfaceC1084f, eD);
                    p<ComposeUiNode, androidx.compose.runtime.r, r> pVar2 = ComposeUiNode.Companion.f14336e;
                    R0.a(pVar2, interfaceC1084f, interfaceC1089h0Z);
                    p<ComposeUiNode, Integer, r> pVar3 = ComposeUiNode.Companion.f14338g;
                    if (interfaceC1084f.m() || !i.a(interfaceC1084f.f(), Integer.valueOf(iF))) {
                        k.b(iF, interfaceC1084f, iF, pVar3);
                    }
                    p<ComposeUiNode, h, r> pVar4 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar4, interfaceC1084f, hVarC);
                    C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13347n, interfaceC1084f, 48);
                    int iF2 = interfaceC1084f.F();
                    InterfaceC1089h0 interfaceC1089h0Z2 = interfaceC1084f.z();
                    h hVarC2 = ComposedModifierKt.c(interfaceC1084f, aVar);
                    if (interfaceC1084f.u() == null) {
                        I.b.k();
                        throw null;
                    }
                    interfaceC1084f.r();
                    if (interfaceC1084f.m()) {
                        interfaceC1084f.v(aVar2);
                    } else {
                        interfaceC1084f.A();
                    }
                    R0.a(pVar, interfaceC1084f, c0953mA);
                    R0.a(pVar2, interfaceC1084f, interfaceC1089h0Z2);
                    if (interfaceC1084f.m() || !i.a(interfaceC1084f.f(), Integer.valueOf(iF2))) {
                        k.b(iF2, interfaceC1084f, iF2, pVar3);
                    }
                    R0.a(pVar4, interfaceC1084f, hVarC2);
                    TextKt.b(o.p(interfaceC1084f, errorState2.getMessageResId()), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f, 0, 0, 131070);
                    interfaceC1084f.L(-309108390);
                    if (errorState2 instanceof ErrorState.WithCTA) {
                        ButtonKt.c(((ErrorState.WithCTA) errorState2).getOnCtaClick(), null, false, null, null, null, null, null, null, androidx.compose.runtime.internal.a.b(-774229187, new q<U, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt$TicketsScreenContent$2$2$1$1$1
                            @Override // Ia.q
                            public /* bridge */ /* synthetic */ r invoke(U u10, InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(u10, interfaceC1084f2, num.intValue());
                                return r.f47939a;
                            }

                            public final void invoke(U TextButton, InterfaceC1084f interfaceC1084f2, int i11) {
                                i.e(TextButton, "$this$TextButton");
                                if ((i11 & 81) == 16 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                } else {
                                    TextKt.b(o.p(interfaceC1084f2, ((ErrorState.WithCTA) errorState2).getCtaResId()), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, IntercomTheme.$stable).getType04(), interfaceC1084f2, 0, 0, 65534);
                                }
                            }
                        }, interfaceC1084f), interfaceC1084f, 805306368, 510);
                    }
                    interfaceC1084f.D();
                    interfaceC1084f.J();
                    interfaceC1084f.J();
                }
            }), 3);
        }
        if (uiState.isLoadingMore()) {
            androidx.compose.foundation.lazy.p.c(LazyColumn, null, ComposableSingletons$TicketsScreenKt.INSTANCE.m497getLambda1$intercom_sdk_base_release(), 3);
        }
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r TicketsScreenContent$lambda$4(TicketsScreenUiState.Content uiState, L paddingValues, l lVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        i.e(uiState, "$uiState");
        i.e(paddingValues, "$paddingValues");
        TicketsScreenContent(uiState, paddingValues, lVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return r.f47939a;
    }
}
