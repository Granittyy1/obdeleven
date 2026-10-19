package androidx.compose.ui.modifier;

import androidx.compose.ui.node.AbstractC1187h;
import androidx.compose.ui.node.BackwardsCompatNode;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.HashSet;
import java.util.Iterator;
import p293xa.r;

/* JADX INFO: compiled from: ModifierLocalManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ModifierLocalManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f14294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.compose.runtime.collection.c<BackwardsCompatNode> f14295b = new androidx.compose.runtime.collection.c<>(new BackwardsCompatNode[16]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.compose.runtime.collection.c<c<?>> f14296c = new androidx.compose.runtime.collection.c<>(new c[16]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.compose.runtime.collection.c<LayoutNode> f14297d = new androidx.compose.runtime.collection.c<>(new LayoutNode[16]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.compose.runtime.collection.c<c<?>> f14298e = new androidx.compose.runtime.collection.c<>(new c[16]);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14299f;

    public ModifierLocalManager(AndroidComposeView androidComposeView) {
        this.f14294a = androidComposeView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static void b(androidx.compose.ui.h.c cVar, c cVar2, HashSet hashSet) {
        if (!cVar.f13985b.f13997o) {
            R.a.b("visitSubtreeIf called on an unattached node");
        }
        androidx.compose.runtime.collection.c cVar3 = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
        androidx.compose.ui.h.c cVar4 = cVar.f13985b;
        androidx.compose.ui.h.c cVar5 = cVar4.f13990g;
        if (cVar5 == null) {
            C1185f.a(cVar3, cVar4);
        } else {
            cVar3.b(cVar5);
        }
        while (true) {
            int i10 = cVar3.f12945d;
            if (i10 == 0) {
                return;
            }
            androidx.compose.ui.h.c cVar6 = (androidx.compose.ui.h.c) cVar3.p(i10 - 1);
            if ((cVar6.f13988e & 32) != 0) {
                androidx.compose.ui.h.c cVar7 = cVar6;
                while (true) {
                    if (cVar7 != null) {
                        if ((cVar7.f13987d & 32) != 0) {
                            ?? B10 = cVar7;
                            ?? cVar8 = 0;
                            while (B10 != 0) {
                                if (B10 instanceof e) {
                                    e eVar = (e) B10;
                                    if (eVar instanceof BackwardsCompatNode) {
                                        BackwardsCompatNode backwardsCompatNode = (BackwardsCompatNode) eVar;
                                        if ((backwardsCompatNode.f14319p instanceof d) && backwardsCompatNode.f14322s.contains(cVar2)) {
                                            hashSet.add(eVar);
                                        }
                                    }
                                    if (eVar.N0().I(cVar2)) {
                                        break;
                                    }
                                } else if ((B10.f13987d & 32) != 0 && (B10 instanceof AbstractC1187h)) {
                                    androidx.compose.ui.h.c cVar9 = ((AbstractC1187h) B10).f14585q;
                                    int i11 = 0;
                                    B10 = B10;
                                    cVar8 = cVar8;
                                    while (cVar9 != null) {
                                        if ((cVar9.f13987d & 32) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                cVar8 = cVar8;
                                                B10 = cVar9;
                                            } else {
                                                if (cVar8 == 0) {
                                                    cVar8 = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
                                                }
                                                if (B10 != 0) {
                                                    cVar8.b(B10);
                                                    B10 = 0;
                                                }
                                                cVar8.b(cVar9);
                                            }
                                        }
                                        cVar9 = cVar9.f13990g;
                                        B10 = B10;
                                        cVar8 = cVar8;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                B10 = C1185f.b(cVar8);
                            }
                        }
                        cVar7 = cVar7.f13990g;
                    }
                }
            }
            C1185f.a(cVar3, cVar6);
        }
    }

    public final void a() {
        if (this.f14299f) {
            return;
        }
        this.f14299f = true;
        this.f14294a.O(new Ia.a<r>() { // from class: androidx.compose.ui.modifier.ModifierLocalManager$invalidate$1
            {
                super(0);
            }

            @Override // Ia.a
            public final r invoke() {
                androidx.compose.runtime.collection.c<c<?>> cVar;
                androidx.compose.runtime.collection.c<c<?>> cVar2;
                ModifierLocalManager modifierLocalManager = this.this$0;
                int i10 = 0;
                modifierLocalManager.f14299f = false;
                HashSet hashSet = new HashSet();
                androidx.compose.runtime.collection.c<LayoutNode> cVar3 = modifierLocalManager.f14297d;
                LayoutNode[] layoutNodeArr = cVar3.f12943b;
                int i11 = cVar3.f12945d;
                int i12 = 0;
                while (true) {
                    cVar = modifierLocalManager.f14298e;
                    if (i12 >= i11) {
                        break;
                    }
                    LayoutNode layoutNode = layoutNodeArr[i12];
                    c<?> cVar4 = cVar.f12943b[i12];
                    androidx.compose.ui.h.c cVar5 = layoutNode.f14389G.f14368e;
                    if (cVar5.f13997o) {
                        ModifierLocalManager.b(cVar5, cVar4, hashSet);
                    }
                    i12++;
                }
                cVar3.j();
                cVar.j();
                androidx.compose.runtime.collection.c<BackwardsCompatNode> cVar6 = modifierLocalManager.f14295b;
                BackwardsCompatNode[] backwardsCompatNodeArr = cVar6.f12943b;
                int i13 = cVar6.f12945d;
                while (true) {
                    cVar2 = modifierLocalManager.f14296c;
                    if (i10 >= i13) {
                        break;
                    }
                    BackwardsCompatNode backwardsCompatNode = backwardsCompatNodeArr[i10];
                    c<?> cVar7 = cVar2.f12943b[i10];
                    if (backwardsCompatNode.f13997o) {
                        ModifierLocalManager.b(backwardsCompatNode, cVar7, hashSet);
                    }
                    i10++;
                }
                cVar6.j();
                cVar2.j();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((BackwardsCompatNode) it.next()).S1();
                }
                return r.f47939a;
            }
        });
    }
}
