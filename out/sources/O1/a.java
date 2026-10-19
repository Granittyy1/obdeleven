package O1;

import java.util.Arrays;
import java.util.Objects;
import p078g1.r;

/* JADX INFO: compiled from: ApicFrame.java */
/* JADX INFO: loaded from: classes.dex */
public final class a extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f4730e;

    public a(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f4727b = str;
        this.f4728c = str2;
        this.f4729d = i10;
        this.f4730e = bArr;
    }

    @Override // g1.s.a
    public final void b(r.a aVar) {
        aVar.a(this.f4729d, this.f4730e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f4729d == aVar.f4729d && Objects.equals(this.f4727b, aVar.f4727b) && Objects.equals(this.f4728c, aVar.f4728c) && Arrays.equals(this.f4730e, aVar.f4730e);
    }

    public final int hashCode() {
        int i10 = (527 + this.f4729d) * 31;
        String str = this.f4727b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f4728c;
        return Arrays.hashCode(this.f4730e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // O1.h
    public final String toString() {
        return this.f4755a + ": mimeType=" + this.f4727b + ", description=" + this.f4728c;
    }
}
