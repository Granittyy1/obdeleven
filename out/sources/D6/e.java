package D6;

import A6.f0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import p302y6.C2813i;

/* JADX INFO: compiled from: CrashlyticsReportPersistence.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f2805e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f2806f = 15;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final B6.e f2807g = new B6.e();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f2808h = new a(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f2809i = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f2810a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f2811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.firebase.crashlytics.internal.settings.a f2812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2813i f2813d;

    public e(f fVar, com.google.firebase.crashlytics.internal.settings.a aVar, C2813i c2813i) {
        this.f2811b = fVar;
        this.f2812c = aVar;
        this.f2813d = c2813i;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String e(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i10 = fileInputStream.read(bArr);
                if (i10 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f2805e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void f(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f2805e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        f fVar = this.f2811b;
        arrayList.addAll(f.e(fVar.f2818e.listFiles()));
        arrayList.addAll(f.e(fVar.f2819f.listFiles()));
        a aVar = f2808h;
        Collections.sort(arrayList, aVar);
        List listE = f.e(fVar.f2817d.listFiles());
        Collections.sort(listE, aVar);
        arrayList.addAll(listE);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(f.e(this.f2811b.f2816c.list())).descendingSet();
    }

    public final void d(f0.e.d dVar, String str, boolean z10) {
        f fVar = this.f2811b;
        F6.d.b bVar = this.f2812c.b().f3261a;
        f2807g.getClass();
        try {
            f(fVar.b(str, androidx.compose.foundation.gestures.d.b("event", String.format(Locale.US, "%010d", Integer.valueOf(this.f2810a.getAndIncrement())), z10 ? "_" : "")), B6.e.f1594a.a(dVar));
        } catch (IOException unused) {
        }
        c cVar = new c();
        fVar.getClass();
        File file = new File(fVar.f2816c, str);
        file.mkdirs();
        List<File> listE = f.e(file.listFiles(cVar));
        Collections.sort(listE, new d(0));
        int size = listE.size();
        for (File file2 : listE) {
            if (size <= bVar.f3270a) {
                return;
            }
            f.d(file2);
            size--;
        }
    }
}
