package S4;

import U4.C0804l;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.braze.support.BrazeLogger;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.common.zzah;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static j f5543c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile String f5545b;

    public j(Context context) {
        this.f5544a = context.getApplicationContext();
    }

    public static j a(Context context) {
        C0804l.h(context);
        synchronized (j.class) {
            if (f5543c == null) {
                t tVar = A.f5498a;
                synchronized (A.class) {
                    try {
                        if (A.f5502e == null) {
                            A.f5502e = context.getApplicationContext();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                f5543c = new j(context);
            }
        }
        return f5543c;
    }

    @Deprecated
    public static final boolean c(PackageInfo packageInfo, boolean z10) {
        zzah zzahVarV;
        int i10;
        if (packageInfo == null) {
            return false;
        }
        if (z10 && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z10 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
        }
        try {
            zzah zzahVar = z10 ? z.f5561c : z.f5560b;
            int i11 = Build.VERSION.SDK_INT;
            if (i11 < 28) {
                Signature[] signatureArr = packageInfo.signatures;
                byte[] byteArray = null;
                if (signatureArr != null && signatureArr.length == 1) {
                    byteArray = signatureArr[0].toByteArray();
                }
                if (byteArray != null) {
                    com.google.android.gms.internal.common.b bVar = zzah.f25363c;
                    Object[] objArr = {byteArray};
                    com.google.android.gms.internal.common.c.a(1, objArr);
                    zzahVarV = zzah.A(1, objArr);
                } else {
                    zzahVarV = zzah.v();
                }
            } else {
                if (i11 < 28) {
                    throw new IllegalStateException();
                }
                SigningInfo signingInfo = packageInfo.signingInfo;
                if (signingInfo == null || signingInfo.hasMultipleSigners() || signingInfo.getSigningCertificateHistory() == null) {
                    zzahVarV = zzah.v();
                } else {
                    com.google.android.gms.internal.common.b bVar2 = zzah.f25363c;
                    Object[] objArrCopyOf = new Object[4];
                    Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                    int length = signingCertificateHistory.length;
                    int i12 = 0;
                    int i13 = 0;
                    while (i12 < length) {
                        byte[] byteArray2 = signingCertificateHistory[i12].toByteArray();
                        byteArray2.getClass();
                        int length2 = objArrCopyOf.length;
                        int i14 = i13 + 1;
                        if (i14 < 0) {
                            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
                        }
                        if (i14 <= length2) {
                            i10 = length2;
                        } else {
                            i10 = (length2 >> 1) + length2 + 1;
                            if (i10 < i14) {
                                int iHighestOneBit = Integer.highestOneBit(i13);
                                i10 = iHighestOneBit + iHighestOneBit;
                            }
                            if (i10 < 0) {
                                i10 = BrazeLogger.SUPPRESS;
                            }
                        }
                        if (i10 > length2) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, i10);
                        }
                        objArrCopyOf[i13] = byteArray2;
                        i12++;
                        i13 = i14;
                    }
                    zzahVarV = zzah.A(i13, objArrCopyOf);
                }
            }
            if (zzahVarV.isEmpty()) {
                throw new IllegalArgumentException("Unable to obtain package certificate history.");
            }
            zzah zzahVarQ = zzahVarV.q();
            int size = zzahVarQ.size();
            int i15 = 0;
            while (i15 < size) {
                byte[] bArr = (byte[]) zzahVarQ.get(i15);
                com.google.android.gms.internal.common.b bVarB = zzahVar.listIterator(0);
                do {
                    int i16 = i15 + 1;
                    if (!bVarB.hasNext()) {
                        i15 = i16;
                    }
                } while (!Arrays.equals(bArr, (byte[]) bVarB.next()));
                return true;
            }
            return false;
        } catch (IllegalArgumentException unused) {
            return (z10 ? d(packageInfo, z.f5559a) : d(packageInfo, z.f5559a[0])) != null;
        }
    }

    public static v d(PackageInfo packageInfo, v... vVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        w wVar = new w(packageInfo.signatures[0].toByteArray());
        for (int i10 = 0; i10 < vVarArr.length; i10++) {
            if (vVarArr[i10].equals(wVar)) {
                return vVarArr[i10];
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:92:0x0196  */
    public final boolean b(int i10) {
        I iB;
        int length;
        String str;
        ApplicationInfo applicationInfo;
        String str2;
        String[] packagesForUid = this.f5544a.getPackageManager().getPackagesForUid(i10);
        if (packagesForUid == null || (length = packagesForUid.length) == 0) {
            iB = I.b("no pkgs");
        } else {
            iB = null;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    C0804l.h(iB);
                    break;
                }
                String str3 = packagesForUid[i11];
                if (str3 == null) {
                    iB = I.b("null pkg");
                } else if (str3.equals(this.f5545b)) {
                    iB = I.f5520c;
                } else {
                    t tVar = A.f5498a;
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            A.a();
                            boolean zC = A.f5500c.c();
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            if (zC) {
                                boolean zA = C0764f.a(this.f5544a);
                                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                                try {
                                    C0804l.h(A.f5502e);
                                    try {
                                        A.a();
                                        C0804l.h(A.f5502e);
                                        str2 = str3;
                                        try {
                                            D dI = A.f5500c.I(new B(str3, zA, false, new p018b5.b(A.f5502e), false, true, false));
                                            if (dI.f5510b) {
                                                o.s(dI.f5513e);
                                                iB = new I(true, null, null);
                                            } else {
                                                String str4 = dI.f5511c;
                                                PackageManager.NameNotFoundException nameNotFoundException = kotlinx.coroutines.C.x(dI.f5512d) == 4 ? new PackageManager.NameNotFoundException() : null;
                                                if (str4 == null) {
                                                    str4 = "error checking package certificate";
                                                }
                                                o.s(dI.f5513e);
                                                kotlinx.coroutines.C.x(dI.f5512d);
                                                iB = new I(false, str4, nameNotFoundException);
                                            }
                                        } catch (RemoteException e10) {
                                            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                                            iB = I.c("module call", e10);
                                        }
                                    } catch (DynamiteModule.LoadingException e11) {
                                        str2 = str3;
                                        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
                                        iB = I.c("module init: ".concat(String.valueOf(e11.getMessage())), e11);
                                    }
                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                                    str = str2;
                                } catch (Throwable th) {
                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                                    throw th;
                                }
                            } else {
                                try {
                                    str = str3;
                                    try {
                                        PackageInfo packageInfo = this.f5544a.getPackageManager().getPackageInfo(str, Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
                                        boolean zA2 = C0764f.a(this.f5544a);
                                        if (packageInfo == null) {
                                            iB = I.b("null pkg");
                                        } else {
                                            Signature[] signatureArr = packageInfo.signatures;
                                            if (signatureArr == null || signatureArr.length != 1) {
                                                iB = I.b("single cert required");
                                            } else {
                                                w wVar = new w(packageInfo.signatures[0].toByteArray());
                                                String str5 = packageInfo.packageName;
                                                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads3 = StrictMode.allowThreadDiskReads();
                                                try {
                                                    I iB2 = A.b(str5, wVar, zA2, false);
                                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                                    if (iB2.f5521a && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0) {
                                                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads4 = StrictMode.allowThreadDiskReads();
                                                        try {
                                                            I iB3 = A.b(str5, wVar, false, true);
                                                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
                                                            if (iB3.f5521a) {
                                                                iB = I.b("debuggable release cert app rejected");
                                                            }
                                                        } catch (Throwable th2) {
                                                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
                                                            throw th2;
                                                        }
                                                    }
                                                    iB = iB2;
                                                } catch (Throwable th3) {
                                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                                    throw th3;
                                                }
                                            }
                                        }
                                        if (iB.f5521a) {
                                            this.f5545b = str;
                                        }
                                    } catch (PackageManager.NameNotFoundException e12) {
                                        e = e12;
                                        iB = I.c("no pkg ".concat(str), e);
                                    }
                                } catch (PackageManager.NameNotFoundException e13) {
                                    e = e13;
                                    str = str3;
                                }
                            }
                        } catch (Throwable th4) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th4;
                        }
                    } catch (RemoteException | DynamiteModule.LoadingException e14) {
                        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e14);
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    }
                    if (iB.f5521a) {
                        this.f5545b = str;
                    }
                }
                if (iB.f5521a) {
                    break;
                }
                i11++;
            }
        }
        if (!iB.f5521a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (iB.f5522b != null) {
                iB.a();
            } else {
                iB.a();
            }
        }
        return iB.f5521a;
    }
}
