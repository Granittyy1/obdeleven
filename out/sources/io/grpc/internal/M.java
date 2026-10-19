package io.grpc.internal;

import java.io.InputStream;

/* JADX INFO: compiled from: Framer.java */
/* JADX INFO: loaded from: classes3.dex */
public interface M {
    M a(D9.f fVar);

    void b(InputStream inputStream);

    void close();

    void d(int i10);

    void flush();

    boolean isClosed();
}
