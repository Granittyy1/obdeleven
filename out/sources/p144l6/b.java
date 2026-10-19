package p144l6;

import Ia.p;
import J2.j;
import androidx.compose.ui.node.D;
import androidx.compose.ui.node.LayoutNode;
import cc.c;
import io.grpc.internal.InterfaceC2223h0;
import io.grpc.internal.z0;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.AbstractC2672a;
import p293xa.r;

/* JADX INFO: compiled from: DataCollectionDefaultChange.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static final cc.b a(String str) {
        cc.b bVarC = c.c(str);
        i.d(bVarC, "getLogger(name)");
        return bVarC;
    }

    public static InterfaceC2223h0 b() {
        if (z0.f37771e == null) {
            return new z0();
        }
        j jVar = new j();
        jVar.f3967a = new AtomicLong();
        return jVar;
    }

    public static final D c(D d10) {
        LayoutNode layoutNode = d10.f14344n.f14525n;
        while (true) {
            LayoutNode layoutNodeG = layoutNode.G();
            LayoutNode layoutNode2 = null;
            if ((layoutNodeG != null ? layoutNodeG.f14407i : null) == null) {
                D dR1 = layoutNode.f14389G.f14366c.r1();
                i.b(dR1);
                return dR1;
            }
            LayoutNode layoutNodeG2 = layoutNode.G();
            if (layoutNodeG2 != null) {
                layoutNode2 = layoutNodeG2.f14407i;
            }
            i.b(layoutNode2);
            LayoutNode layoutNodeG3 = layoutNode.G();
            i.b(layoutNodeG3);
            layoutNode = layoutNodeG3.f14407i;
            i.b(layoutNode);
        }
    }

    public static void d(p pVar, AbstractC2672a abstractC2672a, AbstractC2672a abstractC2672a2) {
        try {
            kotlinx.coroutines.internal.i.a(A8.p.y(A8.p.u(pVar, abstractC2672a, abstractC2672a2)), r.f47939a, null);
        } catch (Throwable th) {
            abstractC2672a2.resumeWith(kotlin.b.a(th));
            throw th;
        }
    }
}
