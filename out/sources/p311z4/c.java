package p311z4;

import Q8.d;

/* JADX INFO: compiled from: Encoding.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48831a;

    public c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f48831a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f48831a.equals(((c) obj).f48831a);
    }

    public final int hashCode() {
        return this.f48831a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return d.a(new StringBuilder("Encoding{name=\""), this.f48831a, "\"}");
    }
}
