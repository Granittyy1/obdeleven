package H9;

import A8.p;
import D9.s;
import J4.i;
import N7.d;
import com.braze.support.BrazeLogger;
import com.google.protobuf.AbstractC2066h;
import com.google.protobuf.C2071m;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.J;
import com.google.protobuf.S;
import io.grpc.Status;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: ProtoLiteUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile C2071m f3744a = C2071m.a();

    /* JADX INFO: compiled from: ProtoLiteUtils.java */
    public static final class a<T extends J> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final ThreadLocal<Reference<byte[]>> f3745d = new ThreadLocal<>();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final S<T> f3746a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final GeneratedMessageLite f3747b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f3748c;

        public a(GeneratedMessageLite generatedMessageLite) {
            p.j(generatedMessageLite, "defaultInstance cannot be null");
            this.f3747b = generatedMessageLite;
            this.f3746a = generatedMessageLite.y();
            this.f3748c = -1;
        }

        public final J a(InputStream inputStream) {
            AbstractC2066h bVar;
            byte[] bArr;
            boolean z10 = inputStream instanceof H9.a;
            S<T> s10 = this.f3746a;
            if (z10 && ((H9.a) inputStream).f3742c == s10) {
                try {
                    J j = ((H9.a) inputStream).f3741b;
                    if (j != null) {
                        return j;
                    }
                    throw new IllegalStateException("message not available");
                } catch (IllegalStateException unused) {
                }
            }
            try {
                if (inputStream instanceof s) {
                    int iAvailable = inputStream.available();
                    if (iAvailable <= 0 || iAvailable > 4194304) {
                        if (iAvailable == 0) {
                            return this.f3747b;
                        }
                        bVar = null;
                    } else {
                        ThreadLocal<Reference<byte[]>> threadLocal = f3745d;
                        Reference<byte[]> reference = threadLocal.get();
                        if (reference == null || (bArr = reference.get()) == null || bArr.length < iAvailable) {
                            bArr = new byte[iAvailable];
                            threadLocal.set(new WeakReference(bArr));
                        }
                        int i10 = iAvailable;
                        while (i10 > 0) {
                            int i11 = inputStream.read(bArr, iAvailable - i10, i10);
                            if (i11 == -1) {
                                break;
                            }
                            i10 -= i11;
                        }
                        if (i10 != 0) {
                            throw new RuntimeException("size inaccurate: " + iAvailable + " != " + (iAvailable - i10));
                        }
                        bVar = AbstractC2066h.d(bArr, 0, iAvailable, false);
                    }
                } else {
                    bVar = null;
                }
                if (bVar == null) {
                    bVar = new AbstractC2066h.b(inputStream);
                }
                bVar.f29160c = BrazeLogger.SUPPRESS;
                int i12 = this.f3748c;
                if (i12 >= 0) {
                    if (i12 < 0) {
                        throw new IllegalArgumentException(i.b(i12, "Recursion limit cannot be negative: "));
                    }
                    bVar.f29159b = i12;
                }
                try {
                    C2071m c2071m = b.f3744a;
                    J jA = s10.a(bVar);
                    try {
                        bVar.a(0);
                        return jA;
                    } catch (InvalidProtocolBufferException e10) {
                        e10.g(jA);
                        throw e10;
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw Status.f36904k.h("Invalid protobuf byte sequence").g(e11).a();
                }
            } catch (IOException e12) {
                throw new RuntimeException(e12);
            }
        }

        public final H9.a b(d dVar) {
            return new H9.a(dVar, this.f3746a);
        }
    }
}
