package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: bo.app.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1477o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f21671e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k2 f21672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r5 f21673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SharedPreferences f21674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f21675d;

    /* JADX INFO: renamed from: bo.app.o$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: bo.app.o$b */
    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f21676b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f21677c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f21678d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, long j10, long j11) {
            super(0);
            this.f21676b = j;
            this.f21677c = j10;
            this.f21678d = j11;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Messaging session timeout: " + this.f21676b + ", current diff: " + (this.f21677c - this.f21678d);
        }
    }

    /* JADX INFO: renamed from: bo.app.o$c */
    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f21679b = new c();

        public c() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Publishing new messaging session event.";
        }
    }

    /* JADX INFO: renamed from: bo.app.o$d */
    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f21680b = new d();

        public d() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Messaging session not started.";
        }
    }

    /* JADX INFO: renamed from: bo.app.o$e */
    public static final class e extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f21681b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j) {
            super(0);
            this.f21681b = j;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Messaging session stopped. Adding new messaging session timestamp: " + this.f21681b;
        }
    }

    public C1477o(Context applicationContext, k2 eventPublisher, r5 serverConfigStorageProvider) {
        kotlin.jvm.internal.i.e(applicationContext, "applicationContext");
        kotlin.jvm.internal.i.e(eventPublisher, "eventPublisher");
        kotlin.jvm.internal.i.e(serverConfigStorageProvider, "serverConfigStorageProvider");
        this.f21672a = eventPublisher;
        this.f21673b = serverConfigStorageProvider;
        this.f21674c = applicationContext.getSharedPreferences("com.appboy.storage.sessions.messaging_session", 0);
    }

    public final boolean a() {
        long jQ = this.f21673b.q();
        if (jQ == -1 || this.f21675d) {
            return false;
        }
        long j = this.f21674c.getLong("messaging_session_timestamp", -1L);
        long jNowInSeconds = DateTimeUtils.nowInSeconds();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new b(jQ, jNowInSeconds, j), 3, (Object) null);
        return j + jQ < jNowInSeconds;
    }

    public final void b() {
        if (!a()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, d.f21680b, 3, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c.f21679b, 3, (Object) null);
        this.f21672a.a(p3.f21718b, p3.class);
        this.f21675d = true;
    }

    public final void c() {
        long jNowInSeconds = DateTimeUtils.nowInSeconds();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new e(jNowInSeconds), 3, (Object) null);
        this.f21674c.edit().putLong("messaging_session_timestamp", jNowInSeconds).apply();
        this.f21675d = false;
    }
}
