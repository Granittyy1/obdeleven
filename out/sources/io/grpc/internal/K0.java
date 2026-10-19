package io.grpc.internal;

import com.google.common.base.VerifyException;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: ServiceConfigUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public final class K0 {

    /* JADX INFO: compiled from: ServiceConfigUtil.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f37240a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<String, ?> f37241b;

        public a(String str, Map<String, ?> map) {
            A8.p.j(str, "policyName");
            this.f37240a = str;
            A8.p.j(map, "rawConfigValue");
            this.f37241b = map;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f37240a.equals(aVar.f37240a) && this.f37241b.equals(aVar.f37241b);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f37240a, this.f37241b});
        }

        public final String toString() {
            com.google.common.base.d.a aVarB = com.google.common.base.d.b(this);
            aVarB.c(this.f37240a, "policyName");
            aVarB.c(this.f37241b, "rawConfigValue");
            return aVarB.toString();
        }
    }

    /* JADX INFO: compiled from: ServiceConfigUtil.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final io.grpc.j f37242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f37243b;

        public b(io.grpc.j jVar, Object obj) {
            this.f37242a = jVar;
            this.f37243b = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return kotlinx.coroutines.C.j(this.f37242a, bVar.f37242a) && kotlinx.coroutines.C.j(this.f37243b, bVar.f37243b);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f37242a, this.f37243b});
        }

        public final String toString() {
            com.google.common.base.d.a aVarB = com.google.common.base.d.b(this);
            aVarB.c(this.f37242a, "provider");
            aVarB.c(this.f37243b, "config");
            return aVarB.toString();
        }
    }

    public static Set a(String str, Map map) {
        Status.Code codeValueOf;
        List listC = C2217e0.c(str, map);
        if (listC == null) {
            return null;
        }
        EnumSet enumSetNoneOf = EnumSet.noneOf(Status.Code.class);
        for (Object obj : listC) {
            if (obj instanceof Double) {
                Double d10 = (Double) obj;
                int iIntValue = d10.intValue();
                I2.e.s(obj, "Status code %s is not integral", ((double) iIntValue) == d10.doubleValue());
                codeValueOf = Status.d(iIntValue).f36908a;
                I2.e.s(obj, "Status code %s is not valid", codeValueOf.c() == d10.intValue());
            } else {
                if (!(obj instanceof String)) {
                    throw new VerifyException("Can not convert status code " + obj + " to Status.Code, because its type is " + obj.getClass());
                }
                try {
                    codeValueOf = Status.Code.valueOf((String) obj);
                } catch (IllegalArgumentException e10) {
                    throw new VerifyException("Status code " + obj + " is not valid", e10);
                }
            }
            enumSetNoneOf.add(codeValueOf);
        }
        return Collections.unmodifiableSet(enumSetNoneOf);
    }

    public static List<Map<String, ?>> b(Map<String, ?> map) {
        String strH;
        ArrayList arrayList = new ArrayList();
        if (map.containsKey("loadBalancingConfig")) {
            List listC = C2217e0.c("loadBalancingConfig", map);
            if (listC == null) {
                listC = null;
            } else {
                C2217e0.a(listC);
            }
            arrayList.addAll(listC);
        }
        if (arrayList.isEmpty() && (strH = C2217e0.h("loadBalancingPolicy", map)) != null) {
            arrayList.add(Collections.singletonMap(strH.toLowerCase(Locale.ROOT), Collections.emptyMap()));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static io.grpc.n.b c(List<a> list, io.grpc.k kVar) {
        ArrayList arrayList = new ArrayList();
        for (a aVar : list) {
            String str = aVar.f37240a;
            io.grpc.j jVarB = kVar.b(str);
            if (jVarB != null) {
                if (!arrayList.isEmpty()) {
                    Logger.getLogger(K0.class.getName()).log(Level.FINEST, "{0} specified by Service Config are not available", arrayList);
                }
                io.grpc.n.b bVarE = jVarB.e(aVar.f37241b);
                return bVarE.f37798a != null ? bVarE : new io.grpc.n.b(new b(jVarB, bVarE.f37799b));
            }
            arrayList.add(str);
        }
        return new io.grpc.n.b(Status.f36901g.h("None of " + arrayList + " specified by Service Config are available."));
    }

    public static List<a> d(List<Map<String, ?>> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map<String, ?> map : list) {
            if (map.size() != 1) {
                throw new RuntimeException("There are " + map.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + map);
            }
            String key = map.entrySet().iterator().next().getKey();
            arrayList.add(new a(key, C2217e0.g(key, map)));
        }
        return Collections.unmodifiableList(arrayList);
    }
}
