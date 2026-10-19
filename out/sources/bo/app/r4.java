package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class r4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f21833d = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r5 f21834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f21835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SharedPreferences f21836c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f21837a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f21838b;

        public a(String id, long j) {
            kotlin.jvm.internal.i.e(id, "id");
            this.f21837a = id;
            this.f21838b = j;
        }

        public final String a() {
            return this.f21837a;
        }

        public final long b() {
            return this.f21838b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.i.a(this.f21837a, aVar.f21837a) && this.f21838b == aVar.f21838b;
        }

        public int hashCode() {
            return Long.hashCode(this.f21838b) + (this.f21837a.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("CampaignData(id=");
            sb2.append(this.f21837a);
            sb2.append(", timestamp=");
            return C4.a.h(sb2, this.f21838b, ')');
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.e eVar) {
            this();
        }

        private b() {
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21839b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.f21839b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Adding push campaign to storage with uid " + this.f21839b;
        }
    }

    public r4(Context context, String apiKey, String str, k2 internalEventPublisher, r5 serverConfigStorageProvider) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(apiKey, "apiKey");
        kotlin.jvm.internal.i.e(internalEventPublisher, "internalEventPublisher");
        kotlin.jvm.internal.i.e(serverConfigStorageProvider, "serverConfigStorageProvider");
        this.f21834a = serverConfigStorageProvider;
        this.f21835b = context.getSharedPreferences("com.braze.storage.braze_push_max_storage" + StringUtils.getCacheFileSuffix(context, str, apiKey), 0);
        this.f21836c = context.getSharedPreferences("com.braze.storage.braze_push_max_metadata" + StringUtils.getCacheFileSuffix(context, str, apiKey), 0);
        internalEventPublisher.c(s4.class, new E0(0, this));
        c();
    }

    public final List a() {
        long jB = b() - this.f21834a.t();
        SharedPreferences pushMaxPrefs = this.f21835b;
        kotlin.jvm.internal.i.d(pushMaxPrefs, "pushMaxPrefs");
        List listA = a(pushMaxPrefs);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA) {
            if (((a) obj).b() > jB) {
                arrayList.add(obj);
            }
        }
        return kotlin.collections.q.o0(arrayList);
    }

    public final void c() {
        long jNowInSeconds = DateTimeUtils.nowInSeconds() - TimeUnit.DAYS.toSeconds(45L);
        SharedPreferences pushMaxPrefs = this.f21835b;
        kotlin.jvm.internal.i.d(pushMaxPrefs, "pushMaxPrefs");
        List<a> listA = a(pushMaxPrefs);
        SharedPreferences.Editor editorEdit = this.f21835b.edit();
        for (a aVar : listA) {
            if (this.f21835b.getLong(aVar.a(), 0L) < jNowInSeconds) {
                editorEdit.remove(aVar.a());
            }
        }
        editorEdit.apply();
    }

    public final void d() {
        this.f21835b.edit().clear().apply();
        this.f21836c.edit().clear().apply();
    }

    public final long b() {
        return this.f21836c.getLong("lastUpdateTime", -1L);
    }

    public final void a(long j) {
        this.f21836c.edit().putLong("lastUpdateTime", j).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(r4 this$0, s4 it) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(it, "it");
        this$0.a(it.a());
    }

    public final void a(String pushCampaign) {
        kotlin.jvm.internal.i.e(pushCampaign, "pushCampaign");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new c(pushCampaign), 3, (Object) null);
        if (kotlin.text.n.S(pushCampaign)) {
            return;
        }
        this.f21835b.edit().putLong(pushCampaign, DateTimeUtils.nowInSeconds()).apply();
    }

    private final List a(SharedPreferences sharedPreferences) {
        ArrayList arrayList = new ArrayList();
        Map<String, ?> all = sharedPreferences.getAll();
        kotlin.jvm.internal.i.d(all, "this.all");
        Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
        while (it.hasNext()) {
            String campaignId = it.next().getKey();
            kotlin.jvm.internal.i.d(campaignId, "campaignId");
            arrayList.add(new a(campaignId, sharedPreferences.getLong(campaignId, 0L)));
        }
        return kotlin.collections.q.o0(arrayList);
    }
}
