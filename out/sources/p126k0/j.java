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
import p113j0.e;

/* JADX INFO: compiled from: KeyTimeCycle.java */
/* JADX INFO: loaded from: classes.dex */
public final class j extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f41278e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f41279f = Float.NaN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f41280g = Float.NaN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f41281h = Float.NaN;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f41282i = Float.NaN;
    public float j = Float.NaN;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f41283k = Float.NaN;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f41284l = Float.NaN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f41285m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f41286n = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f41287o = Float.NaN;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f41288p = Float.NaN;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f41289q = Float.NaN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f41290r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f41291s = Float.NaN;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f41292t = 0.0f;

    /* JADX INFO: compiled from: KeyTimeCycle.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseIntArray f41293a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f41293a = sparseIntArray;
            sparseIntArray.append(0, 1);
            sparseIntArray.append(9, 2);
            sparseIntArray.append(5, 4);
            sparseIntArray.append(6, 5);
            sparseIntArray.append(7, 6);
            sparseIntArray.append(3, 7);
            sparseIntArray.append(15, 8);
            sparseIntArray.append(14, 9);
            sparseIntArray.append(13, 10);
            sparseIntArray.append(11, 12);
            sparseIntArray.append(10, 13);
            sparseIntArray.append(4, 14);
            sparseIntArray.append(1, 15);
            sparseIntArray.append(2, 16);
            sparseIntArray.append(8, 17);
            sparseIntArray.append(12, 18);
            sparseIntArray.append(18, 20);
            sparseIntArray.append(17, 21);
            sparseIntArray.append(20, 19);
        }
    }

    public j() {
        this.f41230d = new HashMap<>();
    }

    @Override // p126k0.d
    public final void a(HashMap<String, d> map) {
        throw null;
    }

    @Override // p126k0.d
    /* JADX INFO: renamed from: b */
    public final d clone() {
        j jVar = new j();
        super.c(this);
        jVar.f41278e = this.f41278e;
        jVar.f41290r = this.f41290r;
        jVar.f41291s = this.f41291s;
        jVar.f41292t = this.f41292t;
        jVar.f41289q = this.f41289q;
        jVar.f41279f = this.f41279f;
        jVar.f41280g = this.f41280g;
        jVar.f41281h = this.f41281h;
        jVar.f41283k = this.f41283k;
        jVar.f41282i = this.f41282i;
        jVar.j = this.j;
        jVar.f41284l = this.f41284l;
        jVar.f41285m = this.f41285m;
        jVar.f41286n = this.f41286n;
        jVar.f41287o = this.f41287o;
        jVar.f41288p = this.f41288p;
        return jVar;
    }

    @Override // p126k0.d
    public final void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f41279f)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f41280g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f41281h)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f41282i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f41286n)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f41287o)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f41288p)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f41283k)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f41284l)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f41285m)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f41289q)) {
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
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p139l0.d.f44131i);
        SparseIntArray sparseIntArray = a.f41293a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            SparseIntArray sparseIntArray2 = a.f41293a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f41279f = typedArrayObtainStyledAttributes.getFloat(index, this.f41279f);
                    break;
                case 2:
                    this.f41280g = typedArrayObtainStyledAttributes.getDimension(index, this.f41280g);
                    break;
                case 3:
                case 11:
                default:
                    Log.e("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.f41281h = typedArrayObtainStyledAttributes.getFloat(index, this.f41281h);
                    break;
                case 5:
                    this.f41282i = typedArrayObtainStyledAttributes.getFloat(index, this.f41282i);
                    break;
                case 6:
                    this.j = typedArrayObtainStyledAttributes.getFloat(index, this.j);
                    break;
                case 7:
                    this.f41284l = typedArrayObtainStyledAttributes.getFloat(index, this.f41284l);
                    break;
                case 8:
                    this.f41283k = typedArrayObtainStyledAttributes.getFloat(index, this.f41283k);
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
                    this.f41278e = typedArrayObtainStyledAttributes.getInteger(index, this.f41278e);
                    break;
                case 14:
                    this.f41285m = typedArrayObtainStyledAttributes.getFloat(index, this.f41285m);
                    break;
                case 15:
                    this.f41286n = typedArrayObtainStyledAttributes.getDimension(index, this.f41286n);
                    break;
                case 16:
                    this.f41287o = typedArrayObtainStyledAttributes.getDimension(index, this.f41287o);
                    break;
                case 17:
                    this.f41288p = typedArrayObtainStyledAttributes.getDimension(index, this.f41288p);
                    break;
                case 18:
                    this.f41289q = typedArrayObtainStyledAttributes.getFloat(index, this.f41289q);
                    break;
                case 19:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        this.f41290r = 7;
                    } else {
                        this.f41290r = typedArrayObtainStyledAttributes.getInt(index, this.f41290r);
                    }
                    break;
                case 20:
                    this.f41291s = typedArrayObtainStyledAttributes.getFloat(index, this.f41291s);
                    break;
                case 21:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 5) {
                        this.f41292t = typedArrayObtainStyledAttributes.getDimension(index, this.f41292t);
                    } else {
                        this.f41292t = typedArrayObtainStyledAttributes.getFloat(index, this.f41292t);
                    }
                    break;
            }
        }
    }

    @Override // p126k0.d
    public final void f(HashMap<String, Integer> map) {
        if (this.f41278e == -1) {
            return;
        }
        if (!Float.isNaN(this.f41279f)) {
            map.put("alpha", Integer.valueOf(this.f41278e));
        }
        if (!Float.isNaN(this.f41280g)) {
            map.put("elevation", Integer.valueOf(this.f41278e));
        }
        if (!Float.isNaN(this.f41281h)) {
            map.put("rotation", Integer.valueOf(this.f41278e));
        }
        if (!Float.isNaN(this.f41282i)) {
            map.put("rotationX", Integer.valueOf(this.f41278e));
        }
        if (!Float.isNaN(this.j)) {
            map.put("rotationY", Integer.valueOf(this.f41278e));
        }
        if (!Float.isNaN(this.f41286n)) {
            map.put("translationX", Integer.valueOf(this.f41278e));
        }
        if (!Float.isNaN(this.f41287o)) {
            map.put("translationY", Integer.valueOf(this.f41278e));
        }
        if (!Float.isNaN(this.f41288p)) {
            map.put("translationZ", Integer.valueOf(this.f41278e));
        }
        if (!Float.isNaN(this.f41283k)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f41278e));
        }
        if (!Float.isNaN(this.f41284l)) {
            map.put("scaleX", Integer.valueOf(this.f41278e));
        }
        if (!Float.isNaN(this.f41284l)) {
            map.put("scaleY", Integer.valueOf(this.f41278e));
        }
        if (!Float.isNaN(this.f41289q)) {
            map.put("progress", Integer.valueOf(this.f41278e));
        }
        if (this.f41230d.size() > 0) {
            Iterator<String> it = this.f41230d.keySet().iterator();
            while (it.hasNext()) {
                map.put(b.c("CUSTOM,", it.next()), Integer.valueOf(this.f41278e));
            }
        }
    }

    public final void g(HashMap<String, e> map) {
        for (String str : map.keySet()) {
            e eVar = map.get(str);
            if (eVar != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.f41282i)) {
                                break;
                            } else {
                                eVar.b(this.f41282i, this.f41291s, this.f41292t, this.f41227a, this.f41290r);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.j)) {
                                break;
                            } else {
                                eVar.b(this.j, this.f41291s, this.f41292t, this.f41227a, this.f41290r);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.f41286n)) {
                                break;
                            } else {
                                eVar.b(this.f41286n, this.f41291s, this.f41292t, this.f41227a, this.f41290r);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.f41287o)) {
                                break;
                            } else {
                                eVar.b(this.f41287o, this.f41291s, this.f41292t, this.f41227a, this.f41290r);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.f41288p)) {
                                break;
                            } else {
                                eVar.b(this.f41288p, this.f41291s, this.f41292t, this.f41227a, this.f41290r);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.f41289q)) {
                                break;
                            } else {
                                eVar.b(this.f41289q, this.f41291s, this.f41292t, this.f41227a, this.f41290r);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.f41284l)) {
                                break;
                            } else {
                                eVar.b(this.f41284l, this.f41291s, this.f41292t, this.f41227a, this.f41290r);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.f41285m)) {
                                break;
                            } else {
                                eVar.b(this.f41285m, this.f41291s, this.f41292t, this.f41227a, this.f41290r);
                                break;
                            }
                            break;
                        case "rotation":
                            if (Float.isNaN(this.f41281h)) {
                                break;
                            } else {
                                eVar.b(this.f41281h, this.f41291s, this.f41292t, this.f41227a, this.f41290r);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.f41280g)) {
                                break;
                            } else {
                                eVar.b(this.f41280g, this.f41291s, this.f41292t, this.f41227a, this.f41290r);
                                break;
                            }
                            break;
                        case "transitionPathRotate":
                            if (Float.isNaN(this.f41283k)) {
                                break;
                            } else {
                                eVar.b(this.f41283k, this.f41291s, this.f41292t, this.f41227a, this.f41290r);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.f41279f)) {
                                break;
                            } else {
                                eVar.b(this.f41279f, this.f41291s, this.f41292t, this.f41227a, this.f41290r);
                                break;
                            }
                            break;
                        default:
                            Log.e("KeyTimeCycles", "UNKNOWN addValues \"" + str + "\"");
                            break;
                    }
                } else {
                    ConstraintAttribute constraintAttribute = this.f41230d.get(str.substring(7));
                    if (constraintAttribute != null) {
                        e.b bVar = (e.b) eVar;
                        int i10 = this.f41227a;
                        float f10 = this.f41291s;
                        int i11 = this.f41290r;
                        float f11 = this.f41292t;
                        bVar.f40992l.append(i10, constraintAttribute);
                        bVar.f40993m.append(i10, new float[]{f10, f11});
                        bVar.f35172b = Math.max(bVar.f35172b, i11);
                    }
                }
            }
        }
    }
}
