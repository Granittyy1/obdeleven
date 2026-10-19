package androidx.constraintlayout.core.widgets;

import android.view.View;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import com.braze.support.BrazeLogger;
import io.intercom.android.sdk.models.carousel.BlockAlignment;
import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p005a4.q;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintWidget {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f15942A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float f15943B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int[] f15944C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public float f15945D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f15946E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f15947F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f15948G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f15949H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f15950I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final ConstraintAnchor f15951J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final ConstraintAnchor f15952K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final ConstraintAnchor f15953L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final ConstraintAnchor f15954M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final ConstraintAnchor f15955N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final ConstraintAnchor f15956O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final ConstraintAnchor f15957P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final ConstraintAnchor f15958Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final ConstraintAnchor[] f15959R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final ArrayList<ConstraintAnchor> f15960S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final boolean[] f15961T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public DimensionBehaviour[] f15962U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public ConstraintWidget f15963V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f15964W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public int f15965X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public float f15966Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public int f15967Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f15969a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p101i0.c f15970b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f15971b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p101i0.c f15972c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f15973c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f15975d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f15977e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public float f15979f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public float f15981g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public View f15983h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f15985i0;
    public String j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f15986j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f15987k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public String f15988k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f15989l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f15990l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f15991m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f15992m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f15993n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final float[] f15994n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15995o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final ConstraintWidget[] f15996o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f15997p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ConstraintWidget[] f15998p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f15999q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ConstraintWidget f16000q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f16001r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ConstraintWidget f16002r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f16003s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f16004s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int[] f16005t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f16006t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f16007u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f16008v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f16009w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f16010x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f16011y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f16012z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15968a = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.analyzer.c f15974d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.analyzer.d f15976e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f15978f = {true, true};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15980g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15982h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15984i = -1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class DimensionBehaviour {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final DimensionBehaviour f16013b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final DimensionBehaviour f16014c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final DimensionBehaviour f16015d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final DimensionBehaviour f16016e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ DimensionBehaviour[] f16017f;

        static {
            DimensionBehaviour dimensionBehaviour = new DimensionBehaviour("FIXED", 0);
            f16013b = dimensionBehaviour;
            DimensionBehaviour dimensionBehaviour2 = new DimensionBehaviour("WRAP_CONTENT", 1);
            f16014c = dimensionBehaviour2;
            DimensionBehaviour dimensionBehaviour3 = new DimensionBehaviour("MATCH_CONSTRAINT", 2);
            f16015d = dimensionBehaviour3;
            DimensionBehaviour dimensionBehaviour4 = new DimensionBehaviour("MATCH_PARENT", 3);
            f16016e = dimensionBehaviour4;
            f16017f = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour2, dimensionBehaviour3, dimensionBehaviour4};
        }

        public DimensionBehaviour() {
            throw null;
        }

        public static DimensionBehaviour valueOf(String str) {
            return (DimensionBehaviour) Enum.valueOf(DimensionBehaviour.class, str);
        }

        public static DimensionBehaviour[] values() {
            return (DimensionBehaviour[]) f16017f.clone();
        }
    }

    public ConstraintWidget() {
        new HashMap();
        this.f15987k = false;
        this.f15989l = false;
        this.f15991m = false;
        this.f15993n = false;
        this.f15995o = -1;
        this.f15997p = -1;
        this.f15999q = 0;
        this.f16001r = 0;
        this.f16003s = 0;
        this.f16005t = new int[2];
        this.f16007u = 0;
        this.f16008v = 0;
        this.f16009w = 1.0f;
        this.f16010x = 0;
        this.f16011y = 0;
        this.f16012z = 1.0f;
        this.f15942A = -1;
        this.f15943B = 1.0f;
        this.f15944C = new int[]{BrazeLogger.SUPPRESS, BrazeLogger.SUPPRESS};
        this.f15945D = Float.NaN;
        this.f15946E = false;
        this.f15948G = false;
        this.f15949H = 0;
        this.f15950I = 0;
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.f15934b);
        this.f15951J = constraintAnchor;
        ConstraintAnchor constraintAnchor2 = new ConstraintAnchor(this, ConstraintAnchor.Type.f15935c);
        this.f15952K = constraintAnchor2;
        ConstraintAnchor constraintAnchor3 = new ConstraintAnchor(this, ConstraintAnchor.Type.f15936d);
        this.f15953L = constraintAnchor3;
        ConstraintAnchor constraintAnchor4 = new ConstraintAnchor(this, ConstraintAnchor.Type.f15937e);
        this.f15954M = constraintAnchor4;
        ConstraintAnchor constraintAnchor5 = new ConstraintAnchor(this, ConstraintAnchor.Type.f15938f);
        this.f15955N = constraintAnchor5;
        ConstraintAnchor constraintAnchor6 = new ConstraintAnchor(this, ConstraintAnchor.Type.f15940h);
        this.f15956O = constraintAnchor6;
        ConstraintAnchor constraintAnchor7 = new ConstraintAnchor(this, ConstraintAnchor.Type.f15941i);
        this.f15957P = constraintAnchor7;
        ConstraintAnchor constraintAnchor8 = new ConstraintAnchor(this, ConstraintAnchor.Type.f15939g);
        this.f15958Q = constraintAnchor8;
        this.f15959R = new ConstraintAnchor[]{constraintAnchor, constraintAnchor3, constraintAnchor2, constraintAnchor4, constraintAnchor5, constraintAnchor8};
        ArrayList<ConstraintAnchor> arrayList = new ArrayList<>();
        this.f15960S = arrayList;
        this.f15961T = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.f16013b;
        this.f15962U = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.f15963V = null;
        this.f15964W = 0;
        this.f15965X = 0;
        this.f15966Y = 0.0f;
        this.f15967Z = -1;
        this.f15969a0 = 0;
        this.f15971b0 = 0;
        this.f15973c0 = 0;
        this.f15979f0 = 0.5f;
        this.f15981g0 = 0.5f;
        this.f15985i0 = 0;
        this.f15986j0 = false;
        this.f15988k0 = null;
        this.f15990l0 = 0;
        this.f15992m0 = 0;
        this.f15994n0 = new float[]{-1.0f, -1.0f};
        this.f15996o0 = new ConstraintWidget[]{null, null};
        this.f15998p0 = new ConstraintWidget[]{null, null};
        this.f16000q0 = null;
        this.f16002r0 = null;
        this.f16004s0 = -1;
        this.f16006t0 = -1;
        arrayList.add(constraintAnchor);
        arrayList.add(constraintAnchor2);
        arrayList.add(constraintAnchor3);
        arrayList.add(constraintAnchor4);
        arrayList.add(constraintAnchor6);
        arrayList.add(constraintAnchor7);
        arrayList.add(constraintAnchor8);
        arrayList.add(constraintAnchor5);
    }

    public static void K(int i10, int i11, String str, StringBuilder sb2) {
        if (i10 == i11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(i10);
        sb2.append(",\n");
    }

    public static void L(StringBuilder sb2, String str, float f10, float f11) {
        if (f10 == f11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(f10);
        sb2.append(",\n");
    }

    public static void s(StringBuilder sb2, String str, int i10, int i11, int i12, int i13, int i14, float f10, DimensionBehaviour dimensionBehaviour) {
        sb2.append(str);
        sb2.append(" :  {\n");
        String string = dimensionBehaviour.toString();
        if (!"FIXED".equals(string)) {
            sb2.append("      behavior");
            sb2.append(" :   ");
            sb2.append(string);
            sb2.append(",\n");
        }
        K(i10, 0, "      size", sb2);
        K(i11, 0, "      min", sb2);
        K(i12, BrazeLogger.SUPPRESS, "      max", sb2);
        K(i13, 0, "      matchMin", sb2);
        K(i14, 0, "      matchDef", sb2);
        L(sb2, "      matchPercent", f10, 1.0f);
        sb2.append("    },\n");
    }

    public static void t(StringBuilder sb2, String str, ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.f15930f == null) {
            return;
        }
        B6.c.f(sb2, "    ", str, " : [ '");
        sb2.append(constraintAnchor.f15930f);
        sb2.append("'");
        if (constraintAnchor.f15932h != Integer.MIN_VALUE || constraintAnchor.f15931g != 0) {
            sb2.append(",");
            sb2.append(constraintAnchor.f15931g);
            if (constraintAnchor.f15932h != Integer.MIN_VALUE) {
                sb2.append(",");
                sb2.append(constraintAnchor.f15932h);
                sb2.append(",");
            }
        }
        sb2.append(" ] ,\n");
    }

    public final boolean A(int i10) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        int i11 = i10 * 2;
        ConstraintAnchor[] constraintAnchorArr = this.f15959R;
        ConstraintAnchor constraintAnchor3 = constraintAnchorArr[i11];
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f15930f;
        return (constraintAnchor4 == null || constraintAnchor4.f15930f == constraintAnchor3 || (constraintAnchor2 = (constraintAnchor = constraintAnchorArr[i11 + 1]).f15930f) == null || constraintAnchor2.f15930f != constraintAnchor) ? false : true;
    }

    public final boolean B() {
        ConstraintAnchor constraintAnchor = this.f15951J;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f15930f;
        if (constraintAnchor2 != null && constraintAnchor2.f15930f == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.f15953L;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f15930f;
        return constraintAnchor4 != null && constraintAnchor4.f15930f == constraintAnchor3;
    }

    public final boolean C() {
        ConstraintAnchor constraintAnchor = this.f15952K;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f15930f;
        if (constraintAnchor2 != null && constraintAnchor2.f15930f == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.f15954M;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f15930f;
        return constraintAnchor4 != null && constraintAnchor4.f15930f == constraintAnchor3;
    }

    public final boolean D() {
        return this.f15980g && this.f15985i0 != 8;
    }

    public boolean E() {
        return this.f15987k || (this.f15951J.f15927c && this.f15953L.f15927c);
    }

    public boolean F() {
        return this.f15989l || (this.f15952K.f15927c && this.f15954M.f15927c);
    }

    public void G() {
        this.f15951J.j();
        this.f15952K.j();
        this.f15953L.j();
        this.f15954M.j();
        this.f15955N.j();
        this.f15956O.j();
        this.f15957P.j();
        this.f15958Q.j();
        this.f15963V = null;
        this.f15945D = Float.NaN;
        this.f15964W = 0;
        this.f15965X = 0;
        this.f15966Y = 0.0f;
        this.f15967Z = -1;
        this.f15969a0 = 0;
        this.f15971b0 = 0;
        this.f15973c0 = 0;
        this.f15975d0 = 0;
        this.f15977e0 = 0;
        this.f15979f0 = 0.5f;
        this.f15981g0 = 0.5f;
        DimensionBehaviour[] dimensionBehaviourArr = this.f15962U;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.f16013b;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        this.f15983h0 = null;
        this.f15985i0 = 0;
        this.f15990l0 = 0;
        this.f15992m0 = 0;
        float[] fArr = this.f15994n0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f15995o = -1;
        this.f15997p = -1;
        int[] iArr = this.f15944C;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f16001r = 0;
        this.f16003s = 0;
        this.f16009w = 1.0f;
        this.f16012z = 1.0f;
        this.f16008v = BrazeLogger.SUPPRESS;
        this.f16011y = BrazeLogger.SUPPRESS;
        this.f16007u = 0;
        this.f16010x = 0;
        this.f15942A = -1;
        this.f15943B = 1.0f;
        boolean[] zArr = this.f15978f;
        zArr[0] = true;
        zArr[1] = true;
        this.f15948G = false;
        boolean[] zArr2 = this.f15961T;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f15980g = true;
        int[] iArr2 = this.f16005t;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f15982h = -1;
        this.f15984i = -1;
    }

    public final void H() {
        ConstraintWidget constraintWidget = this.f15963V;
        if (constraintWidget != null && (constraintWidget instanceof d)) {
            ((d) constraintWidget).getClass();
        }
        ArrayList<ConstraintAnchor> arrayList = this.f15960S;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).j();
        }
    }

    public final void I() {
        this.f15987k = false;
        this.f15989l = false;
        this.f15991m = false;
        this.f15993n = false;
        ArrayList<ConstraintAnchor> arrayList = this.f15960S;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ConstraintAnchor constraintAnchor = arrayList.get(i10);
            constraintAnchor.f15927c = false;
            constraintAnchor.f15926b = 0;
        }
    }

    public void J(p064f0.a aVar) {
        this.f15951J.k();
        this.f15952K.k();
        this.f15953L.k();
        this.f15954M.k();
        this.f15955N.k();
        this.f15958Q.k();
        this.f15956O.k();
        this.f15957P.k();
    }

    public final void M(int i10) {
        this.f15973c0 = i10;
        this.f15946E = i10 > 0;
    }

    public final void N(int i10, int i11) {
        if (this.f15987k) {
            return;
        }
        this.f15951J.l(i10);
        this.f15953L.l(i11);
        this.f15969a0 = i10;
        this.f15964W = i11 - i10;
        this.f15987k = true;
    }

    public final void O(int i10, int i11) {
        if (this.f15989l) {
            return;
        }
        this.f15952K.l(i10);
        this.f15954M.l(i11);
        this.f15971b0 = i10;
        this.f15965X = i11 - i10;
        if (this.f15946E) {
            this.f15955N.l(i10 + this.f15973c0);
        }
        this.f15989l = true;
    }

    public final void P(int i10) {
        this.f15965X = i10;
        int i11 = this.f15977e0;
        if (i10 < i11) {
            this.f15965X = i11;
        }
    }

    public final void Q(DimensionBehaviour dimensionBehaviour) {
        this.f15962U[0] = dimensionBehaviour;
    }

    public final void R(DimensionBehaviour dimensionBehaviour) {
        this.f15962U[1] = dimensionBehaviour;
    }

    public final void S(int i10) {
        this.f15964W = i10;
        int i11 = this.f15975d0;
        if (i10 < i11) {
            this.f15964W = i11;
        }
    }

    public void T(boolean z10, boolean z11) {
        int i10;
        int i11;
        androidx.constraintlayout.core.widgets.analyzer.c cVar = this.f15974d;
        boolean z12 = z10 & cVar.f16047g;
        androidx.constraintlayout.core.widgets.analyzer.d dVar = this.f15976e;
        boolean z13 = z11 & dVar.f16047g;
        int i12 = cVar.f16048h.f16028g;
        int i13 = dVar.f16048h.f16028g;
        int i14 = cVar.f16049i.f16028g;
        int i15 = dVar.f16049i.f16028g;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i15 = 0;
            i12 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (z12) {
            this.f15969a0 = i12;
        }
        if (z13) {
            this.f15971b0 = i13;
        }
        if (this.f15985i0 == 8) {
            this.f15964W = 0;
            this.f15965X = 0;
            return;
        }
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.f16013b;
        if (z12) {
            if (this.f15962U[0] == dimensionBehaviour && i17 < (i11 = this.f15964W)) {
                i17 = i11;
            }
            this.f15964W = i17;
            int i19 = this.f15975d0;
            if (i17 < i19) {
                this.f15964W = i19;
            }
        }
        if (z13) {
            if (this.f15962U[1] == dimensionBehaviour && i18 < (i10 = this.f15965X)) {
                i18 = i10;
            }
            this.f15965X = i18;
            int i20 = this.f15977e0;
            if (i18 < i20) {
                this.f15965X = i20;
            }
        }
    }

    public void U(androidx.constraintlayout.core.c cVar, boolean z10) {
        int i10;
        int i11;
        androidx.constraintlayout.core.widgets.analyzer.d dVar;
        androidx.constraintlayout.core.widgets.analyzer.c cVar2;
        ConstraintAnchor constraintAnchor = this.f15951J;
        cVar.getClass();
        int iN = androidx.constraintlayout.core.c.n(constraintAnchor);
        int iN2 = androidx.constraintlayout.core.c.n(this.f15952K);
        int iN3 = androidx.constraintlayout.core.c.n(this.f15953L);
        int iN4 = androidx.constraintlayout.core.c.n(this.f15954M);
        if (z10 && (cVar2 = this.f15974d) != null) {
            DependencyNode dependencyNode = cVar2.f16048h;
            if (dependencyNode.j) {
                DependencyNode dependencyNode2 = cVar2.f16049i;
                if (dependencyNode2.j) {
                    iN = dependencyNode.f16028g;
                    iN3 = dependencyNode2.f16028g;
                }
            }
        }
        if (z10 && (dVar = this.f15976e) != null) {
            DependencyNode dependencyNode3 = dVar.f16048h;
            if (dependencyNode3.j) {
                DependencyNode dependencyNode4 = dVar.f16049i;
                if (dependencyNode4.j) {
                    iN2 = dependencyNode3.f16028g;
                    iN4 = dependencyNode4.f16028g;
                }
            }
        }
        int i12 = iN4 - iN2;
        if (iN3 - iN < 0 || i12 < 0 || iN == Integer.MIN_VALUE || iN == Integer.MAX_VALUE || iN2 == Integer.MIN_VALUE || iN2 == Integer.MAX_VALUE || iN3 == Integer.MIN_VALUE || iN3 == Integer.MAX_VALUE || iN4 == Integer.MIN_VALUE || iN4 == Integer.MAX_VALUE) {
            iN = 0;
            iN2 = 0;
            iN3 = 0;
            iN4 = 0;
        }
        int i13 = iN3 - iN;
        int i14 = iN4 - iN2;
        this.f15969a0 = iN;
        this.f15971b0 = iN2;
        if (this.f15985i0 == 8) {
            this.f15964W = 0;
            this.f15965X = 0;
            return;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.f15962U;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.f16013b;
        if (dimensionBehaviour == dimensionBehaviour2 && i13 < (i11 = this.f15964W)) {
            i13 = i11;
        }
        if (dimensionBehaviourArr[1] == dimensionBehaviour2 && i14 < (i10 = this.f15965X)) {
            i14 = i10;
        }
        this.f15964W = i13;
        this.f15965X = i14;
        int i15 = this.f15977e0;
        if (i14 < i15) {
            this.f15965X = i15;
        }
        int i16 = this.f15975d0;
        if (i13 < i16) {
            this.f15964W = i16;
        }
        int i17 = this.f16008v;
        DimensionBehaviour dimensionBehaviour3 = DimensionBehaviour.f16015d;
        if (i17 > 0 && dimensionBehaviour == dimensionBehaviour3) {
            this.f15964W = Math.min(this.f15964W, i17);
        }
        int i18 = this.f16011y;
        if (i18 > 0 && this.f15962U[1] == dimensionBehaviour3) {
            this.f15965X = Math.min(this.f15965X, i18);
        }
        int i19 = this.f15964W;
        if (i13 != i19) {
            this.f15982h = i19;
        }
        int i20 = this.f15965X;
        if (i14 != i20) {
            this.f15984i = i20;
        }
    }

    public final void d(d dVar, androidx.constraintlayout.core.c cVar, HashSet<ConstraintWidget> hashSet, int i10, boolean z10) {
        if (z10) {
            if (!hashSet.contains(this)) {
                return;
            }
            g.a(dVar, cVar, this);
            hashSet.remove(this);
            e(cVar, dVar.a0(64));
        }
        if (i10 == 0) {
            HashSet<ConstraintAnchor> hashSet2 = this.f15951J.f15925a;
            if (hashSet2 != null) {
                Iterator<ConstraintAnchor> it = hashSet2.iterator();
                while (it.hasNext()) {
                    it.next().f15928d.d(dVar, cVar, hashSet, i10, true);
                }
            }
            HashSet<ConstraintAnchor> hashSet3 = this.f15953L.f15925a;
            if (hashSet3 != null) {
                Iterator<ConstraintAnchor> it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    it2.next().f15928d.d(dVar, cVar, hashSet, i10, true);
                }
                return;
            }
            return;
        }
        HashSet<ConstraintAnchor> hashSet4 = this.f15952K.f15925a;
        if (hashSet4 != null) {
            Iterator<ConstraintAnchor> it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                it3.next().f15928d.d(dVar, cVar, hashSet, i10, true);
            }
        }
        HashSet<ConstraintAnchor> hashSet5 = this.f15954M.f15925a;
        if (hashSet5 != null) {
            Iterator<ConstraintAnchor> it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                it4.next().f15928d.d(dVar, cVar, hashSet, i10, true);
            }
        }
        HashSet<ConstraintAnchor> hashSet6 = this.f15955N.f15925a;
        if (hashSet6 != null) {
            Iterator<ConstraintAnchor> it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                it5.next().f15928d.d(dVar, cVar, hashSet, i10, true);
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 20131. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public void e(androidx.constraintlayout.core.c r60, boolean r61) {
        /*
            Method dump skipped, instruction units count: 2013
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.e(androidx.constraintlayout.core.c, boolean):void");
    }

    public boolean f() {
        return this.f15985i0 != 8;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:107:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:112:0x01c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x01c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:122:0x01e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x01e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:129:0x020e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0215 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:220:0x03d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:223:0x03df  */
    /* JADX WARN: Code duplicated, block: B:225:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:226:0x03e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:231:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:234:0x042d  */
    /* JADX WARN: Code duplicated, block: B:237:0x0449  */
    /* JADX WARN: Code duplicated, block: B:246:0x045c  */
    /* JADX WARN: Code duplicated, block: B:247:0x045e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:254:0x046d  */
    /* JADX WARN: Code duplicated, block: B:256:0x0485  */
    /* JADX WARN: Code duplicated, block: B:258:0x048b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:265:0x049d  */
    /* JADX WARN: Code duplicated, block: B:267:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:268:0x04a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:271:0x04ab A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:274:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:277:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:279:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:282:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:284:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:286:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:290:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:292:0x04d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:298:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:300:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:301:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:303:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:305:0x0501  */
    /* JADX WARN: Code duplicated, block: B:307:0x0505 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:318:0x0529 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:326:0x053b  */
    /* JADX WARN: Code duplicated, block: B:347:0x057d  */
    /* JADX WARN: Code duplicated, block: B:356:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    public final void g(androidx.constraintlayout.core.c cVar, boolean z10, boolean z11, boolean z12, boolean z13, SolverVariable solverVariable, SolverVariable solverVariable2, DimensionBehaviour dimensionBehaviour, boolean z14, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i10, int i11, int i12, int i13, float f10, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i14, int i15, int i16, int i17, float f11, boolean z20) {
        int iMin;
        int i18;
        int i19;
        SolverVariable solverVariableK;
        SolverVariable solverVariableK2;
        int i20;
        int i21;
        int i22;
        char c10;
        ConstraintAnchor constraintAnchor3;
        int i23;
        SolverVariable solverVariable3;
        int i24;
        boolean z21;
        int i25;
        char c11;
        int i26;
        boolean z22;
        boolean z23;
        boolean z24;
        int i27;
        boolean z25;
        int i28;
        boolean z26;
        boolean z27;
        boolean z28;
        SolverVariable solverVariable4;
        int iMax;
        int i29;
        int i30;
        int iE;
        int iE2;
        int iMin2;
        int i31;
        int i32;
        HashSet<ConstraintAnchor> hashSet;
        int i33;
        int i34;
        boolean z29;
        boolean z30;
        int i35;
        int i36;
        int i37 = i16;
        int i38 = i17;
        SolverVariable solverVariableK3 = cVar.k(constraintAnchor);
        SolverVariable solverVariableK4 = cVar.k(constraintAnchor2);
        SolverVariable solverVariableK5 = cVar.k(constraintAnchor.f15930f);
        SolverVariable solverVariableK6 = cVar.k(constraintAnchor2.f15930f);
        boolean zH = constraintAnchor.h();
        boolean zH2 = constraintAnchor2.h();
        boolean zH3 = this.f15958Q.h();
        int i39 = zH2 ? (zH ? 1 : 0) + 1 : zH ? 1 : 0;
        if (zH3) {
            i39++;
        }
        int i40 = i39;
        int i41 = z15 ? 3 : i14;
        int iOrdinal = dimensionBehaviour.ordinal();
        boolean z31 = (iOrdinal == 0 || iOrdinal == 1 || iOrdinal != 2 || i41 == 4) ? false : true;
        int i42 = this.f15982h;
        boolean z32 = z31;
        if (i42 != -1 && z10) {
            this.f15982h = -1;
            i11 = i42;
            z32 = false;
        }
        int i43 = this.f15984i;
        if (i43 == -1 || z10) {
            i43 = i11;
        } else {
            this.f15984i = -1;
            z32 = false;
        }
        int i44 = i43;
        if (this.f15985i0 == 8) {
            iMin = 0;
            z32 = false;
        } else {
            iMin = i44;
        }
        if (z20) {
            if (!zH && !zH2 && !zH3) {
                cVar.d(solverVariableK3, i10);
            } else if (zH && !zH2) {
                i18 = 8;
                cVar.e(solverVariableK3, solverVariableK5, constraintAnchor.e(), 8);
            }
            i18 = 8;
        } else {
            i18 = 8;
        }
        if (z32) {
            if (i40 == 2 || z15 || !(i41 == 1 || i41 == 0)) {
                if (i37 == -2) {
                    i37 = iMin;
                }
                if (i38 == -2) {
                    i38 = iMin;
                }
                if (iMin > 0 && i41 != 1) {
                    iMin = 0;
                }
                if (i37 > 0) {
                    cVar.f(solverVariableK4, solverVariableK3, i37, 8);
                    iMin = Math.max(iMin, i37);
                }
                if (i38 > 0) {
                    if (!z11 || i41 != 1) {
                        cVar.g(solverVariableK4, solverVariableK3, i38, 8);
                    }
                    iMin = Math.min(iMin, i38);
                }
                if (i41 == 1) {
                    if (z11) {
                        cVar.e(solverVariableK4, solverVariableK3, iMin, 8);
                    } else if (z17) {
                        cVar.e(solverVariableK4, solverVariableK3, iMin, 5);
                        cVar.g(solverVariableK4, solverVariableK3, iMin, 8);
                    } else {
                        cVar.e(solverVariableK4, solverVariableK3, iMin, 5);
                        cVar.g(solverVariableK4, solverVariableK3, iMin, 8);
                    }
                } else if (i41 == 2) {
                    ConstraintAnchor.Type type = ConstraintAnchor.Type.f15935c;
                    ConstraintAnchor.Type type2 = ConstraintAnchor.Type.f15937e;
                    ConstraintAnchor.Type type3 = constraintAnchor.f15929e;
                    if (type3 == type || type3 == type2) {
                        solverVariableK = cVar.k(this.f15963V.m(type));
                        solverVariableK2 = cVar.k(this.f15963V.m(type2));
                    } else {
                        solverVariableK = cVar.k(this.f15963V.m(ConstraintAnchor.Type.f15934b));
                        solverVariableK2 = cVar.k(this.f15963V.m(ConstraintAnchor.Type.f15936d));
                    }
                    androidx.constraintlayout.core.b bVarL = cVar.l();
                    bVarL.f15901d.d(solverVariableK4, -1.0f);
                    bVarL.f15901d.d(solverVariableK3, 1.0f);
                    bVarL.f15901d.d(solverVariableK2, f11);
                    bVarL.f15901d.d(solverVariableK, -f11);
                    cVar.c(bVarL);
                    if (z11) {
                        z32 = false;
                    }
                    i19 = i37;
                } else {
                    i40 = i40 == true ? 1 : 0;
                    i19 = i37;
                    z13 = true;
                }
            } else {
                int iMax2 = Math.max(i37, iMin);
                if (i38 > 0) {
                    iMax2 = Math.min(i38, iMax2);
                }
                cVar.e(solverVariableK4, solverVariableK3, iMax2, 8);
                z13 = z13;
                i40 = i40 == true ? 1 : 0;
                i19 = i37;
                z32 = false;
            }
            if (z20) {
                i20 = 8;
                i21 = 0;
                i22 = 1;
                c10 = 2;
            } else {
                if (z17) {
                    if (!zH || zH2 || zH3) {
                        if (zH || zH2) {
                            if (!zH || !zH2) {
                                i23 = 0;
                                if (zH || !zH2) {
                                    solverVariable3 = solverVariableK6;
                                    i24 = 5;
                                } else {
                                    ConstraintWidget constraintWidget = constraintAnchor.f15930f.f15928d;
                                    constraintAnchor2 = constraintAnchor2;
                                    ConstraintWidget constraintWidget2 = constraintAnchor2.f15930f.f15928d;
                                    ConstraintWidget constraintWidget3 = this.f15963V;
                                    int i45 = 6;
                                    if (z32) {
                                        if (i41 == 0) {
                                            if (i38 != 0 || i19 != 0) {
                                                z29 = true;
                                                z30 = false;
                                                z22 = true;
                                                i35 = 5;
                                                i36 = 5;
                                            } else if (solverVariableK5.f15878g && solverVariableK6.f15878g) {
                                                cVar.e(solverVariableK3, solverVariableK5, constraintAnchor.e(), 8);
                                                cVar.e(solverVariableK4, solverVariableK6, -constraintAnchor2.e(), 8);
                                                return;
                                            } else {
                                                i35 = 8;
                                                i36 = 8;
                                                z29 = false;
                                                z30 = true;
                                                z22 = false;
                                            }
                                            if ((constraintWidget instanceof a) || (constraintWidget2 instanceof a)) {
                                                i45 = 6;
                                                z24 = z30;
                                                i26 = i35;
                                                c11 = 5;
                                                z21 = true;
                                                i27 = 4;
                                                i41 = i41;
                                                z23 = z29;
                                                i25 = 8;
                                            } else {
                                                i45 = 6;
                                                i26 = i35;
                                                i27 = i36;
                                                c11 = 5;
                                                z21 = true;
                                                z23 = z29;
                                                z24 = z30;
                                                i25 = 8;
                                                i41 = i41;
                                            }
                                        } else {
                                            i25 = 8;
                                            if (i41 == 2) {
                                                if ((constraintWidget instanceof a) || (constraintWidget2 instanceof a)) {
                                                    c11 = 5;
                                                    z21 = true;
                                                    z22 = true;
                                                    z23 = true;
                                                    z24 = false;
                                                    i27 = 4;
                                                } else {
                                                    c11 = 5;
                                                    z21 = true;
                                                    z22 = true;
                                                    z23 = true;
                                                    z24 = false;
                                                    i27 = 5;
                                                }
                                                i26 = 5;
                                            } else if (i41 == 1) {
                                                i41 = i41;
                                                i45 = 6;
                                                i26 = 8;
                                                c11 = 5;
                                                z21 = true;
                                                z22 = true;
                                                z23 = true;
                                                z24 = false;
                                                i27 = 4;
                                            } else {
                                                if (i41 == 3) {
                                                    i41 = i41;
                                                    if (this.f15942A == -1) {
                                                        if (z18) {
                                                            solverVariable2 = solverVariable2;
                                                            i26 = 8;
                                                            c11 = 5;
                                                            z21 = true;
                                                            z22 = true;
                                                            z23 = true;
                                                            z24 = true;
                                                            i45 = z11 ? 5 : 4;
                                                        } else {
                                                            solverVariable2 = solverVariable2;
                                                            i45 = 8;
                                                            i26 = 8;
                                                            c11 = 5;
                                                            z21 = true;
                                                            z22 = true;
                                                            z23 = true;
                                                            z24 = true;
                                                        }
                                                        i27 = 5;
                                                    } else if (z15) {
                                                        if (i15 != 2) {
                                                            z21 = true;
                                                            if (i15 != 1) {
                                                                i33 = 8;
                                                                i34 = 5;
                                                            }
                                                            i26 = i33;
                                                            i27 = i34;
                                                            z22 = z21;
                                                            z23 = z22;
                                                            z24 = z23;
                                                            i45 = 6;
                                                            c11 = 5;
                                                        } else {
                                                            z21 = true;
                                                        }
                                                        i33 = 5;
                                                        i34 = 4;
                                                        i26 = i33;
                                                        i27 = i34;
                                                        z22 = z21;
                                                        z23 = z22;
                                                        z24 = z23;
                                                        i45 = 6;
                                                        c11 = 5;
                                                    } else {
                                                        z21 = true;
                                                        if (i38 > 0) {
                                                            solverVariable2 = solverVariable2;
                                                            z22 = true;
                                                            z23 = true;
                                                            z24 = true;
                                                            i45 = 6;
                                                            c11 = 5;
                                                            i27 = 5;
                                                        } else if (i38 != 0 || i19 != 0) {
                                                            z22 = true;
                                                            z23 = true;
                                                            z24 = true;
                                                            c11 = 5;
                                                        } else if (z18) {
                                                            i26 = (constraintWidget == constraintWidget3 || constraintWidget2 == constraintWidget3) ? 5 : 4;
                                                            z22 = true;
                                                            z23 = true;
                                                            z24 = true;
                                                            c11 = 5;
                                                        } else {
                                                            solverVariable2 = solverVariable2;
                                                            z22 = true;
                                                            z23 = true;
                                                            z24 = true;
                                                            i45 = 6;
                                                            i27 = 8;
                                                            c11 = 5;
                                                        }
                                                        i26 = 5;
                                                    }
                                                    if (z22 || solverVariableK5 != solverVariableK6 || constraintWidget == constraintWidget3) {
                                                        z25 = z21;
                                                    } else {
                                                        z22 = false;
                                                        z25 = false;
                                                    }
                                                    if (z23) {
                                                        if (z32 && !z16 && !z18 && solverVariableK5 == solverVariable && solverVariableK6 == solverVariable2) {
                                                            i45 = i25;
                                                            i26 = i45;
                                                            z27 = false;
                                                            z25 = false;
                                                        } else {
                                                            z27 = z11;
                                                        }
                                                        z26 = true;
                                                        i28 = 4;
                                                        cVar.b(solverVariableK3, solverVariableK5, constraintAnchor.e(), f10, solverVariableK6, solverVariableK4, constraintAnchor2.e(), i45);
                                                    } else {
                                                        i28 = 4;
                                                        z26 = z21;
                                                        z27 = z11;
                                                    }
                                                    z28 = z25;
                                                    if (this.f15985i0 != i25 && ((hashSet = constraintAnchor2.f15925a) == null || hashSet.size() <= 0)) {
                                                        return;
                                                    }
                                                    solverVariable3 = solverVariableK6;
                                                    if (z22) {
                                                        if (z27 || solverVariableK5 == solverVariable3 || z32 || !((constraintWidget instanceof a) || (constraintWidget2 instanceof a))) {
                                                            i32 = i26;
                                                        } else {
                                                            i32 = 6;
                                                        }
                                                        solverVariable4 = solverVariableK3;
                                                        cVar.f(solverVariable4, solverVariableK5, constraintAnchor.e(), i32);
                                                        solverVariableK4 = solverVariableK4;
                                                        cVar.g(solverVariableK4, solverVariable3, -constraintAnchor2.e(), i32);
                                                        i26 = i32;
                                                    } else {
                                                        solverVariableK4 = solverVariableK4;
                                                        solverVariable4 = solverVariableK3;
                                                    }
                                                    if (z27 || !z19 || (constraintWidget instanceof a) || (constraintWidget2 instanceof a) || constraintWidget2 == constraintWidget3) {
                                                        iMax = i27;
                                                        i29 = i26;
                                                    } else {
                                                        iMax = 6;
                                                        i29 = 6;
                                                        z28 = z26;
                                                    }
                                                    if (z28) {
                                                        if (z24 && (!z18 || z12)) {
                                                            if (constraintWidget != constraintWidget3 || constraintWidget2 == constraintWidget3) {
                                                                i31 = 6;
                                                            } else {
                                                                i31 = iMax;
                                                            }
                                                            if ((constraintWidget instanceof f) || (constraintWidget2 instanceof f)) {
                                                                i31 = 5;
                                                            }
                                                            if ((constraintWidget instanceof a) || (constraintWidget2 instanceof a)) {
                                                                i31 = 5;
                                                            }
                                                            if (z18) {
                                                                i31 = 5;
                                                            }
                                                            iMax = Math.max(i31, iMax);
                                                        }
                                                        iMin2 = iMax;
                                                        if (z27) {
                                                            iMin2 = Math.min(i29, iMin2);
                                                            if (z15 && !z18 && (constraintWidget == constraintWidget3 || constraintWidget2 == constraintWidget3)) {
                                                                iMin2 = i28;
                                                            }
                                                        }
                                                        cVar.e(solverVariable4, solverVariableK5, constraintAnchor.e(), iMin2);
                                                        cVar.e(solverVariableK4, solverVariable3, -constraintAnchor2.e(), iMin2);
                                                    }
                                                    if (z27) {
                                                        i30 = i25;
                                                        if (solverVariable == solverVariableK5) {
                                                            iE2 = constraintAnchor.e();
                                                        } else {
                                                            iE2 = 0;
                                                        }
                                                        if (solverVariableK5 != solverVariable) {
                                                            i24 = 5;
                                                            cVar.f(solverVariable4, solverVariable, iE2, 5);
                                                        }
                                                        if (!z27 && z32 && i12 == 0 && i19 == 0) {
                                                            if (z32 && i41 == 3) {
                                                                iE = 0;
                                                                cVar.f(solverVariableK4, solverVariable4, 0, i30);
                                                            } else {
                                                                iE = 0;
                                                                cVar.f(solverVariableK4, solverVariable4, 0, i24);
                                                            }
                                                        }
                                                    } else {
                                                        i30 = i25;
                                                    }
                                                    i24 = 5;
                                                    if (!z27) {
                                                    }
                                                } else {
                                                    i41 = i41;
                                                    z21 = true;
                                                    c11 = 5;
                                                    z22 = false;
                                                    z23 = false;
                                                    z24 = false;
                                                }
                                                i27 = 4;
                                                i26 = 5;
                                                if (z22) {
                                                    z25 = z21;
                                                } else {
                                                    z25 = z21;
                                                }
                                                if (z23) {
                                                    if (z32) {
                                                        z27 = z11;
                                                    } else {
                                                        z27 = z11;
                                                    }
                                                    z26 = true;
                                                    i28 = 4;
                                                    cVar.b(solverVariableK3, solverVariableK5, constraintAnchor.e(), f10, solverVariableK6, solverVariableK4, constraintAnchor2.e(), i45);
                                                } else {
                                                    i28 = 4;
                                                    z26 = z21;
                                                    z27 = z11;
                                                }
                                                z28 = z25;
                                                if (this.f15985i0 != i25) {
                                                }
                                                solverVariable3 = solverVariableK6;
                                                if (z22) {
                                                    if (z27) {
                                                        i32 = i26;
                                                    } else {
                                                        i32 = i26;
                                                    }
                                                    solverVariable4 = solverVariableK3;
                                                    cVar.f(solverVariable4, solverVariableK5, constraintAnchor.e(), i32);
                                                    solverVariableK4 = solverVariableK4;
                                                    cVar.g(solverVariableK4, solverVariable3, -constraintAnchor2.e(), i32);
                                                    i26 = i32;
                                                } else {
                                                    solverVariableK4 = solverVariableK4;
                                                    solverVariable4 = solverVariableK3;
                                                }
                                                if (z27) {
                                                    iMax = i27;
                                                    i29 = i26;
                                                } else {
                                                    iMax = i27;
                                                    i29 = i26;
                                                }
                                                if (z28) {
                                                    if (z24) {
                                                        if (constraintWidget != constraintWidget3) {
                                                            i31 = 6;
                                                        } else {
                                                            i31 = 6;
                                                        }
                                                        if (constraintWidget instanceof f) {
                                                            i31 = 5;
                                                        } else {
                                                            i31 = 5;
                                                        }
                                                        if (constraintWidget instanceof a) {
                                                            i31 = 5;
                                                        } else {
                                                            i31 = 5;
                                                        }
                                                        if (z18) {
                                                            i31 = 5;
                                                        }
                                                        iMax = Math.max(i31, iMax);
                                                    }
                                                    iMin2 = iMax;
                                                    if (z27) {
                                                        iMin2 = Math.min(i29, iMin2);
                                                        if (z15) {
                                                            iMin2 = i28;
                                                        }
                                                    }
                                                    cVar.e(solverVariable4, solverVariableK5, constraintAnchor.e(), iMin2);
                                                    cVar.e(solverVariableK4, solverVariable3, -constraintAnchor2.e(), iMin2);
                                                }
                                                if (z27) {
                                                    i30 = i25;
                                                    if (solverVariable == solverVariableK5) {
                                                        iE2 = constraintAnchor.e();
                                                    } else {
                                                        iE2 = 0;
                                                    }
                                                    if (solverVariableK5 != solverVariable) {
                                                        i24 = 5;
                                                        cVar.f(solverVariable4, solverVariable, iE2, 5);
                                                    }
                                                    if (!z27) {
                                                    }
                                                } else {
                                                    i30 = i25;
                                                }
                                                i24 = 5;
                                                if (!z27) {
                                                }
                                            }
                                        }
                                        solverVariable2 = solverVariable2;
                                        if (z22) {
                                            z25 = z21;
                                        } else {
                                            z25 = z21;
                                        }
                                        if (z23) {
                                            if (z32) {
                                                z27 = z11;
                                            } else {
                                                z27 = z11;
                                            }
                                            z26 = true;
                                            i28 = 4;
                                            cVar.b(solverVariableK3, solverVariableK5, constraintAnchor.e(), f10, solverVariableK6, solverVariableK4, constraintAnchor2.e(), i45);
                                        } else {
                                            i28 = 4;
                                            z26 = z21;
                                            z27 = z11;
                                        }
                                        z28 = z25;
                                        if (this.f15985i0 != i25) {
                                        }
                                        solverVariable3 = solverVariableK6;
                                        if (z22) {
                                            if (z27) {
                                                i32 = i26;
                                            } else {
                                                i32 = i26;
                                            }
                                            solverVariable4 = solverVariableK3;
                                            cVar.f(solverVariable4, solverVariableK5, constraintAnchor.e(), i32);
                                            solverVariableK4 = solverVariableK4;
                                            cVar.g(solverVariableK4, solverVariable3, -constraintAnchor2.e(), i32);
                                            i26 = i32;
                                        } else {
                                            solverVariableK4 = solverVariableK4;
                                            solverVariable4 = solverVariableK3;
                                        }
                                        if (z27) {
                                            iMax = i27;
                                            i29 = i26;
                                        } else {
                                            iMax = i27;
                                            i29 = i26;
                                        }
                                        if (z28) {
                                            if (z24) {
                                                if (constraintWidget != constraintWidget3) {
                                                    i31 = 6;
                                                } else {
                                                    i31 = 6;
                                                }
                                                if (constraintWidget instanceof f) {
                                                    i31 = 5;
                                                } else {
                                                    i31 = 5;
                                                }
                                                if (constraintWidget instanceof a) {
                                                    i31 = 5;
                                                } else {
                                                    i31 = 5;
                                                }
                                                if (z18) {
                                                    i31 = 5;
                                                }
                                                iMax = Math.max(i31, iMax);
                                            }
                                            iMin2 = iMax;
                                            if (z27) {
                                                iMin2 = Math.min(i29, iMin2);
                                                if (z15) {
                                                    iMin2 = i28;
                                                }
                                            }
                                            cVar.e(solverVariable4, solverVariableK5, constraintAnchor.e(), iMin2);
                                            cVar.e(solverVariableK4, solverVariable3, -constraintAnchor2.e(), iMin2);
                                        }
                                        if (z27) {
                                            i30 = i25;
                                            if (solverVariable == solverVariableK5) {
                                                iE2 = constraintAnchor.e();
                                            } else {
                                                iE2 = 0;
                                            }
                                            if (solverVariableK5 != solverVariable) {
                                                i24 = 5;
                                                cVar.f(solverVariable4, solverVariable, iE2, 5);
                                            }
                                            if (!z27) {
                                            }
                                        } else {
                                            i30 = i25;
                                        }
                                        i24 = 5;
                                        if (!z27) {
                                        }
                                    } else {
                                        i41 = i41;
                                        z21 = true;
                                        i25 = 8;
                                        if (solverVariableK5.f15878g && solverVariableK6.f15878g) {
                                            cVar.b(solverVariableK3, solverVariableK5, constraintAnchor.e(), f10, solverVariableK6, solverVariableK4, constraintAnchor2.e(), 8);
                                            if (z11 && z13) {
                                                int iE3 = constraintAnchor2.f15930f != null ? constraintAnchor2.e() : 0;
                                                if (solverVariableK6 != solverVariable2) {
                                                    cVar.f(solverVariable2, solverVariableK4, iE3, 5);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        c11 = 5;
                                        i26 = 5;
                                        z22 = true;
                                        z23 = true;
                                        z24 = false;
                                    }
                                    i27 = 4;
                                    if (z22) {
                                        z25 = z21;
                                    } else {
                                        z25 = z21;
                                    }
                                    if (z23) {
                                        if (z32) {
                                            z27 = z11;
                                        } else {
                                            z27 = z11;
                                        }
                                        z26 = true;
                                        i28 = 4;
                                        cVar.b(solverVariableK3, solverVariableK5, constraintAnchor.e(), f10, solverVariableK6, solverVariableK4, constraintAnchor2.e(), i45);
                                    } else {
                                        i28 = 4;
                                        z26 = z21;
                                        z27 = z11;
                                    }
                                    z28 = z25;
                                    if (this.f15985i0 != i25) {
                                    }
                                    solverVariable3 = solverVariableK6;
                                    if (z22) {
                                        if (z27) {
                                            i32 = i26;
                                        } else {
                                            i32 = i26;
                                        }
                                        solverVariable4 = solverVariableK3;
                                        cVar.f(solverVariable4, solverVariableK5, constraintAnchor.e(), i32);
                                        solverVariableK4 = solverVariableK4;
                                        cVar.g(solverVariableK4, solverVariable3, -constraintAnchor2.e(), i32);
                                        i26 = i32;
                                    } else {
                                        solverVariableK4 = solverVariableK4;
                                        solverVariable4 = solverVariableK3;
                                    }
                                    if (z27) {
                                        iMax = i27;
                                        i29 = i26;
                                    } else {
                                        iMax = i27;
                                        i29 = i26;
                                    }
                                    if (z28) {
                                        if (z24) {
                                            if (constraintWidget != constraintWidget3) {
                                                i31 = 6;
                                            } else {
                                                i31 = 6;
                                            }
                                            if (constraintWidget instanceof f) {
                                                i31 = 5;
                                            } else {
                                                i31 = 5;
                                            }
                                            if (constraintWidget instanceof a) {
                                                i31 = 5;
                                            } else {
                                                i31 = 5;
                                            }
                                            if (z18) {
                                                i31 = 5;
                                            }
                                            iMax = Math.max(i31, iMax);
                                        }
                                        iMin2 = iMax;
                                        if (z27) {
                                            iMin2 = Math.min(i29, iMin2);
                                            if (z15) {
                                                iMin2 = i28;
                                            }
                                        }
                                        cVar.e(solverVariable4, solverVariableK5, constraintAnchor.e(), iMin2);
                                        cVar.e(solverVariableK4, solverVariable3, -constraintAnchor2.e(), iMin2);
                                    }
                                    if (z27) {
                                        i30 = i25;
                                        if (solverVariable == solverVariableK5) {
                                            iE2 = constraintAnchor.e();
                                        } else {
                                            iE2 = 0;
                                        }
                                        if (solverVariableK5 != solverVariable) {
                                            i24 = 5;
                                            cVar.f(solverVariable4, solverVariable, iE2, 5);
                                        }
                                        if (!z27) {
                                        }
                                    } else {
                                        i30 = i25;
                                    }
                                    i24 = 5;
                                    if (!z27) {
                                    }
                                }
                                if (z27 || !z13) {
                                    return;
                                }
                                if (constraintAnchor2.f15930f != null) {
                                    iE = constraintAnchor2.e();
                                }
                                if (solverVariable3 != solverVariable2) {
                                    cVar.f(solverVariable2, solverVariableK4, iE, i24);
                                    return;
                                }
                                return;
                            }
                            cVar.e(solverVariableK4, solverVariableK6, -constraintAnchor2.e(), 8);
                            if (z11) {
                                i24 = 5;
                                i23 = 0;
                                cVar.f(solverVariableK3, solverVariable, 0, 5);
                                solverVariable3 = solverVariableK6;
                            } else {
                                solverVariable3 = solverVariableK6;
                            }
                            iE = i23;
                            z27 = z11;
                            if (z27) {
                                return;
                            } else {
                                return;
                            }
                        }
                        z27 = z11;
                        constraintAnchor2 = constraintAnchor2;
                        i24 = (z11 && (constraintAnchor.f15930f.f15928d instanceof a)) ? 8 : 5;
                        solverVariableK4 = solverVariableK4;
                        z13 = z13;
                        solverVariable3 = solverVariableK6;
                        iE = 0;
                        if (z27) {
                            return;
                        } else {
                            return;
                        }
                    }
                    solverVariable3 = solverVariableK6;
                    i24 = 5;
                    iE = 0;
                    z27 = z11;
                    if (z27) {
                        return;
                    } else {
                        return;
                    }
                }
                c10 = 2;
                i20 = 8;
                i21 = 0;
                i22 = 1;
            }
            if (i40 >= c10 && z11 && z13) {
                cVar.f(solverVariableK3, solverVariable, i21, i20);
                ConstraintAnchor constraintAnchor4 = this.f15955N;
                int i46 = (z10 || constraintAnchor4.f15930f == null) ? i22 : i21;
                if (z10 || (constraintAnchor3 = constraintAnchor4.f15930f) == null) {
                    i22 = i46;
                } else {
                    ConstraintWidget constraintWidget4 = constraintAnchor3.f15928d;
                    if (constraintWidget4.f15966Y != 0.0f) {
                        DimensionBehaviour[] dimensionBehaviourArr = constraintWidget4.f15962U;
                        DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[i21];
                        DimensionBehaviour dimensionBehaviour3 = DimensionBehaviour.f16015d;
                        if (dimensionBehaviour2 != dimensionBehaviour3 || dimensionBehaviourArr[i22] != dimensionBehaviour3) {
                            i22 = i21;
                        }
                    } else {
                        i22 = i21;
                    }
                }
                if (i22 != 0) {
                    cVar.f(solverVariable2, solverVariableK4, i21, i20);
                    return;
                }
                return;
            }
            return;
        }
        if (z14) {
            cVar.e(solverVariableK4, solverVariableK3, 0, 3);
            if (i12 > 0) {
                cVar.f(solverVariableK4, solverVariableK3, i12, i18);
            }
            if (i13 < Integer.MAX_VALUE) {
                cVar.g(solverVariableK4, solverVariableK3, i13, i18);
            }
        } else {
            cVar.e(solverVariableK4, solverVariableK3, iMin, i18);
        }
        i19 = i37;
        if (z20) {
            i20 = 8;
            i21 = 0;
            i22 = 1;
            c10 = 2;
        } else {
            if (z17) {
                if (zH) {
                    if (zH) {
                        if (!zH) {
                            i23 = 0;
                            if (zH) {
                            }
                            solverVariable3 = solverVariableK6;
                            i24 = 5;
                            iE = i23;
                            z27 = z11;
                        } else {
                            i23 = 0;
                            if (zH) {
                            }
                            solverVariable3 = solverVariableK6;
                            i24 = 5;
                            iE = i23;
                            z27 = z11;
                        }
                    } else if (!zH) {
                        i23 = 0;
                        if (zH) {
                        }
                        solverVariable3 = solverVariableK6;
                        i24 = 5;
                        iE = i23;
                        z27 = z11;
                    } else {
                        i23 = 0;
                        if (zH) {
                        }
                        solverVariable3 = solverVariableK6;
                        i24 = 5;
                        iE = i23;
                        z27 = z11;
                    }
                } else if (zH) {
                    if (!zH) {
                        i23 = 0;
                        if (zH) {
                        }
                        solverVariable3 = solverVariableK6;
                        i24 = 5;
                        iE = i23;
                        z27 = z11;
                    } else {
                        i23 = 0;
                        if (zH) {
                        }
                        solverVariable3 = solverVariableK6;
                        i24 = 5;
                        iE = i23;
                        z27 = z11;
                    }
                } else if (!zH) {
                    i23 = 0;
                    if (zH) {
                    }
                    solverVariable3 = solverVariableK6;
                    i24 = 5;
                    iE = i23;
                    z27 = z11;
                } else {
                    i23 = 0;
                    if (zH) {
                    }
                    solverVariable3 = solverVariableK6;
                    i24 = 5;
                    iE = i23;
                    z27 = z11;
                }
                if (z27) {
                    return;
                } else {
                    return;
                }
            }
            c10 = 2;
            i20 = 8;
            i21 = 0;
            i22 = 1;
        }
        if (i40 >= c10) {
        }
    }

    public final void h(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i10) {
        boolean z10;
        ConstraintAnchor.Type type3 = ConstraintAnchor.Type.f15939g;
        ConstraintAnchor.Type type4 = ConstraintAnchor.Type.f15941i;
        ConstraintAnchor.Type type5 = ConstraintAnchor.Type.f15940h;
        ConstraintAnchor.Type type6 = ConstraintAnchor.Type.f15934b;
        ConstraintAnchor.Type type7 = ConstraintAnchor.Type.f15935c;
        ConstraintAnchor.Type type8 = ConstraintAnchor.Type.f15936d;
        ConstraintAnchor.Type type9 = ConstraintAnchor.Type.f15937e;
        if (type == type3) {
            if (type2 != type3) {
                if (type2 == type6 || type2 == type8) {
                    h(type6, constraintWidget, type2, 0);
                    h(type8, constraintWidget, type2, 0);
                    m(type3).a(constraintWidget.m(type2), 0);
                    return;
                } else {
                    if (type2 == type7 || type2 == type9) {
                        h(type7, constraintWidget, type2, 0);
                        h(type9, constraintWidget, type2, 0);
                        m(type3).a(constraintWidget.m(type2), 0);
                        return;
                    }
                    return;
                }
            }
            ConstraintAnchor constraintAnchorM = m(type6);
            ConstraintAnchor constraintAnchorM2 = m(type8);
            ConstraintAnchor constraintAnchorM3 = m(type7);
            ConstraintAnchor constraintAnchorM4 = m(type9);
            boolean z11 = true;
            if ((constraintAnchorM == null || !constraintAnchorM.h()) && (constraintAnchorM2 == null || !constraintAnchorM2.h())) {
                h(type6, constraintWidget, type6, 0);
                h(type8, constraintWidget, type8, 0);
                z10 = true;
            } else {
                z10 = false;
            }
            if ((constraintAnchorM3 == null || !constraintAnchorM3.h()) && (constraintAnchorM4 == null || !constraintAnchorM4.h())) {
                h(type7, constraintWidget, type7, 0);
                h(type9, constraintWidget, type9, 0);
            } else {
                z11 = false;
            }
            if (z10 && z11) {
                m(type3).a(constraintWidget.m(type3), 0);
                return;
            } else if (z10) {
                m(type5).a(constraintWidget.m(type5), 0);
                return;
            } else {
                if (z11) {
                    m(type4).a(constraintWidget.m(type4), 0);
                    return;
                }
                return;
            }
        }
        if (type == type5 && (type2 == type6 || type2 == type8)) {
            ConstraintAnchor constraintAnchorM5 = m(type6);
            ConstraintAnchor constraintAnchorM6 = constraintWidget.m(type2);
            ConstraintAnchor constraintAnchorM7 = m(type8);
            constraintAnchorM5.a(constraintAnchorM6, 0);
            constraintAnchorM7.a(constraintAnchorM6, 0);
            m(type5).a(constraintAnchorM6, 0);
            return;
        }
        if (type == type4 && (type2 == type7 || type2 == type9)) {
            ConstraintAnchor constraintAnchorM8 = constraintWidget.m(type2);
            m(type7).a(constraintAnchorM8, 0);
            m(type9).a(constraintAnchorM8, 0);
            m(type4).a(constraintAnchorM8, 0);
            return;
        }
        if (type == type5 && type2 == type5) {
            m(type6).a(constraintWidget.m(type6), 0);
            m(type8).a(constraintWidget.m(type8), 0);
            m(type5).a(constraintWidget.m(type2), 0);
            return;
        }
        if (type == type4 && type2 == type4) {
            m(type7).a(constraintWidget.m(type7), 0);
            m(type9).a(constraintWidget.m(type9), 0);
            m(type4).a(constraintWidget.m(type2), 0);
            return;
        }
        ConstraintAnchor constraintAnchorM9 = m(type);
        ConstraintAnchor constraintAnchorM10 = constraintWidget.m(type2);
        if (constraintAnchorM9.i(constraintAnchorM10)) {
            ConstraintAnchor.Type type10 = ConstraintAnchor.Type.f15938f;
            if (type == type10) {
                ConstraintAnchor constraintAnchorM11 = m(type7);
                ConstraintAnchor constraintAnchorM12 = m(type9);
                if (constraintAnchorM11 != null) {
                    constraintAnchorM11.j();
                }
                if (constraintAnchorM12 != null) {
                    constraintAnchorM12.j();
                }
            } else if (type == type7 || type == type9) {
                ConstraintAnchor constraintAnchorM13 = m(type10);
                if (constraintAnchorM13 != null) {
                    constraintAnchorM13.j();
                }
                ConstraintAnchor constraintAnchorM14 = m(type3);
                if (constraintAnchorM14.f15930f != constraintAnchorM10) {
                    constraintAnchorM14.j();
                }
                ConstraintAnchor constraintAnchorF = m(type).f();
                ConstraintAnchor constraintAnchorM15 = m(type4);
                if (constraintAnchorM15.h()) {
                    constraintAnchorF.j();
                    constraintAnchorM15.j();
                }
            } else if (type == type6 || type == type8) {
                ConstraintAnchor constraintAnchorM16 = m(type3);
                if (constraintAnchorM16.f15930f != constraintAnchorM10) {
                    constraintAnchorM16.j();
                }
                ConstraintAnchor constraintAnchorF2 = m(type).f();
                ConstraintAnchor constraintAnchorM17 = m(type5);
                if (constraintAnchorM17.h()) {
                    constraintAnchorF2.j();
                    constraintAnchorM17.j();
                }
            }
            constraintAnchorM9.a(constraintAnchorM10, i10);
        }
    }

    public final void i(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i10) {
        if (constraintAnchor.f15928d == this) {
            h(constraintAnchor.f15929e, constraintAnchor2.f15928d, constraintAnchor2.f15929e, i10);
        }
    }

    public void j(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        this.f15995o = constraintWidget.f15995o;
        this.f15997p = constraintWidget.f15997p;
        this.f16001r = constraintWidget.f16001r;
        this.f16003s = constraintWidget.f16003s;
        int[] iArr = constraintWidget.f16005t;
        int i10 = iArr[0];
        int[] iArr2 = this.f16005t;
        iArr2[0] = i10;
        iArr2[1] = iArr[1];
        this.f16007u = constraintWidget.f16007u;
        this.f16008v = constraintWidget.f16008v;
        this.f16010x = constraintWidget.f16010x;
        this.f16011y = constraintWidget.f16011y;
        this.f16012z = constraintWidget.f16012z;
        this.f15942A = constraintWidget.f15942A;
        this.f15943B = constraintWidget.f15943B;
        int[] iArr3 = constraintWidget.f15944C;
        this.f15944C = Arrays.copyOf(iArr3, iArr3.length);
        this.f15945D = constraintWidget.f15945D;
        this.f15946E = constraintWidget.f15946E;
        this.f15947F = constraintWidget.f15947F;
        this.f15951J.j();
        this.f15952K.j();
        this.f15953L.j();
        this.f15954M.j();
        this.f15955N.j();
        this.f15956O.j();
        this.f15957P.j();
        this.f15958Q.j();
        this.f15962U = (DimensionBehaviour[]) Arrays.copyOf(this.f15962U, 2);
        this.f15963V = this.f15963V == null ? null : map.get(constraintWidget.f15963V);
        this.f15964W = constraintWidget.f15964W;
        this.f15965X = constraintWidget.f15965X;
        this.f15966Y = constraintWidget.f15966Y;
        this.f15967Z = constraintWidget.f15967Z;
        this.f15969a0 = constraintWidget.f15969a0;
        this.f15971b0 = constraintWidget.f15971b0;
        this.f15973c0 = constraintWidget.f15973c0;
        this.f15975d0 = constraintWidget.f15975d0;
        this.f15977e0 = constraintWidget.f15977e0;
        this.f15979f0 = constraintWidget.f15979f0;
        this.f15981g0 = constraintWidget.f15981g0;
        this.f15983h0 = constraintWidget.f15983h0;
        this.f15985i0 = constraintWidget.f15985i0;
        this.f15986j0 = constraintWidget.f15986j0;
        this.f15988k0 = constraintWidget.f15988k0;
        this.f15990l0 = constraintWidget.f15990l0;
        this.f15992m0 = constraintWidget.f15992m0;
        float[] fArr = constraintWidget.f15994n0;
        float f10 = fArr[0];
        float[] fArr2 = this.f15994n0;
        fArr2[0] = f10;
        fArr2[1] = fArr[1];
        ConstraintWidget[] constraintWidgetArr = constraintWidget.f15996o0;
        ConstraintWidget constraintWidget2 = constraintWidgetArr[0];
        ConstraintWidget[] constraintWidgetArr2 = this.f15996o0;
        constraintWidgetArr2[0] = constraintWidget2;
        constraintWidgetArr2[1] = constraintWidgetArr[1];
        ConstraintWidget[] constraintWidgetArr3 = constraintWidget.f15998p0;
        ConstraintWidget constraintWidget3 = constraintWidgetArr3[0];
        ConstraintWidget[] constraintWidgetArr4 = this.f15998p0;
        constraintWidgetArr4[0] = constraintWidget3;
        constraintWidgetArr4[1] = constraintWidgetArr3[1];
        ConstraintWidget constraintWidget4 = constraintWidget.f16000q0;
        this.f16000q0 = constraintWidget4 == null ? null : map.get(constraintWidget4);
        ConstraintWidget constraintWidget5 = constraintWidget.f16002r0;
        this.f16002r0 = constraintWidget5 != null ? map.get(constraintWidget5) : null;
    }

    public final void k(androidx.constraintlayout.core.c cVar) {
        cVar.k(this.f15951J);
        cVar.k(this.f15952K);
        cVar.k(this.f15953L);
        cVar.k(this.f15954M);
        if (this.f15973c0 > 0) {
            cVar.k(this.f15955N);
        }
    }

    public final void l() {
        if (this.f15974d == null) {
            this.f15974d = new androidx.constraintlayout.core.widgets.analyzer.c(this);
        }
        if (this.f15976e == null) {
            this.f15976e = new androidx.constraintlayout.core.widgets.analyzer.d(this);
        }
    }

    public ConstraintAnchor m(ConstraintAnchor.Type type) {
        switch (type.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.f15951J;
            case 2:
                return this.f15952K;
            case 3:
                return this.f15953L;
            case 4:
                return this.f15954M;
            case 5:
                return this.f15955N;
            case 6:
                return this.f15958Q;
            case 7:
                return this.f15956O;
            case 8:
                return this.f15957P;
            default:
                throw new AssertionError(type.name());
        }
    }

    public final DimensionBehaviour n(int i10) {
        if (i10 == 0) {
            return this.f15962U[0];
        }
        if (i10 == 1) {
            return this.f15962U[1];
        }
        return null;
    }

    public final int o() {
        if (this.f15985i0 == 8) {
            return 0;
        }
        return this.f15965X;
    }

    public final ConstraintWidget p(int i10) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i10 != 0) {
            if (i10 == 1 && (constraintAnchor2 = (constraintAnchor = this.f15954M).f15930f) != null && constraintAnchor2.f15930f == constraintAnchor) {
                return constraintAnchor2.f15928d;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.f15953L;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f15930f;
        if (constraintAnchor4 == null || constraintAnchor4.f15930f != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.f15928d;
    }

    public final ConstraintWidget q(int i10) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i10 != 0) {
            if (i10 == 1 && (constraintAnchor2 = (constraintAnchor = this.f15952K).f15930f) != null && constraintAnchor2.f15930f == constraintAnchor) {
                return constraintAnchor2.f15928d;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.f15951J;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f15930f;
        if (constraintAnchor4 == null || constraintAnchor4.f15930f != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.f15928d;
    }

    public void r(StringBuilder sb2) {
        sb2.append("  " + this.j + ":{\n");
        StringBuilder sb3 = new StringBuilder("    actualWidth:");
        sb3.append(this.f15964W);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("    actualHeight:" + this.f15965X);
        sb2.append("\n");
        sb2.append("    actualLeft:" + this.f15969a0);
        sb2.append("\n");
        sb2.append("    actualTop:" + this.f15971b0);
        sb2.append("\n");
        t(sb2, BlockAlignment.LEFT, this.f15951J);
        t(sb2, VerticalAlignment.TOP, this.f15952K);
        t(sb2, BlockAlignment.RIGHT, this.f15953L);
        t(sb2, VerticalAlignment.BOTTOM, this.f15954M);
        t(sb2, "baseline", this.f15955N);
        t(sb2, "centerX", this.f15956O);
        t(sb2, "centerY", this.f15957P);
        int i10 = this.f15964W;
        int i11 = this.f15975d0;
        int i12 = this.f15944C[0];
        int i13 = this.f16007u;
        int i14 = this.f16001r;
        float f10 = this.f16009w;
        DimensionBehaviour dimensionBehaviour = this.f15962U[0];
        float[] fArr = this.f15994n0;
        float f11 = fArr[0];
        s(sb2, "    width", i10, i11, i12, i13, i14, f10, dimensionBehaviour);
        int i15 = this.f15965X;
        int i16 = this.f15977e0;
        int i17 = this.f15944C[1];
        int i18 = this.f16010x;
        int i19 = this.f16003s;
        float f12 = this.f16012z;
        DimensionBehaviour dimensionBehaviour2 = this.f15962U[1];
        float f13 = fArr[1];
        s(sb2, "    height", i15, i16, i17, i18, i19, f12, dimensionBehaviour2);
        float f14 = this.f15966Y;
        int i20 = this.f15967Z;
        if (f14 != 0.0f) {
            sb2.append("    dimensionRatio");
            sb2.append(" :  [");
            sb2.append(f14);
            sb2.append(",");
            sb2.append(i20);
            sb2.append("");
            sb2.append("],\n");
        }
        L(sb2, "    horizontalBias", this.f15979f0, 0.5f);
        L(sb2, "    verticalBias", this.f15981g0, 0.5f);
        K(this.f15990l0, 0, "    horizontalChainStyle", sb2);
        K(this.f15992m0, 0, "    verticalChainStyle", sb2);
        sb2.append("  }");
    }

    public String toString() {
        StringBuilder sbE = C4.b.e("");
        sbE.append(this.f15988k0 != null ? Q8.d.a(new StringBuilder("id: "), this.f15988k0, " ") : "");
        sbE.append("(");
        sbE.append(this.f15969a0);
        sbE.append(", ");
        sbE.append(this.f15971b0);
        sbE.append(") - (");
        sbE.append(this.f15964W);
        sbE.append(" x ");
        return q.c(sbE, this.f15965X, ")");
    }

    public final int u() {
        if (this.f15985i0 == 8) {
            return 0;
        }
        return this.f15964W;
    }

    public final int v() {
        ConstraintWidget constraintWidget = this.f15963V;
        return (constraintWidget == null || !(constraintWidget instanceof d)) ? this.f15969a0 : ((d) constraintWidget).f16074B0 + this.f15969a0;
    }

    public final int w() {
        ConstraintWidget constraintWidget = this.f15963V;
        return (constraintWidget == null || !(constraintWidget instanceof d)) ? this.f15971b0 : ((d) constraintWidget).f16075C0 + this.f15971b0;
    }

    public final boolean x(int i10) {
        if (i10 == 0) {
            return (this.f15951J.f15930f != null ? 1 : 0) + (this.f15953L.f15930f != null ? 1 : 0) < 2;
        }
        return ((this.f15952K.f15930f != null ? 1 : 0) + (this.f15954M.f15930f != null ? 1 : 0)) + (this.f15955N.f15930f != null ? 1 : 0) < 2;
    }

    public final boolean y(int i10, int i11) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        if (i10 == 0) {
            ConstraintAnchor constraintAnchor5 = this.f15951J;
            ConstraintAnchor constraintAnchor6 = constraintAnchor5.f15930f;
            if (constraintAnchor6 != null && constraintAnchor6.f15927c && (constraintAnchor4 = (constraintAnchor3 = this.f15953L).f15930f) != null && constraintAnchor4.f15927c) {
                return (constraintAnchor4.d() - constraintAnchor3.e()) - (constraintAnchor5.e() + constraintAnchor5.f15930f.d()) >= i11;
            }
        } else {
            ConstraintAnchor constraintAnchor7 = this.f15952K;
            ConstraintAnchor constraintAnchor8 = constraintAnchor7.f15930f;
            if (constraintAnchor8 != null && constraintAnchor8.f15927c && (constraintAnchor2 = (constraintAnchor = this.f15954M).f15930f) != null && constraintAnchor2.f15927c) {
                return (constraintAnchor2.d() - constraintAnchor.e()) - (constraintAnchor7.e() + constraintAnchor7.f15930f.d()) >= i11;
            }
        }
        return false;
    }

    public final void z(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i10, int i11) {
        m(type).b(constraintWidget.m(type2), i10, i11, true);
    }
}
