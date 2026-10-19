package androidx.compose.ui.graphics.vector;

import androidx.compose.animation.D;

/* JADX INFO: compiled from: PathNode.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13899b;

    /* JADX INFO: compiled from: PathNode.kt */
    public static final class a extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f13900c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f13901d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f13902e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f13903f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f13904g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f13905h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final float f13906i;

        public a(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            super(3, false, false);
            this.f13900c = f10;
            this.f13901d = f11;
            this.f13902e = f12;
            this.f13903f = z10;
            this.f13904g = z11;
            this.f13905h = f13;
            this.f13906i = f14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f13900c, aVar.f13900c) == 0 && Float.compare(this.f13901d, aVar.f13901d) == 0 && Float.compare(this.f13902e, aVar.f13902e) == 0 && this.f13903f == aVar.f13903f && this.f13904g == aVar.f13904g && Float.compare(this.f13905h, aVar.f13905h) == 0 && Float.compare(this.f13906i, aVar.f13906i) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f13906i) + O.a.d(this.f13905h, D.b(D.b(O.a.d(this.f13902e, O.a.d(this.f13901d, Float.hashCode(this.f13900c) * 31, 31), 31), 31, this.f13903f), 31, this.f13904g), 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ArcTo(horizontalEllipseRadius=");
            sb2.append(this.f13900c);
            sb2.append(", verticalEllipseRadius=");
            sb2.append(this.f13901d);
            sb2.append(", theta=");
            sb2.append(this.f13902e);
            sb2.append(", isMoreThanHalf=");
            sb2.append(this.f13903f);
            sb2.append(", isPositiveArc=");
            sb2.append(this.f13904g);
            sb2.append(", arcStartX=");
            sb2.append(this.f13905h);
            sb2.append(", arcStartY=");
            return B7.b.d(sb2, this.f13906i, ')');
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    public static final class b extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f13907c = new b(3, false, false);
    }

    /* JADX INFO: compiled from: PathNode.kt */
    public static final class c extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f13908c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f13909d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f13910e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f13911f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f13912g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f13913h;

        public c(float f10, float f11, float f12, float f13, float f14, float f15) {
            super(2, true, false);
            this.f13908c = f10;
            this.f13909d = f11;
            this.f13910e = f12;
            this.f13911f = f13;
            this.f13912g = f14;
            this.f13913h = f15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Float.compare(this.f13908c, cVar.f13908c) == 0 && Float.compare(this.f13909d, cVar.f13909d) == 0 && Float.compare(this.f13910e, cVar.f13910e) == 0 && Float.compare(this.f13911f, cVar.f13911f) == 0 && Float.compare(this.f13912g, cVar.f13912g) == 0 && Float.compare(this.f13913h, cVar.f13913h) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f13913h) + O.a.d(this.f13912g, O.a.d(this.f13911f, O.a.d(this.f13910e, O.a.d(this.f13909d, Float.hashCode(this.f13908c) * 31, 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CurveTo(x1=");
            sb2.append(this.f13908c);
            sb2.append(", y1=");
            sb2.append(this.f13909d);
            sb2.append(", x2=");
            sb2.append(this.f13910e);
            sb2.append(", y2=");
            sb2.append(this.f13911f);
            sb2.append(", x3=");
            sb2.append(this.f13912g);
            sb2.append(", y3=");
            return B7.b.d(sb2, this.f13913h, ')');
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    public static final class d extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f13914c;

        public d(float f10) {
            super(3, false, false);
            this.f13914c = f10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Float.compare(this.f13914c, ((d) obj).f13914c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f13914c);
        }

        public final String toString() {
            return B7.b.d(new StringBuilder("HorizontalTo(x="), this.f13914c, ')');
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PathNode.kt */
    public static final class C0157e extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f13915c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f13916d;

        public C0157e(float f10, float f11) {
            super(3, false, false);
            this.f13915c = f10;
            this.f13916d = f11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0157e)) {
                return false;
            }
            C0157e c0157e = (C0157e) obj;
            return Float.compare(this.f13915c, c0157e.f13915c) == 0 && Float.compare(this.f13916d, c0157e.f13916d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f13916d) + (Float.hashCode(this.f13915c) * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LineTo(x=");
            sb2.append(this.f13915c);
            sb2.append(", y=");
            return B7.b.d(sb2, this.f13916d, ')');
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    public static final class f extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f13917c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f13918d;

        public f(float f10, float f11) {
            super(3, false, false);
            this.f13917c = f10;
            this.f13918d = f11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Float.compare(this.f13917c, fVar.f13917c) == 0 && Float.compare(this.f13918d, fVar.f13918d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f13918d) + (Float.hashCode(this.f13917c) * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MoveTo(x=");
            sb2.append(this.f13917c);
            sb2.append(", y=");
            return B7.b.d(sb2, this.f13918d, ')');
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    public static final class g extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f13919c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f13920d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f13921e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f13922f;

        public g(float f10, float f11, float f12, float f13) {
            super(1, false, true);
            this.f13919c = f10;
            this.f13920d = f11;
            this.f13921e = f12;
            this.f13922f = f13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return Float.compare(this.f13919c, gVar.f13919c) == 0 && Float.compare(this.f13920d, gVar.f13920d) == 0 && Float.compare(this.f13921e, gVar.f13921e) == 0 && Float.compare(this.f13922f, gVar.f13922f) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f13922f) + O.a.d(this.f13921e, O.a.d(this.f13920d, Float.hashCode(this.f13919c) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("QuadTo(x1=");
            sb2.append(this.f13919c);
            sb2.append(", y1=");
            sb2.append(this.f13920d);
            sb2.append(", x2=");
            sb2.append(this.f13921e);
            sb2.append(", y2=");
            return B7.b.d(sb2, this.f13922f, ')');
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    public static final class h extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f13923c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f13924d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f13925e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f13926f;

        public h(float f10, float f11, float f12, float f13) {
            super(2, true, false);
            this.f13923c = f10;
            this.f13924d = f11;
            this.f13925e = f12;
            this.f13926f = f13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Float.compare(this.f13923c, hVar.f13923c) == 0 && Float.compare(this.f13924d, hVar.f13924d) == 0 && Float.compare(this.f13925e, hVar.f13925e) == 0 && Float.compare(this.f13926f, hVar.f13926f) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f13926f) + O.a.d(this.f13925e, O.a.d(this.f13924d, Float.hashCode(this.f13923c) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ReflectiveCurveTo(x1=");
            sb2.append(this.f13923c);
            sb2.append(", y1=");
            sb2.append(this.f13924d);
            sb2.append(", x2=");
            sb2.append(this.f13925e);
            sb2.append(", y2=");
            return B7.b.d(sb2, this.f13926f, ')');
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    public static final class i extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f13927c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f13928d;

        public i(float f10, float f11) {
            super(1, false, true);
            this.f13927c = f10;
            this.f13928d = f11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Float.compare(this.f13927c, iVar.f13927c) == 0 && Float.compare(this.f13928d, iVar.f13928d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f13928d) + (Float.hashCode(this.f13927c) * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ReflectiveQuadTo(x=");
            sb2.append(this.f13927c);
            sb2.append(", y=");
            return B7.b.d(sb2, this.f13928d, ')');
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    public static final class j extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f13929c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f13930d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f13931e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f13932f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f13933g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f13934h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final float f13935i;

        public j(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            super(3, false, false);
            this.f13929c = f10;
            this.f13930d = f11;
            this.f13931e = f12;
            this.f13932f = z10;
            this.f13933g = z11;
            this.f13934h = f13;
            this.f13935i = f14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Float.compare(this.f13929c, jVar.f13929c) == 0 && Float.compare(this.f13930d, jVar.f13930d) == 0 && Float.compare(this.f13931e, jVar.f13931e) == 0 && this.f13932f == jVar.f13932f && this.f13933g == jVar.f13933g && Float.compare(this.f13934h, jVar.f13934h) == 0 && Float.compare(this.f13935i, jVar.f13935i) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f13935i) + O.a.d(this.f13934h, D.b(D.b(O.a.d(this.f13931e, O.a.d(this.f13930d, Float.hashCode(this.f13929c) * 31, 31), 31), 31, this.f13932f), 31, this.f13933g), 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
            sb2.append(this.f13929c);
            sb2.append(", verticalEllipseRadius=");
            sb2.append(this.f13930d);
            sb2.append(", theta=");
            sb2.append(this.f13931e);
            sb2.append(", isMoreThanHalf=");
            sb2.append(this.f13932f);
            sb2.append(", isPositiveArc=");
            sb2.append(this.f13933g);
            sb2.append(", arcStartDx=");
            sb2.append(this.f13934h);
            sb2.append(", arcStartDy=");
            return B7.b.d(sb2, this.f13935i, ')');
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    public static final class k extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f13936c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f13937d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f13938e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f13939f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f13940g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f13941h;

        public k(float f10, float f11, float f12, float f13, float f14, float f15) {
            super(2, true, false);
            this.f13936c = f10;
            this.f13937d = f11;
            this.f13938e = f12;
            this.f13939f = f13;
            this.f13940g = f14;
            this.f13941h = f15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return Float.compare(this.f13936c, kVar.f13936c) == 0 && Float.compare(this.f13937d, kVar.f13937d) == 0 && Float.compare(this.f13938e, kVar.f13938e) == 0 && Float.compare(this.f13939f, kVar.f13939f) == 0 && Float.compare(this.f13940g, kVar.f13940g) == 0 && Float.compare(this.f13941h, kVar.f13941h) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f13941h) + O.a.d(this.f13940g, O.a.d(this.f13939f, O.a.d(this.f13938e, O.a.d(this.f13937d, Float.hashCode(this.f13936c) * 31, 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeCurveTo(dx1=");
            sb2.append(this.f13936c);
            sb2.append(", dy1=");
            sb2.append(this.f13937d);
            sb2.append(", dx2=");
            sb2.append(this.f13938e);
            sb2.append(", dy2=");
            sb2.append(this.f13939f);
            sb2.append(", dx3=");
            sb2.append(this.f13940g);
            sb2.append(", dy3=");
            return B7.b.d(sb2, this.f13941h, ')');
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    public static final class l extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f13942c;

        public l(float f10) {
            super(3, false, false);
            this.f13942c = f10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && Float.compare(this.f13942c, ((l) obj).f13942c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f13942c);
        }

        public final String toString() {
            return B7.b.d(new StringBuilder("RelativeHorizontalTo(dx="), this.f13942c, ')');
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    public static final class m extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f13943c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f13944d;

        public m(float f10, float f11) {
            super(3, false, false);
            this.f13943c = f10;
            this.f13944d = f11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return Float.compare(this.f13943c, mVar.f13943c) == 0 && Float.compare(this.f13944d, mVar.f13944d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f13944d) + (Float.hashCode(this.f13943c) * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeLineTo(dx=");
            sb2.append(this.f13943c);
            sb2.append(", dy=");
            return B7.b.d(sb2, this.f13944d, ')');
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    public static final class n extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f13945c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f13946d;

        public n(float f10, float f11) {
            super(3, false, false);
            this.f13945c = f10;
            this.f13946d = f11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Float.compare(this.f13945c, nVar.f13945c) == 0 && Float.compare(this.f13946d, nVar.f13946d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f13946d) + (Float.hashCode(this.f13945c) * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeMoveTo(dx=");
            sb2.append(this.f13945c);
            sb2.append(", dy=");
            return B7.b.d(sb2, this.f13946d, ')');
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    public static final class o extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f13947c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f13948d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f13949e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f13950f;

        public o(float f10, float f11, float f12, float f13) {
            super(1, false, true);
            this.f13947c = f10;
            this.f13948d = f11;
            this.f13949e = f12;
            this.f13950f = f13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return Float.compare(this.f13947c, oVar.f13947c) == 0 && Float.compare(this.f13948d, oVar.f13948d) == 0 && Float.compare(this.f13949e, oVar.f13949e) == 0 && Float.compare(this.f13950f, oVar.f13950f) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f13950f) + O.a.d(this.f13949e, O.a.d(this.f13948d, Float.hashCode(this.f13947c) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeQuadTo(dx1=");
            sb2.append(this.f13947c);
            sb2.append(", dy1=");
            sb2.append(this.f13948d);
            sb2.append(", dx2=");
            sb2.append(this.f13949e);
            sb2.append(", dy2=");
            return B7.b.d(sb2, this.f13950f, ')');
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    public static final class p extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f13951c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f13952d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f13953e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f13954f;

        public p(float f10, float f11, float f12, float f13) {
            super(2, true, false);
            this.f13951c = f10;
            this.f13952d = f11;
            this.f13953e = f12;
            this.f13954f = f13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return Float.compare(this.f13951c, pVar.f13951c) == 0 && Float.compare(this.f13952d, pVar.f13952d) == 0 && Float.compare(this.f13953e, pVar.f13953e) == 0 && Float.compare(this.f13954f, pVar.f13954f) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f13954f) + O.a.d(this.f13953e, O.a.d(this.f13952d, Float.hashCode(this.f13951c) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
            sb2.append(this.f13951c);
            sb2.append(", dy1=");
            sb2.append(this.f13952d);
            sb2.append(", dx2=");
            sb2.append(this.f13953e);
            sb2.append(", dy2=");
            return B7.b.d(sb2, this.f13954f, ')');
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    public static final class q extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f13955c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f13956d;

        public q(float f10, float f11) {
            super(1, false, true);
            this.f13955c = f10;
            this.f13956d = f11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return Float.compare(this.f13955c, qVar.f13955c) == 0 && Float.compare(this.f13956d, qVar.f13956d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f13956d) + (Float.hashCode(this.f13955c) * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeReflectiveQuadTo(dx=");
            sb2.append(this.f13955c);
            sb2.append(", dy=");
            return B7.b.d(sb2, this.f13956d, ')');
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    public static final class r extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f13957c;

        public r(float f10) {
            super(3, false, false);
            this.f13957c = f10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && Float.compare(this.f13957c, ((r) obj).f13957c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f13957c);
        }

        public final String toString() {
            return B7.b.d(new StringBuilder("RelativeVerticalTo(dy="), this.f13957c, ')');
        }
    }

    /* JADX INFO: compiled from: PathNode.kt */
    public static final class s extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f13958c;

        public s(float f10) {
            super(3, false, false);
            this.f13958c = f10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && Float.compare(this.f13958c, ((s) obj).f13958c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f13958c);
        }

        public final String toString() {
            return B7.b.d(new StringBuilder("VerticalTo(y="), this.f13958c, ')');
        }
    }

    public e(int i10, boolean z10, boolean z11) {
        z10 = (i10 & 1) != 0 ? false : z10;
        z11 = (i10 & 2) != 0 ? false : z11;
        this.f13898a = z10;
        this.f13899b = z11;
    }
}
