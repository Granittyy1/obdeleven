package com.braze.managers;

import Ia.l;
import android.content.Context;
import bo.app.C1471i;
import bo.app.C1475m;
import bo.app.a2;
import bo.app.c2;
import bo.app.m2;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.LocationProviderName;
import com.braze.models.IBrazeLocation;
import com.braze.support.BrazeLogger;
import java.util.EnumSet;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: loaded from: classes.dex */
public final class a implements m2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f24139d = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c2 f24140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BrazeConfigurationProvider f24141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C1475m f24142c;

    /* JADX INFO: renamed from: com.braze.managers.a$a, reason: collision with other inner class name */
    public static final class C0248a extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0248a f24143b = new C0248a();

        public C0248a() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "***Location API not found. Please include android-sdk-location module***";
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: com.braze.managers.a$b$a, reason: collision with other inner class name */
        public static final class C0249a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Ref$ObjectRef f24144b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0249a(Ref$ObjectRef ref$ObjectRef) {
                super(0);
                this.f24144b = ref$ObjectRef;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Using location providers: " + this.f24144b.element;
            }
        }

        public /* synthetic */ b(kotlin.jvm.internal.e eVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [T, java.util.EnumSet] */
        /* JADX WARN: Type inference failed for: r9v3, types: [T, java.util.EnumSet] */
        public final EnumSet a(BrazeConfigurationProvider appConfigurationProvider) {
            i.e(appConfigurationProvider, "appConfigurationProvider");
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = EnumSet.of(LocationProviderName.PASSIVE, LocationProviderName.NETWORK);
            if (!appConfigurationProvider.getCustomLocationProviderNames().isEmpty()) {
                ref$ObjectRef.element = appConfigurationProvider.getCustomLocationProviderNames();
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new C0249a(ref$ObjectRef), 2, (Object) null);
            }
            T allowedLocationProviders = ref$ObjectRef.element;
            i.d(allowedLocationProviders, "allowedLocationProviders");
            return (EnumSet) allowedLocationProviders;
        }

        private b() {
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ IBrazeLocation f24145b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(IBrazeLocation iBrazeLocation) {
            super(0);
            this.f24145b = iBrazeLocation;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Invoked manualSetUserLocation for " + this.f24145b;
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f24146b = new d();

        public d() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to log location recorded event.";
        }
    }

    public static final class e extends Lambda implements l {
        public e() {
            super(1);
        }

        public final void a(IBrazeLocation it) {
            i.e(it, "it");
            a.this.a(it);
        }

        @Override // Ia.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((IBrazeLocation) obj);
            return r.f47939a;
        }
    }

    public a(Context context, c2 brazeManager, BrazeConfigurationProvider appConfigurationProvider) {
        i.e(context, "context");
        i.e(brazeManager, "brazeManager");
        i.e(appConfigurationProvider, "appConfigurationProvider");
        this.f24140a = brazeManager;
        this.f24141b = appConfigurationProvider;
        C1475m c1475m = new C1475m(context, f24139d.a(appConfigurationProvider), appConfigurationProvider);
        this.f24142c = c1475m;
        if (c1475m.a()) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, C0248a.f24143b, 2, (Object) null);
    }

    @Override // bo.app.m2
    public boolean a(IBrazeLocation location) {
        i.e(location, "location");
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new c(location), 2, (Object) null);
            a2 a2VarA = C1471i.f21202h.a(location);
            if (a2VarA != null) {
                this.f24140a.a(a2VarA);
            }
            return true;
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, d.f24146b);
            return false;
        }
    }

    @Override // bo.app.m2
    public boolean a() {
        return this.f24142c.a(new e());
    }
}
