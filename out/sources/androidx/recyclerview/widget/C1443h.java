package androidx.recyclerview.widget;

import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: androidx.recyclerview.widget.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ConcatAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1443h extends RecyclerView.Adapter<RecyclerView.B> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1444i f19851a;

    @SafeVarargs
    public C1443h(RecyclerView.Adapter<? extends RecyclerView.B>... adapterArr) {
        List listAsList = Arrays.asList(adapterArr);
        this.f19851a = new C1444i(this);
        Iterator it = listAsList.iterator();
        while (true) {
            int i10 = 0;
            if (!it.hasNext()) {
                this.f19851a.getClass();
                super.setHasStableIds(false);
                return;
            }
            RecyclerView.Adapter<RecyclerView.B> adapter = (RecyclerView.Adapter) it.next();
            C1444i c1444i = this.f19851a;
            ArrayList arrayList = c1444i.f19856e;
            int size = arrayList.size();
            if (size < 0 || size > arrayList.size()) {
                throw new IndexOutOfBoundsException("Index must be between 0 and " + arrayList.size() + ". Given:" + size);
            }
            adapter.hasStableIds();
            int size2 = arrayList.size();
            while (true) {
                if (i10 >= size2) {
                    i10 = -1;
                    break;
                } else if (((B) arrayList.get(i10)).f19488c == adapter) {
                    break;
                } else {
                    i10++;
                }
            }
            if ((i10 == -1 ? null : (B) arrayList.get(i10)) == null) {
                B b10 = new B(adapter, c1444i, c1444i.f19853b, c1444i.f19858g.a());
                arrayList.add(size, b10);
                Iterator it2 = c1444i.f19854c.iterator();
                while (it2.hasNext()) {
                    RecyclerView recyclerView = (RecyclerView) ((WeakReference) it2.next()).get();
                    if (recyclerView != null) {
                        adapter.onAttachedToRecyclerView(recyclerView);
                    }
                }
                if (b10.f19490e > 0) {
                    c1444i.f19852a.notifyItemRangeInserted(c1444i.b(b10), b10.f19490e);
                }
                c1444i.a();
            }
        }
    }

    public final void a(RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy) {
        super.setStateRestorationPolicy(stateRestorationPolicy);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int findRelativeAdapterPositionIn(RecyclerView.Adapter<? extends RecyclerView.B> adapter, RecyclerView.B b10, int i10) {
        C1444i c1444i = this.f19851a;
        B b11 = c1444i.f19855d.get(b10);
        if (b11 == null) {
            return -1;
        }
        int iB = i10 - c1444i.b(b11);
        RecyclerView.Adapter<RecyclerView.B> adapter2 = b11.f19488c;
        int itemCount = adapter2.getItemCount();
        if (iB >= 0 && iB < itemCount) {
            return adapter2.findRelativeAdapterPositionIn(adapter, b10, iB);
        }
        StringBuilder sbA = B6.a.a("Detected inconsistent adapter updates. The local position of the view holder maps to ", " which is out of bounds for the adapter with size ", ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:", iB, itemCount);
        sbA.append(b10);
        sbA.append("adapter:");
        sbA.append(adapter);
        throw new IllegalStateException(sbA.toString());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        Iterator it = this.f19851a.f19856e.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((B) it.next()).f19490e;
        }
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i10) {
        C1444i c1444i = this.f19851a;
        C1444i.a aVarC = c1444i.c(i10);
        B b10 = aVarC.f19859a;
        long jA = b10.f19487b.a(b10.f19488c.getItemId(aVarC.f19860b));
        aVarC.f19861c = false;
        aVarC.f19859a = null;
        aVarC.f19860b = -1;
        c1444i.f19857f = aVarC;
        return jA;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i10) {
        C1444i c1444i = this.f19851a;
        C1444i.a aVarC = c1444i.c(i10);
        B b10 = aVarC.f19859a;
        int iB = b10.f19486a.b(b10.f19488c.getItemViewType(aVarC.f19860b));
        aVarC.f19861c = false;
        aVarC.f19859a = null;
        aVarC.f19860b = -1;
        c1444i.f19857f = aVarC;
        return iB;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C1444i c1444i = this.f19851a;
        ArrayList arrayList = c1444i.f19854c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == recyclerView) {
                return;
            }
        }
        arrayList.add(new WeakReference(recyclerView));
        Iterator it2 = c1444i.f19856e.iterator();
        while (it2.hasNext()) {
            ((B) it2.next()).f19488c.onAttachedToRecyclerView(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.B b10, int i10) {
        C1444i c1444i = this.f19851a;
        C1444i.a aVarC = c1444i.c(i10);
        c1444i.f19855d.put(b10, aVarC.f19859a);
        B b11 = aVarC.f19859a;
        b11.f19488c.bindViewHolder(b10, aVarC.f19860b);
        aVarC.f19861c = false;
        aVarC.f19859a = null;
        aVarC.f19860b = -1;
        c1444i.f19857f = aVarC;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.B onCreateViewHolder(ViewGroup viewGroup, int i10) {
        B bA = this.f19851a.f19853b.a(i10);
        return bA.f19488c.onCreateViewHolder(viewGroup, bA.f19486a.a(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C1444i c1444i = this.f19851a;
        ArrayList arrayList = c1444i.f19854c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            WeakReference weakReference = (WeakReference) arrayList.get(size);
            if (weakReference.get() != null) {
                if (weakReference.get() == recyclerView) {
                    arrayList.remove(size);
                    break;
                }
            } else {
                arrayList.remove(size);
            }
        }
        Iterator it = c1444i.f19856e.iterator();
        while (it.hasNext()) {
            ((B) it.next()).f19488c.onDetachedFromRecyclerView(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(RecyclerView.B b10) {
        C1444i c1444i = this.f19851a;
        IdentityHashMap<RecyclerView.B, B> identityHashMap = c1444i.f19855d;
        B b11 = identityHashMap.get(b10);
        if (b11 != null) {
            boolean zOnFailedToRecycleView = b11.f19488c.onFailedToRecycleView(b10);
            identityHashMap.remove(b10);
            return zOnFailedToRecycleView;
        }
        throw new IllegalStateException("Cannot find wrapper for " + b10 + ", seems like it is not bound by this adapter: " + c1444i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(RecyclerView.B b10) {
        this.f19851a.d(b10).f19488c.onViewAttachedToWindow(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(RecyclerView.B b10) {
        this.f19851a.d(b10).f19488c.onViewDetachedFromWindow(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.B b10) {
        C1444i c1444i = this.f19851a;
        IdentityHashMap<RecyclerView.B, B> identityHashMap = c1444i.f19855d;
        B b11 = identityHashMap.get(b10);
        if (b11 != null) {
            b11.f19488c.onViewRecycled(b10);
            identityHashMap.remove(b10);
        } else {
            throw new IllegalStateException("Cannot find wrapper for " + b10 + ", seems like it is not bound by this adapter: " + c1444i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setHasStableIds(boolean z10) {
        throw new UnsupportedOperationException("Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy) {
        throw new UnsupportedOperationException("Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters");
    }
}
