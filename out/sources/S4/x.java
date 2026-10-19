package S4;

import U4.C0804l;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f5556d;

    public /* synthetic */ x(boolean z10, String str, w wVar) {
        this.f5554b = z10;
        this.f5555c = str;
        this.f5556d = wVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MessageDigest messageDigest;
        w wVar = this.f5556d;
        boolean z10 = this.f5554b;
        String str = this.f5555c;
        String str2 = (z10 || !A.b(str, wVar, true, false).f5521a) ? "not allowed" : "debug cert rejected";
        int i10 = 0;
        while (true) {
            if (i10 >= 2) {
                messageDigest = null;
                break;
            }
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
                if (messageDigest != null) {
                    break;
                }
                i10++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        C0804l.h(messageDigest);
        byte[] bArrDigest = messageDigest.digest(wVar.f5553e);
        int length = bArrDigest.length;
        char[] cArr = new char[length + length];
        int i11 = 0;
        for (byte b10 : bArrDigest) {
            char[] cArr2 = Y4.d.f7605b;
            cArr[i11] = cArr2[(b10 & 255) >>> 4];
            cArr[i11 + 1] = cArr2[b10 & 15];
            i11 += 2;
        }
        return str2 + ": pkg=" + str + ", sha256=" + new String(cArr) + ", atk=" + z10 + ", ver=12451000.false";
    }
}
