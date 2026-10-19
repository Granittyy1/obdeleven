package O1;

import java.util.Objects;

/* JADX INFO: compiled from: CommentFrame.java */
/* JADX INFO: loaded from: classes.dex */
public final class e extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4745d;

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f4743b = str;
        this.f4744c = str2;
        this.f4745d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return Objects.equals(this.f4744c, eVar.f4744c) && Objects.equals(this.f4743b, eVar.f4743b) && Objects.equals(this.f4745d, eVar.f4745d);
    }

    public final int hashCode() {
        String str = this.f4743b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f4744c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f4745d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // O1.h
    public final String toString() {
        return this.f4755a + ": language=" + this.f4743b + ", description=" + this.f4744c + ", text=" + this.f4745d;
    }
}
