package com.braze.ui.contentcards.recycler;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: SimpleItemTouchHelperCallback.kt */
/* JADX INFO: loaded from: classes.dex */
public class SimpleItemTouchHelperCallback extends t.d {
    private final ItemTouchHelperAdapter adapter;

    public SimpleItemTouchHelperCallback(ItemTouchHelperAdapter adapter) {
        i.e(adapter, "adapter");
        this.adapter = adapter;
    }

    @Override // androidx.recyclerview.widget.t.d
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.B viewHolder) {
        i.e(recyclerView, "recyclerView");
        i.e(viewHolder, "viewHolder");
        return t.d.makeMovementFlags(0, this.adapter.isItemDismissable(viewHolder.getBindingAdapterPosition()) ? 16 : 0);
    }

    @Override // androidx.recyclerview.widget.t.d
    public boolean isItemViewSwipeEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.t.d
    public boolean isLongPressDragEnabled() {
        return false;
    }

    @Override // androidx.recyclerview.widget.t.d
    public boolean onMove(RecyclerView recyclerView, RecyclerView.B viewHolder, RecyclerView.B target) {
        i.e(recyclerView, "recyclerView");
        i.e(viewHolder, "viewHolder");
        i.e(target, "target");
        return false;
    }

    @Override // androidx.recyclerview.widget.t.d
    public void onSwiped(RecyclerView.B viewHolder, int i10) {
        i.e(viewHolder, "viewHolder");
        this.adapter.onItemDismiss(viewHolder.getBindingAdapterPosition());
    }
}
