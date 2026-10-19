package bo.app;

import android.content.Context;
import com.amazon.device.messaging.ADM;
import com.amazon.device.messaging.development.ADMManifest;
import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: bo.app.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1457b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f20735c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f20736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n2 f20737b;

    /* JADX INFO: renamed from: bo.app.b$a */
    public static final class a {

        /* JADX INFO: renamed from: bo.app.b$a$a, reason: collision with other inner class name */
        public static final class C0211a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0211a f20738b = new C0211a();

            public C0211a() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "com.amazon.device.messaging.ADM not found";
            }
        }

        /* JADX INFO: renamed from: bo.app.b$a$b, reason: collision with other inner class name */
        public static final class C0212b extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Exception f20739b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0212b(Exception exc) {
                super(0);
                this.f20739b = exc;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Manifest not authored properly to support ADM. ADM manifest exception: " + this.f20739b;
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private final boolean b(Context context) {
            try {
                ADMManifest.checkManifestAuthoredProperly(context);
                return true;
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new C0212b(e10), 2, (Object) null);
                return false;
            }
        }

        public final boolean a(Context context) {
            kotlin.jvm.internal.i.e(context, "context");
            return a() && b(context);
        }

        private a() {
        }

        private final boolean a() {
            try {
                Class.forName("com.amazon.device.messaging.ADM");
                return true;
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, C0211a.f20738b, 2, (Object) null);
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: bo.app.b$b, reason: collision with other inner class name */
    public static final class C0213b extends Lambda implements Ia.a {
        public C0213b() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "The device is already registered with the ADM server and is eligible to receive ADM messages.ADM registration id: " + C1457b.this.f20737b.a();
        }
    }

    /* JADX INFO: renamed from: bo.app.b$c */
    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f20741b = new c();

        public c() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Registering with ADM server...";
        }
    }

    public C1457b(Context context, n2 admRegistrationDataProvider) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(admRegistrationDataProvider, "admRegistrationDataProvider");
        this.f20736a = context;
        this.f20737b = admRegistrationDataProvider;
    }

    public final void a() {
        if (this.f20737b.a() != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new C0213b(), 2, (Object) null);
            n2 n2Var = this.f20737b;
            n2Var.a(n2Var.a());
        } else {
            ADM adm = new ADM(this.f20736a);
            if (adm.isSupported()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, c.f20741b, 2, (Object) null);
                adm.startRegister();
            }
        }
    }
}
