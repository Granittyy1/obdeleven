package F3;

import X3.j;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: SafeKeyGenerator.java */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.g<A3.b, String> f3231a = new X3.g<>(1000);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Y3.a.c f3232b = Y3.a.a(10, new a());

    /* JADX INFO: compiled from: SafeKeyGenerator.java */
    public class a implements Y3.a.b<b> {
        @Override // Y3.a.b
        public final b a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* JADX INFO: compiled from: SafeKeyGenerator.java */
    public static final class b implements Y3.a.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MessageDigest f3233b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Y3.d.a f3234c = new Y3.d.a();

        public b(MessageDigest messageDigest) {
            this.f3233b = messageDigest;
        }

        @Override // Y3.a.d
        public final Y3.d.a d() {
            return this.f3234c;
        }
    }

    public final String a(A3.b bVar) {
        String strA;
        synchronized (this.f3231a) {
            strA = this.f3231a.a(bVar);
        }
        if (strA == null) {
            b bVar2 = (b) this.f3232b.a();
            try {
                bVar.a(bVar2.f3233b);
                byte[] bArrDigest = bVar2.f3233b.digest();
                char[] cArr = j.f7215b;
                synchronized (cArr) {
                    for (int i10 = 0; i10 < bArrDigest.length; i10++) {
                        byte b10 = bArrDigest[i10];
                        int i11 = i10 * 2;
                        char[] cArr2 = j.f7214a;
                        cArr[i11] = cArr2[(b10 & 255) >>> 4];
                        cArr[i11 + 1] = cArr2[b10 & 15];
                    }
                    strA = new String(cArr);
                }
                this.f3232b.b(bVar2);
            } catch (Throwable th) {
                this.f3232b.b(bVar2);
                throw th;
            }
        }
        synchronized (this.f3231a) {
            this.f3231a.d(bVar, strA);
        }
        return strA;
    }
}
