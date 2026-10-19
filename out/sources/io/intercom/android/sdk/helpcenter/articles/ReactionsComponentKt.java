package io.intercom.android.sdk.helpcenter.articles;

import android.graphics.ColorMatrixColorFilter;
import androidx.compose.animation.core.C0902b;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.N0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.J;
import androidx.compose.ui.graphics.K;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: ReactionsComponent.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ReactionsComponentKt {
    public static final void ReactionComponentNeutralTappedPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(507405585);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ReactionsComponentKt.INSTANCE.m54getLambda6$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new x(i10, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ReactionComponentNeutralTappedPreview$lambda$17(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        ReactionComponentNeutralTappedPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    public static final void ReactionComponentSadTappedPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(2092315616);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ReactionsComponentKt.INSTANCE.m52getLambda4$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new u(i10, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ReactionComponentSadTappedPreview$lambda$16(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        ReactionComponentSadTappedPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0221  */
    /* JADX WARN: Code duplicated, block: B:110:0x023d  */
    /* JADX WARN: Code duplicated, block: B:111:0x023f  */
    /* JADX WARN: Code duplicated, block: B:115:0x024c  */
    /* JADX WARN: Code duplicated, block: B:120:0x0285  */
    /* JADX WARN: Code duplicated, block: B:125:0x02df  */
    /* JADX WARN: Code duplicated, block: B:126:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:130:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:141:0x0382  */
    /* JADX WARN: Code duplicated, block: B:142:0x0384  */
    /* JADX WARN: Code duplicated, block: B:147:0x038f  */
    /* JADX WARN: Code duplicated, block: B:152:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:79:0x01af  */
    /* JADX WARN: Code duplicated, block: B:84:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:99:0x020b  */
    public static final void ReactionsComponent(androidx.compose.ui.h hVar, ArticleViewState.ReactionState currentReactionState, Ia.a<p293xa.r> sadReactionTapped, Ia.a<p293xa.r> neutralReactionTapped, Ia.a<p293xa.r> happyReactionTapped, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        androidx.compose.ui.h hVar2;
        int i12;
        androidx.compose.ui.h hVar3;
        int i13;
        ArticleViewState.Reaction selectedReaction;
        ArticleViewState.Reaction reaction;
        float f10;
        ArticleViewState.Reaction selectedReaction2;
        ArticleViewState.Reaction reaction2;
        float f11;
        boolean z10;
        Object objF;
        float[] fArrA;
        boolean z11;
        Object objF2;
        float[] fArrA2;
        boolean z12;
        Object objF3;
        float[] fArrA3;
        androidx.compose.ui.h hVar4;
        kotlin.jvm.internal.i.e(currentReactionState, "currentReactionState");
        kotlin.jvm.internal.i.e(sadReactionTapped, "sadReactionTapped");
        kotlin.jvm.internal.i.e(neutralReactionTapped, "neutralReactionTapped");
        kotlin.jvm.internal.i.e(happyReactionTapped, "happyReactionTapped");
        C1086g c1086gP = interfaceC1084f.p(-1539407934);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
            hVar2 = hVar;
        } else if ((i10 & 14) == 0) {
            hVar2 = hVar;
            i12 = (c1086gP.K(hVar2) ? 4 : 2) | i10;
        } else {
            hVar2 = hVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= c1086gP.K(currentReactionState) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= c1086gP.k(sadReactionTapped) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i12 |= c1086gP.k(neutralReactionTapped) ? 2048 : 1024;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((i10 & 57344) == 0) {
            i12 |= c1086gP.k(happyReactionTapped) ? 16384 : 8192;
        }
        int i15 = i12;
        if ((46811 & i15) == 9362 && c1086gP.s()) {
            c1086gP.w();
            hVar4 = hVar2;
        } else {
            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
            androidx.compose.ui.h hVar5 = i14 != 0 ? aVar : hVar2;
            androidx.compose.ui.h hVarB = C0932d.b(hVar5, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m621getBackground0d7_KjU(), h0.f13629a);
            C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13347n, c1086gP, 48);
            int i16 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarB);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            Ia.p<ComposeUiNode, E, p293xa.r> pVar = ComposeUiNode.Companion.f14337f;
            R0.a(pVar, c1086gP, c0953mA);
            Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar2 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar2, c1086gP, interfaceC1089h0P);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                hVar3 = hVar5;
            } else {
                hVar3 = hVar5;
                if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i16))) {
                }
                Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar4 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar4, c1086gP, hVarC);
                IntercomDividerKt.IntercomDivider(null, c1086gP, 0, 1);
                float f12 = 16;
                Lb.a.a(c1086gP, W.e(aVar, f12));
                TextKt.b(S4.o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_article_question), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 0, 0, 131070);
                androidx.compose.ui.h hVarD = W.d(PaddingKt.f(aVar, f12), 1.0f);
                T tA = S.a(C0945e.f10288e, androidx.compose.ui.d.a.j, c1086gP, 6);
                i13 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
                androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarD);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar, c1086gP, tA);
                R0.a(pVar2, c1086gP, interfaceC1089h0P2);
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i13))) {
                    J4.i.d(i13, c1086gP, i13, pVar3);
                }
                R0.a(pVar4, c1086gP, hVarC2);
                selectedReaction = currentReactionState.getSelectedReaction();
                reaction = ArticleViewState.Reaction.Sad;
                if (selectedReaction != reaction || currentReactionState.getSelectedReaction() == ArticleViewState.Reaction.None) {
                    f10 = 38;
                } else {
                    f10 = 24;
                }
                N0 n0A = C0902b.a(f10, null, c1086gP, 0, 14);
                selectedReaction2 = currentReactionState.getSelectedReaction();
                reaction2 = ArticleViewState.Reaction.Happy;
                if (selectedReaction2 != reaction2 || currentReactionState.getSelectedReaction() == ArticleViewState.Reaction.None) {
                    f11 = 38;
                } else {
                    f11 = 24;
                }
                N0 n0A2 = C0902b.a(f11, null, c1086gP, 0, 14);
                ArticleViewState.Reaction selectedReaction3 = currentReactionState.getSelectedReaction();
                ArticleViewState.Reaction reaction3 = ArticleViewState.Reaction.Neutral;
                N0 n0A3 = C0902b.a((selectedReaction3 != reaction3 || currentReactionState.getSelectedReaction() == ArticleViewState.Reaction.None) ? 38 : 24, null, c1086gP, 0, 14);
                c1086gP.L(-1674629439);
                if ((i15 & 896) == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objF = c1086gP.f();
                InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
                if (z10 || objF == c0153a) {
                    objF = new P9.b(2, sadReactionTapped);
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                androidx.compose.ui.h hVarM = W.m(ClickableKt.c(aVar, false, null, (Ia.a) objF, 7), ReactionsComponent$lambda$13$lambda$12$lambda$0(n0A));
                Painter painterA = U.c.a(io.intercom.android.sdk.R.drawable.intercom_reaction_sad, c1086gP, 0);
                fArrA = J.a();
                if (currentReactionState.getSelectedReaction() != reaction || currentReactionState.getSelectedReaction() == ArticleViewState.Reaction.None) {
                    J.b(1.0f, fArrA);
                } else {
                    J.b(0.0f, fArrA);
                }
                K k10 = new K(new ColorMatrixColorFilter(fArrA));
                k10.f13508b = fArrA;
                ImageKt.a(painterA, null, hVarM, null, null, 0.0f, k10, c1086gP, 56, 56);
                Lb.a.a(c1086gP, W.q(aVar, f12));
                c1086gP.L(-1674600123);
                if ((i15 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objF2 = c1086gP.f();
                if (z11 || objF2 == c0153a) {
                    objF2 = new p011ab.f(1, neutralReactionTapped);
                    c1086gP.E(objF2);
                }
                c1086gP.T(false);
                androidx.compose.ui.h hVarM2 = W.m(ClickableKt.c(aVar, false, null, (Ia.a) objF2, 7), ReactionsComponent$lambda$13$lambda$12$lambda$2(n0A3));
                Painter painterA2 = U.c.a(io.intercom.android.sdk.R.drawable.intercom_reaction_neutral, c1086gP, 0);
                fArrA2 = J.a();
                if (currentReactionState.getSelectedReaction() != reaction3 || currentReactionState.getSelectedReaction() == ArticleViewState.Reaction.None) {
                    J.b(f, fArrA2);
                } else {
                    J.b(0.0f, fArrA2);
                }
                K k11 = new K(new ColorMatrixColorFilter(fArrA2));
                k11.f13508b = fArrA2;
                ImageKt.a(painterA2, null, hVarM2, null, null, 0.0f, k11, c1086gP, 56, 56);
                Lb.a.a(c1086gP, W.q(aVar, f12));
                c1086gP.L(-1674570301);
                if ((i15 & 57344) == 16384) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objF3 = c1086gP.f();
                if (z12 || objF3 == c0153a) {
                    objF3 = new v(0, happyReactionTapped);
                    c1086gP.E(objF3);
                }
                c1086gP.T(false);
                androidx.compose.ui.h hVarM3 = W.m(ClickableKt.c(aVar, false, null, (Ia.a) objF3, 7), ReactionsComponent$lambda$13$lambda$12$lambda$1(n0A2));
                Painter painterA3 = U.c.a(io.intercom.android.sdk.R.drawable.intercom_reaction_happy, c1086gP, 0);
                fArrA3 = J.a();
                if (currentReactionState.getSelectedReaction() != reaction2 || currentReactionState.getSelectedReaction() == ArticleViewState.Reaction.None) {
                    J.b(1.0f, fArrA3);
                } else {
                    J.b(0.0f, fArrA3);
                }
                K k12 = new K(new ColorMatrixColorFilter(fArrA3));
                k12.f13508b = fArrA3;
                ImageKt.a(painterA3, null, hVarM3, null, null, 0.0f, k12, c1086gP, 56, 56);
                c1086gP.T(true);
                c1086gP.T(true);
                hVar4 = hVar3;
            }
            J4.i.d(i16, c1086gP, i16, pVar3);
            Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar5 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar5, c1086gP, hVarC);
            IntercomDividerKt.IntercomDivider(null, c1086gP, 0, 1);
            float f13 = 16;
            Lb.a.a(c1086gP, W.e(aVar, f13));
            TextKt.b(S4.o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_article_question), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 0, 0, 131070);
            androidx.compose.ui.h hVarD2 = W.d(PaddingKt.f(aVar, f13), 1.0f);
            T tA2 = S.a(C0945e.f10288e, androidx.compose.ui.d.a.j, c1086gP, 6);
            i13 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVarD2);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(pVar, c1086gP, tA2);
            R0.a(pVar2, c1086gP, interfaceC1089h0P3);
            if (c1086gP.f12995O) {
                J4.i.d(i13, c1086gP, i13, pVar3);
            } else {
                J4.i.d(i13, c1086gP, i13, pVar3);
            }
            R0.a(pVar5, c1086gP, hVarC3);
            selectedReaction = currentReactionState.getSelectedReaction();
            reaction = ArticleViewState.Reaction.Sad;
            if (selectedReaction != reaction) {
                f10 = 38;
            } else {
                f10 = 38;
            }
            N0 n0A4 = C0902b.a(f10, null, c1086gP, 0, 14);
            selectedReaction2 = currentReactionState.getSelectedReaction();
            reaction2 = ArticleViewState.Reaction.Happy;
            if (selectedReaction2 != reaction2) {
                f11 = 38;
            } else {
                f11 = 38;
            }
            N0 n0A5 = C0902b.a(f11, null, c1086gP, 0, 14);
            ArticleViewState.Reaction selectedReaction4 = currentReactionState.getSelectedReaction();
            ArticleViewState.Reaction reaction4 = ArticleViewState.Reaction.Neutral;
            N0 n0A6 = C0902b.a((selectedReaction4 != reaction4 || currentReactionState.getSelectedReaction() == ArticleViewState.Reaction.None) ? 38 : 24, null, c1086gP, 0, 14);
            c1086gP.L(-1674629439);
            if ((i15 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            objF = c1086gP.f();
            InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
            if (z10) {
                objF = new P9.b(2, sadReactionTapped);
                c1086gP.E(objF);
            } else {
                objF = new P9.b(2, sadReactionTapped);
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            androidx.compose.ui.h hVarM4 = W.m(ClickableKt.c(aVar, false, null, (Ia.a) objF, 7), ReactionsComponent$lambda$13$lambda$12$lambda$0(n0A4));
            Painter painterA4 = U.c.a(io.intercom.android.sdk.R.drawable.intercom_reaction_sad, c1086gP, 0);
            fArrA = J.a();
            if (currentReactionState.getSelectedReaction() != reaction) {
                J.b(1.0f, fArrA);
            } else {
                J.b(1.0f, fArrA);
            }
            K k13 = new K(new ColorMatrixColorFilter(fArrA));
            k13.f13508b = fArrA;
            ImageKt.a(painterA4, null, hVarM4, null, null, 0.0f, k13, c1086gP, 56, 56);
            Lb.a.a(c1086gP, W.q(aVar, f13));
            c1086gP.L(-1674600123);
            if ((i15 & 7168) == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            objF2 = c1086gP.f();
            if (z11) {
                objF2 = new p011ab.f(1, neutralReactionTapped);
                c1086gP.E(objF2);
            } else {
                objF2 = new p011ab.f(1, neutralReactionTapped);
                c1086gP.E(objF2);
            }
            c1086gP.T(false);
            androidx.compose.ui.h hVarM5 = W.m(ClickableKt.c(aVar, false, null, (Ia.a) objF2, 7), ReactionsComponent$lambda$13$lambda$12$lambda$2(n0A6));
            Painter painterA5 = U.c.a(io.intercom.android.sdk.R.drawable.intercom_reaction_neutral, c1086gP, 0);
            fArrA2 = J.a();
            float f14 = currentReactionState.getSelectedReaction() != reaction4 ? 1.0f : 1.0f;
            J.b(f14, fArrA2);
            K k14 = new K(new ColorMatrixColorFilter(fArrA2));
            k14.f13508b = fArrA2;
            ImageKt.a(painterA5, null, hVarM5, null, null, 0.0f, k14, c1086gP, 56, 56);
            Lb.a.a(c1086gP, W.q(aVar, f13));
            c1086gP.L(-1674570301);
            if ((i15 & 57344) == 16384) {
                z12 = true;
            } else {
                z12 = false;
            }
            objF3 = c1086gP.f();
            if (z12) {
                objF3 = new v(0, happyReactionTapped);
                c1086gP.E(objF3);
            } else {
                objF3 = new v(0, happyReactionTapped);
                c1086gP.E(objF3);
            }
            c1086gP.T(false);
            androidx.compose.ui.h hVarM6 = W.m(ClickableKt.c(aVar, false, null, (Ia.a) objF3, 7), ReactionsComponent$lambda$13$lambda$12$lambda$1(n0A5));
            Painter painterA6 = U.c.a(io.intercom.android.sdk.R.drawable.intercom_reaction_happy, c1086gP, 0);
            fArrA3 = J.a();
            if (currentReactionState.getSelectedReaction() != reaction2) {
                J.b(1.0f, fArrA3);
            } else {
                J.b(1.0f, fArrA3);
            }
            K k15 = new K(new ColorMatrixColorFilter(fArrA3));
            k15.f13508b = fArrA3;
            ImageKt.a(painterA6, null, hVarM6, null, null, 0.0f, k15, c1086gP, 56, 56);
            c1086gP.T(true);
            c1086gP.T(true);
            hVar4 = hVar3;
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new w(hVar4, currentReactionState, sadReactionTapped, neutralReactionTapped, happyReactionTapped, i10, i11, 0);
        }
    }

    private static final float ReactionsComponent$lambda$13$lambda$12$lambda$0(N0<p013b0.f> n10) {
        return n10.getValue().f20481b;
    }

    private static final float ReactionsComponent$lambda$13$lambda$12$lambda$1(N0<p013b0.f> n10) {
        return n10.getValue().f20481b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ReactionsComponent$lambda$13$lambda$12$lambda$10$lambda$9(Ia.a happyReactionTapped) {
        kotlin.jvm.internal.i.e(happyReactionTapped, "$happyReactionTapped");
        happyReactionTapped.invoke();
        return p293xa.r.f47939a;
    }

    private static final float ReactionsComponent$lambda$13$lambda$12$lambda$2(N0<p013b0.f> n10) {
        return n10.getValue().f20481b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ReactionsComponent$lambda$13$lambda$12$lambda$4$lambda$3(Ia.a sadReactionTapped) {
        kotlin.jvm.internal.i.e(sadReactionTapped, "$sadReactionTapped");
        sadReactionTapped.invoke();
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ReactionsComponent$lambda$13$lambda$12$lambda$7$lambda$6(Ia.a neutralReactionTapped) {
        kotlin.jvm.internal.i.e(neutralReactionTapped, "$neutralReactionTapped");
        neutralReactionTapped.invoke();
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ReactionsComponent$lambda$14(androidx.compose.ui.h hVar, ArticleViewState.ReactionState currentReactionState, Ia.a sadReactionTapped, Ia.a neutralReactionTapped, Ia.a happyReactionTapped, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(currentReactionState, "$currentReactionState");
        kotlin.jvm.internal.i.e(sadReactionTapped, "$sadReactionTapped");
        kotlin.jvm.internal.i.e(neutralReactionTapped, "$neutralReactionTapped");
        kotlin.jvm.internal.i.e(happyReactionTapped, "$happyReactionTapped");
        ReactionsComponent(hVar, currentReactionState, sadReactionTapped, neutralReactionTapped, happyReactionTapped, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    public static final void ReactionsComponentPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(913251333);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ReactionsComponentKt.INSTANCE.m50getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new t(i10, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ReactionsComponentPreview$lambda$15(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        ReactionsComponentPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
