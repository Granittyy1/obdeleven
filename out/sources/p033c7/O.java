package p033c7;

import Q3.d;
import Q3.k;
import android.os.Bundle;
import com.google.firebase.inappmessaging.DismissType;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplayCallbacks;
import com.google.firebase.inappmessaging.RenderErrorReason;
import com.google.firebase.inappmessaging.model.MessageType;
import com.google.firebase.messaging.C2051n;
import java.util.HashMap;
import java.util.concurrent.Executor;
import p083g7.h;
import p108i7.c;
import p144l6.e;
import p144l6.f;
import p217r6.b;

/* JADX INFO: compiled from: MetricsLoggerClient.java */
/* JADX INFO: loaded from: classes3.dex */
public final class O {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final HashMap f22391h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final HashMap f22392i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2051n f22393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f22394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f22395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p071f7.a f22396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p192p6.a f22397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1501n f22398f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @b
    public final Executor f22399g;

    /* JADX INFO: compiled from: MetricsLoggerClient.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22400a;

        static {
            int[] iArr = new int[MessageType.values().length];
            f22400a = iArr;
            try {
                iArr[MessageType.CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22400a[MessageType.MODAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22400a[MessageType.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22400a[MessageType.IMAGE_ONLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        HashMap map = new HashMap();
        f22391h = map;
        HashMap map2 = new HashMap();
        f22392i = map2;
        map.put(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingErrorReason.f28158b, RenderErrorReason.UNSPECIFIED_RENDER_ERROR);
        map.put(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingErrorReason.f28159c, RenderErrorReason.IMAGE_FETCH_ERROR);
        map.put(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingErrorReason.f28160d, RenderErrorReason.IMAGE_DISPLAY_ERROR);
        map.put(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingErrorReason.f28161e, RenderErrorReason.IMAGE_UNSUPPORTED_FORMAT);
        map2.put(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingDismissType.f28154c, DismissType.AUTO);
        map2.put(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingDismissType.f28155d, DismissType.CLICK);
        map2.put(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingDismissType.f28156e, DismissType.SWIPE);
        map2.put(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingDismissType.f28153b, DismissType.UNKNOWN_DISMISS_TYPE);
    }

    public O(C2051n c2051n, p192p6.a aVar, e eVar, c cVar, p071f7.a aVar2, C1501n c1501n, @b Executor executor) {
        this.f22393a = c2051n;
        this.f22397e = aVar;
        this.f22394b = eVar;
        this.f22395c = cVar;
        this.f22396d = aVar2;
        this.f22398f = c1501n;
        this.f22399g = executor;
    }

    public static boolean b(p083g7.a aVar) {
        String str;
        return (aVar == null || (str = aVar.f35604a) == null || str.isEmpty()) ? false : true;
    }

    public final S6.a.C0079a a(h hVar, String str) {
        S6.a.C0079a c0079aP = S6.a.P();
        c0079aP.r();
        S6.a.M((S6.a) c0079aP.f29047c);
        e eVar = this.f22394b;
        eVar.a();
        f fVar = eVar.f44390c;
        String str2 = fVar.f44404e;
        c0079aP.r();
        S6.a.L((S6.a) c0079aP.f29047c, str2);
        String str3 = (String) hVar.f35628b.f5086c;
        c0079aP.r();
        S6.a.N((S6.a) c0079aP.f29047c, str3);
        S6.b.a aVarJ = S6.b.J();
        eVar.a();
        String str4 = fVar.f44401b;
        aVarJ.r();
        S6.b.H((S6.b) aVarJ.f29047c, str4);
        aVarJ.r();
        S6.b.I((S6.b) aVarJ.f29047c, str);
        c0079aP.r();
        S6.a.O((S6.a) c0079aP.f29047c, aVarJ.p());
        long jA = this.f22396d.a();
        c0079aP.r();
        S6.a.H((S6.a) c0079aP.f29047c, jA);
        return c0079aP;
    }

    public final void c(h hVar, String str, boolean z10) {
        k kVar = hVar.f35628b;
        String str2 = (String) kVar.f5086c;
        String str3 = (String) kVar.f5087d;
        Bundle bundle = new Bundle();
        bundle.putString("_nmid", str2);
        bundle.putString("_nmn", str3);
        try {
            bundle.putInt("_ndt", (int) (this.f22396d.a() / 1000));
        } catch (NumberFormatException e10) {
            e10.getMessage();
        }
        bundle.toString();
        d.B();
        p192p6.a aVar = this.f22397e;
        if (aVar != null) {
            aVar.c(bundle, "fiam", str);
            if (z10) {
                aVar.a("fiam", "fiam:".concat(str2));
            }
        }
    }
}
