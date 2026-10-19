package p165n4;

import Z3.q;
import Z3.r;
import Z3.w;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.compose.foundation.gestures.d;
import com.facebook.FacebookSdkNotInitializedException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: Validate.kt */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f44935a = 0;

    public static final boolean a(Context context, String redirectURI) {
        List<ResolveInfo> listQueryIntentActivities;
        i.e(redirectURI, "redirectURI");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(redirectURI));
            listQueryIntentActivities = packageManager.queryIntentActivities(intent, 64);
        } else {
            listQueryIntentActivities = null;
        }
        if (listQueryIntentActivities == null) {
            return false;
        }
        Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (!i.a(activityInfo.name, "com.facebook.CustomTabActivity") || !i.a(activityInfo.packageName, context.getPackageName())) {
                return false;
            }
            z10 = true;
        }
        return z10;
    }

    public static final void b(String arg, String str) {
        i.e(arg, "arg");
        if (arg.length() <= 0) {
            throw new IllegalArgumentException(d.b("Argument '", str, "' cannot be empty").toString());
        }
    }

    public static final void c(w container) {
        i.e(container, "container");
        Iterator<r> it = container.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException("Container 'requests' cannot contain null values");
            }
        }
        if (container.isEmpty()) {
            throw new IllegalArgumentException("Container 'requests' cannot be empty".toString());
        }
    }

    public static final void d(String str, String str2) {
        if (str == null || str.length() <= 0) {
            throw new IllegalArgumentException(d.b("Argument '", str2, "' cannot be null or empty").toString());
        }
    }

    public static final void e() {
        if (!q.f7866p.get()) {
            throw new FacebookSdkNotInitializedException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }
}
