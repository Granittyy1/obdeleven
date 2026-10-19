package p220r9;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: r9.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: BindingUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2782n {
    public static void a(RecyclerView recyclerView, RecyclerView.Adapter adapter) {
        if (adapter == null) {
            recyclerView.setAdapter(null);
            return;
        }
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        recyclerView.setAdapter(adapter);
    }
}
