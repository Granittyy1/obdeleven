package p079g3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.parser.moshi.a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import p142l3.b;
import p142l3.d;
import p202q3.w;
import p214r3.c;
import p214r3.g;
import p318zb.C;
import p318zb.v;

/* JADX INFO: compiled from: LottieCompositionFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f35577a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashSet f35578b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f35579c = {80, 75, 3, 4};

    public static s<b> a(final String str, Callable<r<b>> callable, Runnable runnable) {
        b bVarC = str == null ? null : d.f44352b.f44353a.c(str);
        s<b> sVar = bVarC != null ? new s<>(new g(0, bVarC)) : null;
        HashMap map = f35577a;
        if (str != null && map.containsKey(str)) {
            sVar = (s) map.get(str);
        }
        if (sVar != null) {
            if (runnable != null) {
                runnable.run();
            }
            return sVar;
        }
        s<b> sVar2 = new s<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            sVar2.b(new q() { // from class: g3.h
                @Override // p079g3.q
                public final void onResult(Object obj) {
                    HashMap map2 = j.f35577a;
                    map2.remove(str);
                    atomicBoolean.set(true);
                    if (map2.size() == 0) {
                        j.f(true);
                    }
                }
            });
            sVar2.a(new q() { // from class: g3.i
                @Override // p079g3.q
                public final void onResult(Object obj) {
                    HashMap map2 = j.f35577a;
                    map2.remove(str);
                    atomicBoolean.set(true);
                    if (map2.size() == 0) {
                        j.f(true);
                    }
                }
            });
            if (!atomicBoolean.get()) {
                map.put(str, sVar2);
                if (map.size() == 1) {
                    f(false);
                }
            }
        }
        return sVar2;
    }

    public static r<b> b(InputStream inputStream, String str) {
        try {
            C cB = v.b(v.g(inputStream));
            String[] strArr = JsonReader.f23511f;
            return c(new a(cB), str, true);
        } finally {
            g.b(inputStream);
        }
    }

    public static r c(a aVar, String str, boolean z10) {
        try {
            b bVarA = w.a(aVar);
            if (str != null) {
                d.f44352b.f44353a.d(str, bVarA);
            }
            return new r(bVarA);
        } catch (Exception e10) {
            return new r((Throwable) e10);
        } finally {
            if (z10) {
                g.b(aVar);
            }
        }
    }

    public static r<b> d(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return e(context, zipInputStream, str);
        } finally {
            g.b(zipInputStream);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static r<b> e(Context context, ZipInputStream zipInputStream, String str) {
        p pVar;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            b bVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    C cB = v.b(v.g(zipInputStream));
                    String[] strArr = JsonReader.f23511f;
                    bVar = (b) c(new a(cB), null, false).f35591a;
                } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                    String[] strArrSplit = name.split("/");
                    map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
                } else if (name.contains(".ttf") || name.contains(".otf")) {
                    String[] strArrSplit2 = name.split("/");
                    String str2 = strArrSplit2[strArrSplit2.length - 1];
                    String str3 = str2.split("\\.")[0];
                    File file = new File(context.getCacheDir(), str2);
                    new FileOutputStream(file);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i10 = zipInputStream.read(bArr);
                                if (i10 == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, i10);
                            }
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                            if (!file.delete()) {
                                c.b("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                            }
                            map2.put(str3, typefaceCreateFromFile);
                        } catch (Throwable th) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        c.c("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th3);
                    }
                } else {
                    zipInputStream.closeEntry();
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (bVar == null) {
                return new r<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : map.entrySet()) {
                String str4 = (String) entry.getKey();
                Iterator it = bVar.f35555d.values().iterator();
                do {
                    if (!it.hasNext()) {
                        pVar = null;
                        break;
                    }
                    pVar = (p) it.next();
                } while (!pVar.f35589c.equals(str4));
                if (pVar != null) {
                    pVar.f35590d = g.e((Bitmap) entry.getValue(), pVar.f35587a, pVar.f35588b);
                }
            }
            for (Map.Entry entry2 : map2.entrySet()) {
                boolean z10 = false;
                for (b bVar2 : bVar.f35556e.values()) {
                    if (bVar2.f44343a.equals(entry2.getKey())) {
                        bVar2.f44346d = (Typeface) entry2.getValue();
                        z10 = true;
                    }
                }
                if (!z10) {
                    c.b("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
                }
            }
            if (map.isEmpty()) {
                Iterator it2 = bVar.f35555d.entrySet().iterator();
                while (it2.hasNext()) {
                    p pVar2 = (p) ((Map.Entry) it2.next()).getValue();
                    if (pVar2 == null) {
                        return null;
                    }
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    String str5 = pVar2.f35589c;
                    if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                        try {
                            byte[] bArrDecode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                            pVar2.f35590d = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        } catch (IllegalArgumentException e10) {
                            c.c("data URL did not have correct base64 format.", e10);
                            return null;
                        }
                    }
                }
            }
            if (str != null) {
                d.f44352b.f44353a.d(str, bVar);
            }
            return new r<>(bVar);
        } catch (IOException e11) {
            return new r<>((Throwable) e11);
        }
    }

    public static void f(boolean z10) {
        ArrayList arrayList = new ArrayList(f35578b);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((t) arrayList.get(i10)).a();
        }
    }
}
