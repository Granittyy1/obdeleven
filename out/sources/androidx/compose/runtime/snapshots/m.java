package androidx.compose.runtime.snapshots;

import java.io.Serializable;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: SnapshotWeakSet.kt */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Cloneable f13218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Serializable f13219c;

    public m(String str) {
        this.f13219c = str;
        try {
            Mac mac = Mac.getInstance(str);
            this.f13218b = mac;
            this.f13217a = mac.getMacLength();
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void a(byte[] bArr) {
        try {
            ((Mac) this.f13218b).init(new SecretKeySpec(bArr, (String) this.f13219c));
        } catch (InvalidKeyException e10) {
            throw new RuntimeException(e10);
        }
    }
}
