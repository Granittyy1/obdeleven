package com.google.firebase.sessions;

/* JADX INFO: compiled from: SessionEvent.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f28734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f28735b;

    public p(t tVar, b bVar) {
        this.f28734a = tVar;
        this.f28735b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        pVar.getClass();
        return this.f28734a.equals(pVar.f28734a) && this.f28735b.equals(pVar.f28735b);
    }

    public final int hashCode() {
        return this.f28735b.hashCode() + ((this.f28734a.hashCode() + (EventType.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + EventType.SESSION_START + ", sessionData=" + this.f28734a + ", applicationInfo=" + this.f28735b + ')';
    }
}
