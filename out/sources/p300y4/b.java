package p300y4;

import J4.i;
import android.content.res.TypedArray;
import android.graphics.RectF;

/* JADX INFO: compiled from: Shimmer.java */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f48265a = new float[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f48266b = new int[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f48267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f48268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f48269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f48270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f48271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f48272h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f48273i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f48274k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f48275l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f48276m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f48277n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f48278o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f48279p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f48280q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f48281r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f48282s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f48283t;

    /* JADX INFO: renamed from: y4.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Shimmer.java */
    public static abstract class AbstractC0557b<T extends AbstractC0557b<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f48284a = new b();

        public final b a() {
            b bVar = this.f48284a;
            int i10 = bVar.f48270f;
            int[] iArr = bVar.f48266b;
            if (i10 != 1) {
                int i11 = bVar.f48269e;
                iArr[0] = i11;
                int i12 = bVar.f48268d;
                iArr[1] = i12;
                iArr[2] = i12;
                iArr[3] = i11;
            } else {
                int i13 = bVar.f48268d;
                iArr[0] = i13;
                iArr[1] = i13;
                int i14 = bVar.f48269e;
                iArr[2] = i14;
                iArr[3] = i14;
            }
            float[] fArr = bVar.f48265a;
            if (i10 != 1) {
                fArr[0] = Math.max(((1.0f - bVar.f48274k) - bVar.f48275l) / 2.0f, 0.0f);
                fArr[1] = Math.max(((1.0f - bVar.f48274k) - 0.001f) / 2.0f, 0.0f);
                fArr[2] = Math.min(((bVar.f48274k + 1.0f) + 0.001f) / 2.0f, 1.0f);
                fArr[3] = Math.min(((bVar.f48274k + 1.0f) + bVar.f48275l) / 2.0f, 1.0f);
            } else {
                fArr[0] = 0.0f;
                fArr[1] = Math.min(bVar.f48274k, 1.0f);
                fArr[2] = Math.min(bVar.f48274k + bVar.f48275l, 1.0f);
                fArr[3] = 1.0f;
            }
            return bVar;
        }

        public T b(TypedArray typedArray) {
            boolean zHasValue = typedArray.hasValue(3);
            b bVar = this.f48284a;
            if (zHasValue) {
                bVar.f48277n = typedArray.getBoolean(3, bVar.f48277n);
            }
            if (typedArray.hasValue(0)) {
                bVar.f48278o = typedArray.getBoolean(0, bVar.f48278o);
            }
            if (typedArray.hasValue(1)) {
                bVar.f48269e = (((int) (Math.min(1.0f, Math.max(0.0f, typedArray.getFloat(1, 0.3f))) * 255.0f)) << 24) | (bVar.f48269e & 16777215);
            }
            if (typedArray.hasValue(11)) {
                e(typedArray.getFloat(11, 1.0f));
            }
            if (typedArray.hasValue(7)) {
                d(typedArray.getInt(7, (int) bVar.f48282s));
            }
            if (typedArray.hasValue(14)) {
                bVar.f48280q = typedArray.getInt(14, bVar.f48280q);
            }
            if (typedArray.hasValue(15)) {
                g(typedArray.getInt(15, (int) bVar.f48283t));
            }
            if (typedArray.hasValue(16)) {
                bVar.f48281r = typedArray.getInt(16, bVar.f48281r);
            }
            if (typedArray.hasValue(5)) {
                int i10 = typedArray.getInt(5, bVar.f48267c);
                if (i10 == 1) {
                    bVar.f48267c = 1;
                } else if (i10 == 2) {
                    bVar.f48267c = 2;
                } else if (i10 != 3) {
                    bVar.f48267c = 0;
                } else {
                    bVar.f48267c = 3;
                }
            }
            if (typedArray.hasValue(17)) {
                if (typedArray.getInt(17, bVar.f48270f) != 1) {
                    bVar.f48270f = 0;
                } else {
                    bVar.f48270f = 1;
                }
            }
            if (typedArray.hasValue(6)) {
                float f10 = typedArray.getFloat(6, bVar.f48275l);
                if (f10 < 0.0f) {
                    throw new IllegalArgumentException("Given invalid dropoff value: " + f10);
                }
                bVar.f48275l = f10;
            }
            if (typedArray.hasValue(9)) {
                int dimensionPixelSize = typedArray.getDimensionPixelSize(9, bVar.f48271g);
                if (dimensionPixelSize < 0) {
                    throw new IllegalArgumentException(i.b(dimensionPixelSize, "Given invalid width: "));
                }
                bVar.f48271g = dimensionPixelSize;
            }
            if (typedArray.hasValue(8)) {
                int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, bVar.f48272h);
                if (dimensionPixelSize2 < 0) {
                    throw new IllegalArgumentException(i.b(dimensionPixelSize2, "Given invalid height: "));
                }
                bVar.f48272h = dimensionPixelSize2;
            }
            if (typedArray.hasValue(13)) {
                f(typedArray.getFloat(13, bVar.f48274k));
            }
            if (typedArray.hasValue(19)) {
                float f11 = typedArray.getFloat(19, bVar.f48273i);
                if (f11 < 0.0f) {
                    throw new IllegalArgumentException("Given invalid width ratio: " + f11);
                }
                bVar.f48273i = f11;
            }
            if (typedArray.hasValue(10)) {
                float f12 = typedArray.getFloat(10, bVar.j);
                if (f12 < 0.0f) {
                    throw new IllegalArgumentException("Given invalid height ratio: " + f12);
                }
                bVar.j = f12;
            }
            if (typedArray.hasValue(18)) {
                bVar.f48276m = typedArray.getFloat(18, bVar.f48276m);
            }
            return (T) c();
        }

        public abstract T c();

        public final T d(long j) {
            if (j < 0) {
                throw new IllegalArgumentException(com.google.gson.internal.b.b(j, "Given a negative duration: "));
            }
            this.f48284a.f48282s = j;
            return (T) c();
        }

        public final T e(float f10) {
            int iMin = ((int) (Math.min(1.0f, Math.max(0.0f, f10)) * 255.0f)) << 24;
            b bVar = this.f48284a;
            bVar.f48268d = iMin | (bVar.f48268d & 16777215);
            return (T) c();
        }

        public final T f(float f10) {
            if (f10 >= 0.0f) {
                this.f48284a.f48274k = f10;
                return (T) c();
            }
            throw new IllegalArgumentException("Given invalid intensity value: " + f10);
        }

        public final T g(long j) {
            if (j < 0) {
                throw new IllegalArgumentException(com.google.gson.internal.b.b(j, "Given a negative repeat delay: "));
            }
            this.f48284a.f48283t = j;
            return (T) c();
        }
    }

    public b() {
        new RectF();
        this.f48267c = 0;
        this.f48268d = -1;
        this.f48269e = 1291845631;
        this.f48270f = 0;
        this.f48271g = 0;
        this.f48272h = 0;
        this.f48273i = 1.0f;
        this.j = 1.0f;
        this.f48274k = 0.0f;
        this.f48275l = 0.5f;
        this.f48276m = 20.0f;
        this.f48277n = true;
        this.f48278o = true;
        this.f48279p = true;
        this.f48280q = -1;
        this.f48281r = 1;
        this.f48282s = 1000L;
    }

    /* JADX INFO: compiled from: Shimmer.java */
    public static class a extends AbstractC0557b<a> {
        public a() {
            this.f48284a.f48279p = true;
        }

        @Override // p300y4.b.AbstractC0557b
        public final AbstractC0557b c() {
            return this;
        }
    }

    /* JADX INFO: compiled from: Shimmer.java */
    public static class c extends AbstractC0557b<c> {
        @Override // p300y4.b.AbstractC0557b
        public final AbstractC0557b b(TypedArray typedArray) {
            super.b(typedArray);
            boolean zHasValue = typedArray.hasValue(2);
            b bVar = this.f48284a;
            if (zHasValue) {
                bVar.f48269e = (typedArray.getColor(2, bVar.f48269e) & 16777215) | (bVar.f48269e & (-16777216));
            }
            if (typedArray.hasValue(12)) {
                bVar.f48268d = typedArray.getColor(12, bVar.f48268d);
            }
            return this;
        }

        @Override // p300y4.b.AbstractC0557b
        public final AbstractC0557b c() {
            return this;
        }
    }
}
