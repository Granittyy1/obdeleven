package com.facebook.appevents.cloudbridge;

import androidx.recyclerview.widget.t;
import com.facebook.LoggingBehavior;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.B;
import kotlin.jvm.internal.i;
import p165n4.l;

/* JADX INFO: compiled from: AppEventsConversionsAPITransformerWebRequests.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet<Integer> f24909a = B.y(Integer.valueOf(t.d.DEFAULT_DRAG_ANIMATION_DURATION), 202);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashSet<Integer> f24910b = B.y(503, 504, 429);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static a f24911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static List<Map<String, Object>> f24912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f24913e;

    /* JADX INFO: compiled from: AppEventsConversionsAPITransformerWebRequests.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f24914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f24915b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f24916c;

        public a(String str, String cloudBridgeURL, String str2) {
            i.e(cloudBridgeURL, "cloudBridgeURL");
            this.f24914a = str;
            this.f24915b = cloudBridgeURL;
            this.f24916c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return i.a(this.f24914a, aVar.f24914a) && i.a(this.f24915b, aVar.f24915b) && i.a(this.f24916c, aVar.f24916c);
        }

        public final int hashCode() {
            return this.f24916c.hashCode() + B1.a.b(this.f24915b, this.f24914a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CloudBridgeCredentials(datasetID=");
            sb2.append(this.f24914a);
            sb2.append(", cloudBridgeURL=");
            sb2.append(this.f24915b);
            sb2.append(", accessKey=");
            return B7.b.g(sb2, this.f24916c, ')');
        }
    }

    public static final void a(String str, String url, String str2) {
        i.e(url, "url");
        l.a aVar = l.f44910c;
        l.a.b(LoggingBehavior.f24776d, "CAPITransformerWebRequests", " \n\nCloudbridge Configured: \n================\ndatasetID: %s\nurl: %s\naccessKey: %s\n\n", str, url, str2);
        f24911c = new a(str, url, str2);
        f24912d = new ArrayList();
    }

    public static List b() {
        List<Map<String, Object>> list = f24912d;
        if (list != null) {
            return list;
        }
        i.m("transformedEvents");
        throw null;
    }
}
