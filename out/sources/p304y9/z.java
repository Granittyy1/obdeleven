package p304y9;

import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: RawResponseDTO.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48671b;

    public z(int i10, String response) {
        i.e(response, "response");
        this.f48670a = i10;
        this.f48671b = response;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f48670a == zVar.f48670a && i.a(this.f48671b, zVar.f48671b);
    }

    public final int hashCode() {
        return this.f48671b.hashCode() + (Integer.hashCode(this.f48670a) * 31);
    }

    public final String toString() {
        return "RawResponseDTO(httpStatus=" + this.f48670a + ", response=" + this.f48671b + ")";
    }
}
