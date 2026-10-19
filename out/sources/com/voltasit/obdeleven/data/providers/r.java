package com.voltasit.obdeleven.data.providers;

import android.content.Context;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: PackageProviderImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class r implements J8.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f30275a;

    public r(Context context) {
        this.f30275a = context;
    }

    @Override // J8.s
    public final String a() {
        Signature[] signingCertificateHistory;
        try {
            int i10 = Build.VERSION.SDK_INT;
            Context context = this.f30275a;
            if (i10 >= 28) {
                SigningInfo signingInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 134217728).signingInfo;
                signingCertificateHistory = signingInfo != null ? signingInfo.getSigningCertificateHistory() : null;
                if (signingCertificateHistory == null) {
                    signingCertificateHistory = new Signature[0];
                }
            } else {
                signingCertificateHistory = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
                if (signingCertificateHistory == null) {
                    signingCertificateHistory = new Signature[0];
                }
            }
            ArrayList arrayList = new ArrayList(signingCertificateHistory.length);
            for (Signature signature : signingCertificateHistory) {
                arrayList.add(signature.toByteArray());
            }
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it.next();
            while (it.hasNext()) {
                byte[] bArr = (byte[]) it.next();
                byte[] bArr2 = (byte[]) next;
                kotlin.jvm.internal.i.b(bArr2);
                kotlin.jvm.internal.i.b(bArr);
                next = Q3.d.G(bArr2, bArr);
            }
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            kotlin.jvm.internal.i.d(messageDigest, "getInstance(...)");
            byte[] bArrDigest = messageDigest.digest((byte[]) next);
            kotlin.jvm.internal.i.d(bArrDigest, "digest(...)");
            return E8.a.g(bArrDigest);
        } catch (Throwable unused) {
            return "";
        }
    }
}
