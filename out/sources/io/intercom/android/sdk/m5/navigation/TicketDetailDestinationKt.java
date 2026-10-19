package io.intercom.android.sdk.m5.navigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.compose.animation.InterfaceC0900c;
import androidx.compose.animation.InterfaceC0927e;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.platform.N0;
import io.intercom.android.sdk.m5.components.TopActionBarKt;
import io.intercom.android.sdk.m5.conversation.ui.C2398m;
import io.intercom.android.sdk.m5.conversation.ui.C2399n;
import io.intercom.android.sdk.m5.conversation.ui.components.C2365n;
import io.intercom.android.sdk.m5.conversation.ui.components.C2366o;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionStyleKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.tickets.TicketDetailContentKt;
import io.intercom.android.sdk.tickets.TicketDetailErrorScreenKt;
import io.intercom.android.sdk.tickets.TicketDetailState;
import io.intercom.android.sdk.tickets.TicketDetailViewModel;
import io.intercom.android.sdk.tickets.TicketDetailsLoadingScreenKt;
import io.intercom.android.sdk.tickets.TicketLaunchedFrom;
import io.intercom.android.sdk.ui.extension.NavBackStackEntryExtensionKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import me.zhanghai.android.materialprogressbar.R;
import p141l2.C2748s;
import p141l2.C2749t;

/* JADX INFO: compiled from: TicketDetailDestination.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketDetailDestinationKt {
    public static final String LAUNCHED_FROM = "from";
    public static final String SHOW_SUBMISSION_CARD = "show_submission_card";
    public static final String TICKET_ID = "ticket_id";

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$TicketDetailScreen$4, reason: invalid class name */
    /* JADX INFO: compiled from: TicketDetailDestination.kt */
    public static final class AnonymousClass4 implements Ia.q<androidx.compose.foundation.layout.L, InterfaceC1084f, Integer, p293xa.r> {
        final /* synthetic */ boolean $isLaunchedProgrammatically;
        final /* synthetic */ Ia.p<String, Boolean, p293xa.r> $onConversationCTAClicked;
        final /* synthetic */ boolean $showSubmissionCard;
        final /* synthetic */ TicketDetailState $ticketDetailState;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(TicketDetailState ticketDetailState, Ia.p<? super String, ? super Boolean, p293xa.r> pVar, boolean z10, boolean z11) {
            this.$ticketDetailState = ticketDetailState;
            this.$onConversationCTAClicked = pVar;
            this.$isLaunchedProgrammatically = z10;
            this.$showSubmissionCard = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p293xa.r invoke$lambda$1$lambda$0(Ia.p pVar, TicketDetailState ticketDetailState, boolean z10, String str) {
            kotlin.jvm.internal.i.e(ticketDetailState, "$ticketDetailState");
            pVar.invoke(((TicketDetailState.TicketDetailContentState) ticketDetailState).getConversationId(), Boolean.valueOf(z10));
            return p293xa.r.f47939a;
        }

        @Override // Ia.q
        public /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.foundation.layout.L l10, InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(l10, interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(androidx.compose.foundation.layout.L contentPadding, InterfaceC1084f interfaceC1084f, int i10) {
            kotlin.jvm.internal.i.e(contentPadding, "contentPadding");
            if ((i10 & 14) == 0) {
                i10 |= interfaceC1084f.K(contentPadding) ? 4 : 2;
            }
            if ((i10 & 91) == 18 && interfaceC1084f.s()) {
                interfaceC1084f.w();
                return;
            }
            TicketDetailState ticketDetailState = this.$ticketDetailState;
            boolean zA = kotlin.jvm.internal.i.a(ticketDetailState, TicketDetailState.Initial.INSTANCE);
            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
            if (zA || kotlin.jvm.internal.i.a(ticketDetailState, TicketDetailState.Loading.INSTANCE)) {
                interfaceC1084f.L(1534755158);
                TicketDetailsLoadingScreenKt.TicketDetailsLoadingScreen(PaddingKt.e(aVar, contentPadding), interfaceC1084f, 0, 0);
                interfaceC1084f.D();
                return;
            }
            if (ticketDetailState instanceof TicketDetailState.Error) {
                interfaceC1084f.L(332916057);
                TicketDetailErrorScreenKt.TicketDetailErrorScreen(((TicketDetailState.Error) this.$ticketDetailState).getErrorState(), PaddingKt.e(aVar, contentPadding), interfaceC1084f, 0, 0);
                interfaceC1084f.D();
                return;
            }
            if (!(ticketDetailState instanceof TicketDetailState.TicketDetailContentState)) {
                interfaceC1084f.L(1534752236);
                interfaceC1084f.D();
                throw new NoWhenBranchMatchedException();
            }
            interfaceC1084f.L(333141954);
            androidx.compose.ui.h hVarE = PaddingKt.e(aVar, contentPadding);
            TicketDetailState.TicketDetailContentState ticketDetailContentState = (TicketDetailState.TicketDetailContentState) this.$ticketDetailState;
            interfaceC1084f.L(1534773801);
            boolean zK = interfaceC1084f.K(this.$onConversationCTAClicked) | interfaceC1084f.K(this.$ticketDetailState) | interfaceC1084f.c(this.$isLaunchedProgrammatically);
            final Ia.p<String, Boolean, p293xa.r> pVar = this.$onConversationCTAClicked;
            final TicketDetailState ticketDetailState2 = this.$ticketDetailState;
            final boolean z10 = this.$isLaunchedProgrammatically;
            Object objF = interfaceC1084f.f();
            if (zK || objF == InterfaceC1084f.a.f12980a) {
                objF = new Ia.l() { // from class: io.intercom.android.sdk.m5.navigation.Y
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return TicketDetailDestinationKt.AnonymousClass4.invoke$lambda$1$lambda$0(pVar, ticketDetailState2, z10, (String) obj);
                    }
                };
                interfaceC1084f.E(objF);
            }
            interfaceC1084f.D();
            TicketDetailContentKt.TicketDetailContent(hVarE, ticketDetailContentState, (Ia.l) objF, this.$showSubmissionCard, interfaceC1084f, 64, 0);
            interfaceC1084f.D();
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:74:0x0120  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    public static final void TicketDetailScreen(final TicketDetailState ticketDetailState, Ia.a<p293xa.r> aVar, Ia.p<? super String, ? super Boolean, p293xa.r> pVar, boolean z10, final boolean z11, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        Ia.a<p293xa.r> aVar2;
        int i13;
        Ia.p<? super String, ? super Boolean, p293xa.r> pVar2;
        int i14;
        int i15;
        boolean z12;
        int i16;
        int i17;
        final Ia.a<p293xa.r> bVar;
        Ia.p<? super String, ? super Boolean, p293xa.r> v10;
        boolean z13;
        final Ia.p<? super String, ? super Boolean, p293xa.r> pVar3;
        final Ia.a<p293xa.r> aVar3;
        C1105p0 c1105p0V;
        int i18 = 2;
        kotlin.jvm.internal.i.e(ticketDetailState, "ticketDetailState");
        C1086g c1086gP = interfaceC1084f.p(226165078);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.K(ticketDetailState) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i19 = i11 & 2;
        if (i19 == 0) {
            if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                aVar2 = aVar;
                i12 |= c1086gP.k(aVar2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    pVar2 = pVar;
                    if (c1086gP.k(pVar2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 7168) == 0) {
                        z12 = z10;
                        if (c1086gP.c(z12)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    if ((i11 & 16) != 0) {
                        i12 |= 24576;
                    } else if ((57344 & i10) == 0) {
                        if (c1086gP.c(z11)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i12 |= i17;
                    }
                    if ((46811 & i12) == 9362 || !c1086gP.s()) {
                        if (i19 != 0) {
                            bVar = new M9.b(i18);
                        } else {
                            bVar = aVar2;
                        }
                        if (i13 != 0) {
                            v10 = new V();
                        } else {
                            v10 = pVar2;
                        }
                        if (i15 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        androidx.compose.ui.h hVarB = C0932d.b(androidx.compose.ui.h.a.f13984b, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m621getBackground0d7_KjU(), h0.f13629a);
                        WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap = androidx.compose.foundation.layout.c0.f10254v;
                        ScaffoldKt.a(N0.a(WindowInsetsPaddingKt.c(hVarB, androidx.compose.foundation.layout.c0.a.c(c1086gP).f10256b), "ticket_detail_screen"), androidx.compose.runtime.internal.a.b(-2018170598, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen.3
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i20) {
                                String ticketName;
                                if ((i20 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                    return;
                                }
                                TicketDetailState ticketDetailState2 = ticketDetailState;
                                TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                                if (ticketDetailContentState == null || (ticketName = ticketDetailContentState.getTicketName()) == null) {
                                    ticketName = "";
                                }
                                String str = ticketName;
                                Ia.a<p293xa.r> aVar4 = bVar;
                                Integer numValueOf = Integer.valueOf(io.intercom.android.sdk.ui.R.drawable.intercom_ic_close);
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                int i21 = IntercomTheme.$stable;
                                TopActionBarKt.m130TopActionBarNpQZenA(null, str, null, null, null, aVar4, numValueOf, false, intercomTheme.getColors(interfaceC1084f2, i21).m621getBackground0d7_KjU(), intercomTheme.getColors(interfaceC1084f2, i21).m645getPrimaryText0d7_KjU(), 0L, null, null, interfaceC1084f2, 0, 0, 7325);
                            }
                        }, c1086gP), null, null, null, 0, 0L, 0L, null, androidx.compose.runtime.internal.a.b(1401868325, new AnonymousClass4(ticketDetailState, v10, z11, z13), c1086gP), c1086gP, 805306416, 508);
                        z12 = z13;
                        pVar3 = v10;
                        aVar3 = bVar;
                    } else {
                        c1086gP.w();
                        aVar3 = aVar2;
                        pVar3 = pVar2;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final boolean z14 = z12;
                        c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.navigation.W
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return TicketDetailDestinationKt.TicketDetailScreen$lambda$19(ticketDetailState, aVar3, pVar3, z14, z11, i10, i11, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                    }
                }
                i12 |= 3072;
                z12 = z10;
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                } else if ((57344 & i10) == 0) {
                    if (c1086gP.c(z11)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                if ((46811 & i12) == 9362) {
                    if (i19 != 0) {
                        bVar = new M9.b(i18);
                    } else {
                        bVar = aVar2;
                    }
                    if (i13 != 0) {
                        v10 = new V();
                    } else {
                        v10 = pVar2;
                    }
                    if (i15 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    androidx.compose.ui.h hVarB2 = C0932d.b(androidx.compose.ui.h.a.f13984b, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m621getBackground0d7_KjU(), h0.f13629a);
                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap2 = androidx.compose.foundation.layout.c0.f10254v;
                    ScaffoldKt.a(N0.a(WindowInsetsPaddingKt.c(hVarB2, androidx.compose.foundation.layout.c0.a.c(c1086gP).f10256b), "ticket_detail_screen"), androidx.compose.runtime.internal.a.b(-2018170598, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen.3
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i20) {
                            String ticketName;
                            if ((i20 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            TicketDetailState ticketDetailState2 = ticketDetailState;
                            TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                            if (ticketDetailContentState == null || (ticketName = ticketDetailContentState.getTicketName()) == null) {
                                ticketName = "";
                            }
                            String str = ticketName;
                            Ia.a<p293xa.r> aVar4 = bVar;
                            Integer numValueOf = Integer.valueOf(io.intercom.android.sdk.ui.R.drawable.intercom_ic_close);
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i21 = IntercomTheme.$stable;
                            TopActionBarKt.m130TopActionBarNpQZenA(null, str, null, null, null, aVar4, numValueOf, false, intercomTheme.getColors(interfaceC1084f2, i21).m621getBackground0d7_KjU(), intercomTheme.getColors(interfaceC1084f2, i21).m645getPrimaryText0d7_KjU(), 0L, null, null, interfaceC1084f2, 0, 0, 7325);
                        }
                    }, c1086gP), null, null, null, 0, 0L, 0L, null, androidx.compose.runtime.internal.a.b(1401868325, new AnonymousClass4(ticketDetailState, v10, z11, z13), c1086gP), c1086gP, 805306416, 508);
                    z12 = z13;
                    pVar3 = v10;
                    aVar3 = bVar;
                } else {
                    if (i19 != 0) {
                        bVar = new M9.b(i18);
                    } else {
                        bVar = aVar2;
                    }
                    if (i13 != 0) {
                        v10 = new V();
                    } else {
                        v10 = pVar2;
                    }
                    if (i15 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    androidx.compose.ui.h hVarB3 = C0932d.b(androidx.compose.ui.h.a.f13984b, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m621getBackground0d7_KjU(), h0.f13629a);
                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap3 = androidx.compose.foundation.layout.c0.f10254v;
                    ScaffoldKt.a(N0.a(WindowInsetsPaddingKt.c(hVarB3, androidx.compose.foundation.layout.c0.a.c(c1086gP).f10256b), "ticket_detail_screen"), androidx.compose.runtime.internal.a.b(-2018170598, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen.3
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i20) {
                            String ticketName;
                            if ((i20 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            TicketDetailState ticketDetailState2 = ticketDetailState;
                            TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                            if (ticketDetailContentState == null || (ticketName = ticketDetailContentState.getTicketName()) == null) {
                                ticketName = "";
                            }
                            String str = ticketName;
                            Ia.a<p293xa.r> aVar4 = bVar;
                            Integer numValueOf = Integer.valueOf(io.intercom.android.sdk.ui.R.drawable.intercom_ic_close);
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i21 = IntercomTheme.$stable;
                            TopActionBarKt.m130TopActionBarNpQZenA(null, str, null, null, null, aVar4, numValueOf, false, intercomTheme.getColors(interfaceC1084f2, i21).m621getBackground0d7_KjU(), intercomTheme.getColors(interfaceC1084f2, i21).m645getPrimaryText0d7_KjU(), 0L, null, null, interfaceC1084f2, 0, 0, 7325);
                        }
                    }, c1086gP), null, null, null, 0, 0L, 0L, null, androidx.compose.runtime.internal.a.b(1401868325, new AnonymousClass4(ticketDetailState, v10, z11, z13), c1086gP), c1086gP, 805306416, 508);
                    z12 = z13;
                    pVar3 = v10;
                    aVar3 = bVar;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final boolean z15 = z12;
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.navigation.W
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TicketDetailDestinationKt.TicketDetailScreen$lambda$19(ticketDetailState, aVar3, pVar3, z15, z11, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i12 |= 384;
            pVar2 = pVar;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    z12 = z10;
                    if (c1086gP.c(z12)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                } else if ((57344 & i10) == 0) {
                    if (c1086gP.c(z11)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                if ((46811 & i12) == 9362) {
                    if (i19 != 0) {
                        bVar = new M9.b(i18);
                    } else {
                        bVar = aVar2;
                    }
                    if (i13 != 0) {
                        v10 = new V();
                    } else {
                        v10 = pVar2;
                    }
                    if (i15 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    androidx.compose.ui.h hVarB4 = C0932d.b(androidx.compose.ui.h.a.f13984b, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m621getBackground0d7_KjU(), h0.f13629a);
                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap4 = androidx.compose.foundation.layout.c0.f10254v;
                    ScaffoldKt.a(N0.a(WindowInsetsPaddingKt.c(hVarB4, androidx.compose.foundation.layout.c0.a.c(c1086gP).f10256b), "ticket_detail_screen"), androidx.compose.runtime.internal.a.b(-2018170598, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen.3
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i20) {
                            String ticketName;
                            if ((i20 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            TicketDetailState ticketDetailState2 = ticketDetailState;
                            TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                            if (ticketDetailContentState == null || (ticketName = ticketDetailContentState.getTicketName()) == null) {
                                ticketName = "";
                            }
                            String str = ticketName;
                            Ia.a<p293xa.r> aVar4 = bVar;
                            Integer numValueOf = Integer.valueOf(io.intercom.android.sdk.ui.R.drawable.intercom_ic_close);
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i21 = IntercomTheme.$stable;
                            TopActionBarKt.m130TopActionBarNpQZenA(null, str, null, null, null, aVar4, numValueOf, false, intercomTheme.getColors(interfaceC1084f2, i21).m621getBackground0d7_KjU(), intercomTheme.getColors(interfaceC1084f2, i21).m645getPrimaryText0d7_KjU(), 0L, null, null, interfaceC1084f2, 0, 0, 7325);
                        }
                    }, c1086gP), null, null, null, 0, 0L, 0L, null, androidx.compose.runtime.internal.a.b(1401868325, new AnonymousClass4(ticketDetailState, v10, z11, z13), c1086gP), c1086gP, 805306416, 508);
                    z12 = z13;
                    pVar3 = v10;
                    aVar3 = bVar;
                } else {
                    if (i19 != 0) {
                        bVar = new M9.b(i18);
                    } else {
                        bVar = aVar2;
                    }
                    if (i13 != 0) {
                        v10 = new V();
                    } else {
                        v10 = pVar2;
                    }
                    if (i15 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    androidx.compose.ui.h hVarB5 = C0932d.b(androidx.compose.ui.h.a.f13984b, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m621getBackground0d7_KjU(), h0.f13629a);
                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap5 = androidx.compose.foundation.layout.c0.f10254v;
                    ScaffoldKt.a(N0.a(WindowInsetsPaddingKt.c(hVarB5, androidx.compose.foundation.layout.c0.a.c(c1086gP).f10256b), "ticket_detail_screen"), androidx.compose.runtime.internal.a.b(-2018170598, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen.3
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i20) {
                            String ticketName;
                            if ((i20 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            TicketDetailState ticketDetailState2 = ticketDetailState;
                            TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                            if (ticketDetailContentState == null || (ticketName = ticketDetailContentState.getTicketName()) == null) {
                                ticketName = "";
                            }
                            String str = ticketName;
                            Ia.a<p293xa.r> aVar4 = bVar;
                            Integer numValueOf = Integer.valueOf(io.intercom.android.sdk.ui.R.drawable.intercom_ic_close);
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i21 = IntercomTheme.$stable;
                            TopActionBarKt.m130TopActionBarNpQZenA(null, str, null, null, null, aVar4, numValueOf, false, intercomTheme.getColors(interfaceC1084f2, i21).m621getBackground0d7_KjU(), intercomTheme.getColors(interfaceC1084f2, i21).m645getPrimaryText0d7_KjU(), 0L, null, null, interfaceC1084f2, 0, 0, 7325);
                        }
                    }, c1086gP), null, null, null, 0, 0L, 0L, null, androidx.compose.runtime.internal.a.b(1401868325, new AnonymousClass4(ticketDetailState, v10, z11, z13), c1086gP), c1086gP, 805306416, 508);
                    z12 = z13;
                    pVar3 = v10;
                    aVar3 = bVar;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final boolean z16 = z12;
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.navigation.W
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TicketDetailDestinationKt.TicketDetailScreen$lambda$19(ticketDetailState, aVar3, pVar3, z16, z11, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i12 |= 3072;
            z12 = z10;
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((57344 & i10) == 0) {
                if (c1086gP.c(z11)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            if ((46811 & i12) == 9362) {
                if (i19 != 0) {
                    bVar = new M9.b(i18);
                } else {
                    bVar = aVar2;
                }
                if (i13 != 0) {
                    v10 = new V();
                } else {
                    v10 = pVar2;
                }
                if (i15 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                androidx.compose.ui.h hVarB6 = C0932d.b(androidx.compose.ui.h.a.f13984b, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m621getBackground0d7_KjU(), h0.f13629a);
                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap6 = androidx.compose.foundation.layout.c0.f10254v;
                ScaffoldKt.a(N0.a(WindowInsetsPaddingKt.c(hVarB6, androidx.compose.foundation.layout.c0.a.c(c1086gP).f10256b), "ticket_detail_screen"), androidx.compose.runtime.internal.a.b(-2018170598, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen.3
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i20) {
                        String ticketName;
                        if ((i20 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        TicketDetailState ticketDetailState2 = ticketDetailState;
                        TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                        if (ticketDetailContentState == null || (ticketName = ticketDetailContentState.getTicketName()) == null) {
                            ticketName = "";
                        }
                        String str = ticketName;
                        Ia.a<p293xa.r> aVar4 = bVar;
                        Integer numValueOf = Integer.valueOf(io.intercom.android.sdk.ui.R.drawable.intercom_ic_close);
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i21 = IntercomTheme.$stable;
                        TopActionBarKt.m130TopActionBarNpQZenA(null, str, null, null, null, aVar4, numValueOf, false, intercomTheme.getColors(interfaceC1084f2, i21).m621getBackground0d7_KjU(), intercomTheme.getColors(interfaceC1084f2, i21).m645getPrimaryText0d7_KjU(), 0L, null, null, interfaceC1084f2, 0, 0, 7325);
                    }
                }, c1086gP), null, null, null, 0, 0L, 0L, null, androidx.compose.runtime.internal.a.b(1401868325, new AnonymousClass4(ticketDetailState, v10, z11, z13), c1086gP), c1086gP, 805306416, 508);
                z12 = z13;
                pVar3 = v10;
                aVar3 = bVar;
            } else {
                if (i19 != 0) {
                    bVar = new M9.b(i18);
                } else {
                    bVar = aVar2;
                }
                if (i13 != 0) {
                    v10 = new V();
                } else {
                    v10 = pVar2;
                }
                if (i15 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                androidx.compose.ui.h hVarB7 = C0932d.b(androidx.compose.ui.h.a.f13984b, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m621getBackground0d7_KjU(), h0.f13629a);
                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap7 = androidx.compose.foundation.layout.c0.f10254v;
                ScaffoldKt.a(N0.a(WindowInsetsPaddingKt.c(hVarB7, androidx.compose.foundation.layout.c0.a.c(c1086gP).f10256b), "ticket_detail_screen"), androidx.compose.runtime.internal.a.b(-2018170598, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen.3
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i20) {
                        String ticketName;
                        if ((i20 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        TicketDetailState ticketDetailState2 = ticketDetailState;
                        TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                        if (ticketDetailContentState == null || (ticketName = ticketDetailContentState.getTicketName()) == null) {
                            ticketName = "";
                        }
                        String str = ticketName;
                        Ia.a<p293xa.r> aVar4 = bVar;
                        Integer numValueOf = Integer.valueOf(io.intercom.android.sdk.ui.R.drawable.intercom_ic_close);
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i21 = IntercomTheme.$stable;
                        TopActionBarKt.m130TopActionBarNpQZenA(null, str, null, null, null, aVar4, numValueOf, false, intercomTheme.getColors(interfaceC1084f2, i21).m621getBackground0d7_KjU(), intercomTheme.getColors(interfaceC1084f2, i21).m645getPrimaryText0d7_KjU(), 0L, null, null, interfaceC1084f2, 0, 0, 7325);
                    }
                }, c1086gP), null, null, null, 0, 0L, 0L, null, androidx.compose.runtime.internal.a.b(1401868325, new AnonymousClass4(ticketDetailState, v10, z11, z13), c1086gP), c1086gP, 805306416, 508);
                z12 = z13;
                pVar3 = v10;
                aVar3 = bVar;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final boolean z17 = z12;
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.navigation.W
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TicketDetailDestinationKt.TicketDetailScreen$lambda$19(ticketDetailState, aVar3, pVar3, z17, z11, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 48;
        aVar2 = aVar;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                pVar2 = pVar;
                if (c1086gP.k(pVar2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    z12 = z10;
                    if (c1086gP.c(z12)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                } else if ((57344 & i10) == 0) {
                    if (c1086gP.c(z11)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                if ((46811 & i12) == 9362) {
                    if (i19 != 0) {
                        bVar = new M9.b(i18);
                    } else {
                        bVar = aVar2;
                    }
                    if (i13 != 0) {
                        v10 = new V();
                    } else {
                        v10 = pVar2;
                    }
                    if (i15 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    androidx.compose.ui.h hVarB8 = C0932d.b(androidx.compose.ui.h.a.f13984b, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m621getBackground0d7_KjU(), h0.f13629a);
                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap8 = androidx.compose.foundation.layout.c0.f10254v;
                    ScaffoldKt.a(N0.a(WindowInsetsPaddingKt.c(hVarB8, androidx.compose.foundation.layout.c0.a.c(c1086gP).f10256b), "ticket_detail_screen"), androidx.compose.runtime.internal.a.b(-2018170598, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen.3
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i20) {
                            String ticketName;
                            if ((i20 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            TicketDetailState ticketDetailState2 = ticketDetailState;
                            TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                            if (ticketDetailContentState == null || (ticketName = ticketDetailContentState.getTicketName()) == null) {
                                ticketName = "";
                            }
                            String str = ticketName;
                            Ia.a<p293xa.r> aVar4 = bVar;
                            Integer numValueOf = Integer.valueOf(io.intercom.android.sdk.ui.R.drawable.intercom_ic_close);
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i21 = IntercomTheme.$stable;
                            TopActionBarKt.m130TopActionBarNpQZenA(null, str, null, null, null, aVar4, numValueOf, false, intercomTheme.getColors(interfaceC1084f2, i21).m621getBackground0d7_KjU(), intercomTheme.getColors(interfaceC1084f2, i21).m645getPrimaryText0d7_KjU(), 0L, null, null, interfaceC1084f2, 0, 0, 7325);
                        }
                    }, c1086gP), null, null, null, 0, 0L, 0L, null, androidx.compose.runtime.internal.a.b(1401868325, new AnonymousClass4(ticketDetailState, v10, z11, z13), c1086gP), c1086gP, 805306416, 508);
                    z12 = z13;
                    pVar3 = v10;
                    aVar3 = bVar;
                } else {
                    if (i19 != 0) {
                        bVar = new M9.b(i18);
                    } else {
                        bVar = aVar2;
                    }
                    if (i13 != 0) {
                        v10 = new V();
                    } else {
                        v10 = pVar2;
                    }
                    if (i15 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    androidx.compose.ui.h hVarB9 = C0932d.b(androidx.compose.ui.h.a.f13984b, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m621getBackground0d7_KjU(), h0.f13629a);
                    WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap9 = androidx.compose.foundation.layout.c0.f10254v;
                    ScaffoldKt.a(N0.a(WindowInsetsPaddingKt.c(hVarB9, androidx.compose.foundation.layout.c0.a.c(c1086gP).f10256b), "ticket_detail_screen"), androidx.compose.runtime.internal.a.b(-2018170598, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen.3
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i20) {
                            String ticketName;
                            if ((i20 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            TicketDetailState ticketDetailState2 = ticketDetailState;
                            TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                            if (ticketDetailContentState == null || (ticketName = ticketDetailContentState.getTicketName()) == null) {
                                ticketName = "";
                            }
                            String str = ticketName;
                            Ia.a<p293xa.r> aVar4 = bVar;
                            Integer numValueOf = Integer.valueOf(io.intercom.android.sdk.ui.R.drawable.intercom_ic_close);
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i21 = IntercomTheme.$stable;
                            TopActionBarKt.m130TopActionBarNpQZenA(null, str, null, null, null, aVar4, numValueOf, false, intercomTheme.getColors(interfaceC1084f2, i21).m621getBackground0d7_KjU(), intercomTheme.getColors(interfaceC1084f2, i21).m645getPrimaryText0d7_KjU(), 0L, null, null, interfaceC1084f2, 0, 0, 7325);
                        }
                    }, c1086gP), null, null, null, 0, 0L, 0L, null, androidx.compose.runtime.internal.a.b(1401868325, new AnonymousClass4(ticketDetailState, v10, z11, z13), c1086gP), c1086gP, 805306416, 508);
                    z12 = z13;
                    pVar3 = v10;
                    aVar3 = bVar;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final boolean z18 = z12;
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.navigation.W
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TicketDetailDestinationKt.TicketDetailScreen$lambda$19(ticketDetailState, aVar3, pVar3, z18, z11, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i12 |= 3072;
            z12 = z10;
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((57344 & i10) == 0) {
                if (c1086gP.c(z11)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            if ((46811 & i12) == 9362) {
                if (i19 != 0) {
                    bVar = new M9.b(i18);
                } else {
                    bVar = aVar2;
                }
                if (i13 != 0) {
                    v10 = new V();
                } else {
                    v10 = pVar2;
                }
                if (i15 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                androidx.compose.ui.h hVarB10 = C0932d.b(androidx.compose.ui.h.a.f13984b, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m621getBackground0d7_KjU(), h0.f13629a);
                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap10 = androidx.compose.foundation.layout.c0.f10254v;
                ScaffoldKt.a(N0.a(WindowInsetsPaddingKt.c(hVarB10, androidx.compose.foundation.layout.c0.a.c(c1086gP).f10256b), "ticket_detail_screen"), androidx.compose.runtime.internal.a.b(-2018170598, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen.3
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i20) {
                        String ticketName;
                        if ((i20 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        TicketDetailState ticketDetailState2 = ticketDetailState;
                        TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                        if (ticketDetailContentState == null || (ticketName = ticketDetailContentState.getTicketName()) == null) {
                            ticketName = "";
                        }
                        String str = ticketName;
                        Ia.a<p293xa.r> aVar4 = bVar;
                        Integer numValueOf = Integer.valueOf(io.intercom.android.sdk.ui.R.drawable.intercom_ic_close);
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i21 = IntercomTheme.$stable;
                        TopActionBarKt.m130TopActionBarNpQZenA(null, str, null, null, null, aVar4, numValueOf, false, intercomTheme.getColors(interfaceC1084f2, i21).m621getBackground0d7_KjU(), intercomTheme.getColors(interfaceC1084f2, i21).m645getPrimaryText0d7_KjU(), 0L, null, null, interfaceC1084f2, 0, 0, 7325);
                    }
                }, c1086gP), null, null, null, 0, 0L, 0L, null, androidx.compose.runtime.internal.a.b(1401868325, new AnonymousClass4(ticketDetailState, v10, z11, z13), c1086gP), c1086gP, 805306416, 508);
                z12 = z13;
                pVar3 = v10;
                aVar3 = bVar;
            } else {
                if (i19 != 0) {
                    bVar = new M9.b(i18);
                } else {
                    bVar = aVar2;
                }
                if (i13 != 0) {
                    v10 = new V();
                } else {
                    v10 = pVar2;
                }
                if (i15 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                androidx.compose.ui.h hVarB11 = C0932d.b(androidx.compose.ui.h.a.f13984b, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m621getBackground0d7_KjU(), h0.f13629a);
                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap11 = androidx.compose.foundation.layout.c0.f10254v;
                ScaffoldKt.a(N0.a(WindowInsetsPaddingKt.c(hVarB11, androidx.compose.foundation.layout.c0.a.c(c1086gP).f10256b), "ticket_detail_screen"), androidx.compose.runtime.internal.a.b(-2018170598, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen.3
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i20) {
                        String ticketName;
                        if ((i20 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        TicketDetailState ticketDetailState2 = ticketDetailState;
                        TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                        if (ticketDetailContentState == null || (ticketName = ticketDetailContentState.getTicketName()) == null) {
                            ticketName = "";
                        }
                        String str = ticketName;
                        Ia.a<p293xa.r> aVar4 = bVar;
                        Integer numValueOf = Integer.valueOf(io.intercom.android.sdk.ui.R.drawable.intercom_ic_close);
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i21 = IntercomTheme.$stable;
                        TopActionBarKt.m130TopActionBarNpQZenA(null, str, null, null, null, aVar4, numValueOf, false, intercomTheme.getColors(interfaceC1084f2, i21).m621getBackground0d7_KjU(), intercomTheme.getColors(interfaceC1084f2, i21).m645getPrimaryText0d7_KjU(), 0L, null, null, interfaceC1084f2, 0, 0, 7325);
                    }
                }, c1086gP), null, null, null, 0, 0L, 0L, null, androidx.compose.runtime.internal.a.b(1401868325, new AnonymousClass4(ticketDetailState, v10, z11, z13), c1086gP), c1086gP, 805306416, 508);
                z12 = z13;
                pVar3 = v10;
                aVar3 = bVar;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final boolean z19 = z12;
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.navigation.W
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TicketDetailDestinationKt.TicketDetailScreen$lambda$19(ticketDetailState, aVar3, pVar3, z19, z11, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 384;
        pVar2 = pVar;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 7168) == 0) {
                z12 = z10;
                if (c1086gP.c(z12)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((57344 & i10) == 0) {
                if (c1086gP.c(z11)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            if ((46811 & i12) == 9362) {
                if (i19 != 0) {
                    bVar = new M9.b(i18);
                } else {
                    bVar = aVar2;
                }
                if (i13 != 0) {
                    v10 = new V();
                } else {
                    v10 = pVar2;
                }
                if (i15 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                androidx.compose.ui.h hVarB12 = C0932d.b(androidx.compose.ui.h.a.f13984b, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m621getBackground0d7_KjU(), h0.f13629a);
                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap12 = androidx.compose.foundation.layout.c0.f10254v;
                ScaffoldKt.a(N0.a(WindowInsetsPaddingKt.c(hVarB12, androidx.compose.foundation.layout.c0.a.c(c1086gP).f10256b), "ticket_detail_screen"), androidx.compose.runtime.internal.a.b(-2018170598, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen.3
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i20) {
                        String ticketName;
                        if ((i20 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        TicketDetailState ticketDetailState2 = ticketDetailState;
                        TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                        if (ticketDetailContentState == null || (ticketName = ticketDetailContentState.getTicketName()) == null) {
                            ticketName = "";
                        }
                        String str = ticketName;
                        Ia.a<p293xa.r> aVar4 = bVar;
                        Integer numValueOf = Integer.valueOf(io.intercom.android.sdk.ui.R.drawable.intercom_ic_close);
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i21 = IntercomTheme.$stable;
                        TopActionBarKt.m130TopActionBarNpQZenA(null, str, null, null, null, aVar4, numValueOf, false, intercomTheme.getColors(interfaceC1084f2, i21).m621getBackground0d7_KjU(), intercomTheme.getColors(interfaceC1084f2, i21).m645getPrimaryText0d7_KjU(), 0L, null, null, interfaceC1084f2, 0, 0, 7325);
                    }
                }, c1086gP), null, null, null, 0, 0L, 0L, null, androidx.compose.runtime.internal.a.b(1401868325, new AnonymousClass4(ticketDetailState, v10, z11, z13), c1086gP), c1086gP, 805306416, 508);
                z12 = z13;
                pVar3 = v10;
                aVar3 = bVar;
            } else {
                if (i19 != 0) {
                    bVar = new M9.b(i18);
                } else {
                    bVar = aVar2;
                }
                if (i13 != 0) {
                    v10 = new V();
                } else {
                    v10 = pVar2;
                }
                if (i15 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                androidx.compose.ui.h hVarB13 = C0932d.b(androidx.compose.ui.h.a.f13984b, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m621getBackground0d7_KjU(), h0.f13629a);
                WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap13 = androidx.compose.foundation.layout.c0.f10254v;
                ScaffoldKt.a(N0.a(WindowInsetsPaddingKt.c(hVarB13, androidx.compose.foundation.layout.c0.a.c(c1086gP).f10256b), "ticket_detail_screen"), androidx.compose.runtime.internal.a.b(-2018170598, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen.3
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i20) {
                        String ticketName;
                        if ((i20 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        TicketDetailState ticketDetailState2 = ticketDetailState;
                        TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                        if (ticketDetailContentState == null || (ticketName = ticketDetailContentState.getTicketName()) == null) {
                            ticketName = "";
                        }
                        String str = ticketName;
                        Ia.a<p293xa.r> aVar4 = bVar;
                        Integer numValueOf = Integer.valueOf(io.intercom.android.sdk.ui.R.drawable.intercom_ic_close);
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i21 = IntercomTheme.$stable;
                        TopActionBarKt.m130TopActionBarNpQZenA(null, str, null, null, null, aVar4, numValueOf, false, intercomTheme.getColors(interfaceC1084f2, i21).m621getBackground0d7_KjU(), intercomTheme.getColors(interfaceC1084f2, i21).m645getPrimaryText0d7_KjU(), 0L, null, null, interfaceC1084f2, 0, 0, 7325);
                    }
                }, c1086gP), null, null, null, 0, 0L, 0L, null, androidx.compose.runtime.internal.a.b(1401868325, new AnonymousClass4(ticketDetailState, v10, z11, z13), c1086gP), c1086gP, 805306416, 508);
                z12 = z13;
                pVar3 = v10;
                aVar3 = bVar;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final boolean z110 = z12;
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.navigation.W
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TicketDetailDestinationKt.TicketDetailScreen$lambda$19(ticketDetailState, aVar3, pVar3, z110, z11, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 3072;
        z12 = z10;
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((57344 & i10) == 0) {
            if (c1086gP.c(z11)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i12 |= i17;
        }
        if ((46811 & i12) == 9362) {
            if (i19 != 0) {
                bVar = new M9.b(i18);
            } else {
                bVar = aVar2;
            }
            if (i13 != 0) {
                v10 = new V();
            } else {
                v10 = pVar2;
            }
            if (i15 != 0) {
                z13 = false;
            } else {
                z13 = z12;
            }
            androidx.compose.ui.h hVarB14 = C0932d.b(androidx.compose.ui.h.a.f13984b, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m621getBackground0d7_KjU(), h0.f13629a);
            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap14 = androidx.compose.foundation.layout.c0.f10254v;
            ScaffoldKt.a(N0.a(WindowInsetsPaddingKt.c(hVarB14, androidx.compose.foundation.layout.c0.a.c(c1086gP).f10256b), "ticket_detail_screen"), androidx.compose.runtime.internal.a.b(-2018170598, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen.3
                @Override // Ia.p
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i20) {
                    String ticketName;
                    if ((i20 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    TicketDetailState ticketDetailState2 = ticketDetailState;
                    TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                    if (ticketDetailContentState == null || (ticketName = ticketDetailContentState.getTicketName()) == null) {
                        ticketName = "";
                    }
                    String str = ticketName;
                    Ia.a<p293xa.r> aVar4 = bVar;
                    Integer numValueOf = Integer.valueOf(io.intercom.android.sdk.ui.R.drawable.intercom_ic_close);
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i21 = IntercomTheme.$stable;
                    TopActionBarKt.m130TopActionBarNpQZenA(null, str, null, null, null, aVar4, numValueOf, false, intercomTheme.getColors(interfaceC1084f2, i21).m621getBackground0d7_KjU(), intercomTheme.getColors(interfaceC1084f2, i21).m645getPrimaryText0d7_KjU(), 0L, null, null, interfaceC1084f2, 0, 0, 7325);
                }
            }, c1086gP), null, null, null, 0, 0L, 0L, null, androidx.compose.runtime.internal.a.b(1401868325, new AnonymousClass4(ticketDetailState, v10, z11, z13), c1086gP), c1086gP, 805306416, 508);
            z12 = z13;
            pVar3 = v10;
            aVar3 = bVar;
        } else {
            if (i19 != 0) {
                bVar = new M9.b(i18);
            } else {
                bVar = aVar2;
            }
            if (i13 != 0) {
                v10 = new V();
            } else {
                v10 = pVar2;
            }
            if (i15 != 0) {
                z13 = false;
            } else {
                z13 = z12;
            }
            androidx.compose.ui.h hVarB15 = C0932d.b(androidx.compose.ui.h.a.f13984b, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m621getBackground0d7_KjU(), h0.f13629a);
            WeakHashMap<View, androidx.compose.foundation.layout.c0> weakHashMap15 = androidx.compose.foundation.layout.c0.f10254v;
            ScaffoldKt.a(N0.a(WindowInsetsPaddingKt.c(hVarB15, androidx.compose.foundation.layout.c0.a.c(c1086gP).f10256b), "ticket_detail_screen"), androidx.compose.runtime.internal.a.b(-2018170598, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen.3
                @Override // Ia.p
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i20) {
                    String ticketName;
                    if ((i20 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    TicketDetailState ticketDetailState2 = ticketDetailState;
                    TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState2 instanceof TicketDetailState.TicketDetailContentState ? (TicketDetailState.TicketDetailContentState) ticketDetailState2 : null;
                    if (ticketDetailContentState == null || (ticketName = ticketDetailContentState.getTicketName()) == null) {
                        ticketName = "";
                    }
                    String str = ticketName;
                    Ia.a<p293xa.r> aVar4 = bVar;
                    Integer numValueOf = Integer.valueOf(io.intercom.android.sdk.ui.R.drawable.intercom_ic_close);
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i21 = IntercomTheme.$stable;
                    TopActionBarKt.m130TopActionBarNpQZenA(null, str, null, null, null, aVar4, numValueOf, false, intercomTheme.getColors(interfaceC1084f2, i21).m621getBackground0d7_KjU(), intercomTheme.getColors(interfaceC1084f2, i21).m645getPrimaryText0d7_KjU(), 0L, null, null, interfaceC1084f2, 0, 0, 7325);
                }
            }, c1086gP), null, null, null, 0, 0L, 0L, null, androidx.compose.runtime.internal.a.b(1401868325, new AnonymousClass4(ticketDetailState, v10, z11, z13), c1086gP), c1086gP, 805306416, 508);
            z12 = z13;
            pVar3 = v10;
            aVar3 = bVar;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final boolean z111 = z12;
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.navigation.W
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TicketDetailDestinationKt.TicketDetailScreen$lambda$19(ticketDetailState, aVar3, pVar3, z111, z11, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TicketDetailScreen$lambda$18(String str, boolean z10) {
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TicketDetailScreen$lambda$19(TicketDetailState ticketDetailState, Ia.a aVar, Ia.p pVar, boolean z10, boolean z11, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(ticketDetailState, "$ticketDetailState");
        TicketDetailScreen(ticketDetailState, aVar, pVar, z10, z11, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    public static final void ticketDetailDestination(p141l2.F f10, final p141l2.H navController, final ComponentActivity rootActivity) {
        kotlin.jvm.internal.i.e(f10, "<this>");
        kotlin.jvm.internal.i.e(navController, "navController");
        kotlin.jvm.internal.i.e(rootActivity, "rootActivity");
        androidx.navigation.compose.u.a(f10, "TICKET_DETAIL?show_submission_card={show_submission_card}&transitionArgs={transitionArgs}&isLaunchedProgrammatically={isLaunchedProgrammatically}", kotlin.collections.l.s(L4.b.e(new io.intercom.android.sdk.m5.conversation.ui.U(3), SHOW_SUBMISSION_CARD), L4.b.e(new C2399n(4), "transitionArgs"), L4.b.e(new p011ab.k(6), "isLaunchedProgrammatically")), new androidx.navigation.compose.y(7), new io.intercom.android.sdk.m5.conversation.ui.M(3), new coil.compose.r(3), new B(2), new ComposableLambdaImpl(true, -1948427665, new Ia.r<InterfaceC0900c, C2749t, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.ticketDetailDestination.8

            /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$ticketDetailDestination$8$1, reason: invalid class name */
            /* JADX INFO: compiled from: TicketDetailDestination.kt */
            public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Ia.a<p293xa.r> {
                final /* synthetic */ p141l2.H $navController;
                final /* synthetic */ ComponentActivity $rootActivity;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(p141l2.H h8, ComponentActivity componentActivity) {
                    super(0, kotlin.jvm.internal.i.a.class, "onBackClicked", "ticketDetailDestination$onBackClicked(Landroidx/navigation/NavHostController;Landroidx/activity/ComponentActivity;)V", 0);
                    this.$navController = h8;
                    this.$rootActivity = componentActivity;
                }

                @Override // Ia.a
                public /* bridge */ /* synthetic */ p293xa.r invoke() {
                    invoke2();
                    return p293xa.r.f47939a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    TicketDetailDestinationKt.ticketDetailDestination$onBackClicked(this.$navController, this.$rootActivity);
                }
            }

            /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$ticketDetailDestination$8$2, reason: invalid class name */
            /* JADX INFO: compiled from: TicketDetailDestination.kt */
            public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Ia.p<String, Boolean, p293xa.r> {
                final /* synthetic */ p141l2.H $navController;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(p141l2.H h8) {
                    super(2, kotlin.jvm.internal.i.a.class, "onConversationCTAClicked", "ticketDetailDestination$onConversationCTAClicked(Landroidx/navigation/NavHostController;Ljava/lang/String;Z)V", 0);
                    this.$navController = h8;
                }

                @Override // Ia.p
                public /* bridge */ /* synthetic */ p293xa.r invoke(String str, Boolean bool) {
                    invoke(str, bool.booleanValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(String str, boolean z10) {
                    TicketDetailDestinationKt.ticketDetailDestination$onConversationCTAClicked(this.$navController, str, z10);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void invoke(InterfaceC0900c composable, C2749t it, InterfaceC1084f interfaceC1084f, int i10) {
                kotlin.jvm.internal.i.e(composable, "$this$composable");
                kotlin.jvm.internal.i.e(it, "it");
                p163n2.c cVar = it.f44305i;
                Bundle bundleA = cVar.a();
                boolean z10 = bundleA != null ? bundleA.getBoolean(TicketDetailDestinationKt.SHOW_SUBMISSION_CARD) : false;
                Bundle bundleA2 = cVar.a();
                boolean z11 = bundleA2 != null ? bundleA2.getBoolean("isLaunchedProgrammatically") : false;
                TicketDetailViewModel.Companion companion = TicketDetailViewModel.Companion;
                androidx.lifecycle.c0 c0VarA = p027c1.b.a(interfaceC1084f);
                if (c0VarA == null) {
                    c0VarA = rootActivity;
                }
                TicketDetailDestinationKt.TicketDetailScreen((TicketDetailState) J0.a(companion.create(c0VarA, new TicketLaunchedFrom.Conversation(null, 1, 0 == true ? 1 : 0)).getStateFlow(), interfaceC1084f, 8).getValue(), new AnonymousClass1(navController, rootActivity), new AnonymousClass2(navController), z10, z11, interfaceC1084f, 0, 0);
            }

            @Override // Ia.r
            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0900c interfaceC0900c, C2749t c2749t, InterfaceC1084f interfaceC1084f, Integer num) {
                invoke(interfaceC0900c, c2749t, interfaceC1084f, num.intValue());
                return p293xa.r.f47939a;
            }
        }), 132);
        androidx.navigation.compose.u.a(f10, "TICKET_DETAIL/{ticket_id}?from={from}&transitionArgs={transitionArgs}&isLaunchedProgrammatically={isLaunchedProgrammatically}", kotlin.collections.l.s(L4.b.e(new C(2), TICKET_ID), L4.b.e(new C2429c(2), LAUNCHED_FROM), L4.b.e(new C2430d(2), "transitionArgs"), L4.b.e(new io.intercom.android.sdk.m5.home.ui.b(1), "isLaunchedProgrammatically")), new X(0), new C2365n(2), new C2366o(2), new C2398m(4), new ComposableLambdaImpl(true, 1365826072, new Ia.r<InterfaceC0900c, C2749t, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.ticketDetailDestination.17

            /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$ticketDetailDestination$17$1, reason: invalid class name */
            /* JADX INFO: compiled from: TicketDetailDestination.kt */
            public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Ia.a<p293xa.r> {
                final /* synthetic */ p141l2.H $navController;
                final /* synthetic */ ComponentActivity $rootActivity;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(p141l2.H h8, ComponentActivity componentActivity) {
                    super(0, kotlin.jvm.internal.i.a.class, "onBackClicked", "ticketDetailDestination$onBackClicked(Landroidx/navigation/NavHostController;Landroidx/activity/ComponentActivity;)V", 0);
                    this.$navController = h8;
                    this.$rootActivity = componentActivity;
                }

                @Override // Ia.a
                public /* bridge */ /* synthetic */ p293xa.r invoke() {
                    invoke2();
                    return p293xa.r.f47939a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    TicketDetailDestinationKt.ticketDetailDestination$onBackClicked(this.$navController, this.$rootActivity);
                }
            }

            /* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$ticketDetailDestination$17$2, reason: invalid class name */
            /* JADX INFO: compiled from: TicketDetailDestination.kt */
            public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Ia.p<String, Boolean, p293xa.r> {
                final /* synthetic */ p141l2.H $navController;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(p141l2.H h8) {
                    super(2, kotlin.jvm.internal.i.a.class, "onConversationCTAClicked", "ticketDetailDestination$onConversationCTAClicked(Landroidx/navigation/NavHostController;Ljava/lang/String;Z)V", 0);
                    this.$navController = h8;
                }

                @Override // Ia.p
                public /* bridge */ /* synthetic */ p293xa.r invoke(String str, Boolean bool) {
                    invoke(str, bool.booleanValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(String str, boolean z10) {
                    TicketDetailDestinationKt.ticketDetailDestination$onConversationCTAClicked(this.$navController, str, z10);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void invoke(InterfaceC0900c composable, C2749t it, InterfaceC1084f interfaceC1084f, int i10) {
                String ticketId;
                String from;
                kotlin.jvm.internal.i.e(composable, "$this$composable");
                kotlin.jvm.internal.i.e(it, "it");
                p163n2.c cVar = it.f44305i;
                Bundle bundleA = cVar.a();
                if (bundleA == null || (ticketId = bundleA.getString(TicketDetailDestinationKt.TICKET_ID)) == null) {
                    ticketId = "";
                }
                Bundle bundleA2 = cVar.a();
                boolean z10 = bundleA2 != null ? bundleA2.getBoolean("isLaunchedProgrammatically") : false;
                Bundle bundleA3 = cVar.a();
                if (bundleA3 == null || (from = bundleA3.getString(TicketDetailDestinationKt.LAUNCHED_FROM)) == null) {
                    from = MetricTracker.Context.FROM_TICKETS_SPACE;
                }
                if (navController.b() == null) {
                    Intent intent = rootActivity.getIntent();
                    kotlin.jvm.internal.i.d(intent, "getIntent(...)");
                    IntercomRootActivityArgs argsForIntent = IntercomRootActivityArgsKt.getArgsForIntent(intent);
                    if (argsForIntent instanceof IntercomRootActivityArgs.TicketDetailsScreenArgs) {
                        IntercomRootActivityArgs.TicketDetailsScreenArgs ticketDetailsScreenArgs = (IntercomRootActivityArgs.TicketDetailsScreenArgs) argsForIntent;
                        ticketId = ticketDetailsScreenArgs.getTicketId();
                        from = ticketDetailsScreenArgs.getFrom();
                    }
                }
                TicketDetailViewModel.Companion companion = TicketDetailViewModel.Companion;
                androidx.lifecycle.c0 c0VarA = p027c1.b.a(interfaceC1084f);
                if (c0VarA == null) {
                    c0VarA = rootActivity;
                }
                TicketDetailDestinationKt.TicketDetailScreen((TicketDetailState) J0.a(companion.create(c0VarA, kotlin.jvm.internal.i.a(from, "conversation") ? new TicketLaunchedFrom.Conversation(null, 1, 0 == true ? 1 : 0) : new TicketLaunchedFrom.Other(ticketId, from)).getStateFlow(), interfaceC1084f, 8).getValue(), new AnonymousClass1(navController, rootActivity), new AnonymousClass2(navController), false, z10, interfaceC1084f, 3072, 0);
            }

            @Override // Ia.r
            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0900c interfaceC0900c, C2749t c2749t, InterfaceC1084f interfaceC1084f, Integer num) {
                invoke(interfaceC0900c, c2749t, interfaceC1084f, num.intValue());
                return p293xa.r.f47939a;
            }
        }), 132);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ticketDetailDestination$lambda$10(C2748s navArgument) {
        kotlin.jvm.internal.i.e(navArgument, "$this$navArgument");
        navArgument.b(p141l2.L.StringType);
        navArgument.f44296a.f44293b = true;
        navArgument.a(MetricTracker.Context.FROM_TICKETS_SPACE);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ticketDetailDestination$lambda$11(C2748s navArgument) {
        kotlin.jvm.internal.i.e(navArgument, "$this$navArgument");
        navArgument.b(TransitionStyleKt.getTransitionArgNavType());
        navArgument.a(new TransitionArgs(null, null, null, null, 15, null));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ticketDetailDestination$lambda$12(C2748s navArgument) {
        kotlin.jvm.internal.i.e(navArgument, "$this$navArgument");
        navArgument.b(p141l2.L.BoolType);
        navArgument.a(Boolean.FALSE);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.m ticketDetailDestination$lambda$13(InterfaceC0927e composable) {
        kotlin.jvm.internal.i.e(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((C2749t) composable.h(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.o ticketDetailDestination$lambda$14(InterfaceC0927e composable) {
        kotlin.jvm.internal.i.e(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((C2749t) composable.c(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getExit().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.m ticketDetailDestination$lambda$15(InterfaceC0927e composable) {
        kotlin.jvm.internal.i.e(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((C2749t) composable.h(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.o ticketDetailDestination$lambda$16(InterfaceC0927e composable) {
        kotlin.jvm.internal.i.e(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((C2749t) composable.c(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopExit().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ticketDetailDestination$lambda$2(C2748s navArgument) {
        kotlin.jvm.internal.i.e(navArgument, "$this$navArgument");
        navArgument.b(p141l2.L.BoolType);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ticketDetailDestination$lambda$3(C2748s navArgument) {
        kotlin.jvm.internal.i.e(navArgument, "$this$navArgument");
        navArgument.b(TransitionStyleKt.getTransitionArgNavType());
        navArgument.a(new TransitionArgs(null, null, null, null, 15, null));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ticketDetailDestination$lambda$4(C2748s navArgument) {
        kotlin.jvm.internal.i.e(navArgument, "$this$navArgument");
        navArgument.b(p141l2.L.BoolType);
        navArgument.a(Boolean.FALSE);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.m ticketDetailDestination$lambda$5(InterfaceC0927e composable) {
        kotlin.jvm.internal.i.e(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((C2749t) composable.h(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.o ticketDetailDestination$lambda$6(InterfaceC0927e composable) {
        kotlin.jvm.internal.i.e(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((C2749t) composable.c(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getExit().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.m ticketDetailDestination$lambda$7(InterfaceC0927e composable) {
        kotlin.jvm.internal.i.e(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((C2749t) composable.h(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopEnter().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.animation.o ticketDetailDestination$lambda$8(InterfaceC0927e composable) {
        kotlin.jvm.internal.i.e(composable, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((C2749t) composable.c(), "transitionArgs", TransitionArgs.class, new TransitionArgs(null, null, null, null, 15, null))).getPopExit().transition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ticketDetailDestination$lambda$9(C2748s navArgument) {
        kotlin.jvm.internal.i.e(navArgument, "$this$navArgument");
        navArgument.b(p141l2.L.StringType);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ticketDetailDestination$onBackClicked(p141l2.H h8, ComponentActivity componentActivity) {
        if (h8.b() == null) {
            componentActivity.getOnBackPressedDispatcher().c();
        } else {
            h8.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ticketDetailDestination$onConversationCTAClicked(p141l2.H h8, String str, boolean z10) {
        IntercomRouterKt.openConversation$default(h8, str, null, z10, null, Fa.d.e(new C2446u(1)), null, 42, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ticketDetailDestination$onConversationCTAClicked$lambda$1(p141l2.K navOptions) {
        kotlin.jvm.internal.i.e(navOptions, "$this$navOptions");
        navOptions.a(new D(1), "CONVERSATION");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ticketDetailDestination$onConversationCTAClicked$lambda$1$lambda$0(p141l2.T popUpTo) {
        kotlin.jvm.internal.i.e(popUpTo, "$this$popUpTo");
        popUpTo.f44280a = true;
        return p293xa.r.f47939a;
    }
}
