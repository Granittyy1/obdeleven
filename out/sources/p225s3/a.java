package p225s3;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import p079g3.b;
import p164n3.c;

/* JADX INFO: compiled from: Keyframe.java */
/* JADX INFO: loaded from: classes.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f46885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f46886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f46887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Interpolator f46888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Interpolator f46889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Interpolator f46890f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f46891g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Float f46892h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f46893i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f46894k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f46895l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f46896m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f46897n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PointF f46898o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public PointF f46899p;

    public a(b bVar, T t8, T t10, Interpolator interpolator, float f10, Float f11) {
        this.f46893i = -3987645.8f;
        this.j = -3987645.8f;
        this.f46894k = 784923401;
        this.f46895l = 784923401;
        this.f46896m = Float.MIN_VALUE;
        this.f46897n = Float.MIN_VALUE;
        this.f46898o = null;
        this.f46899p = null;
        this.f46885a = bVar;
        this.f46886b = t8;
        this.f46887c = t10;
        this.f46888d = interpolator;
        this.f46889e = null;
        this.f46890f = null;
        this.f46891g = f10;
        this.f46892h = f11;
    }

    public final float a() {
        b bVar = this.f46885a;
        if (bVar == null) {
            return 1.0f;
        }
        if (this.f46897n == Float.MIN_VALUE) {
            if (this.f46892h == null) {
                this.f46897n = 1.0f;
            } else {
                this.f46897n = ((this.f46892h.floatValue() - this.f46891g) / (bVar.f35561k - bVar.j)) + b();
            }
        }
        return this.f46897n;
    }

    public final float b() {
        b bVar = this.f46885a;
        if (bVar == null) {
            return 0.0f;
        }
        if (this.f46896m == Float.MIN_VALUE) {
            float f10 = bVar.j;
            this.f46896m = (this.f46891g - f10) / (bVar.f35561k - f10);
        }
        return this.f46896m;
    }

    public final boolean c() {
        return this.f46888d == null && this.f46889e == null && this.f46890f == null;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.f46886b + ", endValue=" + this.f46887c + ", startFrame=" + this.f46891g + ", endFrame=" + this.f46892h + ", interpolator=" + this.f46888d + '}';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(b bVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f10) {
        this.f46893i = -3987645.8f;
        this.j = -3987645.8f;
        this.f46894k = 784923401;
        this.f46895l = 784923401;
        this.f46896m = Float.MIN_VALUE;
        this.f46897n = Float.MIN_VALUE;
        this.f46898o = null;
        this.f46899p = null;
        this.f46885a = bVar;
        this.f46886b = obj;
        this.f46887c = obj2;
        this.f46888d = null;
        this.f46889e = interpolator;
        this.f46890f = interpolator2;
        this.f46891g = f10;
        this.f46892h = null;
    }

    public a(b bVar, T t8, T t10, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f10, Float f11) {
        this.f46893i = -3987645.8f;
        this.j = -3987645.8f;
        this.f46894k = 784923401;
        this.f46895l = 784923401;
        this.f46896m = Float.MIN_VALUE;
        this.f46897n = Float.MIN_VALUE;
        this.f46898o = null;
        this.f46899p = null;
        this.f46885a = bVar;
        this.f46886b = t8;
        this.f46887c = t10;
        this.f46888d = interpolator;
        this.f46889e = interpolator2;
        this.f46890f = interpolator3;
        this.f46891g = f10;
        this.f46892h = f11;
    }

    public a(T t8) {
        this.f46893i = -3987645.8f;
        this.j = -3987645.8f;
        this.f46894k = 784923401;
        this.f46895l = 784923401;
        this.f46896m = Float.MIN_VALUE;
        this.f46897n = Float.MIN_VALUE;
        this.f46898o = null;
        this.f46899p = null;
        this.f46885a = null;
        this.f46886b = t8;
        this.f46887c = t8;
        this.f46888d = null;
        this.f46889e = null;
        this.f46890f = null;
        this.f46891g = Float.MIN_VALUE;
        this.f46892h = Float.valueOf(Float.MAX_VALUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(c cVar, c cVar2) {
        this.f46893i = -3987645.8f;
        this.j = -3987645.8f;
        this.f46894k = 784923401;
        this.f46895l = 784923401;
        this.f46896m = Float.MIN_VALUE;
        this.f46897n = Float.MIN_VALUE;
        this.f46898o = null;
        this.f46899p = null;
        this.f46885a = null;
        this.f46886b = cVar;
        this.f46887c = cVar2;
        this.f46888d = null;
        this.f46889e = null;
        this.f46890f = null;
        this.f46891g = Float.MIN_VALUE;
        this.f46892h = Float.valueOf(Float.MAX_VALUE);
    }
}
