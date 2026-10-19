package com.google.firebase.sessions;

/* JADX INFO: compiled from: SessionGenerator.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f28733d;

    public o(String sessionId, String firstSessionId, int i10, long j) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.f28730a = sessionId;
        this.f28731b = firstSessionId;
        this.f28732c = i10;
        this.f28733d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return kotlin.jvm.internal.i.a(this.f28730a, oVar.f28730a) && kotlin.jvm.internal.i.a(this.f28731b, oVar.f28731b) && this.f28732c == oVar.f28732c && this.f28733d == oVar.f28733d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f28733d) + p005a4.q.b(this.f28732c, B1.a.b(this.f28731b, this.f28730a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionDetails(sessionId=");
        sb2.append(this.f28730a);
        sb2.append(", firstSessionId=");
        sb2.append(this.f28731b);
        sb2.append(", sessionIndex=");
        sb2.append(this.f28732c);
        sb2.append(", sessionStartTimestampUs=");
        return C4.a.h(sb2, this.f28733d, ')');
    }
}
