package D7;

import android.content.Context;
import android.util.Pair;
import com.airbnb.lottie.network.FileExtension;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2829d;

    public /* synthetic */ c(Object obj, int i10, Object obj2) {
        this.f2827b = i10;
        this.f2828c = obj;
        this.f2829d = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00a4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v16, types: [g3.r] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        p079g3.b bVar;
        V v10;
        Pair pair;
        p189p3.d dVar;
        p189p3.c cVar;
        switch (this.f2827b) {
            case 0:
                e eVar = (e) this.f2828c;
                com.google.firebase.remoteconfig.internal.b bVar2 = (com.google.firebase.remoteconfig.internal.b) this.f2829d;
                o oVar = eVar.f2835b;
                synchronized (oVar) {
                    FileOutputStream fileOutputStreamOpenFileOutput = oVar.f2869a.openFileOutput(oVar.f2870b, 0);
                    try {
                        fileOutputStreamOpenFileOutput.write(bVar2.f28585a.toString().getBytes("UTF-8"));
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Throwable th) {
                        fileOutputStreamOpenFileOutput.close();
                        throw th;
                    }
                }
                return null;
            default:
                p079g3.r rVar = (Context) this.f2828c;
                String str = (String) this.f2829d;
                p189p3.d dVar2 = p079g3.a.f35550a;
                p189p3.d dVar3 = dVar2;
                if (dVar2 == null) {
                    synchronized (p189p3.d.class) {
                        try {
                            p189p3.d dVar4 = p079g3.a.f35550a;
                            dVar = dVar4;
                            if (dVar4 == null) {
                                Context applicationContext = rVar.getApplicationContext();
                                p189p3.c cVar2 = p079g3.a.f35551b;
                                if (cVar2 == null) {
                                    synchronized (p189p3.c.class) {
                                        try {
                                            cVar = p079g3.a.f35551b;
                                            if (cVar == null) {
                                                cVar = new p189p3.c(new com.facebook.login.r(applicationContext));
                                                p079g3.a.f35551b = cVar;
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                        break;
                                    }
                                    cVar2 = cVar;
                                }
                                p189p3.d dVar5 = new p189p3.d(cVar2, new p189p3.b());
                                p079g3.a.f35550a = dVar5;
                                dVar = dVar5;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    dVar3 = dVar;
                }
                FileExtension fileExtension = FileExtension.ZIP;
                boolean z10 = false;
                AutoCloseable autoCloseable = null;
                if (str != null) {
                    p189p3.c cVar3 = dVar3.f45801a;
                    try {
                        File fileB = cVar3.b();
                        FileExtension fileExtension2 = FileExtension.JSON;
                        File file = new File(fileB, p189p3.c.a(null, fileExtension2, false));
                        if (!file.exists()) {
                            file = new File(cVar3.b(), p189p3.c.a(null, fileExtension, false));
                            if (!file.exists()) {
                                file = null;
                            }
                        }
                        if (file == null) {
                            pair = null;
                        } else {
                            FileInputStream fileInputStream = new FileInputStream(file);
                            if (file.getAbsolutePath().endsWith(".zip")) {
                                fileExtension2 = fileExtension;
                            }
                            file.getAbsolutePath();
                            p214r3.c.a();
                            pair = new Pair(fileExtension2, fileInputStream);
                        }
                    } catch (FileNotFoundException unused) {
                    }
                    if (pair == null) {
                        bVar = null;
                    } else {
                        FileExtension fileExtension3 = (FileExtension) pair.first;
                        InputStream inputStream = (InputStream) pair.second;
                        p079g3.b bVar3 = (fileExtension3 == fileExtension ? p079g3.j.d(rVar, new ZipInputStream(inputStream), str) : p079g3.j.b(inputStream, str)).f35591a;
                        if (bVar3 != null) {
                            bVar = bVar3;
                        } else {
                            bVar = null;
                        }
                    }
                } else {
                    bVar = null;
                }
                if (bVar == null) {
                    p214r3.c.a();
                    p214r3.c.a();
                    try {
                        try {
                            p189p3.a aVarA = p189p3.b.a();
                            HttpURLConnection httpURLConnection = aVarA.f45799b;
                            try {
                                if (httpURLConnection.getResponseCode() / 100 == 2) {
                                    z10 = true;
                                }
                            } catch (IOException unused2) {
                            }
                            try {
                                if (z10) {
                                    p079g3.r rVarA = dVar3.a(rVar, httpURLConnection.getInputStream(), httpURLConnection.getContentType(), str);
                                    V v11 = rVarA.f35591a;
                                    p214r3.c.a();
                                    aVarA.close();
                                    rVar = rVarA;
                                } else {
                                    p079g3.r rVar2 = new p079g3.r((Throwable) new IllegalArgumentException(aVarA.b()));
                                    aVarA.close();
                                    rVar = rVar2;
                                }
                            } catch (IOException e10) {
                                p214r3.c.c("LottieFetchResult close failed ", e10);
                            }
                        } catch (Throwable th4) {
                            if (0 != 0) {
                                try {
                                    autoCloseable.close();
                                } catch (IOException e11) {
                                    p214r3.c.c("LottieFetchResult close failed ", e11);
                                }
                                break;
                            }
                            throw th4;
                        }
                    } catch (Exception e12) {
                        p079g3.r rVar3 = new p079g3.r((Throwable) e12);
                        if (0 != 0) {
                            try {
                                autoCloseable.close();
                            } catch (IOException e13) {
                                p214r3.c.c("LottieFetchResult close failed ", e13);
                            }
                        }
                        rVar = rVar3;
                    }
                    break;
                } else {
                    rVar = new p079g3.r(bVar);
                }
                if (str != null && (v10 = rVar.f35591a) != 0) {
                    p142l3.d.f44352b.f44353a.d(str, (p079g3.b) v10);
                }
                return rVar;
        }
    }
}
