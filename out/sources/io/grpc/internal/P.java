package io.grpc.internal;

import io.grpc.Status;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: compiled from: Http2ClientStreamTransportState.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class P extends AbstractC2208a.b {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final io.grpc.m.f f37431u = io.grpc.g.a(":status", new a());

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Status f37432q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public io.grpc.m f37433r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Charset f37434s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f37435t;

    /* JADX INFO: compiled from: Http2ClientStreamTransportState.java */
    public class a implements io.grpc.g.a<Integer> {
        @Override // io.grpc.m.g
        public final byte[] a(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // io.grpc.m.g
        public final Object b(byte[] bArr) {
            if (bArr.length < 3) {
                throw new NumberFormatException("Malformed status code ".concat(new String(bArr, io.grpc.g.f36967a)));
            }
            return Integer.valueOf((bArr[2] - 48) + ((bArr[1] - 48) * 10) + ((bArr[0] - 48) * 100));
        }
    }

    public static Charset j(io.grpc.m mVar) {
        String str = (String) mVar.c(GrpcUtil.f37207i);
        if (str != null) {
            String[] strArrSplit = str.split("charset=", 2);
            try {
                return Charset.forName(strArrSplit[strArrSplit.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return com.google.common.base.b.f27791b;
    }

    public static Status k(io.grpc.m mVar) {
        char cCharAt;
        Integer num = (Integer) mVar.c(f37431u);
        if (num == null) {
            return Status.f36904k.h("Missing HTTP status code");
        }
        String str = (String) mVar.c(GrpcUtil.f37207i);
        if (str != null && 16 <= str.length()) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.startsWith("application/grpc") && (lowerCase.length() == 16 || (cCharAt = lowerCase.charAt(16)) == '+' || cCharAt == ';')) {
                return null;
            }
        }
        return GrpcUtil.g(num.intValue()).b("invalid content-type: " + str);
    }
}
