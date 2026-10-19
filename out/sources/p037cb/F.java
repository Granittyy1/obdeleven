package p037cb;

import Ya.b;
import p011ab.e;
import p024bb.c;
import p024bb.d;

/* JADX INFO: compiled from: InlineClassDescriptor.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class F implements D<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b<Object> f22546a;

    public F(b<Object> bVar) {
        this.f22546a = bVar;
    }

    @Override // p037cb.D
    public final b<?>[] childSerializers() {
        return new b[]{this.f22546a};
    }

    @Override // Ya.a
    public final Object deserialize(c cVar) {
        throw new IllegalStateException("unsupported");
    }

    @Override // Ya.l, Ya.a
    public final e getDescriptor() {
        throw new IllegalStateException("unsupported");
    }

    @Override // Ya.l
    public final void serialize(d dVar, Object obj) {
        throw new IllegalStateException("unsupported");
    }

    @Override // p037cb.D
    public final b<?>[] typeParametersSerializers() {
        return C1538m0.f22638a;
    }
}
