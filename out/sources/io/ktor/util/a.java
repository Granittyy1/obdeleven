package io.ktor.util;

/* JADX INFO: compiled from: Attributes.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40531a;

    public a(String str) {
        this.f40531a = str;
        if (str.length() == 0) {
            throw new IllegalStateException("Name can't be blank");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && a.class == obj.getClass() && kotlin.jvm.internal.i.a(this.f40531a, ((a) obj).f40531a);
    }

    public final int hashCode() {
        return this.f40531a.hashCode();
    }

    public final String toString() {
        return "AttributeKey: " + this.f40531a;
    }
}
