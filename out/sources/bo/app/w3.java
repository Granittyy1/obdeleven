package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class w3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f22144b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f22145a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f22146b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.f22146b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Stored user ID is longer than 997 bytes. Truncating. Original user ID: " + this.f22146b;
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f22147b = new c();

        public c() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "userId is empty in updateLastUserId. Rejecting.";
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f22148b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.f22148b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Offline user storage provider was given user ID longer than 997. Rejecting. User ID: " + this.f22148b;
        }
    }

    public w3(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.offline.storagemap", 0);
        kotlin.jvm.internal.i.d(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        this.f22145a = sharedPreferences;
    }

    public final String a() {
        String string = this.f22145a.getString("last_user", "");
        String str = string != null ? string : "";
        if (StringUtils.getByteSize(str) <= 997) {
            return str;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new b(str), 2, (Object) null);
        String strTruncateToByteLength = StringUtils.truncateToByteLength(str, 997);
        a(strTruncateToByteLength);
        return strTruncateToByteLength;
    }

    public final void a(String userId) {
        kotlin.jvm.internal.i.e(userId, "userId");
        if (userId.length() == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, c.f22147b, 2, (Object) null);
        } else {
            if (StringUtils.getByteSize(userId) > 997) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new d(userId), 2, (Object) null);
                return;
            }
            SharedPreferences.Editor editorEdit = this.f22145a.edit();
            editorEdit.putString("last_user", userId);
            editorEdit.apply();
        }
    }
}
