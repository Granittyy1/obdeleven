package p134k8;

import O.e;
import com.obdeleven.service.core.gen1.i;
import com.obdeleven.service.util.b;
import com.voltasit.obdeleven.domain.models.Nrc;

/* JADX INFO: renamed from: k8.y1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: OBDIICu.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2665y1 extends i {
    @Override // com.obdeleven.service.core.gen1.i
    public final void i(byte[] bArr) {
        if (bArr.length >= 1) {
            if ((bArr[0] & 255) == 127 && bArr.length >= 3) {
                int i10 = bArr[2] & 255;
                Nrc.f30496b.getClass();
                Nrc nrcA = Nrc.a.a(i10);
                e.D("OBDIIControlUnit", String.format("NRC(%02X: %s)", Integer.valueOf(nrcA.a()), nrcA.b()));
                if (i10 == 120) {
                    return;
                }
            }
            h(b.a(bArr));
        }
    }
}
