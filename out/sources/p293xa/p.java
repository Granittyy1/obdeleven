package p293xa;

import Ha.a;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: UShort.kt */
/* JADX INFO: loaded from: classes.dex */
@a
public final class p implements Comparable<p> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final short f47935b;

    public static String a(short s10) {
        return String.valueOf(s10 & 65535);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(p pVar) {
        return i.g(this.f47935b & 65535, pVar.f47935b & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f47935b == ((p) obj).f47935b;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f47935b);
    }

    public final String toString() {
        return a(this.f47935b);
    }
}
