package p126k0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p077g0.e;
import p113j0.c;
import p113j0.d;

/* JADX INFO: compiled from: KeyCycle.java */
/* JADX INFO: loaded from: classes.dex */
public final class f extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f41246e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f41247f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f41248g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f41249h = Float.NaN;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f41250i = 0.0f;
    public float j = 0.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f41251k = Float.NaN;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f41252l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f41253m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f41254n = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f41255o = Float.NaN;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f41256p = Float.NaN;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f41257q = Float.NaN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f41258r = Float.NaN;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f41259s = Float.NaN;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f41260t = Float.NaN;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f41261u = Float.NaN;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f41262v = Float.NaN;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f41263w = Float.NaN;

    /* JADX INFO: compiled from: KeyCycle.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseIntArray f41264a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f41264a = sparseIntArray;
            sparseIntArray.append(13, 1);
            sparseIntArray.append(11, 2);
            sparseIntArray.append(14, 3);
            sparseIntArray.append(10, 4);
            sparseIntArray.append(19, 5);
            sparseIntArray.append(17, 6);
            sparseIntArray.append(16, 7);
            sparseIntArray.append(20, 8);
            sparseIntArray.append(0, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(5, 11);
            sparseIntArray.append(6, 12);
            sparseIntArray.append(7, 13);
            sparseIntArray.append(15, 14);
            sparseIntArray.append(3, 15);
            sparseIntArray.append(4, 16);
            sparseIntArray.append(1, 17);
            sparseIntArray.append(2, 18);
            sparseIntArray.append(8, 19);
            sparseIntArray.append(12, 20);
            sparseIntArray.append(18, 21);
        }
    }

    public f() {
        this.f41230d = new HashMap<>();
    }

    @Override // p126k0.d
    public final void a(HashMap<String, d> map) {
        throw null;
    }

    @Override // p126k0.d
    /* JADX INFO: renamed from: b */
    public final d clone() {
        f fVar = new f();
        super.c(this);
        fVar.f41246e = this.f41246e;
        fVar.f41247f = this.f41247f;
        fVar.f41248g = this.f41248g;
        fVar.f41249h = this.f41249h;
        fVar.f41250i = this.f41250i;
        fVar.j = this.j;
        fVar.f41251k = this.f41251k;
        fVar.f41252l = this.f41252l;
        fVar.f41253m = this.f41253m;
        fVar.f41254n = this.f41254n;
        fVar.f41255o = this.f41255o;
        fVar.f41256p = this.f41256p;
        fVar.f41257q = this.f41257q;
        fVar.f41258r = this.f41258r;
        fVar.f41259s = this.f41259s;
        fVar.f41260t = this.f41260t;
        fVar.f41261u = this.f41261u;
        fVar.f41262v = this.f41262v;
        fVar.f41263w = this.f41263w;
        return fVar;
    }

    @Override // p126k0.d
    public final void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f41253m)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f41254n)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f41255o)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f41257q)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f41258r)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f41259s)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f41260t)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f41256p)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f41261u)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f41262v)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f41263w)) {
            hashSet.add("translationZ");
        }
        if (this.f41230d.size() > 0) {
            Iterator<String> it = this.f41230d.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // p126k0.d
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p139l0.d.f44129g);
        SparseIntArray sparseIntArray = a.f41264a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            SparseIntArray sparseIntArray2 = a.f41264a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    if (MotionLayout.f16153U0) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f41228b);
                        this.f41228b = resourceId;
                        if (resourceId == -1) {
                            this.f41229c = typedArrayObtainStyledAttributes.getString(index);
                        }
                    } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f41229c = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f41228b = typedArrayObtainStyledAttributes.getResourceId(index, this.f41228b);
                    }
                    break;
                case 2:
                    this.f41227a = typedArrayObtainStyledAttributes.getInt(index, this.f41227a);
                    break;
                case 3:
                    typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 4:
                    this.f41246e = typedArrayObtainStyledAttributes.getInteger(index, this.f41246e);
                    break;
                case 5:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f41248g = typedArrayObtainStyledAttributes.getString(index);
                        this.f41247f = 7;
                    } else {
                        this.f41247f = typedArrayObtainStyledAttributes.getInt(index, this.f41247f);
                    }
                    break;
                case 6:
                    this.f41249h = typedArrayObtainStyledAttributes.getFloat(index, this.f41249h);
                    break;
                case 7:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 5) {
                        this.f41250i = typedArrayObtainStyledAttributes.getDimension(index, this.f41250i);
                    } else {
                        this.f41250i = typedArrayObtainStyledAttributes.getFloat(index, this.f41250i);
                    }
                    break;
                case 8:
                    this.f41252l = typedArrayObtainStyledAttributes.getInt(index, this.f41252l);
                    break;
                case 9:
                    this.f41253m = typedArrayObtainStyledAttributes.getFloat(index, this.f41253m);
                    break;
                case 10:
                    this.f41254n = typedArrayObtainStyledAttributes.getDimension(index, this.f41254n);
                    break;
                case 11:
                    this.f41255o = typedArrayObtainStyledAttributes.getFloat(index, this.f41255o);
                    break;
                case 12:
                    this.f41257q = typedArrayObtainStyledAttributes.getFloat(index, this.f41257q);
                    break;
                case 13:
                    this.f41258r = typedArrayObtainStyledAttributes.getFloat(index, this.f41258r);
                    break;
                case 14:
                    this.f41256p = typedArrayObtainStyledAttributes.getFloat(index, this.f41256p);
                    break;
                case 15:
                    this.f41259s = typedArrayObtainStyledAttributes.getFloat(index, this.f41259s);
                    break;
                case 16:
                    this.f41260t = typedArrayObtainStyledAttributes.getFloat(index, this.f41260t);
                    break;
                case 17:
                    this.f41261u = typedArrayObtainStyledAttributes.getDimension(index, this.f41261u);
                    break;
                case 18:
                    this.f41262v = typedArrayObtainStyledAttributes.getDimension(index, this.f41262v);
                    break;
                case 19:
                    this.f41263w = typedArrayObtainStyledAttributes.getDimension(index, this.f41263w);
                    break;
                case 20:
                    this.f41251k = typedArrayObtainStyledAttributes.getFloat(index, this.f41251k);
                    break;
                case 21:
                    this.j = typedArrayObtainStyledAttributes.getFloat(index, this.j) / 360.0f;
                    break;
                default:
                    Log.e("KeyCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    public final void g(HashMap<String, c> map) {
        float f10;
        c cVar;
        c cVar2;
        int i10 = 7;
        for (String str : map.keySet()) {
            if (str.startsWith("CUSTOM")) {
                ConstraintAttribute constraintAttribute = this.f41230d.get(str.substring(i10));
                if (constraintAttribute != null) {
                    if (constraintAttribute.f16366c == ConstraintAttribute.AttributeType.f16373c && (cVar2 = map.get(str)) != null) {
                        int i11 = this.f41227a;
                        int i12 = this.f41247f;
                        String str2 = this.f41248g;
                        int i13 = this.f41252l;
                        cVar2.f35115f.add(new e.b(this.f41249h, this.f41250i, this.j, constraintAttribute.a(), i11));
                        if (i13 != -1) {
                            cVar2.f35114e = i13;
                        }
                        cVar2.f35112c = i12;
                        cVar2.b(constraintAttribute);
                        cVar2.f35113d = str2;
                    }
                }
            } else {
                switch (str) {
                    case "rotationX":
                        f10 = this.f41257q;
                        break;
                    case "rotationY":
                        f10 = this.f41258r;
                        break;
                    case "translationX":
                        f10 = this.f41261u;
                        break;
                    case "translationY":
                        f10 = this.f41262v;
                        break;
                    case "translationZ":
                        f10 = this.f41263w;
                        break;
                    case "progress":
                        f10 = this.f41251k;
                        break;
                    case "scaleX":
                        f10 = this.f41259s;
                        break;
                    case "scaleY":
                        f10 = this.f41260t;
                        break;
                    case "rotation":
                        f10 = this.f41255o;
                        break;
                    case "elevation":
                        f10 = this.f41254n;
                        break;
                    case "transitionPathRotate":
                        f10 = this.f41256p;
                        break;
                    case "alpha":
                        f10 = this.f41253m;
                        break;
                    case "waveOffset":
                        f10 = this.f41250i;
                        break;
                    case "wavePhase":
                        f10 = this.j;
                        break;
                    default:
                        str.startsWith("CUSTOM");
                        f10 = Float.NaN;
                        break;
                }
                float f11 = f10;
                if (!Float.isNaN(f11) && (cVar = map.get(str)) != null) {
                    int i14 = this.f41227a;
                    int i15 = this.f41247f;
                    String str3 = this.f41248g;
                    int i16 = this.f41252l;
                    cVar.f35115f.add(new e.b(this.f41249h, this.f41250i, this.j, f11, i14));
                    if (i16 != -1) {
                        cVar.f35114e = i16;
                    }
                    cVar.f35112c = i15;
                    cVar.f35113d = str3;
                }
            }
            i10 = 7;
        }
    }
}
