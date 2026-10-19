package p293xa;

import Ha.a;

/* JADX INFO: compiled from: UByte.kt */
/* JADX INFO: loaded from: classes.dex */
@a
public final class i implements Comparable<i> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f47922b;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(i iVar) {
        return kotlin.jvm.internal.i.g(this.f47922b & 255, iVar.f47922b & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f47922b == ((i) obj).f47922b;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f47922b);
    }

    public final String toString() {
        return String.valueOf(this.f47922b & 255);
    }
}
