package P8;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: FileLogger.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends Thread implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedBlockingQueue f4957b = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f4958c;

    /* JADX INFO: compiled from: FileLogger.java */
    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Date f4959a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4960b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f4961c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f4962d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Throwable f4963e;

        public final void a(PrintWriter printWriter) {
            String str;
            printWriter.print(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US).format(this.f4959a));
            printWriter.print(' ');
            Throwable th = this.f4963e;
            if (th != null) {
                th.printStackTrace(printWriter);
            } else {
                switch (this.f4960b) {
                    case 2:
                        str = "V";
                        break;
                    case 3:
                        str = "D";
                        break;
                    case 4:
                        str = "I";
                        break;
                    case 5:
                        str = "W";
                        break;
                    case 6:
                        str = "E";
                        break;
                    case 7:
                        str = "WTF";
                        break;
                    default:
                        str = "?";
                        break;
                }
                StringBuilder sbF = C4.b.f(str, "/");
                sbF.append(this.f4961c);
                sbF.append(".");
                sbF.append(this.f4962d);
                printWriter.println(sbF.toString());
            }
            printWriter.flush();
        }
    }

    public b(File file) {
        this.f4958c = file;
    }

    @Override // P8.d
    public final void a() {
        start();
    }

    @Override // P8.d
    public final void b(int i10, String str, String str2) {
        if (isAlive()) {
            LinkedBlockingQueue linkedBlockingQueue = this.f4957b;
            a aVar = new a();
            aVar.f4959a = new Date();
            aVar.f4960b = i10;
            aVar.f4961c = str;
            aVar.f4962d = str2;
            linkedBlockingQueue.add(aVar);
        }
    }

    @Override // P8.d
    public final void c(Throwable th) {
        if (isAlive()) {
            LinkedBlockingQueue linkedBlockingQueue = this.f4957b;
            a aVar = new a();
            aVar.f4959a = new Date();
            aVar.f4963e = th;
            linkedBlockingQueue.add(aVar);
        }
    }

    @Override // P8.d
    public final void d() {
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        File file = this.f4958c;
        try {
            if (!file.exists()) {
                file.getParentFile().mkdirs();
                file.createNewFile();
            }
            PrintWriter printWriter = new PrintWriter(new FileOutputStream(file));
            while (true) {
                try {
                    ((a) this.f4957b.take()).a(printWriter);
                } catch (InterruptedException e10) {
                    O.e.m(e10);
                    printWriter.flush();
                    printWriter.close();
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        } catch (IOException unused) {
        }
    }
}
