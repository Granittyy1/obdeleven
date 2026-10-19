package p134k8;

import com.obdeleven.service.core.gen1.i;
import com.obdeleven.service.util.b;

/* JADX INFO: compiled from: ControlUnit.java */
/* JADX INFO: loaded from: classes3.dex */
public final class O0 extends i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f42631h;

    @Override // com.obdeleven.service.core.gen1.i
    public final void i(byte[] bArr) {
        if (bArr.length == 0) {
            h(this.f42631h);
        } else {
            this.f42631h = b.a(bArr);
        }
    }
}
