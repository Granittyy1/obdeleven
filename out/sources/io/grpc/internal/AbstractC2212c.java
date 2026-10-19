package io.grpc.internal;

/* JADX INFO: renamed from: io.grpc.internal.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AbstractReadableBuffer.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2212c implements x0 {
    public final void b(int i10) {
        if (e() < i10) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // io.grpc.internal.x0
    public boolean markSupported() {
        return this instanceof y0.b;
    }

    @Override // io.grpc.internal.x0
    public void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // io.grpc.internal.x0
    public void i0() {
    }
}
