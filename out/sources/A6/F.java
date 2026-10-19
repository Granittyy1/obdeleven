package A6;

import java.util.Arrays;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_FilesPayload_File.java */
/* JADX INFO: loaded from: classes3.dex */
public final class F extends f0.d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f672b;

    public F(String str, byte[] bArr) {
        this.f671a = str;
        this.f672b = bArr;
    }

    @Override // A6.f0.d.a
    public final byte[] a() {
        return this.f672b;
    }

    @Override // A6.f0.d.a
    public final String b() {
        return this.f671a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.d.a)) {
            return false;
        }
        f0.d.a aVar = (f0.d.a) obj;
        if (this.f671a.equals(aVar.b())) {
            if (Arrays.equals(this.f672b, aVar instanceof F ? ((F) aVar).f672b : aVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f671a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f672b);
    }

    public final String toString() {
        return "File{filename=" + this.f671a + ", contents=" + Arrays.toString(this.f672b) + "}";
    }
}
