package S4;

import U4.C0804l;
import U4.g0;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class v extends com.google.android.gms.internal.common.d implements g0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f5551d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5552c;

    public v(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        C0804l.b(bArr.length == 25);
        this.f5552c = Arrays.hashCode(bArr);
    }

    public static byte[] b0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // U4.g0
    public final p018b5.a b() {
        return new p018b5.b(g());
    }

    @Override // com.google.android.gms.internal.common.d
    public final boolean e(int i10, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i10 == 1) {
            p018b5.a aVarB = b();
            parcel2.writeNoException();
            com.google.android.gms.internal.common.e.b(parcel2, aVarB);
        } else {
            if (i10 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f5552c);
        }
        return true;
    }

    public final boolean equals(Object obj) {
        p018b5.a aVarB;
        if (!(obj instanceof g0)) {
            return false;
        }
        try {
            g0 g0Var = (g0) obj;
            if (g0Var.z() == this.f5552c && (aVarB = g0Var.b()) != null) {
                return Arrays.equals(g(), (byte[]) p018b5.b.b0(aVarB));
            }
            return false;
        } catch (RemoteException e10) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            return false;
        }
    }

    public abstract byte[] g();

    public final int hashCode() {
        return this.f5552c;
    }

    @Override // U4.g0
    public final int z() {
        return this.f5552c;
    }
}
