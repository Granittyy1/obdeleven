package D7;

import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

/* JADX INFO: compiled from: ConfigGetParameterHandler.java */
/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f2854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f2855f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f2856a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f2857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f2858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f2859d;

    static {
        Charset.forName("UTF-8");
        f2854e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        f2855f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public k(Executor executor, e eVar, e eVar2) {
        this.f2857b = executor;
        this.f2858c = eVar;
        this.f2859d = eVar2;
    }

    public static HashSet b(e eVar) {
        HashSet hashSet = new HashSet();
        com.google.firebase.remoteconfig.internal.b bVarC = eVar.c();
        if (bVarC == null) {
            return hashSet;
        }
        Iterator<String> itKeys = bVarC.f28586b.keys();
        while (itKeys.hasNext()) {
            hashSet.add(itKeys.next());
        }
        return hashSet;
    }

    public static String c(e eVar, String str) {
        com.google.firebase.remoteconfig.internal.b bVarC = eVar.c();
        if (bVarC == null) {
            return null;
        }
        try {
            return bVarC.f28586b.getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void a(String str, com.google.firebase.remoteconfig.internal.b bVar) {
        if (bVar == null) {
            return;
        }
        synchronized (this.f2856a) {
            try {
                Iterator it = this.f2856a.iterator();
                while (it.hasNext()) {
                    this.f2857b.execute(new j((Y4.b) it.next(), str, bVar, 0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
