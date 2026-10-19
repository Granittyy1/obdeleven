package bo.app;

import android.content.Context;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.location.IBrazeLocationApi;
import java.util.EnumSet;

/* JADX INFO: renamed from: bo.app.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1475m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IBrazeLocationApi f21482a;

    public C1475m(Context context, EnumSet allowedProviders, BrazeConfigurationProvider appConfigurationProvider) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(allowedProviders, "allowedProviders");
        kotlin.jvm.internal.i.e(appConfigurationProvider, "appConfigurationProvider");
        IBrazeLocationApi iBrazeLocationApi = null;
        try {
            Object objNewInstance = Class.forName("com.braze.location.BrazeInternalLocationApi").getDeclaredConstructor(null).newInstance(null);
            kotlin.jvm.internal.i.c(objNewInstance, "null cannot be cast to non-null type com.braze.location.IBrazeLocationApi");
            iBrazeLocationApi = (IBrazeLocationApi) objNewInstance;
        } catch (Exception unused) {
        }
        this.f21482a = iBrazeLocationApi;
        if (iBrazeLocationApi != null) {
            iBrazeLocationApi.initWithContext(context, allowedProviders, appConfigurationProvider);
        }
    }

    public final boolean a() {
        return this.f21482a != null;
    }

    public final boolean a(Ia.l manualLocationUpdateCallback) {
        kotlin.jvm.internal.i.e(manualLocationUpdateCallback, "manualLocationUpdateCallback");
        IBrazeLocationApi iBrazeLocationApi = this.f21482a;
        if (iBrazeLocationApi != null) {
            return iBrazeLocationApi.requestSingleLocationUpdate(manualLocationUpdateCallback);
        }
        return false;
    }
}
