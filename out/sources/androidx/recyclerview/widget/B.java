package androidx.recyclerview.widget;

/* JADX INFO: compiled from: NestedAdapterWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S.b f19486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O.b f19487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView.Adapter<RecyclerView.B> f19488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f19489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19490e;

    /* JADX INFO: compiled from: NestedAdapterWrapper.java */
    public class a extends RecyclerView.f {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void a() {
            B b10 = B.this;
            b10.f19490e = b10.f19488c.getItemCount();
            C1444i c1444i = (C1444i) b10.f19489d;
            c1444i.f19852a.notifyDataSetChanged();
            c1444i.a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void b(int i10, int i11) {
            B b10 = B.this;
            C1444i c1444i = (C1444i) b10.f19489d;
            c1444i.f19852a.notifyItemRangeChanged(i10 + c1444i.b(b10), i11, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void c(int i10, int i11, Object obj) {
            B b10 = B.this;
            C1444i c1444i = (C1444i) b10.f19489d;
            c1444i.f19852a.notifyItemRangeChanged(i10 + c1444i.b(b10), i11, obj);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void d(int i10, int i11) {
            B b10 = B.this;
            b10.f19490e += i11;
            C1444i c1444i = (C1444i) b10.f19489d;
            c1444i.f19852a.notifyItemRangeInserted(i10 + c1444i.b(b10), i11);
            if (b10.f19490e <= 0 || b10.f19488c.getStateRestorationPolicy() != RecyclerView.Adapter.StateRestorationPolicy.f19666c) {
                return;
            }
            ((C1444i) b10.f19489d).a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void e(int i10, int i11) {
            B b10 = B.this;
            C1444i c1444i = (C1444i) b10.f19489d;
            int iB = c1444i.b(b10);
            c1444i.f19852a.notifyItemMoved(i10 + iB, i11 + iB);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void f(int i10, int i11) {
            B b10 = B.this;
            b10.f19490e -= i11;
            C1444i c1444i = (C1444i) b10.f19489d;
            c1444i.f19852a.notifyItemRangeRemoved(i10 + c1444i.b(b10), i11);
            if (b10.f19490e >= 1 || b10.f19488c.getStateRestorationPolicy() != RecyclerView.Adapter.StateRestorationPolicy.f19666c) {
                return;
            }
            ((C1444i) b10.f19489d).a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void g() {
            ((C1444i) B.this.f19489d).a();
        }
    }

    /* JADX INFO: compiled from: NestedAdapterWrapper.java */
    public interface b {
    }

    public B(RecyclerView.Adapter<RecyclerView.B> adapter, b bVar, S s10, O.b bVar2) {
        a aVar = new a();
        this.f19488c = adapter;
        this.f19489d = bVar;
        this.f19486a = s10.b(this);
        this.f19487b = bVar2;
        this.f19490e = adapter.getItemCount();
        adapter.registerAdapterDataObserver(aVar);
    }
}
