package io.grpc.internal;

import com.google.common.collect.ImmutableSet;
import io.grpc.Status;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: compiled from: RetryPolicy.java */
/* JADX INFO: loaded from: classes3.dex */
public final class F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f37185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f37186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f37187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f37188e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImmutableSet f37189f;

    public F0(int i10, long j, long j10, double d10, Long l10, Set<Status.Code> set) {
        this.f37184a = i10;
        this.f37185b = j;
        this.f37186c = j10;
        this.f37187d = d10;
        this.f37188e = l10;
        this.f37189f = ImmutableSet.C(set);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof F0)) {
            return false;
        }
        F0 f10 = (F0) obj;
        return this.f37184a == f10.f37184a && this.f37185b == f10.f37185b && this.f37186c == f10.f37186c && Double.compare(this.f37187d, f10.f37187d) == 0 && kotlinx.coroutines.C.j(this.f37188e, f10.f37188e) && kotlinx.coroutines.C.j(this.f37189f, f10.f37189f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f37184a), Long.valueOf(this.f37185b), Long.valueOf(this.f37186c), Double.valueOf(this.f37187d), this.f37188e, this.f37189f});
    }

    public final String toString() {
        com.google.common.base.d.a aVarB = com.google.common.base.d.b(this);
        aVarB.a(this.f37184a, "maxAttempts");
        aVarB.b(this.f37185b, "initialBackoffNanos");
        aVarB.b(this.f37186c, "maxBackoffNanos");
        aVarB.e("backoffMultiplier", String.valueOf(this.f37187d));
        aVarB.c(this.f37188e, "perAttemptRecvTimeoutNanos");
        aVarB.c(this.f37189f, "retryableStatusCodes");
        return aVarB.toString();
    }
}
