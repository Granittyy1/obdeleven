package E3;

/* JADX INFO: compiled from: ByteArrayAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public final class e implements a<byte[]> {
    @Override // E3.a
    public final String a() {
        return "ByteArrayPool";
    }

    @Override // E3.a
    public final int b() {
        return 1;
    }

    @Override // E3.a
    public final int c(byte[] bArr) {
        return bArr.length;
    }

    @Override // E3.a
    public final byte[] newArray(int i10) {
        return new byte[i10];
    }
}
