package H3;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;

/* JADX INFO: compiled from: UnitModelLoader.java */
/* JADX INFO: loaded from: classes.dex */
public final class x<Model> implements q<Model, Model> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x<?> f3699a = new x<>();

    /* JADX INFO: compiled from: UnitModelLoader.java */
    public static class a<Model> implements r<Model, Model> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a<?> f3700a = new a<>();

        @Override // H3.r
        public final q<Model, Model> a(u uVar) {
            return x.f3699a;
        }
    }

    @Override // H3.q
    public final q.a<Model> a(Model model, int i10, int i11, A3.d dVar) {
        return new q.a<>(new W3.b(model), new b(model));
    }

    @Override // H3.q
    public final boolean b(Model model) {
        return true;
    }

    /* JADX INFO: compiled from: UnitModelLoader.java */
    public static class b<Model> implements B3.d<Model> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Model f3701b;

        public b(Model model) {
            this.f3701b = model;
        }

        @Override // B3.d
        public final Class<Model> a() {
            return (Class<Model>) this.f3701b.getClass();
        }

        @Override // B3.d
        public final void e(Priority priority, B3.d.a<? super Model> aVar) {
            aVar.d(this.f3701b);
        }

        @Override // B3.d
        public final DataSource getDataSource() {
            return DataSource.f24511b;
        }

        @Override // B3.d
        public final void b() {
        }

        @Override // B3.d
        public final void cancel() {
        }
    }
}
