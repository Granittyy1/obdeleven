package io.grpc.internal;

import io.grpc.MethodDescriptor;
import io.grpc.Status;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: io.grpc.internal.o0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ManagedChannelServiceConfig.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2237o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f37645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, a> f37646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, a> f37647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B0.x f37648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f37649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<String, ?> f37650f;

    /* JADX INFO: renamed from: io.grpc.internal.o0$a */
    /* JADX INFO: compiled from: ManagedChannelServiceConfig.java */
    public static final class a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final io.grpc.b.C0388b<a> f37651g = new io.grpc.b.C0388b<>("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo", null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Long f37652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Boolean f37653b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Integer f37654c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Integer f37655d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final F0 f37656e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final O f37657f;

        public a(Map<String, ?> map, boolean z10, int i10, int i11) {
            F0 f10;
            O o10;
            this.f37652a = C2217e0.i("timeout", map);
            this.f37653b = C2217e0.b("waitForReady", map);
            Integer numF = C2217e0.f("maxResponseMessageBytes", map);
            this.f37654c = numF;
            if (numF != null) {
                A8.p.e(numF, "maxInboundMessageSize %s exceeds bounds", numF.intValue() >= 0);
            }
            Integer numF2 = C2217e0.f("maxRequestMessageBytes", map);
            this.f37655d = numF2;
            if (numF2 != null) {
                A8.p.e(numF2, "maxOutboundMessageSize %s exceeds bounds", numF2.intValue() >= 0);
            }
            Map mapG = z10 ? C2217e0.g("retryPolicy", map) : null;
            if (mapG == null) {
                f10 = null;
            } else {
                Integer numF3 = C2217e0.f("maxAttempts", mapG);
                A8.p.j(numF3, "maxAttempts cannot be empty");
                int iIntValue = numF3.intValue();
                A8.p.c(iIntValue, "maxAttempts must be greater than 1: %s", iIntValue >= 2);
                int iMin = Math.min(iIntValue, i10);
                Long lI = C2217e0.i("initialBackoff", mapG);
                A8.p.j(lI, "initialBackoff cannot be empty");
                long jLongValue = lI.longValue();
                A8.p.d(jLongValue, "initialBackoffNanos must be greater than 0: %s", jLongValue > 0);
                Long lI2 = C2217e0.i("maxBackoff", mapG);
                A8.p.j(lI2, "maxBackoff cannot be empty");
                long jLongValue2 = lI2.longValue();
                A8.p.d(jLongValue2, "maxBackoff must be greater than 0: %s", jLongValue2 > 0);
                Double dE = C2217e0.e("backoffMultiplier", mapG);
                A8.p.j(dE, "backoffMultiplier cannot be empty");
                double dDoubleValue = dE.doubleValue();
                A8.p.e(dE, "backoffMultiplier must be greater than 0: %s", dDoubleValue > 0.0d);
                Long lI3 = C2217e0.i("perAttemptRecvTimeout", mapG);
                A8.p.e(lI3, "perAttemptRecvTimeout cannot be negative: %s", lI3 == null || lI3.longValue() >= 0);
                Set setA = K0.a("retryableStatusCodes", mapG);
                I2.e.s("retryableStatusCodes", "%s is required in retry policy", setA != null);
                I2.e.s("retryableStatusCodes", "%s must not contain OK", !setA.contains(Status.Code.OK));
                A8.p.f("retryableStatusCodes cannot be empty without perAttemptRecvTimeout", (lI3 == null && setA.isEmpty()) ? false : true);
                f10 = new F0(iMin, jLongValue, jLongValue2, dDoubleValue, lI3, setA);
            }
            this.f37656e = f10;
            Map mapG2 = z10 ? C2217e0.g("hedgingPolicy", map) : null;
            if (mapG2 == null) {
                o10 = null;
            } else {
                Integer numF4 = C2217e0.f("maxAttempts", mapG2);
                A8.p.j(numF4, "maxAttempts cannot be empty");
                int iIntValue2 = numF4.intValue();
                A8.p.c(iIntValue2, "maxAttempts must be greater than 1: %s", iIntValue2 >= 2);
                int iMin2 = Math.min(iIntValue2, i11);
                Long lI4 = C2217e0.i("hedgingDelay", mapG2);
                A8.p.j(lI4, "hedgingDelay cannot be empty");
                long jLongValue3 = lI4.longValue();
                A8.p.d(jLongValue3, "hedgingDelay must not be negative: %s", jLongValue3 >= 0);
                Set setA2 = K0.a("nonFatalStatusCodes", mapG2);
                if (setA2 == null) {
                    setA2 = Collections.unmodifiableSet(EnumSet.noneOf(Status.Code.class));
                } else {
                    I2.e.s("nonFatalStatusCodes", "%s must not contain OK", !setA2.contains(Status.Code.OK));
                }
                o10 = new O(iMin2, jLongValue3, setA2);
            }
            this.f37657f = o10;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlinx.coroutines.C.j(this.f37652a, aVar.f37652a) && kotlinx.coroutines.C.j(this.f37653b, aVar.f37653b) && kotlinx.coroutines.C.j(this.f37654c, aVar.f37654c) && kotlinx.coroutines.C.j(this.f37655d, aVar.f37655d) && kotlinx.coroutines.C.j(this.f37656e, aVar.f37656e) && kotlinx.coroutines.C.j(this.f37657f, aVar.f37657f);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f37652a, this.f37653b, this.f37654c, this.f37655d, this.f37656e, this.f37657f});
        }

        public final String toString() {
            com.google.common.base.d.a aVarB = com.google.common.base.d.b(this);
            aVarB.c(this.f37652a, "timeoutNanos");
            aVarB.c(this.f37653b, "waitForReady");
            aVarB.c(this.f37654c, "maxInboundMessageSize");
            aVarB.c(this.f37655d, "maxOutboundMessageSize");
            aVarB.c(this.f37656e, "retryPolicy");
            aVarB.c(this.f37657f, "hedgingPolicy");
            return aVarB.toString();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.o0$b */
    /* JADX INFO: compiled from: ManagedChannelServiceConfig.java */
    public static final class b extends io.grpc.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C2237o0 f37658b;

        public b(C2237o0 c2237o0) {
            this.f37658b = c2237o0;
        }

        @Override // io.grpc.f
        public final io.grpc.f.a a() {
            C2237o0 c2237o0 = this.f37658b;
            A8.p.j(c2237o0, "config");
            List<Status> list = Status.f36898d;
            return new io.grpc.f.a(c2237o0);
        }
    }

    public C2237o0(a aVar, HashMap map, HashMap map2, B0.x xVar, Object obj, Map map3) {
        this.f37645a = aVar;
        this.f37646b = C4.b.h(map);
        this.f37647c = C4.b.h(map2);
        this.f37648d = xVar;
        this.f37649e = obj;
        this.f37650f = map3 != null ? Collections.unmodifiableMap(new HashMap(map3)) : null;
    }

    public static C2237o0 a(Map<String, ?> map, boolean z10, int i10, int i11, Object obj) {
        B0.x xVar;
        Map mapG;
        B0.x xVar2;
        if (z10) {
            if (map == null || (mapG = C2217e0.g("retryThrottling", map)) == null) {
                xVar2 = null;
            } else {
                float fFloatValue = C2217e0.e("maxTokens", mapG).floatValue();
                float fFloatValue2 = C2217e0.e("tokenRatio", mapG).floatValue();
                A8.p.p("maxToken should be greater than zero", fFloatValue > 0.0f);
                A8.p.p("tokenRatio should be greater than zero", fFloatValue2 > 0.0f);
                xVar2 = new B0.x(fFloatValue, fFloatValue2);
            }
            xVar = xVar2;
        } else {
            xVar = null;
        }
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        Map mapG2 = map == null ? null : C2217e0.g("healthCheckConfig", map);
        List<Map> listC = C2217e0.c("methodConfig", map);
        if (listC == null) {
            listC = null;
        } else {
            C2217e0.a(listC);
        }
        if (listC == null) {
            return new C2237o0(null, map2, map3, xVar, obj, mapG2);
        }
        a aVar = null;
        for (Map map4 : listC) {
            a aVar2 = new a(map4, z10, i10, i11);
            List<Map> listC2 = C2217e0.c("name", map4);
            if (listC2 == null) {
                listC2 = null;
            } else {
                C2217e0.a(listC2);
            }
            if (listC2 != null && !listC2.isEmpty()) {
                for (Map map5 : listC2) {
                    String strH = C2217e0.h("service", map5);
                    String strH2 = C2217e0.h("method", map5);
                    if (Cb.a.m(strH)) {
                        A8.p.e(strH2, "missing service name for method %s", Cb.a.m(strH2));
                        A8.p.e(map, "Duplicate default method config in service config %s", aVar == null);
                        aVar = aVar2;
                    } else if (Cb.a.m(strH2)) {
                        A8.p.e(strH, "Duplicate service %s", !map3.containsKey(strH));
                        map3.put(strH, aVar2);
                    } else {
                        String strA = MethodDescriptor.a(strH, strH2);
                        A8.p.e(strA, "Duplicate method name %s", !map2.containsKey(strA));
                        map2.put(strA, aVar2);
                    }
                }
            }
        }
        return new C2237o0(aVar, map2, map3, xVar, obj, mapG2);
    }

    public final b b() {
        if (this.f37647c.isEmpty() && this.f37646b.isEmpty() && this.f37645a == null) {
            return null;
        }
        return new b(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2237o0.class != obj.getClass()) {
            return false;
        }
        C2237o0 c2237o0 = (C2237o0) obj;
        return kotlinx.coroutines.C.j(this.f37645a, c2237o0.f37645a) && kotlinx.coroutines.C.j(this.f37646b, c2237o0.f37646b) && kotlinx.coroutines.C.j(this.f37647c, c2237o0.f37647c) && kotlinx.coroutines.C.j(this.f37648d, c2237o0.f37648d) && kotlinx.coroutines.C.j(this.f37649e, c2237o0.f37649e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f37645a, this.f37646b, this.f37647c, this.f37648d, this.f37649e});
    }

    public final String toString() {
        com.google.common.base.d.a aVarB = com.google.common.base.d.b(this);
        aVarB.c(this.f37645a, "defaultMethodConfig");
        aVarB.c(this.f37646b, "serviceMethodMap");
        aVarB.c(this.f37647c, "serviceMap");
        aVarB.c(this.f37648d, "retryThrottling");
        aVarB.c(this.f37649e, "loadBalancingConfig");
        return aVarB.toString();
    }
}
