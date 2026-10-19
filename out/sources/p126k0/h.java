package p126k0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.HashMap;
import p077g0.c;
import p113j0.d;

/* JADX INFO: compiled from: KeyPosition.java */
/* JADX INFO: loaded from: classes.dex */
public final class h extends i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f41267f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f41268g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f41269h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f41270i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f41271k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f41272l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f41273m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f41274n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f41275o;

    /* JADX INFO: compiled from: KeyPosition.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseIntArray f41276a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f41276a = sparseIntArray;
            sparseIntArray.append(4, 1);
            sparseIntArray.append(2, 2);
            sparseIntArray.append(11, 3);
            sparseIntArray.append(0, 4);
            sparseIntArray.append(1, 5);
            sparseIntArray.append(8, 6);
            sparseIntArray.append(9, 7);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(10, 8);
            sparseIntArray.append(7, 11);
            sparseIntArray.append(6, 12);
            sparseIntArray.append(5, 10);
        }
    }

    public h() {
        this.f41277e = -1;
        this.f41267f = null;
        this.f41268g = -1;
        this.f41269h = 0;
        this.f41270i = Float.NaN;
        this.j = Float.NaN;
        this.f41271k = Float.NaN;
        this.f41272l = Float.NaN;
        this.f41273m = Float.NaN;
        this.f41274n = Float.NaN;
        this.f41275o = 0;
    }

    @Override // p126k0.d
    public final void a(HashMap<String, d> map) {
        throw null;
    }

    @Override // p126k0.d
    /* JADX INFO: renamed from: b */
    public final d clone() {
        h hVar = new h();
        super.c(this);
        hVar.f41267f = this.f41267f;
        hVar.f41268g = this.f41268g;
        hVar.f41269h = this.f41269h;
        hVar.f41270i = this.f41270i;
        hVar.j = Float.NaN;
        hVar.f41271k = this.f41271k;
        hVar.f41272l = this.f41272l;
        hVar.f41273m = this.f41273m;
        hVar.f41274n = this.f41274n;
        return hVar;
    }

    @Override // p126k0.d
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p139l0.d.f44130h);
        SparseIntArray sparseIntArray = a.f41276a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            SparseIntArray sparseIntArray2 = a.f41276a;
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
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f41267f = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f41267f = c.f35104c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    this.f41277e = typedArrayObtainStyledAttributes.getInteger(index, this.f41277e);
                    break;
                case 5:
                    this.f41269h = typedArrayObtainStyledAttributes.getInt(index, this.f41269h);
                    break;
                case 6:
                    this.f41271k = typedArrayObtainStyledAttributes.getFloat(index, this.f41271k);
                    break;
                case 7:
                    this.f41272l = typedArrayObtainStyledAttributes.getFloat(index, this.f41272l);
                    break;
                case 8:
                    float f10 = typedArrayObtainStyledAttributes.getFloat(index, this.j);
                    this.f41270i = f10;
                    this.j = f10;
                    break;
                case 9:
                    this.f41275o = typedArrayObtainStyledAttributes.getInt(index, this.f41275o);
                    break;
                case 10:
                    this.f41268g = typedArrayObtainStyledAttributes.getInt(index, this.f41268g);
                    break;
                case 11:
                    this.f41270i = typedArrayObtainStyledAttributes.getFloat(index, this.f41270i);
                    break;
                case 12:
                    this.j = typedArrayObtainStyledAttributes.getFloat(index, this.j);
                    break;
                default:
                    Log.e("KeyPosition", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
            }
        }
        if (this.f41227a == -1) {
            Log.e("KeyPosition", "no frame position");
        }
    }
}
