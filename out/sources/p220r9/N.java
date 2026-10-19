package p220r9;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: RecyclerViewTouchDisabler.java */
/* JADX INFO: loaded from: classes3.dex */
public final class N implements RecyclerView.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f46426a;

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        return !this.f46426a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void a(MotionEvent motionEvent) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void d(boolean z10) {
    }
}
