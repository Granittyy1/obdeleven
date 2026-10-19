package U1;

import A1.K;

/* JADX INFO: compiled from: TrackEncryptionBox.java */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final K.a f6270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f6272e;

    /* JADX WARN: Code duplicated, block: B:11:0x0020 A[FALL_THROUGH] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public m(boolean z10, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        int i13 = 2;
        byte b10 = 0;
        p241t7.b.e((i10 == 0) ^ (bArr2 == null));
        this.f6268a = z10;
        this.f6269b = str;
        this.f6271d = i10;
        this.f6272e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (!str.equals("cbc1")) {
                        b10 = -1;
                    }
                    break;
                case 3046671:
                    b10 = !str.equals("cbcs") ? (byte) -1 : (byte) 1;
                    break;
                case 3049879:
                    b10 = !str.equals("cenc") ? (byte) -1 : (byte) 2;
                    break;
                case 3049895:
                    b10 = !str.equals("cens") ? (byte) -1 : (byte) 3;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                case 1:
                    break;
                default:
                    p114j1.k.f("Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                case 2:
                case 3:
                    i13 = 1;
                    break;
            }
        } else {
            i13 = 1;
        }
        this.f6270c = new K.a(i13, i11, i12, bArr);
    }
}
