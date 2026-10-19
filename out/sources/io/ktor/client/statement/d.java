package io.ktor.client.statement;

import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: HttpResponsePipeline.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p023ba.a f40428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f40429b;

    public d(p023ba.a expectedType, Object response) {
        i.e(expectedType, "expectedType");
        i.e(response, "response");
        this.f40428a = expectedType;
        this.f40429b = response;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return i.a(this.f40428a, dVar.f40428a) && i.a(this.f40429b, dVar.f40429b);
    }

    public final int hashCode() {
        return this.f40429b.hashCode() + (this.f40428a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HttpResponseContainer(expectedType=");
        sb2.append(this.f40428a);
        sb2.append(", response=");
        return B6.c.e(sb2, this.f40429b, ')');
    }
}
