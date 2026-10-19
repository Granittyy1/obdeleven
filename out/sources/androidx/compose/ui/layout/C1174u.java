package androidx.compose.ui.layout;

import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.y0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import java.util.List;

/* JADX INFO: renamed from: androidx.compose.ui.layout.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Layout.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1174u {
    public static final ComposableLambdaImpl a(final List list) {
        return new ComposableLambdaImpl(true, -1953651383, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.ui.layout.LayoutKt$combineAsVirtualLayouts$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // Ia.p
            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
                InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
                int iIntValue = num.intValue();
                if (interfaceC1084f2.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                    List<Ia.p<InterfaceC1084f, Integer, p293xa.r>> list2 = list;
                    int size = list2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar = list2.get(i10);
                        int iF = interfaceC1084f2.F();
                        ComposeUiNode.f14331c0.getClass();
                        Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14334c;
                        if (interfaceC1084f2.u() == null) {
                            I.b.k();
                            throw null;
                        }
                        interfaceC1084f2.r();
                        if (interfaceC1084f2.m()) {
                            interfaceC1084f2.v(aVar);
                        } else {
                            interfaceC1084f2.A();
                        }
                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar2 = ComposeUiNode.Companion.f14338g;
                        if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF))) {
                            androidx.compose.animation.k.b(iF, interfaceC1084f2, iF, pVar2);
                        }
                        pVar.invoke(interfaceC1084f2, 0);
                        interfaceC1084f2.J();
                    }
                } else {
                    interfaceC1084f2.w();
                }
                return p293xa.r.f47939a;
            }
        });
    }

    public static final ComposableLambdaImpl b(final androidx.compose.ui.h hVar) {
        return new ComposableLambdaImpl(true, -1586257396, new Ia.q<y0<ComposeUiNode>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.ui.layout.LayoutKt$materializerOf$1
            {
                super(3);
            }

            @Override // Ia.q
            public final p293xa.r invoke(y0<ComposeUiNode> y0Var, InterfaceC1084f interfaceC1084f, Integer num) {
                InterfaceC1084f interfaceC1084f2 = y0Var.f13256a;
                InterfaceC1084f interfaceC1084f3 = interfaceC1084f;
                num.intValue();
                int iF = interfaceC1084f3.F();
                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVar);
                interfaceC1084f2.e(509942095);
                ComposeUiNode.f14331c0.getClass();
                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f2, hVarC);
                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF))) {
                    androidx.compose.animation.k.b(iF, interfaceC1084f2, iF, pVar);
                }
                interfaceC1084f2.I();
                return p293xa.r.f47939a;
            }
        });
    }
}
