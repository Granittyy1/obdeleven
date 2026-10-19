package H3;

import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: MultiModelLoaderFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f3683e = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f3684f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f3686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f3687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Y3.a.c f3688d;

    /* JADX INFO: compiled from: MultiModelLoaderFactory.java */
    public static class a implements q<Object, Object> {
        @Override // H3.q
        public final q.a<Object> a(Object obj, int i10, int i11, A3.d dVar) {
            return null;
        }

        @Override // H3.q
        public final boolean b(Object obj) {
            return false;
        }
    }

    /* JADX INFO: compiled from: MultiModelLoaderFactory.java */
    public static class b<Model, Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<Model> f3689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<Data> f3690b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final r<? extends Model, ? extends Data> f3691c;

        public b(Class<Model> cls, Class<Data> cls2, r<? extends Model, ? extends Data> rVar) {
            this.f3689a = cls;
            this.f3690b = cls2;
            this.f3691c = rVar;
        }
    }

    /* JADX INFO: compiled from: MultiModelLoaderFactory.java */
    public static class c {
    }

    public u(Y3.a.c cVar) {
        c cVar2 = f3683e;
        this.f3685a = new ArrayList();
        this.f3687c = new HashSet();
        this.f3688d = cVar;
        this.f3686b = cVar2;
    }

    public final synchronized <Model, Data> q<Model, Data> a(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z10 = false;
            for (b bVar : this.f3685a) {
                if (this.f3687c.contains(bVar)) {
                    z10 = true;
                } else if (bVar.f3689a.isAssignableFrom(cls) && bVar.f3690b.isAssignableFrom(cls2)) {
                    this.f3687c.add(bVar);
                    arrayList.add(bVar.f3691c.a(this));
                    this.f3687c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                c cVar = this.f3686b;
                Y3.a.c cVar2 = this.f3688d;
                cVar.getClass();
                return new t(arrayList, cVar2);
            }
            if (arrayList.size() == 1) {
                return (q) arrayList.get(0);
            }
            if (z10) {
                return f3684f;
            }
            throw new Registry.NoModelLoaderAvailableException("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            this.f3687c.clear();
            throw th;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final synchronized ArrayList b(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b bVar : this.f3685a) {
                if (!this.f3687c.contains(bVar) && bVar.f3689a.isAssignableFrom((Class<?>) cls)) {
                    this.f3687c.add(bVar);
                    arrayList.add(bVar.f3691c.a(this));
                    this.f3687c.remove(bVar);
                }
            }
        } catch (Throwable th) {
            this.f3687c.clear();
            throw th;
        }
        return arrayList;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final synchronized ArrayList c(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b bVar : this.f3685a) {
            if (!arrayList.contains(bVar.f3690b) && bVar.f3689a.isAssignableFrom((Class<?>) cls)) {
                arrayList.add(bVar.f3690b);
            }
        }
        return arrayList;
    }
}
