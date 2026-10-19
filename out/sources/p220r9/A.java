package p220r9;

import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.voltasit.obdeleven.R;
import p110i9.g;
import p208q9.a;

/* JADX INFO: compiled from: ListUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class A {
    public static void a(RecyclerView recyclerView, boolean z10) {
        RecyclerView.l linearLayoutManager;
        if (z10) {
            recyclerView.getContext();
            linearLayoutManager = new GridLayoutManager(2);
        } else {
            recyclerView.getContext();
            linearLayoutManager = new LinearLayoutManager(1);
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.i(new g(recyclerView.getContext(), z10 ? 2 : 1));
    }

    public static void b(RecyclerView recyclerView) {
        int dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(R.dimen.content_padding);
        Drawable drawable = recyclerView.getResources().getDrawable(R.drawable.divider_content);
        recyclerView.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        a aVar = new a(recyclerView.getContext(), linearLayoutManager.f19521p);
        aVar.f46180a = drawable;
        aVar.f46181b = dimensionPixelSize;
        aVar.f46182c = dimensionPixelSize;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.i(aVar);
    }
}
