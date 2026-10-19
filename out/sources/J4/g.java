package J4;

/* JADX INFO: compiled from: EventStoreModule_StoreConfigFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class g implements E4.b<e> {

    /* JADX INFO: compiled from: EventStoreModule_StoreConfigFactory.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f3980a = new g();
    }

    @Override // p268va.a
    public final Object get() {
        J4.a aVar = e.f3978a;
        if (aVar != null) {
            return aVar;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
