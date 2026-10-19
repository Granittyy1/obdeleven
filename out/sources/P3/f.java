package P3;

import java.util.ArrayList;

/* JADX INFO: compiled from: TranscoderRegistry.java */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f4924a = new ArrayList();

    /* JADX INFO: compiled from: TranscoderRegistry.java */
    public static final class a<Z, R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<Z> f4925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<R> f4926b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e<Z, R> f4927c;

        public a(Class<Z> cls, Class<R> cls2, e<Z, R> eVar) {
            this.f4925a = cls;
            this.f4926b = cls2;
            this.f4927c = eVar;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final synchronized ArrayList a(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a aVar : this.f4924a) {
            if (aVar.f4925a.isAssignableFrom((Class<?>) cls) && cls2.isAssignableFrom(aVar.f4926b)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }
}
