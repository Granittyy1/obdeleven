package com.google.firebase.perf.v1;

import com.google.protobuf.C2078u;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.K;
import com.google.protobuf.S;
import com.google.protobuf.V;
import com.google.protobuf.W;

/* JADX INFO: compiled from: GaugeMetric.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends GeneratedMessageLite<f, a> implements K {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final f DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile S<f> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private C2078u.d<b> androidMemoryReadings_;
    private int bitField0_;
    private C2078u.d<d> cpuMetricReadings_;
    private e gaugeMetadata_;
    private String sessionId_ = "";

    /* JADX INFO: compiled from: GaugeMetric.java */
    public static final class a extends GeneratedMessageLite.a<f, a> implements K {
        public a() {
            super(f.DEFAULT_INSTANCE);
        }
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        GeneratedMessageLite.F(f.class, fVar);
    }

    public f() {
        V<Object> v10 = V.f29091e;
        this.cpuMetricReadings_ = v10;
        this.androidMemoryReadings_ = v10;
    }

    public static void H(f fVar, String str) {
        fVar.getClass();
        str.getClass();
        fVar.bitField0_ |= 1;
        fVar.sessionId_ = str;
    }

    public static void I(f fVar, b bVar) {
        fVar.getClass();
        bVar.getClass();
        C2078u.d<b> dVar = fVar.androidMemoryReadings_;
        if (!dVar.n()) {
            fVar.androidMemoryReadings_ = GeneratedMessageLite.D(dVar);
        }
        fVar.androidMemoryReadings_.add(bVar);
    }

    public static void J(f fVar, e eVar) {
        fVar.getClass();
        eVar.getClass();
        fVar.gaugeMetadata_ = eVar;
        fVar.bitField0_ |= 2;
    }

    public static void K(f fVar, d dVar) {
        fVar.getClass();
        dVar.getClass();
        C2078u.d<d> dVar2 = fVar.cpuMetricReadings_;
        if (!dVar2.n()) {
            fVar.cpuMetricReadings_ = GeneratedMessageLite.D(dVar2);
        }
        fVar.cpuMetricReadings_.add(dVar);
    }

    public static f N() {
        return DEFAULT_INSTANCE;
    }

    public static a R() {
        return DEFAULT_INSTANCE.v();
    }

    public final int L() {
        return this.androidMemoryReadings_.size();
    }

    public final int M() {
        return this.cpuMetricReadings_.size();
    }

    public final e O() {
        e eVar = this.gaugeMetadata_;
        return eVar == null ? e.K() : eVar;
    }

    public final boolean P() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean Q() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object w(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new W(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", d.class, "gaugeMetadata_", "androidMemoryReadings_", b.class});
            case 3:
                return new f();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                S<f> bVar = PARSER;
                if (bVar == null) {
                    synchronized (f.class) {
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
