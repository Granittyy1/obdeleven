package io.grpc;

import java.util.Map;

/* JADX INFO: compiled from: LoadBalancerProvider.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j extends i.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n.b f37774a = new n.b(new a());

    /* JADX INFO: compiled from: LoadBalancerProvider.java */
    public static final class a {
        public final String toString() {
            return "service config is unused";
        }
    }

    public abstract String b();

    public abstract int c();

    public abstract boolean d();

    public n.b e(Map<String, ?> map) {
        return f37774a;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final String toString() {
        com.google.common.base.d.a aVarB = com.google.common.base.d.b(this);
        aVarB.c(b(), "policy");
        aVarB.a(c(), "priority");
        aVarB.d("available", d());
        return aVarB.toString();
    }
}
