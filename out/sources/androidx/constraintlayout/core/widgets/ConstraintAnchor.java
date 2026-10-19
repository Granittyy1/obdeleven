package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p101i0.j;

/* JADX INFO: loaded from: classes.dex */
public final class ConstraintAnchor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConstraintWidget f15928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Type f15929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ConstraintAnchor f15930f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SolverVariable f15933i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashSet<ConstraintAnchor> f15925a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15931g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15932h = Integer.MIN_VALUE;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Type f15934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Type f15935c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Type f15936d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Type f15937e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Type f15938f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final Type f15939g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final Type f15940h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final Type f15941i;
        public static final /* synthetic */ Type[] j;

        /* JADX INFO: Fake field, exist only in values array */
        Type EF0;

        static {
            Type type = new Type("NONE", 0);
            Type type2 = new Type("LEFT", 1);
            f15934b = type2;
            Type type3 = new Type("TOP", 2);
            f15935c = type3;
            Type type4 = new Type("RIGHT", 3);
            f15936d = type4;
            Type type5 = new Type("BOTTOM", 4);
            f15937e = type5;
            Type type6 = new Type("BASELINE", 5);
            f15938f = type6;
            Type type7 = new Type("CENTER", 6);
            f15939g = type7;
            Type type8 = new Type("CENTER_X", 7);
            f15940h = type8;
            Type type9 = new Type("CENTER_Y", 8);
            f15941i = type9;
            j = new Type[]{type, type2, type3, type4, type5, type6, type7, type8, type9};
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) j.clone();
        }
    }

    public ConstraintAnchor(ConstraintWidget constraintWidget, Type type) {
        this.f15928d = constraintWidget;
        this.f15929e = type;
    }

    public final void a(ConstraintAnchor constraintAnchor, int i10) {
        b(constraintAnchor, i10, Integer.MIN_VALUE, false);
    }

    public final boolean b(ConstraintAnchor constraintAnchor, int i10, int i11, boolean z10) {
        if (constraintAnchor == null) {
            j();
            return true;
        }
        if (!z10 && !i(constraintAnchor)) {
            return false;
        }
        this.f15930f = constraintAnchor;
        if (constraintAnchor.f15925a == null) {
            constraintAnchor.f15925a = new HashSet<>();
        }
        HashSet<ConstraintAnchor> hashSet = this.f15930f.f15925a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f15931g = i10;
        this.f15932h = i11;
        return true;
    }

    public final void c(int i10, j jVar, ArrayList arrayList) {
        HashSet<ConstraintAnchor> hashSet = this.f15925a;
        if (hashSet != null) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                p101i0.g.a(it.next().f15928d, i10, arrayList, jVar);
            }
        }
    }

    public final int d() {
        if (this.f15927c) {
            return this.f15926b;
        }
        return 0;
    }

    public final int e() {
        ConstraintAnchor constraintAnchor;
        if (this.f15928d.f15985i0 == 8) {
            return 0;
        }
        int i10 = this.f15932h;
        return (i10 == Integer.MIN_VALUE || (constraintAnchor = this.f15930f) == null || constraintAnchor.f15928d.f15985i0 != 8) ? this.f15931g : i10;
    }

    public final ConstraintAnchor f() {
        Type type = this.f15929e;
        int iOrdinal = type.ordinal();
        ConstraintWidget constraintWidget = this.f15928d;
        switch (iOrdinal) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return constraintWidget.f15953L;
            case 2:
                return constraintWidget.f15954M;
            case 3:
                return constraintWidget.f15951J;
            case 4:
                return constraintWidget.f15952K;
            default:
                throw new AssertionError(type.name());
        }
    }

    public final boolean g() {
        HashSet<ConstraintAnchor> hashSet = this.f15925a;
        if (hashSet == null) {
            return false;
        }
        Iterator<ConstraintAnchor> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f15930f != null;
    }

    public final boolean i(ConstraintAnchor constraintAnchor) {
        if (constraintAnchor == null) {
            return false;
        }
        Type type = Type.f15938f;
        Type type2 = this.f15929e;
        ConstraintWidget constraintWidget = constraintAnchor.f15928d;
        Type type3 = constraintAnchor.f15929e;
        if (type3 == type2) {
            return type2 != type || (constraintWidget.f15946E && this.f15928d.f15946E);
        }
        int iOrdinal = type2.ordinal();
        Type type4 = Type.f15936d;
        Type type5 = Type.f15934b;
        Type type6 = Type.f15941i;
        Type type7 = Type.f15940h;
        switch (iOrdinal) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z10 = type3 == type5 || type3 == type4;
                if (constraintWidget instanceof f) {
                    return z10 || type3 == type7;
                }
                return z10;
            case 2:
            case 4:
                boolean z11 = type3 == Type.f15935c || type3 == Type.f15937e;
                if (constraintWidget instanceof f) {
                    return z11 || type3 == type6;
                }
                return z11;
            case 5:
                return (type3 == type5 || type3 == type4) ? false : true;
            case 6:
                return (type3 == type || type3 == type7 || type3 == type6) ? false : true;
            default:
                throw new AssertionError(type2.name());
        }
    }

    public final void j() {
        HashSet<ConstraintAnchor> hashSet;
        ConstraintAnchor constraintAnchor = this.f15930f;
        if (constraintAnchor != null && (hashSet = constraintAnchor.f15925a) != null) {
            hashSet.remove(this);
            if (this.f15930f.f15925a.size() == 0) {
                this.f15930f.f15925a = null;
            }
        }
        this.f15925a = null;
        this.f15930f = null;
        this.f15931g = 0;
        this.f15932h = Integer.MIN_VALUE;
        this.f15927c = false;
        this.f15926b = 0;
    }

    public final void k() {
        SolverVariable solverVariable = this.f15933i;
        if (solverVariable == null) {
            this.f15933i = new SolverVariable(SolverVariable.Type.f15884b);
        } else {
            solverVariable.c();
        }
    }

    public final void l(int i10) {
        this.f15926b = i10;
        this.f15927c = true;
    }

    public final String toString() {
        return this.f15928d.f15988k0 + ":" + this.f15929e.toString();
    }
}
