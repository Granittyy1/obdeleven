package C5;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* JADX INFO: compiled from: CircularRevealWidget.java */
/* JADX INFO: loaded from: classes3.dex */
public interface d {

    /* JADX INFO: compiled from: CircularRevealWidget.java */
    public static class a implements TypeEvaluator<C0023d> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f2415b = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C0023d f2416a = new C0023d();

        @Override // android.animation.TypeEvaluator
        public final C0023d evaluate(float f10, C0023d c0023d, C0023d c0023d2) {
            C0023d c0023d3 = c0023d;
            C0023d c0023d4 = c0023d2;
            float f11 = c0023d3.f2419a;
            float f12 = 1.0f - f10;
            float f13 = (c0023d4.f2419a * f10) + (f11 * f12);
            float f14 = c0023d3.f2420b;
            float f15 = (c0023d4.f2420b * f10) + (f14 * f12);
            float f16 = c0023d3.f2421c;
            float f17 = (f10 * c0023d4.f2421c) + (f12 * f16);
            C0023d c0023d5 = this.f2416a;
            c0023d5.f2419a = f13;
            c0023d5.f2420b = f15;
            c0023d5.f2421c = f17;
            return c0023d5;
        }
    }

    /* JADX INFO: compiled from: CircularRevealWidget.java */
    public static class b extends Property<d, C0023d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f2417a = new b(C0023d.class, "circularReveal");

        @Override // android.util.Property
        public final C0023d get(d dVar) {
            return dVar.getRevealInfo();
        }

        @Override // android.util.Property
        public final void set(d dVar, C0023d c0023d) {
            dVar.setRevealInfo(c0023d);
        }
    }

    /* JADX INFO: compiled from: CircularRevealWidget.java */
    public static class c extends Property<d, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f2418a = new c(Integer.class, "circularRevealScrimColor");

        @Override // android.util.Property
        public final Integer get(d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        public final void set(d dVar, Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* JADX INFO: renamed from: C5.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CircularRevealWidget.java */
    public static class C0023d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f2419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f2420b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f2421c;

        public C0023d() {
        }

        public C0023d(float f10, float f11, float f12) {
            this.f2419a = f10;
            this.f2420b = f11;
            this.f2421c = f12;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    C0023d getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i10);

    void setRevealInfo(C0023d c0023d);
}
