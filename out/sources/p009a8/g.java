package p009a8;

import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: StartFirmwareLegacyCommand.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends a<Integer> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f8074h;

    @Override // com.obdeleven.service.core.d
    public final void e(byte[] bArr) {
        String str = this.f8074h + String.format("%02X", Byte.valueOf(bArr[0]));
        this.f8074h = str;
        if (str.startsWith("0F0F") && this.f8074h.length() == 14) {
            Task.delay(100L).continueWith(new c(0, this));
        } else if (this.f8074h.startsWith("0F3E")) {
            Task.delay(100L).continueWith(new d(0, this));
        }
    }

    @Override // com.obdeleven.service.core.d
    public final void f() {
        if (this.f8074h.equals("0F")) {
            Task.delay(100L).continueWith(new e(0, this));
        } else {
            Task.delay(100L).continueWith(new f(0, this));
        }
    }
}
