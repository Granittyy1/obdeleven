package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: ManifestSchemaFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f17092b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f17093a;

    /* JADX INFO: compiled from: ManifestSchemaFactory.java */
    public static class a implements H {
        @Override // androidx.datastore.preferences.protobuf.H
        public final G a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // androidx.datastore.preferences.protobuf.H
        public final boolean b(Class<?> cls) {
            return false;
        }
    }

    /* JADX INFO: compiled from: ManifestSchemaFactory.java */
    public static class b implements H {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public H[] f17094a;

        @Override // androidx.datastore.preferences.protobuf.H
        public final G a(Class<?> cls) {
            for (H h8 : this.f17094a) {
                if (h8.b(cls)) {
                    return h8.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
        }

        @Override // androidx.datastore.preferences.protobuf.H
        public final boolean b(Class<?> cls) {
            for (H h8 : this.f17094a) {
                if (h8.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public B() {
        H h8;
        try {
            h8 = (H) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            h8 = f17092b;
        }
        H[] hArr = {C1328s.f17277a, h8};
        b bVar = new b();
        bVar.f17094a = hArr;
        Charset charset = C1330u.f17280a;
        this.f17093a = bVar;
    }
}
