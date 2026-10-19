package p313z6;

import java.io.IOException;

/* JADX INFO: compiled from: QueueFileLogStore.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements h.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte[] f48881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int[] f48882b;

    public i(byte[] bArr, int[] iArr) {
        this.f48881a = bArr;
        this.f48882b = iArr;
    }

    @Override // z6.h.d
    public final void a(h.c cVar, int i10) throws IOException {
        int[] iArr = this.f48882b;
        try {
            cVar.read(this.f48881a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            cVar.close();
        }
    }
}
