package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class d1 implements u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u2 f20837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k2 f20838b;

    public static final class a extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f20839b = new a();

        public a() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to delete the sealed session from the storage.";
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f20840b = new b();

        public b() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Error occured while publishing exception.";
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f20841b = new c();

        public c() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to get the active session from the storage.";
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f20842b = new d();

        public d() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to upsert active session in the storage.";
        }
    }

    public d1(u2 sessionStorageManager, k2 eventPublisher) {
        kotlin.jvm.internal.i.e(sessionStorageManager, "sessionStorageManager");
        kotlin.jvm.internal.i.e(eventPublisher, "eventPublisher");
        this.f20837a = sessionStorageManager;
        this.f20838b = eventPublisher;
    }

    @Override // bo.app.u2
    public t5 a() {
        try {
            return this.f20837a.a();
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, c.f20841b);
            a(this.f20838b, e10);
            return null;
        }
    }

    @Override // bo.app.u2
    public void a(t5 session) {
        kotlin.jvm.internal.i.e(session, "session");
        try {
            this.f20837a.a(session);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, d.f20842b);
            a(this.f20838b, e10);
        }
    }

    @Override // bo.app.u2
    public void a(String sessionId) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        try {
            this.f20837a.a(sessionId);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, a.f20839b);
            a(this.f20838b, e10);
        }
    }

    public final void a(k2 eventPublisher, Throwable throwable) {
        kotlin.jvm.internal.i.e(eventPublisher, "eventPublisher");
        kotlin.jvm.internal.i.e(throwable, "throwable");
        try {
            eventPublisher.a(new c6("A storage exception has occurred. Please view the stack trace for more details.", throwable), c6.class);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, b.f20840b);
        }
    }
}
