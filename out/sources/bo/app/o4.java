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
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f21698d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReentrantLock f21699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f21700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SharedPreferences f21701c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21702b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.f21702b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Adding push campaign to storage with uid " + this.f21702b;
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n4 f21703b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(n4 n4Var) {
            super(0);
            this.f21703b = n4Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Clearing PDE from storage with uid " + this.f21703b.x();
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f21704b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List list) {
            super(0);
            this.f21704b = list;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Re-adding PDEs to storage: " + this.f21704b;
        }
    }

    public o4(Context context, String apiKey) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(apiKey, "apiKey");
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f21699a = reentrantLock;
        ArrayList arrayList = new ArrayList();
        this.f21700b = arrayList;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.braze.storage.braze_push_delivery_storage" + StringUtils.getCacheFileSuffix(context, null, apiKey), 0);
        this.f21701c = sharedPreferences;
        reentrantLock.lock();
        try {
            arrayList.clear();
            Map<String, ?> all = sharedPreferences.getAll();
            kotlin.jvm.internal.i.d(all, "pdePrefs.all");
            Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
            while (it.hasNext()) {
                String campaignId = it.next().getKey();
                List list = this.f21700b;
                kotlin.jvm.internal.i.d(campaignId, "campaignId");
                list.add(new n4(campaignId, this.f21701c.getLong(campaignId, 0L)));
            }
            p293xa.r rVar = p293xa.r.f47939a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final List a() {
        ArrayList arrayList = new ArrayList();
        ReentrantLock reentrantLock = this.f21699a;
        reentrantLock.lock();
        try {
            for (n4 n4Var : this.f21700b) {
                if (arrayList.size() >= 32) {
                    break;
                }
                arrayList.add(n4Var);
            }
            this.f21700b.removeAll(arrayList);
            return arrayList;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(List events) {
        kotlin.jvm.internal.i.e(events, "events");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new d(events), 3, (Object) null);
        ReentrantLock reentrantLock = this.f21699a;
        reentrantLock.lock();
        try {
            this.f21700b.addAll(events);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void a(String pushCampaignId) {
        kotlin.jvm.internal.i.e(pushCampaignId, "pushCampaignId");
        ReentrantLock reentrantLock = this.f21699a;
        reentrantLock.lock();
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new b(pushCampaignId), 3, (Object) null);
            long jNowInSeconds = DateTimeUtils.nowInSeconds();
            this.f21701c.edit().putLong(pushCampaignId, jNowInSeconds).apply();
            this.f21700b.add(new n4(pushCampaignId, jNowInSeconds));
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void a(List events) {
        kotlin.jvm.internal.i.e(events, "events");
        ReentrantLock reentrantLock = this.f21699a;
        reentrantLock.lock();
        try {
            SharedPreferences.Editor editorEdit = this.f21701c.edit();
            Iterator it = events.iterator();
            while (it.hasNext()) {
                n4 n4Var = (n4) it.next();
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new c(n4Var), 3, (Object) null);
                editorEdit.remove(n4Var.x());
            }
            editorEdit.apply();
            this.f21700b.removeAll(events);
        } finally {
            reentrantLock.unlock();
        }
    }
}
