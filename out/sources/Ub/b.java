package Ub;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: BaseDescriptor.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6597b;

    public void d(int i10) {
        this.f6597b = i10 | this.f6597b;
    }

    public abstract int f();

    public boolean g(int i10) {
        return (this.f6597b & i10) == i10;
    }

    public int h() {
        return i() + f() + 1;
    }

    public int i() {
        int iF = f();
        int i10 = 0;
        while (true) {
            if (iF <= 0 && i10 >= 0) {
                return i10;
            }
            iF >>>= 7;
            i10++;
        }
    }

    public void j(int i10, ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int i11 = 0;
        while (true) {
            if (i10 <= 0 && i11 >= 0) {
                byteBuffer.position(i() + iPosition);
                return;
            }
            i11++;
            if (i10 > 0) {
                byteBuffer.put((i() + iPosition) - i11, (byte) (i10 & 127));
            } else {
                byteBuffer.put((i() + iPosition) - i11, (byte) -128);
            }
            i10 >>>= 7;
        }
    }
}
