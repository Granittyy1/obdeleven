package com.google.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: ManifestSchemaFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f29009b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f29010a;

    /* JADX INFO: compiled from: ManifestSchemaFactory.java */
    public class a implements I {
        @Override // com.google.protobuf.I
        public final H a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // com.google.protobuf.I
        public final boolean b(Class<?> cls) {
            return false;
        }
    }

    /* JADX INFO: compiled from: ManifestSchemaFactory.java */
    public static class b implements I {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public I[] f29011a;

        @Override // com.google.protobuf.I
        public final H a(Class<?> cls) {
            for (I i10 : this.f29011a) {
                if (i10.b(cls)) {
                    return i10.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
        }

        @Override // com.google.protobuf.I
        public final boolean b(Class<?> cls) {
            for (I i10 : this.f29011a) {
                if (i10.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C() {
        I i10;
        try {
            i10 = (I) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            i10 = f29009b;
        }
        I[] iArr = {C2076s.f29196a, i10};
        b bVar = new b();
        bVar.f29011a = iArr;
        Charset charset = C2078u.f29200a;
        this.f29010a = bVar;
    }
}
