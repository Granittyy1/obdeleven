package M0;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1382z;
import androidx.lifecycle.C;
import androidx.lifecycle.D;
import androidx.lifecycle.E;
import androidx.lifecycle.InterfaceC1375s;
import androidx.lifecycle.InterfaceC1376t;
import androidx.lifecycle.Lifecycle;
import com.voltasit.obdeleven.R;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: ViewDataBinding.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class h extends M0.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final boolean f4481n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f4482o = new a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final ReferenceQueue<h> f4483p = new ReferenceQueue<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f4484q = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f4485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j[] f4487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f4488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Choreographer f4490f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f4491g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Handler f4492h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final M0.d f4493i;
    public h j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InterfaceC1376t f4494k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f f4495l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f4496m;

    /* JADX INFO: compiled from: ViewDataBinding.java */
    public class a {
    }

    /* JADX INFO: compiled from: ViewDataBinding.java */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this) {
                h.this.f4486b = false;
            }
            while (true) {
                Reference<? extends h> referencePoll = h.f4483p.poll();
                if (referencePoll == null) {
                    break;
                } else if (referencePoll instanceof j) {
                    ((j) referencePoll).a();
                }
            }
            if (h.this.f4488d.isAttachedToWindow()) {
                h.this.f();
                return;
            }
            View view = h.this.f4488d;
            b bVar = h.f4484q;
            view.removeOnAttachStateChangeListener(bVar);
            h.this.f4488d.addOnAttachStateChangeListener(bVar);
        }
    }

    /* JADX INFO: compiled from: ViewDataBinding.java */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String[][] f4498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[][] f4499b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[][] f4500c;

        public d(int i10) {
            this.f4498a = new String[i10][];
            this.f4499b = new int[i10][];
            this.f4500c = new int[i10][];
        }

        public final void a(int i10, String[] strArr, int[] iArr, int[] iArr2) {
            this.f4498a[i10] = strArr;
            this.f4499b[i10] = iArr;
            this.f4500c[i10] = iArr2;
        }
    }

    /* JADX INFO: compiled from: ViewDataBinding.java */
    public static class e implements D, g<AbstractC1382z<?>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j<AbstractC1382z<?>> f4501b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public WeakReference<InterfaceC1376t> f4502c = null;

        public e(h hVar, int i10, ReferenceQueue<h> referenceQueue) {
            this.f4501b = new j<>(hVar, i10, this, referenceQueue);
        }

        @Override // M0.g
        public final void a(AbstractC1382z abstractC1382z) {
            abstractC1382z.i(this);
        }

        @Override // M0.g
        public final void b(InterfaceC1376t interfaceC1376t) {
            WeakReference<InterfaceC1376t> weakReference = this.f4502c;
            InterfaceC1376t interfaceC1376t2 = weakReference == null ? null : weakReference.get();
            AbstractC1382z abstractC1382z = this.f4501b.f4507c;
            if (abstractC1382z != null) {
                if (interfaceC1376t2 != null) {
                    abstractC1382z.i(this);
                }
                if (interfaceC1376t != null) {
                    abstractC1382z.e(interfaceC1376t, this);
                }
            }
            if (interfaceC1376t != null) {
                this.f4502c = new WeakReference<>(interfaceC1376t);
            }
        }

        @Override // M0.g
        public final void c(AbstractC1382z abstractC1382z) {
            WeakReference<InterfaceC1376t> weakReference = this.f4502c;
            InterfaceC1376t interfaceC1376t = weakReference == null ? null : weakReference.get();
            if (interfaceC1376t != null) {
                abstractC1382z.e(interfaceC1376t, this);
            }
        }

        @Override // androidx.lifecycle.D
        public final void d(Object obj) {
            j<AbstractC1382z<?>> jVar = this.f4501b;
            h hVar = (h) jVar.get();
            if (hVar == null) {
                jVar.a();
            }
            if (hVar != null) {
                AbstractC1382z abstractC1382z = jVar.f4507c;
                if (hVar.f4496m || !hVar.l(jVar.f4506b, 0, abstractC1382z)) {
                    return;
                }
                hVar.n();
            }
        }
    }

    /* JADX INFO: compiled from: ViewDataBinding.java */
    public static class f implements InterfaceC1375s {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WeakReference<h> f4503b;

        public f(h hVar) {
            this.f4503b = new WeakReference<>(hVar);
        }

        @E(Lifecycle.Event.ON_START)
        public void onStart() {
            h hVar = this.f4503b.get();
            if (hVar != null) {
                hVar.f();
            }
        }
    }

    public h(View view, int i10, Object obj) {
        M0.d dVar;
        if (obj == null) {
            dVar = null;
        } else {
            if (!(obj instanceof M0.d)) {
                throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
            }
            dVar = (M0.d) obj;
        }
        this.f4485a = new c();
        this.f4486b = false;
        this.f4493i = dVar;
        this.f4487c = new j[i10];
        this.f4488d = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        }
        if (f4481n) {
            this.f4490f = Choreographer.getInstance();
            this.f4491g = new i(this);
        } else {
            this.f4491g = null;
            this.f4492h = new Handler(Looper.myLooper());
        }
    }

    public static <T extends h> T h(LayoutInflater layoutInflater, int i10, ViewGroup viewGroup, boolean z10, Object obj) {
        M0.d dVar;
        if (obj == null) {
            dVar = null;
        } else {
            if (!(obj instanceof M0.d)) {
                throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
            }
            dVar = (M0.d) obj;
        }
        return (T) M0.e.a(layoutInflater, i10, viewGroup, z10, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01d6  */
    public static void j(M0.d dVar, View view, Object[] objArr, d dVar2, SparseIntArray sparseIntArray, boolean z10) {
        int i10;
        boolean z11;
        int i11;
        int i12;
        boolean z12;
        String str;
        int id;
        int i13;
        int iCharAt;
        int i14;
        int length;
        d dVar3 = dVar2;
        if ((view != null ? (h) view.getTag(R.id.dataBinding) : null) != null) {
            return;
        }
        Object tag = view.getTag();
        String str2 = tag instanceof String ? (String) tag : null;
        int i15 = 1;
        if (z10 && str2 != null && str2.startsWith("layout")) {
            int iLastIndexOf = str2.lastIndexOf(95);
            if (iLastIndexOf <= 0 || (length = str2.length()) == (i14 = iLastIndexOf + 1)) {
                iCharAt = -1;
                z11 = false;
                break;
            }
            int i16 = i14;
            while (true) {
                if (i16 >= length) {
                    int length2 = str2.length();
                    iCharAt = 0;
                    while (i14 < length2) {
                        iCharAt = (iCharAt * 10) + (str2.charAt(i14) - '0');
                        i14++;
                    }
                    if (objArr[iCharAt] == null) {
                        objArr[iCharAt] = view;
                    }
                    if (dVar3 == null) {
                        iCharAt = -1;
                    }
                    z11 = true;
                    break;
                }
                if (!Character.isDigit(str2.charAt(i16))) {
                    iCharAt = -1;
                    z11 = false;
                    break;
                }
                i16++;
            }
            i10 = iCharAt;
        } else if (str2 == null || !str2.startsWith("binding_")) {
            i10 = -1;
            z11 = false;
        } else {
            int length3 = str2.length();
            int iCharAt2 = 0;
            for (int i17 = 8; i17 < length3; i17++) {
                iCharAt2 = (iCharAt2 * 10) + (str2.charAt(i17) - '0');
            }
            if (objArr[iCharAt2] == null) {
                objArr[iCharAt2] = view;
            }
            if (dVar3 == null) {
                iCharAt2 = -1;
            }
            i10 = iCharAt2;
            z11 = true;
        }
        if (!z11 && (id = view.getId()) > 0 && sparseIntArray != null && (i13 = sparseIntArray.get(id, -1)) >= 0 && objArr[i13] == null) {
            objArr[i13] = view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            int i18 = 0;
            int i19 = 0;
            while (i18 < childCount) {
                View childAt = viewGroup.getChildAt(i18);
                if (i10 < 0 || !(childAt.getTag() instanceof String)) {
                    i11 = i18;
                    i12 = i19;
                    z12 = false;
                } else {
                    String str3 = (String) childAt.getTag();
                    if (str3.endsWith("_0") && str3.startsWith("layout") && str3.indexOf(47) > 0) {
                        CharSequence charSequenceSubSequence = str3.subSequence(str3.indexOf(47) + i15, str3.length() - 2);
                        String[] strArr = dVar3.f4498a[i10];
                        int length4 = strArr.length;
                        int i20 = i19;
                        while (true) {
                            if (i20 >= length4) {
                                i20 = -1;
                                break;
                            } else if (TextUtils.equals(charSequenceSubSequence, strArr[i20])) {
                                break;
                            } else {
                                i20++;
                            }
                        }
                        if (i20 >= 0) {
                            int i21 = i20 + 1;
                            int i22 = dVar3.f4499b[i10][i20];
                            int i23 = dVar3.f4500c[i10][i20];
                            String str4 = (String) viewGroup.getChildAt(i18).getTag();
                            String strSubstring = str4.substring(0, str4.length() - i15);
                            int length5 = strSubstring.length();
                            int childCount2 = viewGroup.getChildCount();
                            int i24 = i18 + 1;
                            int i25 = i18;
                            while (i24 < childCount2) {
                                View childAt2 = viewGroup.getChildAt(i24);
                                String str5 = childAt2.getTag() instanceof String ? (String) childAt2.getTag() : null;
                                if (str5 != null && str5.startsWith(strSubstring)) {
                                    str = strSubstring;
                                    if (str5.length() == str4.length() && str5.charAt(str5.length() - 1) == '0') {
                                        break;
                                    }
                                    int length6 = str5.length();
                                    if (length6 != length5) {
                                        int i26 = length5;
                                        while (true) {
                                            if (i26 >= length6) {
                                                i25 = i24;
                                                break;
                                            } else if (!Character.isDigit(str5.charAt(i26))) {
                                                break;
                                            } else {
                                                i26++;
                                            }
                                        }
                                    }
                                } else {
                                    str = strSubstring;
                                }
                                i24++;
                                strSubstring = str;
                            }
                            if (i25 == i18) {
                                objArr[i22] = M0.e.f4480a.b(dVar, childAt, i23);
                            } else {
                                int i27 = i25 - i18;
                                int i28 = i27 + 1;
                                View[] viewArr = new View[i28];
                                for (int i29 = 0; i29 < i28; i29++) {
                                    viewArr[i29] = viewGroup.getChildAt(i18 + i29);
                                }
                                objArr[i22] = M0.e.f4480a.c(dVar, viewArr, i23);
                                i18 += i27;
                            }
                            i12 = i21;
                            i11 = i18;
                            z12 = true;
                        } else {
                            i11 = i18;
                            i12 = i19;
                            z12 = false;
                        }
                    } else {
                        i11 = i18;
                        i12 = i19;
                        z12 = false;
                    }
                }
                if (!z12) {
                    j(dVar, childAt, objArr, dVar2, sparseIntArray, false);
                }
                int i30 = i11 + 1;
                dVar3 = dVar2;
                i15 = 1;
                i18 = i30;
                i19 = i12;
                childCount = childCount;
                viewGroup = viewGroup;
            }
        }
    }

    public static Object[] k(M0.d dVar, View view, int i10, d dVar2, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i10];
        j(dVar, view, objArr, dVar2, sparseIntArray, true);
        return objArr;
    }

    public static int o(Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static boolean p(Boolean bool) {
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public abstract void d();

    public final void e() {
        if (this.f4489e) {
            n();
        } else if (g()) {
            this.f4489e = true;
            d();
            this.f4489e = false;
        }
    }

    public final void f() {
        h hVar = this.j;
        if (hVar == null) {
            e();
        } else {
            hVar.f();
        }
    }

    public abstract boolean g();

    public abstract void i();

    public abstract boolean l(int i10, int i11, Object obj);

    public final void m(int i10, AbstractC1382z abstractC1382z, a aVar) {
        if (abstractC1382z == null) {
            return;
        }
        j<AbstractC1382z<?>>[] jVarArr = this.f4487c;
        j<AbstractC1382z<?>> jVar = jVarArr[i10];
        if (jVar == null) {
            ReferenceQueue<h> referenceQueue = f4483p;
            aVar.getClass();
            jVar = new e(this, i10, referenceQueue).f4501b;
            jVarArr[i10] = jVar;
            InterfaceC1376t interfaceC1376t = this.f4494k;
            if (interfaceC1376t != null) {
                jVar.f4505a.b(interfaceC1376t);
            }
        }
        jVar.a();
        jVar.f4507c = abstractC1382z;
        jVar.f4505a.c(abstractC1382z);
    }

    public final void n() {
        h hVar = this.j;
        if (hVar != null) {
            hVar.n();
            return;
        }
        InterfaceC1376t interfaceC1376t = this.f4494k;
        if (interfaceC1376t == null || interfaceC1376t.getLifecycle().b().compareTo(Lifecycle.State.f17752e) >= 0) {
            synchronized (this) {
                try {
                    if (this.f4486b) {
                        return;
                    }
                    this.f4486b = true;
                    if (f4481n) {
                        this.f4490f.postFrameCallback(this.f4491g);
                    } else {
                        this.f4492h.post(this.f4485a);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void q(InterfaceC1376t interfaceC1376t) {
        boolean z10 = interfaceC1376t instanceof Fragment;
        InterfaceC1376t interfaceC1376t2 = this.f4494k;
        if (interfaceC1376t2 == interfaceC1376t) {
            return;
        }
        if (interfaceC1376t2 != null) {
            interfaceC1376t2.getLifecycle().c(this.f4495l);
        }
        this.f4494k = interfaceC1376t;
        if (interfaceC1376t != null) {
            if (this.f4495l == null) {
                this.f4495l = new f(this);
            }
            interfaceC1376t.getLifecycle().a(this.f4495l);
        }
        for (j jVar : this.f4487c) {
            if (jVar != null) {
                jVar.f4505a.b(interfaceC1376t);
            }
        }
    }

    public final void r(View view) {
        view.setTag(R.id.dataBinding, this);
    }

    public final void s(int i10, C c10) {
        this.f4496m = true;
        try {
            a aVar = f4482o;
            if (c10 == null) {
                j jVar = this.f4487c[i10];
                if (jVar != null) {
                    jVar.a();
                }
            } else {
                j jVar2 = this.f4487c[i10];
                if (jVar2 == null) {
                    m(i10, c10, aVar);
                } else if (jVar2.f4507c != c10) {
                    if (jVar2 != null) {
                        jVar2.a();
                    }
                    m(i10, c10, aVar);
                }
            }
        } finally {
            this.f4496m = false;
        }
    }

    /* JADX INFO: compiled from: ViewDataBinding.java */
    public class b implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            (view != null ? (h) view.getTag(R.id.dataBinding) : null).f4485a.run();
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}
