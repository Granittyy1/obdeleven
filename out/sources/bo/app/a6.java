package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public final class a6 implements b2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f20723c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f20724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f20725b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a2 f20726b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a2 a2Var) {
            super(0);
            this.f20726b = a2Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Storage provider is closed. Not adding event: " + this.f20726b;
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a2 f20727b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a2 a2Var) {
            super(0);
            this.f20727b = a2Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Adding event to storage with uid " + this.f20727b.t();
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f20728b = new d();

        public d() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Storage provider is closed. Not getting all events.";
        }
    }

    public static final class e extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref$ObjectRef f20729b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f20730c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Ref$ObjectRef ref$ObjectRef, String str) {
            super(0);
            this.f20729b = ref$ObjectRef;
            this.f20730c = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("Could not create BrazeEvent from [serialized event string=");
            sb2.append((String) this.f20729b.element);
            sb2.append(", unique identifier=");
            return Q8.d.a(sb2, this.f20730c, "] ... Deleting!");
        }
    }

    public static final class f extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f20731b = new f();

        public f() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Setting this provider to closed.";
        }
    }

    public static final class g extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f20732b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Set set) {
            super(0);
            this.f20732b = set;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Storage provider is closed. Not deleting events: " + this.f20732b;
        }
    }

    public static final class h extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f20733b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str) {
            super(0);
            this.f20733b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Deleting event from storage with uid " + this.f20733b;
        }
    }

    public a6(Context context, String str, String str2) {
        kotlin.jvm.internal.i.e(context, "context");
        this.f20725b = context.getSharedPreferences("com.appboy.storage.appboy_event_storage" + StringUtils.getCacheFileSuffix(context, str, str2), 0);
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.String] */
    @Override // bo.app.b2
    public Collection a() {
        if (this.f20724a) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, d.f20728b, 2, (Object) null);
            return EmptyList.f42983b;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Map<String, ?> all = this.f20725b.getAll();
        kotlin.jvm.internal.i.d(all, "prefs.all");
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String eventId = entry.getKey();
            Object value = entry.getValue();
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = "";
            try {
                kotlin.jvm.internal.i.c(value, "null cannot be cast to non-null type kotlin.String");
                ref$ObjectRef.element = (String) value;
                kotlin.jvm.internal.i.d(eventId, "eventId");
                a2 a2VarB = C1471i.f21202h.b((String) value, eventId);
                if (a2VarB != null) {
                    linkedHashSet.add(a2VarB);
                }
            } catch (Exception e10) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, new e(ref$ObjectRef, eventId));
                a(eventId);
            }
        }
        return linkedHashSet;
    }

    @Override // bo.app.b2
    public void close() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, f.f20731b, 2, (Object) null);
        this.f20724a = true;
    }

    @Override // bo.app.b2
    public void a(a2 event) {
        kotlin.jvm.internal.i.e(event, "event");
        if (this.f20724a) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new b(event), 2, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new c(event), 3, (Object) null);
            this.f20725b.edit().putString(event.t(), event.f()).apply();
        }
    }

    @Override // bo.app.b2
    public void a(Set events) {
        kotlin.jvm.internal.i.e(events, "events");
        if (this.f20724a) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new g(events), 2, (Object) null);
            return;
        }
        SharedPreferences.Editor editorEdit = this.f20725b.edit();
        Iterator it = events.iterator();
        while (it.hasNext()) {
            String strT = ((a2) it.next()).t();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new h(strT), 3, (Object) null);
            editorEdit.remove(strT);
        }
        editorEdit.apply();
    }

    public final void a(String str) {
        SharedPreferences.Editor editorEdit = this.f20725b.edit();
        editorEdit.remove(str);
        editorEdit.apply();
    }
}
