package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView.B;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: ListAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class A<T, VH extends RecyclerView.B> extends RecyclerView.Adapter<VH> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1440e<T> f19484a;

    /* JADX INFO: compiled from: ListAdapter.java */
    public class a implements C1440e.a<T> {
        public a() {
        }

        @Override // androidx.recyclerview.widget.C1440e.a
        public final void a() {
            A.this.getClass();
        }
    }

    public A(C1451p.e<T> eVar) {
        a aVar = new a();
        C1437b c1437b = new C1437b(this);
        synchronized (C1438c.a.f19820a) {
            try {
                if (C1438c.a.f19821b == null) {
                    C1438c.a.f19821b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C1440e<T> c1440e = new C1440e<>(c1437b, new C1438c(C1438c.a.f19821b, eVar));
        this.f19484a = c1440e;
        c1440e.f19834d.add(aVar);
    }

    public final T a(int i10) {
        return this.f19484a.f19836f.get(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f19484a.f19836f.size();
    }
}
