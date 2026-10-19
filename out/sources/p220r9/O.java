package p220r9;

import Q8.b;
import androidx.media3.exoplayer.C;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import java.util.Collections;
import p110i9.d;

/* JADX INFO: compiled from: SimpleItemTouchHelperCallback.java */
/* JADX INFO: loaded from: classes3.dex */
public final class O extends t.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f46427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46428b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46429c = -1;

    public O(d dVar) {
        this.f46427a = dVar;
    }

    @Override // androidx.recyclerview.widget.t.d
    public final void clearView(RecyclerView recyclerView, RecyclerView.B b10) {
        int i10;
        super.clearView(recyclerView, b10);
        int i11 = this.f46428b;
        if (i11 != -1 && (i10 = this.f46429c) != -1 && i11 != i10) {
            this.f46427a.notifyDataSetChanged();
        }
        this.f46429c = -1;
        this.f46428b = -1;
    }

    @Override // androidx.recyclerview.widget.t.d
    public final int getMovementFlags(RecyclerView recyclerView, RecyclerView.B b10) {
        return t.d.makeMovementFlags(3, 48);
    }

    @Override // androidx.recyclerview.widget.t.d
    public final boolean isItemViewSwipeEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.t.d
    public final boolean isLongPressDragEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.t.d
    public final boolean onMove(RecyclerView recyclerView, RecyclerView.B b10, RecyclerView.B b11) {
        int adapterPosition = b10.getAdapterPosition();
        int adapterPosition2 = b11.getAdapterPosition();
        if (this.f46428b == -1) {
            this.f46428b = adapterPosition;
        }
        this.f46429c = adapterPosition2;
        int adapterPosition3 = b10.getAdapterPosition();
        int adapterPosition4 = b11.getAdapterPosition();
        d dVar = this.f46427a;
        b bVar = (b) dVar.f36779a.get(adapterPosition3);
        b bVar2 = (b) dVar.f36779a.get(adapterPosition4);
        bVar.f5130e = adapterPosition4 + 1;
        bVar2.f5130e = adapterPosition3 + 1;
        if (adapterPosition3 < adapterPosition4) {
            int i10 = adapterPosition3;
            while (i10 < adapterPosition4) {
                int i11 = i10 + 1;
                Collections.swap(dVar.f36779a, i10, i11);
                i10 = i11;
            }
        } else {
            for (int i12 = adapterPosition3; i12 > adapterPosition4; i12--) {
                Collections.swap(dVar.f36779a, i12, i12 - 1);
            }
        }
        C c10 = dVar.f36783e;
        if (c10 != null) {
            c10.a(null);
        }
        dVar.notifyItemMoved(adapterPosition3, adapterPosition4);
        return true;
    }

    @Override // androidx.recyclerview.widget.t.d
    public final void onSwiped(RecyclerView.B b10, int i10) {
        int adapterPosition = b10.getAdapterPosition();
        d dVar = this.f46427a;
        dVar.c((b) dVar.f36779a.get(adapterPosition));
    }
}
