package H3;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.google.android.gms.internal.measurement.M1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: MultiModelLoader.java */
/* JADX INFO: loaded from: classes.dex */
public final class t<Model, Data> implements q<Model, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Y3.a.c f3675b;

    /* JADX INFO: compiled from: MultiModelLoader.java */
    public static class a<Data> implements B3.d<Data>, B3.d.a<Data> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f3676b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Y3.a.c f3677c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3678d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Priority f3679e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public B3.d.a<? super Data> f3680f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public List<Throwable> f3681g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f3682h;

        public a(ArrayList arrayList, Y3.a.c cVar) {
            this.f3677c = cVar;
            if (arrayList.isEmpty()) {
                throw new IllegalArgumentException("Must not be empty.");
            }
            this.f3676b = arrayList;
            this.f3678d = 0;
        }

        @Override // B3.d
        public final Class<Data> a() {
            return ((B3.d) this.f3676b.get(0)).a();
        }

        @Override // B3.d
        public final void b() {
            List<Throwable> list = this.f3681g;
            if (list != null) {
                this.f3677c.b(list);
            }
            this.f3681g = null;
            Iterator it = this.f3676b.iterator();
            while (it.hasNext()) {
                ((B3.d) it.next()).b();
            }
        }

        @Override // B3.d.a
        public final void c(Exception exc) {
            List<Throwable> list = this.f3681g;
            M1.d(list, "Argument must not be null");
            list.add(exc);
            f();
        }

        @Override // B3.d
        public final void cancel() {
            this.f3682h = true;
            Iterator it = this.f3676b.iterator();
            while (it.hasNext()) {
                ((B3.d) it.next()).cancel();
            }
        }

        @Override // B3.d.a
        public final void d(Data data) {
            if (data != null) {
                this.f3680f.d(data);
            } else {
                f();
            }
        }

        @Override // B3.d
        public final void e(Priority priority, B3.d.a<? super Data> aVar) {
            this.f3679e = priority;
            this.f3680f = aVar;
            this.f3681g = (List) this.f3677c.a();
            ((B3.d) this.f3676b.get(this.f3678d)).e(priority, this);
            if (this.f3682h) {
                cancel();
            }
        }

        public final void f() {
            if (this.f3682h) {
                return;
            }
            if (this.f3678d < this.f3676b.size() - 1) {
                this.f3678d++;
                e(this.f3679e, this.f3680f);
            } else {
                M1.c(this.f3681g);
                this.f3680f.c(new GlideException("Fetch failed", new ArrayList(this.f3681g)));
            }
        }

        @Override // B3.d
        public final DataSource getDataSource() {
            return ((B3.d) this.f3676b.get(0)).getDataSource();
        }
    }

    public t(ArrayList arrayList, Y3.a.c cVar) {
        this.f3674a = arrayList;
        this.f3675b = cVar;
    }

    @Override // H3.q
    public final q.a<Data> a(Model model, int i10, int i11, A3.d dVar) {
        q.a<Data> aVarA;
        ArrayList arrayList = this.f3674a;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        A3.b bVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            q qVar = (q) arrayList.get(i12);
            if (qVar.b(model) && (aVarA = qVar.a(model, i10, i11, dVar)) != null) {
                arrayList2.add(aVarA.f3669c);
                bVar = aVarA.f3667a;
            }
        }
        if (arrayList2.isEmpty() || bVar == null) {
            return null;
        }
        return new q.a<>(bVar, new a(arrayList2, this.f3675b));
    }

    @Override // H3.q
    public final boolean b(Model model) {
        Iterator it = this.f3674a.iterator();
        while (it.hasNext()) {
            if (((q) it.next()).b(model)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f3674a.toArray()) + '}';
    }
}
