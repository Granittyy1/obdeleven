package com.google.firebase.sessions;

/* JADX INFO: compiled from: SessionDatastore.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28720a;

    public j(String str) {
        this.f28720a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && kotlin.jvm.internal.i.a(this.f28720a, ((j) obj).f28720a);
    }

    public final int hashCode() {
        String str = this.f28720a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return B7.b.g(new StringBuilder("FirebaseSessionsData(sessionId="), this.f28720a, ')');
    }
}
