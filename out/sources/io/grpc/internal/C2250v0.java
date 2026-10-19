package io.grpc.internal;

import io.grpc.MethodDescriptor;
import java.util.Arrays;

/* JADX INFO: renamed from: io.grpc.internal.v0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: PickSubchannelArgsImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2250v0 extends io.grpc.i.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.grpc.b f37701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io.grpc.m f37702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MethodDescriptor<?, ?> f37703c;

    public C2250v0(MethodDescriptor<?, ?> methodDescriptor, io.grpc.m mVar, io.grpc.b bVar) {
        A8.p.j(methodDescriptor, "method");
        this.f37703c = methodDescriptor;
        A8.p.j(mVar, "headers");
        this.f37702b = mVar;
        A8.p.j(bVar, "callOptions");
        this.f37701a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2250v0.class != obj.getClass()) {
            return false;
        }
        C2250v0 c2250v0 = (C2250v0) obj;
        return kotlinx.coroutines.C.j(this.f37701a, c2250v0.f37701a) && kotlinx.coroutines.C.j(this.f37702b, c2250v0.f37702b) && kotlinx.coroutines.C.j(this.f37703c, c2250v0.f37703c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f37701a, this.f37702b, this.f37703c});
    }

    public final String toString() {
        return "[method=" + this.f37703c + " headers=" + this.f37702b + " callOptions=" + this.f37701a + "]";
    }
}
