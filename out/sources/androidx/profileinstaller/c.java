package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: ProfileInstaller.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f19471a = new a();

    /* JADX INFO: compiled from: ProfileInstaller.java */
    public class b implements InterfaceC0196c {
        @Override // androidx.profileinstaller.c.InterfaceC0196c
        public final void a(int i10, Serializable serializable) {
            String str;
            switch (i10) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 9:
                default:
                    str = "";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i10 == 6 || i10 == 7 || i10 == 8) {
                Log.e("ProfileInstaller", str, (Throwable) serializable);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ProfileInstaller.java */
    public interface InterfaceC0196c {
        void a(int i10, Serializable serializable);
    }

    public static void a(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0175 A[Catch: all -> 0x0172, TRY_ENTER, TryCatch #12 {all -> 0x0172, blocks: (B:97:0x0150, B:99:0x015c, B:110:0x0175, B:111:0x017a), top: B:276:0x0150 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x0185 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0187 A[Catch: IllegalStateException -> 0x016b, IOException -> 0x016d, FileNotFoundException -> 0x0170, TRY_LEAVE, TryCatch #35 {FileNotFoundException -> 0x0170, IOException -> 0x016d, IllegalStateException -> 0x016b, blocks: (B:95:0x0148, B:100:0x0166, B:119:0x0187, B:117:0x0184, B:116:0x0181), top: B:311:0x0148 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x019d  */
    /* JADX WARN: Code duplicated, block: B:129:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c0 A[Catch: all -> 0x01cf, TRY_LEAVE, TryCatch #27 {all -> 0x01cf, blocks: (B:135:0x01b4, B:137:0x01c0, B:146:0x01d2), top: B:296:0x01b4 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x01d2 A[Catch: all -> 0x01cf, TRY_ENTER, TRY_LEAVE, TryCatch #27 {all -> 0x01cf, blocks: (B:135:0x01b4, B:137:0x01c0, B:146:0x01d2), top: B:296:0x01b4 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:162:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:163:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:172:0x021e A[Catch: all -> 0x025d, TryCatch #39 {all -> 0x025d, blocks: (B:170:0x0218, B:172:0x021e, B:173:0x0222, B:175:0x0228), top: B:301:0x0218 }] */
    /* JADX WARN: Code duplicated, block: B:175:0x0228 A[Catch: all -> 0x025d, TRY_LEAVE, TryCatch #39 {all -> 0x025d, blocks: (B:170:0x0218, B:172:0x021e, B:173:0x0222, B:175:0x0228), top: B:301:0x0218 }] */
    /* JADX WARN: Code duplicated, block: B:245:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:248:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:253:0x02c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:255:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:276:0x0150 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:0x0218 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:305:0x0202 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:309:0x01af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:310:0x00e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x0148 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:312:0x022d A[EDGE_INSN: B:312:0x022d->B:177:0x022d BREAK  A[LOOP:0: B:173:0x0222->B:313:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ef A[Catch: all -> 0x0108, IllegalStateException -> 0x010a, IOException -> 0x010c, TRY_LEAVE, TryCatch #36 {IOException -> 0x010c, IllegalStateException -> 0x010a, blocks: (B:54:0x00e5, B:56:0x00ef, B:69:0x010e, B:70:0x0113), top: B:310:0x00e5, outer: #22 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x010e A[Catch: all -> 0x0108, IllegalStateException -> 0x010a, IOException -> 0x010c, TRY_ENTER, TryCatch #36 {IOException -> 0x010c, IllegalStateException -> 0x010a, blocks: (B:54:0x00e5, B:56:0x00ef, B:69:0x010e, B:70:0x0113), top: B:310:0x00e5, outer: #22 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0142  */
    /* JADX WARN: Code duplicated, block: B:99:0x015c A[Catch: all -> 0x0172, TRY_LEAVE, TryCatch #12 {all -> 0x0172, blocks: (B:97:0x0150, B:99:0x015c, B:110:0x0175, B:111:0x017a), top: B:276:0x0150 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static void b(Context context, Executor executor, InterfaceC0196c interfaceC0196c, boolean z10) {
        byte[] bArr;
        ?? A10;
        IOException iOException;
        int i10;
        p201q2.b[] bVarArrG;
        p201q2.b[] bVarArr;
        InterfaceC0196c interfaceC0196c2;
        p201q2.b[] bVarArr2;
        ?? r10;
        byte[] bArr2;
        ?? r11;
        boolean z11;
        ByteArrayInputStream byteArrayInputStream;
        Throwable th;
        FileOutputStream fileOutputStream;
        Throwable th2;
        FileChannel channel;
        FileLock fileLockTryLock;
        byte[] bArr3;
        int i11;
        byte[] bArr4;
        boolean z12;
        ?? r12;
        ByteArrayOutputStream byteArrayOutputStream;
        androidx.profileinstaller.b bVar;
        FileInputStream fileInputStreamA;
        boolean zEquals;
        ?? r13;
        boolean z13;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            ?? r15 = 1;
            if (!z10) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j = dataInputStream.readLong();
                            dataInputStream.close();
                            z13 = j == packageInfo.lastUpdateTime;
                            if (z13) {
                                interfaceC0196c.a(2, null);
                            }
                        } catch (Throwable th3) {
                            try {
                                dataInputStream.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (IOException unused) {
                        z13 = false;
                    }
                } else {
                    z13 = false;
                }
                if (z13) {
                    context.getPackageName();
                    e.c(context, false);
                    return;
                }
            }
            context.getPackageName();
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            androidx.profileinstaller.b bVar2 = new androidx.profileinstaller.b(assets, executor, interfaceC0196c, name, file2);
            byte[] bArr5 = bVar2.f19465c;
            if (bArr5 != null) {
                if (!file2.exists()) {
                    try {
                        if (file2.createNewFile()) {
                            bVar2.f19468f = true;
                            bArr = d.f19472a;
                            A10 = bVar2.a(assets, "dexopt/baseline.prof");
                            if (A10 != 0) {
                                if (Arrays.equals(bArr, p201q2.c.b(A10, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                bVarArrG = d.g(A10, p201q2.c.b(A10, 4), bVar2.f19467e);
                                A10.close();
                                A10 = A10;
                                bVar2.f19469g = bVarArrG;
                            }
                            bVarArr = bVar2.f19469g;
                            if (bVarArr != null) {
                                A10 = 31;
                                A10 = 31;
                                if (Build.VERSION.SDK_INT >= 31) {
                                    fileInputStreamA = bVar2.a(assets, "dexopt/baseline.profm");
                                    if (fileInputStreamA != null) {
                                        zEquals = Arrays.equals(d.f19473b, p201q2.c.b(fileInputStreamA, 4));
                                        if (zEquals) {
                                            throw new IllegalStateException("Invalid magic");
                                        }
                                        bVar2.f19469g = d.d(fileInputStreamA, p201q2.c.b(fileInputStreamA, 4), bArr5, bVarArr);
                                        fileInputStreamA.close();
                                        bVar = bVar2;
                                        A10 = zEquals;
                                    } else {
                                        if (fileInputStreamA != null) {
                                            fileInputStreamA.close();
                                        }
                                        bVar = null;
                                    }
                                    if (bVar != null) {
                                        bVar2 = bVar;
                                    }
                                }
                            }
                            interfaceC0196c2 = bVar2.f19464b;
                            bVarArr2 = bVar2.f19469g;
                            r10 = A10;
                            if (bVarArr2 != null) {
                                z12 = bVar2.f19468f;
                                if (z12) {
                                    r10 = A10;
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                r10 = A10;
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                byteArrayOutputStream.write(bArr);
                                byteArrayOutputStream.write(bArr4);
                                if (d.i(byteArrayOutputStream, bArr4, bVarArr2)) {
                                    bVar2.f19470h = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    r12 = byteArrayOutputStream;
                                    bVar2.f19469g = null;
                                    r10 = r12;
                                } else {
                                    interfaceC0196c2.a(5, null);
                                    bVar2.f19469g = null;
                                    byteArrayOutputStream.close();
                                    r10 = byteArrayOutputStream;
                                }
                            }
                            r10 = A10;
                            bArr2 = bVar2.f19470h;
                            if (bArr2 != null) {
                                if (bVar2.f19468f) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                fileOutputStream = new FileOutputStream(bVar2.f19466d);
                                channel = fileOutputStream.getChannel();
                                fileLockTryLock = channel.tryLock();
                                if (fileLockTryLock != null) {
                                    if (fileLockTryLock.isValid()) {
                                        bArr3 = new byte[512];
                                        while (true) {
                                            i11 = byteArrayInputStream.read(bArr3);
                                            if (i11 > 0) {
                                                break;
                                                break;
                                            }
                                            fileOutputStream.write(bArr3, 0, i11);
                                        }
                                        r15 = 1;
                                        bVar2.b(1, null);
                                        fileLockTryLock.close();
                                        channel.close();
                                        fileOutputStream.close();
                                        byteArrayInputStream.close();
                                        bVar2.f19470h = null;
                                        bVar2.f19469g = null;
                                        z11 = true;
                                    }
                                }
                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                            }
                            z11 = false;
                            r15 = 1;
                            if (z11) {
                                a(packageInfo, filesDir);
                            }
                        } else {
                            bVar2.b(4, null);
                        }
                    } catch (IOException unused2) {
                        bVar2.b(4, null);
                    }
                } else if (file2.canWrite()) {
                    bVar2.f19468f = true;
                    bArr = d.f19472a;
                    try {
                        A10 = bVar2.a(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e10) {
                        interfaceC0196c.a(6, e10);
                        A10 = 0;
                    } catch (IOException e11) {
                        interfaceC0196c.a(7, e11);
                        A10 = 0;
                    }
                    try {
                        if (A10 != 0) {
                            try {
                                if (Arrays.equals(bArr, p201q2.c.b(A10, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                bVarArrG = d.g(A10, p201q2.c.b(A10, 4), bVar2.f19467e);
                                try {
                                    A10.close();
                                    A10 = A10;
                                } catch (IOException e12) {
                                    IOException iOException2 = e12;
                                    interfaceC0196c.a(7, iOException2);
                                    A10 = iOException2;
                                }
                                bVar2.f19469g = bVarArrG;
                            } catch (IOException e13) {
                                i10 = 7;
                                interfaceC0196c.a(7, e13);
                                try {
                                    A10.close();
                                } catch (IOException e14) {
                                    iOException = e14;
                                    interfaceC0196c.a(i10, iOException);
                                    bVarArrG = null;
                                    A10 = A10;
                                    bVar2.f19469g = bVarArrG;
                                    bVarArr = bVar2.f19469g;
                                    if (bVarArr != null) {
                                        A10 = 31;
                                        A10 = 31;
                                        if (Build.VERSION.SDK_INT >= 31) {
                                            try {
                                                fileInputStreamA = bVar2.a(assets, "dexopt/baseline.profm");
                                                if (fileInputStreamA != null) {
                                                    try {
                                                        zEquals = Arrays.equals(d.f19473b, p201q2.c.b(fileInputStreamA, 4));
                                                        if (zEquals) {
                                                            throw new IllegalStateException("Invalid magic");
                                                        }
                                                        bVar2.f19469g = d.d(fileInputStreamA, p201q2.c.b(fileInputStreamA, 4), bArr5, bVarArr);
                                                        fileInputStreamA.close();
                                                        bVar = bVar2;
                                                        A10 = zEquals;
                                                    } catch (Throwable th5) {
                                                        try {
                                                            fileInputStreamA.close();
                                                            throw th5;
                                                        } catch (Throwable th6) {
                                                            th5.addSuppressed(th6);
                                                            throw th5;
                                                        }
                                                    }
                                                } else {
                                                    if (fileInputStreamA != null) {
                                                        fileInputStreamA.close();
                                                    }
                                                    bVar = null;
                                                }
                                            } catch (FileNotFoundException e15) {
                                                interfaceC0196c.a(9, e15);
                                            } catch (IOException e16) {
                                                interfaceC0196c.a(7, e16);
                                            } catch (IllegalStateException e17) {
                                                bVar2.f19469g = null;
                                                interfaceC0196c.a(8, e17);
                                            }
                                            if (bVar != null) {
                                                bVar2 = bVar;
                                            }
                                        }
                                    }
                                    interfaceC0196c2 = bVar2.f19464b;
                                    bVarArr2 = bVar2.f19469g;
                                    r10 = A10;
                                    if (bVarArr2 != null) {
                                        z12 = bVar2.f19468f;
                                        if (z12) {
                                            r10 = A10;
                                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                        }
                                        try {
                                            r10 = A10;
                                            byteArrayOutputStream = new ByteArrayOutputStream();
                                            try {
                                                byteArrayOutputStream.write(bArr);
                                                byteArrayOutputStream.write(bArr4);
                                                if (d.i(byteArrayOutputStream, bArr4, bVarArr2)) {
                                                    interfaceC0196c2.a(5, null);
                                                    bVar2.f19469g = null;
                                                    byteArrayOutputStream.close();
                                                    r10 = byteArrayOutputStream;
                                                } else {
                                                    bVar2.f19470h = byteArrayOutputStream.toByteArray();
                                                    byteArrayOutputStream.close();
                                                    r12 = byteArrayOutputStream;
                                                    bVar2.f19469g = null;
                                                    r10 = r12;
                                                }
                                            } catch (Throwable th7) {
                                                try {
                                                    byteArrayOutputStream.close();
                                                    throw th7;
                                                } catch (Throwable th8) {
                                                    th7.addSuppressed(th8);
                                                    throw th7;
                                                }
                                            }
                                        } catch (IOException e18) {
                                            interfaceC0196c2.a(7, e18);
                                            r12 = z12;
                                        } catch (IllegalStateException e19) {
                                            interfaceC0196c2.a(8, e19);
                                            r12 = z12;
                                        }
                                    }
                                    r10 = A10;
                                    bArr2 = bVar2.f19470h;
                                    if (bArr2 != null) {
                                        z11 = false;
                                        r15 = 1;
                                    } else {
                                        try {
                                            if (bVar2.f19468f) {
                                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                            }
                                            try {
                                                try {
                                                    byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                                    try {
                                                        try {
                                                            fileOutputStream = new FileOutputStream(bVar2.f19466d);
                                                            try {
                                                                try {
                                                                    channel = fileOutputStream.getChannel();
                                                                    try {
                                                                        fileLockTryLock = channel.tryLock();
                                                                        try {
                                                                            try {
                                                                                if (fileLockTryLock != null) {
                                                                                    try {
                                                                                        if (fileLockTryLock.isValid()) {
                                                                                            bArr3 = new byte[512];
                                                                                            while (true) {
                                                                                                i11 = byteArrayInputStream.read(bArr3);
                                                                                                if (i11 > 0) {
                                                                                                    break;
                                                                                                } else {
                                                                                                    fileOutputStream.write(bArr3, 0, i11);
                                                                                                }
                                                                                            }
                                                                                            r15 = 1;
                                                                                            bVar2.b(1, null);
                                                                                            fileLockTryLock.close();
                                                                                            channel.close();
                                                                                            fileOutputStream.close();
                                                                                            byteArrayInputStream.close();
                                                                                            bVar2.f19470h = null;
                                                                                            bVar2.f19469g = null;
                                                                                            z11 = true;
                                                                                        }
                                                                                    } catch (Throwable th9) {
                                                                                        th = th9;
                                                                                        Throwable th10 = th;
                                                                                        if (fileLockTryLock == null) {
                                                                                            throw th10;
                                                                                        }
                                                                                        try {
                                                                                            fileLockTryLock.close();
                                                                                            throw th10;
                                                                                        } catch (Throwable th11) {
                                                                                            th10.addSuppressed(th11);
                                                                                            throw th10;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                            } catch (Throwable th12) {
                                                                                th = th12;
                                                                                Throwable th13 = th;
                                                                                if (channel == null) {
                                                                                    throw th13;
                                                                                }
                                                                                try {
                                                                                    channel.close();
                                                                                    throw th13;
                                                                                } catch (Throwable th14) {
                                                                                    th13.addSuppressed(th14);
                                                                                    throw th13;
                                                                                }
                                                                            }
                                                                        } catch (Throwable th15) {
                                                                            th = th15;
                                                                        }
                                                                    } catch (Throwable th16) {
                                                                        th = th16;
                                                                    }
                                                                } catch (Throwable th17) {
                                                                    th = th17;
                                                                    th2 = th;
                                                                    try {
                                                                        fileOutputStream.close();
                                                                        throw th2;
                                                                    } catch (Throwable th18) {
                                                                        th2.addSuppressed(th18);
                                                                        throw th2;
                                                                    }
                                                                }
                                                            } catch (Throwable th19) {
                                                                th = th19;
                                                                th2 = th;
                                                                fileOutputStream.close();
                                                                throw th2;
                                                            }
                                                        } catch (Throwable th20) {
                                                            th = th20;
                                                            th = th;
                                                            try {
                                                                byteArrayInputStream.close();
                                                                throw th;
                                                            } catch (Throwable th21) {
                                                                th.addSuppressed(th21);
                                                                throw th;
                                                            }
                                                        }
                                                    } catch (Throwable th22) {
                                                        th = th22;
                                                        th = th;
                                                        byteArrayInputStream.close();
                                                        throw th;
                                                    }
                                                } catch (FileNotFoundException e20) {
                                                    e = e20;
                                                    r10 = 1;
                                                    bVar2.b(6, e);
                                                    r11 = r10;
                                                    bVar2.f19470h = null;
                                                    bVar2.f19469g = null;
                                                    z11 = false;
                                                    r15 = r11;
                                                } catch (IOException e21) {
                                                    e = e21;
                                                    r10 = 1;
                                                    bVar2.b(7, e);
                                                    r11 = r10;
                                                    bVar2.f19470h = null;
                                                    bVar2.f19469g = null;
                                                    z11 = false;
                                                    r15 = r11;
                                                }
                                            } catch (FileNotFoundException e22) {
                                                e = e22;
                                                bVar2.b(6, e);
                                                r11 = r10;
                                                bVar2.f19470h = null;
                                                bVar2.f19469g = null;
                                                z11 = false;
                                                r15 = r11;
                                            } catch (IOException e23) {
                                                e = e23;
                                                bVar2.b(7, e);
                                                r11 = r10;
                                                bVar2.f19470h = null;
                                                bVar2.f19469g = null;
                                                z11 = false;
                                                r15 = r11;
                                            }
                                        } catch (Throwable th23) {
                                            bVar2.f19470h = null;
                                            bVar2.f19469g = null;
                                            throw th23;
                                        }
                                    }
                                    if (z11) {
                                        a(packageInfo, filesDir);
                                    }
                                    if (z11) {
                                        r13 = 0;
                                    } else {
                                        r13 = 0;
                                    }
                                    e.c(context, r13);
                                }
                                bVarArrG = null;
                                A10 = A10;
                            } catch (IllegalStateException e24) {
                                try {
                                    interfaceC0196c.a(8, e24);
                                    try {
                                        A10.close();
                                    } catch (IOException e25) {
                                        iOException = e25;
                                        i10 = 7;
                                        interfaceC0196c.a(i10, iOException);
                                        bVarArrG = null;
                                        A10 = A10;
                                        bVar2.f19469g = bVarArrG;
                                        bVarArr = bVar2.f19469g;
                                        if (bVarArr != null) {
                                            A10 = 31;
                                            A10 = 31;
                                            if (Build.VERSION.SDK_INT >= 31) {
                                                fileInputStreamA = bVar2.a(assets, "dexopt/baseline.profm");
                                                if (fileInputStreamA != null) {
                                                    zEquals = Arrays.equals(d.f19473b, p201q2.c.b(fileInputStreamA, 4));
                                                    if (zEquals) {
                                                        throw new IllegalStateException("Invalid magic");
                                                    }
                                                    bVar2.f19469g = d.d(fileInputStreamA, p201q2.c.b(fileInputStreamA, 4), bArr5, bVarArr);
                                                    fileInputStreamA.close();
                                                    bVar = bVar2;
                                                    A10 = zEquals;
                                                } else {
                                                    if (fileInputStreamA != null) {
                                                        fileInputStreamA.close();
                                                    }
                                                    bVar = null;
                                                }
                                                if (bVar != null) {
                                                    bVar2 = bVar;
                                                }
                                            }
                                        }
                                        interfaceC0196c2 = bVar2.f19464b;
                                        bVarArr2 = bVar2.f19469g;
                                        r10 = A10;
                                        if (bVarArr2 != null) {
                                            z12 = bVar2.f19468f;
                                            if (z12) {
                                                r10 = A10;
                                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                            }
                                            r10 = A10;
                                            byteArrayOutputStream = new ByteArrayOutputStream();
                                            byteArrayOutputStream.write(bArr);
                                            byteArrayOutputStream.write(bArr4);
                                            if (d.i(byteArrayOutputStream, bArr4, bVarArr2)) {
                                                interfaceC0196c2.a(5, null);
                                                bVar2.f19469g = null;
                                                byteArrayOutputStream.close();
                                                r10 = byteArrayOutputStream;
                                            } else {
                                                bVar2.f19470h = byteArrayOutputStream.toByteArray();
                                                byteArrayOutputStream.close();
                                                r12 = byteArrayOutputStream;
                                                bVar2.f19469g = null;
                                                r10 = r12;
                                            }
                                        }
                                        r10 = A10;
                                        bArr2 = bVar2.f19470h;
                                        if (bArr2 != null) {
                                            if (bVar2.f19468f) {
                                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                            }
                                            byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                            fileOutputStream = new FileOutputStream(bVar2.f19466d);
                                            channel = fileOutputStream.getChannel();
                                            fileLockTryLock = channel.tryLock();
                                            if (fileLockTryLock != null) {
                                                if (fileLockTryLock.isValid()) {
                                                    bArr3 = new byte[512];
                                                    while (true) {
                                                        i11 = byteArrayInputStream.read(bArr3);
                                                        if (i11 > 0) {
                                                            break;
                                                            break;
                                                        }
                                                        fileOutputStream.write(bArr3, 0, i11);
                                                    }
                                                    r15 = 1;
                                                    bVar2.b(1, null);
                                                    fileLockTryLock.close();
                                                    channel.close();
                                                    fileOutputStream.close();
                                                    byteArrayInputStream.close();
                                                    bVar2.f19470h = null;
                                                    bVar2.f19469g = null;
                                                    z11 = true;
                                                }
                                            }
                                            throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                        }
                                        z11 = false;
                                        r15 = 1;
                                        if (z11) {
                                            a(packageInfo, filesDir);
                                        }
                                        if (z11) {
                                            r13 = 0;
                                        } else {
                                            r13 = 0;
                                        }
                                        e.c(context, r13);
                                    }
                                    bVarArrG = null;
                                    A10 = A10;
                                } catch (Throwable th24) {
                                    th = th24;
                                    Throwable th25 = th;
                                    try {
                                        A10.close();
                                        throw th25;
                                    } catch (IOException e26) {
                                        interfaceC0196c.a(7, e26);
                                        throw th25;
                                    }
                                }
                            }
                        }
                        bVarArr = bVar2.f19469g;
                        if (bVarArr != null) {
                            A10 = 31;
                            A10 = 31;
                            if (Build.VERSION.SDK_INT >= 31) {
                                fileInputStreamA = bVar2.a(assets, "dexopt/baseline.profm");
                                if (fileInputStreamA != null) {
                                    zEquals = Arrays.equals(d.f19473b, p201q2.c.b(fileInputStreamA, 4));
                                    if (zEquals) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    bVar2.f19469g = d.d(fileInputStreamA, p201q2.c.b(fileInputStreamA, 4), bArr5, bVarArr);
                                    fileInputStreamA.close();
                                    bVar = bVar2;
                                    A10 = zEquals;
                                } else {
                                    if (fileInputStreamA != null) {
                                        fileInputStreamA.close();
                                    }
                                    bVar = null;
                                }
                                if (bVar != null) {
                                    bVar2 = bVar;
                                }
                            }
                        }
                        interfaceC0196c2 = bVar2.f19464b;
                        bVarArr2 = bVar2.f19469g;
                        r10 = A10;
                        if (bVarArr2 != null && (bArr4 = bVar2.f19465c) != null) {
                            z12 = bVar2.f19468f;
                            if (z12) {
                                r10 = A10;
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            r10 = A10;
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            byteArrayOutputStream.write(bArr);
                            byteArrayOutputStream.write(bArr4);
                            if (d.i(byteArrayOutputStream, bArr4, bVarArr2)) {
                                interfaceC0196c2.a(5, null);
                                bVar2.f19469g = null;
                                byteArrayOutputStream.close();
                                r10 = byteArrayOutputStream;
                            } else {
                                bVar2.f19470h = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                r12 = byteArrayOutputStream;
                                bVar2.f19469g = null;
                                r10 = r12;
                            }
                        }
                        r10 = A10;
                        bArr2 = bVar2.f19470h;
                        if (bArr2 != null) {
                            if (bVar2.f19468f) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            byteArrayInputStream = new ByteArrayInputStream(bArr2);
                            fileOutputStream = new FileOutputStream(bVar2.f19466d);
                            channel = fileOutputStream.getChannel();
                            fileLockTryLock = channel.tryLock();
                            if (fileLockTryLock != null) {
                                if (fileLockTryLock.isValid()) {
                                    bArr3 = new byte[512];
                                    while (true) {
                                        i11 = byteArrayInputStream.read(bArr3);
                                        if (i11 > 0) {
                                            break;
                                            break;
                                        }
                                        fileOutputStream.write(bArr3, 0, i11);
                                    }
                                    r15 = 1;
                                    bVar2.b(1, null);
                                    fileLockTryLock.close();
                                    channel.close();
                                    fileOutputStream.close();
                                    byteArrayInputStream.close();
                                    bVar2.f19470h = null;
                                    bVar2.f19469g = null;
                                    z11 = true;
                                }
                            }
                            throw new IOException("Unable to acquire a lock on the underlying file channel.");
                        }
                        z11 = false;
                        r15 = 1;
                        if (z11) {
                            a(packageInfo, filesDir);
                        }
                    } catch (Throwable th26) {
                        th = th26;
                    }
                } else {
                    bVar2.b(4, null);
                }
                if (z11 || !z10) {
                    r13 = 0;
                } else {
                    r13 = r15;
                }
                e.c(context, r13);
            }
            bVar2.b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z11 = false;
            if (z11) {
                r13 = 0;
            } else {
                r13 = 0;
            }
            e.c(context, r13);
        } catch (PackageManager.NameNotFoundException e27) {
            interfaceC0196c.a(7, e27);
            e.c(context, false);
        }
    }

    /* JADX INFO: compiled from: ProfileInstaller.java */
    public class a implements InterfaceC0196c {
        @Override // androidx.profileinstaller.c.InterfaceC0196c
        public final void a(int i10, Serializable serializable) {
        }
    }
}
