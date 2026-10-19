package E9;

import io.grpc.internal.GrpcUtil;
import okio.ByteString;

/* JADX INFO: compiled from: Headers.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F9.c f3145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final F9.c f3146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final F9.c f3147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final F9.c f3148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final F9.c f3149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final F9.c f3150f;

    static {
        ByteString byteString = F9.c.f3286g;
        f3145a = new F9.c(byteString, "https");
        f3146b = new F9.c(byteString, "http");
        ByteString byteString2 = F9.c.f3284e;
        f3147c = new F9.c(byteString2, "POST");
        f3148d = new F9.c(byteString2, "GET");
        f3149e = new F9.c(GrpcUtil.f37207i.f37787a, "application/grpc");
        f3150f = new F9.c("te", "trailers");
    }
}
