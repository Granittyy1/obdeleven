package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import com.google.common.base.Optional;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1782b2 {

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b2$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static volatile Optional<InterfaceC1789c2> f25662a;
    }

    public static U1 a(Context context, File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                androidx.collection.X x10 = new androidx.collection.X();
                HashMap map = new HashMap();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        String.valueOf(file);
                        context.getPackageName();
                        U1 u10 = new U1(x10);
                        bufferedReader.close();
                        return u10;
                    }
                    String[] strArrSplit = line.split(" ", 3);
                    if (strArrSplit.length != 3) {
                        Log.e("HermeticFileOverrides", "Invalid: " + line);
                    } else {
                        String str = new String(strArrSplit[0]);
                        String strDecode = Uri.decode(new String(strArrSplit[1]));
                        String strDecode2 = (String) map.get(strArrSplit[2]);
                        if (strDecode2 == null) {
                            String str2 = new String(strArrSplit[2]);
                            strDecode2 = Uri.decode(str2);
                            if (strDecode2.length() < 1024 || strDecode2 == str2) {
                                map.put(str2, strDecode2);
                            }
                        }
                        androidx.collection.X x11 = (androidx.collection.X) x10.get(str);
                        if (x11 == null) {
                            x11 = new androidx.collection.X();
                            x10.put(str, x11);
                        }
                        x11.put(strDecode, strDecode2);
                    }
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static Optional<InterfaceC1789c2> b(Context context) {
        Optional optionalA;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            try {
                File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                optionalA = file.exists() ? Optional.d(file) : Optional.a();
            } catch (RuntimeException e10) {
                Log.e("HermeticFileOverrides", "no data dir", e10);
                optionalA = Optional.a();
            }
            Optional<InterfaceC1789c2> optionalD = optionalA.c() ? Optional.d(a(context, (File) optionalA.b())) : Optional.a();
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return optionalD;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }
}
