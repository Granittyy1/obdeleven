package p047d8;

import Na.i;
import Na.l;
import java.util.Arrays;
import kotlin.collections.k;
import kotlin.text.a;

/* JADX INFO: compiled from: ReadFullVersionCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends com.obdeleven.service.core.d<String> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f34627h = {28, 0};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final i f34628i = new i(0, 1, 1);
    public static final int j = 2;

    @Override // com.obdeleven.service.core.d
    public final void e(byte[] bArr) {
        if (Arrays.equals(k.a0(bArr, f34628i), f34627h)) {
            h(new String(k.a0(bArr, l.J(j, bArr.length)), a.f43120b));
        }
    }
}
