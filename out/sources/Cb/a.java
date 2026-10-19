package Cb;

import D9.o;
import Ia.l;
import J4.i;
import Jb.b;
import android.content.ComponentCallbacks;
import android.os.Build;
import android.view.MotionEvent;
import androidx.compose.runtime.collection.c;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.h;
import androidx.compose.ui.input.pointer.j;
import androidx.compose.ui.node.AbstractC1187h;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.K;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import androidx.compose.ui.node.e0;
import androidx.core.view.C1293h;

/* JADX INFO: compiled from: AndroidKoinScopeExt.kt */
/* JADX INFO: loaded from: classes2.dex */
public class a {
    public static final long a(int i10, int i11) {
        return (((long) i11) & 4294967295L) | (((long) i10) << 32);
    }

    public static final long b(float f10, float f11) {
        return (((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    public static final h c(h hVar, float f10) {
        return f10 == 1.0f ? hVar : T.b(hVar, 0.0f, 0.0f, f10, 0.0f, 0.0f, null, true, 126971);
    }

    public static final void d(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            throw new IllegalArgumentException((i10 != i11 ? C1293h.h("Both size ", " and step ", " must be greater than zero.", i10, i11) : i.c(i10, "size ", " must be greater than zero.")).toString());
        }
    }

    public static int e(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [androidx.compose.ui.node.e, androidx.compose.ui.node.e0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r3v9 */
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
    /* JADX WARN: Type inference failed for: r6v7 */
    public static final e0 f(e0 e0Var) {
        K k10;
        h.c cVar = (h.c) e0Var;
        if (!cVar.f13985b.f13997o) {
            R.a.b("visitAncestors called on an unattached node");
        }
        h.c cVar2 = cVar.f13985b.f13989f;
        LayoutNode layoutNodeF = C1185f.f(e0Var);
        while (layoutNodeF != null) {
            if ((layoutNodeF.f14389G.f14368e.f13988e & 262144) != 0) {
                while (cVar2 != null) {
                    if ((cVar2.f13987d & 262144) != 0) {
                        ?? B10 = cVar2;
                        ?? cVar3 = 0;
                        while (B10 != 0) {
                            if (B10 instanceof e0) {
                                e0 e0Var2 = (e0) B10;
                                if (kotlin.jvm.internal.i.a(e0Var.J(), e0Var2.J()) && o.g(e0Var, e0Var2)) {
                                    return e0Var2;
                                }
                            } else if ((B10.f13987d & 262144) != 0 && (B10 instanceof AbstractC1187h)) {
                                h.c cVar4 = ((AbstractC1187h) B10).f14585q;
                                int i10 = 0;
                                B10 = B10;
                                cVar3 = cVar3;
                                while (cVar4 != null) {
                                    if ((cVar4.f13987d & 262144) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            cVar3 = cVar3;
                                            B10 = cVar4;
                                        } else {
                                            if (cVar3 == 0) {
                                                cVar3 = new c(new h.c[16]);
                                            }
                                            if (B10 != 0) {
                                                cVar3.b(B10);
                                                B10 = 0;
                                            }
                                            cVar3.b(cVar4);
                                        }
                                    }
                                    cVar4 = cVar4.f13990g;
                                    B10 = B10;
                                    cVar3 = cVar3;
                                }
                                if (i10 == 1) {
                                }
                            }
                            B10 = C1185f.b(cVar3);
                        }
                    }
                    cVar2 = cVar2.f13989f;
                }
            }
            layoutNodeF = layoutNodeF.G();
            cVar2 = (layoutNodeF == null || (k10 = layoutNodeF.f14389G) == null) ? null : k10.f14367d;
        }
        return null;
    }

    public static final long g(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final org.koin.core.scope.a i(ComponentCallbacks componentCallbacks) {
        kotlin.jvm.internal.i.e(componentCallbacks, "<this>");
        if (componentCallbacks instanceof Eb.a) {
            return ((Eb.a) componentCallbacks).b();
        }
        if (componentCallbacks instanceof b) {
            return ((b) componentCallbacks).b();
        }
        if (componentCallbacks instanceof Jb.a) {
            return ((Jb.a) componentCallbacks).i().f3935a.f5143b;
        }
        Ib.a aVar = Kb.a.f4375b;
        if (aVar != null) {
            return aVar.f3935a.f5143b;
        }
        throw new IllegalStateException("KoinApplication has not been started");
    }

    public static final boolean j(j jVar) {
        MotionEvent motionEventA;
        return ((Build.VERSION.SDK_INT < 29 || (motionEventA = jVar.a()) == null) ? 0 : motionEventA.getClassification()) == 2;
    }

    public static final long k(long j, long j10) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) + ((int) (j10 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j10 & 4294967295L)))) & 4294967295L);
    }

    public static final long l(long j) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    public static boolean m(String str) {
        return str == null || str.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [androidx.compose.ui.node.e, androidx.compose.ui.node.e0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.h$c] */
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
    public static final void n(e0 e0Var, l lVar) {
        K k10;
        h.c cVar = (h.c) e0Var;
        if (!cVar.f13985b.f13997o) {
            R.a.b("visitAncestors called on an unattached node");
        }
        h.c cVar2 = cVar.f13985b.f13989f;
        LayoutNode layoutNodeF = C1185f.f(e0Var);
        while (layoutNodeF != null) {
            if ((layoutNodeF.f14389G.f14368e.f13988e & 262144) != 0) {
                while (cVar2 != null) {
                    if ((cVar2.f13987d & 262144) != 0) {
                        ?? B10 = cVar2;
                        ?? cVar3 = 0;
                        while (B10 != 0) {
                            boolean zBooleanValue = true;
                            if (B10 instanceof e0) {
                                e0 e0Var2 = (e0) B10;
                                if (kotlin.jvm.internal.i.a(e0Var.J(), e0Var2.J()) && o.g(e0Var, e0Var2)) {
                                    zBooleanValue = ((Boolean) lVar.invoke(e0Var2)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else {
                                if (((B10.f13987d & 262144) != 0) && (B10 instanceof AbstractC1187h)) {
                                    h.c cVar4 = ((AbstractC1187h) B10).f14585q;
                                    int i10 = 0;
                                    while (cVar4 != null) {
                                        if ((cVar4.f13987d & 262144) != 0) {
                                            B10 = B10;
                                            cVar3 = cVar3;
                                            i10++;
                                            if (i10 == 1) {
                                                B10 = B10;
                                                cVar3 = cVar3;
                                                cVar3 = cVar3;
                                                B10 = cVar4;
                                            } else {
                                                if (cVar3 == 0) {
                                                    cVar3 = new c(new h.c[16]);
                                                }
                                                if (B10 != 0) {
                                                    cVar3.b(B10);
                                                    B10 = 0;
                                                }
                                                cVar3.b(cVar4);
                                            }
                                        } else {
                                            B10 = B10;
                                            cVar3 = cVar3;
                                            B10 = B10;
                                            cVar3 = cVar3;
                                        }
                                        cVar4 = cVar4.f13990g;
                                        B10 = B10;
                                        cVar3 = cVar3;
                                    }
                                    if (i10 == 1) {
                                        B10 = B10;
                                        cVar3 = cVar3;
                                    } else {
                                        B10 = B10;
                                        cVar3 = cVar3;
                                    }
                                }
                            }
                            B10 = C1185f.b(cVar3);
                        }
                    }
                    cVar2 = cVar2.f13989f;
                }
            }
            layoutNodeF = layoutNodeF.G();
            cVar2 = (layoutNodeF == null || (k10 = layoutNodeF.f14389G) == null) ? null : k10.f14367d;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void o(e0 e0Var, l lVar) {
        if (!e0Var.getNode().f13997o) {
            R.a.b("visitSubtreeIf called on an unattached node");
        }
        c cVar = new c(new h.c[16]);
        h.c cVar2 = e0Var.getNode().f13990g;
        if (cVar2 == null) {
            C1185f.a(cVar, e0Var.getNode());
        } else {
            cVar.b(cVar2);
        }
        while (true) {
            int i10 = cVar.f12945d;
            if (i10 == 0) {
                return;
            }
            h.c cVar3 = (h.c) cVar.p(i10 - 1);
            if ((cVar3.f13988e & 262144) != 0) {
                h.c cVar4 = cVar3;
                while (true) {
                    if (cVar4 != null) {
                        if ((cVar4.f13987d & 262144) != 0) {
                            ?? B10 = cVar4;
                            ?? cVar5 = 0;
                            while (B10 != 0) {
                                if (B10 instanceof e0) {
                                    e0 e0Var2 = (e0) B10;
                                    TraversableNode$Companion$TraverseDescendantsAction traversableNode$Companion$TraverseDescendantsAction = (kotlin.jvm.internal.i.a(e0Var.J(), e0Var2.J()) && o.g(e0Var, e0Var2)) ? (TraversableNode$Companion$TraverseDescendantsAction) lVar.invoke(e0Var2) : TraversableNode$Companion$TraverseDescendantsAction.f14569b;
                                    if (traversableNode$Companion$TraverseDescendantsAction != TraversableNode$Companion$TraverseDescendantsAction.f14571d) {
                                        if (traversableNode$Companion$TraverseDescendantsAction == TraversableNode$Companion$TraverseDescendantsAction.f14570c) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((B10.f13987d & 262144) != 0 && (B10 instanceof AbstractC1187h)) {
                                    h.c cVar6 = ((AbstractC1187h) B10).f14585q;
                                    int i11 = 0;
                                    B10 = B10;
                                    cVar5 = cVar5;
                                    while (cVar6 != null) {
                                        if ((cVar6.f13987d & 262144) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                cVar5 = cVar5;
                                                B10 = cVar6;
                                            } else {
                                                if (cVar5 == 0) {
                                                    cVar5 = new c(new h.c[16]);
                                                }
                                                if (B10 != 0) {
                                                    cVar5.b(B10);
                                                    B10 = 0;
                                                }
                                                cVar5.b(cVar6);
                                            }
                                        }
                                        cVar6 = cVar6.f13990g;
                                        B10 = B10;
                                        cVar5 = cVar5;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                B10 = C1185f.b(cVar5);
                            }
                        }
                        cVar4 = cVar4.f13990g;
                    }
                }
            }
            C1185f.a(cVar, cVar3);
        }
    }

    public void h(S5.l lVar, float f10, float f11) {
        throw null;
    }
}
