package p220r9;

import androidx.recyclerview.widget.RecyclerView;
import bo.app.F0;
import p109i8.i;
import p182o9.b;
import p182o9.c;

/* JADX INFO: compiled from: OnRecyclerViewScrollListener.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class I extends RecyclerView.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f46420a;

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            c cVar = ((b) this).f45241b;
            cVar.f45245z = false;
            ((i) cVar.f31997n).m(new F0(3, cVar));
            this.f46420a = false;
            return;
        }
        if (i10 == 1 && !this.f46420a) {
            ((b) this).f45241b.f45245z = true;
            this.f46420a = true;
        }
    }
}
