package O1;

import java.util.Objects;

/* JADX INFO: compiled from: InternalFrame.java */
/* JADX INFO: loaded from: classes.dex */
public final class j extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4759d;

    public j(String str, String str2, String str3) {
        super("----");
        this.f4757b = str;
        this.f4758c = str2;
        this.f4759d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return Objects.equals(this.f4758c, jVar.f4758c) && Objects.equals(this.f4757b, jVar.f4757b) && Objects.equals(this.f4759d, jVar.f4759d);
    }

    public final int hashCode() {
        String str = this.f4757b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f4758c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f4759d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // O1.h
    public final String toString() {
        return this.f4755a + ": domain=" + this.f4757b + ", description=" + this.f4758c;
    }
}
