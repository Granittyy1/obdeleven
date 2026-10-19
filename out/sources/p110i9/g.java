package p110i9;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: GridItemDecoration.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends RecyclerView.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f36792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f36793c = false;

    public g(Context context, int i10) {
        this.f36791a = context.getResources().getDimensionPixelSize(R.dimen.list_divider_width);
        this.f36792b = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.x xVar) {
        float width = recyclerView.getWidth();
        int i10 = this.f36791a;
        int i11 = this.f36792b;
        int width2 = (recyclerView.getWidth() / i11) - ((int) ((width - (i10 * (i11 - 1))) / i11));
        int bindingAdapterPosition = ((RecyclerView.m) view.getLayoutParams()).f19701a.getBindingAdapterPosition();
        rect.top = bindingAdapterPosition < i11 ? 0 : i10;
        if (bindingAdapterPosition % i11 == 0) {
            rect.left = 0;
            rect.right = width2;
            this.f36793c = true;
        } else if ((bindingAdapterPosition + 1) % i11 == 0) {
            this.f36793c = false;
            rect.right = 0;
            rect.left = width2;
        } else if (this.f36793c) {
            this.f36793c = false;
            int i12 = i10 - width2;
            rect.left = i12;
            if ((bindingAdapterPosition + 2) % i11 == 0) {
                rect.right = i12;
            } else {
                rect.right = i10 / 2;
            }
        } else if ((bindingAdapterPosition + 2) % i11 == 0) {
            this.f36793c = false;
            rect.left = i10 / 2;
            rect.right = i10 - width2;
        } else {
            this.f36793c = false;
            int i13 = i10 / 2;
            rect.left = i13;
            rect.right = i13;
        }
        rect.bottom = 0;
    }
}
