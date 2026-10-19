package com.google.firebase.perf.v1;

import com.google.protobuf.AbstractC2059a;
import com.google.protobuf.C2078u;
import com.google.protobuf.D;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.K;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.S;
import com.google.protobuf.V;
import com.google.protobuf.W;
import com.google.protobuf.WireFormat$FieldType;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkRequestMetric extends GeneratedMessageLite<NetworkRequestMetric, a> implements K {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final NetworkRequestMetric DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile S<NetworkRequestMetric> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private long requestPayloadBytes_;
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private MapFieldLite<String, String> customAttributes_ = MapFieldLite.f29077b;
    private String url_ = "";
    private String responseContentType_ = "";
    private C2078u.d<h> perfSessions_ = V.f29091e;

    public enum HttpMethod implements C2078u.a {
        HTTP_METHOD_UNKNOWN(0),
        GET(1),
        PUT(2),
        POST(3),
        DELETE(4),
        HEAD(5),
        PATCH(6),
        OPTIONS(7),
        TRACE(8),
        CONNECT(9);

        private final int value;

        public static final class a implements C2078u.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f28526a = new a();

            @Override // com.google.protobuf.C2078u.b
            public final boolean a(int i10) {
                return HttpMethod.b(i10) != null;
            }
        }

        HttpMethod(int i10) {
            this.value = i10;
        }

        public static HttpMethod b(int i10) {
            switch (i10) {
                case 0:
                    return HTTP_METHOD_UNKNOWN;
                case 1:
                    return GET;
                case 2:
                    return PUT;
                case 3:
                    return POST;
                case 4:
                    return DELETE;
                case 5:
                    return HEAD;
                case 6:
                    return PATCH;
                case 7:
                    return OPTIONS;
                case 8:
                    return TRACE;
                case 9:
                    return CONNECT;
                default:
                    return null;
            }
        }

        @Override // com.google.protobuf.C2078u.a
        public final int a() {
            return this.value;
        }
    }

    public enum NetworkClientErrorReason implements C2078u.a {
        NETWORK_CLIENT_ERROR_REASON_UNKNOWN(0),
        GENERIC_CLIENT_ERROR(1);

        private final int value;

        public static final class a implements C2078u.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f28530a = new a();

            @Override // com.google.protobuf.C2078u.b
            public final boolean a(int i10) {
                NetworkClientErrorReason networkClientErrorReason;
                if (i10 != 0) {
                    networkClientErrorReason = i10 != 1 ? null : NetworkClientErrorReason.GENERIC_CLIENT_ERROR;
                } else {
                    networkClientErrorReason = NetworkClientErrorReason.NETWORK_CLIENT_ERROR_REASON_UNKNOWN;
                }
                return networkClientErrorReason != null;
            }
        }

        NetworkClientErrorReason(int i10) {
            this.value = i10;
        }

        @Override // com.google.protobuf.C2078u.a
        public final int a() {
            return this.value;
        }
    }

    public static final class a extends GeneratedMessageLite.a<NetworkRequestMetric, a> implements K {
        public a() {
            super(NetworkRequestMetric.DEFAULT_INSTANCE);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final D<String, String> f28531a;

        static {
            WireFormat$FieldType wireFormat$FieldType = WireFormat$FieldType.f29099c;
            f28531a = new D<>(wireFormat$FieldType, wireFormat$FieldType, "");
        }
    }

    static {
        NetworkRequestMetric networkRequestMetric = new NetworkRequestMetric();
        DEFAULT_INSTANCE = networkRequestMetric;
        GeneratedMessageLite.F(NetworkRequestMetric.class, networkRequestMetric);
    }

    public static void H(NetworkRequestMetric networkRequestMetric, String str) {
        networkRequestMetric.getClass();
        str.getClass();
        networkRequestMetric.bitField0_ |= 1;
        networkRequestMetric.url_ = str;
    }

    public static void I(NetworkRequestMetric networkRequestMetric) {
        NetworkClientErrorReason networkClientErrorReason = NetworkClientErrorReason.GENERIC_CLIENT_ERROR;
        networkRequestMetric.getClass();
        networkRequestMetric.networkClientErrorReason_ = networkClientErrorReason.a();
        networkRequestMetric.bitField0_ |= 16;
    }

    public static void J(NetworkRequestMetric networkRequestMetric, int i10) {
        networkRequestMetric.bitField0_ |= 32;
        networkRequestMetric.httpResponseCode_ = i10;
    }

    public static void K(NetworkRequestMetric networkRequestMetric, String str) {
        networkRequestMetric.getClass();
        str.getClass();
        networkRequestMetric.bitField0_ |= 64;
        networkRequestMetric.responseContentType_ = str;
    }

    public static void L(NetworkRequestMetric networkRequestMetric) {
        networkRequestMetric.bitField0_ &= -65;
        networkRequestMetric.responseContentType_ = DEFAULT_INSTANCE.responseContentType_;
    }

    public static void M(NetworkRequestMetric networkRequestMetric, long j) {
        networkRequestMetric.bitField0_ |= 128;
        networkRequestMetric.clientStartTimeUs_ = j;
    }

    public static void N(NetworkRequestMetric networkRequestMetric, long j) {
        networkRequestMetric.bitField0_ |= 256;
        networkRequestMetric.timeToRequestCompletedUs_ = j;
    }

    public static void O(NetworkRequestMetric networkRequestMetric, long j) {
        networkRequestMetric.bitField0_ |= 512;
        networkRequestMetric.timeToResponseInitiatedUs_ = j;
    }

    public static void P(NetworkRequestMetric networkRequestMetric, long j) {
        networkRequestMetric.bitField0_ |= 1024;
        networkRequestMetric.timeToResponseCompletedUs_ = j;
    }

    public static void Q(NetworkRequestMetric networkRequestMetric, List list) {
        C2078u.d<h> dVar = networkRequestMetric.perfSessions_;
        if (!dVar.n()) {
            networkRequestMetric.perfSessions_ = GeneratedMessageLite.D(dVar);
        }
        AbstractC2059a.k(list, networkRequestMetric.perfSessions_);
    }

    public static void R(NetworkRequestMetric networkRequestMetric, HttpMethod httpMethod) {
        networkRequestMetric.getClass();
        networkRequestMetric.httpMethod_ = httpMethod.a();
        networkRequestMetric.bitField0_ |= 2;
    }

    public static void S(NetworkRequestMetric networkRequestMetric, long j) {
        networkRequestMetric.bitField0_ |= 4;
        networkRequestMetric.requestPayloadBytes_ = j;
    }

    public static void T(NetworkRequestMetric networkRequestMetric, long j) {
        networkRequestMetric.bitField0_ |= 8;
        networkRequestMetric.responsePayloadBytes_ = j;
    }

    public static NetworkRequestMetric V() {
        return DEFAULT_INSTANCE;
    }

    public static a n0() {
        return DEFAULT_INSTANCE.v();
    }

    public final long U() {
        return this.clientStartTimeUs_;
    }

    public final HttpMethod W() {
        HttpMethod httpMethodB = HttpMethod.b(this.httpMethod_);
        return httpMethodB == null ? HttpMethod.HTTP_METHOD_UNKNOWN : httpMethodB;
    }

    public final int X() {
        return this.httpResponseCode_;
    }

    public final C2078u.d Y() {
        return this.perfSessions_;
    }

    public final long Z() {
        return this.requestPayloadBytes_;
    }

    public final long a0() {
        return this.responsePayloadBytes_;
    }

    public final long b0() {
        return this.timeToRequestCompletedUs_;
    }

    public final long c0() {
        return this.timeToResponseCompletedUs_;
    }

    public final long d0() {
        return this.timeToResponseInitiatedUs_;
    }

    public final String e0() {
        return this.url_;
    }

    public final boolean f0() {
        return (this.bitField0_ & 128) != 0;
    }

    public final boolean g0() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean h0() {
        return (this.bitField0_ & 32) != 0;
    }

    public final boolean i0() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean j0() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean k0() {
        return (this.bitField0_ & 256) != 0;
    }

    public final boolean l0() {
        return (this.bitField0_ & 1024) != 0;
    }

    public final boolean m0() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object w(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new W(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000bဌ\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", HttpMethod.a.f28526a, "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", NetworkClientErrorReason.a.f28530a, "customAttributes_", b.f28531a, "perfSessions_", h.class});
            case 3:
                return new NetworkRequestMetric();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                S<NetworkRequestMetric> bVar = PARSER;
                if (bVar == null) {
                    synchronized (NetworkRequestMetric.class) {
                        try {
                            bVar = PARSER;
                            if (bVar == null) {
                                bVar = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                                PARSER = bVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return bVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
