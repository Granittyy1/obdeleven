package p126k0;

import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p077g0.a;
import p077g0.b;
import p077g0.j;
import p077g0.o;
import p113j0.c;
import p113j0.d;
import p113j0.e;

/* JADX INFO: compiled from: MotionController.java */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public k[] f41331A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f41340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f41341c;
    public b[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a f41348k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int[] f41352o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public double[] f41353p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public double[] f41354q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String[] f41355r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int[] f41356s;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public HashMap<String, e> f41361x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public HashMap<String, d> f41362y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public HashMap<String, c> f41363z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f41339a = new Rect();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f41342d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f41343e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q f41344f = new q();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q f41345g = new q();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l f41346h = new l();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f41347i = new l();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f41349l = Float.NaN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f41350m = 0.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f41351n = 1.0f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float[] f41357t = new float[4];

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList<q> f41358u = new ArrayList<>();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float[] f41359v = new float[1];

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList<d> f41360w = new ArrayList<>();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f41332B = -1;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f41333C = -1;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public View f41334D = null;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f41335E = -1;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public float f41336F = Float.NaN;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Interpolator f41337G = null;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f41338H = false;

    public n(View view) {
        this.f41340b = view;
        this.f41341c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.a) {
            ((ConstraintLayout.a) layoutParams).getClass();
        }
    }

    public static void f(Rect rect, Rect rect2, int i10, int i11, int i12) {
        if (i10 == 1) {
            int i13 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i12 - ((rect.height() + i13) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i10 == 2) {
            int i14 = rect.left + rect.right;
            rect2.left = i11 - ((rect.width() + (rect.top + rect.bottom)) / 2);
            rect2.top = (i14 - rect.height()) / 2;
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i10 == 3) {
            int i15 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i15 / 2);
            rect2.top = i12 - ((rect.height() + i15) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i10 != 4) {
            return;
        }
        int i16 = rect.left + rect.right;
        rect2.left = i11 - ((rect.width() + (rect.bottom + rect.top)) / 2);
        rect2.top = (i16 - rect.height()) / 2;
        rect2.right = rect.width() + rect2.left;
        rect2.bottom = rect.height() + rect2.top;
    }

    public final float a(float f10, float[] fArr) {
        float f11 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f12 = this.f41351n;
            if (f12 != 1.0d) {
                float f13 = this.f41350m;
                if (f10 < f13) {
                    f10 = 0.0f;
                }
                if (f10 > f13 && f10 < 1.0d) {
                    f10 = Math.min((f10 - f13) * f12, 1.0f);
                }
            }
        }
        p077g0.c cVar = this.f41344f.f41368b;
        float f14 = Float.NaN;
        for (q qVar : this.f41358u) {
            p077g0.c cVar2 = qVar.f41368b;
            if (cVar2 != null) {
                float f15 = qVar.f41370d;
                if (f15 < f10) {
                    cVar = cVar2;
                    f11 = f15;
                } else if (Float.isNaN(f14)) {
                    f14 = qVar.f41370d;
                }
            }
        }
        if (cVar != null) {
            float f16 = (Float.isNaN(f14) ? 1.0f : f14) - f11;
            double d10 = (f10 - f11) / f16;
            f10 = (((float) cVar.a(d10)) * f16) + f11;
            if (fArr != null) {
                fArr[0] = (float) cVar.b(d10);
            }
        }
        return f10;
    }

    public final void b(double d10, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.j[0].c(d10, dArr);
        this.j[0].e(d10, dArr2);
        float f10 = 0.0f;
        Arrays.fill(fArr2, 0.0f);
        int[] iArr = this.f41352o;
        q qVar = this.f41344f;
        float f11 = qVar.f41372f;
        float f12 = qVar.f41373g;
        float f13 = qVar.f41374h;
        float f14 = qVar.f41375i;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            float f18 = (float) dArr[i10];
            float f19 = (float) dArr2[i10];
            int i11 = iArr[i10];
            if (i11 == 1) {
                f11 = f18;
                f10 = f19;
            } else if (i11 == 2) {
                f12 = f18;
                f17 = f19;
            } else if (i11 == 3) {
                f13 = f18;
                f15 = f19;
            } else if (i11 == 4) {
                f14 = f18;
                f16 = f19;
            }
        }
        float f20 = 2.0f;
        float f21 = (f15 / 2.0f) + f10;
        float fSin = (f16 / 2.0f) + f17;
        n nVar = qVar.f41379n;
        if (nVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            nVar.b(d10, fArr3, fArr4);
            float f22 = fArr3[0];
            float f23 = fArr3[1];
            float f24 = fArr4[0];
            float f25 = fArr4[1];
            double d11 = f11;
            double d12 = f12;
            float fSin2 = (float) (((Math.sin(d12) * d11) + ((double) f22)) - ((double) (f13 / 2.0f)));
            float fCos = (float) ((((double) f23) - (Math.cos(d12) * d11)) - ((double) (f14 / 2.0f)));
            double d13 = f24;
            double d14 = f10;
            double d15 = f17;
            float fCos2 = (float) ((Math.cos(d12) * d15) + (Math.sin(d12) * d14) + d13);
            fSin = (float) ((Math.sin(d12) * d15) + (((double) f25) - (Math.cos(d12) * d14)));
            f11 = fSin2;
            f12 = fCos;
            f21 = fCos2;
            f20 = 2.0f;
        }
        fArr[0] = (f13 / f20) + f11 + 0.0f;
        fArr[1] = (f14 / f20) + f12 + 0.0f;
        fArr2[0] = f21;
        fArr2[1] = fSin;
    }

    public final float c() {
        char c10;
        float[] fArr = new float[2];
        float f10 = 1.0f / 99;
        double d10 = 0.0d;
        double d11 = 0.0d;
        int i10 = 0;
        float fHypot = 0.0f;
        while (i10 < 100) {
            float f11 = i10 * f10;
            double dA = f11;
            p077g0.c cVar = this.f41344f.f41368b;
            float f12 = Float.NaN;
            float f13 = 0.0f;
            for (q qVar : this.f41358u) {
                p077g0.c cVar2 = qVar.f41368b;
                if (cVar2 != null) {
                    float f14 = qVar.f41370d;
                    if (f14 < f11) {
                        cVar = cVar2;
                        f13 = f14;
                    } else if (Float.isNaN(f12)) {
                        f12 = qVar.f41370d;
                    }
                }
            }
            if (cVar != null) {
                if (Float.isNaN(f12)) {
                    f12 = 1.0f;
                }
                float f15 = f12 - f13;
                dA = (((float) cVar.a((f11 - f13) / f15)) * f15) + f13;
            }
            this.j[0].c(dA, this.f41353p);
            int i11 = i10;
            this.f41344f.c(dA, this.f41352o, this.f41353p, fArr, 0);
            if (i11 > 0) {
                c10 = 0;
                fHypot += (float) Math.hypot(d11 - ((double) fArr[1]), d10 - ((double) fArr[0]));
            } else {
                c10 = 0;
            }
            d10 = fArr[c10];
            i10 = i11 + 1;
            d11 = fArr[1];
        }
        return fHypot;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x032d  */
    public final boolean d(float f10, long j, F6.a aVar, View view) {
        e.d dVar;
        boolean zE;
        float f11;
        int i10;
        boolean z10;
        double d10;
        q qVar;
        float f12;
        float f13;
        boolean z11;
        float f14;
        double d11;
        float f15;
        n nVar = this;
        View view2 = view;
        float fA = nVar.a(f10, null);
        int i11 = nVar.f41335E;
        if (i11 != -1) {
            float f16 = 1.0f / i11;
            float fFloor = ((float) Math.floor(fA / f16)) * f16;
            float f17 = (fA % f16) / f16;
            if (!Float.isNaN(nVar.f41336F)) {
                f17 = (f17 + nVar.f41336F) % 1.0f;
            }
            Interpolator interpolator = nVar.f41337G;
            fA = ((interpolator != null ? interpolator.getInterpolation(f17) : ((double) f17) > 0.5d ? 1.0f : 0.0f) * f16) + fFloor;
        }
        float f18 = fA;
        HashMap<String, d> map = nVar.f41362y;
        if (map != null) {
            Iterator<d> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().d(view2, f18);
            }
        }
        HashMap<String, e> map2 = nVar.f41361x;
        if (map2 != null) {
            dVar = null;
            zE = false;
            for (e eVar : map2.values()) {
                if (eVar instanceof e.d) {
                    dVar = (e.d) eVar;
                } else {
                    zE |= eVar.e(f18, j, aVar, view);
                }
            }
        } else {
            dVar = null;
            zE = false;
        }
        b[] bVarArr = nVar.j;
        q qVar2 = nVar.f41344f;
        if (bVarArr != null) {
            double d12 = f18;
            bVarArr[0].c(d12, nVar.f41353p);
            nVar.j[0].e(d12, nVar.f41354q);
            a aVar2 = nVar.f41348k;
            if (aVar2 != null) {
                double[] dArr = nVar.f41353p;
                if (dArr.length > 0) {
                    aVar2.c(d12, dArr);
                    nVar.f41348k.e(d12, nVar.f41354q);
                }
            }
            if (nVar.f41338H) {
                d10 = d12;
                qVar = qVar2;
            } else {
                int[] iArr = nVar.f41352o;
                double[] dArr2 = nVar.f41353p;
                double[] dArr3 = nVar.f41354q;
                boolean z12 = nVar.f41342d;
                float f19 = qVar2.f41372f;
                float f20 = qVar2.f41373g;
                float f21 = qVar2.f41374h;
                float f22 = qVar2.f41375i;
                if (iArr.length != 0) {
                    f13 = f19;
                    if (qVar2.f41382q.length <= iArr[iArr.length - 1]) {
                        int i12 = iArr[iArr.length - 1] + 1;
                        qVar2.f41382q = new double[i12];
                        qVar2.f41383r = new double[i12];
                    }
                } else {
                    f13 = f19;
                }
                Arrays.fill(qVar2.f41382q, Double.NaN);
                for (int i13 = 0; i13 < iArr.length; i13++) {
                    double[] dArr4 = qVar2.f41382q;
                    int i14 = iArr[i13];
                    dArr4[i14] = dArr2[i13];
                    qVar2.f41383r[i14] = dArr3[i13];
                }
                float f23 = Float.NaN;
                float f24 = f22;
                float f25 = f13;
                float fCos = f20;
                float f26 = 0.0f;
                int i15 = 0;
                float f27 = 0.0f;
                float f28 = 0.0f;
                float f29 = 0.0f;
                while (true) {
                    double[] dArr5 = qVar2.f41382q;
                    z11 = z12;
                    if (i15 >= dArr5.length) {
                        break;
                    }
                    if (Double.isNaN(dArr5[i15])) {
                        d11 = d12;
                        f15 = f23;
                    } else {
                        d11 = d12;
                        float f30 = (float) (Double.isNaN(qVar2.f41382q[i15]) ? 0.0d : qVar2.f41382q[i15] + 0.0d);
                        f15 = f23;
                        float f31 = (float) qVar2.f41383r[i15];
                        if (i15 == 1) {
                            f26 = f31;
                            f25 = f30;
                        } else if (i15 == 2) {
                            f29 = f31;
                            fCos = f30;
                        } else if (i15 == 3) {
                            f27 = f31;
                            f21 = f30;
                        } else if (i15 != 4) {
                            if (i15 == 5) {
                                f23 = f30;
                            }
                            i15++;
                            z12 = z11;
                            d12 = d11;
                        } else {
                            f28 = f31;
                            f24 = f30;
                        }
                    }
                    f23 = f15;
                    i15++;
                    z12 = z11;
                    d12 = d11;
                }
                d10 = d12;
                float f32 = f23;
                n nVar2 = qVar2.f41379n;
                if (nVar2 != null) {
                    float[] fArr = new float[2];
                    float[] fArr2 = new float[2];
                    nVar2.b(d10, fArr, fArr2);
                    float f33 = fArr[0];
                    float f34 = fArr[1];
                    qVar = qVar2;
                    float f35 = fArr2[0];
                    float f36 = fArr2[1];
                    double d13 = f25;
                    double d14 = fCos;
                    float fSin = (float) (((Math.sin(d14) * d13) + ((double) f33)) - ((double) (f21 / 2.0f)));
                    fCos = (float) ((((double) f34) - (Math.cos(d14) * d13)) - ((double) (f24 / 2.0f)));
                    double d15 = f26;
                    double d16 = f29;
                    float fCos2 = (float) ((Math.cos(d14) * d13 * d16) + (Math.sin(d14) * d15) + ((double) f35));
                    f14 = f21;
                    float fSin2 = (float) ((Math.sin(d14) * d13 * d16) + (((double) f36) - (Math.cos(d14) * d15)));
                    if (dArr3.length >= 2) {
                        dArr3[0] = fCos2;
                        dArr3[1] = fSin2;
                    }
                    if (Float.isNaN(f32)) {
                        view2 = view;
                    } else {
                        view2 = view;
                        view2.setRotation((float) (Math.toDegrees(Math.atan2(fSin2, fCos2)) + ((double) f32)));
                    }
                    f25 = fSin;
                } else {
                    float f37 = f26;
                    f14 = f21;
                    qVar = qVar2;
                    if (!Float.isNaN(f32)) {
                        view2.setRotation(((float) Math.toDegrees(Math.atan2((f28 / 2.0f) + f29, (f27 / 2.0f) + f37))) + f32 + 0.0f);
                    }
                }
                if (view2 instanceof c) {
                    ((c) view2).a();
                } else {
                    float f38 = f25 + 0.5f;
                    int i16 = (int) f38;
                    float f39 = fCos + 0.5f;
                    int i17 = (int) f39;
                    int i18 = (int) (f38 + f14);
                    int i19 = (int) (f39 + f24);
                    int i20 = i18 - i16;
                    int i21 = i19 - i17;
                    if (i20 != view.getMeasuredWidth() || i21 != view.getMeasuredHeight() || z11) {
                        view2.measure(View.MeasureSpec.makeMeasureSpec(i20, 1073741824), View.MeasureSpec.makeMeasureSpec(i21, 1073741824));
                    }
                    view2.layout(i16, i17, i18, i19);
                }
                nVar = this;
                nVar.f41342d = false;
            }
            if (nVar.f41333C != -1) {
                if (nVar.f41334D == null) {
                    nVar.f41334D = ((View) view.getParent()).findViewById(nVar.f41333C);
                }
                View view3 = nVar.f41334D;
                if (view3 != null) {
                    float bottom = (nVar.f41334D.getBottom() + view3.getTop()) / 2.0f;
                    float right = (nVar.f41334D.getRight() + nVar.f41334D.getLeft()) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        float left = right - view.getLeft();
                        float top = bottom - view.getTop();
                        view2.setPivotX(left);
                        view2.setPivotY(top);
                    }
                }
            }
            HashMap<String, d> map3 = nVar.f41362y;
            if (map3 != null) {
                for (d dVar2 : map3.values()) {
                    if (dVar2 instanceof d.C0466d) {
                        double[] dArr6 = nVar.f41354q;
                        if (dArr6.length > 1) {
                            f12 = f18;
                            view2.setRotation(((d.C0466d) dVar2).a(f12) + ((float) Math.toDegrees(Math.atan2(dArr6[1], dArr6[0]))));
                        } else {
                            f12 = f18;
                        }
                    } else {
                        f12 = f18;
                    }
                    f18 = f12;
                }
            }
            f11 = f18;
            if (dVar != 0) {
                double[] dArr7 = nVar.f41354q;
                i10 = 1;
                view2.setRotation(dVar.d(f11, j, aVar, view) + ((float) Math.toDegrees(Math.atan2(dArr7[1], dArr7[0]))));
                z10 = zE | dVar.f35178h;
            } else {
                i10 = 1;
                z10 = zE;
            }
            int i22 = i10;
            while (true) {
                b[] bVarArr2 = nVar.j;
                if (i22 >= bVarArr2.length) {
                    break;
                }
                b bVar = bVarArr2[i22];
                float[] fArr3 = nVar.f41357t;
                bVar.d(d10, fArr3);
                p113j0.a.b(qVar.f41380o.get(nVar.f41355r[i22 - 1]), view2, fArr3);
                i22++;
            }
            l lVar = nVar.f41346h;
            if (lVar.f41315c == 0) {
                if (f11 <= 0.0f) {
                    view2.setVisibility(lVar.f41316d);
                } else {
                    l lVar2 = nVar.f41347i;
                    if (f11 >= 1.0f) {
                        view2.setVisibility(lVar2.f41316d);
                    } else if (lVar2.f41316d != lVar.f41316d) {
                        view2.setVisibility(0);
                    }
                }
            }
            if (nVar.f41331A != null) {
                int i23 = 0;
                while (true) {
                    k[] kVarArr = nVar.f41331A;
                    if (i23 >= kVarArr.length) {
                        break;
                    }
                    kVarArr[i23].g(view2, f11);
                    i23++;
                }
            }
        } else {
            f11 = f18;
            boolean z13 = zE;
            i10 = 1;
            float f40 = qVar2.f41372f;
            q qVar3 = nVar.f41345g;
            float fB = Z3.n.b(qVar3.f41372f, f40, f11, f40);
            float f41 = qVar2.f41373g;
            float fB2 = Z3.n.b(qVar3.f41373g, f41, f11, f41);
            float f42 = qVar2.f41374h;
            float f43 = qVar3.f41374h;
            float fB3 = Z3.n.b(f43, f42, f11, f42);
            float f44 = qVar2.f41375i;
            float f45 = qVar3.f41375i;
            float f46 = fB + 0.5f;
            int i24 = (int) f46;
            float f47 = fB2 + 0.5f;
            int i25 = (int) f47;
            int i26 = (int) (f46 + fB3);
            int iB = (int) (f47 + Z3.n.b(f45, f44, f11, f44));
            int i27 = i26 - i24;
            int i28 = iB - i25;
            if (f43 != f42 || f45 != f44 || nVar.f41342d) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(i28, 1073741824));
                nVar.f41342d = false;
            }
            view2.layout(i24, i25, i26, iB);
            z10 = z13;
        }
        HashMap<String, c> map4 = nVar.f41363z;
        if (map4 != null) {
            for (c cVar : map4.values()) {
                if (cVar instanceof c.d) {
                    double[] dArr8 = nVar.f41354q;
                    view2.setRotation(((c.d) cVar).a(f11) + ((float) Math.toDegrees(Math.atan2(dArr8[i10], dArr8[0]))));
                } else {
                    cVar.e(view2, f11);
                }
            }
        }
        return z10;
    }

    public final void e(q qVar) {
        qVar.d((int) this.f41340b.getX(), (int) this.f41340b.getY(), this.f41340b.getWidth(), this.f41340b.getHeight());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:200:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:203:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:204:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:244:0x0779 A[PHI: r0 r1 r3 r6 r8 r10 r12 r13 r14 r15 r20 r22 r26 r38 r39 r46 r47
      0x0779: PHI (r0v120 java.lang.String) = 
      (r0v93 java.lang.String)
      (r0v94 java.lang.String)
      (r0v95 java.lang.String)
      (r0v96 java.lang.String)
      (r0v97 java.lang.String)
      (r0v98 java.lang.String)
      (r0v99 java.lang.String)
      (r0v100 java.lang.String)
      (r0v106 java.lang.String)
      (r0v112 java.lang.String)
      (r0v114 java.lang.String)
      (r0v121 java.lang.String)
     binds: [B:312:0x0a91, B:308:0x0a68, B:304:0x0a3d, B:300:0x0a11, B:297:0x09e1, B:293:0x09ab, B:289:0x0975, B:284:0x092b, B:279:0x08f1, B:260:0x0835, B:251:0x07b2, B:243:0x075b] A[DONT_GENERATE, DONT_INLINE]
      0x0779: PHI (r1v116 java.lang.Object) = 
      (r1v80 java.lang.Object)
      (r1v82 java.lang.Object)
      (r1v84 java.lang.Object)
      (r1v85 java.lang.Object)
      (r1v87 java.lang.Object)
      (r1v89 java.lang.Object)
      (r1v91 java.lang.Object)
      (r1v93 java.lang.Object)
      (r1v96 java.lang.Object)
      (r25v13 java.lang.Object)
      (r1v105 java.lang.Object)
      (r1v117 java.lang.Object)
     binds: [B:312:0x0a91, B:308:0x0a68, B:304:0x0a3d, B:300:0x0a11, B:297:0x09e1, B:293:0x09ab, B:289:0x0975, B:284:0x092b, B:279:0x08f1, B:260:0x0835, B:251:0x07b2, B:243:0x075b] A[DONT_GENERATE, DONT_INLINE]
      0x0779: PHI (r3v39 java.lang.String) = 
      (r3v20 java.lang.String)
      (r3v21 java.lang.String)
      (r3v22 java.lang.String)
      (r3v23 java.lang.String)
      (r3v24 java.lang.String)
      (r3v25 java.lang.String)
      (r3v26 java.lang.String)
      (r3v28 java.lang.String)
      (r3v31 java.lang.String)
      (r3v34 java.lang.String)
      (r3v36 java.lang.String)
      (r3v40 java.lang.String)
     binds: [B:312:0x0a91, B:308:0x0a68, B:304:0x0a3d, B:300:0x0a11, B:297:0x09e1, B:293:0x09ab, B:289:0x0975, B:284:0x092b, B:279:0x08f1, B:260:0x0835, B:251:0x07b2, B:243:0x075b] A[DONT_GENERATE, DONT_INLINE]
      0x0779: PHI (r6v104 java.lang.String) = 
      (r6v84 java.lang.String)
      (r6v85 java.lang.String)
      (r6v86 java.lang.String)
      (r6v87 java.lang.String)
      (r6v88 java.lang.String)
      (r6v89 java.lang.String)
      (r6v91 java.lang.String)
      (r6v93 java.lang.String)
      (r6v96 java.lang.String)
      (r6v99 java.lang.String)
      (r6v101 java.lang.String)
      (r6v105 java.lang.String)
     binds: [B:312:0x0a91, B:308:0x0a68, B:304:0x0a3d, B:300:0x0a11, B:297:0x09e1, B:293:0x09ab, B:289:0x0975, B:284:0x092b, B:279:0x08f1, B:260:0x0835, B:251:0x07b2, B:243:0x075b] A[DONT_GENERATE, DONT_INLINE]
      0x0779: PHI (r8v80 java.lang.String) = 
      (r8v57 java.lang.String)
      (r8v58 java.lang.String)
      (r8v59 java.lang.String)
      (r8v60 java.lang.String)
      (r8v62 java.lang.String)
      (r8v64 java.lang.String)
      (r8v66 java.lang.String)
      (r8v68 java.lang.String)
      (r8v71 java.lang.String)
      (r8v74 java.lang.String)
      (r8v76 java.lang.String)
      (r8v81 java.lang.String)
     binds: [B:312:0x0a91, B:308:0x0a68, B:304:0x0a3d, B:300:0x0a11, B:297:0x09e1, B:293:0x09ab, B:289:0x0975, B:284:0x092b, B:279:0x08f1, B:260:0x0835, B:251:0x07b2, B:243:0x075b] A[DONT_GENERATE, DONT_INLINE]
      0x0779: PHI (r10v57 java.lang.String) = 
      (r10v38 java.lang.String)
      (r10v39 java.lang.String)
      (r10v40 java.lang.String)
      (r10v41 java.lang.String)
      (r10v42 java.lang.String)
      (r10v44 java.lang.String)
      (r10v46 java.lang.String)
      (r10v47 java.lang.String)
      (r10v49 java.lang.String)
      (r10v52 java.lang.String)
      (r10v54 java.lang.String)
      (r10v58 java.lang.String)
     binds: [B:312:0x0a91, B:308:0x0a68, B:304:0x0a3d, B:300:0x0a11, B:297:0x09e1, B:293:0x09ab, B:289:0x0975, B:284:0x092b, B:279:0x08f1, B:260:0x0835, B:251:0x07b2, B:243:0x075b] A[DONT_GENERATE, DONT_INLINE]
      0x0779: PHI (r12v45 java.lang.String) = 
      (r12v18 java.lang.String)
      (r12v19 java.lang.String)
      (r12v20 java.lang.String)
      (r12v21 java.lang.String)
      (r12v22 java.lang.String)
      (r12v23 java.lang.String)
      (r12v24 java.lang.String)
      (r12v25 java.lang.String)
      (r12v31 java.lang.String)
      (r12v37 java.lang.String)
      (r12v42 java.lang.String)
      (r12v46 java.lang.String)
     binds: [B:312:0x0a91, B:308:0x0a68, B:304:0x0a3d, B:300:0x0a11, B:297:0x09e1, B:293:0x09ab, B:289:0x0975, B:284:0x092b, B:279:0x08f1, B:260:0x0835, B:251:0x07b2, B:243:0x075b] A[DONT_GENERATE, DONT_INLINE]
      0x0779: PHI (r13v40 java.lang.Object) = 
      (r13v12 java.lang.Object)
      (r13v13 java.lang.Object)
      (r13v14 java.lang.Object)
      (r13v15 java.lang.Object)
      (r13v16 java.lang.Object)
      (r13v17 java.lang.Object)
      (r13v18 java.lang.Object)
      (r13v19 java.lang.Object)
      (r13v25 java.lang.Object)
      (r13v31 java.lang.Object)
      (r13v37 java.lang.Object)
      (r13v41 java.lang.Object)
     binds: [B:312:0x0a91, B:308:0x0a68, B:304:0x0a3d, B:300:0x0a11, B:297:0x09e1, B:293:0x09ab, B:289:0x0975, B:284:0x092b, B:279:0x08f1, B:260:0x0835, B:251:0x07b2, B:243:0x075b] A[DONT_GENERATE, DONT_INLINE]
      0x0779: PHI (r14v40 java.lang.String) = 
      (r14v15 java.lang.String)
      (r14v16 java.lang.String)
      (r14v17 java.lang.String)
      (r14v18 java.lang.String)
      (r14v19 java.lang.String)
      (r14v20 java.lang.String)
      (r14v21 java.lang.String)
      (r14v22 java.lang.String)
      (r14v28 java.lang.String)
      (r14v35 java.lang.String)
      (r14v37 java.lang.String)
      (r14v41 java.lang.String)
     binds: [B:312:0x0a91, B:308:0x0a68, B:304:0x0a3d, B:300:0x0a11, B:297:0x09e1, B:293:0x09ab, B:289:0x0975, B:284:0x092b, B:279:0x08f1, B:260:0x0835, B:251:0x07b2, B:243:0x075b] A[DONT_GENERATE, DONT_INLINE]
      0x0779: PHI (r15v34 java.lang.String) = 
      (r15v8 java.lang.String)
      (r15v9 java.lang.String)
      (r15v10 java.lang.String)
      (r15v11 java.lang.String)
      (r15v12 java.lang.String)
      (r15v13 java.lang.String)
      (r15v14 java.lang.String)
      (r15v15 java.lang.String)
      (r15v23 java.lang.String)
      (r15v29 java.lang.String)
      (r15v31 java.lang.String)
      (r15v35 java.lang.String)
     binds: [B:312:0x0a91, B:308:0x0a68, B:304:0x0a3d, B:300:0x0a11, B:297:0x09e1, B:293:0x09ab, B:289:0x0975, B:284:0x092b, B:279:0x08f1, B:260:0x0835, B:251:0x07b2, B:243:0x075b] A[DONT_GENERATE, DONT_INLINE]
      0x0779: PHI (r20v39 k0.q) = 
      (r20v4 k0.q)
      (r20v5 k0.q)
      (r20v6 k0.q)
      (r20v7 k0.q)
      (r20v8 k0.q)
      (r20v11 k0.q)
      (r20v14 k0.q)
      (r20v17 k0.q)
      (r10v36 k0.q)
      (r10v36 k0.q)
      (r20v36 k0.q)
      (r20v40 k0.q)
     binds: [B:312:0x0a91, B:308:0x0a68, B:304:0x0a3d, B:300:0x0a11, B:297:0x09e1, B:293:0x09ab, B:289:0x0975, B:284:0x092b, B:279:0x08f1, B:260:0x0835, B:251:0x07b2, B:243:0x075b] A[DONT_GENERATE, DONT_INLINE]
      0x0779: PHI (r22v32 java.util.HashSet<java.lang.String>) = 
      (r22v4 java.util.HashSet<java.lang.String>)
      (r22v5 java.util.HashSet<java.lang.String>)
      (r22v6 java.util.HashSet<java.lang.String>)
      (r22v7 java.util.HashSet<java.lang.String>)
      (r22v8 java.util.HashSet<java.lang.String>)
      (r22v9 java.util.HashSet<java.lang.String>)
      (r22v10 java.util.HashSet<java.lang.String>)
      (r22v12 java.util.HashSet<java.lang.String>)
      (r3v18 java.util.HashSet<java.lang.String>)
      (r3v18 java.util.HashSet<java.lang.String>)
      (r22v29 java.util.HashSet<java.lang.String>)
      (r22v33 java.util.HashSet<java.lang.String>)
     binds: [B:312:0x0a91, B:308:0x0a68, B:304:0x0a3d, B:300:0x0a11, B:297:0x09e1, B:293:0x09ab, B:289:0x0975, B:284:0x092b, B:279:0x08f1, B:260:0x0835, B:251:0x07b2, B:243:0x075b] A[DONT_GENERATE, DONT_INLINE]
      0x0779: PHI (r26v34 k0.q) = 
      (r26v6 k0.q)
      (r26v7 k0.q)
      (r26v8 k0.q)
      (r26v9 k0.q)
      (r26v10 k0.q)
      (r26v11 k0.q)
      (r26v12 k0.q)
      (r26v14 k0.q)
      (r8v48 k0.q)
      (r8v48 k0.q)
      (r26v31 k0.q)
      (r26v35 k0.q)
     binds: [B:312:0x0a91, B:308:0x0a68, B:304:0x0a3d, B:300:0x0a11, B:297:0x09e1, B:293:0x09ab, B:289:0x0975, B:284:0x092b, B:279:0x08f1, B:260:0x0835, B:251:0x07b2, B:243:0x075b] A[DONT_GENERATE, DONT_INLINE]
      0x0779: PHI (r38v9 java.lang.String) = 
      (r38v2 java.lang.String)
      (r38v2 java.lang.String)
      (r38v2 java.lang.String)
      (r38v2 java.lang.String)
      (r38v2 java.lang.String)
      (r38v2 java.lang.String)
      (r38v2 java.lang.String)
      (r38v2 java.lang.String)
      (r38v7 java.lang.String)
      (r38v2 java.lang.String)
      (r38v2 java.lang.String)
      (r38v2 java.lang.String)
     binds: [B:312:0x0a91, B:308:0x0a68, B:304:0x0a3d, B:300:0x0a11, B:297:0x09e1, B:293:0x09ab, B:289:0x0975, B:284:0x092b, B:279:0x08f1, B:260:0x0835, B:251:0x07b2, B:243:0x075b] A[DONT_GENERATE, DONT_INLINE]
      0x0779: PHI (r39v9 java.lang.String) = 
      (r39v2 java.lang.String)
      (r39v2 java.lang.String)
      (r39v2 java.lang.String)
      (r39v2 java.lang.String)
      (r39v2 java.lang.String)
      (r39v2 java.lang.String)
      (r39v2 java.lang.String)
      (r39v2 java.lang.String)
      (r39v7 java.lang.String)
      (r39v2 java.lang.String)
      (r39v2 java.lang.String)
      (r39v2 java.lang.String)
     binds: [B:312:0x0a91, B:308:0x0a68, B:304:0x0a3d, B:300:0x0a11, B:297:0x09e1, B:293:0x09ab, B:289:0x0975, B:284:0x092b, B:279:0x08f1, B:260:0x0835, B:251:0x07b2, B:243:0x075b] A[DONT_GENERATE, DONT_INLINE]
      0x0779: PHI (r46v31 java.util.ArrayList<k0.q>) = 
      (r46v3 java.util.ArrayList<k0.q>)
      (r46v4 java.util.ArrayList<k0.q>)
      (r46v5 java.util.ArrayList<k0.q>)
      (r46v6 java.util.ArrayList<k0.q>)
      (r46v7 java.util.ArrayList<k0.q>)
      (r46v8 java.util.ArrayList<k0.q>)
      (r46v9 java.util.ArrayList<k0.q>)
      (r46v11 java.util.ArrayList<k0.q>)
      (r1v68 java.util.ArrayList<k0.q>)
      (r1v68 java.util.ArrayList<k0.q>)
      (r46v28 java.util.ArrayList<k0.q>)
      (r46v32 java.util.ArrayList<k0.q>)
     binds: [B:312:0x0a91, B:308:0x0a68, B:304:0x0a3d, B:300:0x0a11, B:297:0x09e1, B:293:0x09ab, B:289:0x0975, B:284:0x092b, B:279:0x08f1, B:260:0x0835, B:251:0x07b2, B:243:0x075b] A[DONT_GENERATE, DONT_INLINE]
      0x0779: PHI (r47v33 java.util.HashSet<java.lang.String>) = 
      (r47v5 java.util.HashSet<java.lang.String>)
      (r47v6 java.util.HashSet<java.lang.String>)
      (r47v7 java.util.HashSet<java.lang.String>)
      (r47v8 java.util.HashSet<java.lang.String>)
      (r47v9 java.util.HashSet<java.lang.String>)
      (r47v10 java.util.HashSet<java.lang.String>)
      (r47v11 java.util.HashSet<java.lang.String>)
      (r47v13 java.util.HashSet<java.lang.String>)
      (r6v82 java.util.HashSet<java.lang.String>)
      (r6v82 java.util.HashSet<java.lang.String>)
      (r47v30 java.util.HashSet<java.lang.String>)
      (r47v34 java.util.HashSet<java.lang.String>)
     binds: [B:312:0x0a91, B:308:0x0a68, B:304:0x0a3d, B:300:0x0a11, B:297:0x09e1, B:293:0x09ab, B:289:0x0975, B:284:0x092b, B:279:0x08f1, B:260:0x0835, B:251:0x07b2, B:243:0x075b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:387:0x0c8d  */
    /* JADX WARN: Code duplicated, block: B:459:0x0ded  */
    /* JADX WARN: Failed to find 'out' block for switch in B:439:0x0d54. Please report as an issue. */
    /* JADX WARN: Instruction removed from duplicated block: B:200:0x05cd, please report this as an issue */
    public final void g(long j, int i10, int i11) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        ArrayList<d> arrayList;
        String str7;
        String str8;
        String str9;
        ArrayList<q> arrayList2;
        String str10;
        String str11;
        String str12;
        n nVar;
        String str13;
        HashSet<String> hashSet;
        HashMap<String, Integer> map;
        q qVar;
        HashSet<String> hashSet2;
        HashSet<String> hashSet3;
        ArrayList arrayList3;
        ArrayList<q> arrayList4;
        HashSet<String> hashSet4;
        HashSet<String> hashSet5;
        q qVar2;
        q qVar3;
        Object obj;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        int i12;
        ConstraintAttribute constraintAttribute;
        String str23;
        HashSet<String> hashSet6;
        Iterator<String> it;
        String str24;
        Object obj2;
        Object obj3;
        String str25;
        String str26;
        byte b10;
        byte b11;
        o gVar;
        o oVar;
        o oVar2;
        e.b bVar;
        ConstraintAttribute constraintAttribute2;
        Integer num;
        Iterator<String> it2;
        Object obj4;
        String str27;
        String str28;
        String str29;
        String str30;
        String str31;
        byte b12;
        byte b13;
        byte b14;
        j iVar;
        j jVar;
        j kVar;
        j jVar2;
        ConstraintAttribute constraintAttribute3;
        String str32;
        String str33;
        String str34;
        ArrayList<q> arrayList5;
        String str35;
        String str36;
        String str37;
        n nVar2;
        String str38;
        q qVar4;
        HashSet<String> hashSet7;
        HashSet<String> hashSet8;
        HashMap<String, Integer> map2;
        HashSet<String> hashSet9;
        h hVar;
        float f10;
        int i13;
        int iBinarySearch;
        int i14;
        float fMin;
        float fB;
        String str39 = "transformPivotY";
        String str40 = "transformPivotX";
        String str41 = "scaleY";
        String str42 = "scaleX";
        String str43 = "progress";
        String str44 = "transitionPathRotate";
        String str45 = "rotation";
        String str46 = "alpha";
        new HashSet();
        HashSet<String> hashSet10 = new HashSet<>();
        HashSet<String> hashSet11 = new HashSet<>();
        HashSet<String> hashSet12 = new HashSet<>();
        HashMap<String, Integer> map3 = new HashMap<>();
        int i15 = this.f41332B;
        q qVar5 = this.f41344f;
        if (i15 != -1) {
            qVar5.f41376k = i15;
        }
        l lVar = this.f41346h;
        float f11 = lVar.f41318f;
        q qVar6 = qVar5;
        l lVar2 = this.f41347i;
        if (l.b(f11, lVar2.f41318f)) {
            hashSet11.add("alpha");
        }
        if (l.b(lVar.f41319g, lVar2.f41319g)) {
            hashSet11.add("elevation");
        }
        int i16 = lVar.f41316d;
        int i17 = lVar2.f41316d;
        Object obj5 = "elevation";
        if (i16 != i17 && lVar.f41315c == 0 && (i16 == 0 || i17 == 0)) {
            hashSet11.add("alpha");
        }
        if (l.b(lVar.f41320h, lVar2.f41320h)) {
            hashSet11.add("rotation");
        }
        if (!Float.isNaN(lVar.f41328q) || !Float.isNaN(lVar2.f41328q)) {
            hashSet11.add("transitionPathRotate");
        }
        if (!Float.isNaN(lVar.f41329r) || !Float.isNaN(lVar2.f41329r)) {
            hashSet11.add("progress");
        }
        if (l.b(lVar.f41321i, lVar2.f41321i)) {
            hashSet11.add("rotationX");
        }
        if (l.b(lVar.f41314b, lVar2.f41314b)) {
            hashSet11.add("rotationY");
        }
        if (l.b(lVar.f41323l, lVar2.f41323l)) {
            hashSet11.add("transformPivotX");
        }
        if (l.b(lVar.f41324m, lVar2.f41324m)) {
            hashSet11.add("transformPivotY");
        }
        if (l.b(lVar.j, lVar2.j)) {
            hashSet11.add("scaleX");
        }
        if (l.b(lVar.f41322k, lVar2.f41322k)) {
            hashSet11.add("scaleY");
        }
        if (l.b(lVar.f41325n, lVar2.f41325n)) {
            str = "translationX";
            hashSet11.add(str);
        } else {
            str = "translationX";
        }
        if (l.b(lVar.f41326o, lVar2.f41326o)) {
            str2 = "translationY";
            hashSet11.add(str2);
        } else {
            str2 = "translationY";
        }
        if (l.b(lVar.f41327p, lVar2.f41327p)) {
            str3 = "translationZ";
            hashSet11.add(str3);
        } else {
            str3 = "translationZ";
        }
        n nVar3 = this;
        ArrayList<d> arrayList6 = nVar3.f41360w;
        Object obj6 = "rotationX";
        q qVar7 = nVar3.f41345g;
        Object obj7 = "rotationY";
        ArrayList<q> arrayList7 = nVar3.f41358u;
        String str47 = str;
        if (arrayList6 != null) {
            ArrayList arrayList8 = null;
            for (d dVar : arrayList6) {
                String str48 = str2;
                if (dVar instanceof h) {
                    h hVar2 = (h) dVar;
                    q qVar8 = new q();
                    str33 = str3;
                    qVar8.f41369c = 0;
                    qVar8.j = Float.NaN;
                    qVar8.f41376k = -1;
                    qVar8.f41377l = -1;
                    qVar8.f41378m = Float.NaN;
                    qVar8.f41379n = null;
                    qVar8.f41380o = new LinkedHashMap<>();
                    qVar8.f41381p = 0;
                    str35 = str43;
                    qVar8.f41382q = new double[18];
                    qVar8.f41383r = new double[18];
                    qVar4 = qVar6;
                    str34 = str42;
                    if (qVar4.f41377l != -1) {
                        float f12 = hVar2.f41227a / 100.0f;
                        qVar8.f41370d = f12;
                        qVar8.f41369c = hVar2.f41269h;
                        qVar8.f41381p = hVar2.f41275o;
                        float f13 = Float.isNaN(hVar2.f41270i) ? f12 : hVar2.f41270i;
                        float f14 = Float.isNaN(hVar2.j) ? f12 : hVar2.j;
                        float f15 = qVar7.f41374h;
                        str32 = str39;
                        float f16 = qVar4.f41374h;
                        str37 = str45;
                        float f17 = qVar7.f41375i;
                        str36 = str44;
                        float f18 = qVar4.f41375i;
                        str38 = str46;
                        qVar8.f41371e = qVar8.f41370d;
                        qVar8.f41374h = (int) (((f15 - f16) * f13) + f16);
                        qVar8.f41375i = (int) (((f17 - f18) * f14) + f18);
                        if (hVar2.f41275o != 2) {
                            float f19 = Float.isNaN(hVar2.f41271k) ? f12 : hVar2.f41271k;
                            float f20 = qVar7.f41372f;
                            float f21 = qVar4.f41372f;
                            qVar8.f41372f = Z3.n.b(f20, f21, f19, f21);
                            if (!Float.isNaN(hVar2.f41272l)) {
                                f12 = hVar2.f41272l;
                            }
                            float f22 = qVar7.f41373g;
                            float f23 = qVar4.f41373g;
                            qVar8.f41373g = Z3.n.b(f22, f23, f12, f23);
                        } else {
                            if (Float.isNaN(hVar2.f41271k)) {
                                float f24 = qVar7.f41372f;
                                float f25 = qVar4.f41372f;
                                fMin = Z3.n.b(f24, f25, f12, f25);
                            } else {
                                fMin = hVar2.f41271k * Math.min(f14, f13);
                            }
                            qVar8.f41372f = fMin;
                            if (Float.isNaN(hVar2.f41272l)) {
                                float f26 = qVar7.f41373g;
                                float f27 = qVar4.f41373g;
                                fB = Z3.n.b(f26, f27, f12, f27);
                            } else {
                                fB = hVar2.f41272l;
                            }
                            qVar8.f41373g = fB;
                        }
                        qVar8.f41377l = qVar4.f41377l;
                        qVar8.f41368b = p077g0.c.c(hVar2.f41267f);
                        qVar8.f41376k = hVar2.f41268g;
                    } else {
                        str32 = str39;
                        str40 = str40;
                        str41 = str41;
                        str36 = str44;
                        str37 = str45;
                        str38 = str46;
                        int i18 = hVar2.f41275o;
                        if (i18 != 1) {
                            if (i18 == 2) {
                                hashSet11 = hashSet11;
                                arrayList6 = arrayList6;
                                ArrayList<q> arrayList9 = arrayList7;
                                float f28 = hVar2.f41227a / 100.0f;
                                qVar8.f41370d = f28;
                                qVar8.f41369c = hVar2.f41269h;
                                float f29 = Float.isNaN(hVar2.f41270i) ? f28 : hVar2.f41270i;
                                float f30 = Float.isNaN(hVar2.j) ? f28 : hVar2.j;
                                float f31 = qVar7.f41374h;
                                float f32 = qVar4.f41374h;
                                float f33 = f31 - f32;
                                float f34 = qVar7.f41375i;
                                float f35 = qVar4.f41375i;
                                float f36 = f34 - f35;
                                qVar8.f41371e = qVar8.f41370d;
                                float f37 = qVar4.f41372f;
                                float f38 = qVar4.f41373g;
                                float f39 = (f31 / 2.0f) + qVar7.f41372f;
                                float f40 = (f34 / 2.0f) + qVar7.f41373g;
                                float f41 = f33 * f29;
                                qVar8.f41372f = (int) ((((f39 - ((f32 / 2.0f) + f37)) * f28) + f37) - (f41 / 2.0f));
                                float f42 = f36 * f30;
                                qVar8.f41373g = (int) ((((f40 - ((f35 / 2.0f) + f38)) * f28) + f38) - (f42 / 2.0f));
                                qVar8.f41374h = (int) (f32 + f41);
                                qVar8.f41375i = (int) (f35 + f42);
                                qVar8.f41381p = 2;
                                if (!Float.isNaN(hVar2.f41271k)) {
                                    qVar8.f41372f = (int) (hVar2.f41271k * (i10 - ((int) qVar8.f41374h)));
                                }
                                if (!Float.isNaN(hVar2.f41272l)) {
                                    qVar8.f41373g = (int) (hVar2.f41272l * (i11 - ((int) qVar8.f41375i)));
                                }
                                qVar8.f41377l = qVar8.f41377l;
                                qVar8.f41368b = p077g0.c.c(hVar2.f41267f);
                                qVar8.f41376k = hVar2.f41268g;
                                hVar = hVar2;
                                arrayList5 = arrayList9;
                                qVar4 = qVar4;
                            } else if (i18 != 3) {
                                float f43 = hVar2.f41227a / 100.0f;
                                qVar8.f41370d = f43;
                                qVar8.f41369c = hVar2.f41269h;
                                float f44 = Float.isNaN(hVar2.f41270i) ? f43 : hVar2.f41270i;
                                float f45 = Float.isNaN(hVar2.j) ? f43 : hVar2.j;
                                float f46 = qVar7.f41374h;
                                float f47 = qVar4.f41374h;
                                float f48 = f46 - f47;
                                float f49 = qVar7.f41375i;
                                float f50 = qVar4.f41375i;
                                float f51 = f49 - f50;
                                qVar8.f41371e = qVar8.f41370d;
                                float f52 = qVar4.f41372f;
                                float f53 = qVar4.f41373g;
                                float f54 = ((f46 / 2.0f) + qVar7.f41372f) - ((f47 / 2.0f) + f52);
                                float f55 = ((f49 / 2.0f) + qVar7.f41373g) - ((f50 / 2.0f) + f53);
                                float f56 = (f54 * f43) + f52;
                                float f57 = f48 * f44;
                                float f58 = f57 / 2.0f;
                                qVar8.f41372f = (int) (f56 - f58);
                                float f59 = (f55 * f43) + f53;
                                float f60 = f51 * f45;
                                float f61 = f60 / 2.0f;
                                qVar8.f41373g = (int) (f59 - f61);
                                qVar8.f41374h = (int) (f47 + f57);
                                qVar8.f41375i = (int) (f50 + f60);
                                float f62 = Float.isNaN(hVar2.f41271k) ? f43 : hVar2.f41271k;
                                float f63 = Float.isNaN(hVar2.f41274n) ? 0.0f : hVar2.f41274n;
                                if (!Float.isNaN(hVar2.f41272l)) {
                                    f43 = hVar2.f41272l;
                                }
                                float f64 = Float.isNaN(hVar2.f41273m) ? 0.0f : hVar2.f41273m;
                                qVar8.f41381p = 0;
                                qVar8.f41372f = (int) (((f64 * f55) + ((f62 * f54) + qVar4.f41372f)) - f58);
                                qVar8.f41373g = (int) (((f55 * f43) + ((f54 * f63) + qVar4.f41373g)) - f61);
                                qVar8.f41368b = p077g0.c.c(hVar2.f41267f);
                                qVar8.f41376k = hVar2.f41268g;
                            } else {
                                float f65 = hVar2.f41227a / 100.0f;
                                qVar8.f41370d = f65;
                                qVar8.f41369c = hVar2.f41269h;
                                float f66 = Float.isNaN(hVar2.f41270i) ? f65 : hVar2.f41270i;
                                float f67 = Float.isNaN(hVar2.j) ? f65 : hVar2.j;
                                float f68 = qVar7.f41374h;
                                float f69 = qVar4.f41374h;
                                float f70 = f68 - f69;
                                float f71 = qVar7.f41375i;
                                float f72 = qVar4.f41375i;
                                float f73 = f71 - f72;
                                qVar8.f41371e = qVar8.f41370d;
                                float f74 = qVar4.f41372f;
                                float f75 = (f69 / 2.0f) + f74;
                                float f76 = qVar4.f41373g;
                                float f77 = (f72 / 2.0f) + f76;
                                float f78 = (f68 / 2.0f) + qVar7.f41372f;
                                float f79 = (f71 / 2.0f) + qVar7.f41373g;
                                if (f75 > f78) {
                                    f75 = f78;
                                    f78 = f75;
                                }
                                if (f77 <= f79) {
                                    f77 = f79;
                                    f79 = f77;
                                }
                                float f80 = f78 - f75;
                                float f81 = f77 - f79;
                                float f82 = f70 * f66;
                                float f83 = f82 / 2.0f;
                                qVar8.f41372f = (int) (((f80 * f65) + f74) - f83);
                                float f84 = f73 * f67;
                                float f85 = f84 / 2.0f;
                                qVar8.f41373g = (int) (((f81 * f65) + f76) - f85);
                                qVar8.f41374h = (int) (f69 + f82);
                                qVar8.f41375i = (int) (f72 + f84);
                                float f86 = Float.isNaN(hVar2.f41271k) ? f65 : hVar2.f41271k;
                                float f87 = Float.isNaN(hVar2.f41274n) ? 0.0f : hVar2.f41274n;
                                if (!Float.isNaN(hVar2.f41272l)) {
                                    f65 = hVar2.f41272l;
                                }
                                if (Float.isNaN(hVar2.f41273m)) {
                                    i13 = 0;
                                    f10 = 0.0f;
                                } else {
                                    f10 = hVar2.f41273m;
                                    i13 = 0;
                                }
                                qVar8.f41381p = i13;
                                qVar8.f41372f = (int) (((f10 * f81) + ((f86 * f80) + qVar4.f41372f)) - f83);
                                qVar8.f41373g = (int) (((f81 * f65) + ((f80 * f87) + qVar4.f41373g)) - f85);
                                qVar8.f41368b = p077g0.c.c(hVar2.f41267f);
                                qVar8.f41376k = hVar2.f41268g;
                                hVar = hVar2;
                                qVar4 = qVar4;
                            }
                            iBinarySearch = Collections.binarySearch(arrayList5, qVar8);
                            if (iBinarySearch == 0) {
                                Log.e("MotionController", " KeyPath position \"" + qVar8.f41371e + "\" outside of range");
                            }
                            arrayList5.add((-iBinarySearch) - 1, qVar8);
                            i14 = hVar.f41277e;
                            if (i14 != -1) {
                                nVar2 = this;
                                nVar2.f41343e = i14;
                            } else {
                                nVar2 = this;
                            }
                            hashSet8 = hashSet10;
                            hashSet7 = hashSet12;
                        } else {
                            float f88 = hVar2.f41227a / 100.0f;
                            qVar8.f41370d = f88;
                            qVar8.f41369c = hVar2.f41269h;
                            float f89 = Float.isNaN(hVar2.f41270i) ? f88 : hVar2.f41270i;
                            float f90 = Float.isNaN(hVar2.j) ? f88 : hVar2.j;
                            float f91 = qVar7.f41374h - qVar4.f41374h;
                            float f92 = qVar7.f41375i - qVar4.f41375i;
                            qVar8.f41371e = qVar8.f41370d;
                            if (!Float.isNaN(hVar2.f41271k)) {
                                f88 = hVar2.f41271k;
                            }
                            float f93 = qVar4.f41372f;
                            float f94 = qVar4.f41374h;
                            float f95 = qVar4.f41373g;
                            float f96 = qVar4.f41375i;
                            float f97 = ((qVar7.f41374h / 2.0f) + qVar7.f41372f) - ((f94 / 2.0f) + f93);
                            float f98 = ((qVar7.f41375i / 2.0f) + qVar7.f41373g) - ((f96 / 2.0f) + f95);
                            float f99 = f97 * f88;
                            float f100 = f91 * f89;
                            float f101 = f100 / 2.0f;
                            qVar8.f41372f = (int) ((f93 + f99) - f101);
                            float f102 = f88 * f98;
                            float f103 = f92 * f90;
                            float f104 = f103 / 2.0f;
                            qVar8.f41373g = (int) ((f95 + f102) - f104);
                            qVar8.f41374h = (int) (f94 + f100);
                            qVar8.f41375i = (int) (f96 + f103);
                            hVar = hVar2;
                            float f105 = Float.isNaN(hVar.f41272l) ? 0.0f : hVar.f41272l;
                            qVar8.f41381p = 1;
                            qVar4 = qVar4;
                            float f106 = (int) ((qVar4.f41372f + f99) - f101);
                            float f107 = (int) ((qVar4.f41373g + f102) - f104);
                            qVar8.f41372f = f106 + ((-f98) * f105);
                            qVar8.f41373g = f107 + (f97 * f105);
                            qVar8.f41377l = qVar8.f41377l;
                            qVar8.f41368b = p077g0.c.c(hVar.f41267f);
                            qVar8.f41376k = hVar.f41268g;
                        }
                        arrayList5 = arrayList7;
                        iBinarySearch = Collections.binarySearch(arrayList5, qVar8);
                        if (iBinarySearch == 0) {
                            Log.e("MotionController", " KeyPath position \"" + qVar8.f41371e + "\" outside of range");
                        }
                        arrayList5.add((-iBinarySearch) - 1, qVar8);
                        i14 = hVar.f41277e;
                        if (i14 != -1) {
                            nVar2 = this;
                            nVar2.f41343e = i14;
                        } else {
                            nVar2 = this;
                        }
                        hashSet8 = hashSet10;
                        hashSet7 = hashSet12;
                    }
                    arrayList5 = arrayList7;
                    hVar = hVar2;
                    iBinarySearch = Collections.binarySearch(arrayList5, qVar8);
                    if (iBinarySearch == 0) {
                        Log.e("MotionController", " KeyPath position \"" + qVar8.f41371e + "\" outside of range");
                    }
                    arrayList5.add((-iBinarySearch) - 1, qVar8);
                    i14 = hVar.f41277e;
                    if (i14 != -1) {
                        nVar2 = this;
                        nVar2.f41343e = i14;
                    } else {
                        nVar2 = this;
                    }
                    hashSet8 = hashSet10;
                    hashSet7 = hashSet12;
                } else {
                    str32 = str39;
                    str40 = str40;
                    hashSet11 = hashSet11;
                    str33 = str3;
                    arrayList6 = arrayList6;
                    str41 = str41;
                    str34 = str42;
                    arrayList5 = arrayList7;
                    str35 = str43;
                    str36 = str44;
                    str37 = str45;
                    nVar2 = nVar3;
                    str38 = str46;
                    qVar4 = qVar6;
                    if (dVar instanceof f) {
                        hashSet7 = hashSet12;
                        dVar.d(hashSet7);
                        hashSet8 = hashSet10;
                    } else {
                        hashSet7 = hashSet12;
                        if (dVar instanceof j) {
                            hashSet8 = hashSet10;
                            dVar.d(hashSet8);
                        } else {
                            hashSet8 = hashSet10;
                            if (dVar instanceof k) {
                                if (arrayList8 == null) {
                                    arrayList8 = new ArrayList();
                                }
                                ArrayList arrayList10 = arrayList8;
                                arrayList10.add((k) dVar);
                                arrayList8 = arrayList10;
                            } else {
                                map2 = map3;
                                dVar.f(map2);
                                hashSet9 = hashSet11;
                                dVar.d(hashSet9);
                            }
                            arrayList7 = arrayList5;
                            nVar3 = nVar2;
                            hashSet12 = hashSet7;
                            hashSet10 = hashSet8;
                            map3 = map2;
                            hashSet11 = hashSet9;
                            qVar6 = qVar4;
                            str2 = str48;
                            str3 = str33;
                            str43 = str35;
                            str42 = str34;
                            str41 = str41;
                            str40 = str40;
                            str39 = str32;
                            str45 = str37;
                            str44 = str36;
                            str46 = str38;
                            arrayList6 = arrayList6;
                        }
                    }
                }
                map2 = map3;
                hashSet9 = hashSet11;
                arrayList7 = arrayList5;
                nVar3 = nVar2;
                hashSet12 = hashSet7;
                hashSet10 = hashSet8;
                map3 = map2;
                hashSet11 = hashSet9;
                qVar6 = qVar4;
                str2 = str48;
                str3 = str33;
                str43 = str35;
                str42 = str34;
                str41 = str41;
                str40 = str40;
                str39 = str32;
                str45 = str37;
                str44 = str36;
                str46 = str38;
                arrayList6 = arrayList6;
            }
            str4 = str39;
            str5 = str40;
            str6 = str3;
            arrayList = arrayList6;
            str7 = str2;
            str8 = str41;
            str9 = str42;
            arrayList2 = arrayList7;
            str10 = str43;
            str11 = str44;
            str12 = str45;
            nVar = nVar3;
            str13 = str46;
            hashSet = hashSet10;
            map = map3;
            qVar = qVar6;
            hashSet2 = hashSet11;
            hashSet3 = hashSet12;
            arrayList3 = arrayList8;
        } else {
            str4 = "transformPivotY";
            str5 = "transformPivotX";
            str6 = str3;
            arrayList = arrayList6;
            str7 = str2;
            str8 = "scaleY";
            str9 = "scaleX";
            arrayList2 = arrayList7;
            str10 = "progress";
            str11 = "transitionPathRotate";
            str12 = "rotation";
            nVar = nVar3;
            str13 = "alpha";
            hashSet = hashSet10;
            map = map3;
            qVar = qVar6;
            hashSet2 = hashSet11;
            hashSet3 = hashSet12;
            arrayList3 = null;
        }
        if (arrayList3 != null) {
            nVar.f41331A = (k[]) arrayList3.toArray(new k[0]);
        }
        String str49 = "CUSTOM,";
        if (hashSet2.isEmpty()) {
            arrayList4 = arrayList2;
            hashSet4 = hashSet3;
            hashSet5 = hashSet2;
            qVar2 = qVar;
            qVar3 = qVar7;
            obj = obj5;
            str14 = str6;
            str15 = str10;
            str16 = str9;
            str17 = str8;
            str18 = str12;
            str19 = str11;
            str20 = str13;
        } else {
            nVar.f41362y = new HashMap<>();
            Iterator<String> it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                String next = it3.next();
                if (next.startsWith("CUSTOM,")) {
                    SparseArray<ConstraintAttribute> sparseArray = new SparseArray<>();
                    String str50 = next.split(",")[1];
                    for (d dVar2 : arrayList) {
                        Iterator<String> it4 = it3;
                        HashMap<String, ConstraintAttribute> map4 = dVar2.f41230d;
                        if (map4 != null && (constraintAttribute3 = map4.get(str50)) != null) {
                            sparseArray.append(dVar2.f41227a, constraintAttribute3);
                        }
                        it3 = it4;
                    }
                    it2 = it3;
                    d.b bVar2 = new d.b();
                    String str51 = next.split(",")[1];
                    bVar2.f40988f = sparseArray;
                    arrayList2 = arrayList2;
                    hashSet3 = hashSet3;
                    hashSet2 = hashSet2;
                    qVar = qVar;
                    qVar7 = qVar7;
                    obj4 = obj5;
                    str27 = str6;
                    str10 = str10;
                    str9 = str9;
                    str28 = str8;
                    str29 = str12;
                    str30 = str11;
                    jVar2 = bVar2;
                    str31 = str13;
                } else {
                    it2 = it3;
                    switch (next.hashCode()) {
                        case -1249320806:
                            arrayList2 = arrayList2;
                            hashSet3 = hashSet3;
                            hashSet2 = hashSet2;
                            qVar = qVar;
                            qVar7 = qVar7;
                            obj6 = obj6;
                            obj4 = obj5;
                            str7 = str7;
                            str27 = str6;
                            str10 = str10;
                            str9 = str9;
                            str28 = str8;
                            str29 = str12;
                            str30 = str11;
                            str31 = str13;
                            if (next.equals(obj6)) {
                                b12 = 0;
                            } else {
                                b12 = -1;
                            }
                            break;
                        case -1249320805:
                            arrayList2 = arrayList2;
                            hashSet3 = hashSet3;
                            hashSet2 = hashSet2;
                            qVar = qVar;
                            qVar7 = qVar7;
                            obj4 = obj5;
                            str7 = str7;
                            str27 = str6;
                            str10 = str10;
                            str9 = str9;
                            str28 = str8;
                            str29 = str12;
                            str30 = str11;
                            str31 = str13;
                            obj6 = obj6;
                            if (next.equals(obj7)) {
                                b12 = 1;
                            } else {
                                b12 = -1;
                            }
                            break;
                        case -1225497657:
                            arrayList2 = arrayList2;
                            hashSet3 = hashSet3;
                            hashSet2 = hashSet2;
                            qVar = qVar;
                            qVar7 = qVar7;
                            obj4 = obj5;
                            str7 = str7;
                            str27 = str6;
                            str10 = str10;
                            str9 = str9;
                            str28 = str8;
                            str29 = str12;
                            str30 = str11;
                            str31 = str13;
                            obj6 = obj6;
                            if (next.equals(str47)) {
                                b12 = 2;
                            } else {
                                b12 = -1;
                            }
                            break;
                        case -1225497656:
                            hashSet3 = hashSet3;
                            hashSet2 = hashSet2;
                            qVar = qVar;
                            qVar7 = qVar7;
                            obj4 = obj5;
                            str7 = str7;
                            str27 = str6;
                            str10 = str10;
                            str9 = str9;
                            str28 = str8;
                            str29 = str12;
                            str30 = str11;
                            str31 = str13;
                            arrayList2 = arrayList2;
                            obj6 = obj6;
                            if (next.equals(str7)) {
                                b12 = 3;
                            } else {
                                b12 = -1;
                            }
                            break;
                        case -1225497655:
                            hashSet3 = hashSet3;
                            hashSet2 = hashSet2;
                            qVar7 = qVar7;
                            obj4 = obj5;
                            str27 = str6;
                            str10 = str10;
                            str9 = str9;
                            str28 = str8;
                            str29 = str12;
                            str30 = str11;
                            str31 = str13;
                            arrayList2 = arrayList2;
                            qVar = qVar;
                            if (next.equals(str27)) {
                                b12 = 4;
                                obj6 = obj6;
                                str7 = str7;
                            } else {
                                obj6 = obj6;
                                str7 = str7;
                                b12 = -1;
                            }
                            break;
                        case -1001078227:
                            hashSet3 = hashSet3;
                            hashSet2 = hashSet2;
                            obj4 = obj5;
                            str10 = str10;
                            str9 = str9;
                            str28 = str8;
                            str29 = str12;
                            str30 = str11;
                            str31 = str13;
                            arrayList2 = arrayList2;
                            qVar = qVar;
                            if (next.equals(str10)) {
                                qVar7 = qVar7;
                                obj6 = obj6;
                                str7 = str7;
                                str27 = str6;
                                b12 = 5;
                            } else {
                                qVar7 = qVar7;
                                obj6 = obj6;
                                str7 = str7;
                                str27 = str6;
                                b12 = -1;
                            }
                            break;
                        case -908189618:
                            hashSet3 = hashSet3;
                            obj4 = obj5;
                            str9 = str9;
                            str28 = str8;
                            str29 = str12;
                            str30 = str11;
                            str31 = str13;
                            arrayList2 = arrayList2;
                            hashSet2 = hashSet2;
                            qVar = qVar;
                            if (next.equals(str9)) {
                                qVar7 = qVar7;
                                obj6 = obj6;
                                str7 = str7;
                                str27 = str6;
                                str10 = str10;
                                b12 = 6;
                            } else {
                                qVar7 = qVar7;
                                obj6 = obj6;
                                str7 = str7;
                                str27 = str6;
                                str10 = str10;
                                b12 = -1;
                            }
                            break;
                        case -908189617:
                            obj4 = obj5;
                            str28 = str8;
                            str29 = str12;
                            str30 = str11;
                            str31 = str13;
                            if (next.equals(str28)) {
                                arrayList2 = arrayList2;
                                hashSet3 = hashSet3;
                                hashSet2 = hashSet2;
                                qVar = qVar;
                                b12 = 7;
                                qVar7 = qVar7;
                                str27 = str6;
                            } else {
                                arrayList2 = arrayList2;
                                hashSet3 = hashSet3;
                                hashSet2 = hashSet2;
                                qVar = qVar;
                                qVar7 = qVar7;
                                obj6 = obj6;
                                str7 = str7;
                                str27 = str6;
                                str10 = str10;
                                str9 = str9;
                                b12 = -1;
                            }
                            break;
                        case -797520672:
                            obj4 = obj5;
                            str29 = str12;
                            str30 = str11;
                            str31 = str13;
                            if (next.equals("waveVariesBy")) {
                                b13 = 8;
                                arrayList2 = arrayList2;
                                hashSet3 = hashSet3;
                                hashSet2 = hashSet2;
                                qVar = qVar;
                                qVar7 = qVar7;
                                b12 = b13;
                                obj6 = obj6;
                                str7 = str7;
                                str27 = str6;
                                str10 = str10;
                                str9 = str9;
                                str28 = str8;
                            }
                            obj6 = obj6;
                            str7 = str7;
                            str27 = str6;
                            str10 = str10;
                            str9 = str9;
                            str28 = str8;
                            b12 = -1;
                            break;
                        case -760884510:
                            obj4 = obj5;
                            String str52 = str5;
                            str29 = str12;
                            str30 = str11;
                            str31 = str13;
                            if (next.equals(str52)) {
                                b14 = 9;
                                str5 = str52;
                                b12 = b14;
                                str28 = str8;
                                qVar7 = qVar7;
                                str27 = str6;
                            } else {
                                str5 = str52;
                                obj6 = obj6;
                                str7 = str7;
                                str27 = str6;
                                str10 = str10;
                                str9 = str9;
                                str28 = str8;
                                b12 = -1;
                            }
                            break;
                        case -760884509:
                            obj4 = obj5;
                            String str53 = str4;
                            str29 = str12;
                            str30 = str11;
                            str31 = str13;
                            if (next.equals(str53)) {
                                b14 = 10;
                                str4 = str53;
                                b12 = b14;
                                str28 = str8;
                                qVar7 = qVar7;
                                str27 = str6;
                            } else {
                                str4 = str53;
                                obj6 = obj6;
                                str7 = str7;
                                str27 = str6;
                                str10 = str10;
                                str9 = str9;
                                str28 = str8;
                                b12 = -1;
                            }
                            break;
                        case -40300674:
                            obj4 = obj5;
                            str29 = str12;
                            str30 = str11;
                            str31 = str13;
                            if (next.equals(str29)) {
                                b13 = 11;
                                arrayList2 = arrayList2;
                                hashSet3 = hashSet3;
                                hashSet2 = hashSet2;
                                qVar = qVar;
                                qVar7 = qVar7;
                                b12 = b13;
                                obj6 = obj6;
                                str7 = str7;
                                str27 = str6;
                                str10 = str10;
                                str9 = str9;
                                str28 = str8;
                            }
                            obj6 = obj6;
                            str7 = str7;
                            str27 = str6;
                            str10 = str10;
                            str9 = str9;
                            str28 = str8;
                            b12 = -1;
                            break;
                        case -4379043:
                            obj4 = obj5;
                            str30 = str11;
                            str31 = str13;
                            if (next.equals(obj4)) {
                                b12 = 12;
                                str7 = str7;
                                str27 = str6;
                                str10 = str10;
                                str9 = str9;
                                str28 = str8;
                                str29 = str12;
                            } else {
                                str7 = str7;
                                str27 = str6;
                                str10 = str10;
                                str9 = str9;
                                str28 = str8;
                                str29 = str12;
                                b12 = -1;
                            }
                            break;
                        case 37232917:
                            str30 = str11;
                            str31 = str13;
                            if (next.equals(str30)) {
                                b12 = 13;
                                obj4 = obj5;
                                str7 = str7;
                                str27 = str6;
                                str10 = str10;
                                str9 = str9;
                                str28 = str8;
                                str29 = str12;
                            } else {
                                obj4 = obj5;
                                str7 = str7;
                                str27 = str6;
                                str10 = str10;
                                str9 = str9;
                                str28 = str8;
                                str29 = str12;
                                b12 = -1;
                            }
                            break;
                        case 92909918:
                            str31 = str13;
                            if (next.equals(str31)) {
                                arrayList2 = arrayList2;
                                hashSet3 = hashSet3;
                                hashSet2 = hashSet2;
                                qVar = qVar;
                                qVar7 = qVar7;
                                b12 = 14;
                                obj6 = obj6;
                                obj4 = obj5;
                                str7 = str7;
                                str27 = str6;
                                str10 = str10;
                                str9 = str9;
                                str28 = str8;
                                str29 = str12;
                                str30 = str11;
                            } else {
                                arrayList2 = arrayList2;
                                hashSet3 = hashSet3;
                                hashSet2 = hashSet2;
                                qVar = qVar;
                                qVar7 = qVar7;
                                obj6 = obj6;
                                obj4 = obj5;
                                str7 = str7;
                                str27 = str6;
                                str10 = str10;
                                str9 = str9;
                                str28 = str8;
                                str29 = str12;
                                str30 = str11;
                                b12 = -1;
                            }
                            break;
                        case 156108012:
                            if (next.equals("waveOffset")) {
                                b12 = 15;
                                arrayList2 = arrayList2;
                                hashSet3 = hashSet3;
                                hashSet2 = hashSet2;
                                qVar = qVar;
                                qVar7 = qVar7;
                                obj6 = obj6;
                                obj4 = obj5;
                                str7 = str7;
                                str27 = str6;
                                str10 = str10;
                                str9 = str9;
                                str28 = str8;
                                str29 = str12;
                                str30 = str11;
                                str31 = str13;
                                break;
                            }
                        default:
                            arrayList2 = arrayList2;
                            hashSet3 = hashSet3;
                            hashSet2 = hashSet2;
                            qVar = qVar;
                            qVar7 = qVar7;
                            obj6 = obj6;
                            obj4 = obj5;
                            str7 = str7;
                            str27 = str6;
                            str10 = str10;
                            str9 = str9;
                            str28 = str8;
                            str29 = str12;
                            str30 = str11;
                            str31 = str13;
                            b12 = -1;
                            break;
                    }
                    switch (b12) {
                        case 0:
                            iVar = new d.i();
                            jVar = iVar;
                            break;
                        case 1:
                            iVar = new d.j();
                            jVar = iVar;
                            break;
                        case 2:
                            iVar = new d.m();
                            jVar = iVar;
                            break;
                        case 3:
                            iVar = new d.n();
                            jVar = iVar;
                            break;
                        case 4:
                            iVar = new d.o();
                            jVar = iVar;
                            break;
                        case 5:
                            d.g gVar2 = new d.g();
                            gVar2.f40990f = false;
                            iVar = gVar2;
                            jVar = iVar;
                            break;
                        case 6:
                            kVar = new d.k();
                            obj6 = obj6;
                            str7 = str7;
                            jVar = kVar;
                            break;
                        case 7:
                            kVar = new d.l();
                            obj6 = obj6;
                            str7 = str7;
                            jVar = kVar;
                            break;
                        case 8:
                            kVar = new d.a();
                            obj6 = obj6;
                            str7 = str7;
                            jVar = kVar;
                            break;
                        case 9:
                            kVar = new d.e();
                            obj6 = obj6;
                            str7 = str7;
                            jVar = kVar;
                            break;
                        case 10:
                            kVar = new d.f();
                            obj6 = obj6;
                            str7 = str7;
                            jVar = kVar;
                            break;
                        case 11:
                            kVar = new d.h();
                            obj6 = obj6;
                            str7 = str7;
                            jVar = kVar;
                            break;
                        case 12:
                            kVar = new d.c();
                            obj6 = obj6;
                            str7 = str7;
                            jVar = kVar;
                            break;
                        case 13:
                            kVar = new d.C0466d();
                            obj6 = obj6;
                            str7 = str7;
                            jVar = kVar;
                            break;
                        case 14:
                            kVar = new d.a();
                            obj6 = obj6;
                            str7 = str7;
                            jVar = kVar;
                            break;
                        case 15:
                            kVar = new d.a();
                            obj6 = obj6;
                            str7 = str7;
                            jVar = kVar;
                            break;
                        default:
                            obj6 = obj6;
                            str7 = str7;
                            jVar = null;
                            break;
                    }
                    jVar2 = jVar;
                }
                if (jVar2 != null) {
                    jVar2.f35147e = next;
                    nVar.f41362y.put(next, (d) jVar2);
                }
                str13 = str31;
                str9 = str9;
                str10 = str10;
                str6 = str27;
                str11 = str30;
                obj5 = obj4;
                str12 = str29;
                str8 = str28;
                qVar7 = qVar7;
                hashSet3 = hashSet3;
                qVar = qVar;
                arrayList2 = arrayList2;
                hashSet2 = hashSet2;
                it3 = it2;
            }
            arrayList4 = arrayList2;
            hashSet4 = hashSet3;
            hashSet5 = hashSet2;
            qVar2 = qVar;
            qVar3 = qVar7;
            obj = obj5;
            str14 = str6;
            str15 = str10;
            str16 = str9;
            str17 = str8;
            str18 = str12;
            str19 = str11;
            str20 = str13;
            if (arrayList != null) {
                for (d dVar3 : arrayList) {
                    if (dVar3 instanceof e) {
                        dVar3.a(nVar.f41362y);
                    }
                }
            }
            lVar.a(nVar.f41362y, 0);
            lVar2.a(nVar.f41362y, 100);
            for (Iterator<String> it5 = nVar.f41362y.keySet().iterator(); it5.hasNext(); it5 = it5) {
                String next2 = it5.next();
                int iIntValue = (!map.containsKey(next2) || (num = map.get(next2)) == null) ? 0 : num.intValue();
                d dVar4 = nVar.f41362y.get(next2);
                if (dVar4 != null) {
                    dVar4.c(iIntValue);
                }
            }
        }
        if (hashSet.isEmpty()) {
            str21 = "CUSTOM,";
        } else {
            if (nVar.f41361x == null) {
                nVar.f41361x = new HashMap<>();
            }
            Iterator<String> it6 = hashSet.iterator();
            while (it6.hasNext()) {
                String next3 = it6.next();
                if (!nVar.f41361x.containsKey(next3)) {
                    if (next3.startsWith(str49)) {
                        SparseArray<ConstraintAttribute> sparseArray2 = new SparseArray<>();
                        String str54 = next3.split(",")[1];
                        for (d dVar5 : arrayList) {
                            Iterator<String> it7 = it6;
                            String str55 = str49;
                            HashMap<String, ConstraintAttribute> map5 = dVar5.f41230d;
                            if (map5 != null && (constraintAttribute2 = map5.get(str54)) != null) {
                                sparseArray2.append(dVar5.f41227a, constraintAttribute2);
                            }
                            it6 = it7;
                            str49 = str55;
                        }
                        it = it6;
                        str24 = str49;
                        e.b bVar3 = new e.b();
                        bVar3.f40993m = new SparseArray<>();
                        bVar3.f40991k = next3.split(",")[1];
                        bVar3.f40992l = sparseArray2;
                        obj2 = obj6;
                        obj3 = obj7;
                        str25 = str47;
                        str26 = str7;
                        bVar = bVar3;
                    } else {
                        it = it6;
                        str24 = str49;
                        switch (next3.hashCode()) {
                            case -1249320806:
                                obj2 = obj6;
                                obj3 = obj7;
                                str25 = str47;
                                str26 = str7;
                                b10 = next3.equals(obj2) ? (byte) 0 : (byte) -1;
                                break;
                            case -1249320805:
                                obj3 = obj7;
                                str25 = str47;
                                str26 = str7;
                                if (next3.equals(obj3)) {
                                    obj2 = obj6;
                                    b10 = 1;
                                } else {
                                    obj2 = obj6;
                                }
                                break;
                            case -1225497657:
                                str25 = str47;
                                str26 = str7;
                                obj2 = obj6;
                                if (next3.equals(str25)) {
                                    obj3 = obj7;
                                    b10 = 2;
                                } else {
                                    obj3 = obj7;
                                }
                                break;
                            case -1225497656:
                                str26 = str7;
                                obj2 = obj6;
                                obj3 = obj7;
                                if (next3.equals(str26)) {
                                    str25 = str47;
                                    b10 = 3;
                                } else {
                                    str25 = str47;
                                }
                                break;
                            case -1225497655:
                                if (next3.equals(str14)) {
                                    b10 = 4;
                                    obj2 = obj6;
                                    obj3 = obj7;
                                    str25 = str47;
                                    str26 = str7;
                                }
                                obj2 = obj6;
                                obj3 = obj7;
                                str25 = str47;
                                str26 = str7;
                                break;
                            case -1001078227:
                                if (next3.equals(str15)) {
                                    obj2 = obj6;
                                    obj3 = obj7;
                                    str25 = str47;
                                    str26 = str7;
                                    b10 = 5;
                                } else {
                                    obj2 = obj6;
                                    obj3 = obj7;
                                    str25 = str47;
                                    str26 = str7;
                                }
                                break;
                            case -908189618:
                                if (next3.equals(str16)) {
                                    obj2 = obj6;
                                    obj3 = obj7;
                                    str25 = str47;
                                    str26 = str7;
                                    b10 = 6;
                                } else {
                                    obj2 = obj6;
                                    obj3 = obj7;
                                    str25 = str47;
                                    str26 = str7;
                                }
                                break;
                            case -908189617:
                                if (next3.equals(str17)) {
                                    b11 = 7;
                                    b10 = b11;
                                    obj2 = obj6;
                                    obj3 = obj7;
                                    str25 = str47;
                                    str26 = str7;
                                }
                                obj2 = obj6;
                                obj3 = obj7;
                                str25 = str47;
                                str26 = str7;
                                break;
                            case -40300674:
                                if (next3.equals(str18)) {
                                    b11 = 8;
                                    b10 = b11;
                                    obj2 = obj6;
                                    obj3 = obj7;
                                    str25 = str47;
                                    str26 = str7;
                                }
                                obj2 = obj6;
                                obj3 = obj7;
                                str25 = str47;
                                str26 = str7;
                                break;
                            case -4379043:
                                if (next3.equals(obj)) {
                                    b11 = 9;
                                    b10 = b11;
                                    obj2 = obj6;
                                    obj3 = obj7;
                                    str25 = str47;
                                    str26 = str7;
                                }
                                obj2 = obj6;
                                obj3 = obj7;
                                str25 = str47;
                                str26 = str7;
                                break;
                            case 37232917:
                                if (next3.equals(str19)) {
                                    b11 = 10;
                                    b10 = b11;
                                    obj2 = obj6;
                                    obj3 = obj7;
                                    str25 = str47;
                                    str26 = str7;
                                }
                                obj2 = obj6;
                                obj3 = obj7;
                                str25 = str47;
                                str26 = str7;
                                break;
                            case 92909918:
                                if (next3.equals(str20)) {
                                    b11 = 11;
                                    b10 = b11;
                                    obj2 = obj6;
                                    obj3 = obj7;
                                    str25 = str47;
                                    str26 = str7;
                                }
                                obj2 = obj6;
                                obj3 = obj7;
                                str25 = str47;
                                str26 = str7;
                                break;
                            default:
                                obj2 = obj6;
                                obj3 = obj7;
                                str25 = str47;
                                str26 = str7;
                                break;
                        }
                        switch (b10) {
                            case 0:
                                gVar = new e.g();
                                oVar = gVar;
                                oVar.f35179i = j;
                                oVar2 = oVar;
                                break;
                            case 1:
                                gVar = new e.h();
                                oVar = gVar;
                                oVar.f35179i = j;
                                oVar2 = oVar;
                                break;
                            case 2:
                                gVar = new e.k();
                                oVar = gVar;
                                oVar.f35179i = j;
                                oVar2 = oVar;
                                break;
                            case 3:
                                gVar = new e.l();
                                oVar = gVar;
                                oVar.f35179i = j;
                                oVar2 = oVar;
                                break;
                            case 4:
                                gVar = new e.m();
                                oVar = gVar;
                                oVar.f35179i = j;
                                oVar2 = oVar;
                                break;
                            case 5:
                                str20 = str20;
                                e.C0467e c0467e = new e.C0467e();
                                str26 = str26;
                                c0467e.f40995k = false;
                                oVar = c0467e;
                                oVar.f35179i = j;
                                oVar2 = oVar;
                                break;
                            case 6:
                                gVar = new e.i();
                                oVar = gVar;
                                oVar.f35179i = j;
                                oVar2 = oVar;
                                break;
                            case 7:
                                gVar = new e.j();
                                oVar = gVar;
                                oVar.f35179i = j;
                                oVar2 = oVar;
                                break;
                            case 8:
                                gVar = new e.f();
                                oVar = gVar;
                                oVar.f35179i = j;
                                oVar2 = oVar;
                                break;
                            case 9:
                                gVar = new e.c();
                                oVar = gVar;
                                oVar.f35179i = j;
                                oVar2 = oVar;
                                break;
                            case 10:
                                gVar = new e.d();
                                oVar = gVar;
                                oVar.f35179i = j;
                                oVar2 = oVar;
                                break;
                            case 11:
                                gVar = new e.a();
                                oVar = gVar;
                                oVar.f35179i = j;
                                oVar2 = oVar;
                                break;
                            default:
                                str26 = str26;
                                str25 = str25;
                                bVar = null;
                                break;
                        }
                        if (oVar2 != null) {
                            oVar2.f35176f = next3;
                            nVar.f41361x.put(next3, (e) oVar2);
                        }
                        it6 = it;
                        str49 = str24;
                        obj7 = obj3;
                        str7 = str26;
                        str47 = str25;
                        str15 = str15;
                        str20 = str20;
                        obj6 = obj2;
                    }
                    oVar2 = bVar;
                    if (oVar2 != null) {
                        oVar2.f35176f = next3;
                        nVar.f41361x.put(next3, (e) oVar2);
                    }
                    it6 = it;
                    str49 = str24;
                    obj7 = obj3;
                    str7 = str26;
                    str47 = str25;
                    str15 = str15;
                    str20 = str20;
                    obj6 = obj2;
                }
            }
            str21 = str49;
            if (arrayList != null) {
                for (d dVar6 : arrayList) {
                    if (dVar6 instanceof j) {
                        ((j) dVar6).g(nVar.f41361x);
                    }
                }
            }
            for (String str56 : nVar.f41361x.keySet()) {
                nVar.f41361x.get(str56).c(map.containsKey(str56) ? map.get(str56).intValue() : 0);
            }
        }
        int size = arrayList4.size();
        int i19 = size + 2;
        q[] qVarArr = new q[i19];
        qVarArr[0] = qVar2;
        qVarArr[size + 1] = qVar3;
        if (arrayList4.size() > 0 && nVar.f41343e == -1) {
            nVar.f41343e = 0;
        }
        Iterator<q> it8 = arrayList4.iterator();
        int i20 = 1;
        while (it8.hasNext()) {
            qVarArr[i20] = it8.next();
            i20++;
        }
        HashSet hashSet13 = new HashSet();
        for (String str57 : qVar3.f41380o.keySet()) {
            q qVar9 = qVar2;
            if (qVar9.f41380o.containsKey(str57)) {
                str23 = str21;
                hashSet6 = hashSet5;
                if (!hashSet6.contains(str23 + str57)) {
                    hashSet13.add(str57);
                }
            } else {
                str23 = str21;
                hashSet6 = hashSet5;
            }
            qVar2 = qVar9;
            str21 = str23;
            hashSet5 = hashSet6;
        }
        String[] strArr = (String[]) hashSet13.toArray(new String[0]);
        nVar.f41355r = strArr;
        nVar.f41356s = new int[strArr.length];
        int i21 = 0;
        while (true) {
            String[] strArr2 = nVar.f41355r;
            if (i21 < strArr2.length) {
                String str58 = strArr2[i21];
                nVar.f41356s[i21] = 0;
                for (int i22 = 0; i22 < i19; i22++) {
                    if (qVarArr[i22].f41380o.containsKey(str58) && (constraintAttribute = qVarArr[i22].f41380o.get(str58)) != null) {
                        int[] iArr = nVar.f41356s;
                        iArr[i21] = constraintAttribute.c() + iArr[i21];
                        i21++;
                    }
                }
                i21++;
            } else {
                boolean z10 = qVarArr[0].f41376k != -1;
                int length = strArr2.length + 18;
                boolean[] zArr = new boolean[length];
                for (int i23 = 1; i23 < i19; i23++) {
                    q qVar10 = qVarArr[i23];
                    q qVar11 = qVarArr[i23 - 1];
                    boolean zB = q.b(qVar10.f41372f, qVar11.f41372f);
                    boolean zB2 = q.b(qVar10.f41373g, qVar11.f41373g);
                    zArr[0] = zArr[0] | q.b(qVar10.f41371e, qVar11.f41371e);
                    boolean z11 = zB | zB2 | z10;
                    zArr[1] = zArr[1] | z11;
                    zArr[2] = z11 | zArr[2];
                    zArr[3] = zArr[3] | q.b(qVar10.f41374h, qVar11.f41374h);
                    zArr[4] = q.b(qVar10.f41375i, qVar11.f41375i) | zArr[4];
                }
                int i24 = 0;
                for (int i25 = 1; i25 < length; i25++) {
                    if (zArr[i25]) {
                        i24++;
                    }
                }
                nVar.f41352o = new int[i24];
                int iMax = Math.max(2, i24);
                nVar.f41353p = new double[iMax];
                nVar.f41354q = new double[iMax];
                int i26 = 0;
                int i27 = 1;
                while (i27 < length) {
                    if (zArr[i27]) {
                        i12 = 1;
                        nVar.f41352o[i26] = i27;
                        i26++;
                    } else {
                        i12 = 1;
                    }
                    i27 += i12;
                }
                double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i19, nVar.f41352o.length);
                double[] dArr2 = new double[i19];
                for (int i28 = 0; i28 < i19; i28++) {
                    q qVar12 = qVarArr[i28];
                    double[] dArr3 = dArr[i28];
                    int[] iArr2 = nVar.f41352o;
                    int i29 = 6;
                    float[] fArr = {qVar12.f41371e, qVar12.f41372f, qVar12.f41373g, qVar12.f41374h, qVar12.f41375i, qVar12.j};
                    int i30 = 0;
                    int i31 = 0;
                    while (i30 < iArr2.length) {
                        int i32 = iArr2[i30];
                        if (i32 < i29) {
                            dArr3[i31] = fArr[i32];
                            i31++;
                        }
                        i30++;
                        i29 = 6;
                    }
                    dArr2[i28] = qVarArr[i28].f41370d;
                }
                int i33 = 0;
                while (true) {
                    int[] iArr3 = nVar.f41352o;
                    if (i33 < iArr3.length) {
                        if (iArr3[i33] < 6) {
                            String strA = Q8.d.a(new StringBuilder(), q.f41367s[nVar.f41352o[i33]], " [");
                            for (int i34 = 0; i34 < i19; i34++) {
                                StringBuilder sbE = C4.b.e(strA);
                                sbE.append(dArr[i34][i33]);
                                strA = sbE.toString();
                            }
                        }
                        i33++;
                    } else {
                        nVar.j = new b[nVar.f41355r.length + 1];
                        int i35 = 0;
                        while (true) {
                            String[] strArr3 = nVar.f41355r;
                            if (i35 >= strArr3.length) {
                                nVar.j[0] = b.a(nVar.f41343e, dArr2, dArr);
                                if (qVarArr[0].f41376k != -1) {
                                    int[] iArr4 = new int[i19];
                                    double[] dArr4 = new double[i19];
                                    double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i19, 2);
                                    for (int i36 = 0; i36 < i19; i36++) {
                                        q qVar13 = qVarArr[i36];
                                        iArr4[i36] = qVar13.f41376k;
                                        dArr4[i36] = qVar13.f41370d;
                                        double[] dArr6 = dArr5[i36];
                                        dArr6[0] = qVar13.f41372f;
                                        dArr6[1] = qVar13.f41373g;
                                    }
                                    nVar.f41348k = new a(iArr4, dArr4, dArr5);
                                }
                                nVar.f41363z = new HashMap<>();
                                if (arrayList != null) {
                                    float fC = Float.NaN;
                                    for (String str59 : hashSet4) {
                                        c cVarD = c.d(str59);
                                        if (cVarD != null) {
                                            if (cVarD.f35114e == 1 && Float.isNaN(fC)) {
                                                fC = c();
                                            }
                                            cVarD.f35111b = str59;
                                            nVar.f41363z.put(str59, cVarD);
                                        }
                                    }
                                    for (d dVar7 : arrayList) {
                                        if (dVar7 instanceof f) {
                                            ((f) dVar7).g(nVar.f41363z);
                                        }
                                    }
                                    Iterator<c> it9 = nVar.f41363z.values().iterator();
                                    while (it9.hasNext()) {
                                        it9.next().c();
                                    }
                                    return;
                                }
                                return;
                            }
                            String str60 = strArr3[i35];
                            int i37 = 0;
                            int i38 = 0;
                            double[] dArr7 = null;
                            double[][] dArr8 = null;
                            while (i37 < i19) {
                                if (qVarArr[i37].f41380o.containsKey(str60)) {
                                    if (dArr8 == null) {
                                        dArr7 = new double[i19];
                                        ConstraintAttribute constraintAttribute4 = qVarArr[i37].f41380o.get(str60);
                                        dArr8 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i19, constraintAttribute4 == null ? 0 : constraintAttribute4.c());
                                    }
                                    q qVar14 = qVarArr[i37];
                                    dArr7[i38] = qVar14.f41370d;
                                    double[] dArr9 = dArr8[i38];
                                    ConstraintAttribute constraintAttribute5 = qVar14.f41380o.get(str60);
                                    if (constraintAttribute5 != null) {
                                        if (constraintAttribute5.c() == 1) {
                                            dArr9[0] = constraintAttribute5.a();
                                        } else {
                                            int iC = constraintAttribute5.c();
                                            float[] fArr2 = new float[iC];
                                            constraintAttribute5.b(fArr2);
                                            int i39 = 0;
                                            int i40 = 0;
                                            while (i39 < iC) {
                                                dArr9[i40] = fArr2[i39];
                                                i39++;
                                                str60 = str60;
                                                dArr7 = dArr7;
                                                dArr8 = dArr8;
                                                i40++;
                                            }
                                        }
                                    }
                                    str22 = str60;
                                    i38++;
                                    dArr7 = dArr7;
                                    dArr8 = dArr8;
                                } else {
                                    str22 = str60;
                                }
                                i37++;
                                str60 = str22;
                            }
                            i35++;
                            nVar.j[i35] = b.a(nVar.f41343e, Arrays.copyOf(dArr7, i38), (double[][]) Arrays.copyOf(dArr8, i38));
                        }
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(" start: x: ");
        q qVar = this.f41344f;
        sb2.append(qVar.f41372f);
        sb2.append(" y: ");
        sb2.append(qVar.f41373g);
        sb2.append(" end: x: ");
        q qVar2 = this.f41345g;
        sb2.append(qVar2.f41372f);
        sb2.append(" y: ");
        sb2.append(qVar2.f41373g);
        return sb2.toString();
    }
}
