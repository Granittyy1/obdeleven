package Ub;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: BitWriterBuffer.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6599b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ByteBuffer f6600c;

    public c(ByteBuffer byteBuffer) {
        this.f6600c = byteBuffer;
        this.f6598a = byteBuffer.position();
    }

    public final void a(int i10, int i11) {
        int i12 = this.f6599b;
        int i13 = 8 - (i12 % 8);
        int i14 = this.f6598a;
        ByteBuffer byteBuffer = this.f6600c;
        if (i11 <= i13) {
            int i15 = byteBuffer.get((i12 / 8) + i14);
            if (i15 < 0) {
                i15 += 256;
            }
            int i16 = i15 + (i10 << (i13 - i11));
            int i17 = (this.f6599b / 8) + i14;
            if (i16 > 127) {
                i16 -= 256;
            }
            byteBuffer.put(i17, (byte) i16);
            this.f6599b += i11;
        } else {
            int i18 = i11 - i13;
            a(i10 >> i18, i13);
            a(i10 & ((1 << i18) - 1), i18);
        }
        int i19 = this.f6599b;
        byteBuffer.position((i19 / 8) + i14 + (i19 % 8 <= 0 ? 0 : 1));
    }
}
