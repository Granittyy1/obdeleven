package M1;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import p078g1.s;
import p078g1.t;
import p114j1.r;

/* JADX INFO: compiled from: PictureFrame.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements s.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f4514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f4515h;

    public a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f4508a = i10;
        this.f4509b = str;
        this.f4510c = str2;
        this.f4511d = i11;
        this.f4512e = i12;
        this.f4513f = i13;
        this.f4514g = i14;
        this.f4515h = bArr;
    }

    public static a d(r rVar) {
        int iH = rVar.h();
        String strM = t.m(rVar.s(rVar.h(), StandardCharsets.US_ASCII));
        String strS = rVar.s(rVar.h(), StandardCharsets.UTF_8);
        int iH2 = rVar.h();
        int iH3 = rVar.h();
        int iH4 = rVar.h();
        int iH5 = rVar.h();
        int iH6 = rVar.h();
        byte[] bArr = new byte[iH6];
        rVar.f(bArr, 0, iH6);
        return new a(iH, strM, strS, iH2, iH3, iH4, iH5, bArr);
    }

    @Override // g1.s.a
    public final void b(g1.r.a aVar) {
        aVar.a(this.f4508a, this.f4515h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f4508a == aVar.f4508a && this.f4509b.equals(aVar.f4509b) && this.f4510c.equals(aVar.f4510c) && this.f4511d == aVar.f4511d && this.f4512e == aVar.f4512e && this.f4513f == aVar.f4513f && this.f4514g == aVar.f4514g && Arrays.equals(this.f4515h, aVar.f4515h);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4515h) + ((((((((B1.a.b(this.f4510c, B1.a.b(this.f4509b, (527 + this.f4508a) * 31, 31), 31) + this.f4511d) * 31) + this.f4512e) * 31) + this.f4513f) * 31) + this.f4514g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f4509b + ", description=" + this.f4510c;
    }
}
