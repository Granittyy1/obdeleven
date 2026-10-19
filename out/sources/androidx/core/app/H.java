package androidx.core.app;

import android.app.RemoteInput;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import io.intercom.android.sdk.m5.push.ConversationActionHandlerKt;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: RemoteInput.java */
/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f16690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f16691c;

    /* JADX INFO: compiled from: RemoteInput.java */
    public static class a {
        public static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static Bundle b(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    /* JADX INFO: compiled from: RemoteInput.java */
    public static class b {
        public static void a(H h8, Intent intent, Map<String, Uri> map) {
            RemoteInput.addDataResultToIntent(H.a(h8), intent, map);
        }

        public static Set<String> b(Object obj) {
            return ((RemoteInput) obj).getAllowedDataTypes();
        }

        public static Map<String, Uri> c(Intent intent, String str) {
            return RemoteInput.getDataResultsFromIntent(intent, str);
        }

        public static RemoteInput.Builder d(RemoteInput.Builder builder, String str, boolean z10) {
            return builder.setAllowDataType(str, z10);
        }
    }

    /* JADX INFO: compiled from: RemoteInput.java */
    public static class c {
        public static int a(Object obj) {
            return ((RemoteInput) obj).getEditChoicesBeforeSending();
        }

        public static RemoteInput.Builder b(RemoteInput.Builder builder, int i10) {
            return builder.setEditChoicesBeforeSending(i10);
        }
    }

    public H(String str, Bundle bundle, HashSet hashSet) {
        this.f16689a = str;
        this.f16690b = bundle;
        this.f16691c = hashSet;
    }

    public static RemoteInput a(H h8) {
        h8.getClass();
        RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(ConversationActionHandlerKt.KEY_TEXT_REPLY).setLabel(h8.f16689a).setChoices(null).setAllowFreeFormInput(true).addExtras(h8.f16690b);
        Iterator it = h8.f16691c.iterator();
        while (it.hasNext()) {
            b.d(builderAddExtras, (String) it.next(), true);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            c.b(builderAddExtras, 0);
        }
        return builderAddExtras.build();
    }
}
