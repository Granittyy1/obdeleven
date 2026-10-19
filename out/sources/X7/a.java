package X7;

import Q3.d;
import androidx.compose.ui.text.font.s;
import com.obdeleven.service.core.gen1.i;
import com.obdeleven.service.util.b;
import kotlin.text.n;

/* JADX INFO: compiled from: ObdIIMultiMessageCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f7371h;

    @Override // com.obdeleven.service.core.gen1.i
    public final void i(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            h(this.f7371h);
            return;
        }
        if (bArr.length > 4) {
            if (bArr[3] == 127) {
                if (bArr[5] != 120) {
                    this.f7371h = b.a(d.t(bArr, 3, bArr.length - 1));
                }
            } else if (n.S(this.f7371h)) {
                this.f7371h = b.a(d.t(bArr, 3, bArr.length - 1));
            } else {
                this.f7371h = s.b(this.f7371h, b.a(d.t(bArr, 6, bArr.length - 1)));
            }
        }
    }
}
