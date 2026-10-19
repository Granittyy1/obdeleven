package J9;

import A8.p;
import io.grpc.Status;
import io.grpc.internal.C2217e0;
import io.grpc.internal.K0;
import io.grpc.k;
import io.grpc.n;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: OutlierDetectionLoadBalancerProvider.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends io.grpc.j {
    public static n.b f(Map map) {
        g.f.b bVar;
        g.f.a aVar;
        List list;
        Integer num;
        Integer num2;
        Long lI = C2217e0.i("interval", map);
        Long lI2 = C2217e0.i("baseEjectionTime", map);
        Long lI3 = C2217e0.i("maxEjectionTime", map);
        Integer numF = C2217e0.f("maxEjectionPercentage", map);
        Long l10 = lI != null ? lI : 10000000000L;
        Long l11 = lI2 != null ? lI2 : 30000000000L;
        Long l12 = lI3 != null ? lI3 : 300000000000L;
        Integer num3 = numF != null ? numF : 10;
        Map mapG = C2217e0.g("successRateEjection", map);
        if (mapG != null) {
            Integer num4 = 100;
            Integer numF2 = C2217e0.f("stdevFactor", mapG);
            Integer numF3 = C2217e0.f("enforcementPercentage", mapG);
            Integer numF4 = C2217e0.f("minimumHosts", mapG);
            Integer numF5 = C2217e0.f("requestVolume", mapG);
            Integer num5 = numF2 != null ? numF2 : 1900;
            if (numF3 != null) {
                p.g(numF3.intValue() >= 0 && numF3.intValue() <= 100);
                num = numF3;
            } else {
                num = num4;
            }
            if (numF4 != null) {
                p.g(numF4.intValue() >= 0);
                num2 = numF4;
            } else {
                num2 = 5;
            }
            if (numF5 != null) {
                p.g(numF5.intValue() >= 0);
                num4 = numF5;
            }
            bVar = new g.f.b(num5, num, num2, num4);
        } else {
            bVar = null;
        }
        Map mapG2 = C2217e0.g("failurePercentageEjection", map);
        if (mapG2 != null) {
            Integer num6 = 85;
            Integer num7 = 100;
            Integer num8 = 5;
            Integer num9 = 50;
            Integer numF6 = C2217e0.f("threshold", mapG2);
            Integer numF7 = C2217e0.f("enforcementPercentage", mapG2);
            Integer numF8 = C2217e0.f("minimumHosts", mapG2);
            Integer numF9 = C2217e0.f("requestVolume", mapG2);
            if (numF6 != null) {
                p.g(numF6.intValue() >= 0 && numF6.intValue() <= 100);
                num6 = numF6;
            }
            if (numF7 != null) {
                p.g(numF7.intValue() >= 0 && numF7.intValue() <= 100);
                num7 = numF7;
            }
            if (numF8 != null) {
                p.g(numF8.intValue() >= 0);
                num8 = numF8;
            }
            if (numF9 != null) {
                p.g(numF9.intValue() >= 0);
                num9 = numF9;
            }
            aVar = new g.f.a(num6, num7, num8, num9);
        } else {
            aVar = null;
        }
        List listC = C2217e0.c("childPolicy", map);
        if (listC == null) {
            list = null;
        } else {
            C2217e0.a(listC);
            list = listC;
        }
        List<K0.a> listD = K0.d(list);
        if (listD == null || listD.isEmpty()) {
            return new n.b(Status.f36904k.h("No child policy in outlier_detection_experimental LB policy: " + map));
        }
        n.b bVarC = K0.c(listD, k.a());
        if (bVarC.f37798a != null) {
            return bVarC;
        }
        K0.b bVar2 = (K0.b) bVarC.f37799b;
        p.q(bVar2 != null);
        p.q(bVar2 != null);
        return new n.b(new g.f(l10, l11, l12, num3, bVar, aVar, bVar2));
    }

    @Override // io.grpc.i.b
    public final io.grpc.i a(io.grpc.i.c cVar) {
        return new g(cVar);
    }

    @Override // io.grpc.j
    public String b() {
        return "outlier_detection_experimental";
    }

    @Override // io.grpc.j
    public int c() {
        return 5;
    }

    @Override // io.grpc.j
    public boolean d() {
        return true;
    }

    @Override // io.grpc.j
    public n.b e(Map<String, ?> map) {
        try {
            return f(map);
        } catch (RuntimeException e10) {
            return new n.b(Status.f36905l.g(e10).h("Failed parsing configuration for " + b()));
        }
    }
}
