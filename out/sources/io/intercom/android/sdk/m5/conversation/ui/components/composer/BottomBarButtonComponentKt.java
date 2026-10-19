package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import androidx.compose.foundation.layout.C0945e;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.C2270b;
import io.intercom.android.sdk.m5.components.C2278f;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: BottomBarButtonComponent.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class BottomBarButtonComponentKt {
    public static final void BottomBarButtonComponent(androidx.compose.ui.h hVar, final List<? extends BottomBarUiState.BottomBarButton> buttons, boolean z10, Ia.a<p293xa.r> aVar, Ia.a<p293xa.r> aVar2, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        kotlin.jvm.internal.i.e(buttons, "buttons");
        C1086g c1086gP = interfaceC1084f.p(-1392249176);
        final androidx.compose.ui.h hVar2 = (i11 & 1) != 0 ? androidx.compose.ui.h.a.f13984b : hVar;
        boolean z11 = (i11 & 4) != 0 ? true : z10;
        Ia.a<p293xa.r> aVar3 = (i11 & 8) != 0 ? new Z0.a(1) : aVar;
        Ia.a<p293xa.r> pVar = (i11 & 16) != 0 ? new X8.p(3) : aVar2;
        androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(C0945e.f10284a, androidx.compose.ui.d.a.j, c1086gP, 0);
        int i12 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVar2);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar4 = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar4);
        } else {
            c1086gP.A();
        }
        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA);
        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar2 = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i12))) {
            J4.i.d(i12, c1086gP, i12, pVar2);
        }
        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
        c1086gP.L(-1981857044);
        for (BottomBarUiState.BottomBarButton bottomBarButton : buttons) {
            if (kotlin.jvm.internal.i.a(bottomBarButton, BottomBarUiState.BottomBarButton.GifInsert.INSTANCE)) {
                c1086gP.L(1310873340);
                BottomBarIcon(R.drawable.intercom_ic_gif_input, z11, aVar3, c1086gP, (i10 >> 3) & 1008, 0);
                c1086gP.T(false);
            } else {
                if (!kotlin.jvm.internal.i.a(bottomBarButton, BottomBarUiState.BottomBarButton.MediaInsert.INSTANCE)) {
                    c1086gP.L(1427757579);
                    c1086gP.T(false);
                    throw new NoWhenBranchMatchedException();
                }
                c1086gP.L(1311174815);
                BottomBarIcon(R.drawable.intercom_ic_plus, z11, pVar, c1086gP, ((i10 >> 3) & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i10 >> 6) & 896), 0);
                c1086gP.T(false);
            }
        }
        C1105p0 c1105p0A = C4.a.a(c1086gP, false, true);
        if (c1105p0A != null) {
            final boolean z12 = z11;
            final Ia.a<p293xa.r> aVar5 = aVar3;
            final Ia.a<p293xa.r> aVar6 = pVar;
            c1105p0A.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.a
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    androidx.compose.ui.h hVar3 = hVar2;
                    int i13 = i10;
                    int i14 = i11;
                    return BottomBarButtonComponentKt.BottomBarButtonComponent$lambda$4(hVar3, buttons, z12, aVar5, aVar6, i13, i14, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r BottomBarButtonComponent$lambda$4(androidx.compose.ui.h hVar, List buttons, boolean z10, Ia.a aVar, Ia.a aVar2, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(buttons, "$buttons");
        BottomBarButtonComponent(hVar, buttons, z10, aVar, aVar2, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    private static final void BottomBarButtonComponentPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-179036889);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BottomBarButtonComponentKt.INSTANCE.m189getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.m5.components.L(i10, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r BottomBarButtonComponentPreview$lambda$7(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        BottomBarButtonComponentPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    private static final void BottomBarButtonComponentPreviewGifOnly(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1619387831);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BottomBarButtonComponentKt.INSTANCE.m191getLambda4$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2278f(i10, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r BottomBarButtonComponentPreviewGifOnly$lambda$8(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        BottomBarButtonComponentPreviewGifOnly(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    private static final void BottomBarButtonComponentPreviewMediaOnly(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1269009367);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BottomBarButtonComponentKt.INSTANCE.m193getLambda6$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2270b(i10, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r BottomBarButtonComponentPreviewMediaOnly$lambda$9(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        BottomBarButtonComponentPreviewMediaOnly(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0042  */
    /* JADX WARN: Code duplicated, block: B:28:0x0047  */
    /* JADX WARN: Code duplicated, block: B:30:0x004b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x0056  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0073  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    private static final void BottomBarIcon(final int i10, boolean z10, Ia.a<p293xa.r> aVar, InterfaceC1084f interfaceC1084f, final int i11, final int i12) {
        int i13;
        boolean z11;
        int i14;
        Ia.a<p293xa.r> aVar2;
        int i15;
        boolean z12;
        Ia.a<p293xa.r> c2331b;
        final boolean z13;
        final Ia.a<p293xa.r> aVar3;
        C1105p0 c1105p0V;
        C1086g c1086gP = interfaceC1084f.p(1211476790);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (c1086gP.h(i10) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i16 = i12 & 2;
        if (i16 == 0) {
            if ((i11 & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                z11 = z10;
                i13 |= c1086gP.c(z11) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i11 & 896) == 0) {
                    aVar2 = aVar;
                    if (c1086gP.k(aVar2)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                if ((i13 & 731) == 146 || !c1086gP.s()) {
                    if (i16 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i14 != 0) {
                        c2331b = new C2331b(0);
                    } else {
                        c2331b = aVar2;
                    }
                    IconButtonKt.b(c2331b, null, z12, null, null, androidx.compose.runtime.internal.a.b(1749933369, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.BottomBarButtonComponentKt.BottomBarIcon.2
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i17) {
                            if ((i17 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                            } else {
                                IconKt.a(U.c.a(i10, interfaceC1084f2, 0), null, androidx.compose.foundation.layout.W.m(androidx.compose.ui.h.a.f13984b, 24), IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), interfaceC1084f2, 440, 0);
                            }
                        }
                    }, c1086gP), c1086gP, ((i13 >> 6) & 14) | 196608 | ((i13 << 3) & 896), 26);
                    z13 = z12;
                    aVar3 = c2331b;
                } else {
                    c1086gP.w();
                    z13 = z11;
                    aVar3 = aVar2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.c
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return BottomBarButtonComponentKt.BottomBarIcon$lambda$6(i10, z13, aVar3, i11, i12, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i13 |= 384;
            aVar2 = aVar;
            if ((i13 & 731) == 146) {
                if (i16 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i14 != 0) {
                    c2331b = new C2331b(0);
                } else {
                    c2331b = aVar2;
                }
                IconButtonKt.b(c2331b, null, z12, null, null, androidx.compose.runtime.internal.a.b(1749933369, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.BottomBarButtonComponentKt.BottomBarIcon.2
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i17) {
                        if ((i17 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                        } else {
                            IconKt.a(U.c.a(i10, interfaceC1084f2, 0), null, androidx.compose.foundation.layout.W.m(androidx.compose.ui.h.a.f13984b, 24), IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), interfaceC1084f2, 440, 0);
                        }
                    }
                }, c1086gP), c1086gP, ((i13 >> 6) & 14) | 196608 | ((i13 << 3) & 896), 26);
                z13 = z12;
                aVar3 = c2331b;
            } else {
                if (i16 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i14 != 0) {
                    c2331b = new C2331b(0);
                } else {
                    c2331b = aVar2;
                }
                IconButtonKt.b(c2331b, null, z12, null, null, androidx.compose.runtime.internal.a.b(1749933369, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.BottomBarButtonComponentKt.BottomBarIcon.2
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i17) {
                        if ((i17 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                        } else {
                            IconKt.a(U.c.a(i10, interfaceC1084f2, 0), null, androidx.compose.foundation.layout.W.m(androidx.compose.ui.h.a.f13984b, 24), IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), interfaceC1084f2, 440, 0);
                        }
                    }
                }, c1086gP), c1086gP, ((i13 >> 6) & 14) | 196608 | ((i13 << 3) & 896), 26);
                z13 = z12;
                aVar3 = c2331b;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.c
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return BottomBarButtonComponentKt.BottomBarIcon$lambda$6(i10, z13, aVar3, i11, i12, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i13 |= 48;
        z11 = z10;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i11 & 896) == 0) {
                aVar2 = aVar;
                if (c1086gP.k(aVar2)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            if ((i13 & 731) == 146) {
                if (i16 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i14 != 0) {
                    c2331b = new C2331b(0);
                } else {
                    c2331b = aVar2;
                }
                IconButtonKt.b(c2331b, null, z12, null, null, androidx.compose.runtime.internal.a.b(1749933369, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.BottomBarButtonComponentKt.BottomBarIcon.2
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i17) {
                        if ((i17 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                        } else {
                            IconKt.a(U.c.a(i10, interfaceC1084f2, 0), null, androidx.compose.foundation.layout.W.m(androidx.compose.ui.h.a.f13984b, 24), IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), interfaceC1084f2, 440, 0);
                        }
                    }
                }, c1086gP), c1086gP, ((i13 >> 6) & 14) | 196608 | ((i13 << 3) & 896), 26);
                z13 = z12;
                aVar3 = c2331b;
            } else {
                if (i16 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i14 != 0) {
                    c2331b = new C2331b(0);
                } else {
                    c2331b = aVar2;
                }
                IconButtonKt.b(c2331b, null, z12, null, null, androidx.compose.runtime.internal.a.b(1749933369, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.BottomBarButtonComponentKt.BottomBarIcon.2
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i17) {
                        if ((i17 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                        } else {
                            IconKt.a(U.c.a(i10, interfaceC1084f2, 0), null, androidx.compose.foundation.layout.W.m(androidx.compose.ui.h.a.f13984b, 24), IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), interfaceC1084f2, 440, 0);
                        }
                    }
                }, c1086gP), c1086gP, ((i13 >> 6) & 14) | 196608 | ((i13 << 3) & 896), 26);
                z13 = z12;
                aVar3 = c2331b;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.c
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return BottomBarButtonComponentKt.BottomBarIcon$lambda$6(i10, z13, aVar3, i11, i12, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i13 |= 384;
        aVar2 = aVar;
        if ((i13 & 731) == 146) {
            if (i16 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            if (i14 != 0) {
                c2331b = new C2331b(0);
            } else {
                c2331b = aVar2;
            }
            IconButtonKt.b(c2331b, null, z12, null, null, androidx.compose.runtime.internal.a.b(1749933369, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.BottomBarButtonComponentKt.BottomBarIcon.2
                @Override // Ia.p
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i17) {
                    if ((i17 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                    } else {
                        IconKt.a(U.c.a(i10, interfaceC1084f2, 0), null, androidx.compose.foundation.layout.W.m(androidx.compose.ui.h.a.f13984b, 24), IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), interfaceC1084f2, 440, 0);
                    }
                }
            }, c1086gP), c1086gP, ((i13 >> 6) & 14) | 196608 | ((i13 << 3) & 896), 26);
            z13 = z12;
            aVar3 = c2331b;
        } else {
            if (i16 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            if (i14 != 0) {
                c2331b = new C2331b(0);
            } else {
                c2331b = aVar2;
            }
            IconButtonKt.b(c2331b, null, z12, null, null, androidx.compose.runtime.internal.a.b(1749933369, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.BottomBarButtonComponentKt.BottomBarIcon.2
                @Override // Ia.p
                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i17) {
                    if ((i17 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                    } else {
                        IconKt.a(U.c.a(i10, interfaceC1084f2, 0), null, androidx.compose.foundation.layout.W.m(androidx.compose.ui.h.a.f13984b, 24), IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), interfaceC1084f2, 440, 0);
                    }
                }
            }, c1086gP), c1086gP, ((i13 >> 6) & 14) | 196608 | ((i13 << 3) & 896), 26);
            z13 = z12;
            aVar3 = c2331b;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.c
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return BottomBarButtonComponentKt.BottomBarIcon$lambda$6(i10, z13, aVar3, i11, i12, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r BottomBarIcon$lambda$6(int i10, boolean z10, Ia.a aVar, int i11, int i12, InterfaceC1084f interfaceC1084f, int i13) {
        BottomBarIcon(i10, z10, aVar, interfaceC1084f, L4.b.l(i11 | 1), i12);
        return p293xa.r.f47939a;
    }
}
