package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.Set;

/* JADX INFO: compiled from: AutoValue_SchedulerConfig_ConfigValue.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends SchedulerConfig.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f25282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<SchedulerConfig.Flag> f25283c;

    public b(long j, long j10, Set set) {
        this.f25281a = j;
        this.f25282b = j10;
        this.f25283c = set;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.a
    public final long a() {
        return this.f25281a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.a
    public final Set<SchedulerConfig.Flag> b() {
        return this.f25283c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.a
    public final long c() {
        return this.f25282b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig.a)) {
            return false;
        }
        SchedulerConfig.a aVar = (SchedulerConfig.a) obj;
        return this.f25281a == aVar.a() && this.f25282b == aVar.c() && this.f25283c.equals(aVar.b());
    }

    public final int hashCode() {
        long j = this.f25281a;
        int i10 = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j10 = this.f25282b;
        return ((i10 ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f25283c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f25281a + ", maxAllowedDelay=" + this.f25282b + ", flags=" + this.f25283c + "}";
    }
}
