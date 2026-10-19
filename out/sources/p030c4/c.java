package p030c4;

import Z3.q;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.facebook.internal.FetchedAppSettingsManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.i;
import kotlin.text.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p165n4.j;

/* JADX INFO: compiled from: CodelessMatcher.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f22307f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static c f22308g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f22309a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<Activity> f22310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f22311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashSet<String> f22312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap<Integer, HashSet<String>> f22313e;

    /* JADX INFO: compiled from: CodelessMatcher.kt */
    public static final class a {
        public final synchronized c a() {
            c cVar;
            try {
                if (c.f22308g == null) {
                    c.f22308g = new c();
                }
                cVar = c.f22308g;
                if (cVar == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher");
                }
            } catch (Throwable th) {
                throw th;
            }
            return cVar;
        }
    }

    /* JADX INFO: compiled from: CodelessMatcher.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<View> f22314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f22315b;

        public b(View view, String viewMapKey) {
            i.e(view, "view");
            i.e(viewMapKey, "viewMapKey");
            this.f22314a = new WeakReference<>(view);
            this.f22315b = viewMapKey;
        }

        public final View a() {
            WeakReference<View> weakReference = this.f22314a;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }
    }

    /* JADX INFO: renamed from: c4.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CodelessMatcher.kt */
    public static final class ViewTreeObserverOnGlobalLayoutListenerC0237c implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WeakReference<View> f22316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList f22317c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final HashSet<String> f22318d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f22319e;

        /* JADX INFO: renamed from: c4.c$c$a */
        /* JADX INFO: compiled from: CodelessMatcher.kt */
        public static final class a {
            /* JADX WARN: Code restructure failed: missing block: B:75:0x018e, code lost:
            
                if (kotlin.jvm.internal.i.a(r1, r11) == false) goto L76;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static java.util.ArrayList a(android.view.View r8, java.util.List r9, int r10, int r11, java.lang.String r12) {
                /*
                    Method dump skipped, instruction units count: 455
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p030c4.c.ViewTreeObserverOnGlobalLayoutListenerC0237c.a.a(android.view.View, java.util.List, int, int, java.lang.String):java.util.ArrayList");
            }

            public static ArrayList b(ViewGroup viewGroup) {
                ArrayList arrayList = new ArrayList();
                int childCount = viewGroup.getChildCount();
                if (childCount > 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        View childAt = viewGroup.getChildAt(i10);
                        if (childAt.getVisibility() == 0) {
                            arrayList.add(childAt);
                        }
                        if (i11 >= childCount) {
                            break;
                        }
                        i10 = i11;
                    }
                }
                return arrayList;
            }
        }

        public ViewTreeObserverOnGlobalLayoutListenerC0237c(View view, Handler handler, HashSet<String> listenerSet, String str) {
            i.e(handler, "handler");
            i.e(listenerSet, "listenerSet");
            this.f22316b = new WeakReference<>(view);
            this.f22318d = listenerSet;
            this.f22319e = str;
            handler.postDelayed(this, 200L);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0022  */
        public final void a(b bVar, View view, EventBinding eventBinding) {
            boolean z10;
            View viewA = bVar.a();
            if (viewA == null) {
                return;
            }
            View.OnClickListener onClickListenerE = p043d4.c.e(viewA);
            if (!(onClickListenerE instanceof p030c4.a.ViewOnClickListenerC0236a)) {
                z10 = false;
            } else {
                if (onClickListenerE == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener");
                }
                if (((p030c4.a.ViewOnClickListenerC0236a) onClickListenerE).f22294f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            HashSet<String> hashSet = this.f22318d;
            String str = bVar.f22315b;
            if (hashSet.contains(str) || z10) {
                return;
            }
            p030c4.a.ViewOnClickListenerC0236a viewOnClickListenerC0236a = new p030c4.a.ViewOnClickListenerC0236a();
            viewOnClickListenerC0236a.f22290b = eventBinding;
            viewOnClickListenerC0236a.f22291c = new WeakReference<>(viewA);
            viewOnClickListenerC0236a.f22292d = new WeakReference<>(view);
            viewOnClickListenerC0236a.f22293e = p043d4.c.e(viewA);
            viewOnClickListenerC0236a.f22294f = true;
            viewA.setOnClickListener(viewOnClickListenerC0236a);
            hashSet.add(str);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0024  */
        public final void b(b bVar, View view, EventBinding eventBinding) {
            boolean z10;
            AdapterView adapterView = (AdapterView) bVar.a();
            if (adapterView == null) {
                return;
            }
            AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
            if (!(onItemClickListener instanceof c4.a.b)) {
                z10 = false;
            } else {
                if (onItemClickListener == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener");
                }
                if (((c4.a.b) onItemClickListener).f22299f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            HashSet<String> hashSet = this.f22318d;
            String str = bVar.f22315b;
            if (hashSet.contains(str) || z10) {
                return;
            }
            c4.a.b bVar2 = new c4.a.b();
            bVar2.f22295b = eventBinding;
            bVar2.f22296c = new WeakReference<>(adapterView);
            bVar2.f22297d = new WeakReference<>(view);
            bVar2.f22298e = adapterView.getOnItemClickListener();
            bVar2.f22299f = true;
            adapterView.setOnItemClickListener(bVar2);
            hashSet.add(str);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0021  */
        public final void c(b bVar, View view, EventBinding eventBinding) {
            boolean z10;
            View viewA = bVar.a();
            if (viewA == null) {
                return;
            }
            View.OnTouchListener onTouchListenerF = p043d4.c.f(viewA);
            if (!(onTouchListenerF instanceof d)) {
                z10 = false;
            } else {
                if (onTouchListenerF == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener");
                }
                if (((d) onTouchListenerF).f22324f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            HashSet<String> hashSet = this.f22318d;
            String str = bVar.f22315b;
            if (hashSet.contains(str) || z10) {
                return;
            }
            viewA.setOnTouchListener(new d(eventBinding, view, viewA));
            hashSet.add(str);
        }

        public final void d() {
            int size;
            ArrayList arrayList = this.f22317c;
            if (arrayList == null) {
                return;
            }
            WeakReference<View> weakReference = this.f22316b;
            if (weakReference.get() == null || (size = arrayList.size() - 1) < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                EventBinding eventBinding = (EventBinding) arrayList.get(i10);
                View view = weakReference.get();
                if (eventBinding != null && view != null) {
                    String str = eventBinding.f24920d;
                    int length = str.length();
                    String str2 = this.f22319e;
                    if (length == 0 || str.equals(str2)) {
                        List listUnmodifiableList = Collections.unmodifiableList(eventBinding.f24918b);
                        i.d(listUnmodifiableList, "unmodifiableList(path)");
                        if (listUnmodifiableList.size() <= 25) {
                            for (b bVar : a.a(view, listUnmodifiableList, 0, -1, str2)) {
                                try {
                                    View viewA = bVar.a();
                                    if (viewA != null) {
                                        p043d4.c cVar = p043d4.c.f34562a;
                                        View view2 = viewA;
                                        while (true) {
                                            if (view2 != null) {
                                                p043d4.c.f34562a.getClass();
                                                if (view2.getClass().getName().equals("com.facebook.react.ReactRootView")) {
                                                    break;
                                                }
                                                Object parent = view2.getParent();
                                                if (parent instanceof View) {
                                                    view2 = (View) parent;
                                                }
                                            }
                                            view2 = null;
                                            break;
                                        }
                                        if (view2 != null) {
                                            p043d4.c.f34562a.getClass();
                                            if (p043d4.c.i(viewA, view2)) {
                                                c(bVar, view, eventBinding);
                                            }
                                        }
                                        if (!m.I(viewA.getClass().getName(), "com.facebook.react", false)) {
                                            if (!(viewA instanceof AdapterView)) {
                                                a(bVar, view, eventBinding);
                                            } else if (viewA instanceof ListView) {
                                                b(bVar, view, eventBinding);
                                            }
                                        }
                                    }
                                } catch (Exception unused) {
                                    q qVar = q.f7852a;
                                }
                            }
                        }
                    }
                }
                if (i11 > size) {
                    return;
                } else {
                    i10 = i11;
                }
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            d();
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public final void onScrollChanged() {
            d();
        }

        @Override // java.lang.Runnable
        public final void run() {
            j jVarB = FetchedAppSettingsManager.b(q.b());
            if (jVarB == null || !jVarB.f44901g) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jVarB.f44902h;
            if (jSONArray != null) {
                try {
                    int length = jSONArray.length();
                    if (length > 0) {
                        int i10 = 0;
                        while (true) {
                            int i11 = i10 + 1;
                            JSONObject jSONObject = jSONArray.getJSONObject(i10);
                            i.d(jSONObject, "array.getJSONObject(i)");
                            arrayList.add(EventBinding.a.a(jSONObject));
                            if (i11 >= length) {
                                break;
                            } else {
                                i10 = i11;
                            }
                        }
                    }
                } catch (IllegalArgumentException | JSONException unused) {
                }
            }
            this.f22317c = arrayList;
            View view = this.f22316b.get();
            if (view == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener(this);
                viewTreeObserver.addOnScrollChangedListener(this);
            }
            d();
        }
    }

    public c() {
        Set<Activity> setNewSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        i.d(setNewSetFromMap, "newSetFromMap(WeakHashMap())");
        this.f22310b = setNewSetFromMap;
        this.f22311c = new LinkedHashSet();
        this.f22312d = new HashSet<>();
        this.f22313e = new HashMap<>();
    }

    public final void a() {
        for (Activity activity : this.f22310b) {
            if (activity != null) {
                this.f22311c.add(new ViewTreeObserverOnGlobalLayoutListenerC0237c(H3.c.h(activity), this.f22309a, this.f22312d, activity.getClass().getSimpleName()));
            }
        }
    }
}
