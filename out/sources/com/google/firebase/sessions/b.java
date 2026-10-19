package com.google.firebase.sessions;

/* JADX INFO: compiled from: ApplicationInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f28681d;

    public b(String appId, String str, String str2, a aVar) {
        kotlin.jvm.internal.i.e(appId, "appId");
        this.f28678a = appId;
        this.f28679b = str;
        this.f28680c = str2;
        this.f28681d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.i.a(this.f28678a, bVar.f28678a) && this.f28679b.equals(bVar.f28679b) && this.f28680c.equals(bVar.f28680c) && this.f28681d.equals(bVar.f28681d);
    }

    public final int hashCode() {
        return this.f28681d.hashCode() + ((LogEnvironment.LOG_ENVIRONMENT_PROD.hashCode() + B1.a.b(this.f28680c, (((this.f28679b.hashCode() + (this.f28678a.hashCode() * 31)) * 31) + 46672442) * 31, 31)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.f28678a + ", deviceModel=" + this.f28679b + ", sessionSdkVersion=1.2.3, osVersion=" + this.f28680c + ", logEnvironment=" + LogEnvironment.LOG_ENVIRONMENT_PROD + ", androidAppInfo=" + this.f28681d + ')';
    }
}
