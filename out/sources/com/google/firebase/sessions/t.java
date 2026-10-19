package com.google.firebase.sessions;

/* JADX INFO: compiled from: SessionEvent.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f28773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f28774e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f28775f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f28776g;

    public t(String sessionId, String firstSessionId, int i10, long j, i iVar, String str, String firebaseAuthenticationToken) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        kotlin.jvm.internal.i.e(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.f28770a = sessionId;
        this.f28771b = firstSessionId;
        this.f28772c = i10;
        this.f28773d = j;
        this.f28774e = iVar;
        this.f28775f = str;
        this.f28776g = firebaseAuthenticationToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return kotlin.jvm.internal.i.a(this.f28770a, tVar.f28770a) && kotlin.jvm.internal.i.a(this.f28771b, tVar.f28771b) && this.f28772c == tVar.f28772c && this.f28773d == tVar.f28773d && kotlin.jvm.internal.i.a(this.f28774e, tVar.f28774e) && kotlin.jvm.internal.i.a(this.f28775f, tVar.f28775f) && kotlin.jvm.internal.i.a(this.f28776g, tVar.f28776g);
    }

    public final int hashCode() {
        return this.f28776g.hashCode() + B1.a.b(this.f28775f, (this.f28774e.hashCode() + C4.b.c(this.f28773d, p005a4.q.b(this.f28772c, B1.a.b(this.f28771b, this.f28770a.hashCode() * 31, 31), 31), 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionInfo(sessionId=");
        sb2.append(this.f28770a);
        sb2.append(", firstSessionId=");
        sb2.append(this.f28771b);
        sb2.append(", sessionIndex=");
        sb2.append(this.f28772c);
        sb2.append(", eventTimestampUs=");
        sb2.append(this.f28773d);
        sb2.append(", dataCollectionStatus=");
        sb2.append(this.f28774e);
        sb2.append(", firebaseInstallationId=");
        sb2.append(this.f28775f);
        sb2.append(", firebaseAuthenticationToken=");
        return B7.b.g(sb2, this.f28776g, ')');
    }
}
