package O1;

import java.util.Objects;

/* JADX INFO: compiled from: UrlLinkFrame.java */
/* JADX INFO: loaded from: classes.dex */
public final class n extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4770c;

    public n(String str, String str2, String str3) {
        super(str);
        this.f4769b = str2;
        this.f4770c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.f4755a.equals(nVar.f4755a) && Objects.equals(this.f4769b, nVar.f4769b) && Objects.equals(this.f4770c, nVar.f4770c);
    }

    public final int hashCode() {
        int iB = B1.a.b(this.f4755a, 527, 31);
        String str = this.f4769b;
        int iHashCode = (iB + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f4770c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // O1.h
    public final String toString() {
        return this.f4755a + ": url=" + this.f4770c;
    }
}
