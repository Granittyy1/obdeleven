package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class q4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f21787b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f21788c = TimeUnit.DAYS.toSeconds(45);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f21789a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map.Entry f21790b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f21791c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Map.Entry entry, long j) {
            super(0);
            this.f21790b = entry;
            this.f21791c = j;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Evicting push id key " + this.f21790b + " based on cutoff: " + this.f21791c;
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f21792b = new c();

        public c() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Push dedupe id is blank. Returning true.";
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21793b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.f21793b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Q8.d.a(new StringBuilder("Push dedupe id "), this.f21793b, " has already been seen. Returning false.");
        }
    }

    public q4(Context context, String str, String str2) {
        kotlin.jvm.internal.i.e(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.braze.storage.push_identifier_storage" + StringUtils.getCacheFileSuffix(context, str2, str), 0);
        kotlin.jvm.internal.i.d(sharedPreferences, "context.getSharedPrefere…y), Context.MODE_PRIVATE)");
        this.f21789a = sharedPreferences;
        a();
    }

    public final void a(String pushId) {
        kotlin.jvm.internal.i.e(pushId, "pushId");
        this.f21789a.edit().putLong(pushId, DateTimeUtils.nowInSeconds()).apply();
    }

    public final boolean b(String pushId) {
        kotlin.jvm.internal.i.e(pushId, "pushId");
        return this.f21789a.contains(pushId);
    }

    public final boolean c(String pushId) {
        kotlin.jvm.internal.i.e(pushId, "pushId");
        if (kotlin.text.n.S(pushId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c.f21792b, 3, (Object) null);
            return true;
        }
        if (b(pushId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new d(pushId), 3, (Object) null);
            return false;
        }
        a();
        a(pushId);
        return true;
    }

    public final void a() {
        long jNowInSeconds = DateTimeUtils.nowInSeconds() - f21788c;
        SharedPreferences.Editor editorEdit = this.f21789a.edit();
        Map<String, ?> all = this.f21789a.getAll();
        kotlin.jvm.internal.i.d(all, "storagePrefs.all");
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            Long l10 = (Long) entry.getValue();
            if (l10 == null || l10.longValue() < jNowInSeconds) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new b(entry, jNowInSeconds), 2, (Object) null);
                editorEdit.remove(entry.getKey());
            }
        }
        editorEdit.apply();
    }

    public final List a(long j) {
        if (j <= 0) {
            return EmptyList.f42983b;
        }
        long jNowInSeconds = DateTimeUtils.nowInSeconds() - j;
        ArrayList arrayList = new ArrayList();
        Map<String, ?> all = this.f21789a.getAll();
        kotlin.jvm.internal.i.d(all, "storagePrefs.all");
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            Long l10 = (Long) entry.getValue();
            if (l10 != null && l10.longValue() >= jNowInSeconds) {
                String key = entry.getKey();
                kotlin.jvm.internal.i.d(key, "it.key");
                arrayList.add(key);
            }
        }
        return arrayList;
    }
}
