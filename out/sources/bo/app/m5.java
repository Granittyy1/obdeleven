package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.StringUtils;
import java.util.EnumSet;
import kotlin.collections.EmptySet;

/* JADX INFO: loaded from: classes.dex */
public final class m5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f21550b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f21551a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public m5(Context context, String userId, String apiKey) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(userId, "userId");
        kotlin.jvm.internal.i.e(apiKey, "apiKey");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.braze.storage.sdk_metadata_cache" + StringUtils.getCacheFileSuffix(context, userId, apiKey), 0);
        kotlin.jvm.internal.i.d(sharedPreferences, "context.getSharedPrefere…y), Context.MODE_PRIVATE)");
        this.f21551a = sharedPreferences;
    }

    public final void a(EnumSet sdkMetadata) {
        kotlin.jvm.internal.i.e(sdkMetadata, "sdkMetadata");
        this.f21551a.edit().putStringSet("tags", com.braze.support.c.a(sdkMetadata)).apply();
    }

    public final EnumSet b(EnumSet newSdkMetadata) {
        kotlin.jvm.internal.i.e(newSdkMetadata, "newSdkMetadata");
        if (kotlin.jvm.internal.i.a(com.braze.support.c.a(newSdkMetadata), this.f21551a.getStringSet("tags", EmptySet.f42985b))) {
            return null;
        }
        return newSdkMetadata;
    }
}
