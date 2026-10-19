package p248u2;

import Ha.a;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: SavedStateWriter.android.kt */
/* JADX INFO: loaded from: classes.dex */
@a
public final class f {
    public static final void a(Bundle bundle, String key) {
        i.e(key, "key");
        bundle.putString(key, null);
    }

    public static final void b(Intent intent, Bundle bundle) {
        bundle.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
    }

    public static final void c(Bundle bundle, String key, Bundle value) {
        i.e(key, "key");
        i.e(value, "value");
        bundle.putBundle(key, value);
    }

    public static final void d(Bundle bundle, String key, String value) {
        i.e(key, "key");
        i.e(value, "value");
        bundle.putString(key, value);
    }

    public static final void e(Bundle bundle, String str, List<String> value) {
        i.e(value, "value");
        List<String> list = value;
        bundle.putStringArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
    }
}
