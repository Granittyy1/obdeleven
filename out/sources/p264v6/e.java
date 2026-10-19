package p264v6;

import android.content.Context;
import android.util.Log;
import com.braze.models.FeatureFlag;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: DevelopmentPlatformProvider.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f47655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f47656b = null;

    /* JADX INFO: compiled from: DevelopmentPlatformProvider.java */
    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f47657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f47658b;

        public a(e eVar) {
            int iD = CommonUtils.d(eVar.f47655a, "com.google.firebase.crashlytics.unity_version", FeatureFlag.PROPERTIES_TYPE_STRING);
            Context context = eVar.f47655a;
            if (iD != 0) {
                this.f47657a = "Unity";
                this.f47658b = context.getResources().getString(iD);
                Log.isLoggable("FirebaseCrashlytics", 2);
                return;
            }
            if (context.getAssets() != null) {
                try {
                    InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                    }
                    this.f47657a = "Flutter";
                    this.f47658b = null;
                    Log.isLoggable("FirebaseCrashlytics", 2);
                    return;
                } catch (IOException unused) {
                }
            }
            this.f47657a = null;
            this.f47658b = null;
        }
    }

    public e(Context context) {
        this.f47655a = context;
    }
}
