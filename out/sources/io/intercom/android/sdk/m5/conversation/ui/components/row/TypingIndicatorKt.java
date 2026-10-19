package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.animation.core.C0907g;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.C0935g;
import androidx.compose.foundation.C0937i;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.W;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.N0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import com.google.android.gms.internal.measurement.C1787c0;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.z0;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.extension.ModifierExtensionsKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.Iterator;
import java.util.List;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: TypingIndicator.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TypingIndicatorKt {
    private static final int AnimateDuration = 600;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private static final void TeammateTypingIndicator(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(349650241);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            p270w.f fVarB = p270w.g.b(20);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i11 = IntercomTheme.$stable;
            TypingIndicatorStyle typingIndicatorStyle = new TypingIndicatorStyle(fVarB, C1787c0.a(1, intercomTheme.getColors(c1086gP, i11).m619getAdminBorder0d7_KjU()), intercomTheme.getColors(c1086gP, i11).m618getAdminBackground0d7_KjU(), null);
            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
            androidx.compose.ui.h hVarB = C0932d.b(aVar, typingIndicatorStyle.m261getColor0d7_KjU(), typingIndicatorStyle.getShape());
            boolean z10 = typingIndicatorStyle.getBorderStroke() != null;
            c1086gP.L(-676457367);
            boolean zK = c1086gP.K(typingIndicatorStyle);
            Object objF = c1086gP.f();
            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
            if (zK || objF == c0153a) {
                objF = new K(0, typingIndicatorStyle);
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            androidx.compose.ui.h hVarG = PaddingKt.g(16, 18, ModifierExtensionsKt.ifTrue(hVarB, z10, (Ia.l) objF));
            T tA = S.a(C0945e.g(4), androidx.compose.ui.d.a.f13344k, c1086gP, 54);
            int i12 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarG);
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
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i12))) {
                J4.i.d(i12, c1086gP, i12, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
            List listS = kotlin.collections.l.s(0, Integer.valueOf(androidx.recyclerview.widget.t.d.DEFAULT_DRAG_ANIMATION_DURATION), Integer.valueOf(CarouselScreenFragment.CAROUSEL_ANIMATION_MS));
            c1086gP.L(-2125336505);
            Iterator it = listS.iterator();
            while (it.hasNext()) {
                final N0<Float> n0AnimateDotAlpha = animateDotAlpha(((Number) it.next()).intValue(), c1086gP, 0);
                final long jM654isTyping0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m654isTyping0d7_KjU();
                androidx.compose.ui.h hVarM = W.m(aVar, 8);
                c1086gP.L(-1598002378);
                boolean zI = c1086gP.i(jM654isTyping0d7_KjU) | c1086gP.K(n0AnimateDotAlpha);
                Object objF2 = c1086gP.f();
                if (zI || objF2 == c0153a) {
                    objF2 = new Ia.l() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.L
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            return TypingIndicatorKt.TeammateTypingIndicator$lambda$9$lambda$8$lambda$7$lambda$6(jM654isTyping0d7_KjU, n0AnimateDotAlpha, (J.e) obj);
                        }
                    };
                    c1086gP.E(objF2);
                }
                c1086gP.T(false);
                CanvasKt.a(hVarM, (Ia.l) objF2, c1086gP, 6);
            }
            c1086gP.T(false);
            c1086gP.T(true);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.m5.components.avatar.a(i10, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TeammateTypingIndicator$lambda$10(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        TeammateTypingIndicator(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.h TeammateTypingIndicator$lambda$4$lambda$3(TypingIndicatorStyle style, androidx.compose.ui.h ifTrue) {
        kotlin.jvm.internal.i.e(style, "$style");
        kotlin.jvm.internal.i.e(ifTrue, "$this$ifTrue");
        C0937i borderStroke = style.getBorderStroke();
        if (borderStroke == null) {
            return ifTrue;
        }
        androidx.compose.ui.h hVarB = C0935g.b(ifTrue, borderStroke.f10065a, borderStroke.f10066b, style.getShape());
        return hVarB == null ? ifTrue : hVarB;
    }

    private static final float TeammateTypingIndicator$lambda$9$lambda$8$lambda$5(N0<Float> n10) {
        return n10.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TeammateTypingIndicator$lambda$9$lambda$8$lambda$7$lambda$6(long j, N0 alpha$delegate, J.e Canvas) {
        kotlin.jvm.internal.i.e(alpha$delegate, "$alpha$delegate");
        kotlin.jvm.internal.i.e(Canvas, "$this$Canvas");
        Canvas.S(androidx.compose.ui.graphics.H.b(TeammateTypingIndicator$lambda$9$lambda$8$lambda$5(alpha$delegate), j), (R.styleable.AppCompatTheme_windowFixedWidthMajor & 2) != 0 ? I.h.c(Canvas.j()) / 2.0f : 0.0f, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 4) != 0 ? Canvas.j1() : 0L, 1.0f, J.h.f3954a, null, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 64) != 0 ? 3 : 0);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: renamed from: TypingIndicator-6a0pyJM, reason: not valid java name */
    public static final void m257TypingIndicator6a0pyJM(androidx.compose.ui.h hVar, final CurrentlyTypingState typingIndicatorData, float f10, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        kotlin.jvm.internal.i.e(typingIndicatorData, "typingIndicatorData");
        C1086g c1086gP = interfaceC1084f.p(1574154580);
        int i12 = i11 & 1;
        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
        final androidx.compose.ui.h hVar2 = i12 != 0 ? aVar : hVar;
        float f11 = (i11 & 4) != 0 ? 36 : f10;
        T tA = S.a(C0945e.g(8), androidx.compose.ui.d.a.f13344k, c1086gP, 54);
        int i13 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVar2);
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
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i13))) {
            J4.i.d(i13, c1086gP, i13, pVar);
        }
        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
        c1086gP.L(-1949038310);
        if (typingIndicatorData.getShowAvatar()) {
            AvatarIconKt.m131AvatarIconRd90Nhg(W.m(aVar, f11), typingIndicatorData.getAvatarWrapper(), null, false, 0L, null, c1086gP, 64, 60);
        }
        c1086gP.T(false);
        TeammateTypingIndicator(c1086gP, 0);
        c1086gP.T(true);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final float f12 = f11;
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.J
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    androidx.compose.ui.h hVar3 = hVar2;
                    int i14 = i10;
                    int i15 = i11;
                    return TypingIndicatorKt.TypingIndicator_6a0pyJM$lambda$1(hVar3, typingIndicatorData, f12, i14, i15, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    @IntercomPreviews
    public static final void TypingIndicatorPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-955207145);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TypingIndicatorKt.INSTANCE.m245getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.m5.components.T(i10, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TypingIndicatorPreview$lambda$11(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        TypingIndicatorPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void TypingIndicatorWithoutAvatarPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-544244118);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TypingIndicatorKt.INSTANCE.m247getLambda4$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new z0(i10, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TypingIndicatorWithoutAvatarPreview$lambda$12(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        TypingIndicatorWithoutAvatarPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TypingIndicator_6a0pyJM$lambda$1(androidx.compose.ui.h hVar, CurrentlyTypingState typingIndicatorData, float f10, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(typingIndicatorData, "$typingIndicatorData");
        m257TypingIndicator6a0pyJM(hVar, typingIndicatorData, f10, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    private static final N0<Float> animateDotAlpha(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        interfaceC1084f.L(-1913274997);
        InfiniteTransition.a aVarA = androidx.compose.animation.core.G.a(androidx.compose.animation.core.G.c("IsTypingInfiniteTransition", interfaceC1084f, 0), 1.0f, 0.1f, new androidx.compose.animation.core.E(C0907g.d(AnimateDuration, 0, null, 6), RepeatMode.f9399c, i10 * (-1)), "IsTypingAnimation", interfaceC1084f, 29112, 0);
        interfaceC1084f.D();
        return aVarA;
    }
}
