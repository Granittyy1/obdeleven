package io.grpc.internal;

import io.grpc.l;
import io.grpc.okhttp.OkHttpChannelBuilder;

/* JADX INFO: renamed from: io.grpc.internal.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AbstractManagedChannelImplBuilder.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2210b<T extends io.grpc.l<T>> extends io.grpc.l<T> {
    @Override // io.grpc.l
    public final D9.t a() {
        return ((OkHttpChannelBuilder) this).f37805a.a();
    }

    public final String toString() {
        com.google.common.base.d.a aVarB = com.google.common.base.d.b(this);
        aVarB.c(((OkHttpChannelBuilder) this).f37805a, "delegate");
        return aVarB.toString();
    }
}
