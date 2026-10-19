package Y4;

import U4.C0804l;
import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f7606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f7607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Boolean f7608c;

    public static String a() throws Throwable {
        BufferedReader bufferedReader;
        if (f7606a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f7606a = Application.getProcessName();
            } else {
                int iMyPid = f7607b;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    f7607b = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                if (iMyPid > 0) {
                    try {
                        try {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(iMyPid).length() + 14);
                            sb2.append("/proc/");
                            sb2.append(iMyPid);
                            sb2.append("/cmdline");
                            String string = sb2.toString();
                            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                            try {
                                bufferedReader = new BufferedReader(new FileReader(string));
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                try {
                                    String line = bufferedReader.readLine();
                                    C0804l.h(line);
                                    strTrim = line.trim();
                                } catch (IOException unused) {
                                    if (bufferedReader != null) {
                                    }
                                    f7606a = strTrim;
                                    return f7606a;
                                } catch (Throwable th) {
                                    th = th;
                                    bufferedReader2 = bufferedReader;
                                    if (bufferedReader2 != null) {
                                        try {
                                            bufferedReader2.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                throw th2;
                            }
                        } catch (IOException unused3) {
                            bufferedReader = null;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                        bufferedReader.close();
                    } catch (IOException unused4) {
                    }
                }
                f7606a = strTrim;
            }
        }
        return f7606a;
    }
}
