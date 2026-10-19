package com.voltasit.obdeleven.presentation.notification;

import B8.AbstractC0612a;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.activity.ComponentActivity;
import androidx.core.view.O;
import androidx.core.view.Z;
import androidx.lifecycle.D;
import androidx.lifecycle.b0;
import com.voltasit.obdeleven.R;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.c;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import p100i.d;
import p220r9.P;
import p293xa.e;
import p293xa.r;

/* JADX INFO: compiled from: NotificationActivity.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class NotificationActivity extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f32653d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC0612a f32654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f32655c = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<b>(this) { // from class: com.voltasit.obdeleven.presentation.notification.NotificationActivity$special$$inlined$viewModel$default$1
        final /* synthetic */ ComponentActivity $this_viewModel;
        final /* synthetic */ Pb.a $qualifier = null;
        final /* synthetic */ Ia.a $extrasProducer = null;
        final /* synthetic */ Ia.a $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.$this_viewModel = this;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.Y, com.voltasit.obdeleven.presentation.notification.b] */
        @Override // Ia.a
        public final b invoke() {
            p014b1.a defaultViewModelCreationExtras;
            ComponentActivity componentActivity = this.$this_viewModel;
            Pb.a aVar = this.$qualifier;
            Ia.a aVar2 = this.$extrasProducer;
            Ia.a aVar3 = this.$parameters;
            b0 viewModelStore = componentActivity.getViewModelStore();
            if (aVar2 == null || (defaultViewModelCreationExtras = (p014b1.a) aVar2.invoke()) == null) {
                defaultViewModelCreationExtras = componentActivity.getDefaultViewModelCreationExtras();
                i.d(defaultViewModelCreationExtras, "<get-defaultViewModelCreationExtras>(...)");
            }
            p014b1.a aVar4 = defaultViewModelCreationExtras;
            org.koin.core.scope.a aVarI = Cb.a.i(componentActivity);
            c cVarA = l.a(b.class);
            i.b(viewModelStore);
            return Gb.a.a(cVarA, viewModelStore, null, aVar4, aVar, aVarI, aVar3);
        }
    });

    /* JADX INFO: compiled from: NotificationActivity.kt */
    public static final class a implements D, f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Lambda f32656b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Ia.l lVar) {
            this.f32656b = (Lambda) lVar;
        }

        @Override // kotlin.jvm.internal.f
        public final e<?> b() {
            return this.f32656b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
        @Override // androidx.lifecycle.D
        public final /* synthetic */ void d(Object obj) {
            this.f32656b.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof D) || !(obj instanceof f)) {
                return false;
            }
            return this.f32656b.equals(((f) obj).b());
        }

        public final int hashCode() {
            return this.f32656b.hashCode();
        }
    }

    @Override // androidx.fragment.app.ActivityC1347l, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1 && i11 == 0) {
            w().f32672z = false;
        }
    }

    @Override // androidx.fragment.app.ActivityC1347l, androidx.activity.ComponentActivity, androidx.core.app.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String string;
        String string2;
        super.onCreate(bundle);
        LayoutInflater layoutInflater = getLayoutInflater();
        int i10 = AbstractC0612a.f1847x;
        AbstractC0612a abstractC0612a = (AbstractC0612a) M0.e.a(layoutInflater, R.layout.activity_notification, null, false, null);
        i.d(abstractC0612a, "inflate(...)");
        this.f32654b = abstractC0612a;
        abstractC0612a.q(this);
        abstractC0612a.t(w());
        abstractC0612a.f1850t.setClipToOutline(true);
        w().f32663q.e(this, new a(new Ia.l<Boolean, r>() { // from class: com.voltasit.obdeleven.presentation.notification.NotificationActivity$setupObservers$1
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Boolean bool) {
                Boolean bool2 = bool;
                NotificationActivity notificationActivity = this.this$0;
                i.b(bool2);
                boolean zBooleanValue = bool2.booleanValue();
                int i11 = NotificationActivity.f32653d;
                if (zBooleanValue) {
                    notificationActivity.finish();
                } else {
                    notificationActivity.finishAndRemoveTask();
                }
                return r.f47939a;
            }
        }));
        w().f32665s.e(this, new a(new Ia.l<String, r>() { // from class: com.voltasit.obdeleven.presentation.notification.NotificationActivity$setupObservers$2
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(String str) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                if (intent.resolveActivity(this.this$0.getPackageManager()) != null) {
                    this.this$0.startActivityForResult(intent, 1);
                } else {
                    this.this$0.w().f32672z = false;
                    P.b(this.this$0, R.string.common_install_browser);
                }
                return r.f47939a;
            }
        }));
        w().f32667u.e(this, new a(new Ia.l<String, r>() { // from class: com.voltasit.obdeleven.presentation.notification.NotificationActivity$setupObservers$3
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(String str) {
                String str2 = str;
                NotificationActivity notificationActivity = this.this$0;
                i.b(str2);
                AbstractC0612a abstractC0612a2 = notificationActivity.f32654b;
                if (abstractC0612a2 == null) {
                    i.m("binding");
                    throw null;
                }
                Button tryAgainButton = abstractC0612a2.f1852v;
                i.d(tryAgainButton, "tryAgainButton");
                W8.d.f(tryAgainButton, false);
                AbstractC0612a abstractC0612a3 = notificationActivity.f32654b;
                if (abstractC0612a3 == null) {
                    i.m("binding");
                    throw null;
                }
                ProgressBar loadingProgressBar = abstractC0612a3.f1849s;
                i.d(loadingProgressBar, "loadingProgressBar");
                W8.d.f(loadingProgressBar, true);
                com.bumptech.glide.d<Drawable> dVarM = com.bumptech.glide.b.c(notificationActivity).g(notificationActivity).m(str2);
                dVarM.y(new a(notificationActivity));
                AbstractC0612a abstractC0612a4 = notificationActivity.f32654b;
                if (abstractC0612a4 != null) {
                    dVarM.x(abstractC0612a4.f1850t);
                    return r.f47939a;
                }
                i.m("binding");
                throw null;
            }
        }));
        Bundle extras = getIntent().getExtras();
        String str = "";
        if (extras == null || (string = extras.getString("content_destination_url")) == null) {
            string = "";
        }
        if (extras != null && (string2 = extras.getString("content_image_url")) != null) {
            str = string2;
        }
        b bVarW = w();
        boolean z10 = !isTaskRoot();
        bVarW.getClass();
        bVarW.f32668v = z10;
        bVarW.f32660B = str;
        bVarW.f32659A = string;
        b bVarW2 = w();
        if (!bVarW2.f32669w) {
            bVarW2.f32669w = true;
            bVarW2.f32661o.s(bVarW2.f32668v);
        }
        b bVarW3 = w();
        String str2 = bVarW3.f32660B;
        if (str2 == null) {
            i.m("imageURL");
            throw null;
        }
        bVarW3.f32666t.j(str2);
        setContentView(abstractC0612a.f4488d);
        View childAt = ((ViewGroup) findViewById(android.R.id.content)).getChildAt(0);
        i.d(childAt, "getChildAt(...)");
        C4.b bVar = new C4.b(10);
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        O.d.u(childAt, bVar);
    }

    @Override // p100i.d, androidx.fragment.app.ActivityC1347l, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (w().f32672z) {
            if (w().f32668v) {
                finish();
            } else {
                finishAndRemoveTask();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    public final b w() {
        return (b) this.f32655c.getValue();
    }
}
