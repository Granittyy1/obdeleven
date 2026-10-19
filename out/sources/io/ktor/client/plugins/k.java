package io.ktor.client.plugins;

import com.google.android.gms.internal.measurement.M1;
import io.ktor.client.HttpClient;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: HttpPlainText.kt */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f40369d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final io.ktor.util.a<k> f40370e = new io.ktor.util.a<>("HttpPlainText");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Charset f40371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Charset f40372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f40373c;

    /* JADX INFO: compiled from: HttpPlainText.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkedHashSet f40374a = new LinkedHashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LinkedHashMap f40375b = new LinkedHashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Charset f40376c = kotlin.text.a.f43120b;
    }

    /* JADX INFO: compiled from: HttpPlainText.kt */
    public static final class b implements i<a, k> {
        @Override // io.ktor.client.plugins.i
        public final void a(k kVar, HttpClient scope) {
            k plugin = kVar;
            kotlin.jvm.internal.i.e(plugin, "plugin");
            kotlin.jvm.internal.i.e(scope, "scope");
            scope.f40243f.f(V9.d.f6859i, new HttpPlainText$Plugin$install$1(plugin, null));
            scope.f40244g.f(io.ktor.client.statement.f.f40432h, new HttpPlainText$Plugin$install$2(plugin, null));
        }

        @Override // io.ktor.client.plugins.i
        public final k b(Ia.l<? super a, p293xa.r> lVar) {
            a aVar = new a();
            lVar.invoke(aVar);
            return new k(aVar.f40374a, aVar.f40375b, aVar.f40376c);
        }

        @Override // io.ktor.client.plugins.i
        public final io.ktor.util.a<k> getKey() {
            return k.f40370e;
        }
    }

    public k(LinkedHashSet charsets, LinkedHashMap charsetQuality, Charset responseCharsetFallback) {
        Iterable iterableK;
        kotlin.jvm.internal.i.e(charsets, "charsets");
        kotlin.jvm.internal.i.e(charsetQuality, "charsetQuality");
        kotlin.jvm.internal.i.e(responseCharsetFallback, "responseCharsetFallback");
        this.f40371a = responseCharsetFallback;
        if (charsetQuality.size() == 0) {
            iterableK = EmptyList.f42983b;
        } else {
            Iterator it = charsetQuality.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (it.hasNext()) {
                    ArrayList arrayList = new ArrayList(charsetQuality.size());
                    arrayList.add(new Pair(entry.getKey(), entry.getValue()));
                    do {
                        Map.Entry entry2 = (Map.Entry) it.next();
                        arrayList.add(new Pair(entry2.getKey(), entry2.getValue()));
                    } while (it.hasNext());
                    iterableK = arrayList;
                } else {
                    iterableK = M1.k(new Pair(entry.getKey(), entry.getValue()));
                }
            } else {
                iterableK = EmptyList.f42983b;
            }
        }
        List<Pair> listH0 = kotlin.collections.q.h0(iterableK, new m());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : charsets) {
            if (!charsetQuality.containsKey((Charset) obj)) {
                arrayList2.add(obj);
            }
        }
        List<Charset> listH1 = kotlin.collections.q.h0(arrayList2, new l());
        StringBuilder sb2 = new StringBuilder();
        for (Charset charset : listH1) {
            if (sb2.length() > 0) {
                sb2.append(",");
            }
            sb2.append(p049da.a.c(charset));
        }
        for (Pair pair : listH0) {
            Charset charset2 = (Charset) pair.a();
            float fFloatValue = ((Number) pair.b()).floatValue();
            if (sb2.length() > 0) {
                sb2.append(",");
            }
            double d10 = fFloatValue;
            if (0.0d > d10 || d10 > 1.0d) {
                throw new IllegalStateException("Check failed.");
            }
            sb2.append(p049da.a.c(charset2) + ";q=" + (((double) Ka.a.b(100 * fFloatValue)) / 100.0d));
        }
        if (sb2.length() == 0) {
            sb2.append(p049da.a.c(this.f40371a));
        }
        String string = sb2.toString();
        kotlin.jvm.internal.i.d(string, "StringBuilder().apply(builderAction).toString()");
        this.f40373c = string;
        Charset charset3 = (Charset) kotlin.collections.q.P(listH1);
        if (charset3 == null) {
            Pair pair2 = (Pair) kotlin.collections.q.P(listH0);
            charset3 = pair2 != null ? (Charset) pair2.c() : null;
            if (charset3 == null) {
                charset3 = kotlin.text.a.f43120b;
            }
        }
        this.f40372b = charset3;
    }
}
