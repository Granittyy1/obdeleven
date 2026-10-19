package p113j0;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: ViewSpline.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class d extends p077g0.j {

    /* JADX INFO: compiled from: ViewSpline.java */
    public static class a extends d {
        @Override // p113j0.d
        public final void d(View view, float f10) {
            view.setAlpha(a(f10));
        }
    }

    /* JADX INFO: compiled from: ViewSpline.java */
    public static class b extends d {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public SparseArray<ConstraintAttribute> f40988f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float[] f40989g;

        public b() {
            throw null;
        }

        @Override // p077g0.j
        public final void b(float f10, int i10) {
            throw new RuntimeException("call of custom attribute setPoint");
        }

        @Override // p077g0.j
        public final void c(int i10) {
            SparseArray<ConstraintAttribute> sparseArray = this.f40988f;
            int size = sparseArray.size();
            int iC = sparseArray.valueAt(0).c();
            double[] dArr = new double[size];
            this.f40989g = new float[iC];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iC);
            for (int i11 = 0; i11 < size; i11++) {
                int iKeyAt = sparseArray.keyAt(i11);
                ConstraintAttribute constraintAttributeValueAt = sparseArray.valueAt(i11);
                dArr[i11] = ((double) iKeyAt) * 0.01d;
                constraintAttributeValueAt.b(this.f40989g);
                int i12 = 0;
                while (true) {
                    float[] fArr = this.f40989g;
                    if (i12 < fArr.length) {
                        dArr2[i11][i12] = fArr[i12];
                        i12++;
                    }
                }
            }
            this.f35143a = p077g0.b.a(i10, dArr, dArr2);
        }

        @Override // p113j0.d
        public final void d(View view, float f10) {
            this.f35143a.d(f10, this.f40989g);
            p113j0.a.b(this.f40988f.valueAt(0), view, this.f40989g);
        }
    }

    /* JADX INFO: compiled from: ViewSpline.java */
    public static class c extends d {
        @Override // p113j0.d
        public final void d(View view, float f10) {
            view.setElevation(a(f10));
        }
    }

    /* JADX INFO: compiled from: ViewSpline.java */
    public static class e extends d {
        @Override // p113j0.d
        public final void d(View view, float f10) {
            view.setPivotX(a(f10));
        }
    }

    /* JADX INFO: compiled from: ViewSpline.java */
    public static class f extends d {
        @Override // p113j0.d
        public final void d(View view, float f10) {
            view.setPivotY(a(f10));
        }
    }

    /* JADX INFO: compiled from: ViewSpline.java */
    public static class g extends d {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f40990f;

        @Override // p113j0.d
        public final void d(View view, float f10) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f10));
                return;
            }
            if (this.f40990f) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f40990f = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(a(f10)));
                } catch (IllegalAccessException e10) {
                    Log.e("ViewSpline", "unable to setProgress", e10);
                } catch (InvocationTargetException e11) {
                    Log.e("ViewSpline", "unable to setProgress", e11);
                }
            }
        }
    }

    /* JADX INFO: compiled from: ViewSpline.java */
    public static class h extends d {
        @Override // p113j0.d
        public final void d(View view, float f10) {
            view.setRotation(a(f10));
        }
    }

    /* JADX INFO: compiled from: ViewSpline.java */
    public static class i extends d {
        @Override // p113j0.d
        public final void d(View view, float f10) {
            view.setRotationX(a(f10));
        }
    }

    /* JADX INFO: compiled from: ViewSpline.java */
    public static class j extends d {
        @Override // p113j0.d
        public final void d(View view, float f10) {
            view.setRotationY(a(f10));
        }
    }

    /* JADX INFO: compiled from: ViewSpline.java */
    public static class k extends d {
        @Override // p113j0.d
        public final void d(View view, float f10) {
            view.setScaleX(a(f10));
        }
    }

    /* JADX INFO: compiled from: ViewSpline.java */
    public static class l extends d {
        @Override // p113j0.d
        public final void d(View view, float f10) {
            view.setScaleY(a(f10));
        }
    }

    /* JADX INFO: compiled from: ViewSpline.java */
    public static class m extends d {
        @Override // p113j0.d
        public final void d(View view, float f10) {
            view.setTranslationX(a(f10));
        }
    }

    /* JADX INFO: compiled from: ViewSpline.java */
    public static class n extends d {
        @Override // p113j0.d
        public final void d(View view, float f10) {
            view.setTranslationY(a(f10));
        }
    }

    /* JADX INFO: compiled from: ViewSpline.java */
    public static class o extends d {
        @Override // p113j0.d
        public final void d(View view, float f10) {
            view.setTranslationZ(a(f10));
        }
    }

    public abstract void d(View view, float f10);

    /* JADX INFO: renamed from: j0.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ViewSpline.java */
    public static class C0466d extends d {
        @Override // p113j0.d
        public final void d(View view, float f10) {
        }
    }
}
