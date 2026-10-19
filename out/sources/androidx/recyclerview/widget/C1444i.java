package androidx.recyclerview.widget;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ConcatAdapterController.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1444i implements B.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1443h f19852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S f19853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f19854c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IdentityHashMap<RecyclerView.B, B> f19855d = new IdentityHashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f19856e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f19857f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final O f19858g;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.i$a */
    /* JADX INFO: compiled from: ConcatAdapterController.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public B f19859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19860b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f19861c;
    }

    public C1444i(C1443h c1443h) {
        this.f19852a = c1443h;
        S.a aVar = new S.a();
        aVar.f19749a = new SparseArray<>();
        aVar.f19750b = 0;
        this.f19853b = aVar;
        this.f19858g = new O.a();
    }

    public final void a() {
        RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy;
        Iterator it = this.f19856e.iterator();
        while (true) {
            if (!it.hasNext()) {
                stateRestorationPolicy = RecyclerView.Adapter.StateRestorationPolicy.f19665b;
                break;
            }
            B b10 = (B) it.next();
            RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy2 = b10.f19488c.getStateRestorationPolicy();
            stateRestorationPolicy = RecyclerView.Adapter.StateRestorationPolicy.f19667d;
            if (stateRestorationPolicy2 == stateRestorationPolicy || (stateRestorationPolicy2 == RecyclerView.Adapter.StateRestorationPolicy.f19666c && b10.f19490e == 0)) {
                break;
            }
        }
        C1443h c1443h = this.f19852a;
        if (stateRestorationPolicy != c1443h.getStateRestorationPolicy()) {
            c1443h.a(stateRestorationPolicy);
        }
    }

    public final int b(B b10) {
        B b11;
        Iterator it = this.f19856e.iterator();
        int i10 = 0;
        while (it.hasNext() && (b11 = (B) it.next()) != b10) {
            i10 += b11.f19490e;
        }
        return i10;
    }

    public final a c(int i10) {
        a aVar = this.f19857f;
        if (aVar.f19861c) {
            aVar = new a();
        } else {
            aVar.f19861c = true;
        }
        int i11 = i10;
        for (B b10 : this.f19856e) {
            int i12 = b10.f19490e;
            if (i12 > i11) {
                aVar.f19859a = b10;
                aVar.f19860b = i11;
                break;
            }
            i11 -= i12;
        }
        if (aVar.f19859a != null) {
            return aVar;
        }
        throw new IllegalArgumentException(J4.i.b(i10, "Cannot find wrapper for "));
    }

    public final B d(RecyclerView.B b10) {
        B b11 = this.f19855d.get(b10);
        if (b11 != null) {
            return b11;
        }
        throw new IllegalStateException("Cannot find wrapper for " + b10 + ", seems like it is not bound by this adapter: " + this);
    }
}
