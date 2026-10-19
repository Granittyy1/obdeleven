package io.grpc.internal;

import com.google.common.collect.ImmutableSet;
import io.grpc.Status;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: compiled from: HedgingPolicy.java */
/* JADX INFO: loaded from: classes3.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f37427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImmutableSet f37428c;

    public O(int i10, long j, Set<Status.Code> set) {
        this.f37426a = i10;
        this.f37427b = j;
        this.f37428c = ImmutableSet.C(set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || O.class != obj.getClass()) {
            return false;
        }
        O o10 = (O) obj;
        return this.f37426a == o10.f37426a && this.f37427b == o10.f37427b && kotlinx.coroutines.C.j(this.f37428c, o10.f37428c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f37426a), Long.valueOf(this.f37427b), this.f37428c});
    }

    public final String toString() {
        com.google.common.base.d.a aVarB = com.google.common.base.d.b(this);
        aVarB.a(this.f37426a, "maxAttempts");
        aVarB.b(this.f37427b, "hedgingDelayNanos");
        aVarB.c(this.f37428c, "nonFatalStatusCodes");
        return aVarB.toString();
    }
}
