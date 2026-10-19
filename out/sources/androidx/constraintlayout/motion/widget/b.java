package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.Xml;
import android.view.View;

/* JADX INFO: compiled from: TouchResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final float[][] f16293E = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final float[][] f16294F = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final float f16295A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final float f16296B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f16297C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f16298D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f16304f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f16305g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f16306h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f16307i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f16308k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f16309l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f16310m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float[] f16311n = new float[2];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int[] f16312o = new int[2];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f16313p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f16314q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final MotionLayout f16315r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f16316s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f16317t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f16318u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f16319v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f16320w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final float f16321x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final float f16322y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final float f16323z;

    public b(Context context, MotionLayout motionLayout, XmlResourceParser xmlResourceParser) {
        this.f16299a = 0;
        this.f16300b = 0;
        this.f16301c = 0;
        this.f16302d = -1;
        this.f16303e = -1;
        this.f16304f = -1;
        this.f16305g = 0.5f;
        this.f16306h = 0.5f;
        this.f16307i = -1;
        this.j = false;
        this.f16308k = 0.0f;
        this.f16309l = 1.0f;
        this.f16316s = 4.0f;
        this.f16317t = 1.2f;
        this.f16318u = true;
        this.f16319v = 1.0f;
        this.f16320w = 0;
        this.f16321x = 10.0f;
        this.f16322y = 10.0f;
        this.f16323z = 1.0f;
        this.f16295A = Float.NaN;
        this.f16296B = Float.NaN;
        this.f16297C = 0;
        this.f16298D = 0;
        this.f16315r = motionLayout;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), p139l0.d.f44138q);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 16) {
                this.f16302d = typedArrayObtainStyledAttributes.getResourceId(index, this.f16302d);
            } else if (index == 17) {
                int i11 = typedArrayObtainStyledAttributes.getInt(index, this.f16299a);
                this.f16299a = i11;
                float[] fArr = f16293E[i11];
                this.f16306h = fArr[0];
                this.f16305g = fArr[1];
            } else if (index == 1) {
                int i12 = typedArrayObtainStyledAttributes.getInt(index, this.f16300b);
                this.f16300b = i12;
                if (i12 < 6) {
                    float[] fArr2 = f16294F[i12];
                    this.f16308k = fArr2[0];
                    this.f16309l = fArr2[1];
                } else {
                    this.f16309l = Float.NaN;
                    this.f16308k = Float.NaN;
                    this.j = true;
                }
            } else if (index == 6) {
                this.f16316s = typedArrayObtainStyledAttributes.getFloat(index, this.f16316s);
            } else if (index == 5) {
                this.f16317t = typedArrayObtainStyledAttributes.getFloat(index, this.f16317t);
            } else if (index == 7) {
                this.f16318u = typedArrayObtainStyledAttributes.getBoolean(index, this.f16318u);
            } else if (index == 2) {
                this.f16319v = typedArrayObtainStyledAttributes.getFloat(index, this.f16319v);
            } else if (index == 3) {
                this.f16321x = typedArrayObtainStyledAttributes.getFloat(index, this.f16321x);
            } else if (index == 18) {
                this.f16303e = typedArrayObtainStyledAttributes.getResourceId(index, this.f16303e);
            } else if (index == 9) {
                this.f16301c = typedArrayObtainStyledAttributes.getInt(index, this.f16301c);
            } else if (index == 8) {
                this.f16320w = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == 4) {
                this.f16304f = typedArrayObtainStyledAttributes.getResourceId(index, 0);
            } else if (index == 10) {
                this.f16307i = typedArrayObtainStyledAttributes.getResourceId(index, this.f16307i);
            } else if (index == 12) {
                this.f16322y = typedArrayObtainStyledAttributes.getFloat(index, this.f16322y);
            } else if (index == 13) {
                this.f16323z = typedArrayObtainStyledAttributes.getFloat(index, this.f16323z);
            } else if (index == 14) {
                this.f16295A = typedArrayObtainStyledAttributes.getFloat(index, this.f16295A);
            } else if (index == 15) {
                this.f16296B = typedArrayObtainStyledAttributes.getFloat(index, this.f16296B);
            } else if (index == 11) {
                this.f16297C = typedArrayObtainStyledAttributes.getInt(index, this.f16297C);
            } else if (index == 0) {
                this.f16298D = typedArrayObtainStyledAttributes.getInt(index, this.f16298D);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final RectF a(MotionLayout motionLayout, RectF rectF) {
        View viewFindViewById;
        int i10 = this.f16304f;
        if (i10 == -1 || (viewFindViewById = motionLayout.findViewById(i10)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    public final RectF b(MotionLayout motionLayout, RectF rectF) {
        View viewFindViewById;
        int i10 = this.f16303e;
        if (i10 == -1 || (viewFindViewById = motionLayout.findViewById(i10)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    public final void c(boolean z10) {
        float[][] fArr = f16293E;
        float[][] fArr2 = f16294F;
        if (z10) {
            fArr2[4] = fArr2[3];
            fArr2[5] = fArr2[2];
            fArr[5] = fArr[2];
            fArr[6] = fArr[1];
        } else {
            fArr2[4] = fArr2[2];
            fArr2[5] = fArr2[3];
            fArr[5] = fArr[1];
            fArr[6] = fArr[2];
        }
        float[] fArr3 = fArr[this.f16299a];
        this.f16306h = fArr3[0];
        this.f16305g = fArr3[1];
        int i10 = this.f16300b;
        if (i10 >= 6) {
            return;
        }
        float[] fArr4 = fArr2[i10];
        this.f16308k = fArr4[0];
        this.f16309l = fArr4[1];
    }

    public final String toString() {
        if (Float.isNaN(this.f16308k)) {
            return "rotation";
        }
        return this.f16308k + " , " + this.f16309l;
    }
}
