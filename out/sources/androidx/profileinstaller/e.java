package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: ProfileVerifier.java */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p052e0.b<c> f19474a = new p052e0.b<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f19475b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static c f19476c = null;

    /* JADX INFO: compiled from: ProfileVerifier.java */
    public static class a {
        public static PackageInfo a(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    /* JADX INFO: compiled from: ProfileVerifier.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f19477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f19478b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f19479c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f19480d;

        public b(int i10, int i11, long j, long j10) {
            this.f19477a = i10;
            this.f19478b = i11;
            this.f19479c = j;
            this.f19480d = j10;
        }

        public static b a(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public final void b(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f19477a);
                dataOutputStream.writeInt(this.f19478b);
                dataOutputStream.writeLong(this.f19479c);
                dataOutputStream.writeLong(this.f19480d);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f19478b == bVar.f19478b && this.f19479c == bVar.f19479c && this.f19477a == bVar.f19477a && this.f19480d == bVar.f19480d;
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.f19478b), Long.valueOf(this.f19479c), Integer.valueOf(this.f19477a), Long.valueOf(this.f19480d));
        }
    }

    /* JADX INFO: compiled from: ProfileVerifier.java */
    public static class c {
    }

    public static long a(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static c b() {
        c cVar = new c();
        f19476c = cVar;
        f19474a.k(cVar);
        return f19476c;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x00f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x002b  */
    /* JADX WARN: Code duplicated, block: B:21:0x002d  */
    /* JADX WARN: Code duplicated, block: B:44:0x006f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e7  */
    public static void c(Context context, boolean z10) {
        int i10;
        boolean z11;
        int i11;
        File file;
        boolean z12;
        File file2;
        long length;
        boolean z13;
        File file3;
        b bVarA;
        int i12;
        b bVar;
        int i13;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        if (z10 || f19476c == null) {
            synchronized (f19475b) {
                if (z10) {
                    i10 = 0;
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    if (assetFileDescriptorOpenFd.getLength() > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    assetFileDescriptorOpenFd.close();
                    i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 28) {
                        file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                        long length2 = file.length();
                        if (file.exists()) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                        length = file2.length();
                        if (file2.exists()) {
                            z13 = false;
                        } else {
                            z13 = false;
                        }
                        long jA = a(context);
                        file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            bVarA = b.a(file3);
                        } else {
                            bVarA = null;
                        }
                        if (bVarA == null) {
                            if (!z11) {
                                i10 = 327680;
                            } else if (z12) {
                                i10 = 1;
                            } else if (z13) {
                                i10 = 2;
                            }
                        } else if (!z11) {
                            i10 = 327680;
                        } else if (z12) {
                            i10 = 1;
                        } else if (z13) {
                            i10 = 2;
                        }
                        if (z10) {
                            i10 = 2;
                        }
                        if (bVarA == null) {
                            i12 = i10;
                        } else {
                            i12 = i10;
                        }
                        bVar = new b(1, i12, jA, length);
                        if (bVarA != null) {
                            bVar.b(file3);
                        } else {
                            bVar.b(file3);
                        }
                        b();
                        return;
                    }
                    b();
                    return;
                }
                if (f19476c != null) {
                    return;
                }
                i10 = 0;
                try {
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        if (assetFileDescriptorOpenFd.getLength() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        assetFileDescriptorOpenFd.close();
                    } catch (Throwable th) {
                        if (assetFileDescriptorOpenFd == null) {
                            throw th;
                        }
                        try {
                            assetFileDescriptorOpenFd.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (IOException unused) {
                    z11 = false;
                }
                i11 = Build.VERSION.SDK_INT;
                if (i11 >= 28 && i11 != 30) {
                    file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length3 = file.length();
                    if (file.exists() || length3 <= 0) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length = file2.length();
                    if (file2.exists() || length <= 0) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    try {
                        long jA2 = a(context);
                        file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                bVarA = b.a(file3);
                            } catch (IOException unused2) {
                                b();
                                return;
                            }
                        } else {
                            bVarA = null;
                        }
                        if (bVarA == null && bVarA.f19479c == jA2 && (i13 = bVarA.f19478b) != 2) {
                            i10 = i13;
                        } else if (!z11) {
                            i10 = 327680;
                        } else if (z12) {
                            i10 = 1;
                        } else if (z13) {
                            i10 = 2;
                        }
                        if (z10 && z13 && i10 != 1) {
                            i10 = 2;
                        }
                        if (bVarA == null && bVarA.f19478b == 2 && i10 == 1 && length3 < bVarA.f19480d) {
                            i12 = 3;
                        } else {
                            i12 = i10;
                        }
                        bVar = new b(1, i12, jA2, length);
                        if (bVarA != null || !bVarA.equals(bVar)) {
                            try {
                                bVar.b(file3);
                            } catch (IOException unused3) {
                            }
                        }
                        b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused4) {
                        b();
                        return;
                    }
                }
                b();
                return;
                throw th;
            }
        }
    }
}
