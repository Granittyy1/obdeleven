package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: GeneratedMessageInfoFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2076s implements I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2076s f29196a = new C2076s();

    @Override // com.google.protobuf.I
    public final H a(Class<?> cls) {
        if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (H) GeneratedMessageLite.x(cls.asSubclass(GeneratedMessageLite.class)).w(GeneratedMessageLite.MethodToInvoke.f29040d);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }

    @Override // com.google.protobuf.I
    public final boolean b(Class<?> cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }
}
