package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class k5 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f21420e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f21423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SharedPreferences f21424d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21425b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.f21425b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Setting signature to: " + this.f21425b;
        }
    }

    public k5(Context context, String str, String str2) {
        kotlin.jvm.internal.i.e(context, "context");
        this.f21421a = context;
        this.f21422b = str;
        this.f21423c = str2;
        this.f21424d = context.getSharedPreferences("com.braze.storage.sdk_auth_cache" + StringUtils.getCacheFileSuffix(context, str, str2), 0);
    }

    public final String a() {
        return this.f21424d.getString("auth_signature", null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5)) {
            return false;
        }
        k5 k5Var = (k5) obj;
        return kotlin.jvm.internal.i.a(this.f21421a, k5Var.f21421a) && kotlin.jvm.internal.i.a(this.f21422b, k5Var.f21422b) && kotlin.jvm.internal.i.a(this.f21423c, k5Var.f21423c);
    }

    public int hashCode() {
        int iHashCode = this.f21421a.hashCode() * 31;
        String str = this.f21422b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f21423c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SdkAuthenticationCache(context=");
        sb2.append(this.f21421a);
        sb2.append(", userId=");
        sb2.append(this.f21422b);
        sb2.append(", apiKey=");
        return B7.b.g(sb2, this.f21423c, ')');
    }

    public final void a(String str) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new b(str), 2, (Object) null);
        this.f21424d.edit().putString("auth_signature", str).apply();
    }
}
