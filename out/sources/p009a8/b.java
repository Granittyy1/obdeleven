package p009a8;

import X8.r;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: StartBootloaderLegacyCommand.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends a<Void> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f8065h;

    @Override // com.obdeleven.service.core.d
    public final void e(byte[] bArr) {
        String str = this.f8065h + String.format("%02X", Byte.valueOf(bArr[0]));
        this.f8065h = str;
        if (str.startsWith("4F4B3E")) {
            Task.delay(100L).continueWith(new r(1, this));
        }
    }
}
