package p058e7;

import T6.b;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.common.io.BaseEncoding;
import io.grpc.m;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.BitSet;
import p144l6.e;

/* JADX INFO: compiled from: GrpcClientModule_ProvidesApiKeyHeadersFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class v implements b<m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f34822a;

    public v(u uVar) {
        this.f34822a = uVar;
    }

    @Override // p268va.a
    public final Object get() {
        Signature[] signatureArr;
        Signature signature;
        u uVar = this.f34822a;
        m.a aVar = m.f37781d;
        BitSet bitSet = m.d.f37786d;
        m.b bVar = new m.b("X-Goog-Api-Key", aVar);
        m.b bVar2 = new m.b("X-Android-Package", aVar);
        m.b bVar3 = new m.b("X-Android-Cert", aVar);
        m mVar = new m();
        e eVar = uVar.f34821a;
        eVar.a();
        Context context = eVar.f44388a;
        String packageName = context.getPackageName();
        eVar.a();
        mVar.e(bVar, eVar.f44390c.f44400a);
        mVar.e(bVar2, packageName);
        eVar.a();
        String strC = null;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 64);
            if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length != 0 && (signature = signatureArr[0]) != null) {
                strC = BaseEncoding.f27997b.h().c(MessageDigest.getInstance("SHA1").digest(signature.toByteArray()));
            }
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
        }
        if (strC != null) {
            mVar.e(bVar3, strC);
        }
        return mVar;
    }
}
