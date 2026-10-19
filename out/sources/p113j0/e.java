package p113j0;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import p077g0.o;

/* JADX INFO: compiled from: ViewTimeCycle.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class e extends o {

    /* JADX INFO: compiled from: ViewTimeCycle.java */
    public static class a extends e {
        @Override // p113j0.e
        public final boolean e(float f10, long j, F6.a aVar, View view) {
            view.setAlpha(d(f10, j, aVar, view));
            return this.f35178h;
        }
    }

    /* JADX INFO: compiled from: ViewTimeCycle.java */
    public static class b extends e {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f40991k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public SparseArray<ConstraintAttribute> f40992l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public SparseArray<float[]> f40993m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float[] f40994n;

        public b() {
            throw null;
        }

        @Override // p077g0.o
        public final void b(float f10, float f11, float f12, int i10, int i11) {
            throw new RuntimeException("Wrong call for custom attribute");
        }

        @Override // p077g0.o
        public final void c(int i10) {
            SparseArray<ConstraintAttribute> sparseArray = this.f40992l;
            int size = sparseArray.size();
            int iC = sparseArray.valueAt(0).c();
            double[] dArr = new double[size];
            int i11 = iC + 2;
            this.f40994n = new float[i11];
            this.f35177g = new float[iC];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i11);
            for (int i12 = 0; i12 < size; i12++) {
                int iKeyAt = sparseArray.keyAt(i12);
                ConstraintAttribute constraintAttributeValueAt = sparseArray.valueAt(i12);
                float[] fArrValueAt = this.f40993m.valueAt(i12);
                dArr[i12] = ((double) iKeyAt) * 0.01d;
                constraintAttributeValueAt.b(this.f40994n);
                int i13 = 0;
                while (true) {
                    float[] fArr = this.f40994n;
                    if (i13 < fArr.length) {
                        dArr2[i12][i13] = fArr[i13];
                        i13++;
                    }
                }
                double[] dArr3 = dArr2[i12];
                dArr3[iC] = fArrValueAt[0];
                dArr3[iC + 1] = fArrValueAt[1];
            }
            this.f35171a = p077g0.b.a(i10, dArr, dArr2);
        }

        @Override // p113j0.e
        public final boolean e(float f10, long j, F6.a aVar, View view) {
            this.f35171a.d(f10, this.f40994n);
            float[] fArr = this.f40994n;
            float f11 = fArr[fArr.length - 2];
            float f12 = fArr[fArr.length - 1];
            long j10 = j - this.f35179i;
            if (Float.isNaN(this.j)) {
                float fC = aVar.c(view, this.f40991k);
                this.j = fC;
                if (Float.isNaN(fC)) {
                    this.j = 0.0f;
                }
            }
            float f13 = (float) ((((j10 * 1.0E-9d) * ((double) f11)) + ((double) this.j)) % 1.0d);
            this.j = f13;
            this.f35179i = j;
            float fA = a(f13);
            this.f35178h = false;
            int i10 = 0;
            while (true) {
                float[] fArr2 = this.f35177g;
                if (i10 >= fArr2.length) {
                    break;
                }
                boolean z10 = this.f35178h;
                float f14 = this.f40994n[i10];
                this.f35178h = z10 | (((double) f14) != 0.0d);
                fArr2[i10] = (f14 * fA) + f12;
                i10++;
            }
            p113j0.a.b(this.f40992l.valueAt(0), view, this.f35177g);
            if (f11 != 0.0f) {
                this.f35178h = true;
            }
            return this.f35178h;
        }
    }

    /* JADX INFO: compiled from: ViewTimeCycle.java */
    public static class c extends e {
        @Override // p113j0.e
        public final boolean e(float f10, long j, F6.a aVar, View view) {
            view.setElevation(d(f10, j, aVar, view));
            return this.f35178h;
        }
    }

    /* JADX INFO: compiled from: ViewTimeCycle.java */
    public static class d extends e {
        @Override // p113j0.e
        public final boolean e(float f10, long j, F6.a aVar, View view) {
            return this.f35178h;
        }
    }

    /* JADX INFO: renamed from: j0.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ViewTimeCycle.java */
    public static class C0467e extends e {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f40995k;

        @Override // p113j0.e
        public final boolean e(float f10, long j, F6.a aVar, View view) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(d(f10, j, aVar, view));
            } else {
                if (this.f40995k) {
                    return false;
                }
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f40995k = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(d(f10, j, aVar, view)));
                    } catch (IllegalAccessException e10) {
                        Log.e("ViewTimeCycle", "unable to setProgress", e10);
                    } catch (InvocationTargetException e11) {
                        Log.e("ViewTimeCycle", "unable to setProgress", e11);
                    }
                }
            }
            return this.f35178h;
        }
    }

    /* JADX INFO: compiled from: ViewTimeCycle.java */
    public static class f extends e {
        @Override // p113j0.e
        public final boolean e(float f10, long j, F6.a aVar, View view) {
            view.setRotation(d(f10, j, aVar, view));
            return this.f35178h;
        }
    }

    /* JADX INFO: compiled from: ViewTimeCycle.java */
    public static class g extends e {
        @Override // p113j0.e
        public final boolean e(float f10, long j, F6.a aVar, View view) {
            view.setRotationX(d(f10, j, aVar, view));
            return this.f35178h;
        }
    }

    /* JADX INFO: compiled from: ViewTimeCycle.java */
    public static class h extends e {
        @Override // p113j0.e
        public final boolean e(float f10, long j, F6.a aVar, View view) {
            view.setRotationY(d(f10, j, aVar, view));
            return this.f35178h;
        }
    }

    /* JADX INFO: compiled from: ViewTimeCycle.java */
    public static class i extends e {
        @Override // p113j0.e
        public final boolean e(float f10, long j, F6.a aVar, View view) {
            view.setScaleX(d(f10, j, aVar, view));
            return this.f35178h;
        }
    }

    /* JADX INFO: compiled from: ViewTimeCycle.java */
    public static class j extends e {
        @Override // p113j0.e
        public final boolean e(float f10, long j, F6.a aVar, View view) {
            view.setScaleY(d(f10, j, aVar, view));
            return this.f35178h;
        }
    }

    /* JADX INFO: compiled from: ViewTimeCycle.java */
    public static class k extends e {
        @Override // p113j0.e
        public final boolean e(float f10, long j, F6.a aVar, View view) {
            view.setTranslationX(d(f10, j, aVar, view));
            return this.f35178h;
        }
    }

    /* JADX INFO: compiled from: ViewTimeCycle.java */
    public static class l extends e {
        @Override // p113j0.e
        public final boolean e(float f10, long j, F6.a aVar, View view) {
            view.setTranslationY(d(f10, j, aVar, view));
            return this.f35178h;
        }
    }

    /* JADX INFO: compiled from: ViewTimeCycle.java */
    public static class m extends e {
        @Override // p113j0.e
        public final boolean e(float f10, long j, F6.a aVar, View view) {
            view.setTranslationZ(d(f10, j, aVar, view));
            return this.f35178h;
        }
    }

    public e() {
        this.f35172b = 0;
        this.f35173c = new int[10];
        this.f35174d = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);
        this.f35177g = new float[3];
        this.f35178h = false;
        this.j = Float.NaN;
    }

    public final float d(float f10, long j10, F6.a aVar, View view) {
        this.f35171a.d(f10, this.f35177g);
        float[] fArr = this.f35177g;
        boolean z10 = true;
        float f11 = fArr[1];
        if (f11 == 0.0f) {
            this.f35178h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.j)) {
            float fC = aVar.c(view, this.f35176f);
            this.j = fC;
            if (Float.isNaN(fC)) {
                this.j = 0.0f;
            }
        }
        float f12 = (float) (((((j10 - this.f35179i) * 1.0E-9d) * ((double) f11)) + ((double) this.j)) % 1.0d);
        this.j = f12;
        String str = this.f35176f;
        HashMap map = (HashMap) aVar.f3259c;
        if (map.containsKey(view)) {
            HashMap map2 = (HashMap) map.get(view);
            if (map2 == null) {
                map2 = new HashMap();
            }
            if (map2.containsKey(str)) {
                float[] fArrCopyOf = (float[]) map2.get(str);
                if (fArrCopyOf == null) {
                    fArrCopyOf = new float[0];
                }
                if (fArrCopyOf.length <= 0) {
                    fArrCopyOf = Arrays.copyOf(fArrCopyOf, 1);
                }
                fArrCopyOf[0] = f12;
                map2.put(str, fArrCopyOf);
            } else {
                map2.put(str, new float[]{f12});
                map.put(view, map2);
            }
        } else {
            HashMap map3 = new HashMap();
            map3.put(str, new float[]{f12});
            map.put(view, map3);
        }
        this.f35179i = j10;
        float f13 = this.f35177g[0];
        float fA = (a(this.j) * f13) + this.f35177g[2];
        if (f13 == 0.0f && f11 == 0.0f) {
            z10 = false;
        }
        this.f35178h = z10;
        return fA;
    }

    public abstract boolean e(float f10, long j10, F6.a aVar, View view);
}
