package p318zb;

import java.io.RandomAccessFile;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: JvmFileHandle.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends AbstractC2843j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RandomAccessFile f49116e;

    public s(RandomAccessFile randomAccessFile) {
        this.f49116e = randomAccessFile;
    }

    @Override // p318zb.AbstractC2843j
    public final synchronized void b() {
        this.f49116e.close();
    }

    @Override // p318zb.AbstractC2843j
    public final synchronized int c(long j, byte[] array, int i10, int i11) {
        i.e(array, "array");
        this.f49116e.seek(j);
        int i12 = 0;
        while (i12 < i11) {
            int i13 = this.f49116e.read(array, i10, i11 - i12);
            if (i13 == -1) {
                if (i12 != 0) {
                    break;
                }
                return -1;
            }
            i12 += i13;
        }
        return i12;
    }

    @Override // p318zb.AbstractC2843j
    public final synchronized long h() {
        return this.f49116e.length();
    }
}
