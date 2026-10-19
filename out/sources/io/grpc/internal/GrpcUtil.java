package io.grpc.internal;

import com.braze.Constants;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class GrpcUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f37199a = Logger.getLogger(GrpcUtil.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set<Status.Code> f37200b = Collections.unmodifiableSet(EnumSet.of(Status.Code.OK, Status.Code.INVALID_ARGUMENT, Status.Code.NOT_FOUND, Status.Code.ALREADY_EXISTS, Status.Code.FAILED_PRECONDITION, Status.Code.ABORTED, Status.Code.OUT_OF_RANGE, Status.Code.DATA_LOSS));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final io.grpc.m.b f37201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final io.grpc.m.b f37202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final io.grpc.m.f f37203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final io.grpc.m.b f37204f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final io.grpc.m.f f37205g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final io.grpc.m.b f37206h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final io.grpc.m.b f37207i;
    public static final io.grpc.m.b j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final io.grpc.m.b f37208k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f37209l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final w0 f37210m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final io.grpc.b.C0388b<Boolean> f37211n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f37212o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f37213p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final c f37214q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d f37215r;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class Http2Error {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Http2Error f37216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Http2Error[] f37217c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Http2Error[] f37218d;
        private final int code;
        private final Status status;

        /* JADX INFO: Fake field, exist only in values array */
        Http2Error EF0;

        static {
            Status status = Status.f36905l;
            Http2Error http2Error = new Http2Error("NO_ERROR", 0, 0, status);
            Status status2 = Status.f36904k;
            Http2Error http2Error2 = new Http2Error("PROTOCOL_ERROR", 1, 1, status2);
            Http2Error http2Error3 = new Http2Error("INTERNAL_ERROR", 2, 2, status2);
            f37216b = http2Error3;
            f37218d = new Http2Error[]{http2Error, http2Error2, http2Error3, new Http2Error("FLOW_CONTROL_ERROR", 3, 3, status2), new Http2Error("SETTINGS_TIMEOUT", 4, 4, status2), new Http2Error("STREAM_CLOSED", 5, 5, status2), new Http2Error("FRAME_SIZE_ERROR", 6, 6, status2), new Http2Error("REFUSED_STREAM", 7, 7, status), new Http2Error("CANCEL", 8, 8, Status.f36900f), new Http2Error("COMPRESSION_ERROR", 9, 9, status2), new Http2Error("CONNECT_ERROR", 10, 10, status2), new Http2Error("ENHANCE_YOUR_CALM", 11, 11, Status.j.h("Bandwidth exhausted")), new Http2Error("INADEQUATE_SECURITY", 12, 12, Status.f36903i.h("Permission denied as protocol is not secure enough to call")), new Http2Error("HTTP_1_1_REQUIRED", 13, 13, Status.f36901g)};
            Http2Error[] http2ErrorArrValues = values();
            Http2Error[] http2ErrorArr = new Http2Error[http2ErrorArrValues[http2ErrorArrValues.length - 1].code + 1];
            for (Http2Error http2Error4 : http2ErrorArrValues) {
                http2ErrorArr[http2Error4.code] = http2Error4;
            }
            f37217c = http2ErrorArr;
        }

        public Http2Error(String str, int i10, int i11, Status status) {
            super(str, i10);
            this.code = i11;
            String str2 = "HTTP/2 error code: " + name();
            this.status = status.h(status.f36909b != null ? Q8.d.a(C4.b.f(str2, " ("), status.f36909b, ")") : str2);
        }

        public static Status a(long j) {
            Http2Error[] http2ErrorArr = f37217c;
            Http2Error http2Error = (j >= ((long) http2ErrorArr.length) || j < 0) ? null : http2ErrorArr[(int) j];
            if (http2Error != null) {
                return http2Error.status;
            }
            return Status.d(f37216b.status.f36908a.c()).h("Unrecognized HTTP/2 error code: " + j);
        }

        public static Http2Error valueOf(String str) {
            return (Http2Error) Enum.valueOf(Http2Error.class, str);
        }

        public static Http2Error[] values() {
            return (Http2Error[]) f37218d.clone();
        }
    }

    public class a extends io.grpc.c {
    }

    public class b implements L0.c<Executor> {
        @Override // io.grpc.internal.L0.c
        public final Executor a() {
            return Executors.newCachedThreadPool(GrpcUtil.e("grpc-default-executor-%d"));
        }

        @Override // io.grpc.internal.L0.c
        public final void b(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }

        public final String toString() {
            return "grpc-default-executor";
        }
    }

    public class c implements L0.c<ScheduledExecutorService> {
        @Override // io.grpc.internal.L0.c
        public final ScheduledExecutorService a() {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, GrpcUtil.e("grpc-timer-%d"));
            try {
                scheduledExecutorServiceNewScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(scheduledExecutorServiceNewScheduledThreadPool, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new RuntimeException(e11);
            }
            return Executors.unconfigurableScheduledExecutorService(scheduledExecutorServiceNewScheduledThreadPool);
        }

        @Override // io.grpc.internal.L0.c
        public final void b(ScheduledExecutorService scheduledExecutorService) {
            scheduledExecutorService.shutdown();
        }
    }

    public class d implements com.google.common.base.j<com.google.common.base.i> {
        @Override // com.google.common.base.j
        public final com.google.common.base.i get() {
            return new com.google.common.base.i();
        }
    }

    public class e implements InterfaceC2238p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ J9.g.C0056g.a f37219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2238p f37220b;

        public e(J9.g.C0056g.a aVar, InterfaceC2238p interfaceC2238p) {
            this.f37219a = aVar;
            this.f37220b = interfaceC2238p;
        }

        @Override // io.grpc.internal.InterfaceC2238p
        public final InterfaceC2236o b(MethodDescriptor<?, ?> methodDescriptor, io.grpc.m mVar, io.grpc.b bVar, io.grpc.c[] cVarArr) {
            io.grpc.b bVar2 = io.grpc.b.f36937h;
            A8.p.j(bVar, "callOptions cannot be null");
            io.grpc.c cVarA = this.f37219a.a(new io.grpc.c.b(bVar, 0, false), mVar);
            A8.p.p("lb tracer already assigned", cVarArr[cVarArr.length - 1] == GrpcUtil.f37212o);
            cVarArr[cVarArr.length - 1] = cVarA;
            return this.f37220b.b(methodDescriptor, mVar, bVar, cVarArr);
        }

        @Override // D9.q
        public final D9.r e() {
            return this.f37220b.e();
        }
    }

    public static class g implements io.grpc.m.c<Long> {
        @Override // io.grpc.m.c
        public final String a(Long l10) {
            Long l11 = l10;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (l11.longValue() < 0) {
                throw new IllegalArgumentException("Timeout too small");
            }
            if (l11.longValue() < 100000000) {
                return l11 + Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID;
            }
            if (l11.longValue() < 100000000000L) {
                return timeUnit.toMicros(l11.longValue()) + "u";
            }
            if (l11.longValue() < 100000000000000L) {
                return timeUnit.toMillis(l11.longValue()) + "m";
            }
            if (l11.longValue() < 100000000000000000L) {
                return timeUnit.toSeconds(l11.longValue()) + "S";
            }
            if (l11.longValue() < 6000000000000000000L) {
                return timeUnit.toMinutes(l11.longValue()) + "M";
            }
            return timeUnit.toHours(l11.longValue()) + "H";
        }

        @Override // io.grpc.m.c
        public final Long b(String str) {
            A8.p.f("empty timeout", str.length() > 0);
            A8.p.f("bad timeout format", str.length() <= 9);
            long j = Long.parseLong(str.substring(0, str.length() - 1));
            char cCharAt = str.charAt(str.length() - 1);
            if (cCharAt == 'H') {
                return Long.valueOf(TimeUnit.HOURS.toNanos(j));
            }
            if (cCharAt == 'M') {
                return Long.valueOf(TimeUnit.MINUTES.toNanos(j));
            }
            if (cCharAt == 'S') {
                return Long.valueOf(TimeUnit.SECONDS.toNanos(j));
            }
            if (cCharAt == 'u') {
                return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(j));
            }
            if (cCharAt == 'm') {
                return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(j));
            }
            if (cCharAt == 'n') {
                return Long.valueOf(j);
            }
            throw new IllegalArgumentException("Invalid timeout unit: " + cCharAt);
        }
    }

    static {
        Charset.forName("US-ASCII");
        f37201c = new io.grpc.m.b("grpc-timeout", new g());
        io.grpc.m.a aVar = io.grpc.m.f37781d;
        f37202d = new io.grpc.m.b("grpc-encoding", aVar);
        f37203e = io.grpc.g.a("grpc-accept-encoding", new f());
        f37204f = new io.grpc.m.b("content-encoding", aVar);
        f37205g = io.grpc.g.a("accept-encoding", new f());
        f37206h = new io.grpc.m.b("content-length", aVar);
        f37207i = new io.grpc.m.b("content-type", aVar);
        j = new io.grpc.m.b("te", aVar);
        f37208k = new io.grpc.m.b("user-agent", aVar);
        com.google.common.base.a.e.f27789d.getClass();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f37209l = timeUnit.toNanos(20L);
        TimeUnit.HOURS.toNanos(2L);
        timeUnit.toNanos(20L);
        f37210m = new w0();
        f37211n = new io.grpc.b.C0388b<>("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER", null);
        f37212o = new a();
        f37213p = new b();
        f37214q = new c();
        f37215r = new d();
    }

    public static URI a(String str) {
        A8.p.j(str, "authority");
        try {
            return new URI(null, str, null, null, null);
        } catch (URISyntaxException e10) {
            throw new IllegalArgumentException("Invalid authority: ".concat(str), e10);
        }
    }

    public static void b(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e10) {
            f37199a.log(Level.WARNING, "exception caught in closeQuietly", (Throwable) e10);
        }
    }

    public static io.grpc.c[] c(io.grpc.b bVar, io.grpc.m mVar, int i10, boolean z10) {
        List<io.grpc.c.a> list = bVar.f36941d;
        int size = list.size();
        io.grpc.c[] cVarArr = new io.grpc.c[size + 1];
        io.grpc.b bVar2 = io.grpc.b.f36937h;
        io.grpc.c.b bVar3 = new io.grpc.c.b(bVar, i10, z10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            cVarArr[i11] = list.get(i11).a(bVar3, mVar);
        }
        cVarArr[size] = f37212o;
        return cVarArr;
    }

    public static String d(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", null).invoke(inetSocketAddress, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    public static p107i6.g e(String str) {
        Boolean bool = Boolean.TRUE;
        String.format(Locale.ROOT, str, 0);
        return new p107i6.g(Executors.defaultThreadFactory(), str, new AtomicLong(0L), bool);
    }

    public static InterfaceC2238p f(io.grpc.i.d dVar, boolean z10) {
        io.grpc.i.g gVar = dVar.f36979a;
        InterfaceC2239p0 interfaceC2239p0A = gVar != null ? ((T0) gVar.e()).a() : null;
        if (interfaceC2239p0A != null) {
            J9.g.C0056g.a aVar = dVar.f36980b;
            return aVar == null ? interfaceC2239p0A : new e(aVar, interfaceC2239p0A);
        }
        Status status = dVar.f36981c;
        if (!status.f()) {
            if (dVar.f36982d) {
                return new G(h(status), ClientStreamListener.RpcProgress.f37136d);
            }
            if (!z10) {
                return new G(h(status), ClientStreamListener.RpcProgress.f37134b);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0029  */
    /* JADX WARN: Code duplicated, block: B:25:0x0035  */
    public static Status g(int i10) {
        Status.Code code;
        if ((i10 >= 100 && i10 < 200) || i10 == 400) {
            code = Status.Code.INTERNAL;
        } else if (i10 == 401) {
            code = Status.Code.UNAUTHENTICATED;
        } else if (i10 == 403) {
            code = Status.Code.PERMISSION_DENIED;
        } else if (i10 == 404) {
            code = Status.Code.UNIMPLEMENTED;
        } else if (i10 == 429) {
            code = Status.Code.UNAVAILABLE;
        } else if (i10 != 431) {
            switch (i10) {
                case 502:
                case 503:
                case 504:
                    code = Status.Code.UNAVAILABLE;
                    break;
                default:
                    code = Status.Code.UNKNOWN;
                    break;
            }
        } else {
            code = Status.Code.INTERNAL;
        }
        return code.b().h("HTTP status code " + i10);
    }

    public static Status h(Status status) {
        A8.p.g(status != null);
        if (!f37200b.contains(status.f36908a)) {
            return status;
        }
        return Status.f36904k.h("Inappropriate status code from control plane: " + status.f36908a + " " + status.f36909b).g(status.f36910c);
    }

    public static final class f implements io.grpc.g.a<byte[]> {
        @Override // io.grpc.m.g
        public final byte[] a(Object obj) {
            return (byte[]) obj;
        }

        @Override // io.grpc.m.g
        public final Object b(byte[] bArr) {
            return bArr;
        }
    }
}
