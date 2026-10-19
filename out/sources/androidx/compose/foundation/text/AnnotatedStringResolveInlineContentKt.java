package androidx.compose.foundation.text;

import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.C1260a;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: AnnotatedStringResolveInlineContent.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AnnotatedStringResolveInlineContentKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pair<List<C1260a.c<androidx.compose.ui.text.p>>, List<C1260a.c<Ia.q<String, InterfaceC1084f, Integer, p293xa.r>>>> f11061a;

    static {
        EmptyList emptyList = EmptyList.f42983b;
        f11061a = new Pair<>(emptyList, emptyList);
    }

    public static final void a(final C1260a c1260a, final List<C1260a.c<Ia.q<String, InterfaceC1084f, Integer, p293xa.r>>> list, InterfaceC1084f interfaceC1084f, final int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1794596951);
        int i11 = (i10 & 6) == 0 ? (c1086gP.K(c1260a) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.k(list) ? 32 : 16;
        }
        if (c1086gP.C(i11 & 1, (i11 & 19) != 18)) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                C1260a.c<Ia.q<String, InterfaceC1084f, Integer, p293xa.r>> cVar = list.get(i12);
                Ia.q<String, InterfaceC1084f, Integer, p293xa.r> qVar = cVar.f15418a;
                AnnotatedStringResolveInlineContentKt$InlineChildren$1$2 annotatedStringResolveInlineContentKt$InlineChildren$1$2 = AnnotatedStringResolveInlineContentKt$InlineChildren$1$2.f11062a;
                androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
                int i13 = c1086gP.f12996P;
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
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, annotatedStringResolveInlineContentKt$InlineChildren$1$2);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i13))) {
                    J4.i.d(i13, c1086gP, i13, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
                qVar.invoke(c1260a.subSequence(cVar.f15419b, cVar.f15420c).f15408c, c1086gP, 0);
                c1086gP.T(true);
            }
        } else {
            c1086gP.w();
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt$InlineChildren$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    AnnotatedStringResolveInlineContentKt.a(c1260a, list, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
