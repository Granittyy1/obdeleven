package com.google.firebase.sessions;

/* JADX INFO: compiled from: SessionEvent.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataCollectionState f28717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataCollectionState f28718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f28719c;

    /* JADX WARN: Illegal instructions before constructor call */
    public i() {
        DataCollectionState dataCollectionState = DataCollectionState.COLLECTION_SDK_NOT_INSTALLED;
        this(dataCollectionState, dataCollectionState, 1.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f28717a == iVar.f28717a && this.f28718b == iVar.f28718b && Double.valueOf(this.f28719c).equals(Double.valueOf(iVar.f28719c));
    }

    public final int hashCode() {
        return Double.hashCode(this.f28719c) + ((this.f28718b.hashCode() + (this.f28717a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f28717a + ", crashlytics=" + this.f28718b + ", sessionSamplingRate=" + this.f28719c + ')';
    }

    public i(DataCollectionState performance, DataCollectionState crashlytics, double d10) {
        kotlin.jvm.internal.i.e(performance, "performance");
        kotlin.jvm.internal.i.e(crashlytics, "crashlytics");
        this.f28717a = performance;
        this.f28718b = crashlytics;
        this.f28719c = d10;
    }
}
