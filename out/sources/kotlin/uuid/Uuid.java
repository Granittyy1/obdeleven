package kotlin.uuid;

import java.io.Serializable;
import kotlin.text.a;
import kotlinx.coroutines.C;

/* JADX INFO: compiled from: Uuid.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Uuid implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Uuid f43162b = new Uuid(0, 0);
    private final long leastSignificantBits;
    private final long mostSignificantBits;

    public Uuid(long j, long j10) {
        this.mostSignificantBits = j;
        this.leastSignificantBits = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Uuid)) {
            return false;
        }
        Uuid uuid = (Uuid) obj;
        return this.mostSignificantBits == uuid.mostSignificantBits && this.leastSignificantBits == uuid.leastSignificantBits;
    }

    public final int hashCode() {
        long j = this.mostSignificantBits ^ this.leastSignificantBits;
        return ((int) j) ^ ((int) (j >> 32));
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        C.f(this.leastSignificantBits, bArr, 24, 6);
        bArr[23] = 45;
        C.f(this.leastSignificantBits >>> 48, bArr, 19, 2);
        bArr[18] = 45;
        C.f(this.mostSignificantBits, bArr, 14, 2);
        bArr[13] = 45;
        C.f(this.mostSignificantBits >>> 16, bArr, 9, 2);
        bArr[8] = 45;
        C.f(this.mostSignificantBits >>> 32, bArr, 0, 4);
        return new String(bArr, a.f43120b);
    }
}
