package io.grpc.internal;

import java.net.URI;

/* JADX INFO: compiled from: DnsNameResolverProvider.java */
/* JADX INFO: loaded from: classes3.dex */
public final class D extends io.grpc.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f37139a;

    static {
        boolean z10 = false;
        try {
            Class.forName("android.app.Application", false, D.class.getClassLoader());
            z10 = true;
        } catch (Exception unused) {
        }
        f37139a = z10;
    }

    @Override // io.grpc.n.c
    public final String a() {
        return "dns";
    }

    @Override // io.grpc.n.c
    public final io.grpc.n b(URI uri, io.grpc.n.a aVar) {
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        String path = uri.getPath();
        A8.p.j(path, "targetPath");
        if (!path.startsWith("/")) {
            throw new IllegalArgumentException(A8.A.h("the path component (%s) of the target (%s) must start with '/'", path, uri));
        }
        String strSubstring = path.substring(1);
        uri.getAuthority();
        return new DnsNameResolver(strSubstring, aVar, GrpcUtil.f37213p, new com.google.common.base.i(), f37139a);
    }

    @Override // io.grpc.o
    public boolean c() {
        return true;
    }

    @Override // io.grpc.o
    public int d() {
        return 5;
    }
}
