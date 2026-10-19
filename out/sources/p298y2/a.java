package p298y2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ProcessLock.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f48227e = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f48228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f48229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lock f48230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FileChannel f48231d;

    public a(String str, File file, boolean z10) {
        Lock lock;
        this.f48228a = z10;
        File file2 = new File(file, str.concat(".lck"));
        this.f48229b = file2;
        String absolutePath = file2.getAbsolutePath();
        i.d(absolutePath, "lockFile.absolutePath");
        HashMap map = f48227e;
        synchronized (map) {
            try {
                Object reentrantLock = map.get(absolutePath);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(absolutePath, reentrantLock);
                }
                lock = (Lock) reentrantLock;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f48230c = lock;
    }

    public final void a(boolean z10) {
        this.f48230c.lock();
        if (z10) {
            File file = this.f48229b;
            try {
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f48231d = channel;
            } catch (IOException unused) {
                this.f48231d = null;
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.f48231d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f48230c.unlock();
    }
}
