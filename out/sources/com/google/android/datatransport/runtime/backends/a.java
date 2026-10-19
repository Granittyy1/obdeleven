package com.google.android.datatransport.runtime.backends;

import p005a4.o;

/* JADX INFO: compiled from: AutoValue_BackendResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class a extends BackendResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BackendResponse.Status f25261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f25262b;

    public a(BackendResponse.Status status, long j) {
        this.f25261a = status;
        this.f25262b = j;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public final long a() {
        return this.f25262b;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public final BackendResponse.Status b() {
        return this.f25261a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackendResponse)) {
            return false;
        }
        BackendResponse backendResponse = (BackendResponse) obj;
        return this.f25261a.equals(backendResponse.b()) && this.f25262b == backendResponse.a();
    }

    public final int hashCode() {
        int iHashCode = (this.f25261a.hashCode() ^ 1000003) * 1000003;
        long j = this.f25262b;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackendResponse{status=");
        sb2.append(this.f25261a);
        sb2.append(", nextRequestWaitMillis=");
        return o.d(this.f25262b, "}", sb2);
    }
}
