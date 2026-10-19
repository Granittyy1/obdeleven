package androidx.constraintlayout.core;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class SolverVariable implements Comparable<SolverVariable> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15873b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f15877f;
    public Type j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15874c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15875d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15876e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15878g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f15879h = new float[9];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f15880i = new float[9];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b[] f15881k = new b[16];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f15882l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f15883m = 0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Type f15884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Type f15885c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Type f15886d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Type f15887e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ Type[] f15888f;

        static {
            Type type = new Type("UNRESTRICTED", 0);
            f15884b = type;
            Type type2 = new Type("CONSTANT", 1);
            Type type3 = new Type("SLACK", 2);
            f15885c = type3;
            Type type4 = new Type("ERROR", 3);
            f15886d = type4;
            Type type5 = new Type("UNKNOWN", 4);
            f15887e = type5;
            f15888f = new Type[]{type, type2, type3, type4, type5};
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f15888f.clone();
        }
    }

    public SolverVariable(Type type) {
        this.j = type;
    }

    public final void a(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f15882l;
            if (i10 >= i11) {
                b[] bVarArr = this.f15881k;
                if (i11 >= bVarArr.length) {
                    this.f15881k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f15881k;
                int i12 = this.f15882l;
                bVarArr2[i12] = bVar;
                this.f15882l = i12 + 1;
                return;
            }
            if (this.f15881k[i10] == bVar) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void b(b bVar) {
        int i10 = this.f15882l;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f15881k[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.f15881k;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.f15882l--;
                return;
            }
            i11++;
        }
    }

    public final void c() {
        this.j = Type.f15887e;
        this.f15876e = 0;
        this.f15874c = -1;
        this.f15875d = -1;
        this.f15877f = 0.0f;
        this.f15878g = false;
        int i10 = this.f15882l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f15881k[i11] = null;
        }
        this.f15882l = 0;
        this.f15883m = 0;
        this.f15873b = false;
        Arrays.fill(this.f15880i, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(SolverVariable solverVariable) {
        return this.f15874c - solverVariable.f15874c;
    }

    public final void d(c cVar, float f10) {
        this.f15877f = f10;
        this.f15878g = true;
        int i10 = this.f15882l;
        this.f15875d = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f15881k[i11].h(cVar, this, false);
        }
        this.f15882l = 0;
    }

    public final void e(c cVar, b bVar) {
        int i10 = this.f15882l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f15881k[i11].i(cVar, bVar, false);
        }
        this.f15882l = 0;
    }

    public final String toString() {
        return "" + this.f15874c;
    }
}
