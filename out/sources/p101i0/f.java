package p101i0;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.d;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: Direct.java */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b.a f36483a = new b.a();

    public static boolean a(ConstraintWidget constraintWidget) {
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f15962U;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
        ConstraintWidget constraintWidget2 = constraintWidget.f15963V;
        d dVar = constraintWidget2 != null ? (d) constraintWidget2 : null;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f16013b;
        if (dVar != null) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dVar.f15962U[0];
        }
        if (dVar != null) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = dVar.f15962U[1];
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.f16015d;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.f16014c;
        boolean z10 = dimensionBehaviour == dimensionBehaviour3 || constraintWidget.E() || dimensionBehaviour == dimensionBehaviour7 || (dimensionBehaviour == dimensionBehaviour6 && constraintWidget.f16001r == 0 && constraintWidget.f15966Y == 0.0f && constraintWidget.x(0)) || (dimensionBehaviour == dimensionBehaviour6 && constraintWidget.f16001r == 1 && constraintWidget.y(0, constraintWidget.u()));
        boolean z11 = dimensionBehaviour2 == dimensionBehaviour3 || constraintWidget.F() || dimensionBehaviour2 == dimensionBehaviour7 || (dimensionBehaviour2 == dimensionBehaviour6 && constraintWidget.f16003s == 0 && constraintWidget.f15966Y == 0.0f && constraintWidget.x(1)) || (dimensionBehaviour2 == dimensionBehaviour6 && constraintWidget.f16003s == 1 && constraintWidget.y(1, constraintWidget.o()));
        if (constraintWidget.f15966Y <= 0.0f || !(z10 || z11)) {
            return z10 && z11;
        }
        return true;
    }

    public static void b(int i10, ConstraintWidget constraintWidget, b.InterfaceC0381b interfaceC0381b, boolean z10) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        if (constraintWidget.f15991m) {
            return;
        }
        if (!(constraintWidget instanceof d) && constraintWidget.D() && a(constraintWidget)) {
            d.Z(constraintWidget, interfaceC0381b, new b.a());
        }
        ConstraintAnchor constraintAnchorM = constraintWidget.m(ConstraintAnchor.Type.f15934b);
        ConstraintAnchor constraintAnchorM2 = constraintWidget.m(ConstraintAnchor.Type.f15936d);
        int iD = constraintAnchorM.d();
        int iD2 = constraintAnchorM2.d();
        HashSet<ConstraintAnchor> hashSet = constraintAnchorM.f15925a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f16015d;
        if (hashSet != null && constraintAnchorM.f15927c) {
            for (Iterator<ConstraintAnchor> it = hashSet.iterator(); it.hasNext(); it = it) {
                ConstraintAnchor next = it.next();
                ConstraintWidget constraintWidget2 = next.f15928d;
                int i11 = i10 + 1;
                boolean zA = a(constraintWidget2);
                if (constraintWidget2.D() && zA) {
                    d.Z(constraintWidget2, interfaceC0381b, new b.a());
                }
                ConstraintAnchor constraintAnchor5 = constraintWidget2.f15951J;
                ConstraintAnchor constraintAnchor6 = constraintWidget2.f15953L;
                boolean z11 = (next == constraintAnchor5 && (constraintAnchor4 = constraintAnchor6.f15930f) != null && constraintAnchor4.f15927c) || (next == constraintAnchor6 && (constraintAnchor3 = constraintAnchor5.f15930f) != null && constraintAnchor3.f15927c);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget2.f15962U[0];
                if (dimensionBehaviour2 != dimensionBehaviour || zA) {
                    if (!constraintWidget2.D()) {
                        if (next == constraintAnchor5 && constraintAnchor6.f15930f == null) {
                            int iE = constraintAnchor5.e() + iD;
                            constraintWidget2.N(iE, constraintWidget2.u() + iE);
                            b(i11, constraintWidget2, interfaceC0381b, z10);
                        } else if (next == constraintAnchor6 && constraintAnchor5.f15930f == null) {
                            int iE2 = iD - constraintAnchor6.e();
                            constraintWidget2.N(iE2 - constraintWidget2.u(), iE2);
                            b(i11, constraintWidget2, interfaceC0381b, z10);
                        } else if (z11 && !constraintWidget2.B()) {
                            c(i11, constraintWidget2, interfaceC0381b, z10);
                        }
                    }
                } else if (dimensionBehaviour2 == dimensionBehaviour && constraintWidget2.f16008v >= 0 && constraintWidget2.f16007u >= 0 && ((constraintWidget2.f15985i0 == 8 || (constraintWidget2.f16001r == 0 && constraintWidget2.f15966Y == 0.0f)) && !constraintWidget2.B() && !constraintWidget2.f15948G && z11 && !constraintWidget2.B())) {
                    d(i11, constraintWidget, interfaceC0381b, constraintWidget2, z10);
                }
            }
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
            return;
        }
        HashSet<ConstraintAnchor> hashSet2 = constraintAnchorM2.f15925a;
        if (hashSet2 != null && constraintAnchorM2.f15927c) {
            Iterator<ConstraintAnchor> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                ConstraintAnchor next2 = it2.next();
                ConstraintWidget constraintWidget3 = next2.f15928d;
                int i12 = i10 + 1;
                boolean zA2 = a(constraintWidget3);
                if (constraintWidget3.D() && zA2) {
                    d.Z(constraintWidget3, interfaceC0381b, new b.a());
                }
                ConstraintAnchor constraintAnchor7 = constraintWidget3.f15951J;
                ConstraintAnchor constraintAnchor8 = constraintWidget3.f15953L;
                boolean z12 = (next2 == constraintAnchor7 && (constraintAnchor2 = constraintAnchor8.f15930f) != null && constraintAnchor2.f15927c) || (next2 == constraintAnchor8 && (constraintAnchor = constraintAnchor7.f15930f) != null && constraintAnchor.f15927c);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = constraintWidget3.f15962U[0];
                if (dimensionBehaviour3 != dimensionBehaviour || zA2) {
                    if (!constraintWidget3.D()) {
                        if (next2 == constraintAnchor7 && constraintAnchor8.f15930f == null) {
                            int iE3 = constraintAnchor7.e() + iD2;
                            constraintWidget3.N(iE3, constraintWidget3.u() + iE3);
                            b(i12, constraintWidget3, interfaceC0381b, z10);
                        } else if (next2 == constraintAnchor8 && constraintAnchor7.f15930f == null) {
                            int iE4 = iD2 - constraintAnchor8.e();
                            constraintWidget3.N(iE4 - constraintWidget3.u(), iE4);
                            b(i12, constraintWidget3, interfaceC0381b, z10);
                        } else if (z12 && !constraintWidget3.B()) {
                            c(i12, constraintWidget3, interfaceC0381b, z10);
                        }
                    }
                } else if (dimensionBehaviour3 == dimensionBehaviour && constraintWidget3.f16008v >= 0 && constraintWidget3.f16007u >= 0) {
                    if (constraintWidget3.f15985i0 != 8) {
                        if (constraintWidget3.f16001r == 0) {
                            if (constraintWidget3.f15966Y == 0.0f) {
                            }
                        }
                    }
                    if (!constraintWidget3.B() && !constraintWidget3.f15948G && z12 && !constraintWidget3.B()) {
                        d(i12, constraintWidget, interfaceC0381b, constraintWidget3, z10);
                    }
                }
            }
        }
        constraintWidget.f15991m = true;
    }

    public static void c(int i10, ConstraintWidget constraintWidget, b.InterfaceC0381b interfaceC0381b, boolean z10) {
        float f10 = constraintWidget.f15979f0;
        ConstraintAnchor constraintAnchor = constraintWidget.f15951J;
        int iD = constraintAnchor.f15930f.d();
        ConstraintAnchor constraintAnchor2 = constraintWidget.f15953L;
        int iD2 = constraintAnchor2.f15930f.d();
        int iE = constraintAnchor.e() + iD;
        int iE2 = iD2 - constraintAnchor2.e();
        if (iD == iD2) {
            f10 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iU = constraintWidget.u();
        int i11 = (iD2 - iD) - iU;
        if (iD > iD2) {
            i11 = (iD - iD2) - iU;
        }
        int i12 = ((int) (i11 > 0 ? (f10 * i11) + 0.5f : f10 * i11)) + iD;
        int i13 = i12 + iU;
        if (iD > iD2) {
            i13 = i12 - iU;
        }
        constraintWidget.N(i12, i13);
        b(i10 + 1, constraintWidget, interfaceC0381b, z10);
    }

    public static void d(int i10, ConstraintWidget constraintWidget, b.InterfaceC0381b interfaceC0381b, ConstraintWidget constraintWidget2, boolean z10) {
        float f10 = constraintWidget2.f15979f0;
        ConstraintAnchor constraintAnchor = constraintWidget2.f15951J;
        int iE = constraintAnchor.e() + constraintAnchor.f15930f.d();
        ConstraintAnchor constraintAnchor2 = constraintWidget2.f15953L;
        int iD = constraintAnchor2.f15930f.d() - constraintAnchor2.e();
        if (iD >= iE) {
            int iU = constraintWidget2.u();
            if (constraintWidget2.f15985i0 != 8) {
                int i11 = constraintWidget2.f16001r;
                if (i11 == 2) {
                    iU = (int) (constraintWidget2.f15979f0 * 0.5f * (constraintWidget instanceof d ? constraintWidget.u() : constraintWidget.f15963V.u()));
                } else if (i11 == 0) {
                    iU = iD - iE;
                }
                iU = Math.max(constraintWidget2.f16007u, iU);
                int i12 = constraintWidget2.f16008v;
                if (i12 > 0) {
                    iU = Math.min(i12, iU);
                }
            }
            int i13 = iE + ((int) ((f10 * ((iD - iE) - iU)) + 0.5f));
            constraintWidget2.N(i13, iU + i13);
            b(i10 + 1, constraintWidget2, interfaceC0381b, z10);
        }
    }

    public static void e(int i10, ConstraintWidget constraintWidget, b.InterfaceC0381b interfaceC0381b) {
        float f10 = constraintWidget.f15981g0;
        ConstraintAnchor constraintAnchor = constraintWidget.f15952K;
        int iD = constraintAnchor.f15930f.d();
        ConstraintAnchor constraintAnchor2 = constraintWidget.f15954M;
        int iD2 = constraintAnchor2.f15930f.d();
        int iE = constraintAnchor.e() + iD;
        int iE2 = iD2 - constraintAnchor2.e();
        if (iD == iD2) {
            f10 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iO = constraintWidget.o();
        int i11 = (iD2 - iD) - iO;
        if (iD > iD2) {
            i11 = (iD - iD2) - iO;
        }
        int i12 = (int) (i11 > 0 ? (f10 * i11) + 0.5f : f10 * i11);
        int i13 = iD + i12;
        int i14 = i13 + iO;
        if (iD > iD2) {
            i13 = iD - i12;
            i14 = i13 - iO;
        }
        constraintWidget.O(i13, i14);
        g(i10 + 1, constraintWidget, interfaceC0381b);
    }

    public static void f(int i10, ConstraintWidget constraintWidget, b.InterfaceC0381b interfaceC0381b, ConstraintWidget constraintWidget2) {
        float f10 = constraintWidget2.f15981g0;
        ConstraintAnchor constraintAnchor = constraintWidget2.f15952K;
        int iE = constraintAnchor.e() + constraintAnchor.f15930f.d();
        ConstraintAnchor constraintAnchor2 = constraintWidget2.f15954M;
        int iD = constraintAnchor2.f15930f.d() - constraintAnchor2.e();
        if (iD >= iE) {
            int iO = constraintWidget2.o();
            if (constraintWidget2.f15985i0 != 8) {
                int i11 = constraintWidget2.f16003s;
                if (i11 == 2) {
                    iO = (int) (f10 * 0.5f * (constraintWidget instanceof d ? constraintWidget.o() : constraintWidget.f15963V.o()));
                } else if (i11 == 0) {
                    iO = iD - iE;
                }
                iO = Math.max(constraintWidget2.f16010x, iO);
                int i12 = constraintWidget2.f16011y;
                if (i12 > 0) {
                    iO = Math.min(i12, iO);
                }
            }
            int i13 = iE + ((int) ((f10 * ((iD - iE) - iO)) + 0.5f));
            constraintWidget2.O(i13, iO + i13);
            g(i10 + 1, constraintWidget2, interfaceC0381b);
        }
    }

    public static void g(int i10, ConstraintWidget constraintWidget, b.InterfaceC0381b interfaceC0381b) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        ConstraintAnchor constraintAnchor5;
        if (constraintWidget.f15993n) {
            return;
        }
        if (!(constraintWidget instanceof d) && constraintWidget.D() && a(constraintWidget)) {
            d.Z(constraintWidget, interfaceC0381b, new b.a());
        }
        ConstraintAnchor constraintAnchorM = constraintWidget.m(ConstraintAnchor.Type.f15935c);
        ConstraintAnchor constraintAnchorM2 = constraintWidget.m(ConstraintAnchor.Type.f15937e);
        int iD = constraintAnchorM.d();
        int iD2 = constraintAnchorM2.d();
        HashSet<ConstraintAnchor> hashSet = constraintAnchorM.f15925a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f16015d;
        if (hashSet != null && constraintAnchorM.f15927c) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                ConstraintAnchor next = it.next();
                ConstraintWidget constraintWidget2 = next.f15928d;
                int i11 = i10 + 1;
                boolean zA = a(constraintWidget2);
                if (constraintWidget2.D() && zA) {
                    d.Z(constraintWidget2, interfaceC0381b, new b.a());
                }
                ConstraintAnchor constraintAnchor6 = constraintWidget2.f15952K;
                ConstraintAnchor constraintAnchor7 = constraintWidget2.f15954M;
                boolean z10 = (next == constraintAnchor6 && (constraintAnchor5 = constraintAnchor7.f15930f) != null && constraintAnchor5.f15927c) || (next == constraintAnchor7 && (constraintAnchor4 = constraintAnchor6.f15930f) != null && constraintAnchor4.f15927c);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget2.f15962U[1];
                if (dimensionBehaviour2 != dimensionBehaviour || zA) {
                    if (!constraintWidget2.D()) {
                        if (next == constraintAnchor6 && constraintAnchor7.f15930f == null) {
                            int iE = constraintAnchor6.e() + iD;
                            constraintWidget2.O(iE, constraintWidget2.o() + iE);
                            g(i11, constraintWidget2, interfaceC0381b);
                        } else if (next == constraintAnchor7 && constraintAnchor6.f15930f == null) {
                            int iE2 = iD - constraintAnchor7.e();
                            constraintWidget2.O(iE2 - constraintWidget2.o(), iE2);
                            g(i11, constraintWidget2, interfaceC0381b);
                        } else if (z10 && !constraintWidget2.C()) {
                            e(i11, constraintWidget2, interfaceC0381b);
                        }
                    }
                } else if (dimensionBehaviour2 == dimensionBehaviour && constraintWidget2.f16011y >= 0 && constraintWidget2.f16010x >= 0 && (constraintWidget2.f15985i0 == 8 || (constraintWidget2.f16003s == 0 && constraintWidget2.f15966Y == 0.0f))) {
                    if (!constraintWidget2.C() && !constraintWidget2.f15948G && z10 && !constraintWidget2.C()) {
                        f(i11, constraintWidget, interfaceC0381b, constraintWidget2);
                    }
                }
            }
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
            return;
        }
        HashSet<ConstraintAnchor> hashSet2 = constraintAnchorM2.f15925a;
        if (hashSet2 != null && constraintAnchorM2.f15927c) {
            Iterator<ConstraintAnchor> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                ConstraintAnchor next2 = it2.next();
                ConstraintWidget constraintWidget3 = next2.f15928d;
                int i12 = i10 + 1;
                boolean zA2 = a(constraintWidget3);
                if (constraintWidget3.D() && zA2) {
                    d.Z(constraintWidget3, interfaceC0381b, new b.a());
                }
                ConstraintAnchor constraintAnchor8 = constraintWidget3.f15952K;
                ConstraintAnchor constraintAnchor9 = constraintWidget3.f15954M;
                boolean z11 = (next2 == constraintAnchor8 && (constraintAnchor3 = constraintAnchor9.f15930f) != null && constraintAnchor3.f15927c) || (next2 == constraintAnchor9 && (constraintAnchor2 = constraintAnchor8.f15930f) != null && constraintAnchor2.f15927c);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = constraintWidget3.f15962U[1];
                if (dimensionBehaviour3 != dimensionBehaviour || zA2) {
                    if (!constraintWidget3.D()) {
                        if (next2 == constraintAnchor8 && constraintAnchor9.f15930f == null) {
                            int iE3 = constraintAnchor8.e() + iD2;
                            constraintWidget3.O(iE3, constraintWidget3.o() + iE3);
                            g(i12, constraintWidget3, interfaceC0381b);
                        } else if (next2 == constraintAnchor9 && constraintAnchor8.f15930f == null) {
                            int iE4 = iD2 - constraintAnchor9.e();
                            constraintWidget3.O(iE4 - constraintWidget3.o(), iE4);
                            g(i12, constraintWidget3, interfaceC0381b);
                        } else if (z11 && !constraintWidget3.C()) {
                            e(i12, constraintWidget3, interfaceC0381b);
                        }
                    }
                } else if (dimensionBehaviour3 == dimensionBehaviour && constraintWidget3.f16011y >= 0 && constraintWidget3.f16010x >= 0) {
                    if (constraintWidget3.f15985i0 != 8) {
                        if (constraintWidget3.f16003s == 0) {
                            if (constraintWidget3.f15966Y == 0.0f) {
                            }
                        }
                    }
                    if (!constraintWidget3.C() && !constraintWidget3.f15948G && z11 && !constraintWidget3.C()) {
                        f(i12, constraintWidget, interfaceC0381b, constraintWidget3);
                    }
                }
            }
        }
        ConstraintAnchor constraintAnchorM3 = constraintWidget.m(ConstraintAnchor.Type.f15938f);
        if (constraintAnchorM3.f15925a != null && constraintAnchorM3.f15927c) {
            int iD3 = constraintAnchorM3.d();
            for (ConstraintAnchor constraintAnchor10 : constraintAnchorM3.f15925a) {
                ConstraintWidget constraintWidget4 = constraintAnchor10.f15928d;
                int i13 = i10 + 1;
                boolean zA3 = a(constraintWidget4);
                if (constraintWidget4.D() && zA3) {
                    d.Z(constraintWidget4, interfaceC0381b, new b.a());
                }
                if (constraintWidget4.f15962U[1] != dimensionBehaviour || zA3) {
                    if (!constraintWidget4.D() && constraintAnchor10 == (constraintAnchor = constraintWidget4.f15955N)) {
                        int iE5 = constraintAnchor10.e() + iD3;
                        if (constraintWidget4.f15946E) {
                            int i14 = iE5 - constraintWidget4.f15973c0;
                            int i15 = constraintWidget4.f15965X + i14;
                            constraintWidget4.f15971b0 = i14;
                            constraintWidget4.f15952K.l(i14);
                            constraintWidget4.f15954M.l(i15);
                            constraintAnchor.l(iE5);
                            constraintWidget4.f15989l = true;
                        }
                        g(i13, constraintWidget4, interfaceC0381b);
                    }
                }
            }
        }
        constraintWidget.f15993n = true;
    }
}
