package p220r9;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: compiled from: FloatingActionButtonScrollListener.java */
/* JADX INFO: loaded from: classes3.dex */
public final class t extends RecyclerView.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FloatingActionButton f46486a;

    public t(FloatingActionButton floatingActionButton) {
        this.f46486a = floatingActionButton;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void b(int i10, int i11, RecyclerView recyclerView) {
        FloatingActionButton floatingActionButton = this.f46486a;
        if (i11 > 0 && floatingActionButton.isShown()) {
            floatingActionButton.h();
        } else {
            if (i11 >= 0 || floatingActionButton.isShown()) {
                return;
            }
            floatingActionButton.n();
        }
    }
}
