package androidx.compose.runtime.internal;

import android.os.Trace;
import androidx.collection.A;
import androidx.collection.L;
import androidx.collection.MutableSetWrapper;
import androidx.compose.runtime.InterfaceC1082e;
import androidx.compose.runtime.t0;
import androidx.compose.runtime.u0;
import java.util.ArrayList;
import kotlin.collections.l;
import p293xa.r;

/* JADX INFO: compiled from: RememberEventDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableSetWrapper f13055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.compose.runtime.collection.c<u0> f13056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.compose.runtime.collection.c<u0> f13057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.compose.runtime.collection.c<Object> f13058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.compose.runtime.collection.c<Ia.a<r>> f13059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public L<InterfaceC1082e> f13060f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f13061g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final A f13062h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final A f13063i;
    public ArrayList j;

    public e(MutableSetWrapper mutableSetWrapper) {
        this.f13055a = mutableSetWrapper;
        androidx.compose.runtime.collection.c<u0> cVar = new androidx.compose.runtime.collection.c<>(new u0[16]);
        this.f13056b = cVar;
        this.f13057c = cVar;
        this.f13058d = new androidx.compose.runtime.collection.c<>(new Object[16]);
        this.f13059e = new androidx.compose.runtime.collection.c<>(new Ia.a[16]);
        this.f13061g = new ArrayList();
        this.f13062h = new A();
        this.f13063i = new A();
    }

    public final void a() {
        MutableSetWrapper mutableSetWrapper = this.f13055a;
        if (mutableSetWrapper.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            mutableSetWrapper.getClass();
            MutableSetWrapper.AnonymousClass1 anonymousClass1 = new MutableSetWrapper.AnonymousClass1(mutableSetWrapper);
            kotlin.sequences.h hVar = anonymousClass1.f9100c;
            while (hVar.hasNext()) {
                t0 t0Var = (t0) hVar.next();
                anonymousClass1.remove();
                t0Var.b();
            }
            r rVar = r.f47939a;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void b() {
        c(Integer.MIN_VALUE);
        androidx.compose.runtime.collection.c<Object> cVar = this.f13058d;
        int i10 = cVar.f12945d;
        MutableSetWrapper mutableSetWrapper = this.f13055a;
        if (i10 != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                L<InterfaceC1082e> l10 = this.f13060f;
                for (int i11 = cVar.f12945d - 1; -1 < i11; i11--) {
                    Object obj = cVar.f12943b[i11];
                    if (obj instanceof u0) {
                        t0 t0Var = ((u0) obj).f13247a;
                        mutableSetWrapper.remove(t0Var);
                        t0Var.c();
                    }
                    if (obj instanceof InterfaceC1082e) {
                        if (l10 == null || !l10.a((InterfaceC1082e) obj)) {
                            ((InterfaceC1082e) obj).h();
                        } else {
                            ((InterfaceC1082e) obj).a();
                        }
                    }
                }
                r rVar = r.f47939a;
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        androidx.compose.runtime.collection.c<u0> cVar2 = this.f13056b;
        if (cVar2.f12945d != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                u0[] u0VarArr = cVar2.f12943b;
                int i12 = cVar2.f12945d;
                for (int i13 = 0; i13 < i12; i13++) {
                    t0 t0Var2 = u0VarArr[i13].f13247a;
                    mutableSetWrapper.remove(t0Var2);
                    t0Var2.d();
                }
                r rVar2 = r.f47939a;
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void c(int i10) {
        ArrayList arrayList = this.f13061g;
        if (arrayList.isEmpty()) {
            return;
        }
        int i11 = 0;
        ArrayList arrayListT = null;
        int i12 = 0;
        A a10 = null;
        A a11 = null;
        while (true) {
            A a12 = this.f13063i;
            if (i12 >= a12.f9184b) {
                break;
            }
            if (i10 <= a12.a(i12)) {
                Object objRemove = arrayList.remove(i12);
                int iE = a12.e(i12);
                int iE2 = this.f13062h.e(i12);
                if (arrayListT == null) {
                    arrayListT = l.t(objRemove);
                    a11 = new A();
                    a11.c(iE);
                    a10 = new A();
                    a10.c(iE2);
                } else {
                    kotlin.jvm.internal.i.c(a10, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    kotlin.jvm.internal.i.c(a11, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    arrayListT.add(objRemove);
                    a11.c(iE);
                    a10.c(iE2);
                }
            } else {
                i12++;
            }
        }
        if (arrayListT != null) {
            kotlin.jvm.internal.i.c(a10, "null cannot be cast to non-null type androidx.collection.MutableIntList");
            kotlin.jvm.internal.i.c(a11, "null cannot be cast to non-null type androidx.collection.MutableIntList");
            int size = arrayListT.size() - 1;
            while (i11 < size) {
                int i13 = i11 + 1;
                int size2 = arrayListT.size();
                for (int i14 = i13; i14 < size2; i14++) {
                    int iA = a11.a(i11);
                    int iA2 = a11.a(i14);
                    if (iA < iA2 || (iA2 == iA && a10.a(i11) < a10.a(i14))) {
                        Object obj = arrayListT.get(i11);
                        arrayListT.set(i11, arrayListT.get(i14));
                        arrayListT.set(i14, obj);
                        int iA3 = a10.a(i11);
                        a10.f(i11, a10.a(i14));
                        a10.f(i14, iA3);
                        int iA4 = a11.a(i11);
                        a11.f(i11, a11.a(i14));
                        a11.f(i14, iA4);
                    }
                }
                i11 = i13;
            }
            androidx.compose.runtime.collection.c<Object> cVar = this.f13058d;
            cVar.e(cVar.f12945d, arrayListT);
        }
    }

    public final void d(Object obj, int i10, int i11, int i12) {
        c(i10);
        if (i12 < 0 || i12 >= i10) {
            this.f13058d.b(obj);
            return;
        }
        this.f13061g.add(obj);
        this.f13062h.c(i11);
        this.f13063i.c(i12);
    }

    public final void e(u0 u0Var) {
        this.f13057c.b(u0Var);
    }
}
