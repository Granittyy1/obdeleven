package U6;

import H3.k;
import S6.j;
import W6.f.b;
import W6.l;
import W6.m;
import W6.n;
import W6.p;
import Z6.o;
import android.R;
import android.app.Activity;
import android.app.Application;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import com.bumptech.glide.load.DecodeFormat;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplayCallbacks;
import com.google.firebase.inappmessaging.model.MessageType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p033c7.C1501n;
import p083g7.i;

/* JADX INFO: compiled from: FirebaseInAppMessagingDisplay.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f6519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, p268va.a<n>> f6520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final W6.f f6521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f6522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p f6523f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final W6.j f6524g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final W6.a f6525h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Application f6526i;
    public final W6.d j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p083g7.h f6527k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public FirebaseInAppMessagingDisplayCallbacks f6528l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f6529m;

    /* JADX INFO: compiled from: FirebaseInAppMessagingDisplay.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f6530b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ X6.c f6531c;

        public a(Activity activity, X6.c cVar) {
            this.f6530b = activity;
            this.f6531c = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            p083g7.f fVarA;
            View.OnClickListener dVar;
            b bVar = b.this;
            if (bVar.f6527k == null) {
                return;
            }
            Activity activity = this.f6530b;
            c cVar = new c(bVar, activity);
            HashMap map = new HashMap();
            p083g7.h hVar = bVar.f6527k;
            ArrayList<p083g7.a> arrayList = new ArrayList();
            int i10 = C0087b.f6533a[hVar.f35627a.ordinal()];
            if (i10 == 1) {
                arrayList.add(((p083g7.c) hVar).f35614g);
            } else if (i10 == 2) {
                arrayList.add(((i) hVar).f35633g);
            } else if (i10 == 3) {
                arrayList.add(((p083g7.g) hVar).f35626e);
            } else if (i10 != 4) {
                arrayList.add(new p083g7.a(null, null));
            } else {
                p083g7.e eVar = (p083g7.e) hVar;
                arrayList.add(eVar.f35621g);
                arrayList.add(eVar.f35622h);
            }
            for (p083g7.a aVar : arrayList) {
                if (aVar == null || TextUtils.isEmpty(aVar.f35604a)) {
                    Log.isLoggable("FIAM.Display", 4);
                    dVar = cVar;
                } else {
                    dVar = new d(bVar, aVar, activity);
                }
                map.put(aVar, dVar);
            }
            X6.c cVar2 = this.f6531c;
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListenerF = cVar2.f(map, cVar);
            if (onGlobalLayoutListenerF != null) {
                cVar2.d().getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListenerF);
            }
            p083g7.h hVar2 = bVar.f6527k;
            if (hVar2.f35627a == MessageType.CARD) {
                p083g7.e eVar2 = (p083g7.e) hVar2;
                int i11 = bVar.f6526i.getResources().getConfiguration().orientation;
                fVarA = eVar2.f35623i;
                p083g7.f fVar = eVar2.j;
                if (i11 != 1 ? !(fVar == null || TextUtils.isEmpty(fVar.f35624a)) : !(fVarA != null && !TextUtils.isEmpty(fVarA.f35624a))) {
                    fVarA = fVar;
                }
            } else {
                fVarA = hVar2.a();
            }
            e eVar3 = new e(bVar, cVar2, activity, onGlobalLayoutListenerF);
            if (fVarA == null || TextUtils.isEmpty(fVarA.f35624a)) {
                eVar3.l();
                return;
            }
            String str = fVarA.f35624a;
            W6.f fVar2 = bVar.f6521d;
            fVar2.getClass();
            H3.c.j();
            H3.l.a aVar2 = new H3.l.a();
            H3.l.b bVar2 = new H3.l.b("image/*");
            HashMap map2 = new HashMap(aVar2.f3657a.size());
            for (Map.Entry<String, List<k>> entry : aVar2.f3657a.entrySet()) {
                map2.put(entry.getKey(), new ArrayList(entry.getValue()));
            }
            aVar2.f3657a = map2;
            List<k> arrayList2 = aVar2.f3657a.get("Accept");
            if (arrayList2 == null) {
                arrayList2 = new ArrayList<>();
                aVar2.f3657a.put("Accept", arrayList2);
            }
            arrayList2.add(bVar2);
            H3.i iVar = new H3.i(str, new H3.l(aVar2.f3657a));
            com.bumptech.glide.e eVar4 = fVar2.f7010a;
            eVar4.getClass();
            com.bumptech.glide.d dVar2 = new com.bumptech.glide.d(eVar4.f24498b, eVar4, Drawable.class, eVar4.f24499c);
            dVar2.f24494z = iVar;
            dVar2.f24488B = true;
            DecodeFormat decodeFormat = DecodeFormat.f24517b;
            com.bumptech.glide.d dVar3 = (com.bumptech.glide.d) dVar2.n(com.bumptech.glide.load.resource.bitmap.a.f24676f, decodeFormat).n(O3.i.f4840a, decodeFormat);
            W6.f.b bVar3 = fVar2.new b(dVar3);
            dVar3.t(new m(bVar.f6527k, bVar.f6528l));
            bVar3.f7014b = activity.getClass().getSimpleName();
            bVar3.a();
            dVar3.j(2131231476);
            H3.c.j();
            ImageView imageViewD = cVar2.d();
            H3.c.j();
            eVar3.f7012e = imageViewD;
            dVar3.w(eVar3, dVar3, X3.e.f7203a);
            bVar3.f7013a = eVar3;
            bVar3.a();
        }
    }

    /* JADX INFO: renamed from: U6.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FirebaseInAppMessagingDisplay.java */
    public static /* synthetic */ class C0087b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6533a;

        static {
            int[] iArr = new int[MessageType.values().length];
            f6533a = iArr;
            try {
                iArr[MessageType.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6533a[MessageType.MODAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6533a[MessageType.IMAGE_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6533a[MessageType.CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public b(j jVar, Map<String, p268va.a<n>> map, W6.f fVar, p pVar, p pVar2, W6.j jVar2, Application application, W6.a aVar, W6.d dVar) {
        this.f6519b = jVar;
        this.f6520c = map;
        this.f6521d = fVar;
        this.f6522e = pVar;
        this.f6523f = pVar2;
        this.f6524g = jVar2;
        this.f6526i = application;
        this.f6525h = aVar;
        this.j = dVar;
    }

    public final void a(Activity activity) {
        X6.c cVar = this.f6524g.f7022a;
        if (cVar == null ? false : cVar.e().isShown()) {
            W6.f fVar = this.f6521d;
            Class<?> cls = activity.getClass();
            fVar.getClass();
            String simpleName = cls.getSimpleName();
            synchronized (simpleName) {
                try {
                    if (fVar.f7011b.containsKey(simpleName)) {
                        for (U3.c cVar2 : (Set) fVar.f7011b.get(simpleName)) {
                            if (cVar2 != null) {
                                fVar.f7010a.l(cVar2);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            W6.j jVar = this.f6524g;
            X6.c cVar3 = jVar.f7022a;
            if (cVar3 != null ? cVar3.e().isShown() : false) {
                ((WindowManager) activity.getSystemService("window")).removeViewImmediate(jVar.f7022a.e());
                jVar.f7022a = null;
            }
            p pVar = this.f6522e;
            CountDownTimer countDownTimer = pVar.f7037a;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                pVar.f7037a = null;
            }
            p pVar2 = this.f6523f;
            CountDownTimer countDownTimer2 = pVar2.f7037a;
            if (countDownTimer2 != null) {
                countDownTimer2.cancel();
                pVar2.f7037a = null;
            }
        }
    }

    public final void b(Activity activity) {
        X6.a aVar;
        p083g7.h hVar = this.f6527k;
        if (hVar == null) {
            H3.c.k("No active message found to render");
            return;
        }
        this.f6519b.getClass();
        if (hVar.f35627a.equals(MessageType.UNSUPPORTED)) {
            H3.c.k("The message being triggered is not supported by this version of the sdk.");
            return;
        }
        MessageType messageType = this.f6527k.f35627a;
        String str = null;
        if (this.f6526i.getResources().getConfiguration().orientation == 1) {
            int i10 = Z6.e.a.f7929a[messageType.ordinal()];
            if (i10 == 1) {
                str = "MODAL_PORTRAIT";
            } else if (i10 == 2) {
                str = "CARD_PORTRAIT";
            } else if (i10 == 3) {
                str = "IMAGE_ONLY_PORTRAIT";
            } else if (i10 == 4) {
                str = "BANNER_PORTRAIT";
            }
        } else {
            int i11 = Z6.e.a.f7929a[messageType.ordinal()];
            if (i11 == 1) {
                str = "MODAL_LANDSCAPE";
            } else if (i11 == 2) {
                str = "CARD_LANDSCAPE";
            } else if (i11 == 3) {
                str = "IMAGE_ONLY_LANDSCAPE";
            } else if (i11 == 4) {
                str = "BANNER_LANDSCAPE";
            }
        }
        n nVar = this.f6520c.get(str).get();
        int i12 = C0087b.f6533a[this.f6527k.f35627a.ordinal()];
        W6.a aVar2 = this.f6525h;
        if (i12 == 1) {
            p083g7.h hVar2 = this.f6527k;
            Y6.c cVar = new Y6.c();
            cVar.f7617b = new o(hVar2, nVar, aVar2.f7004a);
            aVar = cVar.a().f7623f.get();
        } else if (i12 == 2) {
            p083g7.h hVar3 = this.f6527k;
            Y6.c cVar2 = new Y6.c();
            cVar2.f7617b = new o(hVar3, nVar, aVar2.f7004a);
            aVar = cVar2.a().f7622e.get();
        } else if (i12 == 3) {
            p083g7.h hVar4 = this.f6527k;
            Y6.c cVar3 = new Y6.c();
            cVar3.f7617b = new o(hVar4, nVar, aVar2.f7004a);
            aVar = cVar3.a().f7621d.get();
        } else {
            if (i12 != 4) {
                H3.c.k("No bindings found for this message type");
                return;
            }
            p083g7.h hVar5 = this.f6527k;
            Y6.c cVar4 = new Y6.c();
            cVar4.f7617b = new o(hVar5, nVar, aVar2.f7004a);
            aVar = cVar4.a().f7624g.get();
        }
        activity.findViewById(R.id.content).post(new a(activity, aVar));
    }

    @Override // W6.l, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        String str = this.f6529m;
        j jVar = this.f6519b;
        if (str != null && str.equals(activity.getLocalClassName())) {
            activity.getLocalClassName();
            Log.isLoggable("FIAM.Display", 4);
            jVar.getClass();
            Q3.d.C();
            jVar.f5680d = null;
            a(activity);
            this.f6529m = null;
        }
        C1501n c1501n = jVar.f5678b;
        c1501n.f22472b.clear();
        c1501n.f22475e.clear();
        c1501n.f22474d.clear();
        c1501n.f22473c.clear();
        super.onActivityPaused(activity);
    }

    @Override // W6.l, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        super.onActivityResumed(activity);
        String str = this.f6529m;
        if (str == null || !str.equals(activity.getLocalClassName())) {
            activity.getLocalClassName();
            Log.isLoggable("FIAM.Display", 4);
            U6.a aVar = new U6.a(this, activity);
            j jVar = this.f6519b;
            jVar.getClass();
            Q3.d.C();
            jVar.f5680d = aVar;
            this.f6529m = activity.getLocalClassName();
        }
        if (this.f6527k != null) {
            b(activity);
        }
    }
}
