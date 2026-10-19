package p131k5;

import U4.C0804l;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class G0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H0 f41790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f41791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IOException f41792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f41793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f41794f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map<String, List<String>> f41795g;

    public G0(String str, H0 h8, int i10, IOException iOException, byte[] bArr, Map map) {
        C0804l.h(h8);
        this.f41790b = h8;
        this.f41791c = i10;
        this.f41792d = iOException;
        this.f41793e = bArr;
        this.f41794f = str;
        this.f41795g = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41790b.a(this.f41794f, this.f41791c, this.f41792d, this.f41793e, this.f41795g);
    }
}
