package p126k0;

import B7.b;
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
import p113j0.d;

/* JADX INFO: compiled from: KeyAttributes.java */
/* JADX INFO: loaded from: classes.dex */
public final class e extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f41231e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f41232f = Float.NaN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f41233g = Float.NaN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f41234h = Float.NaN;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f41235i = Float.NaN;
    public float j = Float.NaN;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f41236k = Float.NaN;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f41237l = Float.NaN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f41238m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f41239n = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f41240o = Float.NaN;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f41241p = Float.NaN;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f41242q = Float.NaN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f41243r = Float.NaN;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f41244s = Float.NaN;

    /* JADX INFO: compiled from: KeyAttributes.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseIntArray f41245a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f41245a = sparseIntArray;
            sparseIntArray.append(0, 1);
            sparseIntArray.append(11, 2);
            sparseIntArray.append(7, 4);
            sparseIntArray.append(8, 5);
            sparseIntArray.append(9, 6);
            sparseIntArray.append(1, 19);
            sparseIntArray.append(2, 20);
            sparseIntArray.append(5, 7);
            sparseIntArray.append(18, 8);
            sparseIntArray.append(17, 9);
            sparseIntArray.append(15, 10);
            sparseIntArray.append(13, 12);
            sparseIntArray.append(12, 13);
            sparseIntArray.append(6, 14);
            sparseIntArray.append(3, 15);
            sparseIntArray.append(4, 16);
            sparseIntArray.append(10, 17);
            sparseIntArray.append(14, 18);
        }
    }

    public e() {
        this.f41230d = new HashMap<>();
    }

    @Override // p126k0.d
    public final void a(HashMap<String, d> map) {
        for (String str : map.keySet()) {
            d dVar = map.get(str);
            if (dVar != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.f41235i)) {
                                break;
                            } else {
                                dVar.b(this.f41235i, this.f41227a);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.j)) {
                                break;
                            } else {
                                dVar.b(this.j, this.f41227a);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.f41241p)) {
                                break;
                            } else {
                                dVar.b(this.f41241p, this.f41227a);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.f41242q)) {
                                break;
                            } else {
                                dVar.b(this.f41242q, this.f41227a);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.f41243r)) {
                                break;
                            } else {
                                dVar.b(this.f41243r, this.f41227a);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.f41244s)) {
                                break;
                            } else {
                                dVar.b(this.f41244s, this.f41227a);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.f41239n)) {
                                break;
                            } else {
                                dVar.b(this.f41239n, this.f41227a);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.f41240o)) {
                                break;
                            } else {
                                dVar.b(this.f41240o, this.f41227a);
                                break;
                            }
                            break;
                        case "transformPivotX":
                            if (Float.isNaN(this.f41235i)) {
                                break;
                            } else {
                                dVar.b(this.f41236k, this.f41227a);
                                break;
                            }
                            break;
                        case "transformPivotY":
                            if (Float.isNaN(this.j)) {
                                break;
                            } else {
                                dVar.b(this.f41237l, this.f41227a);
                                break;
                            }
                            break;
                        case "rotation":
                            if (Float.isNaN(this.f41234h)) {
                                break;
                            } else {
                                dVar.b(this.f41234h, this.f41227a);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.f41233g)) {
                                break;
                            } else {
                                dVar.b(this.f41233g, this.f41227a);
                                break;
                            }
                            break;
                        case "transitionPathRotate":
                            if (Float.isNaN(this.f41238m)) {
                                break;
                            } else {
                                dVar.b(this.f41238m, this.f41227a);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.f41232f)) {
                                break;
                            } else {
                                dVar.b(this.f41232f, this.f41227a);
                                break;
                            }
                            break;
                    }
                } else {
                    ConstraintAttribute constraintAttribute = this.f41230d.get(str.substring(7));
                    if (constraintAttribute != null) {
                        ((d.b) dVar).f40988f.append(this.f41227a, constraintAttribute);
                    }
                }
            }
        }
    }

    @Override // p126k0.d
    /* JADX INFO: renamed from: b */
    public final d clone() {
        e eVar = new e();
        super.c(this);
        eVar.f41231e = this.f41231e;
        eVar.f41232f = this.f41232f;
        eVar.f41233g = this.f41233g;
        eVar.f41234h = this.f41234h;
        eVar.f41235i = this.f41235i;
        eVar.j = this.j;
        eVar.f41236k = this.f41236k;
        eVar.f41237l = this.f41237l;
        eVar.f41238m = this.f41238m;
        eVar.f41239n = this.f41239n;
        eVar.f41240o = this.f41240o;
        eVar.f41241p = this.f41241p;
        eVar.f41242q = this.f41242q;
        eVar.f41243r = this.f41243r;
        eVar.f41244s = this.f41244s;
        return eVar;
    }

    @Override // p126k0.d
    public final void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f41232f)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f41233g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f41234h)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f41235i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f41236k)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f41237l)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f41241p)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f41242q)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f41243r)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f41238m)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f41239n)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f41240o)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f41244s)) {
            hashSet.add("progress");
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
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p139l0.d.f44128f);
        SparseIntArray sparseIntArray = a.f41245a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            SparseIntArray sparseIntArray2 = a.f41245a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f41232f = typedArrayObtainStyledAttributes.getFloat(index, this.f41232f);
                    break;
                case 2:
                    this.f41233g = typedArrayObtainStyledAttributes.getDimension(index, this.f41233g);
                    break;
                case 3:
                case 11:
                default:
                    Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.f41234h = typedArrayObtainStyledAttributes.getFloat(index, this.f41234h);
                    break;
                case 5:
                    this.f41235i = typedArrayObtainStyledAttributes.getFloat(index, this.f41235i);
                    break;
                case 6:
                    this.j = typedArrayObtainStyledAttributes.getFloat(index, this.j);
                    break;
                case 7:
                    this.f41239n = typedArrayObtainStyledAttributes.getFloat(index, this.f41239n);
                    break;
                case 8:
                    this.f41238m = typedArrayObtainStyledAttributes.getFloat(index, this.f41238m);
                    break;
                case 9:
                    typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 10:
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
                case 12:
                    this.f41227a = typedArrayObtainStyledAttributes.getInt(index, this.f41227a);
                    break;
                case 13:
                    this.f41231e = typedArrayObtainStyledAttributes.getInteger(index, this.f41231e);
                    break;
                case 14:
                    this.f41240o = typedArrayObtainStyledAttributes.getFloat(index, this.f41240o);
                    break;
                case 15:
                    this.f41241p = typedArrayObtainStyledAttributes.getDimension(index, this.f41241p);
                    break;
                case 16:
                    this.f41242q = typedArrayObtainStyledAttributes.getDimension(index, this.f41242q);
                    break;
                case 17:
                    this.f41243r = typedArrayObtainStyledAttributes.getDimension(index, this.f41243r);
                    break;
                case 18:
                    this.f41244s = typedArrayObtainStyledAttributes.getFloat(index, this.f41244s);
                    break;
                case 19:
                    this.f41236k = typedArrayObtainStyledAttributes.getDimension(index, this.f41236k);
                    break;
                case 20:
                    this.f41237l = typedArrayObtainStyledAttributes.getDimension(index, this.f41237l);
                    break;
            }
        }
    }

    @Override // p126k0.d
    public final void f(HashMap<String, Integer> map) {
        if (this.f41231e == -1) {
            return;
        }
        if (!Float.isNaN(this.f41232f)) {
            map.put("alpha", Integer.valueOf(this.f41231e));
        }
        if (!Float.isNaN(this.f41233g)) {
            map.put("elevation", Integer.valueOf(this.f41231e));
        }
        if (!Float.isNaN(this.f41234h)) {
            map.put("rotation", Integer.valueOf(this.f41231e));
        }
        if (!Float.isNaN(this.f41235i)) {
            map.put("rotationX", Integer.valueOf(this.f41231e));
        }
        if (!Float.isNaN(this.j)) {
            map.put("rotationY", Integer.valueOf(this.f41231e));
        }
        if (!Float.isNaN(this.f41236k)) {
            map.put("transformPivotX", Integer.valueOf(this.f41231e));
        }
        if (!Float.isNaN(this.f41237l)) {
            map.put("transformPivotY", Integer.valueOf(this.f41231e));
        }
        if (!Float.isNaN(this.f41241p)) {
            map.put("translationX", Integer.valueOf(this.f41231e));
        }
        if (!Float.isNaN(this.f41242q)) {
            map.put("translationY", Integer.valueOf(this.f41231e));
        }
        if (!Float.isNaN(this.f41243r)) {
            map.put("translationZ", Integer.valueOf(this.f41231e));
        }
        if (!Float.isNaN(this.f41238m)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f41231e));
        }
        if (!Float.isNaN(this.f41239n)) {
            map.put("scaleX", Integer.valueOf(this.f41231e));
        }
        if (!Float.isNaN(this.f41240o)) {
            map.put("scaleY", Integer.valueOf(this.f41231e));
        }
        if (!Float.isNaN(this.f41244s)) {
            map.put("progress", Integer.valueOf(this.f41231e));
        }
        if (this.f41230d.size() > 0) {
            Iterator<String> it = this.f41230d.keySet().iterator();
            while (it.hasNext()) {
                map.put(b.c("CUSTOM,", it.next()), Integer.valueOf(this.f41231e));
            }
        }
    }
}
