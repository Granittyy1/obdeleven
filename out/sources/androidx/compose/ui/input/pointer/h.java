package androidx.compose.ui.input.pointer;

import androidx.collection.C0891t;
import androidx.collection.I;
import androidx.compose.ui.node.AbstractC1187h;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.C1195p;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.Y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: HitPathTracker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.compose.ui.h.c f14082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final P.b f14083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0891t<q> f14084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public NodeCoordinator f14085f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j f14086g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f14087h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f14088i;
    public boolean j;

    public h(androidx.compose.ui.h.c cVar) {
        this.f14082c = cVar;
        P.b bVar = new P.b();
        bVar.f4882b = new long[2];
        this.f14083d = bVar;
        this.f14084e = new C0891t<>(2);
        this.f14088i = true;
        this.j = true;
    }

    /* JADX WARN: Code duplicated, block: B:132:0x0295  */
    /* JADX WARN: Code duplicated, block: B:134:0x029d  */
    /* JADX WARN: Code duplicated, block: B:139:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:141:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:161:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:63:0x0177  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r5v59, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v61 */
    /* JADX WARN: Type inference failed for: r5v62 */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v65 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    @Override // androidx.compose.ui.input.pointer.i
    public final boolean a(C0891t c0891t, C1195p c1195p, C1154e c1154e, boolean z10) {
        C0891t<q> c0891t2;
        P.b bVar;
        Object obj;
        boolean z11;
        boolean z12;
        boolean z13;
        j jVar;
        int i10;
        int i11;
        boolean zA = super.a(c0891t, c1195p, c1154e, z10);
        ?? B10 = this.f14082c;
        if (!B10.f13997o) {
            return true;
        }
        ?? cVar = 0;
        while (B10 != 0) {
            if (B10 instanceof Y) {
                this.f14085f = C1185f.d((Y) B10, 16);
            } else if ((B10.f13987d & 16) != 0 && (B10 instanceof AbstractC1187h)) {
                androidx.compose.ui.h.c cVar2 = ((AbstractC1187h) B10).f14585q;
                int i12 = 0;
                while (cVar2 != null) {
                    if ((cVar2.f13987d & 16) != 0) {
                        i12++;
                        if (i12 == 1) {
                            B10 = B10;
                            cVar = cVar;
                            cVar = cVar;
                            B10 = cVar2;
                        } else {
                            if (cVar == 0) {
                                cVar = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
                            }
                            if (B10 != 0) {
                                cVar.b(B10);
                                B10 = 0;
                            }
                            cVar.b(cVar2);
                        }
                    } else {
                        B10 = B10;
                        cVar = cVar;
                    }
                    cVar2 = cVar2.f13990g;
                    B10 = B10;
                    cVar = cVar;
                }
                if (i12 == 1) {
                    B10 = B10;
                    cVar = cVar;
                } else {
                    B10 = B10;
                    cVar = cVar;
                }
            }
            B10 = C1185f.b(cVar);
        }
        if (this.f14085f == null) {
            return true;
        }
        int iG = c0891t.g();
        int i13 = 0;
        while (true) {
            c0891t2 = this.f14084e;
            bVar = this.f14083d;
            if (i13 >= iG) {
                break;
            }
            long jD = c0891t.d(i13);
            q qVar = (q) c0891t.h(i13);
            if (bVar.b(jD)) {
                long j = qVar.f14106g;
                if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                    long j10 = qVar.f14102c;
                    if ((((j10 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                        List list = qVar.f14109k;
                        if (list == null) {
                            list = EmptyList.f42983b;
                        }
                        ArrayList arrayList = new ArrayList(list.size());
                        List list2 = qVar.f14109k;
                        if (list2 == null) {
                            list2 = EmptyList.f42983b;
                        }
                        int size = list2.size();
                        int i14 = 0;
                        while (i14 < size) {
                            int i15 = size;
                            C1153d c1153d = (C1153d) list2.get(i14);
                            long j11 = jD;
                            long j12 = c1153d.f14071b;
                            if ((((j12 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                NodeCoordinator nodeCoordinator = this.f14085f;
                                kotlin.jvm.internal.i.b(nodeCoordinator);
                                arrayList.add(new C1153d(c1153d.f14070a, nodeCoordinator.I1(c1195p, j12), c1153d.f14072c));
                            }
                            i14++;
                            i13 = i13;
                            list2 = list2;
                            size = i15;
                            j10 = j10;
                            jD = j11;
                        }
                        i11 = i13;
                        long j13 = jD;
                        NodeCoordinator nodeCoordinator2 = this.f14085f;
                        kotlin.jvm.internal.i.b(nodeCoordinator2);
                        long jI1 = nodeCoordinator2.I1(c1195p, j);
                        NodeCoordinator nodeCoordinator3 = this.f14085f;
                        kotlin.jvm.internal.i.b(nodeCoordinator3);
                        q qVar2 = new q(qVar.f14100a, qVar.f14101b, nodeCoordinator3.I1(c1195p, j10), qVar.f14103d, qVar.f14104e, qVar.f14105f, jI1, qVar.f14107h, qVar.f14108i, arrayList, qVar.j, qVar.f14110l);
                        q qVar3 = qVar.f14113o;
                        if (qVar3 == null) {
                            qVar3 = qVar;
                        }
                        qVar2.f14113o = qVar3;
                        q qVar4 = qVar.f14113o;
                        if (qVar4 != null) {
                            qVar = qVar4;
                        }
                        qVar2.f14113o = qVar;
                        c0891t2.e(qVar2, j13);
                    } else {
                        i11 = i13;
                    }
                } else {
                    i11 = i13;
                }
            } else {
                i11 = i13;
            }
            i13 = i11 + 1;
            iG = iG;
            zA = zA;
        }
        boolean z14 = zA;
        if (c0891t2.g() == 0) {
            bVar.f4881a = 0;
            this.f14089a.j();
            return true;
        }
        for (int i16 = bVar.f4881a - 1; -1 < i16; i16--) {
            if (c0891t.c(bVar.f4882b[i16]) < 0 && i16 < (i10 = bVar.f4881a)) {
                int i17 = i10 - 1;
                int i18 = i16;
                while (i18 < i17) {
                    long[] jArr = bVar.f4882b;
                    int i19 = i18 + 1;
                    jArr[i18] = jArr[i19];
                    i18 = i19;
                }
                bVar.f4881a--;
            }
        }
        ArrayList arrayList2 = new ArrayList(c0891t2.g());
        int iG2 = c0891t2.g();
        for (int i20 = 0; i20 < iG2; i20++) {
            arrayList2.add(c0891t2.h(i20));
        }
        j jVar2 = new j(arrayList2, c1154e);
        int size2 = arrayList2.size();
        int i21 = 0;
        while (true) {
            if (i21 >= size2) {
                obj = null;
                break;
            }
            obj = arrayList2.get(i21);
            if (c1154e.a(((q) obj).f14100a)) {
                break;
            }
            i21++;
        }
        q qVar5 = (q) obj;
        if (qVar5 != null) {
            boolean z15 = qVar5.f14103d;
            if (z10) {
                z11 = false;
                if (!this.f14088i && (z15 || qVar5.f14107h)) {
                    NodeCoordinator nodeCoordinator4 = this.f14085f;
                    kotlin.jvm.internal.i.b(nodeCoordinator4);
                    long j14 = nodeCoordinator4.f14222d;
                    long j15 = qVar5.f14102c;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j15 >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j15 & 4294967295L));
                    z12 = true;
                    this.f14088i = !((fIntBitsToFloat < 0.0f) | (fIntBitsToFloat > ((float) ((int) (j14 >> 32)))) | (fIntBitsToFloat2 < 0.0f) | (fIntBitsToFloat2 > ((float) ((int) (j14 & 4294967295L)))));
                }
                if (this.f14088i == this.f14087h && (k.a(jVar2.f14094d, 3) || k.a(jVar2.f14094d, 4) || k.a(jVar2.f14094d, 5))) {
                    jVar2.f14094d = this.f14088i ? 4 : 5;
                } else if (!k.a(jVar2.f14094d, 4) && this.f14087h && !this.j) {
                    jVar2.f14094d = 3;
                } else if (k.a(jVar2.f14094d, 5) && this.f14088i && z15) {
                    jVar2.f14094d = 3;
                }
            } else {
                z11 = false;
                this.f14088i = false;
            }
            z12 = true;
            if (this.f14088i == this.f14087h) {
                if (!k.a(jVar2.f14094d, 4)) {
                    if (k.a(jVar2.f14094d, 5)) {
                        jVar2.f14094d = 3;
                    }
                } else if (k.a(jVar2.f14094d, 5)) {
                    jVar2.f14094d = 3;
                }
            } else if (!k.a(jVar2.f14094d, 4)) {
                if (k.a(jVar2.f14094d, 5)) {
                    jVar2.f14094d = 3;
                }
            } else if (k.a(jVar2.f14094d, 5)) {
                jVar2.f14094d = 3;
            }
        } else {
            z11 = false;
            z12 = true;
        }
        if (!z14 && k.a(jVar2.f14094d, 3) && (jVar = this.f14086g) != null) {
            ?? r10 = jVar.f14091a;
            int size3 = r10.size();
            ?? r11 = jVar2.f14091a;
            if (size3 != r11.size()) {
                z13 = z12;
                break;
            }
            int size4 = r11.size();
            ?? r12 = z11;
            while (true) {
                if (r12 >= size4) {
                    z13 = z11;
                    break;
                }
                if (!I.d.b(((q) r10.get(r12)).f14102c, ((q) r11.get(r12)).f14102c)) {
                    z13 = z12;
                    break;
                }
                r12++;
            }
        } else {
            z13 = z12;
            break;
        }
        this.f14086g = jVar2;
        return z13;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // androidx.compose.ui.input.pointer.i
    public final void b(C1154e c1154e) {
        super.b(c1154e);
        j jVar = this.f14086g;
        if (jVar == null) {
            return;
        }
        this.f14087h = this.f14088i;
        ?? r10 = jVar.f14091a;
        int size = ((Collection) r10).size();
        for (int i10 = 0; i10 < size; i10++) {
            q qVar = (q) r10.get(i10);
            boolean z10 = qVar.f14103d;
            long j = qVar.f14100a;
            boolean zA = c1154e.a(j);
            boolean z11 = this.f14088i;
            if ((!z10 && !zA) || (!z10 && !z11)) {
                this.f14083d.c(j);
            }
        }
        this.f14088i = false;
        this.j = k.a(jVar.f14094d, 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final void c() {
        androidx.compose.runtime.collection.c<h> cVar = this.f14089a;
        h[] hVarArr = cVar.f12943b;
        int i10 = cVar.f12945d;
        for (int i11 = 0; i11 < i10; i11++) {
            hVarArr[i11].c();
        }
        ?? B10 = this.f14082c;
        ?? cVar2 = 0;
        while (B10 != 0) {
            if (B10 instanceof Y) {
                ((Y) B10).u0();
            } else if ((B10.f13987d & 16) != 0 && (B10 instanceof AbstractC1187h)) {
                androidx.compose.ui.h.c cVar3 = ((AbstractC1187h) B10).f14585q;
                int i12 = 0;
                B10 = B10;
                cVar2 = cVar2;
                while (cVar3 != null) {
                    if ((cVar3.f13987d & 16) != 0) {
                        i12++;
                        if (i12 == 1) {
                            cVar2 = cVar2;
                            B10 = cVar3;
                        } else {
                            if (cVar2 == 0) {
                                cVar2 = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
                            }
                            if (B10 != 0) {
                                cVar2.b(B10);
                                B10 = 0;
                            }
                            cVar2.b(cVar3);
                        }
                    }
                    cVar3 = cVar3.f13990g;
                    B10 = B10;
                    cVar2 = cVar2;
                }
                if (i12 == 1) {
                }
            }
            B10 = C1185f.b(cVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final boolean d(C1154e c1154e) {
        C0891t<q> c0891t = this.f14084e;
        boolean z10 = false;
        z10 = false;
        if (!(c0891t.g() == 0)) {
            androidx.compose.ui.h.c cVar = this.f14082c;
            if (cVar.f13997o) {
                j jVar = this.f14086g;
                kotlin.jvm.internal.i.b(jVar);
                NodeCoordinator nodeCoordinator = this.f14085f;
                kotlin.jvm.internal.i.b(nodeCoordinator);
                long j = nodeCoordinator.f14222d;
                ?? B10 = cVar;
                ?? cVar2 = 0;
                while (B10 != 0) {
                    if (B10 instanceof Y) {
                        ((Y) B10).q0(jVar, PointerEventPass.f14031d, j);
                    } else if ((B10.f13987d & 16) != 0 && (B10 instanceof AbstractC1187h)) {
                        androidx.compose.ui.h.c cVar3 = ((AbstractC1187h) B10).f14585q;
                        int i10 = 0;
                        while (cVar3 != null) {
                            if ((cVar3.f13987d & 16) != 0) {
                                i10++;
                                if (i10 == 1) {
                                    B10 = B10;
                                    cVar2 = cVar2;
                                    cVar2 = cVar2;
                                    B10 = cVar3;
                                } else {
                                    if (cVar2 == 0) {
                                        cVar2 = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
                                    }
                                    if (B10 != 0) {
                                        cVar2.b(B10);
                                        B10 = 0;
                                    }
                                    cVar2.b(cVar3);
                                }
                            } else {
                                B10 = B10;
                                cVar2 = cVar2;
                            }
                            cVar3 = cVar3.f13990g;
                            B10 = B10;
                            cVar2 = cVar2;
                        }
                        if (i10 == 1) {
                            B10 = B10;
                            cVar2 = cVar2;
                        } else {
                            B10 = B10;
                            cVar2 = cVar2;
                        }
                    }
                    B10 = C1185f.b(cVar2);
                }
                if (cVar.f13997o) {
                    androidx.compose.runtime.collection.c<h> cVar4 = this.f14089a;
                    h[] hVarArr = cVar4.f12943b;
                    int i11 = cVar4.f12945d;
                    for (int i12 = 0; i12 < i11; i12++) {
                        hVarArr[i12].d(c1154e);
                    }
                }
                z10 = true;
            }
        }
        b(c1154e);
        c0891t.a();
        this.f14085f = null;
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean e(C1154e c1154e, boolean z10) {
        if (this.f14084e.g() == 0) {
            return false;
        }
        ?? B10 = this.f14082c;
        if (!B10.f13997o) {
            return false;
        }
        j jVar = this.f14086g;
        kotlin.jvm.internal.i.b(jVar);
        NodeCoordinator nodeCoordinator = this.f14085f;
        kotlin.jvm.internal.i.b(nodeCoordinator);
        long j = nodeCoordinator.f14222d;
        ?? B11 = B10;
        ?? cVar = 0;
        while (B11 != 0) {
            if (B11 instanceof Y) {
                ((Y) B11).q0(jVar, PointerEventPass.f14029b, j);
            } else if ((B11.f13987d & 16) != 0 && (B11 instanceof AbstractC1187h)) {
                androidx.compose.ui.h.c cVar2 = ((AbstractC1187h) B11).f14585q;
                int i10 = 0;
                while (cVar2 != null) {
                    if ((cVar2.f13987d & 16) != 0) {
                        i10++;
                        if (i10 == 1) {
                            B11 = B11;
                            cVar = cVar;
                            cVar = cVar;
                            B11 = cVar2;
                        } else {
                            if (cVar == 0) {
                                cVar = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
                            }
                            if (B11 != 0) {
                                cVar.b(B11);
                                B11 = 0;
                            }
                            cVar.b(cVar2);
                        }
                    } else {
                        B11 = B11;
                        cVar = cVar;
                    }
                    cVar2 = cVar2.f13990g;
                    B11 = B11;
                    cVar = cVar;
                }
                if (i10 == 1) {
                    B11 = B11;
                    cVar = cVar;
                } else {
                    B11 = B11;
                    cVar = cVar;
                }
            }
            B11 = C1185f.b(cVar);
        }
        if (B10.f13997o) {
            androidx.compose.runtime.collection.c<h> cVar3 = this.f14089a;
            h[] hVarArr = cVar3.f12943b;
            int i11 = cVar3.f12945d;
            for (int i12 = 0; i12 < i11; i12++) {
                h hVar = hVarArr[i12];
                kotlin.jvm.internal.i.b(this.f14085f);
                hVar.e(c1154e, z10);
            }
        }
        if (B10.f13997o) {
            ?? cVar4 = 0;
            while (B10 != 0) {
                if (B10 instanceof Y) {
                    ((Y) B10).q0(jVar, PointerEventPass.f14030c, j);
                } else if ((B10.f13987d & 16) != 0 && (B10 instanceof AbstractC1187h)) {
                    androidx.compose.ui.h.c cVar5 = ((AbstractC1187h) B10).f14585q;
                    int i13 = 0;
                    while (cVar5 != null) {
                        if ((cVar5.f13987d & 16) != 0) {
                            i13++;
                            if (i13 == 1) {
                                B10 = B10;
                                cVar4 = cVar4;
                                cVar4 = cVar4;
                                B10 = cVar5;
                            } else {
                                if (cVar4 == 0) {
                                    cVar4 = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
                                }
                                if (B10 != 0) {
                                    cVar4.b(B10);
                                    B10 = 0;
                                }
                                cVar4.b(cVar5);
                            }
                        } else {
                            B10 = B10;
                            cVar4 = cVar4;
                        }
                        cVar5 = cVar5.f13990g;
                        B10 = B10;
                        cVar4 = cVar4;
                    }
                    if (i13 == 1) {
                        B10 = B10;
                        cVar4 = cVar4;
                    } else {
                        B10 = B10;
                        cVar4 = cVar4;
                    }
                }
                B10 = C1185f.b(cVar4);
            }
        }
        return true;
    }

    public final void f(long j, I<h> i10) {
        P.b bVar = this.f14083d;
        if (bVar.b(j) && i10.c(this) < 0) {
            bVar.c(j);
            this.f14084e.f(j);
        }
        androidx.compose.runtime.collection.c<h> cVar = this.f14089a;
        h[] hVarArr = cVar.f12943b;
        int i11 = cVar.f12945d;
        for (int i12 = 0; i12 < i11; i12++) {
            hVarArr[i12].f(j, i10);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.f14082c + ", children=" + this.f14089a + ", pointerIds=" + this.f14083d + ')';
    }
}
