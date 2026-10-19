package p133k7;

import android.content.SharedPreferences;
import android.util.Base64;
import com.google.firebase.messaging.FirebaseMessaging;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import me.zhanghai.android.materialprogressbar.R;
import p144l6.e;
import p144l6.f;

/* JADX INFO: compiled from: IidStore.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f42559c = {"*", FirebaseMessaging.INSTANCE_ID_SCOPE, "GCM", ""};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f42560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42561b;

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    public a(e eVar) {
        eVar.a();
        this.f42560a = eVar.f44388a.getSharedPreferences("com.google.android.gms.appid", 0);
        eVar.a();
        f fVar = eVar.f44390c;
        String str = fVar.f44404e;
        if (str == null) {
            eVar.a();
            str = fVar.f44401b;
            if (str.startsWith("1:") || str.startsWith("2:")) {
                String[] strArrSplit = str.split(":");
                if (strArrSplit.length != 4) {
                    str = null;
                } else {
                    str = strArrSplit[1];
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
            }
        }
        this.f42561b = str;
    }

    public final String a() {
        PublicKey publicKeyGeneratePublic;
        synchronized (this.f42560a) {
            String strEncodeToString = null;
            String string = this.f42560a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e10) {
                e10.toString();
                publicKeyGeneratePublic = null;
            }
            if (publicKeyGeneratePublic == null) {
                return null;
            }
            try {
                byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKeyGeneratePublic.getEncoded());
                bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) & 255);
                strEncodeToString = Base64.encodeToString(bArrDigest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
            }
            return strEncodeToString;
        }
    }
}
