package O1;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: PrivFrame.java */
/* JADX INFO: loaded from: classes.dex */
public final class l extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f4766c;

    public l(String str, byte[] bArr) {
        super("PRIV");
        this.f4765b = str;
        this.f4766c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return Objects.equals(this.f4765b, lVar.f4765b) && Arrays.equals(this.f4766c, lVar.f4766c);
    }

    public final int hashCode() {
        String str = this.f4765b;
        return Arrays.hashCode(this.f4766c) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // O1.h
    public final String toString() {
        return this.f4755a + ": owner=" + this.f4765b;
    }
}
