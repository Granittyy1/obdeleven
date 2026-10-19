package H3;

import com.google.android.gms.internal.measurement.M1;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: ModelLoader.java */
/* JADX INFO: loaded from: classes.dex */
public interface q<Model, Data> {

    /* JADX INFO: compiled from: ModelLoader.java */
    public static class a<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final A3.b f3667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<A3.b> f3668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final B3.d<Data> f3669c;

        public a() {
            throw null;
        }

        public a(A3.b bVar, B3.d<Data> dVar) {
            List<A3.b> listEmptyList = Collections.emptyList();
            M1.d(bVar, "Argument must not be null");
            this.f3667a = bVar;
            M1.d(listEmptyList, "Argument must not be null");
            this.f3668b = listEmptyList;
            M1.d(dVar, "Argument must not be null");
            this.f3669c = dVar;
        }
    }

    a<Data> a(Model model, int i10, int i11, A3.d dVar);

    boolean b(Model model);
}
