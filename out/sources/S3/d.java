package S3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: ResourceDecoderRegistry.java */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f5490a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f5491b = new HashMap();

    /* JADX INFO: compiled from: ResourceDecoderRegistry.java */
    public static class a<T, R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<T> f5492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<R> f5493b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final A3.e<T, R> f5494c;

        public a(Class<T> cls, Class<R> cls2, A3.e<T, R> eVar) {
            this.f5492a = cls;
            this.f5493b = cls2;
            this.f5494c = eVar;
        }
    }

    public final synchronized List<a<?, ?>> a(String str) {
        List<a<?, ?>> arrayList;
        try {
            if (!this.f5490a.contains(str)) {
                this.f5490a.add(str);
            }
            arrayList = (List) this.f5491b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f5491b.put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final synchronized ArrayList b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f5490a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f5491b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if ((aVar.f5492a.isAssignableFrom((Class<?>) cls) && cls2.isAssignableFrom(aVar.f5493b)) && !arrayList.contains(aVar.f5493b)) {
                        arrayList.add(aVar.f5493b);
                    }
                }
            }
        }
        return arrayList;
    }
}
