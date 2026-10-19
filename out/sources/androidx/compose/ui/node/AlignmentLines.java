package androidx.compose.ui.node;

import androidx.compose.ui.layout.AbstractC1155a;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.C1165k;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: LayoutNodeAlignmentLines.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class AlignmentLines {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.compose.ui.layout.Y f14305a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f14311g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC1180a f14312h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14306b = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f14313i = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public AlignmentLines(InterfaceC1180a interfaceC1180a) {
        this.f14305a = (androidx.compose.ui.layout.Y) interfaceC1180a;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [Ia.p, kotlin.jvm.internal.FunctionReferenceImpl] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.layout.Y, androidx.compose.ui.node.a] */
    public static final void a(AlignmentLines alignmentLines, AbstractC1155a abstractC1155a, int i10, NodeCoordinator nodeCoordinator) {
        long jB;
        alignmentLines.getClass();
        float f10 = i10;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f10)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f10)) & 4294967295L;
        loop0: while (true) {
            jB = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                jB = alignmentLines.b(nodeCoordinator, jB);
                nodeCoordinator = nodeCoordinator.f14529r;
                kotlin.jvm.internal.i.b(nodeCoordinator);
                if (nodeCoordinator.equals(alignmentLines.f14305a.x())) {
                    break loop0;
                }
            } while (!alignmentLines.c(nodeCoordinator).containsKey(abstractC1155a));
            float fD = alignmentLines.d(nodeCoordinator, abstractC1155a);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fD);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fD);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
        int iRound = Math.round(abstractC1155a instanceof C1165k ? Float.intBitsToFloat((int) (jB & 4294967295L)) : Float.intBitsToFloat((int) (jB >> 32)));
        HashMap map = alignmentLines.f14313i;
        if (map.containsKey(abstractC1155a)) {
            int iIntValue = ((Number) kotlin.collections.y.q(abstractC1155a, map)).intValue();
            C1165k c1165k = AlignmentLineKt.f14165a;
            iRound = ((Number) abstractC1155a.f14226a.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
        }
        map.put(abstractC1155a, Integer.valueOf(iRound));
    }

    public abstract long b(NodeCoordinator nodeCoordinator, long j);

    public abstract Map<AbstractC1155a, Integer> c(NodeCoordinator nodeCoordinator);

    public abstract int d(NodeCoordinator nodeCoordinator, AbstractC1155a abstractC1155a);

    public final boolean e() {
        return this.f14307c || this.f14309e || this.f14310f || this.f14311g;
    }

    public final boolean f() {
        i();
        return this.f14312h != null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.layout.Y, androidx.compose.ui.node.a] */
    public final void g() {
        this.f14306b = true;
        ?? r10 = this.f14305a;
        InterfaceC1180a interfaceC1180aE = r10.E();
        if (interfaceC1180aE == null) {
            return;
        }
        if (this.f14307c) {
            interfaceC1180aE.j0();
        } else if (this.f14309e || this.f14308d) {
            interfaceC1180aE.requestLayout();
        }
        if (this.f14310f) {
            r10.j0();
        }
        if (this.f14311g) {
            r10.requestLayout();
        }
        interfaceC1180aE.o().g();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.layout.Y, androidx.compose.ui.node.a] */
    public final void h() {
        HashMap map = this.f14313i;
        map.clear();
        Ia.l<InterfaceC1180a, p293xa.r> lVar = new Ia.l<InterfaceC1180a, p293xa.r>() { // from class: androidx.compose.ui.node.AlignmentLines$recalculate$1
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.compose.ui.layout.Y, androidx.compose.ui.node.a] */
            @Override // Ia.l
            public final p293xa.r invoke(InterfaceC1180a interfaceC1180a) {
                InterfaceC1180a interfaceC1180a2 = interfaceC1180a;
                if (interfaceC1180a2.r()) {
                    if (interfaceC1180a2.o().f14306b) {
                        interfaceC1180a2.Z();
                    }
                    HashMap map2 = interfaceC1180a2.o().f14313i;
                    AlignmentLines alignmentLines = this.this$0;
                    for (Map.Entry entry : map2.entrySet()) {
                        AlignmentLines.a(alignmentLines, (AbstractC1155a) entry.getKey(), ((Number) entry.getValue()).intValue(), interfaceC1180a2.x());
                    }
                    NodeCoordinator nodeCoordinator = interfaceC1180a2.x().f14529r;
                    kotlin.jvm.internal.i.b(nodeCoordinator);
                    while (!nodeCoordinator.equals(this.this$0.f14305a.x())) {
                        Set<AbstractC1155a> setKeySet = this.this$0.c(nodeCoordinator).keySet();
                        AlignmentLines alignmentLines2 = this.this$0;
                        for (AbstractC1155a abstractC1155a : setKeySet) {
                            AlignmentLines.a(alignmentLines2, abstractC1155a, alignmentLines2.d(nodeCoordinator, abstractC1155a), nodeCoordinator);
                        }
                        nodeCoordinator = nodeCoordinator.f14529r;
                        kotlin.jvm.internal.i.b(nodeCoordinator);
                    }
                }
                return p293xa.r.f47939a;
            }
        };
        ?? r10 = this.f14305a;
        r10.h0(lVar);
        map.putAll(c(r10.x()));
        this.f14306b = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.compose.ui.layout.Y, androidx.compose.ui.node.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.node.a] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final void i() {
        InterfaceC1180a interfaceC1180a;
        AlignmentLines alignmentLinesO;
        AlignmentLines alignmentLinesO2;
        boolean zE = e();
        ?? r10 = this.f14305a;
        ?? r11 = r10;
        if (!zE) {
            InterfaceC1180a interfaceC1180aE = r10.E();
            if (interfaceC1180aE == null) {
                return;
            }
            interfaceC1180a = interfaceC1180aE.o().f14312h;
            if (interfaceC1180a == null || !interfaceC1180a.o().e()) {
                r11 = interfaceC1180a;
                InterfaceC1180a interfaceC1180a2 = this.f14312h;
                if (interfaceC1180a2 == null || interfaceC1180a2.o().e()) {
                    return;
                }
                InterfaceC1180a interfaceC1180aE2 = interfaceC1180a2.E();
                if (interfaceC1180aE2 != null && (alignmentLinesO2 = interfaceC1180aE2.o()) != null) {
                    alignmentLinesO2.i();
                }
                InterfaceC1180a interfaceC1180aE3 = interfaceC1180a2.E();
                r11 = (interfaceC1180aE3 == null || (alignmentLinesO = interfaceC1180aE3.o()) == null) ? 0 : alignmentLinesO.f14312h;
            }
        }
        r11 = interfaceC1180a;
        this.f14312h = r11;
    }
}
