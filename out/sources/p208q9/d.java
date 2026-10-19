package p208q9;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: HorizontalSpaceItemDecoration.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends RecyclerView.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46187a;

    public d(int i10) {
        this.f46187a = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.x xVar) {
        rect.right = this.f46187a;
    }
}
