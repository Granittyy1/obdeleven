package com.obdeleven.service.odx;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.obdeleven.service.odx.model.ODX;
import com.parse.ParseCloud;
import com.parse.ParseException;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.voltasit.parse.Parse;
import io.intercom.android.sdk.models.Participant;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import net.lingala.zip4j.exception.ZipException;
import org.simpleframework.xml.convert.AnnotationStrategy;
import org.simpleframework.xml.core.Persister;
import p134k8.B1;
import p137kb.j;
import p255u9.l;
import p255u9.p;
import p255u9.z;

/* JADX INFO: compiled from: NetworkOdxFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap<String, B1> f29477d = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f29478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public File f29479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public File f29480c;

    /* JADX WARN: Code duplicated, block: B:24:0x007a A[Catch: IOException -> 0x007d, TRY_LEAVE, TryCatch #1 {IOException -> 0x007d, blocks: (B:22:0x0075, B:24:0x007a), top: B:34:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a6  */
    public static void a(File file, String str) throws OdxFactory$Exception {
        FileOutputStream fileOutputStream;
        O.e.j("NetworkOdxFactory", "downloadFile(" + file + ")");
        InputStream inputStream = null;
        try {
            if (!file.exists()) {
                file.getParentFile().mkdirs();
                file.createNewFile();
            }
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection());
            uRLConnection.setConnectTimeout(15000);
            uRLConnection.setReadTimeout(30000);
            InputStream inputStream2 = uRLConnection.getInputStream();
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i10 = inputStream2.read(bArr);
                        if (i10 == -1) {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            inputStream2.close();
                            return;
                        }
                        fileOutputStream.write(bArr, 0, i10);
                    }
                } catch (IOException e10) {
                    inputStream = inputStream2;
                    e = e10;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                        } catch (IOException unused) {
                            O.e.j("NetworkOdxFactory", "Could not download file " + file + ". Deleted corrupted file: " + file.delete());
                            if (Parse.a()) {
                                throw new OdxFactory$Exception(0, e);
                            }
                            throw new OdxFactory$Exception(1, e);
                        }
                    } else if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    O.e.j("NetworkOdxFactory", "Could not download file " + file + ". Deleted corrupted file: " + file.delete());
                    if (Parse.a()) {
                        throw new OdxFactory$Exception(1, e);
                    }
                    throw new OdxFactory$Exception(0, e);
                }
            } catch (IOException e11) {
                inputStream = inputStream2;
                e = e11;
                fileOutputStream = null;
            }
        } catch (IOException e12) {
            e = e12;
            fileOutputStream = null;
        }
    }

    public final B1 b(c cVar) throws OdxFactory$Exception {
        p pVar;
        p137kb.b bVar;
        O.e.s("NetworkOdxFactory", "getODX(" + cVar.toString() + ")");
        String strA = cVar.a();
        HashMap<String, B1> map = f29477d;
        if (map.containsKey(strA)) {
            return map.get(strA);
        }
        O.e.s("NetworkOdxFactory", "loadODX(" + cVar.toString() + ")");
        l lVarD = Parse.f34395b.d(cVar);
        String string = lVarD.getString("platform");
        String string2 = lVarD.getString("fileName");
        try {
            p075fb.b bVarC = c(string, string2, lVarD.f47475b);
            if (bVarC.b()) {
                if (this.f29478a == null) {
                    this.f29478a = Parse.f34395b.f((String) ParseCloud.callFunction("odxV2", new HashMap()));
                }
                bVarC.d(this.f29478a);
            }
            bVarC.c();
            j jVar = bVarC.f35072c;
            p124jb.c cVarA = bVarC.a((p137kb.e) ((jVar == null || (bVar = jVar.f42962b) == null) ? null : (ArrayList) bVar.f42919a).get(0));
            p124jb.b bVar2 = cVarA.f41213b;
            ODX odx = (ODX) new Persister(new AnnotationStrategy()).read(ODX.class, (InputStream) cVarA, true);
            if (bVar2.available() > 0) {
                int iAvailable = bVar2.available();
                cVarA.read(new byte[iAvailable], 0, iAvailable);
            }
            cVarA.close();
            odx.setFileName(string2);
            B1 b10 = new B1(odx, string);
            map.put(strA, b10);
            return b10;
        } catch (OdxFactory$Exception e10) {
            throw e10;
        } catch (IOException e11) {
            e11.printStackTrace();
            String str = "ODX File not found: " + string + "/" + string2;
            try {
                ParseQuery query = ParseQuery.getQuery(p.class);
                query.whereEqualTo("description", str);
                pVar = (p) query.getFirst();
            } catch (ParseException e12) {
                if (e12.getCode() == 101) {
                    pVar = new p();
                    pVar.put("description", str);
                    int i10 = z.f47484b;
                    pVar.put(Participant.USER_TYPE, (z) ParseUser.getCurrentUser());
                }
                O.e.j("NetworkOdxFactory", "ODX File not found: " + e11.getMessage());
                throw new OdxFactory$Exception(1, e11);
            }
            pVar.increment("count");
            pVar.saveInBackground();
            O.e.j("NetworkOdxFactory", "ODX File not found: " + e11.getMessage());
            throw new OdxFactory$Exception(1, e11);
        } catch (Exception e13) {
            O.e.m(e13);
            throw new OdxFactory$Exception(2, e13);
        }
    }

    public final p075fb.b c(String str, String str2, String str3) throws Throwable {
        File file;
        File file2 = this.f29480c;
        if (file2 != null) {
            file = new File(new File(file2, str), str2);
            if (!file.exists()) {
                a(file, str3);
            }
        } else {
            file = new File(this.f29479b, "tmp");
            a(file, str3);
        }
        try {
            p075fb.b bVar = new p075fb.b();
            bVar.f35070a = file.getPath();
            bVar.f35071b = 2;
            bVar.b();
            return bVar;
        } catch (ZipException unused) {
            if (!file.delete()) {
                O.e.D("File %s not deleted", file.getPath());
            }
            return c(str, str2, str3);
        }
    }
}
