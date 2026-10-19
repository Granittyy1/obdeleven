package androidx.recyclerview.widget;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: androidx.recyclerview.widget.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AsyncListDiffer.java */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1439d implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f19822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f19823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.voltasit.obdeleven.presentation.garage.j f19825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1440e f19826f;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.d$a */
    /* JADX INFO: compiled from: AsyncListDiffer.java */
    public class a extends C1451p.b {
        public a() {
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // androidx.recyclerview.widget.C1451p.b
        public final boolean areContentsTheSame(int i10, int i11) {
            RunnableC1439d runnableC1439d = RunnableC1439d.this;
            Object obj = runnableC1439d.f19822b.get(i10);
            Object obj2 = runnableC1439d.f19823c.get(i11);
            if (obj != null && obj2 != null) {
                return runnableC1439d.f19826f.f19832b.f19819b.a((T) obj, (T) obj2);
            }
            if (obj == null && obj2 == null) {
                return true;
            }
            throw new AssertionError();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // androidx.recyclerview.widget.C1451p.b
        public final boolean areItemsTheSame(int i10, int i11) {
            RunnableC1439d runnableC1439d = RunnableC1439d.this;
            Object obj = runnableC1439d.f19822b.get(i10);
            Object obj2 = runnableC1439d.f19823c.get(i11);
            if (obj == null || obj2 == null) {
                return obj == null && obj2 == null;
            }
            return runnableC1439d.f19826f.f19832b.f19819b.b((T) obj, (T) obj2);
        }

        @Override // androidx.recyclerview.widget.C1451p.b
        public final Object getChangePayload(int i10, int i11) {
            RunnableC1439d runnableC1439d = RunnableC1439d.this;
            Object obj = runnableC1439d.f19822b.get(i10);
            Object obj2 = runnableC1439d.f19823c.get(i11);
            if (obj == null || obj2 == null) {
                throw new AssertionError();
            }
            runnableC1439d.f19826f.f19832b.f19819b.getClass();
            return null;
        }

        @Override // androidx.recyclerview.widget.C1451p.b
        public final int getNewListSize() {
            return RunnableC1439d.this.f19823c.size();
        }

        @Override // androidx.recyclerview.widget.C1451p.b
        public final int getOldListSize() {
            return RunnableC1439d.this.f19822b.size();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.d$b */
    /* JADX INFO: compiled from: AsyncListDiffer.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C1451p.d f19828b;

        public b(C1451p.d dVar) {
            this.f19828b = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            RunnableC1439d runnableC1439d = RunnableC1439d.this;
            C1440e c1440e = runnableC1439d.f19826f;
            if (c1440e.f19837g == runnableC1439d.f19824d) {
                List list = c1440e.f19836f;
                List<T> list2 = runnableC1439d.f19823c;
                c1440e.f19835e = list2;
                c1440e.f19836f = Collections.unmodifiableList(list2);
                this.f19828b.a(c1440e.f19831a);
                c1440e.a(list, runnableC1439d.f19825e);
            }
        }
    }

    public RunnableC1439d(C1440e c1440e, List list, List list2, int i10, com.voltasit.obdeleven.presentation.garage.j jVar) {
        this.f19826f = c1440e;
        this.f19822b = list;
        this.f19823c = list2;
        this.f19824d = i10;
        this.f19825e = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19826f.f19833c.execute(new b(C1451p.a(new a())));
    }
}
