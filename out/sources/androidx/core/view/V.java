package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: compiled from: ViewGroup.kt */
/* JADX INFO: loaded from: classes.dex */
public final class V implements Iterator<View>, Ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f16880c;

    public V(ViewGroup viewGroup) {
        this.f16880c = viewGroup;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16879b < this.f16880c.getChildCount();
    }

    @Override // java.util.Iterator
    public final View next() {
        int i10 = this.f16879b;
        this.f16879b = i10 + 1;
        View childAt = this.f16880c.getChildAt(i10);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i10 = this.f16879b - 1;
        this.f16879b = i10;
        this.f16880c.removeViewAt(i10);
    }
}
