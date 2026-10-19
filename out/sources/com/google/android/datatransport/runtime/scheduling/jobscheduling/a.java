package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.Priority;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: AutoValue_SchedulerConfig.java */
/* JADX INFO: loaded from: classes.dex */
public final class a extends SchedulerConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L4.a f25279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f25280b;

    public a(L4.a aVar, HashMap map) {
        this.f25279a = aVar;
        this.f25280b = map;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public final L4.a a() {
        return this.f25279a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public final Map<Priority, SchedulerConfig.a> c() {
        return this.f25280b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig)) {
            return false;
        }
        SchedulerConfig schedulerConfig = (SchedulerConfig) obj;
        return this.f25279a.equals(schedulerConfig.a()) && this.f25280b.equals(schedulerConfig.c());
    }

    public final int hashCode() {
        return ((this.f25279a.hashCode() ^ 1000003) * 1000003) ^ this.f25280b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f25279a + ", values=" + this.f25280b + "}";
    }
}
