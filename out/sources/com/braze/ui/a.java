package com.braze.ui;

import Z3.I;
import Z3.q;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.widget.ListView;
import androidx.fragment.app.V;
import com.braze.events.FeedUpdatedEvent;
import com.facebook.FacebookException;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.Arrays;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.json.JSONException;
import org.json.JSONObject;
import p005a4.n;
import p005a4.v;
import p165n4.j;
import p165n4.s;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f24402e;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i10) {
        this.f24399b = i10;
        this.f24400c = obj;
        this.f24401d = obj2;
        this.f24402e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JSONObject jSONObject;
        int i10 = 1;
        switch (this.f24399b) {
            case 0:
                ((BrazeFeedFragment) this.f24400c).lambda$onViewCreated$2((FeedUpdatedEvent) this.f24401d, (ListView) this.f24402e);
                return;
            default:
                Context context = (Context) this.f24400c;
                String str = (String) this.f24401d;
                String str2 = (String) this.f24402e;
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
                j jVarD = null;
                String string = sharedPreferences.getString(str, null);
                if (!s.y(string)) {
                    if (string == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    try {
                        jSONObject = new JSONObject(string);
                    } catch (JSONException unused) {
                        q qVar = q.f7852a;
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        FetchedAppSettingsManager.f25006a.getClass();
                        jVarD = FetchedAppSettingsManager.d(str2, jSONObject);
                    }
                    break;
                }
                FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f25006a;
                fetchedAppSettingsManager.getClass();
                JSONObject jSONObjectA = FetchedAppSettingsManager.a();
                FetchedAppSettingsManager.d(str2, jSONObjectA);
                sharedPreferences.edit().putString(str, jSONObjectA.toString()).apply();
                if (jVarD != null) {
                    String str3 = jVarD.f44903i;
                    if (!FetchedAppSettingsManager.f25011f && str3.length() > 0) {
                        FetchedAppSettingsManager.f25011f = true;
                    }
                }
                p165n4.i.f44889a.getClass();
                JSONObject jSONObjectA2 = p165n4.i.a();
                q.a().getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{str2}, 1)), jSONObjectA2.toString()).apply();
                p165n4.i.d(str2, jSONObjectA2);
                p093h4.f fVar = p093h4.f.f36148a;
                Context contextA = q.a();
                String strB = q.b();
                if (I.a() && (contextA instanceof Application)) {
                    Application application = (Application) contextA;
                    if (!q.f7866p.get()) {
                        throw new FacebookException("The Facebook sdk must be initialized before calling activateApp");
                    }
                    p005a4.b bVar = p005a4.b.f8014a;
                    if (!p005a4.b.f8017d) {
                        if (n.f8034c == null) {
                            n.a.b();
                        }
                        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = n.f8034c;
                        if (scheduledThreadPoolExecutor == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        scheduledThreadPoolExecutor.execute(new p005a4.a());
                    }
                    if (!v.f8052d.get()) {
                        v.f8049a.a();
                    }
                    Context applicationContext = application.getApplicationContext();
                    if (applicationContext != null) {
                        q.c().execute(new L9.a(applicationContext, i10, strB));
                        FeatureManager featureManager = FeatureManager.f24975a;
                        if (FeatureManager.b(FeatureManager.Feature.OnDeviceEventProcessing) && p117j4.b.a()) {
                            q.c().execute(new V(q.a(), i10, strB));
                        }
                    }
                    p093h4.e.c(application, strB);
                }
                FetchedAppSettingsManager.f25009d.set(FetchedAppSettingsManager.f25008c.containsKey(str2) ? FetchedAppSettingsManager.FetchAppSettingState.f25014d : FetchedAppSettingsManager.FetchAppSettingState.f25015e);
                fetchedAppSettingsManager.e();
                return;
        }
    }
}
