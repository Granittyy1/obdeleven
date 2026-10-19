package io.intercom.android.sdk.tickets;

import androidx.compose.animation.F;
import androidx.compose.animation.core.C0907g;
import androidx.compose.animation.core.C0922w;
import androidx.compose.animation.core.G;
import androidx.compose.animation.core.I;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.m5.components.C2280g;
import io.intercom.android.sdk.m5.conversation.ui.C2326c;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: TicketProgressIndicator.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketProgressIndicatorKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.runtime.f, androidx.compose.runtime.g] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [io.intercom.android.sdk.ui.theme.IntercomTheme] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v7 */
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
    /* JADX INFO: renamed from: TicketProgressIndicator-3IgeMak, reason: not valid java name */
    public static final void m476TicketProgressIndicator3IgeMak(final List<TicketTimelineCardState.ProgressSection> progressSections, final long j, androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        float fFloatValue;
        int i12;
        long j10;
        kotlin.jvm.internal.i.e(progressSections, "progressSections");
        ?? P10 = interfaceC1084f.p(484493125);
        androidx.compose.ui.h hVar2 = (i11 & 4) != 0 ? androidx.compose.ui.h.a.f13984b : hVar;
        ?? r15 = 0;
        InfiniteTransition infiniteTransitionC = G.c("Infinite progress animation", P10, 0);
        final long jM631getDisabled0d7_KjU = IntercomTheme.INSTANCE.getColors(P10, IntercomTheme.$stable).m631getDisabled0d7_KjU();
        C0945e.i iVarG = C0945e.g(4);
        androidx.compose.ui.h hVarR = A8.p.r(W.d(hVar2, 1.0f), p270w.g.a(50));
        int i13 = 6;
        T tA = S.a(iVarG, androidx.compose.ui.d.a.j, P10, 6);
        int i14 = P10.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = P10.P();
        androidx.compose.ui.h hVarC = ComposedModifierKt.c(P10, hVarR);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
        P10.r();
        if (P10.f12995O) {
            P10.v(aVar);
        } else {
            P10.A();
        }
        R0.a(ComposeUiNode.Companion.f14337f, P10, tA);
        R0.a(ComposeUiNode.Companion.f14336e, P10, interfaceC1089h0P);
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
        if (P10.f12995O || !kotlin.jvm.internal.i.a(P10.f(), Integer.valueOf(i14))) {
            J4.i.d(i14, P10, i14, pVar);
        }
        R0.a(ComposeUiNode.Companion.f14335d, P10, hVarC);
        P10.L(1767069389);
        for (TicketTimelineCardState.ProgressSection progressSection : progressSections) {
            P10.L(1767070266);
            if (progressSection.isLoading()) {
                I.b bVar = new I.b();
                TicketProgressIndicator_3IgeMak$lambda$7$lambda$6$lambda$0(bVar);
                fFloatValue = ((Number) G.a(infiniteTransitionC, 0.0f, 1.0f, C0907g.a(new I(bVar), null, i13), "Progress value animation", P10, 29112, 0).f9373e.getValue()).floatValue();
            } else {
                fFloatValue = progressSection.isDone() ? 1.0f : 0.0f;
            }
            P10.T(r15);
            P10.L(1767091849);
            boolean zIsLoading = progressSection.isLoading();
            Object obj = InterfaceC1084f.a.f12980a;
            if (zIsLoading) {
                P10.L(1463860081);
                int i15 = (P10.i(jM631getDisabled0d7_KjU) ? 1 : 0) | (((((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 || !P10.i(j)) && (i10 & 48) != 32) ? r15 : 1);
                Object objF = P10.f();
                Object obj2 = objF;
                if (i15 != 0 || objF == obj) {
                    Ia.l lVar = new Ia.l() { // from class: io.intercom.android.sdk.tickets.q
                        @Override // Ia.l
                        public final Object invoke(Object obj3) {
                            return TicketProgressIndicatorKt.TicketProgressIndicator_3IgeMak$lambda$7$lambda$6$lambda$2$lambda$1(j, jM631getDisabled0d7_KjU, (I.b) obj3);
                        }
                    };
                    P10.E(lVar);
                    obj2 = lVar;
                }
                P10.T(r15);
                i12 = 6;
                j10 = ((H) F.a(infiniteTransitionC, jM631getDisabled0d7_KjU, j, C0907g.a(C0907g.b((Ia.l) obj2), null, 6), P10, ((i10 << 3) & 896) | 28680).f9373e.getValue()).f13506a;
            } else {
                i12 = 6;
                j10 = j;
            }
            P10.T(r15);
            if (1.0f <= 0.0d) {
                p258v.a.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(true, Na.l.z(1.0f, Float.MAX_VALUE));
            float f10 = (float) r15;
            P10.L(1463876813);
            final float f11 = fFloatValue;
            boolean zG = P10.g(f11);
            Object objF2 = P10.f();
            if (zG || objF2 == obj) {
                objF2 = new Ia.a() { // from class: io.intercom.android.sdk.tickets.r
                    @Override // Ia.a
                    public final Object invoke() {
                        return Float.valueOf(TicketProgressIndicatorKt.TicketProgressIndicator_3IgeMak$lambda$7$lambda$6$lambda$4$lambda$3(f11));
                    }
                };
                P10.E(objF2);
            }
            P10.T(r15);
            long j11 = jM631getDisabled0d7_KjU;
            ProgressIndicatorKt.b((Ia.a) objF2, layoutWeightElement, j10, j11, 2, f10, new C2326c(4), P10, 1769472, 0);
            hVar2 = hVar2;
            r15 = r15 == true ? 1 : 0;
            i13 = i12;
            jM631getDisabled0d7_KjU = j11;
        }
        final androidx.compose.ui.h hVar3 = hVar2;
        C1105p0 c1105p0A = C4.a.a(P10, r15, true);
        if (c1105p0A != null) {
            c1105p0A.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.tickets.s
                @Override // Ia.p
                public final Object invoke(Object obj3, Object obj4) {
                    int iIntValue = ((Integer) obj4).intValue();
                    return TicketProgressIndicatorKt.TicketProgressIndicator_3IgeMak$lambda$8(progressSections, j, hVar3, i10, i11, (InterfaceC1084f) obj3, iIntValue);
                }
            };
        }
    }

    @IntercomPreviews
    public static final void TicketProgressIndicatorPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1245553611);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketProgressIndicatorKt.INSTANCE.m470getLambda1$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2280g(i10, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TicketProgressIndicatorPreview$lambda$9(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        TicketProgressIndicatorPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    private static final p293xa.r TicketProgressIndicator_3IgeMak$lambda$7$lambda$6$lambda$0(I.b keyframes) {
        kotlin.jvm.internal.i.e(keyframes, "$this$keyframes");
        keyframes.f9379a = 3200;
        keyframes.a(850, Float.valueOf(1.0f)).f9363c = C0922w.f9638d;
        keyframes.a(3200, Float.valueOf(1.0f));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TicketProgressIndicator_3IgeMak$lambda$7$lambda$6$lambda$2$lambda$1(long j, long j10, I.b keyframes) {
        kotlin.jvm.internal.i.e(keyframes, "$this$keyframes");
        keyframes.f9379a = 3200;
        I.a aVarA = keyframes.a(850, new H(j));
        p005a4.p pVar = C0922w.f9638d;
        aVarA.f9363c = pVar;
        keyframes.a(1850, new H(j));
        keyframes.a(2200, new H(j10)).f9363c = pVar;
        keyframes.a(3200, new H(j10));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TicketProgressIndicator_3IgeMak$lambda$7$lambda$6$lambda$5(J.e LinearProgressIndicator) {
        kotlin.jvm.internal.i.e(LinearProgressIndicator, "$this$LinearProgressIndicator");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TicketProgressIndicator_3IgeMak$lambda$8(List progressSections, long j, androidx.compose.ui.h hVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(progressSections, "$progressSections");
        m476TicketProgressIndicator3IgeMak(progressSections, j, hVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float TicketProgressIndicator_3IgeMak$lambda$7$lambda$6$lambda$4$lambda$3(float f10) {
        return f10;
    }
}
