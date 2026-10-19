package p189p3;

import android.content.Context;
import com.airbnb.lottie.network.FileExtension;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
import p079g3.b;
import p079g3.j;
import p079g3.r;
import p214r3.c;

/* JADX INFO: compiled from: NetworkFetcher.java */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f45801a;

    public d(c cVar, b bVar) {
        this.f45801a = cVar;
    }

    public final r a(Context context, InputStream inputStream, String str, String str2) throws IOException {
        r<b> rVarD;
        if (str == null) {
            str = "application/json";
        }
        boolean zContains = str.contains("application/zip");
        c cVar = this.f45801a;
        if (!zContains && !str.contains("application/x-zip") && !str.contains("application/x-zip-compressed")) {
            throw null;
        }
        c.a();
        FileExtension fileExtension = FileExtension.ZIP;
        if (str2 != null) {
            cVar.getClass();
            File file = new File(cVar.b(), c.a(null, fileExtension, true));
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i10 = inputStream.read(bArr);
                        if (i10 == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, i10);
                    }
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    inputStream.close();
                    rVarD = j.d(context, new ZipInputStream(new FileInputStream(file)), null);
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } catch (Throwable th2) {
                inputStream.close();
                throw th2;
            }
        } else {
            rVarD = j.d(context, new ZipInputStream(inputStream), null);
        }
        if (str2 != null && rVarD.f35591a != null) {
            File file2 = new File(cVar.b(), c.a(null, fileExtension, true));
            File file3 = new File(file2.getAbsolutePath().replace(".temp", ""));
            boolean zRenameTo = file2.renameTo(file3);
            file3.toString();
            c.a();
            if (!zRenameTo) {
                c.b("Unable to rename cache file " + file2.getAbsolutePath() + " to " + file3.getAbsolutePath() + ".");
            }
        }
        return rVarD;
    }
}
