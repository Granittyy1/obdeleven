package S3;

import A3.f;
import java.util.ArrayList;

/* JADX INFO: compiled from: ResourceEncoderRegistry.java */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f5495a = new ArrayList();

    /* JADX INFO: compiled from: ResourceEncoderRegistry.java */
    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<T> f5496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f<T> f5497b;

        public a(Class<T> cls, f<T> fVar) {
            this.f5496a = cls;
            this.f5497b = fVar;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final synchronized <Z> f<Z> a(Class<Z> cls) {
        int size = this.f5495a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) this.f5495a.get(i10);
            if (aVar.f5496a.isAssignableFrom((Class<?>) cls)) {
                return aVar.f5497b;
            }
        }
        return null;
    }
}
