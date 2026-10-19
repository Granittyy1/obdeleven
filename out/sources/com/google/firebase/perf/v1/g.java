package com.google.firebase.perf.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.S;
import com.google.protobuf.W;

/* JADX INFO: compiled from: PerfMetric.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends GeneratedMessageLite<g, a> implements A7.a {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    private static final g DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile S<g> PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private c applicationInfo_;
    private int bitField0_;
    private f gaugeMetric_;
    private NetworkRequestMetric networkRequestMetric_;
    private i traceMetric_;
    private TransportInfo transportInfo_;

    /* JADX INFO: compiled from: PerfMetric.java */
    public static final class a extends GeneratedMessageLite.a<g, a> implements A7.a {
        public a() {
            super(g.DEFAULT_INSTANCE);
        }

        @Override // A7.a
        public final boolean e() {
            return ((g) this.f29047c).e();
        }

        @Override // A7.a
        public final boolean h() {
            return ((g) this.f29047c).h();
        }

        @Override // A7.a
        public final i i() {
            return ((g) this.f29047c).i();
        }

        @Override // A7.a
        public final boolean j() {
            return ((g) this.f29047c).j();
        }

        @Override // A7.a
        public final NetworkRequestMetric l() {
            return ((g) this.f29047c).l();
        }

        @Override // A7.a
        public final f m() {
            return ((g) this.f29047c).m();
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        GeneratedMessageLite.F(g.class, gVar);
    }

    public static void H(g gVar, c cVar) {
        gVar.getClass();
        gVar.applicationInfo_ = cVar;
        gVar.bitField0_ |= 1;
    }

    public static void I(g gVar, f fVar) {
        gVar.getClass();
        gVar.gaugeMetric_ = fVar;
        gVar.bitField0_ |= 8;
    }

    public static void J(g gVar, i iVar) {
        gVar.getClass();
        gVar.traceMetric_ = iVar;
        gVar.bitField0_ |= 2;
    }

    public static void K(g gVar, NetworkRequestMetric networkRequestMetric) {
        gVar.getClass();
        gVar.networkRequestMetric_ = networkRequestMetric;
        gVar.bitField0_ |= 4;
    }

    public static a N() {
        return DEFAULT_INSTANCE.v();
    }

    public final c L() {
        c cVar = this.applicationInfo_;
        return cVar == null ? c.N() : cVar;
    }

    public final boolean M() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // A7.a
    public final boolean e() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // A7.a
    public final boolean h() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // A7.a
    public final i i() {
        i iVar = this.traceMetric_;
        return iVar == null ? i.U() : iVar;
    }

    @Override // A7.a
    public final boolean j() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // A7.a
    public final NetworkRequestMetric l() {
        NetworkRequestMetric networkRequestMetric = this.networkRequestMetric_;
        return networkRequestMetric == null ? NetworkRequestMetric.V() : networkRequestMetric;
    }

    @Override // A7.a
    public final f m() {
        f fVar = this.gaugeMetric_;
        return fVar == null ? f.N() : fVar;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object w(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new W(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            case 3:
                return new g();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                S<g> bVar = PARSER;
                if (bVar == null) {
                    synchronized (g.class) {
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
