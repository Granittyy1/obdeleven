package bo.app;

import android.content.Context;
import com.braze.configuration.BrazeConfigurationProvider;

/* JADX INFO: renamed from: bo.app.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1462d0 extends BrazeConfigurationProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f20836a = new a(null);

    /* JADX INFO: renamed from: bo.app.d0$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1462d0(Context context) {
        super(context);
        kotlin.jvm.internal.i.e(context, "context");
    }

    public final long a() {
        return ((long) getIntValue(BrazeConfigurationProvider.b.DATA_SYNC_BAD_NETWORK_INTERVAL_KEY.b(), 60)) * 1000;
    }

    public final long b() {
        return ((long) getIntValue(BrazeConfigurationProvider.b.DATA_SYNC_GOOD_NETWORK_INTERVAL_KEY.b(), 30)) * 1000;
    }

    public final long c() {
        return ((long) getIntValue(BrazeConfigurationProvider.b.DATA_SYNC_GREAT_NETWORK_INTERVAL_KEY.b(), 10)) * 1000;
    }
}
