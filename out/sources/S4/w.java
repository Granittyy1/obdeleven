package S4;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class w extends v {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f5553e;

    public w(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f5553e = bArr;
    }

    @Override // S4.v
    public final byte[] g() {
        return this.f5553e;
    }
}
