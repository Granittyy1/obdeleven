package Z3;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: GraphRequestBatch.kt */
/* JADX INFO: loaded from: classes.dex */
public final class w extends AbstractList<r> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicInteger f7897f = new AtomicInteger();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f7898b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f7900d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7899c = String.valueOf(Integer.valueOf(f7897f.incrementAndGet()));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f7901e = new ArrayList();

    /* JADX INFO: compiled from: GraphRequestBatch.kt */
    public interface a {
        void a(w wVar);
    }

    /* JADX INFO: compiled from: GraphRequestBatch.kt */
    public interface b extends a {
        void b();
    }

    public w(Collection<r> collection) {
        this.f7900d = new ArrayList(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        r element = (r) obj;
        kotlin.jvm.internal.i.e(element, "element");
        this.f7900d.add(i10, element);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f7900d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof r) {
            return super.contains((r) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return (r) this.f7900d.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null ? true : obj instanceof r) {
            return super.indexOf((r) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null ? true : obj instanceof r) {
            return super.lastIndexOf((r) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof r) {
            return super.remove((r) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        r element = (r) obj;
        kotlin.jvm.internal.i.e(element, "element");
        return (r) this.f7900d.set(i10, element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7900d.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        return (r) this.f7900d.remove(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        r element = (r) obj;
        kotlin.jvm.internal.i.e(element, "element");
        return this.f7900d.add(element);
    }

    public w(r... rVarArr) {
        this.f7900d = new ArrayList(Q3.d.h(rVarArr));
    }
}
