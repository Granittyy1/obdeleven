package p294xb;

import kotlin.jvm.internal.i;
import p318zb.C2839f;

/* JADX INFO: compiled from: WebSocketProtocol.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class h {
    public static void a(C2839f.a cursor, byte[] key) {
        long j;
        i.e(cursor, "cursor");
        i.e(key, "key");
        int length = key.length;
        int i10 = 0;
        do {
            byte[] bArr = cursor.f49079f;
            int i11 = cursor.f49080g;
            int i12 = cursor.f49081h;
            if (bArr != null) {
                while (i11 < i12) {
                    int i13 = i10 % length;
                    bArr[i11] = (byte) (bArr[i11] ^ key[i13]);
                    i11++;
                    i10 = i13 + 1;
                }
            }
            long j10 = cursor.f49078e;
            C2839f c2839f = cursor.f49075b;
            i.b(c2839f);
            if (j10 == c2839f.f49074c) {
                throw new IllegalStateException("no more bytes");
            }
            j = cursor.f49078e;
        } while (cursor.c(j == -1 ? 0L : j + ((long) (cursor.f49081h - cursor.f49080g))) != -1);
    }
}
