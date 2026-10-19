package coil.request;

import io.intercom.android.sdk.utilities.coil.RoundedCornersAnimatedTransformation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.y;

/* JADX INFO: compiled from: Parameters.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Iterable<Pair<? extends String, ? extends b>>, Ja.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f23112c = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, b> f23113b;

    /* JADX INFO: compiled from: Parameters.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RoundedCornersAnimatedTransformation f23115a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f23116b;

        public b(RoundedCornersAnimatedTransformation roundedCornersAnimatedTransformation, String str) {
            this.f23115a = roundedCornersAnimatedTransformation;
            this.f23116b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f23115a.equals(bVar.f23115a) && kotlin.jvm.internal.i.a(this.f23116b, bVar.f23116b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int iHashCode = this.f23115a.hashCode() * 31;
            String str = this.f23116b;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Entry(value=");
            sb2.append(this.f23115a);
            sb2.append(", memoryCacheKey=");
            return B7.b.g(sb2, this.f23116b, ')');
        }
    }

    public l(Map<String, b> map) {
        this.f23113b = map;
    }

    public final <T> T e(String str) {
        b bVar = this.f23113b.get(str);
        if (bVar != null) {
            return (T) bVar.f23115a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            if (kotlin.jvm.internal.i.a(this.f23113b, ((l) obj).f23113b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f23113b.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<Pair<? extends String, ? extends b>> iterator() {
        Map<String, b> map = this.f23113b;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, b> entry : map.entrySet()) {
            arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        }
        return arrayList.iterator();
    }

    public final String toString() {
        return "Parameters(entries=" + this.f23113b + ')';
    }

    /* JADX INFO: compiled from: Parameters.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkedHashMap f23114a;

        public a() {
            this.f23114a = new LinkedHashMap();
        }

        public a(l lVar) {
            this.f23114a = y.y(lVar.f23113b);
        }
    }

    public l() {
        this(y.p());
    }
}
