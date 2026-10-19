package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class x6 implements b3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f22179d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f22180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f22181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f22182c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c3 f22183b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c3 c3Var) {
            super(0);
            this.f22183b = c3Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Triggered action id " + this.f22183b.getId() + " always eligible via configuration. Returning true for eligibility status";
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c3 f22184b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(c3 c3Var) {
            super(0);
            this.f22184b = c3Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Triggered action id " + this.f22184b.getId() + " always eligible via never having been triggered. Returning true for eligibility status";
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c3 f22185b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c3 c3Var) {
            super(0);
            this.f22185b = c3Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Triggered action id " + this.f22185b.getId() + " no longer eligible due to having been triggered in the past and is only eligible once.";
        }
    }

    public static final class e extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f22186b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ o2 f22187c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j, o2 o2Var) {
            super(0);
            this.f22186b = j;
            this.f22187c = o2Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Trigger action is re-eligible for display since " + (DateTimeUtils.nowInSeconds() - this.f22186b) + " seconds have passed since the last time it was triggered (minimum interval: " + this.f22187c.g() + ").";
        }
    }

    public static final class f extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f22188b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ o2 f22189c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(long j, o2 o2Var) {
            super(0);
            this.f22188b = j;
            this.f22189c = o2Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Trigger action is not re-eligible for display since only " + (DateTimeUtils.nowInSeconds() - this.f22188b) + " seconds have passed since the last time it was triggered (minimum interval: " + this.f22189c.g() + ").";
        }
    }

    public static final class g extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c3 f22190b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f22191c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(c3 c3Var, long j) {
            super(0);
            this.f22190b = c3Var;
            this.f22191c = j;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("Updating re-eligibility for action Id ");
            sb2.append(this.f22190b.getId());
            sb2.append(" to time ");
            return C4.a.h(sb2, this.f22191c, '.');
        }
    }

    public static final class h extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f22192b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str) {
            super(0);
            this.f22192b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Q8.d.a(new StringBuilder("Deleting outdated triggered action id "), this.f22192b, " from stored re-eligibility list. In-memory re-eligibility list is unchanged.");
        }
    }

    public static final class i extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f22193b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str) {
            super(0);
            this.f22193b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Q8.d.a(new StringBuilder("Retaining triggered action "), this.f22193b, " in re-eligibility list.");
        }
    }

    public static final class j extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c3 f22194b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f22195c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(c3 c3Var, long j) {
            super(0);
            this.f22194b = c3Var;
            this.f22195c = j;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Resetting re-eligibility for action Id " + this.f22194b.getId() + " to " + this.f22195c;
        }
    }

    public static final class k extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f22196b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str) {
            super(0);
            this.f22196b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Q8.d.a(new StringBuilder("Retrieving triggered action id "), this.f22196b, " eligibility information from local storage.");
        }
    }

    public static final class l extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final l f22197b = new l();

        public l() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Encountered unexpected exception while parsing stored re-eligibility information.";
        }
    }

    public x6(Context context, String str, String apiKey) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(apiKey, "apiKey");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.storage.triggers.re_eligibility" + StringUtils.getCacheFileSuffix(context, str, apiKey), 0);
        kotlin.jvm.internal.i.d(sharedPreferences, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.f22180a = sharedPreferences;
        this.f22181b = a();
        this.f22182c = new LinkedHashMap();
    }

    @Override // bo.app.b3
    public void a(c3 triggeredAction, long j10) {
        kotlin.jvm.internal.i.e(triggeredAction, "triggeredAction");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new g(triggeredAction, j10), 3, (Object) null);
        Map map = this.f22182c;
        String id = triggeredAction.getId();
        Long l10 = (Long) this.f22181b.get(triggeredAction.getId());
        map.put(id, Long.valueOf(l10 != null ? l10.longValue() : 0L));
        this.f22181b.put(triggeredAction.getId(), Long.valueOf(j10));
        this.f22180a.edit().putLong(triggeredAction.getId(), j10).apply();
    }

    @Override // bo.app.b3
    public boolean b(c3 triggeredAction) {
        kotlin.jvm.internal.i.e(triggeredAction, "triggeredAction");
        o2 o2VarI = triggeredAction.n().i();
        if (o2VarI.e()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new b(triggeredAction), 3, (Object) null);
            return true;
        }
        if (!this.f22181b.containsKey(triggeredAction.getId())) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new c(triggeredAction), 3, (Object) null);
            return true;
        }
        if (o2VarI.h()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new d(triggeredAction), 3, (Object) null);
            return false;
        }
        Long l10 = (Long) this.f22181b.get(triggeredAction.getId());
        long jLongValue = l10 != null ? l10.longValue() : 0L;
        long jNowInSeconds = DateTimeUtils.nowInSeconds() + ((long) triggeredAction.n().o());
        Integer numG = o2VarI.g();
        if (jNowInSeconds >= ((long) (numG != null ? numG.intValue() : 0)) + jLongValue) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new e(jLongValue, o2VarI), 3, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new f(jLongValue, o2VarI), 3, (Object) null);
        return false;
    }

    @Override // bo.app.b3
    public void c(c3 triggeredAction) {
        kotlin.jvm.internal.i.e(triggeredAction, "triggeredAction");
        if (triggeredAction.n().i().h()) {
            this.f22181b.remove(triggeredAction.getId());
            this.f22180a.edit().remove(triggeredAction.getId()).apply();
            return;
        }
        Long l10 = (Long) this.f22182c.get(triggeredAction.getId());
        long jLongValue = l10 != null ? l10.longValue() : 0L;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new j(triggeredAction, jLongValue), 3, (Object) null);
        this.f22181b.put(triggeredAction.getId(), Long.valueOf(jLongValue));
        this.f22180a.edit().putLong(triggeredAction.getId(), jLongValue).apply();
    }

    private final Map a() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        try {
            for (String actionId : this.f22180a.getAll().keySet()) {
                long j10 = this.f22180a.getLong(actionId, 0L);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new k(actionId), 3, (Object) null);
                Long lValueOf = Long.valueOf(j10);
                kotlin.jvm.internal.i.d(actionId, "actionId");
                concurrentHashMap.put(actionId, lValueOf);
            }
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, l.f22197b);
        }
        return concurrentHashMap;
    }

    @Override // bo.app.a3
    public void a(List triggeredActions) {
        kotlin.jvm.internal.i.e(triggeredActions, "triggeredActions");
        ArrayList arrayList = new ArrayList(kotlin.collections.m.y(triggeredActions, 10));
        Iterator it = triggeredActions.iterator();
        while (it.hasNext()) {
            arrayList.add(((c3) it.next()).getId());
        }
        SharedPreferences.Editor editorEdit = this.f22180a.edit();
        for (String str : kotlin.collections.q.s0(this.f22181b.keySet())) {
            if (!arrayList.contains(str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new h(str), 3, (Object) null);
                editorEdit.remove(str);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new i(str), 3, (Object) null);
            }
        }
        editorEdit.apply();
    }
}
