package O3;

import A8.p;
import D3.o;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import androidx.compose.ui.autofill.m;
import androidx.compose.ui.graphics.C1138n;
import androidx.compose.ui.graphics.C1141q;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.n;
import androidx.compose.ui.text.font.r;
import androidx.core.view.a0;
import com.bumptech.glide.load.EncodeStrategy;
import com.google.android.play.core.integrity.StandardIntegrityException;
import com.parse.boltsinternal.Task;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.collections.y;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C;
import kotlinx.coroutines.C2693i;
import kotlinx.serialization.json.internal.A;
import kotlinx.serialization.json.internal.z;
import org.json.JSONObject;
import p050db.AbstractC2184a;
import p068f4.k;

/* JADX INFO: compiled from: GifDrawableEncoder.java */
/* JADX INFO: loaded from: classes.dex */
public class d implements A3.f, r, a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C1141q f4814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C1138n f4815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static J.a f4816d;

    public static final androidx.compose.ui.autofill.d h(String str) {
        return new androidx.compose.ui.autofill.d(C.u(str));
    }

    public static final long i(float f10, boolean z10, boolean z11) {
        return (((z10 ? 1L : 0L) | (z11 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f10)) << 32);
    }

    public static final z j(AbstractC2184a json, String source) {
        kotlin.jvm.internal.i.e(json, "json");
        kotlin.jvm.internal.i.e(source, "source");
        return !json.f34642a.f34680o ? new z(source) : new A(source);
    }

    public static final ExecutorService l(boolean z10) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new androidx.work.b(z10));
        kotlin.jvm.internal.i.d(executorServiceNewFixedThreadPool, "newFixedThreadPool(\n    …)),\n        factory\n    )");
        return executorServiceNewFixedThreadPool;
    }

    public static void m(long j, String str) {
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }

    public static void n(boolean z10) {
        if (!z10) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static Typeface o(String str, l lVar, int i10) {
        if (androidx.compose.ui.text.font.j.a(i10, 0) && kotlin.jvm.internal.i.a(lVar, l.f15442g) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), lVar.f15447b, androidx.compose.ui.text.font.j.a(i10, 1));
    }

    public static final void p(p318zb.l lVar, p318zb.z zVar) throws IOException {
        try {
            IOException iOException = null;
            for (p318zb.z zVar2 : lVar.d(zVar)) {
                try {
                    if (lVar.e(zVar2).f49094b) {
                        p(lVar, zVar2);
                    }
                    lVar.a(zVar2);
                } catch (IOException e10) {
                    if (iOException == null) {
                        iOException = e10;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final String[] q(m mVar) {
        kotlin.jvm.internal.i.c(mVar, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType");
        return (String[]) ((androidx.compose.ui.autofill.d) mVar).f13295b.toArray(new String[0]);
    }

    public static void r() {
        CopyOnWriteArraySet copyOnWriteArraySet;
        SharedPreferences sharedPreferences = k.f34982a;
        ConcurrentHashMap purchaseDetailsMap = p068f4.i.f34954w;
        ConcurrentHashMap skuDetailsMap = p068f4.i.f34955x;
        kotlin.jvm.internal.i.e(purchaseDetailsMap, "purchaseDetailsMap");
        kotlin.jvm.internal.i.e(skuDetailsMap, "skuDetailsMap");
        k.a();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        Iterator it = y.x(purchaseDetailsMap).entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            copyOnWriteArraySet = k.f34983b;
            if (!zHasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            JSONObject jSONObject = (JSONObject) entry.getValue();
            try {
                if (jSONObject.has("purchaseToken")) {
                    String string = jSONObject.getString("purchaseToken");
                    if (k.f34984c.containsKey(string)) {
                        purchaseDetailsMap.remove(str);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append((Object) string);
                        sb2.append(';');
                        sb2.append(jCurrentTimeMillis);
                        copyOnWriteArraySet.add(sb2.toString());
                    }
                }
            } catch (Exception unused) {
            }
        }
        SharedPreferences sharedPreferences2 = k.f34982a;
        if (sharedPreferences2 == null) {
            kotlin.jvm.internal.i.m("sharedPreferences");
            throw null;
        }
        sharedPreferences2.edit().putStringSet("PURCHASE_DETAILS_SET", copyOnWriteArraySet).apply();
        HashMap map = new HashMap(purchaseDetailsMap);
        long jCurrentTimeMillis2 = System.currentTimeMillis() / 1000;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry2 : map.entrySet()) {
            String str2 = (String) entry2.getKey();
            JSONObject jSONObject2 = (JSONObject) entry2.getValue();
            JSONObject jSONObject3 = (JSONObject) skuDetailsMap.get(str2);
            if (jSONObject2 != null && jSONObject2.has("purchaseTime")) {
                try {
                    if (jCurrentTimeMillis2 - (jSONObject2.getLong("purchaseTime") / 1000) <= 86400 && jSONObject3 != null) {
                        String string2 = jSONObject2.toString();
                        kotlin.jvm.internal.i.d(string2, "purchaseDetail.toString()");
                        String string3 = jSONObject3.toString();
                        kotlin.jvm.internal.i.d(string3, "skuDetail.toString()");
                        linkedHashMap.put(string2, string3);
                    }
                } catch (Exception unused2) {
                }
            }
        }
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            String str3 = (String) entry3.getKey();
            String str4 = (String) entry3.getValue();
            if (str3 != null && str4 != null) {
                p093h4.f.a(str3, str4, false);
            }
        }
        p068f4.i.f34954w.clear();
    }

    public static final Object s(Task task, ContinuationImpl continuationImpl) {
        C2693i c2693i = new C2693i(1, p.y(continuationImpl));
        c2693i.s();
        task.continueWith(new W7.e(task, c2693i));
        Object objP = c2693i.p();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        return objP;
    }

    @Override // androidx.compose.ui.text.font.r
    public Typeface b(n nVar, l lVar, int i10) {
        return o(nVar.f15449e, lVar, i10);
    }

    @Override // androidx.compose.ui.text.font.r
    public Typeface e(l lVar, int i10) {
        return o(null, lVar, i10);
    }

    @Override // A3.a
    public boolean f(Object obj, File file, A3.d dVar) throws Throwable {
        try {
            X3.a.b(((c) ((o) obj).get()).f4804b.f4813a.f4818a.f48811d.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable("GifEncoder", 5);
            return false;
        }
    }

    @Override // A3.f
    public EncodeStrategy g(A3.d dVar) {
        return EncodeStrategy.f24521b;
    }

    public StandardIntegrityException k(Bundle bundle) {
        int i10 = bundle.getInt("error");
        if (i10 == 0) {
            return null;
        }
        return new StandardIntegrityException(i10, bundle.getBoolean("is.error.remediable"), null);
    }

    @Override // androidx.core.view.a0
    public void a() {
    }

    @Override // androidx.core.view.a0
    public void c() {
    }
}
