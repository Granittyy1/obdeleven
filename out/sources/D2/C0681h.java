package D2;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.voltasit.obdeleven.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: D2.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ChangeTransform.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0681h extends F {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final String[] f2642H = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final a f2643I = new a(float[].class, "nonTranslations");

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final b f2644J = new b(PointF.class, "translations");

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final boolean f2645K = true;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f2646E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f2647F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Matrix f2648G;

    /* JADX INFO: renamed from: D2.h$a */
    /* JADX INFO: compiled from: ChangeTransform.java */
    public static class a extends Property<d, float[]> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ float[] get(d dVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(d dVar, float[] fArr) {
            d dVar2 = dVar;
            float[] fArr2 = fArr;
            dVar2.getClass();
            System.arraycopy(fArr2, 0, dVar2.f2653c, 0, fArr2.length);
            dVar2.a();
        }
    }

    /* JADX INFO: renamed from: D2.h$b */
    /* JADX INFO: compiled from: ChangeTransform.java */
    public static class b extends Property<d, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(d dVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(d dVar, PointF pointF) {
            d dVar2 = dVar;
            PointF pointF2 = pointF;
            dVar2.getClass();
            dVar2.f2654d = pointF2.x;
            dVar2.f2655e = pointF2.y;
            dVar2.a();
        }
    }

    /* JADX INFO: renamed from: D2.h$c */
    /* JADX INFO: compiled from: ChangeTransform.java */
    public static class c extends J {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f2649b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public r f2650c;

        @Override // D2.J, D2.F.e
        public final void a(F f10) {
            this.f2650c.setVisibility(4);
        }

        @Override // D2.J, D2.F.e
        public final void c(F f10) {
            this.f2650c.setVisibility(0);
        }

        @Override // D2.F.e
        public final void e(F f10) {
            f10.B(this);
            int i10 = Build.VERSION.SDK_INT;
            View view = this.f2649b;
            if (i10 == 28) {
                if (!C0692t.f2696h) {
                    try {
                        if (!C0692t.f2692d) {
                            try {
                                C0692t.f2691c = Class.forName("android.view.GhostView");
                            } catch (ClassNotFoundException unused) {
                            }
                            C0692t.f2692d = true;
                        }
                        Method declaredMethod = C0692t.f2691c.getDeclaredMethod("removeGhost", View.class);
                        C0692t.f2695g = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException unused2) {
                    }
                    C0692t.f2696h = true;
                }
                Method method = C0692t.f2695g;
                if (method != null) {
                    try {
                        method.invoke(null, view);
                    } catch (IllegalAccessException unused3) {
                    } catch (InvocationTargetException e10) {
                        throw new RuntimeException(e10.getCause());
                    }
                }
            } else {
                int i11 = C0693u.f2698h;
                C0693u c0693u = (C0693u) view.getTag(R.id.ghost_view);
                if (c0693u != null) {
                    int i12 = c0693u.f2702e - 1;
                    c0693u.f2702e = i12;
                    if (i12 <= 0) {
                        ((C0691s) c0693u.getParent()).removeView(c0693u);
                    }
                }
            }
            view.setTag(R.id.transition_transform, null);
            view.setTag(R.id.parent_matrix, null);
        }
    }

    /* JADX INFO: renamed from: D2.h$d */
    /* JADX INFO: compiled from: ChangeTransform.java */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Matrix f2651a = new Matrix();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f2652b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float[] f2653c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f2654d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f2655e;

        public d(View view, float[] fArr) {
            this.f2652b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f2653c = fArr2;
            this.f2654d = fArr2[2];
            this.f2655e = fArr2[5];
            a();
        }

        public final void a() {
            float f10 = this.f2654d;
            float[] fArr = this.f2653c;
            fArr[2] = f10;
            fArr[5] = this.f2655e;
            Matrix matrix = this.f2651a;
            matrix.setValues(fArr);
            T.f2571a.v(this.f2652b, matrix);
        }
    }

    /* JADX INFO: renamed from: D2.h$e */
    /* JADX INFO: compiled from: ChangeTransform.java */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f2656a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f2657b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f2658c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f2659d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f2660e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f2661f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f2662g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f2663h;

        public e(View view) {
            this.f2656a = view.getTranslationX();
            this.f2657b = view.getTranslationY();
            WeakHashMap<View, androidx.core.view.Z> weakHashMap = androidx.core.view.O.f16859a;
            this.f2658c = androidx.core.view.O.d.l(view);
            this.f2659d = view.getScaleX();
            this.f2660e = view.getScaleY();
            this.f2661f = view.getRotationX();
            this.f2662g = view.getRotationY();
            this.f2663h = view.getRotation();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return eVar.f2656a == this.f2656a && eVar.f2657b == this.f2657b && eVar.f2658c == this.f2658c && eVar.f2659d == this.f2659d && eVar.f2660e == this.f2660e && eVar.f2661f == this.f2661f && eVar.f2662g == this.f2662g && eVar.f2663h == this.f2663h;
        }

        public final int hashCode() {
            float f10 = this.f2656a;
            int iFloatToIntBits = (f10 != 0.0f ? Float.floatToIntBits(f10) : 0) * 31;
            float f11 = this.f2657b;
            int iFloatToIntBits2 = (iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0)) * 31;
            float f12 = this.f2658c;
            int iFloatToIntBits3 = (iFloatToIntBits2 + (f12 != 0.0f ? Float.floatToIntBits(f12) : 0)) * 31;
            float f13 = this.f2659d;
            int iFloatToIntBits4 = (iFloatToIntBits3 + (f13 != 0.0f ? Float.floatToIntBits(f13) : 0)) * 31;
            float f14 = this.f2660e;
            int iFloatToIntBits5 = (iFloatToIntBits4 + (f14 != 0.0f ? Float.floatToIntBits(f14) : 0)) * 31;
            float f15 = this.f2661f;
            int iFloatToIntBits6 = (iFloatToIntBits5 + (f15 != 0.0f ? Float.floatToIntBits(f15) : 0)) * 31;
            float f16 = this.f2662g;
            int iFloatToIntBits7 = (iFloatToIntBits6 + (f16 != 0.0f ? Float.floatToIntBits(f16) : 0)) * 31;
            float f17 = this.f2663h;
            return iFloatToIntBits7 + (f17 != 0.0f ? Float.floatToIntBits(f17) : 0);
        }
    }

    public final void O(O o10) {
        View view = o10.f2554b;
        if (view.getVisibility() == 8) {
            return;
        }
        HashMap map = o10.f2553a;
        map.put("android:changeTransform:parent", view.getParent());
        map.put("android:changeTransform:transforms", new e(view));
        Matrix matrix = view.getMatrix();
        map.put("android:changeTransform:matrix", (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
        if (this.f2647F) {
            Matrix matrix2 = new Matrix();
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            T.f2571a.x(viewGroup, matrix2);
            matrix2.preTranslate(-viewGroup.getScrollX(), -viewGroup.getScrollY());
            map.put("android:changeTransform:parentMatrix", matrix2);
            map.put("android:changeTransform:intermediateMatrix", view.getTag(R.id.transition_transform));
            map.put("android:changeTransform:intermediateParentMatrix", view.getTag(R.id.parent_matrix));
        }
    }

    @Override // D2.F
    public final void g(O o10) {
        O(o10);
    }

    @Override // D2.F
    public final void j(O o10) {
        O(o10);
        if (f2645K) {
            return;
        }
        View view = o10.f2554b;
        ((ViewGroup) view.getParent()).startViewTransition(view);
    }

    /* JADX WARN: Code duplicated, block: B:144:0x03b0 A[PHI: r2 r16 r19 r20 r23 r25
      0x03b0: PHI (r2v28 int) = (r2v29 int), (r2v31 int), (r2v49 int) binds: [B:134:0x0376, B:140:0x03a2, B:107:0x0314] A[DONT_GENERATE, DONT_INLINE]
      0x03b0: PHI (r16v5 int) = (r16v6 int), (r16v9 int), (r16v9 int) binds: [B:134:0x0376, B:140:0x03a2, B:107:0x0314] A[DONT_GENERATE, DONT_INLINE]
      0x03b0: PHI (r19v6 boolean) = (r19v7 boolean), (r19v10 boolean), (r19v18 boolean) binds: [B:134:0x0376, B:140:0x03a2, B:107:0x0314] A[DONT_GENERATE, DONT_INLINE]
      0x03b0: PHI (r20v4 java.lang.Class<android.view.ViewGroup>) = 
      (r20v5 java.lang.Class<android.view.ViewGroup>)
      (r20v7 java.lang.Class<android.view.ViewGroup>)
      (r20v15 java.lang.Class<android.view.ViewGroup>)
     binds: [B:134:0x0376, B:140:0x03a2, B:107:0x0314] A[DONT_GENERATE, DONT_INLINE]
      0x03b0: PHI (r23v3 java.util.ArrayList) = (r23v4 java.util.ArrayList), (r23v7 java.util.ArrayList), (r23v9 java.util.ArrayList) binds: [B:134:0x0376, B:140:0x03a2, B:107:0x0314] A[DONT_GENERATE, DONT_INLINE]
      0x03b0: PHI (r25v9 android.animation.Animator) = (r25v10 android.animation.Animator), (r25v13 android.animation.Animator), (r25v16 android.animation.Animator) binds: [B:134:0x0376, B:140:0x03a2, B:107:0x0314] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [D2.F] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r22v0, types: [D2.F, D2.h] */
    /* JADX WARN: Type inference failed for: r23v0, types: [android.view.View, android.view.ViewGroup, java.lang.Object] */
    @Override // D2.F
    public final Animator o(ViewGroup viewGroup, O o10, O o11) {
        boolean z10;
        Animator animator;
        View view;
        Animator animator2;
        C0693u c0693u;
        ?? r14;
        boolean z11;
        C0693u c0693u2;
        int i10;
        Animator animator3;
        Class<ViewGroup> cls;
        int i11;
        boolean z12;
        int iIntValue;
        C0691s c0691s;
        int i12;
        r rVar;
        View view2;
        View view3;
        C0692t c0692t;
        View view4;
        C0696x.a aVar;
        O oU;
        if (o10 == null || o11 == null) {
            return null;
        }
        HashMap map = o10.f2553a;
        if (!map.containsKey("android:changeTransform:parent")) {
            return null;
        }
        HashMap map2 = o11.f2553a;
        if (!map2.containsKey("android:changeTransform:parent")) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeTransform:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeTransform:parent");
        boolean z13 = this.f2647F && (!(z(viewGroup2) && z(viewGroup3)) ? viewGroup2 == viewGroup3 : !((oU = u(viewGroup2, true)) == null || viewGroup3 != oU.f2554b));
        Matrix matrix = (Matrix) map.get("android:changeTransform:intermediateMatrix");
        if (matrix != null) {
            map.put("android:changeTransform:matrix", matrix);
        }
        Matrix matrix2 = (Matrix) map.get("android:changeTransform:intermediateParentMatrix");
        if (matrix2 != null) {
            map.put("android:changeTransform:parentMatrix", matrix2);
        }
        View view5 = o11.f2554b;
        if (z13) {
            Matrix matrix3 = (Matrix) map2.get("android:changeTransform:parentMatrix");
            view5.setTag(R.id.parent_matrix, matrix3);
            Matrix matrix4 = this.f2648G;
            matrix4.reset();
            matrix3.invert(matrix4);
            Matrix matrix5 = (Matrix) map.get("android:changeTransform:matrix");
            if (matrix5 == null) {
                matrix5 = new Matrix();
                map.put("android:changeTransform:matrix", matrix5);
            }
            matrix5.postConcat((Matrix) map.get("android:changeTransform:parentMatrix"));
            matrix5.postConcat(matrix4);
        }
        Matrix matrix6 = (Matrix) map.get("android:changeTransform:matrix");
        Matrix matrix7 = (Matrix) map2.get("android:changeTransform:matrix");
        Matrix matrix8 = matrix6;
        if (matrix6 == null) {
            aVar = C0696x.f2707a;
        }
        if (matrix7 == null) {
            matrix8 = aVar;
            matrix7 = C0696x.f2707a;
        }
        matrix8 = aVar;
        Matrix matrix9 = matrix7;
        if (matrix8.equals(matrix9)) {
            view = view5;
            animator = null;
            z10 = false;
        } else {
            e eVar = (e) map2.get("android:changeTransform:transforms");
            view5.setTranslationX(0.0f);
            view5.setTranslationY(0.0f);
            WeakHashMap<View, androidx.core.view.Z> weakHashMap = androidx.core.view.O.f16859a;
            androidx.core.view.O.d.w(view5, 0.0f);
            view5.setScaleX(1.0f);
            view5.setScaleY(1.0f);
            view5.setRotationX(0.0f);
            view5.setRotationY(0.0f);
            view5.setRotation(0.0f);
            float[] fArr = new float[9];
            matrix8.getValues(fArr);
            float[] fArr2 = new float[9];
            matrix9.getValues(fArr2);
            d dVar = new d(view5, fArr);
            C0687n c0687n = new C0687n();
            c0687n.f2678a = new float[9];
            Animator animatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(dVar, PropertyValuesHolder.ofObject(f2643I, c0687n, fArr, fArr2), PropertyValuesHolder.ofObject(f2644J, (TypeConverter) null, this.f2497A.a(fArr[2], fArr[5], fArr2[2], fArr2[5])));
            View view6 = view5;
            z10 = false;
            C0682i c0682i = new C0682i(this, z13, matrix9, view6, eVar, dVar);
            animatorOfPropertyValuesHolder.addListener(c0682i);
            animatorOfPropertyValuesHolder.addPauseListener(c0682i);
            animator = animatorOfPropertyValuesHolder;
            view = view6;
        }
        View view7 = o10.f2554b;
        boolean z14 = f2645K;
        if (z13 && animator != null && this.f2646E) {
            Matrix matrix10 = new Matrix((Matrix) map2.get("android:changeTransform:parentMatrix"));
            T.f2571a.y(viewGroup, matrix10);
            Class<ViewGroup> cls2 = ViewGroup.class;
            if (Build.VERSION.SDK_INT == 28) {
                if (!C0692t.f2694f) {
                    try {
                        if (!C0692t.f2692d) {
                            try {
                                C0692t.f2691c = Class.forName("android.view.GhostView");
                            } catch (ClassNotFoundException unused) {
                            }
                            C0692t.f2692d = true;
                        }
                        Method declaredMethod = C0692t.f2691c.getDeclaredMethod("addGhost", View.class, cls2, Matrix.class);
                        C0692t.f2693e = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException unused2) {
                    }
                    C0692t.f2694f = true;
                }
                Method method = C0692t.f2693e;
                if (method != null) {
                    try {
                        try {
                            view3 = view;
                            try {
                                View view8 = (View) method.invoke(null, view3, viewGroup, matrix10);
                                C0692t c0692t2 = new C0692t();
                                c0692t2.f2697b = view8;
                                c0692t = c0692t2;
                                view4 = view3;
                            } catch (IllegalAccessException unused3) {
                                c0692t = null;
                                view4 = view3;
                            }
                        } catch (InvocationTargetException e10) {
                            throw new RuntimeException(e10.getCause());
                        }
                    } catch (IllegalAccessException unused4) {
                        view3 = view;
                    }
                } else {
                    view3 = view;
                    c0692t = null;
                    view4 = view3;
                }
                z11 = z14;
                animator2 = animator;
                view2 = view4;
                rVar = c0692t;
            } else {
                View view9 = view;
                int i13 = C0693u.f2698h;
                if (!(view9.getParent() instanceof ViewGroup)) {
                    throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
                }
                int i14 = C0691s.f2688d;
                C0691s c0691s2 = (C0691s) viewGroup.getTag(R.id.ghost_view_holder);
                C0693u c0693u3 = (C0693u) view9.getTag(R.id.ghost_view);
                if (c0693u3 == null || (c0691s = (C0691s) c0693u3.getParent()) == c0691s2) {
                    c0693u = c0693u3;
                    r14 = z10;
                } else {
                    i12 = c0693u3.f2702e;
                    c0691s.removeView(c0693u3);
                    c0693u = null;
                }
                if (c0693u == null) {
                    C0693u c0693u4 = new C0693u(view9);
                    c0693u4.f2703f = matrix10;
                    if (c0691s2 == null) {
                        r14 = i12;
                        c0691s2 = new C0691s(viewGroup.getContext());
                        c0691s2.setClipChildren(z10);
                        c0691s2.f2689b = viewGroup;
                        viewGroup.setTag(R.id.ghost_view_holder, c0691s2);
                        viewGroup.getOverlay().add(c0691s2);
                        c0691s2.f2690c = true;
                    } else {
                        if (!c0691s2.f2690c) {
                            r14 = i12;
                            throw new IllegalStateException("This GhostViewHolder is detached!");
                        }
                        r14 = i12;
                        ViewGroup viewGroup4 = c0691s2.f2689b;
                        viewGroup4.getOverlay().remove(c0691s2);
                        viewGroup4.getOverlay().add(c0691s2);
                    }
                    T.a(c0691s2, c0691s2.getLeft(), c0691s2.getTop(), viewGroup.getWidth() + c0691s2.getLeft(), viewGroup.getHeight() + c0691s2.getTop());
                    T.a(c0693u4, c0693u4.getLeft(), c0693u4.getTop(), viewGroup.getWidth() + c0693u4.getLeft(), viewGroup.getHeight() + c0693u4.getTop());
                    ArrayList arrayList = new ArrayList();
                    C0691s.a(c0693u4.f2701d, arrayList);
                    ArrayList arrayList2 = new ArrayList();
                    int childCount = c0691s2.getChildCount() - 1;
                    ?? r11 = z10;
                    while (r11 <= childCount) {
                        int i15 = ((r11 == true ? 1 : 0) + childCount) / 2;
                        C0691s.a(((C0693u) c0691s2.getChildAt(i15)).f2701d, arrayList2);
                        if (arrayList.isEmpty() || arrayList2.isEmpty()) {
                            i10 = childCount;
                        } else {
                            i10 = childCount;
                            if (arrayList.get(0) == arrayList2.get(0)) {
                                int iMin = Math.min(arrayList.size(), arrayList2.size());
                                int i16 = 1;
                                while (true) {
                                    if (i16 < iMin) {
                                        View view10 = (View) arrayList.get(i16);
                                        arrayList = arrayList;
                                        View view11 = (View) arrayList2.get(i16);
                                        if (view10 != view11) {
                                            ViewGroup viewGroup5 = (ViewGroup) view10.getParent();
                                            int childCount2 = viewGroup5.getChildCount();
                                            if (view10.getZ() != view11.getZ()) {
                                                z14 = z14;
                                                animator3 = animator;
                                                cls = cls2;
                                                i11 = 1;
                                                if (view10.getZ() > view11.getZ()) {
                                                    r11 = i15 + i11;
                                                    childCount = i10;
                                                }
                                            } else {
                                                animator3 = animator;
                                                int i17 = 0;
                                                while (true) {
                                                    if (i17 < childCount2) {
                                                        int i18 = childCount2;
                                                        z14 = z14;
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            iIntValue = viewGroup5.getChildDrawingOrder(i17);
                                                            cls = cls2;
                                                        } else {
                                                            if (!S.f2570c) {
                                                                try {
                                                                    Class cls3 = Integer.TYPE;
                                                                    Method declaredMethod2 = cls2.getDeclaredMethod("getChildDrawingOrder", cls3, cls3);
                                                                    S.f2569b = declaredMethod2;
                                                                    z12 = true;
                                                                    try {
                                                                        declaredMethod2.setAccessible(true);
                                                                    } catch (NoSuchMethodException unused5) {
                                                                    }
                                                                } catch (NoSuchMethodException unused6) {
                                                                    z12 = true;
                                                                }
                                                                S.f2570c = z12;
                                                            }
                                                            Method method2 = S.f2569b;
                                                            if (method2 != null) {
                                                                try {
                                                                    cls = cls2;
                                                                    try {
                                                                        iIntValue = ((Integer) method2.invoke(viewGroup5, Integer.valueOf(viewGroup5.getChildCount()), Integer.valueOf(i17))).intValue();
                                                                    } catch (IllegalAccessException | InvocationTargetException unused7) {
                                                                        iIntValue = i17;
                                                                    }
                                                                } catch (IllegalAccessException | InvocationTargetException unused8) {
                                                                    cls = cls2;
                                                                }
                                                            } else {
                                                                cls = cls2;
                                                                iIntValue = i17;
                                                            }
                                                        }
                                                        View childAt = viewGroup5.getChildAt(iIntValue);
                                                        if (childAt == view10) {
                                                            i11 = 1;
                                                        } else if (childAt != view11) {
                                                            i17++;
                                                            childCount2 = i18;
                                                            z14 = z14;
                                                            cls2 = cls;
                                                        }
                                                    } else {
                                                        z14 = z14;
                                                        cls = cls2;
                                                    }
                                                    i11 = 1;
                                                    r11 = i15 + i11;
                                                    childCount = i10;
                                                }
                                            }
                                            childCount = i15 - i11;
                                        } else {
                                            i16++;
                                            arrayList = arrayList;
                                            z14 = z14;
                                        }
                                    } else {
                                        arrayList = arrayList;
                                        z14 = z14;
                                        animator3 = animator;
                                        cls = cls2;
                                        i11 = 1;
                                        if (arrayList2.size() == iMin) {
                                            r11 = i15 + i11;
                                            childCount = i10;
                                        } else {
                                            childCount = i15 - i11;
                                        }
                                    }
                                }
                            }
                            arrayList2.clear();
                            arrayList = arrayList;
                            animator = animator3;
                            z14 = z14;
                            cls2 = cls;
                            r11 = r11;
                        }
                        animator3 = animator;
                        cls = cls2;
                        i11 = 1;
                        r11 = i15 + i11;
                        childCount = i10;
                        arrayList2.clear();
                        arrayList = arrayList;
                        animator = animator3;
                        z14 = z14;
                        cls2 = cls;
                        r11 = r11;
                    }
                    z11 = z14;
                    animator2 = animator;
                    if (r11 < 0 || r11 >= c0691s2.getChildCount()) {
                        c0691s2.addView(c0693u4);
                    } else {
                        c0691s2.addView(c0693u4, r11 == true ? 1 : 0);
                    }
                    c0693u4.f2702e = r14;
                    c0693u2 = c0693u4;
                } else {
                    r14 = i12;
                    z11 = z14;
                    animator2 = animator;
                    c0693u.f2703f = matrix10;
                    c0693u2 = c0693u;
                }
                c0693u2.f2702e++;
                view2 = view9;
                rVar = c0693u2;
            }
            if (rVar != null) {
                rVar.a(view7, (ViewGroup) map.get("android:changeTransform:parent"));
                ?? r10 = this;
                while (true) {
                    L l10 = r10.f2510o;
                    if (l10 == null) {
                        break;
                    }
                    r10 = l10;
                }
                c cVar = new c();
                cVar.f2649b = view2;
                cVar.f2650c = rVar;
                r10.a(cVar);
                if (z11) {
                    if (view7 != view2) {
                        T.b(view7, 0.0f);
                    }
                    T.b(view2, 1.0f);
                }
            }
        } else {
            animator2 = animator;
            if (!z14) {
                viewGroup2.endViewTransition(view7);
            }
        }
        return animator2;
    }

    @Override // D2.F
    public final String[] w() {
        return f2642H;
    }
}
