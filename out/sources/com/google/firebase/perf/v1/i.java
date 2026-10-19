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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: TraceMetric.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends GeneratedMessageLite<i, a> implements K {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final i DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile S<i> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private MapFieldLite<String, Long> counters_;
    private MapFieldLite<String, String> customAttributes_;
    private long durationUs_;
    private boolean isAuto_;
    private String name_;
    private C2078u.d<h> perfSessions_;
    private C2078u.d<i> subtraces_;

    /* JADX INFO: compiled from: TraceMetric.java */
    public static final class a extends GeneratedMessageLite.a<i, a> implements K {
        public a() {
            super(i.DEFAULT_INSTANCE);
        }

        public final void u(i iVar) {
            r();
            i.J((i) this.f29047c, iVar);
        }

        public final void v(long j, String str) {
            str.getClass();
            r();
            i.I((i) this.f29047c).put(str, Long.valueOf(j));
        }

        public final void w(long j) {
            r();
            i.O((i) this.f29047c, j);
        }

        public final void x(long j) {
            r();
            i.P((i) this.f29047c, j);
        }

        public final void y(String str) {
            r();
            i.H((i) this.f29047c, str);
        }
    }

    /* JADX INFO: compiled from: TraceMetric.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final D<String, Long> f28541a = new D<>(WireFormat$FieldType.f29099c, WireFormat$FieldType.f29098b, 0L);
    }

    /* JADX INFO: compiled from: TraceMetric.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final D<String, String> f28542a;

        static {
            WireFormat$FieldType wireFormat$FieldType = WireFormat$FieldType.f29099c;
            f28542a = new D<>(wireFormat$FieldType, wireFormat$FieldType, "");
        }
    }

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        GeneratedMessageLite.F(i.class, iVar);
    }

    public i() {
        MapFieldLite mapFieldLite = MapFieldLite.f29077b;
        this.counters_ = mapFieldLite;
        this.customAttributes_ = mapFieldLite;
        this.name_ = "";
        V<Object> v10 = V.f29091e;
        this.subtraces_ = v10;
        this.perfSessions_ = v10;
    }

    public static void H(i iVar, String str) {
        iVar.getClass();
        str.getClass();
        iVar.bitField0_ |= 1;
        iVar.name_ = str;
    }

    public static MapFieldLite I(i iVar) {
        if (!iVar.counters_.c()) {
            iVar.counters_ = iVar.counters_.f();
        }
        return iVar.counters_;
    }

    public static void J(i iVar, i iVar2) {
        iVar.getClass();
        iVar2.getClass();
        C2078u.d<i> dVar = iVar.subtraces_;
        if (!dVar.n()) {
            iVar.subtraces_ = GeneratedMessageLite.D(dVar);
        }
        iVar.subtraces_.add(iVar2);
    }

    public static void K(i iVar, ArrayList arrayList) {
        C2078u.d<i> dVar = iVar.subtraces_;
        if (!dVar.n()) {
            iVar.subtraces_ = GeneratedMessageLite.D(dVar);
        }
        AbstractC2059a.k(arrayList, iVar.subtraces_);
    }

    public static MapFieldLite L(i iVar) {
        if (!iVar.customAttributes_.c()) {
            iVar.customAttributes_ = iVar.customAttributes_.f();
        }
        return iVar.customAttributes_;
    }

    public static void M(i iVar, h hVar) {
        iVar.getClass();
        C2078u.d<h> dVar = iVar.perfSessions_;
        if (!dVar.n()) {
            iVar.perfSessions_ = GeneratedMessageLite.D(dVar);
        }
        iVar.perfSessions_.add(hVar);
    }

    public static void N(i iVar, List list) {
        C2078u.d<h> dVar = iVar.perfSessions_;
        if (!dVar.n()) {
            iVar.perfSessions_ = GeneratedMessageLite.D(dVar);
        }
        AbstractC2059a.k(list, iVar.perfSessions_);
    }

    public static void O(i iVar, long j) {
        iVar.bitField0_ |= 4;
        iVar.clientStartTimeUs_ = j;
    }

    public static void P(i iVar, long j) {
        iVar.bitField0_ |= 8;
        iVar.durationUs_ = j;
    }

    public static i U() {
        return DEFAULT_INSTANCE;
    }

    public static a a0() {
        return DEFAULT_INSTANCE.v();
    }

    public final boolean Q() {
        return this.customAttributes_.containsKey("Hosting_activity");
    }

    public final int R() {
        return this.counters_.size();
    }

    public final Map<String, Long> S() {
        return Collections.unmodifiableMap(this.counters_);
    }

    public final Map<String, String> T() {
        return Collections.unmodifiableMap(this.customAttributes_);
    }

    public final long V() {
        return this.durationUs_;
    }

    public final String W() {
        return this.name_;
    }

    public final C2078u.d X() {
        return this.perfSessions_;
    }

    public final C2078u.d Y() {
        return this.subtraces_;
    }

    public final boolean Z() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object w(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new W(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", b.f28541a, "subtraces_", i.class, "customAttributes_", c.f28542a, "perfSessions_", h.class});
            case 3:
                return new i();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                S<i> bVar = PARSER;
                if (bVar == null) {
                    synchronized (i.class) {
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
