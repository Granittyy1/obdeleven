package U4;

import android.accounts.Account;
import androidx.collection.C0873a;
import androidx.collection.C0874b;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: U4.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0795c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Account f6424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f6425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f6426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f6427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f6428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f6429f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p156m5.a f6430g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f6431h;

    /* JADX INFO: renamed from: U4.c$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Account f6432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public C0874b f6433b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f6434c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f6435d;
    }

    public C0795c(Account account, Set set, C0873a c0873a, String str, String str2, p156m5.a aVar) {
        this.f6424a = account;
        Set setEmptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f6425b = setEmptySet;
        Map mapEmptyMap = c0873a == null ? Collections.emptyMap() : c0873a;
        this.f6427d = mapEmptyMap;
        this.f6428e = str;
        this.f6429f = str2;
        this.f6430g = aVar == null ? p156m5.a.f44596b : aVar;
        HashSet hashSet = new HashSet(setEmptySet);
        Iterator it = mapEmptyMap.values().iterator();
        while (it.hasNext()) {
            ((r) it.next()).getClass();
            hashSet.addAll(null);
        }
        this.f6426c = Collections.unmodifiableSet(hashSet);
    }
}
