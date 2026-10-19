package p021b8;

import Z7.a;
import com.obdeleven.service.exception.CommandException;
import com.obdeleven.service.util.b;
import java.util.Arrays;

/* JADX INFO: compiled from: ReadBootloaderInformationCommand.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends a<p034c8.a> {
    @Override // com.obdeleven.service.core.d
    public final void e(byte[] bArr) {
        if ((bArr[0] & 255) != 0) {
            return;
        }
        if ((bArr[1] & 255) == 0) {
            h(new p034c8.a(b.a(Arrays.copyOfRange(bArr, 4, 16)), b.a(Arrays.copyOfRange(bArr, 16, 27))));
        } else {
            g(new CommandException(bArr[1]));
        }
    }
}
