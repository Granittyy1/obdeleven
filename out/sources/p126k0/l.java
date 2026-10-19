package p126k0;

import android.graphics.Rect;
import android.util.Log;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.b;
import java.util.HashMap;
import java.util.LinkedHashMap;
import p077g0.c;
import p113j0.d;

/* JADX INFO: compiled from: MotionConstrainedPoint.java */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Comparable<l> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f41316d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f41314b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f41315c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap<String, ConstraintAttribute> f41317e = new LinkedHashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f41318f = 1.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f41319g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f41320h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f41321i = 0.0f;
    public float j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f41322k = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f41323l = Float.NaN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f41324m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f41325n = 0.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f41326o = 0.0f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f41327p = 0.0f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f41328q = Float.NaN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f41329r = Float.NaN;

    public static boolean b(float f10, float f11) {
        if (Float.isNaN(f10) || Float.isNaN(f11)) {
            return Float.isNaN(f10) != Float.isNaN(f11);
        }
        return Math.abs(f10 - f11) > 1.0E-6f;
    }

    public final void a(HashMap<String, d> map, int i10) {
        for (String str : map.keySet()) {
            d dVar = map.get(str);
            if (dVar != null) {
                str.getClass();
                switch (str) {
                    case "rotationX":
                        dVar.b(Float.isNaN(this.f41321i) ? 0.0f : this.f41321i, i10);
                        break;
                    case "rotationY":
                        dVar.b(Float.isNaN(this.f41314b) ? 0.0f : this.f41314b, i10);
                        break;
                    case "translationX":
                        dVar.b(Float.isNaN(this.f41325n) ? 0.0f : this.f41325n, i10);
                        break;
                    case "translationY":
                        dVar.b(Float.isNaN(this.f41326o) ? 0.0f : this.f41326o, i10);
                        break;
                    case "translationZ":
                        dVar.b(Float.isNaN(this.f41327p) ? 0.0f : this.f41327p, i10);
                        break;
                    case "progress":
                        dVar.b(Float.isNaN(this.f41329r) ? 0.0f : this.f41329r, i10);
                        break;
                    case "scaleX":
                        dVar.b(Float.isNaN(this.j) ? 1.0f : this.j, i10);
                        break;
                    case "scaleY":
                        dVar.b(Float.isNaN(this.f41322k) ? 1.0f : this.f41322k, i10);
                        break;
                    case "transformPivotX":
                        dVar.b(Float.isNaN(this.f41323l) ? 0.0f : this.f41323l, i10);
                        break;
                    case "transformPivotY":
                        dVar.b(Float.isNaN(this.f41324m) ? 0.0f : this.f41324m, i10);
                        break;
                    case "rotation":
                        dVar.b(Float.isNaN(this.f41320h) ? 0.0f : this.f41320h, i10);
                        break;
                    case "elevation":
                        dVar.b(Float.isNaN(this.f41319g) ? 0.0f : this.f41319g, i10);
                        break;
                    case "transitionPathRotate":
                        dVar.b(Float.isNaN(this.f41328q) ? 0.0f : this.f41328q, i10);
                        break;
                    case "alpha":
                        dVar.b(Float.isNaN(this.f41318f) ? 1.0f : this.f41318f, i10);
                        break;
                    default:
                        if (!str.startsWith("CUSTOM")) {
                            Log.e("MotionPaths", "UNKNOWN spline ".concat(str));
                            break;
                        } else {
                            String str2 = str.split(",")[1];
                            LinkedHashMap<String, ConstraintAttribute> linkedHashMap = this.f41317e;
                            if (linkedHashMap.containsKey(str2)) {
                                ConstraintAttribute constraintAttribute = linkedHashMap.get(str2);
                                if (dVar instanceof d.b) {
                                    ((d.b) dVar).f40988f.append(i10, constraintAttribute);
                                } else {
                                    Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i10 + ", value" + constraintAttribute.a() + dVar);
                                }
                            }
                            break;
                        }
                        break;
                }
            }
        }
    }

    public final void c(Rect rect, b bVar, int i10, int i11) {
        rect.width();
        rect.height();
        b.a aVarH = bVar.h(i11);
        b.d dVar = aVarH.f16491c;
        int i12 = dVar.f16591c;
        this.f41315c = i12;
        int i13 = dVar.f16590b;
        this.f41316d = i13;
        this.f41318f = (i13 == 0 || i12 != 0) ? dVar.f16592d : 0.0f;
        b.e eVar = aVarH.f16494f;
        boolean z10 = eVar.f16606m;
        this.f41319g = eVar.f16607n;
        this.f41320h = eVar.f16596b;
        this.f41321i = eVar.f16597c;
        this.f41314b = eVar.f16598d;
        this.j = eVar.f16599e;
        this.f41322k = eVar.f16600f;
        this.f41323l = eVar.f16601g;
        this.f41324m = eVar.f16602h;
        this.f41325n = eVar.j;
        this.f41326o = eVar.f16604k;
        this.f41327p = eVar.f16605l;
        b.c cVar = aVarH.f16492d;
        c.c(cVar.f16580d);
        this.f41328q = cVar.f16584h;
        this.f41329r = aVarH.f16491c.f16593e;
        for (String str : aVarH.f16495g.keySet()) {
            ConstraintAttribute constraintAttribute = aVarH.f16495g.get(str);
            int iOrdinal = constraintAttribute.f16366c.ordinal();
            if (iOrdinal != 4 && iOrdinal != 5 && iOrdinal != 7) {
                this.f41317e.put(str, constraintAttribute);
            }
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return;
                    }
                }
            }
            float f10 = this.f41320h + 90.0f;
            this.f41320h = f10;
            if (f10 > 180.0f) {
                this.f41320h = f10 - 360.0f;
                return;
            }
            return;
        }
        this.f41320h -= 90.0f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(l lVar) {
        lVar.getClass();
        return Float.compare(0.0f, 0.0f);
    }
}
