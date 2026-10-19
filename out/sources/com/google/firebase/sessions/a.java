package com.google.firebase.sessions;

import java.util.ArrayList;

/* JADX INFO: compiled from: ApplicationInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f28667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f28668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f28669f;

    public a(String str, String versionName, String appBuildVersion, String str2, l lVar, ArrayList arrayList) {
        kotlin.jvm.internal.i.e(versionName, "versionName");
        kotlin.jvm.internal.i.e(appBuildVersion, "appBuildVersion");
        this.f28664a = str;
        this.f28665b = versionName;
        this.f28666c = appBuildVersion;
        this.f28667d = str2;
        this.f28668e = lVar;
        this.f28669f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f28664a.equals(aVar.f28664a) && kotlin.jvm.internal.i.a(this.f28665b, aVar.f28665b) && kotlin.jvm.internal.i.a(this.f28666c, aVar.f28666c) && this.f28667d.equals(aVar.f28667d) && this.f28668e.equals(aVar.f28668e) && this.f28669f.equals(aVar.f28669f);
    }

    public final int hashCode() {
        return this.f28669f.hashCode() + ((this.f28668e.hashCode() + B1.a.b(this.f28667d, B1.a.b(this.f28666c, B1.a.b(this.f28665b, this.f28664a.hashCode() * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f28664a + ", versionName=" + this.f28665b + ", appBuildVersion=" + this.f28666c + ", deviceManufacturer=" + this.f28667d + ", currentProcessDetails=" + this.f28668e + ", appProcessDetails=" + this.f28669f + ')';
    }
}
