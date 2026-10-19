package O1;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: GeobFrame.java */
/* JADX INFO: loaded from: classes.dex */
public final class f extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f4749e;

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f4746b = str;
        this.f4747c = str2;
        this.f4748d = str3;
        this.f4749e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return Objects.equals(this.f4746b, fVar.f4746b) && Objects.equals(this.f4747c, fVar.f4747c) && Objects.equals(this.f4748d, fVar.f4748d) && Arrays.equals(this.f4749e, fVar.f4749e);
    }

    public final int hashCode() {
        String str = this.f4746b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f4747c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f4748d;
        return Arrays.hashCode(this.f4749e) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // O1.h
    public final String toString() {
        return this.f4755a + ": mimeType=" + this.f4746b + ", filename=" + this.f4747c + ", description=" + this.f4748d;
    }
}
