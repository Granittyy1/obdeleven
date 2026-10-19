package io.grpc;

import com.braze.Constants;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import kotlinx.coroutines.C;

/* JADX INFO: loaded from: classes3.dex */
public final class Status {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List<Status> f36898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Status f36899e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Status f36900f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Status f36901g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Status f36902h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Status f36903i;
    public static final Status j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Status f36904k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Status f36905l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final m.f f36906m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final m.f f36907n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Code f36908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f36910c;

    public enum Code {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);

        private final int value;
        private final byte[] valueAscii;

        Code(int i10) {
            this.value = i10;
            this.valueAscii = Integer.toString(i10).getBytes(com.google.common.base.b.f27790a);
        }

        public static byte[] a(Code code) {
            return code.valueAscii;
        }

        public final Status b() {
            return Status.f36898d.get(this.value);
        }

        public final int c() {
            return this.value;
        }
    }

    public static final class a implements m.g<Status> {
        @Override // io.grpc.m.g
        public final byte[] a(Status status) {
            return Code.a(status.f36908a);
        }

        @Override // io.grpc.m.g
        public final Status b(byte[] bArr) {
            int i10;
            byte b10;
            char c10 = 0;
            if (bArr.length == 1 && bArr[0] == 48) {
                return Status.f36899e;
            }
            int length = bArr.length;
            if (length != 1) {
                if (length == 2 && (b10 = bArr[0]) >= 48 && b10 <= 57) {
                    i10 = (b10 - 48) * 10;
                    c10 = 1;
                }
                return Status.f36901g.h("Unknown code ".concat(new String(bArr, com.google.common.base.b.f27790a)));
            }
            i10 = 0;
            byte b11 = bArr[c10];
            if (b11 >= 48 && b11 <= 57) {
                int i11 = (b11 - 48) + i10;
                List<Status> list = Status.f36898d;
                if (i11 < list.size()) {
                    return list.get(i11);
                }
            }
            return Status.f36901g.h("Unknown code ".concat(new String(bArr, com.google.common.base.b.f27790a)));
        }
    }

    public static final class b implements m.g<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final byte[] f36928a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

        @Override // io.grpc.m.g
        public final byte[] a(String str) {
            byte[] bytes = str.getBytes(com.google.common.base.b.f27791b);
            int i10 = 0;
            while (i10 < bytes.length) {
                byte b10 = bytes[i10];
                if (b10 < 32 || b10 >= 126 || b10 == 37) {
                    byte[] bArr = new byte[((bytes.length - i10) * 3) + i10];
                    if (i10 != 0) {
                        System.arraycopy(bytes, 0, bArr, 0, i10);
                    }
                    int i11 = i10;
                    while (i10 < bytes.length) {
                        byte b11 = bytes[i10];
                        if (b11 < 32 || b11 >= 126 || b11 == 37) {
                            bArr[i11] = 37;
                            byte[] bArr2 = f36928a;
                            bArr[i11 + 1] = bArr2[(b11 >> 4) & 15];
                            bArr[i11 + 2] = bArr2[b11 & 15];
                            i11 += 3;
                        } else {
                            bArr[i11] = b11;
                            i11++;
                        }
                        i10++;
                    }
                    return Arrays.copyOf(bArr, i11);
                }
                i10++;
            }
            return bytes;
        }

        @Override // io.grpc.m.g
        public final String b(byte[] bArr) {
            for (int i10 = 0; i10 < bArr.length; i10++) {
                byte b10 = bArr[i10];
                if (b10 < 32 || b10 >= 126 || (b10 == 37 && i10 + 2 < bArr.length)) {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length);
                    int i11 = 0;
                    while (i11 < bArr.length) {
                        if (bArr[i11] == 37 && i11 + 2 < bArr.length) {
                            try {
                                byteBufferAllocate.put((byte) Integer.parseInt(new String(bArr, i11 + 1, 2, com.google.common.base.b.f27790a), 16));
                                i11 += 3;
                            } catch (NumberFormatException unused) {
                                byteBufferAllocate.put(bArr[i11]);
                                i11++;
                            }
                        }
                        byteBufferAllocate.put(bArr[i11]);
                        i11++;
                    }
                    return new String(byteBufferAllocate.array(), 0, byteBufferAllocate.position(), com.google.common.base.b.f27791b);
                }
            }
            return new String(bArr, 0);
        }
    }

    static {
        Boolean.parseBoolean(System.getProperty("io.grpc.Status.failOnEqualsForTest", "false"));
        TreeMap treeMap = new TreeMap();
        for (Code code : Code.values()) {
            Status status = (Status) treeMap.put(Integer.valueOf(code.c()), new Status(code, null, null));
            if (status != null) {
                throw new IllegalStateException("Code value duplication between " + status.f36908a.name() + " & " + code.name());
            }
        }
        f36898d = Collections.unmodifiableList(new ArrayList(treeMap.values()));
        f36899e = Code.OK.b();
        f36900f = Code.CANCELLED.b();
        f36901g = Code.UNKNOWN.b();
        Code.INVALID_ARGUMENT.b();
        f36902h = Code.DEADLINE_EXCEEDED.b();
        Code.NOT_FOUND.b();
        Code.ALREADY_EXISTS.b();
        f36903i = Code.PERMISSION_DENIED.b();
        Code.UNAUTHENTICATED.b();
        j = Code.RESOURCE_EXHAUSTED.b();
        Code.FAILED_PRECONDITION.b();
        Code.ABORTED.b();
        Code.OUT_OF_RANGE.b();
        Code.UNIMPLEMENTED.b();
        f36904k = Code.INTERNAL.b();
        f36905l = Code.UNAVAILABLE.b();
        Code.DATA_LOSS.b();
        f36906m = new m.f("grpc-status", false, new a());
        f36907n = new m.f("grpc-message", false, new b());
    }

    public Status(Code code, String str, Throwable th) {
        A8.p.j(code, "code");
        this.f36908a = code;
        this.f36909b = str;
        this.f36910c = th;
    }

    public static String c(Status status) {
        String str = status.f36909b;
        Code code = status.f36908a;
        if (str == null) {
            return code.toString();
        }
        return code + ": " + status.f36909b;
    }

    public static Status d(int i10) {
        if (i10 >= 0) {
            List<Status> list = f36898d;
            if (i10 < list.size()) {
                return list.get(i10);
            }
        }
        return f36901g.h("Unknown code " + i10);
    }

    public static Status e(Throwable th) {
        A8.p.j(th, Constants.BRAZE_PUSH_TITLE_KEY);
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            if (cause instanceof StatusException) {
                return ((StatusException) cause).a();
            }
            if (cause instanceof StatusRuntimeException) {
                return ((StatusRuntimeException) cause).a();
            }
        }
        return f36901g.g(th);
    }

    public final StatusRuntimeException a() {
        return new StatusRuntimeException(this, null);
    }

    public final Status b(String str) {
        if (str == null) {
            return this;
        }
        Throwable th = this.f36910c;
        Code code = this.f36908a;
        String str2 = this.f36909b;
        if (str2 == null) {
            return new Status(code, str, th);
        }
        return new Status(code, str2 + "\n" + str, th);
    }

    public final boolean f() {
        return Code.OK == this.f36908a;
    }

    public final Status g(Throwable th) {
        return C.j(this.f36910c, th) ? this : new Status(this.f36908a, this.f36909b, th);
    }

    public final Status h(String str) {
        return C.j(this.f36909b, str) ? this : new Status(this.f36908a, str, this.f36910c);
    }

    public final String toString() {
        com.google.common.base.d.a aVarB = com.google.common.base.d.b(this);
        aVarB.c(this.f36908a.name(), "code");
        aVarB.c(this.f36909b, "description");
        Throwable th = this.f36910c;
        Object string = th;
        if (th != null) {
            Object obj = com.google.common.base.l.f27810a;
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            string = stringWriter.toString();
        }
        aVarB.c(string, "cause");
        return aVarB.toString();
    }
}
