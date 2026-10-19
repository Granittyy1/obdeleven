package bo.app;

import com.braze.support.BrazeLogger;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b2 f21291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f21292b;

    public static final class a extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a2 f21293b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a2 a2Var) {
            super(0);
            this.f21293b = a2Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Storage manager is closed. Not adding event: " + this.f21293b;
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f21294b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Set set) {
            super(0);
            this.f21294b = set;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Storage manager is closed. Not deleting events: " + this.f21294b;
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f21295b = new c();

        public c() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Storage manager is closed. Not starting offline recovery.";
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f21296b = new d();

        public d() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Started offline event recovery task.";
        }
    }

    public static final class e extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f21297b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List list) {
            super(0);
            this.f21297b = list;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Adding events to dispatch from storage: " + this.f21297b;
        }
    }

    public i1(b2 brazeEventStorageProvider) {
        kotlin.jvm.internal.i.e(brazeEventStorageProvider, "brazeEventStorageProvider");
        this.f21291a = brazeEventStorageProvider;
    }

    public final void a(a2 event) {
        kotlin.jvm.internal.i.e(event, "event");
        if (this.f21292b) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new a(event), 2, (Object) null);
        } else {
            this.f21291a.a(event);
        }
    }

    public final void a(Set events) {
        kotlin.jvm.internal.i.e(events, "events");
        if (this.f21292b) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new b(events), 2, (Object) null);
        } else {
            this.f21291a.a(events);
        }
    }

    public final void a() {
        this.f21292b = true;
        this.f21291a.close();
    }

    public final void a(k2 internalEventPublisher) {
        kotlin.jvm.internal.i.e(internalEventPublisher, "internalEventPublisher");
        if (this.f21292b) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, c.f21295b, 2, (Object) null);
            return;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, d.f21296b, 3, (Object) null);
        List listO0 = kotlin.collections.q.o0(this.f21291a.a());
        BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.V, (Throwable) null, new e(listO0), 2, (Object) null);
        internalEventPublisher.a(n0.f21651e.a(listO0), n0.class);
    }
}
