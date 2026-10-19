package com.braze;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import bo.app.C1457b;
import bo.app.C1458b0;
import bo.app.C1471i;
import bo.app.C1485x;
import bo.app.e7;
import bo.app.f7;
import bo.app.l5;
import bo.app.m6;
import bo.app.o4;
import bo.app.o5;
import bo.app.u4;
import com.braze.configuration.BrazeConfig;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.configuration.RuntimeAppConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.BrazePushEventType;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.enums.GeofenceTransitionType;
import com.braze.events.BrazeNetworkFailureEvent;
import com.braze.events.BrazePushEvent;
import com.braze.events.BrazeSdkAuthenticationErrorEvent;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.events.FeatureFlagsUpdatedEvent;
import com.braze.events.FeedUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.IValueCallback;
import com.braze.events.InAppMessageEvent;
import com.braze.events.NoMatchingTriggerEvent;
import com.braze.events.SdkDataWipeEvent;
import com.braze.events.SessionStateChangedEvent;
import com.braze.images.DefaultBrazeImageLoader;
import com.braze.images.IBrazeImageLoader;
import com.braze.models.FeatureFlag;
import com.braze.models.IBrazeLocation;
import com.braze.models.cards.Card;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.outgoing.BrazeLocation;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.PermissionUtils;
import com.braze.support.StringUtils;
import com.braze.support.ValidationUtils;
import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.B;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.G;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Braze implements IBraze {
    private static boolean areOutboundNetworkRequestsOffline;
    private static IBrazeNotificationFactory customBrazeNotificationFactory;
    private static bo.app.g2 deviceDataProvider;
    private static IBrazeEndpointProvider endpointProvider;
    private static volatile Braze instance;
    private static l5 sdkEnablementProvider;
    private static boolean shouldMockNetworkRequestsAndDropEvents;
    private Context applicationContext;
    private BrazeUser brazeUser;
    public BrazeConfigurationProvider configurationProvider;
    public bo.app.h2 deviceIdProvider;
    private bo.app.k2 externalIEventMessenger;
    public IBrazeImageLoader imageLoader;
    private Boolean isApiKeyPresent;
    private boolean isInstanceStopped;
    private bo.app.w3 offlineUserStorageProvider;
    public o4 pushDeliveryManager;
    private bo.app.n2 registrationDataProvider;
    public bo.app.d3 udm;
    public static final Companion Companion = new Companion(null);
    private static final ReentrantLock brazeClassLock = new ReentrantLock();
    private static final Set<String> KNOWN_APP_CRAWLER_DEVICE_MODELS = C.u("calypso appcrawler");
    private static final Set<String> NECESSARY_BRAZE_SDK_PERMISSIONS = B.C("android.permission.ACCESS_NETWORK_STATE", "android.permission.INTERNET");
    private static final ReentrantLock endpointProviderLock = new ReentrantLock();
    private static boolean shouldRequestFrameworkListenToNetworkUpdates = true;
    private static final List<BrazeConfig> pendingConfigurations = new ArrayList();
    private static final BrazeConfig clearConfigSentinel = new BrazeConfig.Builder().build();

    public static final class Companion {

        public static final class a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ EnumSet f23574b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(EnumSet enumSet) {
                super(0);
                this.f23574b = enumSet;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Failed to add SDK Metadata of: " + this.f23574b;
            }
        }

        public static final class a0 extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a0 f23575b = new a0();

            public a0() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Failed to delete data from the internal storage cache.";
            }
        }

        public static final class b extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f23576b = new b();

            public b() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Clearing Braze instance";
            }
        }

        public static final class b0 extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ File f23577b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b0(File file) {
                super(0);
                this.f23577b = file;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Deleting shared prefs file at: " + this.f23577b.getAbsolutePath();
            }
        }

        public static final class c extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BrazeConfig f23578b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(BrazeConfig brazeConfig) {
                super(0);
                this.f23578b = brazeConfig;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Braze.configure() called with configuration: " + this.f23578b;
            }
        }

        public static final class c0 extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c0 f23579b = new c0();

            public c0() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Failed to delete shared preference data for the Braze SDK.";
            }
        }

        public static final class d extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final d f23580b = new d();

            public d() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Braze.configure() cannot be called while the singleton is still live.";
            }
        }

        public static final class e extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final e f23581b = new e();

            public e() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Braze.configure() called with a null config; Clearing all configuration values.";
            }
        }

        public static final class f extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final f f23582b = new f();

            public f() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Stopping the SDK instance.";
            }
        }

        public static final class g extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final g f23583b = new g();

            public g() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Disabling all network requests";
            }
        }

        public static final class h extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final h f23584b = new h();

            public h() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Braze network requests already being mocked. Note that events dispatched in this mode are dropped.";
            }
        }

        public static final class i extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final i f23585b = new i();

            public i() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Braze network requests will be mocked. Events dispatchedin this mode will be dropped.";
            }
        }

        public static final class j extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final j f23586b = new j();

            public j() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Attempt to enable mocking Braze network requests had no effect since getInstance() has already been called.";
            }
        }

        public static final class k extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final k f23587b = new k();

            public k() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Setting SDK to enabled.";
            }
        }

        public static final class l extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final l f23588b = new l();

            public l() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Enabling all network requests";
            }
        }

        public static final class m extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final m f23589b = new m();

            public m() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Caught exception trying to get a Braze API endpoint from the BrazeEndpointProvider. Using the original URI";
            }
        }

        public static final class n extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final n f23590b = new n();

            public n() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Caught exception while retrieving API key.";
            }
        }

        public static final class o extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final o f23591b = new o();

            public o() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "SDK enablement provider was null. Returning SDK as enabled.";
            }
        }

        public static final class p extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final p f23592b = new p();

            public p() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "API key not present. Actions will not be performed on the SDK.";
            }
        }

        public static final class q extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final q f23593b = new q();

            public q() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "SDK is disabled. Actions will not be performed on the SDK.";
            }
        }

        public static final class r extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f23594b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public r(boolean z10) {
                super(0);
                this.f23594b = z10;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Braze SDK outbound network requests are now ".concat(this.f23594b ? "disabled" : FeatureFlag.ENABLED);
            }
        }

        public static final class s extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final s f23595b = new s();

            public s() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Push contained key for fetching test triggers, fetching triggers.";
            }
        }

        public static final class t extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final t f23596b = new t();

            public t() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "The instance is null. Allowing instance initialization";
            }
        }

        public static final class u extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final u f23597b = new u();

            public u() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "The instance was stopped. Allowing instance initialization";
            }
        }

        public static final class v extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final v f23598b = new v();

            public v() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "No API key was found previously. Allowing instance initialization";
            }
        }

        public static final class w extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final w f23599b = new w();

            public w() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Shutting down all queued work on the Braze SDK";
            }
        }

        public static final class x extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final x f23600b = new x();

            public x() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Sending sdk data wipe event to external subscribers";
            }
        }

        public static final class y extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final y f23601b = new y();

            public y() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Shutting down the singleton work queue";
            }
        }

        public static final class z extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final z f23602b = new z();

            public z() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Failed to shutdown queued work on the Braze SDK.";
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final l5 getSdkEnablementProvider(Context context) {
            l5 sdkEnablementProvider$android_sdk_base_release = getSdkEnablementProvider$android_sdk_base_release();
            if (sdkEnablementProvider$android_sdk_base_release != null) {
                return sdkEnablementProvider$android_sdk_base_release;
            }
            l5 l5Var = new l5(context);
            setSdkEnablementProvider$android_sdk_base_release(l5Var);
            return l5Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Uri setConfiguredCustomEndpoint$lambda$12$lambda$11(String str, Uri brazeEndpoint) {
            kotlin.jvm.internal.i.e(brazeEndpoint, "brazeEndpoint");
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            String encodedAuthority = uri.getEncodedAuthority();
            Uri.Builder builderBuildUpon = brazeEndpoint.buildUpon();
            if (scheme == null || kotlin.text.n.S(scheme) || encodedAuthority == null || kotlin.text.n.S(encodedAuthority)) {
                return builderBuildUpon.encodedAuthority(str).build();
            }
            builderBuildUpon.encodedAuthority(encodedAuthority);
            builderBuildUpon.scheme(scheme);
            return builderBuildUpon.build();
        }

        private final boolean shouldAllowSingletonInitialization() {
            Braze braze = Braze.instance;
            if (braze == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, t.f23596b, 2, (Object) null);
                return true;
            }
            if (braze.isInstanceStopped) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, u.f23597b, 3, (Object) null);
                return true;
            }
            if (!Boolean.FALSE.equals(braze.isApiKeyPresent$android_sdk_base_release())) {
                return false;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, v.f23598b, 3, (Object) null);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean wipeData$lambda$9(File file, String name) {
            kotlin.jvm.internal.i.e(name, "name");
            return (kotlin.text.m.I(name, "com.appboy", false) && !name.equals("com.appboy.override.configuration.cache")) || (kotlin.text.m.I(name, "com.braze", false) && !name.equals("com.braze.override.configuration.cache"));
        }

        public final void addSdkMetadata(Context context, EnumSet<BrazeSdkMetadata> sdkMetadata) {
            kotlin.jvm.internal.i.e(context, "context");
            kotlin.jvm.internal.i.e(sdkMetadata, "sdkMetadata");
            ReentrantLock reentrantLock = Braze.brazeClassLock;
            reentrantLock.lock();
            try {
                try {
                    Braze.pendingConfigurations.add(new BrazeConfig.Builder().setSdkMetadata(sdkMetadata).build());
                    Braze braze = Braze.instance;
                    if (braze != null) {
                        braze.applyPendingRuntimeConfiguration$android_sdk_base_release();
                        p293xa.r rVar = p293xa.r.f47939a;
                    }
                } catch (Exception e10) {
                    BrazeLogger.INSTANCE.brazelog(Braze.Companion, BrazeLogger.Priority.E, e10, new a(sdkMetadata));
                    p293xa.r rVar2 = p293xa.r.f47939a;
                }
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void clearEndpointProvider() {
            ReentrantLock reentrantLock = Braze.endpointProviderLock;
            reentrantLock.lock();
            try {
                Braze.endpointProvider = null;
                p293xa.r rVar = p293xa.r.f47939a;
            } finally {
                reentrantLock.unlock();
            }
        }

        public final /* synthetic */ void clearInstance$android_sdk_base_release() {
            ReentrantLock reentrantLock = Braze.brazeClassLock;
            reentrantLock.lock();
            try {
                Braze braze = Braze.instance;
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                Companion companion = Braze.Companion;
                BrazeLogger.brazelog$default(brazeLogger, companion, BrazeLogger.Priority.W, (Throwable) null, b.f23576b, 2, (Object) null);
                BrazeCoroutineScope.cancelChildren();
                if (braze != null && braze.udm != null) {
                    braze.getUdm$android_sdk_base_release().m().g();
                }
                Braze.instance = null;
                Braze.shouldMockNetworkRequestsAndDropEvents = false;
                Braze.areOutboundNetworkRequestsOffline = false;
                companion.setSdkEnablementProvider$android_sdk_base_release(null);
                Braze.endpointProvider = null;
                companion.setShouldRequestFrameworkListenToNetworkUpdates$android_sdk_base_release(true);
                p293xa.r rVar = p293xa.r.f47939a;
            } finally {
                reentrantLock.unlock();
            }
        }

        public final boolean configure(Context context, BrazeConfig brazeConfig) {
            kotlin.jvm.internal.i.e(context, "context");
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.I;
            BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new c(brazeConfig), 2, (Object) null);
            ReentrantLock reentrantLock = Braze.brazeClassLock;
            reentrantLock.lock();
            try {
                Braze braze = Braze.instance;
                if (braze != null && !braze.isInstanceStopped && Boolean.TRUE.equals(braze.isApiKeyPresent$android_sdk_base_release())) {
                    BrazeLogger.brazelog$default(brazeLogger, Braze.Companion, priority, (Throwable) null, d.f23580b, 2, (Object) null);
                    return false;
                }
                if (brazeConfig != null) {
                    Braze.pendingConfigurations.add(brazeConfig);
                } else {
                    BrazeLogger.brazelog$default(brazeLogger, Braze.Companion, priority, (Throwable) null, e.f23581b, 2, (Object) null);
                    Braze.pendingConfigurations.add(Braze.clearConfigSentinel);
                }
                return true;
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void disableSdk(Context context) {
            kotlin.jvm.internal.i.e(context, "context");
            getSdkEnablementProvider(context).a(true);
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.W;
            BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, f.f23582b, 2, (Object) null);
            stopInstance$android_sdk_base_release();
            BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, g.f23583b, 2, (Object) null);
            setOutboundNetworkRequestsOffline(true);
        }

        public final boolean enableMockNetworkRequestsAndDropEventsMode() {
            if (Braze.instance == null) {
                ReentrantLock reentrantLock = Braze.brazeClassLock;
                reentrantLock.lock();
                try {
                    if (Braze.instance == null) {
                        if (Braze.shouldMockNetworkRequestsAndDropEvents) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Braze.Companion, BrazeLogger.Priority.I, (Throwable) null, h.f23584b, 2, (Object) null);
                        } else {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Braze.Companion, BrazeLogger.Priority.I, (Throwable) null, i.f23585b, 2, (Object) null);
                            Braze.shouldMockNetworkRequestsAndDropEvents = true;
                        }
                        reentrantLock.unlock();
                        return true;
                    }
                    p293xa.r rVar = p293xa.r.f47939a;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, j.f23586b, 2, (Object) null);
            return false;
        }

        public final void enableSdk(Context context) {
            kotlin.jvm.internal.i.e(context, "context");
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.W;
            BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, k.f23587b, 2, (Object) null);
            getSdkEnablementProvider(context).a(false);
            BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, l.f23588b, 2, (Object) null);
            setOutboundNetworkRequestsOffline(false);
        }

        public final Uri getApiEndpoint(Uri brazeEndpoint) {
            kotlin.jvm.internal.i.e(brazeEndpoint, "brazeEndpoint");
            ReentrantLock reentrantLock = Braze.endpointProviderLock;
            reentrantLock.lock();
            try {
                IBrazeEndpointProvider iBrazeEndpointProvider = Braze.endpointProvider;
                if (iBrazeEndpointProvider != null) {
                    try {
                        Uri apiEndpoint = iBrazeEndpointProvider.getApiEndpoint(brazeEndpoint);
                        if (apiEndpoint != null) {
                            reentrantLock.unlock();
                            return apiEndpoint;
                        }
                    } catch (Exception e10) {
                        BrazeLogger.INSTANCE.brazelog(Braze.Companion, BrazeLogger.Priority.W, e10, m.f23589b);
                    }
                }
                reentrantLock.unlock();
                return brazeEndpoint;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        public final String getConfiguredApiKey(BrazeConfigurationProvider configurationProvider) {
            kotlin.jvm.internal.i.e(configurationProvider, "configurationProvider");
            try {
                return configurationProvider.getBrazeApiKey().toString();
            } catch (Exception e10) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, n.f23590b);
                return null;
            }
        }

        public final IBrazeNotificationFactory getCustomBrazeNotificationFactory() {
            return Braze.customBrazeNotificationFactory;
        }

        public final bo.app.g2 getDeviceDataProvider$android_sdk_base_release() {
            return Braze.deviceDataProvider;
        }

        public final Braze getInstance(Context context) {
            kotlin.jvm.internal.i.e(context, "context");
            if (shouldAllowSingletonInitialization()) {
                ReentrantLock reentrantLock = Braze.brazeClassLock;
                reentrantLock.lock();
                try {
                    if (Braze.Companion.shouldAllowSingletonInitialization()) {
                        Braze braze = new Braze(context);
                        braze.isInstanceStopped = false;
                        Braze.instance = braze;
                        reentrantLock.unlock();
                        return braze;
                    }
                    p293xa.r rVar = p293xa.r.f47939a;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            Braze braze2 = Braze.instance;
            kotlin.jvm.internal.i.c(braze2, "null cannot be cast to non-null type com.braze.Braze");
            return braze2;
        }

        public final boolean getOutboundNetworkRequestsOffline() {
            return Braze.areOutboundNetworkRequestsOffline;
        }

        public final l5 getSdkEnablementProvider$android_sdk_base_release() {
            return Braze.sdkEnablementProvider;
        }

        public final boolean getShouldRequestFrameworkListenToNetworkUpdates$android_sdk_base_release() {
            return Braze.shouldRequestFrameworkListenToNetworkUpdates;
        }

        public final boolean isDisabled() {
            l5 sdkEnablementProvider$android_sdk_base_release = getSdkEnablementProvider$android_sdk_base_release();
            if (sdkEnablementProvider$android_sdk_base_release == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, o.f23591b, 3, (Object) null);
                return false;
            }
            Braze braze = Braze.instance;
            if (braze != null && Boolean.FALSE.equals(braze.isApiKeyPresent$android_sdk_base_release())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, p.f23592b, 2, (Object) null);
                return true;
            }
            boolean zA = sdkEnablementProvider$android_sdk_base_release.a();
            if (zA) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, q.f23593b, 2, (Object) null);
            }
            return zA;
        }

        public final void requestTriggersIfInAppMessageTestPush$android_sdk_base_release(Intent intent, bo.app.c2 brazeManager) {
            kotlin.jvm.internal.i.e(intent, "intent");
            kotlin.jvm.internal.i.e(brazeManager, "brazeManager");
            String stringExtra = intent.getStringExtra(Constants.BRAZE_PUSH_FETCH_TEST_TRIGGERS_KEY);
            if (stringExtra == null || !stringExtra.equals("true")) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, s.f23595b, 2, (Object) null);
            brazeManager.a(new bo.app.b4.a(null, null, null, null, 15, null).e());
        }

        public final void setConfiguredCustomEndpoint$android_sdk_base_release(String str) {
            ReentrantLock reentrantLock = Braze.endpointProviderLock;
            reentrantLock.lock();
            try {
                Braze.Companion.setEndpointProvider(new Z3.l(str));
                p293xa.r rVar = p293xa.r.f47939a;
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void setCustomBrazeNotificationFactory(IBrazeNotificationFactory iBrazeNotificationFactory) {
            Braze.customBrazeNotificationFactory = iBrazeNotificationFactory;
        }

        public final void setDeviceDataProvider$android_sdk_base_release(bo.app.g2 g2Var) {
            Braze.deviceDataProvider = g2Var;
        }

        public final void setEndpointProvider(IBrazeEndpointProvider iBrazeEndpointProvider) {
            ReentrantLock reentrantLock = Braze.endpointProviderLock;
            reentrantLock.lock();
            try {
                Braze.endpointProvider = iBrazeEndpointProvider;
                p293xa.r rVar = p293xa.r.f47939a;
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void setOutboundNetworkRequestsOffline(boolean z10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new r(z10), 2, (Object) null);
            ReentrantLock reentrantLock = Braze.brazeClassLock;
            reentrantLock.lock();
            try {
                Braze.areOutboundNetworkRequestsOffline = z10;
                Braze braze = Braze.instance;
                if (braze != null) {
                    braze.setSyncPolicyOfflineStatus(z10);
                    p293xa.r rVar = p293xa.r.f47939a;
                }
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void setSdkEnablementProvider$android_sdk_base_release(l5 l5Var) {
            Braze.sdkEnablementProvider = l5Var;
        }

        public final void setShouldRequestFrameworkListenToNetworkUpdates$android_sdk_base_release(boolean z10) {
            Braze.shouldRequestFrameworkListenToNetworkUpdates = z10;
        }

        public final void stopInstance$android_sdk_base_release() {
            try {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.I, (Throwable) null, w.f23599b, 2, (Object) null);
                ReentrantLock reentrantLock = Braze.brazeClassLock;
                reentrantLock.lock();
                try {
                    BrazeCoroutineScope.cancelChildren();
                    Braze braze = Braze.instance;
                    if (braze != null) {
                        Companion companion = Braze.Companion;
                        BrazeLogger.brazelog$default(brazeLogger, companion, BrazeLogger.Priority.V, (Throwable) null, x.f23600b, 2, (Object) null);
                        braze.getExternalIEventMessenger$android_sdk_base_release().a(new SdkDataWipeEvent(), SdkDataWipeEvent.class);
                        BrazeLogger.brazelog$default(brazeLogger, companion, (BrazeLogger.Priority) null, (Throwable) null, y.f23601b, 3, (Object) null);
                        o5.f21705a.a();
                        if (braze.udm != null) {
                            braze.getUdm$android_sdk_base_release().m().a(true);
                            braze.getUdm$android_sdk_base_release().o().a();
                            braze.getUdm$android_sdk_base_release().r().unregisterGeofences();
                        }
                        braze.isInstanceStopped = true;
                    }
                    p293xa.r rVar = p293xa.r.f47939a;
                } finally {
                    reentrantLock.unlock();
                }
            } catch (Exception e10) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, z.f23602b);
            }
        }

        public final void wipeData(Context context) {
            File[] fileArrListFiles;
            kotlin.jvm.internal.i.e(context, "context");
            stopInstance$android_sdk_base_release();
            try {
                m6.f21552e.a(context);
                DefaultBrazeImageLoader.Companion.a(context);
            } catch (Exception e10) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, a0.f23575b);
            }
            try {
                File file = new File(context.getApplicationInfo().dataDir, "shared_prefs");
                if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles(new com.braze.a())) != null) {
                    for (File file2 : Q3.d.h(fileArrListFiles)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Braze.Companion, BrazeLogger.Priority.V, (Throwable) null, new b0(file2), 2, (Object) null);
                        kotlin.jvm.internal.i.d(file2, "file");
                        BrazeFileUtils.deleteSharedPreferencesFile(context, file2);
                    }
                }
            } catch (Exception e11) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e11, c0.f23579b);
            }
        }

        private Companion() {
        }

        public static /* synthetic */ void getCustomBrazeNotificationFactory$annotations() {
        }

        public static /* synthetic */ void getDeviceDataProvider$android_sdk_base_release$annotations() {
        }

        public static /* synthetic */ void getOutboundNetworkRequestsOffline$annotations() {
        }

        public static /* synthetic */ void getSdkEnablementProvider$android_sdk_base_release$annotations() {
        }

        public static /* synthetic */ void getShouldRequestFrameworkListenToNetworkUpdates$android_sdk_base_release$annotations() {
        }

        public static /* synthetic */ void isDisabled$annotations() {
        }
    }

    public static final class a extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f23603b = new a();

        public a() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Braze SDK Initializing";
        }
    }

    public static final class a0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a0 f23604b = new a0();

        public a0() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to retrieve the device id.";
        }
    }

    public static final class a1 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23605b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Braze f23606c;

        public static final class a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f23607b = new a();

            public a() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Card ID cannot be null or blank.";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a1(String str, Braze braze) {
            super(0);
            this.f23605b = str;
            this.f23606c = braze;
        }

        public final void a() {
            String str = this.f23605b;
            if (str == null || kotlin.text.n.S(str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.f23606c, BrazeLogger.Priority.W, (Throwable) null, a.f23607b, 2, (Object) null);
                return;
            }
            bo.app.a2 a2VarF = C1471i.f21202h.f(this.f23605b);
            if (a2VarF != null) {
                this.f23606c.getUdm$android_sdk_base_release().h().a(a2VarF);
            }
            this.f23606c.getUdm$android_sdk_base_release().d().markCardAsViewed(this.f23605b);
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class a2 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23608b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ GeofenceTransitionType f23609c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Braze f23610d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a2(String str, GeofenceTransitionType geofenceTransitionType, Braze braze) {
            super(0);
            this.f23608b = str;
            this.f23609c = geofenceTransitionType;
            this.f23610d = braze;
        }

        public final void a() {
            String str = this.f23608b;
            if (str == null || kotlin.text.n.S(str) || this.f23609c == null) {
                return;
            }
            this.f23610d.getUdm$android_sdk_base_release().r().postGeofenceReport(this.f23608b, this.f23609c);
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class a3 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a3 f23611b = new a3();

        public a3() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to initialize geofences with the geofence manager.";
        }
    }

    public static final class a4 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a4 f23612b = new a4();

        public a4() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to add subscriber to new in-app messages.";
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23613b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.f23613b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Device build model matches a known crawler. Enabling mock network request mode. Device it: " + this.f23613b;
        }
    }

    public static final class b0 extends SuspendLambda implements Ia.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f23614b;

        public b0(kotlin.coroutines.c cVar) {
            super(2, cVar);
        }

        @Override // Ia.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(A a10, kotlin.coroutines.c cVar) {
            return ((b0) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return Braze.this.new b0(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.f23614b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return Braze.this.getDeviceIdProvider$android_sdk_base_release().getDeviceId();
        }
    }

    public static final class b1 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b1 f23616b = new b1();

        public b1() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to log that the feed was displayed.";
        }
    }

    public static final class b2 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InAppMessageEvent f23617b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b2(InAppMessageEvent inAppMessageEvent) {
            super(0);
            this.f23617b = inAppMessageEvent;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Error reenqueueing In-App Message from event " + this.f23617b;
        }
    }

    public static final class b3 extends Lambda implements Ia.a {
        public b3() {
            super(0);
        }

        public final void a() {
            Braze.this.getUdm$android_sdk_base_release().r().initializeGeofences();
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class b4 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b4 f23619b = new b4();

        public b4() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to add subscriber to no matching trigger events.";
        }
    }

    public static final class c extends Lambda implements Ia.a {
        public c() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Created external messenger " + Braze.this.getExternalIEventMessenger$android_sdk_base_release();
        }
    }

    public static final class c0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c0 f23621b = new c0();

        public c0() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to get all feature flags";
        }
    }

    public static final class c1 extends Lambda implements Ia.a {
        public c1() {
            super(0);
        }

        public final void a() {
            bo.app.a2 a2VarA = C1471i.f21202h.a();
            if (a2VarA != null) {
                Braze.this.getUdm$android_sdk_base_release().h().a(a2VarA);
            }
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class c2 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InAppMessageEvent f23624c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c2(InAppMessageEvent inAppMessageEvent) {
            super(0);
            this.f23624c = inAppMessageEvent;
        }

        public final void a() {
            Braze.this.getUdm$android_sdk_base_release().v().d(this.f23624c.getTriggerAction());
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class c3 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c3 f23625b = new c3();

        public c3() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to request data flush.";
        }
    }

    public static final class c4 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c4 f23626b = new c4();

        public c4() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to add subscriber for push notification updates.";
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f23627b = new d();

        public d() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to perform initial Braze singleton setup.";
        }
    }

    public static final class d0 extends SuspendLambda implements Ia.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f23628b;

        public d0(kotlin.coroutines.c cVar) {
            super(2, cVar);
        }

        @Override // Ia.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(A a10, kotlin.coroutines.c cVar) {
            return ((d0) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return Braze.this.new d0(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.f23628b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return Braze.this.getUdm$android_sdk_base_release().n().A() ? bo.app.m1.a(Braze.this.getUdm$android_sdk_base_release().x(), null, 1, null) : EmptyList.f42983b;
        }
    }

    public static final class d1 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d1 f23630b = new d1();

        public d1() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to log location recorded event.";
        }
    }

    public static final class d2 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d2 f23631b = new d2();

        public d2() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to refresh feature flags.";
        }
    }

    public static final class d3 extends Lambda implements Ia.a {

        public static final class a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f23633b = new a();

            public a() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "requestImmediateDataFlush() called";
            }
        }

        public d3() {
            super(0);
        }

        public final void a() {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Braze.this, BrazeLogger.Priority.V, (Throwable) null, a.f23633b, 2, (Object) null);
            Braze.this.getUdm$android_sdk_base_release().h().e();
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class d4 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d4 f23634b = new d4();

        public d4() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to add subscriber for SDK authentication failures.";
        }
    }

    public static final class e extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f23636c;

        public static final class a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f23637b = new a();

            public a() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Failed to startup user dependency manager.";
            }
        }

        public static final class b extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f23638b = new b();

            public b() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Firebase Cloud Messaging found. Setting up Firebase Cloud Messaging.";
            }
        }

        public static final class c extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f23639b = new c();

            public c() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Firebase Cloud Messaging requirements not met. Braze will not register for Firebase Cloud Messaging.";
            }
        }

        public static final class d extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final d f23640b = new d();

            public d() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Automatic Firebase Cloud Messaging registration not enabled in configuration. Braze will not register for Firebase Cloud Messaging.";
            }
        }

        /* JADX INFO: renamed from: com.braze.Braze$e$e, reason: collision with other inner class name */
        public static final class C0245e extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0245e f23641b = new C0245e();

            public C0245e() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Amazon Device Messaging found. Setting up Amazon Device Messaging";
            }
        }

        public static final class f extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final f f23642b = new f();

            public f() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "ADM manifest requirements not met. Braze will not register for ADM.";
            }
        }

        public static final class g extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final g f23643b = new g();

            public g() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Automatic ADM registration not enabled in configuration. Braze will not register for ADM.";
            }
        }

        public static final class h extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final h f23644b = new h();

            public h() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Failed to setup pre SDK tasks";
            }
        }

        public static final class i extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final i f23645b = new i();

            public i() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Starting up a new user dependency manager";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context) {
            super(0);
            this.f23636c = context;
        }

        public final void a() {
            Braze.this.applyPendingRuntimeConfiguration$android_sdk_base_release();
            Braze.this.setConfigurationProvider$android_sdk_base_release(new BrazeConfigurationProvider(Braze.this.applicationContext));
            Braze braze = Braze.this;
            Companion companion = Braze.Companion;
            String configuredApiKey = companion.getConfiguredApiKey(braze.getConfigurationProvider$android_sdk_base_release());
            braze.setApiKeyPresent$android_sdk_base_release(Boolean.valueOf(!(configuredApiKey == null || kotlin.text.n.S(configuredApiKey))));
            BrazeLogger.setInitialLogLevelFromConfiguration(Braze.this.getConfigurationProvider$android_sdk_base_release().getLoggerInitialLogLevel());
            BrazeLogger.checkForSystemLogLevelProperty$default(false, 1, null);
            if (companion.getSdkEnablementProvider(this.f23636c).a()) {
                companion.setOutboundNetworkRequestsOffline(true);
            }
            Braze.this.setPushDeliveryManager$android_sdk_base_release(new o4(Braze.this.applicationContext, Braze.this.getConfigurationProvider$android_sdk_base_release().getBrazeApiKey().toString()));
            Braze.this.setDeviceIdProvider$android_sdk_base_release(new bo.app.l0(Braze.this.applicationContext));
            Braze.this.offlineUserStorageProvider = new bo.app.w3(Braze.this.applicationContext);
            Braze.this.registrationDataProvider = new u4(Braze.this.applicationContext, Braze.this.getConfigurationProvider$android_sdk_base_release());
            String customEndpoint = Braze.this.getConfigurationProvider$android_sdk_base_release().getCustomEndpoint();
            if (customEndpoint != null && !kotlin.text.n.S(customEndpoint)) {
                companion.setConfiguredCustomEndpoint$android_sdk_base_release(Braze.this.getConfigurationProvider$android_sdk_base_release().getCustomEndpoint());
            }
            try {
                if (Braze.this.getConfigurationProvider$android_sdk_base_release().isFirebaseCloudMessagingRegistrationEnabled()) {
                    Context context = this.f23636c;
                    bo.app.n2 n2Var = Braze.this.registrationDataProvider;
                    if (n2Var == null) {
                        kotlin.jvm.internal.i.m("registrationDataProvider");
                        throw null;
                    }
                    bo.app.t1 t1Var = new bo.app.t1(context, n2Var);
                    if (t1Var.a()) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Braze.this, BrazeLogger.Priority.I, (Throwable) null, b.f23638b, 2, (Object) null);
                        String firebaseCloudMessagingSenderIdKey = Braze.this.getConfigurationProvider$android_sdk_base_release().getFirebaseCloudMessagingSenderIdKey();
                        if (firebaseCloudMessagingSenderIdKey != null) {
                            t1Var.a(firebaseCloudMessagingSenderIdKey);
                        }
                    } else {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Braze.this, BrazeLogger.Priority.W, (Throwable) null, c.f23639b, 2, (Object) null);
                    }
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Braze.this, BrazeLogger.Priority.I, (Throwable) null, d.f23640b, 2, (Object) null);
                }
                if (!Braze.this.getConfigurationProvider$android_sdk_base_release().isAdmMessagingRegistrationEnabled()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Braze.this, BrazeLogger.Priority.I, (Throwable) null, g.f23643b, 2, (Object) null);
                } else if (C1457b.f20735c.a(Braze.this.applicationContext)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Braze.this, BrazeLogger.Priority.I, (Throwable) null, C0245e.f23641b, 2, (Object) null);
                    Context context2 = Braze.this.applicationContext;
                    bo.app.n2 n2Var2 = Braze.this.registrationDataProvider;
                    if (n2Var2 == null) {
                        kotlin.jvm.internal.i.m("registrationDataProvider");
                        throw null;
                    }
                    new C1457b(context2, n2Var2).a();
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Braze.this, BrazeLogger.Priority.W, (Throwable) null, f.f23642b, 2, (Object) null);
                }
                Braze.this.verifyProperSdkSetup();
            } catch (Exception e10) {
                BrazeLogger.INSTANCE.brazelog(Braze.this, BrazeLogger.Priority.E, e10, h.f23644b);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Braze.this, BrazeLogger.Priority.V, (Throwable) null, i.f23645b, 2, (Object) null);
            try {
                Braze braze2 = Braze.this;
                Context context3 = braze2.applicationContext;
                bo.app.w3 w3Var = Braze.this.offlineUserStorageProvider;
                if (w3Var == null) {
                    kotlin.jvm.internal.i.m("offlineUserStorageProvider");
                    throw null;
                }
                BrazeConfigurationProvider configurationProvider$android_sdk_base_release = Braze.this.getConfigurationProvider$android_sdk_base_release();
                bo.app.k2 externalIEventMessenger$android_sdk_base_release = Braze.this.getExternalIEventMessenger$android_sdk_base_release();
                bo.app.h2 deviceIdProvider$android_sdk_base_release = Braze.this.getDeviceIdProvider$android_sdk_base_release();
                bo.app.n2 n2Var3 = Braze.this.registrationDataProvider;
                if (n2Var3 != null) {
                    braze2.setUserSpecificMemberVariablesAndStartDispatch(new f7(context3, w3Var, configurationProvider$android_sdk_base_release, externalIEventMessenger$android_sdk_base_release, deviceIdProvider$android_sdk_base_release, n2Var3, Braze.this.getPushDeliveryManager$android_sdk_base_release(), Braze.shouldMockNetworkRequestsAndDropEvents, Braze.areOutboundNetworkRequestsOffline, Braze.this.getDeviceDataProvider(), Braze.Companion.getShouldRequestFrameworkListenToNetworkUpdates$android_sdk_base_release()));
                } else {
                    kotlin.jvm.internal.i.m("registrationDataProvider");
                    throw null;
                }
            } catch (Exception e11) {
                BrazeLogger.INSTANCE.brazelog(Braze.this, BrazeLogger.Priority.E, e11, a.f23637b);
                Braze.this.publishError(e11);
            }
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class e0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e0 f23646b = new e0();

        public e0() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "The ContentCardsUpdatedEvent was null. Returning null for the list of cached cards.";
        }
    }

    public static final class e1 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ IBrazeLocation f23647b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Braze f23648c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e1(IBrazeLocation iBrazeLocation, Braze braze) {
            super(0);
            this.f23647b = iBrazeLocation;
            this.f23648c = braze;
        }

        public final void a() {
            bo.app.a2 a2VarA = C1471i.f21202h.a(this.f23647b);
            if (a2VarA != null) {
                this.f23648c.getUdm$android_sdk_base_release().h().a(a2VarA);
            }
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class e2 extends Lambda implements Ia.a {

        public static final class a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f23650b = new a();

            public a() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Feature flags not enabled. Not refreshing feature flags.";
            }
        }

        public e2() {
            super(0);
        }

        public final void a() {
            if (Braze.this.getUdm$android_sdk_base_release().n().A()) {
                Braze.this.getUdm$android_sdk_base_release().x().h();
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Braze.this, BrazeLogger.Priority.I, (Throwable) null, a.f23650b, 2, (Object) null);
                Braze.this.getUdm$android_sdk_base_release().g().a(new bo.app.o1(), bo.app.o1.class);
            }
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class e3 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e3 f23651b = new e3();

        public e3() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Location permissions were granted. Requesting geofence and location initialization.";
        }
    }

    public static final class e4 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e4 f23652b = new e4();

        public e4() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to add subscriber for session updates.";
        }
    }

    public static final class f extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f23653b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f23654c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(long j, long j10) {
            super(0);
            this.f23653b = j;
            this.f23654c = j10;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return p005a4.o.d(TimeUnit.MILLISECONDS.convert(this.f23653b - this.f23654c, TimeUnit.NANOSECONDS), " ms.", new StringBuilder("Braze SDK loaded in "));
        }
    }

    public static final class f0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f0 f23655b = new f0();

        public f0() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "ConfigurationProvider has not been initialized. Constructing a new one.";
        }
    }

    public static final class f1 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23656b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f1(String str) {
            super(0);
            this.f23656b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to log purchase event of: " + this.f23656b;
        }
    }

    public static final class f2 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f2 f23657b = new f2();

        public f2() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to get the registered push registration token.";
        }
    }

    public static final class f3 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f3 f23658b = new f3();

        public f3() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to request single location update";
        }
    }

    public static final class f4 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f4 f23659b = new f4();

        public f4() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to validate and store push identifier";
        }
    }

    public static final class g extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23660b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f23661c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2) {
            super(0);
            this.f23660b = str;
            this.f23661c = str2;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to update ContentCard storage provider with single card update. User id: " + this.f23660b + " Serialized json: " + this.f23661c;
        }
    }

    public static final class g0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g0 f23662b = new g0();

        public g0() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "The ContentCardsUpdatedEvent was null. Returning the default value for the card count.";
        }
    }

    public static final class g1 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23663b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f23664c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ BigDecimal f23665d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f23666e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Braze f23667f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ BrazeProperties f23668g;

        public static final class a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f23669b = new a();

            public a() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Log purchase input was invalid. Not logging in-app purchase to Braze.";
            }
        }

        public static final class b extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f23670b = new b();

            public b() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Purchase logged with invalid properties. Not logging custom event to Braze.";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g1(String str, String str2, BigDecimal bigDecimal, int i10, Braze braze, BrazeProperties brazeProperties) {
            super(0);
            this.f23663b = str;
            this.f23664c = str2;
            this.f23665d = bigDecimal;
            this.f23666e = i10;
            this.f23667f = braze;
            this.f23668g = brazeProperties;
        }

        public final void a() {
            String str = this.f23663b;
            if (!ValidationUtils.isValidLogPurchaseInput(str, this.f23664c, this.f23665d, this.f23666e, this.f23667f.getUdm$android_sdk_base_release().n())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.f23667f, BrazeLogger.Priority.W, (Throwable) null, a.f23669b, 2, (Object) null);
                return;
            }
            BrazeProperties brazeProperties = this.f23668g;
            if (brazeProperties != null && brazeProperties.isInvalid()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.f23667f, BrazeLogger.Priority.W, (Throwable) null, b.f23670b, 2, (Object) null);
                return;
            }
            String strEnsureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength(str);
            C1471i.a aVar = C1471i.f21202h;
            String str2 = this.f23664c;
            kotlin.jvm.internal.i.b(str2);
            BigDecimal bigDecimal = this.f23665d;
            kotlin.jvm.internal.i.b(bigDecimal);
            bo.app.a2 a2VarA = aVar.a(strEnsureBrazeFieldLength, str2, bigDecimal, this.f23666e, this.f23668g);
            if (a2VarA != null && this.f23667f.getUdm$android_sdk_base_release().h().a(a2VarA)) {
                this.f23667f.getUdm$android_sdk_base_release().v().a(new bo.app.h4(strEnsureBrazeFieldLength, this.f23668g, a2VarA));
            }
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class g2 extends SuspendLambda implements Ia.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f23671b;

        public g2(kotlin.coroutines.c cVar) {
            super(2, cVar);
        }

        @Override // Ia.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(A a10, kotlin.coroutines.c cVar) {
            return ((g2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return Braze.this.new g2(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.f23671b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            bo.app.n2 n2Var = Braze.this.registrationDataProvider;
            if (n2Var != null) {
                return n2Var.a();
            }
            kotlin.jvm.internal.i.m("registrationDataProvider");
            throw null;
        }
    }

    public static final class g3 extends Lambda implements Ia.a {
        public g3() {
            super(0);
        }

        public final void a() {
            Braze.this.getUdm$android_sdk_base_release().q().a();
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class g4 extends SuspendLambda implements Ia.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f23674b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f23676d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g4(String str, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f23676d = str;
        }

        @Override // Ia.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(A a10, kotlin.coroutines.c cVar) {
            return ((g4) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return Braze.this.new g4(this.f23676d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.f23674b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return Boolean.valueOf(Braze.this.getUdm$android_sdk_base_release().f().c(this.f23676d));
        }
    }

    public static final class h extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23677b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Braze f23678c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f23679d;

        public static final class a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f23680b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f23681c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, String str2) {
                super(0);
                this.f23680b = str;
                this.f23681c = str2;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Cannot add null or blank card json to storage. Returning. User id: " + this.f23680b + " Serialized json: " + this.f23681c;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, Braze braze, String str2) {
            super(0);
            this.f23677b = str;
            this.f23678c = braze;
            this.f23679d = str2;
        }

        public final void a() {
            if (kotlin.text.n.S(this.f23677b)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.f23678c, BrazeLogger.Priority.W, (Throwable) null, new a(this.f23679d, this.f23677b), 2, (Object) null);
                return;
            }
            this.f23678c.getUdm$android_sdk_base_release().s().a(new C1485x(this.f23677b), this.f23679d);
            this.f23678c.getExternalIEventMessenger$android_sdk_base_release().a(this.f23678c.getUdm$android_sdk_base_release().s().getCachedCardsAsEvent(), ContentCardsUpdatedEvent.class);
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class h0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h0 f23682b = new h0();

        public h0() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "The ContentCardsUpdatedEvent was null. Returning the default value for the unviewed card count.";
        }
    }

    public static final class h1 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23683b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h1(String str) {
            super(0);
            this.f23683b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Error logging Push Delivery " + this.f23683b;
        }
    }

    public static final class h2 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23684b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h2(String str) {
            super(0);
            this.f23684b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to set the push token " + this.f23684b;
        }
    }

    public static final class h3 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InAppMessageEvent f23685b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h3(InAppMessageEvent inAppMessageEvent) {
            super(0);
            this.f23685b = inAppMessageEvent;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Error retrying In-App Message from event " + this.f23685b;
        }
    }

    public static final class h4 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23686b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h4(String str) {
            super(0);
            this.f23686b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Q8.d.a(new StringBuilder("The Braze SDK requires the permission "), this.f23686b, ". Check your AndroidManifest.");
        }
    }

    public static final class i extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f23687b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Class cls) {
            super(0);
            this.f23687b = cls;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to add synchronous subscriber for class: " + this.f23687b;
        }
    }

    public static final class i0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final i0 f23688b = new i0();

        public i0() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "The ContentCardsUpdatedEvent was null. Returning the default value for the last update timestamp.";
        }
    }

    public static final class i1 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f23690c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f23691d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i1(String str, long j) {
            super(0);
            this.f23690c = str;
            this.f23691d = j;
        }

        public final void a() {
            Braze.this.getUdm$android_sdk_base_release().h().a(this.f23690c);
            Braze.this.schedulePushDelivery$android_sdk_base_release(this.f23691d);
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class i2 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f23693c;

        public static final class a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f23694b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str) {
                super(0);
                this.f23694b = str;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return Q8.d.a(new StringBuilder("Push token "), this.f23694b, " registered and immediately being flushed.");
            }
        }

        public static final class b extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f23695b = new b();

            public b() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Push token must not be null or blank. Not registering for push with Braze.";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i2(String str) {
            super(0);
            this.f23693c = str;
        }

        public final void a() {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, Braze.this, BrazeLogger.Priority.I, (Throwable) null, new a(this.f23693c), 2, (Object) null);
            String str = this.f23693c;
            if (str == null || kotlin.text.n.S(str)) {
                BrazeLogger.brazelog$default(brazeLogger, Braze.this, BrazeLogger.Priority.W, (Throwable) null, b.f23695b, 2, (Object) null);
                return;
            }
            bo.app.n2 n2Var = Braze.this.registrationDataProvider;
            if (n2Var == null) {
                kotlin.jvm.internal.i.m("registrationDataProvider");
                throw null;
            }
            n2Var.a(this.f23693c);
            Braze.this.getUdm$android_sdk_base_release().l().e();
            Braze.this.requestImmediateDataFlush();
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class i3 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ InAppMessageEvent f23697c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i3(InAppMessageEvent inAppMessageEvent) {
            super(0);
            this.f23697c = inAppMessageEvent;
        }

        public final void a() {
            Braze.this.getUdm$android_sdk_base_release().v().a(this.f23697c.getTriggerEvent(), this.f23697c.getTriggerAction());
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class i4 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final i4 f23698b = new i4();

        public i4() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "The Braze SDK requires a non-empty API key. Check your braze.xml or BrazeConfig.";
        }
    }

    public static final class j extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final j f23699b = new j();

        public j() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Applying any pending runtime configuration values";
        }
    }

    public static final class j0 extends SuspendLambda implements Ia.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f23700b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ IValueCallback f23701c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Braze f23702d;

        public static final class a extends SuspendLambda implements Ia.p {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f23703b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ IValueCallback f23704c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Braze f23705d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(IValueCallback iValueCallback, Braze braze, kotlin.coroutines.c cVar) {
                super(2, cVar);
                this.f23704c = iValueCallback;
                this.f23705d = braze;
            }

            @Override // Ia.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(A a10, kotlin.coroutines.c cVar) {
                return ((a) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
                return new a(this.f23704c, this.f23705d, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                if (this.f23703b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                IValueCallback iValueCallback = this.f23704c;
                BrazeUser brazeUser = this.f23705d.brazeUser;
                if (brazeUser != null) {
                    iValueCallback.onSuccess(brazeUser);
                    return p293xa.r.f47939a;
                }
                kotlin.jvm.internal.i.m("brazeUser");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j0(IValueCallback iValueCallback, Braze braze, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f23701c = iValueCallback;
            this.f23702d = braze;
        }

        @Override // Ia.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(A a10, kotlin.coroutines.c cVar) {
            return ((j0) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new j0(this.f23701c, this.f23702d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.f23700b;
            if (i10 == 0) {
                kotlin.b.b(obj);
                kotlin.coroutines.e coroutineContext = BrazeCoroutineScope.INSTANCE.getCoroutineContext();
                a aVar = new a(this.f23701c, this.f23702d, null);
                this.f23700b = 1;
                if (C2680e.f(coroutineContext, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return p293xa.r.f47939a;
        }
    }

    public static final class j1 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final j1 f23706b = new j1();

        public j1() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to log push max campaign";
        }
    }

    public static final class j2 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f23707b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ IEventSubscriber f23708c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f23709d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j2(Class cls, IEventSubscriber iEventSubscriber, boolean z10) {
            super(0);
            this.f23707b = cls;
            this.f23708c = iEventSubscriber;
            this.f23709d = z10;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Did remove the background " + this.f23707b + ' ' + this.f23708c + "? " + this.f23709d;
        }
    }

    public static final class j3 extends SuspendLambda implements Ia.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f23710b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ia.a f23711c;

        public static final class a extends SuspendLambda implements Ia.p {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f23712b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Ia.a f23713c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Ia.a aVar, kotlin.coroutines.c cVar) {
                super(2, cVar);
                this.f23713c = aVar;
            }

            @Override // Ia.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(A a10, kotlin.coroutines.c cVar) {
                return ((a) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
                return new a(this.f23713c, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                if (this.f23712b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                this.f23713c.invoke();
                return p293xa.r.f47939a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j3(Ia.a aVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f23711c = aVar;
        }

        @Override // Ia.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(A a10, kotlin.coroutines.c cVar) {
            return ((j3) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new j3(this.f23711c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.f23710b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            C2680e.d(EmptyCoroutineContext.f43032b, new a(this.f23711c, null));
            return p293xa.r.f47939a;
        }
    }

    public static final class j4 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final j4 f23714b = new j4();

        public j4() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "The Braze SDK is not integrated correctly. Please visit https://www.braze.com/docs/developer_guide/platform_integration_guides/android/initial_sdk_setup/android_sdk_integration/";
        }
    }

    public static final class k extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final k f23715b = new k();

        public k() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Clearing config values";
        }
    }

    public static final class k0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final k0 f23716b = new k0();

        public k0() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to retrieve the current user.";
        }
    }

    public static final class k1 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f23718c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k1(String str) {
            super(0);
            this.f23718c = str;
        }

        public final void a() {
            Braze.this.getUdm$android_sdk_base_release().h().b(this.f23718c);
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class k2 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f23719b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ IEventSubscriber f23720c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f23721d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k2(Class cls, IEventSubscriber iEventSubscriber, boolean z10) {
            super(0);
            this.f23719b = cls;
            this.f23720c = iEventSubscriber;
            this.f23721d = z10;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Did remove the synchronous " + this.f23719b + ' ' + this.f23720c + "? " + this.f23721d;
        }
    }

    public static final class k3 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final k3 f23722b = new k3();

        public k3() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Got error in singleton run without result";
        }
    }

    public static final class k4 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final k4 f23723b = new k4();

        public k4() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "";
        }
    }

    public static final class l extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BrazeConfig f23724b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(BrazeConfig brazeConfig) {
            super(0);
            this.f23724b = brazeConfig;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Setting pending config object: " + this.f23724b;
        }
    }

    public static final class l0 extends SuspendLambda implements Ia.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f23725b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ IValueCallback f23726c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Braze f23727d;

        public static final class a extends SuspendLambda implements Ia.p {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f23728b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ IValueCallback f23729c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Braze f23730d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(IValueCallback iValueCallback, Braze braze, kotlin.coroutines.c cVar) {
                super(2, cVar);
                this.f23729c = iValueCallback;
                this.f23730d = braze;
            }

            @Override // Ia.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(A a10, kotlin.coroutines.c cVar) {
                return ((a) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
                return new a(this.f23729c, this.f23730d, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                if (this.f23728b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                this.f23729c.onSuccess(this.f23730d.getDeviceIdProvider$android_sdk_base_release().getDeviceId());
                return p293xa.r.f47939a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l0(IValueCallback iValueCallback, Braze braze, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f23726c = iValueCallback;
            this.f23727d = braze;
        }

        @Override // Ia.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(A a10, kotlin.coroutines.c cVar) {
            return ((l0) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new l0(this.f23726c, this.f23727d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.f23725b;
            if (i10 == 0) {
                kotlin.b.b(obj);
                kotlin.coroutines.e coroutineContext = BrazeCoroutineScope.INSTANCE.getCoroutineContext();
                a aVar = new a(this.f23726c, this.f23727d, null);
                this.f23725b = 1;
                if (C2680e.f(coroutineContext, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return p293xa.r.f47939a;
        }
    }

    public static final class l1 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final l1 f23731b = new l1();

        public l1() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to log push notification action clicked.";
        }
    }

    public static final class l2 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f23732b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l2(Class cls) {
            super(0);
            this.f23732b = cls;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to remove " + this.f23732b.getName() + " subscriber.";
        }
    }

    public static final class l3 extends SuspendLambda implements Ia.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f23733b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ia.p f23734c;

        public static final class a extends SuspendLambda implements Ia.p {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f23735b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Ia.p f23736c;

            /* JADX INFO: renamed from: com.braze.Braze$l3$a$a, reason: collision with other inner class name */
            public static final class C0246a extends SuspendLambda implements Ia.p {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f23737b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private /* synthetic */ Object f23738c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ Ia.p f23739d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0246a(Ia.p pVar, kotlin.coroutines.c cVar) {
                    super(2, cVar);
                    this.f23739d = pVar;
                }

                @Override // Ia.p
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(A a10, kotlin.coroutines.c cVar) {
                    return ((C0246a) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
                    C0246a c0246a = new C0246a(this.f23739d, cVar);
                    c0246a.f23738c = obj;
                    return c0246a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                    int i10 = this.f23737b;
                    if (i10 == 0) {
                        kotlin.b.b(obj);
                        A a10 = (A) this.f23738c;
                        Ia.p pVar = this.f23739d;
                        this.f23737b = 1;
                        obj = pVar.invoke(a10, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.b.b(obj);
                    }
                    return obj;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Ia.p pVar, kotlin.coroutines.c cVar) {
                super(2, cVar);
                this.f23736c = pVar;
            }

            @Override // Ia.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(A a10, kotlin.coroutines.c cVar) {
                return ((a) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
                return new a(this.f23736c, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                if (this.f23735b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                return C2680e.d(EmptyCoroutineContext.f43032b, new C0246a(this.f23736c, null));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l3(Ia.p pVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f23734c = pVar;
        }

        @Override // Ia.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(A a10, kotlin.coroutines.c cVar) {
            return ((l3) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new l3(this.f23734c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.f23733b;
            if (i10 == 0) {
                kotlin.b.b(obj);
                G gA = C2680e.a(o5.f21705a, null, new a(this.f23734c, null), 3);
                this.f23733b = 1;
                obj = gA.D(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return obj;
        }
    }

    public static final class l4 extends SuspendLambda implements Ia.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f23740b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f23741c;

        public static final class a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f23742b = new a();

            public a() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Waited on previous tasks to finish!";
            }
        }

        public l4(kotlin.coroutines.c cVar) {
            super(2, cVar);
        }

        @Override // Ia.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(A a10, kotlin.coroutines.c cVar) {
            return ((l4) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            l4 l4Var = new l4(cVar);
            l4Var.f23741c = obj;
            return l4Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.f23740b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (A) this.f23741c, (BrazeLogger.Priority) null, (Throwable) null, a.f23742b, 3, (Object) null);
            return p293xa.r.f47939a;
        }
    }

    public static final class m extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final m f23743b = new m();

        public m() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to retrieve the cached ContentCardsUpdatedEvent.";
        }
    }

    public static final class m0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final m0 f23744b = new m0();

        public m0() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to retrieve the current device id.";
        }
    }

    public static final class m1 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23745b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Braze f23746c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f23747d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f23748e;

        public static final class a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f23749b = new a();

            public a() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "No campaign Id associated with this notification (this is expected for test sends). Not logging push notification action clicked.";
            }
        }

        public static final class b extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f23750b = new b();

            public b() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Action ID cannot be null or blank.";
            }
        }

        public static final class c extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f23751b = new c();

            public c() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Action Type cannot be null or blank.";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m1(String str, Braze braze, String str2, String str3) {
            super(0);
            this.f23745b = str;
            this.f23746c = braze;
            this.f23747d = str2;
            this.f23748e = str3;
        }

        public final void a() {
            String str = this.f23745b;
            if (str == null || kotlin.text.n.S(str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.f23746c, BrazeLogger.Priority.W, (Throwable) null, a.f23749b, 2, (Object) null);
                return;
            }
            String str2 = this.f23747d;
            if (str2 == null || kotlin.text.n.S(str2)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.f23746c, BrazeLogger.Priority.W, (Throwable) null, b.f23750b, 2, (Object) null);
                return;
            }
            String str3 = this.f23748e;
            if (str3 == null || kotlin.text.n.S(str3)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.f23746c, BrazeLogger.Priority.W, (Throwable) null, c.f23751b, 2, (Object) null);
            } else {
                this.f23746c.getUdm$android_sdk_base_release().h().a(bo.app.j4.f21387k.a(this.f23745b, this.f23747d, this.f23748e));
            }
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class m2 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final m2 f23752b = new m2();

        public m2() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to request Content Cards refresh from Braze servers.";
        }
    }

    public static final class m3 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final m3 f23753b = new m3();

        public m3() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Error scheduling push delivery";
        }
    }

    public static final class m4 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final m4 f23754b = new m4();

        public m4() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Caught exception while waiting for previous tasks in serial work queue to finish.";
        }
    }

    public static final class n extends SuspendLambda implements Ia.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f23755b;

        public n(kotlin.coroutines.c cVar) {
            super(2, cVar);
        }

        @Override // Ia.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(A a10, kotlin.coroutines.c cVar) {
            return ((n) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return Braze.this.new n(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.f23755b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            if (Braze.this.getUdm$android_sdk_base_release().n().x()) {
                return Braze.this.getUdm$android_sdk_base_release().s().getCachedCardsAsEvent();
            }
            return null;
        }
    }

    public static final class n0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23757b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n0(String str) {
            super(0);
            this.f23757b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to get feature flag " + this.f23757b;
        }
    }

    public static final class n1 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23758b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n1(String str) {
            super(0);
            this.f23758b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return B7.b.g(new StringBuilder("Failed to log push open for '"), this.f23758b, '\'');
        }
    }

    public static final class n2 extends Lambda implements Ia.a {

        public static final class a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f23760b = new a();

            public a() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Content Cards is not enabled, skipping API call to refresh";
            }
        }

        public n2() {
            super(0);
        }

        public final void a() {
            if (Braze.this.getUdm$android_sdk_base_release().n().x()) {
                bo.app.c2.a(Braze.this.getUdm$android_sdk_base_release().h(), Braze.this.getUdm$android_sdk_base_release().s().e(), Braze.this.getUdm$android_sdk_base_release().s().f(), 0, true, 4, null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Braze.this, (BrazeLogger.Priority) null, (Throwable) null, a.f23760b, 3, (Object) null);
            }
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class n3 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f23762c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n3(long j) {
            super(0);
            this.f23762c = j;
        }

        public final void a() {
            Braze.this.getUdm$android_sdk_base_release().h().a(this.f23762c);
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class o extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23763b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str) {
            super(0);
            this.f23763b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to set external id to: " + this.f23763b;
        }
    }

    public static final class o0 extends SuspendLambda implements Ia.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f23764b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f23766d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0(String str, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f23766d = str;
        }

        @Override // Ia.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(A a10, kotlin.coroutines.c cVar) {
            return ((o0) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return Braze.this.new o0(this.f23766d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.f23764b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            if (Braze.this.getUdm$android_sdk_base_release().n().A()) {
                return (FeatureFlag) kotlin.collections.q.P(Braze.this.getUdm$android_sdk_base_release().x().b(this.f23766d));
            }
            return null;
        }
    }

    public static final class o1 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Braze f23768c;

        public static final class a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f23769b = new a();

            public a() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "No campaign Id associated with this notification (this is expected for test sends). Not logging push notification opened.";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o1(String str, Braze braze) {
            super(0);
            this.f23767b = str;
            this.f23768c = braze;
        }

        public final void a() {
            String str = this.f23767b;
            if (str == null || kotlin.text.n.S(str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.f23768c, BrazeLogger.Priority.W, (Throwable) null, a.f23769b, 2, (Object) null);
            } else {
                this.f23768c.getUdm$android_sdk_base_release().h().a(bo.app.m4.j.a(this.f23767b));
            }
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class o2 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final o2 f23770b = new o2();

        public o2() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to request Content Cards refresh from the cache.";
        }
    }

    public static final class o3 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23771b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f23772c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o3(String str, boolean z10) {
            super(0);
            this.f23771b = str;
            this.f23772c = z10;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to set Google Advertising ID data on device. Google Advertising ID: " + this.f23771b + " and limit-ad-tracking: " + this.f23772c;
        }
    }

    public static final class p extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23773b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Braze f23774c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f23775d;

        public static final class a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f23776b = new a();

            public a() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "userId passed to changeUser was null or empty. The current user will remain the active user.";
            }
        }

        public static final class b extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f23777b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str) {
                super(0);
                this.f23777b = str;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Rejected user id with byte length longer than 997. Not changing user. Input user id: " + this.f23777b;
            }
        }

        public static final class c extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f23778b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str) {
                super(0);
                this.f23778b = str;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return Q8.d.a(new StringBuilder("Received request to change current user "), this.f23778b, " to the same user id. Not changing user.");
            }
        }

        public static final class d extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f23779b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String str) {
                super(0);
                this.f23779b = str;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Set sdk auth signature on changeUser call: " + this.f23779b;
            }
        }

        public static final class e extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f23780b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(String str) {
                super(0);
                this.f23780b = str;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Changing anonymous user to " + this.f23780b;
            }
        }

        public static final class f extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f23781b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f23782c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(String str, String str2) {
                super(0);
                this.f23781b = str;
                this.f23782c = str2;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                StringBuilder sb2 = new StringBuilder("Changing current user ");
                sb2.append(this.f23781b);
                sb2.append(" to new user ");
                return B7.b.g(sb2, this.f23782c, '.');
            }
        }

        public static final class g extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f23783b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(String str) {
                super(0);
                this.f23783b = str;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Set sdk auth signature on changeUser call: " + this.f23783b;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String str, Braze braze, String str2) {
            super(0);
            this.f23773b = str;
            this.f23774c = braze;
            this.f23775d = str2;
        }

        public final void a() {
            String str = this.f23773b;
            if (str == null || str.length() == 0) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.f23774c, BrazeLogger.Priority.W, (Throwable) null, a.f23776b, 2, (Object) null);
                return;
            }
            if (StringUtils.getByteSize(this.f23773b) > 997) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.f23774c, BrazeLogger.Priority.W, (Throwable) null, new b(this.f23773b), 2, (Object) null);
                return;
            }
            BrazeUser brazeUser = this.f23774c.brazeUser;
            if (brazeUser == null) {
                kotlin.jvm.internal.i.m("brazeUser");
                throw null;
            }
            String userId = brazeUser.getUserId();
            if (kotlin.jvm.internal.i.a(userId, this.f23773b)) {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger, this.f23774c, BrazeLogger.Priority.I, (Throwable) null, new c(this.f23773b), 2, (Object) null);
                String str2 = this.f23775d;
                if (str2 == null || kotlin.text.n.S(str2)) {
                    return;
                }
                BrazeLogger.brazelog$default(brazeLogger, this.f23774c, (BrazeLogger.Priority) null, (Throwable) null, new d(this.f23775d), 3, (Object) null);
                this.f23774c.getUdm$android_sdk_base_release().i().a(this.f23775d);
                return;
            }
            this.f23774c.getUdm$android_sdk_base_release().g().a();
            this.f23774c.getUdm$android_sdk_base_release().p().d();
            if (kotlin.jvm.internal.i.a(userId, "")) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.f23774c, BrazeLogger.Priority.I, (Throwable) null, new e(this.f23773b), 2, (Object) null);
                bo.app.w3 w3Var = this.f23774c.offlineUserStorageProvider;
                if (w3Var == null) {
                    kotlin.jvm.internal.i.m("offlineUserStorageProvider");
                    throw null;
                }
                w3Var.a(this.f23773b);
                BrazeUser brazeUser2 = this.f23774c.brazeUser;
                if (brazeUser2 == null) {
                    kotlin.jvm.internal.i.m("brazeUser");
                    throw null;
                }
                brazeUser2.setUserId(this.f23773b);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.f23774c, BrazeLogger.Priority.I, (Throwable) null, new f(userId, this.f23773b), 2, (Object) null);
                this.f23774c.getExternalIEventMessenger$android_sdk_base_release().a(new FeedUpdatedEvent(new ArrayList(), this.f23773b, false, DateTimeUtils.nowInSeconds()), FeedUpdatedEvent.class);
            }
            this.f23774c.getUdm$android_sdk_base_release().h().g();
            this.f23774c.getUdm$android_sdk_base_release().b().a();
            bo.app.w3 w3Var2 = this.f23774c.offlineUserStorageProvider;
            if (w3Var2 == null) {
                kotlin.jvm.internal.i.m("offlineUserStorageProvider");
                throw null;
            }
            w3Var2.a(this.f23773b);
            bo.app.d3 udm$android_sdk_base_release = this.f23774c.getUdm$android_sdk_base_release();
            Context context = this.f23774c.applicationContext;
            bo.app.w3 w3Var3 = this.f23774c.offlineUserStorageProvider;
            if (w3Var3 == null) {
                kotlin.jvm.internal.i.m("offlineUserStorageProvider");
                throw null;
            }
            BrazeConfigurationProvider configurationProvider$android_sdk_base_release = this.f23774c.getConfigurationProvider$android_sdk_base_release();
            bo.app.k2 externalIEventMessenger$android_sdk_base_release = this.f23774c.getExternalIEventMessenger$android_sdk_base_release();
            bo.app.h2 deviceIdProvider$android_sdk_base_release = this.f23774c.getDeviceIdProvider$android_sdk_base_release();
            bo.app.n2 n2Var = this.f23774c.registrationDataProvider;
            if (n2Var == null) {
                kotlin.jvm.internal.i.m("registrationDataProvider");
                throw null;
            }
            this.f23774c.setUserSpecificMemberVariablesAndStartDispatch(new f7(context, w3Var3, configurationProvider$android_sdk_base_release, externalIEventMessenger$android_sdk_base_release, deviceIdProvider$android_sdk_base_release, n2Var, this.f23774c.getPushDeliveryManager$android_sdk_base_release(), Braze.shouldMockNetworkRequestsAndDropEvents, Braze.areOutboundNetworkRequestsOffline, this.f23774c.getDeviceDataProvider(), Braze.Companion.getShouldRequestFrameworkListenToNetworkUpdates$android_sdk_base_release()));
            String str3 = this.f23775d;
            if (str3 != null && !kotlin.text.n.S(str3)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.f23774c, (BrazeLogger.Priority) null, (Throwable) null, new g(this.f23775d), 3, (Object) null);
                this.f23774c.getUdm$android_sdk_base_release().i().a(this.f23775d);
            }
            this.f23774c.getUdm$android_sdk_base_release().k().g();
            this.f23774c.getUdm$android_sdk_base_release().h().f();
            udm$android_sdk_base_release.a();
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class p0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final p0 f23784b = new p0();

        public p0() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Error handling test in-app message push";
        }
    }

    public static final class p1 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Intent f23785b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p1(Intent intent) {
            super(0);
            this.f23785b = intent;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Error logging push notification with intent: " + this.f23785b;
        }
    }

    public static final class p2 extends Lambda implements Ia.a {
        public p2() {
            super(0);
        }

        public final void a() {
            Braze.this.getExternalIEventMessenger$android_sdk_base_release().a(Braze.this.getUdm$android_sdk_base_release().s().getCachedCardsAsEvent(), ContentCardsUpdatedEvent.class);
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class p3 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23787b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Braze f23788c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f23789d;

        public static final class a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f23790b = new a();

            public a() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Google Advertising ID cannot be null or blank";
            }
        }

        public static final class b extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f23791b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f23792c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, boolean z10) {
                super(0);
                this.f23791b = str;
                this.f23792c = z10;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Setting Google Advertising ID: " + this.f23791b + " and limit-ad-tracking: " + this.f23792c;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p3(String str, Braze braze, boolean z10) {
            super(0);
            this.f23787b = str;
            this.f23788c = braze;
            this.f23789d = z10;
        }

        public final void a() {
            if (kotlin.text.n.S(this.f23787b)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.f23788c, BrazeLogger.Priority.W, (Throwable) null, a.f23790b, 2, (Object) null);
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.f23788c, BrazeLogger.Priority.D, (Throwable) null, new b(this.f23787b, this.f23789d), 2, (Object) null);
            this.f23788c.getDeviceDataProvider().a(this.f23787b);
            this.f23788c.getDeviceDataProvider().a(this.f23789d);
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class q extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final q f23793b = new q();

        public q() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to close session.";
        }
    }

    public static final class q0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Intent f23794b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Braze f23795c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q0(Intent intent, Braze braze) {
            super(0);
            this.f23794b = intent;
            this.f23795c = braze;
        }

        public final void a() {
            Braze.Companion.requestTriggersIfInAppMessageTestPush$android_sdk_base_release(this.f23794b, this.f23795c.getUdm$android_sdk_base_release().h());
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class q1 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Intent f23796b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Braze f23797c;

        public static final class a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f23798b = new a();

            public a() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Cannot logPushNotificationOpened with null intent. Not logging push click.";
            }
        }

        public static final class b extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f23799b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str) {
                super(0);
                this.f23799b = str;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Logging push click. Campaign Id: " + this.f23799b;
            }
        }

        public static final class c extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f23800b = new c();

            public c() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "No campaign Id associated with this notification (this is expected for test sends). Not logging push click.";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q1(Intent intent, Braze braze) {
            super(0);
            this.f23796b = intent;
            this.f23797c = braze;
        }

        public final void a() {
            Intent intent = this.f23796b;
            if (intent == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.f23797c, BrazeLogger.Priority.I, (Throwable) null, a.f23798b, 2, (Object) null);
                return;
            }
            String stringExtra = intent.getStringExtra(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY);
            if (stringExtra == null || kotlin.text.n.S(stringExtra)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.f23797c, BrazeLogger.Priority.I, (Throwable) null, c.f23800b, 2, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.f23797c, BrazeLogger.Priority.I, (Throwable) null, new b(stringExtra), 2, (Object) null);
                this.f23797c.getUdm$android_sdk_base_release().h().a(bo.app.m4.j.a(stringExtra));
            }
            Braze.Companion.requestTriggersIfInAppMessageTestPush$android_sdk_base_release(this.f23796b, this.f23797c.getUdm$android_sdk_base_release().h());
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class q2 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final q2 f23801b = new q2();

        public q2() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to request refresh of feed.";
        }
    }

    public static final class q3 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23802b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q3(String str) {
            super(0);
            this.f23802b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to set SDK authentication signature on device.\n" + this.f23802b;
        }
    }

    public static final class r extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f23803b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Braze f23804c;

        public static final class a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f23805b = new a();

            public a() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Cannot close session with null activity.";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(Activity activity, Braze braze) {
            super(0);
            this.f23803b = activity;
            this.f23804c = braze;
        }

        public final void a() {
            if (this.f23803b == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.f23804c, BrazeLogger.Priority.W, (Throwable) null, a.f23805b, 2, (Object) null);
            } else {
                this.f23804c.getUdm$android_sdk_base_release().h().closeSession(this.f23803b);
            }
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class r0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final r0 f23806b = new r0();

        public r0() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Ephemeral events enabled";
        }
    }

    public static final class r1 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23807b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f23808c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r1(String str, String str2) {
            super(0);
            this.f23807b = str;
            this.f23808c = str2;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to log push story page clicked for pageId: " + this.f23807b + " campaignId: " + this.f23808c;
        }
    }

    public static final class r2 extends Lambda implements Ia.a {
        public r2() {
            super(0);
        }

        public final void a() {
            Braze.this.getUdm$android_sdk_base_release().h().a(new bo.app.b4.a(null, null, null, null, 15, null).d());
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class r3 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f23811c;

        public static final class a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f23812b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str) {
                super(0);
                this.f23812b = str;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Got new sdk auth signature " + this.f23812b;
            }
        }

        public static final class b extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f23813b = new b();

            public b() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "SDK authentication signature cannot be null or blank";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r3(String str) {
            super(0);
            this.f23811c = str;
        }

        public final void a() {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, Braze.this, BrazeLogger.Priority.V, (Throwable) null, new a(this.f23811c), 2, (Object) null);
            if (kotlin.text.n.S(this.f23811c)) {
                BrazeLogger.brazelog$default(brazeLogger, Braze.this, BrazeLogger.Priority.W, (Throwable) null, b.f23813b, 2, (Object) null);
            } else {
                Braze.this.getUdm$android_sdk_base_release().i().a(this.f23811c);
            }
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class s extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final s f23814b = new s();

        public s() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to retrieve the current user.";
        }
    }

    public static final class s0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23815b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Set f23816c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f23817d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s0(String str, Set set, boolean z10) {
            super(0);
            this.f23815b = str;
            this.f23816c = set;
            this.f23817d = z10;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Checking event key [" + this.f23815b + "] against ephemeral event list " + this.f23816c + " and got match?: " + this.f23817d;
        }
    }

    public static final class s1 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23818b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f23819c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Braze f23820d;

        public static final class a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f23821b = new a();

            public a() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Push story page click input was invalid. Not logging in-app purchase to Braze.";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s1(String str, String str2, Braze braze) {
            super(0);
            this.f23818b = str;
            this.f23819c = str2;
            this.f23820d = braze;
        }

        public final void a() {
            if (!ValidationUtils.isValidPushStoryClickInput(this.f23818b, this.f23819c)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.f23820d, BrazeLogger.Priority.W, (Throwable) null, a.f23821b, 2, (Object) null);
                return;
            }
            C1471i.a aVar = C1471i.f21202h;
            String str = this.f23818b;
            kotlin.jvm.internal.i.b(str);
            String str2 = this.f23819c;
            kotlin.jvm.internal.i.b(str2);
            bo.app.a2 a2VarE = aVar.e(str, str2);
            if (a2VarE != null) {
                this.f23820d.getUdm$android_sdk_base_release().h().a(a2VarE);
            }
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class s2 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final s2 f23822b = new s2();

        public s2() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to retrieve and publish feed from offline cache.";
        }
    }

    public static final class s3 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f23823b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s3(boolean z10) {
            super(0);
            this.f23823b = z10;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to set sync policy offline to " + this.f23823b;
        }
    }

    public static final class t extends SuspendLambda implements Ia.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f23824b;

        public t(kotlin.coroutines.c cVar) {
            super(2, cVar);
        }

        @Override // Ia.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(A a10, kotlin.coroutines.c cVar) {
            return ((t) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return Braze.this.new t(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.f23824b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            BrazeUser brazeUser = Braze.this.brazeUser;
            if (brazeUser != null) {
                return brazeUser;
            }
            kotlin.jvm.internal.i.m("brazeUser");
            throw null;
        }
    }

    public static final class t0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23826b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t0(String str) {
            super(0);
            this.f23826b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to log custom event: " + this.f23826b;
        }
    }

    public static final class t1 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final t1 f23827b = new t1();

        public t1() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to open session.";
        }
    }

    public static final class t2 extends Lambda implements Ia.a {
        public t2() {
            super(0);
        }

        public final void a() {
            Braze.this.getExternalIEventMessenger$android_sdk_base_release().a(Braze.this.getUdm$android_sdk_base_release().d().getCachedCardsAsEvent(), FeedUpdatedEvent.class);
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class t3 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f23830c;

        public static final class a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f23831b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z10) {
                super(0);
                this.f23831b = z10;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Setting the image loader deny network downloads to " + this.f23831b;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t3(boolean z10) {
            super(0);
            this.f23830c = z10;
        }

        public final void a() {
            Braze.this.getUdm$android_sdk_base_release().h().c(this.f23830c);
            Braze.this.getUdm$android_sdk_base_release().m().a(this.f23830c);
            Braze braze = Braze.this;
            if (braze.imageLoader != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, braze, (BrazeLogger.Priority) null, (Throwable) null, new a(this.f23830c), 3, (Object) null);
                Braze.this.getImageLoader().setOffline(this.f23830c);
            }
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class u extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final u f23832b = new u();

        public u() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Cannot deserialize null content card json string. Returning null.";
        }
    }

    public static final class u0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23833b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Braze f23834c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ BrazeProperties f23835d;

        public static final class a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Ref$ObjectRef f23836b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Ref$ObjectRef ref$ObjectRef) {
                super(0);
                this.f23836b = ref$ObjectRef;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return Q8.d.a(new StringBuilder("Logged custom event with name "), (String) this.f23836b.element, " was invalid. Not logging custom event to Braze.");
            }
        }

        public static final class b extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Ref$ObjectRef f23837b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Ref$ObjectRef ref$ObjectRef) {
                super(0);
                this.f23837b = ref$ObjectRef;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return Q8.d.a(new StringBuilder("Custom event with name "), (String) this.f23837b.element, " logged with invalid properties. Not logging custom event to Braze.");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u0(String str, Braze braze, BrazeProperties brazeProperties) {
            super(0);
            this.f23833b = str;
            this.f23834c = braze;
            this.f23835d = brazeProperties;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.String] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void a() {
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ?? r10 = this.f23833b;
            ref$ObjectRef.element = r10;
            if (!ValidationUtils.isValidLogCustomEventInput(r10, this.f23834c.getUdm$android_sdk_base_release().n())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.f23834c, BrazeLogger.Priority.W, (Throwable) null, new a(ref$ObjectRef), 2, (Object) null);
                return;
            }
            BrazeProperties brazeProperties = this.f23835d;
            if (brazeProperties != null && brazeProperties.isInvalid()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.f23834c, BrazeLogger.Priority.W, (Throwable) null, new b(ref$ObjectRef), 2, (Object) null);
                return;
            }
            ?? EnsureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength((String) ref$ObjectRef.element);
            ref$ObjectRef.element = EnsureBrazeFieldLength;
            bo.app.a2 a2VarA = C1471i.f21202h.a((String) EnsureBrazeFieldLength, this.f23835d);
            if (a2VarA == null) {
                return;
            }
            if (this.f23834c.isEphemeralEventKey((String) ref$ObjectRef.element) ? this.f23834c.getUdm$android_sdk_base_release().n().z() : this.f23834c.getUdm$android_sdk_base_release().h().a(a2VarA)) {
                this.f23834c.getUdm$android_sdk_base_release().v().a(new C1458b0((String) ref$ObjectRef.element, this.f23835d, a2VarA));
            }
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class u1 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f23838b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Braze f23839c;

        public static final class a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f23840b = new a();

            public a() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Cannot open session with null activity.";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u1(Activity activity, Braze braze) {
            super(0);
            this.f23838b = activity;
            this.f23839c = braze;
        }

        public final void a() {
            if (this.f23838b == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.f23839c, BrazeLogger.Priority.I, (Throwable) null, a.f23840b, 2, (Object) null);
            } else {
                this.f23839c.getUdm$android_sdk_base_release().h().openSession(this.f23838b);
            }
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class u2 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final u2 f23841b = new u2();

        public u2() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to request geofence refresh.";
        }
    }

    public static final class u3 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final u3 f23842b = new u3();

        public u3() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to add subscriber for Content Cards updates.";
        }
    }

    public static final class v extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23843b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(String str) {
            super(0);
            this.f23843b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to deserialize content card json string. Payload: " + this.f23843b;
        }
    }

    public static final class v0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final v0 f23844b = new v0();

        public v0() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to log a Feature Flag impression.";
        }
    }

    public static final class v1 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final v1 f23845b = new v1();

        public v1() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to flush push delivery events";
        }
    }

    public static final class v2 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ IBrazeLocation f23846b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Braze f23847c;

        public static final class a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f23848b = new a();

            public a() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Cannot request Geofence refresh with null location.";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v2(IBrazeLocation iBrazeLocation, Braze braze) {
            super(0);
            this.f23846b = iBrazeLocation;
            this.f23847c = braze;
        }

        public final void a() {
            if (this.f23846b == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.f23847c, (BrazeLogger.Priority) null, (Throwable) null, a.f23848b, 3, (Object) null);
            } else {
                this.f23847c.getUdm$android_sdk_base_release().r().requestGeofenceRefresh(this.f23846b);
            }
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class v3 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final v3 f23849b = new v3();

        public v3() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to send cached feature flags upon subscribeToFeatureFlagsUpdates.";
        }
    }

    public static final class w extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f23850b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(JSONObject jSONObject) {
            super(0);
            this.f23850b = jSONObject;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to deserialize content card json. Payload: " + this.f23850b;
        }
    }

    public static final class w0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f23852c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w0(String str) {
            super(0);
            this.f23852c = str;
        }

        public final void a() {
            Braze.this.getUdm$android_sdk_base_release().x().a(this.f23852c);
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class w1 extends Lambda implements Ia.a {
        public w1() {
            super(0);
        }

        public final void a() {
            bo.app.c2.a(Braze.this.getUdm$android_sdk_base_release().h(), 0L, 1, (Object) null);
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class w2 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f23854b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w2(boolean z10) {
            super(0);
            this.f23854b = z10;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to request geofence refresh with rate limit ignore: " + this.f23854b;
        }
    }

    public static final class w3 extends Lambda implements Ia.a {

        public static final class a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f23856b = new a();

            public a() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Sending cached update upon feature flag subscription";
            }
        }

        public w3() {
            super(0);
        }

        public final void a() {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Braze.this, (BrazeLogger.Priority) null, (Throwable) null, a.f23856b, 3, (Object) null);
            if (Braze.this.getUdm$android_sdk_base_release().n().A()) {
                Braze.this.getUdm$android_sdk_base_release().x().g();
            } else {
                Braze.this.getUdm$android_sdk_base_release().g().a(new bo.app.o1(), bo.app.o1.class);
            }
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class x extends SuspendLambda implements Ia.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f23857b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f23858c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ JSONObject f23860e;

        public static final class a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f23861b = new a();

            public a() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Content Cards are disabled. Not deserializing json. Returning null.";
            }
        }

        public static final class b extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f23862b = new b();

            public b() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Cannot deserialize null content card json. Returning null.";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(JSONObject jSONObject, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f23860e = jSONObject;
        }

        @Override // Ia.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(A a10, kotlin.coroutines.c cVar) {
            return ((x) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            x xVar = Braze.this.new x(this.f23860e, cVar);
            xVar.f23858c = obj;
            return xVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.f23857b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            A a10 = (A) this.f23858c;
            if (!Braze.this.getUdm$android_sdk_base_release().n().x()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, a10, BrazeLogger.Priority.W, (Throwable) null, a.f23861b, 2, (Object) null);
                return null;
            }
            if (this.f23860e != null) {
                return Braze.this.getUdm$android_sdk_base_release().s().a(this.f23860e);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, a10, BrazeLogger.Priority.W, (Throwable) null, b.f23862b, 2, (Object) null);
            return null;
        }
    }

    public static final class x0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23863b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x0(String str) {
            super(0);
            this.f23863b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to log feed card clicked. Card id: " + this.f23863b;
        }
    }

    public static final class x1 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final x1 f23864b = new x1();

        public x1() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "User dependency manager is uninitialized. Not publishing error.";
        }
    }

    public static final class x2 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f23866c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x2(boolean z10) {
            super(0);
            this.f23866c = z10;
        }

        public final void a() {
            Braze.this.getUdm$android_sdk_base_release().r().requestGeofenceRefresh(this.f23866c);
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class x3 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final x3 f23867b = new x3();

        public x3() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to add subscriber for Feature Flags updates.";
        }
    }

    public static final class y extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23868b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(String str) {
            super(0);
            this.f23868b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to deserialize in-app message json. Payload: " + this.f23868b;
        }
    }

    public static final class y0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23869b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Braze f23870c;

        public static final class a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f23871b = new a();

            public a() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Card ID cannot be null or blank.";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y0(String str, Braze braze) {
            super(0);
            this.f23869b = str;
            this.f23870c = braze;
        }

        public final void a() {
            String str = this.f23869b;
            if (str == null || kotlin.text.n.S(str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.f23870c, BrazeLogger.Priority.W, (Throwable) null, a.f23871b, 2, (Object) null);
                return;
            }
            bo.app.a2 a2VarE = C1471i.f21202h.e(this.f23869b);
            if (a2VarE != null) {
                this.f23870c.getUdm$android_sdk_base_release().h().a(a2VarE);
            }
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class y1 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f23872b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y1(Throwable th) {
            super(0);
            this.f23872b = th;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to log throwable: " + this.f23872b;
        }
    }

    public static final class y2 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final y2 f23873b = new y2();

        public y2() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to request geofence refresh.";
        }
    }

    public static final class y3 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final y3 f23874b = new y3();

        public y3() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to add subscriber for feed updates.";
        }
    }

    public static final class z extends SuspendLambda implements Ia.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f23875b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f23876c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Braze f23877d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(String str, Braze braze, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f23876c = str;
            this.f23877d = braze;
        }

        @Override // Ia.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(A a10, kotlin.coroutines.c cVar) {
            return ((z) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new z(this.f23876c, this.f23877d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.f23875b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            String str = this.f23876c;
            if (str == null) {
                return null;
            }
            return com.braze.support.h.a(str, this.f23877d.getUdm$android_sdk_base_release().h());
        }
    }

    public static final class z0 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23878b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z0(String str) {
            super(0);
            this.f23878b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to log feed card impression. Card id: " + this.f23878b;
        }
    }

    public static final class z1 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final z1 f23879b = new z1();

        public z1() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to post geofence report.";
        }
    }

    public static final class z2 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ double f23880b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ double f23881c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Braze f23882d;

        public static final class a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ double f23883b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ double f23884c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(double d10, double d11) {
                super(0);
                this.f23883b = d10;
                this.f23884c = d11;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Location provided is invalid. Not requesting refresh of Braze Geofences. Provided latitude - longitude: " + this.f23883b + " - " + this.f23884c;
            }
        }

        public static final class b extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ double f23885b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ double f23886c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(double d10, double d11) {
                super(0);
                this.f23885b = d10;
                this.f23886c = d11;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Manually requesting Geofence refresh of with provided latitude - longitude: " + this.f23885b + " - " + this.f23886c;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z2(double d10, double d11, Braze braze) {
            super(0);
            this.f23880b = d10;
            this.f23881c = d11;
            this.f23882d = braze;
        }

        public final void a() {
            if (!ValidationUtils.isValidLocation(this.f23880b, this.f23881c)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.f23882d, BrazeLogger.Priority.W, (Throwable) null, new a(this.f23880b, this.f23881c), 2, (Object) null);
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.f23882d, BrazeLogger.Priority.W, (Throwable) null, new b(this.f23880b, this.f23881c), 2, (Object) null);
            this.f23882d.getUdm$android_sdk_base_release().r().requestGeofenceRefresh(new BrazeLocation(this.f23880b, this.f23881c, null, null, null, 28, null));
        }

        @Override // Ia.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p293xa.r.f47939a;
        }
    }

    public static final class z3 extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final z3 f23887b = new z3();

        public z3() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to add subscriber for network failures.";
        }
    }

    public Braze(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        long jNanoTime = System.nanoTime();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, a.f23603b, 3, (Object) null);
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.i.d(applicationContext, "context.applicationContext");
        this.applicationContext = applicationContext;
        String str = Build.MODEL;
        if (str != null) {
            Set<String> set = KNOWN_APP_CRAWLER_DEVICE_MODELS;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.i.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (set.contains(lowerCase)) {
                BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.I, (Throwable) null, new b(str), 2, (Object) null);
                Companion.enableMockNetworkRequestsAndDropEventsMode();
            }
        }
        setImageLoader(new DefaultBrazeImageLoader(this.applicationContext));
        this.externalIEventMessenger = new bo.app.g1(Companion.getSdkEnablementProvider(this.applicationContext));
        BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.V, (Throwable) null, new c(), 2, (Object) null);
        run$android_sdk_base_release(d.f23627b, false, new e(context));
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new f(System.nanoTime(), jNanoTime), 3, (Object) null);
    }

    public static final void addSdkMetadata(Context context, EnumSet<BrazeSdkMetadata> enumSet) {
        Companion.addSdkMetadata(context, enumSet);
    }

    public static final void clearEndpointProvider() {
        Companion.clearEndpointProvider();
    }

    public static final boolean configure(Context context, BrazeConfig brazeConfig) {
        return Companion.configure(context, brazeConfig);
    }

    public static final void disableSdk(Context context) {
        Companion.disableSdk(context);
    }

    public static final boolean enableMockNetworkRequestsAndDropEventsMode() {
        return Companion.enableMockNetworkRequestsAndDropEventsMode();
    }

    public static final void enableSdk(Context context) {
        Companion.enableSdk(context);
    }

    public static final Uri getApiEndpoint(Uri uri) {
        return Companion.getApiEndpoint(uri);
    }

    private final ContentCardsUpdatedEvent getCachedContentCardsUpdatedEvent() {
        return (ContentCardsUpdatedEvent) runForResult$default(this, null, m.f23743b, false, new n(null), 4, null);
    }

    public static final String getConfiguredApiKey(BrazeConfigurationProvider brazeConfigurationProvider) {
        return Companion.getConfiguredApiKey(brazeConfigurationProvider);
    }

    public static final IBrazeNotificationFactory getCustomBrazeNotificationFactory() {
        return Companion.getCustomBrazeNotificationFactory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bo.app.g2 getDeviceDataProvider() {
        bo.app.g2 k0Var = deviceDataProvider;
        if (k0Var == null) {
            k0Var = new bo.app.k0(this.applicationContext, getConfigurationProvider$android_sdk_base_release());
        }
        deviceDataProvider = k0Var;
        return k0Var;
    }

    public static final Braze getInstance(Context context) {
        return Companion.getInstance(context);
    }

    public static final boolean getOutboundNetworkRequestsOffline() {
        return Companion.getOutboundNetworkRequestsOffline();
    }

    public static final boolean isDisabled() {
        return Companion.isDisabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isEphemeralEventKey(String str) {
        if (!getConfigurationProvider$android_sdk_base_release().isEphemeralEventsEnabled()) {
            return false;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, r0.f23806b, 2, (Object) null);
        Set<String> ephemeralEventKeys = getConfigurationProvider$android_sdk_base_release().getEphemeralEventKeys();
        boolean zContains = ephemeralEventKeys.contains(str);
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new s0(str, ephemeralEventKeys, zContains), 2, (Object) null);
        return zContains;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void publishError(Throwable th) {
        if (this.udm == null) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.V, th, x1.f23864b);
            return;
        }
        try {
            getUdm$android_sdk_base_release().g().a(th, Throwable.class);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, new y1(th));
        }
    }

    public static /* synthetic */ void run$android_sdk_base_release$default(Braze braze, Ia.a aVar, boolean z10, Ia.a aVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        braze.run$android_sdk_base_release(aVar, z10, aVar2);
    }

    private final <T> T runForResult(T t8, Ia.a<String> aVar, boolean z10, Ia.p<? super A, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar) {
        if (z10 && Companion.isDisabled()) {
            return t8;
        }
        try {
            return (T) C2680e.d(EmptyCoroutineContext.f43032b, new l3(pVar, null));
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, aVar);
            publishError(e10);
            return t8;
        }
    }

    public static /* synthetic */ Object runForResult$default(Braze braze, Object obj, Ia.a aVar, boolean z10, Ia.p pVar, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return braze.runForResult(obj, aVar, z10, pVar);
    }

    public static final void setCustomBrazeNotificationFactory(IBrazeNotificationFactory iBrazeNotificationFactory) {
        Companion.setCustomBrazeNotificationFactory(iBrazeNotificationFactory);
    }

    public static final void setEndpointProvider(IBrazeEndpointProvider iBrazeEndpointProvider) {
        Companion.setEndpointProvider(iBrazeEndpointProvider);
    }

    public static final void setOutboundNetworkRequestsOffline(boolean z10) {
        Companion.setOutboundNetworkRequestsOffline(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSyncPolicyOfflineStatus(boolean z10) {
        run$android_sdk_base_release$default(this, new s3(z10), false, new t3(z10), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUserSpecificMemberVariablesAndStartDispatch(f7 f7Var) {
        setUdm$android_sdk_base_release(f7Var);
        o5.f21705a.a(getUdm$android_sdk_base_release().g());
        e7 e7VarK = getUdm$android_sdk_base_release().k();
        bo.app.c2 c2VarH = getUdm$android_sdk_base_release().h();
        bo.app.w3 w3Var = this.offlineUserStorageProvider;
        if (w3Var == null) {
            kotlin.jvm.internal.i.m("offlineUserStorageProvider");
            throw null;
        }
        this.brazeUser = new BrazeUser(e7VarK, c2VarH, w3Var.a(), getUdm$android_sdk_base_release().q(), getUdm$android_sdk_base_release().n());
        getUdm$android_sdk_base_release().y().a(getUdm$android_sdk_base_release().g());
        getUdm$android_sdk_base_release().o().a(getUdm$android_sdk_base_release().g());
        getUdm$android_sdk_base_release().w().j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void verifyProperSdkSetup() {
        boolean z10 = true;
        for (String str : NECESSARY_BRAZE_SDK_PERMISSIONS) {
            if (!PermissionUtils.hasPermission(this.applicationContext, str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new h4(str), 2, (Object) null);
                z10 = false;
            }
        }
        if (kotlin.text.n.S(getConfigurationProvider$android_sdk_base_release().getBrazeApiKey().toString())) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, i4.f23698b, 2, (Object) null);
            z10 = false;
        }
        if (z10) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, j4.f23714b, 2, (Object) null);
    }

    public static final void wipeData(Context context) {
        Companion.wipeData(context);
    }

    public final /* synthetic */ void addSerializedCardJsonToStorage$android_sdk_base_release(String serializedCardJson, String str) {
        kotlin.jvm.internal.i.e(serializedCardJson, "serializedCardJson");
        run$android_sdk_base_release$default(this, new g(str, serializedCardJson), false, new h(serializedCardJson, this, str), 2, null);
    }

    @Override // com.braze.IBraze
    public <T> void addSingleSynchronousSubscription(IEventSubscriber<T> subscriber, Class<T> eventClass) {
        kotlin.jvm.internal.i.e(subscriber, "subscriber");
        kotlin.jvm.internal.i.e(eventClass, "eventClass");
        try {
            this.externalIEventMessenger.c(eventClass, subscriber);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, new i(eventClass));
            publishError(e10);
        }
    }

    public final /* synthetic */ void applyPendingRuntimeConfiguration$android_sdk_base_release() {
        ReentrantLock reentrantLock = brazeClassLock;
        reentrantLock.lock();
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, j.f23699b, 3, (Object) null);
            RuntimeAppConfigurationProvider runtimeAppConfigurationProvider = new RuntimeAppConfigurationProvider(this.applicationContext);
            for (BrazeConfig brazeConfig : pendingConfigurations) {
                if (kotlin.jvm.internal.i.a(brazeConfig, clearConfigSentinel)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, k.f23715b, 2, (Object) null);
                    runtimeAppConfigurationProvider.clearAllConfigurationValues();
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new l(brazeConfig), 2, (Object) null);
                    runtimeAppConfigurationProvider.setConfiguration(brazeConfig);
                }
            }
            pendingConfigurations.clear();
            p293xa.r rVar = p293xa.r.f47939a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.braze.IBraze
    public void changeUser(String str) {
        changeUser(str, null);
    }

    @Override // com.braze.IBraze
    public void closeSession(Activity activity) {
        run$android_sdk_base_release$default(this, q.f23793b, false, new r(activity, this), 2, null);
    }

    @Override // com.braze.IBraze
    public Card deserializeContentCard(String str) {
        if (Companion.isDisabled()) {
            return null;
        }
        if (str == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, u.f23832b, 2, (Object) null);
            return null;
        }
        try {
            return deserializeContentCard(new JSONObject(str));
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, new v(str));
            publishError(e10);
            return null;
        }
    }

    @Override // com.braze.IBraze
    public IInAppMessage deserializeInAppMessageString(String str) {
        return (IInAppMessage) runForResult$default(this, null, new y(str), false, new z(str, this, null), 4, null);
    }

    @Override // com.braze.IBraze
    public List<FeatureFlag> getAllFeatureFlags() {
        return (List) runForResult$default(this, EmptyList.f42983b, c0.f23621b, false, new d0(null), 4, null);
    }

    @Override // com.braze.IBraze
    public List<Card> getCachedContentCards() {
        if (Companion.isDisabled()) {
            return null;
        }
        ContentCardsUpdatedEvent cachedContentCardsUpdatedEvent = getCachedContentCardsUpdatedEvent();
        if (cachedContentCardsUpdatedEvent != null) {
            return cachedContentCardsUpdatedEvent.getAllCards();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, e0.f23646b, 2, (Object) null);
        return null;
    }

    public final BrazeConfigurationProvider getConfigurationProvider$android_sdk_base_release() {
        BrazeConfigurationProvider brazeConfigurationProvider = this.configurationProvider;
        if (brazeConfigurationProvider != null) {
            return brazeConfigurationProvider;
        }
        kotlin.jvm.internal.i.m("configurationProvider");
        throw null;
    }

    public final BrazeConfigurationProvider getConfigurationProviderSafe$android_sdk_base_release(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        if (this.configurationProvider != null) {
            return getConfigurationProvider$android_sdk_base_release();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, f0.f23655b, 3, (Object) null);
        return new BrazeConfigurationProvider(context);
    }

    @Override // com.braze.IBraze
    public int getContentCardCount() {
        if (Companion.isDisabled()) {
            return -1;
        }
        ContentCardsUpdatedEvent cachedContentCardsUpdatedEvent = getCachedContentCardsUpdatedEvent();
        if (cachedContentCardsUpdatedEvent != null) {
            return cachedContentCardsUpdatedEvent.getCardCount();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, g0.f23662b, 2, (Object) null);
        return -1;
    }

    @Override // com.braze.IBraze
    public int getContentCardUnviewedCount() {
        if (Companion.isDisabled()) {
            return -1;
        }
        ContentCardsUpdatedEvent cachedContentCardsUpdatedEvent = getCachedContentCardsUpdatedEvent();
        if (cachedContentCardsUpdatedEvent != null) {
            return cachedContentCardsUpdatedEvent.getUnviewedCardCount();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, h0.f23682b, 2, (Object) null);
        return -1;
    }

    @Override // com.braze.IBraze
    public long getContentCardsLastUpdatedInSecondsFromEpoch() {
        if (Companion.isDisabled()) {
            return -1L;
        }
        ContentCardsUpdatedEvent cachedContentCardsUpdatedEvent = getCachedContentCardsUpdatedEvent();
        if (cachedContentCardsUpdatedEvent != null) {
            return cachedContentCardsUpdatedEvent.getTimestampSeconds();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, i0.f23688b, 2, (Object) null);
        return -1L;
    }

    @Override // com.braze.IBraze
    public BrazeUser getCurrentUser() {
        return (BrazeUser) runForResult(null, s.f23814b, false, new t(null));
    }

    @Override // com.braze.IBraze
    public String getDeviceId() {
        return (String) runForResult("", a0.f23604b, false, new b0(null));
    }

    @Override // com.braze.IBraze
    public void getDeviceIdAsync(IValueCallback<String> completionCallback) {
        kotlin.jvm.internal.i.e(completionCallback, "completionCallback");
        if (Companion.isDisabled()) {
            completionCallback.onError();
            return;
        }
        try {
            C2680e.c(o5.f21705a, null, null, new l0(completionCallback, this, null), 3);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, m0.f23744b);
            completionCallback.onError();
            publishError(e10);
        }
    }

    public final bo.app.h2 getDeviceIdProvider$android_sdk_base_release() {
        bo.app.h2 h2Var = this.deviceIdProvider;
        if (h2Var != null) {
            return h2Var;
        }
        kotlin.jvm.internal.i.m("deviceIdProvider");
        throw null;
    }

    public final bo.app.k2 getExternalIEventMessenger$android_sdk_base_release() {
        return this.externalIEventMessenger;
    }

    @Override // com.braze.IBraze
    public FeatureFlag getFeatureFlag(String id) {
        kotlin.jvm.internal.i.e(id, "id");
        return (FeatureFlag) runForResult$default(this, null, new n0(id), false, new o0(id, null), 4, null);
    }

    @Override // com.braze.IBraze
    public IBrazeImageLoader getImageLoader() {
        IBrazeImageLoader iBrazeImageLoader = this.imageLoader;
        if (iBrazeImageLoader != null) {
            return iBrazeImageLoader;
        }
        kotlin.jvm.internal.i.m("imageLoader");
        throw null;
    }

    public final o4 getPushDeliveryManager$android_sdk_base_release() {
        o4 o4Var = this.pushDeliveryManager;
        if (o4Var != null) {
            return o4Var;
        }
        kotlin.jvm.internal.i.m("pushDeliveryManager");
        throw null;
    }

    @Override // com.braze.IBraze
    public String getRegisteredPushToken() {
        return (String) runForResult$default(this, null, f2.f23657b, false, new g2(null), 4, null);
    }

    public final bo.app.d3 getUdm$android_sdk_base_release() {
        bo.app.d3 d3Var = this.udm;
        if (d3Var != null) {
            return d3Var;
        }
        kotlin.jvm.internal.i.m("udm");
        throw null;
    }

    public final /* synthetic */ void handleInAppMessageTestPush$android_sdk_base_release(Intent intent) {
        kotlin.jvm.internal.i.e(intent, "intent");
        run$android_sdk_base_release$default(this, p0.f23784b, false, new q0(intent, this), 2, null);
    }

    public final Boolean isApiKeyPresent$android_sdk_base_release() {
        return this.isApiKeyPresent;
    }

    @Override // com.braze.IBraze
    public void logCustomEvent(String str) {
        logCustomEvent(str, null);
    }

    @Override // com.braze.IBraze
    public void logFeatureFlagImpression(String id) {
        kotlin.jvm.internal.i.e(id, "id");
        run$android_sdk_base_release$default(this, v0.f23844b, false, new w0(id), 2, null);
    }

    @Override // com.braze.IBraze
    @p293xa.d
    public void logFeedCardClick(String str) {
        run$android_sdk_base_release$default(this, new x0(str), false, new y0(str, this), 2, null);
    }

    @Override // com.braze.IBraze
    @p293xa.d
    public void logFeedCardImpression(String str) {
        run$android_sdk_base_release$default(this, new z0(str), false, new a1(str, this), 2, null);
    }

    @Override // com.braze.IBraze
    public void logFeedDisplayed() {
        run$android_sdk_base_release$default(this, b1.f23616b, false, new c1(), 2, null);
    }

    public final /* synthetic */ void logLocationRecordedEventFromLocationUpdate$android_sdk_base_release(IBrazeLocation location) {
        kotlin.jvm.internal.i.e(location, "location");
        run$android_sdk_base_release$default(this, d1.f23630b, false, new e1(location, this), 2, null);
    }

    @Override // com.braze.IBraze
    public void logPurchase(String str, String str2, BigDecimal bigDecimal) {
        logPurchase(str, str2, bigDecimal, 1);
    }

    public final /* synthetic */ void logPushDelivery$android_sdk_base_release(String campaignId, long j10) {
        kotlin.jvm.internal.i.e(campaignId, "campaignId");
        run$android_sdk_base_release$default(this, new h1(campaignId), false, new i1(campaignId, j10), 2, null);
    }

    public final /* synthetic */ void logPushMaxCampaign$android_sdk_base_release(String campaign) {
        kotlin.jvm.internal.i.e(campaign, "campaign");
        run$android_sdk_base_release$default(this, j1.f23706b, false, new k1(campaign), 2, null);
    }

    @Override // com.braze.IBraze
    public void logPushNotificationActionClicked(String str, String str2, String str3) {
        run$android_sdk_base_release$default(this, l1.f23731b, false, new m1(str, this, str2, str3), 2, null);
    }

    @Override // com.braze.IBraze
    public void logPushNotificationOpened(String str) {
        run$android_sdk_base_release$default(this, new n1(str), false, new o1(str, this), 2, null);
    }

    @Override // com.braze.IBraze
    public void logPushStoryPageClicked(String str, String str2) {
        run$android_sdk_base_release$default(this, new r1(str2, str), false, new s1(str, str2, this), 2, null);
    }

    @Override // com.braze.IBraze
    public void openSession(Activity activity) {
        run$android_sdk_base_release$default(this, t1.f23827b, false, new u1(activity, this), 2, null);
    }

    public final /* synthetic */ void performPushDeliveryFlush$android_sdk_base_release() {
        run$android_sdk_base_release$default(this, v1.f23845b, false, new w1(), 2, null);
    }

    public final /* synthetic */ void publishBrazePushAction$android_sdk_base_release(BrazePushEventType pushActionType, BrazeNotificationPayload payload) {
        kotlin.jvm.internal.i.e(pushActionType, "pushActionType");
        kotlin.jvm.internal.i.e(payload, "payload");
        this.externalIEventMessenger.a(new BrazePushEvent(pushActionType, payload), BrazePushEvent.class);
    }

    public final /* synthetic */ void recordGeofenceTransition$android_sdk_base_release(String str, GeofenceTransitionType geofenceTransitionType) {
        run$android_sdk_base_release$default(this, z1.f23879b, false, new a2(str, geofenceTransitionType, this), 2, null);
    }

    public final void reenqueueInAppMessage$android_sdk_base_release(InAppMessageEvent event) {
        kotlin.jvm.internal.i.e(event, "event");
        run$android_sdk_base_release$default(this, new b2(event), false, new c2(event), 2, null);
    }

    @Override // com.braze.IBraze
    public void refreshFeatureFlags() {
        run$android_sdk_base_release$default(this, d2.f23631b, false, new e2(), 2, null);
    }

    @Override // com.braze.IBraze
    public <T> void removeSingleSubscription(IEventSubscriber<T> iEventSubscriber, Class<T> eventClass) {
        kotlin.jvm.internal.i.e(eventClass, "eventClass");
        if (iEventSubscriber != null) {
            try {
                boolean zD = this.externalIEventMessenger.d(eventClass, iEventSubscriber);
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.Priority priority = BrazeLogger.Priority.V;
                BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new j2(eventClass, iEventSubscriber, zD), 2, (Object) null);
                BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new k2(eventClass, iEventSubscriber, this.externalIEventMessenger.b(eventClass, iEventSubscriber)), 2, (Object) null);
            } catch (Exception e10) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, new l2(eventClass));
                publishError(e10);
            }
        }
    }

    @Override // com.braze.IBraze
    @p293xa.d
    public void requestContentCardsRefresh(boolean z10) {
        if (z10) {
            requestContentCardsRefreshFromCache();
        } else {
            requestContentCardsRefresh();
        }
    }

    @Override // com.braze.IBraze
    public void requestContentCardsRefreshFromCache() {
        run$android_sdk_base_release$default(this, o2.f23770b, false, new p2(), 2, null);
    }

    @Override // com.braze.IBraze
    public void requestFeedRefresh() {
        run$android_sdk_base_release$default(this, q2.f23801b, false, new r2(), 2, null);
    }

    @Override // com.braze.IBraze
    public void requestFeedRefreshFromCache() {
        run$android_sdk_base_release$default(this, s2.f23822b, false, new t2(), 2, null);
    }

    public final /* synthetic */ void requestGeofenceRefresh$android_sdk_base_release(IBrazeLocation iBrazeLocation) {
        run$android_sdk_base_release$default(this, u2.f23841b, false, new v2(iBrazeLocation, this), 2, null);
    }

    @Override // com.braze.IBraze
    public void requestGeofences(double d10, double d11) {
        run$android_sdk_base_release$default(this, y2.f23873b, false, new z2(d10, d11, this), 2, null);
    }

    public final /* synthetic */ void requestGeofencesInitialization$android_sdk_base_release() {
        run$android_sdk_base_release$default(this, a3.f23611b, false, new b3(), 2, null);
    }

    @Override // com.braze.IBraze
    public void requestImmediateDataFlush() {
        run$android_sdk_base_release$default(this, c3.f23625b, false, new d3(), 2, null);
    }

    @Override // com.braze.IBraze
    public void requestLocationInitialization() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, e3.f23651b, 3, (Object) null);
        requestGeofencesInitialization$android_sdk_base_release();
        requestSingleLocationUpdate$android_sdk_base_release();
    }

    public final /* synthetic */ void requestSingleLocationUpdate$android_sdk_base_release() {
        run$android_sdk_base_release$default(this, f3.f23658b, false, new g3(), 2, null);
    }

    public final /* synthetic */ void retryInAppMessage$android_sdk_base_release(InAppMessageEvent event) {
        kotlin.jvm.internal.i.e(event, "event");
        run$android_sdk_base_release$default(this, new h3(event), false, new i3(event), 2, null);
    }

    public final /* synthetic */ void run$android_sdk_base_release(Ia.a aVar, boolean z10, Ia.a block) {
        kotlin.jvm.internal.i.e(block, "block");
        if (z10 && Companion.isDisabled()) {
            return;
        }
        try {
            C2680e.c(o5.f21705a, null, null, new j3(block, null), 3);
        } catch (Exception e10) {
            if (aVar == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, e10, k3.f23722b, 1, (Object) null);
            } else {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, (Ia.a<String>) aVar);
            }
            publishError(e10);
        }
    }

    public final /* synthetic */ void schedulePushDelivery$android_sdk_base_release(long j10) {
        run$android_sdk_base_release$default(this, m3.f23753b, false, new n3(j10), 2, null);
    }

    public final void setApiKeyPresent$android_sdk_base_release(Boolean bool) {
        this.isApiKeyPresent = bool;
    }

    public final void setConfigurationProvider$android_sdk_base_release(BrazeConfigurationProvider brazeConfigurationProvider) {
        kotlin.jvm.internal.i.e(brazeConfigurationProvider, "<set-?>");
        this.configurationProvider = brazeConfigurationProvider;
    }

    public final void setDeviceIdProvider$android_sdk_base_release(bo.app.h2 h2Var) {
        kotlin.jvm.internal.i.e(h2Var, "<set-?>");
        this.deviceIdProvider = h2Var;
    }

    public final void setExternalIEventMessenger$android_sdk_base_release(bo.app.k2 k2Var) {
        kotlin.jvm.internal.i.e(k2Var, "<set-?>");
        this.externalIEventMessenger = k2Var;
    }

    @Override // com.braze.IBraze
    public void setGoogleAdvertisingId(String googleAdvertisingId, boolean z10) {
        kotlin.jvm.internal.i.e(googleAdvertisingId, "googleAdvertisingId");
        run$android_sdk_base_release$default(this, new o3(googleAdvertisingId, z10), false, new p3(googleAdvertisingId, this, z10), 2, null);
    }

    @Override // com.braze.IBraze
    public void setImageLoader(IBrazeImageLoader iBrazeImageLoader) {
        kotlin.jvm.internal.i.e(iBrazeImageLoader, "<set-?>");
        this.imageLoader = iBrazeImageLoader;
    }

    public final void setPushDeliveryManager$android_sdk_base_release(o4 o4Var) {
        kotlin.jvm.internal.i.e(o4Var, "<set-?>");
        this.pushDeliveryManager = o4Var;
    }

    @Override // com.braze.IBraze
    public void setRegisteredPushToken(String str) {
        run$android_sdk_base_release$default(this, new h2(str), false, new i2(str), 2, null);
    }

    @Override // com.braze.IBraze
    public void setSdkAuthenticationSignature(String signature) {
        kotlin.jvm.internal.i.e(signature, "signature");
        run$android_sdk_base_release$default(this, new q3(signature), false, new r3(signature), 2, null);
    }

    public final void setUdm$android_sdk_base_release(bo.app.d3 d3Var) {
        kotlin.jvm.internal.i.e(d3Var, "<set-?>");
        this.udm = d3Var;
    }

    @Override // com.braze.IBraze
    public void subscribeToContentCardsUpdates(IEventSubscriber<ContentCardsUpdatedEvent> subscriber) {
        kotlin.jvm.internal.i.e(subscriber, "subscriber");
        try {
            this.externalIEventMessenger.a(ContentCardsUpdatedEvent.class, subscriber);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, u3.f23842b);
            publishError(e10);
        }
    }

    @Override // com.braze.IBraze
    public void subscribeToFeatureFlagsUpdates(IEventSubscriber<FeatureFlagsUpdatedEvent> subscriber) {
        kotlin.jvm.internal.i.e(subscriber, "subscriber");
        try {
            this.externalIEventMessenger.a(FeatureFlagsUpdatedEvent.class, subscriber);
            run$android_sdk_base_release$default(this, v3.f23849b, false, new w3(), 2, null);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, x3.f23867b);
            publishError(e10);
        }
    }

    @Override // com.braze.IBraze
    public void subscribeToFeedUpdates(IEventSubscriber<FeedUpdatedEvent> subscriber) {
        kotlin.jvm.internal.i.e(subscriber, "subscriber");
        try {
            this.externalIEventMessenger.a(FeedUpdatedEvent.class, subscriber);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, y3.f23874b);
            publishError(e10);
        }
    }

    @Override // com.braze.IBraze
    public void subscribeToNetworkFailures(IEventSubscriber<BrazeNetworkFailureEvent> subscriber) {
        kotlin.jvm.internal.i.e(subscriber, "subscriber");
        try {
            this.externalIEventMessenger.a(BrazeNetworkFailureEvent.class, subscriber);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, z3.f23887b);
            publishError(e10);
        }
    }

    @Override // com.braze.IBraze
    public void subscribeToNewInAppMessages(IEventSubscriber<InAppMessageEvent> subscriber) {
        kotlin.jvm.internal.i.e(subscriber, "subscriber");
        try {
            this.externalIEventMessenger.a(InAppMessageEvent.class, subscriber);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, a4.f23612b);
            publishError(e10);
        }
    }

    @Override // com.braze.IBraze
    public void subscribeToNoMatchingTriggerForEvent(IEventSubscriber<NoMatchingTriggerEvent> subscriber) {
        kotlin.jvm.internal.i.e(subscriber, "subscriber");
        try {
            this.externalIEventMessenger.a(NoMatchingTriggerEvent.class, subscriber);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, b4.f23619b);
            publishError(e10);
        }
    }

    @Override // com.braze.IBraze
    public void subscribeToPushNotificationEvents(IEventSubscriber<BrazePushEvent> subscriber) {
        kotlin.jvm.internal.i.e(subscriber, "subscriber");
        try {
            this.externalIEventMessenger.a(BrazePushEvent.class, subscriber);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, c4.f23626b);
            publishError(e10);
        }
    }

    @Override // com.braze.IBraze
    public void subscribeToSdkAuthenticationFailures(IEventSubscriber<BrazeSdkAuthenticationErrorEvent> subscriber) {
        kotlin.jvm.internal.i.e(subscriber, "subscriber");
        try {
            this.externalIEventMessenger.a(BrazeSdkAuthenticationErrorEvent.class, subscriber);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, d4.f23634b);
            publishError(e10);
        }
    }

    @Override // com.braze.IBraze
    public void subscribeToSessionUpdates(IEventSubscriber<SessionStateChangedEvent> subscriber) {
        kotlin.jvm.internal.i.e(subscriber, "subscriber");
        try {
            this.externalIEventMessenger.a(SessionStateChangedEvent.class, subscriber);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, e4.f23652b);
            publishError(e10);
        }
    }

    public final /* synthetic */ boolean validateAndStorePushId$android_sdk_base_release(String pushId) {
        kotlin.jvm.internal.i.e(pushId, "pushId");
        return ((Boolean) runForResult$default(this, Boolean.TRUE, f4.f23659b, false, new g4(pushId, null), 4, null)).booleanValue();
    }

    public final /* synthetic */ void waitForUserDependencyThread$android_sdk_base_release() {
        try {
            runForResult(null, k4.f23723b, false, new l4(null));
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, m4.f23754b);
        }
    }

    @Override // com.braze.IBraze
    public void changeUser(String str, String str2) {
        run$android_sdk_base_release$default(this, new o(str), false, new p(str, this, str2), 2, null);
    }

    @Override // com.braze.IBraze
    public void getCurrentUser(IValueCallback<BrazeUser> completionCallback) {
        kotlin.jvm.internal.i.e(completionCallback, "completionCallback");
        if (Companion.isDisabled()) {
            completionCallback.onError();
            return;
        }
        try {
            C2680e.c(o5.f21705a, null, null, new j0(completionCallback, this, null), 3);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e10, k0.f23716b);
            completionCallback.onError();
            publishError(e10);
        }
    }

    @Override // com.braze.IBraze
    public void logCustomEvent(String str, BrazeProperties brazeProperties) {
        run$android_sdk_base_release$default(this, new t0(str), false, new u0(str, this, brazeProperties != null ? brazeProperties.clone() : null), 2, null);
    }

    @Override // com.braze.IBraze
    public void logPurchase(String str, String str2, BigDecimal bigDecimal, BrazeProperties brazeProperties) {
        logPurchase(str, str2, bigDecimal, 1, brazeProperties);
    }

    @Override // com.braze.IBraze
    public void logPushNotificationOpened(Intent intent) {
        run$android_sdk_base_release$default(this, new p1(intent), false, new q1(intent, this), 2, null);
    }

    public final /* synthetic */ void requestGeofenceRefresh$android_sdk_base_release(boolean z10) {
        run$android_sdk_base_release$default(this, new w2(z10), false, new x2(z10), 2, null);
    }

    @Override // com.braze.IBraze
    public void logPurchase(String str, String str2, BigDecimal bigDecimal, int i10) {
        logPurchase(str, str2, bigDecimal, i10, null);
    }

    @Override // com.braze.IBraze
    public void requestContentCardsRefresh() {
        run$android_sdk_base_release$default(this, m2.f23752b, false, new n2(), 2, null);
    }

    @Override // com.braze.IBraze
    public void logPurchase(String str, String str2, BigDecimal bigDecimal, int i10, BrazeProperties brazeProperties) {
        run$android_sdk_base_release$default(this, new f1(str), false, new g1(str, str2, bigDecimal, i10, this, brazeProperties != null ? brazeProperties.clone() : null), 2, null);
    }

    @Override // com.braze.IBraze
    public Card deserializeContentCard(JSONObject jSONObject) {
        return (Card) runForResult$default(this, null, new w(jSONObject), false, new x(jSONObject, null), 4, null);
    }

    public static /* synthetic */ void getConfigurationProvider$android_sdk_base_release$annotations() {
    }

    public static /* synthetic */ void getDeviceIdProvider$android_sdk_base_release$annotations() {
    }

    public static /* synthetic */ void getExternalIEventMessenger$android_sdk_base_release$annotations() {
    }

    public static /* synthetic */ void getPushDeliveryManager$android_sdk_base_release$annotations() {
    }

    private static /* synthetic */ void getRegistrationDataProvider$annotations() {
    }

    public static /* synthetic */ void getUdm$android_sdk_base_release$annotations() {
    }

    public static /* synthetic */ void isApiKeyPresent$android_sdk_base_release$annotations() {
    }
}
