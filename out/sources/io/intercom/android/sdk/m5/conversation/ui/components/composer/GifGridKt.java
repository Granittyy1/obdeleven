package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.InterfaceC1000i;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextFieldDefaults;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.M0;
import androidx.compose.ui.platform.N0;
import androidx.core.view.C1293h;
import io.intercom.android.sdk.BuildConfig;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.O0;
import io.intercom.android.sdk.survey.block.ImageBlockKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: GifGrid.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class GifGridKt {
    /* JADX WARN: Code duplicated, block: B:25:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:27:0x011e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0186  */
    /* JADX WARN: Code duplicated, block: B:32:0x018e  */
    /* JADX WARN: Code duplicated, block: B:37:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:43:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:46:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:49:0x0200  */
    /* JADX WARN: Code duplicated, block: B:53:0x0227  */
    /* JADX WARN: Code duplicated, block: B:55:0x022d  */
    /* JADX WARN: Code duplicated, block: B:61:0x023a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:64:0x0240  */
    /* JADX WARN: Code duplicated, block: B:67:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:71:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x02df  */
    /* JADX WARN: Code duplicated, block: B:79:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:82:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:85:0x0358  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void GifGrid(androidx.compose.ui.h hVar, final List<? extends Block> gifs, final Ia.l<? super Block, p293xa.r> onGifClick, final Ia.l<? super String, p293xa.r> onGifSearchQueryChange, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        androidx.compose.foundation.interaction.k kVar;
        Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar;
        int i12;
        boolean zK;
        Object objF;
        InterfaceC1084f.a.C0153a c0153a;
        int i13;
        boolean z10;
        Object objF2;
        final androidx.compose.runtime.X x10;
        final androidx.compose.runtime.X x11;
        C1105p0 c1105p0V;
        boolean z11;
        Object objF3;
        kotlin.jvm.internal.i.e(gifs, "gifs");
        kotlin.jvm.internal.i.e(onGifClick, "onGifClick");
        kotlin.jvm.internal.i.e(onGifSearchQueryChange, "onGifSearchQueryChange");
        C1086g c1086gP = interfaceC1084f.p(2027814826);
        int i14 = i11 & 1;
        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
        final androidx.compose.ui.h hVar2 = i14 != 0 ? aVar : hVar;
        c1086gP.L(-1549192846);
        Object objF4 = c1086gP.f();
        InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
        if (objF4 == c0153a2) {
            objF4 = J0.f("");
            c1086gP.E(objF4);
        }
        androidx.compose.runtime.X x12 = (androidx.compose.runtime.X) objF4;
        c1086gP.T(false);
        c1086gP.L(-1549190918);
        Object objF5 = c1086gP.f();
        if (objF5 == c0153a2) {
            objF5 = new androidx.compose.foundation.interaction.l();
            c1086gP.E(objF5);
        }
        androidx.compose.foundation.interaction.k kVar2 = (androidx.compose.foundation.interaction.k) objF5;
        c1086gP.T(false);
        M0 m7 = (M0) c1086gP.x(CompositionLocalsKt.f14854p);
        C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
        int i15 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, aVar);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar2 = ComposeUiNode.Companion.f14337f;
        R0.a(pVar2, c1086gP, c0953mA);
        Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar3 = ComposeUiNode.Companion.f14336e;
        R0.a(pVar3, c1086gP, interfaceC1089h0P);
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar4 = ComposeUiNode.Companion.f14338g;
        if (!c1086gP.f12995O) {
            kVar = kVar2;
            if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i15))) {
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar5 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar5, c1086gP, hVarC);
            c1086gP.L(-1834338565);
            if (kotlin.jvm.internal.i.a(x12.getValue(), "intercom version")) {
                pVar = pVar3;
                TextKt.b(BuildConfig.VERSION_NAME, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 0, 0, 131070);
            } else {
                pVar = pVar3;
            }
            c1086gP.T(false);
            float f10 = 8;
            androidx.compose.ui.h hVarH = PaddingKt.h(androidx.compose.foundation.layout.W.d(aVar, 1.0f), f10, 0.0f, 2);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i16 = IntercomTheme.$stable;
            androidx.compose.ui.h hVarG = PaddingKt.g(f10, 12, C0932d.b(hVarH, androidx.compose.ui.graphics.H.b(0.05f, intercomTheme.getColors(c1086gP, i16).m645getPrimaryText0d7_KjU()), intercomTheme.getShapes(c1086gP, i16).f12430b));
            androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
            i12 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarG);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(pVar2, c1086gP, tA);
            R0.a(pVar, c1086gP, interfaceC1089h0P2);
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i12))) {
                J4.i.d(i12, c1086gP, i12, pVar4);
            }
            R0.a(pVar5, c1086gP, hVarC2);
            String str = (String) x12.getValue();
            androidx.compose.ui.text.F type04 = intercomTheme.getTypography(c1086gP, i16).getType04();
            if (1.0f <= 0.0d) {
                p258v.a.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(true, Na.l.z(1.0f, Float.MAX_VALUE));
            androidx.compose.foundation.text.k kVarA = androidx.compose.foundation.text.k.a(0, 0, 3, R.styleable.AppCompatTheme_windowActionModeOverlay);
            c1086gP.L(-1582275237);
            zK = c1086gP.K(m7);
            objF = c1086gP.f();
            if (!zK) {
                c0153a = c0153a2;
                if (objF == c0153a) {
                }
                c1086gP.T(false);
                androidx.compose.foundation.text.j jVar = new androidx.compose.foundation.text.j(null, null, (Ia.l) objF, 47);
                c1086gP.L(-1582287683);
                i13 = (i10 & 7168) ^ 3072;
                z10 = (i13 <= 2048 && c1086gP.K(onGifSearchQueryChange)) || (i10 & 3072) == 2048;
                objF2 = c1086gP.f();
                if (!z10 || objF2 == c0153a) {
                    x10 = x12;
                    objF2 = new Ia.l() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.F
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            return GifGridKt.GifGrid$lambda$11$lambda$8$lambda$5$lambda$4(x10, onGifSearchQueryChange, (String) obj);
                        }
                    };
                    c1086gP.E(objF2);
                } else {
                    x10 = x12;
                }
                c1086gP.T(false);
                final androidx.compose.foundation.interaction.k kVar3 = kVar;
                InterfaceC1084f.a.C0153a c0153a3 = c0153a;
                x11 = x10;
                BasicTextFieldKt.b(str, (Ia.l) objF2, layoutWeightElement, false, false, type04, kVarA, jVar, true, 0, 0, null, null, null, null, androidx.compose.runtime.internal.a.b(1827261249, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.GifGridKt$GifGrid$1$1$3
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar6, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke((Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r>) pVar6, interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> it, InterfaceC1084f interfaceC1084f2, int i17) {
                        int i18;
                        kotlin.jvm.internal.i.e(it, "it");
                        if ((i17 & 14) == 0) {
                            i18 = i17 | (interfaceC1084f2.k(it) ? 4 : 2);
                        } else {
                            i18 = i17;
                        }
                        if ((i18 & 91) == 18 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.f12369a;
                        String value = x10.getValue();
                        C1293h c1293h = androidx.compose.ui.text.input.E.a.f15486a;
                        float f11 = 0;
                        androidx.compose.foundation.layout.N n10 = new androidx.compose.foundation.layout.N(f11, f11, f11, f11);
                        long j = androidx.compose.ui.graphics.H.f13503k;
                        textFieldDefaults.b(value, it, true, true, c1293h, kVar3, false, null, ComposableSingletons$GifGridKt.INSTANCE.m198getLambda1$intercom_sdk_base_release(), null, null, null, null, null, null, TextFieldDefaults.d(0L, 0L, 0L, j, j, 0L, 0L, j, j, 0L, interfaceC1084f2, 2147477455), n10, null, interfaceC1084f2, ((i18 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 100887936, 102236160, 163520);
                    }
                }, c1086gP), c1086gP, 100663296, 196608, 32280);
                Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar, f10));
                if (((CharSequence) x11.getValue()).length() > 0) {
                    c1086gP.L(-1804490114);
                    int i17 = io.intercom.android.sdk.R.drawable.intercom_close;
                    c1086gP.L(-1582228259);
                    z11 = (i13 <= 2048 && c1086gP.K(onGifSearchQueryChange)) || (i10 & 3072) == 2048;
                    objF3 = c1086gP.f();
                    if (z11 || objF3 == c0153a3) {
                        objF3 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.G
                            @Override // Ia.a
                            public final Object invoke() {
                                return GifGridKt.GifGrid$lambda$11$lambda$8$lambda$7$lambda$6(x11, onGifSearchQueryChange);
                            }
                        };
                        c1086gP.E(objF3);
                    }
                    c1086gP.T(false);
                    GifGridIcon(i17, (Ia.a) objF3, c1086gP, 0, 0);
                    c1086gP.T(false);
                } else {
                    c1086gP.L(-1804309663);
                    GifGridIcon(io.intercom.android.sdk.R.drawable.intercom_gif_search_icon, null, c1086gP, 0, 2);
                    c1086gP.T(false);
                }
                c1086gP.T(true);
                Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 4));
                LazyStaggeredGridDslKt.a(new androidx.compose.foundation.lazy.staggeredgrid.w.a(), androidx.compose.foundation.layout.W.d(hVar2, 1.0f), null, new androidx.compose.foundation.layout.N(f10, f10, f10, f10), false, f10, C0945e.g(f10), null, false, null, new io.intercom.android.sdk.m5.conversation.ui.components.N(gifs, 1, onGifClick), c1086gP, 1772544, 0, 916);
                c1086gP.T(true);
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.H
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return GifGridKt.GifGrid$lambda$12(hVar2, gifs, onGifClick, onGifSearchQueryChange, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            c0153a = c0153a2;
            objF = new io.intercom.android.sdk.m5.conversation.ui.B(1, m7);
            c1086gP.E(objF);
            c1086gP.T(false);
            androidx.compose.foundation.text.j jVar2 = new androidx.compose.foundation.text.j(null, null, (Ia.l) objF, 47);
            c1086gP.L(-1582287683);
            i13 = (i10 & 7168) ^ 3072;
            if (i13 <= 2048) {
            }
            objF2 = c1086gP.f();
            if (z10) {
                x10 = x12;
                objF2 = new Ia.l() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.F
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return GifGridKt.GifGrid$lambda$11$lambda$8$lambda$5$lambda$4(x10, onGifSearchQueryChange, (String) obj);
                    }
                };
                c1086gP.E(objF2);
            } else {
                x10 = x12;
                objF2 = new Ia.l() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.F
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return GifGridKt.GifGrid$lambda$11$lambda$8$lambda$5$lambda$4(x10, onGifSearchQueryChange, (String) obj);
                    }
                };
                c1086gP.E(objF2);
            }
            c1086gP.T(false);
            final androidx.compose.foundation.interaction.k kVar4 = kVar;
            InterfaceC1084f.a.C0153a c0153a4 = c0153a;
            x11 = x10;
            BasicTextFieldKt.b(str, (Ia.l) objF2, layoutWeightElement, false, false, type04, kVarA, jVar2, true, 0, 0, null, null, null, null, androidx.compose.runtime.internal.a.b(1827261249, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.GifGridKt$GifGrid$1$1$3
                @Override // Ia.q
                public /* bridge */ /* synthetic */ p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar6, InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke((Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r>) pVar6, interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> it, InterfaceC1084f interfaceC1084f2, int i18) {
                    int i19;
                    kotlin.jvm.internal.i.e(it, "it");
                    if ((i18 & 14) == 0) {
                        i19 = i18 | (interfaceC1084f2.k(it) ? 4 : 2);
                    } else {
                        i19 = i18;
                    }
                    if ((i19 & 91) == 18 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f12369a;
                    String value = x10.getValue();
                    C1293h c1293h = androidx.compose.ui.text.input.E.a.f15486a;
                    float f11 = 0;
                    androidx.compose.foundation.layout.N n10 = new androidx.compose.foundation.layout.N(f11, f11, f11, f11);
                    long j = androidx.compose.ui.graphics.H.f13503k;
                    textFieldDefaults.b(value, it, true, true, c1293h, kVar4, false, null, ComposableSingletons$GifGridKt.INSTANCE.m198getLambda1$intercom_sdk_base_release(), null, null, null, null, null, null, TextFieldDefaults.d(0L, 0L, 0L, j, j, 0L, 0L, j, j, 0L, interfaceC1084f2, 2147477455), n10, null, interfaceC1084f2, ((i19 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 100887936, 102236160, 163520);
                }
            }, c1086gP), c1086gP, 100663296, 196608, 32280);
            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar, f10));
            if (((CharSequence) x11.getValue()).length() > 0) {
                c1086gP.L(-1804490114);
                int i18 = io.intercom.android.sdk.R.drawable.intercom_close;
                c1086gP.L(-1582228259);
                if (i13 <= 2048) {
                }
                objF3 = c1086gP.f();
                if (z11) {
                    objF3 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.G
                        @Override // Ia.a
                        public final Object invoke() {
                            return GifGridKt.GifGrid$lambda$11$lambda$8$lambda$7$lambda$6(x11, onGifSearchQueryChange);
                        }
                    };
                    c1086gP.E(objF3);
                } else {
                    objF3 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.G
                        @Override // Ia.a
                        public final Object invoke() {
                            return GifGridKt.GifGrid$lambda$11$lambda$8$lambda$7$lambda$6(x11, onGifSearchQueryChange);
                        }
                    };
                    c1086gP.E(objF3);
                }
                c1086gP.T(false);
                GifGridIcon(i18, (Ia.a) objF3, c1086gP, 0, 0);
                c1086gP.T(false);
            } else {
                c1086gP.L(-1804309663);
                GifGridIcon(io.intercom.android.sdk.R.drawable.intercom_gif_search_icon, null, c1086gP, 0, 2);
                c1086gP.T(false);
            }
            c1086gP.T(true);
            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 4));
            LazyStaggeredGridDslKt.a(new androidx.compose.foundation.lazy.staggeredgrid.w.a(), androidx.compose.foundation.layout.W.d(hVar2, 1.0f), null, new androidx.compose.foundation.layout.N(f10, f10, f10, f10), false, f10, C0945e.g(f10), null, false, null, new io.intercom.android.sdk.m5.conversation.ui.components.N(gifs, 1, onGifClick), c1086gP, 1772544, 0, 916);
            c1086gP.T(true);
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.H
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return GifGridKt.GifGrid$lambda$12(hVar2, gifs, onGifClick, onGifSearchQueryChange, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        kVar = kVar2;
        J4.i.d(i15, c1086gP, i15, pVar4);
        Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar6 = ComposeUiNode.Companion.f14335d;
        R0.a(pVar6, c1086gP, hVarC);
        c1086gP.L(-1834338565);
        if (kotlin.jvm.internal.i.a(x12.getValue(), "intercom version")) {
            pVar = pVar3;
            TextKt.b(BuildConfig.VERSION_NAME, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 0, 0, 131070);
        } else {
            pVar = pVar3;
        }
        c1086gP.T(false);
        float f11 = 8;
        androidx.compose.ui.h hVarH2 = PaddingKt.h(androidx.compose.foundation.layout.W.d(aVar, 1.0f), f11, 0.0f, 2);
        IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
        int i19 = IntercomTheme.$stable;
        androidx.compose.ui.h hVarG2 = PaddingKt.g(f11, 12, C0932d.b(hVarH2, androidx.compose.ui.graphics.H.b(0.05f, intercomTheme2.getColors(c1086gP, i19).m645getPrimaryText0d7_KjU()), intercomTheme2.getShapes(c1086gP, i19).f12430b));
        androidx.compose.foundation.layout.T tA2 = androidx.compose.foundation.layout.S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
        i12 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
        androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVarG2);
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        R0.a(pVar2, c1086gP, tA2);
        R0.a(pVar, c1086gP, interfaceC1089h0P3);
        if (c1086gP.f12995O) {
            J4.i.d(i12, c1086gP, i12, pVar4);
        } else {
            J4.i.d(i12, c1086gP, i12, pVar4);
        }
        R0.a(pVar6, c1086gP, hVarC3);
        String str2 = (String) x12.getValue();
        androidx.compose.ui.text.F type05 = intercomTheme2.getTypography(c1086gP, i19).getType04();
        if (1.0f <= 0.0d) {
            p258v.a.a("invalid weight; must be greater than zero");
        }
        LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(true, Na.l.z(1.0f, Float.MAX_VALUE));
        androidx.compose.foundation.text.k kVarA2 = androidx.compose.foundation.text.k.a(0, 0, 3, R.styleable.AppCompatTheme_windowActionModeOverlay);
        c1086gP.L(-1582275237);
        zK = c1086gP.K(m7);
        objF = c1086gP.f();
        if (!zK) {
            c0153a = c0153a2;
            if (objF == c0153a) {
            }
            c1086gP.T(false);
            androidx.compose.foundation.text.j jVar3 = new androidx.compose.foundation.text.j(null, null, (Ia.l) objF, 47);
            c1086gP.L(-1582287683);
            i13 = (i10 & 7168) ^ 3072;
            if (i13 <= 2048) {
            }
            objF2 = c1086gP.f();
            if (z10) {
                x10 = x12;
                objF2 = new Ia.l() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.F
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return GifGridKt.GifGrid$lambda$11$lambda$8$lambda$5$lambda$4(x10, onGifSearchQueryChange, (String) obj);
                    }
                };
                c1086gP.E(objF2);
            } else {
                x10 = x12;
                objF2 = new Ia.l() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.F
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return GifGridKt.GifGrid$lambda$11$lambda$8$lambda$5$lambda$4(x10, onGifSearchQueryChange, (String) obj);
                    }
                };
                c1086gP.E(objF2);
            }
            c1086gP.T(false);
            final androidx.compose.foundation.interaction.k kVar5 = kVar;
            InterfaceC1084f.a.C0153a c0153a5 = c0153a;
            x11 = x10;
            BasicTextFieldKt.b(str2, (Ia.l) objF2, layoutWeightElement2, false, false, type05, kVarA2, jVar3, true, 0, 0, null, null, null, null, androidx.compose.runtime.internal.a.b(1827261249, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.GifGridKt$GifGrid$1$1$3
                @Override // Ia.q
                public /* bridge */ /* synthetic */ p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar7, InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke((Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r>) pVar7, interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> it, InterfaceC1084f interfaceC1084f2, int i110) {
                    int i111;
                    kotlin.jvm.internal.i.e(it, "it");
                    if ((i110 & 14) == 0) {
                        i111 = i110 | (interfaceC1084f2.k(it) ? 4 : 2);
                    } else {
                        i111 = i110;
                    }
                    if ((i111 & 91) == 18 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f12369a;
                    String value = x10.getValue();
                    C1293h c1293h = androidx.compose.ui.text.input.E.a.f15486a;
                    float f12 = 0;
                    androidx.compose.foundation.layout.N n10 = new androidx.compose.foundation.layout.N(f12, f12, f12, f12);
                    long j = androidx.compose.ui.graphics.H.f13503k;
                    textFieldDefaults.b(value, it, true, true, c1293h, kVar5, false, null, ComposableSingletons$GifGridKt.INSTANCE.m198getLambda1$intercom_sdk_base_release(), null, null, null, null, null, null, TextFieldDefaults.d(0L, 0L, 0L, j, j, 0L, 0L, j, j, 0L, interfaceC1084f2, 2147477455), n10, null, interfaceC1084f2, ((i111 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 100887936, 102236160, 163520);
                }
            }, c1086gP), c1086gP, 100663296, 196608, 32280);
            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar, f11));
            if (((CharSequence) x11.getValue()).length() > 0) {
                c1086gP.L(-1804490114);
                int i110 = io.intercom.android.sdk.R.drawable.intercom_close;
                c1086gP.L(-1582228259);
                if (i13 <= 2048) {
                }
                objF3 = c1086gP.f();
                if (z11) {
                    objF3 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.G
                        @Override // Ia.a
                        public final Object invoke() {
                            return GifGridKt.GifGrid$lambda$11$lambda$8$lambda$7$lambda$6(x11, onGifSearchQueryChange);
                        }
                    };
                    c1086gP.E(objF3);
                } else {
                    objF3 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.G
                        @Override // Ia.a
                        public final Object invoke() {
                            return GifGridKt.GifGrid$lambda$11$lambda$8$lambda$7$lambda$6(x11, onGifSearchQueryChange);
                        }
                    };
                    c1086gP.E(objF3);
                }
                c1086gP.T(false);
                GifGridIcon(i110, (Ia.a) objF3, c1086gP, 0, 0);
                c1086gP.T(false);
            } else {
                c1086gP.L(-1804309663);
                GifGridIcon(io.intercom.android.sdk.R.drawable.intercom_gif_search_icon, null, c1086gP, 0, 2);
                c1086gP.T(false);
            }
            c1086gP.T(true);
            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 4));
            LazyStaggeredGridDslKt.a(new androidx.compose.foundation.lazy.staggeredgrid.w.a(), androidx.compose.foundation.layout.W.d(hVar2, 1.0f), null, new androidx.compose.foundation.layout.N(f11, f11, f11, f11), false, f11, C0945e.g(f11), null, false, null, new io.intercom.android.sdk.m5.conversation.ui.components.N(gifs, 1, onGifClick), c1086gP, 1772544, 0, 916);
            c1086gP.T(true);
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.H
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return GifGridKt.GifGrid$lambda$12(hVar2, gifs, onGifClick, onGifSearchQueryChange, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        c0153a = c0153a2;
        objF = new io.intercom.android.sdk.m5.conversation.ui.B(1, m7);
        c1086gP.E(objF);
        c1086gP.T(false);
        androidx.compose.foundation.text.j jVar4 = new androidx.compose.foundation.text.j(null, null, (Ia.l) objF, 47);
        c1086gP.L(-1582287683);
        i13 = (i10 & 7168) ^ 3072;
        if (i13 <= 2048) {
        }
        objF2 = c1086gP.f();
        if (z10) {
            x10 = x12;
            objF2 = new Ia.l() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.F
                @Override // Ia.l
                public final Object invoke(Object obj) {
                    return GifGridKt.GifGrid$lambda$11$lambda$8$lambda$5$lambda$4(x10, onGifSearchQueryChange, (String) obj);
                }
            };
            c1086gP.E(objF2);
        } else {
            x10 = x12;
            objF2 = new Ia.l() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.F
                @Override // Ia.l
                public final Object invoke(Object obj) {
                    return GifGridKt.GifGrid$lambda$11$lambda$8$lambda$5$lambda$4(x10, onGifSearchQueryChange, (String) obj);
                }
            };
            c1086gP.E(objF2);
        }
        c1086gP.T(false);
        final androidx.compose.foundation.interaction.k kVar6 = kVar;
        InterfaceC1084f.a.C0153a c0153a6 = c0153a;
        x11 = x10;
        BasicTextFieldKt.b(str2, (Ia.l) objF2, layoutWeightElement2, false, false, type05, kVarA2, jVar4, true, 0, 0, null, null, null, null, androidx.compose.runtime.internal.a.b(1827261249, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.GifGridKt$GifGrid$1$1$3
            @Override // Ia.q
            public /* bridge */ /* synthetic */ p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar7, InterfaceC1084f interfaceC1084f2, Integer num) {
                invoke((Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r>) pVar7, interfaceC1084f2, num.intValue());
                return p293xa.r.f47939a;
            }

            public final void invoke(Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> it, InterfaceC1084f interfaceC1084f2, int i111) {
                int i112;
                kotlin.jvm.internal.i.e(it, "it");
                if ((i111 & 14) == 0) {
                    i112 = i111 | (interfaceC1084f2.k(it) ? 4 : 2);
                } else {
                    i112 = i111;
                }
                if ((i112 & 91) == 18 && interfaceC1084f2.s()) {
                    interfaceC1084f2.w();
                    return;
                }
                TextFieldDefaults textFieldDefaults = TextFieldDefaults.f12369a;
                String value = x10.getValue();
                C1293h c1293h = androidx.compose.ui.text.input.E.a.f15486a;
                float f12 = 0;
                androidx.compose.foundation.layout.N n10 = new androidx.compose.foundation.layout.N(f12, f12, f12, f12);
                long j = androidx.compose.ui.graphics.H.f13503k;
                textFieldDefaults.b(value, it, true, true, c1293h, kVar6, false, null, ComposableSingletons$GifGridKt.INSTANCE.m198getLambda1$intercom_sdk_base_release(), null, null, null, null, null, null, TextFieldDefaults.d(0L, 0L, 0L, j, j, 0L, 0L, j, j, 0L, interfaceC1084f2, 2147477455), n10, null, interfaceC1084f2, ((i112 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 100887936, 102236160, 163520);
            }
        }, c1086gP), c1086gP, 100663296, 196608, 32280);
        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar, f11));
        if (((CharSequence) x11.getValue()).length() > 0) {
            c1086gP.L(-1804490114);
            int i111 = io.intercom.android.sdk.R.drawable.intercom_close;
            c1086gP.L(-1582228259);
            if (i13 <= 2048) {
            }
            objF3 = c1086gP.f();
            if (z11) {
                objF3 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.G
                    @Override // Ia.a
                    public final Object invoke() {
                        return GifGridKt.GifGrid$lambda$11$lambda$8$lambda$7$lambda$6(x11, onGifSearchQueryChange);
                    }
                };
                c1086gP.E(objF3);
            } else {
                objF3 = new Ia.a() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.G
                    @Override // Ia.a
                    public final Object invoke() {
                        return GifGridKt.GifGrid$lambda$11$lambda$8$lambda$7$lambda$6(x11, onGifSearchQueryChange);
                    }
                };
                c1086gP.E(objF3);
            }
            c1086gP.T(false);
            GifGridIcon(i111, (Ia.a) objF3, c1086gP, 0, 0);
            c1086gP.T(false);
        } else {
            c1086gP.L(-1804309663);
            GifGridIcon(io.intercom.android.sdk.R.drawable.intercom_gif_search_icon, null, c1086gP, 0, 2);
            c1086gP.T(false);
        }
        c1086gP.T(true);
        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 4));
        LazyStaggeredGridDslKt.a(new androidx.compose.foundation.lazy.staggeredgrid.w.a(), androidx.compose.foundation.layout.W.d(hVar2, 1.0f), null, new androidx.compose.foundation.layout.N(f11, f11, f11, f11), false, f11, C0945e.g(f11), null, false, null, new io.intercom.android.sdk.m5.conversation.ui.components.N(gifs, 1, onGifClick), c1086gP, 1772544, 0, 916);
        c1086gP.T(true);
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.H
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return GifGridKt.GifGrid$lambda$12(hVar2, gifs, onGifClick, onGifSearchQueryChange, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [io.intercom.android.sdk.m5.conversation.ui.components.composer.GifGridKt$GifGrid$lambda$11$lambda$10$$inlined$itemsIndexed$default$2] */
    public static final p293xa.r GifGrid$lambda$11$lambda$10(final List gifs, final Ia.l onGifClick, androidx.compose.foundation.lazy.staggeredgrid.q LazyVerticalStaggeredGrid) {
        kotlin.jvm.internal.i.e(gifs, "$gifs");
        kotlin.jvm.internal.i.e(onGifClick, "$onGifClick");
        kotlin.jvm.internal.i.e(LazyVerticalStaggeredGrid, "$this$LazyVerticalStaggeredGrid");
        LazyVerticalStaggeredGrid.a(gifs.size(), new Ia.l<Integer, Object>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.GifGridKt$GifGrid$lambda$11$lambda$10$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i10) {
                gifs.get(i10);
                return null;
            }
        }, new ComposableLambdaImpl(true, 284833944, new Ia.r<androidx.compose.foundation.lazy.staggeredgrid.h, Integer, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.GifGridKt$GifGrid$lambda$11$lambda$10$$inlined$itemsIndexed$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // Ia.r
            public /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.foundation.lazy.staggeredgrid.h hVar, Integer num, InterfaceC1084f interfaceC1084f, Integer num2) {
                invoke(hVar, num.intValue(), interfaceC1084f, num2.intValue());
                return p293xa.r.f47939a;
            }

            public final void invoke(androidx.compose.foundation.lazy.staggeredgrid.h hVar, int i10, InterfaceC1084f interfaceC1084f, int i11) {
                int i12;
                if ((i11 & 6) == 0) {
                    i12 = (interfaceC1084f.K(hVar) ? 4 : 2) | i11;
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    i12 |= interfaceC1084f.h(i10) ? 32 : 16;
                }
                if (!interfaceC1084f.C(i12 & 1, (i12 & 147) != 146)) {
                    interfaceC1084f.w();
                    return;
                }
                Block block = (Block) gifs.get(i10);
                interfaceC1084f.L(-1572851321);
                ImageBlockKt.ImageBlock(block, null, onGifClick, true, null, interfaceC1084f, 3080, 18);
                interfaceC1084f.D();
            }
        }));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r GifGrid$lambda$11$lambda$8$lambda$3$lambda$2(M0 m7, InterfaceC1000i KeyboardActions) {
        kotlin.jvm.internal.i.e(KeyboardActions, "$this$KeyboardActions");
        if (m7 != null) {
            m7.b();
        }
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r GifGrid$lambda$11$lambda$8$lambda$5$lambda$4(androidx.compose.runtime.X searchText, Ia.l onGifSearchQueryChange, String it) {
        kotlin.jvm.internal.i.e(searchText, "$searchText");
        kotlin.jvm.internal.i.e(onGifSearchQueryChange, "$onGifSearchQueryChange");
        kotlin.jvm.internal.i.e(it, "it");
        searchText.setValue(it);
        onGifSearchQueryChange.invoke(it);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r GifGrid$lambda$11$lambda$8$lambda$7$lambda$6(androidx.compose.runtime.X searchText, Ia.l onGifSearchQueryChange) {
        kotlin.jvm.internal.i.e(searchText, "$searchText");
        kotlin.jvm.internal.i.e(onGifSearchQueryChange, "$onGifSearchQueryChange");
        searchText.setValue("");
        onGifSearchQueryChange.invoke("");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r GifGrid$lambda$12(androidx.compose.ui.h hVar, List gifs, Ia.l onGifClick, Ia.l onGifSearchQueryChange, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(gifs, "$gifs");
        kotlin.jvm.internal.i.e(onGifClick, "$onGifClick");
        kotlin.jvm.internal.i.e(onGifSearchQueryChange, "$onGifSearchQueryChange");
        GifGrid(hVar, gifs, onGifClick, onGifSearchQueryChange, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    private static final void GifGridIcon(final int i10, final Ia.a<p293xa.r> aVar, InterfaceC1084f interfaceC1084f, final int i11, final int i12) {
        int i13;
        C1086g c1086gP = interfaceC1084f.p(-1949834895);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (c1086gP.h(i10) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i13 |= c1086gP.k(aVar) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && c1086gP.s()) {
            c1086gP.w();
        } else {
            if (i14 != 0) {
                aVar = null;
            }
            androidx.compose.ui.h hVarA = N0.a(androidx.compose.foundation.layout.W.m(androidx.compose.ui.h.a.f13984b, 16), String.valueOf(i10));
            boolean z10 = aVar != null;
            c1086gP.L(-2076063811);
            boolean z11 = (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32;
            Object objF = c1086gP.f();
            if (z11 || objF == InterfaceC1084f.a.f12980a) {
                objF = new O0(1, aVar);
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            IconKt.a(U.c.a(i10, c1086gP, i13 & 14), null, ClickableKt.c(hVarA, z10, null, (Ia.a) objF, 6), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.I
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return GifGridKt.GifGridIcon$lambda$15(i10, aVar, i11, i12, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r GifGridIcon$lambda$14$lambda$13(Ia.a aVar) {
        if (aVar != null) {
            aVar.invoke();
        }
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r GifGridIcon$lambda$15(int i10, Ia.a aVar, int i11, int i12, InterfaceC1084f interfaceC1084f, int i13) {
        GifGridIcon(i10, aVar, interfaceC1084f, L4.b.l(i11 | 1), i12);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void PreviewGifGrid(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1512591839);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$GifGridKt.INSTANCE.m200getLambda3$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.m5.components.L(i10, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r PreviewGifGrid$lambda$16(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        PreviewGifGrid(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
