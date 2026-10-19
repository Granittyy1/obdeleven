package p019b6;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import androidx.compose.foundation.gestures.d;
import com.google.android.play.integrity.internal.e;
import com.google.android.play.integrity.internal.v;
import com.google.android.play.integrity.internal.w;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f20572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f20573d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o oVar, p191p5.h hVar, Context context) {
        super(hVar);
        this.f20572c = context;
        Objects.requireNonNull(oVar);
        this.f20573d = oVar;
    }

    @Override // com.google.android.play.integrity.internal.w
    public final void b() {
        int length;
        String strEncodeToString;
        Context context = this.f20572c;
        p191p5.h hVar = this.f20573d.f20593c;
        v vVar = e.f27747a;
        int i10 = 0;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 64);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null && applicationInfo.enabled) {
                Signature[] signatureArr = packageInfo.signatures;
                v vVar2 = e.f27747a;
                if (signatureArr != null && (length = signatureArr.length) != 0) {
                    ArrayList arrayList = new ArrayList();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            StringBuilder sb2 = new StringBuilder();
                            Iterator it = arrayList.iterator();
                            if (it.hasNext()) {
                                while (true) {
                                    sb2.append((CharSequence) it.next());
                                    if (!it.hasNext()) {
                                        break;
                                    } else {
                                        sb2.append((CharSequence) ", ");
                                    }
                                }
                            }
                            String strB = d.b("Play Store package certs are not valid. Found these sha256 certs: [", sb2.toString(), "].");
                            Object[] objArr = new Object[0];
                            vVar2.getClass();
                            if (!Log.isLoggable("PlayCore", 5)) {
                                break;
                            }
                            v.c(vVar2.f27760a, strB, objArr);
                            break;
                        }
                        byte[] byteArray = signatureArr[i11].toByteArray();
                        try {
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                            messageDigest.update(byteArray);
                            strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                        } catch (NoSuchAlgorithmException unused) {
                            strEncodeToString = "";
                        }
                        arrayList.add(strEncodeToString);
                        if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString)) {
                            String str = Build.TAGS;
                            if ((!str.contains("dev-keys") && !str.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString)) {
                                i11++;
                            }
                        }
                        i10 = packageInfo.versionCode;
                        break;
                    }
                }
                Object[] objArr2 = new Object[0];
                vVar2.getClass();
                if (Log.isLoggable("PlayCore", 5)) {
                    v.c(vVar2.f27760a, "Play Store package is not signed -- possibly self-built package. Could not verify.", objArr2);
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        hVar.d(Integer.valueOf(i10));
    }
}
