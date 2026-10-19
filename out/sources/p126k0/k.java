package p126k0;

import B7.b;
import C7.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import p113j0.d;

/* JADX INFO: compiled from: KeyTrigger.java */
/* JADX INFO: loaded from: classes.dex */
public final class k extends d {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f41311w;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f41294e = 0.1f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f41295f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f41296g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f41297h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RectF f41298i = new RectF();
    public RectF j = new RectF();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public HashMap<String, Method> f41299k = new HashMap<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f41300l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f41301m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f41302n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f41303o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f41304p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f41305q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f41306r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f41307s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f41308t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f41309u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f41310v = Float.NaN;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f41312x = false;

    /* JADX INFO: compiled from: KeyTrigger.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseIntArray f41313a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f41313a = sparseIntArray;
            sparseIntArray.append(0, 8);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 1);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(7, 6);
            sparseIntArray.append(9, 5);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(2, 10);
            sparseIntArray.append(8, 11);
            sparseIntArray.append(10, 12);
            sparseIntArray.append(11, 13);
            sparseIntArray.append(12, 14);
        }
    }

    public k() {
        this.f41230d = new HashMap<>();
    }

    public static void i(RectF rectF, View view, boolean z10) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z10) {
            view.getMatrix().mapRect(rectF);
        }
    }

    @Override // p126k0.d
    public final void a(HashMap<String, d> map) {
        throw null;
    }

    @Override // p126k0.d
    /* JADX INFO: renamed from: b */
    public final d clone() {
        k kVar = new k();
        super.c(this);
        kVar.f41300l = this.f41300l;
        kVar.f41301m = this.f41301m;
        kVar.f41302n = this.f41302n;
        kVar.f41303o = this.f41303o;
        kVar.f41304p = this.f41304p;
        kVar.f41305q = this.f41305q;
        kVar.f41306r = this.f41306r;
        kVar.f41294e = this.f41294e;
        kVar.f41307s = this.f41307s;
        kVar.f41308t = this.f41308t;
        kVar.f41309u = this.f41309u;
        kVar.f41310v = this.f41310v;
        kVar.f41311w = this.f41311w;
        kVar.f41312x = this.f41312x;
        kVar.f41298i = this.f41298i;
        kVar.j = this.j;
        kVar.f41299k = this.f41299k;
        return kVar;
    }

    @Override // p126k0.d
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p139l0.d.j);
        SparseIntArray sparseIntArray = a.f41313a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            SparseIntArray sparseIntArray2 = a.f41313a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f41302n = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 2:
                    this.f41303o = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 3:
                default:
                    Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.f41300l = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 5:
                    this.f41294e = typedArrayObtainStyledAttributes.getFloat(index, this.f41294e);
                    break;
                case 6:
                    this.f41304p = typedArrayObtainStyledAttributes.getResourceId(index, this.f41304p);
                    break;
                case 7:
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
                case 8:
                    int integer = typedArrayObtainStyledAttributes.getInteger(index, this.f41227a);
                    this.f41227a = integer;
                    this.f41310v = (integer + 0.5f) / 100.0f;
                    break;
                case 9:
                    this.f41305q = typedArrayObtainStyledAttributes.getResourceId(index, this.f41305q);
                    break;
                case 10:
                    this.f41312x = typedArrayObtainStyledAttributes.getBoolean(index, this.f41312x);
                    break;
                case 11:
                    this.f41301m = typedArrayObtainStyledAttributes.getResourceId(index, this.f41301m);
                    break;
                case 12:
                    this.f41297h = typedArrayObtainStyledAttributes.getResourceId(index, this.f41297h);
                    break;
                case 13:
                    this.f41295f = typedArrayObtainStyledAttributes.getResourceId(index, this.f41295f);
                    break;
                case 14:
                    this.f41296g = typedArrayObtainStyledAttributes.getResourceId(index, this.f41296g);
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008c  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d7  */
    public final void g(View view, float f10) {
        boolean z10;
        boolean z11;
        float f11;
        float f12;
        float f13;
        float f14;
        boolean z12;
        boolean z13;
        boolean z14 = true;
        boolean z15 = false;
        if (this.f41305q != -1) {
            if (this.f41306r == null) {
                this.f41306r = ((ViewGroup) view.getParent()).findViewById(this.f41305q);
            }
            i(this.f41298i, this.f41306r, this.f41312x);
            i(this.j, view, this.f41312x);
            if (this.f41298i.intersect(this.j)) {
                if (this.f41307s) {
                    this.f41307s = false;
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f41309u) {
                    this.f41309u = false;
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.f41308t = true;
            } else {
                if (this.f41307s) {
                    z10 = false;
                } else {
                    this.f41307s = true;
                    z10 = true;
                }
                if (this.f41308t) {
                    this.f41308t = false;
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.f41309u = true;
                boolean z16 = z12;
                z13 = false;
                z15 = z16;
            }
            z14 = z13;
        } else {
            if (this.f41307s) {
                float f15 = this.f41310v;
                if ((this.f41311w - f15) * (f10 - f15) < 0.0f) {
                    this.f41307s = false;
                    z10 = true;
                }
                if (this.f41308t) {
                    f13 = this.f41310v;
                    f14 = f10 - f13;
                    if ((this.f41311w - f13) * f14 >= 0.0f && f14 < 0.0f) {
                        this.f41308t = false;
                        z11 = true;
                    }
                    if (this.f41309u) {
                        f11 = this.f41310v;
                        f12 = f10 - f11;
                        if ((this.f41311w - f11) * f12 >= 0.0f && f12 > 0.0f) {
                            this.f41309u = false;
                        }
                        z15 = z11;
                    } else if (Math.abs(f10 - this.f41310v) > this.f41294e) {
                        this.f41309u = true;
                    }
                    z14 = false;
                    z15 = z11;
                } else if (Math.abs(f10 - this.f41310v) > this.f41294e) {
                    this.f41308t = true;
                }
                z11 = false;
                if (this.f41309u) {
                    f11 = this.f41310v;
                    f12 = f10 - f11;
                    if ((this.f41311w - f11) * f12 >= 0.0f) {
                    }
                    z15 = z11;
                } else if (Math.abs(f10 - this.f41310v) > this.f41294e) {
                    this.f41309u = true;
                }
                z14 = false;
                z15 = z11;
            } else if (Math.abs(f10 - this.f41310v) > this.f41294e) {
                this.f41307s = true;
            }
            z10 = false;
            if (this.f41308t) {
                f13 = this.f41310v;
                f14 = f10 - f13;
                if ((this.f41311w - f13) * f14 >= 0.0f) {
                }
                if (this.f41309u) {
                    f11 = this.f41310v;
                    f12 = f10 - f11;
                    if ((this.f41311w - f11) * f12 >= 0.0f) {
                    }
                    z15 = z11;
                } else if (Math.abs(f10 - this.f41310v) > this.f41294e) {
                    this.f41309u = true;
                }
                z14 = false;
                z15 = z11;
            } else if (Math.abs(f10 - this.f41310v) > this.f41294e) {
                this.f41308t = true;
            }
            z11 = false;
            if (this.f41309u) {
                f11 = this.f41310v;
                f12 = f10 - f11;
                if ((this.f41311w - f11) * f12 >= 0.0f) {
                }
                z15 = z11;
            } else if (Math.abs(f10 - this.f41310v) > this.f41294e) {
                this.f41309u = true;
            }
            z14 = false;
            z15 = z11;
        }
        this.f41311w = f10;
        if (z15 || z10 || z14) {
            MotionLayout motionLayout = (MotionLayout) view.getParent();
            MotionLayout.h hVar = motionLayout.f16174K;
            CopyOnWriteArrayList<MotionLayout.h> copyOnWriteArrayList = motionLayout.f16204t0;
            if (copyOnWriteArrayList != null) {
                Iterator<MotionLayout.h> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    it.next().getClass();
                }
            }
        }
        View viewFindViewById = this.f41301m == -1 ? view : ((MotionLayout) view.getParent()).findViewById(this.f41301m);
        if (z15) {
            String str = this.f41302n;
            if (str != null) {
                h(viewFindViewById, str);
            }
            if (this.f41295f != -1) {
                ((MotionLayout) view.getParent()).G(this.f41295f, viewFindViewById);
            }
        }
        if (z14) {
            String str2 = this.f41303o;
            if (str2 != null) {
                h(viewFindViewById, str2);
            }
            if (this.f41296g != -1) {
                ((MotionLayout) view.getParent()).G(this.f41296g, viewFindViewById);
            }
        }
        if (z10) {
            String str3 = this.f41300l;
            if (str3 != null) {
                h(viewFindViewById, str3);
            }
            if (this.f41297h != -1) {
                ((MotionLayout) view.getParent()).G(this.f41297h, viewFindViewById);
            }
        }
    }

    public final void h(View view, String str) {
        Method method;
        if (str == null) {
            return;
        }
        if (!str.startsWith(".")) {
            if (this.f41299k.containsKey(str)) {
                method = this.f41299k.get(str);
                if (method == null) {
                    return;
                }
            } else {
                method = null;
            }
            if (method == null) {
                try {
                    method = view.getClass().getMethod(str, null);
                    this.f41299k.put(str, method);
                } catch (NoSuchMethodException unused) {
                    this.f41299k.put(str, null);
                    Log.e("KeyTrigger", "Could not find method \"" + str + "\"on class " + view.getClass().getSimpleName() + " " + p126k0.a.d(view));
                    return;
                }
            }
            try {
                method.invoke(view, null);
                return;
            } catch (Exception unused2) {
                Log.e("KeyTrigger", "Exception in call \"" + this.f41300l + "\"on class " + view.getClass().getSimpleName() + " " + p126k0.a.d(view));
                return;
            }
        }
        boolean z10 = str.length() == 1;
        if (!z10) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.f41230d.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z10 || lowerCase.matches(str)) {
                ConstraintAttribute constraintAttribute = this.f41230d.get(str2);
                if (constraintAttribute != null) {
                    Class<?> cls = view.getClass();
                    boolean z11 = constraintAttribute.f16364a;
                    String str3 = constraintAttribute.f16365b;
                    String strC = !z11 ? b.c("set", str3) : str3;
                    try {
                        switch (constraintAttribute.f16366c.ordinal()) {
                            case 0:
                            case 7:
                                cls.getMethod(strC, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f16367d));
                                break;
                            case 1:
                                cls.getMethod(strC, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f16368e));
                                break;
                            case 2:
                                cls.getMethod(strC, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f16371h));
                                break;
                            case 3:
                                Method method2 = cls.getMethod(strC, Drawable.class);
                                ColorDrawable colorDrawable = new ColorDrawable();
                                colorDrawable.setColor(constraintAttribute.f16371h);
                                method2.invoke(view, colorDrawable);
                                break;
                            case 4:
                                cls.getMethod(strC, CharSequence.class).invoke(view, constraintAttribute.f16369f);
                                break;
                            case 5:
                                cls.getMethod(strC, Boolean.TYPE).invoke(view, Boolean.valueOf(constraintAttribute.f16370g));
                                break;
                            case 6:
                                cls.getMethod(strC, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f16368e));
                                break;
                        }
                    } catch (IllegalAccessException e10) {
                        StringBuilder sbA = g.a(" Custom Attribute \"", str3, "\" not found on ");
                        sbA.append(cls.getName());
                        Log.e("TransitionLayout", sbA.toString(), e10);
                    } catch (NoSuchMethodException e11) {
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + strC, e11);
                    } catch (InvocationTargetException e12) {
                        StringBuilder sbA2 = g.a(" Custom Attribute \"", str3, "\" not found on ");
                        sbA2.append(cls.getName());
                        Log.e("TransitionLayout", sbA2.toString(), e12);
                    }
                }
            }
        }
    }

    @Override // p126k0.d
    public final void d(HashSet<String> hashSet) {
    }
}
