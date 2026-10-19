package p047d8;

import E8.a;
import Na.i;
import Na.l;
import com.obdeleven.service.core.d;
import java.util.Arrays;
import kotlin.collections.k;

/* JADX INFO: compiled from: ReadFirmwareChecksumCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends d<String> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f34625h = {27, 0};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final i f34626i = new i(0, 1, 1);
    public static final i j = l.J(2, 18);

    @Override // com.obdeleven.service.core.d
    public final void e(byte[] bArr) {
        if (Arrays.equals(k.a0(bArr, f34626i), f34625h)) {
            h(a.g(k.a0(bArr, j)));
        }
    }
}
