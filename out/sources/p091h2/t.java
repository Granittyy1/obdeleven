package p091h2;

import java.util.Arrays;
import p241t7.b;

/* JADX INFO: compiled from: NalUnitTargetBuffer.java */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f36085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f36086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f36087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36088e;

    public t(int i10) {
        this.f36084a = i10;
        byte[] bArr = new byte[131];
        this.f36087d = bArr;
        bArr[2] = 1;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f36085b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f36087d;
            int length = bArr2.length;
            int i13 = this.f36088e;
            if (length < i13 + i12) {
                this.f36087d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.f36087d, this.f36088e, i12);
            this.f36088e += i12;
        }
    }

    public final boolean b(int i10) {
        if (!this.f36085b) {
            return false;
        }
        this.f36088e -= i10;
        this.f36085b = false;
        this.f36086c = true;
        return true;
    }

    public final void c() {
        this.f36085b = false;
        this.f36086c = false;
    }

    public final void d(int i10) {
        b.k(!this.f36085b);
        boolean z10 = i10 == this.f36084a;
        this.f36085b = z10;
        if (z10) {
            this.f36088e = 3;
            this.f36086c = false;
        }
    }
}
