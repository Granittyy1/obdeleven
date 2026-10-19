package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.recyclerview.widget.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AsyncListDiffer.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1440e<T> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f19830h = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1437b f19831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1438c<T> f19832b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<T> f19835e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f19837g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f19834d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<T> f19836f = Collections.emptyList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f19833c = f19830h;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.e$a */
    /* JADX INFO: compiled from: AsyncListDiffer.java */
    public interface a<T> {
        void a();
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.e$b */
    /* JADX INFO: compiled from: AsyncListDiffer.java */
    public static class b implements Executor {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Handler f19838b = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f19838b.post(runnable);
        }
    }

    public C1440e(C1437b c1437b, C1438c c1438c) {
        this.f19831a = c1437b;
        this.f19832b = c1438c;
    }

    public final void a(List list, com.voltasit.obdeleven.presentation.garage.j jVar) {
        Iterator it = this.f19834d.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a();
        }
        if (jVar != null) {
            jVar.run();
        }
    }

    public final void b(List list, com.voltasit.obdeleven.presentation.garage.j jVar) {
        int i10 = this.f19837g + 1;
        this.f19837g = i10;
        List<T> list2 = this.f19835e;
        if (list == list2) {
            if (jVar != null) {
                jVar.run();
                return;
            }
            return;
        }
        List<T> list3 = this.f19836f;
        C1437b c1437b = this.f19831a;
        if (list == null) {
            int size = list2.size();
            this.f19835e = null;
            this.f19836f = Collections.emptyList();
            c1437b.b(0, size);
            a(list3, jVar);
            return;
        }
        if (list2 != null) {
            this.f19832b.f19818a.execute(new RunnableC1439d(this, list2, list, i10, jVar));
            return;
        }
        this.f19835e = list;
        this.f19836f = Collections.unmodifiableList(list);
        c1437b.a(0, list.size());
        a(list3, jVar);
    }
}
