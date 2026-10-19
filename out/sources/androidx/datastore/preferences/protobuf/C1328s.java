package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: GeneratedMessageInfoFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1328s implements H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1328s f17277a = new C1328s();

    @Override // androidx.datastore.preferences.protobuf.H
    public final G a(Class<?> cls) {
        if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (G) GeneratedMessageLite.k(cls.asSubclass(GeneratedMessageLite.class)).j(GeneratedMessageLite.MethodToInvoke.f17124d);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.H
    public final boolean b(Class<?> cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }
}
