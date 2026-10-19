package H3;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: ModelLoaderRegistry.java */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f3670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f3671b;

    /* JADX INFO: compiled from: ModelLoaderRegistry.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap f3672a = new HashMap();

        /* JADX INFO: renamed from: H3.s$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ModelLoaderRegistry.java */
        public static class C0046a<Model> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List<q<Model, ?>> f3673a;

            public C0046a(List<q<Model, ?>> list) {
                this.f3673a = list;
            }
        }
    }

    public s(Y3.a.c cVar) {
        u uVar = new u(cVar);
        this.f3671b = new a();
        this.f3670a = uVar;
    }
}
